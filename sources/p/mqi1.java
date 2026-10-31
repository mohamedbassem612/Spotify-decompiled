package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class mqi1 {
    public static final lqi1 Companion = new lqi1();
    public final boolean a;
    public final String b;
    public final wg61 c;
    public final fb61 d;

    public /* synthetic */ mqi1(int i, boolean z, String str, wg61 wg61Var, fb61 fb61Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, kqi1.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = wg61Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = fb61Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqi1)) {
            return false;
        }
        mqi1 mqi1Var = (mqi1) obj;
        return this.a == mqi1Var.a && u890.j(this.b, mqi1Var.b) && u890.j(this.c, mqi1Var.c) && u890.j(this.d, mqi1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        wg61 wg61Var = this.c;
        int iHashCode = (iD + (wg61Var == null ? 0 : wg61Var.hashCode())) * 31;
        fb61 fb61Var = this.d;
        return iHashCode + (fb61Var != null ? fb61Var.hashCode() : 0);
    }

    public mqi1(String str, wg61 wg61Var, fb61 fb61Var) {
        this.a = true;
        this.b = str;
        this.c = wg61Var;
        this.d = fb61Var;
    }
}
