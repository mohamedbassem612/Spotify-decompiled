package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService;
import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tn1 implements g50 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ tn1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                Serializable serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                vu1.b((vu1) obj, Collections.singletonList(str2), nik1.M1.a, str2, serializable instanceof tv80 ? (tv80) serializable : null, (dy1) null, 48);
                break;
            case 1:
                w1q0Var.invoke(Boolean.TRUE);
                mhr mhrVar = (ha8) obj;
                fn31.T(mhrVar.b, mhrVar.k, 0, new clo(mhrVar, str2, (lnm) null, (byte) 12), 2);
                break;
            case 2:
                w1q0Var.invoke(Boolean.TRUE);
                int i = EmailVerifyDispatcherService.e;
                dg30 dg30Var = (dg30) obj;
                dg30Var.startService(new Intent((Context) dg30Var, (Class<?>) EmailVerifyDispatcherService.class));
                break;
            default:
                kt91 kt91Var = (kt91) obj;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956639});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131956639, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                w1q0Var.invoke(Boolean.TRUE);
                break;
        }
    }
}
