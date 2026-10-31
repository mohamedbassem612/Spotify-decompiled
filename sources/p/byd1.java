package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class byd1 implements qzw {
    public final ji0 a;

    public byd1(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byd1) && u890.j(this.a, ((byd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
