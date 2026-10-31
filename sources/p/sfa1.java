package p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sfa1 implements f18 {
    public final boolean b;
    public int c;
    public float d = 1.0f;
    public float e = 1.0f;
    public c18 f;
    public c18 g;
    public c18 h;
    public c18 i;
    public boolean j;
    public rfa1 k;
    public ByteBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f134p;

    public sfa1(boolean z) {
        c18 c18Var = c18.e;
        this.f = c18Var;
        this.g = c18Var;
        this.h = c18Var;
        this.i = c18Var;
        ByteBuffer byteBuffer = f18.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.b = z;
    }

    @Override // p.f18
    public final ByteBuffer a() {
        rfa1 rfa1Var = this.k;
        if (rfa1Var != null) {
            qfa1 qfa1Var = rfa1Var.i;
            int i = rfa1Var.b;
            dm5.y(rfa1Var.k >= 0);
            int iP = qfa1Var.p() * rfa1Var.k * i;
            if (iP > 0) {
                if (this.l.capacity() < iP) {
                    this.l = ByteBuffer.allocateDirect(iP).order(ByteOrder.nativeOrder());
                } else {
                    this.l.clear();
                }
                ByteBuffer byteBuffer = this.l;
                dm5.y(rfa1Var.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (qfa1Var.p() * i), rfa1Var.k);
                qfa1Var.q(byteBuffer, iMin);
                rfa1Var.k -= iMin;
                System.arraycopy(qfa1Var.l(), iMin * i, qfa1Var.l(), 0, rfa1Var.k * i);
                this.l.flip();
                this.o += (long) iP;
                this.m = this.l;
            }
        }
        ByteBuffer byteBuffer2 = this.m;
        this.m = f18.a;
        return byteBuffer2;
    }

    @Override // p.f18
    public final boolean d() {
        if (this.f134p) {
            rfa1 rfa1Var = this.k;
            if (rfa1Var != null) {
                dm5.y(rfa1Var.k >= 0);
                if (rfa1Var.i.p() * rfa1Var.k * rfa1Var.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p.f18
    public final c18 e(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c18Var.c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
        }
        int i2 = this.c;
        if (i2 == -1) {
            i2 = c18Var.a;
        }
        this.f = c18Var;
        c18 c18Var2 = new c18(i2, c18Var.b, i);
        this.g = c18Var2;
        this.j = true;
        return c18Var2;
    }

    @Override // p.f18
    public final void f(e18 e18Var) {
        if (isActive()) {
            c18 c18Var = this.f;
            this.h = c18Var;
            c18 c18Var2 = this.g;
            this.i = c18Var2;
            if (this.j) {
                this.k = new rfa1(c18Var.a, c18Var.b, this.d, this.e, c18Var2.a, c18Var.c == 4);
            } else {
                rfa1 rfa1Var = this.k;
                if (rfa1Var != null) {
                    rfa1Var.j = 0;
                    rfa1Var.k = 0;
                    rfa1Var.l = 0;
                    rfa1Var.m = 0;
                    rfa1Var.n = 0;
                    rfa1Var.o = 0;
                    rfa1Var.f126p = 0;
                    rfa1Var.q = 0.0d;
                    rfa1Var.i.flush();
                }
            }
        }
        this.m = f18.a;
        this.n = 0L;
        this.o = 0L;
        this.f134p = false;
    }

    @Override // p.f18
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            rfa1 rfa1Var = this.k;
            rfa1Var.getClass();
            this.n += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = rfa1Var.b;
            qfa1 qfa1Var = rfa1Var.i;
            int iP = iRemaining / (qfa1Var.p() * i);
            qfa1Var.h(iP);
            qfa1Var.n(byteBuffer, iRemaining);
            rfa1Var.j += iP;
            rfa1Var.b();
        }
    }

    @Override // p.f18
    public final void h() {
        rfa1 rfa1Var = this.k;
        if (rfa1Var != null) {
            int i = rfa1Var.j;
            float f = rfa1Var.c;
            float f2 = rfa1Var.d;
            double d = f / f2;
            double d2 = rfa1Var.e * f2;
            int i2 = rfa1Var.o;
            int i3 = rfa1Var.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + rfa1Var.q) + ((double) rfa1Var.l)) / d2) + 0.5d));
            rfa1Var.q = 0.0d;
            qfa1 qfa1Var = rfa1Var.i;
            int i4 = rfa1Var.h * 2;
            qfa1Var.h(i4 + i);
            qfa1Var.a(i * rfa1Var.b, i4);
            rfa1Var.j = i4 + rfa1Var.j;
            rfa1Var.b();
            if (rfa1Var.k > i3) {
                rfa1Var.k = Math.max(i3, 0);
            }
            rfa1Var.j = 0;
            rfa1Var.o = 0;
            rfa1Var.l = 0;
        }
        this.f134p = true;
    }

    @Override // p.f18
    public final long i(long j) {
        if (this.o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / ((double) this.d));
        }
        long j2 = this.n;
        rfa1 rfa1Var = this.k;
        rfa1Var.getClass();
        long jP = j2 - ((long) (rfa1Var.i.p() * (rfa1Var.j * rfa1Var.b)));
        int i = this.i.a;
        int i2 = this.h.a;
        long j3 = this.o;
        return i == i2 ? zoi1.g0(j, j3, jP, RoundingMode.DOWN) : zoi1.g0(j, j3 * ((long) i2), jP * ((long) i), RoundingMode.DOWN);
    }

    @Override // p.f18
    public final boolean isActive() {
        if (this.g.a != -1) {
            return this.b || Math.abs(this.d - 1.0f) >= 1.0E-4f || Math.abs(this.e - 1.0f) >= 1.0E-4f || this.g.a != this.f.a;
        }
        return false;
    }

    @Override // p.f18
    public final void reset() {
        this.d = 1.0f;
        this.e = 1.0f;
        c18 c18Var = c18.e;
        this.f = c18Var;
        this.g = c18Var;
        this.h = c18Var;
        this.i = c18Var;
        ByteBuffer byteBuffer = f18.a;
        this.l = byteBuffer;
        this.m = byteBuffer;
        this.c = -1;
        this.j = false;
        this.k = null;
        this.n = 0L;
        this.o = 0L;
        this.f134p = false;
    }
}
