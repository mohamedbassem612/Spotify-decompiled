package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f6m {
    public final String a;
    public final yoi1 b;

    public f6m(String str, yoi1 yoi1Var) {
        this.a = str;
        this.b = yoi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6m)) {
            return false;
        }
        f6m f6mVar = (f6m) obj;
        return u890.j(this.a, f6mVar.a) && this.b.equals(f6mVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
