package p;

import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ubf0 implements idf0 {
    @Override // p.idf0
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        ubf0 ubf0Var = LottieAnimationView.T0;
        p5r p5rVar = qpi1.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            nue0.d("Unable to load composition.");
        } else {
            k220.p("Unable to parse composition", th);
        }
    }
}
