package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class anl {
    public final int a;
    public final zg91 b;

    public anl(int i, zg91 zg91Var) {
        this.a = i;
        this.b = zg91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anl)) {
            return false;
        }
        anl anlVar = (anl) obj;
        return this.a == anlVar.a && this.b == anlVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
