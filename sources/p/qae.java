package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qae {
    public final boolean a;
    public final Map b;

    public qae(Map map, boolean z) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qae)) {
            return false;
        }
        qae qaeVar = (qae) obj;
        return this.a == qaeVar.a && u890.j(this.b, qaeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public /* synthetic */ qae() {
        this(b7x.a, false);
    }
}
