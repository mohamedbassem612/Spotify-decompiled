package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mwc1 implements owc1 {
    public final fbh0 a;

    public mwc1(fbh0 fbh0Var) {
        this.a = fbh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwc1) && this.a.equals(((mwc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
