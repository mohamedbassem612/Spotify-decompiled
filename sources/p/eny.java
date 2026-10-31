package p;

import com.spotify.metadata.esperanto.proto.GetEntityRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eny {
    public final xrc0 a;
    public final zwm1 b;
    public final ueg c;

    public eny(xrc0 xrc0Var, zwm1 zwm1Var, agc0 agc0Var, ueg uegVar) {
        this.a = xrc0Var;
        this.b = zwm1Var;
        this.c = uegVar;
    }

    public final Single a(String str, blc0 blc0Var) {
        t9w t9wVar = t9w.a1;
        e4y e4yVar = e4y.c1;
        ns80 ns80Var = ns80.e1;
        boolean zM = sto1.m(str);
        zwm1 zwm1Var = this.b;
        if (zM) {
            Single singleJust = Single.just(zwm1Var.c());
            singleJust.getClass();
            return singleJust;
        }
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(str).d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        if (u890.j(type, wyu0.f) || u890.j(type, nyu0.e)) {
            return rqt0.G(new ymu(this, str, (lnm) null, (byte) 21)).flatMap(ns80Var);
        }
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 30) {
            return b(str).map(t9wVar);
        }
        if (iOrdinal == 44) {
            return b(str).map(e4yVar);
        }
        if (iOrdinal == 171) {
            String strF = uic.x(str).F();
            if (strF != null && strF.length() != 0) {
                str = strF;
            }
            return b(str).map(t9wVar);
        }
        if (iOrdinal == 173) {
            String strF2 = uic.x(str).F();
            if (strF2 != null && strF2.length() != 0) {
                str = strF2;
            }
            return b(str).map(e4yVar);
        }
        if (iOrdinal != 180) {
            if (iOrdinal == 502) {
                return Single.just(zwm1Var.b.getString(2131956879));
            }
            if (iOrdinal == 844) {
                return b(str).map(mm10.h1);
            }
            if (iOrdinal == 860) {
                return b(str).map(bya0.a1);
            }
            if (iOrdinal == 926) {
                return b(str).map(stf0.f1);
            }
            if (iOrdinal != 190 && iOrdinal != 191) {
                if (iOrdinal == 196) {
                    return Single.just(zwm1Var.i());
                }
                if (iOrdinal == 197) {
                    return rqt0.G(new ymu(this, str, (lnm) null, (byte) 21)).flatMap(ns80Var);
                }
                if (iOrdinal != 204 && iOrdinal != 205) {
                    if (iOrdinal != 208 && iOrdinal != 209) {
                        return Single.error(new IllegalArgumentException("Unsupported uri ".concat(str)));
                    }
                }
            }
            return Single.just(zwm1Var.d());
        }
        return Single.just(zwm1Var.h());
    }

    public final Single b(String str) {
        dn40 dn40VarN = GetEntityRequest.n();
        dn40VarN.n(str);
        return this.c.a(dn40VarN.build());
    }
}
