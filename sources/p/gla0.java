package p;

import android.location.Location;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gla0 implements iu30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ gla0(n811 n811Var, yro1 yro1Var) {
        this.a = (byte) 6;
        this.b = n811Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(u890.j((tka0) obj, (tka0) obj2));
            case 1:
                ((dxc) obj2).cancel();
                return rih1Var;
            case 2:
                return ((iu30) obj2).invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 3:
                ((ohd) obj2).resumeWith((Location) obj);
                return rih1Var;
            case 4:
                j2p1.v(t6n1.f, "Network request was canceled");
                t6n1.a((t6n1) obj2);
                return rih1Var;
            case 5:
                xrn1.d((xrn1) obj2, (CancellationException) obj);
                return rih1Var;
            case 6:
                Exception exc = (Exception) obj;
                boolean z = false;
                if (((n811) obj2).a < 5 && yro1.e(exc)) {
                    z = true;
                }
                return new Boolean(z);
            default:
                ((UrlRequest) obj2).cancel();
                return rih1Var;
        }
    }

    public /* synthetic */ gla0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
