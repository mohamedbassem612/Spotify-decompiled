package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.puffin_esperanto.proto.PuffinFilterRequestOuterClass;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jkp0 implements Function, BiFunction, ya, wov0, xi7 {
    public final /* synthetic */ byte a;
    public final Object b;

    public jkp0(y2r0 y2r0Var, sjq0 sjq0Var, zob1 zob1Var) {
        String string;
        int i;
        String str;
        goj0 goj0VarA;
        jo70 jo70Var;
        this.a = (byte) 6;
        String str2 = y2r0Var.a;
        ioj0 ioj0Var = (ioj0) zob1Var.getValue();
        Context context = (Context) sjq0Var.b;
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str2);
        String str3 = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (jo70Var = (jo70) goj0VarA.a) == null || (str3 = jo70Var.a) == null) ? "" : str3;
        List<x2r0> list = y2r0Var.b;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (x2r0 x2r0Var : list) {
            List list2 = x2r0Var.b;
            int i3 = x2r0Var.a;
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(q7h.U(list3, i2));
            int i4 = 0;
            for (Object obj : list3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                v2r0 v2r0Var = (v2r0) obj;
                xfr0 xfr0Var = (xfr0) ((zl5) sjq0Var.c).r().get(v2r0Var.a);
                if (xfr0Var == null) {
                    eg.m(l1d.m("Missing SectionRegistration for section ", v2r0Var.a.name()));
                    throw null;
                }
                arrayList2.add(xfr0Var.b.a(i4, y2r0Var.a, zob1Var));
                i4 = i5;
            }
            switch (i3) {
                case 1:
                    i = 2131952665;
                    break;
                case 2:
                    i = 2131952460;
                    break;
                case 3:
                    i = 2131952456;
                    break;
                case 4:
                    i = 2131952459;
                    break;
                case 5:
                    i = 2131952449;
                    break;
                case 6:
                    i = 2131952473;
                    break;
                default:
                    throw null;
            }
            String string2 = context.getString(i);
            switch (i3) {
                case 1:
                    str = "Author";
                    break;
                case 2:
                    str = "Music";
                    break;
                case 3:
                    str = "Events";
                    break;
                case 4:
                    str = "Merch";
                    break;
                case 5:
                    str = "Clips";
                    break;
                case 6:
                    str = "Video";
                    break;
                default:
                    throw null;
            }
            arrayList.add(new ufr0(string2, str.toLowerCase(Locale.US), arrayList2));
            i2 = 10;
        }
        int i6 = y2r0Var.c;
        if (i6 == 0) {
            string = null;
        } else {
            if (zfr0.a[l1d.C(i6)] != 1) {
                eg.o();
                throw null;
            }
            string = context.getString(2131954591);
        }
        this.b = new vfr0(str2, str3, string, arrayList);
    }

    public Completable a(boolean z) {
        be beVar = (be) this.b;
        zpy0 zpy0VarN = PuffinFilterRequestOuterClass.PuffinDisableProcessingRequest.n();
        zpy0VarN.n(z ? bqy0.c : bqy0.b);
        return beVar.callSingle("spotify.puffin_esperanto.proto.PuffinService", "DisableProcessing", zpy0VarN.build()).map(n9x0.c).ignoreElement();
    }

    public boolean accept(Object obj) {
        return ((i5y0) this.b).e();
    }

    public Object apply(Object obj) {
        Object objJust;
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        byte b2 = 19;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return Single.timer(50000L, timeUnit, (Scheduler) obj2).map(new ypa((gkp0) obj, (byte) 18)).toObservable();
            case 1:
                g7o0 g7o0Var = (g7o0) obj;
                m5e0 m5e0Var = (o5e0) obj2;
                return (g7o0Var == g7o0.b || g7o0Var == g7o0.a || g7o0Var == g7o0.c) ? new l5e0(m5e0Var.a, g7o0Var) : m5e0Var;
            case 2:
                return ((Boolean) obj).booleanValue() ? Observable.just(Boolean.TRUE) : Observable.just(Boolean.FALSE).delay(15000L, timeUnit, (Scheduler) ((y7c0) obj2).e);
            case 3:
                EsOffline.TotalProgressResponse totalProgressResponse = (EsOffline.TotalProgressResponse) obj;
                ((exp0) ((g9r) obj2).b).e("normal", totalProgressResponse.o());
                return Boolean.valueOf(totalProgressResponse.o().s());
            case 4:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            default:
                j8x0 j8x0Var = (j8x0) obj;
                List list = j8x0Var.b;
                return list.isEmpty() ? Observable.just(j8x0Var) : Observable.fromIterable(list).flatMapSingle(new sks0((tzr0) obj2, (byte) 19)).toList().map(new jxp0((Object) j8x0Var, (byte) 21)).toObservable();
            case 5:
                u310 u310Var = (u310) obj;
                hyq0 hyq0Var = (hyq0) obj2;
                Set set = s4b1.f;
                String str = u310Var.a;
                if (uic.j(str, bzu0.f)) {
                    return ((w310) hyq0Var.c.getValue()).b(new r9c((String) null, str, (String) null, (String) null, (m210) null, false, false, (hlr0) null, 1, 2, (UbiSpecificationId) null, false, 255789)).flatMapObservable(ta20.V0).filter(new nbc(hyq0Var, (byte) 18)).map(new jxp0((Object) u310Var, (byte) 3));
                }
                Observable observableJust = Observable.just(u310Var);
                observableJust.getClass();
                return observableJust;
            case 8:
                ayz ayzVar = (y600) obj;
                Set setB = ((lbs0) obj2).c.b();
                if (!(ayzVar instanceof ayz) || setB.isEmpty()) {
                    return ayzVar;
                }
                ayz ayzVar2 = ayzVar;
                tcs0 tcs0Var = ayzVar2.a;
                c380 c380Var = tcs0Var.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : c380Var) {
                    xbs0 xbs0Var = (xbs0) obj3;
                    if (xbs0Var.t == null || !setB.contains(xbs0Var.a)) {
                        arrayList.add(obj3);
                    }
                }
                return new ayz(tcs0.a(tcs0Var, (String) null, mqo1.A(arrayList), 31), ayzVar2.b);
            case 9:
                ox41 ox41Var = (ox41) obj;
                z951 z951Var = ox41Var.b;
                p7w p7wVar = z951Var.h;
                return p7wVar == null ? Observable.just(new nz41(z951Var, ox41Var.c)) : Observable.create(new r0s0((o4e0) obj2, p7wVar, ox41Var, (byte) 5));
            case 11:
                zxm1 zxm1Var = ((jzs0) obj2).a;
                String str2 = ((un3) obj).d;
                return zxm1Var.a(str2).firstOrError().flatMap(new zxl1(zxm1Var, str2, (byte) 8)).flatMapMaybe(xi20.Y0);
            case 13:
                return oon1.x(((bxt0) obj2).a, "nowplaying-playback-control-switcher", l4o1.b0((ContextTrack) obj)).map(ta20.Y0).toFlowable(backpressureStrategy);
            case 15:
                String str3 = (String) obj;
                hj91 hj91Var = (hj91) ((tzr0) obj2).c;
                str3.getClass();
                return hj91Var.d(str3).filter(xj20.Z0).map(yj20.X0).toFlowable(backpressureStrategy);
            case 16:
                ly21 ly21Var = (py21) obj;
                ewq0 ewq0Var = new ewq0((iku0) obj2, (byte) 8);
                if (ly21Var instanceof ly21) {
                    objJust = ewq0Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objJust = Single.just(bjo.a);
                }
                return (SingleSource) objJust;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                tg60 tg60Var = (tg60) obj2;
                return Boolean.valueOf((tg60Var.a || !tg60Var.b || ((Boolean) obj).booleanValue()) ? false : true);
            case 22:
                bvw0 bvw0Var = (bvw0) ((cvw0) obj2).a.get();
                return Single.fromCallable(new sra(bvw0Var, (byte) 17)).onErrorReturn(avw0.b).subscribeOn(bvw0Var.b);
            case 23:
                p1x0 p1x0Var = (p1x0) obj;
                Set set2 = s4b1.f;
                String strZ = uic.C(p1x0Var.g, (String) null).z();
                strZ.getClass();
                return ((zsc) obj2).C(Collections.singletonMap(strZ, p1x0Var.h), Collections.singleton(strZ)).map(new yjp1(strZ, (byte) 8)).map(new jxp0(p1x0Var, b2)).map(y1x0.b);
            case 24:
                y8x0 y8x0Var = (y8x0) obj;
                obx0 obx0Var = y8x0Var.c;
                Set set3 = s4b1.f;
                String strS = uic.x(obx0Var.b).s();
                return strS == null ? Observable.empty() : Observable.create(new tzr0((byte) 23, (kp5) obj2, obx0Var, y8x0Var, strS));
        }
    }

    public boolean b() {
        boolean z;
        Properties properties = new Properties();
        boolean z2 = false;
        try {
            z420 z420VarQ = ((cpv0) ((dpv0) this.b)).a.q(c());
            try {
                properties.load((Reader) z420VarQ);
                z = true;
                try {
                    z420VarQ.close();
                    return true;
                } catch (FileNotFoundException unused) {
                    z2 = true;
                    return z2;
                } catch (IOException e) {
                    e = e;
                    Logger.e(e, "", new Object[0]);
                    return z;
                }
            } catch (Throwable th) {
                try {
                    z420VarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e2) {
            e = e2;
            z = false;
        }
    }

    public String c() {
        oi oiVar = ((cpv0) ((dpv0) this.b)).a;
        if (oiVar.k("/oem/etc/spotify.preload").b.exists()) {
            return "/oem/etc/spotify.preload";
        }
        if (oiVar.k("/product/etc/spotify.preload").b.exists()) {
            return "/product/etc/spotify.preload";
        }
        return oiVar.k("/data/etc/appchannel/spotify.preload").b.exists() ? "/data/etc/appchannel/spotify.preload" : "/system/etc/spotify.preload";
    }

    public String d(String str) {
        Properties properties = new Properties();
        try {
            z420 z420VarQ = ((cpv0) ((dpv0) this.b)).a.q(c());
            try {
                properties.load((Reader) z420VarQ);
                z420VarQ.close();
            } catch (Throwable th) {
                try {
                    z420VarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException e) {
            Logger.e(e, "", new Object[0]);
        }
        return properties.getProperty(str, "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r6.c == 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0096, code lost:
    
        if (r6.c == 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
    
        return p.ngv0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        return p.ogv0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p.y5w0 r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.h6w0
            if (r0 == 0) goto L13
            r0 = r7
            p.h6w0 r0 = (p.h6w0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.h6w0 r0 = new p.h6w0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 != r4) goto L2a
            p.y5w0 r6 = r0.a
            p.hm5.M(r7)
            goto L8e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r3
        L30:
            p.hm5.M(r7)
            p.blc0 r7 = r6.b
            int r7 = r7.ordinal()
            r1 = 166(0xa6, float:2.33E-43)
            if (r7 == r1) goto L6c
            r1 = 416(0x1a0, float:5.83E-43)
            if (r7 == r1) goto L69
            r1 = 652(0x28c, float:9.14E-43)
            if (r7 == r1) goto L66
            r1 = 844(0x34c, float:1.183E-42)
            if (r7 == r1) goto L63
            r1 = 860(0x35c, float:1.205E-42)
            if (r7 == r1) goto L60
            r1 = 926(0x39e, float:1.298E-42)
            if (r7 == r1) goto L5d
            r1 = 931(0x3a3, float:1.305E-42)
            if (r7 == r1) goto L5a
            r1 = 932(0x3a4, float:1.306E-42)
            if (r7 == r1) goto L5a
            goto L6e
        L5a:
            p.aam r3 = p.aam.g
            goto L6e
        L5d:
            p.aam r3 = p.aam.a
            goto L6e
        L60:
            p.aam r3 = p.aam.d
            goto L6e
        L63:
            p.aam r3 = p.aam.c
            goto L6e
        L66:
            p.aam r3 = p.aam.f
            goto L6e
        L69:
            p.aam r3 = p.aam.e
            goto L6e
        L6c:
            p.aam r3 = p.aam.b
        L6e:
            if (r3 != 0) goto L75
            int r5 = r6.c
            if (r5 != r2) goto L9b
            goto L98
        L75:
            java.lang.Object r5 = r5.b
            p.j380 r5 = (p.j380) r5
            java.lang.Object r5 = r5.get(r3)
            p.g6w0 r5 = (p.g6w0) r5
            if (r5 == 0) goto L94
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.a(r6, r0)
            p.d9n r5 = p.d9n.a
            if (r7 != r5) goto L8e
            return r5
        L8e:
            p.pgv0 r7 = (p.pgv0) r7
            if (r7 != 0) goto L93
            goto L94
        L93:
            return r7
        L94:
            int r5 = r6.c
            if (r5 != r2) goto L9b
        L98:
            p.ngv0 r5 = p.ngv0.a
            return r5
        L9b:
            p.ogv0 r5 = p.ogv0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jkp0.e(p.y5w0, p.onm):java.lang.Object");
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((Observable) ((ct8) this.b).b.invoke()).firstOrError().map(new jxp0((Object) intent, (byte) 26)).onErrorReturn(icx0.c);
    }

    public jkp0(dsp0 dsp0Var, o5e0 o5e0Var) {
        this.a = (byte) 1;
        this.b = o5e0Var;
    }

    public jkp0(qh4 qh4Var, Activity activity) {
        this.a = (byte) 10;
        this.b = qh4Var;
        activity.getString(2131961710);
        activity.getString(2131961709);
        activity.getString(2131961708);
        activity.getString(2131961706);
        activity.getString(2131961707);
    }

    public /* synthetic */ jkp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object apply(Object obj, Object obj2) {
        boolean z;
        Map map = (Map) obj;
        if (((ibk0) obj2).a()) {
            ((z6k0) ((dfm) this.b).f).getClass();
            if (z6k0.a(map)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
