package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uia1 {
    public final mml a;
    public final List b;

    public uia1(mml mmlVar, List list) {
        this.a = mmlVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uia1)) {
            return false;
        }
        uia1 uia1Var = (uia1) obj;
        return u890.j(this.a, uia1Var.a) && this.b.equals(uia1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
