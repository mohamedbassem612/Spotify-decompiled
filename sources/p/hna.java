package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hna {
    public final yna a;
    public final vna b;
    public final tna c;
    public final tna d;
    public final mxr e;
    public final l1p0 f;
    public final byp0 g;
    public final rma h;
    public final Scheduler i;
    public final vku j = new vku();

    public hna(yna ynaVar, vna vnaVar, tna tnaVar, tna tnaVar2, mxr mxrVar, l1p0 l1p0Var, byp0 byp0Var, rma rmaVar, Scheduler scheduler) {
        this.a = ynaVar;
        this.b = vnaVar;
        this.c = tnaVar;
        this.d = tnaVar2;
        this.e = mxrVar;
        this.f = l1p0Var;
        this.g = byp0Var;
        this.h = rmaVar;
        this.i = scheduler;
    }

    public final Single a(gxu gxuVar, String str) {
        return this.e.h(new swu(wqn1.y(gxuVar.d()) ? new i0v(gxuVar.d()) : new i0v(str)), new qyu());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean b(String str, rwu rwuVar) throws NoWhenBranchMatchedException {
        tna tnaVar;
        try {
            int iOrdinal = this.h.a().B1.ordinal();
            if (iOrdinal == 0) {
                tnaVar = this.c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                tnaVar = this.d;
            }
            tnaVar.a(str, rqt0.s(rwuVar));
            return true;
        } catch (Exception e) {
            Logger.l(e, "Unable to refresh license for %s", str);
            return false;
        }
    }

    public final boolean c(long j, b8c0 b8c0Var, String str) {
        tym0 tym0VarA = this.f.a(str);
        try {
            return ((Number) tym0VarA.e(b8c0Var.b()).a).longValue() < j;
        } finally {
            tym0VarA.k();
        }
    }
}
