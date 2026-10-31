package p;

import android.content.Intent;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h8d0 implements rq21 {
    public final /* synthetic */ byte a;
    public final List b;

    public h8d0(xrm1 xrm1Var) {
        this.a = (byte) 0;
        this.b = p7h.M(new oq21[]{new oq21("Legacy Your Episodes", blc0.C4), new oq21("Legacy Your Episodes Core", blc0.D4), new oq21("Legacy Listen Later Episodes", blc0.a4)});
    }

    public final List a() {
        byte b = this.a;
        return this.b;
    }

    public final nq21 b(Intent intent) {
        byte b = this.a;
        mq21 mq21Var = mq21.a;
        switch (b) {
            case 0:
                List listM = p7h.M(new blc0[]{blc0.C4, blc0.D4, blc0.a4});
                Set set = s4b1.f;
                return listM.contains(uic.x(intent.getDataString()).c) ? new lq21("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") : mq21Var;
            default:
                List listM2 = p7h.M(new blc0[]{blc0.R2, blc0.ac});
                Set set2 = s4b1.f;
                return listM2.contains(uic.x(intent.getDataString()).c) ? new lq21("spotify:list:offline-playable:all") : mq21Var;
        }
    }

    public h8d0() {
        this.a = (byte) 1;
        this.b = p7h.M(new oq21[]{new oq21("Cached Files", blc0.R2), new oq21("Offline Backup", blc0.ac)});
    }
}
