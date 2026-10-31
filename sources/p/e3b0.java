package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e3b0 extends c3b0 {
    public final short a;

    public e3b0(short s) {
        this.a = s;
    }

    @Override // p.c3b0
    public final Object a() {
        return Short.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3b0) && this.a == ((e3b0) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
