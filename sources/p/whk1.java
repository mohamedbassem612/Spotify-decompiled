package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class whk1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whk1(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new whk1(2, lnmVar, (byte) 0);
            case 1:
                return new whk1(2, lnmVar, (byte) 1);
            case 2:
                return new whk1(2, lnmVar, (byte) 2);
            case 3:
                return new whk1(2, lnmVar, (byte) 3);
            case 4:
                return new whk1(2, lnmVar, (byte) 4);
            default:
                return new whk1(2, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((whk1) create((op80) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                ((whk1) create((String) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                ((whk1) create((String) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                ((whk1) create((String) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                ((whk1) create((String) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                Offset offset = (Offset) obj;
                long j = offset.a;
                return ((whk1) create(offset, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                return rih1Var;
            case 1:
                hm5.M(obj);
                return rih1Var;
            case 2:
                hm5.M(obj);
                return rih1Var;
            case 3:
                hm5.M(obj);
                return rih1Var;
            case 4:
                hm5.M(obj);
                return rih1Var;
            default:
                hm5.M(obj);
                return new Offset(0L);
        }
    }
}
