package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i531 {
    public final h3n0 a;
    public final upa0 b;
    public final cz30 c;
    public final iyc0 d;

    public i531(h3n0 h3n0Var, upa0 upa0Var, pob pobVar, cz30 cz30Var, iyc0 iyc0Var) {
        this.a = h3n0Var;
        this.b = upa0Var;
        this.c = cz30Var;
        this.d = iyc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150 A[LOOP:0: B:63:0x013b->B:68:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0187  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x0206  */
    /* JADX WARN: Code duplicated, block: B:94:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r2 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r2 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (c(r1, r3) == r7) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.w531 r35, p.onm r36) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i531.a(p.w531, p.onm):java.lang.Object");
    }

    public final o6e0 b(w531 w531Var) {
        return new o6e0(new ob01(this, w531Var, null, (byte) 8), f46.I(new p6e0[0]));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(String str, onm onmVar) {
        h531 h531Var;
        if (onmVar instanceof h531) {
            h531Var = (h531) onmVar;
            int i = h531Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h531Var.c = i - Integer.MIN_VALUE;
            } else {
                h531Var = new h531(this, onmVar);
            }
        } else {
            h531Var = new h531(this, onmVar);
        }
        Object objU = h531Var.a;
        int i2 = h531Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objU);
                xyc0 xyc0Var = this.d;
                ddd1 ddd1Var = ddd1.f1;
                h531Var.c = 1;
                objU = xyc0Var.u(str, ddd1Var, h531Var);
                d9n d9nVar = d9n.a;
                if (objU == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objU);
            }
            ly21 ly21Var = (py21) objU;
            if (ly21Var instanceof ly21) {
                Logger.d("Failed to sync playlist after game completion: " + ly21Var.a, new Object[0]);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to sync playlist after game completion", new Object[0]);
        }
        return rih1.a;
    }
}
