package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class orj0 implements xov0 {
    public final /* synthetic */ byte a = 1;
    public final Single b;
    public final Object c;

    public orj0(hlk1 hlk1Var, Scheduler scheduler, dpv0 dpv0Var) {
        this.c = dpv0Var;
        this.b = Single.fromCallable(new sra(this, (byte) 28)).subscribeOn(scheduler).cache();
    }

    public static Object b(String str, iu30 iu30Var) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return iu30Var.invoke(str);
            }
        }
        return null;
    }

    public final Single a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public orj0(zov0 zov0Var, Scheduler scheduler) {
        this.c = zov0Var;
        this.b = Single.fromCallable(new sra(this, (byte) 8)).subscribeOn(scheduler).cache();
    }
}
