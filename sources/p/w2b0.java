package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w2b0 extends c3b0 {
    public final char a;

    public w2b0(char c) {
        this.a = c;
    }

    @Override // p.c3b0
    public final Object a() {
        return Character.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2b0) && this.a == ((w2b0) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }
}
