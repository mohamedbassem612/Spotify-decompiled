package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class er91 {
    public final fs91 a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final View.OnClickListener f;
    public final View.OnClickListener g;
    public final xq91 h;
    public final boolean i;

    public er91(fs91 fs91Var, String str, Integer num, String str2, Integer num2, View.OnClickListener onClickListener, cvr cvrVar, xq91 xq91Var, boolean z) {
        this.a = fs91Var;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = num2;
        this.f = onClickListener;
        this.g = cvrVar;
        this.h = xq91Var;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er91)) {
            return false;
        }
        er91 er91Var = (er91) obj;
        return u890.j(this.a, er91Var.a) && u890.j(this.b, er91Var.b) && u890.j(this.c, er91Var.c) && u890.j(this.d, er91Var.d) && u890.j(this.e, er91Var.e) && u890.j(this.f, er91Var.f) && u890.j(this.g, er91Var.g) && u890.j(this.h, er91Var.h) && this.i == er91Var.i;
    }

    public final int hashCode() {
        fs91 fs91Var = this.a;
        int iD = cy30.d((fs91Var == null ? 0 : fs91Var.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f;
        int iHashCode4 = (iHashCode3 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnClickListener onClickListener2 = this.g;
        int iHashCode5 = (iHashCode4 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31;
        xq91 xq91Var = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode5 + (xq91Var != null ? xq91Var.hashCode() : 0)) * 31);
    }
}
