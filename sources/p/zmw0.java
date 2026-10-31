package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zmw0 implements anw0 {
    public final String a;
    public final String b;

    public zmw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmw0)) {
            return false;
        }
        zmw0 zmw0Var = (zmw0) obj;
        return this.a.equals(zmw0Var.a) && this.b.equals(zmw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
