package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h961 {
    public final zko a;
    public final zko b;
    public final i0h c;

    public h961(zko zkoVar, zko zkoVar2, i0h i0hVar) {
        this.a = zkoVar;
        this.b = zkoVar2;
        this.c = i0hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h961)) {
            return false;
        }
        h961 h961Var = (h961) obj;
        return this.a == h961Var.a && this.b == h961Var.b && this.c == h961Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
