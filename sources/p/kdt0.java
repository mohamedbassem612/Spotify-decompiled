package p;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kdt0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdt0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = 2;
        switch (this.a) {
            case 0:
                return new kdt0((ndt0) this.b, lnmVar, (byte) 0);
            case 1:
                return new kdt0((p3u0) this.b, lnmVar, (byte) 1);
            case 2:
                return new kdt0((z6u0) this.b, lnmVar, b);
            case 3:
                return new kdt0((hlu0) this.b, lnmVar, (byte) 3);
            case 4:
                return new kdt0((oev0) this.b, lnmVar, (byte) 4);
            case 5:
                return new kdt0((phi0) this.b, lnmVar, (byte) 5);
            case 6:
                return new kdt0((km0) this.b, lnmVar, (byte) 6);
            case 7:
                return new kdt0((upy0) this.b, lnmVar, (byte) 7);
            case 8:
                return new kdt0((zhz0) this.b, lnmVar, (byte) 8);
            case 9:
                return new kdt0((q401) this.b, lnmVar, (byte) 9);
            case 10:
                return new kdt0((ll01) this.b, lnmVar, (byte) 10);
            case 11:
                return new kdt0((xl01) this.b, lnmVar, (byte) 11);
            case 12:
                return new kdt0((uvb0) this.b, lnmVar, (byte) 12);
            case 13:
                return new kdt0((s911) this.b, lnmVar, (byte) 13);
            case 14:
                return new kdt0((nl21) this.b, lnmVar, (byte) 14);
            case 15:
                return new kdt0((ca31) this.b, lnmVar, (byte) 15);
            case 16:
                return new kdt0((jk31) this.b, lnmVar, (byte) 16);
            case 17:
                return new kdt0((dt31) this.b, lnmVar, (byte) 17);
            case 18:
                return new kdt0((h741) this.b, lnmVar, (byte) 18);
            case 19:
                kdt0 kdt0Var = new kdt0(b, lnmVar);
                kdt0Var.b = ((pvg1) obj).a;
                return kdt0Var;
            case 20:
                return new kdt0((ju51) this.b, lnmVar, (byte) 20);
            case 21:
                return new kdt0((xv61) this.b, lnmVar, (byte) 21);
            case 22:
                return new kdt0((qo71) this.b, lnmVar, (byte) 22);
            case 23:
                return new kdt0((dx71) this.b, lnmVar, (byte) 23);
            case 24:
                return new kdt0((d18) this.b, lnmVar, (byte) 24);
            case 25:
                return new kdt0((up41) this.b, lnmVar, (byte) 25);
            case 26:
                return new kdt0((baa1) this.b, lnmVar, (byte) 26);
            case 27:
                return new kdt0((yta1) this.b, lnmVar, (byte) 27);
            case 28:
                return new kdt0((yxa1) this.b, lnmVar, (byte) 28);
            default:
                return new kdt0((esa1) this.b, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((r6u0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                String str = ((pvg1) obj).a;
                kdt0 kdt0Var = new kdt0(2, (lnm) obj2);
                kdt0Var.b = str;
                return kdt0Var.invokeSuspend(rih1Var);
            case 20:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        a2c1 a2c1Var;
        byte b = this.a;
        ixb ixbVar = ixb.c;
        boolean zContains = false;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                ndt0 ndt0Var = (ndt0) this.b;
                TextClassifier textClassifierJ = ph5.j(ndt0Var.b, ndt0Var.c);
                ndt0Var.f = textClassifierJ;
                return textClassifierJ;
            case 1:
                hm5.M(obj);
                ((p3u0) this.b).c.l0(false);
                return rih1Var;
            case 2:
                hm5.M(obj);
                ((z6u0) this.b).a.a(ixbVar);
                return rih1Var;
            case 3:
                hm5.M(obj);
                yt91 yt91Var = ((hlu0) this.b).d;
                ((kt91) yt91Var.c).k(new er91((fs91) null, ((Activity) yt91Var.b).getString(2131954674), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 4:
                hm5.M(obj);
                ((oev0) this.b).b++;
                return rih1Var;
            case 5:
                hm5.M(obj);
                phi0 phi0Var = (phi0) this.b;
                r091 r091Var = (r091) phi0Var.f;
                if (r091Var != null) {
                    r091Var.c();
                }
                zau0 zau0Var = (zau0) phi0Var.e;
                if (zau0Var != null) {
                    ((ttm0) phi0Var.b).b(zau0Var);
                }
                phi0Var.f = null;
                phi0Var.e = null;
                return rih1Var;
            case 6:
                hm5.M(obj);
                Context context = (Context) ((km0) this.b).c;
                if (ph5.M(context) == fsw0.a) {
                    u2o1.v(context, new l5o(), u2o1.a, false);
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                ((cm41) ((ykq) ((upy0) this.b).f).get()).invoke();
                return rih1Var;
            case 8:
                hm5.M(obj);
                ((zhz0) this.b).c.e();
                return rih1Var;
            case 9:
                hm5.M(obj);
                ((q401) this.b).a.a(ixbVar);
                return rih1Var;
            case 10:
                hm5.M(obj);
                ll01 ll01Var = (ll01) this.b;
                ((i8h1) ll01Var.f.get()).f(ll01Var.g.e(), (Set) null);
                return rih1Var;
            case 11:
                hm5.M(obj);
                xl01 xl01Var = (xl01) this.b;
                bpb1 bpb1Var = xl01Var.d;
                do {
                    value = bpb1Var.getValue();
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) value).entrySet()) {
                        if (xl01Var.a.b() < ((ul01) entry.getValue()).a + ((long) ((no4) xl01Var.b.a.get()).Z())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } while (!bpb1Var.k(value, linkedHashMap));
                return rih1Var;
            case 12:
                hm5.M(obj);
                if (((uvb0) this.b).b()) {
                    ew01.a.a(rih1Var);
                }
                return rih1Var;
            case 13:
                hm5.M(obj);
                ((l911) ((s911) this.b).b.getValue()).c();
                return rih1Var;
            case 14:
                hm5.M(obj);
                nl21 nl21Var = (nl21) this.b;
                ((lxg) nl21Var.a.get()).d(new olv0(nl21Var, (byte) 1));
                return rih1Var;
            case 15:
                hm5.M(obj);
                ((ca31) this.b).c.f(new dwn0(nik1.P5.a, "", false, false, 0, 0, true, null, null, null));
                return rih1Var;
            case 16:
                hm5.M(obj);
                ((jk31) this.b).f.invoke();
                return rih1Var;
            case 17:
                hm5.M(obj);
                dt31 dt31Var = (dt31) this.b;
                dt31Var.a.c("com.spotify.sidedrawer.sidedrawerimpl.accessory_state", new uk(dt31Var, (byte) 18));
                return rih1Var;
            case 18:
                hm5.M(obj);
                h741 h741Var = (h741) this.b;
                ContentResolver contentResolver = h741Var.a;
                try {
                    zContains = h741.f.contains(Settings.Secure.getString(contentResolver, "gs_location_state"));
                    break;
                } catch (Exception unused) {
                }
                h741Var.c.a.a(new khv0((String) null, 1, sqg0.J(new mmr0[]{new mmr0("store", "SAMSUNG_GALAXY_STORE"), new mmr0("region_supported", String.valueOf(zContains))}), "age_signal_region_gate"));
                if (!zContains) {
                    return h741.b(1);
                }
                try {
                    Bundle bundleCall = contentResolver.call(h741Var.b, "getAgeSignalResult", (String) null, (Bundle) null);
                    return bundleCall == null ? h741.b(1) : h741Var.c(bundleCall);
                } catch (IllegalArgumentException e) {
                    a2c1Var = new a2c1(1, 2, e);
                    return a2c1Var;
                } catch (SecurityException e2) {
                    a2c1Var = new a2c1(3, 2, e2);
                    return a2c1Var;
                } catch (Exception e3) {
                    a2c1Var = new a2c1(6, 2, e3);
                    return a2c1Var;
                }
            case 19:
                String str = (String) this.b;
                hm5.M(obj);
                return new pvg1(str);
            case 20:
                hm5.M(obj);
                return rih1Var;
            case 21:
                hm5.M(obj);
                xv61 xv61Var = (xv61) this.b;
                smo1.p(xv61Var.e, (CancellationException) null);
                xv61Var.e = smo1.e(flo1.l(guo1.B(), xv61Var.b));
                xv61Var.d.clear();
                return rih1Var;
            case 22:
                hm5.M(obj);
                qo71 qo71Var = (qo71) this.b;
                opa opaVar = qo71Var.i;
                if (opaVar != null) {
                    opaVar.a(qo71Var.h);
                }
                opa opaVar2 = qo71Var.i;
                if (opaVar2 != null) {
                    smo1.q(opaVar2.f);
                }
                qo71Var.i = null;
                return rih1Var;
            case 23:
                dx71 dx71Var = (dx71) this.b;
                hm5.M(obj);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962395});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131962395, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = dx71Var.b;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1Var;
            case 24:
                hm5.M(obj);
                ((Function0) ((d18) this.b).b).invoke();
                return rih1Var;
            case 25:
                hm5.M(obj);
                p681 p681Var = (p681) ((up41) this.b).b;
                s681 s681Var = (t681) p681Var.c.a.getValue();
                if ((s681Var instanceof s681) && s681Var.a.isEmpty()) {
                    p681Var.b.a(rih1Var);
                }
                return rih1Var;
            case 26:
                hm5.M(obj);
                baa1 baa1Var = (baa1) this.b;
                baa1Var.f.a(baa1Var.h, baa1Var.k).a(baa1Var.i);
                return rih1Var;
            case 27:
                hm5.M(obj);
                yta1 yta1Var = (yta1) this.b;
                esa1 esa1Var = yta1Var.d;
                fua1 fua1Var = yta1Var.k;
                i8h1 i8h1Var = (i8h1) ((ynb0) esa1Var.b).get();
                tdl0 tdl0Var = (tdl0) esa1Var.c;
                int iB = fj30.B(fua1Var);
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("message", knl0.f(iB), (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = tdl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 28:
                hm5.M(obj);
                yxa1 yxa1Var = (yxa1) this.b;
                yt91 yt91Var2 = yxa1Var.n;
                ji0 ji0Var = yxa1Var.a.a;
                String strM = l1d.m("spotify:ad:", ji0Var.a);
                yt91Var2.d = strM;
                yt91Var2.c = new bqk0(ji0Var.t, ji0Var.h, strM);
                return rih1Var;
            default:
                hm5.M(obj);
                ne neVar = new ne((byte) 9);
                neVar.L("HEAD", (tn21) null);
                neVar.e0("https://spclient.wg.spotify.com/reachability/check");
                ((t360) neVar.c).b("platform", "android");
                try {
                    zContains = ((azp0) ((ynb0) ((esa1) this.b).c).get()).a(new ln21(neVar)).e().Q0;
                    break;
                } catch (Throwable unused2) {
                }
                return Boolean.valueOf(zContains);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdt0(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 19;
    }
}
