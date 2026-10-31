package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ti5 {
    public static final kiv a = new kiv(new xh3(8), (byte) 0);
    public static final kiv b = new kiv(new xh3(9), (byte) 0);
    public static final ceo c = new ceo(0.8f, 0.0f, 0.8f, 0.15f);
    public static final float d = 24.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01da  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00af  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void a(final vu30 vu30Var, qim0 qim0Var, vu30 vu30Var2, xu30 xu30Var, float f2, erl1 erl1Var, x7f1 x7f1Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        vu30 vu30Var3;
        int i5;
        int i6;
        xu30 xu30Var2;
        int i7;
        int i8;
        float f3;
        int i9;
        erl1 bgc0Var;
        x7f1 x7f1Var2;
        int i10;
        boolean z;
        b0k b0kVar2;
        final qim0 qim0Var3;
        final vu30 vu30Var4;
        final xu30 xu30Var3;
        final float f4;
        final erl1 erl1Var2;
        final x7f1 x7f1Var3;
        h311 h311VarV;
        float f5;
        qim0 qim0Var4;
        erl1 erl1Var3;
        x7f1 x7f1Var4;
        vu30 vu30Var5;
        xu30 xu30Var4;
        qim0 qim0Var5;
        int i11;
        float f6;
        dah dahVar;
        x7f1 x7f1Var5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-302230691);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(vu30Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    vu30Var3 = vu30Var2;
                    if (b0kVar3.i(vu30Var3)) {
                        i5 = SemanticState.Hidden;
                    } else {
                        i5 = SemanticState.Focused;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        xu30Var2 = xu30Var;
                        if (b0kVar3.i(xu30Var2)) {
                            i7 = SemanticState.Modal;
                        } else {
                            i7 = SemanticState.ReadOnly;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            f3 = f2;
                            if (b0kVar3.d(f3)) {
                                i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                            } else {
                                i9 = SemanticState.Multiline;
                            }
                            i3 |= i9;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                bgc0Var = erl1Var;
                                int i13 = b0kVar3.g(bgc0Var) ? 131072 : 65536;
                                i3 |= i13;
                            } else {
                                bgc0Var = erl1Var;
                            }
                            i3 |= i13;
                        } else {
                            bgc0Var = erl1Var;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                x7f1Var2 = x7f1Var;
                                int i14 = b0kVar3.g(x7f1Var2) ? 1048576 : 524288;
                                i3 |= i14;
                            } else {
                                x7f1Var2 = x7f1Var;
                            }
                            i3 |= i14;
                        } else {
                            x7f1Var2 = x7f1Var;
                        }
                        i10 = i3 | 12582912;
                        if ((4793491 & i10) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i10 & 1, z)) {
                            b0kVar3.d0();
                            f5 = 64.0f;
                            if ((i & 1) != 0 || b0kVar3.E()) {
                                if (i12 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i4 != 0) {
                                    vu30Var3 = l6i.c;
                                }
                                if (i6 != 0) {
                                    xu30Var2 = l6i.d;
                                }
                                if (i8 != 0) {
                                    f3 = 64.0f;
                                }
                                if ((i2 & 32) != 0) {
                                    i10 &= -458753;
                                    bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                }
                                if ((i2 & 64) != 0) {
                                    dahVar = (dah) b0kVar3.k(eah.a);
                                    x7f1Var5 = dahVar.Z;
                                    if (x7f1Var5 == null) {
                                        x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                        dahVar.Z = x7f1Var5;
                                    }
                                    i10 &= -3670017;
                                    x7f1Var2 = x7f1Var5;
                                }
                                erl1Var3 = bgc0Var;
                                x7f1Var4 = x7f1Var2;
                                vu30Var5 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                qim0Var5 = qim0Var4;
                                i11 = i10;
                                f6 = f3;
                            } else {
                                b0kVar3.b0();
                                if ((i2 & 32) != 0) {
                                    i10 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i10 &= -3670017;
                                }
                                i11 = i10;
                                f6 = f3;
                                erl1Var3 = bgc0Var;
                                x7f1Var4 = x7f1Var2;
                                vu30Var5 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                qim0Var5 = qim0Var2;
                            }
                            b0kVar3.s();
                            lee1 lee1VarA = o2h1.a(b0kVar3, 13);
                            lee1 lee1Var = lee1.d;
                            era eraVar = een.Q0;
                            if (!p3v.c(f6, Float.NaN) && !p3v.c(f6, Float.POSITIVE_INFINITY)) {
                                f5 = f6;
                            }
                            int i15 = i11 << 12;
                            b0kVar2 = b0kVar3;
                            c(qim0Var5, vu30Var, lee1VarA, lee1Var, eraVar, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i15) | (29360128 & i15) | (i15 & 1879048192), (i11 >> 18) & 126);
                            f4 = f6;
                            qim0Var3 = qim0Var5;
                            vu30Var4 = vu30Var5;
                            xu30Var3 = xu30Var4;
                            erl1Var2 = erl1Var3;
                            x7f1Var3 = x7f1Var4;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var3 = qim0Var2;
                            vu30Var4 = vu30Var3;
                            xu30Var3 = xu30Var2;
                            f4 = f3;
                            erl1Var2 = bgc0Var;
                            x7f1Var3 = x7f1Var2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu30() { // from class: p.oi5
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                    return rih1.a;
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    f3 = f2;
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            bgc0Var = erl1Var;
                            if (b0kVar3.g(bgc0Var)) {
                            }
                            i3 |= i13;
                        } else {
                            bgc0Var = erl1Var;
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            x7f1Var2 = x7f1Var;
                            if (b0kVar3.g(x7f1Var2)) {
                            }
                            i3 |= i14;
                        } else {
                            x7f1Var2 = x7f1Var;
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i10 & 1, z)) {
                        b0kVar3.d0();
                        f5 = 64.0f;
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        }
                        b0kVar3.s();
                        lee1 lee1VarA2 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var2 = lee1.d;
                        era eraVar2 = een.Q0;
                        if (!p3v.c(f6, Float.NaN)) {
                            f5 = f6;
                        }
                        int i16 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        c(qim0Var5, vu30Var, lee1VarA2, lee1Var2, eraVar2, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i16) | (29360128 & i16) | (i16 & 1879048192), (i11 >> 18) & 126);
                        f4 = f6;
                        qim0Var3 = qim0Var5;
                        vu30Var4 = vu30Var5;
                        xu30Var3 = xu30Var4;
                        erl1Var2 = erl1Var3;
                        x7f1Var3 = x7f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var4 = vu30Var3;
                        xu30Var3 = xu30Var2;
                        f4 = f3;
                        erl1Var2 = bgc0Var;
                        x7f1Var3 = x7f1Var2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.oi5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                xu30Var2 = xu30Var;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        f3 = f2;
                        if (b0kVar3.d(f3)) {
                            i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                        } else {
                            i9 = SemanticState.Multiline;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            bgc0Var = erl1Var;
                            if (b0kVar3.g(bgc0Var)) {
                            }
                            i3 |= i13;
                        } else {
                            bgc0Var = erl1Var;
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            x7f1Var2 = x7f1Var;
                            if (b0kVar3.g(x7f1Var2)) {
                            }
                            i3 |= i14;
                        } else {
                            x7f1Var2 = x7f1Var;
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i10 & 1, z)) {
                        b0kVar3.d0();
                        f5 = 64.0f;
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        }
                        b0kVar3.s();
                        lee1 lee1VarA3 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var3 = lee1.d;
                        era eraVar3 = een.Q0;
                        if (!p3v.c(f6, Float.NaN)) {
                            f5 = f6;
                        }
                        int i17 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        c(qim0Var5, vu30Var, lee1VarA3, lee1Var3, eraVar3, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i17) | (29360128 & i17) | (i17 & 1879048192), (i11 >> 18) & 126);
                        f4 = f6;
                        qim0Var3 = qim0Var5;
                        vu30Var4 = vu30Var5;
                        xu30Var3 = xu30Var4;
                        erl1Var2 = erl1Var3;
                        x7f1Var3 = x7f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var4 = vu30Var3;
                        xu30Var3 = xu30Var2;
                        f4 = f3;
                        erl1Var2 = bgc0Var;
                        x7f1Var3 = x7f1Var2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.oi5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                f3 = f2;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        bgc0Var = erl1Var;
                        if (b0kVar3.g(bgc0Var)) {
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    f5 = 64.0f;
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    }
                    b0kVar3.s();
                    lee1 lee1VarA4 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var4 = lee1.d;
                    era eraVar4 = een.Q0;
                    if (!p3v.c(f6, Float.NaN)) {
                        f5 = f6;
                    }
                    int i18 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    c(qim0Var5, vu30Var, lee1VarA4, lee1Var4, eraVar4, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i18) | (29360128 & i18) | (i18 & 1879048192), (i11 >> 18) & 126);
                    f4 = f6;
                    qim0Var3 = qim0Var5;
                    vu30Var4 = vu30Var5;
                    xu30Var3 = xu30Var4;
                    erl1Var2 = erl1Var3;
                    x7f1Var3 = x7f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var4 = vu30Var3;
                    xu30Var3 = xu30Var2;
                    f4 = f3;
                    erl1Var2 = bgc0Var;
                    x7f1Var3 = x7f1Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.oi5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 384;
            vu30Var3 = vu30Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    xu30Var2 = xu30Var;
                    if (b0kVar3.i(xu30Var2)) {
                        i7 = SemanticState.Modal;
                    } else {
                        i7 = SemanticState.ReadOnly;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        f3 = f2;
                        if (b0kVar3.d(f3)) {
                            i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                        } else {
                            i9 = SemanticState.Multiline;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            bgc0Var = erl1Var;
                            if (b0kVar3.g(bgc0Var)) {
                            }
                            i3 |= i13;
                        } else {
                            bgc0Var = erl1Var;
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            x7f1Var2 = x7f1Var;
                            if (b0kVar3.g(x7f1Var2)) {
                            }
                            i3 |= i14;
                        } else {
                            x7f1Var2 = x7f1Var;
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i10 & 1, z)) {
                        b0kVar3.d0();
                        f5 = 64.0f;
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        }
                        b0kVar3.s();
                        lee1 lee1VarA5 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var5 = lee1.d;
                        era eraVar5 = een.Q0;
                        if (!p3v.c(f6, Float.NaN)) {
                            f5 = f6;
                        }
                        int i19 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        c(qim0Var5, vu30Var, lee1VarA5, lee1Var5, eraVar5, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i19) | (29360128 & i19) | (i19 & 1879048192), (i11 >> 18) & 126);
                        f4 = f6;
                        qim0Var3 = qim0Var5;
                        vu30Var4 = vu30Var5;
                        xu30Var3 = xu30Var4;
                        erl1Var2 = erl1Var3;
                        x7f1Var3 = x7f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var4 = vu30Var3;
                        xu30Var3 = xu30Var2;
                        f4 = f3;
                        erl1Var2 = bgc0Var;
                        x7f1Var3 = x7f1Var2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.oi5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                f3 = f2;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        bgc0Var = erl1Var;
                        if (b0kVar3.g(bgc0Var)) {
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    f5 = 64.0f;
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    }
                    b0kVar3.s();
                    lee1 lee1VarA6 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var6 = lee1.d;
                    era eraVar6 = een.Q0;
                    if (!p3v.c(f6, Float.NaN)) {
                        f5 = f6;
                    }
                    int i110 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    c(qim0Var5, vu30Var, lee1VarA6, lee1Var6, eraVar6, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i110) | (29360128 & i110) | (i110 & 1879048192), (i11 >> 18) & 126);
                    f4 = f6;
                    qim0Var3 = qim0Var5;
                    vu30Var4 = vu30Var5;
                    xu30Var3 = xu30Var4;
                    erl1Var2 = erl1Var3;
                    x7f1Var3 = x7f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var4 = vu30Var3;
                    xu30Var3 = xu30Var2;
                    f4 = f3;
                    erl1Var2 = bgc0Var;
                    x7f1Var3 = x7f1Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.oi5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            xu30Var2 = xu30Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    f3 = f2;
                    if (b0kVar3.d(f3)) {
                        i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i9 = SemanticState.Multiline;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        bgc0Var = erl1Var;
                        if (b0kVar3.g(bgc0Var)) {
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    f5 = 64.0f;
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    }
                    b0kVar3.s();
                    lee1 lee1VarA7 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var7 = lee1.d;
                    era eraVar7 = een.Q0;
                    if (!p3v.c(f6, Float.NaN)) {
                        f5 = f6;
                    }
                    int i111 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    c(qim0Var5, vu30Var, lee1VarA7, lee1Var7, eraVar7, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i111) | (29360128 & i111) | (i111 & 1879048192), (i11 >> 18) & 126);
                    f4 = f6;
                    qim0Var3 = qim0Var5;
                    vu30Var4 = vu30Var5;
                    xu30Var3 = xu30Var4;
                    erl1Var2 = erl1Var3;
                    x7f1Var3 = x7f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var4 = vu30Var3;
                    xu30Var3 = xu30Var2;
                    f4 = f3;
                    erl1Var2 = bgc0Var;
                    x7f1Var3 = x7f1Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.oi5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            f3 = f2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    bgc0Var = erl1Var;
                    if (b0kVar3.g(bgc0Var)) {
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                i3 |= i13;
            } else {
                bgc0Var = erl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i3 |= i14;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i10 & 1, z)) {
                b0kVar3.d0();
                f5 = 64.0f;
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                } else {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                }
                b0kVar3.s();
                lee1 lee1VarA8 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var8 = lee1.d;
                era eraVar8 = een.Q0;
                if (!p3v.c(f6, Float.NaN)) {
                    f5 = f6;
                }
                int i112 = i11 << 12;
                b0kVar2 = b0kVar3;
                c(qim0Var5, vu30Var, lee1VarA8, lee1Var8, eraVar8, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i112) | (29360128 & i112) | (i112 & 1879048192), (i11 >> 18) & 126);
                f4 = f6;
                qim0Var3 = qim0Var5;
                vu30Var4 = vu30Var5;
                xu30Var3 = xu30Var4;
                erl1Var2 = erl1Var3;
                x7f1Var3 = x7f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                vu30Var4 = vu30Var3;
                xu30Var3 = xu30Var2;
                f4 = f3;
                erl1Var2 = bgc0Var;
                x7f1Var3 = x7f1Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.oi5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
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
                vu30Var3 = vu30Var2;
                if (b0kVar3.i(vu30Var3)) {
                    i5 = SemanticState.Hidden;
                } else {
                    i5 = SemanticState.Focused;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    xu30Var2 = xu30Var;
                    if (b0kVar3.i(xu30Var2)) {
                        i7 = SemanticState.Modal;
                    } else {
                        i7 = SemanticState.ReadOnly;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        f3 = f2;
                        if (b0kVar3.d(f3)) {
                            i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                        } else {
                            i9 = SemanticState.Multiline;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            bgc0Var = erl1Var;
                            if (b0kVar3.g(bgc0Var)) {
                            }
                            i3 |= i13;
                        } else {
                            bgc0Var = erl1Var;
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            x7f1Var2 = x7f1Var;
                            if (b0kVar3.g(x7f1Var2)) {
                            }
                            i3 |= i14;
                        } else {
                            x7f1Var2 = x7f1Var;
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i10 & 1, z)) {
                        b0kVar3.d0();
                        f5 = 64.0f;
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        } else {
                            if (i12 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                vu30Var3 = l6i.c;
                            }
                            if (i6 != 0) {
                                xu30Var2 = l6i.d;
                            }
                            if (i8 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                i10 &= -458753;
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            }
                            if ((i2 & 64) != 0) {
                                dahVar = (dah) b0kVar3.k(eah.a);
                                x7f1Var5 = dahVar.Z;
                                if (x7f1Var5 == null) {
                                    x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                    dahVar.Z = x7f1Var5;
                                }
                                i10 &= -3670017;
                                x7f1Var2 = x7f1Var5;
                            }
                            erl1Var3 = bgc0Var;
                            x7f1Var4 = x7f1Var2;
                            vu30Var5 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            qim0Var5 = qim0Var4;
                            i11 = i10;
                            f6 = f3;
                        }
                        b0kVar3.s();
                        lee1 lee1VarA9 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var9 = lee1.d;
                        era eraVar9 = een.Q0;
                        if (!p3v.c(f6, Float.NaN)) {
                            f5 = f6;
                        }
                        int i113 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        c(qim0Var5, vu30Var, lee1VarA9, lee1Var9, eraVar9, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i113) | (29360128 & i113) | (i113 & 1879048192), (i11 >> 18) & 126);
                        f4 = f6;
                        qim0Var3 = qim0Var5;
                        vu30Var4 = vu30Var5;
                        xu30Var3 = xu30Var4;
                        erl1Var2 = erl1Var3;
                        x7f1Var3 = x7f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var4 = vu30Var3;
                        xu30Var3 = xu30Var2;
                        f4 = f3;
                        erl1Var2 = bgc0Var;
                        x7f1Var3 = x7f1Var2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.oi5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                f3 = f2;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        bgc0Var = erl1Var;
                        if (b0kVar3.g(bgc0Var)) {
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    f5 = 64.0f;
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    }
                    b0kVar3.s();
                    lee1 lee1VarA10 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var10 = lee1.d;
                    era eraVar10 = een.Q0;
                    if (!p3v.c(f6, Float.NaN)) {
                        f5 = f6;
                    }
                    int i114 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    c(qim0Var5, vu30Var, lee1VarA10, lee1Var10, eraVar10, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i114) | (29360128 & i114) | (i114 & 1879048192), (i11 >> 18) & 126);
                    f4 = f6;
                    qim0Var3 = qim0Var5;
                    vu30Var4 = vu30Var5;
                    xu30Var3 = xu30Var4;
                    erl1Var2 = erl1Var3;
                    x7f1Var3 = x7f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var4 = vu30Var3;
                    xu30Var3 = xu30Var2;
                    f4 = f3;
                    erl1Var2 = bgc0Var;
                    x7f1Var3 = x7f1Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.oi5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            xu30Var2 = xu30Var;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    f3 = f2;
                    if (b0kVar3.d(f3)) {
                        i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i9 = SemanticState.Multiline;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        bgc0Var = erl1Var;
                        if (b0kVar3.g(bgc0Var)) {
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    f5 = 64.0f;
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    }
                    b0kVar3.s();
                    lee1 lee1VarA11 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var11 = lee1.d;
                    era eraVar11 = een.Q0;
                    if (!p3v.c(f6, Float.NaN)) {
                        f5 = f6;
                    }
                    int i115 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    c(qim0Var5, vu30Var, lee1VarA11, lee1Var11, eraVar11, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i115) | (29360128 & i115) | (i115 & 1879048192), (i11 >> 18) & 126);
                    f4 = f6;
                    qim0Var3 = qim0Var5;
                    vu30Var4 = vu30Var5;
                    xu30Var3 = xu30Var4;
                    erl1Var2 = erl1Var3;
                    x7f1Var3 = x7f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var4 = vu30Var3;
                    xu30Var3 = xu30Var2;
                    f4 = f3;
                    erl1Var2 = bgc0Var;
                    x7f1Var3 = x7f1Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.oi5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            f3 = f2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    bgc0Var = erl1Var;
                    if (b0kVar3.g(bgc0Var)) {
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                i3 |= i13;
            } else {
                bgc0Var = erl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i3 |= i14;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i10 & 1, z)) {
                b0kVar3.d0();
                f5 = 64.0f;
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                } else {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                }
                b0kVar3.s();
                lee1 lee1VarA12 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var12 = lee1.d;
                era eraVar12 = een.Q0;
                if (!p3v.c(f6, Float.NaN)) {
                    f5 = f6;
                }
                int i116 = i11 << 12;
                b0kVar2 = b0kVar3;
                c(qim0Var5, vu30Var, lee1VarA12, lee1Var12, eraVar12, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i116) | (29360128 & i116) | (i116 & 1879048192), (i11 >> 18) & 126);
                f4 = f6;
                qim0Var3 = qim0Var5;
                vu30Var4 = vu30Var5;
                xu30Var3 = xu30Var4;
                erl1Var2 = erl1Var3;
                x7f1Var3 = x7f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                vu30Var4 = vu30Var3;
                xu30Var3 = xu30Var2;
                f4 = f3;
                erl1Var2 = bgc0Var;
                x7f1Var3 = x7f1Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.oi5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 384;
        vu30Var3 = vu30Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                xu30Var2 = xu30Var;
                if (b0kVar3.i(xu30Var2)) {
                    i7 = SemanticState.Modal;
                } else {
                    i7 = SemanticState.ReadOnly;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    f3 = f2;
                    if (b0kVar3.d(f3)) {
                        i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i9 = SemanticState.Multiline;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        bgc0Var = erl1Var;
                        if (b0kVar3.g(bgc0Var)) {
                        }
                        i3 |= i13;
                    } else {
                        bgc0Var = erl1Var;
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                        }
                        i3 |= i14;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i10 & 1, z)) {
                    b0kVar3.d0();
                    f5 = 64.0f;
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    } else {
                        if (i12 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            vu30Var3 = l6i.c;
                        }
                        if (i6 != 0) {
                            xu30Var2 = l6i.d;
                        }
                        if (i8 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            i10 &= -458753;
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        }
                        if ((i2 & 64) != 0) {
                            dahVar = (dah) b0kVar3.k(eah.a);
                            x7f1Var5 = dahVar.Z;
                            if (x7f1Var5 == null) {
                                x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                                dahVar.Z = x7f1Var5;
                            }
                            i10 &= -3670017;
                            x7f1Var2 = x7f1Var5;
                        }
                        erl1Var3 = bgc0Var;
                        x7f1Var4 = x7f1Var2;
                        vu30Var5 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        qim0Var5 = qim0Var4;
                        i11 = i10;
                        f6 = f3;
                    }
                    b0kVar3.s();
                    lee1 lee1VarA13 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var13 = lee1.d;
                    era eraVar13 = een.Q0;
                    if (!p3v.c(f6, Float.NaN)) {
                        f5 = f6;
                    }
                    int i117 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    c(qim0Var5, vu30Var, lee1VarA13, lee1Var13, eraVar13, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i117) | (29360128 & i117) | (i117 & 1879048192), (i11 >> 18) & 126);
                    f4 = f6;
                    qim0Var3 = qim0Var5;
                    vu30Var4 = vu30Var5;
                    xu30Var3 = xu30Var4;
                    erl1Var2 = erl1Var3;
                    x7f1Var3 = x7f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var4 = vu30Var3;
                    xu30Var3 = xu30Var2;
                    f4 = f3;
                    erl1Var2 = bgc0Var;
                    x7f1Var3 = x7f1Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.oi5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            f3 = f2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    bgc0Var = erl1Var;
                    if (b0kVar3.g(bgc0Var)) {
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                i3 |= i13;
            } else {
                bgc0Var = erl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i3 |= i14;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i10 & 1, z)) {
                b0kVar3.d0();
                f5 = 64.0f;
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                } else {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                }
                b0kVar3.s();
                lee1 lee1VarA14 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var14 = lee1.d;
                era eraVar14 = een.Q0;
                if (!p3v.c(f6, Float.NaN)) {
                    f5 = f6;
                }
                int i118 = i11 << 12;
                b0kVar2 = b0kVar3;
                c(qim0Var5, vu30Var, lee1VarA14, lee1Var14, eraVar14, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i118) | (29360128 & i118) | (i118 & 1879048192), (i11 >> 18) & 126);
                f4 = f6;
                qim0Var3 = qim0Var5;
                vu30Var4 = vu30Var5;
                xu30Var3 = xu30Var4;
                erl1Var2 = erl1Var3;
                x7f1Var3 = x7f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                vu30Var4 = vu30Var3;
                xu30Var3 = xu30Var2;
                f4 = f3;
                erl1Var2 = bgc0Var;
                x7f1Var3 = x7f1Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.oi5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 3072;
        xu30Var2 = xu30Var;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                f3 = f2;
                if (b0kVar3.d(f3)) {
                    i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i9 = SemanticState.Multiline;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    bgc0Var = erl1Var;
                    if (b0kVar3.g(bgc0Var)) {
                    }
                    i3 |= i13;
                } else {
                    bgc0Var = erl1Var;
                }
                i3 |= i13;
            } else {
                bgc0Var = erl1Var;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                    }
                    i3 |= i14;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i3 |= i14;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i10 & 1, z)) {
                b0kVar3.d0();
                f5 = 64.0f;
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                } else {
                    if (i12 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        vu30Var3 = l6i.c;
                    }
                    if (i6 != 0) {
                        xu30Var2 = l6i.d;
                    }
                    if (i8 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        i10 &= -458753;
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    }
                    if ((i2 & 64) != 0) {
                        dahVar = (dah) b0kVar3.k(eah.a);
                        x7f1Var5 = dahVar.Z;
                        if (x7f1Var5 == null) {
                            x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                            dahVar.Z = x7f1Var5;
                        }
                        i10 &= -3670017;
                        x7f1Var2 = x7f1Var5;
                    }
                    erl1Var3 = bgc0Var;
                    x7f1Var4 = x7f1Var2;
                    vu30Var5 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    qim0Var5 = qim0Var4;
                    i11 = i10;
                    f6 = f3;
                }
                b0kVar3.s();
                lee1 lee1VarA15 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var15 = lee1.d;
                era eraVar15 = een.Q0;
                if (!p3v.c(f6, Float.NaN)) {
                    f5 = f6;
                }
                int i119 = i11 << 12;
                b0kVar2 = b0kVar3;
                c(qim0Var5, vu30Var, lee1VarA15, lee1Var15, eraVar15, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i119) | (29360128 & i119) | (i119 & 1879048192), (i11 >> 18) & 126);
                f4 = f6;
                qim0Var3 = qim0Var5;
                vu30Var4 = vu30Var5;
                xu30Var3 = xu30Var4;
                erl1Var2 = erl1Var3;
                x7f1Var3 = x7f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                vu30Var4 = vu30Var3;
                xu30Var3 = xu30Var2;
                f4 = f3;
                erl1Var2 = bgc0Var;
                x7f1Var3 = x7f1Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.oi5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 24576;
        f3 = f2;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                bgc0Var = erl1Var;
                if (b0kVar3.g(bgc0Var)) {
                }
                i3 |= i13;
            } else {
                bgc0Var = erl1Var;
            }
            i3 |= i13;
        } else {
            bgc0Var = erl1Var;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                x7f1Var2 = x7f1Var;
                if (b0kVar3.g(x7f1Var2)) {
                }
                i3 |= i14;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i3 |= i14;
        } else {
            x7f1Var2 = x7f1Var;
        }
        i10 = i3 | 12582912;
        if ((4793491 & i10) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i10 & 1, z)) {
            b0kVar3.d0();
            f5 = 64.0f;
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    vu30Var3 = l6i.c;
                }
                if (i6 != 0) {
                    xu30Var2 = l6i.d;
                }
                if (i8 != 0) {
                    f3 = 64.0f;
                }
                if ((i2 & 32) != 0) {
                    i10 &= -458753;
                    bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                }
                if ((i2 & 64) != 0) {
                    dahVar = (dah) b0kVar3.k(eah.a);
                    x7f1Var5 = dahVar.Z;
                    if (x7f1Var5 == null) {
                        x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                        dahVar.Z = x7f1Var5;
                    }
                    i10 &= -3670017;
                    x7f1Var2 = x7f1Var5;
                }
                erl1Var3 = bgc0Var;
                x7f1Var4 = x7f1Var2;
                vu30Var5 = vu30Var3;
                xu30Var4 = xu30Var2;
                qim0Var5 = qim0Var4;
                i11 = i10;
                f6 = f3;
            } else {
                if (i12 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    vu30Var3 = l6i.c;
                }
                if (i6 != 0) {
                    xu30Var2 = l6i.d;
                }
                if (i8 != 0) {
                    f3 = 64.0f;
                }
                if ((i2 & 32) != 0) {
                    i10 &= -458753;
                    bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                }
                if ((i2 & 64) != 0) {
                    dahVar = (dah) b0kVar3.k(eah.a);
                    x7f1Var5 = dahVar.Z;
                    if (x7f1Var5 == null) {
                        x7f1Var5 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
                        dahVar.Z = x7f1Var5;
                    }
                    i10 &= -3670017;
                    x7f1Var2 = x7f1Var5;
                }
                erl1Var3 = bgc0Var;
                x7f1Var4 = x7f1Var2;
                vu30Var5 = vu30Var3;
                xu30Var4 = xu30Var2;
                qim0Var5 = qim0Var4;
                i11 = i10;
                f6 = f3;
            }
            b0kVar3.s();
            lee1 lee1VarA16 = o2h1.a(b0kVar3, 13);
            lee1 lee1Var16 = lee1.d;
            era eraVar16 = een.Q0;
            if (!p3v.c(f6, Float.NaN)) {
                f5 = f6;
            }
            int i1110 = i11 << 12;
            b0kVar2 = b0kVar3;
            c(qim0Var5, vu30Var, lee1VarA16, lee1Var16, eraVar16, vu30Var5, xu30Var4, f5, erl1Var3, x7f1Var4, null, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i1110) | (29360128 & i1110) | (i1110 & 1879048192), (i11 >> 18) & 126);
            f4 = f6;
            qim0Var3 = qim0Var5;
            vu30Var4 = vu30Var5;
            xu30Var3 = xu30Var4;
            erl1Var2 = erl1Var3;
            x7f1Var3 = x7f1Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            vu30Var4 = vu30Var3;
            xu30Var3 = xu30Var2;
            f4 = f3;
            erl1Var2 = bgc0Var;
            x7f1Var3 = x7f1Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.oi5
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ti5.a(vu30Var, qim0Var3, vu30Var4, xu30Var3, f4, erl1Var2, x7f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(final j2i j2iVar, final qim0 qim0Var, final j2i j2iVar2, final j2i j2iVar3, float f2, float f3, erl1 erl1Var, final x7f1 x7f1Var, final a8f1 a8f1Var, b0k b0kVar, final int i) {
        int i2;
        j2i j2iVar4;
        j2i j2iVar5;
        b0k b0kVar2;
        final float f4;
        final float f5;
        final erl1 erl1Var2;
        int i3;
        float f6;
        erl1 bgc0Var;
        float f7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1378129383);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2iVar4 = j2iVar2;
            i2 |= b0kVar3.i(j2iVar4) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            j2iVar4 = j2iVar2;
        }
        if ((i & 3072) == 0) {
            j2iVar5 = j2iVar3;
            i2 |= b0kVar3.i(j2iVar5) ? SemanticState.Modal : SemanticState.ReadOnly;
        } else {
            j2iVar5 = j2iVar3;
        }
        int i4 = 221184 | i2;
        if ((1572864 & i) == 0) {
            i4 = 745472 | i2;
        }
        if ((12582912 & i) == 0) {
            i4 |= b0kVar3.g(x7f1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= b0kVar3.g(a8f1Var) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                i3 = i4 & (-3670017);
                f6 = 64.0f;
                bgc0Var = new bgc0(zxo1.v(b0kVar3), 16 | 15);
                f7 = 112.0f;
            } else {
                b0kVar3.b0();
                f7 = f3;
                bgc0Var = erl1Var;
                i3 = i4 & (-3670017);
                f6 = f2;
            }
            b0kVar3.s();
            lee1 lee1VarA = o2h1.a(b0kVar3, 9);
            lee1 lee1VarA2 = o2h1.a(b0kVar3, 13);
            lee1 lee1Var = lee1.d;
            int i5 = i3 >> 3;
            b0kVar2 = b0kVar3;
            f(qim0Var, j2iVar, lee1VarA, d, j2iVar, lee1VarA2, lee1Var, lee1Var, j2iVar4, j2iVar5, (p3v.c(f6, Float.NaN) || p3v.c(f6, Float.POSITIVE_INFINITY)) ? 64.0f : f6, (p3v.c(f7, Float.NaN) || p3v.c(f7, Float.POSITIVE_INFINITY)) ? 112.0f : f7, bgc0Var, x7f1Var, a8f1Var, b0kVar2, (i5 & 14) | 920128512 | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 12) & 57344), (i5 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i5 & 896) | (3670016 & i5) | (i5 & 29360128));
            f4 = f6;
            f5 = f7;
            erl1Var2 = bgc0Var;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f4 = f2;
            f5 = f3;
            erl1Var2 = erl1Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.pi5
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ti5.b(j2iVar, qim0Var, j2iVar2, j2iVar3, f4, f5, erl1Var2, x7f1Var, a8f1Var, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(final qim0 qim0Var, final vu30 vu30Var, final lee1 lee1Var, final lee1 lee1Var2, final era eraVar, final vu30 vu30Var2, final xu30 xu30Var, final float f2, final erl1 erl1Var, final x7f1 x7f1Var, final a8f1 a8f1Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        lee1 lee1Var3;
        lee1 lee1Var4;
        era eraVar2;
        vu30 vu30Var3;
        xu30 xu30Var2;
        float f3;
        int i4;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2033800111);
        if ((i & 6) == 0) {
            i3 = (b0kVar2.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar2.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            lee1Var3 = lee1Var;
            i3 |= b0kVar2.g(lee1Var3) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            lee1Var3 = lee1Var;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar2.i((Object) null) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            lee1Var4 = lee1Var2;
            i3 |= b0kVar2.g(lee1Var4) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        } else {
            lee1Var4 = lee1Var2;
        }
        if ((196608 & i) == 0) {
            eraVar2 = eraVar;
            i3 |= b0kVar2.g(eraVar2) ? 131072 : 65536;
        } else {
            eraVar2 = eraVar;
        }
        if ((1572864 & i) == 0) {
            vu30Var3 = vu30Var2;
            i3 |= b0kVar2.i(vu30Var3) ? 1048576 : 524288;
        } else {
            vu30Var3 = vu30Var2;
        }
        if ((12582912 & i) == 0) {
            xu30Var2 = xu30Var;
            i3 |= b0kVar2.i(xu30Var2) ? 8388608 : 4194304;
        } else {
            xu30Var2 = xu30Var;
        }
        if ((100663296 & i) == 0) {
            f3 = f2;
            i3 |= b0kVar2.d(f3) ? 67108864 : 33554432;
        } else {
            f3 = f2;
        }
        if ((805306368 & i) == 0) {
            i3 |= b0kVar2.g(erl1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar2.g(x7f1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar2.g(a8f1Var) ? 32 : 16;
        }
        if (b0kVar2.Y(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((xps) b0kVar2.k(a)).a(new i191(qim0Var, vu30Var, lee1Var3, lee1Var4, eraVar2, vu30Var3, xu30Var2, f3, erl1Var, x7f1Var, a8f1Var), b0kVar2, 0);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.qi5
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i | 1);
                    int iP2 = czo1.p(i2);
                    ti5.c(qim0Var, vu30Var, lee1Var, lee1Var2, eraVar, vu30Var2, xu30Var, f2, erl1Var, x7f1Var, a8f1Var, (b0k) obj, iP, iP2);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x018b  */
    /* JADX WARN: Code duplicated, block: B:116:0x019e  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    public static final void d(final j2i j2iVar, qim0 qim0Var, vu30 vu30Var, xu30 xu30Var, float f2, erl1 erl1Var, final x7f1 x7f1Var, a8f1 a8f1Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        int i4;
        xu30 xu30Var2;
        int i5;
        int i6;
        float f3;
        int i7;
        erl1 erl1Var2;
        x7f1 x7f1Var2;
        int i8;
        a8f1 a8f1Var2;
        int i9;
        boolean z;
        b0k b0kVar2;
        final qim0 qim0Var2;
        final vu30 vu30Var2;
        final xu30 xu30Var3;
        final erl1 erl1Var3;
        final a8f1 a8f1Var3;
        final float f4;
        h311 h311VarV;
        vu30 vu30Var3;
        erl1 bgc0Var;
        qim0 qim0Var3;
        vu30 vu30Var4;
        xu30 xu30Var4;
        erl1 erl1Var4;
        a8f1 a8f1Var4;
        float f5;
        int i10;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1784421840);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i3 | 48;
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                i11 |= b0kVar3.i(vu30Var) ? SemanticState.Hidden : SemanticState.Focused;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    xu30Var2 = xu30Var;
                    if (b0kVar3.i(xu30Var2)) {
                        i5 = SemanticState.Modal;
                    } else {
                        i5 = SemanticState.ReadOnly;
                    }
                    i11 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        f3 = f2;
                        if (b0kVar3.d(f3)) {
                            i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                        } else {
                            i7 = SemanticState.Multiline;
                        }
                        i11 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            erl1Var2 = erl1Var;
                            int i13 = b0kVar3.g(erl1Var2) ? 131072 : 65536;
                            i11 |= i13;
                        } else {
                            erl1Var2 = erl1Var;
                        }
                        i11 |= i13;
                    } else {
                        erl1Var2 = erl1Var;
                    }
                    if ((1572864 & i) == 0) {
                        x7f1Var2 = x7f1Var;
                        if (b0kVar3.g(x7f1Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i11 |= i10;
                    } else {
                        x7f1Var2 = x7f1Var;
                    }
                    i8 = i2 & SemanticState.Focused;
                    if (i8 != 0) {
                        if ((12582912 & i) == 0) {
                            a8f1Var2 = a8f1Var;
                            if (b0kVar3.g(a8f1Var2)) {
                                i9 = 8388608;
                            } else {
                                i9 = 4194304;
                            }
                            i11 |= i9;
                        }
                        if ((4793491 & i11) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b0kVar3.Y(i11 & 1, z)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0 || b0kVar3.E()) {
                                if (i12 != 0) {
                                    vu30Var3 = l6i.a;
                                } else {
                                    vu30Var3 = vu30Var;
                                }
                                if (i4 != 0) {
                                    xu30Var2 = l6i.b;
                                }
                                if (i6 != 0) {
                                    f3 = 64.0f;
                                }
                                if ((i2 & 32) != 0) {
                                    bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                    i11 &= -458753;
                                } else {
                                    bgc0Var = erl1Var2;
                                }
                                qim0Var3 = nim0.a;
                                if (i8 != 0) {
                                    vu30Var4 = vu30Var3;
                                    a8f1Var4 = null;
                                    xu30Var4 = xu30Var2;
                                    erl1Var4 = bgc0Var;
                                } else {
                                    vu30Var4 = vu30Var3;
                                    xu30Var4 = xu30Var2;
                                    erl1Var4 = bgc0Var;
                                }
                                b0kVar3.s();
                                lee1 lee1VarA = o2h1.a(b0kVar3, 13);
                                lee1 lee1Var = lee1.d;
                                era eraVar = een.P0;
                                if (!p3v.c(f3, Float.NaN) || p3v.c(f3, Float.POSITIVE_INFINITY)) {
                                    f5 = 64.0f;
                                } else {
                                    f5 = f3;
                                }
                                int i14 = i11 << 12;
                                b0kVar2 = b0kVar3;
                                x7f1 x7f1Var3 = x7f1Var2;
                                qim0 qim0Var4 = qim0Var3;
                                c(qim0Var4, j2iVar, lee1VarA, lee1Var, eraVar, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var3, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i14) | (29360128 & i14) | (i14 & 1879048192), (i11 >> 18) & 126);
                                qim0Var2 = qim0Var4;
                                vu30Var2 = vu30Var4;
                                xu30Var3 = xu30Var4;
                                erl1Var3 = erl1Var4;
                                a8f1Var3 = a8f1Var4;
                            } else {
                                b0kVar3.b0();
                                if ((i2 & 32) != 0) {
                                    i11 &= -458753;
                                }
                                qim0Var3 = qim0Var;
                                vu30Var4 = vu30Var;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = erl1Var2;
                            }
                            a8f1Var4 = a8f1Var2;
                            b0kVar3.s();
                            lee1 lee1VarA2 = o2h1.a(b0kVar3, 13);
                            lee1 lee1Var2 = lee1.d;
                            era eraVar2 = een.P0;
                            if (p3v.c(f3, Float.NaN)) {
                                f5 = 64.0f;
                            } else {
                                f5 = 64.0f;
                            }
                            int i15 = i11 << 12;
                            b0kVar2 = b0kVar3;
                            x7f1 x7f1Var4 = x7f1Var2;
                            qim0 qim0Var5 = qim0Var3;
                            c(qim0Var5, j2iVar, lee1VarA2, lee1Var2, eraVar2, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var4, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i15) | (29360128 & i15) | (i15 & 1879048192), (i11 >> 18) & 126);
                            qim0Var2 = qim0Var5;
                            vu30Var2 = vu30Var4;
                            xu30Var3 = xu30Var4;
                            erl1Var3 = erl1Var4;
                            a8f1Var3 = a8f1Var4;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            qim0Var2 = qim0Var;
                            vu30Var2 = vu30Var;
                            xu30Var3 = xu30Var2;
                            erl1Var3 = erl1Var2;
                            a8f1Var3 = a8f1Var2;
                        }
                        f4 = f3;
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new vu30() { // from class: p.ni5
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                    return rih1.a;
                                }
                            };
                        }
                    }
                    i11 |= 12582912;
                    a8f1Var2 = a8f1Var;
                    if ((4793491 & i11) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i11 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        } else {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        }
                        b0kVar3.s();
                        lee1 lee1VarA3 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var3 = lee1.d;
                        era eraVar3 = een.P0;
                        if (p3v.c(f3, Float.NaN)) {
                            f5 = 64.0f;
                        } else {
                            f5 = 64.0f;
                        }
                        int i16 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        x7f1 x7f1Var5 = x7f1Var2;
                        qim0 qim0Var6 = qim0Var3;
                        c(qim0Var6, j2iVar, lee1VarA3, lee1Var3, eraVar3, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var5, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i16) | (29360128 & i16) | (i16 & 1879048192), (i11 >> 18) & 126);
                        qim0Var2 = qim0Var6;
                        vu30Var2 = vu30Var4;
                        xu30Var3 = xu30Var4;
                        erl1Var3 = erl1Var4;
                        a8f1Var3 = a8f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var2 = vu30Var;
                        xu30Var3 = xu30Var2;
                        erl1Var3 = erl1Var2;
                        a8f1Var3 = a8f1Var2;
                    }
                    f4 = f3;
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ni5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i11 |= 24576;
                f3 = f2;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        erl1Var2 = erl1Var;
                        if (b0kVar3.g(erl1Var2)) {
                        }
                        i11 |= i13;
                    } else {
                        erl1Var2 = erl1Var;
                    }
                    i11 |= i13;
                } else {
                    erl1Var2 = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i11 |= i10;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i8 = i2 & SemanticState.Focused;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        a8f1Var2 = a8f1Var;
                        if (b0kVar3.g(a8f1Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i11 |= i9;
                    }
                    if ((4793491 & i11) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i11 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        } else {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        }
                        b0kVar3.s();
                        lee1 lee1VarA4 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var4 = lee1.d;
                        era eraVar4 = een.P0;
                        if (p3v.c(f3, Float.NaN)) {
                            f5 = 64.0f;
                        } else {
                            f5 = 64.0f;
                        }
                        int i17 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        x7f1 x7f1Var6 = x7f1Var2;
                        qim0 qim0Var7 = qim0Var3;
                        c(qim0Var7, j2iVar, lee1VarA4, lee1Var4, eraVar4, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var6, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i17) | (29360128 & i17) | (i17 & 1879048192), (i11 >> 18) & 126);
                        qim0Var2 = qim0Var7;
                        vu30Var2 = vu30Var4;
                        xu30Var3 = xu30Var4;
                        erl1Var3 = erl1Var4;
                        a8f1Var3 = a8f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var2 = vu30Var;
                        xu30Var3 = xu30Var2;
                        erl1Var3 = erl1Var2;
                        a8f1Var3 = a8f1Var2;
                    }
                    f4 = f3;
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ni5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i11 |= 12582912;
                a8f1Var2 = a8f1Var;
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    }
                    b0kVar3.s();
                    lee1 lee1VarA5 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var5 = lee1.d;
                    era eraVar5 = een.P0;
                    if (p3v.c(f3, Float.NaN)) {
                        f5 = 64.0f;
                    } else {
                        f5 = 64.0f;
                    }
                    int i18 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    x7f1 x7f1Var7 = x7f1Var2;
                    qim0 qim0Var8 = qim0Var3;
                    c(qim0Var8, j2iVar, lee1VarA5, lee1Var5, eraVar5, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var7, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i18) | (29360128 & i18) | (i18 & 1879048192), (i11 >> 18) & 126);
                    qim0Var2 = qim0Var8;
                    vu30Var2 = vu30Var4;
                    xu30Var3 = xu30Var4;
                    erl1Var3 = erl1Var4;
                    a8f1Var3 = a8f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var2 = vu30Var;
                    xu30Var3 = xu30Var2;
                    erl1Var3 = erl1Var2;
                    a8f1Var3 = a8f1Var2;
                }
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ni5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i11 |= 3072;
            xu30Var2 = xu30Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    f3 = f2;
                    if (b0kVar3.d(f3)) {
                        i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i7 = SemanticState.Multiline;
                    }
                    i11 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        erl1Var2 = erl1Var;
                        if (b0kVar3.g(erl1Var2)) {
                        }
                        i11 |= i13;
                    } else {
                        erl1Var2 = erl1Var;
                    }
                    i11 |= i13;
                } else {
                    erl1Var2 = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i11 |= i10;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i8 = i2 & SemanticState.Focused;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        a8f1Var2 = a8f1Var;
                        if (b0kVar3.g(a8f1Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i11 |= i9;
                    }
                    if ((4793491 & i11) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i11 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        } else {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        }
                        b0kVar3.s();
                        lee1 lee1VarA6 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var6 = lee1.d;
                        era eraVar6 = een.P0;
                        if (p3v.c(f3, Float.NaN)) {
                            f5 = 64.0f;
                        } else {
                            f5 = 64.0f;
                        }
                        int i19 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        x7f1 x7f1Var8 = x7f1Var2;
                        qim0 qim0Var9 = qim0Var3;
                        c(qim0Var9, j2iVar, lee1VarA6, lee1Var6, eraVar6, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var8, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i19) | (29360128 & i19) | (i19 & 1879048192), (i11 >> 18) & 126);
                        qim0Var2 = qim0Var9;
                        vu30Var2 = vu30Var4;
                        xu30Var3 = xu30Var4;
                        erl1Var3 = erl1Var4;
                        a8f1Var3 = a8f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var2 = vu30Var;
                        xu30Var3 = xu30Var2;
                        erl1Var3 = erl1Var2;
                        a8f1Var3 = a8f1Var2;
                    }
                    f4 = f3;
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ni5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i11 |= 12582912;
                a8f1Var2 = a8f1Var;
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    }
                    b0kVar3.s();
                    lee1 lee1VarA7 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var7 = lee1.d;
                    era eraVar7 = een.P0;
                    if (p3v.c(f3, Float.NaN)) {
                        f5 = 64.0f;
                    } else {
                        f5 = 64.0f;
                    }
                    int i110 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    x7f1 x7f1Var9 = x7f1Var2;
                    qim0 qim0Var10 = qim0Var3;
                    c(qim0Var10, j2iVar, lee1VarA7, lee1Var7, eraVar7, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var9, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i110) | (29360128 & i110) | (i110 & 1879048192), (i11 >> 18) & 126);
                    qim0Var2 = qim0Var10;
                    vu30Var2 = vu30Var4;
                    xu30Var3 = xu30Var4;
                    erl1Var3 = erl1Var4;
                    a8f1Var3 = a8f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var2 = vu30Var;
                    xu30Var3 = xu30Var2;
                    erl1Var3 = erl1Var2;
                    a8f1Var3 = a8f1Var2;
                }
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ni5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i11 |= 24576;
            f3 = f2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    erl1Var2 = erl1Var;
                    if (b0kVar3.g(erl1Var2)) {
                    }
                    i11 |= i13;
                } else {
                    erl1Var2 = erl1Var;
                }
                i11 |= i13;
            } else {
                erl1Var2 = erl1Var;
            }
            if ((1572864 & i) == 0) {
                x7f1Var2 = x7f1Var;
                if (b0kVar3.g(x7f1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i11 |= i10;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i8 = i2 & SemanticState.Focused;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    a8f1Var2 = a8f1Var;
                    if (b0kVar3.g(a8f1Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i11 |= i9;
                }
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    }
                    b0kVar3.s();
                    lee1 lee1VarA8 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var8 = lee1.d;
                    era eraVar8 = een.P0;
                    if (p3v.c(f3, Float.NaN)) {
                        f5 = 64.0f;
                    } else {
                        f5 = 64.0f;
                    }
                    int i111 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    x7f1 x7f1Var10 = x7f1Var2;
                    qim0 qim0Var11 = qim0Var3;
                    c(qim0Var11, j2iVar, lee1VarA8, lee1Var8, eraVar8, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var10, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i111) | (29360128 & i111) | (i111 & 1879048192), (i11 >> 18) & 126);
                    qim0Var2 = qim0Var11;
                    vu30Var2 = vu30Var4;
                    xu30Var3 = xu30Var4;
                    erl1Var3 = erl1Var4;
                    a8f1Var3 = a8f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var2 = vu30Var;
                    xu30Var3 = xu30Var2;
                    erl1Var3 = erl1Var2;
                    a8f1Var3 = a8f1Var2;
                }
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ni5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i11 |= 12582912;
            a8f1Var2 = a8f1Var;
            if ((4793491 & i11) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i11 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                } else {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                }
                b0kVar3.s();
                lee1 lee1VarA9 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var9 = lee1.d;
                era eraVar9 = een.P0;
                if (p3v.c(f3, Float.NaN)) {
                    f5 = 64.0f;
                } else {
                    f5 = 64.0f;
                }
                int i112 = i11 << 12;
                b0kVar2 = b0kVar3;
                x7f1 x7f1Var11 = x7f1Var2;
                qim0 qim0Var12 = qim0Var3;
                c(qim0Var12, j2iVar, lee1VarA9, lee1Var9, eraVar9, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var11, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i112) | (29360128 & i112) | (i112 & 1879048192), (i11 >> 18) & 126);
                qim0Var2 = qim0Var12;
                vu30Var2 = vu30Var4;
                xu30Var3 = xu30Var4;
                erl1Var3 = erl1Var4;
                a8f1Var3 = a8f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var2 = vu30Var;
                xu30Var3 = xu30Var2;
                erl1Var3 = erl1Var2;
                a8f1Var3 = a8f1Var2;
            }
            f4 = f3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ni5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i11 = i3 | 432;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                xu30Var2 = xu30Var;
                if (b0kVar3.i(xu30Var2)) {
                    i5 = SemanticState.Modal;
                } else {
                    i5 = SemanticState.ReadOnly;
                }
                i11 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    f3 = f2;
                    if (b0kVar3.d(f3)) {
                        i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i7 = SemanticState.Multiline;
                    }
                    i11 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        erl1Var2 = erl1Var;
                        if (b0kVar3.g(erl1Var2)) {
                        }
                        i11 |= i13;
                    } else {
                        erl1Var2 = erl1Var;
                    }
                    i11 |= i13;
                } else {
                    erl1Var2 = erl1Var;
                }
                if ((1572864 & i) == 0) {
                    x7f1Var2 = x7f1Var;
                    if (b0kVar3.g(x7f1Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i11 |= i10;
                } else {
                    x7f1Var2 = x7f1Var;
                }
                i8 = i2 & SemanticState.Focused;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        a8f1Var2 = a8f1Var;
                        if (b0kVar3.g(a8f1Var2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i11 |= i9;
                    }
                    if ((4793491 & i11) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i11 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        } else {
                            if (i12 != 0) {
                                vu30Var3 = l6i.a;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                            if (i4 != 0) {
                                xu30Var2 = l6i.b;
                            }
                            if (i6 != 0) {
                                f3 = 64.0f;
                            }
                            if ((i2 & 32) != 0) {
                                bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                                i11 &= -458753;
                            } else {
                                bgc0Var = erl1Var2;
                            }
                            qim0Var3 = nim0.a;
                            if (i8 != 0) {
                                vu30Var4 = vu30Var3;
                                a8f1Var4 = null;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                            } else {
                                vu30Var4 = vu30Var3;
                                xu30Var4 = xu30Var2;
                                erl1Var4 = bgc0Var;
                                a8f1Var4 = a8f1Var2;
                            }
                        }
                        b0kVar3.s();
                        lee1 lee1VarA10 = o2h1.a(b0kVar3, 13);
                        lee1 lee1Var10 = lee1.d;
                        era eraVar10 = een.P0;
                        if (p3v.c(f3, Float.NaN)) {
                            f5 = 64.0f;
                        } else {
                            f5 = 64.0f;
                        }
                        int i113 = i11 << 12;
                        b0kVar2 = b0kVar3;
                        x7f1 x7f1Var12 = x7f1Var2;
                        qim0 qim0Var13 = qim0Var3;
                        c(qim0Var13, j2iVar, lee1VarA10, lee1Var10, eraVar10, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var12, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i113) | (29360128 & i113) | (i113 & 1879048192), (i11 >> 18) & 126);
                        qim0Var2 = qim0Var13;
                        vu30Var2 = vu30Var4;
                        xu30Var3 = xu30Var4;
                        erl1Var3 = erl1Var4;
                        a8f1Var3 = a8f1Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                        vu30Var2 = vu30Var;
                        xu30Var3 = xu30Var2;
                        erl1Var3 = erl1Var2;
                        a8f1Var3 = a8f1Var2;
                    }
                    f4 = f3;
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.ni5
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                                return rih1.a;
                            }
                        };
                    }
                }
                i11 |= 12582912;
                a8f1Var2 = a8f1Var;
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    }
                    b0kVar3.s();
                    lee1 lee1VarA11 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var11 = lee1.d;
                    era eraVar11 = een.P0;
                    if (p3v.c(f3, Float.NaN)) {
                        f5 = 64.0f;
                    } else {
                        f5 = 64.0f;
                    }
                    int i114 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    x7f1 x7f1Var13 = x7f1Var2;
                    qim0 qim0Var14 = qim0Var3;
                    c(qim0Var14, j2iVar, lee1VarA11, lee1Var11, eraVar11, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var13, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i114) | (29360128 & i114) | (i114 & 1879048192), (i11 >> 18) & 126);
                    qim0Var2 = qim0Var14;
                    vu30Var2 = vu30Var4;
                    xu30Var3 = xu30Var4;
                    erl1Var3 = erl1Var4;
                    a8f1Var3 = a8f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var2 = vu30Var;
                    xu30Var3 = xu30Var2;
                    erl1Var3 = erl1Var2;
                    a8f1Var3 = a8f1Var2;
                }
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ni5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i11 |= 24576;
            f3 = f2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    erl1Var2 = erl1Var;
                    if (b0kVar3.g(erl1Var2)) {
                    }
                    i11 |= i13;
                } else {
                    erl1Var2 = erl1Var;
                }
                i11 |= i13;
            } else {
                erl1Var2 = erl1Var;
            }
            if ((1572864 & i) == 0) {
                x7f1Var2 = x7f1Var;
                if (b0kVar3.g(x7f1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i11 |= i10;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i8 = i2 & SemanticState.Focused;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    a8f1Var2 = a8f1Var;
                    if (b0kVar3.g(a8f1Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i11 |= i9;
                }
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    }
                    b0kVar3.s();
                    lee1 lee1VarA12 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var12 = lee1.d;
                    era eraVar12 = een.P0;
                    if (p3v.c(f3, Float.NaN)) {
                        f5 = 64.0f;
                    } else {
                        f5 = 64.0f;
                    }
                    int i115 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    x7f1 x7f1Var14 = x7f1Var2;
                    qim0 qim0Var15 = qim0Var3;
                    c(qim0Var15, j2iVar, lee1VarA12, lee1Var12, eraVar12, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var14, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i115) | (29360128 & i115) | (i115 & 1879048192), (i11 >> 18) & 126);
                    qim0Var2 = qim0Var15;
                    vu30Var2 = vu30Var4;
                    xu30Var3 = xu30Var4;
                    erl1Var3 = erl1Var4;
                    a8f1Var3 = a8f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var2 = vu30Var;
                    xu30Var3 = xu30Var2;
                    erl1Var3 = erl1Var2;
                    a8f1Var3 = a8f1Var2;
                }
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ni5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i11 |= 12582912;
            a8f1Var2 = a8f1Var;
            if ((4793491 & i11) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i11 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                } else {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                }
                b0kVar3.s();
                lee1 lee1VarA13 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var13 = lee1.d;
                era eraVar13 = een.P0;
                if (p3v.c(f3, Float.NaN)) {
                    f5 = 64.0f;
                } else {
                    f5 = 64.0f;
                }
                int i116 = i11 << 12;
                b0kVar2 = b0kVar3;
                x7f1 x7f1Var15 = x7f1Var2;
                qim0 qim0Var16 = qim0Var3;
                c(qim0Var16, j2iVar, lee1VarA13, lee1Var13, eraVar13, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var15, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i116) | (29360128 & i116) | (i116 & 1879048192), (i11 >> 18) & 126);
                qim0Var2 = qim0Var16;
                vu30Var2 = vu30Var4;
                xu30Var3 = xu30Var4;
                erl1Var3 = erl1Var4;
                a8f1Var3 = a8f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var2 = vu30Var;
                xu30Var3 = xu30Var2;
                erl1Var3 = erl1Var2;
                a8f1Var3 = a8f1Var2;
            }
            f4 = f3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ni5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i11 |= 3072;
        xu30Var2 = xu30Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                f3 = f2;
                if (b0kVar3.d(f3)) {
                    i7 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i7 = SemanticState.Multiline;
                }
                i11 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    erl1Var2 = erl1Var;
                    if (b0kVar3.g(erl1Var2)) {
                    }
                    i11 |= i13;
                } else {
                    erl1Var2 = erl1Var;
                }
                i11 |= i13;
            } else {
                erl1Var2 = erl1Var;
            }
            if ((1572864 & i) == 0) {
                x7f1Var2 = x7f1Var;
                if (b0kVar3.g(x7f1Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i11 |= i10;
            } else {
                x7f1Var2 = x7f1Var;
            }
            i8 = i2 & SemanticState.Focused;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    a8f1Var2 = a8f1Var;
                    if (b0kVar3.g(a8f1Var2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i11 |= i9;
                }
                if ((4793491 & i11) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i11 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            vu30Var3 = l6i.a;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                        if (i4 != 0) {
                            xu30Var2 = l6i.b;
                        }
                        if (i6 != 0) {
                            f3 = 64.0f;
                        }
                        if ((i2 & 32) != 0) {
                            bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                            i11 &= -458753;
                        } else {
                            bgc0Var = erl1Var2;
                        }
                        qim0Var3 = nim0.a;
                        if (i8 != 0) {
                            vu30Var4 = vu30Var3;
                            a8f1Var4 = null;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                        } else {
                            vu30Var4 = vu30Var3;
                            xu30Var4 = xu30Var2;
                            erl1Var4 = bgc0Var;
                            a8f1Var4 = a8f1Var2;
                        }
                    }
                    b0kVar3.s();
                    lee1 lee1VarA14 = o2h1.a(b0kVar3, 13);
                    lee1 lee1Var14 = lee1.d;
                    era eraVar14 = een.P0;
                    if (p3v.c(f3, Float.NaN)) {
                        f5 = 64.0f;
                    } else {
                        f5 = 64.0f;
                    }
                    int i117 = i11 << 12;
                    b0kVar2 = b0kVar3;
                    x7f1 x7f1Var16 = x7f1Var2;
                    qim0 qim0Var17 = qim0Var3;
                    c(qim0Var17, j2iVar, lee1VarA14, lee1Var14, eraVar14, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var16, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i117) | (29360128 & i117) | (i117 & 1879048192), (i11 >> 18) & 126);
                    qim0Var2 = qim0Var17;
                    vu30Var2 = vu30Var4;
                    xu30Var3 = xu30Var4;
                    erl1Var3 = erl1Var4;
                    a8f1Var3 = a8f1Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                    vu30Var2 = vu30Var;
                    xu30Var3 = xu30Var2;
                    erl1Var3 = erl1Var2;
                    a8f1Var3 = a8f1Var2;
                }
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.ni5
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i11 |= 12582912;
            a8f1Var2 = a8f1Var;
            if ((4793491 & i11) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i11 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                } else {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                }
                b0kVar3.s();
                lee1 lee1VarA15 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var15 = lee1.d;
                era eraVar15 = een.P0;
                if (p3v.c(f3, Float.NaN)) {
                    f5 = 64.0f;
                } else {
                    f5 = 64.0f;
                }
                int i118 = i11 << 12;
                b0kVar2 = b0kVar3;
                x7f1 x7f1Var17 = x7f1Var2;
                qim0 qim0Var18 = qim0Var3;
                c(qim0Var18, j2iVar, lee1VarA15, lee1Var15, eraVar15, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var17, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i118) | (29360128 & i118) | (i118 & 1879048192), (i11 >> 18) & 126);
                qim0Var2 = qim0Var18;
                vu30Var2 = vu30Var4;
                xu30Var3 = xu30Var4;
                erl1Var3 = erl1Var4;
                a8f1Var3 = a8f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var2 = vu30Var;
                xu30Var3 = xu30Var2;
                erl1Var3 = erl1Var2;
                a8f1Var3 = a8f1Var2;
            }
            f4 = f3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ni5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i11 |= 24576;
        f3 = f2;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                erl1Var2 = erl1Var;
                if (b0kVar3.g(erl1Var2)) {
                }
                i11 |= i13;
            } else {
                erl1Var2 = erl1Var;
            }
            i11 |= i13;
        } else {
            erl1Var2 = erl1Var;
        }
        if ((1572864 & i) == 0) {
            x7f1Var2 = x7f1Var;
            if (b0kVar3.g(x7f1Var2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 |= i10;
        } else {
            x7f1Var2 = x7f1Var;
        }
        i8 = i2 & SemanticState.Focused;
        if (i8 != 0) {
            if ((12582912 & i) == 0) {
                a8f1Var2 = a8f1Var;
                if (b0kVar3.g(a8f1Var2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i11 |= i9;
            }
            if ((4793491 & i11) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i11 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                } else {
                    if (i12 != 0) {
                        vu30Var3 = l6i.a;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                    if (i4 != 0) {
                        xu30Var2 = l6i.b;
                    }
                    if (i6 != 0) {
                        f3 = 64.0f;
                    }
                    if ((i2 & 32) != 0) {
                        bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                        i11 &= -458753;
                    } else {
                        bgc0Var = erl1Var2;
                    }
                    qim0Var3 = nim0.a;
                    if (i8 != 0) {
                        vu30Var4 = vu30Var3;
                        a8f1Var4 = null;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                    } else {
                        vu30Var4 = vu30Var3;
                        xu30Var4 = xu30Var2;
                        erl1Var4 = bgc0Var;
                        a8f1Var4 = a8f1Var2;
                    }
                }
                b0kVar3.s();
                lee1 lee1VarA16 = o2h1.a(b0kVar3, 13);
                lee1 lee1Var16 = lee1.d;
                era eraVar16 = een.P0;
                if (p3v.c(f3, Float.NaN)) {
                    f5 = 64.0f;
                } else {
                    f5 = 64.0f;
                }
                int i119 = i11 << 12;
                b0kVar2 = b0kVar3;
                x7f1 x7f1Var18 = x7f1Var2;
                qim0 qim0Var19 = qim0Var3;
                c(qim0Var19, j2iVar, lee1VarA16, lee1Var16, eraVar16, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var18, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i119) | (29360128 & i119) | (i119 & 1879048192), (i11 >> 18) & 126);
                qim0Var2 = qim0Var19;
                vu30Var2 = vu30Var4;
                xu30Var3 = xu30Var4;
                erl1Var3 = erl1Var4;
                a8f1Var3 = a8f1Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                vu30Var2 = vu30Var;
                xu30Var3 = xu30Var2;
                erl1Var3 = erl1Var2;
                a8f1Var3 = a8f1Var2;
            }
            f4 = f3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.ni5
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i11 |= 12582912;
        a8f1Var2 = a8f1Var;
        if ((4793491 & i11) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i11 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    vu30Var3 = l6i.a;
                } else {
                    vu30Var3 = vu30Var;
                }
                if (i4 != 0) {
                    xu30Var2 = l6i.b;
                }
                if (i6 != 0) {
                    f3 = 64.0f;
                }
                if ((i2 & 32) != 0) {
                    bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    i11 &= -458753;
                } else {
                    bgc0Var = erl1Var2;
                }
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    vu30Var4 = vu30Var3;
                    a8f1Var4 = null;
                    xu30Var4 = xu30Var2;
                    erl1Var4 = bgc0Var;
                } else {
                    vu30Var4 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    erl1Var4 = bgc0Var;
                    a8f1Var4 = a8f1Var2;
                }
            } else {
                if (i12 != 0) {
                    vu30Var3 = l6i.a;
                } else {
                    vu30Var3 = vu30Var;
                }
                if (i4 != 0) {
                    xu30Var2 = l6i.b;
                }
                if (i6 != 0) {
                    f3 = 64.0f;
                }
                if ((i2 & 32) != 0) {
                    bgc0Var = new bgc0(zxo1.v(b0kVar3), 15 | 16);
                    i11 &= -458753;
                } else {
                    bgc0Var = erl1Var2;
                }
                qim0Var3 = nim0.a;
                if (i8 != 0) {
                    vu30Var4 = vu30Var3;
                    a8f1Var4 = null;
                    xu30Var4 = xu30Var2;
                    erl1Var4 = bgc0Var;
                } else {
                    vu30Var4 = vu30Var3;
                    xu30Var4 = xu30Var2;
                    erl1Var4 = bgc0Var;
                    a8f1Var4 = a8f1Var2;
                }
            }
            b0kVar3.s();
            lee1 lee1VarA17 = o2h1.a(b0kVar3, 13);
            lee1 lee1Var17 = lee1.d;
            era eraVar17 = een.P0;
            if (p3v.c(f3, Float.NaN)) {
                f5 = 64.0f;
            } else {
                f5 = 64.0f;
            }
            int i1110 = i11 << 12;
            b0kVar2 = b0kVar3;
            x7f1 x7f1Var19 = x7f1Var2;
            qim0 qim0Var110 = qim0Var3;
            c(qim0Var110, j2iVar, lee1VarA17, lee1Var17, eraVar17, vu30Var4, xu30Var4, f5, erl1Var4, x7f1Var19, a8f1Var4, b0kVar2, ((i11 >> 3) & 14) | 224256 | ((i11 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (3670016 & i1110) | (29360128 & i1110) | (i1110 & 1879048192), (i11 >> 18) & 126);
            qim0Var2 = qim0Var110;
            vu30Var2 = vu30Var4;
            xu30Var3 = xu30Var4;
            erl1Var3 = erl1Var4;
            a8f1Var3 = a8f1Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            vu30Var2 = vu30Var;
            xu30Var3 = xu30Var2;
            erl1Var3 = erl1Var2;
            a8f1Var3 = a8f1Var2;
        }
        f4 = f3;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ni5
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ti5.d(j2iVar, qim0Var2, vu30Var2, xu30Var3, f4, erl1Var3, x7f1Var, a8f1Var3, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void e(final qim0 qim0Var, final dr20 dr20Var, final long j, final long j2, final long j3, long j4, final vu30 vu30Var, final lee1 lee1Var, final lee1 lee1Var2, Function0 function0, final g36 g36Var, final era eraVar, final int i, final boolean z, final vu30 vu30Var2, j2i j2iVar, final float f2, b0k b0kVar, final int i2, final int i3) {
        int i4;
        j2i j2iVar2;
        x340 x340Var;
        final long j5;
        Function0 function1;
        Object obj;
        qim0 qim0VarA;
        boolean z2;
        Object obj2 = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(126395868);
        j06 j06Var = x340Var2.a;
        int i5 = i2 | (x340Var2.g(qim0Var) ? 4 : 2) | (x340Var2.g(dr20Var) ? 32 : 16);
        boolean zF = x340Var2.f(j);
        int i6 = SemanticState.Focused;
        int i7 = i5 | (zF ? SemanticState.Hidden : 128);
        boolean zF2 = x340Var2.f(j2);
        int i8 = SemanticState.ReadOnly;
        int i9 = i7 | (zF2 ? SemanticState.Modal : 1024);
        boolean zF3 = x340Var2.f(j3);
        int i10 = SemanticState.Multiline;
        int i11 = i9 | (zF3 ? 16384 : 8192) | (x340Var2.f(j4) ? 131072 : 65536) | (x340Var2.i(vu30Var) ? 1048576 : 524288) | (x340Var2.g(lee1Var) ? 8388608 : 4194304) | (x340Var2.i((Object) null) ? 67108864 : 33554432) | (x340Var2.g(lee1Var2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (x340Var2.i(function0) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (x340Var2.g(eraVar)) {
            i6 = SemanticState.Hidden;
        }
        int i12 = i4 | i6;
        if ((i3 & 3072) == 0) {
            if (x340Var2.e(i)) {
                i8 = SemanticState.Modal;
            }
            i12 |= i8;
        }
        if ((i3 & 24576) == 0) {
            if (x340Var2.h(z)) {
                i10 = 16384;
            }
            i12 |= i10;
        }
        if ((196608 & i3) == 0) {
            i12 |= x340Var2.i(vu30Var2) ? 131072 : 65536;
        }
        int i13 = i12 | (x340Var2.d(f2) ? 8388608 : 4194304);
        if (x340Var2.Y(i11 & 1, ((i11 & 306783379) == 306783378 && (4793491 & i13) == 4793490) ? false : true)) {
            boolean z3 = ((i11 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i13 & 896) == 256) | ((i13 & 7168) == 2048) | ((29360128 & i13) == 8388608);
            Object objT = x340Var2.T();
            if (z3 || objT == obj2) {
                z7f1 z7f1Var = new z7f1(dr20Var, g36Var, eraVar, i, f2);
                x340Var2.s0(z7f1Var);
                objT = z7f1Var;
            }
            z7f1 z7f1Var2 = (z7f1) objT;
            int iK = tgp1.k(x340Var2);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z4 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(z7f1Var2, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var2, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = t3k1.x(qim0Var2, "navigationIcon");
            float f3 = e;
            qim0 qim0VarB = uyn1.B(qim0VarX, f3, 0.0f, 0.0f, 0.0f, 14);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iK2 = tgp1.k(x340Var2);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var2, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            kiv kivVar = wrl.a;
            mod.b(p3d1.o(j, kivVar), vu30Var2, x340Var2, ((i13 >> 12) & ContentType.LONG_FORM_ON_DEMAND) | 8);
            x340Var2.r(true);
            x340Var2.i0(-1359701523);
            qim0 qim0VarZ = uyn1.z(f3, 0.0f, 2, t3k1.x(qim0Var2, "title"));
            if (z) {
                x340Var2.i0(510338172);
                Object objT2 = x340Var2.T();
                obj = obj2;
                if (objT2 == obj) {
                    objT2 = new z9((byte) 22);
                    x340Var2.s0(objT2);
                }
                qim0VarA = s161.a(qim0Var2, (iu30) objT2);
                x340Var2.r(false);
            } else {
                obj = obj2;
                x340Var2.i0(510340109);
                x340Var2.r(false);
                qim0VarA = qim0Var2;
            }
            qim0 qim0VarThen = qim0VarZ.then(qim0VarA);
            boolean z5 = (i13 & 14) == 4;
            Object objT3 = x340Var2.T();
            if (z5 || objT3 == obj) {
                function1 = function0;
                z2 = false;
                objT3 = new ki5(function1, (byte) 0);
                x340Var2.s0(objT3);
            } else {
                function1 = function0;
                z2 = false;
            }
            qim0 qim0VarC = i541.C(qim0VarThen, (iu30) objT3);
            gfh0 gfh0VarC2 = t1c.c(graVar, z2);
            int iK3 = tgp1.k(x340Var2);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarC);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK3))) {
                z5c.f(iK3, x340Var2, iK3, lljVar3);
            }
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            y2o1.h(j2, lee1Var, vu30Var, x340Var2, ((i11 >> 9) & 14) | ((i11 >> 18) & ContentType.LONG_FORM_ON_DEMAND) | ((i11 >> 12) & 896));
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(false);
            qim0 qim0VarB2 = uyn1.B(t3k1.x(qim0Var2, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iK4 = tgp1.k(x340Var);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK4))) {
                z5c.f(iK4, x340Var, iK4, lljVar3);
            }
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j5 = j4;
            j2iVar2 = j2iVar;
            mod.b(kivVar.a(new u7h(j5)), j2iVar2, x340Var, 56);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var = x340Var2;
            j5 = j4;
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            final j2i j2iVar3 = j2iVar2;
            final Function0 function2 = function1;
            h311VarV.d = new vu30(qim0Var, dr20Var, j, j2, j3, j5, vu30Var, lee1Var, lee1Var2, function2, g36Var, eraVar, i, z, vu30Var2, j2iVar3, f2, i2, i3) { // from class: p.li5
                public final /* synthetic */ boolean N0;
                public final /* synthetic */ vu30 O0;
                public final /* synthetic */ j2i P0;
                public final /* synthetic */ float Q0;
                public final /* synthetic */ int R0;
                public final /* synthetic */ g36 X;
                public final /* synthetic */ era Y;
                public final /* synthetic */ int Z;
                public final /* synthetic */ qim0 a;
                public final /* synthetic */ dr20 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ vu30 g;
                public final /* synthetic */ lee1 h;
                public final /* synthetic */ lee1 i;
                public final /* synthetic */ Function0 t;

                {
                    this.R0 = i3;
                }

                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = czo1.p(1);
                    int iP2 = czo1.p(this.R0);
                    ti5.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, (b0k) obj3, iP, iP2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void f(final qim0 qim0Var, final j2i j2iVar, final lee1 lee1Var, final float f2, final j2i j2iVar2, final lee1 lee1Var2, final lee1 lee1Var3, final lee1 lee1Var4, final j2i j2iVar3, final j2i j2iVar4, final float f3, final float f4, final erl1 erl1Var, final x7f1 x7f1Var, final a8f1 a8f1Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        lee1 lee1Var5;
        float f5;
        j2i j2iVar5;
        lee1 lee1Var6;
        int i4;
        j2i j2iVar6;
        float f6;
        era eraVar = een.P0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1092180406);
        if ((i & 6) == 0) {
            i3 = (b0kVar2.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar2.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            lee1Var5 = lee1Var;
            i3 |= b0kVar2.g(lee1Var5) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            lee1Var5 = lee1Var;
        }
        int i5 = i & 3072;
        int i6 = SemanticState.Modal;
        if (i5 == 0) {
            f5 = f2;
            i3 |= b0kVar2.d(f5) ? 2048 : SemanticState.ReadOnly;
        } else {
            f5 = f2;
        }
        int i7 = i & 24576;
        int i8 = SemanticState.Multiline;
        if (i7 == 0) {
            j2iVar5 = j2iVar2;
            i3 |= b0kVar2.i(j2iVar5) ? 16384 : 8192;
        } else {
            j2iVar5 = j2iVar2;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar2.g(lee1Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar2.i((Object) null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar2.g(lee1Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar2.i((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            lee1Var6 = lee1Var4;
            i3 |= b0kVar2.g(lee1Var6) ? 536870912 : 268435456;
        } else {
            lee1Var6 = lee1Var4;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar2.g(eraVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar2.i(j2iVar3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j2iVar6 = j2iVar4;
            i4 |= b0kVar2.i(j2iVar6) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            j2iVar6 = j2iVar4;
        }
        if ((i2 & 3072) == 0) {
            f6 = f3;
            if (!b0kVar2.d(f6)) {
                i6 = SemanticState.ReadOnly;
            }
            i4 |= i6;
        } else {
            f6 = f3;
        }
        if ((i2 & 24576) == 0) {
            if (b0kVar2.d(f4)) {
                i8 = 16384;
            }
            i4 |= i8;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar2.g(erl1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar2.g(x7f1Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar2.g(a8f1Var) ? 8388608 : 4194304;
        }
        if (b0kVar2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ((bys) b0kVar2.k(b)).a(new szg1(qim0Var, j2iVar, lee1Var5, f5, j2iVar5, lee1Var2, lee1Var3, lee1Var6, j2iVar3, j2iVar6, f6, f4, erl1Var, x7f1Var, a8f1Var), b0kVar2, 0);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.ri5
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i | 1);
                    int iP2 = czo1.p(i2);
                    ti5.f(qim0Var, j2iVar, lee1Var, f2, j2iVar2, lee1Var2, lee1Var3, lee1Var4, j2iVar3, j2iVar4, f3, f4, erl1Var, x7f1Var, a8f1Var, (b0k) obj, iP, iP2);
                    return rih1.a;
                }
            };
        }
    }

    public static final b8f1 g(b0k b0kVar) {
        Object[] objArr = new Object[0];
        df41 df41Var = b8f1.d;
        boolean zD = ((x340) b0kVar).d(-3.4028235E38f) | ((x340) b0kVar).d(0.0f) | ((x340) b0kVar).d(0.0f);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zD || objT == fkj0.X) {
            objT = new xh3((byte) 7);
            x340Var.s0(objT);
        }
        return (b8f1) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object h(b8f1 b8f1Var, float f2, e9r e9rVar, fe5 fe5Var, onm onmVar) {
        si5 si5Var;
        m811 m811Var;
        m811 m811Var2;
        if (onmVar instanceof si5) {
            si5Var = (si5) onmVar;
            int i = si5Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                si5Var.e = i - os00.INVALID_ID;
            } else {
                si5Var = new si5(onmVar);
            }
        } else {
            si5Var = new si5(onmVar);
        }
        si5 si5Var2 = si5Var;
        Object obj = si5Var2.d;
        int i2 = si5Var2.e;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                m811 m811Var3 = si5Var2.c;
                fe5Var = si5Var2.b;
                b8f1 b8f1Var2 = (b8f1) si5Var2.a;
                hm5.M(obj);
                m811Var = m811Var3;
                b8f1Var = b8f1Var2;
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m811Var2 = (m811) si5Var2.a;
                hm5.M(obj);
            }
            m811Var = m811Var2;
            return new qui1(j2h1.g(0.0f, m811Var.a));
        }
        hm5.M(obj);
        if (b8f1Var.a() < 0.01f || b8f1Var.a() == 1.0f) {
            return new qui1(0L);
        }
        m811Var = new m811();
        m811Var.a = f2;
        if (e9rVar != null && Math.abs(f2) > 1.0f) {
            m811 m811Var4 = new m811();
            ie5 ie5VarA = prn1.a(28, 0.0f, f2);
            pg pgVar = new pg((Object) m811Var4, (Object) b8f1Var, (Object) m811Var, (byte) 3);
            si5Var2.a = b8f1Var;
            si5Var2.b = fe5Var;
            si5Var2.c = m811Var;
            si5Var2.e = 1;
            if (wwo1.u(ie5VarA, e9rVar, false, pgVar, si5Var2) != d9nVar) {
            }
            return d9nVar;
        }
        return new qui1(j2h1.g(0.0f, m811Var.a));
        if (fe5Var != null) {
            drr0 drr0Var = b8f1Var.c;
            if (drr0Var.s() < 0.0f && drr0Var.s() > b8f1Var.a) {
                ie5 ie5VarA2 = prn1.a(30, drr0Var.s(), 0.0f);
                Float f3 = new Float(b8f1Var.a() < 0.5f ? 0.0f : b8f1Var.a);
                mi5 mi5Var = new mi5(b8f1Var, (byte) 1);
                si5Var2.a = m811Var;
                si5Var2.b = null;
                si5Var2.c = null;
                si5Var2.e = 2;
                if (wwo1.w(ie5VarA2, f3, fe5Var, false, mi5Var, si5Var2, 4) != d9nVar) {
                    m811Var2 = m811Var;
                    m811Var = m811Var2;
                }
                return d9nVar;
            }
        }
        return new qui1(j2h1.g(0.0f, m811Var.a));
    }
}
