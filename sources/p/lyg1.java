package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lyg1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lyg1(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new lyg1((zyg1) obj, lnmVar, (byte) 0);
            default:
                return new lyg1((wen0) obj, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                return create(lnmVar).invokeSuspend(rih1Var);
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Collections.singletonList(new bk41("twinSearchLayer", Collections.singletonList((zyg1) obj2)));
            default:
                hm5.M(obj);
                Boolean bool = Boolean.TRUE;
                bpb1 bpb1Var = (wen0) obj2;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                return rih1.a;
        }
    }
}
