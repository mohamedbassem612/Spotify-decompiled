package p;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface gbc extends fka1, ReadableByteChannel {
    String I0(Charset charset);

    int L0();

    long Z0(fbc fbcVar);

    InputStream h1();

    boolean i0(long j, rhc rhcVar);

    nac k();

    ff01 peek();

    int read(byte[] bArr);

    boolean request(long j);

    int s0(cqq0 cqq0Var);

    void skip(long j);

    byte[] y0();

    boolean z0();
}
