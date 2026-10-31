package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r801 extends x7e0 {
    public k8g1 X = new k8g1();
    public final w701 d;
    public final p901 e;
    public final kly0 f;
    public final boolean g;
    public final d0r h;
    public final q8n i;
    public llm t;

    public r801(w701 w701Var, p901 p901Var, kly0 kly0Var, boolean z, d0r d0rVar, q8n q8nVar) {
        this.d = w701Var;
        this.e = p901Var;
        this.f = kly0Var;
        this.g = z;
        this.h = d0rVar;
        this.i = q8nVar;
    }

    public final void e() {
        if (this.X.a.length() > 0) {
            i();
            return;
        }
        j();
        llm llmVarK = i3a.k(this.i);
        this.t = llmVarK;
        fn31.T(llmVarK, (o8n) null, 0, new ian0(this, null, (byte) 24), 3);
    }

    public final void f() {
        llm llmVar = this.t;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.t = null;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object k(String str, onm onmVar) throws Throwable {
        q801 q801Var;
        String m231Var;
        String str2;
        k1r m231Var2;
        Throwable thA;
        k1r k1rVar;
        Object objA;
        String str3 = str;
        if (onmVar instanceof q801) {
            q801Var = (q801) onmVar;
            int i = q801Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q801Var.d = i - Integer.MIN_VALUE;
            } else {
                q801Var = new q801(this, onmVar);
            }
        } else {
            q801Var = new q801(this, onmVar);
        }
        Object objJ = q801Var.b;
        int i2 = q801Var.d;
        w701 w701Var = this.d;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                b201 b201Var = new b201(this, str3, (lnm) null, (byte) 5);
                q801Var.a = str3;
                q801Var.d = 1;
                objJ = rc2.O(30000L, b201Var, q801Var);
                if (objJ == d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(objJ);
                    return objJ;
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        hm5.M(objJ);
                        return objJ;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = q801Var.a;
                try {
                    hm5.M(objJ);
                    m231Var2 = (k1r) objJ;
                } catch (Throwable th) {
                    th = th;
                    m231Var2 = new m231(th);
                }
                thA = e331.a(m231Var2);
                if (thA == null && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (m231Var2 instanceof m231) {
                    m231Var2 = null;
                }
                k1rVar = m231Var2;
                if (k1rVar instanceof i1r) {
                    return ((i1r) k1rVar).a;
                }
                q801Var.a = null;
                q801Var.d = 4;
                objA = w701.a(w701Var, str2, q801Var, 6);
                if (objA != d9nVar) {
                    return d9nVar;
                }
                return objA;
            }
            str3 = q801Var.a;
            hm5.M(objJ);
            m231Var = (String) objJ;
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 != null && (thA2 instanceof CancellationException)) {
            throw thA2;
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str4 = m231Var;
        if (str4 == null) {
            q801Var.a = null;
            q801Var.d = 2;
            Object objA2 = w701.a(w701Var, str3, q801Var, 6);
            if (objA2 != d9nVar) {
                return objA2;
            }
        } else {
            try {
                ay8 ay8VarF = d3p1.F(this.h, w3p1.o(new l4r(pwc0.w, 1, k301.S0, new j4r(k301.U0), k301.T0), k301.V0), new ga01(12, str3, str4, false));
                zio0 zio0Var = new zio0(2, (lnm) null, (byte) 29);
                q801Var.a = str3;
                q801Var.d = 3;
                objJ = b5p1.j(ay8VarF, zio0Var, q801Var);
                if (objJ != d9nVar) {
                    str2 = str3;
                    m231Var2 = (k1r) objJ;
                    thA = e331.a(m231Var2);
                    if (thA == null) {
                    }
                    if (m231Var2 instanceof m231) {
                        m231Var2 = null;
                    }
                    k1rVar = m231Var2;
                    if (k1rVar instanceof i1r) {
                        return ((i1r) k1rVar).a;
                    }
                    q801Var.a = null;
                    q801Var.d = 4;
                    objA = w701.a(w701Var, str2, q801Var, 6);
                    if (objA != d9nVar) {
                        return objA;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = str3;
                m231Var2 = new m231(th);
            }
        }
        return d9nVar;
    }
}
