package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wxo0 implements eyo0 {
    public final String a;
    public final h290 b;
    public final al11 c;
    public final h290 d;

    public wxo0(String str, h290 h290Var, al11 al11Var, h290 h290Var2) {
        this.a = str;
        this.b = h290Var;
        this.c = al11Var;
        this.d = h290Var2;
    }

    public final List a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxo0)) {
            return false;
        }
        wxo0 wxo0Var = (wxo0) obj;
        return this.a.equals(wxo0Var.a) && this.b.equals(wxo0Var.b) && this.c.equals(wxo0Var.c) && this.d.equals(wxo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
