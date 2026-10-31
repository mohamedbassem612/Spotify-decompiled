package p;

import com.spotify.liveroom.listeningparty.proto.GetAllowedFeaturesRequest;
import com.spotify.liveroom.listeningparty.proto.GetAllowedFeaturesResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mx3 {
    public final nx3 a;

    public mx3(nx3 nx3Var) {
        this.a = nx3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, onm onmVar) {
        lx3 lx3Var;
        kx3 kx3Var;
        if (onmVar instanceof lx3) {
            lx3Var = (lx3) onmVar;
            int i = lx3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lx3Var.d = i - Integer.MIN_VALUE;
            } else {
                lx3Var = new lx3(this, onmVar);
            }
        } else {
            lx3Var = new lx3(this, onmVar);
        }
        Object objA = lx3Var.b;
        int i2 = lx3Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                nx3 nx3Var = this.a;
                tk40 tk40VarN = GetAllowedFeaturesRequest.n();
                tk40VarN.n(str);
                GetAllowedFeaturesRequest getAllowedFeaturesRequest = (GetAllowedFeaturesRequest) tk40VarN.build();
                lx3Var.a = this;
                lx3Var.d = 1;
                objA = nx3Var.a(getAllowedFeaturesRequest, lx3Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = lx3Var.a;
                hm5.M(objA);
            }
            d290<rl10> d290VarN = ((GetAllowedFeaturesResponse) objA).n();
            ArrayList arrayList = new ArrayList();
            for (rl10 rl10Var : d290VarN) {
                this.getClass();
                switch (rl10Var) {
                    case UNKNOWN_FEATURE:
                    case UNRECOGNIZED:
                        kx3Var = null;
                        break;
                    case CHAT:
                        kx3Var = kx3.a;
                        break;
                    case SPEAK:
                        kx3Var = kx3.b;
                        break;
                    case MODERATION_CONTROLS:
                        kx3Var = kx3.c;
                        break;
                    case HOST_CONTROLS:
                        kx3Var = kx3.d;
                        break;
                    case VIEW_CHAT_MESSAGES:
                        kx3Var = kx3.e;
                        break;
                    default:
                        eg.o();
                        kx3Var = null;
                        break;
                }
                if (kx3Var != null) {
                    arrayList.add(kx3Var);
                }
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new m231(th);
        }
    }
}
