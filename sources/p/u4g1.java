package p;

import com.google.protobuf.Empty;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u4g1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ oe30 c;
    public final /* synthetic */ v4g1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4g1(oe30 oe30Var, v4g1 v4g1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = oe30Var;
        this.d = v4g1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        v4g1 v4g1Var = this.d;
        oe30 oe30Var = this.c;
        switch (b) {
            case 0:
                return new u4g1(v4g1Var, oe30Var, lnmVar);
            default:
                return new u4g1(oe30Var, v4g1Var, lnmVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        v4g1 v4g1Var = this.d;
        oe30 oe30Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = v4g1Var.g;
                bda1 bda1Var = new bda1(oe30Var, (byte) 13);
                this.b = true;
                dt71Var.collect(bda1Var, this);
                return d9nVar;
            default:
                boolean z2 = this.b;
                rih1 rih1Var = rih1.a;
                if (!z2) {
                    hm5.M(obj);
                    mr20 mr20VarCallStream = oe30Var.callStream("spotify.connectivity.traffic.esperanto.proto.TrafficAdapter", "listenToTrafficEvents", Empty.n());
                    bda1 bda1Var2 = new bda1(v4g1Var, (byte) 14);
                    this.b = true;
                    Object objCollect = mr20VarCallStream.collect(new qmd1(bda1Var2, (byte) 25), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4g1(v4g1 v4g1Var, oe30 oe30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = v4g1Var;
        this.c = oe30Var;
    }
}
