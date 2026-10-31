package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gvj implements l4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gvj(xqp xqpVar, yqp yqpVar, cir0 cir0Var) {
        this.a = (byte) 2;
        this.c = xqpVar;
        this.d = yqpVar;
        this.b = cir0Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        String str;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                return new gzj(context, new j2i(439009746, new fvj((cir0) obj3, (hvj) obj4, (j2i) obj2, obj, (byte) 1), true));
            case 1:
                return new l59((gs71) obj3, ((lo8) obj4).a(context, layoutInflater, viewGroup, bundle, obj), (tr71) obj2);
            default:
                List list = (List) obj;
                ((xqp) obj4).getClass();
                s59 s59Var = new s59(layoutInflater, viewGroup, (byte) 1);
                cir0 cir0Var = (cir0) obj3;
                tnm tnmVar = (tnm) ((yqp) obj2).a.c;
                Resources resources = (Resources) ((jkg0) tnmVar.b).r.get();
                c8o.l(resources);
                gqb0 gqb0Var = new gqb0(new nlm(resources), (byte) 4);
                jkg0 jkg0Var = (jkg0) tnmVar.b;
                a1r0 a1r0Var = (a1r0) jkg0Var.e.get();
                c8o.l(a1r0Var);
                na naVar = new na(tnmVar.q(), new p5(new iwu(tnmVar.i(), (byte) 0), (byte) 21), (byte) 12);
                ek1 ek1Var = new ek1(tnmVar.q(), new p5(new iwu(tnmVar.i(), (byte) 0), (byte) 21), (byte) 8);
                kly0 kly0Var = jkg0Var.n;
                t2j0 t2j0Var = (t2j0) kly0Var.get();
                c8o.l(t2j0Var);
                cpr cprVar = new cpr(t2j0Var);
                t2j0 t2j0Var2 = (t2j0) kly0Var.get();
                c8o.l(t2j0Var2);
                qy30 qy30Var = new qy30(t2j0Var2);
                ffr ffrVar = new ffr(tnmVar.x(), new x5u(tnmVar.s(), (byte) 6), new q5((byte) 21), (byte) 4);
                x631 x631Var = new x631(((cyp) ((jly0) tnmVar.f).get()).a());
                RetrofitMaker retrofitMaker = (RetrofitMaker) jkg0Var.g.get();
                c8o.l(retrofitMaker);
                ssy0 ssy0Var = (ssy0) retrofitMaker.createWebgateService(ssy0.class, "android-headphone-enhancements-cross-device-syncing");
                x5u x5uVar = new x5u(tnmVar.s(), (byte) 6);
                yfu yfuVarI = tnmVar.i();
                kly0 kly0Var2 = jkg0Var.v;
                luk lukVar = (luk) kly0Var2.get();
                c8o.l(lukVar);
                qpy0 qpy0Var = new qpy0(false, lukVar);
                dma1 dma1Var = (dma1) jkg0Var.w.get();
                c8o.l(dma1Var);
                ivy0 ivy0Var = new ivy0(ssy0Var, x5uVar, yfuVarI, qpy0Var, new p8o(dma1Var));
                x5u x5uVar2 = new x5u(tnmVar.s(), (byte) 6);
                hce1 hce1VarX = tnmVar.x();
                dma1 dma1Var2 = (dma1) jkg0Var.f.get();
                c8o.l(dma1Var2);
                gfr gfrVar = new gfr(x5uVar2, hce1VarX, new o2b1(dma1Var2, (byte) 18), (byte) 8);
                x5u x5uVar3 = new x5u(tnmVar.s(), (byte) 6);
                dma1 dma1Var3 = (dma1) jkg0Var.f.get();
                c8o.l(dma1Var3);
                vqb0 vqb0Var = new vqb0(x5uVar3, new o2b1(dma1Var3, (byte) 18), (byte) 1);
                dma1 dma1Var4 = (dma1) jkg0Var.f.get();
                c8o.l(dma1Var4);
                iov0 iov0Var = new iov0(dma1Var4);
                q5 q5Var = new q5((byte) 21);
                kly0 kly0Var3 = jkg0Var.b;
                Scheduler scheduler = (Scheduler) kly0Var3.get();
                c8o.l(scheduler);
                q8n q8nVar = (q8n) jkg0Var.d.get();
                c8o.l(q8nVar);
                uw0 uw0Var = new uw0(a1r0Var, naVar, ek1Var, cprVar, qy30Var, ffrVar, x631Var, ivy0Var, gfrVar, vqb0Var, iov0Var, q5Var, scheduler, q8nVar);
                Scheduler scheduler2 = (Scheduler) kly0Var3.get();
                c8o.l(scheduler2);
                gjg0 gjg0Var = new gjg0(uw0Var, scheduler2);
                kkg0 kkg0Var = (kkg0) tnmVar.d;
                i8h1 i8h1Var = (i8h1) jkg0Var.u.get();
                c8o.l(i8h1Var);
                w6b1 w6b1VarA = f7b1.a(blc0.Je);
                if (w6b1VarA == null || (str = (String) o7h.s0(w6b1VarA.c)) == null) {
                    str = "";
                }
                zjg0 zjg0Var = new zjg0(str, i8h1Var);
                gfr gfrVarS = tnmVar.s();
                o241 o241Var = (o241) jkg0Var.q.get();
                c8o.l(o241Var);
                luk lukVar2 = (luk) kly0Var2.get();
                c8o.l(lukVar2);
                y170 y170Var = new y170(o241Var, new bpy0(true, lukVar2), (byte) 2);
                luk lukVar3 = (luk) jkg0Var.v.get();
                c8o.l(lukVar3);
                return new l59(cir0Var, s59Var, new lkg0(s59Var, list, gqb0Var, new gkg0(gjg0Var, kkg0Var, zjg0Var, gfrVarS, y170Var, new x5u(new ppy0(false, lukVar3), (byte) 10))));
        }
    }

    public /* synthetic */ gvj(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
