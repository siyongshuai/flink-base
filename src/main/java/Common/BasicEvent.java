package Common;

/**
 * @author siyongshuai
 * @date 2019/12/3 17:12
 */
public interface BasicEvent {
    /**
     * 获取事件的毫秒数
     *
     * @return
     */
    Long extractEventTimeMillis();

}
