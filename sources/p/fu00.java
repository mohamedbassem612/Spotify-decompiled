package p;

import com.spotify.messages.AdUnlockedOnDemand;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fu00 {
    public final muz a;
    public final krh b;
    public final String c;
    public final ce31 d;

    public fu00(muz muzVar, krh krhVar, String str, ce31 ce31Var) {
        this.a = muzVar;
        this.b = krhVar;
        this.c = str;
        this.d = ce31Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:0: B:45:0x00a0->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(String str, onm onmVar) throws Exception {
        du00 du00Var;
        String str2;
        String message;
        ejc0 ejc0Var;
        String string;
        if (onmVar instanceof du00) {
            du00Var = (du00) onmVar;
            int i = du00Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                du00Var.d = i - os00.INVALID_ID;
            } else {
                du00Var = new du00(this, onmVar);
            }
        } else {
            du00Var = new du00(this, onmVar);
        }
        du00 du00Var2 = du00Var;
        Object obj = du00Var2.b;
        int i2 = du00Var2.d;
        String simpleName = null;
        Object obj2 = rih1.a;
        ce31 ce31Var = this.d;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            try {
                krh krhVar = this.b;
                du00Var2.a = str;
                du00Var2.d = 1;
                Object objN = rc2.N(gu00.a, new xtz(krhVar, this, str, (lnm) null, (byte) 1), du00Var2);
                if (objN != obj3) {
                    objN = obj2;
                }
                if (objN != obj3) {
                    str2 = str;
                    c01 c01VarN = AdUnlockedOnDemand.n();
                    c01VarN.n(b01.t);
                    c01VarN.s(ce31Var.b);
                    c01VarN.r(str2);
                    ce31Var.b(c01VarN);
                    ce31Var.a.a(c01VarN.build());
                    du00Var2.a = null;
                    du00Var2.d = 2;
                    if (b(du00Var2) == obj3) {
                        return obj2;
                    }
                }
            } catch (TimeoutCancellationException e) {
                e = e;
                str2 = str;
                ce31Var.a(str2, "timeout");
                k220.p("Cap sync timed out — user may still be capped", e);
                return null;
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                message = e.getMessage();
                if (message != null) {
                    ejc0Var = new ejc0(message);
                    while (ejc0Var.hasNext()) {
                        string = ihc1.e1((String) ejc0Var.next()).toString();
                        if (string.length() > 0) {
                            simpleName = string;
                            break;
                        }
                    }
                    if (simpleName == null) {
                        simpleName = e.getClass().getSimpleName();
                    }
                } else {
                    simpleName = e.getClass().getSimpleName();
                }
                ce31Var.a(str2, simpleName);
                throw e;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = du00Var2.a;
            try {
                hm5.M(obj);
                c01 c01VarN2 = AdUnlockedOnDemand.n();
                c01VarN2.n(b01.t);
                c01VarN2.s(ce31Var.b);
                c01VarN2.r(str2);
                ce31Var.b(c01VarN2);
                ce31Var.a.a(c01VarN2.build());
                du00Var2.a = null;
                du00Var2.d = 2;
                if (b(du00Var2) == obj3) {
                    return obj2;
                }
            } catch (Exception e3) {
                e = e3;
                message = e.getMessage();
                if (message != null) {
                    ejc0Var = new ejc0(message);
                    while (ejc0Var.hasNext()) {
                        string = ihc1.e1((String) ejc0Var.next()).toString();
                        if (string.length() > 0) {
                            simpleName = string;
                            break;
                        }
                    }
                    if (simpleName == null) {
                        simpleName = e.getClass().getSimpleName();
                    }
                } else {
                    simpleName = e.getClass().getSimpleName();
                }
                ce31Var.a(str2, simpleName);
                throw e;
            } catch (TimeoutCancellationException e4) {
                e = e4;
                ce31Var.a(str2, "timeout");
                k220.p("Cap sync timed out — user may still be capped", e);
                return null;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        eu00 eu00Var;
        if (onmVar instanceof eu00) {
            eu00Var = (eu00) onmVar;
            int i = eu00Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                eu00Var.c = i - os00.INVALID_ID;
            } else {
                eu00Var = new eu00(this, onmVar);
            }
        } else {
            eu00Var = new eu00(this, onmVar);
        }
        Object objP = eu00Var.a;
        int i2 = eu00Var.c;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        if (i2 == 0) {
            hm5.M(objP);
            if (str == null || ihc1.y0(str)) {
                n57.e("Destination URI is missing after rewarded ad completion");
                return rih1Var;
            }
            PlayCommand playCommandBuild = PlayCommand.builder(Context.fromUri(str), PlayOrigin.create("rewarded-ad-extend-on-demand-cap")).build();
            long j = gu00.b;
            xr00 xr00Var = new xr00(this, playCommandBuild, (lnm) null, (byte) 1);
            eu00Var.c = 1;
            objP = rc2.P(j, xr00Var, eu00Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        feh fehVar = (feh) objP;
        if (fehVar == null) {
            bhn0.f(f4i1.f("Timed out playing ", str, " after rewarded ad"));
            return null;
        }
        if (fehVar instanceof ceh) {
            return rih1Var;
        }
        bhn0.f(f4i1.f("Could not play ", str, " after rewarded ad"));
        return null;
    }
}
