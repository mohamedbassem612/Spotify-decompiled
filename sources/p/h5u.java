package p;

import androidx.media3.common.audio.AudioProcessor;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.playerimpl.exo.AudioSinkProcessingException;
import com.spotify.boombox.audiosink.NativeAudioSinkChain;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h5u implements ipb {
    public final NativeAudioSinkChainFactory b;
    public final boolean c;
    public NativeAudioSinkChain d;
    public c18 e;
    public c18 f;
    public xw7 g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ByteBuffer l;
    public ByteBuffer m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19p;
    public xw7 q;

    public h5u(NativeAudioSinkChainFactory nativeAudioSinkChainFactory, boolean z) {
        this.b = nativeAudioSinkChainFactory;
        this.c = z;
        c18 c18Var = c18.e;
        this.e = c18Var;
        this.f = c18Var;
        this.h = 1;
        ByteBuffer byteBuffer = f18.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.f19p = true;
    }

    public static void l(NativeAudioSinkChain nativeAudioSinkChain) {
        boolean zSignalEndOfStream;
        boolean zEof;
        try {
            zSignalEndOfStream = nativeAudioSinkChain.signalEndOfStream();
        } catch (RuntimeException e) {
            Logger.e(e, "Error writing end of stream", new Object[0]);
            zSignalEndOfStream = false;
        }
        if (!zSignalEndOfStream) {
            Logger.d("Error writing end of stream", new Object[0]);
            return;
        }
        try {
            zEof = nativeAudioSinkChain.eof();
        } catch (RuntimeException e2) {
            Logger.e(e2, "Error checking audio sink EOF", new Object[0]);
            zEof = false;
        }
        if (zEof) {
            return;
        }
        Logger.d("Error writing end of file", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public final ByteBuffer a() {
        boolean z;
        if ((this.k || this.h != 1) && !this.j && !b()) {
            if (this.h == 3) {
                z = true;
            } else {
                NativeAudioSinkChain nativeAudioSinkChain = this.d;
                if (nativeAudioSinkChain != null) {
                    c(nativeAudioSinkChain, Math.max(this.e.d, this.m.capacity()));
                }
                if (b()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (this.h == 2 && z) {
                this.h = 3;
            }
            this.j = this.k && z;
        }
        ByteBuffer byteBuffer = this.l;
        this.l = f18.a;
        return byteBuffer;
    }

    public final boolean b() {
        return this.l.hasRemaining() || this.m.hasRemaining();
    }

    public final void c(NativeAudioSinkChain nativeAudioSinkChain, int i) {
        int i2;
        ByteBuffer byteBufferK = k(i);
        while (true) {
            try {
                int i3 = nativeAudioSinkChain.read(byteBufferK);
                if (i3 >= 0) {
                    if (i3 > byteBufferK.capacity() || i3 % this.e.d != 0) {
                        throw new AudioSinkProcessingException(f4i1.c(i3, "Invalid produced byte count: "));
                    }
                    byteBufferK.position(0);
                    byteBufferK.limit(i3);
                    this.l = byteBufferK;
                    return;
                }
                if (i3 == Integer.MIN_VALUE) {
                    throw new AudioSinkProcessingException("Invalid required output capacity");
                }
                i2 = -i3;
                if (i2 <= byteBufferK.capacity() || i2 % this.e.d != 0) {
                    break;
                } else {
                    byteBufferK = k(i2);
                }
            } catch (RuntimeException e) {
                Logger.e(e, "Error reading from sink chain", new Object[0]);
                byteBufferK.position(0);
                byteBufferK.limit(0);
                this.l = byteBufferK;
                return;
            }
        }
        throw new AudioSinkProcessingException(f4i1.c(i2, "Invalid required output capacity: "));
    }

    public final boolean d() {
        return this.j && !b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException */
    public final c18 e(c18 c18Var) throws AudioProcessor.UnhandledAudioFormatException {
        if (c18Var.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c18Var);
        }
        this.f = c18Var;
        this.i = true;
        return c18Var;
    }

    public final void flush() {
        boolean zFlush;
        ByteBuffer byteBuffer = f18.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.j = false;
        this.k = false;
        c18 c18Var = this.f;
        c18 c18Var2 = c18.e;
        boolean z = (c18Var.equals(c18Var2) || this.f.equals(this.e)) ? false : true;
        if (!this.f.equals(c18Var2)) {
            this.e = this.f;
            this.f = c18Var2;
        }
        boolean z2 = (!z && u890.j(this.q, this.g) && this.h == 1) ? false : true;
        if (!this.e.equals(c18Var2) && z2) {
            j();
        }
        this.h = 1;
        NativeAudioSinkChain nativeAudioSinkChain = this.d;
        if (nativeAudioSinkChain != null) {
            try {
                zFlush = nativeAudioSinkChain.flush(0L);
            } catch (RuntimeException e) {
                Logger.e(e, "Error flushing sink chain", new Object[0]);
                zFlush = false;
            }
            if (zFlush) {
                return;
            }
            Logger.d("Error flushing sink chain", new Object[0]);
        }
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean zWrite;
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0 || b()) {
            return;
        }
        if (this.f.equals(c18.e) && !u890.j(this.q, this.g) && this.h == 1) {
            NativeAudioSinkChain nativeAudioSinkChain = this.d;
            if (nativeAudioSinkChain != null) {
                l(nativeAudioSinkChain);
            }
            this.h = 2;
        }
        int iC = l1d.C(this.h);
        if (iC != 0) {
            if (iC == 1) {
                return;
            }
            if (iC != 2) {
                eg.o();
                return;
            } else {
                j();
                this.h = 1;
            }
        }
        NativeAudioSinkChain nativeAudioSinkChain2 = this.d;
        if (nativeAudioSinkChain2 == null) {
            if (!this.n) {
                Logger.d("Native audio sink chain unavailable, passing through unprocessed audio", new Object[0]);
                this.n = true;
            }
            ByteBuffer byteBufferK = k(byteBuffer.remaining());
            byteBufferK.put(byteBuffer);
            byteBufferK.flip();
            return;
        }
        int iPosition = byteBuffer.position();
        try {
            zWrite = nativeAudioSinkChain2.write(byteBuffer, iPosition, iRemaining);
        } catch (RuntimeException e) {
            if (!this.o) {
                Logger.e(e, "Error writing to native audio sink", new Object[0]);
                this.o = true;
            }
            zWrite = false;
        }
        if (zWrite) {
            byteBuffer.position(iPosition + iRemaining);
            c(nativeAudioSinkChain2, iRemaining);
            return;
        }
        if (!this.o) {
            Logger.d("Received rejected buffer from native audio sink", new Object[0]);
            this.o = true;
        }
        ByteBuffer byteBufferK2 = k(byteBuffer.remaining());
        byteBufferK2.put(byteBuffer);
        byteBufferK2.flip();
    }

    public final void h() {
        NativeAudioSinkChain nativeAudioSinkChain;
        if (this.k) {
            return;
        }
        if (this.h == 1 && (nativeAudioSinkChain = this.d) != null) {
            l(nativeAudioSinkChain);
        }
        this.k = true;
    }

    public final boolean isActive() {
        return this.i;
    }

    public final void j() {
        NativeAudioSinkChain nativeAudioSinkChain = this.d;
        NativeAudioSinkChain nativeAudioSinkChainCreate = null;
        this.d = null;
        if (nativeAudioSinkChain != null) {
            try {
                nativeAudioSinkChain.destroy();
            } catch (RuntimeException e) {
                Logger.e(e, "Error destroying sink chain", new Object[0]);
            }
        }
        xw7 xw7Var = this.q;
        this.g = xw7Var;
        try {
            NativeAudioSinkChainFactory nativeAudioSinkChainFactory = this.b;
            if (nativeAudioSinkChainFactory != null) {
                boolean z = this.f19p;
                c18 c18Var = this.e;
                nativeAudioSinkChainCreate = nativeAudioSinkChainFactory.create(z, c18Var.a, c18Var.b, xw7Var != null, xw7Var != null ? xw7Var.b : 0.0f, xw7Var != null ? xw7Var.a : 0.0f);
            }
        } catch (RuntimeException e2) {
            if (!this.n) {
                Logger.e(e2, "Error creating sink chain", new Object[0]);
                this.n = true;
            }
        }
        this.d = nativeAudioSinkChainCreate;
    }

    public final ByteBuffer k(int i) {
        ByteBuffer byteBufferOrder;
        if (this.m.capacity() < i || this.m.hasRemaining()) {
            byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            byteBufferOrder.getClass();
            this.m = byteBufferOrder;
        } else {
            byteBufferOrder = this.m;
        }
        byteBufferOrder.clear();
        this.l = byteBufferOrder;
        return byteBufferOrder;
    }

    @Override // p.ipb
    public final void r(xw7 xw7Var) {
        if (this.c) {
            this.q = xw7Var;
        }
    }

    public final void reset() {
        NativeAudioSinkChain nativeAudioSinkChain = this.d;
        this.d = null;
        if (nativeAudioSinkChain != null) {
            try {
                nativeAudioSinkChain.destroy();
            } catch (RuntimeException e) {
                Logger.e(e, "Error destroying sink chain", new Object[0]);
            }
        }
        ByteBuffer byteBuffer = f18.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        c18 c18Var = c18.e;
        this.e = c18Var;
        this.f = c18Var;
        this.g = null;
        this.h = 1;
        this.i = false;
        this.j = false;
        this.k = false;
        r(null);
    }

    @Override // p.ipb
    public final void s(boolean z) {
        this.f19p = z;
    }
}
