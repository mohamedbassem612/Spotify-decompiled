package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hza {
    public final boolean a;
    public final cxc0 b;

    public hza(cxc0 cxc0Var, boolean z) {
        this.a = z;
        this.b = cxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hza)) {
            return false;
        }
        hza hzaVar = (hza) obj;
        return this.a == hzaVar.a && this.b.equals(hzaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
