package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wxe1 extends m87 {
    public final String d;
    public final String e;

    public wxe1(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxe1)) {
            return false;
        }
        wxe1 wxe1Var = (wxe1) obj;
        return u890.j(this.d, wxe1Var.d) && this.e.equals(wxe1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
