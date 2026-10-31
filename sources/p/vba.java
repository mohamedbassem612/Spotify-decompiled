package p;

import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vba extends jim0 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).e(Status.h);
                return;
            } else {
                new StringBuilder(String.valueOf(i).length() + 34);
                new Exception();
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        vso1 vso1Var = (vso1) pair.first;
        p331 p331Var = (p331) pair.second;
        try {
            vso1Var.a(p331Var);
        } catch (RuntimeException e) {
            BasePendingResult.k(p331Var);
            throw e;
        }
    }
}
