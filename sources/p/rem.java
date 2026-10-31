package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rem {
    public final boolean a;
    public final String b;
    public final iu30 c;

    public rem(boolean z, String str, iu30 iu30Var) {
        this.a = z;
        this.b = str;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rem)) {
            return false;
        }
        rem remVar = (rem) obj;
        return this.a == remVar.a && u890.j(this.b, remVar.b) && u890.j(this.c, remVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
