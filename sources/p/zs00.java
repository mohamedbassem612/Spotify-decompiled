package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zs00 {
    public final String a;
    public final int b;

    public zs00(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs00)) {
            return false;
        }
        zs00 zs00Var = (zs00) obj;
        return this.a.equals(zs00Var.a) && this.b == zs00Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
