package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r7m implements owo0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ r7m(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(two0.class);
            case 1:
                return rc11.a.b(xxo0.class);
            default:
                return rc11.a.b(byo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        psy psyVar;
        switch (this.a) {
            case 0:
                h1m h1mVar = new h1m(this, (byte) 3);
                ji50Var.b.put(two0.class, r4o1.Q(z4m.Q0, w7x.a, h1mVar, u2m.e));
                break;
            case 1:
                ziz0 ziz0Var = new ziz0(this, (byte) 26);
                bn11.h0.getClass();
                Set set = wm11.b;
                ji50Var.b.put(xxo0.class, r4o1.Q(hm11.S0, set, ziz0Var, h211.X0));
                break;
            default:
                bwp bwpVar = (bwp) this.b;
                d0r d0rVar = ji50Var.a;
                tuz tuzVar = (tuz) this.c;
                w9u0 w9u0Var = (w9u0) this.d;
                switch (bwpVar.a) {
                    case 0:
                        nwp nwpVar = (nwp) ((gbp) bwpVar.b).c;
                        gtc1 gtc1Var = new gtc1((xfx) nwpVar.h.get());
                        uu00 uu00VarP = nwpVar.a.P();
                        c8o.l(uu00VarP);
                        em0 em0Var = nwpVar.a;
                        g5p0 g5p0VarX0 = em0Var.x0();
                        c8o.l(g5p0VarX0);
                        waz0 waz0VarG0 = em0Var.G0();
                        c8o.l(waz0VarG0);
                        sks0 sks0Var = new sks0(waz0VarG0, (byte) 27);
                        mr20 mr20VarD0 = em0Var.D0();
                        c8o.l(mr20VarD0);
                        o241 o241Var = (o241) nwpVar.k.get();
                        tgp0 tgp0Var = (tgp0) ((daq) em0Var.b).o2.get();
                        c8o.l(tgp0Var);
                        eh4 eh4Var = new eh4(tgp0Var, (luk) nwpVar.g.get());
                        Scheduler scheduler = (Scheduler) nwpVar.t.get();
                        q8n q8nVar = (q8n) nwpVar.A.get();
                        q8n q8nVarG0 = em0Var.g0();
                        c8o.l(q8nVarG0);
                        psyVar = new psy(d0rVar, tuzVar, w9u0Var, gtc1Var, uu00VarP, g5p0VarX0, sks0Var, mr20VarD0, o241Var, eh4Var, scheduler, q8nVar, q8nVarG0);
                        break;
                    default:
                        thq thqVar = (thq) bwpVar.b;
                        v5q v5qVar = (v5q) thqVar.c;
                        gtc1 gtc1Var2 = new gtc1((xfx) v5qVar.o1.get());
                        daq daqVar = thqVar.b;
                        psyVar = new psy(d0rVar, tuzVar, w9u0Var, gtc1Var2, (uu00) daqVar.a5.get(), (g5p0) v5qVar.F5.get(), new sks0((waz0) v5qVar.b.Kc.get(), (byte) 27), (mr20) daqVar.u5.get(), (o241) daqVar.u4.get(), daqVar.h(), (Scheduler) daqVar.r3.get(), (q8n) daqVar.r2.get(), (q8n) daqVar.V2.get());
                        break;
                }
                ji50Var.b.put(byo0.class, new r3r(new wzq(fdg1.m0(psyVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), hzg1.Z0), lbg1.T0, (vu30) null));
                break;
        }
    }
}
