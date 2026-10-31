package p;

import android.content.res.Resources;
import com.spotify.kidsrequest.v1.GetDecisionsSummaryResponse;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yx3 implements dwo {
    public final ov20 a;
    public final b2b0 b;
    public final r241 c;
    public final ay3 d;
    public final yqg e;
    public final y6a f;
    public final i8h1 g;
    public final Resources h;
    public final llm i;
    public final llm t;

    public yx3(q8n q8nVar, q8n q8nVar2, ov20 ov20Var, b2b0 b2b0Var, r241 r241Var, ay3 ay3Var, yqg yqgVar, y6a y6aVar, i8h1 i8h1Var, Resources resources, boolean z) {
        this.a = ov20Var;
        this.b = b2b0Var;
        this.c = r241Var;
        this.d = ay3Var;
        this.e = yqgVar;
        this.f = y6aVar;
        this.g = i8h1Var;
        this.h = resources;
        llm llmVarE = smo1.e(q8nVar);
        this.i = llmVarE;
        this.t = us71.h(q8nVar2);
        if (z) {
            fn31.T(llmVarE, (o8n) null, 0, new vx3(this, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r15 == r9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yx3.a(p.onm):java.lang.Object");
    }

    public final void b(GetDecisionsSummaryResponse getDecisionsSummaryResponse) {
        a6a a6aVar;
        if (getDecisionsSummaryResponse.n() == 0 && getDecisionsSummaryResponse.o() == 0) {
            return;
        }
        int i = 4;
        if (getDecisionsSummaryResponse.n() > 0) {
            a6aVar = new a6a(2131952304, 2131952303, null, 4);
        } else if (getDecisionsSummaryResponse.o() == 1 && getDecisionsSummaryResponse.q()) {
            a6aVar = new a6a(2131952307, null, this.h.getString(2131952306, getDecisionsSummaryResponse.p().getTitle(), getDecisionsSummaryResponse.p().n()), 10);
        } else {
            a6aVar = new a6a(2131952307, 2131952305, null, 12);
        }
        r6h1 r6h1Var = r6h1.c;
        if (getDecisionsSummaryResponse.n() > 0 && getDecisionsSummaryResponse.o() > 0) {
            i = 1;
        } else if (getDecisionsSummaryResponse.n() > 1) {
            i = 2;
        } else if (getDecisionsSummaryResponse.n() != 1) {
            i = getDecisionsSummaryResponse.o() > 1 ? 3 : 5;
        }
        rrk0 rrk0Var = new rrk0(i);
        boolean z = a6aVar.d;
        i8h1 i8h1Var = this.g;
        fn31.T(this.t, (o8n) null, 0, new w7a(y6a.d(this.f, new n5a(Integer.valueOf(a6aVar.a), (h5a) null, a6aVar.c, a6aVar.b, (clv) null, z ? Collections.singletonList(new i5a((String) null, new zx3(i8h1Var, rrk0Var, (byte) 0), 1)) : z6x.a, new zx3(i8h1Var, rrk0Var, (byte) 1), l5a.a, 331), false, 6), new xx3(this, rrk0Var, (lnm) null, (byte) 0), (lnm) null, (byte) 2), 3);
    }

    public final void shutdown() {
        smo1.p(this.i, (CancellationException) null);
        smo1.p(this.t, (CancellationException) null);
    }
}
