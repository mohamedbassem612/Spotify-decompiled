package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w1t extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ List b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1t(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        List list = (List) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                w1t w1tVar = new w1t(b2, (lnm) obj3, (byte) 0);
                w1tVar.b = list;
                w1tVar.c = zBooleanValue;
                return w1tVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                w1t w1tVar2 = new w1t(b2, (lnm) obj3, (byte) 1);
                w1tVar2.b = list;
                w1tVar2.c = zBooleanValue2;
                return w1tVar2.invokeSuspend(rih1Var);
            case 2:
                boolean zBooleanValue3 = bool.booleanValue();
                w1t w1tVar3 = new w1t(b2, (lnm) obj3, (byte) 2);
                w1tVar3.b = list;
                w1tVar3.c = zBooleanValue3;
                return w1tVar3.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue4 = bool.booleanValue();
                w1t w1tVar4 = new w1t(b2, (lnm) obj3, b2);
                w1tVar4.b = list;
                w1tVar4.c = zBooleanValue4;
                return w1tVar4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                List list = this.b;
                boolean z = this.c;
                hm5.M(obj);
                return new mmr0(list, Boolean.valueOf(z));
            case 1:
                List list2 = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                return new mmr0(list2, Boolean.valueOf(z2));
            case 2:
                List list3 = this.b;
                boolean z3 = this.c;
                hm5.M(obj);
                return new qzm(list3, z3);
            default:
                List list4 = this.b;
                boolean z4 = this.c;
                hm5.M(obj);
                return new aqx0(list4, z4);
        }
    }
}
