package cn.js.websocket.mode;

/**
 * Created by kl on 2017/10/9.
 * Content :日志消息实体，注意，这里为了减少篇幅，省略了get,set代码
 */
public class LoggerMessage{

    public String body;
    public String timestamp;
    public String threadName;
    public String className;
    public String level;

    public LoggerMessage(String body, String timestamp, String threadName, String className, String level) {
        this.body = body;
        this.timestamp = timestamp;
        this.threadName = threadName;
        this.className = className;
        this.level = level;
    }

    public LoggerMessage() {
    }
}