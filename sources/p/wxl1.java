package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wxl1 {
    public final String a;
    public final boolean b;

    public wxl1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxl1)) {
            return false;
        }
        wxl1 wxl1Var = (wxl1) obj;
        return u890.j(this.a, wxl1Var.a) && this.b == wxl1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
