package p;

import com.spotify.concertpageview.v1.GetConcertPageRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ejk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hjk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejk(hjk hjkVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = hjkVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hjk hjkVar = this.c;
        switch (b) {
            case 0:
                return new ejk(hjkVar, lnmVar, (byte) 0);
            default:
                return new ejk(hjkVar, lnmVar, (byte) 1);
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
        hjk hjkVar = this.c;
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
                kba kbaVar = hjkVar.d;
                String str = hjkVar.f.b;
                boolean z2 = hjkVar.i.p;
                this.b = true;
                vl40 vl40VarO = GetConcertPageRequest.o();
                vl40VarO.q(str);
                vl40VarO.n(mig.CLIENT_CAPABILITY_EVENT_PAGE_HERO_V1);
                vl40VarO.n(mig.CLIENT_CAPABILITY_EVENT_PAGE_TICKETING_TIMELINE_V1);
                if (z2) {
                    vl40VarO.n(mig.CLIENT_CAPABILITY_EVENT_PAGE_RESERVED_SHARE_V1);
                }
                Object objB = ((eqk) kbaVar.b).b((GetConcertPageRequest) vl40VarO.build(), this);
                return objB == d9nVar ? d9nVar : objB;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single singleOnErrorReturn = hjkVar.g.c(hjkVar.f.b).firstOrError().onErrorReturn(vgp1.Q0);
                this.b = true;
                Object objJ = fc11.j(singleOnErrorReturn, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
