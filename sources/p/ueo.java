package p;

import androidx.media3.common.PlaybackException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ueo {
    public static final Set a = f46.S0(new Integer[]{4001, 4002, 4003, 4004, 4005});

    public static final teo a(Exception exc, int i) {
        HttpException httpException = exc instanceof HttpException ? (HttpException) exc : null;
        Integer numValueOf = httpException != null ? Integer.valueOf(httpException.a) : null;
        if (numValueOf != null && numValueOf.intValue() > 0) {
            i = 2;
        } else if ((exc instanceof SocketTimeoutException) || (exc instanceof UnknownHostException) || (exc instanceof ConnectException)) {
            i = 1;
        } else if (exc instanceof UnsupportedEncodingException) {
            i = 3;
        } else if (exc instanceof PlaybackException) {
            i = a.contains(Integer.valueOf(((PlaybackException) exc).a)) ? 4 : 5;
        }
        return new teo(numValueOf, i);
    }
}
