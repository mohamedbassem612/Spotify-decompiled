package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ge8 implements l4h1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ge8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new fe8(context, viewGroup, this, (f78) obj);
            case 1:
                g8e g8eVarA = ((k4p) obj2).a((bi90) obj);
                g8eVarA.c(context, layoutInflater, viewGroup);
                View view = g8eVarA.getView();
                if (view == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                int i = kgr0.T0;
                return new l59(xyn1.z(view), g8eVarA, (byte) 1);
            case 2:
                return ((g4h1) obj2).a(context, bundle, layoutInflater, viewGroup);
            case 3:
                int iIntValue = ((Number) obj).intValue();
                toj0 toj0Var = (toj0) ((alp) obj2).a.c;
                lzn0 lzn0Var = (lzn0) ((dwa0) toj0Var.b).e.get();
                c8o.l(lzn0Var);
                dwa0 dwa0Var = (dwa0) toj0Var.b;
                swa0 swa0Var = (swa0) dwa0Var.g.get();
                c8o.l(swa0Var);
                c8w c8wVar = (c8w) ((jly0) toj0Var.f).get();
                t8w t8wVar = (t8w) toj0Var.d;
                zlc0 zlc0Var = (zlc0) dwa0Var.h.get();
                c8o.l(zlc0Var);
                dg30 dg30Var = (dg30) dwa0Var.i.get();
                c8o.l(dg30Var);
                gw70 gw70VarB = dwa0Var.b();
                c8o.l(gw70VarB);
                return new gwa0(layoutInflater, iIntValue, lzn0Var, swa0Var, c8wVar, t8wVar, zlc0Var, dg30Var, gw70VarB);
            case 4:
                ll3 ll3Var = (ll3) obj2;
                w9h w9hVar = new w9h((elp) ll3Var.a.get(), (t9h) ll3Var.b.get(), (v9h) obj);
                w9hVar.c(context, layoutInflater, viewGroup);
                ConstraintLayout view2 = w9hVar.getView();
                if (view2 != null) {
                    return new m1b0(view2, w9hVar, (byte) 0);
                }
                eg.m("KidsProfileAvatarPickerPage: initView did not create a view");
                return null;
            case 5:
                byp bypVar = ((yyc0) obj2).e;
                r231 r231Var = ((zou0) obj).Y;
                efr efrVar = (efr) bypVar.f;
                if (r231Var instanceof r231) {
                    return new qee(viewGroup, efrVar, (hc30) bypVar.c, r231Var);
                }
                if (r231Var instanceof o231) {
                    return new qee(viewGroup, efrVar, (hc30) bypVar.a, (o231) r231Var);
                }
                if (r231Var instanceof p231) {
                    return new qee(viewGroup, efrVar, (f330) bypVar.d, (p231) r231Var);
                }
                if (r231Var instanceof a331) {
                    return new qee(viewGroup, efrVar, (hc30) bypVar.i, (a331) r231Var);
                }
                eg.n("Unexpected Result ", r231Var, " in error path.");
                return null;
            case 6:
                b6p b6pVar = (b6p) ((wrp) obj2).a.b;
                vnd1 vnd1VarY = b6pVar.y();
                t2b t2bVar = new t2b((byte) 16);
                ani0 ani0Var = (ani0) b6pVar.b;
                hwa0 hwa0Var = (hwa0) ani0Var.f.get();
                c8o.l(hwa0Var);
                gw70 gw70Var = (gw70) ani0Var.e.get();
                c8o.l(gw70Var);
                return new gwa0(layoutInflater, (le90) obj, vnd1VarY, t2bVar, hwa0Var, gw70Var);
            case 7:
                x3x0 x3x0Var = (x3x0) obj2;
                zjq zjqVar = x3x0Var.g;
                cbr0 cbr0Var = x3x0Var.r;
                qq qqVar = (qq) zjqVar.a.c;
                return new g4x0((w6x0) ((ywp) qqVar.k).get(), (akq) ((jly0) qqVar.m).get(), cbr0Var).b(layoutInflater, viewGroup, bundle, yoi1.i(new h6a(new uop0(yoi1.g(((edx0) obj).i.hide()), (byte) 21), (byte) 12), o6x.a));
            default:
                View viewInflate = layoutInflater.inflate(2131626332, viewGroup, false);
                viewInflate.getClass();
                return new fe8(viewInflate, (elb1) obj, context, (lzn0) obj2);
        }
    }
}
