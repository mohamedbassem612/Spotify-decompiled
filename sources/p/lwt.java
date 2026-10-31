package p;

import com.spotify.ads.esperanto.proto.SetDeviceVolumeRequest;
import com.spotify.ads.esperanto.proto.SetDeviceVolumeResponse;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lwt extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ mwt b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwt(mwt mwtVar, double d, lnm lnmVar) {
        super(2, lnmVar);
        this.b = mwtVar;
        this.c = d;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new lwt(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            jwt jwtVar = this.b.a;
            kk61 kk61VarN = SetDeviceVolumeRequest.n();
            kk61VarN.n(this.c);
            SetDeviceVolumeRequest setDeviceVolumeRequest = (SetDeviceVolumeRequest) kk61VarN.build();
            this.a = true;
            obj = jwtVar.a(setDeviceVolumeRequest, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        int i = kwt.a[((SetDeviceVolumeResponse) obj).o().ordinal()];
        if (i == 1) {
            return mk61.a;
        }
        if (i == 2) {
            return mk61.b;
        }
        if (i == 3) {
            return mk61.c;
        }
        eg.o();
        return null;
    }
}
