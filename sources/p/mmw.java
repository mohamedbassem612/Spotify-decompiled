package p;

import com.spotify.address.endpoint.model.v1.proto.AddressCollection;
import com.spotify.address.endpoint.model.v1.proto.RequestDetails;
import com.spotify.base.java.logging.Logger;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mmw {
    public final n12 a;
    public final i12 b;
    public final b8p1 c;
    public final q8n d;
    public final mgx0 e;

    public mmw(n12 n12Var, i12 i12Var, b8p1 b8p1Var, q8n q8nVar, mgx0 mgx0Var) {
        this.a = n12Var;
        this.b = i12Var;
        this.c = b8p1Var;
        this.d = q8nVar;
        this.e = mgx0Var;
    }

    public final RequestDetails a() {
        n12 n12Var = this.a;
        if (!(n12Var instanceof l12)) {
            if (n12Var instanceof m12) {
                return AddressCollection.u(((m12) n12Var).d.q()).q();
            }
            eg.o();
            return null;
        }
        lo21 lo21VarQ = RequestDetails.q();
        l12 l12Var = (l12) n12Var;
        lo21VarQ.q(l12Var.d);
        lo21VarQ.r(l12Var.e);
        lo21VarQ.n();
        return (RequestDetails) lo21VarQ.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        imw imwVar;
        if (onmVar instanceof imw) {
            imwVar = (imw) onmVar;
            int i = imwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imwVar.c = i - Integer.MIN_VALUE;
            } else {
                imwVar = new imw(this, onmVar);
            }
        } else {
            imwVar = new imw(this, onmVar);
        }
        Object objB = imwVar.a;
        int i2 = imwVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                mgx0 mgx0Var = this.e;
                pbg pbgVar = new pbg(this, (lnm) null, (byte) 21);
                imwVar.c = 1;
                objB = mgx0Var.b(pbgVar, imwVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            return (o700) objB;
        } catch (Exception e) {
            Logger.e(e, "Error loading the Address form", new Object[0]);
            HttpException httpException = e instanceof HttpException ? e : null;
            return new yxz(httpException != null ? new Integer(httpException.a) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(uew uewVar, onm onmVar) {
        jmw jmwVar;
        if (onmVar instanceof jmw) {
            jmwVar = (jmw) onmVar;
            int i = jmwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jmwVar.c = i - Integer.MIN_VALUE;
            } else {
                jmwVar = new jmw(this, onmVar);
            }
        } else {
            jmwVar = new jmw(this, onmVar);
        }
        Object objB = jmwVar.a;
        int i2 = jmwVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                mgx0 mgx0Var = this.e;
                fpo fpoVar = new fpo(this, uewVar, (lnm) null, (byte) 4);
                jmwVar.c = 1;
                objB = mgx0Var.b(fpoVar, jmwVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            return (o700) objB;
        } catch (Exception e) {
            Logger.e(e, "Error saving the Address form", new Object[0]);
            return n400.a;
        }
    }
}
