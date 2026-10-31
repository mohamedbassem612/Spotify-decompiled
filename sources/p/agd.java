package p;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class agd implements bgd {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ agd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            default:
                ((iu30) obj).invoke(th);
                break;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            default:
                return "CancelHandler.UserSupplied[" + ((iu30) obj).getClass().getSimpleName() + '@' + v8r.n(this) + ']';
        }
    }
}
