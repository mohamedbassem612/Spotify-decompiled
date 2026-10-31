package androidx.glance.session;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class TimeoutCancellationException extends CancellationException {
    public final String a;
    public final int b;

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.a);
        sb.append(", ");
        return l1d.o(sb, this.b, ')');
    }
}
