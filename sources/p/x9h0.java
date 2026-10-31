package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x9h0 implements cah0 {
    public final Object a;

    public x9h0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9h0) && this.a.equals(((x9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
