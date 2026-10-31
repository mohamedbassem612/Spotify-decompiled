package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class muo0 extends puo0 {
    public final sea0 a;

    public muo0(sea0 sea0Var) {
        this.a = sea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muo0) && this.a.equals(((muo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
