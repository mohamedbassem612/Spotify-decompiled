package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tvu0 implements xpw {
    public final String a;
    public final String b;
    public final idd1 c = new idd1(new kks0(this, (byte) 25));
    public final rzq d;
    public final o3r e;
    public final o3r f;
    public final o3r g;
    public final js20 h;
    public final u7h1 i;
    public final psw t;

    /* JADX WARN: Multi-variable type inference failed */
    public tvu0(String str, String str2, kxc0 kxc0Var, lvc0 lvc0Var, dv00 dv00Var) {
        this.a = str;
        this.b = str2;
        j3r j3rVar = rzq.y;
        bdc1 bdc1Var = bdc1.a;
        this.d = l2p1.f(new w1k(new l2r[]{kxc0Var.a(bdc1Var), lvc0Var.a(bdc1Var), dv00Var}));
        pwc0 pwc0Var = pwc0.b;
        l4r l4rVar = new l4r(pwc0Var, 2, svu0.b, new j4r(svu0.X), svu0.c);
        jd11 jd11Var = rc11.a;
        this.e = w3p1.m(l4rVar, new l4r(new xv00(jd11Var.b(z1g1.class)), 2, svu0.d, new j4r(svu0.Y), svu0.e), new l4r(hvm.c, 2, svu0.f, new j4r(svu0.Z), svu0.g), mgn0.R0);
        this.f = w3p1.o(new l4r(pwc0Var, 2, svu0.h, new j4r(lqu0.b1), svu0.i), lqu0.c1);
        this.g = w3p1.o(new l4r(new xv00(jd11Var.b(zei1.class)), 2, svu0.t, new j4r(svu0.N0), lqu0.e1), svu0.O0);
        this.h = x3p1.n(new pvu0(this, (byte) 0), new pvu0(this, (byte) 1), new qvu0(this, (byte) 0), (o8n) null, lqu0.a1, 8);
        this.i = new u7h1(new qvu0(this, (byte) 1), new dvt0(this, (byte) 3));
        j2i j2iVar = u8j.a;
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final qv21 e(zvz0 zvz0Var, dvu0 dvu0Var, String str) {
        z1g1 z1g1Var;
        Object next;
        String str2 = null;
        if (zvz0Var == null || (z1g1Var = zvz0Var.c) == null) {
            return new qv21(zvz0Var != null ? zvz0Var.a : null, zvz0Var != null ? zvz0Var.b : null, null);
        }
        List list = zvz0Var.d;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((pvc0) next).c, dvu0Var.a.d()));
            pvc0 pvc0Var = (pvc0) next;
            if (pvc0Var != null) {
                str2 = pvc0Var.d;
            }
        }
        String str3 = zvz0Var.a;
        String str4 = zvz0Var.b;
        String str5 = z1g1Var.b;
        String strY0 = o7h.y0(z1g1Var.g, ", ", (String) null, (String) null, lqu0.d1, 30);
        String strA = z1g1Var.c.a(zdn.a);
        gvu0 evu0Var = fvu0.a;
        if (str2 != null) {
            String strX0 = ihc1.X0(str2, ":");
            if (!strX0.equals(this.a)) {
                if (str == null) {
                    str = strX0;
                }
                evu0Var = new evu0(str);
            }
        }
        return new qv21(str3, str4, new hvu0(str5, strY0, strA, evu0Var));
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
