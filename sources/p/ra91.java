package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ra91 implements sa91 {
    public final d991 a;

    public ra91(d991 d991Var) {
        this.a = d991Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra91) && this.a == ((ra91) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
