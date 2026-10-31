package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kjf0 implements ljf0 {
    public final xlk1 a;

    public kjf0(xlk1 xlk1Var) {
        this.a = xlk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjf0) && this.a == ((kjf0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
