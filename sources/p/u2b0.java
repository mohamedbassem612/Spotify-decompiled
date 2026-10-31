package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u2b0 extends c3b0 {
    public final boolean a;

    public u2b0(boolean z) {
        this.a = z;
    }

    @Override // p.c3b0
    public final Object a() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2b0) && this.a == ((u2b0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
