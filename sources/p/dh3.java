package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dh3 {
    public final String a;
    public final String b;

    public dh3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh3)) {
            return false;
        }
        dh3 dh3Var = (dh3) obj;
        return this.a.equals(dh3Var.a) && this.b.equals(dh3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
