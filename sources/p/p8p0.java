package p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class p8p0 {
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(WidgetState.ActiveSession activeSession, gt40 gt40Var, float f, int i, kee1 kee1Var, kee1 kee1Var2, b0k b0kVar, int i2, int i3) {
        kee1 kee1Var3;
        kee1 kee1Var4;
        int i4;
        boolean z;
        kee1 kee1Var5;
        kee1 kee1Var6;
        h311 h311VarV;
        CurrentTrackMetadata metadata;
        boolean z2;
        String str;
        String str2;
        boolean zI;
        Object objT;
        whb1 whb1Var;
        int iC;
        et40 et40Var;
        kee1 kee1Var7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1298973923);
        int i5 = (x340Var.i(activeSession) ? 4 : 2) | i2 | (x340Var.i(gt40Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i5 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        if ((i3 & 16) == 0) {
            kee1Var3 = kee1Var;
            int i6 = x340Var.i(kee1Var3) ? 16384 : 8192;
            int i7 = i5 | i6;
            if ((i3 & 32) == 0) {
                kee1Var4 = kee1Var2;
                int i8 = x340Var.i(kee1Var4) ? 131072 : 65536;
                i4 = i7 | i8;
                if ((74899 & i4) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    x340Var.d0();
                    if ((i2 & 1) != 0 || x340Var.E()) {
                        if ((i3 & 16) != 0) {
                            kee1Var3 = nee1.a;
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            kee1Var4 = nee1.b;
                            i4 &= -458753;
                        }
                    } else {
                        x340Var.b0();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                    }
                    x340Var.s();
                    metadata = activeSession.getMetadata();
                    Logger.g(gvg.h("[DynamicNpvWidget] NpvComposable: artworkUrl=", metadata.getArtwork(), ", title=", metadata.getTitle()), new Object[0]);
                    if (activeSession.getContentType() == WidgetState.ContentType.TALK) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str3 = (String) x340Var.k(wol1.a);
                    str = (String) x340Var.k(wol1.b);
                    str2 = (String) x340Var.k(wol1.c);
                    zI = x340Var.i(metadata) | x340Var.g(str) | x340Var.g(str2);
                    objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new y7p0(metadata, str, str2);
                        x340Var.s0(objT);
                    }
                    Intent intentB = dro.B((String) null, str3, (WidgetInteraction) ((Function0) objT).invoke());
                    intentB.setFlags(268435456);
                    whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
                    iC = l1d.C(i);
                    et40Var = et40.a;
                    if (iC != 0) {
                        if (iC != 1) {
                            x340Var.i0(-75233725);
                            c(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                            x340Var.r(false);
                        } else {
                            if (iC == 2) {
                                throw p3d1.k(x340Var, 1521579179, false);
                            }
                            x340Var.i0(-74918951);
                            d(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                            x340Var.r(false);
                        }
                        kee1Var7 = kee1Var4;
                    } else {
                        x340Var.i0(-75624480);
                        int i9 = ((i4 >> 6) & 14) | ((i4 << 9) & 7168);
                        int i10 = i4 << 6;
                        kee1Var7 = kee1Var4;
                        b(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), kee1Var3, kee1Var7, x340Var, i9 | (3670016 & i10) | (i10 & 29360128));
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    kee1Var5 = kee1Var7;
                } else {
                    x340Var.b0();
                    kee1Var5 = kee1Var4;
                }
                kee1Var6 = kee1Var3;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new x7p0(activeSession, gt40Var, f, i, kee1Var6, kee1Var5, i2, i3);
                }
            }
            kee1Var4 = kee1Var2;
            i4 = i7 | i8;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 16) != 0) {
                        kee1Var3 = nee1.a;
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        kee1Var4 = nee1.b;
                        i4 &= -458753;
                    }
                } else {
                    if ((i3 & 16) != 0) {
                        kee1Var3 = nee1.a;
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        kee1Var4 = nee1.b;
                        i4 &= -458753;
                    }
                }
                x340Var.s();
                metadata = activeSession.getMetadata();
                Logger.g(gvg.h("[DynamicNpvWidget] NpvComposable: artworkUrl=", metadata.getArtwork(), ", title=", metadata.getTitle()), new Object[0]);
                if (activeSession.getContentType() == WidgetState.ContentType.TALK) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str4 = (String) x340Var.k(wol1.a);
                str = (String) x340Var.k(wol1.b);
                str2 = (String) x340Var.k(wol1.c);
                zI = x340Var.i(metadata) | x340Var.g(str) | x340Var.g(str2);
                objT = x340Var.T();
                if (zI) {
                    objT = new y7p0(metadata, str, str2);
                    x340Var.s0(objT);
                } else {
                    objT = new y7p0(metadata, str, str2);
                    x340Var.s0(objT);
                }
                Intent intentB2 = dro.B((String) null, str4, (WidgetInteraction) ((Function0) objT).invoke());
                intentB2.setFlags(268435456);
                whb1Var = new whb1(intentB2, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
                iC = l1d.C(i);
                et40Var = et40.a;
                if (iC != 0) {
                    if (iC != 1) {
                        x340Var.i0(-75233725);
                        c(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                        x340Var.r(false);
                    } else {
                        if (iC == 2) {
                            throw p3d1.k(x340Var, 1521579179, false);
                        }
                        x340Var.i0(-74918951);
                        d(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                        x340Var.r(false);
                    }
                    kee1Var7 = kee1Var4;
                } else {
                    x340Var.i0(-75624480);
                    int i11 = ((i4 >> 6) & 14) | ((i4 << 9) & 7168);
                    int i12 = i4 << 6;
                    kee1Var7 = kee1Var4;
                    b(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), kee1Var3, kee1Var7, x340Var, i11 | (3670016 & i12) | (i12 & 29360128));
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                kee1Var5 = kee1Var7;
            } else {
                x340Var.b0();
                kee1Var5 = kee1Var4;
            }
            kee1Var6 = kee1Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new x7p0(activeSession, gt40Var, f, i, kee1Var6, kee1Var5, i2, i3);
            }
        }
        kee1Var3 = kee1Var;
        int i13 = i5 | i6;
        if ((i3 & 32) == 0) {
            kee1Var4 = kee1Var2;
            if (x340Var.i(kee1Var4)) {
            }
            i4 = i13 | i8;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 16) != 0) {
                        kee1Var3 = nee1.a;
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        kee1Var4 = nee1.b;
                        i4 &= -458753;
                    }
                } else {
                    if ((i3 & 16) != 0) {
                        kee1Var3 = nee1.a;
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        kee1Var4 = nee1.b;
                        i4 &= -458753;
                    }
                }
                x340Var.s();
                metadata = activeSession.getMetadata();
                Logger.g(gvg.h("[DynamicNpvWidget] NpvComposable: artworkUrl=", metadata.getArtwork(), ", title=", metadata.getTitle()), new Object[0]);
                if (activeSession.getContentType() == WidgetState.ContentType.TALK) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str5 = (String) x340Var.k(wol1.a);
                str = (String) x340Var.k(wol1.b);
                str2 = (String) x340Var.k(wol1.c);
                zI = x340Var.i(metadata) | x340Var.g(str) | x340Var.g(str2);
                objT = x340Var.T();
                if (zI) {
                    objT = new y7p0(metadata, str, str2);
                    x340Var.s0(objT);
                } else {
                    objT = new y7p0(metadata, str, str2);
                    x340Var.s0(objT);
                }
                Intent intentB3 = dro.B((String) null, str5, (WidgetInteraction) ((Function0) objT).invoke());
                intentB3.setFlags(268435456);
                whb1Var = new whb1(intentB3, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
                iC = l1d.C(i);
                et40Var = et40.a;
                if (iC != 0) {
                    if (iC != 1) {
                        x340Var.i0(-75233725);
                        c(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                        x340Var.r(false);
                    } else {
                        if (iC == 2) {
                            throw p3d1.k(x340Var, 1521579179, false);
                        }
                        x340Var.i0(-74918951);
                        d(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                        x340Var.r(false);
                    }
                    kee1Var7 = kee1Var4;
                } else {
                    x340Var.i0(-75624480);
                    int i14 = ((i4 >> 6) & 14) | ((i4 << 9) & 7168);
                    int i15 = i4 << 6;
                    kee1Var7 = kee1Var4;
                    b(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), kee1Var3, kee1Var7, x340Var, i14 | (3670016 & i15) | (i15 & 29360128));
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                kee1Var5 = kee1Var7;
            } else {
                x340Var.b0();
                kee1Var5 = kee1Var4;
            }
            kee1Var6 = kee1Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new x7p0(activeSession, gt40Var, f, i, kee1Var6, kee1Var5, i2, i3);
            }
        }
        kee1Var4 = kee1Var2;
        i4 = i13 | i8;
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if ((i3 & 16) != 0) {
                    kee1Var3 = nee1.a;
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    kee1Var4 = nee1.b;
                    i4 &= -458753;
                }
            } else {
                if ((i3 & 16) != 0) {
                    kee1Var3 = nee1.a;
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    kee1Var4 = nee1.b;
                    i4 &= -458753;
                }
            }
            x340Var.s();
            metadata = activeSession.getMetadata();
            Logger.g(gvg.h("[DynamicNpvWidget] NpvComposable: artworkUrl=", metadata.getArtwork(), ", title=", metadata.getTitle()), new Object[0]);
            if (activeSession.getContentType() == WidgetState.ContentType.TALK) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str6 = (String) x340Var.k(wol1.a);
            str = (String) x340Var.k(wol1.b);
            str2 = (String) x340Var.k(wol1.c);
            zI = x340Var.i(metadata) | x340Var.g(str) | x340Var.g(str2);
            objT = x340Var.T();
            if (zI) {
                objT = new y7p0(metadata, str, str2);
                x340Var.s0(objT);
            } else {
                objT = new y7p0(metadata, str, str2);
                x340Var.s0(objT);
            }
            Intent intentB4 = dro.B((String) null, str6, (WidgetInteraction) ((Function0) objT).invoke());
            intentB4.setFlags(268435456);
            whb1Var = new whb1(intentB4, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            iC = l1d.C(i);
            et40Var = et40.a;
            if (iC != 0) {
                if (iC != 1) {
                    x340Var.i0(-75233725);
                    c(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                    x340Var.r(false);
                } else {
                    if (iC == 2) {
                        throw p3d1.k(x340Var, 1521579179, false);
                    }
                    x340Var.i0(-74918951);
                    d(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), x340Var, ((i4 >> 6) & 14) | ((i4 << 9) & 7168));
                    x340Var.r(false);
                }
                kee1Var7 = kee1Var4;
            } else {
                x340Var.i0(-75624480);
                int i16 = ((i4 >> 6) & 14) | ((i4 << 9) & 7168);
                int i17 = i4 << 6;
                kee1Var7 = kee1Var4;
                b(f, metadata, whb1Var, activeSession, z2, dm5.J(et40Var).c(gt40Var), kee1Var3, kee1Var7, x340Var, i16 | (3670016 & i17) | (i17 & 29360128));
                x340Var = x340Var;
                x340Var.r(false);
            }
            kee1Var5 = kee1Var7;
        } else {
            x340Var.b0();
            kee1Var5 = kee1Var4;
        }
        kee1Var6 = kee1Var3;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x7p0(activeSession, gt40Var, f, i, kee1Var6, kee1Var5, i2, i3);
        }
    }

    public static final void b(float f, CurrentTrackMetadata currentTrackMetadata, whb1 whb1Var, WidgetState.ActiveSession activeSession, boolean z, gt40 gt40Var, kee1 kee1Var, kee1 kee1Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2091567759);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(currentTrackMetadata) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(whb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(activeSession) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(gt40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(kee1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(kee1Var2) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = z7p0.a;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40Var, (iu30) objT), (ql3) null, apo.r(-239482515, new e8p0(f, currentTrackMetadata, activeSession, whb1Var, kee1Var, kee1Var2, z), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f8p0(f, currentTrackMetadata, whb1Var, activeSession, z, gt40Var, kee1Var, kee1Var2, i);
        }
    }

    public static final void c(float f, CurrentTrackMetadata currentTrackMetadata, whb1 whb1Var, WidgetState.ActiveSession activeSession, boolean z, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1026076291);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(currentTrackMetadata) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(whb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(activeSession) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(gt40Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = g8p0.a;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40Var, (iu30) objT), ql3.f, apo.r(96702309, new j8p0(f, currentTrackMetadata, activeSession, whb1Var, z), x340Var), x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k8p0(f, currentTrackMetadata, whb1Var, activeSession, z, gt40Var, i);
        }
    }

    public static final void d(float f, CurrentTrackMetadata currentTrackMetadata, whb1 whb1Var, WidgetState.ActiveSession activeSession, boolean z, gt40 gt40Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2081010068);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(currentTrackMetadata) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(whb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(activeSession) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(gt40Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            float fMin = Math.min(f, (s3v.b(((s3v) x340Var.k(p4k.a)).a) - 48.0f) - 32.0f);
            float f2 = fMin < 0.0f ? 0.0f : fMin;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = l8p0.a;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40Var, (iu30) objT), (ql3) null, apo.r(-164337674, new n8p0(f2, currentTrackMetadata, activeSession, whb1Var, z), x340Var), x340Var, 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o8p0(f, currentTrackMetadata, whb1Var, activeSession, z, gt40Var, i);
        }
    }
}
