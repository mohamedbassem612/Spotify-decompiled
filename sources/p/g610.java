package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g610 {
    public final ccc0 a;
    public final g7h b;
    public final op31 c;
    public final rpm1 d;
    public final r5s e;
    public final jut f;
    public final mwm1 g;
    public final q8n h;
    public final oj3 i;

    public g610(ccc0 ccc0Var, g7h g7hVar, op31 op31Var, rpm1 rpm1Var, r5s r5sVar, jut jutVar, agc0 agc0Var, mwm1 mwm1Var, xrm1 xrm1Var, q8n q8nVar, oj3 oj3Var) {
        this.a = ccc0Var;
        this.b = g7hVar;
        this.c = op31Var;
        this.d = rpm1Var;
        this.e = r5sVar;
        this.f = jutVar;
        this.g = mwm1Var;
        this.h = q8nVar;
        this.i = oj3Var;
    }

    public final Completable a(String str) {
        if (anm1.A(str)) {
            return b(str).flatMapCompletable(new t7y(this, str, (byte) 14));
        }
        Set set = s4b1.f;
        if (uic.x(str).c == blc0.SHOW_EPISODE || uic.x(str).c == blc0.PODCAST_CHAPTER || uic.x(str).c == blc0.CLIP) {
            return j2h1.D(o6x.a, new qpm1((ppm1) null, this.d, k4p1.x(str), (lnm) null));
        }
        y6b1 y6b1Var = new y6b1(str, false);
        v6b1 v6b1Var = v6b1.Y0;
        v6b1 v6b1Var2 = y6b1Var.c;
        if (v6b1Var2 != v6b1Var && v6b1Var2 != v6b1.a1) {
            return j2h1.D(this.h, new d610(this, str, (lnm) null, (byte) 1));
        }
        CompletableEmpty completableEmpty = CompletableEmpty.a;
        completableEmpty.getClass();
        return completableEmpty;
    }

    public final Single b(String str) {
        ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
        ssm1VarQ.q(str);
        return this.g.a((YourLibraryContainsRequest) ssm1VarQ.build()).map(f610.b);
    }

    public final Completable c(String str) {
        if (anm1.A(str)) {
            return b(str).flatMapCompletable(new w2z((byte) 12, this, str));
        }
        Set set = s4b1.f;
        if (uic.x(str).c == blc0.SHOW_EPISODE || uic.x(str).c == blc0.PODCAST_CHAPTER || uic.x(str).c == blc0.CLIP) {
            return rpm1.a(this.d, k4p1.x(str));
        }
        y6b1 y6b1Var = new y6b1(str, false);
        v6b1 v6b1Var = v6b1.Y0;
        v6b1 v6b1Var2 = y6b1Var.c;
        if (v6b1Var2 != v6b1Var && v6b1Var2 != v6b1.a1) {
            return j2h1.D(this.h, new d610(this, str, (lnm) null, (byte) 2));
        }
        CompletableEmpty completableEmpty = CompletableEmpty.a;
        completableEmpty.getClass();
        return completableEmpty;
    }
}
