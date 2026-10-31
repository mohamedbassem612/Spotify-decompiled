package p;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uy70 extends jca {
    public final fxa T0;
    public final gar U0;
    public final ArrayDeque V0;
    public boolean W0;
    public boolean X0;
    public ty70 Y0;
    public long Z0;
    public long a1;
    public byte b1;
    public int c1;
    public ie30 d1;
    public gxa e1;
    public gar f1;
    public ImageOutput g1;
    public bp00 h1;
    public Bitmap i1;
    public boolean j1;
    public qjb k1;
    public qjb l1;
    public int m1;
    public boolean n1;

    public uy70(fxa fxaVar) {
        super(4);
        this.T0 = fxaVar;
        this.g1 = ImageOutput.a;
        this.U0 = new gar(0);
        this.Y0 = ty70.c;
        this.V0 = new ArrayDeque();
        this.a1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.b1 = (byte) 0;
        this.c1 = 1;
    }

    @Override // p.jca
    public final void A() {
        Y();
    }

    @Override // p.jca
    public final void B() {
        Y();
        this.c1 = Math.min(this.c1, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p.jca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(p.ie30[] r5, long r6, long r8, p.p2i0 r10) {
        /*
            r4 = this;
            p.ty70 r5 = r4.Y0
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.V0
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.a1
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.Z0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            p.ty70 r6 = new p.ty70
            long r0 = r4.a1
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            p.ty70 r5 = new p.ty70
            r5.<init>(r0, r8)
            r4.Y0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uy70.E(p.ie30[], long, long, p.p2i0):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    @Override // p.jca
    public final void I(long j, long j2) throws ExoPlaybackException {
        if (this.X0) {
            return;
        }
        if (this.d1 == null) {
            w2z w2zVar = this.c;
            w2zVar.b();
            gar garVar = this.U0;
            garVar.g();
            int iG = G(w2zVar, garVar, 2);
            if (iG != -5) {
                if (iG == -4) {
                    dm5.y(garVar.f(4));
                    this.W0 = true;
                    this.X0 = true;
                    return;
                }
                return;
            }
            ie30 ie30Var = (ie30) w2zVar.c;
            ie30Var.getClass();
            this.d1 = ie30Var;
            this.n1 = true;
        }
        if (this.e1 == null) {
            X();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (V(j)) {
            }
            while (W(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw c(e, null, false, 4003);
        }
    }

    @Override // p.jca
    public final int R(ie30 ie30Var) {
        return fxa.a(ie30Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    public final boolean V(long j) throws ExoPlaybackException {
        boolean z;
        qjb qjbVar;
        boolean z2;
        int i;
        bp00 bp00Var;
        int i2;
        int i3;
        ie30 ie30Var;
        ip00 ip00Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.i1;
        if ((bitmap == null || this.k1 != null) && (this.c1 != 0 || this.h == 2)) {
            ArrayDeque arrayDeque = this.V0;
            if (bitmap == null) {
                this.e1.getClass();
                exa exaVar = (exa) this.e1.b();
                if (exaVar != null) {
                    if (!exaVar.f(4)) {
                        dm5.s(exaVar.d, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.i1 = exaVar.d;
                        exaVar.h();
                        if (this.j1 && this.i1 != null && this.k1 != null) {
                            this.d1.getClass();
                            ie30 ie30Var2 = this.d1;
                            int i4 = ie30Var2.R;
                            int i5 = ie30Var2.S;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            qjbVar = this.k1;
                            if (((Bitmap) qjbVar.c) == null) {
                                if (z) {
                                    int i6 = qjbVar.a;
                                    this.i1.getClass();
                                    int width = this.i1.getWidth();
                                    ie30 ie30Var3 = this.d1;
                                    ie30Var3.getClass();
                                    int i7 = width / ie30Var3.R;
                                    int height = this.i1.getHeight();
                                    ie30 ie30Var4 = this.d1;
                                    ie30Var4.getClass();
                                    int i8 = height / ie30Var4.S;
                                    int i9 = this.d1.R;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.i1, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.i1;
                                    bitmapCreateBitmap.getClass();
                                }
                                qjbVar.c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = (Bitmap) this.k1.c;
                            bitmap2.getClass();
                            long j2 = this.k1.b;
                            long j3 = j2 - j;
                            if (this.h == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.c1;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        bhn0.w();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < 30000) {
                                bp00Var = this.h1;
                                if (bp00Var != null) {
                                    long j4 = this.Y0.b;
                                    this.d1.getClass();
                                    ip00Var = bp00Var.a;
                                    if (ip00Var.e1) {
                                        ip00Var.g.a(37).b();
                                    }
                                }
                                this.g1.onImageAvailable(j2 - this.Y0.b, bitmap2);
                                qjb qjbVar2 = this.k1;
                                qjbVar2.getClass();
                                long j5 = qjbVar2.b;
                                this.Z0 = j5;
                                while (!arrayDeque.isEmpty() && j5 >= ((ty70) arrayDeque.peek()).a) {
                                    this.Y0 = (ty70) arrayDeque.removeFirst();
                                }
                                this.c1 = 3;
                                if (z) {
                                    qjb qjbVar3 = this.k1;
                                    qjbVar3.getClass();
                                    i2 = qjbVar3.a;
                                    ie30 ie30Var5 = this.d1;
                                    ie30Var5.getClass();
                                    i3 = ie30Var5.S;
                                    ie30Var = this.d1;
                                    ie30Var.getClass();
                                    if (i2 == (i3 * ie30Var.R) - 1) {
                                        this.i1 = null;
                                    }
                                } else {
                                    this.i1 = null;
                                }
                                this.k1 = this.l1;
                                this.l1 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.b1 == 3) {
                            Y();
                            this.d1.getClass();
                            X();
                            return false;
                        }
                        exaVar.h();
                        if (arrayDeque.isEmpty()) {
                            this.X0 = true;
                            return false;
                        }
                    }
                }
            } else if (this.j1) {
                this.d1.getClass();
                ie30 ie30Var6 = this.d1;
                int i10 = ie30Var6.R;
                int i11 = ie30Var6.S;
                if (i10 != 1) {
                }
                qjbVar = this.k1;
                if (((Bitmap) qjbVar.c) == null) {
                    if (z) {
                        int i12 = qjbVar.a;
                        this.i1.getClass();
                        int width2 = this.i1.getWidth();
                        ie30 ie30Var7 = this.d1;
                        ie30Var7.getClass();
                        int i13 = width2 / ie30Var7.R;
                        int height2 = this.i1.getHeight();
                        ie30 ie30Var8 = this.d1;
                        ie30Var8.getClass();
                        int i14 = height2 / ie30Var8.S;
                        int i15 = this.d1.R;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.i1, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.i1;
                        bitmapCreateBitmap.getClass();
                    }
                    qjbVar.c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.k1.c;
                bitmap3.getClass();
                long j6 = this.k1.b;
                long j7 = j6 - j;
                if (this.h == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.c1;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            bhn0.w();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                bp00Var = this.h1;
                if (bp00Var != null) {
                    long j8 = this.Y0.b;
                    this.d1.getClass();
                    ip00Var = bp00Var.a;
                    if (ip00Var.e1) {
                        ip00Var.g.a(37).b();
                    }
                }
                this.g1.onImageAvailable(j6 - this.Y0.b, bitmap3);
                qjb qjbVar4 = this.k1;
                qjbVar4.getClass();
                long j9 = qjbVar4.b;
                this.Z0 = j9;
                while (!arrayDeque.isEmpty()) {
                    this.Y0 = (ty70) arrayDeque.removeFirst();
                }
                this.c1 = 3;
                if (z) {
                    qjb qjbVar5 = this.k1;
                    qjbVar5.getClass();
                    i2 = qjbVar5.a;
                    ie30 ie30Var9 = this.d1;
                    ie30Var9.getClass();
                    i3 = ie30Var9.S;
                    ie30Var = this.d1;
                    ie30Var.getClass();
                    if (i2 == (i3 * ie30Var.R) - 1) {
                        this.i1 = null;
                    }
                } else {
                    this.i1 = null;
                }
                this.k1 = this.l1;
                this.l1 = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030 A[PHI: r3
      0x0030: PHI (r3v3 p.gar) = (r3v2 p.gar), (r3v13 p.gar) binds: [B:15:0x0021, B:17:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    public final boolean W(long j) {
        gar garVar;
        int iG;
        ByteBuffer byteBuffer;
        gar garVar2;
        boolean z;
        gar garVar3;
        long j2;
        boolean z2;
        qjb qjbVar;
        boolean z3;
        ie30 ie30Var;
        boolean z4;
        boolean z5;
        ie30 ie30Var2;
        int i;
        gar garVar4;
        if (!this.j1 || this.k1 == null) {
            w2z w2zVar = this.c;
            w2zVar.b();
            gxa gxaVar = this.e1;
            if (gxaVar != null && this.b1 != 3 && !this.W0) {
                gar garVar5 = this.f1;
                if (garVar5 == null) {
                    garVar5 = (gar) gxaVar.e();
                    this.f1 = garVar5;
                    if (garVar5 != null) {
                        garVar = garVar5;
                        if (this.b1 == 2) {
                            ((oac) garVar).a = 4;
                            gxa gxaVar2 = this.e1;
                            gxaVar2.getClass();
                            gxaVar2.c(this.f1);
                            this.f1 = null;
                            this.b1 = (byte) 3;
                            return false;
                        }
                        iG = G(w2zVar, garVar5, 0);
                        if (iG != -5) {
                            ie30 ie30Var3 = (ie30) w2zVar.c;
                            ie30Var3.getClass();
                            this.d1 = ie30Var3;
                            this.n1 = true;
                            this.b1 = (byte) 2;
                            return true;
                        }
                        if (iG != -4) {
                            this.f1.j();
                            byteBuffer = this.f1.d;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                garVar2 = this.f1;
                                garVar2.getClass();
                                if (garVar2.f(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                gar garVar6 = this.f1;
                                garVar6.getClass();
                                garVar6.b = this.d1;
                                gxa gxaVar3 = this.e1;
                                gxaVar3.getClass();
                                gar garVar7 = this.f1;
                                garVar7.getClass();
                                gxaVar3.c(garVar7);
                                this.m1 = 0;
                            }
                            garVar3 = this.f1;
                            garVar3.getClass();
                            if (garVar3.f(4)) {
                                this.j1 = true;
                            } else {
                                int i2 = this.m1;
                                j2 = garVar3.f;
                                qjb qjbVar2 = new qjb();
                                qjbVar2.a = i2;
                                qjbVar2.b = j2;
                                this.l1 = qjbVar2;
                                this.m1 = i2 + 1;
                                if (this.j1) {
                                    this.k1 = this.l1;
                                    this.l1 = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    qjbVar = this.k1;
                                    if (qjbVar != null || qjbVar.b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    ie30Var = this.d1;
                                    ie30Var.getClass();
                                    if (ie30Var.R != -1 || (i = (ie30Var2 = this.d1).S) == -1 || i2 == (i * ie30Var2.R) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.j1 = z5;
                                    if (z3 || z2) {
                                        this.k1 = this.l1;
                                        this.l1 = null;
                                    }
                                }
                            }
                            garVar4 = this.f1;
                            garVar4.getClass();
                            if (garVar4.f(4)) {
                                this.W0 = true;
                                this.f1 = null;
                                return false;
                            }
                            long j3 = this.a1;
                            gar garVar8 = this.f1;
                            garVar8.getClass();
                            this.a1 = Math.max(j3, garVar8.f);
                            if (z) {
                                this.f1 = null;
                            } else {
                                gar garVar9 = this.f1;
                                garVar9.getClass();
                                garVar9.g();
                            }
                            return !this.j1;
                        }
                        if (iG != -3) {
                            bhn0.w();
                            return false;
                        }
                    }
                } else {
                    garVar = garVar5;
                    if (this.b1 == 2) {
                        ((oac) garVar).a = 4;
                        gxa gxaVar4 = this.e1;
                        gxaVar4.getClass();
                        gxaVar4.c(this.f1);
                        this.f1 = null;
                        this.b1 = (byte) 3;
                        return false;
                    }
                    iG = G(w2zVar, garVar5, 0);
                    if (iG != -5) {
                        ie30 ie30Var4 = (ie30) w2zVar.c;
                        ie30Var4.getClass();
                        this.d1 = ie30Var4;
                        this.n1 = true;
                        this.b1 = (byte) 2;
                        return true;
                    }
                    if (iG != -4) {
                        this.f1.j();
                        byteBuffer = this.f1.d;
                        if (byteBuffer != null) {
                            garVar2 = this.f1;
                            garVar2.getClass();
                            if (garVar2.f(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            garVar2 = this.f1;
                            garVar2.getClass();
                            if (garVar2.f(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            gar garVar10 = this.f1;
                            garVar10.getClass();
                            garVar10.b = this.d1;
                            gxa gxaVar5 = this.e1;
                            gxaVar5.getClass();
                            gar garVar11 = this.f1;
                            garVar11.getClass();
                            gxaVar5.c(garVar11);
                            this.m1 = 0;
                        }
                        garVar3 = this.f1;
                        garVar3.getClass();
                        if (garVar3.f(4)) {
                            this.j1 = true;
                        } else {
                            int i3 = this.m1;
                            j2 = garVar3.f;
                            qjb qjbVar3 = new qjb();
                            qjbVar3.a = i3;
                            qjbVar3.b = j2;
                            this.l1 = qjbVar3;
                            this.m1 = i3 + 1;
                            if (this.j1) {
                                this.k1 = this.l1;
                                this.l1 = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                qjbVar = this.k1;
                                if (qjbVar != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                ie30Var = this.d1;
                                ie30Var.getClass();
                                if (ie30Var.R != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.j1 = z5;
                                if (z3) {
                                    this.k1 = this.l1;
                                    this.l1 = null;
                                } else {
                                    this.k1 = this.l1;
                                    this.l1 = null;
                                }
                            }
                        }
                        garVar4 = this.f1;
                        garVar4.getClass();
                        if (garVar4.f(4)) {
                            this.W0 = true;
                            this.f1 = null;
                            return false;
                        }
                        long j4 = this.a1;
                        gar garVar12 = this.f1;
                        garVar12.getClass();
                        this.a1 = Math.max(j4, garVar12.f);
                        if (z) {
                            this.f1 = null;
                        } else {
                            gar garVar13 = this.f1;
                            garVar13.getClass();
                            garVar13.g();
                        }
                        return !this.j1;
                    }
                    if (iG != -3) {
                        bhn0.w();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public final void X() throws ExoPlaybackException {
        if (this.n1) {
            ie30 ie30Var = this.d1;
            ie30Var.getClass();
            int iA = fxa.a(ie30Var);
            if (iA != jca.a(4, 0, 0, 0) && iA != jca.a(3, 0, 0, 0)) {
                throw c(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.d1, false, 4005);
            }
            gxa gxaVar = this.e1;
            if (gxaVar != null) {
                gxaVar.release();
            }
            this.e1 = new gxa(this.T0.a);
            this.n1 = false;
        }
    }

    public final void Y() {
        this.f1 = null;
        this.b1 = (byte) 0;
        this.a1 = -9223372036854775807L;
        gxa gxaVar = this.e1;
        if (gxaVar != null) {
            gxaVar.release();
            this.e1 = null;
        }
    }

    @Override // p.jca
    public final void b(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.h1 = (bp00) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.a;
            }
            this.g1 = imageOutput;
        }
    }

    @Override // p.jca
    public final String i() {
        return "ImageRenderer";
    }

    @Override // p.jca
    public final boolean t() {
        return this.X0;
    }

    @Override // p.jca
    public final boolean v() {
        int i = this.c1;
        if (i != 3) {
            return i == 0 && this.j1;
        }
        return true;
    }

    @Override // p.jca
    public final void x() {
        this.d1 = null;
        this.Y0 = ty70.c;
        this.V0.clear();
        Y();
    }

    @Override // p.jca
    public final void y(boolean z, boolean z2) {
        this.c1 = z2 ? 1 : 0;
    }

    @Override // p.jca
    public final void z(long j, boolean z, boolean z2) {
        this.c1 = Math.min(this.c1, 1);
        this.X0 = false;
        this.W0 = false;
        this.i1 = null;
        this.k1 = null;
        this.l1 = null;
        this.j1 = false;
        this.f1 = null;
        gxa gxaVar = this.e1;
        if (gxaVar != null) {
            gxaVar.flush();
        }
        this.V0.clear();
    }
}
