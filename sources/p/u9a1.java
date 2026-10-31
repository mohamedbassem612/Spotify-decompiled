package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u9a1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9a1(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                new u9a1(b2, (lnm) obj3, (byte) 0).invokeSuspend(rih1Var);
                break;
            case 1:
                new u9a1(b2, (lnm) obj3, (byte) 1).invokeSuspend(rih1Var);
                break;
            case 2:
                new u9a1(b2, (lnm) obj3, (byte) 2).invokeSuspend(rih1Var);
                break;
            case 3:
                new u9a1(b2, (lnm) obj3, b2).invokeSuspend(rih1Var);
                break;
            case 4:
                long j = ((Offset) obj2).a;
                new u9a1(b2, (lnm) obj3, (byte) 4).invokeSuspend(rih1Var);
                break;
            case 5:
                new u9a1(b2, (lnm) obj3, (byte) 5).invokeSuspend(rih1Var);
                break;
            case 6:
                new u9a1(b2, (lnm) obj3, (byte) 6).invokeSuspend(rih1Var);
                break;
            case 7:
                new u9a1(b2, (lnm) obj3, (byte) 7).invokeSuspend(rih1Var);
                break;
            default:
                new u9a1(b2, (lnm) obj3, (byte) 8).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                break;
            case 1:
                hm5.M(obj);
                break;
            case 2:
                hm5.M(obj);
                break;
            case 3:
                hm5.M(obj);
                break;
            case 4:
                hm5.M(obj);
                break;
            case 5:
                hm5.M(obj);
                break;
            case 6:
                hm5.M(obj);
                break;
            case 7:
                hm5.M(obj);
                break;
            default:
                hm5.M(obj);
                break;
        }
        return rih1Var;
    }
}
