package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class eim1 {
    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:112:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b A[PHI: r14
      0x009b: PHI (r14v12 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:58:0x0099, B:68:0x00b1, B:67:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    public static final void a(WidgetState.WrappedStory wrappedStory, whb1 whb1Var, kee1 kee1Var, int i, float f, l6m1 l6m1Var, String str, b0k b0kVar, int i2, int i3) {
        int i4;
        kee1 kee1Var2;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int iOrdinal;
        int i10;
        int i11;
        boolean z;
        l6m1 l6m1Var2;
        kee1 kee1Var3;
        int i12;
        float f3;
        String str2;
        h311 h311VarV;
        kee1 kee1Var4;
        l6m1 l6m1Var3;
        String str3;
        kee1 kee1Var5;
        int i13;
        float f4;
        l6m1 l6m1Var4;
        boolean z2;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1756327473);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(wrappedStory) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(whb1Var) ? 32 : 16;
        }
        int i14 = i2 & 384;
        et40 et40Var = et40.a;
        if (i14 == 0) {
            i4 |= x340Var.i(et40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                kee1Var2 = kee1Var;
                int i15 = x340Var.i(kee1Var2) ? 2048 : 1024;
                i4 |= i15;
            } else {
                kee1Var2 = kee1Var;
            }
            i4 |= i15;
        } else {
            kee1Var2 = kee1Var;
        }
        int i16 = i3 & 16;
        if (i16 == 0) {
            if ((i2 & 24576) == 0) {
                i5 = i;
                i4 |= x340Var.e(i5) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 64;
                i9 = 1572864;
                if (i8 == 0) {
                    i4 |= i9;
                } else if ((1572864 & i2) == 0) {
                    if (l6m1Var == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = l6m1Var.ordinal();
                    }
                    if (x340Var.e(iOrdinal)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (x340Var.g(str)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                if ((i4 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0 || x340Var.E()) {
                        if ((i3 & 8) != 0) {
                            kee1Var4 = fim1.b;
                            i4 &= -7169;
                        } else {
                            kee1Var4 = kee1Var2;
                        }
                        if (i16 != 0) {
                            i5 = 4;
                        }
                        if (i6 != 0) {
                            f2 = 24.0f;
                        }
                        if (i8 != 0) {
                            l6m1Var3 = l6m1.STORY_WIDE_TALL;
                        } else {
                            l6m1Var3 = l6m1Var;
                        }
                        if (i10 != 0) {
                            str3 = "wrapped_story_wide_tall";
                        } else {
                            str3 = str;
                        }
                        kee1Var5 = kee1Var4;
                        i13 = i5;
                        f4 = f2;
                        l6m1Var4 = l6m1Var3;
                    } else {
                        x340Var.b0();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        str3 = str;
                        kee1Var5 = kee1Var2;
                        i13 = i5;
                        f4 = f2;
                        l6m1Var4 = l6m1Var;
                    }
                    x340Var.s();
                    float fB = s3v.b(((s3v) x340Var.k(p4k.a)).a) - 48.0f;
                    gt40 gt40VarL = d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var);
                    z2 = (i4 & 29360128) == 8388608;
                    objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new zhm1(str3);
                        x340Var.s0(objT);
                    }
                    j2h1.b(iko1.x(gt40VarL, (iu30) objT), (ql3) null, apo.r(-1004441935, new cim1(l6m1Var4, wrappedStory, fB, kee1Var5, i13, f4), x340Var), x340Var, 384, 2);
                    str2 = str3;
                    l6m1Var2 = l6m1Var4;
                    kee1Var3 = kee1Var5;
                    i12 = i13;
                    f3 = f4;
                } else {
                    x340Var.b0();
                    l6m1Var2 = l6m1Var;
                    kee1Var3 = kee1Var2;
                    i12 = i5;
                    f3 = f2;
                    str2 = str;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new dim1(wrappedStory, whb1Var, kee1Var3, i12, f3, l6m1Var2, str2, i2, i3);
                }
            }
            i4 |= 196608;
            f2 = f;
            i8 = i3 & 64;
            i9 = 1572864;
            if (i8 == 0) {
                i4 |= i9;
            } else if ((1572864 & i2) == 0) {
                if (l6m1Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = l6m1Var.ordinal();
                }
                if (x340Var.e(iOrdinal)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            i10 = i3 & 128;
            if (i10 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (x340Var.g(str)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            if ((i4 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 8) != 0) {
                        kee1Var4 = fim1.b;
                        i4 &= -7169;
                    } else {
                        kee1Var4 = kee1Var2;
                    }
                    if (i16 != 0) {
                        i5 = 4;
                    }
                    if (i6 != 0) {
                        f2 = 24.0f;
                    }
                    if (i8 != 0) {
                        l6m1Var3 = l6m1.STORY_WIDE_TALL;
                    } else {
                        l6m1Var3 = l6m1Var;
                    }
                    if (i10 != 0) {
                        str3 = "wrapped_story_wide_tall";
                    } else {
                        str3 = str;
                    }
                    kee1Var5 = kee1Var4;
                    i13 = i5;
                    f4 = f2;
                    l6m1Var4 = l6m1Var3;
                } else {
                    if ((i3 & 8) != 0) {
                        kee1Var4 = fim1.b;
                        i4 &= -7169;
                    } else {
                        kee1Var4 = kee1Var2;
                    }
                    if (i16 != 0) {
                        i5 = 4;
                    }
                    if (i6 != 0) {
                        f2 = 24.0f;
                    }
                    if (i8 != 0) {
                        l6m1Var3 = l6m1.STORY_WIDE_TALL;
                    } else {
                        l6m1Var3 = l6m1Var;
                    }
                    if (i10 != 0) {
                        str3 = "wrapped_story_wide_tall";
                    } else {
                        str3 = str;
                    }
                    kee1Var5 = kee1Var4;
                    i13 = i5;
                    f4 = f2;
                    l6m1Var4 = l6m1Var3;
                }
                x340Var.s();
                float fB2 = s3v.b(((s3v) x340Var.k(p4k.a)).a) - 48.0f;
                gt40 gt40VarL2 = d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var);
                if ((i4 & 29360128) == 8388608) {
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new zhm1(str3);
                    x340Var.s0(objT);
                } else {
                    objT = new zhm1(str3);
                    x340Var.s0(objT);
                }
                j2h1.b(iko1.x(gt40VarL2, (iu30) objT), (ql3) null, apo.r(-1004441935, new cim1(l6m1Var4, wrappedStory, fB2, kee1Var5, i13, f4), x340Var), x340Var, 384, 2);
                str2 = str3;
                l6m1Var2 = l6m1Var4;
                kee1Var3 = kee1Var5;
                i12 = i13;
                f3 = f4;
            } else {
                x340Var.b0();
                l6m1Var2 = l6m1Var;
                kee1Var3 = kee1Var2;
                i12 = i5;
                f3 = f2;
                str2 = str;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dim1(wrappedStory, whb1Var, kee1Var3, i12, f3, l6m1Var2, str2, i2, i3);
            }
        }
        i4 |= 24576;
        i5 = i;
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i2) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            i8 = i3 & 64;
            i9 = 1572864;
            if (i8 == 0) {
                i4 |= i9;
            } else if ((1572864 & i2) == 0) {
                if (l6m1Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = l6m1Var.ordinal();
                }
                if (x340Var.e(iOrdinal)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            i10 = i3 & 128;
            if (i10 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (x340Var.g(str)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            if ((i4 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 8) != 0) {
                        kee1Var4 = fim1.b;
                        i4 &= -7169;
                    } else {
                        kee1Var4 = kee1Var2;
                    }
                    if (i16 != 0) {
                        i5 = 4;
                    }
                    if (i6 != 0) {
                        f2 = 24.0f;
                    }
                    if (i8 != 0) {
                        l6m1Var3 = l6m1.STORY_WIDE_TALL;
                    } else {
                        l6m1Var3 = l6m1Var;
                    }
                    if (i10 != 0) {
                        str3 = "wrapped_story_wide_tall";
                    } else {
                        str3 = str;
                    }
                    kee1Var5 = kee1Var4;
                    i13 = i5;
                    f4 = f2;
                    l6m1Var4 = l6m1Var3;
                } else {
                    if ((i3 & 8) != 0) {
                        kee1Var4 = fim1.b;
                        i4 &= -7169;
                    } else {
                        kee1Var4 = kee1Var2;
                    }
                    if (i16 != 0) {
                        i5 = 4;
                    }
                    if (i6 != 0) {
                        f2 = 24.0f;
                    }
                    if (i8 != 0) {
                        l6m1Var3 = l6m1.STORY_WIDE_TALL;
                    } else {
                        l6m1Var3 = l6m1Var;
                    }
                    if (i10 != 0) {
                        str3 = "wrapped_story_wide_tall";
                    } else {
                        str3 = str;
                    }
                    kee1Var5 = kee1Var4;
                    i13 = i5;
                    f4 = f2;
                    l6m1Var4 = l6m1Var3;
                }
                x340Var.s();
                float fB3 = s3v.b(((s3v) x340Var.k(p4k.a)).a) - 48.0f;
                gt40 gt40VarL3 = d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var);
                if ((i4 & 29360128) == 8388608) {
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new zhm1(str3);
                    x340Var.s0(objT);
                } else {
                    objT = new zhm1(str3);
                    x340Var.s0(objT);
                }
                j2h1.b(iko1.x(gt40VarL3, (iu30) objT), (ql3) null, apo.r(-1004441935, new cim1(l6m1Var4, wrappedStory, fB3, kee1Var5, i13, f4), x340Var), x340Var, 384, 2);
                str2 = str3;
                l6m1Var2 = l6m1Var4;
                kee1Var3 = kee1Var5;
                i12 = i13;
                f3 = f4;
            } else {
                x340Var.b0();
                l6m1Var2 = l6m1Var;
                kee1Var3 = kee1Var2;
                i12 = i5;
                f3 = f2;
                str2 = str;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dim1(wrappedStory, whb1Var, kee1Var3, i12, f3, l6m1Var2, str2, i2, i3);
            }
        }
        i4 |= 196608;
        f2 = f;
        i8 = i3 & 64;
        i9 = 1572864;
        if (i8 == 0) {
            i4 |= i9;
        } else if ((1572864 & i2) == 0) {
            if (l6m1Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = l6m1Var.ordinal();
            }
            if (x340Var.e(iOrdinal)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        i10 = i3 & 128;
        if (i10 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (x340Var.g(str)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i4 |= i11;
        }
        if ((i4 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if ((i3 & 8) != 0) {
                    kee1Var4 = fim1.b;
                    i4 &= -7169;
                } else {
                    kee1Var4 = kee1Var2;
                }
                if (i16 != 0) {
                    i5 = 4;
                }
                if (i6 != 0) {
                    f2 = 24.0f;
                }
                if (i8 != 0) {
                    l6m1Var3 = l6m1.STORY_WIDE_TALL;
                } else {
                    l6m1Var3 = l6m1Var;
                }
                if (i10 != 0) {
                    str3 = "wrapped_story_wide_tall";
                } else {
                    str3 = str;
                }
                kee1Var5 = kee1Var4;
                i13 = i5;
                f4 = f2;
                l6m1Var4 = l6m1Var3;
            } else {
                if ((i3 & 8) != 0) {
                    kee1Var4 = fim1.b;
                    i4 &= -7169;
                } else {
                    kee1Var4 = kee1Var2;
                }
                if (i16 != 0) {
                    i5 = 4;
                }
                if (i6 != 0) {
                    f2 = 24.0f;
                }
                if (i8 != 0) {
                    l6m1Var3 = l6m1.STORY_WIDE_TALL;
                } else {
                    l6m1Var3 = l6m1Var;
                }
                if (i10 != 0) {
                    str3 = "wrapped_story_wide_tall";
                } else {
                    str3 = str;
                }
                kee1Var5 = kee1Var4;
                i13 = i5;
                f4 = f2;
                l6m1Var4 = l6m1Var3;
            }
            x340Var.s();
            float fB4 = s3v.b(((s3v) x340Var.k(p4k.a)).a) - 48.0f;
            gt40 gt40VarL4 = d9y0.l(ila0.l(dm5.I(et40Var), abh.a), whb1Var);
            if ((i4 & 29360128) == 8388608) {
            }
            objT = x340Var.T();
            if (z2) {
                objT = new zhm1(str3);
                x340Var.s0(objT);
            } else {
                objT = new zhm1(str3);
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40VarL4, (iu30) objT), (ql3) null, apo.r(-1004441935, new cim1(l6m1Var4, wrappedStory, fB4, kee1Var5, i13, f4), x340Var), x340Var, 384, 2);
            str2 = str3;
            l6m1Var2 = l6m1Var4;
            kee1Var3 = kee1Var5;
            i12 = i13;
            f3 = f4;
        } else {
            x340Var.b0();
            l6m1Var2 = l6m1Var;
            kee1Var3 = kee1Var2;
            i12 = i5;
            f3 = f2;
            str2 = str;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dim1(wrappedStory, whb1Var, kee1Var3, i12, f3, l6m1Var2, str2, i2, i3);
        }
    }

    public static final boolean b(WidgetState.WrappedStory wrappedStory, kee1 kee1Var, int i, float f, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1620804809);
        Context context = (Context) x340Var.k(p4k.b);
        long j = ((s3v) x340Var.k(p4k.a)).a;
        float fA = s3v.a(j) - ((p3v) x340Var.k(s4k.a)).a;
        float fB = s3v.b(j) - 48.0f;
        if (p3v.b(y9g1.l(0.0f, 8, context, wrappedStory.getButtonText(), fim1.g), fB) > 0) {
            x340Var.r(false);
            return false;
        }
        String subtitle = wrappedStory.getSubtitle();
        long jC = jhc1.c(fB, Float.POSITIVE_INFINITY);
        kee1 kee1Var2 = fim1.e;
        if (!ph5.m(context, subtitle, jC, kee1Var2, 2, false)) {
            x340Var.r(false);
            return false;
        }
        boolean zM = ph5.m(context, wrappedStory.getTitle(), jhc1.c(fB, fA - ((((f + 48.0f) + ph5.J(fB, 2, context, wrappedStory.getSubtitle(), kee1Var2)) + 48.0f) + 24.0f)), kee1Var, i, false);
        x340Var.r(false);
        return zM;
    }
}
