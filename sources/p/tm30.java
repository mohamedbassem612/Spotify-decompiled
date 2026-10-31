package p;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tm30 {
    public final ie70 a;
    public final w470 b;
    public final Resources c;
    public Parcelable d;

    public tm30(w470 w470Var, ie70 ie70Var, Resources resources) {
        w470Var.getClass();
        this.b = w470Var;
        ie70Var.getClass();
        this.a = ie70Var;
        this.c = resources;
    }

    public final void a() {
        j4b1 j4b1Var = j4b1.e;
        Resources resources = this.c;
        String string = resources.getString(2131955714);
        this.a.c(rd70.c.a.p(new y570[]{gd70.c.a.Q(u970.e).F(dd70.c.a.L("TRACK").k()).L(id70.c.a.d(string).a(resources.getString(2131955713))).x()}).f());
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable("view_state", this.a.b());
    }

    public final void c(Bundle bundle) {
        this.d = bundle != null ? bundle.getParcelable("view_state") : null;
    }
}
