package p;

import com.spotify.connectivity.esperanto.proto.ForceOfflineRequest;
import com.spotify.connectivity.esperanto.proto.ForceOfflineResponse;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ecl {
    public final be a;
    public final cdn0 b;

    public ecl(be beVar, cdn0 cdn0Var) {
        this.a = beVar;
        this.b = cdn0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws meh {
        ccl cclVar;
        if (onmVar instanceof ccl) {
            cclVar = (ccl) onmVar;
            int i = cclVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cclVar.c = i - Integer.MIN_VALUE;
            } else {
                cclVar = new ccl(this, onmVar);
            }
        } else {
            cclVar = new ccl(this, onmVar);
        }
        Object objJ = cclVar.a;
        int i2 = cclVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ic30 ic30VarN = ForceOfflineRequest.n();
            ic30VarN.n();
            ForceOfflineRequest forceOfflineRequestBuild = ic30VarN.build();
            forceOfflineRequestBuild.getClass();
            Single singleR = this.a.r(forceOfflineRequestBuild);
            cclVar.c = 1;
            objJ = fc11.j(singleR, cclVar);
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
        ForceOfflineResponse forceOfflineResponse = (ForceOfflineResponse) objJ;
        int i3 = bcl.a[forceOfflineResponse.o().ordinal()];
        if (i3 == 1) {
            this.b.a.m((Object) null, false);
            return rih1.a;
        }
        if (i3 != 2) {
            throw new meh(forceOfflineResponse.n());
        }
        eg.m(forceOfflineResponse.n());
        return null;
    }
}
