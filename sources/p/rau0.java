package p;

import android.content.Context;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class rau0 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(WidgetState.LeftButtonConfiguration leftButtonConfiguration, iko ikoVar, CurrentTrackMetadata currentTrackMetadata, boolean z, long j, float f, float f2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-44699009);
        int i2 = i | (x340Var.i(leftButtonConfiguration) ? 4 : 2) | (x340Var.e(ikoVar.ordinal()) ? 32 : 16) | (x340Var.i(currentTrackMetadata) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.f(j) ? 16384 : 8192) | (x340Var.d(f) ? 131072 : 65536) | (x340Var.d(f2) ? 1048576 : 524288);
        if (!x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.b0();
        } else if (leftButtonConfiguration instanceof WidgetState.LeftButtonConfiguration.Save) {
            x340Var.i0(-6064695);
            int i3 = (i2 >> 3) & 126;
            int i4 = i2 >> 6;
            f(ikoVar, currentTrackMetadata, j, f, f2, x340Var, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            x340Var.r(false);
        } else {
            if (!(leftButtonConfiguration instanceof WidgetState.LeftButtonConfiguration.Previous)) {
                throw p3d1.k(x340Var, -6066840, false);
            }
            x340Var.i0(-6056583);
            d(((WidgetState.LeftButtonConfiguration.Previous) leftButtonConfiguration).isDisabled(), z, j, f, f2, x340Var, (i2 >> 6) & 65520);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x9u0(leftButtonConfiguration, ikoVar, currentTrackMetadata, z, j, f, f2, i);
        }
    }

    public static final void b(WidgetState.PlayPauseState playPauseState, long j, float f, float f2, String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(546487040);
        int i2 = i | (b0kVar3.e(playPauseState.ordinal()) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.d(f) ? 256 : 128) | (b0kVar3.d(f2) ? 2048 : 1024) | (b0kVar3.g(str) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            cz31 cz31VarI = i(playPauseState, (String) b0kVar3.k(wol1.b), (String) b0kVar3.k(wol1.c), (String) b0kVar3.k(wol1.a), str);
            boolean z = playPauseState == WidgetState.PlayPauseState.PLAY || playPauseState == WidgetState.PlayPauseState.PAUSE;
            int iH = h(playPauseState);
            String strG = g((Context) b0kVar3.k(p4k.b), playPauseState);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = y9u0.a;
                b0kVar3.s0(objT);
            }
            gt40 gt40VarX = iko1.x(et40.a, (iu30) objT);
            int i3 = i2 & 112;
            int i4 = i2 << 15;
            b0kVar2 = b0kVar3;
            czo1.c(iH, j, strG, cz31VarI, gt40VarX, 0L, z, f, f2, 0, b0kVar2, i3 | (29360128 & i4) | (i4 & 234881024), 544);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new z9u0(playPauseState, j, f, f2, str, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:104:0x016a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0182  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0201  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x0158  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    public static final void c(WidgetState.ActiveSession activeSession, boolean z, float f, gt40 gt40Var, float f2, float f3, float f4, float f5, float f6, b0k b0kVar, int i, int i2) {
        gt40 gt40Var2;
        int i3;
        float f7;
        int i4;
        float f8;
        int i5;
        int i6;
        int i7;
        float f9;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        float f10;
        float f11;
        float f12;
        float f13;
        gt40 gt40Var3;
        float f14;
        h311 h311VarV;
        int i14;
        gt40 gt40Var4;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z3;
        boolean z4;
        boolean z5;
        j2i j2iVarR;
        j2i j2iVarR2;
        j2i j2iVar;
        boolean z6;
        boolean z7;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(898125162);
        int i15 = i | (x340Var.i(activeSession) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.d(f) ? 256 : 128);
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 = i15 | 3072;
            gt40Var2 = gt40Var;
        } else {
            gt40Var2 = gt40Var;
            i3 = i15 | (x340Var.i(gt40Var2) ? 2048 : 1024);
        }
        int i17 = i2 & 16;
        if (i17 != 0) {
            i4 = i3 | 24576;
            f7 = f2;
        } else {
            f7 = f2;
            i4 = i3 | (x340Var.d(f7) ? 16384 : 8192);
        }
        int i18 = i2 & 32;
        if (i18 == 0) {
            if ((i & 196608) == 0) {
                f8 = f3;
                i4 |= x340Var.d(f8) ? 131072 : 65536;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((i & 1572864) == 0) {
                    if (x340Var.d(f4)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i9 = i4 | 12582912;
                    f9 = f5;
                } else {
                    f9 = f5;
                    if (x340Var.d(f9)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i9 = i4 | i8;
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                    i12 = i9 | 100663296;
                } else {
                    if (x340Var.d(f6)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i12 = i9 | i11;
                }
                i13 = i12 | 268435456;
                if ((i13 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i13 & 1, z2)) {
                    x340Var.d0();
                    i14 = i & 1;
                    gt40Var4 = et40.a;
                    if (i14 != 0 || x340Var.E()) {
                        if (i16 != 0) {
                            gt40Var2 = gt40Var4;
                        }
                        if (i17 != 0) {
                            f7 = 156.0f;
                        }
                        if (i18 != 0) {
                            f8 = 48.0f;
                        }
                        float f19 = i5 == 0 ? f4 : 48.0f;
                        if (i7 != 0) {
                            f9 = 8.0f;
                        }
                        if (i10 != 0) {
                            f15 = 4.0f;
                        } else {
                            f15 = f6;
                        }
                        f16 = f19;
                        f17 = f15;
                    } else {
                        x340Var.b0();
                        f16 = f4;
                        f17 = f6;
                    }
                    x340Var.s();
                    long jP = z5p1.p(zah.a, activeSession.getMetadata().getExtractedColor());
                    f18 = zjy.p(0.0f, new p3v(Math.min(f, f7))).a;
                    if (p3v.b(f18, 96.0f) < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 || p3v.b(f18, 144.0f) < 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    z5 = ((Context) x340Var.k(p4k.b)).getResources().getConfiguration().getLayoutDirection() == 0;
                    float f20 = f8;
                    float f21 = f9;
                    j2iVarR = apo.r(-1151275907, new eau0(activeSession, z, jP, f20, f21), x340Var);
                    j2iVarR2 = apo.r(301465120, new fau0(activeSession, z, jP, f20, f21), x340Var);
                    if (z5) {
                        j2iVar2 = j2iVarR2;
                        z7 = !z3;
                        z6 = z4;
                        j2iVar = j2iVarR;
                    } else {
                        j2iVar = j2iVarR2;
                        z6 = !z3;
                        z7 = z4;
                        j2iVar2 = j2iVarR;
                    }
                    j2h1.b(dm5.h0(gt40Var2, f18), (ql3) null, apo.r(1635379144, new cau0(gt40Var4, z6, z7, j2iVar, activeSession, jP, f16, f17, j2iVar2), x340Var), x340Var, 384, 2);
                    f12 = f7;
                    f10 = f16;
                    f11 = f17;
                    f13 = f21;
                } else {
                    x340Var.b0();
                    f10 = f4;
                    f11 = f6;
                    f12 = f7;
                    f13 = f9;
                }
                gt40Var3 = gt40Var2;
                f14 = f8;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new dau0(activeSession, z, f, gt40Var3, f12, f14, f10, f13, f11, i, i2);
                }
            }
            i4 |= 1572864;
            i7 = i2 & 128;
            if (i7 != 0) {
                i9 = i4 | 12582912;
                f9 = f5;
            } else {
                f9 = f5;
                if (x340Var.d(f9)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i9 = i4 | i8;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                i12 = i9 | 100663296;
            } else {
                if (x340Var.d(f6)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i12 = i9 | i11;
            }
            i13 = i12 | 268435456;
            if ((i13 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i13 & 1, z2)) {
                x340Var.d0();
                i14 = i & 1;
                gt40Var4 = et40.a;
                if (i14 != 0) {
                    if (i16 != 0) {
                        gt40Var2 = gt40Var4;
                    }
                    if (i17 != 0) {
                        f7 = 156.0f;
                    }
                    if (i18 != 0) {
                        f8 = 48.0f;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        f9 = 8.0f;
                    }
                    if (i10 != 0) {
                        f15 = 4.0f;
                    } else {
                        f15 = f6;
                    }
                    f16 = f19;
                    f17 = f15;
                } else {
                    if (i16 != 0) {
                        gt40Var2 = gt40Var4;
                    }
                    if (i17 != 0) {
                        f7 = 156.0f;
                    }
                    if (i18 != 0) {
                        f8 = 48.0f;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        f9 = 8.0f;
                    }
                    if (i10 != 0) {
                        f15 = 4.0f;
                    } else {
                        f15 = f6;
                    }
                    f16 = f19;
                    f17 = f15;
                }
                x340Var.s();
                long jP2 = z5p1.p(zah.a, activeSession.getMetadata().getExtractedColor());
                f18 = zjy.p(0.0f, new p3v(Math.min(f, f7))).a;
                if (p3v.b(f18, 96.0f) < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (((Context) x340Var.k(p4k.b)).getResources().getConfiguration().getLayoutDirection() == 0) {
                }
                float f22 = f8;
                float f23 = f9;
                j2iVarR = apo.r(-1151275907, new eau0(activeSession, z, jP2, f22, f23), x340Var);
                j2iVarR2 = apo.r(301465120, new fau0(activeSession, z, jP2, f22, f23), x340Var);
                if (z5) {
                    j2iVar2 = j2iVarR2;
                    z7 = !z3;
                    z6 = z4;
                    j2iVar = j2iVarR;
                } else {
                    j2iVar = j2iVarR2;
                    z6 = !z3;
                    z7 = z4;
                    j2iVar2 = j2iVarR;
                }
                j2h1.b(dm5.h0(gt40Var2, f18), (ql3) null, apo.r(1635379144, new cau0(gt40Var4, z6, z7, j2iVar, activeSession, jP2, f16, f17, j2iVar2), x340Var), x340Var, 384, 2);
                f12 = f7;
                f10 = f16;
                f11 = f17;
                f13 = f23;
            } else {
                x340Var.b0();
                f10 = f4;
                f11 = f6;
                f12 = f7;
                f13 = f9;
            }
            gt40Var3 = gt40Var2;
            f14 = f8;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dau0(activeSession, z, f, gt40Var3, f12, f14, f10, f13, f11, i, i2);
            }
        }
        i4 |= 196608;
        f8 = f3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((i & 1572864) == 0) {
                if (x340Var.d(f4)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                i9 = i4 | 12582912;
                f9 = f5;
            } else {
                f9 = f5;
                if (x340Var.d(f9)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i9 = i4 | i8;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                i12 = i9 | 100663296;
            } else {
                if (x340Var.d(f6)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i12 = i9 | i11;
            }
            i13 = i12 | 268435456;
            if ((i13 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i13 & 1, z2)) {
                x340Var.d0();
                i14 = i & 1;
                gt40Var4 = et40.a;
                if (i14 != 0) {
                    if (i16 != 0) {
                        gt40Var2 = gt40Var4;
                    }
                    if (i17 != 0) {
                        f7 = 156.0f;
                    }
                    if (i18 != 0) {
                        f8 = 48.0f;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        f9 = 8.0f;
                    }
                    if (i10 != 0) {
                        f15 = 4.0f;
                    } else {
                        f15 = f6;
                    }
                    f16 = f19;
                    f17 = f15;
                } else {
                    if (i16 != 0) {
                        gt40Var2 = gt40Var4;
                    }
                    if (i17 != 0) {
                        f7 = 156.0f;
                    }
                    if (i18 != 0) {
                        f8 = 48.0f;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        f9 = 8.0f;
                    }
                    if (i10 != 0) {
                        f15 = 4.0f;
                    } else {
                        f15 = f6;
                    }
                    f16 = f19;
                    f17 = f15;
                }
                x340Var.s();
                long jP3 = z5p1.p(zah.a, activeSession.getMetadata().getExtractedColor());
                f18 = zjy.p(0.0f, new p3v(Math.min(f, f7))).a;
                if (p3v.b(f18, 96.0f) < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (((Context) x340Var.k(p4k.b)).getResources().getConfiguration().getLayoutDirection() == 0) {
                }
                float f24 = f8;
                float f25 = f9;
                j2iVarR = apo.r(-1151275907, new eau0(activeSession, z, jP3, f24, f25), x340Var);
                j2iVarR2 = apo.r(301465120, new fau0(activeSession, z, jP3, f24, f25), x340Var);
                if (z5) {
                    j2iVar2 = j2iVarR2;
                    z7 = !z3;
                    z6 = z4;
                    j2iVar = j2iVarR;
                } else {
                    j2iVar = j2iVarR2;
                    z6 = !z3;
                    z7 = z4;
                    j2iVar2 = j2iVarR;
                }
                j2h1.b(dm5.h0(gt40Var2, f18), (ql3) null, apo.r(1635379144, new cau0(gt40Var4, z6, z7, j2iVar, activeSession, jP3, f16, f17, j2iVar2), x340Var), x340Var, 384, 2);
                f12 = f7;
                f10 = f16;
                f11 = f17;
                f13 = f25;
            } else {
                x340Var.b0();
                f10 = f4;
                f11 = f6;
                f12 = f7;
                f13 = f9;
            }
            gt40Var3 = gt40Var2;
            f14 = f8;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dau0(activeSession, z, f, gt40Var3, f12, f14, f10, f13, f11, i, i2);
            }
        }
        i4 |= 1572864;
        i7 = i2 & 128;
        if (i7 != 0) {
            i9 = i4 | 12582912;
            f9 = f5;
        } else {
            f9 = f5;
            if (x340Var.d(f9)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i9 = i4 | i8;
        }
        i10 = i2 & 256;
        if (i10 != 0) {
            i12 = i9 | 100663296;
        } else {
            if (x340Var.d(f6)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i12 = i9 | i11;
        }
        i13 = i12 | 268435456;
        if ((i13 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i13 & 1, z2)) {
            x340Var.d0();
            i14 = i & 1;
            gt40Var4 = et40.a;
            if (i14 != 0) {
                if (i16 != 0) {
                    gt40Var2 = gt40Var4;
                }
                if (i17 != 0) {
                    f7 = 156.0f;
                }
                if (i18 != 0) {
                    f8 = 48.0f;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    f9 = 8.0f;
                }
                if (i10 != 0) {
                    f15 = 4.0f;
                } else {
                    f15 = f6;
                }
                f16 = f19;
                f17 = f15;
            } else {
                if (i16 != 0) {
                    gt40Var2 = gt40Var4;
                }
                if (i17 != 0) {
                    f7 = 156.0f;
                }
                if (i18 != 0) {
                    f8 = 48.0f;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    f9 = 8.0f;
                }
                if (i10 != 0) {
                    f15 = 4.0f;
                } else {
                    f15 = f6;
                }
                f16 = f19;
                f17 = f15;
            }
            x340Var.s();
            long jP4 = z5p1.p(zah.a, activeSession.getMetadata().getExtractedColor());
            f18 = zjy.p(0.0f, new p3v(Math.min(f, f7))).a;
            if (p3v.b(f18, 96.0f) < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (((Context) x340Var.k(p4k.b)).getResources().getConfiguration().getLayoutDirection() == 0) {
            }
            float f26 = f8;
            float f27 = f9;
            j2iVarR = apo.r(-1151275907, new eau0(activeSession, z, jP4, f26, f27), x340Var);
            j2iVarR2 = apo.r(301465120, new fau0(activeSession, z, jP4, f26, f27), x340Var);
            if (z5) {
                j2iVar2 = j2iVarR2;
                z7 = !z3;
                z6 = z4;
                j2iVar = j2iVarR;
            } else {
                j2iVar = j2iVarR2;
                z6 = !z3;
                z7 = z4;
                j2iVar2 = j2iVarR;
            }
            j2h1.b(dm5.h0(gt40Var2, f18), (ql3) null, apo.r(1635379144, new cau0(gt40Var4, z6, z7, j2iVar, activeSession, jP4, f16, f17, j2iVar2), x340Var), x340Var, 384, 2);
            f12 = f7;
            f10 = f16;
            f11 = f17;
            f13 = f27;
        } else {
            x340Var.b0();
            f10 = f4;
            f11 = f6;
            f12 = f7;
            f13 = f9;
        }
        gt40Var3 = gt40Var2;
        f14 = f8;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dau0(activeSession, z, f, gt40Var3, f12, f14, f10, f13, f11, i, i2);
        }
    }

    public static final void d(boolean z, boolean z2, long j, float f, float f2, b0k b0kVar, int i) {
        int i2;
        float f3;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-221010411);
        if ((i & 6) == 0) {
            i2 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f3 = f2;
            i2 |= x340Var2.d(f3) ? 16384 : 8192;
        } else {
            f3 = f2;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) x340Var2.k(p4k.b);
            String str = (String) x340Var2.k(wol1.a);
            String str2 = (String) x340Var2.k(wol1.b);
            String str3 = (String) x340Var2.k(wol1.c);
            boolean z3 = !z;
            et40 et40Var = et40.a;
            x60 x60Var = apl1.a;
            int i3 = i2;
            x60 x60Var2 = apl1.b;
            if (z2) {
                x340Var2.i0(64108802);
                String string = !z ? context.getString(2131959295) : context.getString(2131959289, context.getString(2131959295));
                string.getClass();
                boolean zG = x340Var2.g(str2) | x340Var2.g(str3);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new hau0(str2, str3);
                    x340Var2.s0(objT);
                }
                cz31 cz31Var = new cz31(w0h1.A(new y60[]{new y60(x60Var2, (WidgetInteraction) ((Function0) objT).invoke()), new y60(x60Var, str)}));
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = hxt0.P0;
                    x340Var2.s0(objT2);
                }
                gt40 gt40VarX = iko1.x(et40Var, (iu30) objT2);
                int i4 = i3 << 12;
                czo1.c(2131231062, j, string, cz31Var, gt40VarX, 0L, z3, f, f3, 4, x340Var2, ((i3 >> 3) & 112) | 805306368 | (i4 & 29360128) | (i4 & 234881024), 32);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(65077459);
                String string2 = !z ? context.getString(2131959294) : context.getString(2131959289, context.getString(2131959294));
                string2.getClass();
                boolean zG2 = x340Var.g(str2) | x340Var.g(str3);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new iau0(str2, str3);
                    x340Var.s0(objT3);
                }
                cz31 cz31Var2 = new cz31(w0h1.A(new y60[]{new y60(x60Var2, (WidgetInteraction) ((Function0) objT3).invoke()), new y60(x60Var, str)}));
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = hxt0.Q0;
                    x340Var.s0(objT4);
                }
                gt40 gt40VarX2 = iko1.x(et40Var, (iu30) objT4);
                int i5 = i3 << 12;
                czo1.c(2131231064, j, string2, cz31Var2, gt40VarX2, 0L, z3, f, f2, 4, x340Var, ((i3 >> 3) & 112) | 805306368 | (i5 & 29360128) | (i5 & 234881024), 32);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gau0(f, f2, i, j, z, z2);
        }
    }

    public static final void e(boolean z, boolean z2, long j, float f, float f2, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1742086174);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.d(f2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) x340Var.k(p4k.b);
            String str = (String) x340Var.k(wol1.a);
            String str2 = (String) x340Var.k(wol1.b);
            String str3 = (String) x340Var.k(wol1.c);
            et40 et40Var = et40.a;
            x60 x60Var = apl1.a;
            x60 x60Var2 = apl1.b;
            if (z2) {
                x340Var.i0(-1895230854);
                String string = z ? context.getString(2131959296) : context.getString(2131959289, context.getString(2131959296));
                string.getClass();
                boolean zG = x340Var.g(str2) | x340Var.g(str3);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new kau0(str2, str3);
                    x340Var.s0(objT);
                }
                cz31 cz31Var = new cz31(w0h1.A(new y60[]{new y60(x60Var2, (WidgetInteraction) ((Function0) objT).invoke()), new y60(x60Var, str)}));
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = hxt0.R0;
                    x340Var.s0(objT2);
                }
                gt40 gt40VarX = iko1.x(et40Var, (iu30) objT2);
                int i3 = i2 << 12;
                czo1.c(2131231066, j, string, cz31Var, gt40VarX, 0L, z, f, f2, 5, x340Var, ((i2 >> 3) & 112) | 805306368 | ((i2 << 18) & 3670016) | (i3 & 29360128) | (i3 & 234881024), 32);
                x340Var.r(false);
            } else {
                x340Var.i0(-1894263468);
                String string2 = z ? context.getString(2131959290) : context.getString(2131959289, context.getString(2131959290));
                string2.getClass();
                boolean zG2 = x340Var.g(str2) | x340Var.g(str3);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new lau0(str2, str3);
                    x340Var.s0(objT3);
                }
                cz31 cz31Var2 = new cz31(w0h1.A(new y60[]{new y60(x60Var2, (WidgetInteraction) ((Function0) objT3).invoke()), new y60(x60Var, str)}));
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = hxt0.S0;
                    x340Var.s0(objT4);
                }
                gt40 gt40VarX2 = iko1.x(et40Var, (iu30) objT4);
                int i4 = i2 << 12;
                czo1.c(2131231068, j, string2, cz31Var2, gt40VarX2, 0L, z, f, f2, 5, x340Var, ((i2 >> 3) & 112) | 805306368 | ((i2 << 18) & 3670016) | (i4 & 29360128) | (i4 & 234881024), 32);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jau0(f, f2, i, j, z, z2);
        }
    }

    public static final void f(iko ikoVar, CurrentTrackMetadata currentTrackMetadata, long j, float f, float f2, b0k b0kVar, int i) {
        int i2;
        float f3;
        b0k b0kVar2;
        int i3;
        String string;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1741245560);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(ikoVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(currentTrackMetadata) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f3 = f2;
            i2 |= b0kVar3.d(f3) ? 16384 : 8192;
        } else {
            f3 = f2;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) b0kVar3.k(p4k.b);
            String str = (String) b0kVar3.k(wol1.a);
            boolean z = ikoVar != iko.c;
            int iOrdinal = ikoVar.ordinal();
            if (iOrdinal == 0) {
                i3 = 2131231571;
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    eg.o();
                    return;
                }
                i3 = 2131232433;
            }
            int iOrdinal2 = ikoVar.ordinal();
            if (iOrdinal2 == 0) {
                string = context.getString(2131959282);
            } else if (iOrdinal2 == 1) {
                string = context.getString(2131959281);
            } else {
                if (iOrdinal2 != 2) {
                    eg.o();
                    return;
                }
                string = context.getString(2131959280);
            }
            string.getClass();
            String str2 = (String) b0kVar3.k(wol1.b);
            String str3 = (String) b0kVar3.k(wol1.c);
            int i4 = i2;
            boolean zG = b0kVar3.g(str2) | b0kVar3.g(str3) | b0kVar3.i(currentTrackMetadata) | ((i2 & 14) == 4);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new nau0(str2, str3, currentTrackMetadata, ikoVar);
                b0kVar3.s0(objT);
            }
            cz31 cz31Var = new cz31(w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) ((Function0) objT).invoke()), new y60(apl1.a, str)}));
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = hxt0.T0;
                b0kVar3.s0(objT2);
            }
            gt40 gt40VarX = iko1.x(et40.a, (iu30) objT2);
            int i5 = i4 << 12;
            int i6 = ((i4 >> 3) & 112) | 805306368 | (29360128 & i5) | (i5 & 234881024);
            b0kVar2 = b0kVar3;
            czo1.c(i3, j, string, cz31Var, gt40VarX, 0L, z, f, f3, 4, b0kVar2, i6, 32);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mau0(ikoVar, currentTrackMetadata, j, f, f2, i);
        }
    }

    public static final String g(Context context, WidgetState.PlayPauseState playPauseState) {
        int i = oau0.a[playPauseState.ordinal()];
        if (i == 1) {
            return context.getString(2131959292);
        }
        if (i == 2) {
            return context.getString(2131959291);
        }
        if (i == 3) {
            String string = context.getString(2131959289, context.getString(2131959292));
            string.getClass();
            return string;
        }
        if (i != 4) {
            eg.o();
            return null;
        }
        String string2 = context.getString(2131959289, context.getString(2131959291));
        string2.getClass();
        return string2;
    }

    public static final int h(WidgetState.PlayPauseState playPauseState) {
        int i = oau0.a[playPauseState.ordinal()];
        if (i == 1) {
            return 2131231056;
        }
        if (i == 2) {
            return 2131231054;
        }
        if (i == 3) {
            return 2131232320;
        }
        if (i == 4) {
            return 2131232293;
        }
        eg.o();
        return 0;
    }

    public static final cz31 i(WidgetState.PlayPauseState playPauseState, String str, String str2, String str3, String str4) {
        return new cz31(w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) new qau0(playPauseState, str, str2, str4).invoke()), new y60(apl1.a, str3)}));
    }
}
