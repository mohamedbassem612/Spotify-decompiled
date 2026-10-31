package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ptx0 implements Function {
    public final /* synthetic */ qtx0 a;

    public ptx0(qtx0 qtx0Var) {
        this.a = qtx0Var;
    }

    public final Object apply(Object obj) {
        vu30 otx0Var;
        Consumer consumer = (Consumer) obj;
        qtx0 qtx0Var = this.a;
        ttx0 ttx0Var = qtx0Var.a.w;
        if (ttx0Var instanceof rtx0) {
            otx0Var = new ntx0(2, fxx0.a, fxx0.class, "update", "update(Lcom/spotify/aiplaylist/promptcreation/mobius/PromptCreationModel;Lcom/spotify/aiplaylist/promptcreation/mobius/PromptCreationEvent;)Lcom/spotify/mobius/Next;", 0);
        } else {
            if (!(ttx0Var instanceof stx0)) {
                eg.o();
                return null;
            }
            otx0Var = new otx0(2, qby0.a, qby0.class, "update", "update(Lcom/spotify/aiplaylist/promptcreation/mobius/PromptCreationModel;Lcom/spotify/aiplaylist/promptcreation/mobius/PromptCreationEvent;)Lcom/spotify/mobius/Next;", 0);
        }
        f230 f230Var = new f230(otx0Var, (byte) 1);
        kkq kkqVar = qtx0Var.b;
        consumer.getClass();
        ezo ezoVar = (ezo) kkqVar.a.c;
        Scheduler scheduler = (Scheduler) ((gux0) ezoVar.v).u.get();
        c8o.l(scheduler);
        jly0 jly0Var = ezoVar.o;
        gux0 gux0Var = (gux0) ezoVar.v;
        caq caqVar = gux0Var.A;
        caq caqVar2 = gux0Var.H;
        kly0 kly0Var = gux0Var.a;
        thq thqVar = gux0Var.G;
        lkq lkqVar = (lkq) jly0Var.get();
        mkq mkqVar = (mkq) ezoVar.u.get();
        nkq nkqVar = (nkq) ezoVar.x.get();
        hwb hwbVar = new hwb((byte) 28);
        qfl1 qfl1VarI = ezoVar.i();
        yqg yqgVar = (yqg) kly0Var.get();
        c8o.l(yqgVar);
        drj0 drj0Var = new drj0(hwbVar, qfl1VarI, yqgVar);
        yfc0 yfc0Var = new yfc0(new hwb((byte) 28), ezoVar.i());
        yqg yqgVar2 = (yqg) kly0Var.get();
        c8o.l(yqgVar2);
        n39 n39Var = new n39(yqgVar2, new hwb((byte) 28));
        jux0 jux0VarF = ezoVar.f();
        i5y0 i5y0Var = (i5y0) gux0Var.I.get();
        c8o.l(i5y0Var);
        so soVar = new so(jux0VarF, i5y0Var, (byte) 18);
        h4e0 h4e0Var = new h4e0((c23) ezoVar.f14p.get(), (PublishSubject) ezoVar.r.get(), (byte) 1);
        yc80 yc80Var = new yc80((nf61) ezoVar.y.get(), (c23) ezoVar.f14p.get(), ezoVar.h(), ezoVar.d(), (byte) 1);
        k9r k9rVar = new k9r(ezoVar.i(), ezoVar.w, ezoVar.f(), (byte) 1);
        uqn uqnVar = new uqn((c23) ezoVar.f14p.get(), (byte) 2);
        yc80 yc80Var2 = new yc80((nf61) ezoVar.y.get(), (c23) ezoVar.f14p.get(), ezoVar.h(), ezoVar.d(), (byte) 0);
        so soVar2 = new so(ezoVar.h(), ezoVar.d(), (byte) 19);
        ya11 ya11Var = (ya11) thqVar.get();
        c8o.l(ya11Var);
        zd1 zd1Var = new zd1(ya11Var, ezoVar.h(), new mka((byte) 20), ezoVar.d(), (byte) 5);
        ya11 ya11Var2 = (ya11) thqVar.get();
        c8o.l(ya11Var2);
        mka mkaVar = new mka((byte) 20);
        q8n q8nVar = (q8n) caqVar2.get();
        c8o.l(q8nVar);
        v6u v6uVar = new v6u(ya11Var2, mkaVar, q8nVar, (byte) 1);
        ya11 ya11Var3 = (ya11) thqVar.get();
        c8o.l(ya11Var3);
        mka mkaVar2 = new mka((byte) 20);
        q8n q8nVar2 = (q8n) caqVar2.get();
        c8o.l(q8nVar2);
        v6u v6uVar2 = new v6u(ya11Var3, mkaVar2, q8nVar2, (byte) 0);
        fjp0 fjp0Var = new fjp0((sjw0) ezoVar.l.get(), (byte) 0);
        c23 c23Var = (c23) ezoVar.f14p.get();
        Scheduler scheduler2 = (Scheduler) caqVar.get();
        c8o.l(scheduler2);
        bip0 bip0Var = new bip0(c23Var, scheduler2, (ykq) ezoVar.z, (PublishSubject) ezoVar.A.get(), (PublishSubject) ezoVar.B.get(), (PublishSubject) ezoVar.C.get());
        h4e0 h4e0Var2 = new h4e0((c23) ezoVar.f14p.get(), (PublishSubject) ezoVar.h.get(), (byte) 0);
        c23 c23Var2 = (c23) ezoVar.f14p.get();
        Scheduler scheduler3 = (Scheduler) caqVar.get();
        c8o.l(scheduler3);
        yon yonVar = new yon(c23Var2, scheduler3, (ykq) ezoVar.z, (PublishSubject) ezoVar.r.get());
        so soVar3 = new so((nf61) ezoVar.y.get(), (c23) ezoVar.f14p.get(), (byte) 6);
        nm3 nm3Var = new nm3((byte) 20);
        okq okqVar = (okq) ezoVar.D.get();
        o4e0 o4e0Var = new o4e0(ezoVar.f(), (byte) 8);
        c681 c681Var = new c681(new hwb((byte) 28), ezoVar.i());
        tz01 tz01Var = new tz01(new hwb((byte) 28), ezoVar.i(), (byte) 22);
        bb01 bb01Var = new bb01(new hwb((byte) 28), ezoVar.i());
        ks21 ks21Var = new ks21(new hwb((byte) 28), ezoVar.i(), (byte) 20);
        lzn0 lzn0Var = (lzn0) gux0Var.d.get();
        c8o.l(lzn0Var);
        f5b f5bVar = new f5b(lzn0Var, (byte) 15);
        Scheduler scheduler4 = (Scheduler) ((gux0) ((ezo) lkqVar.a.c).v).u.get();
        c8o.l(scheduler4);
        km3 km3Var = new km3(scheduler4, consumer, (byte) 20);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(qvx0.class, new k1p0(consumer, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.e(gqx0.class, k9rVar);
        subtypeEffectHandlerBuilderC.e(yqx0.class, n39Var);
        subtypeEffectHandlerBuilderC.e(oqx0.class, drj0Var);
        subtypeEffectHandlerBuilderC.e(pqx0.class, yfc0Var);
        subtypeEffectHandlerBuilderC.e(arx0.class, c681Var);
        subtypeEffectHandlerBuilderC.e(crx0.class, tz01Var);
        subtypeEffectHandlerBuilderC.e(brx0.class, bb01Var);
        subtypeEffectHandlerBuilderC.e(zqx0.class, ks21Var);
        subtypeEffectHandlerBuilderC.g(iqx0.class, soVar);
        subtypeEffectHandlerBuilderC.g(xqx0.class, h4e0Var);
        subtypeEffectHandlerBuilderC.g(tqx0.class, yc80Var);
        subtypeEffectHandlerBuilderC.g(uqx0.class, uqnVar);
        subtypeEffectHandlerBuilderC.g(jqx0.class, yc80Var2);
        subtypeEffectHandlerBuilderC.g(lqx0.class, soVar2);
        subtypeEffectHandlerBuilderC.g(kqx0.class, zd1Var);
        subtypeEffectHandlerBuilderC.g(wqx0.class, v6uVar);
        subtypeEffectHandlerBuilderC.g(hqx0.class, v6uVar2);
        subtypeEffectHandlerBuilderC.g(qqx0.class, bip0Var);
        subtypeEffectHandlerBuilderC.g(rqx0.class, fjp0Var);
        subtypeEffectHandlerBuilderC.g(mqx0.class, h4e0Var2);
        subtypeEffectHandlerBuilderC.g(sqx0.class, o4e0Var);
        ezo ezoVar2 = (ezo) mkqVar.a.c;
        subtypeEffectHandlerBuilderC.g(fqx0.class, new yon(ezoVar2.g(), km3Var, (PublishSubject) ezoVar2.s.get(), (PublishSubject) ezoVar2.t.get(), (byte) 0));
        subtypeEffectHandlerBuilderC.g(dqx0.class, new tj1(((ezo) nkqVar.a.c).g(), km3Var));
        subtypeEffectHandlerBuilderC.g(drx0.class, yonVar);
        subtypeEffectHandlerBuilderC.g(eqx0.class, soVar3);
        subtypeEffectHandlerBuilderC.g(vqx0.class, nm3Var);
        subtypeEffectHandlerBuilderC.g(erx0.class, new tj1(((ezo) okqVar.a.c).g(), new mka((byte) 20), km3Var));
        subtypeEffectHandlerBuilderC.d(nqx0.class, f5bVar, scheduler);
        return Mobius.d(f230Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(qtx0Var.c);
    }
}
