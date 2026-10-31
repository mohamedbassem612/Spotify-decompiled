package p;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z8e implements mto0, View.OnClickListener {
    public final u8e a;
    public final boolean b;
    public final gu2 c;

    public z8e(u8e u8eVar, boolean z, gu2 gu2Var) {
        this.a = u8eVar;
        this.b = z;
        this.c = gu2Var;
    }

    public static void b(mh90 mh90Var, gpc gpcVar, gpc gpcVar2) {
        for (mh90 mh90Var2 : mh90Var.f) {
            if (mh90Var2 instanceof rh90) {
                yge ygeVar = ((rh90) mh90Var2).e;
                Boolean bool = ygeVar.a;
                Boolean bool2 = Boolean.TRUE;
                if (u890.j(bool, bool2)) {
                    gpcVar.invoke();
                }
                if (u890.j(ygeVar.b, bool2)) {
                    gpcVar2.invoke();
                }
            } else {
                if (!(mh90Var2 instanceof mh90)) {
                    eg.o();
                    return;
                }
                b(mh90Var2, gpcVar, gpcVar2);
            }
        }
    }

    public final void a(Context context, nx40 nx40Var) {
        String strC;
        String strC2;
        String strC3;
        fta ftaVar = ((a9e) nx40Var).a;
        ConstraintLayout constraintLayout = (ConstraintLayout) ftaVar.b;
        t8e t8eVar = this.a;
        boolean z = t8eVar instanceof t8e;
        boolean z2 = true;
        boolean z3 = this.b;
        if (z) {
            ((TextView) ftaVar.e).setText(context.getString(2131960197));
            b881 b881Var = t8eVar.a;
            boolean z4 = b881Var instanceof a881;
            if (b881Var.equals(z781.a)) {
                strC3 = context.getString(2131953526);
            } else if (b881Var.equals(z781.b)) {
                strC3 = context.getString(2131960196);
            } else {
                if (!(b881Var instanceof a881)) {
                    eg.o();
                    return;
                }
                strC3 = c(context, 2131953528);
            }
            strC3.getClass();
            ((TextView) ftaVar.d).setText(strC3);
            ((View) ftaVar.c).setVisibility(z3 && z4 ? 0 : 8);
        } else if (t8eVar instanceof s8e) {
            rh90 rh90Var = ((s8e) t8eVar).a;
            ((TextView) ftaVar.e).setText(rh90Var.c);
            yge ygeVar = rh90Var.e;
            Boolean bool = ygeVar.b;
            Boolean bool2 = Boolean.TRUE;
            if (u890.j(bool, bool2) && u890.j(ygeVar.a, bool2)) {
                strC2 = c(context, 2131953524);
            } else if (u890.j(ygeVar.a, bool2)) {
                strC2 = c(context, 2131953525);
            } else {
                strC2 = u890.j(ygeVar.b, bool2) ? c(context, 2131953528) : context.getString(2131953526);
            }
            ((TextView) ftaVar.d).setText(strC2);
            if (!z3 || (!u890.j(ygeVar.b, bool2) && !u890.j(ygeVar.a, bool2))) {
                z2 = false;
            }
            ((View) ftaVar.c).setVisibility(z2 ? 0 : 8);
        } else {
            if (!(t8eVar instanceof r8e)) {
                eg.o();
                return;
            }
            mh90 mh90Var = ((r8e) t8eVar).a;
            ((TextView) ftaVar.e).setText(mh90Var.c);
            l811 l811Var = new l811();
            l811 l811Var2 = new l811();
            b(mh90Var, new gpc(l811Var, (byte) 1), new gpc(l811Var2, (byte) 2));
            boolean z5 = l811Var.a;
            boolean z6 = z5 || l811Var2.a;
            if (z5 && l811Var2.a) {
                strC = c(context, 2131953524);
            } else if (z5) {
                strC = c(context, 2131953525);
            } else {
                strC = l811Var2.a ? c(context, 2131953528) : context.getString(2131953526);
            }
            ((TextView) ftaVar.d).setText(strC);
            ((View) ftaVar.c).setVisibility(z3 && z6 ? 0 : 8);
        }
        constraintLayout.setOnClickListener(this);
        b8k1.p(constraintLayout, new zdc((byte) 0));
    }

    public final String c(Context context, int i) {
        String string = context.getString(i);
        if (!this.b) {
            return string;
        }
        String string2 = context.getString(2131953527, string);
        string2.getClass();
        return string2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.invoke(this.a);
    }
}
