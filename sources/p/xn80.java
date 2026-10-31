package p;

import android.content.Context;
import com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xn80 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn80(Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.b = context;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new xn80(this.b, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((xn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                if (zod.x("com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient")) {
                    ayh ayhVarA = sap1.a();
                    InstallReferrerClient.newBuilder(this.b).build().startConnection(new wn80());
                    this.a = true;
                    obj = ayhVarA.Q(this);
                    d9n d9nVar = d9n.a;
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            return (qn80) obj;
        } catch (Exception e) {
            i1k0.C("Caught getSamsungGalaxyStoreReferrerDetails exception: " + e);
        }
    }
}
