package p;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class a8x0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final JSONObject a(String str) {
        return (JSONObject) a.get(str);
    }
}
