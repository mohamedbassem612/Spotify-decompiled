package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pr61 {
    public final int a;
    public final iu30 b;
    public final String c;

    public pr61(int i, sl11 sl11Var, String str) {
        this.a = i;
        this.b = sl11Var;
        this.c = str;
    }

    public final String a(Context context) {
        String str;
        iu30 iu30Var = this.b;
        return (iu30Var == null || (str = (String) iu30Var.invoke(context)) == null) ? context.getString(this.a) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr61)) {
            return false;
        }
        pr61 pr61Var = (pr61) obj;
        return this.a == pr61Var.a && u890.j(this.b, pr61Var.b) && u890.j(this.c, pr61Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        iu30 iu30Var = this.b;
        return this.c.hashCode() + ((iHashCode + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31);
    }
}
