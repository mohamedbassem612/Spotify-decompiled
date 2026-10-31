package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g3b0 extends c3b0 {
    public final byte a;

    public g3b0(byte b) {
        this.a = b;
    }

    @Override // p.c3b0
    public final Object a() {
        return new p3h1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3b0) && this.a == ((g3b0) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
