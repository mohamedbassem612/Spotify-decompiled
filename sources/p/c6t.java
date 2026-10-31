package p;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import app.p000rive.semantics.SemanticState;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c6t extends nw81 implements rpc1 {
    public final lqc1 n;

    public c6t(lqc1 lqc1Var) {
        super(new bqc1[2], new eae[2]);
        int i = this.g;
        gar[] garVarArr = this.e;
        dm5.y(i == garVarArr.length);
        for (gar garVar : garVarArr) {
            garVar.i(SemanticState.ReadOnly);
        }
        this.n = lqc1Var;
    }

    @Override // p.nw81
    public final gar f() {
        return new bqc1(1);
    }

    @Override // p.nw81
    public final har g() {
        return new eae(this);
    }

    @Override // p.nw81
    public final DecoderException h(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // p.nw81
    public final DecoderException i(gar garVar, har harVar, boolean z) {
        bqc1 bqc1Var = (bqc1) garVar;
        eae eaeVar = (eae) harVar;
        try {
            ByteBuffer byteBuffer = bqc1Var.d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            lqc1 lqc1Var = this.n;
            if (z) {
                lqc1Var.reset();
            }
            ipc1 ipc1VarD = lqc1Var.d(0, bArrArray, iLimit);
            long j = bqc1Var.f;
            long j2 = bqc1Var.i;
            eaeVar.b = j;
            eaeVar.d = ipc1VarD;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            eaeVar.e = j;
            eaeVar.c = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // p.rpc1
    public final void a(long j) {
    }
}
