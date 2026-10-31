package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.blend.tastematch.BlendTasteMatchActivity;
import com.spotify.browse.clientnative.mobius.Model;
import com.spotify.concurrency.async.Scheduler;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewSpinner;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.messages.ConfigurationFetchedNonAuth;
import com.spotify.messages.NebulaRequestNonAuth;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplaying.carousel.CarouselView;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventResponse;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lo9 implements Function, waa, is31, y8c, cst0, qiw, cke, b2i, k1q0, ya, Scheduler, fsc1, BiConsumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public lo9(luk lukVar) {
        this.a = (byte) 25;
        this.b = new zb4(false, lukVar);
    }

    public static /* synthetic */ HashMap a(lo9 lo9Var) {
        return (HashMap) lo9Var.b;
    }

    public static void m(lo9 lo9Var, long j, int i, int i2, String str, String str2, j120 j120Var) {
        h5o0 h5o0VarN = NebulaRequestNonAuth.n();
        h5o0VarN.s(j);
        h5o0VarN.v(i);
        h5o0VarN.q(str);
        h5o0VarN.t(i2);
        h5o0VarN.r(rwq.s(j120Var));
        h5o0VarN.u();
        if (str2 != null) {
            h5o0VarN.n(str2);
        }
        ((nb00) lo9Var.b).c("NebulaRequestNonAuth", h5o0VarN.build().toByteArray());
    }

    public void accept(Object obj, Object obj2) {
        nj3 nj3Var = (nj3) obj;
        if ((nj3Var instanceof kj3) || (nj3Var instanceof lj3)) {
            aeu0.a((Context) ((gal) this.b).b);
        } else {
            if ((nj3Var instanceof mj3) || nj3Var == null) {
                return;
            }
            eg.o();
        }
    }

    public Object apply(Object obj) {
        Object objJust;
        byte b = this.a;
        lnm lnmVar = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() ? Flowable.I(spq0Var.b()).j((ac10) obj2) : Flowable.I(new ub10(0, 0));
            case 2:
                ReplacePendingEventResponse replacePendingEventResponse = (ReplacePendingEventResponse) obj;
                return replacePendingEventResponse.o() ? Single.just((doa) obj2) : Single.error(new m9("Can't replace pending event", replacePendingEventResponse.n()));
            case 3:
                if (((sy21) obj).a.Q0) {
                    Single map = rqt0.F(o6x.a, new f0b((g0b) obj2, lnmVar, (byte) 1)).map(mpi1.Z);
                    map.getClass();
                    return map;
                }
                Single singleJust = Single.just(new ajo(3));
                singleJust.getClass();
                return singleJust;
            case 6:
                ly21 ly21Var = (py21) obj;
                rs7 rs7Var = new rs7((d5c) obj2, (byte) 14);
                if (ly21Var instanceof ly21) {
                    objJust = rs7Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objJust = Single.just(bjo.a);
                }
                return (SingleSource) objJust;
            case 10:
                return new CompletableFromAction(new bm0((dma1) obj, (l5d) obj2, (byte) 14));
            default:
                return new MaybeToSingle(new MaybeCreate(new cfd((Object) ((z0h) obj2).d, (Object) ((n0h) obj).a, (byte) 20)).h(), 0).map(rzs0.P0);
        }
    }

    public Object b(jce0 jce0Var, boolean z, lnm lnmVar) {
        return new Model("test-request-id", "test-page-id", ((k9c) this.b).a, w7x.a, "test", false, 32, null);
    }

    public dqo c() {
        return new dqo(this);
    }

    public hfp1 e(Object obj) {
        jm61 jm61Var = (jm61) obj;
        gal galVar = (gal) this.b;
        if (jm61Var == null) {
            return o0c.z((Object) null);
        }
        jhn jhnVar = (jhn) galVar.c;
        jhnVar.g();
        jhnVar.m.l((String) null, (djn) jhnVar.e.b);
        jhnVar.q.d((Object) null);
        return o0c.z((Object) null);
    }

    public Intent f(Intent intent) {
        int i = BlendTasteMatchActivity.h1;
        Intent intent2 = new Intent(((Context) ((b72) this.b).b).getApplicationContext(), (Class<?>) BlendTasteMatchActivity.class);
        intent2.setFlags(268435456);
        intent2.setData(intent.getData());
        Set set = s4b1.f;
        intent2.putExtra("key-invitation-token", uic.x(intent.getDataString()).j());
        return intent2;
    }

    public void g(lal lalVar) {
        boolean zJ = lalVar.j();
        px40 px40Var = (xaa) this.b;
        if (zJ) {
            px40Var.m((zf70) null, px40Var.z);
            return;
        }
        csj1 csj1Var = ((xaa) px40Var).p;
        if (csj1Var != null) {
            csj1Var.e(lalVar);
        }
    }

    public af5 h(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1891471103);
        j2i j2iVar = (j2i) this.b;
        ye5 ye5Var = new ye5();
        j2iVar.invoke(ye5Var, x340Var, 8);
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }

    public bst0 i(i1z i1zVar, lnn1 lnn1Var, h131 h131Var) {
        cce cceVar = (cce) this.b;
        int i = ((jma) cceVar.b).i(i1zVar, dsa0.o(i1zVar.k, i1zVar.l), h131Var);
        String str = i1zVar.a;
        boolean zD = cce.D(lnn1Var, str, (lik1) cceVar.c);
        boolean z = lnn1Var instanceof i2z;
        i2z i2zVar = z ? (i2z) lnn1Var : null;
        boolean z2 = false;
        if (i2zVar != null) {
            String str2 = i2zVar.c;
            if (str2.length() > 0 && str2.equals(str)) {
                i2z i2zVar2 = z ? (i2z) lnn1Var : null;
                if (i2zVar2 != null ? i2zVar2.g : false) {
                    z2 = true;
                }
            }
        }
        return new bst0(i, ((long) cce.s(lnn1Var)) * 1000, zD, z2);
    }

    public boolean isCurrentThread() {
        return ((d8n) this.b).a.isCurrentThread();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object j(MediaMetadataRetriever mediaMetadataRetriever, long j, onm onmVar) {
        cjd cjdVar;
        Bitmap frameAtTime;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmap;
        int i;
        String string;
        if (onmVar instanceof cjd) {
            cjdVar = (cjd) onmVar;
            int i2 = cjdVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cjdVar.f = i2 - Integer.MIN_VALUE;
            } else {
                cjdVar = new cjd(this, onmVar);
            }
        } else {
            cjdVar = new cjd(this, onmVar);
        }
        Object objD = cjdVar.d;
        int i3 = cjdVar.f;
        ax70 ax70Var = null;
        try {
            if (i3 == 0) {
                hm5.M(objD);
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(j);
                if (frameAtTime == null) {
                    return null;
                }
                Bitmap bitmap2 = frameAtTime;
                while (true) {
                    if (bitmap2.getWidth() <= 1 && bitmap2.getHeight() <= 1) {
                        break;
                    }
                    Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, Math.max(1, bitmap2.getWidth() / 2), Math.max(1, bitmap2.getHeight() / 2), true);
                    if (bitmap2 != frameAtTime) {
                        bitmap2.recycle();
                    }
                    bitmap2 = bitmapCreateScaledBitmap2;
                }
                int pixel = bitmap2.getPixel(0, 0);
                if (bitmap2 != frameAtTime) {
                    bitmap2.recycle();
                }
                int iG = z4p1.G(z4p1.e(pixel));
                if (frameAtTime.getWidth() > 1024 || frameAtTime.getHeight() > 1024) {
                    float fMax = 1024.0f / Math.max(frameAtTime.getWidth(), frameAtTime.getHeight());
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMax), (int) (frameAtTime.getHeight() * fMax), true);
                    frameAtTime.recycle();
                } else {
                    bitmapCreateScaledBitmap = frameAtTime;
                }
                try {
                    zxa zxaVar = (zxa) this.b;
                    cjdVar.a = frameAtTime;
                    cjdVar.b = bitmapCreateScaledBitmap;
                    cjdVar.c = iG;
                    cjdVar.f = 1;
                    objD = zxa.d(zxaVar, bitmapCreateScaledBitmap, cjdVar);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    i = iG;
                    bitmap = bitmapCreateScaledBitmap;
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapCreateScaledBitmap;
                    bitmap.recycle();
                    throw th;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = cjdVar.c;
                bitmap = cjdVar.b;
                frameAtTime = cjdVar.a;
                try {
                    hm5.M(objD);
                } catch (Throwable th2) {
                    th = th2;
                    bitmap.recycle();
                    throw th;
                }
            }
            Uri uri = (Uri) objD;
            if (uri != null && (string = uri.toString()) != null) {
                ax70Var = new ax70(i, string, string);
            }
            bitmap.recycle();
            if (!frameAtTime.isRecycled()) {
                frameAtTime.recycle();
            }
            return ax70Var;
        } catch (Throwable th3) {
            if (!j.isRecycled()) {
                j.recycle();
            }
            throw th3;
        }
    }

    public Object k(eid eidVar, n810 n810Var) {
        int i = eidVar.d;
        String str = eidVar.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            return Collections.singletonList(new ax70(0, str, str));
        }
        if (iC == 1 || iC == 2 || iC == 3) {
            return fn31.Y(b3s.c, new djd(str, this, null), n810Var);
        }
        if (iC == 4 || iC == 5) {
            return z6x.a;
        }
        eg.o();
        return null;
    }

    public void kill(int i) {
        ((d8n) this.b).a.kill(i);
    }

    public void l(Object obj, int i, int i2, long j, xav0 xav0Var) {
        ResolveResponse resolveResponse = (ResolveResponse) (obj instanceof m231 ? null : obj);
        Throwable thA = e331.a(obj);
        mtk mtkVarO = ConfigurationFetchedNonAuth.o();
        mtkVarO.n(xav0Var.b());
        mtkVarO.B();
        mtkVarO.C();
        mtkVarO.A();
        mtkVarO.z("android");
        mtkVarO.v("BOOTSTRAP");
        mtkVarO.x(j);
        mtkVarO.E(i);
        mtkVarO.y(i2);
        if (resolveResponse != null) {
            mtkVarO.q(resolveResponse.o().p());
            mtkVarO.w(resolveResponse.o().r());
        } else {
            String str = "timeout";
            if (i != 408 && i != 504 && !(thA instanceof SocketTimeoutException)) {
                if (!u890.j(thA != null ? thA.getMessage() : null, "timeout")) {
                    if (i == 404) {
                        str = "not_found";
                    } else if (500 > i || i >= 600) {
                        str = ((400 > i || i >= 500) && i == 0) ? "unknown" : "client_error";
                    } else {
                        str = "server_error";
                    }
                }
            }
            mtkVarO.t(str);
            String message = thA != null ? thA.getMessage() : null;
            if (message == null) {
                message = "";
            }
            mtkVarO.r(message);
        }
        ((nb00) this.b).c("ConfigurationFetchedNonAuth", mtkVarO.build().toByteArray());
    }

    public void n(long j, int i, int i2, j120 j120Var, String str) {
        h5o0 h5o0VarN = NebulaRequestNonAuth.n();
        h5o0VarN.s(j);
        h5o0VarN.v(i);
        h5o0VarN.t(i2);
        h5o0VarN.r(rwq.s(j120Var));
        h5o0VarN.u();
        if (str != null) {
            h5o0VarN.n(str);
        }
        ((nb00) this.b).c("NebulaRequestNonAuth", h5o0VarN.build().toByteArray());
    }

    public void o(long j, Integer num, j120 j120Var) {
        h5o0 h5o0VarN = NebulaRequestNonAuth.n();
        h5o0VarN.s(j);
        h5o0VarN.q("timeout");
        h5o0VarN.r(rwq.s(j120Var));
        h5o0VarN.u();
        if (num != null) {
            h5o0VarN.v(num.intValue());
        }
        ((nb00) this.b).c("NebulaRequestNonAuth", h5o0VarN.build().toByteArray());
    }

    public bqk0 p() {
        return new bqk0(l1d.m("spotify:chat:", ((ete) this.b).c), (byte) 24);
    }

    public void post(Runnable runnable) {
        d8n d8nVar = (d8n) this.b;
        if (d8nVar.b.get()) {
            return;
        }
        d8nVar.a.post(runnable);
    }

    public void q(wsg wsgVar) {
        wtg wtgVar = (wtg) this.b;
        wtgVar.d.post(new nx30(wtgVar, wsgVar, (byte) 10));
    }

    public void r() {
        ((CarouselView) this.b).p2.invoke();
    }

    public void runBlocking(Runnable runnable) {
        d8n d8nVar = (d8n) this.b;
        if (d8nVar.b.get()) {
            return;
        }
        d8nVar.a.runBlocking(runnable);
    }

    public void s() {
        ((CarouselView) this.b).o2.invoke();
    }

    public void t(String str, String str2) {
        ((HashMap) this.b).put(str, str2);
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 14:
                Set set = (Set) obj;
                set.getClass();
                MobiusLoop mobiusLoop = ((rae) obj2).b;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new kae(set));
                    return;
                } else {
                    u890.C("loop");
                    throw null;
                }
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i = CircularVideoPreviewView.h;
                CircularVideoPreviewSpinner circularVideoPreviewSpinner = ((CircularVideoPreviewView) obj2).b;
                if (zBooleanValue) {
                    if (circularVideoPreviewSpinner.e) {
                        return;
                    }
                    circularVideoPreviewSpinner.e = true;
                    circularVideoPreviewSpinner.d = circularVideoPreviewSpinner.a.b();
                    circularVideoPreviewSpinner.invalidate();
                    return;
                }
                if (circularVideoPreviewSpinner.e) {
                    circularVideoPreviewSpinner.e = false;
                    circularVideoPreviewSpinner.d = 0L;
                    circularVideoPreviewSpinner.invalidate();
                    return;
                }
                return;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        ContentPickerFragment contentPickerFragment = (ContentPickerFragment) this.b;
        tzr0 tzr0Var = contentPickerFragment.Q1;
        tzr0Var.getClass();
        LinearLayout linearLayout = (LinearLayout) ((phi0) tzr0Var.c).b;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), contentPickerFragment.k0().getDimensionPixelSize(2131165305) + nk80VarI.d);
        tzr0 tzr0Var2 = contentPickerFragment.Q1;
        tzr0Var2.getClass();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) tzr0Var2.b;
        coordinatorLayout.setPadding(nk80VarI.a, coordinatorLayout.getPaddingTop(), nk80VarI.c, coordinatorLayout.getPaddingBottom());
        return hsl1.b;
    }

    public mr20 y(String str) {
        return new te1(d3p1.F((d0r) this.b, eme.x, str), (byte) 15);
    }

    public lo9(xaa xaaVar) {
        this.a = (byte) 1;
        Objects.requireNonNull(xaaVar);
        this.b = xaaVar;
    }

    public /* synthetic */ lo9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lo9(zxa zxaVar) {
        this.a = (byte) 11;
        b3s b3sVar = b3s.c;
        this.b = zxaVar;
    }

    public lo9() {
        this.a = (byte) 27;
        this.b = new HashMap();
    }

    public lo9(Observable observable, o1r o1rVar, t1r t1rVar, s1r s1rVar, io.reactivex.rxjava3.core.Scheduler scheduler) {
        this.a = (byte) 29;
        this.b = s1rVar;
    }

    public lo9(dte dteVar, ete eteVar) {
        this.a = (byte) 28;
        this.b = eteVar;
    }

    public boolean accept(Object obj) {
        oum oumVar = (oum) this.b;
        if (oumVar.a().isEmpty()) {
            return false;
        }
        return oumVar.b || oumVar.c;
    }
}
