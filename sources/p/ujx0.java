package p;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ujx0 implements f9e0 {
    public final Uri b;
    public final rsb1 c;
    public final cab d;
    public final xjx0 e;
    public final hsk f;
    public volatile boolean h;
    public long j;
    public gtf1 l;
    public boolean m;
    public final /* synthetic */ xjx0 n;
    public final sfv0 g = new sfv0();
    public boolean i = true;
    public final long a = d2e0.h.getAndIncrement();
    public n3r k = c(0, null);

    public ujx0(xjx0 xjx0Var, Uri uri, o2r o2rVar, cab cabVar, xjx0 xjx0Var2, hsk hskVar) {
        this.n = xjx0Var;
        this.b = uri;
        this.c = new rsb1(o2rVar);
        this.d = cabVar;
        this.e = xjx0Var2;
        this.f = hskVar;
    }

    @Override // p.f9e0
    public final void a() {
        o2r tl70Var;
        ec10 ec10Var;
        int i;
        int iC = 0;
        String str = null;
        while (iC == 0 && !this.h) {
            try {
                long j = this.g.a;
                n3r n3rVarC = c(j, str);
                this.k = n3rVarC;
                long jT = this.c.t(n3rVarC);
                if (this.h) {
                    if (iC != 1 && this.d.q() != -1) {
                        this.g.a = this.d.q();
                    }
                    n3p1.k(this.c);
                    return;
                }
                List list = (List) this.c.a.e().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jT != -1) {
                    jT += j;
                    xjx0 xjx0Var = this.n;
                    xjx0Var.S0.post(new qjx0(xjx0Var, (byte) 2));
                }
                long j2 = jT;
                this.n.U0 = vl70.d(this.c.a.e());
                rsb1 rsb1Var = this.c;
                vl70 vl70Var = this.n.U0;
                if (vl70Var == null || (i = vl70Var.f) == -1) {
                    tl70Var = rsb1Var;
                } else {
                    tl70Var = new tl70(rsb1Var, i, this);
                    gtf1 gtf1VarG = this.n.G(new wjx0(0, true));
                    this.l = gtf1VarG;
                    gtf1VarG.a(xjx0.w1);
                }
                this.d.w(tl70Var, this.b, this.c.a.e(), j, j2, this.e);
                if (this.n.U0 != null && (ec10Var = (ec10) this.d.c) != null && (ec10Var instanceof ipm0)) {
                    ((ipm0) ec10Var).s = true;
                }
                if (this.i) {
                    cab cabVar = this.d;
                    long j3 = this.j;
                    ec10 ec10Var2 = (ec10) cabVar.c;
                    ec10Var2.getClass();
                    ec10Var2.a(j, j3);
                    this.i = false;
                }
                while (iC == 0 && !this.h) {
                    try {
                        this.f.a();
                        cab cabVar2 = this.d;
                        sfv0 sfv0Var = this.g;
                        ec10 ec10Var3 = (ec10) cabVar2.c;
                        ec10Var3.getClass();
                        uyr uyrVar = (uyr) cabVar2.d;
                        uyrVar.getClass();
                        iC = ec10Var3.c(uyrVar, sfv0Var);
                        long jQ = this.d.q();
                        if (jQ > this.n.t + j) {
                            this.f.d();
                            xjx0 xjx0Var2 = this.n;
                            xjx0Var2.S0.post(xjx0Var2.R0);
                            j = jQ;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iC == 1) {
                    iC = 0;
                } else if (this.d.q() != -1) {
                    this.g.a = this.d.q();
                }
                n3p1.k(this.c);
            } catch (Throwable th) {
                if (iC != 1 && this.d.q() != -1) {
                    this.g.a = this.d.q();
                }
                n3p1.k(this.c);
                throw th;
            }
        }
    }

    @Override // p.f9e0
    public final void b() {
        this.h = true;
    }

    public final n3r c(long j, String str) {
        j380 j380VarC = xjx0.v1;
        if (str != null && !str.startsWith("W/")) {
            h380 h380VarA = j380.a();
            h380VarA.f(j380VarC.entrySet());
            h380VarA.e("If-Range", str);
            j380VarC = h380VarA.c();
        }
        Map map = Collections.EMPTY_MAP;
        String str2 = this.n.i;
        Uri uri = this.b;
        dm5.s(uri, "The uri must be set.");
        return new n3r(uri, 0L, 1, null, j380VarC, j, -1L, str2, 6, null);
    }
}
