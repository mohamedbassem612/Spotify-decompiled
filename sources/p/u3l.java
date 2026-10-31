package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u3l {
    public final boolean a;
    public final boolean b;
    public final h3l c;

    public u3l(boolean z, boolean z2, h3l h3lVar) {
        this.a = z;
        this.b = z2;
        this.c = h3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3l)) {
            return false;
        }
        u3l u3lVar = (u3l) obj;
        return this.a == u3lVar.a && this.b == u3lVar.b && u890.j(this.c, u3lVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        this.c.getClass();
        return iG + 726388953;
    }

    public /* synthetic */ u3l(boolean z) {
        this(true, z, h3l.a);
    }
}
