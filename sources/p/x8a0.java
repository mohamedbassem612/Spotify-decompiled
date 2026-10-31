package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.BundlerException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCallable;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class x8a0 implements j9a0, v0i, BiFunction, Function, plh0, e9d0, wlh0, ezh0, SingleOnSubscribe, uh7, e2i0, akl, a420, qy70, n181, nzc, a421, mnm {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x8a0(IOnDoneCallback iOnDoneCallback, Exception exc, String str) {
        this.a = (byte) 28;
        this.b = iOnDoneCallback;
        this.c = exc;
    }

    public void a(rlh0 rlh0Var) {
        rlh0Var.x((jbu0) this.b, (ebu0) this.c);
    }

    public void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 16:
                h2i0 h2i0Var = (h2i0) obj3;
                k0g1 k0g1VarB = (k0g1) obj2;
                ffu0 ffu0Var = (ffu0) obj;
                j380 j380Var = k0g1VarB.H;
                if (!j380Var.isEmpty()) {
                    j0g1 j0g1VarC = k0g1VarB.a().c();
                    mjh1 mjh1VarK = j380Var.o().k();
                    while (mjh1VarK.hasNext()) {
                        h0g1 h0g1Var = (h0g1) mjh1VarK.next();
                        pnf1 pnf1Var = (pnf1) h2i0Var.o.h.get(h0g1Var.a.b);
                        if (pnf1Var == null || h0g1Var.a.a != pnf1Var.a) {
                            j0g1VarC.a(h0g1Var);
                        } else {
                            j0g1VarC.a(new h0g1(pnf1Var, h0g1Var.b));
                        }
                    }
                    k0g1VarB = j0g1VarC.b();
                }
                ffu0Var.E0(k0g1VarB);
                break;
            case 17:
                ixh0 ixh0Var = (ixh0) obj2;
                fzh0 fzh0Var = (fzh0) ((h2i0) obj3).l.get();
                if (fzh0Var != null && !fzh0Var.p()) {
                    fzh0Var.m(ixh0Var, false);
                    break;
                }
                break;
            case 18:
                h2i0 h2i0Var2 = (h2i0) obj3;
                Surface surface = (Surface) obj2;
                ffu0 ffu0Var2 = (ffu0) obj;
                ((fzh0) h2i0Var2.l.get()).getClass();
                if (surface != null) {
                    f2i0 f2i0Var = new f2i0(surface);
                    h2i0Var2.w = f2i0Var;
                    ffu0Var2.I(f2i0Var);
                } else {
                    ffu0Var2.I(null);
                    h2i0Var2.w = null;
                }
                break;
            default:
                mgc mgcVar = (mgc) obj3;
                ((w2i0) obj).F(mgcVar.b, (p2i0) mgcVar.c, (qqh0) obj2);
                break;
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                p2r p2rVar = new p2r((efe0) obj3, (String) obj2, (byte) 3);
                int i = Flowable.a;
                return new FlowableFromCallable(p2rVar);
            case 11:
                kxh0 kxh0Var = (kxh0) obj3;
                String str = (String) obj2;
                vih0 vih0Var = (vih0) obj;
                if (vih0Var.a().contains(kxh0Var)) {
                    return vih0Var.f();
                }
                throw new RuntimeException("Callback handler for the package " + str + " does not support an expected action " + kxh0Var);
            default:
                return ((lxh0) obj).j((Bundle) obj2, (String) obj3);
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        byte b = 0;
        switch (this.a) {
            case 26:
                erw0 erw0Var = (erw0) this.b;
                d5d d5dVar = (d5d) this.c;
                synchronized (erw0Var.a) {
                    dce dceVarJ = poz0.J(jx30.a(e280.c), new pjq0(new mwv0(d5dVar, (byte) 13), (byte) 23), n5u.a());
                    xmu0 xmu0Var = new xmu0(mzcVar, d5dVar, (byte) 16);
                    dceVarJ.b(new nx30(dceVarJ, xmu0Var, b), n5u.a());
                }
                return "ProcessCameraProvider-initializeCameraX";
            default:
                kdy0 kdy0Var = (kdy0) this.b;
                Intent intent = (Intent) this.c;
                kdy0.c(intent);
                xjn1 xjn1Var = (xjn1) kdy0Var.e;
                hyy0 hyy0Var = new hyy0(kdy0Var, mzcVar, (byte) 23);
                Executor executor = (Executor) kdy0Var.d;
                Context context = (Context) kdy0Var.c;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    context.sendBroadcast(kdy0.f(intent, new qy11(mzcVar, 1), (String) null, "com.google.android.wearable.app"));
                } else {
                    hfp1 hfp1VarG = xjn1Var.g();
                    hfp1VarG.d(executor, new jf11(new kl4(hyy0Var, mzcVar, xjn1Var, kdy0Var, intent, (byte) 3), (byte) 1));
                    hfp1VarG.c(executor, new py11(hyy0Var, (byte) 0));
                }
                return rih1.a;
        }
    }

    public void b(File file) {
        cim0 cim0Var = (cim0) this.b;
        cim0Var.g = (vhm0) this.c;
        cim0Var.f = file;
        Runnable runnable = cim0Var.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean c() {
        kov0 kov0Var = (kov0) this.b;
        zb9 zb9Var = (zb9) this.c;
        boolean z = kov0Var.q;
        if (z) {
            return z;
        }
        kov0Var.h();
        long jA = zb9.a(kov0Var.o, zb9Var.a);
        zb9Var.a = jA;
        boolean z2 = !kov0Var.g(kov0Var.n, jA + zb9Var.b);
        kov0Var.q = z2;
        return z2;
    }

    public Object call() {
        try {
            ((IOnDoneCallback) this.b).onFailure(new tcc(new FailureResponse((Exception) this.c)));
            return null;
        } catch (BundlerException unused) {
            return null;
        }
    }

    public Object d(Task task) {
        t8r0 t8r0Var = (t8r0) this.b;
        String str = (String) this.c;
        synchronized (t8r0Var) {
            ((y36) t8r0Var.b).remove(str);
        }
        return task;
    }

    public void e(ry70 ry70Var) {
        ((qy70) this.c).e((zud0) this.b);
    }

    public void f(kh70 kh70Var, int i) {
        byte b = this.a;
        Object obj = this.c;
        rlh0 rlh0Var = (rlh0) this.b;
        switch (b) {
            case 4:
                k2u0 k2u0Var = (k2u0) obj;
                xlh0 xlh0Var = rlh0Var.c;
                Bundle bundle = new Bundle();
                bundle.putFloat(k2u0.e, k2u0Var.a);
                bundle.putFloat(k2u0.f, k2u0Var.b);
                kh70Var.M(xlh0Var, i, bundle);
                break;
            case 5:
                kh70Var.w0(rlh0Var.c, i, (Surface) obj);
                break;
            case 6:
            default:
                kh70Var.I(rlh0Var.c, i, ((tqh0) obj).c(rlh0Var.o()));
                break;
            case 7:
                kh70Var.K(rlh0Var.c, i, ((k0g1) obj).c());
                break;
        }
    }

    public void h(hxh0 hxh0Var, int i) {
        boolean zC;
        iqh0 iqh0Var = (iqh0) this.b;
        String str = (String) this.c;
        synchronized (iqh0Var) {
            zC = iqh0Var.K.c(hxh0Var, str);
        }
        if (zC) {
            hxh0Var.m(i, str);
        }
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                return fzh0Var.t(ixh0Var, (pa61) obj2, (Bundle) obj);
            case 19:
                return fzh0Var.p() ? fc11.J(new ch61(-100)) : zoi1.m0((n8d0) ((e2i0) obj2).i(fzh0Var, ixh0Var, i), new y1i0(fzh0Var, ixh0Var, (czh0) obj, (byte) 0));
            default:
                return fzh0Var.p() ? fc11.J(new ch61(-100)) : zoi1.m0((n8d0) ((e2i0) obj2).i(fzh0Var, ixh0Var, i), new y1i0(fzh0Var, ixh0Var, (c2i0) obj, (byte) 1));
        }
    }

    public void invoke(Object obj) {
        ((o8u0) obj).J(((Integer) this.c).intValue(), (yoh0) this.b);
    }

    public Object m(dxy dxyVar) {
        String str = (String) this.b;
        k220 k220Var = (k220) this.c;
        Context context = (Context) dxyVar.a(Context.class);
        String strValueOf = "";
        switch (k220Var.a) {
            case 3:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                }
                break;
            case 4:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 != null) {
                    strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                }
                break;
            case 5:
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    strValueOf = "tv";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    strValueOf = "watch";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    strValueOf = "auto";
                } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    strValueOf = "embedded";
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                }
                break;
        }
        return new h19(str, strValueOf);
    }

    public void run() throws IOException {
        int i;
        final i9a0 i9a0Var = (i9a0) this.b;
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        ReadableByteChannel readableByteChannel = i9a0Var.n;
        if (readableByteChannel != null) {
            i9a0Var.w++;
            i = readableByteChannel.read(byteBuffer);
        } else {
            i = -1;
        }
        f9a0 f9a0Var = i9a0Var.a;
        if (i != -1) {
            v3i1 v3i1Var = i9a0Var.o;
            f9a0Var.getClass();
            f9a0Var.b(new k65(f9a0Var, v3i1Var, byteBuffer, (byte) 9), "onReadCompleted");
            return;
        }
        ReadableByteChannel readableByteChannel2 = i9a0Var.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (i9a0Var.f.compareAndSet(5, 7)) {
            final byte b = 2;
            i9a0Var.c(new Runnable() { // from class: p.b9a0
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    i9a0 i9a0Var2 = i9a0Var;
                    switch (b2) {
                        case 0:
                            ReadableByteChannel readableByteChannel3 = i9a0Var2.n;
                            if (readableByteChannel3 != null) {
                                try {
                                    readableByteChannel3.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                i9a0Var2.n = null;
                            }
                            break;
                        case 1:
                            i9a0Var2.x++;
                            break;
                        case 2:
                            g9a0 g9a0Var = i9a0Var2.r;
                            if (g9a0Var != null) {
                                try {
                                    if (g9a0Var.k != null && g9a0Var.j.compareAndSet(false, true)) {
                                        g9a0Var.k.close();
                                    }
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                            HttpURLConnection httpURLConnection = i9a0Var2.q;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                i9a0Var2.q = null;
                            }
                            break;
                        default:
                            i9a0Var2.e.add(i9a0Var2.m);
                            i9a0Var2.c(new z8a0(i9a0Var2, new a9a0(i9a0Var2, (byte) 1), (byte) 2), "fireOpenConnection");
                            break;
                    }
                }
            }, "fireDisconnect");
            v3i1 v3i1Var2 = i9a0Var.o;
            f9a0Var.getClass();
            f9a0Var.c(new e9a0(f9a0Var, v3i1Var2, (byte) 1), "onSucceeded");
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        sxh0 sxh0Var = (sxh0) this.b;
        String str = (String) this.c;
        zih0 zih0Var = sxh0Var.a;
        tn31 tn31Var = (tn31) zih0Var.g.remove(str);
        if (tn31Var == null) {
            tn31Var = new tn31("default", (String) null, (String) null, false, false, (t380) null, (Bundle) null, 254);
        }
        zih0Var.b(str, tn31Var);
        zih0Var.a(new vsr0(str), new vhh0(singleEmitter, str, (byte) 1));
    }

    public /* synthetic */ x8a0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ x8a0(boolean z, pa61 pa61Var, Bundle bundle) {
        this.a = (byte) 15;
        this.b = pa61Var;
        this.c = bundle;
    }

    /* JADX INFO: renamed from: call, reason: collision with other method in class */
    public n8d0 m718call() {
        return ((upa0) this.b).j((kph0) this.c);
    }

    public Object apply(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 2:
                return ((vvc0) obj4).d((wsc0) obj3, (rp91) obj, (Map) obj2);
            default:
                poj0 poj0Var = (poj0) obj4;
                Resources resources = (Resources) obj3;
                PlayerState playerState = (PlayerState) obj;
                if (!((th61) obj2).b) {
                    return new nmr0((Object) null, (Object) null);
                }
                return new nmr0(playerState, new bnj0(resources, (Map) poj0Var.e, (byte) 10).v(playerState));
        }
    }
}
