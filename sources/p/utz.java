package p;

import com.spotify.offline_esperanto.proto.EsOffline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class utz extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ fey c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utz(fey feyVar, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = feyVar;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        fey feyVar = this.c;
        switch (b) {
            case 0:
                return new utz(feyVar, str, lnmVar, (byte) 0);
            default:
                return new utz(feyVar, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.d;
        fey feyVar = this.c;
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
                oqp0 oqp0Var = (oqp0) feyVar.b;
                toz tozVarO = EsOffline.DownloadRequest.o();
                tozVarO.r(str);
                EsOffline.DownloadRequest downloadRequestBuild = tozVarO.build();
                this.b = true;
                Object objA = oqp0Var.a(downloadRequestBuild, this);
                return objA == d9nVar ? d9nVar : objA;
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
                oqp0 oqp0Var2 = (oqp0) feyVar.b;
                toz tozVarO2 = EsOffline.DownloadRequest.o();
                tozVarO2.r(str);
                EsOffline.DownloadRequest downloadRequestBuild2 = tozVarO2.build();
                this.b = true;
                Object objC = oqp0Var2.c(downloadRequestBuild2, this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }
}
