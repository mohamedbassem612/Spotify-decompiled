package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rdb0 implements h0r0 {
    public final q7e0 a;
    public final ye90 b;
    public final deb0 c;
    public final ieb0 d;
    public final cbr0 e;

    public rdb0(q7e0 q7e0Var, ye90 ye90Var, deb0 deb0Var, ieb0 ieb0Var) {
        this.a = q7e0Var;
        this.b = ye90Var;
        this.c = deb0Var;
        this.d = ieb0Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131957170));
        dbr0 pu00Var = new pu00(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, pu00Var, new bn70(yon1.G1("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE", "settings/notifications/language-preference", 1839, "settings"), nik1.J2, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        ye90 ye90Var = this.b;
        fno0 fno0Var = (fno0) ye90Var.b;
        List list = fno0Var.d;
        return new wp20(this.a, bbp1.g(Single.zip(list != null ? Single.just(list) : fno0Var.a.a().map(si10.R0).doOnSuccess(new lrj0(fno0Var, (byte) 15)), fno0Var.b.a("notification-locale", "").map(xi10.R0).firstOrError(), ua20.i).subscribeOn((Scheduler) ye90Var.c)), new u7r0(new y6e0(df.Z0), (g4h1) null, (iu30) null, false, false, 126), new pdb0(this, (byte) 0), new n7e0(new qdb0(this), k9b0.Z, ta20.i, (iu30) null));
    }
}
