package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rox0 {
    public final String a;
    public final String b;
    public final View.OnClickListener c;
    public final q081 d;

    public rox0(String str, String str2, d37 d37Var, q081 q081Var) {
        this.a = str;
        this.b = str2;
        this.c = d37Var;
        this.d = q081Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rox0) {
            rox0 rox0Var = (rox0) obj;
            return u890.j(this.a, rox0Var.a) && u890.j(this.b, rox0Var.b) && u890.j(this.c, rox0Var.c) && this.d == rox0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        View.OnClickListener onClickListener = this.c;
        return this.d.hashCode() + xcg1.g((iHashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31, 31, false);
    }
}
