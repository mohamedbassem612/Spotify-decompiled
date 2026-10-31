package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ml8 extends nl8 {
    public final yg8 a;

    public ml8(yg8 yg8Var) {
        this.a = yg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml8) && this.a == ((ml8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
