package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e980 {
    public final zis0 a;

    public e980(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e980) && this.a.equals(((e980) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
