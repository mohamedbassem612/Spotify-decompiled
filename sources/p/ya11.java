package p;

import java.util.concurrent.CancellationException;
import spotify.spotbot.v2.promptable_playlist.Refinement;
import spotify.spotbot.v2.promptable_playlist.Refinement$AttachRefinementSessionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ya11 {
    public final za11 a;

    public ya11(za11 za11Var) {
        this.a = za11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        va11 va11Var;
        if (onmVar instanceof va11) {
            va11Var = (va11) onmVar;
            int i = va11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                va11Var.c = i - Integer.MIN_VALUE;
            } else {
                va11Var = new va11(this, onmVar);
            }
        } else {
            va11Var = new va11(this, onmVar);
        }
        Object objB = va11Var.a;
        int i2 = va11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                sa11 sa11VarN = Refinement.AttachRefinementSessionRequest.n();
                sa11VarN.q(str);
                sa11VarN.n(str2);
                Refinement.AttachRefinementSessionRequest attachRefinementSessionRequestBuild = sa11VarN.build();
                za11 za11Var = this.a;
                attachRefinementSessionRequestBuild.getClass();
                va11Var.c = 1;
                objB = za11Var.b(attachRefinementSessionRequestBuild, va11Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            sy21 sy21Var = (sy21) objB;
            if (sy21Var.a.Q0) {
                Object obj = sy21Var.b;
                if (obj != null) {
                    return new wj7(((Refinement$AttachRefinementSessionResponse) obj).n());
                }
                throw new IllegalArgumentException("Response body is null for successful attach refinement session response");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return vj7.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        wa11 wa11Var;
        if (onmVar instanceof wa11) {
            wa11Var = (wa11) onmVar;
            int i = wa11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wa11Var.c = i - Integer.MIN_VALUE;
            } else {
                wa11Var = new wa11(this, onmVar);
            }
        } else {
            wa11Var = new wa11(this, onmVar);
        }
        Object objC = wa11Var.a;
        int i2 = wa11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                ta11 ta11VarN = Refinement.DiscardRefinementSessionRequest.n();
                ta11VarN.n(str);
                Refinement.DiscardRefinementSessionRequest discardRefinementSessionRequestBuild = ta11VarN.build();
                za11 za11Var = this.a;
                discardRefinementSessionRequestBuild.getClass();
                wa11Var.c = 1;
                objC = za11Var.c(discardRefinementSessionRequestBuild, wa11Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            if (((sy21) objC).a.Q0) {
                return u6u.f;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return t6u.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, onm onmVar) {
        xa11 xa11Var;
        if (onmVar instanceof xa11) {
            xa11Var = (xa11) onmVar;
            int i = xa11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xa11Var.c = i - Integer.MIN_VALUE;
            } else {
                xa11Var = new xa11(this, onmVar);
            }
        } else {
            xa11Var = new xa11(this, onmVar);
        }
        Object objA = xa11Var.a;
        int i2 = xa11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ua11 ua11VarN = Refinement.SaveRefinementSessionRequest.n();
                ua11VarN.q(str);
                ua11VarN.n(str2);
                Refinement.SaveRefinementSessionRequest saveRefinementSessionRequestBuild = ua11VarN.build();
                za11 za11Var = this.a;
                saveRefinementSessionRequestBuild.getClass();
                xa11Var.c = 1;
                objA = za11Var.a(saveRefinementSessionRequestBuild, xa11Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            if (((sy21) objA).a.Q0) {
                return jc41.a;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return ic41.a;
    }
}
