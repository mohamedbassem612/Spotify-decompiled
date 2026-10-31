package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pr6 implements qr6 {
    public final ljd0 a;

    public pr6(ljd0 ljd0Var) {
        this.a = ljd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr6) && this.a.equals(((pr6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
