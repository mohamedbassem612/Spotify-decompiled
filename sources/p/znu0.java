package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class znu0 {
    public final String a;
    public final String b;

    public znu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znu0)) {
            return false;
        }
        znu0 znu0Var = (znu0) obj;
        return this.a.equals(znu0Var.a) && this.b.equals(znu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
