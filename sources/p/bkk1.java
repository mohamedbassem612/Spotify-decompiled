package p;

import android.view.View;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bkk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkk1(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        x8c0 lifecycle;
        iac0 iac0Var;
        x8c0 lifecycle2;
        byte b = this.a;
        w8c0 w8c0VarB = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gj50 gj50Var = (gj50) obj;
                if (gj50Var.a) {
                    gj50Var.b.invoke(Boolean.FALSE);
                }
                gj50Var.a = false;
                return rih1Var;
            case 1:
                return ((jkk1) obj).o;
            case 2:
                return cwl1.H(((qa2) obj).b);
            case 3:
                ((iu30) ((pm70) obj).e).invoke(jpk1.a);
                return rih1Var;
            case 4:
                return Integer.valueOf(((s271) obj).a.size());
            case 5:
                ((r4l1) obj).a.onNext(j5.a);
                return rih1Var;
            case 6:
                return ((bbr0) ((ohr) obj).b).b0(bn70.class);
            case 7:
                m5l1 m5l1Var = (m5l1) obj;
                luk lukVar = m5l1Var.b;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(m5l1Var, (byte) 20));
                }
                return null;
            case 8:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((l6l1) obj).a.g()) {
                    linkedHashMap.put(((j0i) ((kly0) entry.getValue()).get()).b(), (String) entry.getKey());
                }
                return linkedHashMap;
            case 9:
                q7l1 q7l1Var = (q7l1) obj;
                bvq bvqVar = q7l1Var.b;
                bpb1 bpb1Var = q7l1Var.c;
                yjq yjqVar = (yjq) bvqVar.a.c;
                lzn0 lzn0Var = (lzn0) ((jbq) yjqVar.d).b.i.get();
                c8o.l(lzn0Var);
                d0r d0rVar = ((obt) yjqVar.e).a;
                qop qopVar = (qop) yjqVar.c;
                return new xzq(new n0o(lzn0Var, d0rVar, qopVar.d(), (ttq) yjqVar.f, qopVar.b(), bpb1Var), v5l1.N0);
            case 10:
                fq10 fq10Var = (fq10) obj;
                int i = fq10Var.a + 1;
                fq10Var.a = i;
                fq10Var.b.onNext(Integer.valueOf(i));
                return rih1Var;
            case 11:
                ((hcl1) obj).c.l((Object) null);
                return rih1Var;
            case 12:
                gal1 gal1Var = (gal1) obj;
                luk lukVar2 = gal1Var.e;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(gal1Var, (byte) 21));
                }
                return null;
            case 13:
                wal1 wal1Var = (wal1) obj;
                xal1 xal1Var = wal1Var.b;
                iac0 iac0VarH = x9p1.h(wal1Var.a.a);
                tac0 tac0Var = xal1Var.a;
                w8c0 w8c0Var = tac0Var.i;
                w8c0 w8c0Var2 = w8c0.a;
                if (w8c0Var != w8c0Var2) {
                    ek2 ek2Var = xal1Var.c;
                    if (iac0VarH != null && iac0VarH != (iac0Var = xal1Var.b)) {
                        if (iac0Var != null && (lifecycle2 = iac0Var.getLifecycle()) != null) {
                            lifecycle2.d(ek2Var);
                        }
                        xal1Var.b = iac0VarH;
                        iac0VarH.getLifecycle().a(ek2Var);
                    }
                    if (iac0VarH != null && (lifecycle = iac0VarH.getLifecycle()) != null) {
                        w8c0VarB = lifecycle.b();
                    }
                    if (w8c0VarB == w8c0Var2) {
                        xal1Var.a();
                    } else {
                        tac0Var.i(w8c0.e);
                    }
                }
                return rih1Var;
            case 14:
                m0i1 m0i1Var = (m0i1) obj;
                nrd nrdVar = (nrd) m0i1Var.d;
                if (nrdVar == null) {
                    u890.C("stickyLocalBroadcastManager");
                    throw null;
                }
                aia aiaVar = (aia) m0i1Var.e;
                if (aiaVar == null) {
                    u890.C("broadcastReceiver");
                    throw null;
                }
                ((zce0) nrdVar.a.c).d(aiaVar);
                yfl1 yfl1Var = (yfl1) m0i1Var.c;
                if (yfl1Var != null) {
                    yfl1Var.a();
                    return rih1Var;
                }
                u890.C("wazeSdkManager");
                throw null;
            case 15:
                return (dil1) ((RetrofitMaker) obj).createWebgateService(dil1.class, "android-pagematch-endpoint");
            case 16:
                return (i8h1) ((mml1) obj).a.get();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                lbq lbqVar = (lbq) ((evq) ((z2y0) obj).f).a.b;
                a1r0 a1r0Var = (a1r0) ((lzp) lbqVar.b).a.V0.get();
                c8o.l(a1r0Var);
                lzp lzpVar = (lzp) lbqVar.b;
                iz31 iz31Var = (iz31) lzpVar.a.zg.get();
                c8o.l(iz31Var);
                x1i1 x1i1Var = (x1i1) lzpVar.a.F6.get();
                c8o.l(x1i1Var);
                return new kpg0(new suh1(a1r0Var, iz31Var, x1i1Var), owl1.f);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return w0h1.h(((jyl1) obj).j);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new kpg0(((mzl1) obj).d, owl1.N0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new kpg0(((k5m1) obj).c, owl1.a1);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return v8r.q(Boolean.valueOf(((d5m1) obj).a));
            case 22:
                return new laa1((n5m1) obj);
            case 23:
                return new kpg0((xpw) ((w5m1) obj).b.get(), m5m1.e);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new kpg0((xpw) ((w7m1) obj).b.get(), m5m1.V0);
            case 25:
                return new kpg0((xpw) ((hbm1) obj).a.get(), gbm1.b);
            case 26:
                return new xv81((lna0) obj);
            case 27:
                bvm bvmVar = (bvm) obj;
                return new kpg0((xpw) ((hsq) bvmVar.d).get(), new c4m1(bvmVar, (byte) 9));
            case 28:
                return ((View) ((idd1) ((p1f0) obj).a).getValue()).findViewById(2131431735);
            default:
                krm1 krm1Var = new krm1();
                krm1Var.V1 = (th30) ((h5a1) obj).b;
                return krm1Var;
        }
    }
}
