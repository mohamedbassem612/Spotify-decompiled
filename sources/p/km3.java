package p;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.engage.service.ClusterMetadata;
import com.spotify.messages.AudioManagerProxyEvent;
import com.spotify.metadata.proto.Metadata;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class km3 implements Function, BiFunction, kf5, vf5, SingleOnSubscribe, ObservableOnSubscribe, t28, l381 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public km3(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 9:
                ndn1 ndn1Var = ndn1.i;
                if (ndn1Var == null || ndn1Var.e == null || !c8p1.a(context)) {
                    synchronized (ndn1.class) {
                        try {
                            ndn1 ndn1Var2 = ndn1.i;
                            if (ndn1Var2 == null || ndn1Var2.e == null || !c8p1.a(context)) {
                                ndn1.i = new ndn1(context);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                ndn1 ndn1Var3 = ndn1.i;
                mln1 mln1Var = new mln1(context.getContentResolver());
                this.b = ndn1Var3;
                this.c = mln1Var;
                return;
            default:
                this.b = context.getResources().getDisplayMetrics();
                this.c = context.getResources().getConfiguration();
                return;
        }
    }

    public static x8c0 A(zy70 zy70Var) {
        h180 h180Var = zy70Var.c;
        Context context = h180Var instanceof h180 ? h180Var.b.getContext() : zy70Var.a;
        while (!(context instanceof iac0)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((iac0) context).getLifecycle();
    }

    public static boolean F(zy70 zy70Var, csi0 csi0Var) {
        kxa kxaVar = csi0Var.a;
        kxa kxaVar2 = kxaVar instanceof kxa ? kxaVar : null;
        if (kxaVar2 == null) {
            return true;
        }
        Bitmap.Config config = kxaVar2.a.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return G(zy70Var, config);
    }

    public static boolean G(zy70 zy70Var, Bitmap.Config config) {
        if (!fpi1.x(config)) {
            return true;
        }
        if (!((Boolean) kto1.u(zy70Var, dz70.f)).booleanValue()) {
            return false;
        }
        h180 h180Var = zy70Var.c;
        if (!(h180Var instanceof h180)) {
            return true;
        }
        ImageView imageView = h180Var.b;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    public float B() {
        return ((Configuration) this.c).fontScale;
    }

    public int C() {
        return (((Configuration) this.c).uiMode & 15) == 4 ? 2 : 1;
    }

    public float D() {
        return TypedValue.applyDimension(2, 1.0f, (DisplayMetrics) this.b);
    }

    public float E() {
        return ((DisplayMetrics) this.b).xdpi;
    }

    public ArrayList H(List list, List list2, zjn0 zjn0Var) {
        List list3 = list;
        if (list3.isEmpty()) {
            if (list2 == null) {
                list2 = z6x.a;
            }
            list3 = list2;
        }
        List list4 = list3;
        ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(((ow3) this.c).f((efy0) it.next(), zjn0Var));
        }
        return arrayList;
    }

    public void I(int i) {
        ow7 ow7VarN = AudioManagerProxyEvent.n();
        ow7VarN.s(td6.c(i));
        ow7VarN.z("ABANDON_AUDIO_FOCUS");
        ((t2j0) this.b).a(ow7VarN.build());
    }

    public void J(int i, int i2, int i3, int i4) {
        String strE;
        ow7 ow7VarN = AudioManagerProxyEvent.n();
        ow7VarN.s(td6.c(i4));
        ow7VarN.z("REQUEST_AUDIO_FOCUS");
        ow7VarN.x(zro1.q(i));
        ow7VarN.v(zro1.p(i3));
        if (i2 != 3) {
            strE = i2 != 4 ? gvg.e(i2, "UNKNOWN(", ")") : "STREAM_ALARM";
        } else {
            strE = "STREAM_MUSIC";
        }
        ow7VarN.A(strE);
        Q(ow7VarN);
        ((t2j0) this.b).a(ow7VarN.build());
    }

    public void K(int i, av7 av7Var, int i2) {
        Integer num;
        String strE;
        Integer num2;
        String strE2;
        ow7 ow7VarN = AudioManagerProxyEvent.n();
        ow7VarN.s(td6.c(i2));
        ow7VarN.z("REQUEST_AUDIO_FOCUS");
        ow7VarN.x(zro1.q(i));
        ow7VarN.v(zro1.p(av7Var.a));
        ow3 ow3Var = (ow3) av7Var.e;
        if (ow3Var != null && (num2 = (Integer) ow3Var.b) != null) {
            int iIntValue = num2.intValue();
            if (iIntValue != 1) {
                strE2 = iIntValue != 2 ? gvg.e(iIntValue, "UNKNOWN(", ")") : "CONTENT_TYPE_MUSIC";
            } else {
                strE2 = "CONTENT_TYPE_SPEECH";
            }
            ow7VarN.t(strE2);
        }
        if (ow3Var != null && (num = (Integer) ow3Var.c) != null) {
            int iIntValue2 = num.intValue();
            if (iIntValue2 != 1) {
                strE = iIntValue2 != 4 ? gvg.e(iIntValue2, "UNKNOWN(", ")") : "USAGE_ALARM";
            } else {
                strE = "USAGE_MEDIA";
            }
            ow7VarN.r(strE);
        }
        Boolean bool = (Boolean) av7Var.c;
        if (bool != null) {
            ow7VarN.n(bool.booleanValue());
        }
        ow7VarN.y(av7Var.b);
        Q(ow7VarN);
        ((t2j0) this.b).a(ow7VarN.build());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    public dqq0 L(zy70 zy70Var, k291 k291Var) {
        Context context;
        k291 k291Var2;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        Context context2 = zy70Var.a;
        dg41 dg41Var = zy70Var.q;
        int i = zy70Var.r;
        i520 i520Var = zy70Var.f;
        jsc jscVar = zy70Var.j;
        jsc jscVar2 = zy70Var.k;
        jsc jscVar3 = zy70Var.l;
        jc10 jc10Var = dz70.b;
        Bitmap.Config config = (Bitmap.Config) kto1.u(zy70Var, jc10Var);
        jc10 jc10Var2 = dz70.g;
        boolean zBooleanValue = ((Boolean) kto1.u(zy70Var, jc10Var2)).booleanValue();
        jc10 jc10Var3 = cz70.a;
        boolean z3 = ((List) kto1.u(zy70Var, jc10Var3)).isEmpty() || f46.M(aqi1.a, (Bitmap.Config) kto1.u(zy70Var, jc10Var));
        if (fpi1.x((Bitmap.Config) kto1.u(zy70Var, jc10Var))) {
            if (G(zy70Var, (Bitmap.Config) kto1.u(zy70Var, jc10Var))) {
                context = context2;
                k291Var2 = k291Var;
                if (((ft50) this.c).f(k291Var2)) {
                }
                if (z3 || !z) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) kto1.u(zy70Var, jc10Var3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                linkedHashMap = new LinkedHashMap(sqg0.O(zy70Var.u.n.a, zy70Var.s.a));
                if (config != ((Bitmap.Config) kto1.u(zy70Var, jc10Var))) {
                    if (config != null) {
                        linkedHashMap.put(jc10Var, config);
                    } else {
                        linkedHashMap.remove(jc10Var);
                    }
                }
                if (z2 != ((Boolean) kto1.u(zy70Var, jc10Var2)).booleanValue()) {
                    linkedHashMap.put(jc10Var2, Boolean.valueOf(z2));
                }
                return new dqq0(context, k291Var2, dg41Var, i, (String) null, i520Var, jscVar, jscVar2, jscVar3, new kc10(ila0.G(linkedHashMap)));
            }
            context = context2;
            k291Var2 = k291Var;
            z = false;
            if (z3) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z2 = false;
            } else {
                z2 = false;
            }
            linkedHashMap = new LinkedHashMap(sqg0.O(zy70Var.u.n.a, zy70Var.s.a));
            if (config != ((Bitmap.Config) kto1.u(zy70Var, jc10Var))) {
                if (config != null) {
                    linkedHashMap.put(jc10Var, config);
                } else {
                    linkedHashMap.remove(jc10Var);
                }
            }
            if (z2 != ((Boolean) kto1.u(zy70Var, jc10Var2)).booleanValue()) {
                linkedHashMap.put(jc10Var2, Boolean.valueOf(z2));
            }
            return new dqq0(context, k291Var2, dg41Var, i, (String) null, i520Var, jscVar, jscVar2, jscVar3, new kc10(ila0.G(linkedHashMap)));
        }
        context = context2;
        k291Var2 = k291Var;
        z = true;
        if (z3) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z2 = false;
        } else {
            z2 = false;
        }
        linkedHashMap = new LinkedHashMap(sqg0.O(zy70Var.u.n.a, zy70Var.s.a));
        if (config != ((Bitmap.Config) kto1.u(zy70Var, jc10Var))) {
            if (config != null) {
                linkedHashMap.put(jc10Var, config);
            } else {
                linkedHashMap.remove(jc10Var);
            }
        }
        if (z2 != ((Boolean) kto1.u(zy70Var, jc10Var2)).booleanValue()) {
            linkedHashMap.put(jc10Var2, Boolean.valueOf(z2));
        }
        return new dqq0(context, k291Var2, dg41Var, i, (String) null, i520Var, jscVar, jscVar2, jscVar3, new kc10(ila0.G(linkedHashMap)));
    }

    public hfp1 M(mlw0 mlw0Var) {
        ndn1 ndn1Var = (ndn1) this.b;
        ezb1 ezb1Var = new ezb1();
        ((v280) ezb1Var.b).c((nnm) mlw0Var.b);
        return ndn1Var.a(new ssk1(ezb1Var)).k(l5u.a, new bym1(this, mlw0Var, (byte) 4));
    }

    public hfp1 N(vgq0 vgq0Var) {
        ndn1 ndn1Var = (ndn1) this.b;
        ezb1 ezb1Var = new ezb1();
        bg11 bg11Var = (bg11) vgq0Var.b;
        int i = bg11Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            ((v280) ezb1Var.b).c((uw01) bg11Var.get(i2));
        }
        return ndn1Var.a(new ssk1(ezb1Var)).k(l5u.a, new cbn1());
    }

    public hfp1 O(sks0 sks0Var) {
        ndn1 ndn1Var = (ndn1) this.b;
        ezb1 ezb1Var = new ezb1();
        ((v280) ezb1Var.b).c((m7y) sks0Var.b);
        return ndn1Var.a(new ssk1(ezb1Var)).k(l5u.a, new nen1());
    }

    public ko21 P(zy70 zy70Var, faa0 faa0Var, boolean z) {
        h180 h180Var = zy70Var.c;
        if (h180Var instanceof h180) {
            x8c0 x8c0VarA = (x8c0) kto1.u(zy70Var, dz70.e);
            if (x8c0VarA == null) {
                x8c0VarA = A(zy70Var);
            }
            return new jhk1((rf01) this.b, zy70Var, h180Var, x8c0VarA, faa0Var);
        }
        x8c0 x8c0VarA2 = (x8c0) kto1.u(zy70Var, dz70.e);
        if (x8c0VarA2 == null) {
            x8c0VarA2 = z ? A(zy70Var) : null;
        }
        return x8c0VarA2 != null ? new zh0(x8c0VarA2, faa0Var, (byte) 8) : new kca(faa0Var);
    }

    public void Q(ow7 ow7Var) {
        String m231Var;
        Boolean m231Var2;
        t4d1 t4d1Var = (t4d1) this.c;
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i = runningAppProcessInfo.importance;
            if (i == 100) {
                m231Var = "IMPORTANCE_FOREGROUND";
            } else if (i == 125) {
                m231Var = "IMPORTANCE_FOREGROUND_SERVICE";
            } else if (i == 200) {
                m231Var = "IMPORTANCE_VISIBLE";
            } else if (i == 230) {
                m231Var = "IMPORTANCE_PERCEPTIBLE";
            } else if (i == 300) {
                m231Var = "IMPORTANCE_SERVICE";
            } else if (i == 400) {
                m231Var = "IMPORTANCE_CACHED";
            } else if (i != 1000) {
                m231Var = "UNKNOWN(" + i + ")";
            } else {
                m231Var = "IMPORTANCE_GONE";
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = "UNKNOWN";
        }
        ow7Var.q(m231Var);
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) t4d1Var.b).getRunningServices(Integer.MAX_VALUE);
            boolean z = false;
            if (!(runningServices instanceof Collection) || !runningServices.isEmpty()) {
                Iterator<T> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (((ActivityManager.RunningServiceInfo) it.next()).foreground) {
                        z = true;
                        break;
                    }
                }
            }
            m231Var2 = Boolean.valueOf(z);
        } catch (Throwable th2) {
            m231Var2 = new m231(th2);
        }
        if (m231Var2 instanceof m231) {
            return;
        }
        ow7Var.w(m231Var2.booleanValue());
    }

    public void R() {
        this.b = 2;
    }

    public void S() {
        this.c = 1;
    }

    public Single T(Context context, wq8 wq8Var, String str) {
        return Single.just(wq8Var).observeOn((Scheduler) this.c).flatMap(new yu3(this, str, context, wq8Var, (byte) 18)).onErrorReturn(new mp8((Object) wq8Var, (byte) 0));
    }

    public dqq0 U(dqq0 dqq0Var) {
        kc10 kc10Var;
        boolean z;
        kc10 kc10Var2 = dqq0Var.j;
        jc10 jc10Var = dz70.b;
        if (!fpi1.x((Bitmap.Config) kto1.v(dqq0Var, jc10Var)) || ((ft50) this.c).b()) {
            kc10Var = kc10Var2;
            z = false;
        } else {
            kc10Var2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kc10Var2.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMap.put(jc10Var, config);
            } else {
                linkedHashMap.remove(jc10Var);
            }
            kc10 kc10Var3 = new kc10(ila0.G(linkedHashMap));
            z = true;
            kc10Var = kc10Var3;
        }
        return z ? new dqq0(dqq0Var.a, dqq0Var.b, dqq0Var.c, dqq0Var.d, dqq0Var.e, dqq0Var.f, dqq0Var.g, dqq0Var.h, dqq0Var.i, kc10Var) : dqq0Var;
    }

    public hfp1 V(ij81 ij81Var) {
        ndn1 ndn1Var = (ndn1) this.b;
        ndn1Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", ndn1Var.d);
        bundle.putString("calling_package_name", ndn1Var.c);
        bundle.putInt("publish_status_code", ij81Var.b);
        return ndn1Var.b(new sso1(ndn1Var, bundle, (byte) 0)).k(l5u.a, new pen1());
    }

    public zy70 W(zy70 zy70Var) {
        ag01 dg01Var;
        ImageView imageView;
        dg41 dg41Var;
        ImageView.ScaleType scaleType;
        vy70 vy70VarA = zy70.a(zy70Var);
        h180 h180Var = zy70Var.c;
        vy70VarA.b = ((rf01) this.b).a.b;
        xy70 xy70Var = zy70Var.t;
        ag01 ag01Var = xy70Var.g;
        if (ag01Var == null) {
            if (h180Var instanceof h180) {
                ImageView imageView2 = h180Var.b;
                dg01Var = (imageView2 == null || !((scaleType = imageView2.getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? new dg01(imageView2) : z291.l0;
            } else {
                dg01Var = z291.l0;
            }
            vy70VarA.n = dg01Var;
        } else {
            dg01Var = ag01Var;
        }
        int i = 2;
        if (xy70Var.h == null) {
            h180 h180Var2 = h180Var instanceof h180 ? h180Var : null;
            ImageView imageView3 = h180Var2 != null ? h180Var2.b : null;
            ImageView imageView4 = imageView3 != null ? imageView3 : null;
            if (imageView4 != null) {
                Bitmap.Config[] configArr = aqi1.a;
                ImageView.ScaleType scaleType2 = imageView4.getScaleType();
                int i2 = scaleType2 == null ? -1 : zpi1.a[scaleType2.ordinal()];
                dg41Var = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? dg41.b : dg41.a;
            } else {
                dg41Var = zy70Var.q;
            }
            vy70VarA.o = dg41Var;
        }
        if (xy70Var.i == 0) {
            if ((ag01Var != null || !u890.j(dg01Var, z291.l0)) && (!(h180Var instanceof h180) || !(dg01Var instanceof dg01) || (imageView = h180Var.b) == null || imageView != ((dg01) dg01Var).a)) {
                i = 1;
            }
            vy70VarA.p = i;
        }
        return vy70VarA.a();
    }

    public int a() {
        return ((AudioRecord) this.b).getSampleRate();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = ((e331) obj).a;
                hu3 hu3Var = ((om3) this.b).d;
                hm3 hm3Var = (hm3) this.c;
                if (e331.a(obj2) == null) {
                    hu3Var.c(ysq0.c);
                    return new um3((wub1) obj2);
                }
                hu3Var.c(ysq0.b);
                return new tm3(hm3Var);
            case 3:
                z310 z310Var = (z310) obj;
                b74 b74Var = (b74) this.b;
                a6h1 a6h1Var = b74Var.q;
                ruk rukVar = ((nba) b74Var).a;
                a6h1Var.getClass();
                Iterator it = z310Var.a.iterator();
                while (it.hasNext()) {
                    y310 y310Var = ((u310) it.next()).w;
                    if (y310Var != null) {
                        a6h1Var.a.put(Integer.valueOf(y310Var.a.hashCode()), y310Var);
                    }
                }
                return new mmr0(z310Var.c, ((nba) b74Var).d.a(z310Var, rukVar.a, rukVar.b.g, (y310) this.c));
            case 14:
                return ((yr6) this.b).d((Metadata.Artist) obj, (String) this.c);
            case 15:
                String str = ((tm6) this.b).a;
                return new fb6((String) this.c, (List) obj, str);
            case 16:
                uv00 uv00Var = (uv00) obj;
                String str2 = (String) this.b;
                ez00 ez00Var = uv00Var.a(vy6.class, str2).b;
                if (ez00Var != null) {
                    return ((ns6) this.c).h1(ez00Var);
                }
                swg0.h(l1d.t("Missing metadata for Uri: ", str2, ". Response cacheStatus: "), bb00.u(uv00Var.a(vy6.class, str2).c.b), ".");
                return null;
            case 17:
                return new fwq((List) obj, (il51) this.b, false, false, false, false, false, ((s87) this.c).a, ofu0.a, false, false, false);
            case 24:
                l78 l78Var = (l78) this.b;
                String str3 = (String) this.c;
                return new MaybeToSingle(l78Var.a.b(new oi("android-audiobook-cappingimpl", false, new wk3(str3, (byte) 19))).filter(pzs0.t).firstElement().f(new vdn1(str3, (byte) 2)), Boolean.FALSE);
            default:
                String str4 = (String) obj;
                return new mmr0(str4, ((ut71) this.b).b((Context) this.c, str4));
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public List c(o5 o5Var, ggy0 ggy0Var) {
        return H(ggy0Var.Y0, null, (zjn0) o5Var.b);
    }

    public List d(o5 o5Var, ggy0 ggy0Var) {
        return H(ggy0Var.Z0, null, (zjn0) o5Var.b);
    }

    public ArrayList e(wgy0 wgy0Var, zjn0 zjn0Var) {
        return H(wgy0Var.X, (List) wgy0Var.i(((wbc) this.b).l), zjn0Var);
    }

    public int f(ByteBuffer byteBuffer, int i) {
        return ((AudioRecord) this.b).read(byteBuffer, i);
    }

    public List g(o5 o5Var, t8 t8Var, int i) {
        String str;
        zjn0 zjn0Var = (zjn0) o5Var.b;
        if (t8Var instanceof yfy0) {
            return H(((yfy0) t8Var).V0, null, zjn0Var);
        }
        if (!(t8Var instanceof ggy0)) {
            hhg1.o(t8Var, "Unknown message: ");
            return null;
        }
        int iC = l1d.C(i);
        if (iC == 1 || iC == 2 || iC == 3) {
            return H(((ggy0) t8Var).X0, null, zjn0Var);
        }
        if (i == 1) {
            str = "FUNCTION";
        } else if (i == 2) {
            str = "PROPERTY";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PROPERTY_SETTER";
        } else {
            str = "PROPERTY_GETTER";
        }
        k220.f("Unsupported callable kind with property proto for receiver annotations: ".concat(str));
        return null;
    }

    public int getAudioSessionId() {
        return ((AudioRecord) this.b).getAudioSessionId();
    }

    public int getState() {
        return ((AudioRecord) this.b).getState();
    }

    public List h(o5 o5Var, t8 t8Var, int i, int i2, zgy0 zgy0Var) {
        return H(zgy0Var.t, (List) zgy0Var.i(((wbc) this.b).j), (zjn0) o5Var.b);
    }

    public List i(o5 o5Var, t8 t8Var, int i, int i2, zgy0 zgy0Var) {
        List listH = zgy0Var != null ? h(o5Var, t8Var, i, i2, zgy0Var) : null;
        return listH == null ? z6x.a : listH;
    }

    public void j(cp5 cp5Var) {
        ((AudioRecord) this.b).removeOnRoutingChangedListener((AudioRecord.OnRoutingChangedListener) ((ConcurrentHashMap) this.c).remove(cp5Var));
    }

    public int k() {
        return ((AudioRecord) this.b).getRecordingState();
    }

    public void l(cp5 cp5Var) {
        v28 v28Var = new v28(cp5Var);
        ((ConcurrentHashMap) this.c).put(cp5Var, v28Var);
        ((AudioRecord) this.b).addOnRoutingChangedListener((AudioRecord.OnRoutingChangedListener) v28Var, (Handler) null);
    }

    public Object m(o5 o5Var, ggy0 ggy0Var, a8b0 a8b0Var) {
        bfy0 bfy0Var = (bfy0) z0o1.l(ggy0Var, ((wbc) this.b).i);
        if (bfy0Var == null) {
            return null;
        }
        return ((ow3) this.c).m(a8b0Var, bfy0Var, (zjn0) o5Var.b);
    }

    public List n(o5 o5Var, tfy0 tfy0Var) {
        return H(tfy0Var.e, (List) tfy0Var.i(((wbc) this.b).h), (zjn0) o5Var.b);
    }

    public ArrayList o(rgy0 rgy0Var, zjn0 zjn0Var) {
        return H(rgy0Var.R0, (List) rgy0Var.i(((wbc) this.b).k), zjn0Var);
    }

    public void p() {
        ((AudioRecord) this.b).startRecording();
    }

    public /* bridge */ /* synthetic */ Object q(o5 o5Var, ggy0 ggy0Var, a8b0 a8b0Var) {
        return null;
    }

    public List r(o5 o5Var, t8 t8Var, int i) {
        wbc wbcVar = (wbc) this.b;
        zjn0 zjn0Var = (zjn0) o5Var.b;
        if (t8Var instanceof kfy0) {
            kfy0 kfy0Var = (kfy0) t8Var;
            return H(kfy0Var.h, (List) kfy0Var.i(wbcVar.b), zjn0Var);
        }
        if (t8Var instanceof yfy0) {
            yfy0 yfy0Var = (yfy0) t8Var;
            return H(yfy0Var.U0, (List) yfy0Var.i(wbcVar.d), zjn0Var);
        }
        if (!(t8Var instanceof ggy0)) {
            hhg1.o(t8Var, "Unknown message: ");
            return null;
        }
        int iC = l1d.C(i);
        if (iC == 1) {
            ggy0 ggy0Var = (ggy0) t8Var;
            return H(ggy0Var.U0, (List) ggy0Var.i(wbcVar.e), zjn0Var);
        }
        if (iC == 2) {
            ggy0 ggy0Var2 = (ggy0) t8Var;
            return H(ggy0Var2.V0, (List) ggy0Var2.i(wbcVar.f), zjn0Var);
        }
        if (iC == 3) {
            ggy0 ggy0Var3 = (ggy0) t8Var;
            return H(ggy0Var3.W0, (List) ggy0Var3.i(wbcVar.g), zjn0Var);
        }
        eg.m("Unsupported callable kind with property proto");
        return null;
    }

    public void release() {
        ((AudioRecord) this.b).release();
    }

    public List s(ihy0 ihy0Var) {
        hfy0 hfy0Var = ihy0Var.e;
        return H(hfy0Var.Z0, (List) hfy0Var.i(((wbc) this.b).c), (zjn0) ((o5) ihy0Var).b);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        if (singleEmitter.isDisposed()) {
            return;
        }
        oo5 oo5Var = (oo5) this.b;
        pn5 pn5Var = oo5Var.c;
        hh hhVar = new hh(oo5Var, (do5) this.c, singleEmitter, (byte) 16);
        f85 f85Var = new f85(singleEmitter, (byte) 19);
        Context context = pn5Var.a;
        pw40 pw40Var = pn5Var.d;
        if (pw40Var != null) {
            pw40Var.a();
        }
        nw40 nw40Var = pn5Var.b;
        mw40 mw40VarT = yoi1.T(nw40Var.a, context.getString(2131953512), context.getString(2131953513));
        CharSequence text = context.getText(2131953514);
        ln5 ln5Var = new ln5(hhVar, pn5Var, (byte) 0);
        mw40VarT.a = text;
        mw40VarT.c = ln5Var;
        CharSequence text2 = context.getText(2131953511);
        ln5 ln5Var2 = new ln5(f85Var, pn5Var, (byte) 1);
        mw40VarT.b = text2;
        mw40VarT.d = ln5Var2;
        mw40VarT.f = new mn5(f85Var, pn5Var, (byte) 0);
        mw40VarT.h = new nn5(pn5Var, (byte) 0);
        mw40VarT.e = true;
        pw40 pw40VarB = mw40VarT.b();
        ((pn5) ((lyc) new on5(pn5Var, pn5.class, "currentDialog", "getCurrentDialog()Lcom/spotify/legacyglue/dialogs/GlueDialog;", 0, (byte) 0)).receiver).d = pw40VarB;
        pw40VarB.b();
    }

    public boolean t(Object obj) {
        tv8 tv8Var = (tv8) obj;
        qxc0 qxc0Var = tv8Var.a;
        aw8 aw8Var = (aw8) this.c;
        if (!aw8Var.c.a.getResources().getBoolean(2131034136) || !aw8Var.d.a(tv8Var.b, tv8Var.c).equals(ebk0.a) || qxc0Var.t.c || !gyo1.H(qxc0Var.O0, dlc0.d)) {
            return false;
        }
        List<ll81> list = qxc0Var.N0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ll81 ll81Var : list) {
                if (u890.j(ll81Var.a, "mix-opt-out") || u890.j(ll81Var.a, "mix-remove-opt-out")) {
                    return false;
                }
            }
        }
        return !Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"));
    }

    public ow3 u() {
        return new ow3((Integer) this.b, (Integer) this.c, (byte) 20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, java.lang.Object] */
    public hfp1 v(vun vunVar) {
        j5 i5w0Var;
        ndn1 ndn1Var = (ndn1) this.b;
        ndn1Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", ndn1Var.d);
        bundle.putString("calling_package_name", ndn1Var.c);
        bg11 bg11Var = (bg11) vunVar.b;
        if (bg11Var.isEmpty()) {
            i5w0Var = j5.a;
        } else {
            hql1 hql1Var = new hql1((byte) 3);
            int i = bg11Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                ((v280) hql1Var.a).c((Integer) bg11Var.get(i2));
            }
            i5w0Var = new i5w0(new ClusterMetadata(hql1Var));
        }
        if (i5w0Var.c()) {
            bundle.putParcelable("cluster_metadata", i5w0Var.b());
            ClusterMetadata clusterMetadata = (ClusterMetadata) i5w0Var.b();
            clusterMetadata.getClass();
            Bundle bundle2 = new Bundle();
            bg11 bg11Var2 = clusterMetadata.a;
            if (!bg11Var2.isEmpty()) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.addAll(bg11Var2);
                bundle2.putIntegerArrayList("A", arrayList);
            }
            bundle.putBundle("cluster_metadata_v2", bundle2);
        }
        return ndn1Var.b(new sso1(ndn1Var, bundle, (byte) 2)).k(l5u.a, new bym1(this, vunVar, (byte) 9));
    }

    public hfp1 w() {
        rjn rjnVar = new rjn((byte) 23);
        ((v280) rjnVar.b).c(3);
        return v(new vun(rjnVar));
    }

    public hfp1 x() {
        rjn rjnVar = new rjn((byte) 23);
        ((v280) rjnVar.b).c(1);
        return v(new vun(rjnVar));
    }

    public hfp1 y() {
        rjn rjnVar = new rjn((byte) 23);
        ((v280) rjnVar.b).c(8);
        return v(new vun(rjnVar));
    }

    public CompletableSubscribeOn z(qvx0 qvx0Var) {
        return new CompletableFromAction(new bm0(this, qvx0Var, (byte) 10)).s((Scheduler) this.b);
    }

    public /* synthetic */ km3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public km3(i8h1 i8h1Var) {
        this.a = (byte) 11;
        this.b = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.c = new rrk0((byte) 2);
    }

    public km3() {
        this.a = (byte) 19;
        this.b = new idd1(df.h);
        this.c = new idd1(new i26(this, (byte) 16));
    }

    public km3(AudioRecord audioRecord) {
        this.a = (byte) 23;
        this.b = audioRecord;
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public km3(zim0 zim0Var, poj0 poj0Var, wbc wbcVar) {
        this.a = (byte) 7;
        this.b = wbcVar;
        this.c = new ow3(zim0Var, poj0Var, (byte) 6);
    }

    public km3(qm3 qm3Var, zs3 zs3Var, edr0 edr0Var) {
        this.a = (byte) 1;
        this.b = qm3Var;
        this.c = edr0Var;
    }

    public km3(yze1 yze1Var, x5j1 x5j1Var) {
        this.a = (byte) 26;
        yyp0 yyp0Var = ((w5b1) x5j1Var.b).d;
        yyp0Var.getClass();
        cxc cxcVarC = yyp0Var.d(new nrj0(1, (byte) 24)).c();
        this.b = yze1Var;
        this.c = cxcVarC;
    }

    public km3(n9x0 n9x0Var, Observable observable, Scheduler scheduler) {
        this.a = (byte) 25;
        this.b = observable;
        this.c = scheduler;
    }

    public km3(rf01 rf01Var) {
        m980 m980Var;
        this.a = (byte) 6;
        this.b = rf01Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = gt50.a;
        } else {
            if (!gt50.a) {
                if (i != 26 && i != 27) {
                    m980Var = new m980((byte) 12, true);
                } else {
                    m980Var = new m4c((byte) 14);
                }
            }
            this.c = m980Var;
        }
        m980Var = new m980((byte) 12, false);
        this.c = m980Var;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new pc6((Disposable) this.c, ((BehaviorSubject) this.b).subscribe(new qc6(observableEmitter, (byte) 0)), (byte) 0));
    }

    public km3(aw8 aw8Var) {
        this.a = (byte) 28;
        this.c = aw8Var;
        this.b = aw8Var.g;
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        z310 z310Var = (z310) obj2;
        List list = z310Var.a;
        r9c r9cVar = (r9c) this.b;
        g74 g74Var = (g74) this.c;
        smc0 smc0VarN = k4p1.n();
        if (u890.j(r9cVar.b, "com.spotify.your-library")) {
            smc0VarN.add(dn3.c(g74Var.a, map, list, list.isEmpty(), 16));
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(u310.b((u310) it.next(), null, null, null, 0, null, null, 0, null, g74Var.b.getString(2131952353), null, null, null, -134217729, 15));
        }
        smc0VarN.addAll(arrayList);
        return z310.a(z310Var, k4p1.k(smc0VarN), (f410) null, 14);
    }
}
