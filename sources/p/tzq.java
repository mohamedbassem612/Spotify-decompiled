package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tzq extends r2p1 {
    public final Set c;
    public final iu30 d;

    public tzq(Set set, iu30 iu30Var) {
        this.c = set;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzq)) {
            return false;
        }
        tzq tzqVar = (tzq) obj;
        return u890.j(this.c, tzqVar.c) && this.d.equals(tzqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
