package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2o implements b2o {
    public final String a;
    public final String b;

    public a2o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2o)) {
            return false;
        }
        a2o a2oVar = (a2o) obj;
        return u890.j(this.a, a2oVar.a) && this.b.equals(a2oVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
