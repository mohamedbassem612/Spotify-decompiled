package p;

import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class upc1 implements ec10 {
    public final lqc1 a;
    public final ie30 b;
    public final ArrayList c;
    public gtf1 f;
    public gc10 g;
    public u980 h;
    public int i;
    public byte j;
    public long[] k;
    public long l;
    public byte[] e = zoi1.b;
    public final izr0 d = new izr0();

    public upc1(lqc1 lqc1Var, ie30 ie30Var) {
        ie30 ie30Var2;
        this.a = lqc1Var;
        if (ie30Var != null) {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.o = asj0.p("application/x-media3-cues");
            ge30VarA.k = ie30Var.f66p;
            ge30VarA.P = lqc1Var.i();
            ie30Var2 = new ie30(ge30VarA);
        } else {
            ie30Var2 = null;
        }
        this.b = ie30Var2;
        this.c = new ArrayList();
        this.j = (byte) 0;
        this.k = zoi1.c;
        this.l = -9223372036854775807L;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        byte b = this.j;
        byte b2 = 1;
        dm5.y((b == 0 || b == 5) ? false : true);
        this.l = j2;
        byte b3 = this.j;
        if (b3 == 2) {
            this.j = (byte) 1;
        } else {
            b2 = b3;
        }
        if (b2 == 4) {
            this.j = (byte) 3;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        dm5.y(this.j == 0);
        this.g = gc10Var;
        gtf1 gtf1VarW = gc10Var.w(0, 3);
        this.f = gtf1VarW;
        ie30 ie30Var = this.b;
        if (ie30Var != null) {
            gtf1VarW.a(ie30Var);
            gc10Var.s();
            u980 u980Var = new u980(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = u980Var;
            gc10Var.c(u980Var);
        }
        this.j = (byte) 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: RuntimeException -> 0x00f8, TryCatch #0 {RuntimeException -> 0x00f8, blocks: (B:33:0x007b, B:35:0x0081, B:38:0x008c, B:39:0x00b4, B:41:0x00ba, B:42:0x00c9, B:44:0x00d1, B:46:0x00e1, B:47:0x00f1, B:37:0x0089), top: B:73:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[Catch: RuntimeException -> 0x00f8, TryCatch #0 {RuntimeException -> 0x00f8, blocks: (B:33:0x007b, B:35:0x0081, B:38:0x008c, B:39:0x00b4, B:41:0x00ba, B:42:0x00c9, B:44:0x00d1, B:46:0x00e1, B:47:0x00f1, B:37:0x0089), top: B:73:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[Catch: RuntimeException -> 0x00f8, LOOP:1: B:39:0x00b4->B:41:0x00ba, LOOP_END, TryCatch #0 {RuntimeException -> 0x00f8, blocks: (B:33:0x007b, B:35:0x0081, B:38:0x008c, B:39:0x00b4, B:41:0x00ba, B:42:0x00c9, B:44:0x00d1, B:46:0x00e1, B:47:0x00f1, B:37:0x0089), top: B:73:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1 A[Catch: RuntimeException -> 0x00f8, TryCatch #0 {RuntimeException -> 0x00f8, blocks: (B:33:0x007b, B:35:0x0081, B:38:0x008c, B:39:0x00b4, B:41:0x00ba, B:42:0x00c9, B:44:0x00d1, B:46:0x00e1, B:47:0x00f1, B:37:0x0089), top: B:73:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[Catch: RuntimeException -> 0x00f8, TryCatch #0 {RuntimeException -> 0x00f8, blocks: (B:33:0x007b, B:35:0x0081, B:38:0x008c, B:39:0x00b4, B:41:0x00ba, B:42:0x00c9, B:44:0x00d1, B:46:0x00e1, B:47:0x00f1, B:37:0x0089), top: B:73:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x007b A[EXC_TOP_SPLITTER, PHI: r22
      0x007b: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x0079, B:29:0x0074] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        int i;
        long j;
        kqc1 kqc1Var;
        AtomicLong atomicLong;
        int i2;
        u980 u980Var;
        byte b = this.j;
        dm5.y((b == 0 || b == 5) ? false : true);
        byte b2 = this.j;
        if (b2 == 1) {
            int iJ = fc10Var.getLength() != -1 ? bmq0.j(fc10Var.getLength()) : 1024;
            if (iJ > this.e.length) {
                this.e = new byte[iJ];
            }
            this.i = 0;
            this.j = (byte) 2;
            b2 = 2;
        }
        ArrayList arrayList = this.c;
        if (b2 == 2) {
            byte[] bArrCopyOf = this.e;
            if (bArrCopyOf.length == this.i) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + SemanticState.ReadOnly);
                this.e = bArrCopyOf;
            }
            int i3 = this.i;
            int i4 = fc10Var.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
            if (i4 != -1) {
                this.i += i4;
            }
            long length = fc10Var.getLength();
            if (length != -1) {
                i = 0;
                if (this.i == length) {
                    try {
                        j = this.l;
                        if (j != -9223372036854775807L) {
                            kqc1Var = new kqc1(j, true);
                        } else {
                            kqc1Var = kqc1.c;
                        }
                        kqc1 kqc1Var2 = kqc1Var;
                        atomicLong = new AtomicLong(-9223372036854775807L);
                        this.a.g(this.e, 0, this.i, kqc1Var2, new h341(this, atomicLong, (byte) 12));
                        Collections.sort(arrayList);
                        this.k = new long[arrayList.size()];
                        for (i2 = i; i2 < arrayList.size(); i2++) {
                            this.k[i2] = ((tpc1) arrayList.get(i2)).a;
                        }
                        if (atomicLong.get() != -9223372036854775807L) {
                            gtf1 gtf1Var = this.f;
                            gtf1Var.getClass();
                            gtf1Var.g(atomicLong.get());
                            u980Var = this.h;
                            if (u980Var != null) {
                                u980Var.c = atomicLong.get();
                                gc10 gc10Var = this.g;
                                gc10Var.getClass();
                                gc10Var.c(this.h);
                            }
                        }
                        this.e = zoi1.b;
                        this.j = (byte) 4;
                    } catch (RuntimeException e) {
                        throw ParserException.a(e, "SubtitleParser failed.");
                    }
                }
            } else {
                i = 0;
            }
            if (i4 == -1) {
                j = this.l;
                if (j != -9223372036854775807L) {
                    kqc1Var = new kqc1(j, true);
                } else {
                    kqc1Var = kqc1.c;
                }
                kqc1 kqc1Var3 = kqc1Var;
                atomicLong = new AtomicLong(-9223372036854775807L);
                this.a.g(this.e, 0, this.i, kqc1Var3, new h341(this, atomicLong, (byte) 12));
                Collections.sort(arrayList);
                this.k = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.k[i2] = ((tpc1) arrayList.get(i2)).a;
                }
                if (atomicLong.get() != -9223372036854775807L) {
                    gtf1 gtf1Var2 = this.f;
                    gtf1Var2.getClass();
                    gtf1Var2.g(atomicLong.get());
                    u980Var = this.h;
                    if (u980Var != null) {
                        u980Var.c = atomicLong.get();
                        gc10 gc10Var2 = this.g;
                        gc10Var2.getClass();
                        gc10Var2.c(this.h);
                    }
                }
                this.e = zoi1.b;
                this.j = (byte) 4;
            }
        } else {
            i = 0;
        }
        if (this.j == 3) {
            if (fc10Var.r(fc10Var.getLength() != -1 ? bmq0.j(fc10Var.getLength()) : SemanticState.ReadOnly) == -1) {
                long j2 = this.l;
                for (int iF = j2 == -9223372036854775807L ? i : zoi1.f(this.k, j2, true); iF < arrayList.size(); iF++) {
                    f((tpc1) arrayList.get(iF));
                }
                this.j = (byte) 4;
            }
        }
        if (this.j == 4) {
            return -1;
        }
        return i;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        return true;
    }

    public final void f(tpc1 tpc1Var) {
        this.f.getClass();
        byte[] bArr = tpc1Var.b;
        int length = bArr.length;
        int length2 = bArr.length;
        izr0 izr0Var = this.d;
        izr0Var.P(bArr, length2);
        this.f.f(length, izr0Var);
        this.f.b(tpc1Var.a, 1, length, 0, null);
    }

    @Override // p.ec10
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.a.reset();
        this.j = (byte) 5;
    }
}
