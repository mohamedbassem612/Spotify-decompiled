package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gvn1 extends ggo1 {
    @Override // p.ggo1
    public final bvn1 Q(yyn1 yyn1Var) {
        bvn1 bvn1Var;
        bvn1 bvn1Var2 = bvn1.d;
        synchronized (yyn1Var) {
            try {
                bvn1Var = yyn1Var.b;
                if (bvn1Var != bvn1Var2) {
                    yyn1Var.b = bvn1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bvn1Var;
    }

    @Override // p.ggo1
    public final ivn1 R(yyn1 yyn1Var) {
        ivn1 ivn1Var;
        ivn1 ivn1Var2 = ivn1.c;
        synchronized (yyn1Var) {
            try {
                ivn1Var = yyn1Var.c;
                if (ivn1Var != ivn1Var2) {
                    yyn1Var.c = ivn1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ivn1Var;
    }

    @Override // p.ggo1
    public final void S(ivn1 ivn1Var, ivn1 ivn1Var2) {
        ivn1Var.b = ivn1Var2;
    }

    @Override // p.ggo1
    public final void T(ivn1 ivn1Var, Thread thread) {
        ivn1Var.a = thread;
    }

    @Override // p.ggo1
    public final boolean U(yyn1 yyn1Var, bvn1 bvn1Var, bvn1 bvn1Var2) {
        synchronized (yyn1Var) {
            try {
                if (yyn1Var.b != bvn1Var) {
                    return false;
                }
                yyn1Var.b = bvn1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ggo1
    public final boolean V(nvn1 nvn1Var, Object obj, Object obj2) {
        synchronized (nvn1Var) {
            try {
                if (nvn1Var.a != obj) {
                    return false;
                }
                nvn1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.ggo1
    public final boolean W(nvn1 nvn1Var, ivn1 ivn1Var, ivn1 ivn1Var2) {
        synchronized (nvn1Var) {
            try {
                if (nvn1Var.c != ivn1Var) {
                    return false;
                }
                nvn1Var.c = ivn1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
