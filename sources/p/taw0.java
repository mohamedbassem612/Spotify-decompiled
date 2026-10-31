package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class taw0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ k3i0 c;
    public final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ taw0(k3i0 k3i0Var, Uri uri, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = k3i0Var;
        this.d = uri;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Uri uri = this.d;
        k3i0 k3i0Var = this.c;
        switch (b) {
            case 0:
                return new taw0(k3i0Var, uri, lnmVar, (byte) 0);
            case 1:
                return new taw0(k3i0Var, uri, lnmVar, (byte) 1);
            case 2:
                return new taw0(k3i0Var, uri, lnmVar, (byte) 2);
            default:
                return new taw0(k3i0Var, uri, lnmVar, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Uri uri = this.d;
        k3i0 k3i0Var = this.c;
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
                ixg ixgVarB = ((gw70) k3i0Var.b).b(uri);
                ixgVarB.g = false;
                Single singleI = ixgVarB.i();
                this.b = true;
                Object objJ = fc11.j(singleI, this);
                return objJ == d9nVar ? d9nVar : objJ;
            case 1:
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
                ixg ixgVarB2 = ((gw70) k3i0Var.b).b(uri);
                ixgVarB2.g = false;
                Single singleI2 = ixgVarB2.i();
                this.b = true;
                Object objJ2 = fc11.j(singleI2, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
            case 2:
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
                ixg ixgVarB3 = ((gw70) k3i0Var.b).b(uri);
                ixgVarB3.g = false;
                Single singleI3 = ixgVarB3.i();
                this.b = true;
                Object objJ3 = fc11.j(singleI3, this);
                return objJ3 == d9nVar ? d9nVar : objJ3;
            default:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ixg ixgVarB4 = ((gw70) k3i0Var.b).b(uri);
                ixgVarB4.g = false;
                Single singleI4 = ixgVarB4.i();
                this.b = true;
                Object objJ4 = fc11.j(singleI4, this);
                return objJ4 == d9nVar ? d9nVar : objJ4;
        }
    }
}
