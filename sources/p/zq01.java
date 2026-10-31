package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zq01 {
    public final String a;
    public final String b;

    public zq01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq01)) {
            return false;
        }
        zq01 zq01Var = (zq01) obj;
        return this.a.equals(zq01Var.a) && this.b.equals(zq01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
