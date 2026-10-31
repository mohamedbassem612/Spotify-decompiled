package p;

import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;
import com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pdp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdp0(pt ptVar, kmp0 kmp0Var) {
        super(0);
        this.a = (byte) 3;
        this.b = kmp0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new fkm1(new cw4(true, (xz11) ((hbp0) obj).invoke()));
            case 1:
                int next = ((BreakIterator) obj).next();
                Integer numValueOf = Integer.valueOf(next);
                if (next != -1) {
                    return numValueOf;
                }
                return null;
            case 2:
                tgp0 tgp0Var = (tgp0) obj;
                return tgp0Var.b.a().startWith(Observable.just(yz11.a)).filter(een.n1).map(new tym0(tgp0Var, (byte) 10)).replay(1).f();
            case 3:
                String str = ((kmp0) obj).d.a.a.a.a;
                return rih1Var;
            case 4:
                return new kpg0((pt) ((yfc0) obj).b, mmp0.b);
            case 5:
                e93 e93Var = (e93) ((drj0) obj).b;
                LinkedHashSet linkedHashSetY0 = dm61.y0(f46.S0(new g471[]{(gv91) e93Var.b, (olc0) e93Var.c, (dg10) e93Var.d, (dg10) e93Var.e, (jf10) e93Var.f, (dg10) e93Var.g, (df10) e93Var.h, (jf10) e93Var.i, (hn80) e93Var.t, (olc0) e93Var.X, (jf10) e93Var.Y, (fq91) e93Var.Z, (j4n) e93Var.N0, (jru) e93Var.O0, (bkm0) e93Var.P0, (olc0) e93Var.Q0, (yje1) e93Var.R0, (df10) e93Var.S0, (jf10) e93Var.T0, (hn80) e93Var.U0, (olc0) e93Var.V0}), w7x.a);
                int iS = zno1.s(q7h.U(linkedHashSetY0, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : linkedHashSetY0) {
                    linkedHashMap.put(((g471) obj2).a(), obj2);
                }
                return linkedHashMap;
            case 6:
                return new kpg0((res) ((j1b) obj).e, mmp0.g);
            case 7:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new iuk0(yon1.n0().c, ((lik1) ((res) obj).d).a);
            case 8:
                return new kpg0((xpw) ((xrp) ((fb3) obj).c).get(), mmp0.i);
            case 9:
                return new kpg0((xpw) ((app0) obj).b.get(), mmp0.N0);
            case 10:
                return new kpg0(((mpp0) obj).a, mmp0.P0);
            case 11:
                return new cx0((l1b) obj, (char) 0);
            case 12:
                return new nu((doe) obj, (char) 0);
            case 13:
                return new cx0((foe) obj, (byte) 0);
            case 14:
                return (iuj) ((kly0) ((avp0) obj).b).get();
            case 15:
                jbi0 jbi0Var = (jbi0) obj;
                return new bs0(new nfx(((xfx) jbi0Var.c).b, (i3h) jbi0Var.h, (byte) 2), (lo60) jbi0Var.g, (vgm) jbi0Var.f);
            case 16:
                return Long.valueOf(((OfflineSyncWorker) obj).r.a.a.e());
            case 17:
                yyp0 yyp0Var = (yyp0) obj;
                List list = yyp0Var.b;
                boolean zIsEmpty = list.isEmpty();
                azp0 azp0Var = yyp0Var.a;
                if (!zIsEmpty) {
                    zyp0 zyp0VarB = azp0Var.b();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((iu30) it.next()).invoke(zyp0VarB);
                    }
                    azp0Var = new azp0(zyp0VarB);
                }
                return (yyp0Var.c.size() == 0 && yyp0Var.d.isEmpty()) ? azp0Var : new jo21(azp0Var, new v87(yyp0Var, (byte) 3), (byte) 0);
            case 18:
                y4m y4mVar = ((q0q0) obj).c;
                w4m w4mVar = y4mVar instanceof w4m ? (w4m) y4mVar : null;
                if (w4mVar != null) {
                    return w4mVar.a;
                }
                return null;
            case 19:
                return lyg.w(((u3q0) obj).b);
            case 20:
                return lyg.w(((u4q0) obj).e);
            case 21:
                lur lurVar = (lur) ((wo5) obj).b;
                lurVar.e.a(m5n1.o(((art) lurVar.b.get()).a, new String[]{"DeviceLastConnection"}, new qrk((byte) 14)).firstElement().j(lurVar.d).subscribe(new yrh(lurVar, (byte) 19)));
                return rih1Var;
            case 22:
                return new kpg0((rwj) ((jxp0) obj).b, cwp0.V0);
            case 23:
                return (p1r0) ((kly0) ((toj0) obj).g).get();
            case 24:
                return Boolean.valueOf(((hhp0) ((km0) obj).c).g(oif1.d));
            case 25:
                return new SchedulerWorkRunner((Scheduler) ((ng20) obj).b);
            case 26:
                ((OutputSwitcherJamLauncherActivity) obj).finish();
                return rih1Var;
            case 27:
                ((juq0) ((km0) obj).c).a();
                return rih1Var;
            case 28:
                yvq0 yvq0Var = (yvq0) obj;
                syn0 syn0Var = yvq0Var.i;
                son0 son0VarA = syn0Var.a(tyn0.a);
                try {
                    yvq0Var.b.d();
                    lwq0.b(yvq0Var.e.a().e);
                    return rih1Var;
                } finally {
                    syn0Var.e(son0VarA);
                }
            default:
                cwq0 cwq0Var = (cwq0) obj;
                awq0 awq0Var = cwq0Var.a;
                c380 c380Var = (c380) awq0Var.a().c.getValue();
                czn0 czn0Var = cwq0Var.c;
                yun0 yun0Var = cwq0Var.d;
                xxn0 xxn0VarC = yun0Var.c();
                bwq0 bwq0Var = bwq0.a;
                czn0Var.getClass();
                if (czn0.a(xxn0VarC, c380Var, bwq0Var).a == 4) {
                    yun0Var.b(yun0Var.m());
                    yun0Var.o((xun0) null);
                }
                lwq0.a(awq0Var.a().e);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdp0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
