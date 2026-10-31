package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zoa {
    public final String a;
    public final o2u0 b;

    public zoa(String str, o2u0 o2u0Var) {
        this.a = str;
        this.b = o2u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoa)) {
            return false;
        }
        zoa zoaVar = (zoa) obj;
        return u890.j(this.a, zoaVar.a) && u890.j(this.b, zoaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
