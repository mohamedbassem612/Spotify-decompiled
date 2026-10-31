package p;

import com.spotify.playlistmixing.endpoints.GetAutoTransitionUriError;
import com.spotify.playlistmixing.proto.StoreTransitionRequest;
import com.spotify.playlistmixing.proto.StoreTransitionResponse;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i6k0 implements g6k0 {
    public final j6k0 a;
    public final kkg1 b;

    public i6k0(j6k0 j6k0Var, kkg1 kkg1Var) {
        this.a = j6k0Var;
        this.b = kkg1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, String str2, onm onmVar, lhg1 lhg1Var) {
        h6k0 h6k0Var;
        if (onmVar instanceof h6k0) {
            h6k0Var = (h6k0) onmVar;
            int i = h6k0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6k0Var.c = i - Integer.MIN_VALUE;
            } else {
                h6k0Var = new h6k0(this, onmVar);
            }
        } else {
            h6k0Var = new h6k0(this, onmVar);
        }
        Object objJ = h6k0Var.a;
        int i2 = h6k0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                b3c1 b3c1VarN = StoreTransitionRequest.n();
                b3c1VarN.q(str);
                b3c1VarN.n(qmo1.q(str2));
                this.b.getClass();
                b3c1VarN.r(kkg1.c(lhg1Var));
                StoreTransitionRequest storeTransitionRequest = (StoreTransitionRequest) b3c1VarN.build();
                j6k0 j6k0Var = this.a;
                storeTransitionRequest.getClass();
                Single singleTimeout = j6k0Var.a(storeTransitionRequest).timeout(5L, TimeUnit.SECONDS);
                h6k0Var.c = 1;
                objJ = fc11.j(singleTimeout, h6k0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            return ((StoreTransitionResponse) objJ).n();
        } catch (Exception unused) {
            return new m231(GetAutoTransitionUriError.GetAutoTransitionUriFailed.a);
        }
    }
}
