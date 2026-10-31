package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oy7 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy7(wdm wdmVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = wdmVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        wdm wdmVar = this.b;
        switch (b) {
            case 0:
                return new oy7(wdmVar, lnmVar, (byte) 0);
            default:
                return new oy7(wdmVar, lnmVar, (byte) 1);
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r091 r091Var = null;
        wdm wdmVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                r091 r091Var2 = (r091) wdmVar.X;
                if (r091Var2 != null) {
                    r091Var2.j();
                }
                xab1 xab1Var = (xab1) wdmVar.Z;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                wdmVar.Z = null;
                return rih1Var;
            default:
                hm5.M(obj);
                if (!((t75) wdmVar.d).d()) {
                    r091 r091VarA = ((b9l1) wdmVar.b).a((r091) wdmVar.X);
                    if (r091VarA != null) {
                        lsm0 lsm0VarN = ebp1.n(r091VarA);
                        lsm0 lsm0Var = (lsm0) wdmVar.i;
                        if (lsm0Var == null) {
                            u890.C("multiplayerContent");
                            throw null;
                        }
                        if (!u890.j(lsm0VarN, lsm0Var)) {
                            lsm0 lsm0Var2 = (lsm0) wdmVar.i;
                            if (lsm0Var2 == null) {
                                u890.C("multiplayerContent");
                                throw null;
                            }
                            r091VarA.b(lsm0Var2);
                        }
                        r091Var = r091VarA;
                    }
                    wdmVar.X = r091Var;
                }
                return rih1Var;
        }
    }
}
