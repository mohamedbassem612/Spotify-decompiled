package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bah0 implements cah0 {
    public final String a;
    public final String b;

    public bah0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bah0)) {
            return false;
        }
        bah0 bah0Var = (bah0) obj;
        return this.a.equals(bah0Var.a) && this.b.equals(bah0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
