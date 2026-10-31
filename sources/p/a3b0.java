package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a3b0 extends c3b0 {
    public final int a;

    public a3b0(int i) {
        this.a = i;
    }

    @Override // p.c3b0
    public final Object a() {
        return Integer.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3b0) && this.a == ((a3b0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
