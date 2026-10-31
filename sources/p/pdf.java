package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pdf implements bef {
    public final String a;
    public final ou80 b;

    public pdf(String str, ou80 ou80Var) {
        this.a = str;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdf)) {
            return false;
        }
        pdf pdfVar = (pdf) obj;
        return u890.j(this.a, pdfVar.a) && u890.j(this.b, pdfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ou80 ou80Var = this.b;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
