package p;

import android.util.Pair;
import app.p000rive.semantics.SemanticState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vpm0 {
    public final s420 a;
    public final zsc b;
    public final boolean c;
    public final jpa0 g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public pqz0 n = pqz0.a(0L, 0L);
    public long o = 0;

    public vpm0(s420 s420Var, zsc zscVar, boolean z, boolean z2) {
        this.a = s420Var;
        this.b = zscVar;
        this.c = z;
        this.j = z2;
        jpa0 jpa0Var = new jpa0((byte) 6, false);
        jpa0Var.b = ByteBuffer.allocateDirect(0);
        this.g = jpa0Var;
    }

    public final void a() throws IOException {
        if (this.j) {
            d();
            return;
        }
        ByteBuffer byteBufferL = r2c.l(this.d, this.b);
        int iRemaining = byteBufferL.remaining();
        long j = iRemaining + 8;
        if (this.l - this.m < j) {
            e(byteBufferL, ((Long) this.n.b.d()).longValue() + j);
            dm5.y(this.l - this.m >= j);
        }
        long j2 = this.m;
        s420 s420Var = this.a;
        s420Var.a(j2);
        s420Var.write(byteBufferL);
        long j3 = ((long) iRemaining) + j2;
        long jLongValue = ((Long) this.n.b.d()).longValue() - j3;
        dm5.y(jLongValue < 2147483647L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        String str = zoi1.a;
        byteBufferAllocate.put("free".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.flip();
        s420Var.write(byteBufferAllocate);
        this.l = j2;
        f(j2 - this.k);
        this.n = pqz0.a(Long.valueOf(j2), Long.valueOf(j2 + ((long) byteBufferL.limit())));
        s420Var.b.truncate(j3);
    }

    public final void b() {
        ArrayList arrayList;
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 >= arrayList2.size()) {
                break;
            }
            g((ejf1) arrayList2.get(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.e;
            if (i3 >= arrayList.size()) {
                break;
            }
            g((ejf1) arrayList.get(i3));
            i3++;
        }
        if (this.f.get()) {
            a();
            if (arrayList.isEmpty()) {
                return;
            }
            yeh0 yeh0VarY = mth1.y(0L);
            zsc zscVar = this.b;
            zscVar.c(yeh0VarY);
            ByteBuffer byteBufferG = r2c.g();
            zsc zscVar2 = new zsc((byte) 14);
            zscVar2.c((upm0) zscVar.e);
            zscVar2.c(new yeh0("auxiliary.tracks.interleaved", new byte[]{1}, 0, 75));
            int size = arrayList.size();
            byte[] bArr = new byte[size + 2];
            bArr[0] = 1;
            bArr[1] = (byte) size;
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    zscVar2.c(new yeh0("auxiliary.tracks.map", bArr, 0, 0));
                    break;
                }
                ejf1 ejf1Var = (ejf1) arrayList.get(i4);
                int i5 = ejf1Var.b.h;
                if (i5 != 1) {
                    i = 2;
                    if (i5 == 2) {
                        i = 1;
                    } else if (i5 != 3) {
                        if (i5 != 4) {
                            bhn0.e(ejf1Var.b.h, "Unsupported auxiliary track type ");
                            break;
                        }
                        i = 3;
                    } else {
                        continue;
                    }
                } else {
                    i = 0;
                }
                bArr[i4 + 2] = (byte) i;
                i4++;
            }
            ByteBuffer byteBufferL = r2c.l(arrayList, zscVar2);
            long jRemaining = byteBufferL.remaining() + byteBufferG.remaining();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            String str = zoi1.a;
            byteBufferAllocate.put("axte".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putLong(jRemaining + 16);
            byteBufferAllocate.flip();
            ByteBuffer byteBufferV = yoi1.v(new ByteBuffer[]{byteBufferAllocate, byteBufferG, byteBufferL});
            long jRemaining2 = byteBufferV.remaining();
            byte[] bArr2 = new byte[8];
            for (int i6 = 7; i6 >= 0; i6--) {
                bArr2[i6] = (byte) (255 & jRemaining2);
                jRemaining2 >>= 8;
            }
            zscVar.c(new yeh0("auxiliary.tracks.length", bArr2, 0, 78));
            a();
            ((HashSet) zscVar.d).remove(yeh0VarY);
            s420 s420Var = this.a;
            FileChannel fileChannel = s420Var.b;
            zscVar.c(mth1.y(fileChannel.size()));
            long size2 = fileChannel.size();
            a();
            dm5.y(size2 == fileChannel.size());
            s420Var.a(fileChannel.size());
            s420Var.write(byteBufferV);
        }
    }

    public final void c(long j) throws IOException {
        if (this.j) {
            return;
        }
        long j2 = this.m;
        if (j2 + j >= this.l) {
            e(r2c.l(this.d, this.b), Math.max(this.l + Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f))) + j, ((Long) this.n.b.d()).longValue()));
        }
    }

    public final void d() throws IOException {
        ByteBuffer byteBufferL = r2c.l(this.d, this.b);
        int iRemaining = byteBufferL.remaining();
        long jRemaining = byteBufferL.remaining() + 8;
        long j = this.i;
        long j2 = this.h;
        long j3 = j - j2;
        s420 s420Var = this.a;
        if (jRemaining <= j3) {
            s420Var.a(j2);
            s420Var.write(byteBufferL);
            s420Var.write(yoi1.V("free", ByteBuffer.allocate((int) ((this.i - s420Var.b.position()) - 8))));
        } else {
            this.j = false;
            long j4 = this.m;
            this.l = j4;
            s420Var.a(j4);
            s420Var.write(byteBufferL);
            this.n = pqz0.a(Long.valueOf(this.l), Long.valueOf(this.l + ((long) iRemaining)));
            ByteBuffer byteBufferV = yoi1.V("free", ByteBuffer.allocate((int) ((this.i - this.h) - 8)));
            s420Var.a(this.h);
            s420Var.write(byteBufferV);
        }
        f(this.m - this.k);
    }

    public final void e(ByteBuffer byteBuffer, long j) throws IOException {
        dm5.y(j >= ((Long) this.n.b.d()).longValue());
        dm5.y(j >= this.l);
        s420 s420Var = this.a;
        s420Var.a(j);
        s420Var.write(yoi1.V("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.l = j2;
        f(j2 - this.k);
        this.n = pqz0.a(Long.valueOf(j), Long.valueOf(j + ((long) byteBuffer.remaining())));
    }

    public final void f(long j) throws IOException {
        long j2 = this.k + 8;
        s420 s420Var = this.a;
        s420Var.a(j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        s420Var.write(byteBufferAllocate);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113 A[LOOP:2: B:36:0x010f->B:38:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0125  */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    /* JADX WARN: Code duplicated, block: B:48:0x0165 A[LOOP:3: B:46:0x0161->B:48:0x0165, LOOP_END] */
    public final void g(ejf1 ejf1Var) throws IOException {
        bg11 bg11VarP;
        int i;
        int iRemaining;
        boolean z;
        ByteBuffer byteBufferSlice;
        int i2;
        ArrayDeque arrayDeque = ejf1Var.g;
        int size = arrayDeque.size();
        ArrayDeque arrayDeque2 = ejf1Var.f;
        dm5.y(size == arrayDeque2.size());
        if (arrayDeque2.isEmpty()) {
            return;
        }
        boolean andSet = this.f.getAndSet(true);
        long jLimit = 0;
        s420 s420Var = this.a;
        if (!andSet) {
            s420Var.a(0L);
            FileChannel fileChannel = s420Var.b;
            s420Var.write(r2c.g());
            if (this.j) {
                this.h = fileChannel.position();
                s420Var.write(yoi1.V("free", ByteBuffer.allocate(400000)));
                this.i = fileChannel.position();
            }
            this.k = fileChannel.position();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            String str = zoi1.a;
            byteBufferAllocate.put("mdat".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putLong(16L);
            byteBufferAllocate.flip();
            s420Var.write(byteBufferAllocate);
            long j = this.k + 16;
            this.m = j;
            if (this.j) {
                j = Long.MAX_VALUE;
            }
            this.l = j;
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            jLimit += (long) ((ByteBuffer) it.next()).limit();
        }
        c(jLimit);
        ejf1Var.d.add(Long.valueOf(this.m));
        ejf1Var.e.add(Integer.valueOf(arrayDeque2.size()));
        do {
            qac qacVar = (qac) arrayDeque2.removeFirst();
            ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.removeFirst();
            ie30 ie30Var = ejf1Var.b;
            String str2 = ie30Var.f66p;
            str2.getClass();
            boolean zEquals = str2.equals("video/dolby-vision");
            jpa0 jpa0Var = this.g;
            if (zEquals) {
                Pair pairH = r2c.h(ie30Var);
                pairH.getClass();
                if (((Integer) pairH.first).intValue() != 10) {
                    qzs0 qzs0Var = qzs0.h;
                    if (byteBuffer.hasRemaining()) {
                        bg11VarP = xyn1.p(byteBuffer);
                        iRemaining = 0;
                        for (i = 0; i < bg11VarP.d; i++) {
                            iRemaining += ((ByteBuffer) bg11VarP.get(i)).remaining() + 4;
                        }
                        if (iRemaining >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dm5.m(z);
                        if (((ByteBuffer) jpa0Var.b).remaining() < iRemaining) {
                            jpa0Var.b = ByteBuffer.allocateDirect(Math.max(iRemaining, ((ByteBuffer) jpa0Var.b).capacity() * 2));
                        }
                        byteBufferSlice = ((ByteBuffer) jpa0Var.b).slice();
                        ByteBuffer byteBuffer2 = (ByteBuffer) jpa0Var.b;
                        byteBuffer2.position(byteBuffer2.position() + iRemaining);
                        byteBufferSlice.limit(iRemaining);
                        for (i2 = 0; i2 < bg11VarP.d; i2++) {
                            ByteBuffer byteBuffer3 = (ByteBuffer) bg11VarP.get(i2);
                            byteBufferSlice.putInt(byteBuffer3.remaining());
                            byteBufferSlice.put(byteBuffer3);
                        }
                        byteBufferSlice.rewind();
                        byteBuffer.position(byteBuffer.limit());
                        byteBuffer = byteBufferSlice;
                    }
                    qacVar = new qac(byteBuffer.remaining(), qacVar.a, qacVar.c);
                }
            } else if (str2.equals("video/avc") || str2.equals("video/hevc")) {
                qzs0 qzs0Var2 = qzs0.h;
                if (byteBuffer.hasRemaining()) {
                    bg11VarP = xyn1.p(byteBuffer);
                    iRemaining = 0;
                    while (i < bg11VarP.d) {
                        iRemaining += ((ByteBuffer) bg11VarP.get(i)).remaining() + 4;
                    }
                    if (iRemaining >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dm5.m(z);
                    if (((ByteBuffer) jpa0Var.b).remaining() < iRemaining) {
                        jpa0Var.b = ByteBuffer.allocateDirect(Math.max(iRemaining, ((ByteBuffer) jpa0Var.b).capacity() * 2));
                    }
                    byteBufferSlice = ((ByteBuffer) jpa0Var.b).slice();
                    ByteBuffer byteBuffer4 = (ByteBuffer) jpa0Var.b;
                    byteBuffer4.position(byteBuffer4.position() + iRemaining);
                    byteBufferSlice.limit(iRemaining);
                    while (i2 < bg11VarP.d) {
                        ByteBuffer byteBuffer5 = (ByteBuffer) bg11VarP.get(i2);
                        byteBufferSlice.putInt(byteBuffer5.remaining());
                        byteBufferSlice.put(byteBuffer5);
                    }
                    byteBufferSlice.rewind();
                    byteBuffer.position(byteBuffer.limit());
                    byteBuffer = byteBufferSlice;
                }
                qacVar = new qac(byteBuffer.remaining(), qacVar.a, qacVar.c);
            }
            c(byteBuffer.remaining());
            s420Var.a(this.m);
            this.m += (long) s420Var.b.write(byteBuffer);
            ((ByteBuffer) jpa0Var.b).clear();
            ejf1Var.c.add(qacVar);
        } while (!arrayDeque2.isEmpty());
        dm5.y(this.m <= this.l);
    }

    public final void h(ejf1 ejf1Var, ByteBuffer byteBuffer, qac qacVar) {
        ByteBuffer byteBufferAllocateDirect;
        yjp0 yjp0Var;
        ie30 ie30Var = ejf1Var.b;
        String str = ie30Var.f66p;
        if (ie30Var.s.isEmpty() && ejf1Var.j == null) {
            if (Objects.equals(str, "video/av01")) {
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                ArrayList arrayList = new ArrayList();
                ByteBuffer byteBufferT = null;
                ByteBuffer byteBufferAllocate = null;
                for (xjp0 xjp0Var : s9p1.L(byteBufferDuplicate)) {
                    int i = xjp0Var.a;
                    if (i == 5) {
                        arrayList.add(m0p1.t(xjp0Var));
                    } else if (i == 1 && byteBufferT == null) {
                        byteBufferT = m0p1.t(xjp0Var);
                        byteBufferAllocate = ByteBuffer.allocate(4);
                        byteBufferAllocate.put((byte) -127);
                        try {
                            yjp0Var = new yjp0(xjp0Var);
                        } catch (wjp0 unused) {
                            yjp0Var = null;
                        }
                        dm5.s(yjp0Var, "No sequence header available.");
                        byteBufferAllocate.put((byte) ((yjp0Var.g << 5) | yjp0Var.h));
                        byteBufferAllocate.put((byte) ((yjp0Var.i > 0 ? SemanticState.Focused : 0) | (yjp0Var.l ? 64 : 0) | (yjp0Var.m ? 32 : 0) | (yjp0Var.n ? 16 : 0) | (yjp0Var.o ? 8 : 0) | (yjp0Var.f176p ? 4 : 0) | yjp0Var.q));
                        boolean z = yjp0Var.j;
                        byteBufferAllocate.put((byte) ((z ? yjp0Var.k & 15 : 0) | (z ? 16 : 0)));
                        byteBufferAllocate.flip();
                    }
                }
                dm5.s(byteBufferT, "No sequence header available.");
                ByteBuffer byteBufferV = yoi1.v(new ByteBuffer[]{byteBufferT, yoi1.v((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0]))});
                dm5.s(byteBufferAllocate, "csdHeader is null.");
                ejf1Var.j = yoi1.v(new ByteBuffer[]{byteBufferAllocate, byteBufferV}).array();
            } else if (Objects.equals(str, "video/x-vnd.on2.vp9")) {
                ejf1Var.j = kwg.b(byteBuffer.duplicate());
            }
        }
        dm5.n(ejf1Var.k == -9223372036854775807L, "Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag");
        int i2 = qacVar.b;
        long j = qacVar.a;
        int i3 = qacVar.c;
        if (i2 != 0 && byteBuffer.remaining() != 0) {
            if ((i3 & 1) > 0) {
                ejf1Var.i = true;
            }
            if (ejf1Var.i || !asj0.o(str)) {
                if (ejf1Var.l) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                    byteBufferAllocateDirect.put(byteBuffer);
                    byteBufferAllocateDirect.rewind();
                } else {
                    byteBufferAllocateDirect = byteBuffer;
                }
                ejf1Var.f.addLast(new qac(byteBufferAllocateDirect.remaining(), j, i3));
                ejf1Var.g.addLast(byteBufferAllocateDirect);
            }
        } else if ((i3 & 4) != 0) {
            ejf1Var.k = j;
        }
        g(ejf1Var);
        if (this.d.contains(ejf1Var) && this.j && j - this.o >= 1000000) {
            d();
            this.o = j;
        }
    }
}
