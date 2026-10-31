package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class npg extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ cxc0 b;
    public /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npg(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        cxc0 cxc0Var = (cxc0) obj;
        Set set = (Set) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                npg npgVar = new npg(b2, lnmVar, (byte) 0);
                npgVar.b = cxc0Var;
                npgVar.c = set;
                return npgVar.invokeSuspend(rih1Var);
            case 1:
                npg npgVar2 = new npg(b2, lnmVar, (byte) 1);
                npgVar2.b = cxc0Var;
                npgVar2.c = set;
                return npgVar2.invokeSuspend(rih1Var);
            case 2:
                npg npgVar3 = new npg(b2, lnmVar, (byte) 2);
                npgVar3.b = cxc0Var;
                npgVar3.c = set;
                return npgVar3.invokeSuspend(rih1Var);
            case 3:
                npg npgVar4 = new npg(b2, lnmVar, b2);
                npgVar4.b = cxc0Var;
                npgVar4.c = set;
                return npgVar4.invokeSuspend(rih1Var);
            case 4:
                npg npgVar5 = new npg(b2, lnmVar, (byte) 4);
                npgVar5.b = cxc0Var;
                npgVar5.c = set;
                return npgVar5.invokeSuspend(rih1Var);
            case 5:
                npg npgVar6 = new npg(b2, lnmVar, (byte) 5);
                npgVar6.b = cxc0Var;
                npgVar6.c = set;
                return npgVar6.invokeSuspend(rih1Var);
            default:
                npg npgVar7 = new npg(b2, lnmVar, (byte) 6);
                npgVar7.b = cxc0Var;
                npgVar7.c = set;
                return npgVar7.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                cxc0 cxc0Var = this.b;
                Set set = this.c;
                hm5.M(obj);
                if (cxc0Var.i && !s1p1.w(set)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                cxc0 cxc0Var2 = this.b;
                Set set2 = this.c;
                hm5.M(obj);
                if (cxc0Var2.i && !s1p1.w(set2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                cxc0 cxc0Var3 = this.b;
                Set set3 = this.c;
                hm5.M(obj);
                if (cxc0Var3.i && !s1p1.w(set3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                cxc0 cxc0Var4 = this.b;
                Set set4 = this.c;
                hm5.M(obj);
                if (cxc0Var4.i && !s1p1.w(set4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                cxc0 cxc0Var5 = this.b;
                Set set5 = this.c;
                hm5.M(obj);
                if (!cxc0Var5.a() && !cxc0Var5.f.w.b && !s1p1.w(set5)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                cxc0 cxc0Var6 = this.b;
                Set set6 = this.c;
                hm5.M(obj);
                if (cxc0Var6.i && !s1p1.w(set6)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                cxc0 cxc0Var7 = this.b;
                Set set7 = this.c;
                hm5.M(obj);
                if (cxc0Var7.i && s1p1.w(set7)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
