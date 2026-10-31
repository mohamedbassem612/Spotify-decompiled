package p;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bcs implements ahn0 {
    public static final String b = pk30.a;
    public final j580 a;

    public bcs(j580 j580Var) {
        this.a = j580Var;
    }

    @Override // p.ahn0
    public final int H(ie30 ie30Var) {
        return this.a.H(ie30Var);
    }

    @Override // p.ahn0
    public final void R0(rij0 rij0Var) {
        this.a.R0(rij0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        this.a.close();
    }

    @Override // p.ahn0
    public final void j0(int i, ByteBuffer byteBuffer, qac qacVar) throws MuxerException {
        this.a.j0(i, byteBuffer, qacVar);
    }
}
