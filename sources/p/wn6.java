package p;

import com.spotify.artistconcertspageview.v2.GetArtistConcertsPageRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wn6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ zn6 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn6(zn6 zn6Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zn6Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        zn6 zn6Var = this.c;
        switch (b) {
            case 0:
                return new wn6(zn6Var, str, lnmVar, (byte) 0);
            default:
                return new wn6(zn6Var, str, lnmVar, (byte) 1);
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
        String str = this.d;
        zn6 zn6Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC = zn6Var.c(str, this);
                    return objC == d9nVar ? d9nVar : objC;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                t7o0 t7o0Var = zn6Var.e;
                this.b = true;
                uk40 uk40VarN = GetArtistConcertsPageRequest.n();
                uk40VarN.n(str);
                Object objA = ((zl6) t7o0Var.b).a((GetArtistConcertsPageRequest) uk40VarN.build(), this);
                return objA == d9nVar ? d9nVar : objA;
        }
    }
}
