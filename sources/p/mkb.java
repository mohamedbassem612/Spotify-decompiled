package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mkb {
    public final int a;
    public final float b;

    public mkb(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkb)) {
            return false;
        }
        mkb mkbVar = (mkb) obj;
        return this.a == mkbVar.a && Float.compare(this.b, mkbVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
