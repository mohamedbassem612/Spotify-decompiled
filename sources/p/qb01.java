package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.read_reporting_esperanto.proto.ReadInterval;
import com.spotify.read_reporting_esperanto.proto.ReadStartRequest;
import com.spotify.read_reporting_esperanto.proto.ReadStartResponse;
import com.spotify.read_reporting_esperanto.proto.ReadUpdateRequest;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qb01 implements o5s {
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final jn7 a;
    public final x8c0 b;
    public final yqg c;
    public final llm d;
    public bbc e;
    public boolean f;
    public phc g;

    static {
        ytw0 ytw0Var = jfv.b;
        h = fdg1.k0(3, ngv.e);
    }

    public qb01(jn7 jn7Var, x8c0 x8c0Var, yqg yqgVar, q8n q8nVar) {
        this.a = jn7Var;
        this.b = x8c0Var;
        this.c = yqgVar;
        this.d = us71.h(q8nVar);
    }

    public static Object d(qb01 qb01Var, ya01 ya01Var, long j, long j2, Boolean bool, Boolean bool2, a8d1 a8d1Var, int i2) {
        if ((i2 & 1) != 0) {
            ya01Var = null;
        }
        if ((i2 & 8) != 0) {
            bool = null;
        }
        if ((i2 & 16) != 0) {
            bool2 = null;
        }
        phc phcVar = qb01Var.g;
        if (phcVar != null) {
            ub01 ub01VarN = ReadUpdateRequest.n();
            ub01VarN.t(phcVar);
            ub01VarN.u(j);
            ub01VarN.s(j2);
            if (ya01Var != null) {
                ub01VarN.n(ya01Var);
            }
            if (bool != null) {
                ub01VarN.q(bool.booleanValue());
            }
            if (bool2 != null) {
                ub01VarN.r(bool2.booleanValue());
            }
            Object objA = qb01Var.a(new ob01(qb01Var, (ReadUpdateRequest) ub01VarN.build(), (lnm) null, (byte) 2), a8d1Var);
            if (objA == d9n.a) {
                return objA;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(iu30 iu30Var, onm onmVar) {
        hb01 hb01Var;
        if (onmVar instanceof hb01) {
            hb01Var = (hb01) onmVar;
            int i2 = hb01Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hb01Var.c = i2 - Integer.MIN_VALUE;
            } else {
                hb01Var = new hb01(this, onmVar);
            }
        } else {
            hb01Var = new hb01(this, onmVar);
        }
        Object obj = hb01Var.a;
        int i3 = hb01Var.c;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            long j = h;
            w73 w73Var = new w73(iu30Var, (lnm) null, (byte) 12);
            hb01Var.c = 1;
            Object objP = rc2.P(j, w73Var, hb01Var);
            d9n d9nVar = d9n.a;
            return objP == d9nVar ? d9nVar : objP;
        } catch (CancellationException e) {
            op71.x(hb01Var.getContext());
            Logger.k("[ReadReporting] transport error: %s", new Object[]{e.getMessage()});
            return null;
        } catch (Exception e2) {
            Logger.k("[ReadReporting] rpc failed: %s", new Object[]{e2.getMessage()});
            return null;
        }
    }

    public final void b(xu30 xu30Var) {
        yqg yqgVar = this.c;
        long jB = yqgVar.b();
        long jE = yqgVar.e();
        bbc bbcVar = this.e;
        qge qgeVar = bbcVar != null ? new qge(bbcVar.l(new ib01(xu30Var, jB, jE, null))) : null;
        if (qgeVar == null || (qgeVar.a instanceof pge)) {
            Logger.k("[ReadReporting] operation dropped — no active session queue", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, int i2, int i3, boolean z, long j, long j2, onm onmVar) {
        pb01 pb01Var;
        if (onmVar instanceof pb01) {
            pb01Var = (pb01) onmVar;
            int i4 = pb01Var.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pb01Var.c = i4 - Integer.MIN_VALUE;
            } else {
                pb01Var = new pb01(this, onmVar);
            }
        } else {
            pb01Var = new pb01(this, onmVar);
        }
        Object objA = pb01Var.a;
        int i5 = pb01Var.c;
        if (i5 == 0) {
            hm5.M(objA);
            tb01 tb01VarN = ReadStartRequest.n();
            tb01VarN.n(str);
            ya01 ya01VarN = ReadInterval.n();
            ya01VarN.q(i2);
            ya01VarN.n(i3);
            tb01VarN.q(ya01VarN);
            tb01VarN.u(j);
            tb01VarN.s(j2);
            tb01VarN.t();
            tb01VarN.r(z);
            iu30 ob01Var = new ob01(this, (ReadStartRequest) tb01VarN.build(), (lnm) null, (byte) 1);
            pb01Var.c = 1;
            objA = a(ob01Var, pb01Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i5 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ReadStartResponse readStartResponse = (ReadStartResponse) objA;
        if (readStartResponse == null || readStartResponse.o() != hub1.SUCCESS) {
            Logger.k("[ReadReporting] readStart failed: %s", new Object[]{readStartResponse != null ? readStartResponse.o() : "timeout"});
        } else {
            this.g = readStartResponse.n();
        }
        return rih1.a;
    }

    public final void onStart(iac0 iac0Var) {
        b(new mb01(this, null, (byte) 0));
    }

    public final void onStop(iac0 iac0Var) {
        b(new mb01(this, null, (byte) 1));
    }
}
