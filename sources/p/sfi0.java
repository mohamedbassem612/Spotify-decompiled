package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sfi0 extends hab0 implements xu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ira f;
    public final /* synthetic */ yae1 g;
    public final /* synthetic */ lee1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfi0(String str, String str2, ArrayList arrayList, long j, long j2, ira iraVar, yae1 yae1Var, lee1 lee1Var) {
        super(3);
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
        this.f = iraVar;
        this.g = yae1Var;
        this.h = lee1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int length;
        vpc1 vpc1Var;
        vpc1 vpc1Var2;
        af5 af5VarM;
        ((Number) obj3).intValue();
        int i = hjl.i(((i2c) obj).b);
        String str = this.a;
        String str2 = this.b;
        ArrayList arrayList = this.c;
        long j = this.d;
        long j2 = this.e;
        ira iraVar = this.f;
        pzg1 pzg1Var = new pzg1(str, str2, arrayList, j, j2, iraVar);
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(pzg1Var);
        yae1 yae1Var = this.g;
        boolean zG2 = zG | x340Var.g(yae1Var);
        lee1 lee1Var = this.h;
        boolean zG3 = zG2 | x340Var.g(lee1Var) | x340Var.e(i);
        Object objT = x340Var.T();
        if (zG3 || objT == fkj0.X) {
            if (str2.length() > 0) {
                length = str2.length() + fqo1.F(str, iraVar).length() + 3;
            } else {
                length = 0;
            }
            znb0 znb0VarS = dm5.S(3, new dvg0(yae1Var, lee1Var, (byte) 6));
            y9e1[] y9e1VarArr = new y9e1[arrayList.size() + 1];
            int size = arrayList.size();
            x6v x6vVar = new x6v(length, i, y9e1VarArr, yae1Var, lee1Var, pzg1Var, znb0VarS);
            while (true) {
                vpc1Var = wpc1.a;
                if (-1 >= size) {
                    vpc1Var2 = vpc1Var;
                    break;
                }
                if (((Boolean) x6vVar.invoke(Integer.valueOf(size))).booleanValue()) {
                    vpc1Var2 = new vpc1(size);
                    break;
                }
                size--;
            }
            if (vpc1Var2 instanceof vpc1) {
                af5VarM = fqo1.H(y9e1VarArr, yae1Var, lee1Var, i, pzg1Var, vpc1Var2.a).a.a;
            } else {
                if (!vpc1Var2.equals(vpc1Var)) {
                    eg.o();
                    return null;
                }
                int length2 = str.length();
                wfi0 wfi0Var = new wfi0(yae1Var, lee1Var, i, pzg1Var);
                int i2 = length2 - 1;
                int i3 = length2;
                int i4 = 1;
                while (i2 > 0 && !((Boolean) wfi0Var.invoke(Integer.valueOf(i2))).booleanValue()) {
                    i4 *= 2;
                    i3 = i2;
                    i2 = length2 - i4;
                }
                int i5 = i2 >= 0 ? i2 : 0;
                while (true) {
                    int i6 = i3 - i5;
                    if (i6 <= 1) {
                        break;
                    }
                    int i7 = (i6 / 2) + i5;
                    if (((Boolean) wfi0Var.invoke(Integer.valueOf(i7))).booleanValue()) {
                        i5 = i7;
                    } else {
                        i3 = i7;
                    }
                }
                af5VarM = fqo1.M(pzg1Var, i5);
            }
            objT = af5VarM;
            x340Var.s0(objT);
        }
        uwo1.d((af5) objT, this.e, (qim0) null, this.h, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 3764);
        return rih1.a;
    }
}
