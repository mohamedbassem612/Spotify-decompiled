package p;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pyo1 extends UrlRequest.Callback {
    public final ohd a;
    public final jhc b = ain1.b();

    public pyo1(ohd ohdVar) {
        this.a = ohdVar;
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        urlResponseInfo.getUrl();
        this.a.resumeWith(new m231(cronetException));
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IOException {
        urlResponseInfo.getUrl();
        byteBuffer.flip();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.b.write(bArr);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlResponseInfo.getUrl();
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlResponseInfo.getUrl();
        urlRequest.read(ByteBuffer.allocateDirect(65536));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlResponseInfo.getUrl();
        this.a.resumeWith(new oyo1(urlResponseInfo, this.b.e().z()));
    }
}
