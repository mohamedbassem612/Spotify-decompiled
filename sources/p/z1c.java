package p;

import com.spotify.performancesdk.observationplatform.impl.SeqlockNative;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z1c implements si90, syp0 {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public z1c(ByteBuffer byteBuffer, long j) {
        this.c = byteBuffer;
        this.a = j;
        this.d = new ReentrantLock();
        this.b = Long.MIN_VALUE;
        byteBuffer.order(ByteOrder.nativeOrder());
    }

    public void a(jh5 jh5Var, Object obj) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
        if (obj != null) {
            concurrentHashMap.put(jh5Var, new f9n(((yqg) this.c).b(), obj));
        } else {
            concurrentHashMap.remove(jh5Var);
        }
    }

    public Object b(jh5 jh5Var) {
        f9n f9nVar = (f9n) ((ConcurrentHashMap) this.d).get(jh5Var);
        if (f9nVar != null) {
            if (((yqg) this.c).b() - f9nVar.b > jfv.h(this.a)) {
                f9nVar = null;
            }
            if (f9nVar != null) {
                return f9nVar.a;
            }
        }
        return null;
    }

    public Double c(long j, long j2) {
        if (j < this.b) {
            this.c = null;
            this.a = 0L;
            this.b = 0L;
            this.d = null;
        }
        this.b = j;
        Long l = (Long) this.c;
        if (l != null) {
            long jLongValue = j2 - l.longValue();
            if (0 <= jLongValue && jLongValue < 251) {
                long jLongValue2 = j2 - l.longValue();
                if (jLongValue2 < 50) {
                    return (Double) this.d;
                }
                this.d = Double.valueOf((j - this.a) / (jLongValue2 * 1000));
                this.c = Long.valueOf(j2);
                this.a = j;
                return (Double) this.d;
            }
        }
        this.d = null;
        if (j > 0) {
            this.c = Long.valueOf(j2);
            this.a = j;
        }
        return null;
    }

    public void d(long j, LinkedHashSet linkedHashSet) {
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        try {
            if (j > this.b) {
                e(linkedHashSet);
                this.b = j;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean e(LinkedHashSet linkedHashSet) {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        long j = this.a;
        int iLoadSequenceAcquire = SeqlockNative.loadSequenceAcquire(j) | 1;
        SeqlockNative.storeSequenceRelease(j, iLoadSequenceAcquire);
        Iterator it = linkedHashSet.iterator();
        int length = 8;
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.US_ASCII);
            if (bytes.length + 4 + length > byteBuffer.capacity()) {
                byteBuffer.putInt(4, i);
                SeqlockNative.storeSequenceRelease(j, iLoadSequenceAcquire + 1);
                return z;
            }
            byteBuffer.putInt(length, bytes.length);
            int i2 = length + 4;
            byteBuffer.position(i2);
            byteBuffer.put(bytes);
            length = i2 + bytes.length;
            i++;
        }
        z = true;
        byteBuffer.putInt(4, i);
        SeqlockNative.storeSequenceRelease(j, iLoadSequenceAcquire + 1);
        return z;
    }

    public long f(fc10 fc10Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    public fn51 i() {
        dm5.y(this.a != -1);
        return new bc9((xn20) this.c, this.a, (byte) 1);
    }

    public void j(long j) {
        long[] jArr = (long[]) ((t7y) this.d).b;
        this.b = jArr[zoi1.f(jArr, j, true)];
    }

    public z1c(long j, int i) {
        dm5.y(((nu3) this.c) == null);
        this.a = j;
        this.b = j + ((long) i);
    }

    public z1c(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
