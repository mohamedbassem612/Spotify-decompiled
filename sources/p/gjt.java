package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gjt implements dkt {
    public final fjt a;
    public final String b;

    public gjt(fjt fjtVar, String str) {
        this.a = fjtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjt)) {
            return false;
        }
        gjt gjtVar = (gjt) obj;
        return this.a == gjtVar.a && u890.j(this.b, gjtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
