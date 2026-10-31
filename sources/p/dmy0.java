package p;

import android.util.SparseArray;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dmy0 implements ec10 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public un20 i;
    public gc10 j;
    public boolean k;
    public final yve1 a = new yve1(0);
    public final izr0 c = new izr0(SemanticState.Obscured);
    public final SparseArray b = new SparseArray();
    public final bmy0 d = new bmy0((byte) 0);

    @Override // p.ec10
    public final void a(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        yve1 yve1Var = this.a;
        synchronized (yve1Var) {
            j3 = yve1Var.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = yve1Var.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            yve1Var.f(j2);
        }
        un20 un20Var = this.i;
        if (un20Var != null) {
            un20Var.c(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            cmy0 cmy0Var = (cmy0) sparseArray.valueAt(i);
            cmy0Var.f = false;
            cmy0Var.a.b();
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.j = gc10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) {
        char c;
        long j;
        ?? r4;
        int i;
        long jB;
        ytw dr50Var;
        long j2;
        long j3;
        bmy0 bmy0Var = this.d;
        yve1 yve1Var = bmy0Var.b;
        this.j.getClass();
        long length = fc10Var.getLength();
        if (length != -1) {
            c = 3;
            if (!bmy0Var.d) {
                izr0 izr0Var = bmy0Var.c;
                if (!bmy0Var.f) {
                    long length2 = fc10Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j4 = length2 - ((long) iMin);
                    if (fc10Var.getPosition() != j4) {
                        sfv0Var.a = j4;
                        return 1;
                    }
                    izr0Var.O(iMin);
                    fc10Var.f();
                    fc10Var.h(0, izr0Var.a, iMin);
                    int i2 = izr0Var.b;
                    for (int i3 = izr0Var.c - 4; i3 >= i2; i3--) {
                        if (bmy0.b(izr0Var.a, i3) == 442) {
                            izr0Var.R(i3 + 4);
                            long jC = bmy0.c(izr0Var);
                            if (jC != -9223372036854775807L) {
                                j3 = jC;
                                bmy0Var.h = j3;
                                bmy0Var.f = true;
                                return 0;
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    bmy0Var.h = j3;
                    bmy0Var.f = true;
                    return 0;
                }
                if (bmy0Var.h == -9223372036854775807L) {
                    bmy0Var.a(fc10Var);
                    return 0;
                }
                if (bmy0Var.e) {
                    long j5 = bmy0Var.g;
                    if (j5 == -9223372036854775807L) {
                        bmy0Var.a(fc10Var);
                        return 0;
                    }
                    bmy0Var.i = yve1Var.c(bmy0Var.h) - yve1Var.b(j5);
                    bmy0Var.a(fc10Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, fc10Var.getLength());
                if (fc10Var.getPosition() != 0) {
                    sfv0Var.a = 0L;
                    return 1;
                }
                izr0Var.O(iMin2);
                fc10Var.f();
                fc10Var.h(0, izr0Var.a, iMin2);
                int i4 = izr0Var.c;
                for (int i5 = izr0Var.b; i5 < i4 - 3; i5++) {
                    if (bmy0.b(izr0Var.a, i5) == 442) {
                        izr0Var.R(i5 + 4);
                        long jC2 = bmy0.c(izr0Var);
                        if (jC2 != -9223372036854775807L) {
                            j2 = jC2;
                            bmy0Var.g = j2;
                            bmy0Var.e = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                bmy0Var.g = j2;
                bmy0Var.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            j = 0;
            r4 = 1;
            i = 0;
        } else {
            this.k = true;
            long j6 = bmy0Var.i;
            if (j6 != -9223372036854775807L) {
                j = 0;
                i = 0;
                r4 = 1;
                un20 un20Var = new un20(new sua((byte) 0), new pux0(yve1Var), j6, 1 + j6, 0L, length, 188L, 1000);
                this.i = un20Var;
                this.j.c(((xua) un20Var).a);
            } else {
                j = 0;
                r4 = 1;
                i = 0;
                this.j.c(new bc9(j6));
            }
        }
        un20 un20Var2 = this.i;
        if (un20Var2 != null && ((xua) un20Var2).c != null) {
            return un20Var2.a(fc10Var, sfv0Var);
        }
        fc10Var.f();
        long j7 = length != -1 ? length - fc10Var.j() : -1L;
        if (j7 != -1 && j7 < 4) {
            f();
            return -1;
        }
        izr0 izr0Var2 = this.c;
        if (!fc10Var.d(izr0Var2.a, i, 4, (boolean) r4)) {
            f();
            return -1;
        }
        izr0Var2.R(i);
        int iQ = izr0Var2.q();
        if (iQ == 441) {
            f();
            return -1;
        }
        if (iQ == 442) {
            fc10Var.h(i, izr0Var2.a, 10);
            izr0Var2.R(9);
            fc10Var.u((izr0Var2.E() & 7) + 14);
            return i;
        }
        if (iQ == 443) {
            fc10Var.h(i, izr0Var2.a, 2);
            izr0Var2.R(i);
            fc10Var.u(izr0Var2.L() + 6);
            return i;
        }
        if (((iQ & (-256)) >> 8) != r4) {
            fc10Var.u((int) r4);
            return i;
        }
        int i6 = iQ & 255;
        SparseArray sparseArray = this.b;
        cmy0 cmy0Var = (cmy0) sparseArray.get(i6);
        if (!this.e) {
            if (cmy0Var == null) {
                if (i6 == 189) {
                    dr50Var = new ua("video/mp2p");
                    this.f = r4;
                    this.h = fc10Var.getPosition();
                } else if ((iQ & 224) == 192) {
                    dr50Var = new wpm0(null, i, "video/mp2p");
                    this.f = r4;
                    this.h = fc10Var.getPosition();
                } else if ((iQ & 240) == 224) {
                    dr50Var = new dr50(null, "video/mp2p");
                    this.g = r4;
                    this.h = fc10Var.getPosition();
                } else {
                    dr50Var = null;
                }
                if (dr50Var != null) {
                    dr50Var.d(this.j, new wwg1(i6, SemanticState.Hidden));
                    cmy0Var = new cmy0(dr50Var, this.a);
                    sparseArray.put(i6, cmy0Var);
                }
            }
            if (fc10Var.getPosition() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = r4;
                this.j.s();
            }
        }
        fc10Var.h(i, izr0Var2.a, 2);
        izr0Var2.R(i);
        int iL = izr0Var2.L() + 6;
        if (cmy0Var == null) {
            fc10Var.u(iL);
            return i;
        }
        izr0Var2.O(iL);
        fc10Var.readFully(izr0Var2.a, i, iL);
        izr0Var2.R(6);
        ytw ytwVar = cmy0Var.a;
        bae baeVar = cmy0Var.c;
        izr0Var2.o(i, baeVar.b, 3);
        baeVar.m(i);
        baeVar.o(8);
        cmy0Var.d = baeVar.f();
        cmy0Var.e = baeVar.f();
        baeVar.o(6);
        izr0Var2.o(i, baeVar.b, baeVar.g(8));
        baeVar.m(i);
        yve1 yve1Var2 = cmy0Var.b;
        if (cmy0Var.d) {
            baeVar.o(4);
            long jG = ((long) baeVar.g(3)) << 30;
            baeVar.o(r4);
            long jG2 = jG | ((long) (baeVar.g(15) << 15));
            baeVar.o(r4);
            long jG3 = jG2 | ((long) baeVar.g(15));
            baeVar.o(r4);
            if (!cmy0Var.f && cmy0Var.e) {
                baeVar.o(4);
                long jG4 = ((long) baeVar.g(3)) << 30;
                baeVar.o(r4);
                long jG5 = jG4 | ((long) (baeVar.g(15) << 15));
                baeVar.o(r4);
                long jG6 = ((long) baeVar.g(15)) | jG5;
                baeVar.o(r4);
                yve1Var2.b(jG6);
                cmy0Var.f = r4;
            }
            jB = yve1Var2.b(jG3);
        } else {
            jB = j;
        }
        ytwVar.f(4, jB);
        ytwVar.a(izr0Var2);
        ytwVar.e();
        izr0Var2.Q(izr0Var2.a.length);
        return i;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        byte[] bArr = new byte[14];
        uyr uyrVar = (uyr) fc10Var;
        uyrVar.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            uyrVar.v(bArr[13] & 7, false);
            uyrVar.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((cmy0) sparseArray.valueAt(i)).a.c();
            i++;
        }
    }

    @Override // p.ec10
    public final void release() {
    }
}
