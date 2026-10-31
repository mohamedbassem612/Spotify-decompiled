package p;

import android.net.nsd.NsdServiceInfo;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class r110 {
    public static final List a = Collections.singletonList("token");

    public static final boolean a(NsdServiceInfo nsdServiceInfo) {
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, byte[]> entry : attributes.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List list = a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!linkedHashMap.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final z7u b(NsdServiceInfo nsdServiceInfo) {
        if (!a(nsdServiceInfo)) {
            n57.e("Discovered malformed mDNS broadcast");
            return null;
        }
        Map<String, byte[]> attributes = nsdServiceInfo.getAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, byte[]> entry : attributes.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new z7u(new String((byte[]) sqg0.G("token", linkedHashMap), StandardCharsets.UTF_8));
    }
}
