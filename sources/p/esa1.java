package p;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.camera.core.ProcessingException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.recaptcha.RecaptchaException;
import com.spotify.base.java.logging.Logger;
import com.spotify.culturalmoments.stories.v1.FullscreenVideoStory;
import com.spotify.messages.WhereToPlaySuggestionLifecycle;
import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsPreparePlay;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSignalRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.speedpreview.proto.SpeedPreviewOuterClass$SpeedPreview;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class esa1 implements Function, i2q0, f080, m381, dec, ix30, nkb1, ql7, BiFunction {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public esa1(peb1 peb1Var) {
        this.a = (byte) 7;
        this.c = peb1Var;
        this.b = w3p1.n(new l4r(pwc0.b, 1, rdb1.b1, new j4r(new oeb1(peb1Var, (byte) 0)), rdb1.c1), new l4r(hvm.b, 2, rdb1.Z0, new j4r(rdb1.Y0), rdb1.a1), nva1.t);
    }

    public Object A(boolean z, onm onmVar) {
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(((yqg) this.b).b());
        cozVarR.s(qpzVarP.build());
        EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
        jn7 jn7Var = (jn7) this.c;
        srz srzVarN = EsSignalRequest.SignalRequest.n();
        srzVarN.r("stop-speed-preview");
        srzVarN.q(z ? "true" : "false");
        srzVarN.n(loggingParamsBuild);
        Object objU0 = jn7Var.u0(srzVarN.build(), onmVar);
        return objU0 == d9n.a ? objU0 : rih1.a;
    }

    public void a(int i, Float f, Float f2) {
        float fO = f != null ? yoi1.o((2.0f - f.floatValue()) / 2.0f, 0.0f, 1.0f) : 0.0f;
        float fO2 = f2 != null ? yoi1.o((2.0f - f2.floatValue()) / 2.0f, 0.0f, 1.0f) : 0.0f;
        float fFloatValue = f != null ? f.floatValue() : 2.0f;
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        float fFloatValue2 = f2 != null ? f2.floatValue() : 2.0f;
        if (fFloatValue2 < 0.0f) {
            fFloatValue2 = 0.0f;
        }
        float fMin = Math.min(1.0f, Math.min(fO, fO2) * 3.0f);
        float f3 = fFloatValue2 + fFloatValue;
        float f4 = f3 > 0.0f ? fFloatValue / f3 : 0.5f;
        float fC = ((jen0) this.b).c();
        float fG = fd21.g(f4, fMin, 1.0f, fO);
        jen0 jen0Var = (jen0) this.b;
        jen0 jen0Var2 = (jen0) this.b;
        this.c = o(((jen0Var2.d - jen0Var2.c()) * (1.0f - ((1.0f - f4) * fMin)) * fO2) + ((jen0Var.b - jen0Var.c()) * fG) + fC);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new CompletableFromAction(new wf0((bs0) this.b, (ContextTrack) obj, (csa1) this.c, (byte) 21));
            case 8:
                Boolean bool = (Boolean) obj;
                String str = ((mfw) this.b).a;
                if (str == null) {
                    str = ((nn60) ((dzp0) this.c).b).a;
                }
                return new y400(str, bool.booleanValue());
            case 12:
                int i = ((jac1) this.b).c;
                Logger.e((Throwable) obj, ab80.n("Error preloading story ", " for feature ", i, (String) this.c), new Object[0]);
                return new abc1(i);
            case 15:
                return ((ut71) this.b).b((Context) this.c, (String) obj);
            default:
                y6z y6zVar = (y6z) this.b;
                String str2 = (String) this.c;
                return ((uu00) ((k9) y6zVar).b).b(new oi("save-for-later", false, new ysf1(str2, (byte) 0))).filter(fmv.d1).map(new x6z(str2, y6zVar, (byte) 1)).map(new up41((kk3) obj, (byte) 28));
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public void c(jen0 jen0Var) {
        if (((jen0) this.b).equals(jen0Var)) {
            return;
        }
        this.b = jen0Var;
        this.c = o(jen0Var.c());
    }

    public void e(int i, Bitmap bitmap) {
        bitmap.isRecycled();
        ((u7b1) this.b).c.p((PlayerState) this.c, bitmap);
    }

    public void f(q881 q881Var, Object obj) {
        yt91 yt91Var = ((g8c1) this.b).d;
        String strR = ((FullscreenVideoStory) this.c).n().r();
        i8h1 i8h1Var = (i8h1) yt91Var.b;
        x6h1 x6h1VarC = ((yok0) yt91Var.d).b.c();
        x6h1VarC.i.add(new a7h1("story_container", strR, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("video_error", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        String str = ((jik1) yt91Var.c).getViewUri().a;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        ((fgi1) q881Var.b).a.onNext(ufi1.a);
    }

    public void g(Drawable drawable) {
        mxa1 mxa1Var = ((u7b1) this.b).c;
        PlayerState playerState = (PlayerState) this.c;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        mxa1Var.p(playerState, bitmapDrawable != null ? bitmapDrawable.getBitmap() : null);
    }

    @Override // p.nkb1
    public mkb1 h(uvl1 uvl1Var) {
        mkb1 mkb1VarH;
        synchronized (this.c) {
            mkb1VarH = ((utw0) this.b).h(uvl1Var);
        }
        return mkb1VarH;
    }

    public jen0 i() {
        return (jen0) this.c;
    }

    public void j() {
        ((hrr0) this.c).setValue((Object) null);
        ghh1 ghh1Var = (ghh1) this.b;
        ghh1Var.b.clear();
        ghh1Var.c.clear();
    }

    public boolean k(uvl1 uvl1Var) {
        boolean zContainsKey;
        synchronized (this.c) {
            zContainsKey = ((LinkedHashMap) ((utw0) this.b).a).containsKey(uvl1Var);
        }
        return zContainsKey;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(onm onmVar) {
        y5b1 y5b1Var;
        x4b1 x4b1Var;
        String str;
        if (onmVar instanceof y5b1) {
            y5b1Var = (y5b1) onmVar;
            int i = y5b1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y5b1Var.c = i - Integer.MIN_VALUE;
            } else {
                y5b1Var = new y5b1(this, onmVar);
            }
        } else {
            y5b1Var = new y5b1(this, onmVar);
        }
        Object objF = y5b1Var.a;
        int i2 = y5b1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                Application application = (Application) this.b;
                String str2 = (String) this.c;
                y5b1Var.c = 1;
                objF = r3x0.a1.f(application, str2, y5b1Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            return new y4b1(new a6b1((wi01) objF));
        } catch (CancellationException e) {
            throw e;
        } catch (RecaptchaException e2) {
            switch (e2.a) {
                case 1:
                    str = "UNKNOWN_ERROR";
                    break;
                case 2:
                    str = "NETWORK_ERROR";
                    break;
                case 3:
                    str = "INVALID_SITEKEY";
                    break;
                case 4:
                    str = "INVALID_KEYTYPE";
                    break;
                case 5:
                    str = "INVALID_PACKAGE_NAME";
                    break;
                case 6:
                    str = "INVALID_ACTION";
                    break;
                case 7:
                    str = "INVALID_TIMEOUT";
                    break;
                case 8:
                    str = "NO_NETWORK_FOUND";
                    break;
                case 9:
                    str = "INTERNAL_ERROR";
                    break;
                default:
                    throw null;
            }
            x4b1Var = new x4b1(str);
            return x4b1Var;
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            x4b1Var = new x4b1(message);
            return x4b1Var;
        }
    }

    public void m(Drawable drawable) {
        ((u7b1) this.b).c.p((PlayerState) this.c, (Bitmap) null);
    }

    @Override // p.nkb1
    public mkb1 n(uvl1 uvl1Var) {
        mkb1 mkb1VarN;
        synchronized (this.c) {
            mkb1VarN = ((utw0) this.b).n(uvl1Var);
        }
        return mkb1VarN;
    }

    public jen0 o(float f) {
        jen0 jen0Var = (jen0) this.b;
        float f2 = 0.1f * jen0Var.f;
        return new jen0(0.0f, f - f2, jen0Var.e, f2 + f);
    }

    public void onComplete(Task task) {
        pya1 pya1Var = (pya1) this.b;
        SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) this.c;
        if (pya1Var.d(o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63))) {
            pya1Var.c(o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
        }
    }

    public void onFailure(Throwable th) {
        int i = ((n3d1) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            j2h1.o("SurfaceProcessorNode");
        } else {
            "Downstream node failed to provide Surface. Target: ".concat(m0p1.u(i));
            j2h1.N("SurfaceProcessorNode");
        }
    }

    public void onSuccess(Object obj) {
        d4d1 d4d1Var = (d4d1) obj;
        d4d1Var.getClass();
        try {
            ((rts) ((lvc1) this.c).b).a(d4d1Var);
        } catch (ProcessingException unused) {
            j2h1.q("SurfaceProcessorNode");
        }
    }

    public void p() {
        hrr0 hrr0Var = (hrr0) this.c;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            vee1 vee1Var = (vee1) hrr0Var.getValue();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            if (vee1Var != null) {
                ghh1 ghh1Var = (ghh1) this.b;
                bw91 bw91Var = ghh1Var.b;
                bw91 bw91Var2 = ghh1Var.c;
                bw91Var2.clear();
                while (bw91Var2.size() + bw91Var.size() > ghh1Var.a - 1) {
                    r7h.b0(bw91Var);
                }
                bw91Var.add(vee1Var);
            }
            hrr0Var.setValue((Object) null);
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object q(j2e1 j2e1Var, onm onmVar) {
        w1e1 w1e1Var;
        Uri uri;
        bnt bntVar;
        Object objT;
        a3e1 a3e1Var;
        t0c t0cVar;
        j2e1 j2e1Var2;
        Uri uri2;
        a3e1 a3e1Var2;
        w2e1 w2e1Var;
        w2e1 w2e1Var2;
        amz0 amz0Var;
        ssd ssdVar;
        Object objK;
        j2e1 j2e1Var3 = j2e1Var;
        if (onmVar instanceof w1e1) {
            w1e1Var = (w1e1) onmVar;
            int i = w1e1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1e1Var.h = i - Integer.MIN_VALUE;
            } else {
                w1e1Var = new w1e1(this, onmVar);
            }
        } else {
            w1e1Var = new w1e1(this, onmVar);
        }
        w1e1 w1e1Var2 = w1e1Var;
        Object objB = w1e1Var2.f;
        int i2 = w1e1Var2.h;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            a3e1 a3e1Var3 = j2e1Var3.e;
            uri = j2e1Var3.d;
            bntVar = uri != null ? new bnt(uri) : null;
            int i3 = a3e1Var3.h;
            t0c antVar = new ant(i3, i3);
            eee1 eee1Var = a3e1Var3.f;
            eee1 eee1Var2 = eee1Var instanceof eee1 ? eee1Var : null;
            vve1 vve1Var = eee1Var2 != null ? eee1Var2.a : null;
            o0g1 o0g1Var = (o0g1) this.c;
            wa71 wa71Var = a3e1Var3.a.a.a;
            long j = a3e1Var3.e;
            String str = a3e1Var3.O0;
            w1e1Var2.a = j2e1Var3;
            w1e1Var2.b = a3e1Var3;
            w1e1Var2.c = uri;
            w1e1Var2.d = bntVar;
            w1e1Var2.e = antVar;
            w1e1Var2.h = 1;
            objT = o0g1Var.t(wa71Var, j, vve1Var, str, w1e1Var2);
            if (objT != d9nVar) {
                a3e1Var = a3e1Var3;
                t0cVar = antVar;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            t0c t0cVar2 = w1e1Var2.e;
            bnt bntVar2 = w1e1Var2.d;
            Uri uri3 = w1e1Var2.c;
            a3e1Var = w1e1Var2.b;
            j2e1 j2e1Var4 = w1e1Var2.a;
            hm5.M(objB);
            bntVar = bntVar2;
            uri = uri3;
            objT = objB;
            t0cVar = t0cVar2;
            j2e1Var3 = j2e1Var4;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objB);
                    return objB;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri2 = w1e1Var2.c;
            a3e1Var2 = w1e1Var2.b;
            j2e1Var2 = w1e1Var2.a;
            hm5.M(objB);
        }
        p371 p371Var = (p371) objB;
        w2e1Var = a3e1Var2.c;
        if (w2e1Var instanceof w2e1) {
            w2e1Var2 = w2e1Var;
        } else {
            w2e1Var2 = null;
        }
        if (w2e1Var2 != null) {
            amz0Var = new amz0(new Long(a3e1Var2.e), Collections.singletonList(new khc0(w2e1Var2.a, null)));
        } else {
            amz0Var = null;
        }
        wkt wktVar = j2e1Var2.c;
        nhb nhbVar = new nhb(uri2, this, a3e1Var2, (lnm) null);
        ro8 ro8Var = new ro8(j2e1Var2, (lnm) null, (byte) 25);
        if (amz0Var != null) {
            ssdVar = new ssd(amz0Var);
        } else {
            ssdVar = tsd.c;
        }
        ssd ssdVar2 = ssdVar;
        w1e1Var2.a = null;
        w1e1Var2.b = null;
        w1e1Var2.c = null;
        w1e1Var2.d = null;
        w1e1Var2.e = null;
        w1e1Var2.h = 3;
        objK = fq7.K(wktVar, p371Var, nhbVar, ro8Var, (n7q0) null, ssdVar2, w1e1Var2, 24);
        if (objK != d9nVar) {
            return d9nVar;
        }
        return objK;
        vmt vmtVarB = gqg.b((gqg) this.b, j2e1Var3.c.a(), j2e1Var3.c.g());
        w1e1Var2.a = j2e1Var3;
        w1e1Var2.b = a3e1Var;
        w1e1Var2.c = uri;
        w1e1Var2.d = null;
        w1e1Var2.e = null;
        w1e1Var2.h = 2;
        objB = vmtVarB.b((wa71) objT, t0cVar, bntVar, (Uri) null);
        if (objB != d9nVar) {
            j2e1Var2 = j2e1Var3;
            uri2 = uri;
            a3e1Var2 = a3e1Var;
            p371 p371Var2 = (p371) objB;
            w2e1Var = a3e1Var2.c;
            if (w2e1Var instanceof w2e1) {
                w2e1Var2 = w2e1Var;
            } else {
                w2e1Var2 = null;
            }
            if (w2e1Var2 != null) {
                amz0Var = new amz0(new Long(a3e1Var2.e), Collections.singletonList(new khc0(w2e1Var2.a, null)));
            } else {
                amz0Var = null;
            }
            wkt wktVar2 = j2e1Var2.c;
            nhb nhbVar2 = new nhb(uri2, this, a3e1Var2, (lnm) null);
            ro8 ro8Var2 = new ro8(j2e1Var2, (lnm) null, (byte) 25);
            if (amz0Var != null) {
                ssdVar = new ssd(amz0Var);
            } else {
                ssdVar = tsd.c;
            }
            ssd ssdVar3 = ssdVar;
            w1e1Var2.a = null;
            w1e1Var2.b = null;
            w1e1Var2.c = null;
            w1e1Var2.d = null;
            w1e1Var2.e = null;
            w1e1Var2.h = 3;
            objK = fq7.K(wktVar2, p371Var2, nhbVar2, ro8Var2, (n7q0) null, ssdVar3, w1e1Var2, 24);
            if (objK != d9nVar) {
                return objK;
            }
        }
        return d9nVar;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        neb1 neb1Var = (neb1) obj;
        peb1 peb1Var = (peb1) this.c;
        kmj1 kmj1Var = peb1Var.d;
        qxc0 qxc0Var = neb1Var.a;
        Map map = qxc0Var.X;
        if (kmj1Var.a.a() && Boolean.parseBoolean((String) map.get("is_video_first"))) {
            return false;
        }
        String str = peb1Var.a;
        String str2 = peb1Var.c;
        vnb1 vnb1Var = neb1Var.b;
        am1 am1VarS = dko1.s(vhc1Var, str, vnb1Var != null && vnb1Var.b, vnb1Var != null && vnb1Var.a, qxc0Var.h, str2, (String) null, qxc0Var.W0, qxc0Var.X);
        return (am1VarS instanceof am1 ? am1VarS : null) != null;
    }

    public String s() {
        return (String) this.c;
    }

    public String t(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void u(uvc1 uvc1Var) {
        String str;
        if (((yc4) this.c).b()) {
            col1 col1VarN = WhereToPlaySuggestionLifecycle.n();
            boolean z = uvc1Var instanceof tvc1;
            if (z) {
                str = "REQUESTED";
            } else if (uvc1Var instanceof pvc1) {
                str = "EMITTED";
            } else if (uvc1Var instanceof svc1) {
                str = "REJECTED";
            } else if (uvc1Var instanceof mvc1) {
                str = "CANCELLED";
            } else if (uvc1Var instanceof nvc1) {
                str = "DELIVERED_TO_SURFACE";
            } else if (uvc1Var instanceof rvc1) {
                str = "PRESENTED";
            } else if (uvc1Var instanceof qvc1) {
                str = "EXPIRED_UNPRESENTED";
            } else {
                if (!(uvc1Var instanceof ovc1)) {
                    eg.o();
                    return;
                }
                str = "DISMISSED";
            }
            col1VarN.s(str);
            col1VarN.u(uvc1Var.b());
            col1VarN.t(uvc1Var.a());
            if (!z) {
                if (uvc1Var instanceof pvc1) {
                    pvc1 pvc1Var = (pvc1) uvc1Var;
                    col1VarN.r(pvc1Var.c);
                    col1VarN.n(pvc1Var.d);
                } else if (uvc1Var instanceof svc1) {
                    svc1 svc1Var = (svc1) uvc1Var;
                    String str2 = svc1Var.c;
                    if (str2 != null) {
                        col1VarN.r(str2);
                    }
                    col1VarN.q(svc1Var.d);
                } else if (uvc1Var instanceof mvc1) {
                    col1VarN.q(((mvc1) uvc1Var).c);
                } else if (uvc1Var instanceof nvc1) {
                    col1VarN.r(((nvc1) uvc1Var).c);
                } else if (uvc1Var instanceof rvc1) {
                    col1VarN.r(((rvc1) uvc1Var).c);
                } else if (uvc1Var instanceof qvc1) {
                    qvc1 qvc1Var = (qvc1) uvc1Var;
                    col1VarN.r(qvc1Var.c);
                    col1VarN.q(qvc1Var.d);
                } else if (!(uvc1Var instanceof ovc1)) {
                    eg.o();
                    return;
                } else {
                    ovc1 ovc1Var = (ovc1) uvc1Var;
                    col1VarN.r(ovc1Var.c);
                    col1VarN.q(ovc1Var.d);
                }
            }
            ((t2j0) this.b).a(col1VarN.build());
        }
    }

    public void v() {
        ((i4f1) this.c).a.l((Object) null);
    }

    public void w(d3j0 d3j0Var, ww21 ww21Var) {
        ((i4f1) this.c).a.m((Object) null, new k6w0(p4j0.a, d3j0Var, new ro8(ww21Var, (lnm) null, (byte) 28)));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0120 A[PHI: r0 r4 r13
      0x0120: PHI (r0v8 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams) = 
      (r0v7 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams)
      (r0v7 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams)
      (r0v17 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams)
     binds: [B:37:0x011c, B:32:0x00ca, B:21:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v3 java.lang.String), (r4v9 java.lang.String) binds: [B:37:0x011c, B:32:0x00ca, B:21:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r13v3 double) = (r13v2 double), (r13v2 double), (r13v6 double) binds: [B:37:0x011c, B:32:0x00ca, B:21:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0137 A[PHI: r0 r4 r13
      0x0137: PHI (r0v9 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams) = 
      (r0v8 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams)
      (r0v18 com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams)
     binds: [B:40:0x0134, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v10 java.lang.String) binds: [B:40:0x0134, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r13v4 double) = (r13v3 double), (r13v7 double) binds: [B:40:0x0134, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x0198  */
    /* JADX WARN: Code duplicated, block: B:52:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object x(String str, double d, onm onmVar) {
        gxa1 gxa1Var;
        EsLoggingParams.LoggingParams loggingParamsBuild;
        String str2;
        double d2;
        dkm dkmVarE;
        double d3;
        Object objU0;
        jn7 jn7Var = (jn7) this.c;
        if (onmVar instanceof gxa1) {
            gxa1Var = (gxa1) onmVar;
            int i = gxa1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gxa1Var.f = i - Integer.MIN_VALUE;
            } else {
                gxa1Var = new gxa1(this, onmVar);
            }
        } else {
            gxa1Var = new gxa1(this, onmVar);
        }
        Object objI = gxa1Var.d;
        int i2 = gxa1Var.f;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(((yqg) this.b).b());
            cozVarR.s(qpzVarP.build());
            loggingParamsBuild = cozVarR.build();
            dkm dkmVarE2 = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
            str2 = str;
            gxa1Var.a = str2;
            gxa1Var.b = loggingParamsBuild;
            d2 = d;
            gxa1Var.c = d2;
            gxa1Var.f = 1;
            objI = b5p1.i(dkmVarE2, gxa1Var);
            if (objI != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            d2 = gxa1Var.c;
            loggingParamsBuild = gxa1Var.b;
            str2 = gxa1Var.a;
            hm5.M(objI);
        } else {
            if (i2 == 2) {
                d2 = gxa1Var.c;
                loggingParamsBuild = gxa1Var.b;
                str2 = gxa1Var.a;
                hm5.M(objI);
                dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
                gxa1Var.a = str2;
                gxa1Var.b = loggingParamsBuild;
                gxa1Var.c = d2;
                gxa1Var.f = 3;
                if (b5p1.i(dkmVarE, gxa1Var) != obj) {
                    gxa1Var.a = str2;
                    gxa1Var.b = loggingParamsBuild;
                    gxa1Var.c = d2;
                    gxa1Var.f = 4;
                    objI = new glw0();
                    if (objI != obj) {
                        d3 = d2;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                double d4 = gxa1Var.c;
                loggingParamsBuild = gxa1Var.b;
                str2 = gxa1Var.a;
                hm5.M(objI);
                d2 = d4;
                gxa1Var.a = str2;
                gxa1Var.b = loggingParamsBuild;
                gxa1Var.c = d2;
                gxa1Var.f = 4;
                objI = new glw0();
                if (objI != obj) {
                    d3 = d2;
                }
                return obj;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    hm5.M(objI);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d3 = gxa1Var.c;
            loggingParamsBuild = gxa1Var.b;
            str2 = gxa1Var.a;
            hm5.M(objI);
        }
        loggingParamsBuild.getClass();
        gxa1Var.a = null;
        gxa1Var.b = null;
        gxa1Var.c = d3;
        gxa1Var.f = 5;
        bxa1 bxa1VarN = SpeedPreviewOuterClass$SpeedPreview.n();
        bxa1VarN.t(str2);
        bxa1VarN.r(d3);
        ((glw0) objI).getClass();
        bxa1VarN.s();
        bxa1VarN.q();
        bxa1VarN.n();
        SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview = (SpeedPreviewOuterClass$SpeedPreview) bxa1VarN.build();
        srz srzVarN = EsSignalRequest.SignalRequest.n();
        srzVarN.r("speed-preview");
        srzVarN.q(n9a.c(n9a.e, speedPreviewOuterClass$SpeedPreview.toByteArray()));
        srzVarN.n(loggingParamsBuild);
        objU0 = jn7Var.u0(srzVarN.build(), gxa1Var);
        if (objU0 != obj) {
            objU0 = rih1Var;
        }
        if (objU0 == obj) {
            return obj;
        }
        return rih1Var;
        EsContextPlayerState.ContextPlayerState contextPlayerState = (EsContextPlayerState.ContextPlayerState) objI;
        String strS = contextPlayerState.s();
        if (strS == null || ihc1.y0(strS) || u890.j(contextPlayerState.s(), "spotify:speed-control:preview")) {
            loggingParamsBuild.getClass();
            gxa1Var.a = str2;
            gxa1Var.b = loggingParamsBuild;
            gxa1Var.c = d2;
            gxa1Var.f = 2;
            upz upzVarN = EsPlay.PlayRequest.n();
            upzVarN.n(loggingParamsBuild);
            jqz jqzVarN = EsPreparePlay.PreparePlayRequest.n();
            cmz cmzVarP = EsContext.Context.p();
            cmzVarP.t("spotify:speed-control:preview");
            cmzVarP.u("spotify:speed-control:preview");
            jqzVarN.n(cmzVarP.build());
            lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
            lqzVarS.u(true);
            jqzVarN.q(lqzVarS.build());
            upzVarN.r(jqzVarN.build());
            Object objU = jn7Var.U(upzVarN.build(), gxa1Var);
            if (objU != obj) {
                objU = rih1Var;
            }
            if (objU != obj) {
                dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
                gxa1Var.a = str2;
                gxa1Var.b = loggingParamsBuild;
                gxa1Var.c = d2;
                gxa1Var.f = 3;
                if (b5p1.i(dkmVarE, gxa1Var) != obj) {
                    gxa1Var.a = str2;
                    gxa1Var.b = loggingParamsBuild;
                    gxa1Var.c = d2;
                    gxa1Var.f = 4;
                    objI = new glw0();
                    if (objI != obj) {
                        d3 = d2;
                        loggingParamsBuild.getClass();
                        gxa1Var.a = null;
                        gxa1Var.b = null;
                        gxa1Var.c = d3;
                        gxa1Var.f = 5;
                        bxa1 bxa1VarN2 = SpeedPreviewOuterClass$SpeedPreview.n();
                        bxa1VarN2.t(str2);
                        bxa1VarN2.r(d3);
                        ((glw0) objI).getClass();
                        bxa1VarN2.s();
                        bxa1VarN2.q();
                        bxa1VarN2.n();
                        SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview2 = (SpeedPreviewOuterClass$SpeedPreview) bxa1VarN2.build();
                        srz srzVarN2 = EsSignalRequest.SignalRequest.n();
                        srzVarN2.r("speed-preview");
                        srzVarN2.q(n9a.c(n9a.e, speedPreviewOuterClass$SpeedPreview2.toByteArray()));
                        srzVarN2.n(loggingParamsBuild);
                        objU0 = jn7Var.u0(srzVarN2.build(), gxa1Var);
                        if (objU0 != obj) {
                            objU0 = rih1Var;
                        }
                        if (objU0 == obj) {
                            return rih1Var;
                        }
                    }
                }
            }
        } else {
            dkmVarE = jn7Var.E(EsGetStateRequest.GetStateRequest.n());
            gxa1Var.a = str2;
            gxa1Var.b = loggingParamsBuild;
            gxa1Var.c = d2;
            gxa1Var.f = 3;
            if (b5p1.i(dkmVarE, gxa1Var) != obj) {
                gxa1Var.a = str2;
                gxa1Var.b = loggingParamsBuild;
                gxa1Var.c = d2;
                gxa1Var.f = 4;
                objI = new glw0();
                if (objI != obj) {
                    d3 = d2;
                    loggingParamsBuild.getClass();
                    gxa1Var.a = null;
                    gxa1Var.b = null;
                    gxa1Var.c = d3;
                    gxa1Var.f = 5;
                    bxa1 bxa1VarN3 = SpeedPreviewOuterClass$SpeedPreview.n();
                    bxa1VarN3.t(str2);
                    bxa1VarN3.r(d3);
                    ((glw0) objI).getClass();
                    bxa1VarN3.s();
                    bxa1VarN3.q();
                    bxa1VarN3.n();
                    SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview3 = (SpeedPreviewOuterClass$SpeedPreview) bxa1VarN3.build();
                    srz srzVarN3 = EsSignalRequest.SignalRequest.n();
                    srzVarN3.r("speed-preview");
                    srzVarN3.q(n9a.c(n9a.e, speedPreviewOuterClass$SpeedPreview3.toByteArray()));
                    srzVarN3.n(loggingParamsBuild);
                    objU0 = jn7Var.u0(srzVarN3.build(), gxa1Var);
                    if (objU0 != obj) {
                        objU0 = rih1Var;
                    }
                    if (objU0 == obj) {
                        return rih1Var;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public void y(vee1 vee1Var) {
        vee1 vee1Var2;
        vee1 vee1Var3;
        hrr0 hrr0Var = (hrr0) this.c;
        String str = vee1Var.c;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            vee1 vee1Var4 = (vee1) hrr0Var.getValue();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            if (vee1Var4 == null) {
                hrr0Var.setValue(vee1Var);
                return;
            }
            boolean z = vee1Var4.g;
            String str2 = vee1Var4.b;
            String str3 = vee1Var4.c;
            int i = vee1Var4.a;
            int i2 = vee1Var4.h;
            if (z) {
                boolean z2 = vee1Var.g;
                String str4 = vee1Var.b;
                int i3 = vee1Var.a;
                if (z2) {
                    long j = vee1Var.f;
                    long j2 = vee1Var4.f;
                    if (j < j2 || j - j2 >= 5000 || u890.j(str3, "\n") || u890.j(str3, "\r\n") || u890.j(str, "\n") || u890.j(str, "\r\n") || i2 != vee1Var.h) {
                        vee1Var2 = null;
                    } else {
                        if (i2 == 1 && str3.length() + i == i3) {
                            vee1Var3 = new vee1(vee1Var4.a, "", l1d.m(str3, str), vee1Var4.d, vee1Var.e, vee1Var4.f, false, 64);
                        } else if (i2 != 2 || vee1Var4.a() != vee1Var.a() || (vee1Var4.a() != 1 && vee1Var4.a() != 2)) {
                            vee1Var2 = null;
                        } else if (i == str4.length() + i3) {
                            vee1Var3 = new vee1(vee1Var.a, l1d.m(str4, str2), "", vee1Var4.d, vee1Var.e, vee1Var4.f, false, 64);
                        } else {
                            int i4 = vee1Var4.a;
                            if (i4 == i3) {
                                vee1Var2 = new vee1(i4, f4i1.e(str2, str4), "", vee1Var4.d, vee1Var.e, vee1Var4.f, false, 64);
                            } else {
                                vee1Var2 = null;
                            }
                        }
                        vee1Var2 = vee1Var3;
                    }
                } else {
                    vee1Var2 = null;
                }
            } else {
                vee1Var2 = null;
            }
            if (vee1Var2 != null) {
                hrr0Var.setValue(vee1Var2);
            } else {
                p();
                hrr0Var.setValue(vee1Var);
            }
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    public List z(String str) {
        List listX;
        synchronized (this.c) {
            listX = ((utw0) this.b).x(str);
        }
        return listX;
    }

    public esa1(Context context) {
        this.a = (byte) 14;
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(2131954152);
    }

    public esa1(jn7 jn7Var, q8n q8nVar) {
        this.a = (byte) 9;
        this.b = jn7Var;
        this.c = d5p1.r(rqt0.u(new m441(new w621(this, null, (byte) 10))), smo1.e(flo1.l(op71.f(), q8nVar)), new alb1(0L, Long.MAX_VALUE), 1);
    }

    public esa1(gqg gqgVar, bhf bhfVar, o0g1 o0g1Var) {
        this.a = (byte) 22;
        this.b = gqgVar;
        this.c = o0g1Var;
    }

    public esa1(ynb0 ynb0Var) {
        this.a = (byte) 1;
        this.b = ynb0Var;
        this.c = new tdl0((byte) 21);
    }

    public esa1(Application application, ajg ajgVar) {
        String str;
        this.a = (byte) 5;
        this.b = application;
        if (u890.j(((zym0) ajgVar).c(), "com.android.vending")) {
            str = "6LcPetIZAAAAAMZ-VAZgfexG3T4lNxk6Z5NKG2oS";
        } else {
            str = "6LepKD4qAAAAAIVxe645wac2oJoyFEVbjzVEbTmO";
        }
        this.c = str;
    }

    public esa1(yqg yqgVar, jn7 jn7Var, sua suaVar) {
        this.a = (byte) 2;
        this.b = yqgVar;
        this.c = jn7Var;
    }

    public esa1(vee1 vee1Var, ghh1 ghh1Var) {
        this.a = (byte) 23;
        this.b = ghh1Var;
        this.c = v8r.q(vee1Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ esa1(byte b) {
        this.a = b;
        switch (b) {
            case 27:
                break;
            default:
                z6x z6xVar = z6x.a;
                this((vee1) null, new ghh1(100, z6xVar, z6xVar));
                break;
        }
    }

    public /* synthetic */ esa1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public esa1(utw0 utw0Var) {
        this.a = (byte) 19;
        this.b = utw0Var;
        this.c = new Object();
    }

    public esa1(lvc1 lvc1Var, n3d1 n3d1Var) {
        this.a = (byte) 17;
        this.c = lvc1Var;
        this.b = n3d1Var;
    }

    public Object apply(Object obj, Object obj2) {
        r910 r910Var = (r910) obj;
        return new r910(r910Var.a, r910Var.b, r910Var.c, r910Var.d, r910Var.e, r910Var.f, r910Var.g, r910Var.h, ((waz0) this.b).b((bbz0) obj2, ((plf1) this.c).a), r910Var.j, r910Var.k, r910Var.l, r910Var.m);
    }
}
