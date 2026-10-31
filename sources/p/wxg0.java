package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wxg0 {
    public static final wxg0 d = new wxg0("", false, false);
    public final String a;
    public final boolean b;
    public final boolean c;

    public wxg0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public static wxg0 a(wxg0 wxg0Var, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = wxg0Var.a;
        }
        if ((i & 2) != 0) {
            z = wxg0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = wxg0Var.c;
        }
        return new wxg0(str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxg0)) {
            return false;
        }
        wxg0 wxg0Var = (wxg0) obj;
        return this.a.equals(wxg0Var.a) && this.b == wxg0Var.b && this.c == wxg0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
