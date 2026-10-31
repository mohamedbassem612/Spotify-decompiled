package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qm8 extends rm8 {
    public final di8 a;

    public qm8(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm8) && this.a.equals(((qm8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
