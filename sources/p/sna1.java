package p;

import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sna1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vna1 c;
    public final /* synthetic */ CommandPlayRequest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sna1(vna1 vna1Var, CommandPlayRequest commandPlayRequest, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vna1Var;
        this.d = commandPlayRequest;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        CommandPlayRequest commandPlayRequest = this.d;
        vna1 vna1Var = this.c;
        switch (b) {
            case 0:
                return new sna1(vna1Var, commandPlayRequest, lnmVar, (byte) 0);
            default:
                return new sna1(vna1Var, commandPlayRequest, lnmVar, (byte) 1);
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
        CommandPlayRequest commandPlayRequest = this.d;
        vna1 vna1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single singleA = vna1Var.a.a(commandPlayRequest);
                this.b = true;
                Object objJ = fc11.j(singleA, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single singleA2 = vna1Var.a.a(commandPlayRequest);
                this.b = true;
                Object objJ2 = fc11.j(singleA2, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
        }
    }
}
