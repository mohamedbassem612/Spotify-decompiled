package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ysm1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ysm1(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                ysm1 ysm1Var = new ysm1(i, lnmVar, (byte) 0);
                ysm1Var.c = vr20Var;
                ysm1Var.d = th;
                return ysm1Var.invokeSuspend(rih1Var);
            default:
                ysm1 ysm1Var2 = new ysm1(i, lnmVar, (byte) 1);
                ysm1Var2.c = vr20Var;
                ysm1Var2.d = th;
                return ysm1Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
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
                n57.e(th.toString());
                IsCuratedResponse isCuratedResponseO = IsCuratedResponse.o();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit(isCuratedResponseO, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
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
                n57.e(th2.toString());
                CollectionPlatformEsperantoContainsResponse collectionPlatformEsperantoContainsResponseP = CollectionPlatformEsperantoContainsResponse.p();
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var2.emit(collectionPlatformEsperantoContainsResponseP, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
