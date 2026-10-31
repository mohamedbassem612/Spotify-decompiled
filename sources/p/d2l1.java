package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d2l1 extends j2l1 {
    public final wzw0 a;

    public d2l1(wzw0 wzw0Var) {
        this.a = wzw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2l1) && this.a.equals(((d2l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
