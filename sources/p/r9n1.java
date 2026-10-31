package p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r9n1 implements ohs0 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ bsd1 b;
    public final /* synthetic */ phs0 c;

    public r9n1(BasePendingResult basePendingResult, bsd1 bsd1Var, phs0 phs0Var) {
        this.a = basePendingResult;
        this.b = bsd1Var;
        this.c = phs0Var;
    }

    @Override // p.ohs0
    public final void a(Status status) {
        if (!status.j()) {
            this.b.a(rzn1.r(status));
            return;
        }
        BasePendingResult basePendingResult = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zod.v("Result has already been consumed.", !basePendingResult.i);
        try {
            if (!basePendingResult.c.await(0L, timeUnit)) {
                basePendingResult.e(Status.h);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        zod.v("Result is not ready.", basePendingResult.f());
        this.b.b(this.c.d(basePendingResult.i()));
    }
}
