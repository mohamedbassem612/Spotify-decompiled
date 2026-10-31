package p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u8v {
    public final big0 a;

    public u8v(big0 big0Var) {
        this.a = big0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws BetamaxTranscoderException {
        s8v s8vVar;
        if (onmVar instanceof s8v) {
            s8vVar = (s8v) onmVar;
            int i = s8vVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s8vVar.d = i - Integer.MIN_VALUE;
            } else {
                s8vVar = new s8v(this, onmVar);
            }
        } else {
            s8vVar = new s8v(this, onmVar);
        }
        Object objO = s8vVar.b;
        int i2 = s8vVar.d;
        if (i2 == 0) {
            hm5.M(objO);
            ymu ymuVar = new ymu(this, str, (lnm) null, (byte) 9);
            s8vVar.a = str;
            s8vVar.d = 1;
            objO = rc2.O(5000L, ymuVar, s8vVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = s8vVar.a;
            hm5.M(objO);
        }
        Boolean bool = (Boolean) objO;
        if (bool != null) {
            return bool;
        }
        throw new BetamaxTranscoderException(l1d.m("Timeout while detecting DRM status for URL: ", str), null, xjz.ERROR_TRANSCODER_DRM_CHECK, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) throws IOException {
        t8v t8vVar;
        if (onmVar instanceof t8v) {
            t8vVar = (t8v) onmVar;
            int i = t8vVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8vVar.d = i - Integer.MIN_VALUE;
            } else {
                t8vVar = new t8v(this, onmVar);
            }
        } else {
            t8vVar = new t8v(this, onmVar);
        }
        Object objA = t8vVar.b;
        int i2 = t8vVar.d;
        xjz xjzVar = xjz.ERROR_TRANSCODER_DRM_CHECK;
        if (i2 == 0) {
            hm5.M(objA);
            String strW = wqn1.w(str);
            if (strW == null) {
                throw new BetamaxTranscoderException("Could not extract manifest ID from URL: ".concat(str), null, xjzVar, 2);
            }
            t8vVar.a = str;
            t8vVar.d = 1;
            objA = this.a.a(strW, t8vVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = t8vVar.a;
            hm5.M(objA);
        }
        d5b1 d5b1Var = (d5b1) objA;
        if (d5b1Var != null) {
            return Boolean.valueOf(d5b1Var.b);
        }
        throw new BetamaxTranscoderException(l1d.m("Could not fetch manifest for URL: ", str), null, xjzVar, 2);
    }
}
