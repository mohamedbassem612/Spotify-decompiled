package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z701 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z701(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Number number = (Number) obj;
        switch (b) {
            case 0:
                int iIntValue = number.intValue();
                z701 z701Var = new z701(i, (lnm) obj3, (byte) 0);
                z701Var.b = iIntValue;
                z701Var.c = (List) obj2;
                return z701Var.invokeSuspend(rih1Var);
            default:
                int iIntValue2 = number.intValue();
                z701 z701Var2 = new z701(i, (lnm) obj3, (byte) 1);
                z701Var2.b = iIntValue2;
                z701Var2.c = (List) obj2;
                return z701Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.b;
                List list = this.c;
                hm5.M(obj);
                return new Integer(hxo1.o(list, i, y701.b));
            default:
                int i2 = this.b;
                List list2 = this.c;
                hm5.M(obj);
                return list2.get(i2);
        }
    }
}
