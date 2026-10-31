package p;

import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.data.proto.v2.HighlightsListRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wb60 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xb60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb60(xb60 xb60Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xb60Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        xb60 xb60Var = this.c;
        switch (b) {
            case 0:
                return new wb60(xb60Var, lnmVar, (byte) 0);
            default:
                return new wb60(xb60Var, lnmVar, (byte) 1);
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
        xb60 xb60Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Single singleFirstOrError = xb60Var.f.a().firstOrError();
                    this.b = true;
                    obj = fc11.j(singleFirstOrError, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new w871(g3p1.q((Optional) obj));
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
                pf60 pf60Var = xb60Var.e;
                Long l = xb60Var.b.a;
                this.b = true;
                qf60 qf60Var = pf60Var.a;
                hf60 hf60VarN = HighlightsListRequest.n();
                if (l != null) {
                    long jLongValue = l.longValue();
                    sve1 sve1VarR = Timestamp.r();
                    sve1VarR.q(jLongValue);
                    hf60VarN.q((Timestamp) sve1VarR.build());
                }
                hf60VarN.n(upo1.s());
                Object objH = qf60Var.h((HighlightsListRequest) hf60VarN.build(), this);
                return objH == d9nVar ? d9nVar : objH;
        }
    }
}
