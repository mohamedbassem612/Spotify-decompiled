package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8e {
    public final Bundle a;
    public final pnv0 b;
    public final Scheduler c;
    public final oto0 d;

    public d8e(Bundle bundle, pnv0 pnv0Var, Scheduler scheduler, ekb ekbVar, oto0 oto0Var) {
        this.a = bundle;
        this.b = pnv0Var;
        this.c = scheduler;
        this.d = oto0Var;
    }

    public final m6e0 a() {
        Bundle bundle = this.a;
        bi90 parcelable = bundle.getParcelable("SELECTED_ITEM");
        String string = bundle.getString("SELECTED_ITEM_KEY");
        if (parcelable != null) {
            return bbp1.g(Single.just(parcelable));
        }
        if (string == null) {
            return new m6e0(Observable.just(q3p1.o(new IllegalArgumentException("V8 category not found"))), u0e0.X0, fnc0.Z0);
        }
        return bbp1.g(this.b.d(upn1.m(), "NOTIFICATION_SETTINGS", nik1.I2.a, this.d.a.g()).subscribeOn(this.c).map(new gap1(this, string)));
    }
}
