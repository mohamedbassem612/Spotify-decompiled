package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ht3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Consumer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht3(Consumer consumer, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = consumer;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Consumer consumer = this.c;
        switch (b) {
            case 0:
                return new ht3(consumer, lnmVar, (byte) 0);
            case 1:
                ht3 ht3Var = new ht3(consumer, lnmVar, (byte) 1);
                ht3Var.b = ((Boolean) obj).booleanValue();
                return ht3Var;
            default:
                ht3 ht3Var2 = new ht3(consumer, lnmVar, (byte) 2);
                ht3Var2.b = ((Boolean) obj).booleanValue();
                return ht3Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((ht3) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ht3) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((ht3) create(bool2, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI = hap1.i(250L, this);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                consumer.accept(zz41.a);
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                hm5.M(obj);
                consumer.accept(new nff1(z2));
                return rih1Var;
            default:
                boolean z3 = this.b;
                hm5.M(obj);
                consumer.accept(new off1(z3));
                return rih1Var;
        }
    }
}
