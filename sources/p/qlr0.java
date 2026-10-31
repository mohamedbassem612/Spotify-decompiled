package p;

import com.android.installreferrer.api.InstallReferrerClient;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qlr0 implements xov0 {
    public static final HashSet e = dm61.t0("huawei");
    public final rlr0 a;
    public final InstallReferrerClient b;
    public final qib c;
    public final Single d;

    public qlr0(rlr0 rlr0Var, InstallReferrerClient installReferrerClient, qib qibVar, et50 et50Var, Scheduler scheduler) {
        this.a = rlr0Var;
        this.b = installReferrerClient;
        this.c = qibVar;
        this.d = Single.fromCallable(new sra(this, (byte) 12)).flatMap(new tym0(this, (byte) 17)).subscribeOn(scheduler).cache();
    }

    @Override // p.xov0
    public final Single a() {
        return this.d;
    }
}
