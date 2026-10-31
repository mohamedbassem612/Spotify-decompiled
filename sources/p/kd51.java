package p;

import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kd51 extends xbk1 {
    public static final se11 Y = new se11("(?<=step=).*(?=&)");
    public final ffe1 b;
    public final g931 c;
    public final Scheduler d;
    public final Scheduler e;
    public Disposable h;
    public Disposable i;
    public String f = "";
    public List g = z6x.a;
    public final kdn0 t = new kdn0(new bhk1(255, null, null, null, null, false));
    public SearchConfiguration X = new SearchConfiguration("", "", "");

    public kd51(ffe1 ffe1Var, g931 g931Var, Scheduler scheduler, Scheduler scheduler2) {
        this.b = ffe1Var;
        this.c = g931Var;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public final void S() {
        Disposable disposable = this.h;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.i;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    public final void T(String str) {
        List list;
        Disposable disposable = this.h;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.i;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        boolean zY0 = ihc1.y0(str);
        kdn0 kdn0Var = this.t;
        if (zY0 || str.length() > 500) {
            bhk1 bhk1Var = (bhk1) kdn0Var.e();
            kdn0Var.m(bhk1Var != null ? bhk1.a(bhk1Var, str, null, null, 254) : null);
            return;
        }
        String placeholder = this.X.getPlaceholder();
        String initialText = this.X.getInitialText();
        bhk1 bhk1Var2 = (bhk1) kdn0Var.e();
        if (bhk1Var2 == null || (list = bhk1Var2.d) == null) {
            list = z6x.a;
        }
        kdn0Var.j(new bhk1(224, str, initialText, placeholder, list, false));
        Observable observableTimer = Observable.timer(250L, TimeUnit.MILLISECONDS);
        Scheduler scheduler = this.e;
        Observable observableSubscribeOn = observableTimer.subscribeOn(scheduler);
        Scheduler scheduler2 = this.d;
        this.i = observableSubscribeOn.observeOn(scheduler2).subscribe(new jd51(this, (byte) 0));
        this.h = this.c.w(0, this.X.getUrl(), str).map(new dc31(this, str, (byte) 14)).subscribeOn(scheduler).observeOn(scheduler2).subscribe(new jd51(this, (byte) 1));
    }

    public final bhk1 U(Object obj, String str, List list) {
        if (e331.a(obj) != null) {
            return new bhk1(176, str, this.X.getInitialText(), this.X.getPlaceholder(), list, false);
        }
        List list2 = (List) obj;
        return new bhk1(112, str, this.X.getInitialText(), this.X.getPlaceholder(), o7h.N0(list2, list), list2.size() >= 10);
    }
}
