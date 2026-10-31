package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ekp0 {
    public static final dkp0 Companion = new dkp0();
    public final fsh a;
    public final bkp0 b;

    public /* synthetic */ ekp0(int i, fsh fshVar, bkp0 bkp0Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ckp0.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = bkp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekp0)) {
            return false;
        }
        ekp0 ekp0Var = (ekp0) obj;
        return u890.j(this.a, ekp0Var.a) && u890.j(this.b, ekp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
