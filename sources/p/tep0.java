package p;

import com.spotify.wrapped.v1.proto.Image;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tep0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tep0(bju bjuVar, int i, int i2, Image image, gw70 gw70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.c = bjuVar;
        this.d = i;
        this.f = i2;
        this.e = image;
        this.g = gw70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                return new tep0((ven0) obj4, this.d, (tr80) obj3, this.f, (o95) obj2, lnmVar, (byte) 0);
            case 1:
                return new tep0((ven0) obj4, this.d, (tr80) obj3, this.f, (o95) obj2, lnmVar, (byte) 1);
            default:
                return new tep0((bju) obj4, this.d, this.f, (Image) obj3, (gw70) obj2, lnmVar);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        int i = this.f;
        int i2 = this.d;
        Object obj3 = this.c;
        d9n d9nVar = d9n.a;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    return rih1Var;
                }
                float f = (i2 - ((rr80) ((tr80) obj2)).a) / i;
                float fFloatValue = ((Number) ((o95) obj4).e()).floatValue() - f;
                if (fFloatValue * fFloatValue <= 0.01f) {
                    return rih1Var;
                }
                Float f2 = new Float(f);
                this.b = true;
                return o95.b((o95) obj4, f2, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
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
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    return rih1Var;
                }
                float f3 = (i2 - ((rr80) ((tr80) obj2)).a) / i;
                float fFloatValue2 = ((Number) ((o95) obj4).e()).floatValue() - f3;
                if (fFloatValue2 * fFloatValue2 <= 0.01f) {
                    return rih1Var;
                }
                Float f4 = new Float(f3);
                this.b = true;
                return o95.b((o95) obj4, f4, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
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
                String strI = cy30.i(i2, "bonus_collaborator_", i, "_");
                wj6 wj6Var = new wj6((Image) obj2, (gw70) obj4, null, (byte) 0);
                this.b = true;
                Object objE = ((bju) obj3).e(strI, wj6Var, this);
                return objE == d9nVar ? d9nVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tep0(ven0 ven0Var, int i, tr80 tr80Var, int i2, o95 o95Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ven0Var;
        this.d = i;
        this.e = tr80Var;
        this.f = i2;
        this.g = o95Var;
    }
}
