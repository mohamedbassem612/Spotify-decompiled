package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wx80 implements iy80 {
    public final krm0 a;

    public wx80(krm0 krm0Var) {
        this.a = krm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx80) && this.a == ((wx80) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
