package p;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dkh0 extends jca {
    public static final byte[] g2 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A1;
    public long B1;
    public int C1;
    public int D1;
    public ByteBuffer E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public byte J1;
    public byte K1;
    public byte L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public long P1;
    public long Q1;
    public boolean R1;
    public boolean S1;
    public final Context T0;
    public boolean T1;
    public final xjh0 U0;
    public boolean U1;
    public final boolean V0;
    public ExoPlaybackException V1;
    public final gar W0;
    public far W1;
    public final gar X0;
    public ckh0 X1;
    public final gar Y0;
    public long Y1;
    public final sfa Z0;
    public boolean Z1;
    public final MediaCodec.BufferInfo a1;
    public boolean a2;
    public final ArrayDeque b1;
    public boolean b2;
    public final pyp0 c1;
    public long c2;
    public final AtomicInteger d1;
    public iwg d2;
    public ie30 e1;
    public iwg e2;
    public ie30 f1;
    public t380 f2;
    public y8v g1;
    public y8v h1;
    public zo00 i1;
    public MediaCrypto j1;
    public float k1;
    public float l1;
    public yjh0 m1;
    public ie30 n1;
    public MediaFormat o1;
    public boolean p1;
    public float q1;
    public ArrayDeque r1;
    public MediaCodecRenderer$DecoderInitializationException s1;
    public bkh0 t1;
    public int u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public long z1;

    public dkh0(Context context, int i, xjh0 xjh0Var, boolean z) {
        super(i);
        this.T0 = context.getApplicationContext();
        this.U0 = xjh0Var;
        this.V0 = z;
        this.d1 = new AtomicInteger();
        this.W0 = new gar(0);
        this.X0 = new gar(0);
        this.Y0 = new gar(2);
        sfa sfaVar = new sfa(2);
        sfaVar.X = (byte) 32;
        this.Z0 = sfaVar;
        this.a1 = new MediaCodec.BufferInfo();
        this.k1 = 1.0f;
        this.l1 = 1.0f;
        this.b1 = new ArrayDeque();
        this.X1 = ckh0.i;
        sfaVar.i(0);
        sfaVar.d.order(ByteOrder.nativeOrder());
        pyp0 pyp0Var = new pyp0((byte) 0);
        pyp0Var.d = f18.a;
        pyp0Var.c = 0;
        pyp0Var.b = 2;
        this.c1 = pyp0Var;
        this.q1 = -1.0f;
        this.u1 = 0;
        this.J1 = (byte) 0;
        this.C1 = -1;
        this.D1 = -1;
        this.B1 = -9223372036854775807L;
        this.P1 = -9223372036854775807L;
        this.Q1 = -9223372036854775807L;
        this.Y1 = -9223372036854775807L;
        this.z1 = -9223372036854775807L;
        this.K1 = (byte) 0;
        this.L1 = (byte) 0;
        this.W1 = new far();
        this.b2 = false;
        this.c2 = 0L;
        int i2 = t380.c;
        this.f2 = kg11.t;
        iwg iwgVar = iwg.b;
        this.d2 = iwgVar;
        this.e2 = iwgVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public final void B0() throws ExoPlaybackException {
        byte b = this.L1;
        if (b == 1) {
            c0();
            return;
        }
        if (b == 2) {
            c0();
            S0();
        } else if (b != 3) {
            this.S1 = true;
            F0();
        } else {
            E0();
            o0();
        }
    }

    public abstract boolean C0(long j, long j2, yjh0 yjh0Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ie30 ie30Var);

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public final boolean D0(int i) throws ExoPlaybackException {
        w2z w2zVar = this.c;
        w2zVar.b();
        gar garVar = this.W0;
        garVar.g();
        int iG = G(w2zVar, garVar, i | 4);
        if (iG == -5) {
            v0(w2zVar);
            return true;
        }
        if (iG != -4 || !garVar.f(4)) {
            return false;
        }
        this.R1 = true;
        B0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // p.jca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E(p.ie30[] r13, long r14, long r16, p.p2i0 r18) {
        /*
            r12 = this;
            long r7 = r12.R0
            p.p641 r13 = r12.i
            r13.getClass()
            int r9 = r13.getFlags()
            p.ckh0 r13 = r12.X1
            long r0 = r13.c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 != 0) goto L30
            p.ckh0 r0 = new p.ckh0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.K0(r0)
            boolean r13 = r12.a2
            if (r13 == 0) goto L63
            r12.z0()
            return
        L30:
            java.util.ArrayDeque r13 = r12.b1
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L64
            long r0 = r12.P1
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L48
            long r2 = r12.Y1
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L64
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L64
        L48:
            p.ckh0 r0 = new p.ckh0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.K0(r0)
            p.ckh0 r13 = r12.X1
            long r0 = r13.c
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 == 0) goto L63
            r12.z0()
        L63:
            return
        L64:
            p.ckh0 r0 = new p.ckh0
            long r1 = r12.P1
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r13.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dkh0.E(p.ie30[], long, long, p.p2i0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0() {
        try {
            yjh0 yjh0Var = this.m1;
            if (yjh0Var != null) {
                yjh0Var.release();
                this.W1.b++;
                bkh0 bkh0Var = this.t1;
                bkh0Var.getClass();
                u0(bkh0Var.a);
            }
            this.m1 = null;
            try {
                MediaCrypto mediaCrypto = this.j1;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.j1 = null;
                J0(null);
                I0();
            }
        } catch (Throwable th) {
            this.m1 = null;
            try {
                MediaCrypto mediaCrypto2 = this.j1;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.j1 = null;
                J0(null);
                I0();
            }
        }
    }

    @Override // p.jca
    public final void F() {
        j0().e = this.R0;
    }

    public abstract void F0();

    public final void G0() {
        this.P1 = -9223372036854775807L;
        this.Q1 = -9223372036854775807L;
        j0().h = -9223372036854775807L;
        this.Y1 = -9223372036854775807L;
        this.H1 = false;
        this.Z0.g();
        this.Y0.g();
        this.G1 = false;
        ByteBuffer byteBuffer = f18.a;
        pyp0 pyp0Var = this.c1;
        pyp0Var.d = byteBuffer;
        pyp0Var.c = 0;
        pyp0Var.b = 2;
    }

    public void H0() {
        this.C1 = -1;
        this.X0.d = null;
        this.D1 = -1;
        this.E1 = null;
        this.P1 = -9223372036854775807L;
        this.Q1 = -9223372036854775807L;
        j0().h = -9223372036854775807L;
        this.Y1 = -9223372036854775807L;
        this.B1 = -9223372036854775807L;
        this.N1 = false;
        this.z1 = -9223372036854775807L;
        this.M1 = false;
        this.w1 = false;
        this.x1 = false;
        this.K1 = (byte) 0;
        this.L1 = (byte) 0;
        this.J1 = this.I1 ? (byte) 1 : (byte) 0;
        this.b2 = false;
        this.c2 = 0L;
    }

    @Override // p.jca
    public void I(long j, long j2) {
        boolean z = false;
        if (this.U1) {
            this.U1 = false;
            B0();
        }
        ExoPlaybackException exoPlaybackException = this.V1;
        if (exoPlaybackException != null) {
            this.V1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.S1) {
                F0();
                return;
            }
            if (this.e1 != null || D0(2)) {
                o0();
                if (this.F1) {
                    Trace.beginSection("bypassRender");
                    while (W(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.m1 != null) {
                    this.g.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (a0(j, j2)) {
                    }
                    while (b0()) {
                    }
                    Trace.endSection();
                } else {
                    far farVar = this.W1;
                    int i = farVar.d;
                    p641 p641Var = this.i;
                    p641Var.getClass();
                    farVar.d = i + p641Var.s(j - this.X);
                    D0(1);
                }
                synchronized (this.W1) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw c(e, this.e1, false, zoi1.E(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            r0(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                E0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionY = Y(e2, this.t1);
            throw c(mediaCodecDecoderExceptionY, this.e1, z, mediaCodecDecoderExceptionY.a == 1101 ? 4006 : 4003);
        }
    }

    public final void I0() {
        H0();
        this.V1 = null;
        this.r1 = null;
        this.t1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = false;
        this.O1 = false;
        this.q1 = -1.0f;
        this.u1 = 0;
        this.v1 = false;
        this.y1 = false;
        this.A1 = false;
        this.I1 = false;
        this.J1 = (byte) 0;
    }

    public final void J0(y8v y8vVar) {
        y8v y8vVar2 = this.g1;
        if (y8vVar2 != y8vVar) {
            if (y8vVar != null) {
                y8vVar.g(null);
            }
            if (y8vVar2 != null) {
                y8vVar2.c(null);
            }
        }
        this.g1 = y8vVar;
    }

    public final void K0(ckh0 ckh0Var) {
        this.X1 = ckh0Var;
        long j = ckh0Var.c;
        if (j != -9223372036854775807L) {
            this.Z1 = true;
            x0(j);
        }
    }

    public boolean L0(gar garVar) {
        return false;
    }

    public boolean M0() {
        return this.M1;
    }

    @Override // p.jca
    public void N(float f, float f2) {
        this.k1 = f;
        this.l1 = f2;
        R0(this.n1);
    }

    public boolean N0(bkh0 bkh0Var) {
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public boolean O0() {
        byte b = this.L1;
        if (b == 3 || (this.v1 && !this.O1)) {
            return true;
        }
        if (b != 2) {
            return false;
        }
        try {
            S0();
            return false;
        } catch (ExoPlaybackException e) {
            oon1.I("Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean P0(ie30 ie30Var) {
        return false;
    }

    public abstract int Q0(ie30 ie30Var);

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    @Override // p.jca
    public final int R(ie30 ie30Var) throws ExoPlaybackException {
        try {
            return Q0(ie30Var);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw c(e, ie30Var, false, 4002);
        }
    }

    public final void R0(ie30 ie30Var) {
        if (this.m1 == null || this.L1 == 3 || this.h == 0) {
            return;
        }
        float f = this.l1;
        ie30Var.getClass();
        ie30[] ie30VarArr = this.t;
        ie30VarArr.getClass();
        float fG0 = g0(f, ie30Var, ie30VarArr);
        float f2 = this.q1;
        if (f2 == fG0 || fG0 == -1.0f) {
            return;
        }
        if (f2 != -1.0f || fG0 > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fG0);
            yjh0 yjh0Var = this.m1;
            yjh0Var.getClass();
            yjh0Var.a(bundle);
            this.q1 = fG0;
        }
    }

    @Override // p.jca
    public final int S() {
        return 8;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public final void S0() throws ExoPlaybackException {
        y8v y8vVar = this.h1;
        y8vVar.getClass();
        nco ncoVarF = y8vVar.f();
        if (ncoVarF instanceof mk30) {
            try {
                MediaCrypto mediaCrypto = this.j1;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((mk30) ncoVarF).b);
            } catch (MediaCryptoException e) {
                throw c(e, this.e1, false, 6006);
            }
        }
        J0(this.h1);
        this.K1 = (byte) 0;
        this.L1 = (byte) 0;
    }

    public final void T0(long j) {
        ie30 ie30Var = (ie30) this.X1.d.C(j);
        if (ie30Var == null && this.Z1 && this.o1 != null) {
            ie30Var = (ie30) this.X1.d.B();
        }
        if (ie30Var != null) {
            this.f1 = ie30Var;
        } else if (!this.p1 || (ie30Var = this.f1) == null) {
            return;
        }
        w0(ie30Var, this.o1);
        this.p1 = false;
        this.Z1 = false;
    }

    public final void V(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.d2.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02f0  */
    public final boolean W(long j, long j2) {
        sfa sfaVar;
        int length;
        ByteBuffer byteBuffer;
        dm5.y(!this.S1);
        sfa sfaVar2 = this.Z0;
        if (sfaVar2.l()) {
            ByteBuffer byteBuffer2 = sfaVar2.d;
            int i = this.D1;
            int i2 = sfaVar2.t;
            long j3 = sfaVar2.f;
            boolean zN0 = n0(this.Y, sfaVar2.i);
            boolean zF = sfaVar2.f(4);
            ie30 ie30Var = this.f1;
            ie30Var.getClass();
            sfaVar = sfaVar2;
            if (!C0(j, j2, null, byteBuffer2, i, 0, i2, j3, zN0, zF, ie30Var)) {
                return false;
            }
            y0(sfaVar.i);
            sfaVar.g();
        } else {
            sfaVar = sfaVar2;
        }
        if (this.R1) {
            this.S1 = true;
            return false;
        }
        boolean z = this.G1;
        gar garVar = this.Y0;
        if (z) {
            dm5.y(sfaVar.k(garVar));
            this.G1 = false;
        }
        if (this.H1) {
            if (sfaVar.l()) {
                return true;
            }
            this.F1 = false;
            G0();
            this.H1 = false;
            o0();
            if (!this.F1) {
                return false;
            }
        }
        dm5.y(!this.R1);
        w2z w2zVar = this.c;
        w2zVar.b();
        garVar.g();
        while (true) {
            garVar.g();
            int iG = G(w2zVar, garVar, 0);
            if (iG == -5) {
                v0(w2zVar);
                break;
            }
            if (iG != -4) {
                if (iG != -3) {
                    bhn0.w();
                    return false;
                }
                if (!q()) {
                    break;
                }
                j0().h = this.P1;
                break;
            }
            if (garVar.f(4)) {
                this.R1 = true;
                j0().h = this.P1;
                break;
            }
            this.P1 = Math.max(this.P1, garVar.f);
            if (q() || this.X0.f(536870912)) {
                j0().h = this.P1;
            }
            byte[] bArr = null;
            if (this.T1) {
                ie30 ie30Var2 = this.e1;
                ie30Var2.getClass();
                this.f1 = ie30Var2;
                if (Objects.equals(ie30Var2.f66p, "audio/opus") && !this.f1.s.isEmpty()) {
                    byte[] bArr2 = (byte[]) this.f1.s.get(0);
                    int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                    ge30 ge30VarA = this.f1.a();
                    ge30VarA.M = i3;
                    this.f1 = new ie30(ge30VarA);
                }
                w0(this.f1, null);
                this.T1 = false;
            }
            garVar.j();
            ie30 ie30Var3 = this.f1;
            if (ie30Var3 == null || !Objects.equals(ie30Var3.f66p, "audio/opus")) {
                sfaVar = sfaVar;
            } else {
                if (garVar.f(268435456)) {
                    garVar.b = this.f1;
                    l0(garVar);
                }
                if (this.Y - garVar.f <= 80000) {
                    List list = this.f1.s;
                    garVar.d.getClass();
                    if (garVar.d.limit() - garVar.d.position() == 0) {
                        sfaVar = sfaVar;
                    } else {
                        pyp0 pyp0Var = this.c1;
                        if (pyp0Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = garVar.d;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i4 = iLimit - iPosition;
                        int i5 = (i4 + 255) / 255;
                        int i6 = i5 + 27 + i4;
                        if (pyp0Var.b == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i6 = length + 44 + i6;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) pyp0Var.d).capacity() < i6) {
                            pyp0Var.d = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) pyp0Var.d).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) pyp0Var.d;
                        if (pyp0Var.b == 2) {
                            if (bArr != null) {
                                pyp0.z(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(o0c.s(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, zoi1.q(byteBuffer.arrayOffset(), byteBuffer.array(), bArr.length + 28, 0));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(pyp0.e);
                            }
                            byteBuffer.put(pyp0.f);
                        } else {
                            sfaVar = sfaVar;
                            byteBuffer = byteBuffer4;
                        }
                        int iP = pyp0Var.c + ((int) ((bs51.p(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                        pyp0Var.c = iP;
                        pyp0.z(byteBuffer, iP, pyp0Var.b, i5, false);
                        for (int i7 = 0; i7 < i5; i7++) {
                            if (i4 >= 255) {
                                byteBuffer.put((byte) -1);
                                i4 -= 255;
                            } else {
                                byteBuffer.put((byte) i4);
                                i4 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (pyp0Var.b == 2) {
                            byteBuffer.putInt(length + 66, zoi1.q(byteBuffer.arrayOffset() + length + 44, byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        } else {
                            byteBuffer.putInt(22, zoi1.q(byteBuffer.arrayOffset(), byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        }
                        pyp0Var.b++;
                        pyp0Var.d = byteBuffer;
                        garVar.g();
                        garVar.i(((ByteBuffer) pyp0Var.d).remaining());
                        garVar.d.put((ByteBuffer) pyp0Var.d);
                        garVar.j();
                    }
                } else {
                    sfaVar = sfaVar;
                }
            }
            if (sfaVar.l()) {
                long j4 = this.Y;
                sfaVar = sfaVar;
                if (n0(j4, sfaVar.i) == n0(j4, garVar.f)) {
                }
                this.G1 = true;
                break;
            }
            sfaVar = sfaVar;
            if (!sfaVar.k(garVar)) {
                this.G1 = true;
                break;
            }
        }
        if (sfaVar.l()) {
            sfaVar.j();
        }
        return sfaVar.l() || this.R1 || this.H1;
    }

    public abstract iar X(bkh0 bkh0Var, ie30 ie30Var, ie30 ie30Var2, boolean z);

    public MediaCodecDecoderException Y(IllegalStateException illegalStateException, bkh0 bkh0Var) {
        return new MediaCodecDecoderException(illegalStateException, bkh0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public final boolean Z() throws ExoPlaybackException {
        if (!this.M1) {
            S0();
            return true;
        }
        this.K1 = (byte) 1;
        if (O0()) {
            this.L1 = (byte) 3;
            return false;
        }
        this.L1 = (byte) 2;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    public final boolean a0(long j, long j2) throws ExoPlaybackException {
        boolean z;
        yjh0 yjh0Var = this.m1;
        yjh0Var.getClass();
        int i = this.D1;
        MediaCodec.BufferInfo bufferInfo = this.a1;
        if (i < 0) {
            int iQ = yjh0Var.q(bufferInfo);
            if (iQ < 0) {
                if (iQ != -2) {
                    if (this.y1 && (this.R1 || this.K1 == 2)) {
                        B0();
                    }
                    long j3 = this.z1;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.g.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            B0();
                            return false;
                        }
                    }
                    return false;
                }
                this.O1 = true;
                yjh0 yjh0Var2 = this.m1;
                yjh0Var2.getClass();
                MediaFormat mediaFormatE = yjh0Var2.e();
                if (this.u1 != 0 && mediaFormatE.getInteger("width") == 32 && mediaFormatE.getInteger("height") == 32) {
                    this.x1 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.f2.isEmpty()) {
                    iwg iwgVar = new iwg((HashMap) iwg.a(mediaFormatE, this.f2).b);
                    if (!iwgVar.equals(this.e2)) {
                        this.e2 = iwgVar;
                        t0(iwgVar);
                    }
                }
                this.o1 = mediaFormatE;
                this.p1 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.c2;
            if (this.x1) {
                this.x1 = false;
                yjh0Var.l(iQ);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                B0();
                return false;
            }
            this.D1 = iQ;
            ByteBuffer byteBufferS = yjh0Var.s(iQ);
            this.E1 = byteBufferS;
            if (byteBufferS != null) {
                byteBufferS.position(bufferInfo.offset);
                this.E1.limit(bufferInfo.offset + bufferInfo.size);
            }
            T0(bufferInfo.presentationTimeUs);
        }
        ckh0 ckh0Var = this.X1;
        ckh0 ckh0Var2 = ckh0.i;
        if ((ckh0Var.f & 1) != 0) {
            long j5 = ckh0Var.e;
            if (j5 == -9223372036854775807L || bufferInfo.presentationTimeUs - ckh0Var.c < j5) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z2 = this.b2 || bufferInfo.presentationTimeUs < this.Y || z;
        long j6 = ckh0Var.h;
        boolean z3 = (j6 == -9223372036854775807L || j6 > bufferInfo.presentationTimeUs || z) ? false : true;
        ByteBuffer byteBuffer = this.E1;
        int i2 = this.D1;
        int i3 = bufferInfo.flags;
        long j7 = bufferInfo.presentationTimeUs;
        ie30 ie30Var = this.f1;
        ie30Var.getClass();
        if (!C0(j, j2, yjh0Var, byteBuffer, i2, i3, 1, j7, z2, z3, ie30Var)) {
            return false;
        }
        y0(bufferInfo.presentationTimeUs);
        boolean z4 = (bufferInfo.flags & 4) != 0;
        if (!z4 && this.N1 && z3) {
            this.g.getClass();
            this.z1 = System.currentTimeMillis();
        }
        this.D1 = -1;
        this.E1 = null;
        if (!z4) {
            return true;
        }
        B0();
        return false;
    }

    @Override // p.jca
    public void b(int i, Object obj) {
        int i2;
        if (i == 11) {
            zo00 zo00Var = (zo00) obj;
            zo00Var.getClass();
            this.i1 = zo00Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                t380 t380Var = (t380) obj;
                if (this.f2.equals(t380Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet((Collection) t380Var);
                    HashSet hashSet2 = new HashSet();
                    mjh1 mjh1VarK = this.f2.k();
                    while (mjh1VarK.hasNext()) {
                        String str = (String) mjh1VarK.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    yjh0 yjh0Var = this.m1;
                    if (yjh0Var != null) {
                        if (!hashSet2.isEmpty()) {
                            yjh0Var.u(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            yjh0Var.t(new ArrayList(hashSet));
                        }
                    }
                }
                this.f2 = t380Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            iwg iwgVar = (iwg) obj;
            this.d2 = iwgVar;
            yjh0 yjh0Var2 = this.m1;
            if (yjh0Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : iwgVar.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                yjh0Var2.a(bundle);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    /* JADX WARN: Code duplicated, block: B:102:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:121:0x021d  */
    /* JADX WARN: Code duplicated, block: B:130:0x00a2 A[EDGE_INSN: B:130:0x00a2->B:33:0x00a2 BREAK  A[LOOP:0: B:30:0x0080->B:32:0x008d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[LOOP:0: B:30:0x0080->B:32:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x017c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b0  */
    public final boolean b0() throws ExoPlaybackException {
        int iPosition;
        w2z w2zVar;
        int i;
        long j;
        boolean zF;
        long j2;
        boolean z;
        ckh0 ckh0VarJ0;
        long j3;
        int iF0;
        long j4;
        int i2;
        long j5;
        int[] iArr;
        ckh0 ckh0VarJ1;
        long j6;
        ckh0 ckh0VarJ2;
        long j7;
        int i3;
        ie30 ie30Var;
        gar garVar = this.X0;
        oco ocoVar = garVar.c;
        ckh0 ckh0VarJ3 = j0();
        p641 p641Var = this.i;
        p641Var.getClass();
        ckh0VarJ3.f = p641Var.getFlags();
        yjh0 yjh0Var = this.m1;
        if (yjh0Var != null && this.K1 != 2 && !this.R1) {
            if (this.C1 < 0) {
                int iP = yjh0Var.p();
                this.C1 = iP;
                if (iP >= 0) {
                    garVar.d = yjh0Var.i(iP);
                    garVar.g();
                    if (this.K1 == 1) {
                        if (!this.y1) {
                            this.N1 = true;
                            yjh0Var.b(0L, this.C1, 0, 4);
                            this.C1 = -1;
                            garVar.d = null;
                        }
                        this.K1 = (byte) 2;
                        return false;
                    }
                    if (this.w1) {
                        this.w1 = false;
                        ByteBuffer byteBuffer = garVar.d;
                        byteBuffer.getClass();
                        byteBuffer.put(g2);
                        yjh0Var.b(0L, this.C1, 38, 0);
                        this.C1 = -1;
                        garVar.d = null;
                        this.M1 = true;
                        return true;
                    }
                    if (this.J1 == 1) {
                        i3 = 0;
                        while (true) {
                            ie30Var = this.n1;
                            ie30Var.getClass();
                            if (i3 < ie30Var.s.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.n1.s.get(i3);
                            ByteBuffer byteBuffer2 = garVar.d;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.J1 = (byte) 2;
                    }
                    ByteBuffer byteBuffer3 = garVar.d;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    w2zVar = this.c;
                    w2zVar.b();
                    try {
                        yjh0Var.n(new ag20(this, w2zVar, (byte) 16));
                        i = this.d1.get();
                        if (i == -3) {
                            if (q()) {
                                ckh0 ckh0VarJ4 = j0();
                                ckh0VarJ2 = j0();
                                ckh0 ckh0Var = ckh0.i;
                                if ((ckh0VarJ2.f & 1) != 0) {
                                    j7 = this.Q1;
                                } else {
                                    j7 = this.P1;
                                }
                                ckh0VarJ4.h = j7;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.J1 == 2) {
                                    garVar.g();
                                    this.J1 = (byte) 1;
                                }
                                v0(w2zVar);
                                return true;
                            }
                            if (garVar.f(4)) {
                                if (!this.M1 || garVar.f(1)) {
                                    j = garVar.f;
                                    if (!L0(garVar)) {
                                        zF = garVar.f(1073741824);
                                        if (zF && iPosition != 0) {
                                            iArr = ocoVar.d;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                                ocoVar.d = iArr;
                                                ocoVar.i.numBytesOfClearData = iArr;
                                            }
                                            iArr[0] = iArr[0] + iPosition;
                                        }
                                        if (this.T1) {
                                            ckh0 ckh0VarJ5 = j0();
                                            w4c0 w4c0Var = ckh0VarJ5.d;
                                            ie30 ie30Var2 = this.e1;
                                            ie30Var2.getClass();
                                            w4c0Var.a(j, ie30Var2);
                                            ckh0VarJ5.g = true;
                                            this.T1 = false;
                                        }
                                        this.P1 = Math.max(this.P1, j);
                                        j2 = this.R0;
                                        if (j2 != -9223372036854775807L) {
                                            z = true;
                                            if (j - j0().c < j2) {
                                            }
                                            if (q() || garVar.f(536870912)) {
                                                ckh0 ckh0VarJ6 = j0();
                                                ckh0VarJ0 = j0();
                                                ckh0 ckh0Var2 = ckh0.i;
                                                if ((ckh0VarJ0.f & 1) != 0) {
                                                    j3 = this.Q1;
                                                } else {
                                                    j3 = this.P1;
                                                }
                                                ckh0VarJ6.h = j3;
                                            }
                                            garVar.j();
                                            if (garVar.f(268435456)) {
                                                l0(garVar);
                                            }
                                            if (this.b2) {
                                                j5 = this.P1;
                                                if (j <= j5) {
                                                    this.c2 = (j5 - j) + 1 + this.c2;
                                                }
                                                this.P1 = j;
                                                this.Q1 = j;
                                                this.b2 = false;
                                            }
                                            A0(garVar);
                                            iF0 = f0(garVar);
                                            j4 = j + this.c2;
                                            i2 = this.C1;
                                            if (zF) {
                                                yjh0Var.c(i2, ocoVar, j4, iF0);
                                            } else {
                                                ByteBuffer byteBuffer4 = garVar.d;
                                                byteBuffer4.getClass();
                                                yjh0Var.b(j4, i2, byteBuffer4.limit(), iF0);
                                            }
                                            this.C1 = -1;
                                            garVar.d = null;
                                            boolean z2 = z;
                                            this.M1 = z2;
                                            this.J1 = (byte) 0;
                                            this.W1.c += z2 ? 1 : 0;
                                            return z2;
                                        }
                                        z = true;
                                        this.Q1 = Math.max(this.Q1, j);
                                        if (q()) {
                                            ckh0 ckh0VarJ7 = j0();
                                            ckh0VarJ0 = j0();
                                            ckh0 ckh0Var3 = ckh0.i;
                                            if ((ckh0VarJ0.f & 1) != 0) {
                                                j3 = this.Q1;
                                            } else {
                                                j3 = this.P1;
                                            }
                                            ckh0VarJ7.h = j3;
                                        } else {
                                            ckh0 ckh0VarJ8 = j0();
                                            ckh0VarJ0 = j0();
                                            ckh0 ckh0Var4 = ckh0.i;
                                            if ((ckh0VarJ0.f & 1) != 0) {
                                                j3 = this.Q1;
                                            } else {
                                                j3 = this.P1;
                                            }
                                            ckh0VarJ8.h = j3;
                                        }
                                        garVar.j();
                                        if (garVar.f(268435456)) {
                                            l0(garVar);
                                        }
                                        if (this.b2) {
                                            j5 = this.P1;
                                            if (j <= j5) {
                                                this.c2 = (j5 - j) + 1 + this.c2;
                                            }
                                            this.P1 = j;
                                            this.Q1 = j;
                                            this.b2 = false;
                                        }
                                        A0(garVar);
                                        iF0 = f0(garVar);
                                        j4 = j + this.c2;
                                        i2 = this.C1;
                                        if (zF) {
                                            yjh0Var.c(i2, ocoVar, j4, iF0);
                                        } else {
                                            ByteBuffer byteBuffer5 = garVar.d;
                                            byteBuffer5.getClass();
                                            yjh0Var.b(j4, i2, byteBuffer5.limit(), iF0);
                                        }
                                        this.C1 = -1;
                                        garVar.d = null;
                                        boolean z3 = z;
                                        this.M1 = z3;
                                        this.J1 = (byte) 0;
                                        this.W1.c += z3 ? 1 : 0;
                                        return z3;
                                    }
                                } else {
                                    garVar.g();
                                    this.W1.d++;
                                    if (this.J1 == 2) {
                                        this.J1 = (byte) 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            ckh0 ckh0VarJ9 = j0();
                            ckh0VarJ1 = j0();
                            ckh0 ckh0Var5 = ckh0.i;
                            if ((ckh0VarJ1.f & 1) != 0) {
                                j6 = this.Q1;
                            } else {
                                j6 = this.P1;
                            }
                            ckh0VarJ9.h = j6;
                            if (this.J1 == 2) {
                                garVar.g();
                                this.J1 = (byte) 1;
                            }
                            this.R1 = true;
                            if (!this.M1) {
                                B0();
                                return false;
                            }
                            if (!this.y1) {
                                this.N1 = true;
                                yjh0Var.b(0L, this.C1, 0, 4);
                                this.C1 = -1;
                                garVar.d = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e) {
                        r0(e);
                        D0(0);
                        c0();
                        return true;
                    }
                }
            } else {
                if (this.K1 == 1) {
                    if (!this.y1) {
                        this.N1 = true;
                        yjh0Var.b(0L, this.C1, 0, 4);
                        this.C1 = -1;
                        garVar.d = null;
                    }
                    this.K1 = (byte) 2;
                    return false;
                }
                if (this.w1) {
                    this.w1 = false;
                    ByteBuffer byteBuffer6 = garVar.d;
                    byteBuffer6.getClass();
                    byteBuffer6.put(g2);
                    yjh0Var.b(0L, this.C1, 38, 0);
                    this.C1 = -1;
                    garVar.d = null;
                    this.M1 = true;
                    return true;
                }
                if (this.J1 == 1) {
                    i3 = 0;
                    while (true) {
                        ie30Var = this.n1;
                        ie30Var.getClass();
                        if (i3 < ie30Var.s.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.n1.s.get(i3);
                        ByteBuffer byteBuffer7 = garVar.d;
                        byteBuffer7.getClass();
                        byteBuffer7.put(bArr2);
                        i3++;
                    }
                    this.J1 = (byte) 2;
                }
                ByteBuffer byteBuffer8 = garVar.d;
                byteBuffer8.getClass();
                iPosition = byteBuffer8.position();
                w2zVar = this.c;
                w2zVar.b();
                yjh0Var.n(new ag20(this, w2zVar, (byte) 16));
                i = this.d1.get();
                if (i == -3) {
                    if (q()) {
                        ckh0 ckh0VarJ10 = j0();
                        ckh0VarJ2 = j0();
                        ckh0 ckh0Var6 = ckh0.i;
                        if ((ckh0VarJ2.f & 1) != 0) {
                            j7 = this.Q1;
                        } else {
                            j7 = this.P1;
                        }
                        ckh0VarJ10.h = j7;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.J1 == 2) {
                            garVar.g();
                            this.J1 = (byte) 1;
                        }
                        v0(w2zVar);
                        return true;
                    }
                    if (garVar.f(4)) {
                        if (this.M1) {
                            j = garVar.f;
                            if (!L0(garVar)) {
                                zF = garVar.f(1073741824);
                                if (zF) {
                                    iArr = ocoVar.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        ocoVar.d = iArr;
                                        ocoVar.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                if (this.T1) {
                                    ckh0 ckh0VarJ11 = j0();
                                    w4c0 w4c0Var2 = ckh0VarJ11.d;
                                    ie30 ie30Var3 = this.e1;
                                    ie30Var3.getClass();
                                    w4c0Var2.a(j, ie30Var3);
                                    ckh0VarJ11.g = true;
                                    this.T1 = false;
                                }
                                this.P1 = Math.max(this.P1, j);
                                j2 = this.R0;
                                if (j2 != -9223372036854775807L) {
                                    z = true;
                                    if (j - j0().c < j2) {
                                    }
                                    if (q()) {
                                        ckh0 ckh0VarJ12 = j0();
                                        ckh0VarJ0 = j0();
                                        ckh0 ckh0Var7 = ckh0.i;
                                        if ((ckh0VarJ0.f & 1) != 0) {
                                            j3 = this.Q1;
                                        } else {
                                            j3 = this.P1;
                                        }
                                        ckh0VarJ12.h = j3;
                                    } else {
                                        ckh0 ckh0VarJ13 = j0();
                                        ckh0VarJ0 = j0();
                                        ckh0 ckh0Var8 = ckh0.i;
                                        if ((ckh0VarJ0.f & 1) != 0) {
                                            j3 = this.Q1;
                                        } else {
                                            j3 = this.P1;
                                        }
                                        ckh0VarJ13.h = j3;
                                    }
                                    garVar.j();
                                    if (garVar.f(268435456)) {
                                        l0(garVar);
                                    }
                                    if (this.b2) {
                                        j5 = this.P1;
                                        if (j <= j5) {
                                            this.c2 = (j5 - j) + 1 + this.c2;
                                        }
                                        this.P1 = j;
                                        this.Q1 = j;
                                        this.b2 = false;
                                    }
                                    A0(garVar);
                                    iF0 = f0(garVar);
                                    j4 = j + this.c2;
                                    i2 = this.C1;
                                    if (zF) {
                                        yjh0Var.c(i2, ocoVar, j4, iF0);
                                    } else {
                                        ByteBuffer byteBuffer9 = garVar.d;
                                        byteBuffer9.getClass();
                                        yjh0Var.b(j4, i2, byteBuffer9.limit(), iF0);
                                    }
                                    this.C1 = -1;
                                    garVar.d = null;
                                    boolean z4 = z;
                                    this.M1 = z4;
                                    this.J1 = (byte) 0;
                                    this.W1.c += z4 ? 1 : 0;
                                    return z4;
                                }
                                z = true;
                                this.Q1 = Math.max(this.Q1, j);
                                if (q()) {
                                    ckh0 ckh0VarJ14 = j0();
                                    ckh0VarJ0 = j0();
                                    ckh0 ckh0Var9 = ckh0.i;
                                    if ((ckh0VarJ0.f & 1) != 0) {
                                        j3 = this.Q1;
                                    } else {
                                        j3 = this.P1;
                                    }
                                    ckh0VarJ14.h = j3;
                                } else {
                                    ckh0 ckh0VarJ15 = j0();
                                    ckh0VarJ0 = j0();
                                    ckh0 ckh0Var10 = ckh0.i;
                                    if ((ckh0VarJ0.f & 1) != 0) {
                                        j3 = this.Q1;
                                    } else {
                                        j3 = this.P1;
                                    }
                                    ckh0VarJ15.h = j3;
                                }
                                garVar.j();
                                if (garVar.f(268435456)) {
                                    l0(garVar);
                                }
                                if (this.b2) {
                                    j5 = this.P1;
                                    if (j <= j5) {
                                        this.c2 = (j5 - j) + 1 + this.c2;
                                    }
                                    this.P1 = j;
                                    this.Q1 = j;
                                    this.b2 = false;
                                }
                                A0(garVar);
                                iF0 = f0(garVar);
                                j4 = j + this.c2;
                                i2 = this.C1;
                                if (zF) {
                                    yjh0Var.c(i2, ocoVar, j4, iF0);
                                } else {
                                    ByteBuffer byteBuffer10 = garVar.d;
                                    byteBuffer10.getClass();
                                    yjh0Var.b(j4, i2, byteBuffer10.limit(), iF0);
                                }
                                this.C1 = -1;
                                garVar.d = null;
                                boolean z5 = z;
                                this.M1 = z5;
                                this.J1 = (byte) 0;
                                this.W1.c += z5 ? 1 : 0;
                                return z5;
                            }
                        } else {
                            j = garVar.f;
                            if (!L0(garVar)) {
                                zF = garVar.f(1073741824);
                                if (zF) {
                                    iArr = ocoVar.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        ocoVar.d = iArr;
                                        ocoVar.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                if (this.T1) {
                                    ckh0 ckh0VarJ16 = j0();
                                    w4c0 w4c0Var3 = ckh0VarJ16.d;
                                    ie30 ie30Var4 = this.e1;
                                    ie30Var4.getClass();
                                    w4c0Var3.a(j, ie30Var4);
                                    ckh0VarJ16.g = true;
                                    this.T1 = false;
                                }
                                this.P1 = Math.max(this.P1, j);
                                j2 = this.R0;
                                if (j2 != -9223372036854775807L) {
                                    z = true;
                                    if (j - j0().c < j2) {
                                    }
                                    if (q()) {
                                        ckh0 ckh0VarJ17 = j0();
                                        ckh0VarJ0 = j0();
                                        ckh0 ckh0Var11 = ckh0.i;
                                        if ((ckh0VarJ0.f & 1) != 0) {
                                            j3 = this.Q1;
                                        } else {
                                            j3 = this.P1;
                                        }
                                        ckh0VarJ17.h = j3;
                                    } else {
                                        ckh0 ckh0VarJ18 = j0();
                                        ckh0VarJ0 = j0();
                                        ckh0 ckh0Var12 = ckh0.i;
                                        if ((ckh0VarJ0.f & 1) != 0) {
                                            j3 = this.Q1;
                                        } else {
                                            j3 = this.P1;
                                        }
                                        ckh0VarJ18.h = j3;
                                    }
                                    garVar.j();
                                    if (garVar.f(268435456)) {
                                        l0(garVar);
                                    }
                                    if (this.b2) {
                                        j5 = this.P1;
                                        if (j <= j5) {
                                            this.c2 = (j5 - j) + 1 + this.c2;
                                        }
                                        this.P1 = j;
                                        this.Q1 = j;
                                        this.b2 = false;
                                    }
                                    A0(garVar);
                                    iF0 = f0(garVar);
                                    j4 = j + this.c2;
                                    i2 = this.C1;
                                    if (zF) {
                                        yjh0Var.c(i2, ocoVar, j4, iF0);
                                    } else {
                                        ByteBuffer byteBuffer11 = garVar.d;
                                        byteBuffer11.getClass();
                                        yjh0Var.b(j4, i2, byteBuffer11.limit(), iF0);
                                    }
                                    this.C1 = -1;
                                    garVar.d = null;
                                    boolean z6 = z;
                                    this.M1 = z6;
                                    this.J1 = (byte) 0;
                                    this.W1.c += z6 ? 1 : 0;
                                    return z6;
                                }
                                z = true;
                                this.Q1 = Math.max(this.Q1, j);
                                if (q()) {
                                    ckh0 ckh0VarJ19 = j0();
                                    ckh0VarJ0 = j0();
                                    ckh0 ckh0Var13 = ckh0.i;
                                    if ((ckh0VarJ0.f & 1) != 0) {
                                        j3 = this.Q1;
                                    } else {
                                        j3 = this.P1;
                                    }
                                    ckh0VarJ19.h = j3;
                                } else {
                                    ckh0 ckh0VarJ110 = j0();
                                    ckh0VarJ0 = j0();
                                    ckh0 ckh0Var14 = ckh0.i;
                                    if ((ckh0VarJ0.f & 1) != 0) {
                                        j3 = this.Q1;
                                    } else {
                                        j3 = this.P1;
                                    }
                                    ckh0VarJ110.h = j3;
                                }
                                garVar.j();
                                if (garVar.f(268435456)) {
                                    l0(garVar);
                                }
                                if (this.b2) {
                                    j5 = this.P1;
                                    if (j <= j5) {
                                        this.c2 = (j5 - j) + 1 + this.c2;
                                    }
                                    this.P1 = j;
                                    this.Q1 = j;
                                    this.b2 = false;
                                }
                                A0(garVar);
                                iF0 = f0(garVar);
                                j4 = j + this.c2;
                                i2 = this.C1;
                                if (zF) {
                                    yjh0Var.c(i2, ocoVar, j4, iF0);
                                } else {
                                    ByteBuffer byteBuffer12 = garVar.d;
                                    byteBuffer12.getClass();
                                    yjh0Var.b(j4, i2, byteBuffer12.limit(), iF0);
                                }
                                this.C1 = -1;
                                garVar.d = null;
                                boolean z7 = z;
                                this.M1 = z7;
                                this.J1 = (byte) 0;
                                this.W1.c += z7 ? 1 : 0;
                                return z7;
                            }
                        }
                        return true;
                    }
                    ckh0 ckh0VarJ20 = j0();
                    ckh0VarJ1 = j0();
                    ckh0 ckh0Var15 = ckh0.i;
                    if ((ckh0VarJ1.f & 1) != 0) {
                        j6 = this.Q1;
                    } else {
                        j6 = this.P1;
                    }
                    ckh0VarJ20.h = j6;
                    if (this.J1 == 2) {
                        garVar.g();
                        this.J1 = (byte) 1;
                    }
                    this.R1 = true;
                    if (!this.M1) {
                        B0();
                        return false;
                    }
                    if (!this.y1) {
                        this.N1 = true;
                        yjh0Var.b(0L, this.C1, 0, 4);
                        this.C1 = -1;
                        garVar.d = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void c0() {
        try {
            yjh0 yjh0Var = this.m1;
            yjh0Var.getClass();
            yjh0Var.flush();
        } finally {
            H0();
        }
    }

    public final boolean d0() {
        if (this.m1 != null) {
            if (O0()) {
                E0();
                return true;
            }
            if (M0()) {
                c0();
                return false;
            }
            if (this.M1) {
                this.b2 = true;
            }
        }
        return false;
    }

    public final List e0(boolean z) {
        ie30 ie30Var = this.e1;
        ie30Var.getClass();
        ArrayList arrayListH0 = h0(ie30Var, z);
        if (!arrayListH0.isEmpty() || !z) {
            return arrayListH0;
        }
        ArrayList arrayListH1 = h0(ie30Var, false);
        if (!arrayListH1.isEmpty()) {
            oon1.H("Drm session requires secure decoder for " + ie30Var.f66p + ", but no secure decoder available. Trying to proceed with " + arrayListH1 + ".");
        }
        return arrayListH1;
    }

    public int f0(gar garVar) {
        return 0;
    }

    @Override // p.jca
    public final long g(long j, long j2) {
        return i0(j, j2, this.A1);
    }

    public float g0(float f, ie30 ie30Var, ie30[] ie30VarArr) {
        MediaFormat mediaFormat;
        int integer = -1;
        for (ie30 ie30Var2 : ie30VarArr) {
            int i = ie30Var2.L;
            if (i != -1) {
                integer = Math.max(integer, i);
            }
        }
        if (integer == -1 && (mediaFormat = this.o1) != null && mediaFormat.containsKey("sample-rate")) {
            integer = mediaFormat.getInteger("sample-rate");
        }
        if (integer == -1) {
            return -1.0f;
        }
        return integer * f;
    }

    public abstract ArrayList h0(ie30 ie30Var, boolean z);

    public long i0(long j, long j2, boolean z) {
        return super.g(j, j2);
    }

    public final ckh0 j0() {
        ArrayDeque arrayDeque = this.b1;
        return !arrayDeque.isEmpty() ? (ckh0) arrayDeque.getLast() : this.X1;
    }

    public abstract g2z k0(bkh0 bkh0Var, ie30 ie30Var, MediaCrypto mediaCrypto, float f);

    public abstract void l0(gar garVar);

    /* JADX WARN: Code duplicated, block: B:25:0x00cd  */
    public final void m0(bkh0 bkh0Var, MediaCrypto mediaCrypto) {
        int i;
        this.t1 = bkh0Var;
        ie30 ie30Var = this.e1;
        ie30Var.getClass();
        String str = bkh0Var.a;
        float f = this.l1;
        ie30[] ie30VarArr = this.t;
        ie30VarArr.getClass();
        float fG0 = g0(f, ie30Var, ie30VarArr);
        if (fG0 <= 0.0f) {
            fG0 = -1.0f;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g2z g2zVarK0 = k0(bkh0Var, ie30Var, mediaCrypto, fG0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            dbu0 dbu0Var = this.f;
            dbu0Var.getClass();
            mb4.J(g2zVarK0, dbu0Var);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            yjh0 yjh0VarI = this.U0.i(g2zVarK0);
            this.m1 = yjh0VarI;
            this.A1 = yjh0VarI.h(new jpa0((Object) this, (byte) 18));
            Trace.endSection();
            this.g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!bkh0Var.e(this.T0, ie30Var)) {
                String strE = ie30.e(ie30Var);
                Locale locale = Locale.US;
                oon1.H("Format exceeds selected codec's capabilities [" + strE + ", " + str + "]");
            }
            this.q1 = fG0;
            this.n1 = ie30Var;
            HashSet hashSet = hph0.a;
            if (i2 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
                i = 0;
            } else {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            this.u1 = i;
            this.v1 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            String str3 = bkh0Var.a;
            this.y1 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && bkh0Var.f);
            yjh0 yjh0Var = this.m1;
            yjh0Var.getClass();
            if (yjh0Var.m()) {
                this.I1 = true;
                this.J1 = (byte) 1;
                this.w1 = this.u1 != 0;
            }
            if (this.h == 2) {
                this.g.getClass();
                this.B1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.W1.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i2 >= 31 && !this.f2.isEmpty()) {
                yjh0 yjh0Var2 = this.m1;
                yjh0Var2.getClass();
                yjh0Var2.t(new ArrayList((Collection) this.f2));
            }
            s0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean n0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        ie30 ie30Var = this.f1;
        return ie30Var == null || !Objects.equals(ie30Var.f66p, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00bb, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00bb, blocks: (B:51:0x00a7, B:53:0x00ab, B:55:0x00b2, B:60:0x00bd, B:64:0x00ca), top: B:76:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    public final void o0() {
        ie30 ie30Var;
        y8v y8vVar;
        if (this.m1 != null || this.F1 || (ie30Var = this.e1) == null) {
            return;
        }
        String str = ie30Var.f66p;
        boolean z = true;
        if (this.h1 == null && P0(ie30Var)) {
            this.F1 = false;
            G0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            sfa sfaVar = this.Z0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                sfaVar.X = (byte) 32;
            } else {
                sfaVar.X = (byte) 1;
            }
            this.F1 = true;
            return;
        }
        J0(this.h1);
        if (this.g1 == null) {
            try {
                y8vVar = this.g1;
                if (y8vVar == null && (y8vVar.getState() == 3 || this.g1.getState() == 4)) {
                    y8v y8vVar2 = this.g1;
                    str.getClass();
                    if (!y8vVar2.i(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                p0(this.j1, z);
            } catch (MediaCodecRenderer$DecoderInitializationException e) {
                throw c(e, ie30Var, false, 4001);
            }
        } else {
            dm5.y(this.j1 == null);
            y8v y8vVar3 = this.g1;
            nco ncoVarF = y8vVar3.f();
            HashSet hashSet = hph0.a;
            if (mk30.c && (ncoVarF instanceof mk30)) {
                int state = y8vVar3.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionExceptionA = y8vVar3.a();
                    drmSessionExceptionA.getClass();
                    throw c(drmSessionExceptionA, this.e1, false, drmSessionExceptionA.a);
                }
                if (state == 4) {
                    if (ncoVarF == null) {
                        if (y8vVar3.a() != null) {
                        }
                    } else if (ncoVarF instanceof mk30) {
                        mk30 mk30Var = (mk30) ncoVarF;
                        this.j1 = new MediaCrypto(mk30Var.a, mk30Var.b);
                    }
                    y8vVar = this.g1;
                    if (y8vVar == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    p0(this.j1, z);
                }
            } else {
                if (ncoVarF == null) {
                    if (y8vVar3.a() != null) {
                    }
                } else if (ncoVarF instanceof mk30) {
                    mk30 mk30Var2 = (mk30) ncoVarF;
                    try {
                        this.j1 = new MediaCrypto(mk30Var2.a, mk30Var2.b);
                    } catch (MediaCryptoException e2) {
                        throw c(e2, this.e1, false, 6006);
                    }
                }
                y8vVar = this.g1;
                if (y8vVar == null) {
                    z = false;
                } else {
                    z = false;
                }
                p0(this.j1, z);
            }
        }
        MediaCrypto mediaCrypto = this.j1;
        if (mediaCrypto == null || this.m1 != null) {
            return;
        }
        mediaCrypto.release();
        this.j1 = null;
    }

    public final void p0(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        ie30 ie30Var = this.e1;
        ie30Var.getClass();
        if (this.r1 == null) {
            try {
                List listE0 = e0(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.r1 = arrayDeque;
                if (this.V0) {
                    arrayDeque.addAll(listE0);
                } else {
                    ArrayList arrayList = (ArrayList) listE0;
                    if (!arrayList.isEmpty()) {
                        this.r1.add((bkh0) arrayList.get(0));
                    }
                }
                this.s1 = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(ie30Var, e, z, -49998);
            }
        }
        if (this.r1.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(ie30Var, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.r1;
        arrayDeque2.getClass();
        while (this.m1 == null) {
            bkh0 bkh0Var = (bkh0) arrayDeque2.peekFirst();
            bkh0Var.getClass();
            if (!q0(ie30Var) || !N0(bkh0Var)) {
                return;
            }
            try {
                m0(bkh0Var, mediaCrypto);
            } catch (Exception e2) {
                oon1.I("Failed to initialize decoder: " + bkh0Var, e2);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + bkh0Var.a + ", " + ie30Var, e2, ie30Var.f66p, z, bkh0Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                r0(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.s1;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.s1 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.s1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.s1;
                }
            }
        }
        this.r1 = null;
    }

    public boolean q0(ie30 ie30Var) {
        return true;
    }

    public abstract void r0(Exception exc);

    public abstract void s0(long j, long j2, String str);

    public abstract void t0(iwg iwgVar);

    public abstract void u0(String str);

    /* JADX WARN: Code duplicated, block: B:100:0x0154  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0126, code lost:
    
        if (r4.i(r2) != false) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p.iar v0(p.w2z r14) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dkh0.v0(p.w2z):p.iar");
    }

    public abstract void w0(ie30 ie30Var, MediaFormat mediaFormat);

    @Override // p.jca
    public void x() {
        this.e1 = null;
        K0(ckh0.i);
        this.b1.clear();
        if (!this.F1) {
            d0();
        } else {
            this.F1 = false;
            G0();
        }
    }

    public void y0(long j) {
        this.Y1 = Math.max(j, this.Y1);
        while (true) {
            ArrayDeque arrayDeque = this.b1;
            if (arrayDeque.isEmpty() || j < ((ckh0) arrayDeque.peek()).a) {
                return;
            }
            ckh0 ckh0Var = (ckh0) arrayDeque.poll();
            ckh0Var.getClass();
            K0(ckh0Var);
            z0();
        }
    }

    @Override // p.jca
    public void z(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.b1;
        if (!arrayDeque.isEmpty()) {
            this.X1 = (ckh0) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.R1 = false;
            this.S1 = false;
            this.U1 = false;
            if (this.F1) {
                G0();
            } else if (d0()) {
                o0();
            }
            if (this.X1.d.M() > 0) {
                this.T1 = true;
            }
            this.X1.d.e();
            this.X1.g = false;
        }
    }

    public abstract void z0();

    public void A0(gar garVar) {
    }

    public void x0(long j) {
    }
}
