package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zy91 {
    public final hp91 a;
    public final ahu0 b;
    public final s6z0 c;

    public zy91(hgx0 hgx0Var, hp91 hp91Var, ahu0 ahu0Var, s6z0 s6z0Var) {
        this.a = hp91Var;
        this.b = ahu0Var;
        this.c = s6z0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zim zimVar, onm onmVar) {
        yy91 yy91Var;
        String str;
        pnu0 pnu0Var;
        xim ximVar;
        if (onmVar instanceof yy91) {
            yy91Var = (yy91) onmVar;
            int i = yy91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yy91Var.e = i - Integer.MIN_VALUE;
            } else {
                yy91Var = new yy91(this, onmVar);
            }
        } else {
            yy91Var = new yy91(this, onmVar);
        }
        Object objK = yy91Var.c;
        int i2 = yy91Var.e;
        s6z0 s6z0Var = this.c;
        if (i2 == 0) {
            hm5.M(objK);
            if (s6z0Var != null) {
                bjm bjmVar = zimVar.a;
                String str2 = bjmVar.b;
                pnu0 pnu0Var2 = (str2 == null || new y6b1(str2, false).c != v6b1.O0 || (str = bjmVar.c) == null) ? null : new pnu0(str2, str);
                if (!this.b.c) {
                    pnu0Var2 = null;
                }
                if (pnu0Var2 != null) {
                    hp91 hp91Var = this.a;
                    jge jgeVarE = hu20.e((php0) ((sks0) hp91Var.c).b, new c6e0((lnm) null, pnu0Var2, hp91Var, (byte) 23));
                    yy91Var.a = zimVar;
                    yy91Var.b = pnu0Var2;
                    yy91Var.e = 1;
                    objK = b5p1.k(jgeVarE, yy91Var);
                    d9n d9nVar = d9n.a;
                    if (objK == d9nVar) {
                        return d9nVar;
                    }
                    pnu0Var = pnu0Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pnu0Var = yy91Var.b;
        zimVar = yy91Var.a;
        hm5.M(objK);
        iz91 iz91Var = (iz91) objK;
        if (iz91Var != null && !iz91Var.equals(hz91.a)) {
            if (iz91Var instanceof gz91) {
                gz91 gz91Var = (gz91) iz91Var;
                if (gz91Var.b) {
                    Function0 function0 = zimVar.b;
                    udq udqVar = (udq) s6z0Var.b;
                    String str3 = pnu0Var.a;
                    String str4 = pnu0Var.b;
                    teq teqVar = udqVar.a.d;
                    ximVar = new xim(new i161(str3, str4, function0, (vdq) teqVar.o2.get(), (xrc0) teqVar.e1.get(), new pvc((byte) 21, false)));
                } else {
                    ximVar = null;
                }
                ez91 ez91Var = gz91Var.c;
                if (!ez91Var.equals(cz91.a) && !ez91Var.equals(dz91.a) && !ez91Var.equals(bz91.a)) {
                    eg.o();
                    return null;
                }
                fz91 fz91Var = gz91Var.a;
                String str5 = fz91Var.a;
                String str6 = fz91Var.b;
                String str7 = fz91Var.c;
                Integer num = fz91Var.d;
                return new yim(ximVar, new wim(new vim(num != null ? z4p1.e(num.intValue()) : u7h.k, str5, str6, str7)));
            }
            eg.o();
        }
        return null;
    }
}
