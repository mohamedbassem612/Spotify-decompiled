package p;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import app.p000rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ygr implements m48 {
    public static final AtomicInteger e0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public long D;
    public int E;
    public boolean F;
    public boolean G;
    public long H;
    public long I;
    public float J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public g89 U;
    public AudioDeviceInfo V;
    public int W;
    public boolean X;
    public long Y;
    public boolean Z;
    public final Context a;
    public boolean a0;
    public final k9r b;
    public long b0;
    public final lge c;
    public long c0;
    public final wvg1 d;
    public Handler d0;
    public final vye1 e;
    public final vye1 f;
    public final bg11 g;
    public final ArrayDeque h;
    public final boolean i;
    public int j;
    public ugr k;
    public final m1d l;
    public final m1d m;
    public dbu0 n;
    public z8c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wgr f175p;
    public wgr q;
    public b18 r;
    public qx7 s;
    public tgr t;
    public o58 u;
    public po7 v;
    public xgr w;
    public xgr x;
    public k2u0 y;
    public boolean z;

    public ygr(vgr vgrVar) {
        int deviceId;
        Context context = (Context) vgrVar.c;
        this.a = context == null ? null : context.getApplicationContext();
        this.v = po7.i;
        this.b = (k9r) vgrVar.e;
        this.i = vgrVar.a;
        this.j = 0;
        this.s = (r58) vgrVar.g;
        lge lgeVar = new lge();
        this.c = lgeVar;
        wvg1 wvg1Var = new wvg1();
        wvg1Var.m = zoi1.b;
        this.d = wvg1Var;
        this.e = new vye1((byte) 1);
        this.f = new vye1((byte) 0);
        this.g = b380.u(wvg1Var, lgeVar);
        this.J = 1.0f;
        this.S = 0;
        this.U = new g89();
        k2u0 k2u0Var = k2u0.d;
        this.x = new xgr(k2u0Var, 0L, 0L);
        this.y = k2u0Var;
        this.z = false;
        this.h = new ArrayDeque();
        this.l = new m1d();
        this.m = new m1d();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.W = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int i(ByteBuffer byteBuffer, int i) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((bs51.p(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = zoi1.a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        bhn0.q();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    bhn0.q();
                    return 0;
                case 10:
                    return SemanticState.ReadOnly;
                case 11:
                case 12:
                    return SemanticState.Modal;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = zoi1.a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return SemanticState.ReadOnly;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return j82.J(new bae(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            eg.m(f4i1.c(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return sj1.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * SemanticState.Hidden;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return SemanticState.ReadOnly;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return SemanticState.Obscured;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void a(long j) {
        k2u0 k2u0Var;
        boolean z;
        boolean zW = w();
        byte b = 0;
        k9r k9rVar = this.b;
        if (zW) {
            k2u0Var = k2u0.d;
        } else {
            if (this.X || !this.q.b()) {
                k2u0Var = k2u0.d;
            } else {
                int i = this.q.a.M;
                k2u0Var = this.y;
                sfa1 sfa1Var = (sfa1) k9rVar.d;
                float f = k2u0Var.a;
                dm5.m(f > 0.0f);
                if (sfa1Var.d != f) {
                    sfa1Var.d = f;
                    sfa1Var.j = true;
                }
                float f2 = k2u0Var.b;
                dm5.m(f2 > 0.0f);
                if (sfa1Var.e != f2) {
                    sfa1Var.e = f2;
                    sfa1Var.j = true;
                }
            }
            this.y = k2u0Var;
        }
        k2u0 k2u0Var2 = k2u0Var;
        if (this.X || !this.q.b()) {
            z = false;
        } else {
            int i2 = this.q.a.M;
            z = this.z;
            ((mr81) k9rVar.c).j = z;
        }
        this.z = z;
        this.h.add(new xgr(k2u0Var2, Math.max(0L, j), zoi1.e0(this.q.e.b, j())));
        v(j);
        z8c0 z8c0Var = this.o;
        if (z8c0Var != null) {
            boolean z2 = this.z;
            em3 em3Var = ((zjh0) z8c0Var.b).i2;
            Handler handler = (Handler) em3Var.b;
            if (handler != null) {
                handler.post(new s38(em3Var, z2, b));
            }
        }
    }

    public final o58 b(px7 px7Var) throws AudioSink$InitializationException {
        try {
            return ((r58) this.s).a(px7Var);
        } catch (AudioOutputProvider$InitializationException e) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(px7Var.b, px7Var.c, px7Var.a, px7Var.f, this.q.a, px7Var.e, e);
            z8c0 z8c0Var = this.o;
            if (z8c0Var == null) {
                throw audioSink$InitializationException;
            }
            z8c0Var.i(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    public final void c(l48 l48Var) throws AudioSink$ConfigurationException {
        int i;
        int i2;
        b18 b18Var;
        ie30 ie30Var;
        if (this.t == null && this.a != null) {
            tgr tgrVar = new tgr(this);
            this.t = tgrVar;
            r58 r58Var = (r58) this.s;
            r58Var.f();
            h9d0 h9d0Var = r58Var.e;
            if (h9d0Var == null) {
                h9d0Var = new h9d0(Thread.currentThread());
                r58Var.e = h9d0Var;
            }
            h9d0Var.a(tgrVar);
        }
        ie30 ie30Var2 = l48Var.a;
        String str = ie30Var2.f66p;
        int i3 = ie30Var2.J;
        int i4 = ie30Var2.M;
        if ("audio/raw".equals(str)) {
            dm5.m(zoi1.P(i4));
            int iZ = zoi1.z(i4) * i3;
            v280 v280Var = new v280(4);
            v280Var.e(this.g);
            v280Var.c(this.e);
            v280Var.d((f18[]) this.b.b);
            b18 b18Var2 = new b18(v280Var.g());
            if (b18Var2.equals(this.r)) {
                b18Var2 = this.r;
            }
            int i5 = ie30Var2.N;
            int i6 = ie30Var2.O;
            wvg1 wvg1Var = this.d;
            wvg1Var.i = i5;
            wvg1Var.j = i6;
            this.c.i = l48Var.b;
            try {
                c18 c18VarA = b18Var2.a(new c18(ie30Var2));
                int i7 = c18VarA.b;
                int i8 = c18VarA.c;
                ge30 ge30VarA = ie30Var2.a();
                ge30VarA.L = i8;
                ge30VarA.K = c18VarA.a;
                ge30VarA.I = i7;
                ge30VarA.J = i7 == i3 ? ie30Var2.K : -1;
                ie30 ie30Var3 = new ie30(ge30VarA);
                int iZ2 = zoi1.z(i8) * i7;
                i = iZ;
                i2 = iZ2;
                b18Var = b18Var2;
                ie30Var = ie30Var3;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, ie30Var2);
            }
        } else {
            w280 w280Var = b380.b;
            i = -1;
            i2 = -1;
            b18Var = new b18(bg11.e);
            ie30Var = ie30Var2;
        }
        mx7 mx7VarG = g(ie30Var);
        ie30 ie30Var4 = mx7VarG.a;
        try {
            px7 px7VarC = ((r58) this.s).c(mx7VarG);
            boolean z = px7VarC.e;
            if (px7VarC.a == 0) {
                throw new AudioSink$ConfigurationException("Invalid output encoding (isOffload=" + z + ")", ie30Var4);
            }
            if (px7VarC.c == 0) {
                throw new AudioSink$ConfigurationException("Invalid output channel config (isOffload=" + z + ")", ie30Var4);
            }
            this.Z = false;
            sqe1 sqe1Var = l48Var.c;
            p2i0 p2i0Var = l48Var.d;
            wgr wgrVar = new wgr(ie30Var2, ie30Var, i, i2, px7VarC, b18Var, sqe1Var, p2i0Var != null ? p2i0Var.a : null);
            if (n()) {
                this.f175p = wgrVar;
            } else {
                this.q = wgrVar;
            }
        } catch (AudioOutputProvider$ConfigurationException e2) {
            throw new AudioSink$ConfigurationException(e2, ie30Var2);
        }
    }

    public final void d(long j) throws AudioSink$WriteException {
        z8c0 z8c0Var;
        zo00 zo00Var;
        if (this.M == null) {
            return;
        }
        m1d m1dVar = this.m;
        if (((Exception) m1dVar.c) != null && (e0.get() > 0 || SystemClock.elapsedRealtime() < m1dVar.b)) {
            return;
        }
        int iRemaining = this.M.remaining();
        boolean z = false;
        try {
            boolean zG = this.u.g(this.L, j, this.M);
            this.Y = SystemClock.elapsedRealtime();
            m1dVar.c = null;
            m1dVar.a = -9223372036854775807L;
            m1dVar.b = -9223372036854775807L;
            if (this.u.c()) {
                if (this.D > 0) {
                    this.a0 = false;
                }
                if (this.Q && (z8c0Var = this.o) != null && !zG && !this.a0 && (zo00Var = ((zjh0) z8c0Var.b).i1) != null) {
                    zo00Var.a.s1 = true;
                }
            }
            if (this.q.b()) {
                this.C += (long) (iRemaining - this.M.remaining());
            }
            if (zG) {
                if (!this.q.b()) {
                    dm5.y(this.M == this.K);
                    this.D = (((long) this.E) * ((long) this.L)) + this.D;
                }
                this.M = null;
            }
        } catch (AudioOutput$WriteException e) {
            boolean z2 = e.b;
            if (z2) {
                if (j() > 0) {
                    z = true;
                } else if (this.u.c()) {
                    if (this.q.e.e) {
                        this.Z = true;
                    }
                    z = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e.a, this.q.a, z);
            z8c0 z8c0Var2 = this.o;
            if (z8c0Var2 != null) {
                z8c0Var2.i(audioSink$WriteException);
            }
            if (z2) {
                throw audioSink$WriteException;
            }
            m1dVar.c(audioSink$WriteException);
        }
    }

    public final boolean e() throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.r.f()) {
            d(Long.MIN_VALUE);
            return this.M == null;
        }
        this.r.h();
        q(Long.MIN_VALUE);
        return this.r.e() && ((byteBuffer = this.M) == null || !byteBuffer.hasRemaining());
    }

    public final void f() {
        if (n()) {
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.a0 = false;
            this.E = 0;
            this.x = new xgr(this.y, 0L, 0L);
            this.H = 0L;
            this.w = null;
            this.h.clear();
            this.K = null;
            this.L = 0;
            this.M = null;
            this.O = false;
            this.N = false;
            this.P = false;
            this.d.o = 0L;
            v(-9223372036854775807L);
            this.k = null;
            wgr wgrVar = this.f175p;
            if (wgrVar != null) {
                this.q = wgrVar;
                this.f175p = null;
            }
            e0.incrementAndGet();
            o58 o58Var = this.u;
            if (o58Var.e.d.getPlayState() == 3) {
                o58Var.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && o58Var.c()) {
                n58 n58Var = o58Var.h;
                n58Var.getClass();
                n58Var.e();
            }
            yu3 yu3Var = o58Var.d;
            if (yu3Var != null) {
                AudioTrack audioTrack = (AudioTrack) yu3Var.b;
                k58 k58Var = (k58) yu3Var.e;
                k58Var.getClass();
                audioTrack.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) k58Var);
                yu3Var.e = null;
                o58Var.d = null;
            }
            AudioTrack audioTrack2 = o58Var.a;
            h9d0 h9d0Var = o58Var.i;
            Handler handlerR = zoi1.r((lkh0) null);
            synchronized (o58.r) {
                try {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = o58.s;
                    byte b = 2;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ask("ExoPlayer:AudioTrackReleaseThread", (byte) 2));
                        o58.s = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                    }
                    o58.t++;
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new c45(audioTrack2, handlerR, h9d0Var, b), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.u = null;
        }
        m1d m1dVar = this.m;
        m1dVar.c = null;
        m1dVar.a = -9223372036854775807L;
        m1dVar.b = -9223372036854775807L;
        m1d m1dVar2 = this.l;
        m1dVar2.c = null;
        m1dVar2.a = -9223372036854775807L;
        m1dVar2.b = -9223372036854775807L;
        this.b0 = 0L;
        this.c0 = 0L;
        Handler handler = this.d0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final mx7 g(ie30 ie30Var) {
        mx7 mx7Var = new mx7(ie30Var);
        mx7Var.b = this.v;
        mx7Var.d = this.i;
        mx7Var.e = this.j != 0;
        mx7Var.c = this.V;
        mx7Var.f = this.S;
        mx7Var.h = this.X;
        mx7Var.g = this.W;
        return new mx7(mx7Var);
    }

    public final int h(ie30 ie30Var) {
        boolean z;
        if (!zoi1.P(ie30Var.M) || ie30Var.M == 2) {
            z = false;
        } else {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.L = 2;
            ie30Var = new ie30(ge30VarA);
            z = true;
        }
        int i = ((r58) this.s).b(g(ie30Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!this.q.b()) {
            return this.D;
        }
        long j = this.C;
        long j2 = this.q.d;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final boolean k(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ygr.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.u.c() && this.P) {
            return false;
        }
        long j = j();
        long jA = this.u.a();
        o58 o58Var = this.u;
        o58Var.getClass();
        return j > zoi1.t(o58Var.a.getSampleRate(), jA);
    }

    public final boolean m() throws AudioSink$InitializationException {
        int iW;
        o58 o58VarB;
        vdf0 vdf0Var;
        m1d m1dVar = this.l;
        if (((Exception) m1dVar.c) != null && (e0.get() > 0 || SystemClock.elapsedRealtime() < m1dVar.b)) {
            return false;
        }
        byte b = 1;
        try {
            o58VarB = b(this.q.e);
        } catch (AudioSink$InitializationException e) {
            px7 px7Var = this.q.e;
            int iMax = px7Var.f;
            boolean zP = zoi1.P(px7Var.a);
            wgr wgrVar = this.q;
            if (zP) {
                iW = wgrVar.e.b * wgrVar.d;
            } else {
                int i = wgrVar.a.k;
                if (i != -1) {
                    iW = i / 8;
                } else {
                    iW = jto1.w(wgrVar.e.a);
                    if (iW == -2147483647) {
                        iW = 1000000;
                    }
                }
            }
            px7 px7Var2 = this.q.e;
            int iMax2 = Math.max(iW, AudioTrack.getMinBufferSize(px7Var2.b, px7Var2.c, px7Var2.a));
            int i2 = this.q.d;
            if (i2 == -1) {
                i2 = 1;
            }
            while (true) {
                if (iMax <= iMax2) {
                    if (!this.q.e.e) {
                        throw e;
                    }
                    this.Z = true;
                    throw e;
                }
                iMax = Math.max(iMax2, iMax / 2);
                int i3 = iMax % i2;
                if (i3 != 0) {
                    iMax = (i2 - i3) + iMax;
                }
                ox7 ox7VarA = this.q.e.a();
                ox7VarA.f = iMax;
                px7 px7Var3 = new px7(ox7VarA);
                try {
                    o58 o58VarB2 = b(px7Var3);
                    this.q = this.q.a(px7Var3);
                    o58VarB = o58VarB2;
                    break;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                }
            }
        }
        this.u = o58VarB;
        ugr ugrVar = new ugr(this, this.q.e);
        this.k = ugrVar;
        o58VarB.i.a(ugrVar);
        if (this.u.c()) {
            wgr wgrVar2 = this.q;
            if (wgrVar2.e.k) {
                o58 o58Var = this.u;
                ie30 ie30Var = wgrVar2.a;
                o58Var.d(ie30Var.N, ie30Var.O);
            }
        }
        dbu0 dbu0Var = this.n;
        if (dbu0Var != null) {
            this.u.f(dbu0Var);
        }
        if (n()) {
            this.u.a.setVolume(this.J);
        }
        this.U.getClass();
        AudioDeviceInfo audioDeviceInfo = this.V;
        if (audioDeviceInfo != null) {
            this.u.a.setPreferredDevice(audioDeviceInfo);
        }
        this.G = true;
        int audioSessionId = this.u.a.getAudioSessionId();
        boolean z = audioSessionId != this.S;
        this.S = audioSessionId;
        z8c0 z8c0Var = this.o;
        if (z8c0Var != null) {
            px7 px7Var4 = this.q.e;
            b4x0 b4x0Var = new b4x0((byte) 29);
            em3 em3Var = ((zjh0) z8c0Var.b).i2;
            Handler handler = (Handler) em3Var.b;
            if (handler != null) {
                handler.post(new q38(em3Var, b4x0Var, (byte) 1));
            }
            if (z) {
                this.T = true;
                wgr wgrVar3 = this.q;
                ox7 ox7VarA2 = wgrVar3.e.a();
                ox7VarA2.h = this.S;
                this.q = wgrVar3.a(new px7(ox7VarA2));
                wgr wgrVar4 = this.f175p;
                if (wgrVar4 != null) {
                    ox7 ox7VarA3 = wgrVar4.e.a();
                    ox7VarA3.h = this.S;
                    this.f175p = wgrVar4.a(new px7(ox7VarA3));
                }
                z8c0 z8c0Var2 = this.o;
                int i4 = this.S;
                zjh0 zjh0Var = (zjh0) z8c0Var2.b;
                if (Build.VERSION.SDK_INT >= 35 && (vdf0Var = zjh0Var.k2) != null) {
                    vdf0Var.v(i4);
                }
                em3 em3Var2 = zjh0Var.i2;
                Handler handler2 = (Handler) em3Var2.b;
                if (handler2 != null) {
                    handler2.post(new xu7(em3Var2, i4, b));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.u != null;
    }

    public final void o() {
        this.Q = true;
        if (n()) {
            o58 o58Var = this.u;
            s58 s58Var = o58Var.e;
            if (s58Var.u != -9223372036854775807L) {
                s58Var.b.getClass();
                s58Var.u = zoi1.W(SystemClock.elapsedRealtime());
            }
            s58Var.j = zoi1.e0(s58Var.e, s58Var.a());
            s58Var.h.a(0);
            if (!o58Var.j || o58Var.c()) {
                o58Var.a.play();
            }
        }
    }

    public final void p() {
        if (this.O) {
            return;
        }
        this.O = true;
        if (this.u.c()) {
            this.P = false;
        }
        o58 o58Var = this.u;
        if (o58Var.j) {
            return;
        }
        o58Var.j = true;
        s58 s58Var = o58Var.e;
        long jB = o58Var.b();
        s58Var.w = s58Var.a();
        s58Var.b.getClass();
        s58Var.u = zoi1.W(SystemClock.elapsedRealtime());
        s58Var.x = jB;
        o58Var.a.stop();
        o58Var.o = 0;
    }

    public final void q(long j) throws AudioSink$WriteException {
        d(j);
        if (this.M != null) {
            return;
        }
        if (!this.r.f()) {
            ByteBuffer byteBuffer = this.K;
            if (byteBuffer != null) {
                u(byteBuffer);
                d(j);
                return;
            }
            return;
        }
        while (!this.r.e()) {
            do {
                ByteBuffer byteBufferD = this.r.d();
                if (byteBufferD.hasRemaining()) {
                    u(byteBufferD);
                    d(j);
                } else {
                    ByteBuffer byteBuffer2 = this.K;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.r.i(this.K);
                    }
                }
            } while (this.M == null);
            return;
        }
    }

    public final void r() {
        wgr wgrVar = this.q;
        if (wgrVar != null) {
            wgr wgrVar2 = this.f175p;
            if (wgrVar2 != null) {
                this.q = wgrVar2;
                this.f175p = null;
                wgrVar = wgrVar2;
            }
            try {
                this.q = this.q.a(((r58) this.s).c(g(wgrVar.b)));
            } catch (AudioOutputProvider$ConfigurationException e) {
                bhn0.p(new AudioSink$ConfigurationException(e, this.q.a));
                return;
            }
        }
        f();
    }

    public final void s() {
        f();
        w280 w280VarR = this.g.r(0);
        while (w280VarR.hasNext()) {
            ((f18) w280VarR.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        b18 b18Var = this.r;
        if (b18Var != null) {
            b18Var.j();
        }
        this.Q = false;
        this.Z = false;
    }

    public final void t() {
        if (n()) {
            o58 o58Var = this.u;
            k2u0 k2u0Var = this.y;
            AudioTrack audioTrack = o58Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(zoi1.i(k2u0Var.a, 0.1f, 8.0f)).setPitch(zoi1.i(k2u0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                oon1.I("Failed to set playback params", e);
            }
            s58 s58Var = o58Var.e;
            s58Var.i = audioTrack.getPlaybackParams().getSpeed();
            s58Var.h.a(0);
            s58Var.e();
            PlaybackParams playbackParams = this.u.a.getPlaybackParams();
            this.y = new k2u0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0239  */
    /* JADX WARN: Code duplicated, block: B:101:0x0246  */
    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0272  */
    /* JADX WARN: Code duplicated, block: B:105:0x027a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0288  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[PHI: r9
      0x00b7: PHI (r9v91 double) = (r9v86 double), (r9v98 double) binds: [B:49:0x00ef, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd A[PHI: r9
      0x00bd: PHI (r9v87 double) = (r9v86 double), (r9v98 double) binds: [B:49:0x00ef, B:37:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8 A[PHI: r9
      0x00d8: PHI (r9v62 float) = (r9v57 float), (r9v97 float) binds: [B:59:0x0181, B:44:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00de A[PHI: r9
      0x00de: PHI (r9v58 float) = (r9v57 float), (r9v97 float) binds: [B:59:0x0181, B:44:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x0206  */
    /* JADX WARN: Code duplicated, block: B:98:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0226  */
    public final void u(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        double d;
        float fI;
        float f2;
        double dMax;
        double d2;
        dm5.y(this.M == null);
        if (byteBuffer.hasRemaining()) {
            if (this.q.b()) {
                int iT = (int) zoi1.t(this.q.e.b, zoi1.W(20L));
                long j = j();
                long j2 = iT;
                if (j >= j2) {
                    byteBufferOrder = byteBuffer;
                } else {
                    wgr wgrVar = this.q;
                    int i5 = wgrVar.e.a;
                    int i6 = wgrVar.d;
                    int i7 = (int) j;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iT) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                fI = zoi1.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fI < 0.0f) {
                                    f2 = (-fI) * (-2.1474836E9f);
                                } else {
                                    f2 = fI * 2.1474836E9f;
                                }
                                i3 = (int) f2;
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 != 1610612736) {
                                    if (i5 == 1879048192) {
                                        dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    } else if (i5 == 1895825408) {
                                        fI = zoi1.i(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        if (fI < 0.0f) {
                                            f2 = (-fI) * (-2.1474836E9f);
                                        } else {
                                            f2 = fI * 2.1474836E9f;
                                        }
                                        i3 = (int) f2;
                                    } else {
                                        if (i5 != 1912602624) {
                                            bhn0.w();
                                            return;
                                        }
                                        dMax = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    }
                                    i3 = (int) d2;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 != 1879048192) {
                                    if (i5 != 1895825408) {
                                        if (i4 < 0) {
                                            f = (-i4) / (-2.1474836E9f);
                                        } else {
                                            f = i4 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                    } else {
                                        if (i5 == 1912602624) {
                                            bhn0.w();
                                            return;
                                        }
                                        if (i4 < 0) {
                                            d = (-i4) / (-2.147483648E9d);
                                        } else {
                                            d = ((double) i4) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                    }
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 != 1879048192) {
                                if (i5 != 1895825408) {
                                    if (i4 < 0) {
                                        f = (-i4) / (-2.1474836E9f);
                                    } else {
                                        f = i4 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                } else {
                                    if (i5 == 1912602624) {
                                        bhn0.w();
                                        return;
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.M = byteBufferOrder;
        }
    }

    public final void v(long j) {
        long j2;
        wgr wgrVar = this.q;
        this.r = wgrVar.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.I;
            if (wgrVar.g != sqe1.a && wgrVar.h != null) {
                dqe1 dqe1Var = new dqe1();
                wgr wgrVar2 = this.q;
                wgrVar2.g.g(wgrVar2.h, dqe1Var);
                j2 += dqe1Var.e;
            }
        }
        b18 b18Var = this.r;
        d18 d18Var = new d18((byte) 0);
        wgr wgrVar3 = this.q;
        d18Var.b = wgrVar3.g;
        d18Var.c = wgrVar3.h;
        d18Var.a = j2;
        b18Var.b(d18Var.i());
    }

    public final boolean w() {
        wgr wgrVar = this.q;
        return wgrVar != null && wgrVar.e.j;
    }
}
