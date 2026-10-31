package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qot implements sot {
    public final un90 a;
    public final vod1 b;
    public final mml c;
    public final List d;

    public qot(un90 un90Var, vod1 vod1Var, mml mmlVar, List list) {
        this.a = un90Var;
        this.b = vod1Var;
        this.c = mmlVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qot)) {
            return false;
        }
        qot qotVar = (qot) obj;
        return u890.j(this.a, qotVar.a) && this.b.equals(qotVar.b) && u890.j(this.c, qotVar.c) && this.d.equals(qotVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
