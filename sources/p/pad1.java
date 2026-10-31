package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pad1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pad1(ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                return new pad1(ven0Var, lnmVar, (byte) 0);
            case 1:
                return new pad1(ven0Var, lnmVar, (byte) 1);
            case 2:
                return new pad1(ven0Var, lnmVar, (byte) 2);
            case 3:
                return new pad1(ven0Var, lnmVar, (byte) 3);
            case 4:
                return new pad1(ven0Var, lnmVar, (byte) 4);
            case 5:
                return new pad1(ven0Var, lnmVar, (byte) 5);
            case 6:
                return new pad1(ven0Var, lnmVar, (byte) 6);
            case 7:
                return new pad1(ven0Var, lnmVar, (byte) 7);
            case 8:
                return new pad1(ven0Var, lnmVar, (byte) 8);
            case 9:
                return new pad1(ven0Var, lnmVar, (byte) 9);
            case 10:
                return new pad1(ven0Var, lnmVar, (byte) 10);
            case 11:
                return new pad1(ven0Var, lnmVar, (byte) 11);
            default:
                return new pad1(ven0Var, lnmVar, (byte) 12);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 5:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 6:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 7:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 8:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 9:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 10:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 11:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ven0Var.setValue(nad1.a((nad1) ven0Var.getValue(), false, true, 23));
                break;
            case 1:
                hm5.M(obj);
                ven0Var.setValue(nad1.a((nad1) ven0Var.getValue(), false, false, 31));
                break;
            case 2:
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                break;
            case 3:
                hm5.M(obj);
                ven0Var.setValue((Object) null);
                break;
            case 4:
                hm5.M(obj);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 5:
                hm5.M(obj);
                faa0 faa0Var = (faa0) ven0Var.getValue();
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                break;
            case 6:
                hm5.M(obj);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 7:
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                break;
            case 8:
                hm5.M(obj);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 9:
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                break;
            case 10:
                hm5.M(obj);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 11:
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                break;
            default:
                hm5.M(obj);
                bpb1 bpb1Var = cem1.i;
                pzm.k(0.0f, ven0Var);
                break;
        }
        return rih1Var;
    }
}
