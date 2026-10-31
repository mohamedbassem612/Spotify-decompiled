package p;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h001 implements xpw {
    public final fqm N0;
    public final js20 O0 = x3p1.n(new f001(this, 0), new f001(this, 1), new ziz0((Object) this, (byte) 3), (o8n) null, new f001(this, 2), 8);
    public final ia00 P0 = n3o1.q(this).a(kxz0.f, new g001(this, (byte) 0));
    public final psw Q0;
    public final lik1 X;
    public final String Y;
    public final idm Z;
    public final Context a;
    public final lzn0 b;
    public final hyy0 c;
    public final kt91 d;
    public final z201 e;
    public final btf1 f;
    public final wml g;
    public final lgq h;
    public final mgq i;
    public final h4q t;

    public h001(Context context, lzn0 lzn0Var, hyy0 hyy0Var, kt91 kt91Var, z201 z201Var, btf1 btf1Var, wml wmlVar, ycm ycmVar, lgq lgqVar, mgq mgqVar, h4q h4qVar, lik1 lik1Var, String str) {
        this.a = context;
        this.b = lzn0Var;
        this.c = hyy0Var;
        this.d = kt91Var;
        this.e = z201Var;
        this.f = btf1Var;
        this.g = wmlVar;
        this.h = lgqVar;
        this.i = mgqVar;
        this.t = h4qVar;
        this.X = lik1Var;
        this.Y = str;
        this.Z = ycm.a(ycmVar);
        this.N0 = new fqm(lik1Var.a);
        j2i j2iVar = new j2i(-1400943275, new zyy0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.Q0 = new psw(j2iVar, (byte) 0);
    }

    public static String e(wzz0 wzz0Var) {
        Object next;
        String str;
        Iterator it = wzz0Var.i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((gxz0) next).c.a, wzz0Var.a.a));
        gxz0 gxz0Var = (gxz0) next;
        return (gxz0Var == null || (str = gxz0Var.b) == null) ? wzz0Var.h : str;
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.Q0;
    }

    public final mqw getBehavior() {
        return this.O0;
    }
}
