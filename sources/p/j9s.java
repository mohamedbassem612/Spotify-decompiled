package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j9s implements isw {
    public boolean a;
    public String b = "";
    public final idd1 c;
    public final idd1 d;
    public final LinearLayout e;
    public final /* synthetic */ l9s f;
    public final /* synthetic */ iu30 g;

    public j9s(l9s l9sVar, Context context, ViewGroup viewGroup, iu30 iu30Var) {
        this.f = l9sVar;
        this.g = iu30Var;
        this.c = new idd1(new h9s(l9sVar, (byte) 2));
        this.d = new idd1(new jzm(context, viewGroup, iu30Var, this, (byte) 3));
        l9sVar.d.j(new a0c(this, iu30Var, (byte) 1));
        l9sVar.e = new m4r(this, (byte) 29);
        this.e = b().a;
    }

    public final void a(Object obj, ysw yswVar) {
        uhj0 uhj0Var = (uhj0) obj;
        shj0 shj0Var = uhj0Var.h;
        yhj0 yhj0Var = uhj0Var.f;
        this.a = uhj0Var.g;
        iwq iwqVar = uhj0Var.b;
        String str = iwqVar != null ? iwqVar.b : null;
        if (str == null) {
            str = "";
        }
        this.b = str;
        Bundle bundle = uhj0Var.i;
        boolean z = uhj0Var.d;
        if (z && bundle != null) {
            b().b.restoreState(bundle);
            this.g.invoke(khj0.a);
            return;
        }
        if (!uhj0Var.e && z && (yhj0Var instanceof vhj0) && (shj0Var instanceof rhj0)) {
            b().b.loadUrl(((vhj0) yhj0Var).a);
            this.f.c.a();
            c();
            return;
        }
        if (z && (yhj0Var instanceof whj0)) {
            c();
        }
        if (u890.j(shj0Var, mhj0.a)) {
            b().b.setVisibility(0);
            b().c.setVisibility(8);
            b().d.setVisibility(8);
        } else if (u890.j(shj0Var, nhj0.a)) {
            b().b.setVisibility(8);
            b().c.setVisibility(0);
            b().d.setVisibility(8);
        } else if (u890.j(shj0Var, qhj0.a) || u890.j(shj0Var, phj0.a)) {
            c();
        } else if (u890.j(shj0Var, rhj0.a)) {
            c();
        } else {
            eg.o();
        }
    }

    public final osg b() {
        return (osg) this.d.getValue();
    }

    public final void c() {
        b().b.setVisibility(8);
        b().c.setVisibility(8);
        b().d.setVisibility(0);
    }

    public final View getView() {
        return this.e;
    }
}
