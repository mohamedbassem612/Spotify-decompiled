package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class itn {
    public final int a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;

    public itn(int i, View view, View view2, View view3, View view4, View view5, View view6) {
        this.a = i;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itn)) {
            return false;
        }
        itn itnVar = (itn) obj;
        return this.a == itnVar.a && u890.j(this.b, itnVar.b) && u890.j(this.c, itnVar.c) && u890.j(this.d, itnVar.d) && u890.j(this.e, itnVar.e) && u890.j(this.f, itnVar.f) && u890.j(this.g, itnVar.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        View view = this.b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.g;
        return iHashCode6 + (view6 != null ? view6.hashCode() : 0);
    }
}
