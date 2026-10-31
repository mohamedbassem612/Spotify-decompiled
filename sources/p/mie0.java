package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mie0 {
    public final qrt a;
    public final vfl b;
    public final zhe0 c;
    public final gtt d;
    public final kst e;
    public final a1r0 f;
    public final ags0 g;
    public final u6y0 h;
    public final q8n i;

    public mie0(qrt qrtVar, vfl vflVar, zhe0 zhe0Var, gtt gttVar, kst kstVar, a1r0 a1r0Var, ags0 ags0Var, u6y0 u6y0Var, q8n q8nVar) {
        this.a = qrtVar;
        this.b = vflVar;
        this.c = zhe0Var;
        this.d = gttVar;
        this.e = kstVar;
        this.f = a1r0Var;
        this.g = ags0Var;
        this.h = u6y0Var;
        this.i = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(bst bstVar, lnm lnmVar) {
        jie0 jie0Var;
        dt71 dt71Var = this.e.a;
        if (lnmVar instanceof jie0) {
            jie0Var = (jie0) lnmVar;
            int i = jie0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jie0Var.c = i - Integer.MIN_VALUE;
            } else {
                jie0Var = new jie0(this, lnmVar);
            }
        } else {
            jie0Var = new jie0(this, lnmVar);
        }
        Object obj = jie0Var.a;
        int i2 = jie0Var.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            Bundle bundle = new Bundle();
            bundle.putParcelable("device_location_permission_page_input", new ast(bstVar, (n27) null, 14));
            dt71Var.d();
            e9c0 e9c0Var = new e9c0(this, bundle, (lnm) null, (byte) 15);
            jie0Var.c = 1;
            if (fn31.Y(this.i, e9c0Var, jie0Var) != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ve01 ve01VarG = d5p1.g(dt71Var);
        jie0Var.c = 2;
        Object objI = b5p1.i(ve01VarG, jie0Var);
        return objI == d9nVar ? d9nVar : objI;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(boolean z, String str, h3y0 h3y0Var, onm onmVar) {
        kie0 kie0Var;
        h3y0 h3y0Var2;
        String str2;
        boolean z2 = z;
        if (onmVar instanceof kie0) {
            kie0Var = (kie0) onmVar;
            int i = kie0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kie0Var.f = i - Integer.MIN_VALUE;
            } else {
                kie0Var = new kie0(this, onmVar);
            }
        } else {
            kie0Var = new kie0(this, onmVar);
        }
        kie0 kie0Var2 = kie0Var;
        Object obj = kie0Var2.d;
        int i2 = kie0Var2.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (z2) {
                c4z c4zVar = new c4z(2, this, mie0.class, "presentPermissionPage", "presentPermissionPage(Lcom/spotify/devicelocation/permissionpageapi/DeviceLocationPermissionPageMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25);
                kie0Var2.b = str;
                kie0Var2.c = h3y0Var;
                kie0Var2.a = z2;
                kie0Var2.f = 1;
                Object objA = this.c.a("p2p_load", c4zVar, kie0Var2);
                if (objA != d9nVar) {
                    h3y0Var2 = h3y0Var;
                    str2 = str;
                    obj = objA;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z3 = kie0Var2.a;
        h3y0 h3y0Var3 = kie0Var2.c;
        String str3 = kie0Var2.b;
        hm5.M(obj);
        h3y0Var2 = h3y0Var3;
        str2 = str3;
        z2 = z3;
        geo0 geo0Var = geo0.b;
        og5 og5Var = new og5((fie0) obj, this, str2, h3y0Var2, (lnm) null, (byte) 24, false);
        kie0Var2.b = null;
        kie0Var2.c = null;
        kie0Var2.a = z2;
        kie0Var2.f = 2;
        return fn31.Y(geo0Var, og5Var, kie0Var2) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        lie0 lie0Var;
        Object objA;
        if (onmVar instanceof lie0) {
            lie0Var = (lie0) onmVar;
            int i = lie0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lie0Var.c = i - Integer.MIN_VALUE;
            } else {
                lie0Var = new lie0(this, onmVar);
            }
        } else {
            lie0Var = new lie0(this, onmVar);
        }
        Object obj = lie0Var.a;
        int i2 = lie0Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.a.b()) {
                lie0Var.c = 1;
                objA = this.b.a("unspecified", lie0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        objA = ((e331) obj).a;
        if ((objA instanceof m231 ? null : objA) == cgl.c) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
