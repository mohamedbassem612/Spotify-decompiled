package p;

import com.google.protobuf.Any;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import spotify.mdata.proto.Mdata$LocalBatchedEntityRequest;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse;
import spotify.mdata.proto.Mdata$LocalExtensionQuery;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yid extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ zid b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yid(zid zidVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.b = zidVar;
        this.c = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new yid(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte[] bArrT;
        Any anyN;
        phc phcVarQ;
        h290 h290VarN;
        boolean z = this.a;
        zid zidVar = this.b;
        if (!z) {
            hm5.M(obj);
            zmj0 zmj0Var = zidVar.a;
            rdh0 rdh0VarO = Mdata$LocalBatchedEntityRequest.o();
            sdh0 sdh0VarP = Mdata$LocalExtensionQuery.p();
            sdh0VarP.r(hz00.R0);
            sdh0VarP.q(this.c);
            rdh0VarO.q((Mdata$LocalExtensionQuery) sdh0VarP.build());
            Single singleA = zmj0Var.a((Mdata$LocalBatchedEntityRequest) rdh0VarO.build());
            this.a = true;
            obj = fc11.j(singleA, this);
            d9n d9nVar = d9n.a;
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
        Mdata$LocalBatchedExtensionResponse.Extension extension = (Mdata$LocalBatchedExtensionResponse.Extension) o7h.s0(((Mdata$LocalBatchedExtensionResponse) obj).getExtensionList());
        Mdata$LocalBatchedExtensionResponse.EntityExtension entityExtension = (extension == null || (h290VarN = extension.n()) == null) ? null : (Mdata$LocalBatchedExtensionResponse.EntityExtension) o7h.s0(h290VarN);
        hz00 extensionKind = extension != null ? extension.getExtensionKind() : null;
        hz00 hz00Var = hz00.R0;
        if (extensionKind != hz00Var) {
            return null;
        }
        int number = hz00Var.getNumber();
        if (entityExtension == null || (anyN = entityExtension.n()) == null || (phcVarQ = anyN.q()) == null || (bArrT = phcVarQ.t()) == null) {
            bArrT = new byte[0];
        }
        return zidVar.b.a(Collections.singletonList(new jz00(bArrT, number))).a(eid.class);
    }
}
