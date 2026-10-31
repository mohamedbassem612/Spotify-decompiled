package p;

import androidx.media3.common.audio.AudioProcessor;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$DestroyRequest;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$EofRequest;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$EofResponse;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$FlushRequest;
import com.spotify.base.java.logging.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n48 implements ipb {
    public final gma b;
    public final boolean c;
    public Long d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public boolean k;
    public xw7 m;
    public c18 e = c18.e;
    public ByteBuffer i = f18.a;
    public boolean l = true;

    public n48(gma gmaVar, boolean z) {
        this.b = gmaVar;
        this.c = z;
    }

    public final ByteBuffer a() {
        ByteBuffer byteBufferB;
        if (this.h && !this.g) {
            Long l = this.d;
            if (l != null) {
                byteBufferB = this.b.b(l.longValue());
            } else {
                byteBufferB = null;
            }
            if (byteBufferB == null || !byteBufferB.hasRemaining()) {
                this.g = true;
                c(0);
            } else {
                c(byteBufferB.remaining());
                this.i.put(byteBufferB);
            }
            this.i.flip();
        }
        ByteBuffer byteBuffer = this.i;
        this.i = f18.a;
        return byteBuffer;
    }

    public final void b() {
        Long l = this.d;
        if (l != null) {
            long jLongValue = l.longValue();
            gma gmaVar = this.b;
            gmaVar.getClass();
            r48 r48VarN = AudioSinkChainWrapperEsperanto$DestroyRequest.n();
            r48VarN.n(jLongValue);
            AudioSinkChainWrapperEsperanto$DestroyRequest audioSinkChainWrapperEsperanto$DestroyRequest = (AudioSinkChainWrapperEsperanto$DestroyRequest) r48VarN.build();
            try {
                y48 y48Var = gmaVar.b;
                audioSinkChainWrapperEsperanto$DestroyRequest.getClass();
                y48Var.callSingle("spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService", "Destroy", audioSinkChainWrapperEsperanto$DestroyRequest).map(t9w.t).blockingGet();
            } catch (Exception e) {
                Logger.e(e, l1d.l(jLongValue, "Error deleting sink chain "), new Object[0]);
                Logger.d("Error destroying sink chain for requestId: " + jLongValue, new Object[0]);
            }
        }
        this.d = null;
        r(null);
    }

    public final void c(int i) {
        if (this.i.capacity() < i) {
            this.i = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.i.clear();
        }
    }

    public final boolean d() {
        return this.g && !this.i.hasRemaining();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException */
    public final c18 e(c18 c18Var) throws AudioProcessor.UnhandledAudioFormatException {
        this.e = c18Var;
        if (c18Var.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c18Var);
        }
        this.f = true;
        this.g = false;
        this.d = this.b.a(this.l, c18Var.a, this.m, c18Var.b);
        return c18Var;
    }

    public final void flush() {
        this.i = f18.a;
        this.g = false;
        this.h = false;
        Long l = this.d;
        if (l != null) {
            long jLongValue = l.longValue();
            gma gmaVar = this.b;
            gmaVar.getClass();
            t48 t48VarN = AudioSinkChainWrapperEsperanto$FlushRequest.n();
            t48VarN.q(jLongValue);
            t48VarN.n();
            AudioSinkChainWrapperEsperanto$FlushRequest audioSinkChainWrapperEsperanto$FlushRequest = (AudioSinkChainWrapperEsperanto$FlushRequest) t48VarN.build();
            try {
                y48 y48Var = gmaVar.b;
                audioSinkChainWrapperEsperanto$FlushRequest.getClass();
                y48Var.callSingle("spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService", "Flush", audioSinkChainWrapperEsperanto$FlushRequest).map(mm10.O0).blockingGet();
            } catch (Exception e) {
                Logger.e(e, gvg.f(jLongValue, "Error flushing sink chain ", " at frame 0"), new Object[0]);
                Logger.d("Error flushing sink chain for requestId: " + jLongValue, new Object[0]);
            }
        }
    }

    public final void g(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        Long l = this.d;
        if (l == null) {
            if (!this.j) {
                Logger.d("Request ID is null, passing through unprocessed audio", new Object[0]);
                this.j = true;
            }
            c(iRemaining);
            this.i.put(byteBuffer);
            this.i.flip();
            return;
        }
        long jLongValue = l.longValue();
        gma gmaVar = this.b;
        if (gmaVar.c(byteBuffer, jLongValue, false)) {
            Long l2 = this.d;
            l2.getClass();
            ByteBuffer byteBufferB = gmaVar.b(l2.longValue());
            c(byteBufferB.remaining());
            this.i.put(byteBufferB);
        } else {
            if (!this.k) {
                Logger.d("Received empty buffer for requestId: " + this.d, new Object[0]);
                this.k = true;
            }
            c(iRemaining);
            this.i.put(byteBuffer);
        }
        this.i.flip();
    }

    public final void h() {
        boolean zN;
        if (this.h) {
            return;
        }
        Long l = this.d;
        if (l != null) {
            long jLongValue = l.longValue();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
            byteBufferAllocate.getClass();
            gma gmaVar = this.b;
            if (gmaVar.c(byteBufferAllocate, jLongValue, true)) {
                s48 s48VarN = AudioSinkChainWrapperEsperanto$EofRequest.n();
                s48VarN.n(jLongValue);
                AudioSinkChainWrapperEsperanto$EofRequest audioSinkChainWrapperEsperanto$EofRequest = (AudioSinkChainWrapperEsperanto$EofRequest) s48VarN.build();
                try {
                    y48 y48Var = gmaVar.b;
                    audioSinkChainWrapperEsperanto$EofRequest.getClass();
                    zN = ((AudioSinkChainWrapperEsperanto$EofResponse) y48Var.callSingle("spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService", "Eof", audioSinkChainWrapperEsperanto$EofRequest).map(e4y.t).blockingGet()).n();
                } catch (Exception e) {
                    Logger.e(e, l1d.l(jLongValue, "Error checking EOF for sink chain: "), new Object[0]);
                    zN = false;
                }
                if (!zN) {
                    Logger.d(l1d.l(jLongValue, "Error writing end of file for requestId: "), new Object[0]);
                }
            } else {
                Logger.d("Error writing end of stream", new Object[0]);
            }
        }
        this.h = true;
    }

    public final boolean isActive() {
        return this.f;
    }

    @Override // p.ipb
    public final void r(xw7 xw7Var) {
        if (this.c) {
            this.m = xw7Var;
            if (this.d != null) {
                b();
                boolean z = this.l;
                c18 c18Var = this.e;
                this.d = this.b.a(z, c18Var.a, xw7Var, c18Var.b);
            }
        }
    }

    public final void reset() {
        b();
        this.i = f18.a;
        this.e = c18.e;
        this.f = false;
        this.g = false;
        this.h = false;
    }

    @Override // p.ipb
    public final void s(boolean z) {
        this.l = z;
    }
}
