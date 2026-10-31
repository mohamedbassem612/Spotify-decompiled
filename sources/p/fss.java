package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.widget.ImageView;
import androidx.car.app.navigation.model.Maneuver;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.a;
import app.p000rive.semantics.SemanticState;
import com.facebook.FacebookException;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fss implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fss(ip00 ip00Var, int i) {
        this.a = (byte) 19;
        this.b = ip00Var;
    }

    private final void a() {
        dt30 dt30Var = (dt30) this.b;
        synchronized (dt30Var.c) {
            dt30Var.e = false;
            if (dt30Var.d == 0 && !dt30Var.f) {
                dt30Var.b.invoke();
                dt30Var.b();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    @Override // java.lang.Runnable
    public final void run() throws FacebookException {
        pna1 pna1Var;
        n0g1 n0g1Var;
        ServiceInfo serviceInfo;
        Object obj;
        byte b = 0;
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) ((p811) this.b).a;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 1:
                iss issVar = (iss) this.b;
                th30.P(2);
                Iterator it = issVar.c.iterator();
                while (it.hasNext()) {
                    ((foa1) ((jss) it.next()).b).c(issVar);
                }
                return;
            case 2:
                xi30.b(4, (ArrayList) this.b);
                return;
            case 3:
                ((d4d1) this.b).close();
                return;
            case 4:
                rts rtsVar = (rts) this.b;
                rtsVar.t = true;
                rtsVar.c();
                return;
            case 5:
                exs exsVar = (exs) this.b;
                if (!exsVar.g.A0 || Build.VERSION.SDK_INT < 32 || (pna1Var = exsVar.i) == null || !pna1Var.b || (n0g1Var = exsVar.a) == null) {
                    return;
                }
                n0g1Var.e(null);
                return;
            case 6:
                ((uoj1) this.b).h();
                return;
            case 7:
                ((azs) this.b).h.n();
                return;
            case 8:
                ((a) this.b).i.e();
                return;
            case 9:
                ((pzc) this.b).cancel(true);
                return;
            case 10:
                ((ppt) this.b).n1();
                return;
            case 11:
                ((MaybeObserver) this.b).onComplete();
                return;
            case 12:
                ((gnc1) this.b).onComplete();
                return;
            case 13:
                hev hevVar = (hev) this.b;
                hevVar.f = true;
                hevVar.c();
                return;
            case 14:
                jev jevVar = (jev) ((yjq) this.b).e;
                if (jevVar != null) {
                    Iterator it2 = jevVar.values().iterator();
                    while (it2.hasNext()) {
                        ((n3d1) it2.next()).b();
                    }
                    return;
                }
                return;
            case 15:
                ((ImageView) this.b).sendAccessibilityEvent(SemanticState.Focused);
                return;
            case 16:
                ((EmojiView) this.b).sendAccessibilityEvent(SemanticState.Focused);
                return;
            case 17:
                mv2 mv2Var = (mv2) this.b;
                Intent intent = new Intent("androidx.xr.projected.ACTION_ENGAGEMENT_BIND");
                Context context = (Context) mv2Var.d;
                ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 131072);
                if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                    return;
                }
                String str = serviceInfo.packageName;
                str.getClass();
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
                    if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                        return;
                    }
                    intent.setPackage(str);
                    context.bindService(intent, (v7y) mv2Var.g, 1);
                    return;
                } catch (PackageManager.NameNotFoundException | SecurityException unused) {
                    return;
                }
            case 18:
                yo00 yo00Var = (yo00) this.b;
                t01 t01Var = yo00Var.C;
                Context context2 = yo00Var.e;
                String str2 = zoi1.a;
                int iGenerateAudioSessionId = kw7.u(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                t01Var.getClass();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ((wdd1) t01Var.c).a.getLooper()) {
                    obj = t01Var.e;
                } else {
                    dm5.y(looperMyLooper == ((wdd1) t01Var.b).a.getLooper());
                    obj = t01Var.f;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    t01Var.f = numValueOf;
                    wy9 wy9Var = new wy9(t01Var, numValueOf, b);
                    wdd1 wdd1Var = (wdd1) t01Var.c;
                    if (wdd1Var.a.getLooper().getThread().isAlive()) {
                        wdd1Var.f(wy9Var);
                    }
                    wdd1 wdd1Var2 = yo00Var.l.g;
                    vdd1 vdd1VarB = wdd1Var2.b(40, iGenerateAudioSessionId, 0);
                    Handler handler = wdd1Var2.a;
                    Message message = vdd1VarB.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    vdd1VarB.a();
                    return;
                }
                return;
            case 19:
                pfr pfrVar = ((ip00) this.b).W0;
                pfrVar.a0(pfrVar.I(), 1034, new n7o((byte) 20));
                return;
            case 20:
                try {
                    ip00.g((sbu0) this.b);
                    return;
                } catch (ExoPlaybackException e) {
                    oon1.w("Unexpected error delivering message on external thread.", e);
                    eg.j(e);
                    return;
                }
            case 21:
                sa10 sa10Var = (sa10) this.b;
                ((roj1) sa10Var.c).f(new qa10(sa10Var, (byte) 5), true);
                return;
            case 22:
                eg10.g((eg10) this.b);
                return;
            case 23:
                si0.a((Intent) this.b);
                return;
            case 24:
                q930 q930Var = (q930) this.b;
                synchronized (q930Var.c) {
                    try {
                        if (q930Var.g == null) {
                            return;
                        }
                        try {
                            oa30 oa30VarC = q930Var.c();
                            int i = oa30VarC.f;
                            if (i == 2) {
                                synchronized (q930Var.c) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = pif1.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context3 = q930Var.a;
                                oa30[] oa30VarArr = {oa30VarC};
                                k9 k9Var = s1h1.a;
                                Trace.beginSection("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceE0 = s1h1.a.E0(context3, oa30VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferB = jhc1.B(q930Var.a, oa30VarC.a);
                                    if (mappedByteBufferB == null || typefaceE0 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        zsc zscVar = new zsc(typefaceE0, w0h1.E(mappedByteBufferB));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (q930Var.c) {
                                            try {
                                                who1 who1Var = q930Var.g;
                                                if (who1Var != null) {
                                                    who1Var.w(zscVar);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        q930Var.b();
                                        return;
                                    } catch (Throwable th2) {
                                        int i3 = pif1.a;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                int i4 = pif1.a;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (q930Var.c) {
                                try {
                                    who1 who1Var2 = q930Var.g;
                                    if (who1Var2 != null) {
                                        who1Var2.v(th5);
                                    }
                                    q930Var.b();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 25:
                Iterator it3 = ((th30) this.b).o.iterator();
                while (it3.hasNext()) {
                    ((oh30) it3.next()).getClass();
                }
                return;
            case 26:
                a();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((ScheduledFuture) this.b).cancel(true);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((mzc) this.b).b((Object) null);
                return;
            default:
                ((kv40) this.b).m();
                return;
        }
    }

    public /* synthetic */ fss(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public /* synthetic */ fss(azs azsVar, zys zysVar) {
        this.a = (byte) 7;
        this.b = azsVar;
    }

    public /* synthetic */ fss(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
