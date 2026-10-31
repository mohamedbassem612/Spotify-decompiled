package p;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ws40 {
    public final cg61 a = dg61.a();

    public static Object e(ws40 ws40Var, Context context, int i, onm onmVar) {
        ws40Var.getClass();
        vif1.a();
        Object objB = ws40Var.a.b(new rzu(context, new kx5(i), ws40Var, (lnm) null, (byte) 15), onmVar);
        return objB == d9n.a ? objB : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, int i, onm onmVar) throws Throwable {
        vs40 vs40Var;
        ws40 ws40Var;
        int i2;
        v441 v441VarC;
        nt40 nt40Var;
        String strK;
        v441 v441VarC2;
        nt40 nt40Var2;
        String strK2;
        v441 v441VarC3;
        nt40 nt40Var3;
        String strK3;
        if (onmVar instanceof vs40) {
            vs40Var = (vs40) onmVar;
            int i3 = vs40Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vs40Var.f = i3 - Integer.MIN_VALUE;
            } else {
                vs40Var = new vs40(this, onmVar);
            }
        } else {
            vs40Var = new vs40(this, onmVar);
        }
        Object obj = vs40Var.d;
        int i4 = vs40Var.f;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        switch (i4) {
            case 0:
                hm5.M(obj);
                xr00 xr00Var = new xr00(new kx5(i), (lnm) null, (byte) 21);
                vs40Var.a = this;
                vs40Var.b = context;
                vs40Var.c = i;
                vs40Var.f = 1;
                if (this.a.b(xr00Var, vs40Var) != d9nVar2) {
                    try {
                        vs40Var.a = this;
                        vs40Var.b = context;
                        vs40Var.c = i;
                        vs40Var.f = 2;
                        this.getClass();
                        if (d9nVar != d9nVar2) {
                            int i5 = i;
                            ws40Var = this;
                            i2 = i5;
                            v441VarC3 = ws40Var.c();
                            if (v441VarC3 != null) {
                                nt40Var3 = nt40.a;
                                strK3 = u2o1.k(i2);
                                vs40Var.a = null;
                                vs40Var.b = null;
                                vs40Var.f = 3;
                                if (nt40Var3.a(context, v441VarC3, strK3, vs40Var) == d9nVar2) {
                                }
                            }
                            return d9nVar;
                        }
                    } catch (CancellationException unused) {
                        int i6 = i;
                        ws40Var = this;
                        i2 = i6;
                        v441VarC2 = ws40Var.c();
                        if (v441VarC2 != null) {
                            nt40Var2 = nt40.a;
                            strK2 = u2o1.k(i2);
                            vs40Var.a = null;
                            vs40Var.b = null;
                            vs40Var.f = 4;
                            if (nt40Var2.a(context, v441VarC2, strK2, vs40Var) == d9nVar2) {
                                return d9nVar2;
                            }
                        }
                    } catch (Throwable unused2) {
                        int i7 = i;
                        ws40Var = this;
                        i2 = i7;
                        v441VarC = ws40Var.c();
                        if (v441VarC != null) {
                            nt40Var = nt40.a;
                            strK = u2o1.k(i2);
                            vs40Var.a = null;
                            vs40Var.b = null;
                            vs40Var.f = 5;
                            if (nt40Var.a(context, v441VarC, strK, vs40Var) == d9nVar2) {
                                return d9nVar2;
                            }
                        }
                    }
                }
                return d9nVar2;
            case 1:
                i = vs40Var.c;
                context = vs40Var.b;
                this = vs40Var.a;
                hm5.M(obj);
                vs40Var.a = this;
                vs40Var.b = context;
                vs40Var.c = i;
                vs40Var.f = 2;
                this.getClass();
                if (d9nVar != d9nVar2) {
                    int i8 = i;
                    ws40Var = this;
                    i2 = i8;
                    v441VarC3 = ws40Var.c();
                    if (v441VarC3 != null) {
                        nt40Var3 = nt40.a;
                        strK3 = u2o1.k(i2);
                        vs40Var.a = null;
                        vs40Var.b = null;
                        vs40Var.f = 3;
                        if (nt40Var3.a(context, v441VarC3, strK3, vs40Var) == d9nVar2) {
                        }
                    }
                    return d9nVar;
                }
                return d9nVar2;
            case 2:
                i2 = vs40Var.c;
                context = vs40Var.b;
                ws40Var = vs40Var.a;
                try {
                    hm5.M(obj);
                    v441VarC3 = ws40Var.c();
                    if (v441VarC3 != null) {
                        nt40Var3 = nt40.a;
                        strK3 = u2o1.k(i2);
                        vs40Var.a = null;
                        vs40Var.b = null;
                        vs40Var.f = 3;
                        if (nt40Var3.a(context, v441VarC3, strK3, vs40Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } catch (CancellationException unused3) {
                    v441VarC2 = ws40Var.c();
                    if (v441VarC2 != null) {
                        nt40Var2 = nt40.a;
                        strK2 = u2o1.k(i2);
                        vs40Var.a = null;
                        vs40Var.b = null;
                        vs40Var.f = 4;
                        if (nt40Var2.a(context, v441VarC2, strK2, vs40Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } catch (Throwable unused4) {
                    v441VarC = ws40Var.c();
                    if (v441VarC != null) {
                        nt40Var = nt40.a;
                        strK = u2o1.k(i2);
                        vs40Var.a = null;
                        vs40Var.b = null;
                        vs40Var.f = 5;
                        if (nt40Var.a(context, v441VarC, strK, vs40Var) == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                }
                return d9nVar;
            case 3:
                hm5.M(obj);
                return d9nVar;
            case 4:
            case 5:
                hm5.M(obj);
                return d9nVar;
            case 6:
                Throwable th = (Throwable) vs40Var.a;
                hm5.M(obj);
                throw th;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public abstract v291 b();

    public abstract v441 c();

    public abstract void d(Context context, kx5 kx5Var, lnm lnmVar);
}
