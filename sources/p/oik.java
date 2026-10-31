package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oik extends vik {
    public final p5k a;
    public final int b;

    public oik(p5k p5kVar, int i) {
        this.a = p5kVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oik)) {
            return false;
        }
        oik oikVar = (oik) obj;
        return this.a.equals(oikVar.a) && this.b == oikVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
