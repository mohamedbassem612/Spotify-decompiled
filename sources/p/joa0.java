package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class joa0 implements koa0 {
    public final Object a;

    public joa0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joa0) && u890.j(this.a, ((joa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
