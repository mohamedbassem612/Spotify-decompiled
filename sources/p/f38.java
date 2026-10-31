package p;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f38 implements qsw0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f38(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((g38) obj).f.get() != null);
            case 1:
                uw0 uw0Var = (uw0) ((cep) obj).a.c;
                Context context = (Context) ((k5z) uw0Var.e).b.get();
                c8o.l(context);
                return new ggc0(context, (u0i) ((jly0) uw0Var.t).get(), (r4m0) ((jly0) uw0Var.X).get());
            case 2:
                return ((pp) obj).a(null);
            case 3:
                return new n4h1((s6t0) obj);
            case 4:
                return new m4h1((g4h1) obj);
            case 5:
                return ((zfx) obj).a((l0i) null);
            case 6:
                return ((yfx) obj).a((l0i) null);
            case 7:
                return ((agx) obj).a(null);
            case 8:
                return ((zfx) obj).a((l0i) null);
            case 9:
                return ((zfx) obj).a((l0i) null);
            case 10:
                ufx ufxVar = ((xfx) ((bjx) obj).b).b;
                return new nzj(ufxVar.a, new j2i(-87347330, new wh(ufxVar, cjd0.a, (byte) 16), true));
            case 11:
                upq upqVar = (upq) ((opq) obj).a.c;
                Context context2 = (Context) ((as61) upqVar.b).a.get();
                c8o.l(context2);
                return new ggc0(context2, (u0i) ((jly0) upqVar.g).get(), (t4m0) ((jly0) upqVar.h).get());
            case 12:
                upq upqVar2 = (upq) ((ppq) obj).a.c;
                return new egc0((u0i) ((jly0) upqVar2.j).get(), (kr61) ((jly0) upqVar2.k).get());
            case 13:
                upq upqVar3 = (upq) ((qpq) obj).a.c;
                return new v8c((u0i) ((jly0) upqVar3.m).get(), (kr61) ((jly0) upqVar3.k).get(), (byte) 1);
            case 14:
                return new a460((u0i) ((jly0) ((upq) ((rpq) obj).a.c).o).get());
            case 15:
                upq upqVar4 = (upq) ((spq) obj).a.c;
                return new v8c((u0i) ((jly0) upqVar4.q).get(), (kr61) ((jly0) upqVar4.k).get(), (byte) 0);
            case 16:
                return ((igx) obj).a((l0i) null);
            default:
                Context contextP0 = ((jrm1) obj).b.P0();
                TextView textView = new TextView(contextP0);
                int dimensionPixelSize = contextP0.getResources().getDimensionPixelSize(2131167023);
                textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, contextP0.getResources().getDimensionPixelSize(2131167033));
                textView.setTextAppearance(2132018006);
                textView.setTextColor(foo1.u(contextP0, 2130968791));
                return new uer(textView);
        }
    }
}
