package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n59 implements g4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public n59(fux0 fux0Var, cir0 cir0Var, qux0 qux0Var) {
        this.a = (byte) 7;
        this.c = fux0Var;
        this.b = cir0Var;
        this.d = qux0Var;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((i2p) obj3).getClass();
                s59 s59Var = new s59(layoutInflater, viewGroup, (byte) 0);
                j141 j141Var = new j141((byte) 24);
                tnm tnmVar = (tnm) ((j2p) obj2).a.c;
                j59 j59Var = (j59) tnmVar.b;
                i8h1 i8h1Var = (i8h1) j59Var.t.get();
                c8o.l(i8h1Var);
                d59 d59Var = new d59(i8h1Var);
                a1r0 a1r0Var = (a1r0) j59Var.d.get();
                c8o.l(a1r0Var);
                p5 p5Var = new p5(new iwu(tnmVar.i(), (byte) 0), (byte) 21);
                HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) j59Var.p.get();
                c8o.l(headphoneFilterStateDatabase);
                Flowable flowable = (Flowable) j59Var.r.get();
                c8o.l(flowable);
                kly0 kly0Var = j59Var.b;
                Scheduler scheduler = (Scheduler) kly0Var.get();
                c8o.l(scheduler);
                na naVar = new na(flowable, scheduler, (byte) 17);
                kly0 kly0Var2 = j59Var.u;
                luk lukVar = (luk) kly0Var2.get();
                c8o.l(lukVar);
                x5u x5uVar = new x5u(new ppy0(false, lukVar), (byte) 10);
                Scheduler scheduler2 = (Scheduler) kly0Var.get();
                c8o.l(scheduler2);
                ffr ffrVar = new ffr(new hce1(headphoneFilterStateDatabase, naVar, x5uVar, scheduler2, (byte) 18), tnmVar.k(), new q5((byte) 21), (byte) 4);
                t2j0 t2j0Var = (t2j0) j59Var.n.get();
                c8o.l(t2j0Var);
                cpr cprVar = new cpr(t2j0Var);
                hgo hgoVarL = tnmVar.l();
                x631 x631Var = new x631(((cyp) ((jly0) tnmVar.f).get()).a());
                RetrofitMaker retrofitMaker = (RetrofitMaker) j59Var.j.get();
                c8o.l(retrofitMaker);
                ssy0 ssy0Var = (ssy0) retrofitMaker.createWebgateService(ssy0.class, "android-headphone-enhancements-cross-device-syncing");
                x5u x5uVarK = tnmVar.k();
                yfu yfuVarI = tnmVar.i();
                luk lukVar2 = (luk) kly0Var2.get();
                c8o.l(lukVar2);
                qpy0 qpy0Var = new qpy0(false, lukVar2);
                dma1 dma1Var = (dma1) j59Var.v.get();
                c8o.l(dma1Var);
                ivy0 ivy0Var = new ivy0(ssy0Var, x5uVarK, yfuVarI, qpy0Var, new p8o(dma1Var));
                x5u x5uVarK2 = tnmVar.k();
                dma1 dma1Var2 = (dma1) j59Var.g.get();
                c8o.l(dma1Var2);
                vqb0 vqb0Var = new vqb0(x5uVarK2, new o2b1(dma1Var2, (byte) 18), (byte) 1);
                kly0 kly0Var3 = j59Var.a;
                Scheduler scheduler3 = (Scheduler) kly0Var3.get();
                c8o.l(scheduler3);
                q8n q8nVar = (q8n) j59Var.c.get();
                c8o.l(q8nVar);
                em0 em0Var = new em0(a1r0Var, p5Var, ffrVar, cprVar, hgoVarL, x631Var, ivy0Var, vqb0Var, scheduler3, q8nVar);
                Scheduler scheduler4 = (Scheduler) kly0Var3.get();
                c8o.l(scheduler4);
                m49 m49Var = new m49(em0Var, scheduler4);
                hgo hgoVarL2 = tnmVar.l();
                k59 k59Var = (k59) tnmVar.d;
                o241 o241Var = (o241) j59Var.q.get();
                c8o.l(o241Var);
                luk lukVar3 = (luk) kly0Var2.get();
                c8o.l(lukVar3);
                y170 y170Var = new y170(o241Var, new bpy0(true, lukVar3), (byte) 2);
                dxz0 dxz0Var = (dxz0) j59Var.x.get();
                c8o.l(dxz0Var);
                return new l59((cir0) obj, s59Var, new m59(s59Var, j141Var, new g59(d59Var, m49Var, hgoVarL2, k59Var, y170Var, dxz0Var)));
            case 1:
                return new gzj(context, new j2i(-755682150, new pyj((cir0) obj, (qyj) obj3, (j2i) obj2, (byte) 1), true));
            case 2:
                View viewInflate = layoutInflater.inflate(2131624647, (ViewGroup) null, false);
                if (viewInflate != null) {
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    return new q1t(new kp00(frameLayout, frameLayout, (byte) 18), (pp20) obj3, (qwp) obj2, (swp) obj);
                }
                bhn0.i("rootView");
                return null;
            case 3:
                return new gzj(context, new j2i(-1413924434, new jq90((cir0) obj, new obk1(viewGroup), (vx40) obj3, (j2i) obj2, viewGroup, (byte) 1), true));
            case 4:
                return new gzj(context, new j2i(-1405359479, new kq90((cir0) obj, new obk1(viewGroup), (ye90) obj3, (j2i) obj2, viewGroup, (byte) 1), true));
            case 5:
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout2.addView(((e3v0) obj3).b.e());
                frameLayout2.addView((kgr0) obj);
                return new l59(frameLayout2, (l3v0) obj2, (byte) 6);
            case 6:
                zfr zfrVar = (zfr) obj3;
                return new yfo(new tjq(layoutInflater, viewGroup, (egs) zfrVar.b, (kt91) zfrVar.c), (dgs) obj2, ((r7v0) obj).a);
            case 7:
                ezo ezoVar = (ezo) ((fux0) obj3).b.a.c;
                return new jdg((qkq) ezoVar.k.get(), viewGroup, layoutInflater, (cir0) obj, (qux0) obj2, (rvx0) ezoVar.m.get());
            default:
                return new q1t(layoutInflater.inflate(2131626168, viewGroup, false), (n381) obj3, (y991) obj2, ((la91) obj).a);
        }
    }

    public /* synthetic */ n59(cir0 cir0Var, Object obj, j2i j2iVar, byte b) {
        this.a = b;
        this.b = cir0Var;
        this.c = obj;
        this.d = j2iVar;
    }

    public /* synthetic */ n59(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
