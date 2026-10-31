package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class evw0 extends gvw0 {
    public final sks0 a;

    public evw0(sks0 sks0Var) {
        this.a = sks0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evw0) && this.a == ((evw0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
