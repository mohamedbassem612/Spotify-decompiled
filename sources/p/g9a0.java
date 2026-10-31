package p;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.impl.CallbackExceptionImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g9a0 extends w8a0 {
    public final HttpURLConnection i;
    public final AtomicBoolean j;
    public WritableByteChannel k;
    public OutputStream l;
    public final /* synthetic */ i9a0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9a0(i9a0 i9a0Var, Executor executor, h9a0 h9a0Var, HttpURLConnection httpURLConnection, axh1 axh1Var) {
        super(executor, h9a0Var, axh1Var);
        this.m = i9a0Var;
        this.j = new AtomicBoolean(false);
        this.i = httpURLConnection;
    }

    @Override // p.w8a0
    public final void c(Exception exc) {
        this.m.b(new CallbackExceptionImpl("Exception received from UploadDataProvider", exc));
    }
}
