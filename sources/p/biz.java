package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class biz implements h0r0 {
    public final qyj a;
    public final eiz b;
    public final tep c;
    public final cbr0 d;

    public biz(qyj qyjVar, eiz eizVar, tep tepVar) {
        int i;
        this.a = qyjVar;
        this.b = eizVar;
        this.c = tepVar;
        int iC = l1d.C(eizVar.c);
        if (iC == 0) {
            i = 2;
        } else if (iC == 1) {
            i = 3;
        } else {
            if (iC != 2) {
                eg.o();
                throw null;
            }
            i = 4;
        }
        ikl0 ikl0Var = new ikl0(i);
        dbr0 yxe1Var = new yxe1(new ehc1("Page Match error"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PAGE_MATCH_ERROR", "page-match/error", 1391, "page-match");
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1(eizVar.b), ikl0Var), new t1r0(true), new s9h1(14, true, false, false), new tx60(3, (String) null, ikl0Var.b())}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(431418296, new hzw(this, (byte) 16), true));
    }
}
