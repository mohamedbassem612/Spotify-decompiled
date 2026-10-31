package p;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zjh0 extends dkh0 implements wjh0 {
    public final Context h2;
    public final em3 i2;
    public final m48 j2;
    public final vdf0 k2;
    public int l2;
    public boolean m2;
    public ie30 n2;
    public ie30 o2;
    public long p2;
    public boolean q2;
    public boolean r2;
    public boolean s2;
    public boolean t2;
    public int u2;
    public boolean v2;
    public long w2;
    public long x2;
    public boolean y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjh0(Context context, xjh0 xjh0Var, Handler handler, t38 t38Var, m48 m48Var) {
        super(context.getApplicationContext(), 1, xjh0Var, false);
        vdf0 vdf0Var = Build.VERSION.SDK_INT >= 35 ? new vdf0() : null;
        this.h2 = context.getApplicationContext();
        this.j2 = m48Var;
        this.k2 = vdf0Var;
        this.u2 = -1000;
        this.i2 = new em3(handler, t38Var, (byte) 25);
        this.w2 = -9223372036854775807L;
        this.x2 = -9223372036854775807L;
        this.y2 = false;
    }

    public static bg11 V0(ie30 ie30Var, boolean z, m48 m48Var) {
        bkh0 bkh0VarE;
        if (ie30Var.f66p != null) {
            return (((ygr) m48Var).h(ie30Var) == 0 || (bkh0VarE = hkh0.e("audio/raw")) == null) ? hkh0.h(ie30Var, z, false) : b380.t(bkh0VarE);
        }
        w280 w280Var = b380.b;
        return bg11.e;
    }

    @Override // p.jca
    public final void A() {
        vdf0 vdf0Var;
        ((r58) ((ygr) this.j2).s).d();
        if (Build.VERSION.SDK_INT < 35 || (vdf0Var = this.k2) == null) {
            return;
        }
        vdf0Var.release();
    }

    @Override // p.jca
    public final void B() {
        m48 m48Var = this.j2;
        this.s2 = false;
        this.t2 = false;
        this.w2 = -9223372036854775807L;
        try {
            try {
                this.F1 = false;
                G0();
                E0();
                y8v y8vVar = this.h1;
                if (y8vVar != null) {
                    y8vVar.c(null);
                }
                this.h1 = null;
                if (this.r2) {
                    this.r2 = false;
                    ((ygr) m48Var).s();
                }
            } catch (Throwable th) {
                y8v y8vVar2 = this.h1;
                if (y8vVar2 != null) {
                    y8vVar2.c(null);
                }
                this.h1 = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.r2) {
                this.r2 = false;
                ((ygr) m48Var).s();
            }
            throw th2;
        }
    }

    @Override // p.jca
    public final void C() {
        ((ygr) this.j2).o();
        this.v2 = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    @Override // p.dkh0
    public final boolean C0(long j, long j2, yjh0 yjh0Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ie30 ie30Var) throws ExoPlaybackException {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.w2 = -9223372036854775807L;
        if (this.o2 != null && (i2 & 2) != 0) {
            yjh0Var.getClass();
            yjh0Var.l(i);
            return true;
        }
        m48 m48Var = this.j2;
        if (z) {
            if (yjh0Var != null) {
                yjh0Var.l(i);
            }
            this.W1.f += i3;
            ((ygr) m48Var).F = true;
            return true;
        }
        try {
            if (!((ygr) m48Var).k(i3, j3, byteBuffer)) {
                this.w2 = j3;
                return false;
            }
            if (yjh0Var != null) {
                yjh0Var.l(i);
            }
            this.W1.e += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            ie30 ie30Var2 = this.n2;
            if (this.F1) {
                ld21 ld21Var = this.d;
                ld21Var.getClass();
                if (ld21Var.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw c(e, ie30Var2, e.a, i5);
        } catch (AudioSink$WriteException e2) {
            if (this.F1) {
                ld21 ld21Var2 = this.d;
                ld21Var2.getClass();
                if (ld21Var2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw c(e2, ie30Var, e2.b, i4);
        }
    }

    @Override // p.jca
    public final void D() {
        W0();
        this.v2 = false;
        ygr ygrVar = (ygr) this.j2;
        ygrVar.Q = false;
        if (ygrVar.n()) {
            o58 o58Var = ygrVar.u;
            s58 s58Var = o58Var.e;
            s58Var.e();
            if (s58Var.u == -9223372036854775807L) {
                s58Var.h.a(0);
            }
            s58Var.w = s58Var.a();
            if (!o58Var.j || o58Var.c()) {
                o58Var.a.pause();
            }
        }
        this.t2 = false;
        this.x2 = -9223372036854775807L;
        this.y2 = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    @Override // p.dkh0
    public final void F0() throws ExoPlaybackException {
        try {
            ygr ygrVar = (ygr) this.j2;
            if (!ygrVar.N && ygrVar.n() && ygrVar.e()) {
                ygrVar.p();
                ygrVar.N = true;
            }
            long j = this.X1.h;
            if (j != -9223372036854775807L) {
                this.w2 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw c(e, e.c, e.b, this.F1 ? 5003 : 5002);
        }
    }

    @Override // p.dkh0
    public final boolean P0(ie30 ie30Var) {
        ld21 ld21Var = this.d;
        ld21Var.getClass();
        if (ld21Var.a != 0) {
            int iU0 = U0(ie30Var);
            if ((iU0 & 512) != 0) {
                ld21 ld21Var2 = this.d;
                ld21Var2.getClass();
                if (ld21Var2.a == 2 || (iU0 & SemanticState.ReadOnly) != 0 || (ie30Var.N == 0 && ie30Var.O == 0)) {
                    return true;
                }
            }
        }
        return ((ygr) this.j2).h(ie30Var) != 0;
    }

    @Override // p.dkh0
    public final int Q0(ie30 ie30Var) {
        int iU0;
        boolean z;
        boolean z2 = true;
        int iA = jca.a(1, 0, 0, 0);
        if (!asj0.k(ie30Var.f66p)) {
            return jca.a(0, 0, 0, 0);
        }
        int i = ie30Var.T;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        m48 m48Var = this.j2;
        if (!z4 || (z3 && hkh0.e("audio/raw") == null)) {
            iU0 = 0;
        } else {
            iU0 = U0(ie30Var);
            if (((ygr) m48Var).h(ie30Var) != 0) {
                return jca.a(4, 8, 32, iU0);
            }
        }
        if (!"audio/raw".equals(ie30Var.f66p) || ((ygr) m48Var).h(ie30Var) != 0) {
            int i3 = ie30Var.J;
            int i4 = ie30Var.L;
            ge30 ge30Var = new ge30();
            ge30Var.e("audio/raw");
            ge30Var.b(i3);
            ge30Var.f(i4);
            ge30Var.d(2);
            if (((ygr) m48Var).h(ge30Var.a()) != 0) {
                bg11 bg11VarV0 = V0(ie30Var, false, m48Var);
                if (!bg11VarV0.isEmpty()) {
                    if (!z4) {
                        return jca.a(2, 0, 0, 0);
                    }
                    bkh0 bkh0Var = (bkh0) bg11VarV0.get(0);
                    Context context = this.h2;
                    boolean zE = bkh0Var.e(context, ie30Var);
                    if (!zE) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= bg11VarV0.d) {
                                z = true;
                                z2 = zE;
                                break;
                            }
                            bkh0 bkh0Var2 = (bkh0) bg11VarV0.get(i5);
                            if (bkh0Var2.e(context, ie30Var)) {
                                z = false;
                                bkh0Var = bkh0Var2;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = true;
                        z2 = zE;
                        break;
                    }
                    int i6 = z2 ? 4 : 3;
                    if (z2 && bkh0Var.f(ie30Var)) {
                        i2 = 16;
                    }
                    return i6 | i2 | 32 | (bkh0Var.g ? 64 : 0) | (z ? SemanticState.Focused : 0) | iU0;
                }
            }
        }
        return iA;
    }

    public final int U0(ie30 ie30Var) {
        zw7 zw7VarA;
        ygr ygrVar = (ygr) this.j2;
        if (ygrVar.Z) {
            zw7VarA = zw7.d;
        } else {
            nx7 nx7VarB = ((r58) ygrVar.s).b(ygrVar.g(ie30Var));
            yw7 yw7Var = new yw7();
            yw7Var.a = nx7VarB.a;
            yw7Var.b = nx7VarB.b;
            yw7Var.c = nx7VarB.c;
            zw7VarA = yw7Var.a();
        }
        if (!zw7VarA.a) {
            return 0;
        }
        int i = zw7VarA.b ? 1536 : 512;
        return zw7VarA.c ? i | SemanticState.Modal : i;
    }

    public final void W0() {
        long j;
        long jMax;
        long j2;
        t();
        ygr ygrVar = (ygr) this.j2;
        k9r k9rVar = ygrVar.b;
        if (!ygrVar.n() || ygrVar.G) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(ygrVar.u.a(), zoi1.e0(ygrVar.q.e.b, ygrVar.j()));
            ArrayDeque arrayDeque = ygrVar.h;
            while (!arrayDeque.isEmpty() && jMin >= ((xgr) arrayDeque.getFirst()).c) {
                ygrVar.x = (xgr) arrayDeque.remove();
            }
            xgr xgrVar = ygrVar.x;
            long jG0 = jMin - xgrVar.c;
            long jH = zoi1.H(xgrVar.a.a, jG0);
            if (arrayDeque.isEmpty()) {
                sfa1 sfa1Var = (sfa1) k9rVar.d;
                if (!sfa1Var.isActive()) {
                    j = Long.MIN_VALUE;
                } else if (sfa1Var.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    long j3 = sfa1Var.n;
                    rfa1 rfa1Var = sfa1Var.k;
                    rfa1Var.getClass();
                    long jP = j3 - ((long) (rfa1Var.i.p() * (rfa1Var.j * rfa1Var.b)));
                    int i = sfa1Var.i.a;
                    int i2 = sfa1Var.h.a;
                    j = Long.MIN_VALUE;
                    long j4 = sfa1Var.o;
                    jG0 = i == i2 ? zoi1.g0(jG0, jP, j4, RoundingMode.DOWN) : zoi1.g0(jG0, jP * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jG0 = (long) (((double) sfa1Var.d) * jG0);
                }
                xgr xgrVar2 = ygrVar.x;
                j2 = xgrVar2.b + jG0;
                xgrVar2.d = jG0 - jH;
            } else {
                j = Long.MIN_VALUE;
                xgr xgrVar3 = ygrVar.x;
                j2 = xgrVar3.b + jH + xgrVar3.d;
            }
            long j5 = ((mr81) k9rVar.c).l;
            jMax = zoi1.e0(ygrVar.q.e.b, j5) + j2;
            long j6 = ygrVar.b0;
            if (j5 > j6) {
                long jE0 = zoi1.e0(ygrVar.q.e.b, j5 - j6);
                ygrVar.b0 = j5;
                ygrVar.c0 += jE0;
                Handler handler = ygrVar.d0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    ygrVar.d0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                ygrVar.d0.postDelayed(new fe(ygrVar, (byte) 27), 100L);
            }
        }
        if (jMax != j) {
            if (!this.q2) {
                jMax = Math.max(this.p2, jMax);
            }
            this.p2 = jMax;
            this.q2 = false;
        }
    }

    @Override // p.dkh0
    public final iar X(bkh0 bkh0Var, ie30 ie30Var, ie30 ie30Var2, boolean z) {
        iar iarVarB = bkh0Var.b(ie30Var, ie30Var2);
        int i = iarVarB.e;
        if (this.h1 == null && P0(ie30Var2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(bkh0Var.a);
        if (ie30Var2.q > this.l2) {
            i |= 64;
        }
        int i2 = i;
        return new iar(bkh0Var.a, ie30Var, ie30Var2, i2 != 0 ? 0 : iarVarB.d, i2);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    @Override // p.dkh0, p.jca
    public final void b(int i, Object obj) {
        vdf0 vdf0Var;
        m48 m48Var = this.j2;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            ygr ygrVar = (ygr) m48Var;
            if (ygrVar.J != fFloatValue) {
                ygrVar.J = fFloatValue;
                if (ygrVar.n()) {
                    ygrVar.u.a.setVolume(ygrVar.J);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            po7 po7Var = (po7) obj;
            po7Var.getClass();
            ygr ygrVar2 = (ygr) m48Var;
            if (ygrVar2.v.equals(po7Var)) {
                return;
            }
            ygrVar2.v = po7Var;
            if (ygrVar2.X) {
                return;
            }
            ygrVar2.r();
            return;
        }
        if (i == 6) {
            g89 g89Var = (g89) obj;
            g89Var.getClass();
            ygr ygrVar3 = (ygr) m48Var;
            if (ygrVar3.U.equals(g89Var)) {
                return;
            }
            if (ygrVar3.u != null) {
                ygrVar3.U.getClass();
            }
            ygrVar3.U = g89Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            ygr ygrVar4 = (ygr) m48Var;
            ygrVar4.V = audioDeviceInfo;
            o58 o58Var = ygrVar4.u;
            if (o58Var != null) {
                o58Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.u2 = ((Integer) obj).intValue();
            yjh0 yjh0Var = this.m1;
            if (yjh0Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.u2));
                yjh0Var.a(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            ygr ygrVar5 = (ygr) m48Var;
            ygrVar5.z = ((Boolean) obj).booleanValue();
            xgr xgrVar = new xgr(ygrVar5.w() ? k2u0.d : ygrVar5.y, -9223372036854775807L, -9223372036854775807L);
            if (ygrVar5.n()) {
                ygrVar5.w = xgrVar;
                return;
            } else {
                ygrVar5.x = xgrVar;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            ygr ygrVar6 = (ygr) m48Var;
            if (ygrVar6.T) {
                if (ygrVar6.S == iIntValue) {
                    ygrVar6.T = false;
                    if (ygrVar6.S != iIntValue) {
                        ygrVar6.S = iIntValue;
                        ygrVar6.R = iIntValue != 0;
                        ygrVar6.r();
                    }
                }
            } else if (ygrVar6.S != iIntValue) {
                ygrVar6.S = iIntValue;
                ygrVar6.R = iIntValue != 0;
                ygrVar6.r();
            }
            if (Build.VERSION.SDK_INT < 35 || (vdf0Var = this.k2) == null) {
                return;
            }
            vdf0Var.v(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            ygr ygrVar7 = (ygr) m48Var;
            AtomicInteger atomicInteger = ygr.e0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (ygrVar7.W == iIntValue2) {
                return;
            }
            ygrVar7.W = iIntValue2;
            ygrVar7.r();
            return;
        }
        if (i != 20) {
            super.b(i, obj);
            return;
        }
        obj.getClass();
        qx7 qx7Var = (qx7) obj;
        ygr ygrVar8 = (ygr) m48Var;
        if (qx7Var.equals(ygrVar8.s)) {
            return;
        }
        ((r58) ygrVar8.s).d();
        ygrVar8.s = qx7Var;
        tgr tgrVar = ygrVar8.t;
        if (tgrVar != null) {
            r58 r58Var = (r58) qx7Var;
            r58Var.f();
            h9d0 h9d0Var = r58Var.e;
            if (h9d0Var == null) {
                h9d0Var = new h9d0(Thread.currentThread());
                r58Var.e = h9d0Var;
            }
            h9d0Var.a(tgrVar);
        }
        ygrVar8.r();
    }

    @Override // p.dkh0
    public final ArrayList h0(ie30 ie30Var, boolean z) {
        bg11 bg11VarV0 = V0(ie30Var, z, this.j2);
        HashMap map = hkh0.a;
        ArrayList arrayList = new ArrayList((Collection) bg11VarV0);
        Collections.sort(arrayList, new yxh(new ekh0(this.h2, ie30Var, (byte) 1), (byte) 1));
        return arrayList;
    }

    @Override // p.jca
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p.dkh0
    public final long i0(long j, long j2, boolean z) {
        long jG0;
        ygr ygrVar = (ygr) this.j2;
        boolean z2 = ygrVar.l() && this.w2 != -9223372036854775807L;
        if (this.v2) {
            if (!ygrVar.n()) {
                jG0 = -9223372036854775807L;
            } else if (ygrVar.q.b()) {
                jG0 = zoi1.e0(ygrVar.q.e.b, ygrVar.u.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = ygrVar.u.a.getBufferSizeInFrames();
                int iW = jto1.w(ygrVar.q.e.a);
                dm5.y(iW != -2147483647);
                jG0 = zoi1.g0(bufferSizeInFrames, 1000000L, iW, RoundingMode.DOWN);
            }
            if (this.t2 && z2 && jG0 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(jG0, this.w2 - j) / (l() != null ? l().a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.S1) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // p.dkh0
    public final g2z k0(bkh0 bkh0Var, ie30 ie30Var, MediaCrypto mediaCrypto, float f) {
        int iIntValue;
        Integer num;
        ie30[] ie30VarArr = this.t;
        ie30VarArr.getClass();
        String str = bkh0Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = ie30Var.q;
        String str2 = ie30Var.f66p;
        int i = ie30Var.J;
        int i2 = 0;
        if (ie30VarArr.length != 1) {
            for (ie30 ie30Var2 : ie30VarArr) {
                if (bkh0Var.b(ie30Var, ie30Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, ie30Var2.q);
                }
            }
        }
        this.l2 = iMax;
        HashSet hashSet = hph0.a;
        this.m2 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = bkh0Var.c;
        int i3 = this.l2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i4 = ie30Var.L;
        mediaFormat.setInteger("sample-rate", i4);
        x74.n0(mediaFormat, ie30Var.s);
        x74.a0(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairC = kwg.c(ie30Var);
            if (pairC != null) {
                x74.a0(mediaFormat, "profile", ((Integer) pairC.first).intValue());
                x74.a0(mediaFormat, "level", ((Integer) pairC.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        ge30 ge30Var = new ge30();
        ge30Var.e("audio/raw");
        ge30Var.b(i);
        ge30Var.f(i4);
        ge30Var.d(4);
        ie30 ie30VarA = ge30Var.a();
        ygr ygrVar = (ygr) this.j2;
        if (ygrVar.h(ie30VarA) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.u2));
        }
        ie30 ie30Var3 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            qx7 qx7Var = ygrVar.s;
            qp7 qp7Var = qx7Var instanceof r58 ? ((r58) qx7Var).g : null;
            int i6 = 12;
            if (qp7Var == null) {
                oon1.H("AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                t380 t380Var = mk70.a;
                Iterator it = qp7Var.d.iterator();
                do {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) it.next();
                    iIntValue = num.intValue();
                } while (!mk70.a.contains(num));
                if (iIntValue != 0) {
                    i6 = iIntValue;
                } else {
                    for (Integer num2 : qp7Var.c) {
                        int iIntValue2 = num2.intValue();
                        if (mk70.a.contains(num2)) {
                            i2 = iIntValue2;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        i6 = i2;
                    }
                }
                int iBitCount = Integer.bitCount(i6);
                mediaFormat.setInteger("channel-mask", i6);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        V(mediaFormat);
        if ("audio/raw".equals(bkh0Var.b) && !"audio/raw".equals(str2)) {
            ie30Var3 = ie30Var;
        }
        this.o2 = ie30Var3;
        return new g2z(bkh0Var, mediaFormat, ie30Var, (Object) null, mediaCrypto, this.k2);
    }

    public final k2u0 l() {
        return ((ygr) this.j2).y;
    }

    @Override // p.dkh0
    public final void l0(gar garVar) {
        ie30 ie30Var;
        wgr wgrVar;
        if (Build.VERSION.SDK_INT < 29 || (ie30Var = garVar.b) == null || !Objects.equals(ie30Var.f66p, "audio/opus") || !this.F1) {
            return;
        }
        ByteBuffer byteBuffer = garVar.g;
        byteBuffer.getClass();
        ie30 ie30Var2 = garVar.b;
        ie30Var2.getClass();
        int i = ie30Var2.N;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            ygr ygrVar = (ygr) this.j2;
            o58 o58Var = ygrVar.u;
            if (o58Var == null || !o58Var.c() || (wgrVar = ygrVar.q) == null || !wgrVar.e.k) {
                return;
            }
            ygrVar.u.d(i, i2);
        }
    }

    public final void m(k2u0 k2u0Var) {
        ygr ygrVar = (ygr) this.j2;
        if (ygrVar.w()) {
            ygrVar.y = k2u0Var;
            ygrVar.t();
            return;
        }
        k2u0 k2u0Var2 = new k2u0(zoi1.i(k2u0Var.a, 0.1f, 8.0f), zoi1.i(k2u0Var.b, 0.1f, 8.0f));
        ygrVar.y = k2u0Var2;
        xgr xgrVar = new xgr(k2u0Var2, -9223372036854775807L, -9223372036854775807L);
        if (ygrVar.n()) {
            ygrVar.w = xgrVar;
        } else {
            ygrVar.x = xgrVar;
        }
    }

    public final boolean n() {
        boolean z = this.s2;
        this.s2 = false;
        return z;
    }

    public final long p() {
        if (this.h == 2) {
            W0();
        }
        return this.p2;
    }

    @Override // p.dkh0
    public final void r0(final Exception exc) {
        oon1.w("Audio codec error", exc);
        final em3 em3Var = this.i2;
        Handler handler = (Handler) em3Var.b;
        if (handler != null) {
            final byte b = 0;
            handler.post(new Runnable() { // from class: p.m38
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    Exception exc2 = exc;
                    em3 em3Var2 = em3Var;
                    switch (b2) {
                        case 0:
                            t38 t38Var = (t38) em3Var2.c;
                            String str = zoi1.a;
                            t38Var.C(exc2);
                            break;
                        default:
                            t38 t38Var2 = (t38) em3Var2.c;
                            String str2 = zoi1.a;
                            t38Var2.x(exc2);
                            break;
                    }
                }
            });
        }
    }

    @Override // p.dkh0
    public final void s0(long j, long j2, String str) {
        em3 em3Var = this.i2;
        Handler handler = (Handler) em3Var.b;
        if (handler != null) {
            handler.post(new r38(em3Var, str, j, j2, (byte) 0));
        }
    }

    @Override // p.jca
    public final boolean t() {
        if (!this.S1) {
            return false;
        }
        ygr ygrVar = (ygr) this.j2;
        if (ygrVar.n()) {
            return ygrVar.N && !ygrVar.l();
        }
        return true;
    }

    @Override // p.dkh0
    public final void t0(iwg iwgVar) {
        em3 em3Var = this.i2;
        Handler handler = (Handler) em3Var.b;
        if (handler != null) {
            handler.post(new ny2((Object) em3Var, (Object) iwgVar, (byte) 13));
        }
    }

    @Override // p.dkh0
    public final void u0(String str) {
        em3 em3Var = this.i2;
        Handler handler = (Handler) em3Var.b;
        if (handler != null) {
            handler.post(new ny2((Object) em3Var, (Object) str, (byte) 12));
        }
    }

    @Override // p.jca
    public final boolean v() {
        boolean zIsReady;
        if (((ygr) this.j2).l()) {
            this.x2 = -9223372036854775807L;
            this.y2 = true;
            return true;
        }
        if (!this.y2 || !this.v2) {
            return false;
        }
        if (q()) {
            zIsReady = this.N0;
        } else {
            p641 p641Var = this.i;
            p641Var.getClass();
            zIsReady = p641Var.isReady();
        }
        if (!zIsReady || q()) {
            return false;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.x2;
        if (j != -9223372036854775807L) {
            return jElapsedRealtime - j < 100;
        }
        this.x2 = jElapsedRealtime;
        return true;
    }

    @Override // p.dkh0
    public final iar v0(w2z w2zVar) {
        ie30 ie30Var = (ie30) w2zVar.c;
        ie30Var.getClass();
        this.n2 = ie30Var;
        iar iarVarV0 = super.v0(w2zVar);
        em3 em3Var = this.i2;
        Handler handler = (Handler) em3Var.b;
        if (handler != null) {
            handler.post(new c45((Object) em3Var, (Object) ie30Var, (Object) iarVarV0, (byte) 1));
        }
        return iarVarV0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    /* JADX WARN: Code duplicated, block: B:64:0x0100 A[Catch: AudioSink$ConfigurationException -> 0x00fe, TryCatch #0 {AudioSink$ConfigurationException -> 0x00fe, blocks: (B:50:0x00d3, B:53:0x00dc, B:55:0x00e0, B:57:0x00e9, B:61:0x00f8, B:64:0x0100, B:68:0x0108, B:69:0x010d, B:71:0x0122, B:73:0x0128, B:77:0x0136, B:78:0x0139), top: B:83:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107  */
    @Override // p.dkh0
    public final void w0(ie30 ie30Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int I;
        int integer;
        p2i0 p2i0Var;
        boolean z;
        ie30 ie30Var2 = this.o2;
        u280 u280Var = null;
        if (ie30Var2 != null) {
            ie30Var = ie30Var2;
        } else if (this.m1 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(ie30Var.f66p)) {
                I = ie30Var.M;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                I = mediaFormat.getInteger("pcm-encoding");
            } else {
                I = mediaFormat.containsKey("v-bits-per-sample") ? zoi1.I(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i = ie30Var.K;
            if (i == -1 || ie30Var.J != integer2) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i = integer;
            }
            ge30 ge30Var = new ge30();
            ge30Var.o = asj0.p("audio/raw");
            ge30Var.L = I;
            ge30Var.M = ie30Var.N;
            ge30Var.N = ie30Var.O;
            ge30Var.l = ie30Var.m;
            ge30Var.a = ie30Var.a;
            ge30Var.b = ie30Var.b;
            ge30Var.c = b380.p(ie30Var.c);
            ge30Var.d = ie30Var.d;
            ge30Var.e = ie30Var.e;
            ge30Var.f = ie30Var.f;
            ge30Var.I = integer2;
            ge30Var.J = i;
            ge30Var.K = mediaFormat.getInteger("sample-rate");
            ie30Var = new ie30(ge30Var);
            if (this.m2) {
                int i2 = ie30Var.J;
                if (i2 == 3) {
                    u280Var = muk1.a;
                } else if (i2 == 5) {
                    u280Var = muk1.b;
                } else if (i2 == 6) {
                    u280Var = muk1.c;
                } else if (i2 == 7) {
                    u280Var = muk1.d;
                } else if (i2 != 8) {
                    u280 u280Var2 = muk1.a;
                } else {
                    u280Var = muk1.e;
                }
            }
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            m48 m48Var = this.j2;
            if (i3 >= 29) {
                if (this.F1) {
                    ld21 ld21Var = this.d;
                    ld21Var.getClass();
                    if (ld21Var.a != 0) {
                        ld21 ld21Var2 = this.d;
                        ld21Var2.getClass();
                        int i4 = ld21Var2.a;
                        ygr ygrVar = (ygr) m48Var;
                        dm5.y(i3 >= 29);
                        ygrVar.j = i4;
                    } else {
                        ygr ygrVar2 = (ygr) m48Var;
                        if (i3 >= 29) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dm5.y(z);
                        ygrVar2.j = 0;
                    }
                } else {
                    ygr ygrVar3 = (ygr) m48Var;
                    if (i3 >= 29) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dm5.y(z);
                    ygrVar3.j = 0;
                }
            }
            yu3 yu3Var = new yu3(ie30Var);
            yu3Var.c = u280Var;
            sqe1 sqe1Var = this.P0;
            yu3Var.d = sqe1Var;
            yu3Var.e = this.Q0;
            if (!sqe1Var.p() && (p2i0Var = (p2i0) yu3Var.e) != null) {
                if (((sqe1) yu3Var.d).b(p2i0Var.a) == -1) {
                    z2 = false;
                }
                dm5.m(z2);
            }
            ((ygr) m48Var).c(new l48(yu3Var));
            R0(this.n1);
        } catch (AudioSink$ConfigurationException e) {
            throw c(e, e.a, false, 5001);
        }
    }

    @Override // p.dkh0, p.jca
    public final void x() {
        em3 em3Var = this.i2;
        this.r2 = true;
        this.n2 = null;
        this.w2 = -9223372036854775807L;
        this.t2 = false;
        try {
            ((ygr) this.j2).f();
            try {
                super.x();
            } finally {
                em3Var.l(this.W1);
            }
        } catch (Throwable th) {
            try {
                super.x();
                throw th;
            } finally {
                em3Var.l(this.W1);
            }
        }
    }

    @Override // p.dkh0
    public final void x0(long j) {
        ((ygr) this.j2).I = j;
    }

    @Override // p.jca
    public final void y(boolean z, boolean z2) {
        final far farVar = new far();
        this.W1 = farVar;
        final em3 em3Var = this.i2;
        Handler handler = (Handler) em3Var.b;
        final byte b = 1;
        if (handler != null) {
            handler.post(new Runnable() { // from class: p.n38
                @Override // java.lang.Runnable
                public final void run() {
                    switch (b) {
                        case 0:
                            em3 em3Var2 = em3Var;
                            far farVar2 = farVar;
                            synchronized (farVar2) {
                            }
                            t38 t38Var = (t38) em3Var2.c;
                            String str = zoi1.a;
                            t38Var.n(farVar2);
                            break;
                        default:
                            em3 em3Var3 = em3Var;
                            far farVar3 = farVar;
                            t38 t38Var2 = (t38) em3Var3.c;
                            String str2 = zoi1.a;
                            t38Var2.B(farVar3);
                            break;
                    }
                }
            });
        }
        ld21 ld21Var = this.d;
        ld21Var.getClass();
        boolean z3 = ld21Var.b;
        m48 m48Var = this.j2;
        if (z3) {
            ygr ygrVar = (ygr) m48Var;
            dm5.y(ygrVar.R);
            if (!ygrVar.X) {
                ygrVar.X = true;
                ygrVar.r();
            }
        } else {
            ygr ygrVar2 = (ygr) m48Var;
            if (ygrVar2.X) {
                ygrVar2.X = false;
                ygrVar2.r();
            }
        }
        dbu0 dbu0Var = this.f;
        dbu0Var.getClass();
        ygr ygrVar3 = (ygr) m48Var;
        ygrVar3.n = dbu0Var;
        rdd1 rdd1Var = this.g;
        rdd1Var.getClass();
        ((r58) ygrVar3.s).f = rdd1Var;
        ygrVar3.o = new z8c0(this, (byte) 15);
    }

    @Override // p.dkh0, p.jca
    public final void z(long j, boolean z, boolean z2) {
        super.z(j, z, z2);
        ((ygr) this.j2).f();
        this.p2 = j;
        this.w2 = -9223372036854775807L;
        this.x2 = -9223372036854775807L;
        this.y2 = false;
        this.s2 = false;
        this.t2 = false;
        this.q2 = true;
    }

    @Override // p.dkh0
    public final void z0() {
        ((ygr) this.j2).F = true;
    }

    @Override // p.jca
    public final wjh0 h() {
        return this;
    }
}
