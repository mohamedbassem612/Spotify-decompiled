package p;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s74 extends ExperimentalBidirectionalStream {
    public final BidirectionalStream a;
    public final vk4 b;
    public final String c;
    public final Collection d;

    public s74(BidirectionalStream bidirectionalStream, vk4 vk4Var, String str, Collection collection) {
        this.a = bidirectionalStream;
        this.b = vk4Var;
        this.c = str;
        this.d = collection;
    }

    public final void a(int i, o65 o65Var, CronetException cronetException) {
        o05.a(this.b, this.c, this.d, null, i, o65Var, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
