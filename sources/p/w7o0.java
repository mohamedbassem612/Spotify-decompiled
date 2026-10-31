package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w7o0 {
    public static final w7o0 b = new w7o0(sqg0.U(new LinkedHashMap()));
    public final Map a;

    public w7o0(Map map) {
        this.a = map;
    }

    public final Map a() {
        return this.a;
    }

    public final String b() {
        List list = (List) this.a.get("Content-Type".toLowerCase(Locale.ROOT));
        if (list != null) {
            return (String) o7h.C0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7o0) && this.a.equals(((w7o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ')';
    }
}
