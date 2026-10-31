package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dlp implements jly0 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dlp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public static /* bridge */ /* synthetic */ iqp a(dlp dlpVar) {
        return (iqp) dlpVar.c;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                qjp qjpVar = (qjp) obj;
                if (!z) {
                    return new qmc1((dlp) qjpVar.c, new h7l0((byte) 7));
                }
                if (z) {
                    return u1n0.z((q7r0) qjpVar.b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 1:
                qjp qjpVar2 = (qjp) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) qjpVar2.b);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                dlp dlpVar = (dlp) qjpVar2.c;
                ksk0 ksk0Var = new ksk0((byte) 9);
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = new r6h1(new ArrayList(), ksk0.n);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-gen-alpha-kid-account-transition-consent";
                x6h1VarI.f = "3.2.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("kid-account-transition/consent");
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA);
                return new shg1(dlpVar, ksk0Var, new b7l0(new r6h1(arrayList, r6h1Var2.b)));
            case 2:
                j1b0 j1b0Var = (j1b0) ((t7p) obj).b;
                if (!z) {
                    return new elp(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                lzn0 lzn0Var = (lzn0) j1b0Var.a.get();
                c8o.l(lzn0Var);
                p1b0 p1b0Var = (p1b0) j1b0Var.e.get();
                c8o.l(p1b0Var);
                x390 x390Var = new x390(p1b0Var, lzn0Var, (byte) 14);
                Scheduler scheduler = (Scheduler) j1b0Var.f.get();
                c8o.l(scheduler);
                o9h o9hVar = new o9h(x390Var, scheduler);
                Scheduler scheduler2 = (Scheduler) j1b0Var.f.get();
                c8o.l(scheduler2);
                Scheduler scheduler3 = (Scheduler) j1b0Var.g.get();
                c8o.l(scheduler3);
                return new u9h(o9hVar, scheduler2, scheduler3);
            case 3:
                qjp qjpVar3 = (qjp) obj;
                if (!z) {
                    i8h1 i8h1Var = (i8h1) ((zsj0) qjpVar3.b).a.get();
                    c8o.l(i8h1Var);
                    return new o3n0(i8h1Var, (zbl0) ((jly0) qjpVar3.a).get());
                }
                if (z) {
                    r6h1 r6h1Var4 = r6h1.c;
                    return new zbl0();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 4:
                t7p t7pVar = (t7p) obj;
                q7r0 q7r0Var = (q7r0) t7pVar.c;
                if (z) {
                    if (z) {
                        return cwl1.C(q7r0Var);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                s6q s6qVar = (s6q) ((pag1) t7pVar.b).c.get();
                c8o.l(s6qVar);
                iac0 iac0Var = q7r0Var.d.c;
                c8o.m(iac0Var);
                return s6qVar.a(iac0Var);
            case 5:
                qjp qjpVar4 = (qjp) obj;
                if (!z) {
                    i8h1 i8h1Var2 = (i8h1) ((rcb0) qjpVar4.b).h.get();
                    c8o.l(i8h1Var2);
                    return new o3n0(i8h1Var2, (zbl0) ((jly0) qjpVar4.a).get());
                }
                if (z) {
                    r6h1 r6h1Var5 = r6h1.c;
                    return new zbl0();
                }
                jah.e(z ? 1 : 0);
                return null;
            case 6:
                qjp qjpVar5 = (qjp) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) qjpVar5.b);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                dlp dlpVar2 = (dlp) qjpVar5.c;
                h7l0 h7l0Var = new h7l0((byte) 3);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-gen-alpha-kid-account-creation-legal-consent";
                x6h1VarI2.f = "4.1.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                p7h.M(new String[]{"kid-account-creation/legal-consent", "kid-account-transition/legal-consent"});
                r6h1 r6h1Var6 = r6h1.c;
                return new k2c0(dlpVar2, h7l0Var, new b7l0(new r6h1(kk0.l(y6h1VarA2), (u8h1) null)));
            case 7:
                t7p t7pVar2 = (t7p) obj;
                b1q b1qVar = (b1q) t7pVar2.b;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    Context context = (Context) b1qVar.b.x1.a;
                    c8o.l(context);
                    String str = ((qop) t7pVar2.c).e;
                    c8o.l(str);
                    return t4c0.b(context, str);
                }
                RetrofitMaker retrofitMaker = (RetrofitMaker) b1qVar.b.Y3.get();
                c8o.l(retrofitMaker);
                dpd1 dpd1Var = (dpd1) retrofitMaker.createWebgateService(dpd1.class, "android-list-ux-platform-consumers-likedsongs-filter-tags");
                bf20 bf20VarU = ((FilterTagsDatabase) ((jly0) t7pVar2.a).get()).u();
                c8o.m(bf20VarU);
                q8n q8nVar = (q8n) b1qVar.b.E1.get();
                c8o.l(q8nVar);
                return new ff20(dpd1Var, bf20VarU, q8nVar);
            case 8:
                if (!z) {
                    return new oop(this);
                }
                if (z) {
                    return new pop((byte) 0);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 9:
                k3d0 k3d0Var = (k3d0) ((qjp) obj).b;
                if (!z) {
                    return pzm.h((mos) k3d0Var.e.get());
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                a8e0 a8e0VarA = k3d0Var.a();
                c8o.l(a8e0VarA);
                gw70 gw70VarB = k3d0Var.b();
                c8o.l(gw70VarB);
                pe peVarH = k3d0Var.h();
                c8o.l(peVarH);
                c8o.l(k3d0Var.f());
                return new hvj(a8e0VarA, new q3b1(gw70VarB, peVarH));
            case 10:
                if (!z) {
                    return cwl1.C((q7r0) ((t7p) obj).c);
                }
                if (z) {
                    return new bqp(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 11:
                dj5 dj5Var = ((iqp) obj).a;
                if (!z) {
                    return new hqp(this);
                }
                if (z) {
                    return new t6b1((Context) dj5Var.a.get(), (yqg) dj5Var.b.get(), new hdn1((ajg) dj5Var.l.get()), (pjm1) dj5Var.c.get(), dj5Var.k(), new m6k0((xye1) dj5Var.o.get(), (byte) 10), (gtk1) dj5Var.e.get(), new po4(15, (luk) dj5Var.q.get(), true, false), (lxg) dj5Var.f.get(), (f5u) dj5Var.g.get(), uge0.B(dj5Var.g()), (ut71) dj5Var.h.get(), (zn41) dj5Var.i.get(), dj5Var.i());
                }
                jah.e(z ? 1 : 0);
                return null;
            case 12:
                g1i g1iVar = (g1i) obj;
                uct uctVar = (uct) g1iVar.c;
                if (!z) {
                    return new oie0((tso) g1iVar.b, (whe0) uctVar.f.get(), new l6s((ut71) uctVar.b.get(), (Context) uctVar.a.get(), (mr20) uctVar.c.get()), new boe0((dlp) g1iVar.e));
                }
                if (z) {
                    return u1n0.z((q7r0) g1iVar.d);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 13:
                sse0 sse0Var = (sse0) ((qjp) obj).b;
                if (!z) {
                    oq oqVar = (oq) sse0Var.a.get();
                    c8o.l(oqVar);
                    return oqVar;
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                t3f0 t3f0Var = (t3f0) sse0Var.b.get();
                c8o.l(t3f0Var);
                return t3f0Var;
            case 14:
                qjp qjpVar6 = (qjp) obj;
                if (!z) {
                    dlp dlpVar3 = (dlp) qjpVar6.c;
                    r6h1 r6h1Var7 = r6h1.c;
                    return new iye0(dlpVar3, new yok0((byte) 14));
                }
                if (z) {
                    return u1n0.z((q7r0) qjpVar6.b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 15:
                if (!z) {
                    return new jqp(this, (byte) 0);
                }
                if (z) {
                    return u1n0.z((q7r0) ((t7p) obj).c);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 16:
                t7p t7pVar3 = (t7p) obj;
                if (!z) {
                    return new cpf0((pqp) ((jly0) t7pVar3.a).get(), (epf0) t7pVar3.c);
                }
                if (z) {
                    return new pqp(this);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 17:
                if (!z) {
                    return new vqp();
                }
                if (z) {
                    return u1n0.z((q7r0) ((qjp) obj).b);
                }
                jah.e(z ? 1 : 0);
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (!z) {
                    return pzm.h((mos) ((cth0) ((qjp) obj).b).f.get());
                }
                if (z) {
                    return new ysh0();
                }
                jah.e(z ? 1 : 0);
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                qjp qjpVar7 = (qjp) obj;
                if (!z) {
                    zhh1 zhh1Var = (zhh1) ((ipi0) qjpVar7.b).g.get();
                    c8o.l(zhh1Var);
                    return new lwf(zhh1Var, (wen0) ((jly0) qjpVar7.a).get());
                }
                if (z) {
                    return gio1.b(vwf.a);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 20:
                qjp qjpVar8 = (qjp) obj;
                g2z g2zVar = (g2z) qjpVar8.b;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    yqg yqgVar = (yqg) g2zVar.c;
                    c8o.l(yqgVar);
                    return yqgVar;
                }
                Context context2 = (Context) g2zVar.a;
                c8o.l(context2);
                yqg yqgVar2 = (yqg) ((dlp) qjpVar8.c).get();
                t2j0 t2j0Var = (t2j0) g2zVar.d;
                c8o.l(t2j0Var);
                yqg yqgVar3 = (yqg) ((dlp) qjpVar8.c).get();
                dma1 dma1Var = (dma1) g2zVar.f;
                c8o.l(dma1Var);
                v1k v1kVar = new v1k(t2j0Var, dma1Var, yqgVar3, (byte) 23);
                Flowable flowable = (Flowable) g2zVar.e;
                c8o.l(flowable);
                Scheduler scheduler4 = (Scheduler) g2zVar.b;
                c8o.l(scheduler4);
                return new znm(context2, yqgVar2, v1kVar, flowable, scheduler4);
            case 21:
                if (!z) {
                    return new l7p(this, (byte) 1);
                }
                if (z) {
                    return new h0p(this, (byte) 1);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 22:
                dj5 dj5Var2 = ((etp) obj).a;
                if (!z) {
                    return (woa) dj5Var2.c.get();
                }
                if (z) {
                    return ((ekp) dj5Var2.e.get()).a(new File(((Context) dj5Var2.a.get()).getCacheDir(), "multiplayer-betamax-cache"), 209715200L);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 23:
                if (!z) {
                    return new utp(this);
                }
                if (z) {
                    return new vtp(this, (byte) 0);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 24:
                if (!z) {
                    return new xtp(this);
                }
                if (z) {
                    return new vtp(this, (byte) 1);
                }
                jah.e(z ? 1 : 0);
                return null;
            case 25:
                k9k k9kVar = (k9k) obj;
                t2q t2qVar = (t2q) k9kVar.d;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    stk stkVar = (stk) t2qVar.a.a.h3.get();
                    c8o.l(stkVar);
                    return stkVar;
                }
                jbt jbtVar = (jbt) k9kVar.b;
                d0r d0rVar = jbtVar.b;
                String strD = ((qop) k9kVar.c).d();
                koc0 koc0Var = jbtVar.d;
                ynb0 ynb0VarA = xqu.a((dlp) k9kVar.e);
                q8n q8nVar2 = (q8n) t2qVar.a.E1.get();
                c8o.l(q8nVar2);
                return new rm0(new fdc(d0rVar, strD, koc0Var, ynb0VarA, q8nVar2));
            case 26:
                bsq0 bsq0Var = (bsq0) ((qqp) obj).d;
                if (!z) {
                    return new dxp(this);
                }
                if (!z) {
                    jah.e(z ? 1 : 0);
                    return null;
                }
                six0 six0Var = (six0) bsq0Var.f.get();
                c8o.l(six0Var);
                q6q q6qVar = (q6q) bsq0Var.i.get();
                c8o.l(q6qVar);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new e5b0(30, p7h.M(new qua0[]{six0.b(six0Var, yon1.G1("PAGE_MATCH_OUTBOUND_SCANNING", "page-match/outbound-scanning", 1395, "page-match"), 2), q6qVar.a(yon1.G1("PAGE_MATCH_OUTBOUND_SCANNING", "page-match/outbound-scanning", 1395, "page-match"))}), (List) null);
            case 27:
                wtp wtpVar = (wtp) obj;
                if (z) {
                    if (z) {
                        return u1n0.z((q7r0) wtpVar.d);
                    }
                    jah.e(z ? 1 : 0);
                    return null;
                }
                dlp dlpVar4 = (dlp) wtpVar.c;
                urk0 urk0Var = new urk0((byte) 2);
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-gen-alpha-kid-account-creation-education";
                x6h1VarI3.f = "3.1.0";
                x6h1VarI3.g = "22.0.0";
                y6h1 y6h1VarA3 = x6h1VarI3.a();
                p7h.M(new String[]{"kid-account-creation/education", "kid-account-transition/education"});
                r6h1 r6h1Var8 = r6h1.c;
                dlg1 dlg1VarS = b3o1.s();
                dlg1VarS.s(y6h1VarA3);
                return new str0(dlpVar4, urk0Var, new b7l0(dlg1VarS.f()));
            case 28:
                k9k k9kVar2 = (k9k) obj;
                if (!z) {
                    dlp dlpVar5 = (dlp) k9kVar2.e;
                    r6h1 r6h1Var9 = r6h1.c;
                    return new qp5(dlpVar5, new rrk0((byte) 9));
                }
                if (z) {
                    return u1n0.z((q7r0) k9kVar2.c);
                }
                jah.e(z ? 1 : 0);
                return null;
            default:
                rbs0 rbs0Var = (rbs0) ((wtp) obj).d;
                if (z) {
                    if (!z) {
                        jah.e(z ? 1 : 0);
                        return null;
                    }
                    gw70 gw70Var = (gw70) rbs0Var.d.get();
                    c8o.l(gw70Var);
                    return gw70Var;
                }
                lbs0 lbs0Var = (lbs0) rbs0Var.a.get();
                c8o.l(lbs0Var);
                Scheduler scheduler5 = (Scheduler) rbs0Var.c.get();
                c8o.l(scheduler5);
                Scheduler scheduler6 = (Scheduler) rbs0Var.b.get();
                c8o.l(scheduler6);
                return new qlk1(lbs0Var, scheduler5, scheduler6);
        }
    }
}
