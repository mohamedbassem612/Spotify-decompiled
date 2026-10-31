package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kag {
    public final qrt a;
    public final vfl b;
    public final zhe0 c;
    public final gtt d;
    public final kst e;
    public final a1r0 f;
    public final q8n g;

    public kag(qrt qrtVar, vfl vflVar, zhe0 zhe0Var, gtt gttVar, kst kstVar, a1r0 a1r0Var, q8n q8nVar) {
        this.a = qrtVar;
        this.b = vflVar;
        this.c = zhe0Var;
        this.d = gttVar;
        this.e = kstVar;
        this.f = a1r0Var;
        this.g = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        hag hagVar;
        Object objA;
        if (onmVar instanceof hag) {
            hagVar = (hag) onmVar;
            int i = hagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hagVar.c = i - Integer.MIN_VALUE;
            } else {
                hagVar = new hag(this, onmVar);
            }
        } else {
            hagVar = new hag(this, onmVar);
        }
        Object obj = hagVar.a;
        int i2 = hagVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.a.b()) {
                hagVar.c = 1;
                objA = this.b.a("genui_bridge", hagVar);
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
        boolean z = (objA instanceof m231 ? null : objA) == cgl.c;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(bst bstVar, lnm lnmVar) {
        iag iagVar;
        dt71 dt71Var = this.e.a;
        if (lnmVar instanceof iag) {
            iagVar = (iag) lnmVar;
            int i = iagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iagVar.c = i - Integer.MIN_VALUE;
            } else {
                iagVar = new iag(this, lnmVar);
            }
        } else {
            iagVar = new iag(this, lnmVar);
        }
        Object obj = iagVar.a;
        int i2 = iagVar.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            Bundle bundle = new Bundle();
            bundle.putParcelable("device_location_permission_page_input", new ast(bstVar, null, 14));
            dt71Var.d();
            pid pidVar = new pid(this, bundle, (lnm) null, (byte) 13);
            iagVar.c = 1;
            if (fn31.Y(this.g, pidVar, iagVar) != d9nVar) {
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
        iagVar.c = 2;
        Object objI = b5p1.i(ve01VarG, iagVar);
        return objI == d9nVar ? d9nVar : objI;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(onm onmVar) {
        jag jagVar;
        Object objA;
        if (onmVar instanceof jag) {
            jagVar = (jag) onmVar;
            int i = jagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jagVar.c = i - Integer.MIN_VALUE;
            } else {
                jagVar = new jag(this, onmVar);
            }
        } else {
            jagVar = new jag(this, onmVar);
        }
        jag jagVar2 = jagVar;
        Object objA2 = jagVar2.a;
        int i2 = jagVar2.c;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA2);
            vu30 j1Var = new j1(2, this, kag.class, "presentPermissionPage", "presentPermissionPage(Lcom/spotify/devicelocation/permissionpageapi/DeviceLocationPermissionPageMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 16);
            jagVar2.c = 1;
            objA2 = this.c.a(null, j1Var, jagVar2);
            if (objA2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objA2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objA2);
                    return objA2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA2);
        }
        jagVar2.c = 3;
        objA = a(jagVar2);
        if (objA != obj) {
            return obj;
        }
        return objA;
        geo0 geo0Var = geo0.b;
        bag bagVar = new bag((fie0) objA2, this, (lnm) null, (byte) 1);
        jagVar2.c = 2;
        if (fn31.Y(geo0Var, bagVar, jagVar2) != obj) {
            jagVar2.c = 3;
            objA = a(jagVar2);
            if (objA != obj) {
                return objA;
            }
        }
        return obj;
    }
}
