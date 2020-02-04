package today.rocky.tcb.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import today.rocky.tcb.bean.Record;

/**
 * @author Rocky
 * @date 2020/2/4 12:04
 */
@RestController
@RequestMapping("/push")
public class PushController {

    @RequestMapping("/record")
    public String pushRecord(@RequestParam String info){
        try{
            Record record = JSON.parseObject(info, Record.class);
            System.out.println(record.toString());
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
        return "1";
    }

    @GetMapping
    public String helloWorld(){
        return "今天天气真好~~~~";
    }
}
