package p;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r82 extends a8d1 implements vu30 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r82(Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.a = context;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new r82(this.a, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.a);
        } catch (Exception e) {
            i1k0.C("Caught getHuaweiAdvertisingInfoObject exception: " + e);
            return null;
        }
    }
}
