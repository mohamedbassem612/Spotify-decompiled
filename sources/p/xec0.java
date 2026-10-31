package p;

import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xec0 {
    public final d0r a;
    public final ff20 b;
    public final ouc0 c;

    public xec0(d0r d0rVar, String str, ff20 ff20Var) {
        this.a = d0rVar;
        this.b = ff20Var;
        this.c = new ouc0(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        uec0 uec0Var;
        if (onmVar instanceof uec0) {
            uec0Var = (uec0) onmVar;
            int i = uec0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uec0Var.c = i - Integer.MIN_VALUE;
            } else {
                uec0Var = new uec0(this, onmVar);
            }
        } else {
            uec0Var = new uec0(this, onmVar);
        }
        Object obj = uec0Var.a;
        int i2 = uec0Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            uec0Var.c = 1;
            if (this.b.a(str, uec0Var) != d9nVar) {
            }
        }
        if (i2 == 1) {
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        uec0Var.c = 2;
        muc0 muc0Var = new muc0(new qqc0(""));
        Object objD = d0r.d(this.a, jd0.D, this.c, muc0Var, uec0Var);
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(List list, lnm lnmVar) {
        vec0 vec0Var;
        Object next;
        jd0 jd0Var = jd0.D;
        if (lnmVar instanceof vec0) {
            vec0Var = (vec0) lnmVar;
            int i = vec0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vec0Var.c = i - Integer.MIN_VALUE;
            } else {
                vec0Var = new vec0(this, lnmVar);
            }
        } else {
            vec0Var = new vec0(this, lnmVar);
        }
        Object obj = vec0Var.a;
        int i2 = vec0Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((xe20) next).d);
                xe20 xe20Var = (xe20) next;
                String str = xe20Var != null ? xe20Var.a : null;
                ouc0 ouc0Var = this.c;
                d0r d0rVar = this.a;
                d9n d9nVar = d9n.a;
                if (str == null) {
                    vec0Var.c = 1;
                    Object objD = d0r.d(d0rVar, jd0Var, ouc0Var, new muc0(new qqc0("")), vec0Var);
                    if (objD != d9nVar) {
                        objD = rih1Var;
                    }
                    if (objD != d9nVar) {
                        objD = rih1Var;
                    }
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    String string = ihc1.e1(nhc1.W(str, "tags contains ", "")).toString();
                    vec0Var.c = 2;
                    Object objD2 = d0r.d(d0rVar, jd0Var, ouc0Var, new luc0(new qqc0(string)), vec0Var);
                    if (objD2 != d9nVar) {
                        objD2 = rih1Var;
                    }
                    if (objD2 != d9nVar) {
                        objD2 = rih1Var;
                    }
                    if (objD2 == d9nVar) {
                        return d9nVar;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Liked Songs genre filter reconcile failed.", new Object[0]);
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        wec0 wec0Var;
        if (onmVar instanceof wec0) {
            wec0Var = (wec0) onmVar;
            int i = wec0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wec0Var.d = i - Integer.MIN_VALUE;
            } else {
                wec0Var = new wec0(this, onmVar);
            }
        } else {
            wec0Var = new wec0(this, onmVar);
        }
        Object obj = wec0Var.b;
        int i2 = wec0Var.d;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        byte b = 1;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = wec0Var.a;
                hm5.M(obj);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        }
        hm5.M(obj);
        wec0Var.a = str;
        wec0Var.d = 1;
        ff20 ff20Var = this.b;
        Object objY = fn31.Y(ff20Var.b, new cf20(ff20Var, str, lnmVar, b), wec0Var);
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        if (objY != d9nVar) {
        }
        String string = ihc1.e1(nhc1.W(str, "tags contains ", "")).toString();
        wec0Var.a = null;
        wec0Var.d = 2;
        luc0 luc0Var = new luc0(new qqc0(string));
        Object objD = d0r.d(this.a, jd0.D, this.c, luc0Var, wec0Var);
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? d9nVar : rih1Var;
    }
}
