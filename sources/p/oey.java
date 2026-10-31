package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oey {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ oey(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    public final Object a(String str, z771 z771Var, exy exyVar, il71 il71Var, lnm lnmVar) {
        akf1 akf1Var;
        il71 il71Var2;
        exy exyVar2;
        Object obj;
        String str2;
        z771 z771Var2;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return smo1.s(new el0(exyVar, this, str, z771Var, il71Var, (lnm) null, (byte) 29), lnmVar);
            case 1:
                tq71 tq71Var = (tq71) obj2;
                int i = exyVar.c;
                int i2 = i == 0 ? -1 : ztu0.a[l1d.C(i)];
                if (i2 == 1) {
                    return tq71Var.c(str, z771Var, exyVar, il71Var, (onm) lnmVar);
                }
                if (i2 == 2 || i2 == 3) {
                    return tq71Var.b(str, z771Var, exyVar, il71Var, (onm) lnmVar);
                }
                return i2 != 4 ? tq71Var.d(str, z771Var, exyVar, null, il71Var, (onm) lnmVar) : tq71Var.d(str, z771Var, exyVar, null, il71Var, (onm) lnmVar);
            case 2:
                tq71 tq71Var2 = (tq71) obj2;
                if (lnmVar instanceof akf1) {
                    akf1Var = (akf1) lnmVar;
                    int i3 = akf1Var.g;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        akf1Var.g = i3 - Integer.MIN_VALUE;
                    } else {
                        akf1Var = new akf1(this, (onm) lnmVar);
                    }
                } else {
                    akf1Var = new akf1(this, (onm) lnmVar);
                }
                akf1 akf1Var2 = akf1Var;
                Object obj3 = akf1Var2.e;
                int i4 = akf1Var2.g;
                d9n d9nVar = d9n.a;
                if (i4 == 0) {
                    hm5.M(obj3);
                    akf1Var2.a = str;
                    akf1Var2.b = z771Var;
                    akf1Var2.c = exyVar;
                    akf1Var2.d = il71Var;
                    akf1Var2.g = 1;
                    String str3 = exyVar.a;
                    if (str3 == null) {
                        str3 = str;
                    }
                    sq71 sq71Var = new sq71(il71Var, exyVar, tq71Var2, str3, z771Var, null);
                    tq71Var2 = tq71Var2;
                    Object objS = smo1.s(sq71Var, akf1Var2);
                    if (objS != d9nVar) {
                        il71Var2 = il71Var;
                        exyVar2 = exyVar;
                        obj = objS;
                        str2 = str;
                        z771Var2 = z771Var;
                    }
                    return d9nVar;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        hm5.M(obj3);
                        return obj3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il71 il71Var3 = akf1Var2.d;
                exyVar2 = akf1Var2.c;
                z771 z771Var3 = akf1Var2.b;
                String str4 = akf1Var2.a;
                hm5.M(obj3);
                il71Var2 = il71Var3;
                str2 = str4;
                obj = obj3;
                z771Var2 = z771Var3;
                zd71 zd71Var = (zd71) obj;
                if (zd71Var != null) {
                    return zd71Var;
                }
                akf1Var2.a = null;
                akf1Var2.b = null;
                akf1Var2.c = null;
                akf1Var2.d = null;
                akf1Var2.g = 2;
                Object objD = tq71Var2.d(str2, z771Var2, exyVar2, null, il71Var2, akf1Var2);
                if (objD != d9nVar) {
                    return objD;
                }
                return d9nVar;
            default:
                for (mmr0 mmr0Var : (List) obj2) {
                    if (((yjd) mmr0Var.a).a(str)) {
                        return ((oey) mmr0Var.b).a(str, z771Var, exyVar, il71Var, lnmVar);
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
        }
    }
}
