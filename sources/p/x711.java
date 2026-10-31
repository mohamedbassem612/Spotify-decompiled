package p;

import com.spotify.base.java.logging.Logger;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x711 {
    public final tzr0 a;
    public final l5d0 b;
    public final fp8 c;
    public final q59 d;
    public final exu0 e;
    public final d8c0 f;
    public final so4 g;
    public final q8n h;
    public final mr20 i;
    public final ezc j;
    public final xrc0 k;

    public x711(tzr0 tzr0Var, l5d0 l5d0Var, fp8 fp8Var, q59 q59Var, exu0 exu0Var, d8c0 d8c0Var, so4 so4Var, q8n q8nVar, mr20 mr20Var, ezc ezcVar, xrc0 xrc0Var) {
        this.a = tzr0Var;
        this.b = l5d0Var;
        this.c = fp8Var;
        this.d = q59Var;
        this.e = exu0Var;
        this.f = d8c0Var;
        this.g = so4Var;
        this.h = q8nVar;
        this.i = mr20Var;
        this.j = ezcVar;
        this.k = xrc0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.TimeoutCancellationException */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        if (r2 == r9) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.bqr0 r19, p.onm r20) throws kotlinx.coroutines.TimeoutCancellationException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x711.a(p.bqr0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(bqr0 bqr0Var, onm onmVar) {
        w711 w711Var;
        p711 m231Var;
        if (onmVar instanceof w711) {
            w711Var = (w711) onmVar;
            int i = w711Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w711Var.d = i - Integer.MIN_VALUE;
            } else {
                w711Var = new w711(this, onmVar);
            }
        } else {
            w711Var = new w711(this, onmVar);
        }
        Object objM = w711Var.b;
        int i2 = w711Var.d;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                Set set = s4b1.f;
                if (!uic.k(bqr0Var.a.b, new b3i1[]{yxu0.e, nxu0.f})) {
                    return new p711(bqr0Var.a.b);
                }
                b201 b201Var = new b201(this, bqr0Var, lnmVar, (byte) 20);
                w711Var.a = bqr0Var;
                w711Var.d = 1;
                objM = rc2.M(30000L, b201Var, w711Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bqr0Var = w711Var.a;
                hm5.M(objM);
            }
            m231Var = (p711) objM;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, f4i1.f("Failed to lookup Personal Playlist Lookup URI ", bqr0Var.a.b, "."), new Object[0]);
        }
        p711 p711Var = new p711(null);
        if (m231Var instanceof m231) {
            m231Var = p711Var;
        }
        return m231Var;
    }
}
