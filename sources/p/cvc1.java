package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvc1 implements evc1 {
    public final ck11 a;

    public cvc1(ck11 ck11Var) {
        this.a = ck11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvc1) && this.a.equals(((cvc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
