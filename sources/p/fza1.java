package p;

import com.comscore.android.id.IdHelperAndroid;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fza1 {
    public final v1b1 a;
    public final e1b1 b;
    public final yqg c;
    public final llm d;
    public y1b1 e;
    public boolean f;
    public faa0 g;
    public volatile String h;
    public volatile Long i;
    public volatile boolean j;
    public volatile String k = IdHelperAndroid.NO_ID_AVAILABLE;
    public final dt71 l;
    public final ve01 m;

    public fza1(v1b1 v1b1Var, e1b1 e1b1Var, yqg yqgVar, q8n q8nVar) {
        this.a = v1b1Var;
        this.b = e1b1Var;
        this.c = yqgVar;
        this.d = l1d.x(q8nVar);
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.l = dt71VarE;
        this.m = d5p1.g(dt71VarE);
    }

    public final String a(String str) {
        n1b1 n1b1VarA;
        y1b1 y1b1Var = this.e;
        if (y1b1Var == null || (n1b1VarA = y1b1Var.a(str)) == null) {
            return null;
        }
        return n1b1VarA.a();
    }

    public final boolean b(String str) {
        if (str.length() != 0) {
            n1b1 n1b1Var = null;
            if (this.f) {
                y1b1 y1b1Var = this.e;
                n1b1 n1b1VarA = y1b1Var != null ? y1b1Var.a(str) : null;
                v1b1 v1b1Var = this.a;
                if (n1b1VarA == null) {
                    v1b1Var.getClass();
                } else {
                    long jE = (v1b1Var.b.e() / 1000) + v1b1Var.c;
                    boolean z = n1b1VarA.c() == null;
                    boolean z2 = n1b1VarA.b() == null;
                    boolean z3 = z || n1b1VarA.c().longValue() <= jE;
                    boolean z4 = z2 || n1b1VarA.b().longValue() > jE;
                    if (z3 && z4) {
                        n1b1Var = n1b1VarA;
                    }
                }
            }
            if (n1b1Var != null) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean z) {
        this.f = z;
        if (!z) {
            this.e = null;
            faa0 faa0Var = this.g;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            this.g = null;
            return;
        }
        faa0 faa0Var2 = this.g;
        if (faa0Var2 == null || !faa0Var2.isActive()) {
            this.g = c921.y(this.d, (o8n) null, 0, new i7u0(this, (lnm) null, (byte) 8), 3);
        }
    }

    public final long d(sy21 sy21Var) {
        Long lD0;
        y1b1 y1b1Var = (y1b1) sy21Var.b;
        if (y1b1Var == null) {
            ry21 ry21Var = sy21Var.a;
            this.k = ry21Var.Q0 ? "empty_body" : f4i1.c(ry21Var.d, "http_");
            return 1800L;
        }
        this.k = "ok";
        this.i = Long.valueOf(this.c.e());
        y1b1Var.c(this.e);
        this.e = y1b1Var;
        this.l.a(rih1.a);
        String strC = sy21Var.a.f.c("MC-TTL");
        if (strC != null && (lD0 = nhc1.d0(10, strC)) != null) {
            y1b1Var.d(lD0.longValue());
        }
        return y1b1Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        eza1 eza1Var;
        long jD;
        fza1 fza1Var;
        if (onmVar instanceof eza1) {
            eza1Var = (eza1) onmVar;
            int i = eza1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eza1Var.d = i - Integer.MIN_VALUE;
            } else {
                eza1Var = new eza1(this, onmVar);
            }
        } else {
            eza1Var = new eza1(this, onmVar);
        }
        Object objJ = eza1Var.b;
        d9n d9nVar = d9n.a;
        int i2 = eza1Var.d;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objJ);
                    this.j = true;
                    Single<sy21<y1b1>> singleA = this.b.a();
                    eza1Var.a = this;
                    eza1Var.d = 1;
                    objJ = fc11.j(singleA, eza1Var);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    fza1Var = this;
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fza1Var = eza1Var.a;
                    hm5.M(objJ);
                }
                jD = fza1Var.d((sy21) objJ);
                this.j = false;
            } catch (Exception e) {
                op71.x(eza1Var.getContext());
                this.k = "error_sponsorship_fetch_failed";
                e.getMessage();
                this.j = false;
                jD = 1800;
            }
            if (jD < 60) {
                jD = 60;
            }
            return yah0.q(jD);
        } catch (Throwable th) {
            this.j = false;
            throw th;
        }
    }
}
