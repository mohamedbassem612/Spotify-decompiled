package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cz81 {
    public final ak a;
    public final String b;

    public cz81(ak akVar, String str) {
        this.a = akVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz81)) {
            return false;
        }
        cz81 cz81Var = (cz81) obj;
        return this.a == cz81Var.a && u890.j(this.b, cz81Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return cy30.p("SingleIdentifier(source=", this.a.name(), ", accessoryId=", this.b, ")");
    }
}
