package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sh8 extends th8 {
    public final di8 a;

    public sh8(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh8) && this.a.equals(((sh8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
