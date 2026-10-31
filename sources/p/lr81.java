package p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import app.p000rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lr81 implements f18 {
    public long b;
    public long c;
    public c18 d;
    public c18 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public ByteBuffer h;
    public long i;
    public long j;
    public boolean k;

    @Override // p.f18
    public final ByteBuffer a() {
        if (this.k && !this.h.hasRemaining()) {
            long j = this.i;
            long j2 = this.j;
            if (j < j2) {
                long j3 = (j2 - j) * ((long) this.d.d);
                dm5.y(j3 >= 0);
                if (this.g.capacity() == 0) {
                    this.g = ByteBuffer.allocateDirect(this.d.d * SemanticState.Obscured).order(ByteOrder.nativeOrder());
                }
                this.g.clear();
                if (j3 < this.g.capacity()) {
                    this.g.limit((int) j3);
                }
                this.i += (long) (this.g.remaining() / this.d.d);
                return this.g;
            }
        }
        ByteBuffer byteBuffer = this.h;
        this.h = f18.a;
        return byteBuffer;
    }

    @Override // p.f18
    public final boolean d() {
        return this.k && this.i >= this.j && !this.h.hasRemaining();
    }

    @Override // p.f18
    public final c18 e(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!zoi1.P(c18Var.c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
        }
        this.e = c18Var;
        return c18Var;
    }

    @Override // p.f18
    public final void f(e18 e18Var) {
        c18 c18Var = this.e;
        this.d = c18Var;
        long j = this.c;
        this.b = j;
        this.j = zoi1.t(c18Var.a, j);
        this.i = 0L;
        ByteBuffer byteBuffer = f18.a;
        this.g = byteBuffer;
        this.f = byteBuffer;
        this.h = byteBuffer;
        this.k = false;
        dm5.y(!isActive() || e18Var.a == 0);
    }

    @Override // p.f18
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            this.i += (long) (byteBuffer.remaining() / this.d.d);
            int iRemaining = byteBuffer.remaining();
            if (this.f.capacity() < iRemaining) {
                this.f = ByteBuffer.allocateDirect(iRemaining).order(ByteOrder.nativeOrder());
            } else {
                this.f.clear();
            }
            this.f.put(byteBuffer).flip();
            this.h = this.f;
        }
    }

    @Override // p.f18
    public final void h() {
        this.k = true;
    }

    @Override // p.f18
    public final boolean isActive() {
        return (this.d.equals(c18.e) || this.b == -9223372036854775807L) ? false : true;
    }

    @Override // p.f18
    public final void reset() {
        c18 c18Var = c18.e;
        this.e = c18Var;
        this.d = c18Var;
        this.j = 0L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.i = 0L;
        ByteBuffer byteBuffer = f18.a;
        this.g = byteBuffer;
        this.f = byteBuffer;
        this.k = false;
    }
}
