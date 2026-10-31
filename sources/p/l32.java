package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l32 implements n32 {
    public final xx10 a;

    public l32(xx10 xx10Var) {
        this.a = xx10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l32) && this.a.equals(((l32) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
