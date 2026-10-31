package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hga1 extends dwb {
    public final hq81 V1;
    public efr W1;
    public w2z X1;
    public r2a1 Y1;
    public yt91 Z1;

    public hga1(hq81 hq81Var) {
        this.V1 = hq81Var;
    }

    public final int b1() {
        return 2132017866;
    }

    public final Dialog c1(Bundle bundle) {
        cwb cwbVarC1 = super.c1(bundle);
        cwbVarC1.g().E = true;
        cwbVarC1.g().L(3);
        return cwbVarC1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        yt91 yt91Var = this.Z1;
        if (yt91Var == null) {
            u890.C("popupLogger");
            throw null;
        }
        i8h1 i8h1Var = (i8h1) yt91Var.c;
        tdl0 tdl0Var = (tdl0) yt91Var.d;
        String str = ((lik1) yt91Var.b).a;
        x6h1 x6h1VarC = tdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("dismiss", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        super/*p.t2u*/.onDismiss(dialogInterface);
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ipq0 ipq0Var;
        xfa1 xfa1Var = xfa1.a;
        w2z w2zVar = this.X1;
        if (w2zVar == null) {
            u890.C("filterOptionLogger");
            throw null;
        }
        r2a1 r2a1Var = this.Y1;
        if (r2a1Var == null) {
            u890.C("sortOptionLogger");
            throw null;
        }
        urs ursVar = new urs(w2zVar, r2a1Var, P0());
        efr efrVar = this.W1;
        if (efrVar == null) {
            u890.C("presenter");
            throw null;
        }
        ursVar.getOptionsClicks().subscribe(new lgr(efrVar, new gga1(this, (byte) 0), (byte) 8));
        qfs qfsVar = (qfs) efrVar.b;
        h620 h620Var = (p620) qfsVar.e.h();
        if (h620Var == null) {
            h620Var = h620.b;
        }
        if (h620Var.equals(h620.a)) {
            ipq0Var = ipq0.b;
        } else {
            ipq0Var = h620Var.equals(h620.c) ? ipq0.c : ipq0.a;
        }
        LinkedHashMap linkedHashMap = ursVar.m1;
        TextView textView = (TextView) linkedHashMap.get(ipq0Var);
        Drawable drawable = ursVar.n1;
        if (textView != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        xfa1 xfa1Var2 = (xfa1) qfsVar.g.h();
        if (xfa1Var2 == null) {
            xfa1Var2 = xfa1Var;
        }
        d281 d281Var = (d281) qfsVar.h.h();
        if (d281Var == null) {
            d281Var = d281.a;
        }
        jpq0 jpq0Var = jpq0.a;
        jpq0 jpq0Var2 = jpq0.b;
        if (xfa1Var2.equals(xfa1Var)) {
            if (ppq0.a[d281Var.ordinal()] == 1) {
                jpq0Var = jpq0Var2;
            }
        } else if (xfa1Var2.equals(xfa1.b)) {
            jpq0Var = jpq0Var2;
        } else if (!xfa1Var2.equals(xfa1.c)) {
            eg.o();
            return null;
        }
        TextView textView2 = (TextView) linkedHashMap.get(jpq0Var);
        if (textView2 != null) {
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        return ursVar;
    }
}
