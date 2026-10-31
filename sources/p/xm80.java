package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xm80 implements an80 {
    public final cl80 a;

    public xm80(cl80 cl80Var) {
        this.a = cl80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm80) && this.a.equals(((xm80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
