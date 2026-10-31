package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kyo0 implements i6p0 {
    public bpb1 A;
    public boolean B;
    public final q2p0 a;
    public final kly0 b;
    public final kly0 c;
    public final otf d;
    public final nt21 e;
    public final Set f;
    public final tck g;
    public final o2p0 h;
    public final lko i;
    public final uji1 j;
    public final mlw0 k;
    public final mv4 l;
    public final q8n m;
    public final q8n n;
    public final khc o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MobiusLoop f43p;
    public ScrollCardsContainer q;
    public llm r;
    public g931 s;
    public q881 t;
    public e821 u;
    public final bpb1 v = gio1.b(w7x.a);
    public mko w;
    public fr41 x;
    public snc0 y;
    public jwo0 z;

    public kyo0(q2p0 q2p0Var, kly0 kly0Var, kly0 kly0Var2, otf otfVar, nt21 nt21Var, Set set, tck tckVar, o2p0 o2p0Var, lko lkoVar, uji1 uji1Var, mlw0 mlw0Var, mv4 mv4Var, q8n q8nVar, q8n q8nVar2, khc khcVar) {
        this.a = q2p0Var;
        this.b = kly0Var;
        this.c = kly0Var2;
        this.d = otfVar;
        this.e = nt21Var;
        this.f = set;
        this.g = tckVar;
        this.h = o2p0Var;
        this.i = lkoVar;
        this.j = uji1Var;
        this.k = mlw0Var;
        this.l = mv4Var;
        this.m = q8nVar;
        this.n = q8nVar2;
        this.o = khcVar;
    }

    public static ArrayList c(lmb1 lmb1Var, Set set) {
        List data = lmb1Var.getData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            eyo0 eyo0Var = (eyo0) obj;
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (((owo0) it.next()).e().n().isAssignableFrom(eyo0Var.getClass())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        fr41 fr41Var = this.x;
        if (fr41Var != null) {
            fr41Var.d = 0;
            fr41Var.e = null;
            fr41Var.f = 0;
            bpb1 bpb1Var = fr41Var.b;
            Boolean bool = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
        }
        this.A = null;
        snc0 snc0Var = this.y;
        if (snc0Var != null) {
            snc0Var.destroy();
        }
        this.y = null;
        jwo0 jwo0Var = this.z;
        if (jwo0Var != null) {
            jwo0Var.a.l();
        }
        this.z = null;
        ScrollCardsContainer scrollCardsContainer = this.q;
        if (scrollCardsContainer != null) {
            zq41 zq41Var = scrollCardsContainer.a;
            if (zq41Var != null) {
                zq41Var.setAdapter((z511) null);
                tac0 tac0Var = zq41Var.l2;
                if (tac0Var.i.a(w8c0.c)) {
                    tac0Var.i(w8c0.a);
                }
            }
            scrollCardsContainer.removeAllViews();
            scrollCardsContainer.a = null;
        }
    }

    public final void d(j6p0 j6p0Var, ScrollCardsContainer scrollCardsContainer, tl7 tl7Var, v1r0 v1r0Var, boolean z) {
        q2p0 q2p0Var;
        q881 q881Var;
        this.q = scrollCardsContainer;
        llm llmVarE = smo1.e(flo1.l(guo1.B(), this.n));
        this.r = llmVarE;
        o8n o8nVar = llmVarE.a;
        q8n q8nVar = this.m;
        this.s = new g931(this.d, new llm(o8nVar.y(q8nVar)));
        this.t = new q881((byte) 19);
        Flowable flowableH = j6p0Var.h();
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowableH);
        llm llmVar = this.r;
        if (llmVar == null) {
            u890.C("scope");
            throw null;
        }
        nt21 nt21Var = this.e;
        this.u = new e821((zfr) nt21Var.b, (otf) nt21Var.c, kgeVar, llmVar);
        mv4 mv4Var = this.l;
        if (mv4Var.d() && (j6p0Var instanceof NowPlayingScrollView)) {
            NowPlayingScrollView nowPlayingScrollView = (NowPlayingScrollView) j6p0Var;
            int iB = mv4Var.b();
            llm llmVar2 = this.r;
            if (llmVar2 == null) {
                u890.C("scope");
                throw null;
            }
            this.x = new fr41(nowPlayingScrollView, iB, llmVar2, q8nVar);
        }
        mko mkoVarB = this.i.b((String) null, this.v, new oxa0(this, (lnm) null, (byte) 20));
        mkoVarB.start();
        this.w = mkoVarB;
        Set set = this.f;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            byte b = 13;
            q2p0Var = this.a;
            if (!zHasNext) {
                break;
            } else {
                arrayList.add(((nwo0) it.next()).a(q2p0Var, new ivn0(tl7Var, b), v1r0Var, mkoVarB.b()));
            }
        }
        Set setP1 = o7h.p1(arrayList);
        jyo0 jyo0Var = new jyo0(setP1, this, (byte) 0);
        tck tckVar = this.g;
        fu41 fu41Var = (fu41) tckVar.d;
        mr20 mr20Var = (mr20) tckVar.c;
        hs41 hs41Var = (hs41) tckVar.h;
        jv4 jv4Var = (jv4) tckVar.e;
        lv4 lv4Var = (lv4) tckVar.f;
        mv4 mv4Var2 = (mv4) tckVar.g;
        wm70 wm70Var = (wm70) tckVar.i;
        boolean z2 = tckVar.b;
        bw8 bw8Var = (bw8) tckVar.j;
        yjj1 yjj1Var = (yjj1) tckVar.k;
        yqg yqgVar = (yqg) tckVar.a;
        q8n q8nVar2 = (q8n) tckVar.l;
        mwo0 mwo0Var = new mwo0(jyo0Var, fu41Var, mr20Var, hs41Var, jv4Var, lv4Var, mv4Var2, wm70Var, z2, bw8Var, yjj1Var, yqgVar, q8nVar2);
        llm llmVar3 = this.r;
        if (llmVar3 == null) {
            u890.C("scope");
            throw null;
        }
        fr41 fr41Var = this.x;
        xe01 xe01Var = fr41Var != null ? fr41Var.c : null;
        xe01 xe01VarT = d5p1.t(mr20Var, llmVar3, ey71.a, (Object) null);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(rbw.class, new l020(jyo0Var, fu41Var, jv4Var.a(), hs41Var, lv4Var, mv4Var2.e(), z2, bw8Var, yqgVar));
        subtypeEffectHandlerBuilderC.g(ugw.class, new o4e0(new k811(xe01VarT, yqgVar, xe01Var, (byte) 21), (byte) 7));
        MobiusLoop.Builder builderD = Mobius.d(kwo0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).d(new lwo0(mwo0Var));
        boolean zA = mv4Var2.a();
        boolean zE = mv4Var2.e();
        kr41 kr41Var = new kr41(new any(xe01VarT, (byte) 18), (byte) 0);
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new vtm(rqt0.t(kr41Var, jh31.N0), zE, yqgVar, wm70Var));
        if (zA) {
            smc0VarN.add(new mpy0(z4p1.v(rqt0.u(yoi1.g(yjj1Var.a())), 1), xe01VarT, wm70Var, (byte) 9));
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = (mr20[]) smc0VarK.toArray(new mr20[0]);
        mr20[] mr20VarArr2 = (mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length);
        companion.getClass();
        MobiusLoop mobiusLoopG = builderD.h(new b(q8nVar2, mr20VarArr2)).g(new qmb1(""));
        this.f43p = mobiusLoopG;
        this.B = true;
        mobiusLoopG.b(new xzf(this, setP1, (byte) 6));
        j6p0Var.c(q2p0Var.l().e());
        g931 g931Var = this.s;
        if (g931Var != null) {
            xab1 xab1Var = (xab1) g931Var.d;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            g931Var.d = fn31.T((llm) g931Var.c, (o8n) null, 0, new lc41(g931Var, j6p0Var, (lnm) null, (byte) 9), 3);
        }
        if (z && (q881Var = this.t) != null) {
            ((rku) q881Var.b).b(Flowable.h(j6p0Var.b(), j6p0Var.f(), r3x0.S0).X(new dn81(j6p0Var, (byte) 18)).subscribe(new z2a1(j6p0Var, (byte) 13), iqa1.Q0));
        }
        e821 e821Var = this.u;
        if (e821Var != null) {
            xab1 xab1Var2 = (xab1) e821Var.e;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            e821Var.e = fn31.T((c9n) e821Var.d, (o8n) null, 0, new ic01(e821Var, (lnm) null, (byte) 27), 3);
        }
    }

    public final void e() {
        this.B = false;
        MobiusLoop mobiusLoop = this.f43p;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        llm llmVar = this.r;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        e821 e821Var = this.u;
        if (e821Var != null) {
            xab1 xab1Var = (xab1) e821Var.e;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            e821Var.e = null;
        }
        this.u = null;
        g931 g931Var = this.s;
        if (g931Var != null) {
            xab1 xab1Var2 = (xab1) g931Var.d;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            g931Var.d = null;
        }
        this.s = null;
        q881 q881Var = this.t;
        if (q881Var != null) {
            ((rku) q881Var.b).a();
        }
        this.t = null;
        b();
        this.x = null;
        mko mkoVar = this.w;
        if (mkoVar != null) {
            mkoVar.stop();
        }
        this.w = null;
    }
}
