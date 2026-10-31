package p;

import android.os.Bundle;
import com.spotify.mobius.Effects;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.First;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nh00 extends x7e0 implements b031 {
    public final mfe X;
    public MobiusLoop Y;
    public Disposable Z;
    public final th00 d;
    public final yqg e;
    public final List f;
    public final uod0 g;
    public final kdn0 h;
    public final kdn0 i;
    public final bbc t;

    public nh00(wh00 wh00Var, th00 th00Var, yqg yqgVar) {
        this.d = th00Var;
        this.e = yqgVar;
        List list = wh00Var.d;
        this.f = list;
        this.g = new uod0(null, null, wh00Var.c, null, list, null, 966);
        kdn0 kdn0Var = new kdn0(tod0.a);
        this.h = kdn0Var;
        this.i = kdn0Var;
        bbc bbcVarA = mno1.a(1, 2, 4);
        this.t = bbcVarA;
        this.X = k4p1.B(bbcVarA);
    }

    public final void a(Bundle bundle) {
        uod0 uod0Var;
        uqr0 uqr0Var = (uqr0) bundle.get("state");
        if (uqr0Var != null) {
            uod0Var = new uod0(uqr0Var.e, uqr0Var.a, uqr0Var.b, uqr0Var.c, o7h.l1(uqr0Var.d), uqr0Var.f, 448);
        } else {
            uod0Var = null;
        }
        this.h.m(uod0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x022b  */
    public final void e() {
        First firstC;
        Long l;
        th00 th00Var = this.d;
        ig00 ig00Var = th00Var.b;
        long j = jg00.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        vf00 vf00Var = new vf00(ig00Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mf00.class), runSequentially.a(vf00Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wf00(ig00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xf00(ig00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dg00(ig00Var)));
        uo5 uo5Var = ig00Var.c;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eg00(new hg00(uo5Var, j, ig00Var.e, null))));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new ag00(new db3(uo5Var, ig00Var, ig00Var.d, (lnm) null, (byte) 1))));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fg00(ig00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bg00(new gg00(uo5Var, null, (byte) 0))));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yf00()));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rf00.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zf00(ig00Var)));
        MobiusLoop.Builder builderD = Mobius.d(oh00.a, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        mr20[] mr20VarArr = {new xy0(th00Var.a.a(), (byte) 29)};
        companion.getClass();
        b bVar = new b(fnsVar, mr20VarArr);
        mwm1 mwm1Var = th00Var.c;
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.G(0);
        hvm1VarQ.C(Integer.MAX_VALUE);
        hvm1VarQ.z(true);
        hvm1VarQ.L();
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.g);
        hvm1VarQ.u(jsm1VarR.build());
        gvm1VarO.q(hvm1VarQ.build());
        gvm1VarO.s(YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.o());
        gvm1VarO.t(100);
        MobiusLoop.Builder builderD2 = gvg.d("Live-Events-Hub", builderD.c(bVar, new EventSource[]{new b(fnsVar, new mr20[]{new p3t(yoi1.g(mwm1Var.b(gvm1VarO.build())), (byte) 17)}), new b(fnsVar, new mr20[]{this.X})}).b(ph00.a).d(qh00.a));
        Object objE = this.i.e();
        uod0 uod0Var = objE instanceof uod0 ? (uod0) objE : null;
        if (uod0Var == null) {
            uod0Var = this.g;
        }
        uod0 uod0Var2 = uod0Var;
        long jB = this.e.b();
        dsa0 dsa0Var = uod0Var2.c;
        if (u890.j(dsa0Var, lyb.c)) {
            dsa0Var = myb.c;
        }
        uod0 uod0VarA = uod0.a(uod0Var2, null, null, dsa0Var, null, null, null, false, null, false, null, 891);
        jf00 jf00Var = new jf00(uod0Var2.f);
        if (uod0Var2.a == null || uod0Var2.i || (l = uod0Var2.j) == null) {
            firstC = First.c(uod0.a(uod0VarA, null, null, null, null, null, null, false, null, true, null, 254), Effects.a(new o4o1[]{new tf00(uod0VarA.d, uod0VarA.e, uod0VarA.f), jf00Var}));
        } else {
            long jLongValue = jB - l.longValue();
            if (0 > jLongValue || jLongValue >= 1800000) {
                firstC = First.c(uod0.a(uod0VarA, null, null, null, null, null, null, false, null, true, null, 254), Effects.a(new o4o1[]{new tf00(uod0VarA.d, uod0VarA.e, uod0VarA.f), jf00Var}));
            } else {
                firstC = First.c(uod0VarA, Effects.a(new o4o1[]{jf00Var}));
            }
        }
        MobiusLoop mobiusLoopA = builderD2.a(firstC.d(), firstC.a());
        this.Z = mobiusLoopA.b(new y11(this, (byte) 10));
        this.Y = mobiusLoopA;
        j();
    }

    public final void f() {
        MobiusLoop mobiusLoop = this.Y;
        if (mobiusLoop == null) {
            u890.C("loop");
            throw null;
        }
        mobiusLoop.dispose();
        Disposable disposable = this.Z;
        if (disposable != null) {
            disposable.dispose();
        } else {
            u890.C("disposable");
            throw null;
        }
    }

    public final Bundle serialize() {
        rod0 rod0Var;
        int size;
        xod0 xod0Var = (xod0) this.i.e();
        if (xod0Var == null) {
            return mno1.g();
        }
        if (!(xod0Var instanceof uod0)) {
            return mno1.g();
        }
        uod0 uod0Var = (uod0) xod0Var;
        rod0 rod0Var2 = uod0Var.a;
        if (rod0Var2 != null && !uod0Var.i) {
            Iterator it = rod0Var2.b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (i <= 250) {
                        rod0Var = rod0Var2;
                        break;
                    }
                } else {
                    t3k1 t3k1Var = ((uf51) it.next()).c;
                    if (t3k1Var == null) {
                        size = 0;
                    } else {
                        List listM = o2p1.m(t3k1Var);
                        if (listM != null) {
                            Iterator it2 = listM.iterator();
                            size = 0;
                            while (it2.hasNext()) {
                                size += ((List) it2.next()).size();
                            }
                        }
                    }
                    i += size;
                }
                rod0Var = null;
                break;
            }
        }
        rod0Var = null;
        break;
        return mno1.h(new mmr0[]{new mmr0("state", new uqr0(uod0Var.b, uod0Var.d, uod0Var.e, new ArrayList(uod0Var.f), rod0Var, rod0Var != null ? uod0Var.j : null))});
    }
}
