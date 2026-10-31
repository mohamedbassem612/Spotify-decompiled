package p;

import com.spotify.kidsgraduation.v1.PostponeGraduationRequest;
import com.spotify.kidsgraduation.v1.RequestGraduationRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m850 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ f0b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m850(f0b0 f0b0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = f0b0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        f0b0 f0b0Var = this.c;
        switch (b) {
            case 0:
                return new m850(f0b0Var, lnmVar, (byte) 0);
            default:
                return new m850(f0b0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        f0b0 f0b0Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    ghv0 ghv0VarN = PostponeGraduationRequest.n();
                    ghv0VarN.n();
                    PostponeGraduationRequest postponeGraduationRequest = (PostponeGraduationRequest) ghv0VarN.build();
                    g0b0 g0b0Var = f0b0Var.a;
                    postponeGraduationRequest.getClass();
                    Object objD = g0b0Var.d(postponeGraduationRequest, this);
                    if (objD != d9nVar) {
                        objD = rih1Var;
                    }
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    uo21 uo21VarN = RequestGraduationRequest.n();
                    uo21VarN.n();
                    RequestGraduationRequest requestGraduationRequest = (RequestGraduationRequest) uo21VarN.build();
                    g0b0 g0b0Var2 = f0b0Var.a;
                    requestGraduationRequest.getClass();
                    Object objC = g0b0Var2.c(requestGraduationRequest, this);
                    if (objC != d9nVar) {
                        objC = rih1Var;
                    }
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
