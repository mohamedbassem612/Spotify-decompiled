package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c591 implements xpw {
    public final pp11 a;
    public final xeu b;
    public final PlayOrigin c;
    public final d0r d;
    public final x8c0 e;
    public final idd1 f = new idd1(new fe81(this, (byte) 11));
    public final ljm0 g = h7w.B(er81.Y, (o8n) null, (iu30) null, new cq61(this, (byte) 16), 6);
    public final ia00 h = n3o1.q(this).a(c781.W0, c781.X0);
    public final psw i;

    public c591(pp11 pp11Var, xeu xeuVar, PlayOrigin playOrigin, d0r d0rVar, x8c0 x8c0Var) {
        this.a = pp11Var;
        this.b = xeuVar;
        this.c = playOrigin;
        this.d = d0rVar;
        this.e = x8c0Var;
        j2i j2iVar = hij.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(z491 z491Var, String str, onm onmVar) {
        b591 b591Var;
        if (onmVar instanceof b591) {
            b591Var = (b591) onmVar;
            int i = b591Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b591Var.c = i - Integer.MIN_VALUE;
            } else {
                b591Var = new b591(this, onmVar);
            }
        } else {
            b591Var = new b591(this, onmVar);
        }
        b591 b591Var2 = b591Var;
        Object obj = b591Var2.a;
        int i2 = b591Var2.c;
        if (i2 == 0) {
            hm5.M(obj);
            bq11 bq11Var = (bq11) this.f.getValue();
            String str2 = z491Var.a;
            String str3 = z491Var.b;
            b591Var2.c = 1;
            d9n d9nVarC = bq11.c(bq11Var, str2, str3, z6x.a, str, (Long) null, (wp11) null, false, b591Var2, 240);
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
        return this.g;
    }
}
