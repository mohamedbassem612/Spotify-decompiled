package p;

import android.os.Build;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g0a0 implements owy0 {
    public final d520 a;
    public final wmy b;
    public final g2z c;
    public final dc31 d;
    public final xmu0 e;
    public final mvy0 f;
    public final tka0 g = rc11.a.b(vto0.class);

    public g0a0(d520 d520Var, wmy wmyVar, g2z g2zVar, dc31 dc31Var, xmu0 xmu0Var, mvy0 mvy0Var) {
        this.a = d520Var;
        this.b = wmyVar;
        this.c = g2zVar;
        this.d = dc31Var;
        this.e = xmu0Var;
        this.f = mvy0Var;
    }

    @Override // p.owy0
    public final tka0 a() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, String str2, onm onmVar) {
        d0a0 d0a0Var;
        if (onmVar instanceof d0a0) {
            d0a0Var = (d0a0) onmVar;
            int i = d0a0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0a0Var.e = i - Integer.MIN_VALUE;
            } else {
                d0a0Var = new d0a0(this, onmVar);
            }
        } else {
            d0a0Var = new d0a0(this, onmVar);
        }
        Object objD = d0a0Var.c;
        int i2 = d0a0Var.e;
        if (i2 == 0) {
            hm5.M(objD);
            if (Build.VERSION.SDK_INT >= 31) {
                d0a0Var.a = str;
                d0a0Var.b = str2;
                d0a0Var.e = 1;
                objD = this.e.d(str, d0a0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = d0a0Var.b;
        str = d0a0Var.a;
        hm5.M(objD);
        String str3 = str;
        String str4 = str2;
        if (((Boolean) objD).booleanValue()) {
            return new fe6(this, str4, str3, (lnm) null, (byte) 9);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x013f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0150  */
    /* JADX WARN: Code duplicated, block: B:37:0x0167  */
    /* JADX WARN: Code duplicated, block: B:39:0x016a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0174  */
    /* JADX WARN: Code duplicated, block: B:43:0x0185  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01da  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x0208  */
    /* JADX WARN: Code duplicated, block: B:64:0x0226  */
    /* JADX WARN: Code duplicated, block: B:67:0x0230  */
    /* JADX WARN: Code duplicated, block: B:70:0x0252  */
    /* JADX WARN: Code duplicated, block: B:74:0x027b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0298  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x02fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x02fc A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02b6, code lost:
    
        if (p.qgo1.i("presenter_type", "simple", r2) == r11) goto L87;
     */
    @Override // p.owy0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.vto0 r28, p.onm r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g0a0.b(p.vto0, p.onm):java.lang.Object");
    }
}
