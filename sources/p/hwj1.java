package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hwj1 {
    public final boolean a;
    public final zvj1 b;
    public final uvj1 c;

    public hwj1(boolean z, zvj1 zvj1Var, uvj1 uvj1Var) {
        this.a = z;
        this.b = zvj1Var;
        this.c = uvj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwj1)) {
            return false;
        }
        hwj1 hwj1Var = (hwj1) obj;
        return this.a == hwj1Var.a && this.b.equals(hwj1Var.b) && this.c == hwj1Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        uvj1 uvj1Var = this.c;
        return iHashCode + (uvj1Var == null ? 0 : uvj1Var.hashCode());
    }
}
