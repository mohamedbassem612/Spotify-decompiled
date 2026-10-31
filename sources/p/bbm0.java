package p;

import com.spotify.address.endpoint.model.v1.proto.GetAddressFieldsRequest;
import com.spotify.address.endpoint.model.v1.proto.GetFormRequest;
import com.spotify.address.endpoint.model.v1.proto.SearchAddressesRequest;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bbm0 implements i12 {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ iu30 d;

    public bbm0(q8n q8nVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = q8nVar;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = iu30Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.i12
    public final Object a(GetFormRequest getFormRequest, lnm lnmVar) {
        abm0 abm0Var;
        if (lnmVar instanceof abm0) {
            abm0Var = (abm0) lnmVar;
            int i = abm0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abm0Var.c = i - Integer.MIN_VALUE;
            } else {
                abm0Var = new abm0(this, lnmVar);
            }
        } else {
            abm0Var = new abm0(this, lnmVar);
        }
        Object objY = abm0Var.a;
        int i2 = abm0Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            wkk0 wkk0Var = new wkk0(this.b, getFormRequest, this.c, (lnm) null, (byte) 4);
            abm0Var.c = 1;
            objY = fn31.Y(this.a, wkk0Var, abm0Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }

    @Override // p.i12
    public final Object b(GetAddressFieldsRequest getAddressFieldsRequest, lnm lnmVar) {
        return fn31.Y(this.a, new uug0(getAddressFieldsRequest, (lnm) null, (byte) 10), lnmVar);
    }

    @Override // p.i12
    public final Object c(SubmitFormRequest submitFormRequest, lnm lnmVar) {
        return fn31.Y(this.a, new d7i0(this.d, submitFormRequest, (lnm) null, (byte) 23), lnmVar);
    }

    @Override // p.i12
    public final Object d(SearchAddressesRequest searchAddressesRequest, lnm lnmVar) {
        return fn31.Y(this.a, new uug0(searchAddressesRequest, (lnm) null, (byte) 11), lnmVar);
    }
}
