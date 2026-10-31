package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.CapabilityRequest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gld extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gld(fqn1 fqn1Var, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.d = fqn1Var;
        this.c = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new gld(this.b, (hld) obj2, lnmVar);
            default:
                return new gld((fqn1) obj2, this.c, lnmVar);
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
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.c;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                        return (Empty) obj;
                    }
                    if (b2 == 2) {
                        hm5.M(obj);
                        return (Empty) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cmd cmdVarN = CapabilityRequest.n();
                cmdVarN.n(xld.AUDIO_ONLY);
                CapabilityRequest capabilityRequest = (CapabilityRequest) cmdVarN.build();
                hld hldVar = (hld) obj2;
                if (this.b) {
                    fld fldVar = hldVar.a;
                    capabilityRequest.getClass();
                    this.c = (byte) 1;
                    obj = fldVar.a(capabilityRequest, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    return (Empty) obj;
                }
                fld fldVar2 = hldVar.a;
                capabilityRequest.getClass();
                this.c = (byte) 2;
                obj = fldVar2.b(capabilityRequest, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                return (Empty) obj;
            default:
                try {
                    if (this.b) {
                        hm5.M(obj);
                    } else {
                        hm5.M(obj);
                        fqn1 fqn1Var = (fqn1) obj2;
                        List listI = fqn1.i(fqn1Var).i();
                        if (listI.size() >= this.c) {
                            fqn1.i(fqn1Var).j(listI);
                            this.b = true;
                            if (fqn1.k(fqn1Var, listI, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    break;
                } catch (Exception unused) {
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gld(boolean z, hld hldVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.d = hldVar;
    }
}
