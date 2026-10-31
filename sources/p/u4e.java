package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u4e extends zho1 {
    public final u8e c;
    public final int d;

    public u4e(u8e u8eVar, int i) {
        this.c = u8eVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4e)) {
            return false;
        }
        u4e u4eVar = (u4e) obj;
        return u890.j(this.c, u4eVar.c) && this.d == u4eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
