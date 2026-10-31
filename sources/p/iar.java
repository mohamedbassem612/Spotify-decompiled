package p;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iar {
    public final String a;
    public final ie30 b;
    public final ie30 c;
    public final int d;
    public final int e;

    public iar(String str, ie30 ie30Var, ie30 ie30Var2, int i, int i2) {
        dm5.m(i == 0 || i2 == 0);
        dm5.m(true ^ TextUtils.isEmpty(str));
        this.a = str;
        ie30Var.getClass();
        this.b = ie30Var;
        ie30Var2.getClass();
        this.c = ie30Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iar.class == obj.getClass()) {
            iar iarVar = (iar) obj;
            if (this.d == iarVar.d && this.e == iarVar.e && this.a.equals(iarVar.a) && this.b.equals(iarVar.b) && this.c.equals(iarVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + cy30.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
