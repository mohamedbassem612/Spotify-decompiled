package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class azk1 extends c0l1 {
    public static final zyk1 Companion = new zyk1();
    public final String b;
    public final ega0 c;

    public /* synthetic */ azk1(int i, String str, ega0 ega0Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, yyk1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = ega0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azk1)) {
            return false;
        }
        azk1 azk1Var = (azk1) obj;
        return u890.j(this.b, azk1Var.b) && u890.j(this.c, azk1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        ega0 ega0Var = this.c;
        return iHashCode + (ega0Var == null ? 0 : ega0Var.hashCode());
    }
}
