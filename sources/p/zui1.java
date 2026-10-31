package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zui1 {
    public final String a;
    public final String b;

    public zui1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zui1)) {
            return false;
        }
        zui1 zui1Var = (zui1) obj;
        return this.a.equals(zui1Var.a) && this.b.equals(zui1Var.b);
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
