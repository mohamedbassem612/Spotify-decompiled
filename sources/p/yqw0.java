package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yqw0 implements brw0 {
    public final kj80 a;

    public yqw0(kj80 kj80Var) {
        this.a = kj80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqw0) && this.a.equals(((yqw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
