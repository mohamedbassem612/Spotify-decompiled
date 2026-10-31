package p;

import android.os.Parcelable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e880 implements h0r0 {
    public final qyj a;
    public final tjp b;
    public final cbr0 c;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public e880(qyj qyjVar, r880 r880Var, tjp tjpVar) {
        this.a = qyjVar;
        this.b = tjpVar;
        dbr0 yxe1Var = new yxe1(new ehc1("Page Match inbound scanning"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PAGE_MATCH_INBOUND_SCANNING", "page-match/inbound-scanning", 1392, "page-match");
        Parcelable.Creator creator = lik1.CREATOR;
        dbr0 bn70Var = new bn70(p6r0VarG1, new lik1(r880Var.b), (nar0) null);
        dbr0 t1r0Var = new t1r0(true);
        dbr0 s9h1Var = new s9h1(14, true, false, false);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-page-match-inbound-scanning-page";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("page-match/inbound-scanning");
        r6h1 r6h1Var = r6h1.c;
        this.c = new cbr0(new dbr0[]{yxe1Var, bn70Var, t1r0Var, s9h1Var, new tx60(3, null, new r6h1(kk0.l(y6h1VarA), (u8h1) null))}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1809762022, new jb50(this, (byte) 19), true));
    }
}
