package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wrk implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    public /* synthetic */ wrk(p811 p811Var, byte b) {
        this.a = b;
        this.b = p811Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                p811Var.a = (Map) obj;
                return;
            case 1:
                p811Var.a = (Throwable) obj;
                return;
            case 2:
                p811Var.a = Boolean.valueOf(y7y0.F((Map) obj));
                return;
            case 3:
                p811Var.a = obj;
                return;
            case 4:
                HttpException httpException = (Throwable) obj;
                Object obj2 = p811Var.a;
                if (obj2 == null) {
                    u890.C("startPerformanceTracker");
                    throw null;
                }
                eks0 eks0Var = (eks0) obj2;
                int i = 408;
                if (!(httpException instanceof SocketTimeoutException) && !(httpException instanceof UnknownHostException)) {
                    if (httpException instanceof IOException) {
                        i = -1;
                    } else {
                        i = httpException instanceof HttpException ? httpException.a : -2;
                    }
                }
                eks0Var.a(Integer.valueOf(i));
                return;
            case 5:
                Object obj3 = p811Var.a;
                if (obj3 != null) {
                    ((eks0) obj3).a((Integer) null);
                    return;
                } else {
                    u890.C("startPerformanceTracker");
                    throw null;
                }
            case 6:
                p811Var.a = (m3x0) obj;
                return;
            case 7:
                p811Var.a = (bx01) obj;
                return;
            default:
                p811Var.a = (List) obj;
                return;
        }
    }

    public /* synthetic */ wrk(p811 p811Var, Object obj, byte b) {
        this.a = b;
        this.b = p811Var;
    }
}
