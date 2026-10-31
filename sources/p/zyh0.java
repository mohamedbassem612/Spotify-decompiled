package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.serialization.BundlerException;
import androidx.media3.common.VideoFrameProcessingException;
import app.p000rive.RiveKt$RiveSurfaceHost$3$1$1$1;
import app.p000rive.RiveTextureView;
import app.p000rive.runtime.kotlin.renderers.RenderContextEvent;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zyh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zyh0(x8c0 x8c0Var, z321 z321Var, String str) {
        this.a = (byte) 20;
        this.b = x8c0Var;
        this.c = z321Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01db  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    @Override // java.lang.Runnable
    public final void run() {
        ch61 ch61Var;
        int i = 3;
        byte b = 1;
        switch (this.a) {
            case 0:
                fzh0 fzh0Var = (fzh0) this.b;
                PendingIntent pendingIntent = (PendingIntent) this.c;
                fzh0Var.u = pendingIntent;
                h2i0 h2i0Var = fzh0Var.g;
                b380 b380VarM = h2i0Var.m.m();
                for (int i2 = 0; i2 < b380VarM.size(); i2++) {
                    ixh0 ixh0Var = (ixh0) b380VarM.get(i2);
                    if (ixh0Var.b >= 3 && h2i0Var.m.u(ixh0Var)) {
                        fzh0Var.c(ixh0Var, new ulh0(pendingIntent));
                        if (fzh0Var.o(ixh0Var)) {
                            try {
                                fzh0Var.h.f.a(0, pendingIntent);
                            } catch (RemoteException e) {
                                oon1.w("Exception in using media1 API", e);
                            }
                        }
                    }
                }
                return;
            case 1:
                fzh0 fzh0Var2 = (fzh0) this.b;
                ke61 ke61Var = (ke61) this.c;
                e0i0 e0i0Var = fzh0Var2.h;
                b380 b380VarM2 = fzh0Var2.g.m.m();
                for (int i3 = 0; i3 < b380VarM2.size(); i3++) {
                    ixh0 ixh0Var2 = (ixh0) b380VarM2.get(i3);
                    boolean zO = fzh0Var2.o(ixh0Var2);
                    int i4 = ixh0Var2.b;
                    if (!zO && (i4 == 0 || ixh0Var2.c >= 4)) {
                        if (fzh0Var2.o(ixh0Var2) || i4 == 0) {
                            try {
                                e0i0Var.f.h(0, ke61Var);
                            } catch (RemoteException e2) {
                                oon1.w("Exception in using media1 API", e2);
                            }
                        } else {
                            fzh0Var2.c(ixh0Var2, new c8d0(ke61Var, (byte) 22));
                        }
                    }
                }
                try {
                    e0i0Var.f.h(0, ke61Var);
                    return;
                } catch (RemoteException e3) {
                    oon1.w("Exception in using media1 API", e3);
                    return;
                }
            case 2:
                fzh0 fzh0Var3 = (fzh0) this.b;
                b380 b380Var = (b380) this.c;
                fzh0Var3.D = b380Var;
                e0i0 e0i0Var2 = fzh0Var3.h;
                e0i0Var2.u = b380Var;
                e0i0Var2.m();
                fzh0Var3.d(new c8d0(b380Var, (byte) 21));
                return;
            case 3:
                fzh0 fzh0Var4 = (fzh0) this.b;
                Bundle bundle = (Bundle) this.c;
                fzh0Var4.E = bundle;
                fzh0Var4.d(new vlh0(bundle, b));
                return;
            case 4:
                s8d0 s8d0Var = (s8d0) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    ch61Var = (ch61) s8d0Var.get();
                    dm5.s(ch61Var, "SessionResult must not be null");
                    break;
                } catch (InterruptedException e4) {
                    e = e4;
                    oon1.I("Custom command failed", e);
                    ch61Var = new ch61(-1);
                } catch (CancellationException e5) {
                    oon1.I("Custom command cancelled", e5);
                    ch61Var = new ch61(1);
                } catch (ExecutionException e6) {
                    e = e6;
                    oon1.I("Custom command failed", e);
                    ch61Var = new ch61(-1);
                }
                resultReceiver.send(ch61Var.a, ch61Var.b);
                return;
            case 5:
                iqh0 iqh0Var = (iqh0) this.b;
                Intent intent = (Intent) this.c;
                ixh0 ixh0VarG = iqh0Var.g();
                if (ixh0VarG == null) {
                    ixh0VarG = d1i0.j(intent);
                }
                if (iqh0Var.u(ixh0VarG, intent)) {
                    return;
                }
                oon1.s("Ignored unrecognized media button intent.");
                return;
            case 6:
                ((akl) this.b).accept((w2i0) this.c);
                return;
            case 7:
                ((qy70) this.c).e((ekj0) this.b);
                return;
            case 8:
                View view = (View) this.b;
                koj0 koj0Var = (koj0) this.c;
                if (dhn.a.contains(koj0.class)) {
                    return;
                }
                try {
                    if (view instanceof EditText) {
                        koj0Var.b(view);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    dhn.a(koj0.class, th);
                    return;
                }
            case 9:
                ((mym0) this.b).d.a((VideoFrameProcessingException) this.c);
                return;
            case 10:
                v8o0 v8o0Var = (v8o0) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new jlb(v8o0Var, (byte) 14), intentFilter);
                return;
            case 11:
                jlb jlbVar = (jlb) this.b;
                Context context2 = (Context) this.c;
                v8o0 v8o0Var2 = (v8o0) jlbVar.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i = type != 9 ? 8 : 7;
                            } else {
                                i = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i != 5) {
                    v8o0Var2.d(i);
                    return;
                } else {
                    mb4.i(context2, v8o0Var2);
                    return;
                }
            case 12:
                ysp0 ysp0Var = (ysp0) this.b;
                em61 em61Var = (em61) this.c;
                try {
                    ysp0Var.b.release();
                    em61Var.u((Object) null);
                    return;
                } catch (Throwable th2) {
                    em61Var.v(th2);
                    return;
                }
            case 13:
                ((ou51) this.b).i((l8q0) this.c, rih1.a);
                return;
            case 14:
                ((v1k1) this.b).b((z1k1) this.c);
                return;
            case 15:
                ((haw0) this.b).a((j4d1) this.c);
                return;
            case 16:
                ((amw0) this.b).a.O0.a((j4d1) this.c);
                return;
            case 17:
                lsw0 lsw0Var = (lsw0) this.b;
                uvl1 uvl1Var = (uvl1) this.c;
                synchronized (lsw0Var.k) {
                    try {
                        Iterator it = lsw0Var.j.iterator();
                        while (it.hasNext()) {
                            ((em00) it.next()).a(uvl1Var, false);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 18:
                ((xjx0) this.b).H((fn51) this.c);
                return;
            case 19:
                syy0 syy0Var = (syy0) this.b;
                vqh0 vqh0Var = (vqh0) this.c;
                syy0Var.getClass();
                vqh0Var.run();
                syy0Var.a.overridePendingTransition(0, 0);
                return;
            case 20:
                x8c0 x8c0Var = (x8c0) this.b;
                z321 z321Var = (z321) this.c;
                if (x8c0Var != null) {
                    try {
                        if (x8c0Var.b().a(w8c0.c)) {
                            z321Var.b();
                        } else {
                            Objects.toString(z321Var);
                        }
                    } catch (BundlerException unused2) {
                        return;
                    }
                } else {
                    Objects.toString(z321Var);
                }
                return;
            case 21:
                ((iu30) this.b).invoke((RenderContextEvent) this.c);
                return;
            case 22:
                tl21 tl21Var = (tl21) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    jog1.a().d.f(tl21Var.h.a.b(xnw0.c), 1);
                    break;
                } catch (Exception unused3) {
                }
                countDownLatch.countDown();
                return;
            case 23:
                ((lm5) this.b).o((Typeface) this.c);
                return;
            case 24:
                RiveKt$RiveSurfaceHost$3$1$1$1.onSurfaceTextureUpdated$lambda$0((tob1) this.b, (RiveTextureView) this.c);
                return;
            case 25:
                ((ohd) this.b).C((lm41) this.c, rih1.a);
                return;
            case 26:
                ap41 ap41Var = (ap41) this.b;
                k8c0 k8c0Var = (k8c0) this.c;
                tac0 tac0Var = ap41Var.b;
                if (tac0Var.i.a(w8c0.b)) {
                    if (k8c0Var == k8c0.ON_DESTROY) {
                        ap41Var.c.getClass();
                    }
                    tac0Var.g(k8c0Var);
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((q561) this.b).i((Bitmap) this.c);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((ez81) ((w360) this.b).b).d.a((VideoFrameProcessingException) this.c);
                return;
            default:
                kxa1 kxa1Var = (kxa1) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                int i5 = kxa1.O0;
                SurfaceTexture surfaceTexture2 = kxa1Var.g;
                Surface surface = kxa1Var.h;
                Surface surface2 = new Surface(surfaceTexture);
                kxa1Var.g = surfaceTexture;
                kxa1Var.h = surface2;
                Iterator it2 = kxa1Var.a.iterator();
                while (it2.hasNext()) {
                    ((so00) it2.next()).a.D1(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zyh0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
