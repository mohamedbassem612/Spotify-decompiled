package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gmm0 implements jvd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x9a b;

    public /* synthetic */ gmm0(x9a x9aVar, byte b) {
        this.a = b;
        this.b = x9aVar;
    }

    public final yrd l(mvd mvdVar) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                hmm0 hmm0Var = (hmm0) x9aVar;
                String string = hmm0Var.c.getString(2131952484);
                pud pudVar = hmm0Var.e;
                String str = pudVar.a;
                ivd ivdVar = ((sda) mvdVar).a;
                return new yrd(string, (String) null, (String) null, str, pudVar, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar.a))), ivdVar.b, new vtd(pudVar.a, ""), 0L, 524);
            case 1:
                sp01 sp01Var = (sp01) x9aVar;
                String string2 = ((Context) sp01Var.c).getString(2131952485);
                pud pudVar2 = sp01Var.d;
                String str2 = pudVar2.a;
                ivd ivdVar2 = ((sda) mvdVar).a;
                return new yrd(string2, (String) null, (String) null, str2, pudVar2, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar2.a))), ivdVar2.b, new vtd(pudVar2.a, ""), 0L, 524);
            default:
                mi40 mi40Var = (mi40) mvdVar;
                sp01 sp01Var2 = (sp01) x9aVar;
                ki40 ki40Var = mi40Var.a;
                String strF = f4i1.f(sp01Var2.d.a, "/", ki40Var.a);
                String strO = gm50.o(ki40Var.a, Locale.getDefault());
                pud pudVar3 = sp01Var2.d;
                ivd ivdVar3 = mi40Var.b;
                return new yrd(strO, (String) null, (String) null, strF, pudVar3, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar3.a))), ivdVar3.b, new vtd(strF, ""), 0L, 524);
        }
    }

    public final Observable n(String str, List list) {
        String strH;
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                hmm0 hmm0Var = (hmm0) x9aVar;
                return ((fmm0) hmm0Var.g).a("all", "spotify:collection:tracks", 100).flatMap(new zud0(hmm0Var, (byte) 17)).map((lfb) hmm0Var.h).map(new mre0(hmm0Var, (byte) 14)).toObservable().onErrorComplete();
            case 1:
                sp01 sp01Var = (sp01) x9aVar;
                yp01 yp01Var = (yp01) sp01Var.f;
                return yp01Var.c.callSingle("spotify.recently_played_esperanto.proto.RecentlyPlayedService", "Tracks", yp01Var.d).map(s9x0.e).onErrorReturn(u9x0.e).flatMap(new m7y0(yp01Var, (byte) 6)).map(yp01Var.b).toObservable().map(new hyy0(sp01Var, list, (byte) 10));
            default:
                Observable observableJust = Observable.just(list);
                sp01 sp01Var2 = (sp01) x9aVar;
                lc20 lc20Var = (lc20) sp01Var2.c;
                String str2 = (String) sp01Var2.f;
                try {
                    Set set = s4b1.f;
                    strH = uic.x(str2).h();
                    break;
                } catch (Exception unused) {
                    strH = "";
                }
                return Observable.combineLatest(observableJust, ((wlu0) lc20Var.c).a(strH, 2, 0, 100, str).toObservable().onErrorReturn(rh20.d).flatMapSingle(new fey(lc20Var, (byte) 16)).onErrorReturn(xi20.d), new y281(this, (byte) 21));
        }
    }
}
