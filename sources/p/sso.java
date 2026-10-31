package p;

import io.reactivex.rxjava3.functions.BiFunction;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sso implements BiFunction {
    public final Map a;

    public Object apply(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.a);
        linkedHashMap.put("episode_speed", String.valueOf((int) ((a5u0) obj2).a));
        return new u6z((i1z) obj, linkedHashMap);
    }
}
