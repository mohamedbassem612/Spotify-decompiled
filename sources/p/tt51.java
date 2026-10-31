package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class tt51 implements xpw, cvl1 {
    public final d0r a;
    public final u9c0 b;
    public final g931 c;
    public final bpb1 d;
    public final js20 e;
    public final psw f;

    public tt51(d0r d0rVar, u9c0 u9c0Var, g931 g931Var) {
        this.a = d0rVar;
        this.b = u9c0Var;
        this.c = g931Var;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.d = bpb1VarB;
        this.e = z0o1.k(bpb1VarB, qr51.h, new mn41(this, (byte) 21), 4);
        j2i j2iVar = new j2i(-558258754, new hg31(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final jsw c() {
        return this.f;
    }

    public abstract Object e(aw51 aw51Var, tv80 tv80Var, lnm lnmVar);

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tv80 tv80Var, onm onmVar) {
        st51 st51Var;
        boolean zBooleanValue;
        Object objD;
        if (onmVar instanceof st51) {
            st51Var = (st51) onmVar;
            int i = st51Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                st51Var.d = i - Integer.MIN_VALUE;
            } else {
                st51Var = new st51(this, onmVar);
            }
        } else {
            st51Var = new st51(this, onmVar);
        }
        Object objP = st51Var.b;
        int i2 = st51Var.d;
        d9n d9nVar = d9n.a;
        bpb1 bpb1Var = this.d;
        rih1 rih1Var = rih1.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objP);
                    st51Var.a = tv80Var;
                    st51Var.d = 1;
                    objP = this.c.p(st51Var);
                    if (objP != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i2 == 1) {
                    tv80Var = st51Var.a;
                    hm5.M(objP);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            hm5.M(objP);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objP);
                }
                zBooleanValue = ((Boolean) objP).booleanValue();
                Boolean bool = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                if (zBooleanValue) {
                    st51Var.a = null;
                    st51Var.d = 3;
                    objD = d0r.d(this.a, pwc0.D, rih1Var, new cz51(), st51Var);
                    if (objD != d9nVar) {
                        objD = rih1Var;
                    }
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
                aw51 aw51Var = (aw51) objP;
                if (!aw51Var.a.isEmpty()) {
                    Boolean bool2 = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool2);
                    st51Var.a = null;
                    st51Var.d = 2;
                    objP = e(aw51Var, tv80Var, st51Var);
                    if (objP != d9nVar) {
                        zBooleanValue = ((Boolean) objP).booleanValue();
                        Boolean bool3 = Boolean.FALSE;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, bool3);
                        if (zBooleanValue) {
                            st51Var.a = null;
                            st51Var.d = 3;
                            objD = d0r.d(this.a, pwc0.D, rih1Var, new cz51(), st51Var);
                            if (objD != d9nVar) {
                                objD = rih1Var;
                            }
                            if (objD == d9nVar) {
                            }
                        }
                    }
                    return d9nVar;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Logger.e(e2, "Select bottom action failed.", new Object[0]);
                Boolean bool4 = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool4);
                zBooleanValue = false;
            }
            return rih1Var;
        } catch (Throwable th) {
            Boolean bool5 = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool5);
            throw th;
        }
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
