package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kwk1 implements mwk1 {
    public final String a;
    public final String b;

    public kwk1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwk1)) {
            return false;
        }
        kwk1 kwk1Var = (kwk1) obj;
        return this.a.equals(kwk1Var.a) && this.b.equals(kwk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
