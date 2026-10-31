package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oq21 implements qq21 {
    public final blc0 a;
    public final String b;

    public oq21(String str, blc0 blc0Var) {
        this.a = blc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq21)) {
            return false;
        }
        oq21 oq21Var = (oq21) obj;
        return this.a == oq21Var.a && this.b.equals(oq21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
