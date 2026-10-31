package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ekn0 {
    public final String a;
    public final vvm1 b;

    public ekn0(String str, vvm1 vvm1Var) {
        this.a = str;
        this.b = vvm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekn0)) {
            return false;
        }
        ekn0 ekn0Var = (ekn0) obj;
        return u890.j(this.a, ekn0Var.a) && u890.j(this.b, ekn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ ekn0(String str) {
        this(str, ckn0.c);
    }
}
