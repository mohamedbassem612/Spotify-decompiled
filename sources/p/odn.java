package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class odn {
    public final pbn a;
    public final znb0 b;

    public odn(pbn pbnVar, boolean z) {
        this.a = pbnVar;
        znb0 znb0VarS = dm5.S(3, new j3m(this, (byte) 23));
        this.b = znb0VarS;
        if (z) {
            znb0VarS.getValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof odn) {
            return this.a.equals(((odn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
