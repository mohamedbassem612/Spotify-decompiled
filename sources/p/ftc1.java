package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ftc1 {
    public final zis0 a;

    public ftc1(zis0 zis0Var) {
        this.a = zis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftc1) && this.a.equals(((ftc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
