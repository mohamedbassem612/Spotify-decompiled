package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a3a1 implements Function, SingleTransformer {
    public final /* synthetic */ int a;
    public final /* synthetic */ n381 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ wea0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Scheduler g;

    public /* synthetic */ a3a1(int i, n381 n381Var, String str, wea0 wea0Var, boolean z, String str2, Scheduler scheduler) {
        this.a = i;
        this.b = n381Var;
        this.c = str;
        this.d = wea0Var;
        this.e = z;
        this.f = str2;
        this.g = scheduler;
    }

    public Object apply(Object obj) {
        Single singleF;
        String str;
        String str2 = (String) obj;
        rca rcaVar = (rca) this.b.b;
        String str3 = this.f;
        String str4 = this.c;
        boolean z = this.e;
        wea0 wea0Var = this.d;
        int i = this.a;
        if (i == 2) {
            String str5 = wea0Var.a;
            String upperCase = (z ? "listen_and_control" : "control").toUpperCase(Locale.ROOT);
            if (i == 1) {
                str = "FULL";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "LISTEN_ONLY";
            }
            singleF = rca.e(rcaVar, new jqi1(str4, str5, upperCase, str2, str3, str), (fq21) null, 2, (Object) null);
        } else {
            singleF = rca.F(rcaVar, str4, z ? "listen_and_control" : "control", str2, wea0Var.a, str3, (fq21) null, 32, (Object) null);
        }
        return singleF.timeout(10000L, TimeUnit.MILLISECONDS, this.g, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[]{str4}, "Failed to join session %s"));
    }

    public Single c(Single single) {
        return single.flatMap(new a3a1(this.a, this.b, this.c, this.d, this.e, this.f, this.g));
    }
}
