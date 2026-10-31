package p;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mge extends w9a {
    public final /* synthetic */ byte i;
    public final Object j;

    public mge() {
        this.i = (byte) 0;
        this.j = new SparseArray();
    }

    @Override // p.w9a
    public final c18 b(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        switch (this.i) {
            case 0:
                boolean zR = kto1.r(c18Var);
                int i = c18Var.b;
                if (!zR) {
                    throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
                }
                nge ngeVar = (nge) ((SparseArray) this.j).get(i);
                if (ngeVar != null) {
                    return ngeVar.e ? c18.e : new c18(c18Var.a, ngeVar.b, c18Var.c);
                }
                throw new AudioProcessor$UnhandledAudioFormatException(gvg.e(i, "No mixing matrix set for input channel count=", ". Please call putChannelMixingMatrix() with the appropriate matrix."), c18Var);
            default:
                return c18Var;
        }
    }

    @Override // p.w9a
    public void c() {
        switch (this.i) {
            case 1:
                m();
                break;
        }
    }

    @Override // p.f18
    public final void g(ByteBuffer byteBuffer) {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                nge ngeVar = (nge) ((SparseArray) obj).get(this.b.b);
                ngeVar.getClass();
                int iRemaining = byteBuffer.remaining() / this.b.d;
                ByteBuffer byteBufferL = l(this.c.d * iRemaining);
                kto1.A(byteBuffer, this.b, byteBufferL, this.c, ngeVar, iRemaining, false);
                byteBufferL.flip();
                break;
            default:
                int iRemaining2 = byteBuffer.remaining();
                if (iRemaining2 != 0) {
                    String str = zoi1.a;
                    ((sr20) ((l2a) obj).b).a.a(byteBuffer.asReadOnlyBuffer().order(byteBuffer.order()));
                    l(iRemaining2).put(byteBuffer).flip();
                    break;
                }
                break;
        }
    }

    @Override // p.w9a
    public void j() {
        switch (this.i) {
            case 1:
                m();
                break;
        }
    }

    @Override // p.w9a
    public void k() {
        switch (this.i) {
            case 1:
                m();
                break;
        }
    }

    public void m() {
        if (isActive()) {
            l2a l2aVar = (l2a) this.j;
            int i = this.b.a;
            ((sr20) l2aVar.b).getClass();
        }
    }

    public mge(l2a l2aVar) {
        this.i = (byte) 1;
        this.j = l2aVar;
    }
}
