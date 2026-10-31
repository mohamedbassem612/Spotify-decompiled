package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xc01 extends a8d1 implements vu30 {
    public final /* synthetic */ utw0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc01(utw0 utw0Var, String str, lee1 lee1Var, int i, int i2, int i3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = utw0Var;
        this.b = str;
        this.c = lee1Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new xc01(this.a, this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int length;
        xc01 xc01Var = this;
        hm5.M(obj);
        String str = xc01Var.b;
        if (str.length() == 0 || (i = xc01Var.d) <= 0 || (i2 = xc01Var.e) <= 0) {
            return z6x.a;
        }
        lee1 lee1Var = xc01Var.c;
        af5 af5VarK = zc01.k(str, lee1Var, xc01Var.f);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < str.length()) {
            af5 af5VarF = af5VarK.f(i4, str.length());
            String str2 = af5VarF.b;
            long jB = jjl.b(i3, i, i3, Integer.MAX_VALUE, 5);
            utw0 utw0Var = xc01Var.a;
            af5 af5Var = af5VarK;
            int i5 = i3;
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            af5 af5Var2 = af5VarF;
            utw0 utw0Var2 = utw0Var;
            if (((int) (yae1.b((yae1) utw0Var.a, af5Var2, lee1Var, 0, false, 0, jB, (flb0) null, (wat) null, (f930) null, 1980).c & 4294967295L)) <= i2) {
                length = str2.length();
            } else {
                int length2 = str2.length();
                int i7 = i5;
                int i8 = i7;
                while (i7 <= length2) {
                    int i9 = (i7 + length2) / 2;
                    af5 af5Var3 = af5Var2;
                    utw0 utw0Var3 = utw0Var2;
                    int i10 = i7;
                    af5Var2 = af5Var3;
                    utw0Var2 = utw0Var3;
                    int i11 = length2;
                    if (((int) (yae1.b((yae1) utw0Var3.a, af5Var3.f(i5, i9), lee1Var, 0, false, 0, jB, (flb0) null, (wat) null, (f930) null, 1980).c & 4294967295L)) <= i2) {
                        i7 = i9 + 1;
                        i8 = i9;
                        length2 = i11;
                    } else {
                        length2 = i9 - 1;
                        i7 = i10;
                    }
                }
                if (i8 == 0) {
                    length = 1;
                } else {
                    int iA0 = ihc1.A0(str2, ' ', i8 - 1, 4);
                    length = iA0 > i8 / 2 ? iA0 + 1 : i8;
                }
            }
            if (length == 0) {
                return arrayList2;
            }
            i4 = i6 + length;
            arrayList = arrayList2;
            arrayList.add(str.substring(i6, i4));
            i3 = i5;
            af5VarK = af5Var;
            xc01Var = this;
        }
        return arrayList;
    }
}
