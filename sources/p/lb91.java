package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lb91 {
    public static final lb91 a = new lb91();
    public static final tw4 b = ww4.a();

    public static fb91 d(b0k b0kVar) {
        return g((dah) ((x340) b0kVar).k(eah.a));
    }

    public static fb91 e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, b0k b0kVar, int i) {
        long j11 = (i & 4) != 0 ? u7h.k : j3;
        long j12 = (i & 16) != 0 ? u7h.k : j5;
        long j13 = (i & 32) != 0 ? u7h.k : j6;
        long j14 = (i & 64) != 0 ? u7h.k : j7;
        long j15 = (i & SemanticState.Focused) != 0 ? u7h.k : j8;
        long j16 = (i & SemanticState.Hidden) != 0 ? u7h.k : j9;
        long j17 = (i & 512) != 0 ? u7h.k : j10;
        fb91 fb91VarG = g((dah) ((x340) b0kVar).k(eah.a));
        long j18 = j != 16 ? j : fb91VarG.a;
        long j19 = j2 != 16 ? j2 : fb91VarG.b;
        long j20 = j11 != 16 ? j11 : fb91VarG.c;
        long j21 = j4 != 16 ? j4 : fb91VarG.d;
        if (j12 == 16) {
            j12 = fb91VarG.e;
        }
        long j22 = j12;
        if (j13 == 16) {
            j13 = fb91VarG.f;
        }
        long j23 = j13;
        if (j14 == 16) {
            j14 = fb91VarG.g;
        }
        long j24 = j14;
        if (j15 == 16) {
            j15 = fb91VarG.h;
        }
        long j25 = j15;
        if (j16 == 16) {
            j16 = fb91VarG.i;
        }
        long j26 = j16;
        if (j17 == 16) {
            j17 = fb91VarG.j;
        }
        return new fb91(j18, j19, j20, j21, j22, j23, j24, j25, j26, j17);
    }

    public static void f(DrawScope drawScope, qqq0 qqq0Var, long j, long j2, long j3, float f, float f2) {
        vq31 vq31VarF;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (qqq0Var == qqq0.a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            vq31VarF = ila0.f(anm1.g(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            vq31VarF = ila0.f(anm1.g(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        tw4 tw4Var = b;
        tw4Var.e(vq31VarF, 1);
        DrawScope.w0(drawScope, tw4Var, j3, (DrawStyle) null, 60);
        tw4Var.o();
    }

    public static fb91 g(dah dahVar) {
        fb91 fb91Var = dahVar.d0;
        if (fb91Var != null) {
            return fb91Var;
        }
        fb91 fb91Var2 = new fb91(eah.d(dahVar, 26), eah.d(dahVar, 26), eah.d(dahVar, 32), eah.d(dahVar, 32), eah.d(dahVar, 26), z4p1.t(u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), dahVar.p), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.12f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.12f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
        dahVar.d0 = fb91Var2;
        return fb91Var2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015b  */
    /* JADX WARN: Code duplicated, block: B:102:0x015e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0171  */
    /* JADX WARN: Code duplicated, block: B:108:0x017b  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x0146  */
    public final void a(final idn0 idn0Var, qim0 qim0Var, fb91 fb91Var, boolean z, long j, b0k b0kVar, final int i, final int i2) {
        int i3;
        qim0 qim0Var2;
        fb91 fb91VarD;
        int i4;
        boolean z2;
        int i5;
        int i6;
        long j2;
        int i7;
        lb91 lb91Var;
        boolean z3;
        final qim0 qim0Var3;
        final fb91 fb91Var2;
        final boolean z4;
        final long j3;
        h311 h311VarV;
        Object objT;
        m4c m4cVar;
        bw91 bw91Var;
        boolean z5;
        Object objT2;
        long jFloatToRawIntBits;
        long j4;
        int i8;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-290277409);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(idn0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    fb91VarD = fb91Var;
                    if (x340Var.g(fb91VarD)) {
                        i9 = SemanticState.Hidden;
                    }
                    i3 |= i9;
                } else {
                    fb91VarD = fb91Var;
                }
                i9 = SemanticState.Focused;
                i3 |= i9;
            } else {
                fb91VarD = fb91Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i5 = SemanticState.Modal;
                    } else {
                        i5 = SemanticState.ReadOnly;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        j2 = j;
                        if (x340Var.f(j2)) {
                            i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                        } else {
                            i7 = SemanticState.Multiline;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        lb91Var = this;
                        if (x340Var.g(lb91Var)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    } else {
                        lb91Var = this;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i3 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if (i10 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                fb91VarD = d(x340Var);
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                j2 = rb91.a;
                            }
                        } else {
                            x340Var.b0();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        }
                        x340Var.s();
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = new bw91();
                            x340Var.s0(objT);
                        }
                        bw91Var = (bw91) objT;
                        z5 = (i3 & 14) == 4;
                        objT2 = x340Var.T();
                        if (z5 || objT2 == m4cVar) {
                            objT2 = new vec(idn0Var, bw91Var, null, b2);
                            x340Var.s0(objT2);
                        }
                        qxd0.t(idn0Var, x340Var, (vu30) objT2);
                        if (bw91Var.isEmpty()) {
                            jFloatToRawIntBits = j2;
                        } else {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                        }
                        d620 d620Var = u291.a;
                        qim0 qim0VarD = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                        if (z2) {
                            j4 = fb91VarD.a;
                        } else {
                            j4 = fb91VarD.f;
                        }
                        op71.g(x340Var, dug.f(qim0VarD, j4, px61.b(x340Var, 7)));
                    } else {
                        x340Var.b0();
                    }
                    qim0Var3 = qim0Var2;
                    fb91Var2 = fb91VarD;
                    z4 = z2;
                    j3 = j2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        final lb91 lb91Var2 = lb91Var;
                        h311VarV.d = new vu30() { // from class: p.ib91
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                j2 = j;
                if ((196608 & i) == 0) {
                    lb91Var = this;
                    if (x340Var.g(lb91Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                } else {
                    lb91Var = this;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fb91VarD = d(x340Var);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rb91.a;
                        }
                    } else {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fb91VarD = d(x340Var);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rb91.a;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new bw91();
                        x340Var.s0(objT);
                    }
                    bw91Var = (bw91) objT;
                    if ((i3 & 14) == 4) {
                    }
                    objT2 = x340Var.T();
                    if (z5) {
                        objT2 = new vec(idn0Var, bw91Var, null, b2);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new vec(idn0Var, bw91Var, null, b2);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(idn0Var, x340Var, (vu30) objT2);
                    if (bw91Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    d620 d620Var2 = u291.a;
                    qim0 qim0VarD2 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                    if (z2) {
                        j4 = fb91VarD.a;
                    } else {
                        j4 = fb91VarD.f;
                    }
                    op71.g(x340Var, dug.f(qim0VarD2, j4, px61.b(x340Var, 7)));
                } else {
                    x340Var.b0();
                }
                qim0Var3 = qim0Var2;
                fb91Var2 = fb91VarD;
                z4 = z2;
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    final lb91 lb91Var3 = lb91Var;
                    h311VarV.d = new vu30() { // from class: p.ib91
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (x340Var.f(j2)) {
                        i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i7 = SemanticState.Multiline;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    lb91Var = this;
                    if (x340Var.g(lb91Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                } else {
                    lb91Var = this;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fb91VarD = d(x340Var);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rb91.a;
                        }
                    } else {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fb91VarD = d(x340Var);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rb91.a;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new bw91();
                        x340Var.s0(objT);
                    }
                    bw91Var = (bw91) objT;
                    if ((i3 & 14) == 4) {
                    }
                    objT2 = x340Var.T();
                    if (z5) {
                        objT2 = new vec(idn0Var, bw91Var, null, b2);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new vec(idn0Var, bw91Var, null, b2);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(idn0Var, x340Var, (vu30) objT2);
                    if (bw91Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    d620 d620Var3 = u291.a;
                    qim0 qim0VarD3 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                    if (z2) {
                        j4 = fb91VarD.a;
                    } else {
                        j4 = fb91VarD.f;
                    }
                    op71.g(x340Var, dug.f(qim0VarD3, j4, px61.b(x340Var, 7)));
                } else {
                    x340Var.b0();
                }
                qim0Var3 = qim0Var2;
                fb91Var2 = fb91VarD;
                z4 = z2;
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    final lb91 lb91Var4 = lb91Var;
                    h311VarV.d = new vu30() { // from class: p.ib91
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            j2 = j;
            if ((196608 & i) == 0) {
                lb91Var = this;
                if (x340Var.g(lb91Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                lb91Var = this;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fb91VarD = d(x340Var);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rb91.a;
                    }
                } else {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fb91VarD = d(x340Var);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rb91.a;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new bw91();
                    x340Var.s0(objT);
                }
                bw91Var = (bw91) objT;
                if ((i3 & 14) == 4) {
                }
                objT2 = x340Var.T();
                if (z5) {
                    objT2 = new vec(idn0Var, bw91Var, null, b2);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new vec(idn0Var, bw91Var, null, b2);
                    x340Var.s0(objT2);
                }
                qxd0.t(idn0Var, x340Var, (vu30) objT2);
                if (bw91Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                d620 d620Var4 = u291.a;
                qim0 qim0VarD4 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                if (z2) {
                    j4 = fb91VarD.a;
                } else {
                    j4 = fb91VarD.f;
                }
                op71.g(x340Var, dug.f(qim0VarD4, j4, px61.b(x340Var, 7)));
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            fb91Var2 = fb91VarD;
            z4 = z2;
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                final lb91 lb91Var5 = lb91Var;
                h311VarV.d = new vu30() { // from class: p.ib91
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                fb91VarD = fb91Var;
                if (x340Var.g(fb91VarD)) {
                    i9 = SemanticState.Hidden;
                }
                i3 |= i9;
            } else {
                fb91VarD = fb91Var;
            }
            i9 = SemanticState.Focused;
            i3 |= i9;
        } else {
            fb91VarD = fb91Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i5 = SemanticState.Modal;
                } else {
                    i5 = SemanticState.ReadOnly;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j2 = j;
                    if (x340Var.f(j2)) {
                        i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i7 = SemanticState.Multiline;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    lb91Var = this;
                    if (x340Var.g(lb91Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                } else {
                    lb91Var = this;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fb91VarD = d(x340Var);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rb91.a;
                        }
                    } else {
                        if (i10 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            fb91VarD = d(x340Var);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            j2 = rb91.a;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new bw91();
                        x340Var.s0(objT);
                    }
                    bw91Var = (bw91) objT;
                    if ((i3 & 14) == 4) {
                    }
                    objT2 = x340Var.T();
                    if (z5) {
                        objT2 = new vec(idn0Var, bw91Var, null, b2);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new vec(idn0Var, bw91Var, null, b2);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(idn0Var, x340Var, (vu30) objT2);
                    if (bw91Var.isEmpty()) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                    } else {
                        jFloatToRawIntBits = j2;
                    }
                    d620 d620Var5 = u291.a;
                    qim0 qim0VarD5 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                    if (z2) {
                        j4 = fb91VarD.a;
                    } else {
                        j4 = fb91VarD.f;
                    }
                    op71.g(x340Var, dug.f(qim0VarD5, j4, px61.b(x340Var, 7)));
                } else {
                    x340Var.b0();
                }
                qim0Var3 = qim0Var2;
                fb91Var2 = fb91VarD;
                z4 = z2;
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    final lb91 lb91Var6 = lb91Var;
                    h311VarV.d = new vu30() { // from class: p.ib91
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            j2 = j;
            if ((196608 & i) == 0) {
                lb91Var = this;
                if (x340Var.g(lb91Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                lb91Var = this;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fb91VarD = d(x340Var);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rb91.a;
                    }
                } else {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fb91VarD = d(x340Var);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rb91.a;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new bw91();
                    x340Var.s0(objT);
                }
                bw91Var = (bw91) objT;
                if ((i3 & 14) == 4) {
                }
                objT2 = x340Var.T();
                if (z5) {
                    objT2 = new vec(idn0Var, bw91Var, null, b2);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new vec(idn0Var, bw91Var, null, b2);
                    x340Var.s0(objT2);
                }
                qxd0.t(idn0Var, x340Var, (vu30) objT2);
                if (bw91Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                d620 d620Var6 = u291.a;
                qim0 qim0VarD6 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                if (z2) {
                    j4 = fb91VarD.a;
                } else {
                    j4 = fb91VarD.f;
                }
                op71.g(x340Var, dug.f(qim0VarD6, j4, px61.b(x340Var, 7)));
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            fb91Var2 = fb91VarD;
            z4 = z2;
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                final lb91 lb91Var7 = lb91Var;
                h311VarV.d = new vu30() { // from class: p.ib91
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                j2 = j;
                if (x340Var.f(j2)) {
                    i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i7 = SemanticState.Multiline;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                lb91Var = this;
                if (x340Var.g(lb91Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                lb91Var = this;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fb91VarD = d(x340Var);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rb91.a;
                    }
                } else {
                    if (i10 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fb91VarD = d(x340Var);
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (i6 != 0) {
                        j2 = rb91.a;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new bw91();
                    x340Var.s0(objT);
                }
                bw91Var = (bw91) objT;
                if ((i3 & 14) == 4) {
                }
                objT2 = x340Var.T();
                if (z5) {
                    objT2 = new vec(idn0Var, bw91Var, null, b2);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new vec(idn0Var, bw91Var, null, b2);
                    x340Var.s0(objT2);
                }
                qxd0.t(idn0Var, x340Var, (vu30) objT2);
                if (bw91Var.isEmpty()) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
                } else {
                    jFloatToRawIntBits = j2;
                }
                d620 d620Var7 = u291.a;
                qim0 qim0VarD7 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
                if (z2) {
                    j4 = fb91VarD.a;
                } else {
                    j4 = fb91VarD.f;
                }
                op71.g(x340Var, dug.f(qim0VarD7, j4, px61.b(x340Var, 7)));
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            fb91Var2 = fb91VarD;
            z4 = z2;
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                final lb91 lb91Var8 = lb91Var;
                h311VarV.d = new vu30() { // from class: p.ib91
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 24576;
        j2 = j;
        if ((196608 & i) == 0) {
            lb91Var = this;
            if (x340Var.g(lb91Var)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        } else {
            lb91Var = this;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    fb91VarD = d(x340Var);
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j2 = rb91.a;
                }
            } else {
                if (i10 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    fb91VarD = d(x340Var);
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if (i6 != 0) {
                    j2 = rb91.a;
                }
            }
            x340Var.s();
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new bw91();
                x340Var.s0(objT);
            }
            bw91Var = (bw91) objT;
            if ((i3 & 14) == 4) {
            }
            objT2 = x340Var.T();
            if (z5) {
                objT2 = new vec(idn0Var, bw91Var, null, b2);
                x340Var.s0(objT2);
            } else {
                objT2 = new vec(idn0Var, bw91Var, null, b2);
                x340Var.s0(objT2);
            }
            qxd0.t(idn0Var, x340Var, (vu30) objT2);
            if (bw91Var.isEmpty()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(s3v.a(j2))) & 4294967295L) | (((long) Float.floatToRawIntBits(s3v.b(j2) / 2.0f)) << 32);
            } else {
                jFloatToRawIntBits = j2;
            }
            d620 d620Var8 = u291.a;
            qim0 qim0VarD8 = nb51.D(u291.s(qim0Var2, s3v.b(jFloatToRawIntBits), s3v.a(jFloatToRawIntBits)), idn0Var);
            if (z2) {
                j4 = fb91VarD.a;
            } else {
                j4 = fb91VarD.f;
            }
            op71.g(x340Var, dug.f(qim0VarD8, j4, px61.b(x340Var, 7)));
        } else {
            x340Var.b0();
        }
        qim0Var3 = qim0Var2;
        fb91Var2 = fb91VarD;
        z4 = z2;
        j3 = j2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            final lb91 lb91Var9 = lb91Var;
            h311VarV.d = new vu30() { // from class: p.ib91
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.a(idn0Var, qim0Var3, fb91Var2, z4, j3, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    public final void b(final tb91 tb91Var, qim0 qim0Var, boolean z, final fb91 fb91Var, vu30 vu30Var, xu30 xu30Var, float f, float f2, b0k b0kVar, final int i, final int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z2;
        int i5;
        vu30 vu30Var2;
        int i6;
        xu30 xu30Var2;
        int i7;
        int i8;
        float f3;
        int i9;
        int i10;
        boolean z3;
        final qim0 qim0Var3;
        final boolean z4;
        final vu30 vu30Var3;
        final float f4;
        final float f5;
        final xu30 xu30Var3;
        h311 h311VarV;
        boolean z5;
        xu30 xu30Var4;
        float f6;
        int i11;
        qim0 qim0Var4;
        vu30 vu30Var4;
        Object objT;
        boolean z6;
        Object objT2;
        int i12;
        int i13;
        int i14;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(49984771);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(tb91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i5 = SemanticState.Hidden;
                    } else {
                        i5 = SemanticState.Focused;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (x340Var.g(fb91Var)) {
                        i14 = SemanticState.Modal;
                    } else {
                        i14 = SemanticState.ReadOnly;
                    }
                    i3 |= i14;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vu30Var2 = vu30Var;
                        if (x340Var.i(vu30Var2)) {
                            i13 = TlsSocketProvider.READ_BUFFER_SIZE;
                        }
                        i3 |= i13;
                    } else {
                        vu30Var2 = vu30Var;
                    }
                    i13 = SemanticState.Multiline;
                    i3 |= i13;
                } else {
                    vu30Var2 = vu30Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        xu30Var2 = xu30Var;
                        if (x340Var.i(xu30Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                        f3 = f;
                    } else {
                        f3 = f;
                        if ((i & 1572864) == 0) {
                            if (x340Var.d(f3)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i3 | 12582912;
                    if ((i & 100663296) == 0) {
                        if (x340Var.g(this)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i10 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i10 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if (i15 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) != 0) {
                                z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                                objT2 = x340Var.T();
                                if (z6 || objT2 == obj) {
                                    objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                    x340Var.s0(objT2);
                                }
                                i10 &= -57345;
                                vu30Var2 = (vu30) objT2;
                            }
                            if (i6 != 0) {
                                objT = x340Var.T();
                                if (objT == obj) {
                                    objT = k6i.h;
                                    x340Var.s0(objT);
                                }
                                xu30Var2 = (xu30) objT;
                            }
                            if (i8 != 0) {
                                f3 = rb91.b;
                            }
                            z5 = z2;
                            xu30Var4 = xu30Var2;
                            f6 = rb91.c;
                            i11 = i10;
                            qim0Var4 = qim0Var2;
                            vu30Var4 = vu30Var2;
                        } else {
                            x340Var.b0();
                            if ((i2 & 16) != 0) {
                                i10 &= -57345;
                            }
                            i11 = i10;
                            qim0Var4 = qim0Var2;
                            z5 = z2;
                            vu30Var4 = vu30Var2;
                            xu30Var4 = xu30Var2;
                            f6 = f2;
                        }
                        x340Var.s();
                        int i16 = i11 << 3;
                        c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i16 & 234881024) | 805306416 | (i11 & 14) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                        z4 = z5;
                        qim0Var3 = qim0Var4;
                        f4 = f6;
                        f5 = f3;
                        xu30Var3 = xu30Var4;
                        vu30Var3 = vu30Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        z4 = z2;
                        vu30Var3 = vu30Var2;
                        f4 = f2;
                        f5 = f3;
                        xu30Var3 = xu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.hb91
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                xu30Var2 = xu30Var;
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        if (x340Var.d(f3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i3 | 12582912;
                if ((i & 100663296) == 0) {
                    if (x340Var.g(this)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i10 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z6) {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            }
                            i10 &= -57345;
                            vu30Var2 = (vu30) objT2;
                        }
                        if (i6 != 0) {
                            objT = x340Var.T();
                            if (objT == obj) {
                                objT = k6i.h;
                                x340Var.s0(objT);
                            }
                            xu30Var2 = (xu30) objT;
                        }
                        if (i8 != 0) {
                            f3 = rb91.b;
                        }
                        z5 = z2;
                        xu30Var4 = xu30Var2;
                        f6 = rb91.c;
                        i11 = i10;
                        qim0Var4 = qim0Var2;
                        vu30Var4 = vu30Var2;
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z6) {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            }
                            i10 &= -57345;
                            vu30Var2 = (vu30) objT2;
                        }
                        if (i6 != 0) {
                            objT = x340Var.T();
                            if (objT == obj) {
                                objT = k6i.h;
                                x340Var.s0(objT);
                            }
                            xu30Var2 = (xu30) objT;
                        }
                        if (i8 != 0) {
                            f3 = rb91.b;
                        }
                        z5 = z2;
                        xu30Var4 = xu30Var2;
                        f6 = rb91.c;
                        i11 = i10;
                        qim0Var4 = qim0Var2;
                        vu30Var4 = vu30Var2;
                    }
                    x340Var.s();
                    int i17 = i11 << 3;
                    c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i17 & 234881024) | 805306416 | (i11 & 14) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                    z4 = z5;
                    qim0Var3 = qim0Var4;
                    f4 = f6;
                    f5 = f3;
                    xu30Var3 = xu30Var4;
                    vu30Var3 = vu30Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    vu30Var3 = vu30Var2;
                    f4 = f2;
                    f5 = f3;
                    xu30Var3 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.hb91
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if (x340Var.g(fb91Var)) {
                    i14 = SemanticState.Modal;
                } else {
                    i14 = SemanticState.ReadOnly;
                }
                i3 |= i14;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var.i(vu30Var2)) {
                        i13 = TlsSocketProvider.READ_BUFFER_SIZE;
                    }
                    i3 |= i13;
                } else {
                    vu30Var2 = vu30Var;
                }
                i13 = SemanticState.Multiline;
                i3 |= i13;
            } else {
                vu30Var2 = vu30Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    xu30Var2 = xu30Var;
                    if (x340Var.i(xu30Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        if (x340Var.d(f3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i3 | 12582912;
                if ((i & 100663296) == 0) {
                    if (x340Var.g(this)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i10 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z6) {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            }
                            i10 &= -57345;
                            vu30Var2 = (vu30) objT2;
                        }
                        if (i6 != 0) {
                            objT = x340Var.T();
                            if (objT == obj) {
                                objT = k6i.h;
                                x340Var.s0(objT);
                            }
                            xu30Var2 = (xu30) objT;
                        }
                        if (i8 != 0) {
                            f3 = rb91.b;
                        }
                        z5 = z2;
                        xu30Var4 = xu30Var2;
                        f6 = rb91.c;
                        i11 = i10;
                        qim0Var4 = qim0Var2;
                        vu30Var4 = vu30Var2;
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z6) {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            }
                            i10 &= -57345;
                            vu30Var2 = (vu30) objT2;
                        }
                        if (i6 != 0) {
                            objT = x340Var.T();
                            if (objT == obj) {
                                objT = k6i.h;
                                x340Var.s0(objT);
                            }
                            xu30Var2 = (xu30) objT;
                        }
                        if (i8 != 0) {
                            f3 = rb91.b;
                        }
                        z5 = z2;
                        xu30Var4 = xu30Var2;
                        f6 = rb91.c;
                        i11 = i10;
                        qim0Var4 = qim0Var2;
                        vu30Var4 = vu30Var2;
                    }
                    x340Var.s();
                    int i18 = i11 << 3;
                    c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i18 & 234881024) | 805306416 | (i11 & 14) | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (29360128 & i18), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                    z4 = z5;
                    qim0Var3 = qim0Var4;
                    f4 = f6;
                    f5 = f3;
                    xu30Var3 = xu30Var4;
                    vu30Var3 = vu30Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    vu30Var3 = vu30Var2;
                    f4 = f2;
                    f5 = f3;
                    xu30Var3 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.hb91
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            xu30Var2 = xu30Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (x340Var.d(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i3 | 12582912;
            if ((i & 100663296) == 0) {
                if (x340Var.g(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i10 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z6) {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        i10 &= -57345;
                        vu30Var2 = (vu30) objT2;
                    }
                    if (i6 != 0) {
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = k6i.h;
                            x340Var.s0(objT);
                        }
                        xu30Var2 = (xu30) objT;
                    }
                    if (i8 != 0) {
                        f3 = rb91.b;
                    }
                    z5 = z2;
                    xu30Var4 = xu30Var2;
                    f6 = rb91.c;
                    i11 = i10;
                    qim0Var4 = qim0Var2;
                    vu30Var4 = vu30Var2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z6) {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        i10 &= -57345;
                        vu30Var2 = (vu30) objT2;
                    }
                    if (i6 != 0) {
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = k6i.h;
                            x340Var.s0(objT);
                        }
                        xu30Var2 = (xu30) objT;
                    }
                    if (i8 != 0) {
                        f3 = rb91.b;
                    }
                    z5 = z2;
                    xu30Var4 = xu30Var2;
                    f6 = rb91.c;
                    i11 = i10;
                    qim0Var4 = qim0Var2;
                    vu30Var4 = vu30Var2;
                }
                x340Var.s();
                int i19 = i11 << 3;
                c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i19 & 234881024) | 805306416 | (i11 & 14) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                z4 = z5;
                qim0Var3 = qim0Var4;
                f4 = f6;
                f5 = f3;
                xu30Var3 = xu30Var4;
                vu30Var3 = vu30Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
                vu30Var3 = vu30Var2;
                f4 = f2;
                f5 = f3;
                xu30Var3 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.hb91
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i5 = SemanticState.Hidden;
                } else {
                    i5 = SemanticState.Focused;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (x340Var.g(fb91Var)) {
                    i14 = SemanticState.Modal;
                } else {
                    i14 = SemanticState.ReadOnly;
                }
                i3 |= i14;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var.i(vu30Var2)) {
                        i13 = TlsSocketProvider.READ_BUFFER_SIZE;
                    }
                    i3 |= i13;
                } else {
                    vu30Var2 = vu30Var;
                }
                i13 = SemanticState.Multiline;
                i3 |= i13;
            } else {
                vu30Var2 = vu30Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    xu30Var2 = xu30Var;
                    if (x340Var.i(xu30Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        if (x340Var.d(f3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i3 | 12582912;
                if ((i & 100663296) == 0) {
                    if (x340Var.g(this)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i10 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i10 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z6) {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            }
                            i10 &= -57345;
                            vu30Var2 = (vu30) objT2;
                        }
                        if (i6 != 0) {
                            objT = x340Var.T();
                            if (objT == obj) {
                                objT = k6i.h;
                                x340Var.s0(objT);
                            }
                            xu30Var2 = (xu30) objT;
                        }
                        if (i8 != 0) {
                            f3 = rb91.b;
                        }
                        z5 = z2;
                        xu30Var4 = xu30Var2;
                        f6 = rb91.c;
                        i11 = i10;
                        qim0Var4 = qim0Var2;
                        vu30Var4 = vu30Var2;
                    } else {
                        if (i15 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                            objT2 = x340Var.T();
                            if (z6) {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                                x340Var.s0(objT2);
                            }
                            i10 &= -57345;
                            vu30Var2 = (vu30) objT2;
                        }
                        if (i6 != 0) {
                            objT = x340Var.T();
                            if (objT == obj) {
                                objT = k6i.h;
                                x340Var.s0(objT);
                            }
                            xu30Var2 = (xu30) objT;
                        }
                        if (i8 != 0) {
                            f3 = rb91.b;
                        }
                        z5 = z2;
                        xu30Var4 = xu30Var2;
                        f6 = rb91.c;
                        i11 = i10;
                        qim0Var4 = qim0Var2;
                        vu30Var4 = vu30Var2;
                    }
                    x340Var.s();
                    int i110 = i11 << 3;
                    c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i110 & 234881024) | 805306416 | (i11 & 14) | (i110 & 896) | (i110 & 7168) | (57344 & i110) | (458752 & i110) | (3670016 & i110) | (29360128 & i110), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                    z4 = z5;
                    qim0Var3 = qim0Var4;
                    f4 = f6;
                    f5 = f3;
                    xu30Var3 = xu30Var4;
                    vu30Var3 = vu30Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    z4 = z2;
                    vu30Var3 = vu30Var2;
                    f4 = f2;
                    f5 = f3;
                    xu30Var3 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.hb91
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            xu30Var2 = xu30Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (x340Var.d(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i3 | 12582912;
            if ((i & 100663296) == 0) {
                if (x340Var.g(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i10 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z6) {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        i10 &= -57345;
                        vu30Var2 = (vu30) objT2;
                    }
                    if (i6 != 0) {
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = k6i.h;
                            x340Var.s0(objT);
                        }
                        xu30Var2 = (xu30) objT;
                    }
                    if (i8 != 0) {
                        f3 = rb91.b;
                    }
                    z5 = z2;
                    xu30Var4 = xu30Var2;
                    f6 = rb91.c;
                    i11 = i10;
                    qim0Var4 = qim0Var2;
                    vu30Var4 = vu30Var2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z6) {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        i10 &= -57345;
                        vu30Var2 = (vu30) objT2;
                    }
                    if (i6 != 0) {
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = k6i.h;
                            x340Var.s0(objT);
                        }
                        xu30Var2 = (xu30) objT;
                    }
                    if (i8 != 0) {
                        f3 = rb91.b;
                    }
                    z5 = z2;
                    xu30Var4 = xu30Var2;
                    f6 = rb91.c;
                    i11 = i10;
                    qim0Var4 = qim0Var2;
                    vu30Var4 = vu30Var2;
                }
                x340Var.s();
                int i111 = i11 << 3;
                c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i111 & 234881024) | 805306416 | (i11 & 14) | (i111 & 896) | (i111 & 7168) | (57344 & i111) | (458752 & i111) | (3670016 & i111) | (29360128 & i111), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                z4 = z5;
                qim0Var3 = qim0Var4;
                f4 = f6;
                f5 = f3;
                xu30Var3 = xu30Var4;
                vu30Var3 = vu30Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
                vu30Var3 = vu30Var2;
                f4 = f2;
                f5 = f3;
                xu30Var3 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.hb91
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (x340Var.g(fb91Var)) {
                i14 = SemanticState.Modal;
            } else {
                i14 = SemanticState.ReadOnly;
            }
            i3 |= i14;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vu30Var2 = vu30Var;
                if (x340Var.i(vu30Var2)) {
                    i13 = TlsSocketProvider.READ_BUFFER_SIZE;
                }
                i3 |= i13;
            } else {
                vu30Var2 = vu30Var;
            }
            i13 = SemanticState.Multiline;
            i3 |= i13;
        } else {
            vu30Var2 = vu30Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                xu30Var2 = xu30Var;
                if (x340Var.i(xu30Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (x340Var.d(f3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            i10 = i3 | 12582912;
            if ((i & 100663296) == 0) {
                if (x340Var.g(this)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i10 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i10 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z6) {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        i10 &= -57345;
                        vu30Var2 = (vu30) objT2;
                    }
                    if (i6 != 0) {
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = k6i.h;
                            x340Var.s0(objT);
                        }
                        xu30Var2 = (xu30) objT;
                    }
                    if (i8 != 0) {
                        f3 = rb91.b;
                    }
                    z5 = z2;
                    xu30Var4 = xu30Var2;
                    f6 = rb91.c;
                    i11 = i10;
                    qim0Var4 = qim0Var2;
                    vu30Var4 = vu30Var2;
                } else {
                    if (i15 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                        objT2 = x340Var.T();
                        if (z6) {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        i10 &= -57345;
                        vu30Var2 = (vu30) objT2;
                    }
                    if (i6 != 0) {
                        objT = x340Var.T();
                        if (objT == obj) {
                            objT = k6i.h;
                            x340Var.s0(objT);
                        }
                        xu30Var2 = (xu30) objT;
                    }
                    if (i8 != 0) {
                        f3 = rb91.b;
                    }
                    z5 = z2;
                    xu30Var4 = xu30Var2;
                    f6 = rb91.c;
                    i11 = i10;
                    qim0Var4 = qim0Var2;
                    vu30Var4 = vu30Var2;
                }
                x340Var.s();
                int i112 = i11 << 3;
                c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i112 & 234881024) | 805306416 | (i11 & 14) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                z4 = z5;
                qim0Var3 = qim0Var4;
                f4 = f6;
                f5 = f3;
                xu30Var3 = xu30Var4;
                vu30Var3 = vu30Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
                vu30Var3 = vu30Var2;
                f4 = f2;
                f5 = f3;
                xu30Var3 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.hb91
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 196608;
        xu30Var2 = xu30Var;
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 1572864) == 0) {
                if (x340Var.d(f3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        i10 = i3 | 12582912;
        if ((i & 100663296) == 0) {
            if (x340Var.g(this)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i10 |= i12;
        }
        if ((i10 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i10 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                    objT2 = x340Var.T();
                    if (z6) {
                        objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                        x340Var.s0(objT2);
                    }
                    i10 &= -57345;
                    vu30Var2 = (vu30) objT2;
                }
                if (i6 != 0) {
                    objT = x340Var.T();
                    if (objT == obj) {
                        objT = k6i.h;
                        x340Var.s0(objT);
                    }
                    xu30Var2 = (xu30) objT;
                }
                if (i8 != 0) {
                    f3 = rb91.b;
                }
                z5 = z2;
                xu30Var4 = xu30Var2;
                f6 = rb91.c;
                i11 = i10;
                qim0Var4 = qim0Var2;
                vu30Var4 = vu30Var2;
            } else {
                if (i15 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 16) != 0) {
                    z6 = ((((i10 & 7168) ^ 3072) <= 2048 && x340Var.g(fb91Var)) || (i10 & 3072) == 2048) | ((i10 & 896) == 256);
                    objT2 = x340Var.T();
                    if (z6) {
                        objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new fc4((Object) fb91Var, z2, (byte) 3);
                        x340Var.s0(objT2);
                    }
                    i10 &= -57345;
                    vu30Var2 = (vu30) objT2;
                }
                if (i6 != 0) {
                    objT = x340Var.T();
                    if (objT == obj) {
                        objT = k6i.h;
                        x340Var.s0(objT);
                    }
                    xu30Var2 = (xu30) objT;
                }
                if (i8 != 0) {
                    f3 = rb91.b;
                }
                z5 = z2;
                xu30Var4 = xu30Var2;
                f6 = rb91.c;
                i11 = i10;
                qim0Var4 = qim0Var2;
                vu30Var4 = vu30Var2;
            }
            x340Var.s();
            int i113 = i11 << 3;
            c(tb91Var, qim0Var4, z5, fb91Var, vu30Var4, xu30Var4, f3, f6, x340Var, (i113 & 234881024) | 805306416 | (i11 & 14) | (i113 & 896) | (i113 & 7168) | (57344 & i113) | (458752 & i113) | (3670016 & i113) | (29360128 & i113), ((i11 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | 6);
            z4 = z5;
            qim0Var3 = qim0Var4;
            f4 = f6;
            f5 = f3;
            xu30Var3 = xu30Var4;
            vu30Var3 = vu30Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            z4 = z2;
            vu30Var3 = vu30Var2;
            f4 = f2;
            f5 = f3;
            xu30Var3 = xu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.hb91
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.a.b(tb91Var, qim0Var3, z4, fb91Var, vu30Var3, xu30Var3, f5, f4, (b0k) obj2, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public final void c(final tb91 tb91Var, final qim0 qim0Var, final boolean z, final fb91 fb91Var, final vu30 vu30Var, final xu30 xu30Var, final float f, final float f2, b0k b0kVar, final int i, final int i2) {
        int i3;
        int i4;
        b0k b0kVar2;
        qim0 qim0VarH;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(133396521);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(tb91Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.d(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(qim0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.h(z) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(fb91Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= b0kVar3.i(xu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= b0kVar3.d(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.d(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.h(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.h(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = fb91Var.a(z, false);
            final long jA2 = fb91Var.a(z, true);
            long j = z ? fb91Var.e : fb91Var.j;
            long j2 = z ? fb91Var.c : fb91Var.h;
            int i5 = i3;
            if (tb91Var.m == qqq0.a) {
                float f3 = rb91.b;
                qim0VarH = u291.c(u291.v(qim0Var, 16.0f), 1.0f);
            } else {
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                float f4 = rb91.b;
                qim0VarH = u291.h(qim0VarF, 16.0f);
            }
            int i6 = i5 & ContentType.LONG_FORM_ON_DEMAND;
            boolean zI = (i6 == 32) | b0kVar3.i(tb91Var);
            Object objT = b0kVar3.T();
            if (zI || objT == obj) {
                objT = new pea((Object) tb91Var, (byte) 5);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarThen = qim0VarH.then(j9k1.x(nim0.a, (xu30) objT));
            boolean zI2 = ((i5 & 29360128) == 8388608) | (i6 == 32) | b0kVar3.i(tb91Var) | b0kVar3.f(jA) | b0kVar3.f(jA2) | b0kVar3.f(j) | b0kVar3.f(j2) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == obj) {
                b0kVar2 = b0kVar3;
                final long j3 = j;
                final long j4 = j2;
                iu30 iu30Var = new iu30() { // from class: p.jb91
                    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
                    /* JADX WARN: Code duplicated, block: B:105:0x0230 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
                    /* JADX WARN: Code duplicated, block: B:107:0x024d  */
                    /* JADX WARN: Code duplicated, block: B:109:0x0266  */
                    /* JADX WARN: Code duplicated, block: B:144:0x0340  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
                    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
                    public final Object invoke(Object obj2) {
                        float fX0;
                        boolean z2;
                        float f5;
                        float f6;
                        qqq0 qqq0Var;
                        float f7;
                        char c;
                        float[] fArr;
                        vu30 vu30Var2;
                        float f8;
                        float f9;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        int iFloatToRawIntBits2;
                        DrawScope drawScope;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits4;
                        long jFloatToRawIntBits5;
                        int iFloatToRawIntBits4;
                        DrawScope drawScope2;
                        long jFloatToRawIntBits6;
                        long jFloatToRawIntBits7;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits10;
                        float fX1;
                        float fX2;
                        DrawScope drawScope3 = (DrawScope) obj2;
                        boolean zC = p3v.c(Float.NaN, Float.NaN);
                        tb91 tb91Var2 = tb91Var;
                        qqq0 qqq0Var2 = qqq0.a;
                        if (zC) {
                            fX0 = (tb91Var2.m == qqq0Var2 ? Float.intBitsToFloat((int) (drawScope3.j() >> 32)) : Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L))) / 2.0f;
                        } else {
                            fX0 = drawScope3.X0(Float.NaN);
                        }
                        lb91 lb91Var = lb91.a;
                        float[] fArr2 = tb91Var2.g;
                        float fC = tb91Var2.c();
                        int i7 = 0;
                        float fM0 = drawScope3.M0(0);
                        float fM1 = drawScope3.M0(0);
                        float fM2 = drawScope3.M0(tb91Var2.k.s());
                        float fM3 = drawScope3.M0(tb91Var2.l.s());
                        float fN0 = drawScope3.N0(fX0);
                        qqq0 qqq0Var3 = tb91Var2.m;
                        boolean z3 = qqq0Var3 == qqq0Var2;
                        boolean z4 = drawScope3.getLayoutDirection() == flb0.b;
                        boolean z5 = z4 && !z3;
                        float fX3 = drawScope3.X0(fN0);
                        long j5 = drawScope3.j();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (z3 ? j5 & 4294967295L : j5 >> 32));
                        if (!u890.f(0.0f, fArr2.length == 0 ? null : Float.valueOf(fArr2[0]))) {
                            if (u890.f(0.0f, fArr2.length == 0 ? null : Float.valueOf(fArr2[fArr2.length - 1]))) {
                            }
                        }
                        if (u890.f(fC, fArr2.length == 0 ? null : Float.valueOf(fArr2[0]))) {
                            z2 = true;
                        } else {
                            if (u890.f(fC, fArr2.length != 0 ? Float.valueOf(fArr2[fArr2.length - 1]) : null)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        float fE = (fArr2.length == 0 || z2) ? l1d.e(fIntBitsToFloat, 0.0f, fC, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fX3 * 2.0f)) * fC) + 0.0f + fX3;
                        int length = fArr2.length;
                        float fX4 = drawScope3.X0(f2);
                        float f10 = f;
                        if (p3v.b(f10, 0.0f) > 0) {
                            if (z3) {
                                drawScope3.X0(fM1);
                                drawScope3.X0(f10);
                                fX1 = drawScope3.X0(fM3) / 2.0f;
                                fX2 = drawScope3.X0(f10);
                            } else {
                                drawScope3.X0(fM0);
                                drawScope3.X0(f10);
                                fX1 = drawScope3.X0(fM2) / 2.0f;
                                fX2 = drawScope3.X0(f10);
                            }
                            f5 = fX2 + fX1;
                        } else {
                            f5 = 0.0f;
                        }
                        long jG1 = drawScope3.g1();
                        Float.intBitsToFloat((int) (z3 ? jG1 & 4294967295L : jG1 >> 32));
                        float f11 = (fIntBitsToFloat - f5) - fX3;
                        vu30 vu30Var3 = vu30Var;
                        if (fE < f11) {
                            float f12 = z5 ? fX3 : fX4;
                            float f13 = z5 ? fX4 : fX3;
                            float f14 = fE + f5;
                            float f15 = fIntBitsToFloat - f14;
                            if (z3) {
                                jFloatToRawIntBits5 = Float.floatToRawIntBits(0.0f);
                                f7 = 0.0f;
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f14);
                                c = ' ';
                                fArr = fArr2;
                            } else {
                                f7 = 0.0f;
                                c = ' ';
                                fArr = fArr2;
                                if (z4) {
                                    jFloatToRawIntBits5 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits5 = Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits5 << c) | (((long) iFloatToRawIntBits4) & 4294967295L);
                            if (z3) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() >> c)));
                                drawScope2 = drawScope3;
                                f6 = fIntBitsToFloat;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f15);
                            } else {
                                drawScope2 = drawScope3;
                                f6 = fIntBitsToFloat;
                                if (z4) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.j() >> c)) - f14;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    jFloatToRawIntBits8 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(f15)) << c) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)))) & 4294967295L);
                                }
                                DrawScope drawScope4 = drawScope2;
                                vu30Var2 = vu30Var3;
                                long j7 = jFloatToRawIntBits6;
                                qqq0Var = qqq0Var3;
                                drawScope3 = drawScope4;
                                lb91.f(drawScope3, qqq0Var, j6, j7, jA, f12, f13);
                                if (z3) {
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.g1() >> c)));
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(f6 - fX3);
                                } else {
                                    if (z4) {
                                        jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fX3)) << c) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.g1() & 4294967295L)))) & 4294967295L);
                                    } else {
                                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope3.g1() & 4294967295L));
                                        jFloatToRawIntBits9 = Float.floatToRawIntBits(f6 - fX3);
                                        iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                    }
                                    if (vu30Var2 != null) {
                                        vu30Var2.invoke(drawScope3, new Offset(jFloatToRawIntBits10));
                                    }
                                }
                                jFloatToRawIntBits10 = (((long) iFloatToRawIntBits5) & 4294967295L) | (jFloatToRawIntBits9 << c);
                                if (vu30Var2 != null) {
                                    vu30Var2.invoke(drawScope3, new Offset(jFloatToRawIntBits10));
                                }
                            }
                            jFloatToRawIntBits6 = (jFloatToRawIntBits8 & 4294967295L) | (jFloatToRawIntBits7 << c);
                            DrawScope drawScope5 = drawScope2;
                            vu30Var2 = vu30Var3;
                            long j8 = jFloatToRawIntBits6;
                            qqq0Var = qqq0Var3;
                            drawScope3 = drawScope5;
                            lb91.f(drawScope3, qqq0Var, j6, j8, jA, f12, f13);
                            if (z3) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.g1() >> c)));
                                iFloatToRawIntBits5 = Float.floatToRawIntBits(f6 - fX3);
                            } else {
                                if (z4) {
                                    jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fX3)) << c) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.g1() & 4294967295L)))) & 4294967295L);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawScope3.g1() & 4294967295L));
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(f6 - fX3);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                if (vu30Var2 != null) {
                                    vu30Var2.invoke(drawScope3, new Offset(jFloatToRawIntBits10));
                                }
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits5) & 4294967295L) | (jFloatToRawIntBits9 << c);
                            if (vu30Var2 != null) {
                                vu30Var2.invoke(drawScope3, new Offset(jFloatToRawIntBits10));
                            }
                        } else {
                            f6 = fIntBitsToFloat;
                            qqq0Var = qqq0Var3;
                            f7 = 0.0f;
                            c = ' ';
                            fArr = fArr2;
                            vu30Var2 = vu30Var3;
                        }
                        float f16 = fE - f5;
                        float f17 = !z5 ? fX3 : fX4;
                        float f18 = z5 ? fX3 : fX4;
                        float f19 = z5 ? f16 : f16 - f7;
                        if (f19 > f17) {
                            if (!z3 && z4) {
                                jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() >> c)) - f16);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f7);
                            } else {
                                jFloatToRawIntBits2 = Float.floatToRawIntBits(f7);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f7);
                            }
                            long j9 = (jFloatToRawIntBits2 << c) | (((long) iFloatToRawIntBits2) & 4294967295L);
                            if (z3) {
                                drawScope = drawScope3;
                                jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() >> c)))) << c);
                            } else {
                                drawScope = drawScope3;
                                if (z4) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                                    jFloatToRawIntBits3 = Float.floatToRawIntBits(f16);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                                    jFloatToRawIntBits3 = Float.floatToRawIntBits(f19);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits4 = (jFloatToRawIntBits3 << c) | (((long) iFloatToRawIntBits3) & 4294967295L);
                            }
                            long j10 = jFloatToRawIntBits4;
                            drawScope3 = drawScope;
                            lb91.f(drawScope3, qqq0Var, j9, j10, jA2, f17, f18);
                        }
                        float f20 = f7 + fX3;
                        float f21 = f6 - fX3;
                        float f22 = fE - f5;
                        float f23 = fE + f5;
                        float[] fArr3 = fArr;
                        int length2 = fArr3.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f24 = fArr3[i7];
                            int i9 = i8 + 1;
                            if (vu30Var2 == null || i8 != fArr3.length - 1) {
                                float fT = dm5.T(f20, f21, f24);
                                if (fT < f22 || fT > f23) {
                                    if (z3) {
                                        f8 = f20;
                                        f9 = f21;
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.g1() >> c)));
                                        iFloatToRawIntBits = Float.floatToRawIntBits(fT);
                                    } else {
                                        f8 = f20;
                                        f9 = f21;
                                        if (z4) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (drawScope3.j() >> c)) - fT;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (drawScope3.g1() & 4294967295L));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (drawScope3.g1() & 4294967295L));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fT);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                    }
                                    xu30Var.invoke(drawScope3, new Offset((jFloatToRawIntBits << c) | (((long) iFloatToRawIntBits) & 4294967295L)), new u7h((fT < f7 || fT > f16) ? j3 : j4));
                                } else {
                                    f8 = f20;
                                    f9 = f21;
                                }
                            } else {
                                f8 = f20;
                                f9 = f21;
                            }
                            i7++;
                            f20 = f8;
                            i8 = i9;
                            f21 = f9;
                        }
                        return rih1.a;
                    }
                };
                b0kVar2.s0(iu30Var);
                objT2 = iu30Var;
            } else {
                b0kVar2 = b0kVar3;
            }
            j0o1.b(0, b0kVar2, (iu30) objT2, qim0VarThen);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.kb91
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.a.c(tb91Var, qim0Var, z, fb91Var, vu30Var, xu30Var, f, f2, (b0k) obj2, czo1.p(i | 1), czo1.p(i2));
                    return rih1.a;
                }
            };
        }
    }
}
