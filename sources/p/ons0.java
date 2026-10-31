package p;

import com.google.protobuf.Empty;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ons0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qns0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ons0(qns0 qns0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qns0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ons0(this.c, lnmVar, (byte) 0);
            case 1:
                return new ons0(this.c, lnmVar, (byte) 1);
            case 2:
                return new ons0(this.c, lnmVar, (byte) 2);
            case 3:
                return new ons0(this.c, lnmVar, (byte) 3);
            default:
                return new ons0(this.c, lnmVar, (byte) 4);
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
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        qns0 qns0Var = this.c;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY = fn31.Y(qns0Var.a, new vse0(qns0Var, (lnm) null, (byte) 8), this);
                    return objY == d9nVar ? d9nVar : objY;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    jn7 jn7Var = qns0Var.b;
                    Empty emptyBuild = Empty.o().build();
                    this.b = true;
                    obj = jn7Var.f(emptyBuild, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return sns0.a((PermissionsEsperanto.QueueQueryResponse) obj);
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY2 = fn31.Y(qns0Var.a, new ons0(qns0Var, lnmVar, b2), this);
                    return objY2 == d9nVar ? d9nVar : objY2;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    jn7 jn7Var2 = qns0Var.b;
                    Empty emptyBuild2 = Empty.o().build();
                    this.b = true;
                    obj = jn7Var2.e(emptyBuild2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return sns0.a((PermissionsEsperanto.QueueQueryResponse) obj);
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY3 = fn31.Y(qns0Var.a, new ons0(qns0Var, lnmVar, (byte) 3), this);
                    return objY3 == d9nVar ? d9nVar : objY3;
                }
                if (z5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
