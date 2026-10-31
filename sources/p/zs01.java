package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zs01 extends ct01 {
    public final int a;
    public final m9m b;

    public zs01(int i, m9m m9mVar) {
        this.a = i;
        this.b = m9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs01)) {
            return false;
        }
        zs01 zs01Var = (zs01) obj;
        return this.a == zs01Var.a && this.b == zs01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
