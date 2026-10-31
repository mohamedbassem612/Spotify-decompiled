package p;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class un00 extends vn00 {
    public final cab f1;
    public final LogSessionId g1;
    public boolean h1;

    public un00(cab cabVar, o0g o0gVar, a67 a67Var, LogSessionId logSessionId) {
        super(1, o0gVar, a67Var);
        this.f1 = cabVar;
        this.g1 = logSessionId;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    @Override // p.vn00
    public final boolean W() throws ExportException {
        gar garVarD = this.U0.d();
        if (garVarD != null) {
            if (this.h1) {
                if (this.U0.e()) {
                    this.h1 = false;
                    return true;
                }
            } else {
                if (this.V0.e()) {
                    ByteBuffer byteBuffer = garVarD.d;
                    byteBuffer.getClass();
                    byteBuffer.limit(0);
                    garVarD.e(4);
                    this.W0 = this.U0.e();
                    return false;
                }
                ByteBuffer byteBufferD = this.V0.d();
                if (byteBufferD != null) {
                    garVarD.i(byteBufferD.limit());
                    garVarD.d.put(byteBufferD).flip();
                    fmr fmrVar = this.V0;
                    MediaCodec.BufferInfo bufferInfo = fmrVar.g(false) ? fmrVar.a : null;
                    bufferInfo.getClass();
                    garVarD.f = bufferInfo.presentationTimeUs;
                    ((oac) garVarD).a = bufferInfo.flags;
                    this.V0.j();
                    this.h1 = true;
                    if (this.U0.e()) {
                        this.h1 = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    @Override // p.vn00
    public final void X(ie30 ie30Var) throws ExportException {
        dm5.m(!f0(ie30Var));
        LogSessionId logSessionId = this.g1;
        cab cabVar = this.f1;
        fmr fmrVarD = ((dn3) cabVar.b).d(x74.o(ie30Var), ie30Var, null, false, logSessionId);
        cabVar.c = fmrVarD.c();
        this.V0 = fmrVarD;
    }

    @Override // p.vn00
    public final boolean f0(ie30 ie30Var) {
        return Objects.equals(ie30Var.f66p, "audio/raw") && zoi1.P(ie30Var.M);
    }

    @Override // p.jca
    public final String i() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
