package p;

import com.google.protobuf.Empty;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class km9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ rm9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km9(rm9 rm9Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = rm9Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        rm9 rm9Var = this.c;
        switch (b) {
            case 0:
                return new km9(rm9Var, lnmVar, (byte) 0);
            case 1:
                return new km9(rm9Var, lnmVar, (byte) 1);
            case 2:
                return new km9(rm9Var, lnmVar, (byte) 2);
            case 3:
                return new km9(rm9Var, lnmVar, (byte) 3);
            case 4:
                return new km9(rm9Var, lnmVar, (byte) 4);
            case 5:
                return new km9(rm9Var, lnmVar, (byte) 5);
            default:
                return new km9(rm9Var, lnmVar, (byte) 6);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        byte b3 = 0;
        rm9 rm9Var = this.c;
        d9n d9nVar = d9n.a;
        byte b4 = 1;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                xe01 xe01Var = rm9Var.a.i;
                jm9 jm9Var = new jm9(rm9Var, b3);
                this.b = true;
                if (xe01Var.a.collect(jm9Var, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kr9 kr9Var = rm9Var.m;
                lt20 lt20Var = new lt20(new iib(o4p1.r(new ik(new ir9(z4p1.v(rqt0.w(new php0(kr9Var.a.callStream("spotify.restrictions.permissions.permissions_proto.Permissions", "ObserveBYOMRestriction", Empty.n()), (byte) 16), fr9.b, rqt0.b), 1), (byte) 0), (byte) 17), kr9Var.b), new rf2(3, (lnm) null, (byte) 4), (byte) 6), new re1(3, null, (byte) 10), (byte) 0);
                jm9 jm9Var2 = new jm9(rm9Var, b4);
                this.b = true;
                return lt20Var.collect(jm9Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = rm9Var.a.i;
                mr20 mr20Var2 = rm9Var.f;
                l2 l2Var = new l2(3, (lnm) null, (byte) 14);
                jm9 jm9Var3 = new jm9(rm9Var, (byte) 2);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, jm9Var3, new ekv(l2Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    mr20 mr20Var3 = rm9Var.f;
                    this.b = true;
                    obj = b5p1.i(mr20Var3, this);
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
                return ((PlayerState) obj).playbackId().h();
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var4 = rm9Var.n;
                jm9 jm9Var4 = new jm9(rm9Var, b2);
                this.b = true;
                Object objCollect = mr20Var4.collect(new nz7((vr20) jm9Var4, (byte) 23), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kr9 kr9Var2 = rm9Var.m;
                this.b = true;
                Object objA = kr9Var2.a(this);
                return objA == d9nVar ? d9nVar : objA;
            default:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var5 = rm9Var.f;
                this.b = true;
                Object objI = b5p1.i(mr20Var5, this);
                return objI == d9nVar ? d9nVar : objI;
        }
    }
}
