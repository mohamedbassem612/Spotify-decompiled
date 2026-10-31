package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zs2 {
    public final String a;
    public final String b;

    public zs2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs2)) {
            return false;
        }
        zs2 zs2Var = (zs2) obj;
        return this.a.equals(zs2Var.a) && this.b.equals(zs2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
