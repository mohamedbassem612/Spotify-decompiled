package p;

import com.spotify.campaigns.rivevideo.preview.api.TerminalParamsException;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class zsj1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(nsj1 nsj1Var, ti31 ti31Var, fjw0 fjw0Var, onm onmVar) {
        qsj1 qsj1Var;
        ejw0 ejw0Var;
        ejw0 ejw0Var2;
        if (onmVar instanceof qsj1) {
            qsj1Var = (qsj1) onmVar;
            int i = qsj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsj1Var.c = i - Integer.MIN_VALUE;
            } else {
                qsj1Var = new qsj1(onmVar);
            }
        } else {
            qsj1Var = new qsj1(onmVar);
        }
        Object objA = qsj1Var.b;
        Object obj = d9n.a;
        int i2 = qsj1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            String str = nsj1Var.a;
            synchronized (fjw0Var.b) {
                ejw0Var = fjw0Var.c;
            }
            ejw0 ejw0VarA = ejw0Var == null ? fjw0Var.a(str) : ejw0Var;
            try {
                String str2 = nsj1Var.a;
                Map map = nsj1Var.b;
                qsj1Var.a = ejw0VarA;
                qsj1Var.c = 1;
                objA = ti31Var.a(str2, ejw0VarA, map, qsj1Var);
                if (objA == obj) {
                    return obj;
                }
                ejw0Var2 = ejw0VarA;
            } catch (CancellationException e) {
                e = e;
                ejw0Var2 = ejw0VarA;
                ejw0Var2.d(3);
                throw e;
            } catch (Exception e2) {
                e = e2;
                ejw0Var2 = ejw0VarA;
                ejw0Var2.d(2);
                return new ttj1(e);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ejw0Var2 = qsj1Var.a;
            try {
                hm5.M(objA);
            } catch (CancellationException e3) {
                e = e3;
                ejw0Var2.d(3);
                throw e;
            } catch (Exception e4) {
                e = e4;
                ejw0Var2.d(2);
                return new ttj1(e);
            }
        }
        return new utj1((oi31) objA);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b A[Catch: Exception -> 0x0029, TerminalParamsException -> 0x002b, CancellationException -> 0x002d, TryCatch #4 {TerminalParamsException -> 0x002b, CancellationException -> 0x002d, Exception -> 0x0029, blocks: (B:12:0x0025, B:28:0x0057, B:30:0x005b, B:32:0x0066), top: B:48:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[Catch: Exception -> 0x0029, TerminalParamsException -> 0x002b, CancellationException -> 0x002d, TRY_LEAVE, TryCatch #4 {TerminalParamsException -> 0x002b, CancellationException -> 0x002d, Exception -> 0x0029, blocks: (B:12:0x0025, B:28:0x0057, B:30:0x005b, B:32:0x0066), top: B:48:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(l8t0 l8t0Var, fjw0 fjw0Var, onm onmVar) {
        rsj1 rsj1Var;
        Exception e;
        ejw0 ejw0Var;
        CancellationException e2;
        TerminalParamsException e3;
        String message;
        bm31 bm31Var;
        if (onmVar instanceof rsj1) {
            rsj1Var = (rsj1) onmVar;
            int i = rsj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsj1Var.c = i - Integer.MIN_VALUE;
            } else {
                rsj1Var = new rsj1(onmVar);
            }
        } else {
            rsj1Var = new rsj1(onmVar);
        }
        Object objY = rsj1Var.b;
        int i2 = rsj1Var.c;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ejw0Var = rsj1Var.a;
            try {
                hm5.M(objY);
                bm31Var = (bm31) objY;
                if (bm31Var != null) {
                    ejw0Var.f(bm31Var.a);
                    return new wtj1(bm31Var);
                }
                ejw0Var.d(2);
                return new xtj1("Share asset is not a Rive animation");
            } catch (TerminalParamsException e4) {
                e3 = e4;
                ejw0Var.d(2);
                message = e3.getMessage();
                if (message == null) {
                    message = "Share asset unavailable";
                }
                return new xtj1(message);
            } catch (CancellationException e5) {
                e2 = e5;
                ejw0Var.d(3);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                ejw0Var.d(2);
                return new vtj1(e);
            }
        }
        hm5.M(objY);
        ejw0 ejw0VarA = fjw0Var.a(null);
        try {
            nkw0 nkw0Var = new nkw0(ejw0VarA);
            w73 w73Var = new w73(l8t0Var, (lnm) null, (byte) 22);
            rsj1Var.a = ejw0VarA;
            rsj1Var.c = 1;
            objY = fn31.Y(nkw0Var, w73Var, rsj1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            ejw0Var = ejw0VarA;
            bm31Var = (bm31) objY;
            if (bm31Var != null) {
                ejw0Var.f(bm31Var.a);
                return new wtj1(bm31Var);
            }
            ejw0Var.d(2);
            return new xtj1("Share asset is not a Rive animation");
        } catch (TerminalParamsException e7) {
            e3 = e7;
            ejw0Var = ejw0VarA;
            ejw0Var.d(2);
            message = e3.getMessage();
            if (message == null) {
                message = "Share asset unavailable";
            }
            return new xtj1(message);
        } catch (CancellationException e8) {
            e2 = e8;
            ejw0Var = ejw0VarA;
            ejw0Var.d(3);
            throw e2;
        } catch (Exception e9) {
            e = e9;
            ejw0Var = ejw0VarA;
            ejw0Var.d(2);
            return new vtj1(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(psj1 psj1Var, onm onmVar) {
        ssj1 ssj1Var;
        if (onmVar instanceof ssj1) {
            ssj1Var = (ssj1) onmVar;
            int i = ssj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssj1Var.c = i - Integer.MIN_VALUE;
            } else {
                ssj1Var = new ssj1(onmVar);
            }
        } else {
            ssj1Var = new ssj1(onmVar);
        }
        Object obj = ssj1Var.b;
        int i2 = ssj1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            long j = psj1Var.a;
            ssj1Var.a = psj1Var;
            ssj1Var.c = 1;
            Object objI = hap1.i(j, ssj1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            psj1Var = ssj1Var.a;
            hm5.M(obj);
        }
        return new ytj1(psj1Var.b);
    }
}
