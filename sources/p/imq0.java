package p;

import android.content.Context;
import android.view.View;
import com.spotify.clientoptinproxy.v1.SendClientActionRequest;
import com.spotify.clientoptinproxy.v1.SendClientActionResponse;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class imq0 implements gmq0 {
    public final Context a;
    public final rkg b;
    public final kt91 c;

    public imq0(Context context, rkg rkgVar, kt91 kt91Var) {
        this.a = context;
        this.b = rkgVar;
        this.c = kt91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Map map, onm onmVar, boolean z) {
        hmq0 hmq0Var;
        if (onmVar instanceof hmq0) {
            hmq0Var = (hmq0) onmVar;
            int i = hmq0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmq0Var.c = i - Integer.MIN_VALUE;
            } else {
                hmq0Var = new hmq0(this, onmVar);
            }
        } else {
            hmq0Var = new hmq0(this, onmVar);
        }
        Object objA = hmq0Var.a;
        int i2 = hmq0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            v261 v261VarO = SendClientActionRequest.o();
            v261VarO.q(str);
            v261VarO.r(z);
            if (map != null) {
                v261VarO.n(map);
            }
            SendClientActionRequest sendClientActionRequestBuild = v261VarO.build();
            hmq0Var.c = 1;
            objA = this.b.a(sendClientActionRequestBuild, hmq0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        SendClientActionResponse sendClientActionResponse = (SendClientActionResponse) objA;
        if (sendClientActionResponse.o()) {
            eg.m(l1d.m("OptIn action failed: ", sendClientActionResponse.n().getMessage()));
            return null;
        }
        er91 er91Var = new er91((fs91) null, this.a.getString(2131959400), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = this.c;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
        return rih1.a;
    }
}
