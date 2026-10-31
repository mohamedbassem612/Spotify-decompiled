package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpResponse;
import com.spotify.gpb.trackingimpl.events.proto.GpbCheckoutEvents;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsPreparePlay;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.tap.go.events.proto.SpotifyGoCommandError;
import com.spotify.tap.go.events.proto.SpotifyGoCommandLifecycle;
import com.spotify.upsells.v1.proto.BatchShouldUpsellRequest;
import com.spotify.upsells.v1.proto.BatchShouldUpsellRequestItem;
import com.spotify.upsells.v1.proto.BatchShouldUpsellResponse;
import com.spotify.upsells.v1.proto.BatchShouldUpsellResult;
import com.spotify.upsells.v1.proto.GatedFeatureContext;
import com.spotify.upsells.v1.proto.GetUpsellRequest;
import com.spotify.upsells.v1.proto.GetUpsellResponse;
import com.spotify.upsells.v1.proto.ShouldUpsellRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class yfu implements brw, Function, b8l1, nyc, dl4, mqd0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public yfu(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new Object();
                AudioStream audioStream = AudioStream.DEFAULT;
                xx20 xx20Var = new xx20();
                xx20Var.a = false;
                xx20Var.b = audioStream;
                xx20Var.c = enh0.b;
                this.c = xx20Var;
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new AtomicInteger(1);
                break;
        }
    }

    public static /* synthetic */ void p(yfu yfuVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        yfuVar.o(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // p.b8l1
    public a8l1 a(iac0 iac0Var, Function0 function0, Function0 function1) {
        return v7l1.a((v7l1) this.b, iac0Var, function0, function1, new g050(this, (byte) 20), 16);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                xgt0 xgt0Var = (xgt0) obj;
                if (!(xgt0Var instanceof wgt0)) {
                    if (xgt0Var instanceof vgt0) {
                        return Single.just(feh.b(k4s0.j(2)));
                    }
                    eg.o();
                    return null;
                }
                muz muzVar = (muz) obj2;
                ujm ujmVar = muzVar.a;
                PlayCommand playCommand = (PlayCommand) this.c;
                upz upzVarN = EsPlay.PlayRequest.n();
                jqz jqzVarN = EsPreparePlay.PreparePlayRequest.n();
                jqzVarN.n(u2o1.i(playCommand.context()));
                jqzVarN.r(tot0.a(playCommand.playOrigin()));
                PreparePlayOptions preparePlayOptions = (PreparePlayOptions) playCommand.options().h();
                if (preparePlayOptions != null) {
                    jqzVarN.q(lyg.A(preparePlayOptions));
                }
                upzVarN.r(jqzVarN.build());
                PlayOptions playOptions = (PlayOptions) playCommand.playOptions().h();
                if (playOptions != null) {
                    upzVarN.q(j1p1.v(playOptions));
                }
                upzVarN.n(tgp1.s(muzVar.b.a(playCommand.loggingParams())));
                return ujmVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Play", upzVarN.build()).map(een.Z0).map(f331.P0);
            default:
                z460 z460Var = (z460) this.c;
                return ((uny) ((yfu) obj2).c).F((List) obj, z460Var);
        }
    }

    @Override // p.mqd0
    public Completable b(lqd0 lqd0Var) {
        return j2h1.D(igu.b, new k53(this, lqd0Var, (lnm) null, (byte) 17));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(ArrayList arrayList, onm onmVar) {
        i370 i370Var;
        Throwable th;
        Map map;
        BatchShouldUpsellResponse m231Var;
        if (onmVar instanceof i370) {
            i370Var = (i370) onmVar;
            int i = i370Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i370Var.d = i - Integer.MIN_VALUE;
            } else {
                i370Var = new i370(this, onmVar);
            }
        } else {
            i370Var = new i370(this, onmVar);
        }
        Object objC = i370Var.b;
        int i2 = i370Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                if (arrayList.isEmpty()) {
                    return b7x.a;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    GatedFeatureContext gatedFeatureContext = (GatedFeatureContext) obj;
                    arrayList2.add(oqn1.n(gatedFeatureContext.o() + "_" + gatedFeatureContext.n() + "_" + i3, gatedFeatureContext));
                    i3 = i4;
                }
                Map mapT = sqg0.T(arrayList2);
                try {
                    knm knmVar = (knm) this.b;
                    xga xgaVarP = BatchShouldUpsellRequest.p();
                    ArrayList arrayList3 = new ArrayList(mapT.size());
                    for (Map.Entry entry : mapT.entrySet()) {
                        String str = (String) entry.getKey();
                        GatedFeatureContext gatedFeatureContext2 = (GatedFeatureContext) entry.getValue();
                        yga ygaVarN = BatchShouldUpsellRequestItem.n();
                        ygaVarN.q(str);
                        z181 z181VarO = ShouldUpsellRequest.o();
                        z181VarO.n(gatedFeatureContext2);
                        ygaVarN.n(z181VarO);
                        arrayList3.add(ygaVarN.build());
                    }
                    xgaVarP.n(arrayList3);
                    BatchShouldUpsellRequest batchShouldUpsellRequest = (BatchShouldUpsellRequest) xgaVarP.build();
                    i370Var.a = mapT;
                    i370Var.d = 1;
                    objC = knmVar.c(batchShouldUpsellRequest, i370Var);
                    d9n d9nVar = d9n.a;
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                    map = mapT;
                } catch (Throwable th2) {
                    th = th2;
                    map = mapT;
                    m231Var = new m231(th);
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = i370Var.a;
                try {
                    hm5.M(objC);
                } catch (Throwable th3) {
                    th = th3;
                    m231Var = new m231(th);
                }
            }
            m231Var = (BatchShouldUpsellResponse) objC;
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                Logger.e(thA, "Failed to check batchShouldUpsell", new Object[0]);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            BatchShouldUpsellResponse batchShouldUpsellResponse = m231Var;
            if (batchShouldUpsellResponse == null) {
                return null;
            }
            h290<BatchShouldUpsellResult> h290VarN = batchShouldUpsellResponse.n();
            ArrayList arrayList4 = new ArrayList();
            for (BatchShouldUpsellResult batchShouldUpsellResult : h290VarN) {
                GatedFeatureContext gatedFeatureContext3 = (GatedFeatureContext) map.get(batchShouldUpsellResult.n());
                mmr0 mmr0VarN = gatedFeatureContext3 != null ? oqn1.n(gatedFeatureContext3, batchShouldUpsellResult.o()) : null;
                if (mmr0VarN != null) {
                    arrayList4.add(mmr0VarN);
                }
            }
            return sqg0.T(arrayList4);
        } catch (CancellationException e) {
            throw e;
        }
    }

    public void d() {
        b550 b550VarN = GpbCheckoutEvents.n();
        b550VarN.n("CheckoutInitiated");
        b550VarN.r();
        pf61 pf61Var = (pf61) this.c;
        b550VarN.v(pf61Var.c());
        pf61Var.a();
        b550VarN.t(pf61Var.a());
        ((t2j0) this.b).a(b550VarN.build());
    }

    public Parcelable e(y570 y570Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.b;
        IdentityHashMap identityHashMap = (IdentityHashMap) ((uo5) this.c).d;
        y570Var.getClass();
        y570 y570Var2 = (y570) identityHashMap.get(y570Var);
        if (y570Var2 != null) {
            return (Parcelable) weakHashMap.get(y570Var2.a());
        }
        hhg1.n(f4i1.f("Model ", y570Var.a() != null ? y570Var.a() : y570Var.toString(), " not resolved"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(GatedFeatureContext gatedFeatureContext, e2i1 e2i1Var, fyl fylVar, onm onmVar) {
        j370 j370Var;
        GetUpsellResponse m231Var;
        if (onmVar instanceof j370) {
            j370Var = (j370) onmVar;
            int i = j370Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j370Var.c = i - Integer.MIN_VALUE;
            } else {
                j370Var = new j370(this, onmVar);
            }
        } else {
            j370Var = new j370(this, onmVar);
        }
        Object objA = j370Var.a;
        int i2 = j370Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                GetUpsellRequest getUpsellRequestO = ouo1.O(gatedFeatureContext, e2i1Var, (wpv0) this.c, fylVar);
                knm knmVar = (knm) this.b;
                j370Var.c = 1;
                objA = knmVar.a(getUpsellRequestO, j370Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (GetUpsellResponse) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to get upsell", new Object[0]);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public void g(String str, String str2) {
        pf61 pf61Var = (pf61) this.c;
        pf61Var.a();
        b550 b550VarN = GpbCheckoutEvents.n();
        b550VarN.n("GPBCheckoutCompleted");
        b550VarN.r();
        b550VarN.t(pf61Var.a());
        b550VarN.u(str2);
        if (str != null) {
            b550VarN.s(str);
        }
        ((t2j0) this.b).a(b550VarN.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object h(taw tawVar, onm onmVar) {
        fz10 fz10Var;
        b35 b35Var = (b35) this.c;
        if (onmVar instanceof fz10) {
            fz10Var = (fz10) onmVar;
            int i = fz10Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fz10Var.d = i - Integer.MIN_VALUE;
            } else {
                fz10Var = new fz10(this, onmVar);
            }
        } else {
            fz10Var = new fz10(this, onmVar);
        }
        Object objC = fz10Var.b;
        int i2 = fz10Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                dqu dquVar = (dqu) this.b;
                ww30 ww30Var = tawVar.a;
                boolean z = tawVar.b;
                fz10Var.a = tawVar;
                fz10Var.d = 1;
                objC = dquVar.c(ww30Var, z, fz10Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tawVar = fz10Var.a;
                hm5.M(objC);
            }
            return new dyz((dw30) objC, tawVar.a, b35Var.b(), b35Var.f());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new cyz(th, tawVar.a == ww30.a);
        }
    }

    public void i() {
        List listM = p7h.M((wre0) this.b, (hxd1) this.c);
        List list = Logger.a;
        kg5 kg5Var = new kg5();
        sjb sjbVar = new sjb((byte) 27);
        Logger.a = Collections.unmodifiableList(listM);
        Logger.b = kg5Var;
        Logger.c = sjbVar;
        synchronized (Logger.d) {
            kue0 kue0Var = Logger.e;
            if (kue0Var instanceof kue0) {
                kue0Var.b();
                Logger.e = as10.Y;
            }
        }
    }

    public Object j(Uri uri, onm onmVar) {
        if (wmo1.l(uri)) {
            return c921.H((q8n) this.b, new xw0(this, uri, (lnm) null, (byte) 4), onmVar);
        }
        bhn0.k("Uri ", uri, " is not a local uri");
        return null;
    }

    @Override // p.nyc
    public void k(jf01 jf01Var, IOException iOException) {
        switch (this.a) {
            case 18:
                q(iOException);
                break;
            default:
                try {
                    ((myc) this.b).u((wyp0) this.c, iOException);
                } catch (Throwable th) {
                    m5n1.V(th);
                    th.printStackTrace();
                    return;
                }
                break;
        }
    }

    public void l() throws IOException {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            k220.p(f4i1.f("Unable to lock file: '", str, "'."), th);
        }
    }

    public void m(byte[] bArr, int i) {
        b4b1 b4b1VarN = SpotifyGoCommandError.n();
        hhc hhcVar = phc.b;
        b4b1VarN.n(phc.e(0, bArr, bArr.length));
        b4b1VarN.q(kx40.i(i));
        ((t2j0) this.b).a(b4b1VarN.build());
    }

    @Override // p.nyc
    public void n(jf01 jf01Var, ry21 ry21Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 18:
                HttpConnection httpConnection = (HttpConnection) obj;
                try {
                    try {
                        if (ry21Var.R0) {
                            httpConnection.onRedirect();
                        }
                        t360 t360VarI = m5n1.i(ry21Var.f);
                        t360VarI.b("SPT-Protocol", ry21Var.b.a);
                        httpConnection.onHeaders(new HttpResponse(ry21Var.d, ry21Var.a.a.i, m5n1.g(t360VarI).toString()));
                        uz21 uz21Var = ry21Var.g;
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = uz21Var.d1().read(bArr);
                            if (i == -1) {
                                HttpConnection.onComplete$default(httpConnection, false, 1, (Object) null);
                                break;
                            } else {
                                httpConnection.onBytesAvailable(bArr, i);
                            }
                            return;
                        }
                    } catch (IOException e) {
                        q(e);
                    }
                } finally {
                    ry21Var.close();
                }
                break;
            default:
                myc mycVar = (myc) obj;
                wyp0 wyp0Var = (wyp0) this.c;
                try {
                    try {
                        mycVar.z(wyp0Var, wyp0Var.d(ry21Var));
                        return;
                    } catch (Throwable th) {
                        m5n1.V(th);
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    m5n1.V(th2);
                    try {
                        mycVar.u(wyp0Var, th2);
                        return;
                    } catch (Throwable th3) {
                        m5n1.V(th3);
                        th3.printStackTrace();
                        return;
                    }
                }
        }
    }

    public void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        c4b1 c4b1VarN = SpotifyGoCommandLifecycle.n();
        c4b1VarN.s(str);
        c4b1VarN.x(str6);
        e1l e1lVar = (e1l) ((g0l) this.c).Y.h();
        c4b1VarN.t(e1lVar != null ? e1lVar.a : false);
        if (str2 != null) {
            c4b1VarN.r(str2);
        }
        if (str3 != null) {
            c4b1VarN.q(str3);
        }
        if (str4 != null) {
            c4b1VarN.w(str4);
        }
        if (str5 != null) {
            c4b1VarN.n(str5);
        }
        if (str7 != null) {
            c4b1VarN.u(str7);
        }
        if (str8 != null) {
            c4b1VarN.v(str8);
        }
        ((t2j0) this.b).a(c4b1VarN.build());
    }

    public void q(IOException iOException) {
        HttpConnection httpConnection = (HttpConnection) this.b;
        if (iOException instanceof SocketTimeoutException) {
            httpConnection.onError(HttpConnection.kErrorHttpTimeout);
        } else if (((o270) this.c).e) {
            httpConnection.onError(HttpConnection.kErrorHttpAborted);
        } else {
            httpConnection.onError(HttpConnection.kErrorHttpFail);
        }
    }

    public void r(y570 y570Var, Parcelable parcelable) {
        IdentityHashMap identityHashMap = (IdentityHashMap) ((uo5) this.c).d;
        y570Var.getClass();
        y570 y570Var2 = (y570) identityHashMap.get(y570Var);
        if (y570Var2 == null || y570Var2.a() == null) {
            return;
        }
        ((WeakHashMap) this.b).put(y570Var2.a(), parcelable);
    }

    public void s(boolean z) {
        synchronized (this.b) {
            ((xx20) this.c).a = z;
        }
    }

    public void start() {
        View view = (View) this.b;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        dtw dtwVar = (dtw) this.c;
        if (zIsAttachedToWindow) {
            dtwVar.g(view);
        } else {
            dtwVar.s = true;
        }
    }

    public void stop() {
        otu otuVarS;
        dtw dtwVar = (dtw) this.c;
        dtwVar.s = false;
        View view = dtwVar.w;
        if (view.isSaveEnabled()) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("view_state", sparseArray);
            dtwVar.b.j(bundle);
        }
        if (dtwVar.q) {
            dtwVar.t = false;
            op80 op80VarB = dtwVar.l.b();
            if (op80VarB != null && (otuVarS = z8p1.s(op80VarB)) != null) {
                otuVarS.g(dtwVar.a.b(), dtwVar.b.h());
            }
            dtwVar.q = false;
            dtwVar.j();
        }
    }

    @Override // p.dl4
    public void w(Object obj) {
        i94 i94Var = (i94) ((lxg) this.b);
        i94Var.e("application_injection");
        ((daq) this.c).w((pzo) obj);
        i94Var.a("application_injection");
    }

    public /* synthetic */ yfu(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public yfu(uo5 uo5Var) {
        this.a = (byte) 20;
        this.b = new WeakHashMap();
        this.c = uo5Var;
    }

    public /* synthetic */ yfu(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public yfu(String str, byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = str.concat(".lck");
                break;
            default:
                this.c = null;
                this.b = str;
                break;
        }
    }
}
