package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g8h0 extends njm1 {
    public final dqe1 N0;
    public e8h0 O0;
    public d8h0 P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public final boolean Y;
    public final oqe1 Z;

    public g8h0(qba qbaVar, boolean z) {
        super(qbaVar);
        this.Y = z && qbaVar.n();
        this.Z = new oqe1();
        this.N0 = new dqe1();
        sqe1 sqe1VarL = qbaVar.l();
        if (sqe1VarL == null) {
            this.O0 = new e8h0(new f8h0(qbaVar.m()), oqe1.q, e8h0.h);
        } else {
            this.O0 = new e8h0(sqe1VarL, null, null);
            this.S0 = true;
        }
    }

    @Override // p.njm1
    public final p2i0 I(p2i0 p2i0Var) {
        Object obj = p2i0Var.a;
        Object obj2 = this.O0.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = e8h0.h;
        }
        return p2i0Var.a(obj);
    }

    @Override // p.njm1
    public final void J() {
        if (this.Y) {
            return;
        }
        this.Q0 = true;
        H(null, this.X);
    }

    @Override // p.njm1, p.qba
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final d8h0 f(p2i0 p2i0Var, hw3 hw3Var, long j) {
        d8h0 d8h0Var = new d8h0(p2i0Var, hw3Var, j);
        dm5.y(d8h0Var.d == null);
        qba qbaVar = this.X;
        d8h0Var.d = qbaVar;
        if (!this.R0) {
            this.P0 = d8h0Var;
            if (!this.Q0) {
                this.Q0 = true;
                H(null, qbaVar);
            }
            return d8h0Var;
        }
        Object obj = p2i0Var.a;
        if (this.O0.g != null && obj.equals(e8h0.h)) {
            obj = this.O0.g;
        }
        d8h0Var.e(p2i0Var.a(obj));
        return d8h0Var;
    }

    public final e8h0 L() {
        return this.O0;
    }

    public final boolean M(long j) {
        d8h0 d8h0Var = this.P0;
        int iB = this.O0.b(d8h0Var.a.a);
        if (iB == -1) {
            return false;
        }
        e8h0 e8h0Var = this.O0;
        dqe1 dqe1Var = this.N0;
        e8h0Var.f(iB, dqe1Var, false);
        long j2 = dqe1Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        d8h0Var.g = j;
        return true;
    }

    @Override // p.njm1, p.qba
    public final boolean c(yoh0 yoh0Var) {
        return this.X.c(yoh0Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p.qba
    public final void p(sqe1 sqe1Var) {
        long j;
        e8h0 e8h0Var;
        p2i0 p2i0VarA;
        e8h0 e8h0Var2;
        if (this.R0) {
            e8h0 e8h0Var3 = this.O0;
            this.O0 = new e8h0(sqe1Var, e8h0Var3.f, e8h0Var3.g);
            d8h0 d8h0Var = this.P0;
            if (d8h0Var != null) {
                M(d8h0Var.g);
            }
        } else {
            if (!sqe1Var.p()) {
                oqe1 oqe1Var = this.Z;
                sqe1Var.m(0, oqe1Var);
                long j2 = oqe1Var.l;
                Object obj = oqe1Var.a;
                d8h0 d8h0Var2 = this.P0;
                dqe1 dqe1Var = this.N0;
                if (d8h0Var2 != null) {
                    long j3 = d8h0Var2.b;
                    this.O0.g(d8h0Var2.a.a, dqe1Var);
                    long j4 = dqe1Var.e + j3;
                    this.O0.n(0, oqe1Var, 0L);
                    if (j4 != oqe1Var.l) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = sqe1Var.i(oqe1Var, dqe1Var, 0, j);
                Object obj2 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.S0) {
                    e8h0 e8h0Var4 = this.O0;
                    e8h0Var = new e8h0(sqe1Var, e8h0Var4.f, e8h0Var4.g);
                } else {
                    e8h0Var = new e8h0(sqe1Var, obj, obj2);
                }
                this.O0 = e8h0Var;
                d8h0 d8h0Var3 = this.P0;
                if (d8h0Var3 != null && M(jLongValue)) {
                    p2i0 p2i0Var = d8h0Var3.a;
                    Object obj3 = p2i0Var.a;
                    if (this.O0.g != null && obj3.equals(e8h0.h)) {
                        obj3 = this.O0.g;
                    }
                    p2i0VarA = p2i0Var.a(obj3);
                }
                this.S0 = true;
                this.R0 = true;
                s(this.O0);
                if (p2i0VarA != null) {
                    d8h0 d8h0Var4 = this.P0;
                    d8h0Var4.getClass();
                    d8h0Var4.e(p2i0VarA);
                }
            }
            if (this.S0) {
                e8h0 e8h0Var5 = this.O0;
                e8h0Var2 = new e8h0(sqe1Var, e8h0Var5.f, e8h0Var5.g);
            } else {
                e8h0Var2 = new e8h0(sqe1Var, oqe1.q, e8h0.h);
            }
            this.O0 = e8h0Var2;
        }
        p2i0VarA = null;
        this.S0 = true;
        this.R0 = true;
        s(this.O0);
        if (p2i0VarA != null) {
            d8h0 d8h0Var5 = this.P0;
            d8h0Var5.getClass();
            d8h0Var5.e(p2i0VarA);
        }
    }

    @Override // p.njm1, p.qba
    public final void t(arh0 arh0Var) {
        d8h0 d8h0Var = (d8h0) arh0Var;
        if (d8h0Var.e != null) {
            qba qbaVar = d8h0Var.d;
            qbaVar.getClass();
            qbaVar.t(d8h0Var.e);
        }
        if (arh0Var == this.P0) {
            this.P0 = null;
        }
    }

    @Override // p.h2k, p.qba
    public final void w() {
        this.R0 = false;
        this.Q0 = false;
        super.w();
    }

    @Override // p.njm1, p.qba
    public final void z(yoh0 yoh0Var) {
        if (this.S0) {
            e8h0 e8h0Var = this.O0;
            sqe1 sqe1Var = e8h0Var.e;
            this.O0 = new e8h0(sqe1Var instanceof eve1 ? new eve1(((eve1) sqe1Var).e, yoh0Var) : new eve1(sqe1Var, yoh0Var), e8h0Var.f, e8h0Var.g);
        } else {
            this.O0 = new e8h0(new f8h0(yoh0Var), oqe1.q, e8h0.h);
        }
        this.X.z(yoh0Var);
    }
}
