package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j3b0 extends c3b0 {
    public final short a;

    public j3b0(short s) {
        this.a = s;
    }

    @Override // p.c3b0
    public final Object a() {
        return new n5h1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3b0) && this.a == ((j3b0) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
