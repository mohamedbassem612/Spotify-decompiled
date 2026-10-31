package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uq40 {
    public final uu00 a;

    public uq40(uu00 uu00Var) {
        this.a = uu00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        sq40 sq40Var;
        if (onmVar instanceof sq40) {
            sq40Var = (sq40) onmVar;
            int i = sq40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq40Var.d = i - Integer.MIN_VALUE;
            } else {
                sq40Var = new sq40(this, onmVar);
            }
        } else {
            sq40Var = new sq40(this, onmVar);
        }
        Object objP = sq40Var.b;
        int i2 = sq40Var.d;
        z6g1 z6g1Var = z6g1.a;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                if (str.length() == 0) {
                    Logger.k("GetTraitsMetadataUseCase received an empty Uri.", new Object[0]);
                    return z6g1Var;
                }
                oi oiVar = new oi("npv-widget", false, new kq00(str, (byte) 29));
                long j = vq40.a;
                xr00 xr00Var = new xr00(this, oiVar, (lnm) null, (byte) 20);
                sq40Var.a = str;
                sq40Var.d = 1;
                objP = rc2.P(j, xr00Var, sq40Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = sq40Var.a;
                hm5.M(objP);
            }
            uv00 uv00Var = (uv00) objP;
            if (uv00Var == null) {
                Logger.k("Extended metadata request timed out.", new Object[0]);
                return z6g1Var;
            }
            jo70 jo70Var = uv00Var.a(jo70.class, str).b;
            xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
            hzy hzyVar = uv00Var.a(hzy.class, str).b;
            if (jo70Var != null && xkk1Var != null && hzyVar != null) {
                return new a7g1(jo70Var, xkk1Var, hzyVar);
            }
            return z6g1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "Failed to fetch extended metadata for npv widget.", new Object[0]);
            return z6g1Var;
        }
    }
}
