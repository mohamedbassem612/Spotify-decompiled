package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qzm {
    public final boolean a;
    public final List b;

    public qzm(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzm)) {
            return false;
        }
        qzm qzmVar = (qzm) obj;
        return this.a == qzmVar.a && u890.j(this.b, qzmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
