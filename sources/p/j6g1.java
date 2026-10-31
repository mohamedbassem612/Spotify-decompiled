package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j6g1 {
    public final vlo a;
    public final p981 b;
    public final idd1 c;
    public final o3r d;

    public j6g1(dv00 dv00Var, vlo vloVar, agc0 agc0Var, xrm1 xrm1Var, p981 p981Var) {
        s0r s0rVar = new s0r(dv00Var, (byte) 1);
        this.a = vloVar;
        this.b = p981Var;
        this.c = new idd1(s0rVar);
        this.d = w3p1.o(new l4r(new xv00(rc11.a.b(uio.class)), 1, h5g1.c, new j4r(dw81.O0), h5g1.d), h5g1.e);
    }

    public final ak3 a(uio uioVar) {
        two1 two1Var = uioVar.b;
        if (!(two1Var instanceof rio)) {
            return null;
        }
        String str = ((rio) two1Var).c;
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
            return ak3.a;
        }
        if (xrm1.a(str)) {
            return ak3.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(String str, uio uioVar, onm onmVar) {
        i6g1 i6g1Var;
        ak3 ak3VarA;
        ak3 ak3VarA2;
        if (onmVar instanceof i6g1) {
            i6g1Var = (i6g1) onmVar;
            int i = i6g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i6g1Var.c = i - Integer.MIN_VALUE;
            } else {
                i6g1Var = new i6g1(this, onmVar);
            }
        } else {
            i6g1Var = new i6g1(this, onmVar);
        }
        Object objJ = i6g1Var.a;
        int i2 = i6g1Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Set set = s4b1.f;
            int iOrdinal = uic.x(str).c.ordinal();
            if (iOrdinal != 652) {
                if (iOrdinal == 844) {
                    return (uioVar == null || (ak3VarA = a(uioVar)) == null) ? ak3.b : ak3VarA;
                }
                if (iOrdinal == 860) {
                    Single singleA = this.b.a(str);
                    i6g1Var.c = 1;
                    objJ = fc11.j(singleA, i6g1Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else if (iOrdinal == 926) {
                    return (!this.a.b(blc0.ti) || uioVar == null || (ak3VarA2 = a(uioVar)) == null) ? ak3.a : ak3VarA2;
                }
            } else if (uioVar != null) {
                return a(uioVar);
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objJ);
        if (((Boolean) objJ).booleanValue()) {
            return ak3.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        h6g1 h6g1Var;
        if (onmVar instanceof h6g1) {
            h6g1Var = (h6g1) onmVar;
            int i = h6g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6g1Var.c = i - Integer.MIN_VALUE;
            } else {
                h6g1Var = new h6g1(this, onmVar);
            }
        } else {
            h6g1Var = new h6g1(this, onmVar);
        }
        Object objO = h6g1Var.a;
        int i2 = h6g1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                if (this.a.a(str)) {
                    pec1 pec1Var = new pec1(this, str, (lnm) null, (byte) 29);
                    h6g1Var.c = 1;
                    objO = rc2.O(2000L, pec1Var, h6g1Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
            return (kk3) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
