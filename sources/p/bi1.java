package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bi1 implements h0r0 {
    public final qyj a;
    public final fi1 b;
    public final zwo c;
    public final los d;
    public final cbr0 e;

    public bi1(qyj qyjVar, fi1 fi1Var, zwo zwoVar) {
        this.a = qyjVar;
        this.b = fi1Var;
        this.c = zwoVar;
        los losVar = new los();
        this.d = losVar;
        dbr0 yxe1Var = new yxe1(new ehc1("Page Match add page number"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("PAGE_MATCH_ADD_PAGE_NUMBER", "page-match/add-page-number", 1389, "page-match");
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG1, new lik1(ihc1.Y0(dj20.b(fi1Var.a, fi1Var.b, fi1Var.c, fi1Var.d, fi1Var.e), '?')), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.c, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1754174857, new ai1(this, (byte) 1), true));
    }
}
