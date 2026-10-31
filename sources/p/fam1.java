package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fam1 implements oam1 {
    public final uah0 a;

    public fam1(uah0 uah0Var) {
        this.a = uah0Var;
    }

    public final iu30 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fam1) && this.a == ((fam1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
