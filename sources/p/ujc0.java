package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ujc0 {
    public final String a;
    public final String b;

    public ujc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujc0)) {
            return false;
        }
        ujc0 ujc0Var = (ujc0) obj;
        return u890.j(this.a, ujc0Var.a) && this.b.equals(ujc0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 961);
    }
}
