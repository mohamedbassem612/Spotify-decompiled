package p;

import android.bluetooth.BluetoothGattServer;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.player.model.PlayerState;
import com.spotify.searchview.proto.MainViewResponse;
import com.spotify.share.formats.common.video.impl.AgeRestrictedContentException;
import com.spotify.voiceassistants.playermodels.ParsedQuery;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SourceDevice;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vi11 implements Function {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public vi11(d0r d0rVar) {
        this.a = (byte) 5;
        this.b = d0rVar;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.k(new l4r(new wlu(jd11Var.b(jo70.class)), 2, rz31.W0, new j4r(rz31.h), rz31.Y0), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, rz31.Z0, new j4r(rz31.i), rz31.a1), new l4r(new wlu(jd11Var.b(hll.class)), 2, rz31.b1, new j4r(rz31.t), rz31.c1), new l4r(new wlu(jd11Var.b(a7q0.class)), 2, rz31.d1, new j4r(rz31.X), rz31.e1), new l4r(new wlu(jd11Var.b(d7u0.class)), 2, o641.b, new j4r(rz31.Y), rz31.Z), new xyh(this, (byte) 22));
        this.d = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, rz31.N0, new j4r(o641.c), rz31.O0), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, rz31.P0, new j4r(o641.d), rz31.Q0), new l4r(new wlu(jd11Var.b(hll.class)), 2, rz31.R0, new j4r(o641.e), rz31.S0), new l4r(new wlu(jd11Var.b(a7q0.class)), 2, rz31.T0, new j4r(o641.f), rz31.U0), new aaq0(this, (byte) 19));
        this.e = w3p1.o(new l4r(pwc0.s, 2, rz31.V0, new j4r(rz31.f), rz31.X0), rz31.g);
        this.f = new iik0(this, (byte) 17);
    }

    public static vi11 A(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626091, (ViewGroup) null, false);
        int i = 2131428103;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428103);
        if (encoreButtonT != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i = 2131430752;
            ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131430752);
            if (imageView != null) {
                i = 2131430754;
                ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131430754);
                if (progressBar != null) {
                    return new vi11(constraintLayout, encoreButtonT, constraintLayout, imageView, progressBar, (byte) 7);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static final wt20 a(String str, vi11 vi11Var) {
        Flowable flowable = (Flowable) vi11Var.b;
        vbm[] vbmVarArr = q601.a;
        return z4p1.F(new zo51(new h801(new kge(flowable), (byte) 7), str, (byte) 21), 1);
    }

    public static final /* synthetic */ bbc d(vi11 vi11Var) {
        return (bbc) vi11Var.c;
    }

    public static final /* synthetic */ BluetoothGattServer e(vi11 vi11Var) {
        return (BluetoothGattServer) vi11Var.d;
    }

    public static final /* synthetic */ mmr0 f(e090 e090Var, String str) {
        return new mmr0(e090Var, str);
    }

    public static final Object g(vi11 vi11Var, vse0 vse0Var) {
        Object objCollect;
        return (((b1y) vi11Var.f).a.l() > 0 && (objCollect = hu20.e(new tu41((mr20) vi11Var.d, (byte) 21), new y3s((lnm) null, vi11Var, (byte) 11)).collect(new j0z0(vi11Var, (byte) 27), vse0Var)) == d9n.a) ? objCollect : rih1.a;
    }

    public static final cqd1 h(vi11 vi11Var, byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        List listQ0 = ihc1.Q0(new String(bArr, nne.a), new String[]{"|"}, 0, 6);
        if (listQ0.size() != 3) {
            Logger.d("Tap BLE Peripheral: Expected 3 pipe-separated fields, got %d", new Object[]{Integer.valueOf(listQ0.size())});
            return null;
        }
        return new cqd1((String) listQ0.get(0), (String) listQ0.get(2), (String) listQ0.get(1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(bpb1 bpb1Var, VideoSurfaceView videoSurfaceView, boolean z, onm onmVar) {
        tcj1 tcj1Var;
        if (onmVar instanceof tcj1) {
            tcj1Var = (tcj1) onmVar;
            int i = tcj1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tcj1Var.g = i - Integer.MIN_VALUE;
            } else {
                tcj1Var = new tcj1(this, onmVar);
            }
        } else {
            tcj1Var = new tcj1(this, onmVar);
        }
        Object objJ = tcj1Var.e;
        int i2 = tcj1Var.g;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                d0u0 vwm0Var = new vwm0(this, bpb1Var, (byte) 1);
                li0 li0Var = (li0) this.b;
                Single map = li0Var.b.map(new gid(li0Var, Arrays.asList(vwm0Var), (byte) 9));
                tcj1Var.a = bpb1Var;
                tcj1Var.b = videoSurfaceView;
                tcj1Var.c = this;
                tcj1Var.d = z;
                tcj1Var.g = 1;
                objJ = fc11.j(map, tcj1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = tcj1Var.d;
                this = tcj1Var.c;
                videoSurfaceView = tcj1Var.b;
                bpb1Var = tcj1Var.a;
                hm5.M(objJ);
            }
            uoa uoaVar = (uoa) objJ;
            uoaVar.d(videoSurfaceView);
            uoaVar.o(z);
            uoaVar.q(true);
            this.e = (uoa) objJ;
            jzt0 jzt0Var = jzt0.a;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, jzt0Var);
        } catch (Throwable th) {
            bpb1Var.getClass();
            bpb1Var.m((Object) null, kzt0.a);
            n57.e(th.getMessage());
        }
        return rih1.a;
    }

    public Observable C(String str) {
        bma1 bma1VarN = bma1.b.n("watch_feed_first_time_user_".concat(str));
        return yoi1.i(((dma1) this.b).q(bma1VarN), o6x.a).filter(f2x0.Y).map(h2x0.Y).startWith(Observable.fromCallable(new tt71(this, bma1VarN, (byte) 1))).distinctUntilChanged();
    }

    public Object D(zx0 zx0Var) {
        Object objS = smo1.s(new wp41(this, (lnm) null, (byte) 19), zx0Var);
        return objS == d9n.a ? objS : rih1.a;
    }

    public void E(String str) {
        this.b = str;
    }

    public void F(String str, String str2) {
        ayh ayhVarA = sap1.a();
        ((ConcurrentHashMap) this.f).put(str, ayhVarA);
        fn31.T((llm) this.e, (o8n) null, 0, new vxg1(ayhVarA, this, str2, (lnm) null, (byte) 29), 3);
    }

    public v1m1 G(String str) {
        ayh ayhVar = (zxh) ((ConcurrentHashMap) this.f).get(str);
        if (ayhVar == null || !ayhVar.v()) {
            return null;
        }
        return (v1m1) ayhVar.Z();
    }

    public void H(float[] fArr) {
        Matrix matrix = (Matrix) this.e;
        matrix.reset();
        ((Matrix) this.c).invert(matrix);
        matrix.mapPoints(fArr);
        ((zdk1) this.d).a.invert(matrix);
        matrix.mapPoints(fArr);
        ((Matrix) this.b).invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void I(float[] fArr) {
        ((Matrix) this.b).mapPoints(fArr);
        ((zdk1) this.d).a.mapPoints(fArr);
        ((Matrix) this.c).mapPoints(fArr);
    }

    public void J(Integer num) {
        this.e = num;
    }

    public void K() {
        zdk1 zdk1Var = (zdk1) this.d;
        Matrix matrix = (Matrix) this.c;
        matrix.reset();
        RectF rectF = zdk1Var.b;
        float f = rectF.left;
        float f2 = zdk1Var.d;
        matrix.postTranslate(f, f2 - (f2 - rectF.bottom));
    }

    public void L(float f, float f2, float f3, float f4) {
        Matrix matrix = (Matrix) this.b;
        zdk1 zdk1Var = (zdk1) this.d;
        float fWidth = zdk1Var.b.width() / f2;
        float fHeight = zdk1Var.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }

    public void M(String str) {
        this.f = str;
    }

    public Object N(String str) {
        Object objRemove = ((LinkedHashMap) this.b).remove(str);
        ((LinkedHashMap) this.d).remove(str);
        ((LinkedHashMap) this.e).remove(str);
        return objRemove;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        if (r12 == r7) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object O(java.lang.String r10, java.lang.String r11, p.onm r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vi11.O(java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    public void P() {
        l1d.B((yqg) this.d, ((dma1) this.b).edit(), (bma1) this.f);
    }

    public Single Q(Map map, Map map2) {
        Single singleA;
        if (u890.j(map.get("page_token"), "")) {
            singleA = zho1.H((hc51) this.e, new d4v0(this, map, map2, (byte) 27));
        } else {
            singleA = (((di4) this.f).Y() > 10 ? (rd51) this.c : (rd51) this.b).a(map, map2);
        }
        return singleA.map(new dr41((n851) this.d, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object R(Map map, Map map2, onm onmVar) {
        vw41 vw41Var;
        n851 n851Var;
        if (onmVar instanceof vw41) {
            vw41Var = (vw41) onmVar;
            int i = vw41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw41Var.d = i - Integer.MIN_VALUE;
            } else {
                vw41Var = new vw41(this, onmVar);
            }
        } else {
            vw41Var = new vw41(this, onmVar);
        }
        Object obj = vw41Var.b;
        int i2 = vw41Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            n851 n851Var2 = (n851) this.d;
            rd51 rd51Var = ((di4) this.f).Y() > 10 ? (rd51) this.c : (rd51) this.b;
            vw41Var.a = n851Var2;
            vw41Var.d = 1;
            Object objD = rd51Var.d(map, map2, vw41Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            obj = objD;
            n851Var = n851Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n851Var = vw41Var.a;
            hm5.M(obj);
        }
        return n851Var.b((MainViewResponse) obj);
    }

    public void S(Object obj, String str) {
        ((LinkedHashMap) this.b).put(str, obj);
        bpb1 bpb1Var = (wen0) ((LinkedHashMap) this.d).get(str);
        if (bpb1Var != null) {
            bpb1Var.l(obj);
        }
        bpb1 bpb1Var2 = (wen0) ((LinkedHashMap) this.e).get(str);
        if (bpb1Var2 != null) {
            bpb1Var2.l(obj);
        }
    }

    public any T(u9c0 u9c0Var, VideoSurfaceView videoSurfaceView, boolean z) {
        bpb1 bpb1VarB = gio1.b((Object) null);
        fn31.T(u9c0Var, (q8n) this.d, 0, new du2(this, bpb1VarB, videoSurfaceView, z, (lnm) null, (byte) 22), 2);
        return new any(bpb1VarB, (byte) 18);
    }

    public void U(boolean z) {
        if (z) {
            bxn0 bxn0Var = (bxn0) this.d;
            if (bxn0Var.c == null && bxn0Var.d) {
                i1s0 i1s0Var = new i1s0(bxn0Var.b.b(), 193, "from_partner_app");
                bxn0Var.c = i1s0Var;
                bxn0Var.d(i1s0Var);
            }
        }
        ((dkl) this.f).accept(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object V(onm onmVar) {
        qu81 qu81Var;
        wen0 wen0Var;
        a090 a090Var;
        if (onmVar instanceof qu81) {
            qu81Var = (qu81) onmVar;
            int i = qu81Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qu81Var.d = i - Integer.MIN_VALUE;
            } else {
                qu81Var = new qu81(this, onmVar);
            }
        } else {
            qu81Var = new qu81(this, onmVar);
        }
        Object obj = qu81Var.b;
        int i2 = qu81Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            wen0 wen0Var2 = (wen0) this.c;
            Flowable flowable = (Flowable) this.b;
            qu81Var.a = wen0Var2;
            qu81Var.d = 1;
            Object objM = u890.m(flowable, 1, qu81Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
            obj = objM;
            wen0Var = wen0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wen0Var = qu81Var.a;
            hm5.M(obj);
        }
        String str = (String) ((PlayerState) obj).contextMetadata().get("interactivity_state");
        a090 a090Var2 = a090.a;
        if (str != null) {
            if (str.equals("")) {
                a090Var = a090Var2;
            } else if (str.equals("listen")) {
                a090Var = zz80.a;
            } else if (str.equals("client-think")) {
                a090Var = c090.a;
            } else if (str.equals("acknowledge")) {
                a090Var = yz80.a;
            } else if (str.equals("think")) {
                a090Var = d090.a;
            } else {
                a090Var = str.equals("play") ? b090.a : null;
            }
            if (a090Var != null) {
                a090Var2 = a090Var;
            }
        }
        ((bpb1) wen0Var).m((Object) null, a090Var2);
        return rih1.a;
    }

    public void W(String str) {
        this.d = str;
    }

    public void X(Uri uri) {
        oxn1 oxn1Var;
        int i;
        Context context = (Context) this.b;
        if (uri == null) {
            Y();
            return;
        }
        if (uri.equals((Uri) this.d)) {
            return;
        }
        Y();
        this.d = uri;
        pt70 pt70Var = (pt70) this.c;
        int i2 = pt70Var.b;
        if (i2 == 0 || (i = pt70Var.c) == 0) {
            oxn1Var = new oxn1(context, 0, 0, this);
            this.e = oxn1Var;
        } else {
            oxn1Var = new oxn1(context, i2, i, this);
            this.e = oxn1Var;
        }
        Uri uri2 = (Uri) this.d;
        zod.s(uri2);
        oxn1Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void Y() {
        oxn1 oxn1Var = (oxn1) this.e;
        if (oxn1Var != null) {
            oxn1Var.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 13:
                String str = (String) obj;
                Boolean bool = (Boolean) this.f;
                String str2 = (String) this.c;
                String str3 = (String) this.e;
                ip91 ip91Var = (ip91) this.b;
                if (!q7j0.c(str)) {
                    return ip91Var.e(str3).map(new wgz0((byte) 6, bool.booleanValue()));
                }
                if (((t35) ip91Var.c.a.get()).F()) {
                    return Observable.combineLatest(ip91Var.f(str2).toObservable(), ip91Var.g((String) this.d, str), ip91Var.e(str3), kcx0.O0);
                }
                return Observable.combineLatest(ip91Var.f(str2).toObservable(), ip91Var.e(str3), new wgz0((byte) 7, bool.booleanValue()));
            default:
                SourceDevice sourceDevice = (SourceDevice) obj;
                ((t45) this.b).g("switch-to-local");
                PlayIntent playIntent = (PlayIntent) this.c;
                return new SearchEndpointRequest(playIntent.getQuery(), playIntent.getQueryLanguage(), sourceDevice, sourceDevice, new ParsedQuery("PLAY", playIntent.getUri().toString()), ((lxh1) ((tp7) this.d).f).k(new roa0(((m210) this.e).k)).b(playIntent), (String) this.f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, onm onmVar) {
        w1m1 w1m1Var;
        if (onmVar instanceof w1m1) {
            w1m1Var = (w1m1) onmVar;
            int i = w1m1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1m1Var.c = i - Integer.MIN_VALUE;
            } else {
                w1m1Var = new w1m1(this, onmVar);
            }
        } else {
            w1m1Var = new w1m1(this, onmVar);
        }
        Object objO = w1m1Var.a;
        int i2 = w1m1Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            zxh zxhVar = (zxh) ((ConcurrentHashMap) this.f).get(str);
            if (zxhVar == null) {
                return new v1m1();
            }
            c38 c38Var = new c38(zxhVar, (lnm) null, (byte) 5);
            w1m1Var.c = 1;
            objO = rc2.O(1500L, c38Var, w1m1Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        v1m1 v1m1Var = (v1m1) objO;
        return v1m1Var == null ? new v1m1() : v1m1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, onm onmVar) {
        eu81 eu81Var;
        if (onmVar instanceof eu81) {
            eu81Var = (eu81) onmVar;
            int i = eu81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eu81Var.c = i - Integer.MIN_VALUE;
            } else {
                eu81Var = new eu81(this, onmVar);
            }
        } else {
            eu81Var = new eu81(this, onmVar);
        }
        Object objI = eu81Var.a;
        int i2 = eu81Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            Flowable flowable = (Flowable) this.b;
            vbm[] vbmVarArr = q601.a;
            apw apwVar = new apw(new kge(flowable), str, (byte) 1);
            eu81Var.c = 1;
            objI = b5p1.i(apwVar, eu81Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        return new huz(u890.j(((PlayerState) objI).contextMetadata().get("interactivity_response"), "play") ? b090.a : yz80.a, (byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(onm onmVar) {
        gu81 gu81Var;
        if (onmVar instanceof gu81) {
            gu81Var = (gu81) onmVar;
            int i = gu81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gu81Var.c = i - Integer.MIN_VALUE;
            } else {
                gu81Var = new gu81(this, onmVar);
            }
        } else {
            gu81Var = new gu81(this, onmVar);
        }
        Object obj = gu81Var.a;
        int i2 = gu81Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            Flowable flowable = (Flowable) this.b;
            vbm[] vbmVarArr = q601.a;
            h801 h801Var = new h801(new kge(flowable), (byte) 8);
            gu81Var.c = 1;
            Object objI = b5p1.i(h801Var, gu81Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new huz(b090.a, (byte) 10);
    }

    public a7h1 l() {
        String str = (String) this.b;
        gxo1.o(str, "path node name");
        return new a7h1(str, (String) this.c, (Integer) this.e, (String) this.d, (String) this.f);
    }

    public jhm m(String str) {
        return new jhm("your_episodes_remove_item", bpx.c, (fhm) null, 2131954424, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(i021.a1, new q4z0(str, (byte) 27)), new nt01(this, str, (byte) 17)), 244);
    }

    public w2s n(wpw wpwVar, dzb1 dzb1Var, qtw qtwVar) {
        e821 e821Var = (e821) this.c;
        return new w2s(new dx0((FlowableMap) e821Var.b, (FlowableTransformer) e821Var.e, (FlowableTransformer) e821Var.d, (unr) e821Var.a, (aor) e821Var.c), new jpg0(((dpt0) this.d).a(), axb1.O0), (upd0) this.e, wpwVar, qtwVar, dzb1Var, (Flowable) this.b, (a0b) this.f);
    }

    public void o() {
        uoa uoaVar = (uoa) this.e;
        if (uoaVar != null) {
            uoaVar.f();
        }
        uoa uoaVar2 = (uoa) this.e;
        if (uoaVar2 != null) {
            uoaVar2.u();
        }
        uoa uoaVar3 = (uoa) this.e;
        if (uoaVar3 != null) {
            uoaVar3.i();
        }
        this.e = null;
    }

    public void p(String str) {
        ((ConcurrentHashMap) this.f).remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) {
        x1m1 x1m1Var;
        if (onmVar instanceof x1m1) {
            x1m1Var = (x1m1) onmVar;
            int i = x1m1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1m1Var.c = i - Integer.MIN_VALUE;
            } else {
                x1m1Var = new x1m1(this, onmVar);
            }
        } else {
            x1m1Var = new x1m1(this, onmVar);
        }
        Object objS = x1m1Var.a;
        int i2 = x1m1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                xrc0 xrc0Var = (xrc0) this.c;
                trc0 trc0Var = z1m1.a;
                x1m1Var.c = 1;
                objS = ryo1.s(xrc0Var, str, trc0Var, new xpv0((byte) 18), x1m1Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objS);
            }
            h120 h120Var = (h120) objS;
            if (h120Var == null) {
                return new t1m1((Integer) null, (gzl1) null, (Boolean) null, (Boolean) null, (Integer) null, 63);
            }
            t1m1 t1m1VarZ = h120Var.b != null ? vpb1.z(h120Var.c) : new t1m1((Integer) null, (gzl1) null, (Boolean) null, (Boolean) null, (Integer) null, 63);
            return new t1m1(t1m1VarZ.a, t1m1VarZ.b, t1m1VarZ.c, t1m1VarZ.d, t1m1VarZ.e, Boolean.valueOf(h120Var.a.s instanceof iwp0));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new t1m1((Integer) null, (gzl1) null, (Boolean) null, (Boolean) null, (Integer) null, 63);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(String str, onm onmVar) {
        y1m1 y1m1Var;
        boolean z;
        p811 p811Var;
        p811 p811Var2;
        if (onmVar instanceof y1m1) {
            y1m1Var = (y1m1) onmVar;
            int i = y1m1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y1m1Var.f = i - Integer.MIN_VALUE;
            } else {
                y1m1Var = new y1m1(this, onmVar);
            }
        } else {
            y1m1Var = new y1m1(this, onmVar);
        }
        Object obj = y1m1Var.d;
        d9n d9nVar = d9n.a;
        int i2 = y1m1Var.f;
        if (i2 == 0) {
            hm5.M(obj);
            y4m1 y4m1Var = (y4m1) this.b;
            dma1 dma1Var = y4m1Var.e;
            boolean z2 = (dma1Var == null && (dma1Var = y4m1Var.c.d) == null) ? true : !dma1Var.a(ezl1.b).contains(str);
            p811 p811Var3 = new p811();
            p811 p811Var4 = new p811();
            dfw0 dfw0Var = new dfw0(p811Var3, this, p811Var4, str, (lnm) null);
            y1m1Var.a = p811Var3;
            y1m1Var.b = p811Var4;
            y1m1Var.c = z2;
            y1m1Var.f = 1;
            if (smo1.s(dfw0Var, y1m1Var) == d9nVar) {
                return d9nVar;
            }
            z = z2;
            p811Var = p811Var3;
            p811Var2 = p811Var4;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = y1m1Var.c;
            p811Var2 = y1m1Var.b;
            p811Var = y1m1Var.a;
            hm5.M(obj);
        }
        t1m1 t1m1Var = (t1m1) p811Var2.a;
        if (t1m1Var == null) {
            t1m1Var = new t1m1((Integer) null, (gzl1) null, (Boolean) null, (Boolean) null, (Integer) null, 63);
        }
        return new v1m1(t1m1Var, Boolean.valueOf(z), (String) p811Var.a);
    }

    public Object s(String str) {
        Object value;
        try {
            bpb1 bpb1Var = (wen0) ((LinkedHashMap) this.e).get(str);
            if (bpb1Var != null && (value = bpb1Var.getValue()) != null) {
                return value;
            }
            return ((LinkedHashMap) this.b).get(str);
        } catch (ClassCastException unused) {
            N(str);
            return null;
        }
    }

    public LinkedHashMap t() {
        return (LinkedHashMap) this.e;
    }

    public LinkedHashMap u() {
        return (LinkedHashMap) this.b;
    }

    public ConstraintLayout v() {
        return (ConstraintLayout) this.b;
    }

    public tku w() {
        return (tku) this.f;
    }

    public void x(float f, float f2, cuf0 cuf0Var) {
        float[] fArr = (float[]) this.f;
        fArr[0] = f;
        fArr[1] = f2;
        H(fArr);
        cuf0Var.b = fArr[0];
        cuf0Var.c = fArr[1];
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010b A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:51:0x00f7, B:53:0x010b, B:58:0x0118), top: B:92:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:51:0x00f7, B:53:0x010b, B:58:0x0118), top: B:92:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #1 {all -> 0x0142, blocks: (B:62:0x013b, B:68:0x014f, B:77:0x018f, B:78:0x01ad), top: B:94:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0170 A[Catch: all -> 0x0048, TryCatch #4 {all -> 0x0048, blocks: (B:15:0x0043, B:72:0x016b, B:75:0x0170, B:76:0x018e), top: B:99:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018f A[Catch: all -> 0x0142, TRY_ENTER, TryCatch #1 {all -> 0x0142, blocks: (B:62:0x013b, B:68:0x014f, B:77:0x018f, B:78:0x01ad), top: B:94:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c9  */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0170, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x018f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01c9, please report this as an issue */
    public Object y(String str, String str2, Uri uri, long j, onm onmVar) throws Throwable {
        woj1 woj1Var;
        String str3;
        Uri uri2;
        long j2;
        String str4;
        Object obj;
        String str5;
        Uri uri3;
        int i;
        String str6;
        String str7;
        long j3;
        sm51 sm51Var;
        int dimension;
        rm51 rm51VarA;
        String str8;
        int i2;
        Uri uri4;
        Bitmap bitmap;
        int i3;
        int i4;
        long j4;
        Uri m231Var;
        Throwable thA;
        Throwable thA2;
        if (onmVar instanceof woj1) {
            woj1Var = (woj1) onmVar;
            int i5 = woj1Var.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                woj1Var.i = i5 - Integer.MIN_VALUE;
            } else {
                woj1Var = new woj1(this, onmVar);
            }
        } else {
            woj1Var = new woj1(this, onmVar);
        }
        Object objJ = woj1Var.g;
        int i6 = woj1Var.i;
        Serializable serializable = d9n.a;
        if (i6 == 0) {
            hm5.M(objJ);
            a42 a42Var = (a42) this.f;
            woj1Var.a = str;
            str3 = str2;
            woj1Var.b = str3;
            uri2 = uri;
            woj1Var.c = uri2;
            j2 = j;
            woj1Var.d = j2;
            woj1Var.i = 1;
            Serializable serializableD = a42Var.d(str, woj1Var);
            if (serializableD != serializable) {
                str4 = str;
                obj = serializableD;
            }
            return serializable;
        }
        if (i6 == 1) {
            long j5 = woj1Var.d;
            Uri uri5 = woj1Var.c;
            str3 = woj1Var.b;
            String str9 = woj1Var.a;
            hm5.M(objJ);
            j2 = j5;
            uri2 = uri5;
            obj = objJ;
            str4 = str9;
        } else if (i6 == 2) {
            i = woj1Var.e;
            long j6 = woj1Var.d;
            Uri uri6 = woj1Var.c;
            str6 = woj1Var.b;
            String str10 = woj1Var.a;
            try {
                hm5.M(objJ);
                uri2 = uri6;
                str7 = str10;
                j3 = j6;
                try {
                    sm51Var = (sm51) objJ;
                    dimension = (int) ((Context) this.d).getResources().getDimension(2131165563);
                    if (sm51Var != null) {
                        rm51VarA = sm51Var.a(dimension, j3, dimension);
                    } else {
                        rm51VarA = null;
                    }
                    if (rm51VarA != null) {
                        Single singleI = rm51VarA.b.i();
                        woj1Var.a = str7;
                        woj1Var.b = str6;
                        woj1Var.c = uri2;
                        woj1Var.d = j3;
                        woj1Var.e = i;
                        woj1Var.f = dimension;
                        woj1Var.i = 3;
                        objJ = fc11.j(singleI, woj1Var);
                        if (objJ != serializable) {
                            i3 = i;
                            i4 = dimension;
                            String str11 = str6;
                            str8 = str7;
                            str3 = str11;
                            uri4 = uri2;
                            bitmap = (Bitmap) objJ;
                            i2 = i4;
                            i = i3;
                            j4 = j3;
                            if (bitmap == null) {
                                throw new IllegalArgumentException(("Failed to load video frame for uri: " + uri4 + " at " + j4 + "ms").toString());
                            }
                            zxa zxaVar = (zxa) this.c;
                            woj1Var.a = str8;
                            woj1Var.b = str3;
                            woj1Var.c = uri4;
                            woj1Var.d = j4;
                            woj1Var.e = i;
                            woj1Var.f = i2;
                            woj1Var.i = 4;
                            objJ = zxa.d(zxaVar, bitmap, woj1Var);
                            if (objJ != serializable) {
                                uri3 = uri4;
                                str5 = str8;
                                m231Var = (Uri) objJ;
                                if (m231Var != null) {
                                    throw new IllegalArgumentException(("Failed to save video frame bitmap for uri: " + uri3 + " at " + j4 + "ms").toString());
                                }
                                thA = e331.a(m231Var);
                                if (thA == null) {
                                }
                                thA2 = e331.a(m231Var);
                                if (thA2 != null) {
                                    ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                                }
                                return m231Var;
                            }
                        }
                    } else {
                        String str12 = str6;
                        str8 = str7;
                        str3 = str12;
                        i2 = dimension;
                        uri4 = uri2;
                        bitmap = null;
                        j4 = j3;
                        if (bitmap == null) {
                            throw new IllegalArgumentException(("Failed to load video frame for uri: " + uri4 + " at " + j4 + "ms").toString());
                        }
                        zxa zxaVar2 = (zxa) this.c;
                        woj1Var.a = str8;
                        woj1Var.b = str3;
                        woj1Var.c = uri4;
                        woj1Var.d = j4;
                        woj1Var.e = i;
                        woj1Var.f = i2;
                        woj1Var.i = 4;
                        objJ = zxa.d(zxaVar2, bitmap, woj1Var);
                        if (objJ != serializable) {
                            uri3 = uri4;
                            str5 = str8;
                            m231Var = (Uri) objJ;
                            if (m231Var != null) {
                                throw new IllegalArgumentException(("Failed to save video frame bitmap for uri: " + uri3 + " at " + j4 + "ms").toString());
                            }
                            thA = e331.a(m231Var);
                            if (thA == null) {
                            }
                            thA2 = e331.a(m231Var);
                            if (thA2 != null) {
                                ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                            }
                            return m231Var;
                        }
                    }
                    return serializable;
                } catch (Throwable th) {
                    th = th;
                    str5 = str7;
                    uri3 = uri2;
                    str3 = str6;
                    m231Var = new m231(th);
                }
            } catch (Throwable th2) {
                th = th2;
                uri3 = uri6;
                str5 = str10;
                str3 = str6;
                m231Var = new m231(th);
                thA = e331.a(m231Var);
                if (thA == null) {
                }
                thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                }
                return m231Var;
            }
        } else if (i6 == 3) {
            i4 = woj1Var.f;
            int i7 = woj1Var.e;
            j3 = woj1Var.d;
            uri4 = woj1Var.c;
            String str13 = woj1Var.b;
            str8 = woj1Var.a;
            try {
                hm5.M(objJ);
                i3 = i7;
                str3 = str13;
                try {
                    bitmap = (Bitmap) objJ;
                    i2 = i4;
                    i = i3;
                    j4 = j3;
                    if (bitmap == null) {
                        throw new IllegalArgumentException(("Failed to load video frame for uri: " + uri4 + " at " + j4 + "ms").toString());
                    }
                    zxa zxaVar3 = (zxa) this.c;
                    woj1Var.a = str8;
                    woj1Var.b = str3;
                    woj1Var.c = uri4;
                    woj1Var.d = j4;
                    woj1Var.e = i;
                    woj1Var.f = i2;
                    woj1Var.i = 4;
                    objJ = zxa.d(zxaVar3, bitmap, woj1Var);
                    if (objJ != serializable) {
                        uri3 = uri4;
                        str5 = str8;
                        m231Var = (Uri) objJ;
                        if (m231Var != null) {
                            throw new IllegalArgumentException(("Failed to save video frame bitmap for uri: " + uri3 + " at " + j4 + "ms").toString());
                        }
                        thA = e331.a(m231Var);
                        if (thA == null) {
                        }
                        thA2 = e331.a(m231Var);
                        if (thA2 != null) {
                            ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                        }
                        return m231Var;
                    }
                    return serializable;
                } catch (Throwable th3) {
                    th = th3;
                    uri3 = uri4;
                    str5 = str8;
                    m231Var = new m231(th);
                }
            } catch (Throwable th4) {
                th = th4;
                uri3 = uri4;
                str3 = str13;
                str5 = str8;
                m231Var = new m231(th);
                thA = e331.a(m231Var);
                if (thA == null) {
                }
                thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                }
                return m231Var;
            }
        } else {
            if (i6 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = woj1Var.d;
            uri3 = woj1Var.c;
            str3 = woj1Var.b;
            str5 = woj1Var.a;
            try {
                hm5.M(objJ);
                m231Var = (Uri) objJ;
                if (m231Var != null) {
                    throw new IllegalArgumentException(("Failed to save video frame bitmap for uri: " + uri3 + " at " + j4 + "ms").toString());
                }
                thA = e331.a(m231Var);
                if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                }
                return m231Var;
            } catch (Throwable th5) {
                th = th5;
                m231Var = new m231(th);
            }
        }
        if (((Boolean) obj).booleanValue()) {
            return new m231(new AgeRestrictedContentException());
        }
        try {
            bbb1 bbb1Var = (bbb1) this.b;
            String host = uri2.getHost();
            if (host == null) {
                host = "";
            }
            woj1Var.a = str4;
            woj1Var.b = str3;
            woj1Var.c = uri2;
            woj1Var.d = j2;
            woj1Var.e = 0;
            woj1Var.i = 2;
            Object objA = bbb1Var.a(host, woj1Var);
            if (objA != serializable) {
                String str14 = str4;
                objJ = objA;
                i = 0;
                str6 = str3;
                str7 = str14;
                j3 = j2;
                sm51Var = (sm51) objJ;
                dimension = (int) ((Context) this.d).getResources().getDimension(2131165563);
                if (sm51Var != null) {
                    rm51VarA = sm51Var.a(dimension, j3, dimension);
                } else {
                    rm51VarA = null;
                }
                if (rm51VarA != null) {
                    Single singleI2 = rm51VarA.b.i();
                    woj1Var.a = str7;
                    woj1Var.b = str6;
                    woj1Var.c = uri2;
                    woj1Var.d = j3;
                    woj1Var.e = i;
                    woj1Var.f = dimension;
                    woj1Var.i = 3;
                    objJ = fc11.j(singleI2, woj1Var);
                    if (objJ != serializable) {
                        i3 = i;
                        i4 = dimension;
                        String str15 = str6;
                        str8 = str7;
                        str3 = str15;
                        uri4 = uri2;
                        bitmap = (Bitmap) objJ;
                        i2 = i4;
                        i = i3;
                        j4 = j3;
                        if (bitmap == null) {
                            throw new IllegalArgumentException(("Failed to load video frame for uri: " + uri4 + " at " + j4 + "ms").toString());
                        }
                        zxa zxaVar4 = (zxa) this.c;
                        woj1Var.a = str8;
                        woj1Var.b = str3;
                        woj1Var.c = uri4;
                        woj1Var.d = j4;
                        woj1Var.e = i;
                        woj1Var.f = i2;
                        woj1Var.i = 4;
                        objJ = zxa.d(zxaVar4, bitmap, woj1Var);
                        if (objJ != serializable) {
                            uri3 = uri4;
                            str5 = str8;
                            m231Var = (Uri) objJ;
                            if (m231Var != null) {
                                throw new IllegalArgumentException(("Failed to save video frame bitmap for uri: " + uri3 + " at " + j4 + "ms").toString());
                            }
                            thA = e331.a(m231Var);
                            if (thA == null) {
                            }
                            thA2 = e331.a(m231Var);
                            if (thA2 != null) {
                                ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                            }
                            return m231Var;
                        }
                    }
                } else {
                    String str16 = str6;
                    str8 = str7;
                    str3 = str16;
                    i2 = dimension;
                    uri4 = uri2;
                    bitmap = null;
                    j4 = j3;
                    if (bitmap == null) {
                        throw new IllegalArgumentException(("Failed to load video frame for uri: " + uri4 + " at " + j4 + "ms").toString());
                    }
                    zxa zxaVar5 = (zxa) this.c;
                    woj1Var.a = str8;
                    woj1Var.b = str3;
                    woj1Var.c = uri4;
                    woj1Var.d = j4;
                    woj1Var.e = i;
                    woj1Var.f = i2;
                    woj1Var.i = 4;
                    objJ = zxa.d(zxaVar5, bitmap, woj1Var);
                    if (objJ != serializable) {
                        uri3 = uri4;
                        str5 = str8;
                        m231Var = (Uri) objJ;
                        if (m231Var != null) {
                            throw new IllegalArgumentException(("Failed to save video frame bitmap for uri: " + uri3 + " at " + j4 + "ms").toString());
                        }
                        thA = e331.a(m231Var);
                        if (thA == null) {
                        }
                        thA2 = e331.a(m231Var);
                        if (thA2 != null) {
                            ((ltf1) this.e).g(str5, str3, 101, "Failed to load the video frame for video uri: " + uri3 + ", entity uri: " + str5, thA2);
                        }
                        return m231Var;
                    }
                }
            }
            return serializable;
        } catch (Throwable th6) {
            th = th6;
            str5 = str4;
            uri3 = uri2;
            m231Var = new m231(th);
        }
    }

    public void z(String str) {
        this.c = str;
    }

    public /* synthetic */ vi11(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public vi11(Context context, pt70 pt70Var) {
        this.a = (byte) 29;
        this.b = context;
        this.c = pt70Var;
        Y();
    }

    public vi11(Object obj, ViewGroup viewGroup, y1c1 y1c1Var, iac0 iac0Var, r6h1 r6h1Var) {
        this.a = (byte) 24;
        this.b = obj;
        this.c = y1c1Var;
        this.d = iac0Var;
        this.e = r6h1Var;
        this.f = viewGroup.getContext();
    }

    public vi11(dma1 dma1Var, v75 v75Var, yqg yqgVar) {
        this.a = (byte) 10;
        this.b = dma1Var;
        this.c = v75Var;
        this.d = yqgVar;
        nbc nbcVar = bma1.b;
        this.e = nbcVar.n("watch_feed_user_has_seen_vertical_onboarding_from_any_experience");
        this.f = nbcVar.n("watch_feed_last_time_onboarded");
    }

    public vi11(d341 d341Var, Scheduler scheduler, bxn0 bxn0Var) {
        this.a = (byte) 27;
        this.b = d341Var;
        this.c = scheduler;
        this.d = bxn0Var;
        this.e = EmptyDisposable.a;
        this.f = nfl1.a;
    }

    public vi11(hcf1 hcf1Var, my30 my30Var, ajg ajgVar, String str, ilh1 ilh1Var) {
        this.a = (byte) 26;
        this.b = hcf1Var;
        this.c = my30Var;
        this.d = ajgVar;
        this.e = str;
        this.f = ilh1Var;
        my30Var.a(new l2l1((String) null, 3, (Map) null, "presented"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vi11(Context context, byte b) {
        this(context, new pt70(-1, 0, 0));
        this.a = b;
        switch (b) {
            case 29:
                break;
            default:
                this.b = context;
                this.c = mno1.a(16, 0, 6);
                this.f = new wpd1(this);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi11(byte b) {
        this((Map) b7x.a);
        this.a = b;
        switch (b) {
            case 20:
                break;
            default:
                break;
        }
    }

    public vi11(Map map) {
        this.a = (byte) 6;
        this.b = new LinkedHashMap(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new tku(this, (byte) 4);
    }

    public vi11(zdk1 zdk1Var) {
        this.a = (byte) 19;
        this.b = new Matrix();
        this.c = new Matrix();
        this.e = new Matrix();
        this.f = new float[2];
        new Matrix();
        new Matrix();
        this.d = zdk1Var;
    }

    public vi11(y4m1 y4m1Var, xrc0 xrc0Var, zwz0 zwz0Var, llm llmVar) {
        this.a = (byte) 28;
        this.b = y4m1Var;
        this.c = xrc0Var;
        this.d = zwz0Var;
        this.e = llmVar;
        this.f = new ConcurrentHashMap();
    }

    public vi11(e821 e821Var, dpt0 dpt0Var, upd0 upd0Var, Flowable flowable, a0b a0bVar) {
        this.a = (byte) 15;
        this.c = e821Var;
        this.d = dpt0Var;
        this.e = upd0Var;
        this.b = flowable;
        this.f = a0bVar;
    }

    public vi11(RetrofitMaker retrofitMaker, Observable observable, cex0 cex0Var, mu2 mu2Var, m971 m971Var, Context context, add addVar, pni1 pni1Var, kly0 kly0Var) {
        this.a = (byte) 9;
        this.b = cex0Var;
        this.c = mu2Var;
        this.d = addVar;
        this.e = pni1Var;
        this.f = kly0Var;
    }

    public /* synthetic */ vi11(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
