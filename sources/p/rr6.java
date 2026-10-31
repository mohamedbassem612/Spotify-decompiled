package p;

import android.graphics.Rect;
import android.media.AudioDeviceInfo;
import android.view.View;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rr6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr6(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        tv11 tv11Var;
        zuc0 zuc0Var;
        zuc0 zuc0Var2;
        x4i1 x4i1Var;
        zuc0 zuc0Var3;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 1;
        rih1 rih1Var = rih1.a;
        ?? r6 = 0;
        r6 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((sr6) obj2).d;
            case 1:
                ((mw6) obj2).b();
                return rih1Var;
            case 2:
                return ((zfx) ((dx0) obj2).d).a((l0i) null);
            case 3:
                wfx wfxVar = ((px6) obj2).b.c;
                return new nwr(wfxVar.b, wfxVar.a, (byte) 1);
            case 4:
                lx6 lx6Var = (lx6) obj;
                boolean z2 = lx6Var.e;
                boolean z3 = lx6Var.f;
                di4 di4Var = (di4) ((dx0) obj2).d;
                return f5p1.i(z2, z3, di4Var.b(), di4Var.O());
            case 5:
                return ((pp) ((rt01) obj2).d).a(null);
            case 6:
                jd6 jd6Var = (jd6) obj2;
                return d3p1.H((d0r) jd6Var.b, jd6Var.c, (dz6) obj);
            case 7:
                e37 e37Var = (e37) obj2;
                return d3p1.H(e37Var.a, e37Var.b, (w27) obj);
            case 8:
                ((Number) obj).intValue();
                return ((l77) obj2).b.k.b();
            case 9:
                ((Number) obj).intValue();
                ksk0 ksk0Var = ((i87) obj2).b;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("filters", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ksk0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA);
                return new r6h1(arrayList, r6h1Var2.b);
            case 10:
                return ((mc7) obj2).l((kc7) obj, false);
            case 11:
                yxo yxoVar = (yxo) ((zd7) obj2).d.a.c;
                return new ee7((i1p) yxoVar.Y0.get(), (f1p) yxoVar.c1.get(), (cir0) obj);
            case 12:
                voa voaVar = (voa) ((ne7) obj2).c.a.c;
                return new te7((i1p) ((jly0) voaVar.x).get(), (j1p) ((jly0) voaVar.D).get(), (cir0) obj);
            case 13:
                jen0 jen0Var = (jen0) obj;
                xl7 xl7Var = (xl7) obj2;
                View view = xl7Var.d;
                if (view != null) {
                    jen0Var.a(view);
                    Rect rect = xl7Var.e;
                    if (rect != null) {
                        jen0Var.d(rect.left, rect.top, rect.right, xl7Var.f == null ? rect.bottom : jen0Var.d);
                    }
                    Float f = xl7Var.f;
                    if (f != null) {
                        jen0Var.d(jen0Var.a, jen0Var.b, jen0Var.c, f.floatValue());
                    }
                }
                return rih1Var;
            case 14:
                hwq hwqVar = (hwq) obj;
                bg3 bg3Var = (bg3) obj2;
                j7e0 j7e0Var = hwqVar.g;
                d811 d811Var = hwqVar.f;
                if (!(j7e0Var instanceof j7e0)) {
                    return new jey0(new jae0(hwqVar));
                }
                zuc0 zuc0Var4 = j7e0Var.a;
                boolean z4 = d811Var.a;
                Boolean boolValueOf = !d811Var.a ? Boolean.valueOf(zuc0Var4.j) : null;
                x4i1 x4i1Var2 = d811Var.b > 1 ? zuc0Var4.d : null;
                String str = zuc0Var4.c;
                String str2 = zuc0Var4.a;
                int i2 = hwqVar.a;
                String str3 = (String) bg3Var.d;
                if (hwqVar.c) {
                    i = 1;
                } else {
                    i = hwqVar.b ? 2 : 3;
                }
                fbp1 fbp1Var = zuc0Var4.n;
                tu00 tu00Var = zuc0Var4.q;
                dwq dwqVar = hwqVar.e;
                if (dwqVar != null) {
                    String str4 = dwqVar.a;
                    Set set = s4b1.f;
                    if (uic.x(str4).c == blc0.ti) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return new jey0(new k8e0(i2, hwqVar, str, str2, x4i1Var2, str3, boolValueOf, z, zuc0Var4, zuc0Var4.k ? 2 : 0, i, tu00Var, fbp1Var));
            case 15:
                j7e0 j7e0Var2 = ((hwq) obj).g;
                j7e0 j7e0Var3 = j7e0Var2 instanceof j7e0 ? j7e0Var2 : null;
                String str5 = ((wo7) obj2).d;
                String str6 = j7e0Var3 != null ? j7e0Var3.b : null;
                String str7 = str6 == null ? "" : str6;
                String str8 = j7e0Var3 != null ? j7e0Var3.c : null;
                String str9 = str8 == null ? "" : str8;
                Map map = (j7e0Var3 == null || (zuc0Var3 = j7e0Var3.a) == null) ? null : zuc0Var3.g;
                if (map == null) {
                    map = b7x.a;
                }
                cqs0 cqs0VarB = mqo1.B(map);
                if (j7e0Var3 == null || (zuc0Var2 = j7e0Var3.a) == null || (x4i1Var = zuc0Var2.d) == null) {
                    tv11Var = null;
                } else {
                    String str10 = x4i1Var.a;
                    String str11 = x4i1Var.b;
                    String str12 = x4i1Var.f;
                    if (str12 == null) {
                        str12 = x4i1Var.e;
                    }
                    tv11Var = new tv11(str10, str11, x4i1Var.g, str12, x4i1Var.c);
                }
                if (j7e0Var3 != null && (zuc0Var = j7e0Var3.a) != null) {
                    r6 = zuc0Var.b;
                }
                return new uv11(str7, str5, (Integer) null, str9, cqs0VarB, tv11Var, r6 == true ? 1 : 0, 132);
            case 16:
                iac0 iac0Var = (iac0) obj;
                g23 g23Var = (g23) obj2;
                return new ot7(iac0Var, new g1i(iac0Var, (Flowable) g23Var.d, (c3s) g23Var.c, ((t8u0) g23Var.b).a(iac0Var.getLifecycle()).a()));
            case 17:
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                zwg zwgVar = (zwg) obj2;
                y98 rt7Var = audioDeviceInfo != null ? new rt7(audioDeviceInfo) : null;
                ayh ayhVar = (ayh) zwgVar.b;
                if (rt7Var != null && ((rt7) rt7Var).a.getId() == ((qt7) zwgVar.a).getId()) {
                    ayhVar.m0(rih1Var);
                } else if (ayhVar.v()) {
                    if (!((AtomicBoolean) zwgVar.c).get()) {
                        ((dt71) zwgVar.d).a(rih1Var);
                    }
                    ((ayh) zwgVar.e).m0(rih1Var);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                c4p1.E(((yx7) obj).b, (y7e1) obj2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                rwq0.z((qtr) obj, new l68((m68) obj2, (byte) 0));
                return rih1Var;
            case 20:
                String str13 = ((cp11) obj).a;
                ozc0 ozc0Var = (ozc0) ((cp31) obj2).e;
                return ozc0Var != null ? new o0q0(ozc0Var.a, str13, 16, ozc0Var.b) : new n0q0(str13, l0q0.d);
            case 21:
                zw50 zw50Var = new zw50(true);
                uu0 uu0Var = (uu0) obj2;
                y98 y98Var = new y98(uu0Var, r6);
                boolean z5 = uu0Var.a;
                return new fx50(new yw50(zw50Var, y98Var, z5 ? null : new y98(uu0Var, b4), (vu30) null, (vu30) null, (vu30) null, 56), new dx50(new ey50(false, new y98(uu0Var, b3)), (jjk) null), z5 ? new y98(uu0Var, b2) : null);
            case 22:
                uv11 uv11Var = (uv11) obj;
                return new mqm(new jvm(uv11Var.b, uv11Var.a, uv11Var.d), new lqm(Collections.singletonList(ovm.a), ((eb8) obj2).c, (qle1) null, 4));
            case 23:
                ((qv00) obj).a(((yc8) obj2).b, w281.class, false);
                return rih1Var;
            case 24:
                asn asnVar = (asn) ((md8) obj2).b.a.b;
                od8 od8Var = (od8) asnVar.b;
                nd8 nd8Var = (nd8) asnVar.a;
                o78 o78Var = (o78) nd8Var.i.get();
                c8o.l(o78Var);
                Scheduler scheduler = (Scheduler) nd8Var.b.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) nd8Var.a.get();
                c8o.l(scheduler2);
                hr00 hr00Var = (hr00) nd8Var.g.get();
                c8o.l(hr00Var);
                g341 g341Var = (g341) nd8Var.c.get();
                c8o.l(g341Var);
                kp5 kp5Var = new kp5(od8Var, o78Var, scheduler, scheduler2, hr00Var, g341Var);
                kt91 kt91Var = (kt91) ((nd8) asnVar.a).e.get();
                c8o.l(kt91Var);
                lzn0 lzn0Var = (lzn0) ((nd8) asnVar.a).f.get();
                c8o.l(lzn0Var);
                ajg ajgVar = (ajg) ((nd8) asnVar.a).h.get();
                c8o.l(ajgVar);
                return new rd8(kp5Var, kt91Var, lzn0Var, ajgVar, (cir0) obj);
            case 25:
                return ((ce8) obj2).c;
            case 26:
                return (Single) ((bg8) obj2).invoke((String) obj, null);
            case 27:
                ((Number) obj).intValue();
                return ((itk0) obj2).b();
            case 28:
                int i3 = AuthorizationActivity.t1;
                ((AuthorizationActivity) obj2).o0(new dr8(nhz.N0, null, null));
                Logger.d("The user canceled", new Object[0]);
                return rih1Var;
            default:
                ((qv00) obj).a.add((rv00) obj2);
                return rih1Var;
        }
    }
}
