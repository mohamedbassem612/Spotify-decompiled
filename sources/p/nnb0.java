package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class nnb0 {
    public final Object a;
    public final LinkedHashMap b = new LinkedHashMap();

    public nnb0(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && u890.j(a(), ((nnb0) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
