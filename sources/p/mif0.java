package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mif0 implements yif0 {
    public final hkf0 a;

    public mif0(hkf0 hkf0Var) {
        this.a = hkf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mif0) && this.a == ((mif0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
