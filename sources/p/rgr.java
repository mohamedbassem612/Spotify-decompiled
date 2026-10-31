package p;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rgr {
    public int b;
    public long h;
    public long j;
    public boolean k;
    public final SparseArray a = new SparseArray();
    public c18 c = c18.e;
    public int d = -1;
    public m1d[] e = new m1d[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = Long.MAX_VALUE;

    public final int a(c18 c18Var, long j) throws AudioProcessor$UnhandledAudioFormatException {
        c();
        c();
        c18 c18Var2 = this.c;
        if (c18Var.a != c18Var2.a || !kto1.r(c18Var) || !kto1.r(c18Var2)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.c, c18Var);
        }
        long jT = zoi1.t(c18Var.a, j - this.f);
        int i = this.b;
        this.b = i + 1;
        this.a.append(i, new qgr(this, c18Var, nge.a(c18Var.b, this.c.b), jT));
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        return i;
    }

    public final m1d b(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.d * this.c.d).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        return new m1d(byteBufferOrder, j, j + ((long) this.d));
    }

    public final void c() {
        dm5.z(!this.c.equals(c18.e), "Audio mixer is not configured.");
    }

    public final void d(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        dm5.z(this.c.equals(c18.e), "Audio mixer already configured.");
        if (!kto1.r(c18Var)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", c18Var);
        }
        this.c = c18Var;
        this.d = (500 * c18Var.a) / 1000;
        this.f = 0L;
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        this.e = new m1d[]{b(0L), b(this.d)};
        this.g = Math.min(this.i, this.h + ((long) this.d));
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.a.size() == 0;
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer, int i) {
        long j;
        ByteBuffer byteBuffer2 = byteBuffer;
        c();
        if (byteBuffer2.hasRemaining()) {
            SparseArray sparseArray = this.a;
            String str = zoi1.a;
            dm5.z(sparseArray.indexOfKey(i) >= 0, "Source not found.");
            qgr qgrVar = (qgr) sparseArray.get(i);
            if (qgrVar.a >= this.g) {
                return;
            }
            long jMin = Math.min(qgrVar.a + ((long) (byteBuffer2.remaining() / qgrVar.b.d)), this.g);
            if (qgrVar.c.d) {
                qgrVar.a(byteBuffer2, jMin);
                return;
            }
            long j2 = qgrVar.a;
            long j3 = this.h;
            if (j2 < j3) {
                qgrVar.a(byteBuffer2, Math.min(jMin, j3));
                if (qgrVar.a == jMin) {
                    return;
                }
            }
            m1d[] m1dVarArr = this.e;
            int length = m1dVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                m1d m1dVar = m1dVarArr[i2];
                long j4 = qgrVar.a;
                if (j4 >= m1dVar.b) {
                    j = jMin;
                } else {
                    int i3 = ((int) (j4 - m1dVar.a)) * this.c.d;
                    ByteBuffer byteBuffer3 = (ByteBuffer) m1dVar.c;
                    byteBuffer3.position(byteBuffer3.position() + i3);
                    long jMin2 = Math.min(jMin, m1dVar.b);
                    ByteBuffer byteBuffer4 = (ByteBuffer) m1dVar.c;
                    c18 c18Var = this.c;
                    dm5.m(jMin2 >= qgrVar.a);
                    int i4 = (int) (jMin2 - qgrVar.a);
                    c18 c18Var2 = qgrVar.b;
                    nge ngeVar = qgrVar.c;
                    qgrVar.d.getClass();
                    j = jMin;
                    kto1.A(byteBuffer2, c18Var2, byteBuffer4, c18Var, ngeVar, i4, true);
                    qgrVar.a = jMin2;
                    ((ByteBuffer) m1dVar.c).reset();
                    if (qgrVar.a == j) {
                        break;
                    }
                }
                i2++;
                byteBuffer2 = byteBuffer;
                jMin = j;
            }
            LinkedHashMap linkedHashMap = x8r.a;
            synchronized (x8r.class) {
            }
        }
    }
}
