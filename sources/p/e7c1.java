package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e7c1 extends h7c1 {
    public final kas0 a;

    public e7c1(kas0 kas0Var) {
        this.a = kas0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7c1) && this.a == ((e7c1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
