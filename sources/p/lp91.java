package p;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lp91 implements xq91 {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ mzr0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public lp91(AtomicBoolean atomicBoolean, mzr0 mzr0Var, String str, String str2, String str3) {
        this.a = atomicBoolean;
        this.b = mzr0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final void b() {
        boolean z = this.a.get();
        mzr0 mzr0Var = this.b;
        q8n q8nVar = (q8n) mzr0Var.d;
        vku vkuVar = (vku) mzr0Var.g;
        String str = this.e;
        String str2 = this.d;
        if (z) {
            vkuVar.a(j2h1.D(q8nVar, new kp91(mzr0Var, str2, str, null, (byte) 1)).subscribe());
        } else {
            ip91 ip91Var = (ip91) mzr0Var.c;
            vkuVar.a(ip91Var.d(str).firstOrError().flatMapCompletable(new ep91(ip91Var, str, this.c, str2, (byte) 2)).o(Functions.h).c(j2h1.D(q8nVar, new kp91(mzr0Var, str2, str, null, (byte) 0))).subscribe());
        }
    }

    public final void a(yq91 yq91Var) {
    }
}
