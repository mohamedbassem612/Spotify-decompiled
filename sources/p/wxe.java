package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wxe implements nye {
    public final String a;
    public final String b;
    public final tom c;
    public final boolean d;
    public final boolean e;

    public wxe(String str, String str2, tom tomVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = tomVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxe)) {
            return false;
        }
        wxe wxeVar = (wxe) obj;
        return u890.j(this.a, wxeVar.a) && u890.j(this.b, wxeVar.b) && this.c.equals(wxeVar.c) && this.d == wxeVar.d && this.e == wxeVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
