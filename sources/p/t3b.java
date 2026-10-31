package p;

import android.content.Context;
import android.view.View;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t3b implements hsw {
    public final Context a;
    public final String b;
    public final g4b c;
    public final uqv0 d;
    public final kly0 e;
    public final kt91 f;
    public final ic9 g;
    public final koc0 h;
    public final u9c0 i;
    public final idd1 j;
    public final mr20 k;
    public final yd91 l;

    public t3b(Context context, String str, g4b g4bVar, uqv0 uqv0Var, ewo ewoVar, kt91 kt91Var, ic9 ic9Var, koc0 koc0Var, iac0 iac0Var) {
        this.a = context;
        this.b = str;
        this.c = g4bVar;
        this.d = uqv0Var;
        this.e = ewoVar;
        this.f = kt91Var;
        this.g = ic9Var;
        this.h = koc0Var;
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        this.i = u9c0VarQ;
        fn31.T(u9c0VarQ, (o8n) null, 0, new n3b(this, null, (byte) 0), 3);
        this.j = new idd1(new q3b(this, (byte) 0));
        this.k = rqt0.u(new x72(((roc0) koc0Var).d(), (byte) 10));
        this.l = new yd91(3, new q3b(this, (byte) 2));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        if (f(r8, r0) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.onm r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t3b.e(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final Object f(iu30 iu30Var, onm onmVar) {
        s3b s3bVar;
        if (onmVar instanceof s3b) {
            s3bVar = (s3b) onmVar;
            int i = s3bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3bVar.c = i - Integer.MIN_VALUE;
            } else {
                s3bVar = new s3b(this, onmVar);
            }
        } else {
            s3bVar = new s3b(this, onmVar);
        }
        Object obj = s3bVar.a;
        int i2 = s3bVar.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                s3bVar.c = 1;
                Object objInvoke = iu30Var.invoke(s3bVar);
                d9n d9nVar = d9n.a;
                this = objInvoke;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            this.f.k(new er91((fs91) null, this.a.getString(2131952751), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.k;
    }
}
