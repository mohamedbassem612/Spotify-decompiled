package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sjt implements dkt {
    public final bdr a;
    public final boolean b;
    public final boolean c;

    public sjt(bdr bdrVar, boolean z, boolean z2, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        this.a = bdrVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjt)) {
            return false;
        }
        sjt sjtVar = (sjt) obj;
        return u890.j(this.a, sjtVar.a) && this.b == sjtVar.b && this.c == sjtVar.c;
    }

    public final int hashCode() {
        bdr bdrVar = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((bdrVar == null ? 0 : bdrVar.hashCode()) * 31, 31, this.b);
    }
}
