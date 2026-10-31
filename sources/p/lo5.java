package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lo5 implements i8l {
    public final /* synthetic */ byte a;
    public final Object b;

    public lo5(ypa ypaVar, otu otuVar) {
        this.a = (byte) 1;
        this.b = otuVar;
    }

    @Override // p.i8l
    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        BottomSheetBehavior m231Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i = kgr0.T0;
                return new ko5(xyn1.z(layoutInflater.inflate(2131624053, viewGroup, false)), (pp) obj);
            case 1:
                u800 u800Var = new u800(layoutInflater, viewGroup);
                ((View) u800Var.b.getValue()).setVisibility(8);
                return new x700(((otu) obj).d(u800Var));
            case 2:
                qjp qjpVar = (qjp) ((zkp) obj).a.b;
                jwa jwaVar = (jwa) qjpVar.c;
                i8h1 i8h1Var = (i8h1) ((tva0) qjpVar.b).h.get();
                c8o.l(i8h1Var);
                ic9 ic9Var = new ic9(i8h1Var, new h7l0((byte) 1), (byte) 10);
                tva0 tva0Var = (tva0) qjpVar.b;
                nwa nwaVar = (nwa) tva0Var.d.get();
                c8o.l(nwaVar);
                yqg yqgVar = (yqg) tva0Var.c.get();
                c8o.l(yqgVar);
                lzn0 lzn0Var = (lzn0) tva0Var.g.get();
                c8o.l(lzn0Var);
                dg30 dg30Var = (dg30) tva0Var.f.get();
                c8o.l(dg30Var);
                return new wva0(layoutInflater, bundle, jwaVar, ic9Var, nwaVar, yqgVar, lzn0Var, dg30Var);
            case 3:
                sbz0 sbz0Var = (sbz0) obj;
                wbz0 wbz0VarB = sbz0Var.c.b(context, layoutInflater, viewGroup, sbz0Var.s);
                if (sbz0Var.d()) {
                    ViewParent parent = viewGroup.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        try {
                            m231Var = BottomSheetBehavior.z(viewGroup2);
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        BottomSheetBehavior bottomSheetBehavior = m231Var instanceof m231 ? null : m231Var;
                        if (bottomSheetBehavior != null) {
                            sbz0Var.q = bottomSheetBehavior;
                            if (sbz0Var.d() && sbz0Var.j && sbz0Var.a.getResources().getConfiguration().orientation != 2) {
                                bottomSheetBehavior.F(false);
                                bottomSheetBehavior.G(0.66f);
                            }
                            bottomSheetBehavior.t(new jph(sbz0Var, (byte) 6));
                        }
                    }
                    break;
                }
                return wbz0VarB;
            case 4:
                return new x700((spz0) ((ynb0) obj).get());
            default:
                return new yua1(((l6s) obj).j(context, layoutInflater));
        }
    }

    public /* synthetic */ lo5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
