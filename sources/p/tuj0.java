package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tuj0 implements uuj0 {
    public final wgo0 a;

    public tuj0(wgo0 wgo0Var) {
        this.a = wgo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuj0) && this.a == ((tuj0) obj).a;
    }

    public final int hashCode() {
        wgo0 wgo0Var = this.a;
        if (wgo0Var == null) {
            return 0;
        }
        return wgo0Var.hashCode();
    }
}
