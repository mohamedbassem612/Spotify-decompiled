package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v2b0 extends c3b0 {
    public final byte a;

    public v2b0(byte b) {
        this.a = b;
    }

    @Override // p.c3b0
    public final Object a() {
        return Byte.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2b0) && this.a == ((v2b0) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
