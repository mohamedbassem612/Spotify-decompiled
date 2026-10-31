package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hff1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Consumer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hff1(Consumer consumer, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = consumer;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Consumer consumer = this.c;
        switch (b) {
            case 0:
                hff1 hff1Var = new hff1(consumer, lnmVar, (byte) 0);
                hff1Var.b = obj;
                return hff1Var;
            default:
                hff1 hff1Var2 = new hff1(consumer, lnmVar, (byte) 1);
                hff1Var2.b = obj;
                return hff1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        srt0 srt0Var = (srt0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(srt0Var, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(srt0Var, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.c;
        srt0 srt0Var = (srt0) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                srt0Var.getClass();
                consumer.accept(new sff1(srt0Var));
                break;
            default:
                hm5.M(obj);
                srt0Var.getClass();
                consumer.accept(new zqf1(srt0Var));
                break;
        }
        return rih1Var;
    }
}
