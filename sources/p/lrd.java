package p;

import android.os.Bundle;
import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeJust;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimeoutMaybe;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lrd extends v7s {
    public final x610 k;
    public final PlayOrigin l;
    public final v64 m;
    public final u210 n;
    public final a6h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Flowable f38p;
    public final g0l q;
    public boolean r;

    public lrd(x610 x610Var, PlayOrigin playOrigin, int i, oyr oyrVar, g510 g510Var, d8q d8qVar, r8l r8lVar, v64 v64Var, b791 b791Var, u210 u210Var, a6h1 a6h1Var, y6x0 y6x0Var, phl1 phl1Var, Flowable flowable, g0l g0lVar, e8q e8qVar, uic uicVar) {
        super(x610Var, playOrigin, i, oyrVar, g510Var, d8qVar, r8lVar, b791Var, u210Var, phl1Var, e8qVar, uicVar);
        this.k = x610Var;
        this.l = playOrigin;
        this.m = v64Var;
        this.n = u210Var;
        this.o = a6h1Var;
        this.f38p = flowable;
        this.q = g0lVar;
        this.r = true;
    }

    public final Completable o(String str) {
        CompletableResumeNext maybeFlatMapCompletable;
        boolean z = this.r;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Logger.b("[AA-RESUME] doResume entry isFirstResume=" + z + " callingPackage=" + str, new Object[0]);
        if (z) {
            Maybe maybeFirstElement = this.q.m().filter(zp8.O0).firstElement();
            maybeFirstElement.getClass();
            maybeFlatMapCompletable = new MaybeFlatMapCompletable(new MaybeTimeoutMaybe(maybeFirstElement, Maybe.l(1L, TimeUnit.SECONDS, Schedulers.b), (MaybeJust) null).d(fcc.f), new cfd(this, str, (byte) 3)).p(new aod(this, str, (byte) 1));
        } else {
            Flowable flowable = this.f38p;
            flowable.getClass();
            maybeFlatMapCompletable = new MaybeFlatMapCompletable(new FlowableElementAtMaybe(flowable), new xid(this, str, (byte) 3));
        }
        CompletableDoFinally completableDoFinally = new CompletableDoFinally(maybeFlatMapCompletable, new krd(jElapsedRealtime));
        this.r = false;
        return completableDoFinally;
    }

    public final Completable r(int i, Bundle bundle, String str, String str2) {
        List listX;
        String string = bundle != null ? bundle.getString("com.spotify.music.extra.PLAY_ORIGIN") : null;
        if (string == null || string.equals("other")) {
            v64 v64Var = this.m;
            if (v64Var.a.c()) {
                String str3 = (String) v64Var.a.b();
                str3.getClass();
                if (ihc1.h0(str3, "com.spotify.", false)) {
                    Pattern patternCompile = Pattern.compile("\\.");
                    ihc1.N0(0);
                    Matcher matcher = patternCompile.matcher(str3);
                    if (matcher.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList.add(str3.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList.add(str3.subSequence(iEnd, str3.length()).toString());
                        listX = arrayList;
                    } else {
                        listX = k4p1.x(str3.toString());
                    }
                    String[] strArr = (String[]) listX.toArray(new String[0]);
                    string = "android_auto_".concat(strArr[strArr.length - 1].replace('-', '_'));
                }
            }
        } else if (string.equals("home") || string.equals("recently_played") || string.equals("browse")) {
            string = "android_auto_".concat(string);
        } else if (string.equals("library")) {
            string = "android_auto_your_library";
        }
        if (string != null && bundle != null) {
            bundle.putString("com.spotify.music.extra.PLAY_ORIGIN", string);
        }
        List listQ0 = ihc1.Q0(str2, new String[]{"---"}, 0, 6);
        String str4 = listQ0.size() == 2 ? (String) listQ0.get(1) : str2;
        if (u890.j(str4, "non-playable-item")) {
            return CompletableEmpty.a;
        }
        if (pst0.a(bundle == null ? Bundle.EMPTY : bundle)) {
            Completable completableS = s(str, str2, bundle, i, true);
            completableS.getClass();
            return completableS;
        }
        Flowable flowable = this.f38p;
        flowable.getClass();
        return new MaybeFlatMapCompletable(new MaybeTimeoutMaybe(new FlowableElementAtMaybe(flowable), Maybe.l(500L, TimeUnit.MILLISECONDS, Schedulers.b), (MaybeJust) null), new t01(str4, this, str, str2, bundle, i));
    }

    public final Single u(String str, String str2, String str3, Bundle bundle, i410 i410Var) {
        w7h1 w7h1VarC;
        y310 y310Var = (y310) this.o.a.get(Integer.valueOf(bundle.getInt("spotify.ubi")));
        return (y310Var == null || (w7h1VarC = y6x0.c(1, str2, y310Var)) == null) ? super.u(str, str2, str3, bundle, i410Var) : g510.f(((v7s) this).f, ((v7s) this).g.a(str), str2, w7h1VarC, (ou80) null, 24);
    }
}
