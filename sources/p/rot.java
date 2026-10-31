package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rot implements sot {
    public final un90 a;
    public final vod1 b;
    public final mml c;
    public final List d;

    public rot(un90 un90Var, vod1 vod1Var, mml mmlVar, List list) {
        this.a = un90Var;
        this.b = vod1Var;
        this.c = mmlVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rot)) {
            return false;
        }
        rot rotVar = (rot) obj;
        return u890.j(this.a, rotVar.a) && this.b.equals(rotVar.b) && u890.j(this.c, rotVar.c) && this.d.equals(rotVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
