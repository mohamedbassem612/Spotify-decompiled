package p;

import android.util.SparseArray;
import androidx.media3.muxer.MuxerException;
import androidx.media3.transformer.MuxerWrapper$AppendTrackFormatException;
import java.io.File;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dhn0 {
    public static final long t = zoi1.W(500);
    public final String a;
    public final zgn0 b;
    public final lqr c;
    public final SparseArray d;
    public final ie30 e;
    public boolean f;
    public boolean g;
    public int h;
    public long i;
    public long j;
    public long k;
    public ahn0 l;
    public final byte m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f35p;
    public long q;
    public volatile int r;
    public volatile int s;

    /* JADX WARN: Multi-variable type inference failed */
    public dhn0(String str, zgn0 zgn0Var, lqr lqrVar, int i, ie30 ie30Var) {
        this.a = str;
        this.b = zgn0Var;
        this.c = lqrVar;
        boolean z = false;
        dm5.m(i == 0 || i == 1);
        this.m = i;
        if ((i == 0 && ie30Var == null) || (i == 1 && ie30Var != null)) {
            z = true;
        }
        dm5.n(z, "appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.");
        this.e = ie30Var;
        this.d = new SparseArray();
        this.h = -2;
        this.f35p = -9223372036854775807L;
        this.j = Long.MAX_VALUE;
    }

    public static chn0 c(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        chn0 chn0Var = (chn0) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            chn0 chn0Var2 = (chn0) sparseArray.valueAt(i);
            if (chn0Var2.f < chn0Var.f) {
                chn0Var = chn0Var2;
            }
        }
        return chn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[EDGE_INSN: B:27:0x0072->B:59:0x00bf BREAK  A[LOOP:0: B:35:0x008b->B:41:0x0097]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ie30 ie30Var) throws MuxerWrapper$AppendTrackFormatException {
        int i;
        String str = ie30Var.f66p;
        int i2 = asj0.i(str);
        int i3 = 0;
        dm5.o(i2 == 1 || i2 == 2, "Unsupported track format: %s", str);
        if (i2 == 2) {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.B = (ie30Var.C + this.r) % 360;
            ie30Var = new ie30(ge30VarA);
            if (this.m == 1) {
                ie30 ie30Var2 = this.e;
                ie30Var2.getClass();
                boolean zD = ie30Var.d(ie30Var2);
                List list = ie30Var.s;
                List list2 = ie30Var2.s;
                if (!zD) {
                    if (!Objects.equals(ie30Var2.f66p, "video/avc") || !Objects.equals(ie30Var.f66p, "video/avc") || list2.size() != 2 || list.size() != 2 || !Arrays.equals((byte[]) list2.get(1), (byte[]) list.get(1))) {
                        list = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list2.get(0);
                    byte[] bArr2 = (byte[]) list.get(0);
                    if (7 >= bArr.length || bArr.length != bArr2.length) {
                        list = null;
                        break;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= bArr.length) {
                            int i5 = 0;
                            while (true) {
                                byte[] bArr3 = mqn1.a;
                                if (i5 >= 4) {
                                    if ((bArr[4] & 31) == 7 && bArr[5] != 0) {
                                        if (bArr2[7] >= bArr[7]) {
                                            break;
                                        }
                                        list = list2;
                                        break;
                                    }
                                } else if (bArr[i5] == bArr3[i5]) {
                                    i5++;
                                }
                            }
                        } else if (i4 == 7 || bArr[i4] == bArr2[i4]) {
                            i4++;
                        }
                        list = null;
                        break;
                    }
                }
                if (list == null) {
                    throw new MuxerWrapper$AppendTrackFormatException("Switching to MUXER_MODE_APPEND will fail.");
                }
                ge30 ge30VarA2 = ie30Var.a();
                ge30VarA2.r = list;
                ie30Var = new ie30(ge30VarA2);
            }
        }
        if (this.m != 2) {
            int i6 = this.s;
            dm5.z(i6 > 0, "The track count should be set before the formats are added.");
            dm5.z(this.d.size() < i6, "All track formats have already been added.");
            dm5.x("There is already a track of type %s", i2, !(this.d.indexOfKey(i2) >= 0));
            ahn0 ahn0VarA = this.l;
            if (ahn0VarA == null) {
                ahn0VarA = this.b.a(this.a);
                this.l = ahn0VarA;
            }
            chn0 chn0Var = new chn0(ahn0VarA.H(ie30Var), ie30Var);
            if (i2 == 1 && (i = ie30Var.N) > 0) {
                this.q = zoi1.g0(i, 1000000L, ie30Var.L, RoundingMode.FLOOR);
            }
            this.d.put(i2, chn0Var);
            zoi1.L(i2);
            LinkedHashMap linkedHashMap = x8r.a;
            synchronized (x8r.class) {
            }
            if (ie30Var.m != null) {
                while (true) {
                    rij0[] rij0VarArr = ie30Var.m.a;
                    if (i3 >= rij0VarArr.length) {
                        break;
                    }
                    this.l.R0(rij0VarArr[i3]);
                    i3++;
                }
            }
            if (this.d.size() == i6) {
                this.f = true;
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 1) {
                dm5.y(this.d.indexOfKey(1) >= 0);
                ie30 ie30Var3 = ((chn0) this.d.get(1)).a;
                if (!Objects.equals(ie30Var3.f66p, ie30Var.f66p)) {
                    throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - sampleMimeType: " + ie30Var3.f66p + " != " + ie30Var.f66p);
                }
                if (ie30Var3.J != ie30Var.J) {
                    throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - channelCount: " + ie30Var3.J + " != " + ie30Var.J);
                }
                if (ie30Var3.L == ie30Var.L) {
                    if (!ie30Var3.d(ie30Var)) {
                        throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - initializationData.");
                    }
                    return;
                }
                throw new MuxerWrapper$AppendTrackFormatException("Audio format mismatch - sampleRate: " + ie30Var3.L + " != " + ie30Var.L);
            }
            return;
        }
        dm5.y(this.d.indexOfKey(2) >= 0);
        ie30 ie30Var4 = ((chn0) this.d.get(2)).a;
        if (!Objects.equals(ie30Var4.f66p, ie30Var.f66p)) {
            throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - sampleMimeType: " + ie30Var4.f66p + " != " + ie30Var.f66p);
        }
        if (ie30Var4.w != ie30Var.w) {
            throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - width: " + ie30Var4.w + " != " + ie30Var.w);
        }
        if (ie30Var4.x != ie30Var.x) {
            throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - height: " + ie30Var4.x + " != " + ie30Var.x);
        }
        if (ie30Var4.C == ie30Var.C) {
            ie30 ie30Var5 = this.e;
            ie30Var5.getClass();
            if (!ie30Var.d(ie30Var5)) {
                throw new MuxerWrapper$AppendTrackFormatException("The initialization data of the newly added track format doesn't match appendVideoFormat.");
            }
            return;
        }
        throw new MuxerWrapper$AppendTrackFormatException("Video format mismatch - rotationDegrees: " + ie30Var4.C + " != " + ie30Var.C);
    }

    public final void b(int i) throws Exception {
        boolean z = true;
        if (i == 0 && this.m == 1) {
            return;
        }
        this.f = false;
        ahn0 ahn0Var = this.l;
        if (ahn0Var != null) {
            try {
                ahn0Var.close();
            } catch (MuxerException e) {
                if (i == 1) {
                    String message = e.getMessage();
                    message.getClass();
                    if (message.equals("Failed to stop the MediaMuxer")) {
                        return;
                    }
                }
                throw e;
            }
        }
        if (i == 0) {
            long length = new File(this.a).length();
            if (length <= 0) {
                length = -1;
            }
            bt00 bt00Var = ((myr) this.c.b).f98p;
            if (length <= 0 && length != -1) {
                z = false;
            }
            dm5.j(length, "Invalid file size = %s", z);
            bt00Var.c = length;
        }
    }

    public final boolean d(String str) {
        return this.b.b(asj0.i(str)).contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(int i, ByteBuffer byteBuffer, boolean z, long j) {
        Object[] objArr;
        long j2 = j;
        dm5.m(this.d.indexOfKey(i) >= 0);
        chn0 chn0Var = (chn0) this.d.get(i);
        SparseArray sparseArray = this.d;
        if (this.f) {
            if (sparseArray.size() != 1) {
                long j3 = j2 - ((chn0) sparseArray.get(i)).f;
                long j4 = t;
                if (j3 > j4) {
                    chn0 chn0VarC = c(sparseArray);
                    chn0VarC.getClass();
                    if (asj0.i(chn0VarC.a.f66p) != i) {
                        if (i != this.h) {
                            chn0 chn0VarC2 = c(sparseArray);
                            chn0VarC2.getClass();
                            this.i = chn0VarC2.f;
                        }
                        if (j2 - this.i <= j4) {
                            objArr = false;
                        }
                    }
                } else {
                    if (i != this.h) {
                        chn0 chn0VarC3 = c(sparseArray);
                        chn0VarC3.getClass();
                        this.i = chn0VarC3.f;
                    }
                    if (j2 - this.i <= j4) {
                        objArr = false;
                    }
                }
            }
            objArr = true;
        } else {
            objArr = false;
        }
        zoi1.L(i);
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        if (i == 2) {
            if (this.f35p == -9223372036854775807L) {
                this.f35p = j2;
            }
        } else if (i == 1) {
            j2 -= this.q;
        }
        if (objArr != true) {
            return false;
        }
        if (chn0Var.e == 0) {
            if (i == 2 && this.d.indexOfKey(1) >= 0 && j2 > 0) {
                dm5.y(this.f35p != -9223372036854775807L);
                oon1.H("Shifting first video timestamp from " + j2 + " to zero.");
                j2 = 0L;
            }
            chn0Var.c = j2;
        }
        chn0Var.e++;
        chn0Var.d += (long) byteBuffer.remaining();
        chn0Var.f = Math.max(chn0Var.f, j2);
        kgg1 kgg1Var = (kgg1) ((myr) this.c.b).i.b;
        azj azjVar = kgg1Var.v;
        if (azjVar != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) azjVar.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            azjVar.d = ((ScheduledExecutorService) azjVar.c).schedule(new v241((ifb1) azjVar.b, (byte) 20), azjVar.a, TimeUnit.MILLISECONDS);
        } else {
            dm5.y(kgg1Var.f == -9223372036854775807L);
        }
        this.l.getClass();
        this.l.j0(chn0Var.b, byteBuffer, new qac(byteBuffer.remaining(), j2, z ? 1 : 0));
        zoi1.L(i);
        synchronized (x8r.class) {
        }
        this.h = i;
        return true;
    }
}
