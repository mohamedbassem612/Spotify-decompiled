package p;

import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class isc {
    public final iyc0 a;

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object a(y4k0 y4k0Var, onm onmVar) {
        mf21 mf21Var;
        if (onmVar instanceof mf21) {
            mf21Var = (mf21) onmVar;
            int i = mf21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mf21Var.d = i - Integer.MIN_VALUE;
            } else {
                mf21Var = new mf21(this, onmVar);
            }
        } else {
            mf21Var = new mf21(this, onmVar);
        }
        mf21 mf21Var2 = mf21Var;
        Object objN = mf21Var2.b;
        int i2 = mf21Var2.d;
        try {
            if (i2 == 0) {
                hm5.M(objN);
                xyc0 xyc0Var = this.a;
                String str = y4k0Var.c;
                String str2 = y4k0Var.a;
                List listSingletonList = Collections.singletonList(y4k0Var.b);
                String str3 = y4k0Var.c;
                mf21Var2.a = y4k0Var;
                mf21Var2.d = 1;
                objN = xyc0Var.n(str, str2, listSingletonList, str3, str3, mf21Var2);
                d9n d9nVar = d9n.a;
                if (objN == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y4k0Var = mf21Var2.a;
                hm5.M(objN);
            }
            py21 py21Var = (py21) objN;
            if (py21Var instanceof oy21) {
                return new k5k0(y4k0Var.a);
            }
            Logger.k("Replace item returned non-success response: " + py21Var, new Object[0]);
            return new j5k0(y4k0Var.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to replace track", new Object[0]);
            return new j5k0(y4k0Var.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        c6u c6uVar;
        py21 m231Var;
        boolean zBooleanValue;
        Boolean bool;
        if (onmVar instanceof c6u) {
            c6uVar = (c6u) onmVar;
            int i = c6uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6uVar.c = i - Integer.MIN_VALUE;
            } else {
                c6uVar = new c6u(this, onmVar);
            }
        } else {
            c6uVar = new c6u(this, onmVar);
        }
        Object objA = c6uVar.a;
        int i2 = c6uVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                hhc hhcVarI = phc.i("{\"cadence\":\"NEVER\"}");
                iyc0 iyc0Var = this.a;
                ayc0 ayc0Var = new ayc0("UPDATE_CADENCE", (phc) null, hhcVarI, true, (String) null, 18);
                c6uVar.c = 1;
                objA = iyc0.a(iyc0Var, str, ayc0Var, c6uVar);
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
            m231Var = (py21) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        py21 py21Var = m231Var;
        if (py21Var != null) {
            if (py21Var instanceof ly21) {
                bool = Boolean.FALSE;
            } else {
                if (!(py21Var instanceof oy21)) {
                    eg.o();
                    return null;
                }
                bool = Boolean.TRUE;
            }
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
