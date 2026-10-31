package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mwh1 implements vwh1 {
    public final bro1 a;

    public mwh1(bro1 bro1Var) {
        this.a = bro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwh1) && this.a.equals(((mwh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
