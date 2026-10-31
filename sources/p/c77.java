package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenPublisher;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c77 extends v7s {
    public final tp7 k;
    public final tp7 l;
    public final zle1 m;
    public final dxg1 n;
    public final f77 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9p;
    public final hce1 q;

    public c77(x610 x610Var, PlayOrigin playOrigin, cjq cjqVar, tp7 tp7Var, tp7 tp7Var2, zle1 zle1Var, oyr oyrVar, g510 g510Var, d8q d8qVar, r8l r8lVar, b791 b791Var, dxg1 dxg1Var, u210 u210Var, phl1 phl1Var, e8q e8qVar, uic uicVar, f77 f77Var, boolean z) {
        hce1 hce1Var;
        super(x610Var, playOrigin, 1, oyrVar, g510Var, d8qVar, r8lVar, b791Var, u210Var, phl1Var, e8qVar, uicVar);
        this.k = tp7Var;
        this.l = tp7Var2;
        this.m = zle1Var;
        this.n = dxg1Var;
        this.o = f77Var;
        this.f9p = z;
        switch (cjqVar.a) {
            case 0:
                daq daqVar = ((obq) cjqVar.b).b;
                hce1Var = new hce1((Flowable) daqVar.D5.get(), (Scheduler) daqVar.z1.get(), (g510) daqVar.L5.get(), x610Var);
                break;
            default:
                daq daqVar2 = ((obq) cjqVar.b).b;
                hce1Var = new hce1((Flowable) daqVar2.D5.get(), (Scheduler) daqVar2.z1.get(), (g510) daqVar2.L5.get(), x610Var);
                break;
        }
        this.q = hce1Var;
    }

    @Override // p.v7s
    public final Completable a(long j, String str) {
        SingleEmitter singleEmitter = this.n.b;
        if (singleEmitter != null) {
            singleEmitter.onSuccess(Boolean.FALSE);
        }
        return super.a(j, str);
    }

    @Override // p.v7s
    public final Completable b(String str, Uri uri, Bundle bundle) {
        SingleEmitter singleEmitter = this.n.b;
        if (singleEmitter != null) {
            singleEmitter.onSuccess(Boolean.FALSE);
        }
        t45 t45VarX = x(uri, str);
        m210 m210VarA = this.g.a(str);
        PlayIntent playIntentCreate = PlayIntent.Companion.create(uri, bundle);
        String query = playIntentCreate.getQuery();
        f77 f77Var = this.o;
        f77Var.getClass();
        if (str.equals("com.google.android.googlequicksearchbox") && query != null) {
            f77Var.b.m((Object) null, new v0z0(query, f77Var.a.b()));
        }
        return this.f.e(m210VarA, playIntentCreate.getUri().toString(), (w7h1) null, (ou80) null, 2).flatMapCompletable(new ajq0(this, playIntentCreate, m210VarA, str, t45VarX));
    }

    @Override // p.v7s
    public final Completable c(String str) {
        SingleEmitter singleEmitter = this.n.b;
        if (singleEmitter != null) {
            singleEmitter.onSuccess(Boolean.FALSE);
        }
        return this.f.o(this.g.a(str)).map(b77.a).flatMap(new x6o0(this, (byte) 26)).ignoreElement();
    }

    @Override // p.v7s
    public final Completable e(String str) {
        dxg1 dxg1Var = this.n;
        dxg1Var.getClass();
        return Single.create(new o2b1(dxg1Var, (byte) 16)).timeout(5000L, TimeUnit.MILLISECONDS, dxg1Var.a).onErrorReturn(djx0.U0).flatMapCompletable(new em3(this, str, (byte) 19));
    }

    @Override // p.v7s
    public final Completable h(int i, String str) {
        if (i != 1 && i != 2 && i != 3) {
            throw null;
        }
        m210 m210VarA = this.g.a(str);
        hce1 hce1Var = this.q;
        hce1Var.getClass();
        if (i == 3) {
            return CompletableEmpty.a;
        }
        boolean z = i == 1;
        Completable completableIgnoreElement = ((g510) hce1Var.d).c(m210VarA, z).ignoreElement();
        Flowable flowable = (Flowable) hce1Var.b;
        FlowableObserveOn flowableObserveOnL = ydh.f(flowable, flowable).L((Scheduler) hce1Var.c);
        completableIgnoreElement.getClass();
        return new CompletableAndThenPublisher(completableIgnoreElement, flowableObserveOnL).B(new svh0(z, hce1Var, (byte) 20));
    }

    @Override // p.v7s
    public final Completable i(String str, String str2, Bundle bundle) {
        f77 f77Var = this.o;
        f77Var.getClass();
        if (str.equals("com.google.android.googlequicksearchbox") && str2 != null) {
            f77Var.b.m((Object) null, new v0z0(str2, f77Var.a.b()));
        }
        return super.i(str, str2, bundle);
    }

    @Override // p.v7s
    public final Completable k(String str) {
        SingleEmitter singleEmitter = this.n.b;
        if (singleEmitter != null) {
            singleEmitter.onSuccess(Boolean.FALSE);
        }
        return super.k(str);
    }

    @Override // p.v7s
    public final Completable n(int i, String str) {
        m210 m210VarA = this.g.a(str);
        boolean z = i == 2;
        return this.f.m(m210VarA, z ? 1 : 2, z ? 2 : 1).flatMapCompletable(new lls0(z, this, (byte) 2));
    }

    @Override // p.v7s
    public final Completable q(String str, Uri uri, Bundle bundle) {
        t45 t45VarX = x(uri, str);
        t45.m(t45VarX, "prepare-uri", 4);
        m210 m210VarA = this.g.a(str);
        CompletableFromAction completableFromAction = new CompletableFromAction(new bm0(this, null, (byte) 9));
        PlayIntent playIntentCreate = PlayIntent.Companion.create(uri, bundle);
        String string = playIntentCreate.getUri().toString();
        tp7 tp7Var = this.k;
        return completableFromAction.c(tp7Var.f(str, string, t45VarX, (String) null).switchMapCompletable(new r4h1(tp7Var, playIntentCreate, m210VarA, str, this.m, t45VarX)));
    }

    public final t45 x(Uri uri, String str) {
        String string;
        t45 t45VarA = this.m.a("voice-assistants-play-uri-performance");
        t45VarA.f.put("calling-package", str);
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        t45VarA.b("input-play-uri", string);
        return t45VarA;
    }
}
