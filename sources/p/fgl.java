package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fgl {
    public final int a;
    public final egl b;

    public fgl(int i, egl eglVar) {
        this.a = i;
        this.b = eglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgl)) {
            return false;
        }
        fgl fglVar = (fgl) obj;
        return this.a == fglVar.a && this.b.equals(fglVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
