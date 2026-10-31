package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zal1 {
    public final String a;
    public final String b;

    public zal1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zal1)) {
            return false;
        }
        zal1 zal1Var = (zal1) obj;
        return this.a.equals(zal1Var.a) && this.b.equals(zal1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
