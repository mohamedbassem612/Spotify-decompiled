package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class caf0 extends xaf0 {
    public final xa0 a;

    public caf0(xa0 xa0Var) {
        this.a = xa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caf0) && this.a.equals(((caf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
