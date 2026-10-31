package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class dri1 extends qc90 {
    public static final cri1 Companion = new cri1();
    public final s2b b;
    public final s2b c;
    public final String d;

    public /* synthetic */ dri1(int i, s2b s2bVar, s2b s2bVar2, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, bri1.a.getDescriptor());
            throw null;
        }
        this.b = s2bVar;
        this.c = s2bVar2;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dri1)) {
            return false;
        }
        dri1 dri1Var = (dri1) obj;
        return u890.j(this.b, dri1Var.b) && u890.j(this.c, dri1Var.c) && u890.j(this.d, dri1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
