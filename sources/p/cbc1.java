package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cbc1 extends ebc1 {
    public final o7c1 a;

    public cbc1(o7c1 o7c1Var) {
        this.a = o7c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbc1) && this.a.equals(((cbc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
