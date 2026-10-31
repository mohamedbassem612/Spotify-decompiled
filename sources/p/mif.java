package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mif implements uif {
    public final String a;
    public final String b;

    public mif(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mif)) {
            return false;
        }
        mif mifVar = (mif) obj;
        return u890.j(this.a, mifVar.a) && u890.j(this.b, mifVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
