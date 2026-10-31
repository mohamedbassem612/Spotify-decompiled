package p;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jan1 extends BasePendingResult implements zaa {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jan1(j8n1 j8n1Var, byte b) {
        this(nf8.a, j8n1Var);
        switch (b) {
            case 1:
                this(thl1.a, j8n1Var);
                break;
            default:
                break;
        }
    }

    public abstract void l(px40 px40Var);

    public final void m(px40 px40Var) throws DeadObjectException {
        try {
            l(px40Var);
        } catch (DeadObjectException e) {
            n(new Status(8, e.getLocalizedMessage(), (PendingIntent) null, (lal) null));
            throw e;
        } catch (RemoteException e2) {
            n(new Status(8, e2.getLocalizedMessage(), (PendingIntent) null, (lal) null));
        }
    }

    public final void n(Status status) {
        zod.j("Failed result must not be success", !status.j());
        g(d(status));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jan1(em3 em3Var, j8n1 j8n1Var) {
        super(j8n1Var);
        zod.t(j8n1Var, "GoogleApiClient must not be null");
        zod.t(em3Var, "Api must not be null");
    }
}
