package p;

import android.content.Context;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class guz0 implements xpw {
    public final kdy0 a;
    public final t8r0 b;
    public final lzn0 c;
    public final kt91 d;
    public final Context e;
    public final uu00 f;
    public final zwz0 g;
    public final ljm0 h;
    public final wrm i;
    public final psw t;

    public guz0(kdy0 kdy0Var, t8r0 t8r0Var, lzn0 lzn0Var, kt91 kt91Var, Context context, uu00 uu00Var, zwz0 zwz0Var) {
        this.a = kdy0Var;
        this.b = t8r0Var;
        this.c = lzn0Var;
        this.d = kt91Var;
        this.e = context;
        this.f = uu00Var;
        this.g = zwz0Var;
        gkz0 gkz0Var = gkz0.t;
        fns fnsVar = igu.a;
        this.h = h7w.D(gkz0Var, pyf0.a.f, (iu30) null, new j2i(1932028631, new wcy0(this, (byte) 1), true), 4);
        this.i = new wrm((byte) 6);
        j2i j2iVar = ebj.a;
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable e(String str, onm onmVar) {
        euz0 euz0Var;
        String str2;
        mq70 mq70Var;
        if (onmVar instanceof euz0) {
            euz0Var = (euz0) onmVar;
            int i = euz0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                euz0Var.d = i - Integer.MIN_VALUE;
            } else {
                euz0Var = new euz0(this, onmVar);
            }
        } else {
            euz0Var = new euz0(this, onmVar);
        }
        Object objI = euz0Var.b;
        int i2 = euz0Var.d;
        Object obj = null;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarG = yoi1.g(this.f.b(new oi("ratings", false, new q4z0(str, (byte) 6))).filter(gex0.d));
            euz0Var.a = str;
            euz0Var.d = 1;
            objI = b5p1.i(ezcVarG, euz0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = euz0Var.a;
            hm5.M(objI);
        }
        uv00 uv00Var = (uv00) objI;
        xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
        List list = (xkk1Var == null || (mq70Var = xkk1Var.a) == null) ? null : mq70Var.a;
        if (list == null) {
            list = z6x.a;
        }
        for (Object obj2 : list) {
            if (((up70) obj2).b == vp70.c) {
                obj = obj2;
                break;
            }
        }
        up70 up70Var = (up70) obj;
        if (up70Var == null) {
            up70Var = (up70) o7h.s0(list);
        }
        if (up70Var == null || (str2 = up70Var.a.a) == null) {
            str2 = "";
        }
        v6v0 v6v0Var = uv00Var.a(v6v0.class, str).b;
        return new mmr0(str2, new Integer(v6v0Var != null ? v6v0Var.a.a : 0));
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
