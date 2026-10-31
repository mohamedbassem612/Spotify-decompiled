package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.tasks.Task;
import com.spotify.initialization.app.EarlyInitializationProvider;
import com.spotify.kidsgraduation.v1.PostponeGraduationRequest;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.mdata.proto.Mdata;
import spotify.your_library.esperanto.proto.IsCuratedItem;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mjv implements Function, Producer, ObservableOnSubscribe, ya, BiFunction, i2q0, yu30, qiw, f080, rjw0, e670 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ mjv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Long a() {
        yo60 yo60Var = (yo60) this.b;
        if (yo60Var == null) {
            return null;
        }
        long jP = yo60Var.d.b.p();
        se11 se11Var = na10.a;
        return Long.valueOf(TimeUnit.SECONDS.toMillis(jP));
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        return ((ytp0) this.b).v(kskVar.c, kskVar.a, 3);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                zwm1 zwm1Var = (zwm1) this.b;
                nsm1 nsm1VarO = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
                osm1 osm1Var = osm1.c;
                nsm1VarO.q(osm1Var);
                psm1VarP.v(nsm1VarO.build());
                nsm1 nsm1VarO2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO2.q(osm1Var);
                psm1VarP.A(nsm1VarO2.build());
                nsm1 nsm1VarO3 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO3.q(osm1Var);
                psm1VarP.s(nsm1VarO3.build());
                msm1 msm1VarO = YourLibraryConfig.YourLibraryLabelAndImage.o();
                msm1VarO.r(zwm1Var.d());
                msm1VarO.n("https://misc.scdn.co/new-episodes/ne-cover-300x300.png");
                psm1VarP.y(msm1VarO.build());
                if (((uut0) obj).a != 1) {
                    nsm1 nsm1VarO4 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
                    nsm1VarO4.q(osm1Var);
                    psm1VarP.q(nsm1VarO4.build());
                }
                return psm1VarP.build();
            case 7:
                jvd0 jvd0Var = (jvd0) obj;
                juz juzVar = (juz) this.b;
                gvd0 gvd0Var = jvd0Var.a;
                if (gvd0Var == null) {
                    return Single.just(jvd0Var);
                }
                List list = gvd0Var.k;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((ivd0) it.next()).c;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    return Single.just(jvd0Var);
                }
                rdh0 rdh0VarO = Mdata.LocalBatchedEntityRequest.o();
                sdh0 sdh0VarP = Mdata.LocalExtensionQuery.p();
                sdh0VarP.r(hz00.d4);
                sdh0VarP.n(arrayList);
                rdh0VarO.n(sdh0VarP);
                Mdata.LocalBatchedEntityRequest localBatchedEntityRequestBuild = rdh0VarO.build();
                zmj0 zmj0Var = juzVar.a;
                localBatchedEntityRequestBuild.getClass();
                return zmj0Var.a(localBatchedEntityRequestBuild).map(new mev((Object) juzVar, (byte) 9)).map(new w2z(gvd0Var, jvd0Var, (byte) 4)).onErrorReturnItem(jvd0Var);
            case 8:
                return ((ruz) this.b).g(((o9u0) obj).a);
            case 11:
                return ((c610) this.b).a((r9c) obj);
            case 14:
                return p7h.M(new eyo0[]{(eyo0) obj, (eyo0) this.b});
            case 15:
                ck20 ck20Var = (ck20) this.b;
                return ck20Var.b.b(ck20Var.a, (String) obj);
            case 19:
                j8x0 j8x0Var = (j8x0) obj;
                if (!j8x0Var.e) {
                    return Observable.just(j8x0Var);
                }
                j8x0 j8x0VarA = j8x0.a(j8x0Var, 0, (List) null, (String) null, false, false, 0, 3, 47);
                return ((p410) this.b).t(j8x0VarA).onErrorResumeNext(new h0y(j8x0VarA, (byte) 15));
            case 21:
                f0b0 f0b0Var = (f0b0) this.b;
                ghv0 ghv0VarN = PostponeGraduationRequest.n();
                ghv0VarN.n();
                PostponeGraduationRequest postponeGraduationRequestBuild = ghv0VarN.build();
                g0b0 g0b0Var = f0b0Var.a;
                postponeGraduationRequestBuild.getClass();
                return g0b0Var.e(postponeGraduationRequestBuild).d(Observable.just(p000.c)).onErrorReturn(f610.e);
            case 22:
                return ((jh50) this.b).a.c().onErrorReturnItem(new vc90()).toObservable();
            case 26:
                return new CompletableFromAction(new go91((io91) this.b, (String) obj, (byte) 1));
            default:
                return ((Boolean) obj).booleanValue() ? Observable.just(Boolean.TRUE) : Observable.just(Boolean.valueOf(((mw7) ((na) this.b).c).a.isWiredHeadsetOn()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable b(String str, onm onmVar) {
        b130 b130Var;
        if (onmVar instanceof b130) {
            b130Var = (b130) onmVar;
            int i = b130Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b130Var.c = i - Integer.MIN_VALUE;
            } else {
                b130Var = new b130(this, onmVar);
            }
        } else {
            b130Var = new b130(this, onmVar);
        }
        Object objI = b130Var.a;
        int i2 = b130Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                long jF = dv20.f(ihc1.X0(str, ":"));
                gvm1 gvm1VarO = YourLibraryRequest.o();
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                hvm1VarQ.v(jF);
                hvm1VarQ.C(Integer.MAX_VALUE);
                gvm1VarO.q(hvm1VarQ.build());
                YourLibraryRequest yourLibraryRequestBuild = gvm1VarO.build();
                vwm1 vwm1Var = (vwm1) this.b;
                yourLibraryRequestBuild.getClass();
                uji1 uji1VarD = vwm1Var.d(yourLibraryRequestBuild);
                b130Var.c = 1;
                objI = b5p1.i(uji1VarD, b130Var);
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
            h290 h290VarN = ((YourLibraryResponse) objI).n();
            ArrayList arrayList = new ArrayList();
            Iterator it = h290VarN.iterator();
            while (it.hasNext()) {
                String uri = ((YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it.next()).e().getUri();
                uri.getClass();
                if (uri.length() <= 0) {
                    uri = null;
                }
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public String c() {
        yo60 yo60Var = (yo60) this.b;
        if (yo60Var == null) {
            return null;
        }
        String str = yo60Var.h;
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public void d(l5v0 l5v0Var) {
        this.b = l5v0Var;
    }

    public void e(int i, Bitmap bitmap) {
        h98 h98Var = (h98) this.b;
        if (bitmap.isRecycled()) {
            eg.m("Check failed.");
        } else {
            ((ImageView) ((sp00) h98Var.c).e).setImageBitmap(bitmap);
        }
    }

    public Long f() {
        yo60 yo60Var = (yo60) this.b;
        if (yo60Var == null) {
            return null;
        }
        long jP = yo60Var.d.a.p();
        se11 se11Var = na10.a;
        return Long.valueOf(TimeUnit.SECONDS.toMillis(jP));
    }

    public Object get() {
        switch (this.a) {
            case 1:
                q8n q8nVar = ((EarlyInitializationProvider) this.b).d;
                if (q8nVar != null) {
                    return new DispatcherWorker(q8nVar);
                }
                u890.C("defaultDispatcher");
                throw null;
            default:
                return new DispatcherWorker(((md10) this.b).d);
        }
    }

    public String getImageUri() {
        yo60 yo60Var = (yo60) this.b;
        if (yo60Var != null) {
            return yo60Var.e;
        }
        return null;
    }

    public int h(y570 y570Var) {
        y570Var.getClass();
        return ((Integer) ((rm5) this.b).G(y570Var.h().a()).i(new cwa((byte) 9)).e(0)).intValue();
    }

    public String i() {
        yo60 yo60Var = (yo60) this.b;
        if (yo60Var != null) {
            return yo60Var.b;
        }
        return null;
    }

    public void onComplete(Task task) {
        Exception excV;
        l441 l441Var = (l441) this.b;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        ((jf01) this.b).d(new her(observableEmitter, (byte) 27));
    }

    public void v(Object obj) {
        Set set = (Set) obj;
        kj00 kj00Var = (kj00) this.b;
        set.getClass();
        MobiusLoop mobiusLoop = kj00Var.b;
        if (mobiusLoop == null) {
            u890.C("loop");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            String str = (String) obj2;
            if (nhc1.Y(str, "spotify:episode", false) || nhc1.Y(str, "spotify:show", false)) {
                arrayList.add(obj2);
            }
        }
        mobiusLoop.a(new xkl(o7h.p1(arrayList)));
    }

    public /* synthetic */ mjv(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }

    public mjv() {
        this.a = (byte) 18;
    }

    public void g(Drawable drawable) {
    }

    public void m(Drawable drawable) {
    }

    public Object apply(Object obj, Object obj2) {
        boolean isCurated;
        switch (this.a) {
            case 4:
                return mbx.c((y570) this.b, ((Boolean) obj2).booleanValue(), ((Boolean) obj).booleanValue());
            default:
                IsCuratedItem isCuratedItem = (IsCuratedItem) obj;
                sm81 sm81Var = (sm81) obj2;
                wh80 wh80Var = (wh80) this.b;
                if (sm81Var.a) {
                    if (sm81Var.b) {
                        isCurated = true;
                    } else {
                        isCurated = sm81Var.d ? isCuratedItem.getIsInCollection() : false;
                    }
                } else {
                    isCurated = isCuratedItem.getIsCurated();
                }
                return wh80Var.b(isCurated);
        }
    }
}
