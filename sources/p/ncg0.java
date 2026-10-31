package p;

import android.content.res.Resources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ncg0 {
    public final n2b0 a;
    public final kt91 b;
    public final Resources c;
    public final lzn0 d;
    public final q8n e;
    public final q8n f;

    public ncg0(Resources resources, q8n q8nVar, q8n q8nVar2, n2b0 n2b0Var, lzn0 lzn0Var, kt91 kt91Var) {
        this.a = n2b0Var;
        this.b = kt91Var;
        this.c = resources;
        this.d = lzn0Var;
        this.e = q8nVar;
        this.f = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(qbg0 qbg0Var, onm onmVar) {
        icg0 icg0Var;
        tk m231Var;
        if (onmVar instanceof icg0) {
            icg0Var = (icg0) onmVar;
            int i = icg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                icg0Var.d = i - Integer.MIN_VALUE;
            } else {
                icg0Var = new icg0(this, onmVar);
            }
        } else {
            icg0Var = new icg0(this, onmVar);
        }
        Object objB = icg0Var.b;
        int i2 = icg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                n2b0 n2b0Var = this.a;
                String str = qbg0Var.d;
                ibg0 ibg0Var = qbg0Var.e;
                tk tkVar = new tk(Boolean.valueOf(qbg0Var.f), (Boolean) null, (gjj1) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 126);
                icg0Var.a = qbg0Var;
                icg0Var.d = 1;
                objB = n2b0Var.b(str, ibg0Var, tkVar, icg0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qbg0Var = icg0Var.a;
                hm5.M(objB);
            }
            m231Var = (tk) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new pcg0(qbg0Var.f) : new rcg0(!qbg0Var.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rbg0 rbg0Var, onm onmVar) {
        jcg0 jcg0Var;
        tk m231Var;
        if (onmVar instanceof jcg0) {
            jcg0Var = (jcg0) onmVar;
            int i = jcg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jcg0Var.d = i - Integer.MIN_VALUE;
            } else {
                jcg0Var = new jcg0(this, onmVar);
            }
        } else {
            jcg0Var = new jcg0(this, onmVar);
        }
        Object objB = jcg0Var.b;
        int i2 = jcg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                n2b0 n2b0Var = this.a;
                String str = rbg0Var.d;
                ibg0 ibg0Var = rbg0Var.e;
                tk tkVar = new tk((Boolean) null, (Boolean) null, (gjj1) null, (Boolean) null, (Boolean) null, (Boolean) null, Boolean.valueOf(rbg0Var.f), 63);
                jcg0Var.a = rbg0Var;
                jcg0Var.d = 1;
                objB = n2b0Var.b(str, ibg0Var, tkVar, jcg0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rbg0Var = jcg0Var.a;
                hm5.M(objB);
            }
            m231Var = (tk) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new tcg0(rbg0Var.f) : new vcg0(!rbg0Var.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(sbg0 sbg0Var, onm onmVar) {
        kcg0 kcg0Var;
        tk m231Var;
        if (onmVar instanceof kcg0) {
            kcg0Var = (kcg0) onmVar;
            int i = kcg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kcg0Var.d = i - Integer.MIN_VALUE;
            } else {
                kcg0Var = new kcg0(this, onmVar);
            }
        } else {
            kcg0Var = new kcg0(this, onmVar);
        }
        Object objB = kcg0Var.b;
        int i2 = kcg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                n2b0 n2b0Var = this.a;
                String str = sbg0Var.d;
                ibg0 ibg0Var = sbg0Var.e;
                tk tkVar = new tk((Boolean) null, (Boolean) null, (gjj1) null, (Boolean) null, (Boolean) null, Boolean.valueOf(sbg0Var.f), (Boolean) null, 95);
                kcg0Var.a = sbg0Var;
                kcg0Var.d = 1;
                objB = n2b0Var.b(str, ibg0Var, tkVar, kcg0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sbg0Var = kcg0Var.a;
                hm5.M(objB);
            }
            m231Var = (tk) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new wcg0(sbg0Var.f) : new ycg0(!sbg0Var.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(tbg0 tbg0Var, onm onmVar) {
        lcg0 lcg0Var;
        tk m231Var;
        if (onmVar instanceof lcg0) {
            lcg0Var = (lcg0) onmVar;
            int i = lcg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcg0Var.d = i - Integer.MIN_VALUE;
            } else {
                lcg0Var = new lcg0(this, onmVar);
            }
        } else {
            lcg0Var = new lcg0(this, onmVar);
        }
        Object objB = lcg0Var.b;
        int i2 = lcg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                n2b0 n2b0Var = this.a;
                String str = tbg0Var.d;
                ibg0 ibg0Var = tbg0Var.e;
                tk tkVar = new tk((Boolean) null, (Boolean) null, (gjj1) null, Boolean.valueOf(tbg0Var.f), (Boolean) null, (Boolean) null, (Boolean) null, 119);
                lcg0Var.a = tbg0Var;
                lcg0Var.d = 1;
                objB = n2b0Var.b(str, ibg0Var, tkVar, lcg0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tbg0Var = lcg0Var.a;
                hm5.M(objB);
            }
            m231Var = (tk) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new zcg0(tbg0Var.f) : new bdg0(!tbg0Var.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ubg0 ubg0Var, onm onmVar) {
        mcg0 mcg0Var;
        tk m231Var;
        if (onmVar instanceof mcg0) {
            mcg0Var = (mcg0) onmVar;
            int i = mcg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mcg0Var.d = i - Integer.MIN_VALUE;
            } else {
                mcg0Var = new mcg0(this, onmVar);
            }
        } else {
            mcg0Var = new mcg0(this, onmVar);
        }
        Object objB = mcg0Var.b;
        int i2 = mcg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                n2b0 n2b0Var = this.a;
                String str = ubg0Var.d;
                ibg0 ibg0Var = ubg0Var.e;
                tk tkVar = new tk((Boolean) null, Boolean.valueOf(ubg0Var.f), (gjj1) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 125);
                mcg0Var.a = ubg0Var;
                mcg0Var.d = 1;
                objB = n2b0Var.b(str, ibg0Var, tkVar, mcg0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ubg0Var = mcg0Var.a;
                hm5.M(objB);
            }
            m231Var = (tk) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new cdg0(ubg0Var.f) : new edg0(!ubg0Var.f);
    }
}
