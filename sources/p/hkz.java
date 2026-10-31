package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hkz {
    public final int a;
    public final Object b;
    public final gkz c;
    public final gkz d;

    public hkz(int i, Object obj, gkz gkzVar, gkz gkzVar2) {
        this.a = i;
        this.b = obj;
        this.c = gkzVar;
        this.d = gkzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkz)) {
            return false;
        }
        hkz hkzVar = (hkz) obj;
        return this.a == hkzVar.a && this.b.equals(hkzVar.b) && this.c.equals(hkzVar.c) && this.d.equals(hkzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + kaa0.f(this.a, Integer.hashCode(2131960683) * 31, 31)) * 31)) * 31);
    }
}
