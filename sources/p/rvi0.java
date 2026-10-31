package p;

import android.util.LongSparseArray;
import androidx.media3.exoplayer.drm.DrmSession;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rvi0 implements p641 {
    public final vjx0 a;
    public final vjx0 b;
    public final w2z c = new w2z((byte) 26);
    public final gar d = new gar(1);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] g;
    public long h;
    public boolean i;
    public boolean t;

    public rvi0(vjx0 vjx0Var, vjx0 vjx0Var2, ie30 ie30Var) {
        this.a = vjx0Var;
        this.b = vjx0Var2;
        int i = ie30Var.r;
        this.f = i != -1 ? i + 2 : 18;
        this.h = -9223372036854775807L;
    }

    public final int c(w2z w2zVar, gar garVar, int i) {
        byte[] bArr;
        boolean z;
        int length;
        int length2;
        int iC = this.a.c(w2zVar, garVar, i);
        if (iC == -4) {
            int i2 = 4;
            if (!garVar.f(4) && (i & 4) == 0) {
                boolean z2 = true;
                if ((i & 1) == 0 && !this.i) {
                    long j = garVar.f;
                    boolean z3 = this.t;
                    byte[] bArr2 = null;
                    LongSparseArray longSparseArray = this.e;
                    if (z3) {
                        break;
                    }
                    while (true) {
                        gar garVar2 = this.d;
                        garVar2.g();
                        vjx0 vjx0Var = this.b;
                        w2z w2zVar2 = this.c;
                        int iC2 = vjx0Var.c(w2zVar2, garVar2, 0);
                        if (iC2 != -3) {
                            if (iC2 != -5) {
                                if (garVar2.f(i2)) {
                                    this.t = z2;
                                } else {
                                    long j2 = garVar2.f;
                                    long j3 = this.h;
                                    if (j3 != -9223372036854775807L && j2 < j3) {
                                        this.i = z2;
                                        longSparseArray.clear();
                                        this.g = bArr2;
                                    }
                                    this.h = j2;
                                    ByteBuffer byteBuffer = garVar2.d;
                                    if (this.i || byteBuffer == null) {
                                        z = z2;
                                    } else {
                                        garVar2.j();
                                        ie30 ie30Var = (ie30) w2zVar2.c;
                                        if (ie30Var != null) {
                                            List list = ie30Var.s;
                                            length = 0;
                                            for (int i3 = 0; i3 < list.size(); i3++) {
                                                length += ((byte[]) list.get(i3)).length;
                                            }
                                        } else {
                                            length = 0;
                                        }
                                        byte[] bArr3 = new byte[byteBuffer.remaining() + length];
                                        if (ie30Var != null) {
                                            List list2 = ie30Var.s;
                                            int i4 = 0;
                                            length2 = 0;
                                            while (i4 < list2.size()) {
                                                byte[] bArr4 = (byte[]) list2.get(i4);
                                                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                                length2 += bArr4.length;
                                                i4++;
                                                z2 = z2;
                                            }
                                        } else {
                                            length2 = 0;
                                        }
                                        z = z2;
                                        byteBuffer.get(bArr3, length2, byteBuffer.remaining());
                                        longSparseArray.put(j2, bArr3);
                                        while (longSparseArray.size() > this.f) {
                                            longSparseArray.removeAt(0);
                                        }
                                    }
                                    if (j2 > j) {
                                        break;
                                    }
                                    z2 = z;
                                    i2 = 4;
                                    bArr2 = null;
                                }
                            }
                        }
                        break;
                        break;
                    }
                    long j4 = garVar.f;
                    int size = longSparseArray.size() - 1;
                    while (true) {
                        if (size < 0) {
                            bArr = null;
                            break;
                        }
                        if (longSparseArray.keyAt(size) <= j4) {
                            bArr = (byte[]) longSparseArray.valueAt(size);
                            break;
                        }
                        size--;
                    }
                    if (bArr != null) {
                        this.g = bArr;
                    }
                    byte[] bArr5 = this.g;
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        ByteBuffer byteBuffer2 = garVar.g;
                        if (byteBuffer2 == null || byteBuffer2.capacity() < length3) {
                            garVar.g = ByteBuffer.allocate(length3);
                        } else {
                            garVar.g.clear();
                        }
                        garVar.g.put(bArr5);
                        garVar.e(268435456);
                        return iC;
                    }
                }
            }
        }
        return iC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final void e() throws DrmSession.DrmSessionException, IOException {
        this.a.e();
        if (this.i) {
            return;
        }
        this.b.e();
    }

    public final int getFlags() {
        return this.a.getFlags();
    }

    public final boolean isReady() {
        return this.a.isReady();
    }

    public final int s(long j) {
        return this.a.s(j);
    }
}
