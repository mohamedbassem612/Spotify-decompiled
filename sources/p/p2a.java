package p;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p2a extends ContentObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2a(Object obj, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 2:
                return false;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((q2a) obj).H1();
                break;
            case 1:
                super.onChange(z);
                g4k1 g4k1Var = (g4k1) ((l6s) obj).b;
                if (g4k1Var != null) {
                    g4k1Var.invoke();
                }
                break;
            case 2:
                a8u0 a8u0Var = (a8u0) obj;
                a8u0Var.A1.c(a8u0.B1[1], a8u0Var, Integer.valueOf(a8u0Var.w1.d()));
                break;
            case 3:
            default:
                super.onChange(z);
                break;
            case 4:
                ((hml1) obj).invoke();
                break;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 3:
                ((bbc) this.b).l(rih1.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
