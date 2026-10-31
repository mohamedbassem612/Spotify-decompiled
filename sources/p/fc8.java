package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fc8 implements yt11 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public fc8(lzn0 lzn0Var, vgm vgmVar, lik1 lik1Var) {
        this.b = lzn0Var;
        this.c = vgmVar;
        this.d = lik1Var;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        Object objA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                if (unb1Var instanceof jmb1) {
                    String str = ((jmb1) unb1Var).a.a;
                    lzn0 lzn0Var = (lzn0) this.b;
                    if (tv80Var != null) {
                        lzn0Var.a(str, tv80Var, (Bundle) null);
                    } else {
                        lzn0Var.h(str);
                    }
                }
                return rih1Var;
            default:
                tu11 tu11Var = (tu11) this.d;
                tu11Var.getClass();
                String strD = tu11.d(unb1Var);
                boolean zB = tu11Var.b();
                d9n d9nVar = d9n.a;
                if (!zB || strD == null) {
                    objA = ((yt11) this.c).a(unb1Var, tv80Var, onmVar);
                    if (objA != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    d0r d0rVar = tu11Var.a;
                    v061 v061Var = v061.a;
                    d0rVar.getClass();
                    objA = d0r.d(d0rVar, v061Var, strD, t061.a, onmVar);
                    if (objA != d9nVar) {
                        return rih1Var;
                    }
                }
                return objA;
        }
    }

    public final s9d1 b() {
        switch (this.a) {
            case 0:
                return null;
            default:
                return ((yt11) this.b).b();
        }
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        Object objC;
        byte b = this.a;
        Object obj = this.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if ((unb1Var instanceof jmb1) && tv80Var != null) {
                    ((vgm) obj2).d(((jmb1) unb1Var).a.a, ((lik1) obj).a, tv80Var, new tgm((String) null, false, false, false, false, false, true, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -129, 1));
                }
                return rih1Var;
            default:
                yt11 yt11Var = (yt11) obj2;
                tu11 tu11Var = (tu11) obj;
                tu11Var.getClass();
                d0r d0rVar = tu11Var.a;
                String strD = tu11.d(unb1Var);
                d9n d9nVar = d9n.a;
                if (strD == null || !tu11Var.c.e) {
                    objC = yt11Var.c(unb1Var, tv80Var, onmVar);
                    if (objC != d9nVar) {
                        return rih1Var;
                    }
                } else if (tu11Var.b()) {
                    v061 v061Var = v061.a;
                    d0rVar.getClass();
                    objC = d0r.d(d0rVar, v061Var, strD, t061.a, onmVar);
                    if (objC != d9nVar) {
                        return rih1Var;
                    }
                } else if (tu11Var.a()) {
                    gz51 gz51Var = (gz51) tu11Var.c(tu11Var.f, rih1Var);
                    if (gz51Var == null) {
                        gz51Var = gz51.c;
                    }
                    pwc0 pwc0Var = pwc0.D;
                    dz51 dz51Var = new dz51(new gz51(dm61.x0(strD, gz51Var.b), true));
                    d0rVar.getClass();
                    objC = d0r.d(d0rVar, pwc0Var, rih1Var, dz51Var, onmVar);
                    if (objC != d9nVar) {
                        objC = rih1Var;
                    }
                    if (objC != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    objC = yt11Var.c(unb1Var, tv80Var, onmVar);
                    if (objC != d9nVar) {
                        return rih1Var;
                    }
                }
                return objC;
        }
    }

    public fc8(yt11 yt11Var, tu11 tu11Var) {
        this.c = yt11Var;
        this.d = tu11Var;
        this.b = yt11Var;
    }
}
