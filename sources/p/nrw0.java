package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nrw0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ prw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nrw0(prw0 prw0Var, byte b) {
        super(1);
        this.a = b;
        this.b = prw0Var;
    }

    private final Object a(Object obj) {
        char cCharValue = ((Character) obj).charValue();
        prw0 prw0Var = this.b;
        synchronized (prw0Var.c) {
            if (prw0Var.d) {
                synchronized (s0u.a) {
                    s0u.b = cCharValue;
                    s0u.f = s0u.b();
                }
            }
        }
        return rih1.a;
    }

    private final Object d(Object obj) {
        bge1 bge1Var = (bge1) obj;
        prw0 prw0Var = this.b;
        synchronized (prw0Var.c) {
            try {
                if (prw0Var.d) {
                    if (bge1Var instanceof zfe1) {
                        s0u s0uVar = s0u.a;
                        int i = ((zfe1) bge1Var).a;
                        synchronized (s0uVar) {
                            try {
                                Integer numValueOf = Integer.valueOf(i);
                                if (i <= 0) {
                                    numValueOf = null;
                                }
                                s0u.d = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
                                s0u.f = s0u.b();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        if (!bge1Var.equals(age1.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        synchronized (s0u.a) {
                            s0u.d = "F";
                            s0u.f = s0u.b();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rih1.a;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return a(obj);
            case 1:
                b3e0 b3e0Var = (b3e0) obj;
                zrw0 zrw0Var = bsw0.a;
                bsw0.b = b3e0Var;
                bsw0.a(this.b.a, c2u.a);
                prw0 prw0Var = this.b;
                synchronized (prw0Var.c) {
                    if (prw0Var.d) {
                        s0u.a.c(b3e0Var.a, b3e0Var.b, b3e0Var.c, b3e0Var.d);
                    }
                    break;
                }
                return rih1.a;
            case 2:
                return d(obj);
            default:
                Integer num = (Integer) obj;
                prw0 prw0Var2 = this.b;
                synchronized (prw0Var2.c) {
                    try {
                        if (prw0Var2.d) {
                            if (num == null) {
                                synchronized (s0u.a) {
                                    s0u.e = "F";
                                    s0u.f = s0u.b();
                                }
                            } else {
                                s0u s0uVar = s0u.a;
                                int iIntValue = num.intValue();
                                synchronized (s0uVar) {
                                    s0u.e = String.valueOf(iIntValue);
                                    s0u.f = s0u.b();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
        }
    }
}
