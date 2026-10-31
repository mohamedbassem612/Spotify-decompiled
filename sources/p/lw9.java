package p;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lw9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wen0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw9(wen0 wen0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wen0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                lw9 lw9Var = new lw9(this.c, lnmVar, (byte) 0);
                lw9Var.b = obj;
                return lw9Var;
            case 1:
                lw9 lw9Var2 = new lw9(this.c, lnmVar, (byte) 1);
                lw9Var2.b = obj;
                return lw9Var2;
            case 2:
                lw9 lw9Var3 = new lw9(this.c, lnmVar, (byte) 2);
                lw9Var3.b = obj;
                return lw9Var3;
            default:
                lw9 lw9Var4 = new lw9(this.c, lnmVar, (byte) 3);
                lw9Var4.b = obj;
                return lw9Var4;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                throw null;
            default:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        bpb1 bpb1Var;
        Object value;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var2 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj2;
                hm5.M(obj);
                String str = (String) mmr0Var.a;
                tw9 tw9Var = (tw9) mmr0Var.b;
                if (!(tw9Var instanceof tw9)) {
                    eg.o();
                    return null;
                }
                bpb1 bpb1Var3 = bpb1Var2;
                Map mapP = sqg0.P((Map) bpb1Var3.getValue(), new mmr0(str, new uw9(tw9Var.a, tw9Var.b)));
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, mapP);
                return rih1Var;
            case 1:
                String str2 = (String) obj2;
                hm5.M(obj);
                do {
                    bpb1Var = bpb1Var2;
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, str2));
                return rih1Var;
            case 2:
                mmr0 mmr0Var2 = (mmr0) obj2;
                hm5.M(obj);
                if (mmr0Var2.b == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            default:
                hm5.M(obj);
                zf90 zf90Var = (zf90) ((mmr0) obj2).b;
                if (zf90Var == null) {
                    eg.o();
                    return null;
                }
                Boolean boolValueOf = Boolean.valueOf(zf90Var.a);
                bpb1 bpb1Var4 = bpb1Var2;
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, boolValueOf);
                return rih1Var;
        }
    }
}
