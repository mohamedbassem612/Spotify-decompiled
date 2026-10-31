package p;

import com.google.protobuf.Empty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qxs extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ txs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qxs(txs txsVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = txsVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        txs txsVar = this.c;
        switch (b) {
            case 0:
                return new qxs(txsVar, lnmVar, (byte) 0);
            default:
                return new qxs(txsVar, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        txs txsVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mr20 mr20VarCallStream = txsVar.c.a.callStream("spotify.connect.discovery.cast.esperanto.proto.CastService", "SubConnect", Empty.n());
                    pxs pxsVar = new pxs(txsVar, (byte) 0);
                    this.b = true;
                    Object objCollect = mr20VarCallStream.collect(new y3e(new l6z(pxsVar, (byte) 5), (byte) 0), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    mr20 mr20VarCallStream2 = txsVar.c.a.callStream("spotify.connect.discovery.cast.esperanto.proto.CastService", "Logout", Empty.n());
                    pxs pxsVar2 = new pxs(txsVar, (byte) 1);
                    this.b = true;
                    Object objCollect2 = mr20VarCallStream2.collect(new vnb(new l6z(pxsVar2, (byte) 6), (byte) 29), this);
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 == d9nVar) {
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
}
