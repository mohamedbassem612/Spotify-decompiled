package p;

import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m4i0 {
    public final sm51 a;
    public final jkp0 b;
    public final yqg c;
    public final ykf0 d;
    public final lag e;
    public long f;

    public m4i0(tbr0 tbr0Var, sm51 sm51Var, trp trpVar, jkp0 jkp0Var, yqg yqgVar, ykf0 ykf0Var, q8n q8nVar) {
        this.a = sm51Var;
        this.b = jkp0Var;
        this.c = yqgVar;
        this.d = ykf0Var;
        qq qqVar = (qq) trpVar.a.c;
        q8n q8nVar2 = (q8n) ((y6i0) qqVar.a).i.get();
        c8o.l(q8nVar2);
        u3i0 u3i0Var = (u3i0) ((jly0) qqVar.f).get();
        f7i0 f7i0Var = (f7i0) ((y6i0) qqVar.a).a.get();
        c8o.l(f7i0Var);
        this.e = new lag(tbr0Var, q8nVar2, u3i0Var, f7i0Var, (byte) 8);
        this.f = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        a4i0 a4i0Var;
        if (onmVar instanceof a4i0) {
            a4i0Var = (a4i0) onmVar;
            int i = a4i0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a4i0Var.c = i - Integer.MIN_VALUE;
            } else {
                a4i0Var = new a4i0(this, onmVar);
            }
        } else {
            a4i0Var = new a4i0(this, onmVar);
        }
        Object obj = a4i0Var.a;
        int i2 = a4i0Var.c;
        yqg yqgVar = this.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.f != -1) {
                long jB = yqgVar.b() - this.f;
                if (jB < 50) {
                    a4i0Var.c = 1;
                    Object objI = hap1.i(50 - jB, a4i0Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        this.f = yqgVar.b();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, onm onmVar) {
        l4i0 l4i0Var;
        if (onmVar instanceof l4i0) {
            l4i0Var = (l4i0) onmVar;
            int i = l4i0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4i0Var.d = i - Integer.MIN_VALUE;
            } else {
                l4i0Var = new l4i0(this, onmVar);
            }
        } else {
            l4i0Var = new l4i0(this, onmVar);
        }
        Object objJ = l4i0Var.b;
        int i2 = l4i0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                sm51 sm51Var = this.a;
                if (sm51Var == null) {
                    return new z4i0(null);
                }
                rm51 rm51VarA = sm51Var.a(640, j, 360);
                if (rm51VarA == null) {
                    return new z4i0(null);
                }
                ixg ixgVar = rm51VarA.b;
                ixgVar.g = false;
                Single singleI = ixgVar.i();
                l4i0Var.a = j;
                l4i0Var.d = 1;
                objJ = fc11.j(singleI, l4i0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = l4i0Var.a;
                hm5.M(objJ);
            }
            return new z4i0((Bitmap) objJ);
        } catch (Exception e) {
            Logger.e(e, l1d.l(j, "Failed to load drag preview frame at "), new Object[0]);
            return new z4i0(null);
        }
    }
}
