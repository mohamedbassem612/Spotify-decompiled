package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a2y0 implements b2y0 {
    public final cio a;

    public a2y0(cio cioVar) {
        this.a = cioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2y0) && u890.j(this.a, ((a2y0) obj).a);
    }

    public final int hashCode() {
        cio cioVar = this.a;
        if (cioVar == null) {
            return 0;
        }
        return cioVar.hashCode();
    }
}
