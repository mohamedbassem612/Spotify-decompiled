package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jho {
    public final yf a;
    public final yf b;

    public jho() {
        jdx jdxVar = jdx.c;
        idx idxVar = new idx();
        this.a = jdxVar;
        this.b = idxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jho)) {
            return false;
        }
        jho jhoVar = (jho) obj;
        return this.a.equals(jhoVar.a) && this.b.equals(jhoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
