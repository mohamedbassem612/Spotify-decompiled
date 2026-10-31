package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zf21 implements xpw {
    public final pp11 a;
    public final xeu b;
    public final PlayOrigin c;
    public final d0r d;
    public final boolean e;
    public final x8c0 f;
    public final idd1 g = new idd1(new g521(this, 6));
    public final ljm0 h = h7w.D(ma21.S0, (bs50) null, ma21.U0, new j2i(-2092551150, new wcy0(this, (byte) 4), true), 2);
    public final ia00 i = n3o1.q(this).a(ve21.d, ve21.e);
    public final psw t;

    public zf21(pp11 pp11Var, xeu xeuVar, PlayOrigin playOrigin, d0r d0rVar, boolean z, x8c0 x8c0Var) {
        this.a = pp11Var;
        this.b = xeuVar;
        this.c = playOrigin;
        this.d = d0rVar;
        this.e = z;
        this.f = x8c0Var;
        j2i j2iVar = new j2i(1953442554, new dr01(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(wf21 wf21Var, String str, onm onmVar) {
        yf21 yf21Var;
        if (onmVar instanceof yf21) {
            yf21Var = (yf21) onmVar;
            int i = yf21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf21Var.c = i - Integer.MIN_VALUE;
            } else {
                yf21Var = new yf21(this, onmVar);
            }
        } else {
            yf21Var = new yf21(this, onmVar);
        }
        yf21 yf21Var2 = yf21Var;
        Object obj = yf21Var2.a;
        int i2 = yf21Var2.c;
        if (i2 == 0) {
            hm5.M(obj);
            bq11 bq11Var = (bq11) this.g.getValue();
            String str2 = wf21Var.a;
            String str3 = wf21Var.b;
            yf21Var2.c = 1;
            d9n d9nVarC = bq11.c(bq11Var, str2, str3, z6x.a, str, (Long) null, (wp11) null, false, yf21Var2, 240);
            d9n d9nVar = d9n.a;
            if (d9nVarC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            Object obj2 = ((e331) obj).a;
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
