package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Connectable;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zf10 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf10(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        byte b;
        goj0 goj0VarA;
        l1z l1zVar;
        byte b2 = 20;
        byte b3 = 11;
        switch (this.a) {
            case 0:
                ((hzc) ((t7y) this.b).c).a.put(Integer.valueOf(z5c.c(1)), new q1f0((s1f0) obj, (sf10) this.c));
                return rih1.a;
            case 1:
                p5t0 p5t0Var = (p5t0) obj;
                if (((Number) ((o95) this.b).e()).floatValue() > 0.0f) {
                    p5t0Var.k((q5t0) this.c, 0, 0, 0.0f);
                }
                return rih1.a;
            case 2:
                return new hp0(((los) ((pt) this.b).h).c(new v2y((iu30) this.c, (byte) 22)), (byte) 6);
            case 3:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.g;
                shl shlVar = (shl) this.b;
                yf.p(ubeVar, shlVar, 0.0f, 6);
                yf.p(dhlVar.e, shlVar, 0.0f, 6);
                xid xidVar = dhlVar.f;
                thl thlVar = (thl) this.c;
                xid.r(xidVar, thlVar, 0.0f, 6);
                xid.r(dhlVar.d, thlVar, 0.0f, 6);
                return rih1.a;
            case 4:
                ek2 ek2Var = new ek2((mr10) this.c, (byte) 9);
                iac0 iac0Var = (iac0) this.b;
                iac0Var.getLifecycle().a(ek2Var);
                return new ht0(iac0Var, ek2Var, (byte) 20);
            case 5:
                ts10 ts10Var = (ts10) this.b;
                zf30 zf30VarM0 = ts10Var.m0(true);
                if (zf30VarM0 != null) {
                    ui30 ui30Var = vi30.a;
                    vi30.b(new GetTargetFragmentRequestCodeUsageViolation("Attempting to get target request code from fragment " + ts10Var, ts10Var));
                    vi30.a(ts10Var).getClass();
                    zf30VarM0.u0(((zf30) ts10Var).i, 1, (Intent) null);
                }
                yge0 yge0Var = ts10Var.Y1;
                if (yge0Var == null) {
                    u890.C("optOutEventLogger");
                    throw null;
                }
                String str = ts10Var.Z1;
                if (str == null) {
                    u890.C("artistUri");
                    throw null;
                }
                String str2 = ts10Var.a2;
                if (str2 == null) {
                    u890.C("lineItemId");
                    throw null;
                }
                yge0Var.j("optout_cancel", "", str, str2);
                ((rs10) this.c).dismiss();
                return rih1.a;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    ((iu30) this.b).invoke(((ya20) this.c).a);
                }
                return rih1.a;
            case 7:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, (Object) null, qoi.a, 3);
                b920 b920Var = (b920) this.b;
                List list = b920Var.a;
                rtb0Var.e(list.size(), new f1m(list, (byte) 27), new f1m(list, (byte) 28), new j2i(802480018, new rf1(list, b920Var, (iu30) this.c, b3), true));
                rtb0.c(rtb0Var, (Object) null, qoi.b, 3);
                return rih1.a;
            case 8:
                m920 m920Var = (m920) this.b;
                ArrayList arrayList = m920Var.a;
                ((rtb0) obj).e(arrayList.size(), (iu30) null, new ry4(arrayList, (byte) 24), new j2i(2039820996, new rf1((List) arrayList, (Object) m920Var, (iu30) this.c, (byte) 12), true));
                return rih1.a;
            case 9:
                return new ht0((HashMap) this.b, (ee21) this.c, (byte) 21);
            case 10:
                if (((eg20) obj) == eg20.a) {
                    ((lzn0) ((rt01) this.c).c).h(((gg20) this.b).b.a);
                    return rih1.a;
                }
                eg.o();
                return null;
            case 11:
                d0r d0rVar = (d0r) obj;
                sh20 sh20Var = (sh20) this.b;
                xzq xzqVar = new xzq(sh20Var.f.a(d0rVar, new ult0((k0d0) this.c)), vd20.h);
                xzq xzqVar2 = new xzq(new hho(d0rVar), vd20.f);
                xzq xzqVar3 = new xzq(t1p.b(sh20Var.i, d0rVar, (q8n) null, 4), vd20.g);
                s1p s1pVar = sh20Var.j;
                fns fnsVar = igu.a;
                return sh20Var.d.a(d0rVar, new ls11(new ds11(xzqVar2), new ds11(xzqVar3), new ds11(new xzq(s1pVar.a(fnsVar, d0rVar), vd20.i)), new ds11(new xzq(sh20Var.k.a(fnsVar, d0rVar), vd20.e)), new hvy(xzqVar, (byte) 3), (iu30) null, (qrk) null, (iu30) null, (iu30) null, sh20Var.m.a(false), b610.Q0, 1, (o27) null, (gye1) null, npc1.a, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, n39.a(sh20Var.e, false, 15), (o3r) null, (cv11) null, (y5z) null, (bnw0) null, (bt11) null, 1, (o3r) null, -33574432, 495), (nu11) null);
            case 12:
                List list2 = ((wsc0) obj).e;
                String str3 = (String) this.b;
                if (str3.length() == 0 && list2.isEmpty()) {
                    return new vh20(str3, ber0.a);
                }
                if (list2.isEmpty()) {
                    return new vh20(str3, pdr0.a);
                }
                List<zuc0> list3 = list2;
                sp00 sp00Var = (sp00) this.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (zuc0 zuc0Var : list3) {
                    arrayList2.add(new yx31(zuc0Var.c, zuc0Var.a, (String) sp00Var.d));
                }
                return new vh20(str3, new vdr0(arrayList2));
            case 13:
                rtb0 rtb0Var2 = (rtb0) obj;
                pbq pbqVar = (pbq) this.c;
                if (((Boolean) ((tob1) this.b).getValue()).booleanValue()) {
                    b = 2;
                    rtb0.c(rtb0Var2, "header_element", new j2i(344309692, new el20(pbqVar, (byte) 0), true), 2);
                } else {
                    b = 2;
                }
                rtb0.c(rtb0Var2, "default_save_destination_element", new j2i(1888233889, new el20(pbqVar, (byte) 1), true), b);
                rtb0.c(rtb0Var2, "create_playlist_element", new j2i(-480635752, new el20(pbqVar, b), true), b);
                return rih1.a;
            case 14:
                o4o1.o((y2s) obj, (kdn0) ((b14) this.b).d, new gi00((ug3) this.c, b2));
                return rih1.a;
            case 15:
                if (!((is20) this.b).f) {
                    is20 is20Var = (is20) this.b;
                    is20Var.e = obj;
                    is20Var.b(((js20) this.c).c.invoke(is20Var.d, obj));
                }
                return rih1.a;
            case 16:
                p130 p130Var = (p130) this.b;
                zzr zzrVar = p130Var.d;
                cir0 cir0Var = (cir0) this.c;
                zzrVar.getClass();
                wzr wzrVar = new wzr(don1.p((Context) obj), zzrVar.a, cir0Var, zzrVar.d, zzrVar.f, new r1k(new Connectable[]{zzrVar.c, zzrVar.b, new x2y(zzrVar.e, xzr.b, yzr.a, (byte) 1)}, (byte) 0), zzrVar.g, zzrVar.h);
                vhp vhpVar = p130Var.e;
                k8m0 k8m0Var = p130Var.c;
                fip fipVar = (fip) vhpVar.a.c;
                return new vzr((ab20) fipVar.E.get(), (whp) fipVar.k0.get(), k8m0Var, wzrVar);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((iu30) this.b).invoke(((kq61) this.c).b);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((vu30) this.b).invoke((kq61) this.c, (String) obj);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String str4 = (String) obj;
                dg30 dg30Var = (dg30) this.b;
                t2j0 t2j0Var = (t2j0) this.c;
                hl00 hl00Var = new hl00();
                rl1 rl1Var = (rl1) hl00Var.b;
                if (rl1.f == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    rl1.f = handlerThread;
                    handlerThread.start();
                    rl1.g = new Handler(rl1.f.getLooper());
                }
                for (int i = 0; i <= 8; i++) {
                    SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) rl1Var.c;
                    if (sparseIntArrayArr[i] == null && ((rl1Var.b ? 1 : 0) & (1 << i)) != 0) {
                        sparseIntArrayArr[i] = new SparseIntArray();
                    }
                }
                dg30Var.getWindow().addOnFrameMetricsAvailableListener((yj30) rl1Var.e, rl1.g);
                ((ArrayList) rl1Var.d).add(new WeakReference(dg30Var));
                return new g931(hl00Var, str4, t2j0Var, (byte) 13);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ro30 ro30Var = (ro30) this.b;
                ((err0) ro30Var.c).t((int) (((elb0) obj).b() & 4294967295L));
                ((iu30) this.c).invoke(new l160(((err0) ro30Var.c).s(), 0, 2));
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((qtr) obj).b(new jaz((y5v0) this.b, (lzn0) this.c, (lnm) null));
                return rih1.a;
            case 22:
                ioj0 ioj0Var = (ioj0) obj;
                String str5 = (String) o7h.r0(ioj0Var.a.b());
                hoj0 hoj0VarC = ioj0Var.c(l1z.class, str5 != null ? str5 : "");
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (l1zVar = (l1z) goj0VarA.a) != null) {
                    return new kdn0(new o640(!l1zVar.b, (String) null));
                }
                lc20 lc20Var = (lc20) this.b;
                String str6 = (String) this.c;
                return new soy0(((uu00) lc20Var.c).b(new oi("gated-content-banner-state-source", false, new kq00(str6, (byte) 23))).filter(o610.d).map(new ljp1(str6, (byte) 11)).toFlowable(BackpressureStrategy.d));
            case 23:
                rtb0 rtb0Var3 = (rtb0) obj;
                ic40 ic40Var = (ic40) this.b;
                iu30 iu30Var = (iu30) this.c;
                rtb0.c(rtb0Var3, (Object) null, new j2i(1164881319, new adx(ic40Var, iu30Var, (byte) 4), true), 3);
                rtb0.c(rtb0Var3, (Object) null, gqi.b, 3);
                ArrayList arrayList3 = ic40Var.i;
                rtb0Var3.e(arrayList3.size(), (iu30) null, new ry4(arrayList3, (byte) 25), new j2i(2039820996, new lmi(arrayList3, iu30Var, (byte) 2), true));
                rtb0.c(rtb0Var3, (Object) null, new j2i(-1081818257, new cex(iu30Var, ic40Var, (byte) 15), true), 3);
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((lzn0) ((sh40) this.b).e).a(((dhm) this.c).c, (tv80) obj, (Bundle) null);
                return rih1.a;
            case 25:
                zfx zfxVar = (zfx) this.b;
                ai4 ai4VarG0 = ((a49) this.c).b.g0();
                wfx wfxVar = zfxVar.b;
                return new h98(wfxVar.b, wfxVar.a, ai4VarG0, (byte) 9);
            case 26:
                qn40 qn40Var = (qn40) this.b;
                return qn40Var.d.I(qn40Var.a.getContext(), (Uri) this.c);
            case 27:
                rih1 rih1Var = rih1.a;
                if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
                    ((bbc) this.c).l(rih1Var);
                }
                return rih1Var;
            case 28:
                ((lzn0) ((dh30) this.b).b).a((String) this.c, (tv80) obj, (Bundle) null);
                return rih1.a;
            default:
                ((xy40) this.b).a.a((String) this.c, (tv80) obj, (Bundle) null);
                return rih1.a;
        }
    }
}
