package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jz61 {
    public final float a;
    public final fuo1 b;

    public jz61(float f, fuo1 fuo1Var) {
        this.a = f;
        this.b = fuo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz61)) {
            return false;
        }
        jz61 jz61Var = (jz61) obj;
        return Float.compare(this.a, jz61Var.a) == 0 && this.b.equals(jz61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }
}
