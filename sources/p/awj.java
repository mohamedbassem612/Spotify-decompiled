package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class awj implements g4h1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ awj(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new gzj(context, 2131430154, new j2i(-1171263788, new k7f((byte) 7, (vu30) obj, false), true));
            case 1:
                return new qdg(context, (lzn0) obj, (byte) 1);
            case 2:
                g1i g1iVar = (g1i) ((clp) obj).a.c;
                swa0 swa0Var = (swa0) ((vwa0) g1iVar.b).a.get();
                c8o.l(swa0Var);
                yjn0 yjn0Var = (yjn0) g1iVar.c;
                xjn0 xjn0Var = (xjn0) ((jly0) g1iVar.e).get();
                vwa0 vwa0Var = (vwa0) g1iVar.b;
                zlc0 zlc0Var = (zlc0) vwa0Var.e.get();
                c8o.l(zlc0Var);
                pe peVar = (pe) vwa0Var.d.get();
                c8o.l(peVar);
                lzn0 lzn0Var = (lzn0) vwa0Var.g.get();
                c8o.l(lzn0Var);
                rjn0 rjn0Var = (rjn0) vwa0Var.c.get();
                c8o.l(rjn0Var);
                dg30 dg30Var = (dg30) vwa0Var.f.get();
                c8o.l(dg30Var);
                return new n830(layoutInflater, bundle, swa0Var, yjn0Var, xjn0Var, zlc0Var, peVar, lzn0Var, rjn0Var, dg30Var);
            case 3:
                Bundle bundle2 = (l5r0) ((a7e0) obj).invoke();
                bundle2.c(context, layoutInflater, viewGroup);
                if (bundle != null) {
                    Bundle bundle3 = bundle2 instanceof lqb1 ? (lqb1) bundle2 : null;
                    if (bundle3 != null) {
                        bundle3.d(bundle);
                    }
                }
                return new z6e0(bundle2);
            case 4:
                return ((uam0) obj).a.a(context, bundle != null ? bundle.getBundle("delegate-state") : null, layoutInflater, viewGroup);
            case 5:
                return new qdg((u4p0) ((kly0) obj).get(), context, layoutInflater, viewGroup);
            default:
                lzn0 lzn0Var2 = (lzn0) ((n3x0) ((qq) ((x3x0) obj).h.a.c).b).n.get();
                c8o.l(lzn0Var2);
                return new qdg(context, lzn0Var2, (byte) 3);
        }
    }
}
