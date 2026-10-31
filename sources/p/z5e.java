package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5e {
    public final ikb a;
    public final f0u b;
    public final int c;
    public final String d;

    public z5e(ikb ikbVar, f0u f0uVar, int i, String str) {
        this.a = ikbVar;
        this.b = f0uVar;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5e)) {
            return false;
        }
        z5e z5eVar = (z5e) obj;
        return u890.j(this.a, z5eVar.a) && this.b == z5eVar.b && this.c == z5eVar.c && u890.j(this.d, z5eVar.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
