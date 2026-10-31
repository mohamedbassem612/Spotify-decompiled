package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class je01 implements ne01 {
    public final fd01 a;

    public je01(fd01 fd01Var) {
        this.a = fd01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je01) && this.a == ((je01) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
