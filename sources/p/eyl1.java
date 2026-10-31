package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eyl1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y4m1 b;
    public final /* synthetic */ f2g1 c;

    public /* synthetic */ eyl1(y4m1 y4m1Var, f2g1 f2g1Var, byte b) {
        this.a = b;
        this.b = y4m1Var;
        this.c = f2g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(vvg vvgVar, lnm lnmVar) {
        dyl1 dyl1Var;
        if (lnmVar instanceof dyl1) {
            dyl1Var = (dyl1) lnmVar;
            int i = dyl1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyl1Var.d = i - Integer.MIN_VALUE;
            } else {
                dyl1Var = new dyl1(this, lnmVar);
            }
        } else {
            dyl1Var = new dyl1(this, lnmVar);
        }
        Object obj = dyl1Var.b;
        int i2 = dyl1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    vvgVar = dyl1Var.a;
                    hm5.M(obj);
                } else {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
            }
            hm5.M(obj);
            y4m1 y4m1Var = this.b;
            boolean z = vvgVar.c;
            String str = vvgVar.b;
            dyl1Var.a = vvgVar;
            dyl1Var.d = 1;
            Object objH = c921.H(y4m1Var.b, new x4m1(y4m1Var, str, z, null, (byte) 0), dyl1Var);
            if (objH != d9nVar) {
                objH = rih1Var;
            }
            if (objH == d9nVar) {
            }
            f2g1 f2g1Var = this.c;
            Uri uri = vvgVar.a;
            dyl1Var.a = null;
            dyl1Var.d = 2;
            return f2g1Var.a(uri, dyl1Var) == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.e(th, "Failed to apply watch coaching toggle", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r7.a(r8, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.syl1 r8, p.lnm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.gyl1
            if (r0 == 0) goto L13
            r0 = r9
            p.gyl1 r0 = (p.gyl1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.gyl1 r0 = new p.gyl1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            goto L63
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            p.syl1 r8 = r0.a
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            goto L4b
        L37:
            p.hm5.M(r9)
            p.y4m1 r9 = r7.b     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            boolean r1 = r8.c     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            java.lang.String r6 = r8.b     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r0.a = r8     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r0.d = r4     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            java.lang.Object r9 = r9.e(r6, r0, r1)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            if (r9 != r5) goto L4b
            goto L59
        L4b:
            p.f2g1 r7 = r7.c     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            android.net.Uri r8 = r8.a     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r0.a = r2     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            r0.d = r3     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: java.lang.Throwable -> L5a java.util.concurrent.CancellationException -> L66
            if (r7 != r5) goto L63
        L59:
            return r5
        L5a:
            r7 = move-exception
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "Failed to apply watch workout-mode toggle"
            com.spotify.base.java.logging.Logger.e(r7, r9, r8)
        L63:
            p.rih1 r7 = p.rih1.a
            return r7
        L66:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eyl1.c(p.syl1, p.lnm):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return b((vvg) obj, lnmVar);
            default:
                return c((syl1) obj, lnmVar);
        }
    }
}
