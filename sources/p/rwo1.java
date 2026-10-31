package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rwo1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01af  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:160:0x01db  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:173:0x0201  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:179:0x0212  */
    /* JADX WARN: Code duplicated, block: B:182:0x0218  */
    /* JADX WARN: Code duplicated, block: B:184:0x021e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0229  */
    /* JADX WARN: Code duplicated, block: B:191:0x022f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0234  */
    /* JADX WARN: Code duplicated, block: B:194:0x023a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0240  */
    /* JADX WARN: Code duplicated, block: B:197:0x0243  */
    /* JADX WARN: Code duplicated, block: B:199:0x0248  */
    /* JADX WARN: Code duplicated, block: B:202:0x0257  */
    /* JADX WARN: Code duplicated, block: B:208:0x0263  */
    /* JADX WARN: Code duplicated, block: B:211:0x026c  */
    /* JADX WARN: Code duplicated, block: B:213:0x027f  */
    /* JADX WARN: Code duplicated, block: B:239:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:243:0x02df  */
    /* JADX WARN: Code duplicated, block: B:245:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:247:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:249:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:251:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:253:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:254:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:257:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:258:0x0305  */
    /* JADX WARN: Code duplicated, block: B:261:0x030b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0312  */
    /* JADX WARN: Code duplicated, block: B:265:0x0317  */
    /* JADX WARN: Code duplicated, block: B:266:0x031a  */
    /* JADX WARN: Code duplicated, block: B:269:0x0322  */
    /* JADX WARN: Code duplicated, block: B:270:0x032c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0330  */
    /* JADX WARN: Code duplicated, block: B:273:0x0333  */
    /* JADX WARN: Code duplicated, block: B:276:0x0339  */
    /* JADX WARN: Code duplicated, block: B:277:0x0340  */
    /* JADX WARN: Code duplicated, block: B:279:0x0344  */
    /* JADX WARN: Code duplicated, block: B:281:0x034a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0357  */
    /* JADX WARN: Code duplicated, block: B:285:0x0375  */
    /* JADX WARN: Code duplicated, block: B:288:0x037d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0382  */
    /* JADX WARN: Code duplicated, block: B:291:0x0388  */
    /* JADX WARN: Code duplicated, block: B:293:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:295:0x0420  */
    /* JADX WARN: Code duplicated, block: B:298:0x0447  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135 A[ADDED_TO_REGION] */
    public static final void a(y7e1 y7e1Var, two1 two1Var, qim0 qim0Var, max maxVar, String str, vu30 vu30Var, vu30 vu30Var2, boolean z, dk80 dk80Var, lee1 lee1Var, kua0 kua0Var, yta0 yta0Var, e6e1 e6e1Var, vu30 vu30Var3, idn0 idn0Var, uwg uwgVar, es41 es41Var, vzq0 vzq0Var, float f, boolean z2, b0k b0kVar, int i, int i2, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        int i6;
        max maxVar2;
        int i7;
        String str2;
        int i8;
        int i9;
        vu30 vu30Var4;
        int i10;
        int i11;
        vu30 vu30Var5;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z4;
        b0k b0kVar2;
        dk80 dk80Var2;
        yta0 yta0Var2;
        e6e1 e6e1Var2;
        vu30 vu30Var6;
        uwg uwgVar2;
        es41 es41Var2;
        vzq0 vzq0Var2;
        float f2;
        boolean z5;
        String str3;
        vu30 vu30Var7;
        vu30 vu30Var8;
        max maxVar3;
        lee1 lee1Var2;
        kua0 kua0Var2;
        idn0 idn0Var2;
        h311 h311VarV;
        dk80 dk80Var3;
        lee1 lee1Var3;
        kua0 kua0Var3;
        int i34;
        yta0 yta0Var3;
        e6e1 e6e1Var3;
        idn0 idn0VarY;
        uwg uwgVar3;
        int i35;
        vzq0 zzq0Var;
        float f3;
        int i36;
        int i37;
        e6e1 e6e1Var4;
        qim0 qim0Var3;
        kua0 kua0Var4;
        lee1 lee1Var4;
        dk80 dk80Var4;
        vu30 vu30Var9;
        int i38;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-404367180);
        if ((i & 6) == 0) {
            i5 = (b0kVar3.i(y7e1Var) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= b0kVar3.g(two1Var) ? 32 : 16;
        }
        int i39 = i4 & 4;
        if (i39 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i5 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            i6 = 1024;
            if ((i & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    maxVar2 = maxVar;
                    if (b0kVar3.i(maxVar2)) {
                        i38 = 2048;
                    }
                    i5 |= i38;
                } else {
                    maxVar2 = maxVar;
                }
                i38 = 1024;
                i5 |= i38;
            } else {
                maxVar2 = maxVar;
            }
            i7 = i4 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (b0kVar3.g(str2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    i5 |= 196608;
                    vu30Var4 = vu30Var;
                } else {
                    vu30Var4 = vu30Var;
                    if ((i & 196608) == 0) {
                        if (b0kVar3.i(vu30Var4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i5 |= i10;
                    }
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                    i5 |= 1572864;
                    vu30Var5 = vu30Var2;
                } else {
                    vu30Var5 = vu30Var2;
                    if ((i & 1572864) == 0) {
                        if (b0kVar3.i(vu30Var5)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i5 |= i12;
                    }
                }
                i13 = i5 | 12582912;
                i14 = i4 & 256;
                i15 = 33554432;
                if (i14 != 0) {
                    if ((i & 100663296) == 0) {
                        z3 = z;
                        if (b0kVar3.h(z3)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i13 |= i16;
                    }
                    i17 = i4 & 512;
                    i18 = 268435456;
                    if (i17 != 0) {
                        i13 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (b0kVar3.i(dk80Var)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i13 |= i19;
                    }
                    i20 = i13;
                    if ((i2 & 6) == 0) {
                        i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
                    } else {
                        i21 = i2;
                    }
                    if ((i2 & 48) != 0) {
                        i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
                    }
                    i22 = i21;
                    i23 = i4 & 4096;
                    if (i23 != 0) {
                        i24 = i22;
                        if ((i2 & 384) == 0) {
                            if (b0kVar3.i(yta0Var)) {
                                i25 = 256;
                            } else {
                                i25 = 128;
                            }
                            i24 |= i25;
                        }
                        if ((i2 & 3072) != 0) {
                            if ((i4 & 8192) == 0 && b0kVar3.i(e6e1Var)) {
                                i6 = 2048;
                            }
                            i24 |= i6;
                        }
                        i26 = i24;
                        i27 = i4 & 16384;
                        if (i27 != 0) {
                            i28 = i26;
                            if ((i2 & 24576) == 0) {
                                i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                            }
                            if ((i2 & 196608) != 0) {
                                i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                            }
                            i29 = i4 & 65536;
                            if (i29 != 0) {
                                i28 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                if (b0kVar3.i(uwgVar)) {
                                    i30 = 1048576;
                                } else {
                                    i30 = 524288;
                                }
                                i28 |= i30;
                            }
                            if ((i2 & 12582912) == 0) {
                                i28 |= 4194304;
                            }
                            if ((i2 & 100663296) != 0) {
                                if ((i4 & 262144) == 0 && b0kVar3.i(vzq0Var)) {
                                    i15 = 67108864;
                                }
                                i28 |= i15;
                            }
                            if ((i2 & 805306368) != 0) {
                                if ((i4 & 524288) == 0 && b0kVar3.d(f)) {
                                    i18 = 536870912;
                                }
                                i28 |= i18;
                            }
                            i31 = i4 & 1048576;
                            if (i31 != 0) {
                                i32 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                if (b0kVar3.h(z2)) {
                                    i33 = 4;
                                } else {
                                    i33 = 2;
                                }
                                i32 = i3 | i33;
                            } else {
                                i32 = i3;
                            }
                            if ((i20 & 306783379) != 306783378 && (i28 & 306783379) == 306783378 && (i32 & 3) == 2) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (b0kVar3.Y(i20 & 1, z4)) {
                                b0kVar3.d0();
                                if ((i & 1) != 0 || b0kVar3.E()) {
                                    if (i39 != 0) {
                                        qim0Var2 = nim0.a;
                                    }
                                    if ((i4 & 8) != 0) {
                                        i20 &= -7169;
                                        maxVar2 = jax.a;
                                    }
                                    if (i7 != 0) {
                                        str2 = null;
                                    }
                                    if (i9 != 0) {
                                        vu30Var4 = null;
                                    }
                                    if (i11 != 0) {
                                        vu30Var5 = null;
                                    }
                                    if (i14 != 0) {
                                        z3 = false;
                                    }
                                    if (i17 != 0) {
                                        dk80Var3 = null;
                                    } else {
                                        dk80Var3 = dk80Var;
                                    }
                                    if ((i4 & 1024) != 0) {
                                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                        i28 &= -15;
                                    } else {
                                        lee1Var3 = lee1Var;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        kua0Var3 = kua0.g;
                                        i28 &= -113;
                                    } else {
                                        kua0Var3 = kua0Var;
                                    }
                                    i34 = i28;
                                    if (i23 != 0) {
                                        yta0Var3 = null;
                                    } else {
                                        yta0Var3 = yta0Var;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        e6e1.a.getClass();
                                        e6e1Var3 = b6e1.b;
                                        i34 &= -7169;
                                    } else {
                                        e6e1Var3 = e6e1Var;
                                    }
                                    if (i27 != 0) {
                                        vu30Var6 = null;
                                    } else {
                                        vu30Var6 = vu30Var3;
                                    }
                                    if ((i4 & 32768) != 0) {
                                        idn0VarY = zso1.Y(b0kVar3);
                                        i34 &= -458753;
                                    } else {
                                        idn0VarY = idn0Var;
                                    }
                                    if (i29 != 0) {
                                        uwgVar3 = null;
                                    } else {
                                        uwgVar3 = uwgVar;
                                    }
                                    int i40 = i20;
                                    es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
                                    i35 = i34 & (-29360129);
                                    if ((i4 & 262144) != 0) {
                                        uwr uwrVar = cbx.a;
                                        cvx cvxVar = cbx.b(b0kVar3).b;
                                        cvx cvxVar2 = cbx.b(b0kVar3).b;
                                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                        i35 = i34 & (-264241153);
                                    } else {
                                        zzq0Var = vzq0Var;
                                    }
                                    if ((i4 & 524288) != 0) {
                                        i36 = i35 & (-1879048193);
                                        f3 = Float.NaN;
                                    } else {
                                        f3 = f;
                                        i36 = i35;
                                    }
                                    if (i31 != 0) {
                                        z5 = false;
                                    } else {
                                        z5 = z2;
                                    }
                                    es41Var2 = es41VarC;
                                    i37 = i36;
                                    e6e1Var4 = e6e1Var3;
                                    qim0Var3 = qim0Var2;
                                    i20 = i40;
                                    kua0Var4 = kua0Var3;
                                    lee1Var4 = lee1Var3;
                                    dk80Var4 = dk80Var3;
                                    vu30Var9 = vu30Var5;
                                } else {
                                    b0kVar3.b0();
                                    if ((i4 & 8) != 0) {
                                        i20 &= -7169;
                                    }
                                    if ((i4 & 1024) != 0) {
                                        i28 &= -15;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i28 &= -113;
                                    }
                                    int i41 = i28;
                                    if ((i4 & 8192) != 0) {
                                        i41 &= -7169;
                                    }
                                    if ((i4 & 32768) != 0) {
                                        i41 &= -458753;
                                    }
                                    int i42 = i41 & (-29360129);
                                    if ((i4 & 262144) != 0) {
                                        i42 = i41 & (-264241153);
                                    }
                                    if ((i4 & 524288) != 0) {
                                        i42 &= -1879048193;
                                    }
                                    dk80Var4 = dk80Var;
                                    lee1Var4 = lee1Var;
                                    e6e1Var4 = e6e1Var;
                                    vu30Var6 = vu30Var3;
                                    idn0VarY = idn0Var;
                                    uwgVar3 = uwgVar;
                                    es41Var2 = es41Var;
                                    zzq0Var = vzq0Var;
                                    f3 = f;
                                    z5 = z2;
                                    i37 = i42;
                                    vu30Var9 = vu30Var5;
                                    qim0Var3 = qim0Var2;
                                    maxVar2 = maxVar2;
                                    kua0Var4 = kua0Var;
                                    yta0Var3 = yta0Var;
                                }
                                boolean z6 = z3;
                                vu30 vu30Var10 = vu30Var4;
                                b0kVar3.s();
                                int i43 = i20 >> 3;
                                b0kVar2 = b0kVar3;
                                b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var10, vu30Var9, false, z6, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i43 & 112) | (i43 & 896) | (i43 & 7168) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | (i43 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                                maxVar3 = maxVar2;
                                vu30Var7 = vu30Var10;
                                z3 = z6;
                                lee1Var2 = lee1Var4;
                                kua0Var2 = kua0Var4;
                                e6e1Var2 = e6e1Var4;
                                uwgVar2 = uwgVar3;
                                f2 = f3;
                                qim0Var2 = qim0Var3;
                                str3 = str2;
                                vu30Var8 = vu30Var9;
                                dk80Var2 = dk80Var4;
                                yta0Var2 = yta0Var3;
                                idn0Var2 = idn0VarY;
                                vzq0Var2 = zzq0Var;
                            } else {
                                b0kVar2 = b0kVar3;
                                b0kVar2.b0();
                                dk80Var2 = dk80Var;
                                yta0Var2 = yta0Var;
                                e6e1Var2 = e6e1Var;
                                vu30Var6 = vu30Var3;
                                uwgVar2 = uwgVar;
                                es41Var2 = es41Var;
                                vzq0Var2 = vzq0Var;
                                f2 = f;
                                z5 = z2;
                                str3 = str2;
                                vu30Var7 = vu30Var4;
                                vu30Var8 = vu30Var5;
                                maxVar3 = maxVar2;
                                lee1Var2 = lee1Var;
                                kua0Var2 = kua0Var;
                                idn0Var2 = idn0Var;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                            }
                        }
                        i28 = i26 | 24576;
                        if ((i2 & 196608) != 0) {
                            i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                        }
                        i29 = i4 & 65536;
                        if (i29 != 0) {
                            i28 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (b0kVar3.i(uwgVar)) {
                                i30 = 1048576;
                            } else {
                                i30 = 524288;
                            }
                            i28 |= i30;
                        }
                        if ((i2 & 12582912) == 0) {
                            i28 |= 4194304;
                        }
                        if ((i2 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i15 = 67108864;
                            }
                            i28 |= i15;
                        }
                        if ((i2 & 805306368) != 0) {
                            if ((i4 & 524288) == 0) {
                                i18 = 536870912;
                            }
                            i28 |= i18;
                        }
                        i31 = i4 & 1048576;
                        if (i31 != 0) {
                            i32 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            if (b0kVar3.h(z2)) {
                                i33 = 4;
                            } else {
                                i33 = 2;
                            }
                            i32 = i3 | i33;
                        } else {
                            i32 = i3;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (b0kVar3.Y(i20 & 1, z4)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i44 = i20;
                                es41 es41VarC2 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar2 = cbx.a;
                                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                                    cvx cvxVar4 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC2;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i44;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            } else {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i45 = i20;
                                es41 es41VarC3 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar3 = cbx.a;
                                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                                    cvx cvxVar6 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC3;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i45;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            }
                            boolean z7 = z3;
                            vu30 vu30Var11 = vu30Var4;
                            b0kVar3.s();
                            int i46 = i20 >> 3;
                            b0kVar2 = b0kVar3;
                            b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var11, vu30Var9, false, z7, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i46 & 112) | (i46 & 896) | (i46 & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                            maxVar3 = maxVar2;
                            vu30Var7 = vu30Var11;
                            z3 = z7;
                            lee1Var2 = lee1Var4;
                            kua0Var2 = kua0Var4;
                            e6e1Var2 = e6e1Var4;
                            uwgVar2 = uwgVar3;
                            f2 = f3;
                            qim0Var2 = qim0Var3;
                            str3 = str2;
                            vu30Var8 = vu30Var9;
                            dk80Var2 = dk80Var4;
                            yta0Var2 = yta0Var3;
                            idn0Var2 = idn0VarY;
                            vzq0Var2 = zzq0Var;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            dk80Var2 = dk80Var;
                            yta0Var2 = yta0Var;
                            e6e1Var2 = e6e1Var;
                            vu30Var6 = vu30Var3;
                            uwgVar2 = uwgVar;
                            es41Var2 = es41Var;
                            vzq0Var2 = vzq0Var;
                            f2 = f;
                            z5 = z2;
                            str3 = str2;
                            vu30Var7 = vu30Var4;
                            vu30Var8 = vu30Var5;
                            maxVar3 = maxVar2;
                            lee1Var2 = lee1Var;
                            kua0Var2 = kua0Var;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                        }
                    }
                    i24 = i22 | 384;
                    if ((i2 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i6 = 2048;
                        }
                        i24 |= i6;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i2 & 24576) == 0) {
                            i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) != 0) {
                            i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                        }
                        i29 = i4 & 65536;
                        if (i29 != 0) {
                            i28 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (b0kVar3.i(uwgVar)) {
                                i30 = 1048576;
                            } else {
                                i30 = 524288;
                            }
                            i28 |= i30;
                        }
                        if ((i2 & 12582912) == 0) {
                            i28 |= 4194304;
                        }
                        if ((i2 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i15 = 67108864;
                            }
                            i28 |= i15;
                        }
                        if ((i2 & 805306368) != 0) {
                            if ((i4 & 524288) == 0) {
                                i18 = 536870912;
                            }
                            i28 |= i18;
                        }
                        i31 = i4 & 1048576;
                        if (i31 != 0) {
                            i32 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            if (b0kVar3.h(z2)) {
                                i33 = 4;
                            } else {
                                i33 = 2;
                            }
                            i32 = i3 | i33;
                        } else {
                            i32 = i3;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (b0kVar3.Y(i20 & 1, z4)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i47 = i20;
                                es41 es41VarC4 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar4 = cbx.a;
                                    cvx cvxVar7 = cbx.b(b0kVar3).b;
                                    cvx cvxVar8 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC4;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i47;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            } else {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i48 = i20;
                                es41 es41VarC5 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar5 = cbx.a;
                                    cvx cvxVar9 = cbx.b(b0kVar3).b;
                                    cvx cvxVar10 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC5;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i48;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            }
                            boolean z8 = z3;
                            vu30 vu30Var12 = vu30Var4;
                            b0kVar3.s();
                            int i49 = i20 >> 3;
                            b0kVar2 = b0kVar3;
                            b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var12, vu30Var9, false, z8, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i49 & 112) | (i49 & 896) | (i49 & 7168) | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016) | (i49 & 29360128) | (i49 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                            maxVar3 = maxVar2;
                            vu30Var7 = vu30Var12;
                            z3 = z8;
                            lee1Var2 = lee1Var4;
                            kua0Var2 = kua0Var4;
                            e6e1Var2 = e6e1Var4;
                            uwgVar2 = uwgVar3;
                            f2 = f3;
                            qim0Var2 = qim0Var3;
                            str3 = str2;
                            vu30Var8 = vu30Var9;
                            dk80Var2 = dk80Var4;
                            yta0Var2 = yta0Var3;
                            idn0Var2 = idn0VarY;
                            vzq0Var2 = zzq0Var;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            dk80Var2 = dk80Var;
                            yta0Var2 = yta0Var;
                            e6e1Var2 = e6e1Var;
                            vu30Var6 = vu30Var3;
                            uwgVar2 = uwgVar;
                            es41Var2 = es41Var;
                            vzq0Var2 = vzq0Var;
                            f2 = f;
                            z5 = z2;
                            str3 = str2;
                            vu30Var7 = vu30Var4;
                            vu30Var8 = vu30Var5;
                            maxVar3 = maxVar2;
                            lee1Var2 = lee1Var;
                            kua0Var2 = kua0Var;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                        }
                    }
                    i28 = i26 | 24576;
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i410 = i20;
                            es41 es41VarC6 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar6 = cbx.a;
                                cvx cvxVar11 = cbx.b(b0kVar3).b;
                                cvx cvxVar12 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC6;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i410;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i411 = i20;
                            es41 es41VarC7 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar7 = cbx.a;
                                cvx cvxVar13 = cbx.b(b0kVar3).b;
                                cvx cvxVar14 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC7;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i411;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z9 = z3;
                        vu30 vu30Var13 = vu30Var4;
                        b0kVar3.s();
                        int i412 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var13, vu30Var9, false, z9, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i412 & 112) | (i412 & 896) | (i412 & 7168) | (i412 & 57344) | (i412 & 458752) | (i412 & 3670016) | (i412 & 29360128) | (i412 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var13;
                        z3 = z9;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i13 = i5 | 113246208;
                z3 = z;
                i17 = i4 & 512;
                i18 = 268435456;
                if (i17 != 0) {
                    i13 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (b0kVar3.i(dk80Var)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                i20 = i13;
                if ((i2 & 6) == 0) {
                    i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
                } else {
                    i21 = i2;
                }
                if ((i2 & 48) != 0) {
                    i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
                }
                i22 = i21;
                i23 = i4 & 4096;
                if (i23 != 0) {
                    i24 = i22;
                    if ((i2 & 384) == 0) {
                        if (b0kVar3.i(yta0Var)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i24 |= i25;
                    }
                    if ((i2 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i6 = 2048;
                        }
                        i24 |= i6;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i2 & 24576) == 0) {
                            i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) != 0) {
                            i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                        }
                        i29 = i4 & 65536;
                        if (i29 != 0) {
                            i28 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (b0kVar3.i(uwgVar)) {
                                i30 = 1048576;
                            } else {
                                i30 = 524288;
                            }
                            i28 |= i30;
                        }
                        if ((i2 & 12582912) == 0) {
                            i28 |= 4194304;
                        }
                        if ((i2 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i15 = 67108864;
                            }
                            i28 |= i15;
                        }
                        if ((i2 & 805306368) != 0) {
                            if ((i4 & 524288) == 0) {
                                i18 = 536870912;
                            }
                            i28 |= i18;
                        }
                        i31 = i4 & 1048576;
                        if (i31 != 0) {
                            i32 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            if (b0kVar3.h(z2)) {
                                i33 = 4;
                            } else {
                                i33 = 2;
                            }
                            i32 = i3 | i33;
                        } else {
                            i32 = i3;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (b0kVar3.Y(i20 & 1, z4)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i413 = i20;
                                es41 es41VarC8 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar8 = cbx.a;
                                    cvx cvxVar15 = cbx.b(b0kVar3).b;
                                    cvx cvxVar16 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC8;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i413;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            } else {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i414 = i20;
                                es41 es41VarC9 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar9 = cbx.a;
                                    cvx cvxVar17 = cbx.b(b0kVar3).b;
                                    cvx cvxVar18 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC9;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i414;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            }
                            boolean z10 = z3;
                            vu30 vu30Var14 = vu30Var4;
                            b0kVar3.s();
                            int i415 = i20 >> 3;
                            b0kVar2 = b0kVar3;
                            b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var14, vu30Var9, false, z10, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i415 & 112) | (i415 & 896) | (i415 & 7168) | (i415 & 57344) | (i415 & 458752) | (i415 & 3670016) | (i415 & 29360128) | (i415 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                            maxVar3 = maxVar2;
                            vu30Var7 = vu30Var14;
                            z3 = z10;
                            lee1Var2 = lee1Var4;
                            kua0Var2 = kua0Var4;
                            e6e1Var2 = e6e1Var4;
                            uwgVar2 = uwgVar3;
                            f2 = f3;
                            qim0Var2 = qim0Var3;
                            str3 = str2;
                            vu30Var8 = vu30Var9;
                            dk80Var2 = dk80Var4;
                            yta0Var2 = yta0Var3;
                            idn0Var2 = idn0VarY;
                            vzq0Var2 = zzq0Var;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            dk80Var2 = dk80Var;
                            yta0Var2 = yta0Var;
                            e6e1Var2 = e6e1Var;
                            vu30Var6 = vu30Var3;
                            uwgVar2 = uwgVar;
                            es41Var2 = es41Var;
                            vzq0Var2 = vzq0Var;
                            f2 = f;
                            z5 = z2;
                            str3 = str2;
                            vu30Var7 = vu30Var4;
                            vu30Var8 = vu30Var5;
                            maxVar3 = maxVar2;
                            lee1Var2 = lee1Var;
                            kua0Var2 = kua0Var;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                        }
                    }
                    i28 = i26 | 24576;
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i416 = i20;
                            es41 es41VarC10 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar10 = cbx.a;
                                cvx cvxVar19 = cbx.b(b0kVar3).b;
                                cvx cvxVar110 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC10;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i416;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i417 = i20;
                            es41 es41VarC11 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar11 = cbx.a;
                                cvx cvxVar111 = cbx.b(b0kVar3).b;
                                cvx cvxVar112 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC11;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i417;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z11 = z3;
                        vu30 vu30Var15 = vu30Var4;
                        b0kVar3.s();
                        int i418 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var15, vu30Var9, false, z11, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i418 & 112) | (i418 & 896) | (i418 & 7168) | (i418 & 57344) | (i418 & 458752) | (i418 & 3670016) | (i418 & 29360128) | (i418 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var15;
                        z3 = z11;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i24 = i22 | 384;
                if ((i2 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i6 = 2048;
                    }
                    i24 |= i6;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i2 & 24576) == 0) {
                        i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i419 = i20;
                            es41 es41VarC12 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar12 = cbx.a;
                                cvx cvxVar113 = cbx.b(b0kVar3).b;
                                cvx cvxVar114 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC12;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i419;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4110 = i20;
                            es41 es41VarC13 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar13 = cbx.a;
                                cvx cvxVar115 = cbx.b(b0kVar3).b;
                                cvx cvxVar116 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC13;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4110;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z12 = z3;
                        vu30 vu30Var16 = vu30Var4;
                        b0kVar3.s();
                        int i4111 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var16, vu30Var9, false, z12, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111 & 112) | (i4111 & 896) | (i4111 & 7168) | (i4111 & 57344) | (i4111 & 458752) | (i4111 & 3670016) | (i4111 & 29360128) | (i4111 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var16;
                        z3 = z12;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i28 = i26 | 24576;
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4112 = i20;
                        es41 es41VarC14 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar14 = cbx.a;
                            cvx cvxVar117 = cbx.b(b0kVar3).b;
                            cvx cvxVar118 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC14;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4112;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4113 = i20;
                        es41 es41VarC15 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar15 = cbx.a;
                            cvx cvxVar119 = cbx.b(b0kVar3).b;
                            cvx cvxVar1110 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC15;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4113;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z13 = z3;
                    vu30 vu30Var17 = vu30Var4;
                    b0kVar3.s();
                    int i4114 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var17, vu30Var9, false, z13, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4114 & 112) | (i4114 & 896) | (i4114 & 7168) | (i4114 & 57344) | (i4114 & 458752) | (i4114 & 3670016) | (i4114 & 29360128) | (i4114 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var17;
                    z3 = z13;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i5 |= 24576;
            str2 = str;
            i9 = i4 & 32;
            if (i9 != 0) {
                i5 |= 196608;
                vu30Var4 = vu30Var;
            } else {
                vu30Var4 = vu30Var;
                if ((i & 196608) == 0) {
                    if (b0kVar3.i(vu30Var4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
            }
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                vu30Var5 = vu30Var2;
            } else {
                vu30Var5 = vu30Var2;
                if ((i & 1572864) == 0) {
                    if (b0kVar3.i(vu30Var5)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            i13 = i5 | 12582912;
            i14 = i4 & 256;
            i15 = 33554432;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    z3 = z;
                    if (b0kVar3.h(z3)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i13 |= i16;
                }
                i17 = i4 & 512;
                i18 = 268435456;
                if (i17 != 0) {
                    i13 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (b0kVar3.i(dk80Var)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                i20 = i13;
                if ((i2 & 6) == 0) {
                    i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
                } else {
                    i21 = i2;
                }
                if ((i2 & 48) != 0) {
                    i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
                }
                i22 = i21;
                i23 = i4 & 4096;
                if (i23 != 0) {
                    i24 = i22;
                    if ((i2 & 384) == 0) {
                        if (b0kVar3.i(yta0Var)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i24 |= i25;
                    }
                    if ((i2 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i6 = 2048;
                        }
                        i24 |= i6;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i2 & 24576) == 0) {
                            i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) != 0) {
                            i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                        }
                        i29 = i4 & 65536;
                        if (i29 != 0) {
                            i28 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (b0kVar3.i(uwgVar)) {
                                i30 = 1048576;
                            } else {
                                i30 = 524288;
                            }
                            i28 |= i30;
                        }
                        if ((i2 & 12582912) == 0) {
                            i28 |= 4194304;
                        }
                        if ((i2 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i15 = 67108864;
                            }
                            i28 |= i15;
                        }
                        if ((i2 & 805306368) != 0) {
                            if ((i4 & 524288) == 0) {
                                i18 = 536870912;
                            }
                            i28 |= i18;
                        }
                        i31 = i4 & 1048576;
                        if (i31 != 0) {
                            i32 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            if (b0kVar3.h(z2)) {
                                i33 = 4;
                            } else {
                                i33 = 2;
                            }
                            i32 = i3 | i33;
                        } else {
                            i32 = i3;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (b0kVar3.Y(i20 & 1, z4)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i4115 = i20;
                                es41 es41VarC16 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar16 = cbx.a;
                                    cvx cvxVar1111 = cbx.b(b0kVar3).b;
                                    cvx cvxVar1112 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC16;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i4115;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            } else {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i4116 = i20;
                                es41 es41VarC17 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar17 = cbx.a;
                                    cvx cvxVar1113 = cbx.b(b0kVar3).b;
                                    cvx cvxVar1114 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC17;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i4116;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            }
                            boolean z14 = z3;
                            vu30 vu30Var18 = vu30Var4;
                            b0kVar3.s();
                            int i4117 = i20 >> 3;
                            b0kVar2 = b0kVar3;
                            b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var18, vu30Var9, false, z14, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4117 & 112) | (i4117 & 896) | (i4117 & 7168) | (i4117 & 57344) | (i4117 & 458752) | (i4117 & 3670016) | (i4117 & 29360128) | (i4117 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                            maxVar3 = maxVar2;
                            vu30Var7 = vu30Var18;
                            z3 = z14;
                            lee1Var2 = lee1Var4;
                            kua0Var2 = kua0Var4;
                            e6e1Var2 = e6e1Var4;
                            uwgVar2 = uwgVar3;
                            f2 = f3;
                            qim0Var2 = qim0Var3;
                            str3 = str2;
                            vu30Var8 = vu30Var9;
                            dk80Var2 = dk80Var4;
                            yta0Var2 = yta0Var3;
                            idn0Var2 = idn0VarY;
                            vzq0Var2 = zzq0Var;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            dk80Var2 = dk80Var;
                            yta0Var2 = yta0Var;
                            e6e1Var2 = e6e1Var;
                            vu30Var6 = vu30Var3;
                            uwgVar2 = uwgVar;
                            es41Var2 = es41Var;
                            vzq0Var2 = vzq0Var;
                            f2 = f;
                            z5 = z2;
                            str3 = str2;
                            vu30Var7 = vu30Var4;
                            vu30Var8 = vu30Var5;
                            maxVar3 = maxVar2;
                            lee1Var2 = lee1Var;
                            kua0Var2 = kua0Var;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                        }
                    }
                    i28 = i26 | 24576;
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4118 = i20;
                            es41 es41VarC18 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar18 = cbx.a;
                                cvx cvxVar1115 = cbx.b(b0kVar3).b;
                                cvx cvxVar1116 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC18;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4118;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4119 = i20;
                            es41 es41VarC19 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar19 = cbx.a;
                                cvx cvxVar1117 = cbx.b(b0kVar3).b;
                                cvx cvxVar1118 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC19;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4119;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z15 = z3;
                        vu30 vu30Var19 = vu30Var4;
                        b0kVar3.s();
                        int i41110 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var19, vu30Var9, false, z15, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41110 & 112) | (i41110 & 896) | (i41110 & 7168) | (i41110 & 57344) | (i41110 & 458752) | (i41110 & 3670016) | (i41110 & 29360128) | (i41110 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var19;
                        z3 = z15;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i24 = i22 | 384;
                if ((i2 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i6 = 2048;
                    }
                    i24 |= i6;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i2 & 24576) == 0) {
                        i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i41111 = i20;
                            es41 es41VarC110 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar110 = cbx.a;
                                cvx cvxVar1119 = cbx.b(b0kVar3).b;
                                cvx cvxVar11110 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC110;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i41111;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i41112 = i20;
                            es41 es41VarC111 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar111 = cbx.a;
                                cvx cvxVar11111 = cbx.b(b0kVar3).b;
                                cvx cvxVar11112 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC111;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i41112;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z16 = z3;
                        vu30 vu30Var110 = vu30Var4;
                        b0kVar3.s();
                        int i41113 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var110, vu30Var9, false, z16, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41113 & 112) | (i41113 & 896) | (i41113 & 7168) | (i41113 & 57344) | (i41113 & 458752) | (i41113 & 3670016) | (i41113 & 29360128) | (i41113 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var110;
                        z3 = z16;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i28 = i26 | 24576;
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i41114 = i20;
                        es41 es41VarC112 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar112 = cbx.a;
                            cvx cvxVar11113 = cbx.b(b0kVar3).b;
                            cvx cvxVar11114 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC112;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i41114;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i41115 = i20;
                        es41 es41VarC113 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar113 = cbx.a;
                            cvx cvxVar11115 = cbx.b(b0kVar3).b;
                            cvx cvxVar11116 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC113;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i41115;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z17 = z3;
                    vu30 vu30Var111 = vu30Var4;
                    b0kVar3.s();
                    int i41116 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var111, vu30Var9, false, z17, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41116 & 112) | (i41116 & 896) | (i41116 & 7168) | (i41116 & 57344) | (i41116 & 458752) | (i41116 & 3670016) | (i41116 & 29360128) | (i41116 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var111;
                    z3 = z17;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i13 = i5 | 113246208;
            z3 = z;
            i17 = i4 & 512;
            i18 = 268435456;
            if (i17 != 0) {
                i13 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (b0kVar3.i(dk80Var)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i13 |= i19;
            }
            i20 = i13;
            if ((i2 & 6) == 0) {
                i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
            } else {
                i21 = i2;
            }
            if ((i2 & 48) != 0) {
                i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
            }
            i22 = i21;
            i23 = i4 & 4096;
            if (i23 != 0) {
                i24 = i22;
                if ((i2 & 384) == 0) {
                    if (b0kVar3.i(yta0Var)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i24 |= i25;
                }
                if ((i2 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i6 = 2048;
                    }
                    i24 |= i6;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i2 & 24576) == 0) {
                        i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i41117 = i20;
                            es41 es41VarC114 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar114 = cbx.a;
                                cvx cvxVar11117 = cbx.b(b0kVar3).b;
                                cvx cvxVar11118 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC114;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i41117;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i41118 = i20;
                            es41 es41VarC115 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar115 = cbx.a;
                                cvx cvxVar11119 = cbx.b(b0kVar3).b;
                                cvx cvxVar111110 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC115;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i41118;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z18 = z3;
                        vu30 vu30Var112 = vu30Var4;
                        b0kVar3.s();
                        int i41119 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var112, vu30Var9, false, z18, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41119 & 112) | (i41119 & 896) | (i41119 & 7168) | (i41119 & 57344) | (i41119 & 458752) | (i41119 & 3670016) | (i41119 & 29360128) | (i41119 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var112;
                        z3 = z18;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i28 = i26 | 24576;
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411110 = i20;
                        es41 es41VarC116 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar116 = cbx.a;
                            cvx cvxVar111111 = cbx.b(b0kVar3).b;
                            cvx cvxVar111112 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC116;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411110;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411111 = i20;
                        es41 es41VarC117 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar117 = cbx.a;
                            cvx cvxVar111113 = cbx.b(b0kVar3).b;
                            cvx cvxVar111114 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC117;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411111;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z19 = z3;
                    vu30 vu30Var113 = vu30Var4;
                    b0kVar3.s();
                    int i411112 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var113, vu30Var9, false, z19, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i411112 & 112) | (i411112 & 896) | (i411112 & 7168) | (i411112 & 57344) | (i411112 & 458752) | (i411112 & 3670016) | (i411112 & 29360128) | (i411112 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var113;
                    z3 = z19;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i24 = i22 | 384;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i6 = 2048;
                }
                i24 |= i6;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i2 & 24576) == 0) {
                    i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                }
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411113 = i20;
                        es41 es41VarC118 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar118 = cbx.a;
                            cvx cvxVar111115 = cbx.b(b0kVar3).b;
                            cvx cvxVar111116 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC118;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411113;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411114 = i20;
                        es41 es41VarC119 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar119 = cbx.a;
                            cvx cvxVar111117 = cbx.b(b0kVar3).b;
                            cvx cvxVar111118 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC119;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411114;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z110 = z3;
                    vu30 vu30Var114 = vu30Var4;
                    b0kVar3.s();
                    int i411115 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var114, vu30Var9, false, z110, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i411115 & 112) | (i411115 & 896) | (i411115 & 7168) | (i411115 & 57344) | (i411115 & 458752) | (i411115 & 3670016) | (i411115 & 29360128) | (i411115 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var114;
                    z3 = z110;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i28 = i26 | 24576;
            if ((i2 & 196608) != 0) {
                i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
            }
            i29 = i4 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (b0kVar3.i(uwgVar)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i28 |= i30;
            }
            if ((i2 & 12582912) == 0) {
                i28 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i15 = 67108864;
                }
                i28 |= i15;
            }
            if ((i2 & 805306368) != 0) {
                if ((i4 & 524288) == 0) {
                    i18 = 536870912;
                }
                i28 |= i18;
            }
            i31 = i4 & 1048576;
            if (i31 != 0) {
                i32 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (b0kVar3.h(z2)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i32 = i3 | i33;
            } else {
                i32 = i3;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (b0kVar3.Y(i20 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i411116 = i20;
                    es41 es41VarC1110 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar1110 = cbx.a;
                        cvx cvxVar111119 = cbx.b(b0kVar3).b;
                        cvx cvxVar1111110 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC1110;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i411116;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                } else {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i411117 = i20;
                    es41 es41VarC1111 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar1111 = cbx.a;
                        cvx cvxVar1111111 = cbx.b(b0kVar3).b;
                        cvx cvxVar1111112 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC1111;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i411117;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                }
                boolean z111 = z3;
                vu30 vu30Var115 = vu30Var4;
                b0kVar3.s();
                int i411118 = i20 >> 3;
                b0kVar2 = b0kVar3;
                b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var115, vu30Var9, false, z111, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i411118 & 112) | (i411118 & 896) | (i411118 & 7168) | (i411118 & 57344) | (i411118 & 458752) | (i411118 & 3670016) | (i411118 & 29360128) | (i411118 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var115;
                z3 = z111;
                lee1Var2 = lee1Var4;
                kua0Var2 = kua0Var4;
                e6e1Var2 = e6e1Var4;
                uwgVar2 = uwgVar3;
                f2 = f3;
                qim0Var2 = qim0Var3;
                str3 = str2;
                vu30Var8 = vu30Var9;
                dk80Var2 = dk80Var4;
                yta0Var2 = yta0Var3;
                idn0Var2 = idn0VarY;
                vzq0Var2 = zzq0Var;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var2 = dk80Var;
                yta0Var2 = yta0Var;
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z5 = z2;
                str3 = str2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                maxVar3 = maxVar2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
            }
        }
        i5 |= 384;
        qim0Var2 = qim0Var;
        i6 = 1024;
        if ((i & 3072) == 0) {
            if ((i4 & 8) == 0) {
                maxVar2 = maxVar;
                if (b0kVar3.i(maxVar2)) {
                    i38 = 2048;
                }
                i5 |= i38;
            } else {
                maxVar2 = maxVar;
            }
            i38 = 1024;
            i5 |= i38;
        } else {
            maxVar2 = maxVar;
        }
        i7 = i4 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (b0kVar3.g(str2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i5 |= i8;
            }
            i9 = i4 & 32;
            if (i9 != 0) {
                i5 |= 196608;
                vu30Var4 = vu30Var;
            } else {
                vu30Var4 = vu30Var;
                if ((i & 196608) == 0) {
                    if (b0kVar3.i(vu30Var4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
            }
            i11 = i4 & 64;
            if (i11 != 0) {
                i5 |= 1572864;
                vu30Var5 = vu30Var2;
            } else {
                vu30Var5 = vu30Var2;
                if ((i & 1572864) == 0) {
                    if (b0kVar3.i(vu30Var5)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i5 |= i12;
                }
            }
            i13 = i5 | 12582912;
            i14 = i4 & 256;
            i15 = 33554432;
            if (i14 != 0) {
                if ((i & 100663296) == 0) {
                    z3 = z;
                    if (b0kVar3.h(z3)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i13 |= i16;
                }
                i17 = i4 & 512;
                i18 = 268435456;
                if (i17 != 0) {
                    i13 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (b0kVar3.i(dk80Var)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                i20 = i13;
                if ((i2 & 6) == 0) {
                    i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
                } else {
                    i21 = i2;
                }
                if ((i2 & 48) != 0) {
                    i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
                }
                i22 = i21;
                i23 = i4 & 4096;
                if (i23 != 0) {
                    i24 = i22;
                    if ((i2 & 384) == 0) {
                        if (b0kVar3.i(yta0Var)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i24 |= i25;
                    }
                    if ((i2 & 3072) != 0) {
                        if ((i4 & 8192) == 0) {
                            i6 = 2048;
                        }
                        i24 |= i6;
                    }
                    i26 = i24;
                    i27 = i4 & 16384;
                    if (i27 != 0) {
                        i28 = i26;
                        if ((i2 & 24576) == 0) {
                            i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) != 0) {
                            i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                        }
                        i29 = i4 & 65536;
                        if (i29 != 0) {
                            i28 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (b0kVar3.i(uwgVar)) {
                                i30 = 1048576;
                            } else {
                                i30 = 524288;
                            }
                            i28 |= i30;
                        }
                        if ((i2 & 12582912) == 0) {
                            i28 |= 4194304;
                        }
                        if ((i2 & 100663296) != 0) {
                            if ((i4 & 262144) == 0) {
                                i15 = 67108864;
                            }
                            i28 |= i15;
                        }
                        if ((i2 & 805306368) != 0) {
                            if ((i4 & 524288) == 0) {
                                i18 = 536870912;
                            }
                            i28 |= i18;
                        }
                        i31 = i4 & 1048576;
                        if (i31 != 0) {
                            i32 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            if (b0kVar3.h(z2)) {
                                i33 = 4;
                            } else {
                                i33 = 2;
                            }
                            i32 = i3 | i33;
                        } else {
                            i32 = i3;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (b0kVar3.Y(i20 & 1, z4)) {
                            b0kVar3.d0();
                            if ((i & 1) != 0) {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i411119 = i20;
                                es41 es41VarC1112 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar1112 = cbx.a;
                                    cvx cvxVar1111113 = cbx.b(b0kVar3).b;
                                    cvx cvxVar1111114 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC1112;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i411119;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            } else {
                                if (i39 != 0) {
                                    qim0Var2 = nim0.a;
                                }
                                if ((i4 & 8) != 0) {
                                    i20 &= -7169;
                                    maxVar2 = jax.a;
                                }
                                if (i7 != 0) {
                                    str2 = null;
                                }
                                if (i9 != 0) {
                                    vu30Var4 = null;
                                }
                                if (i11 != 0) {
                                    vu30Var5 = null;
                                }
                                if (i14 != 0) {
                                    z3 = false;
                                }
                                if (i17 != 0) {
                                    dk80Var3 = null;
                                } else {
                                    dk80Var3 = dk80Var;
                                }
                                if ((i4 & 1024) != 0) {
                                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                    i28 &= -15;
                                } else {
                                    lee1Var3 = lee1Var;
                                }
                                if ((i4 & 2048) != 0) {
                                    kua0Var3 = kua0.g;
                                    i28 &= -113;
                                } else {
                                    kua0Var3 = kua0Var;
                                }
                                i34 = i28;
                                if (i23 != 0) {
                                    yta0Var3 = null;
                                } else {
                                    yta0Var3 = yta0Var;
                                }
                                if ((i4 & 8192) != 0) {
                                    e6e1.a.getClass();
                                    e6e1Var3 = b6e1.b;
                                    i34 &= -7169;
                                } else {
                                    e6e1Var3 = e6e1Var;
                                }
                                if (i27 != 0) {
                                    vu30Var6 = null;
                                } else {
                                    vu30Var6 = vu30Var3;
                                }
                                if ((i4 & 32768) != 0) {
                                    idn0VarY = zso1.Y(b0kVar3);
                                    i34 &= -458753;
                                } else {
                                    idn0VarY = idn0Var;
                                }
                                if (i29 != 0) {
                                    uwgVar3 = null;
                                } else {
                                    uwgVar3 = uwgVar;
                                }
                                int i4111110 = i20;
                                es41 es41VarC1113 = l6o1.C(0, 0, 1, b0kVar3);
                                i35 = i34 & (-29360129);
                                if ((i4 & 262144) != 0) {
                                    uwr uwrVar1113 = cbx.a;
                                    cvx cvxVar1111115 = cbx.b(b0kVar3).b;
                                    cvx cvxVar1111116 = cbx.b(b0kVar3).b;
                                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                    i35 = i34 & (-264241153);
                                } else {
                                    zzq0Var = vzq0Var;
                                }
                                if ((i4 & 524288) != 0) {
                                    i36 = i35 & (-1879048193);
                                    f3 = Float.NaN;
                                } else {
                                    f3 = f;
                                    i36 = i35;
                                }
                                if (i31 != 0) {
                                    z5 = false;
                                } else {
                                    z5 = z2;
                                }
                                es41Var2 = es41VarC1113;
                                i37 = i36;
                                e6e1Var4 = e6e1Var3;
                                qim0Var3 = qim0Var2;
                                i20 = i4111110;
                                kua0Var4 = kua0Var3;
                                lee1Var4 = lee1Var3;
                                dk80Var4 = dk80Var3;
                                vu30Var9 = vu30Var5;
                            }
                            boolean z112 = z3;
                            vu30 vu30Var116 = vu30Var4;
                            b0kVar3.s();
                            int i4111111 = i20 >> 3;
                            b0kVar2 = b0kVar3;
                            b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var116, vu30Var9, false, z112, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111111 & 112) | (i4111111 & 896) | (i4111111 & 7168) | (i4111111 & 57344) | (i4111111 & 458752) | (i4111111 & 3670016) | (i4111111 & 29360128) | (i4111111 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                            maxVar3 = maxVar2;
                            vu30Var7 = vu30Var116;
                            z3 = z112;
                            lee1Var2 = lee1Var4;
                            kua0Var2 = kua0Var4;
                            e6e1Var2 = e6e1Var4;
                            uwgVar2 = uwgVar3;
                            f2 = f3;
                            qim0Var2 = qim0Var3;
                            str3 = str2;
                            vu30Var8 = vu30Var9;
                            dk80Var2 = dk80Var4;
                            yta0Var2 = yta0Var3;
                            idn0Var2 = idn0VarY;
                            vzq0Var2 = zzq0Var;
                        } else {
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                            dk80Var2 = dk80Var;
                            yta0Var2 = yta0Var;
                            e6e1Var2 = e6e1Var;
                            vu30Var6 = vu30Var3;
                            uwgVar2 = uwgVar;
                            es41Var2 = es41Var;
                            vzq0Var2 = vzq0Var;
                            f2 = f;
                            z5 = z2;
                            str3 = str2;
                            vu30Var7 = vu30Var4;
                            vu30Var8 = vu30Var5;
                            maxVar3 = maxVar2;
                            lee1Var2 = lee1Var;
                            kua0Var2 = kua0Var;
                            idn0Var2 = idn0Var;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                        }
                    }
                    i28 = i26 | 24576;
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4111112 = i20;
                            es41 es41VarC1114 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar1114 = cbx.a;
                                cvx cvxVar1111117 = cbx.b(b0kVar3).b;
                                cvx cvxVar1111118 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC1114;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4111112;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4111113 = i20;
                            es41 es41VarC1115 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar1115 = cbx.a;
                                cvx cvxVar1111119 = cbx.b(b0kVar3).b;
                                cvx cvxVar11111110 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC1115;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4111113;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z113 = z3;
                        vu30 vu30Var117 = vu30Var4;
                        b0kVar3.s();
                        int i4111114 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var117, vu30Var9, false, z113, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111114 & 112) | (i4111114 & 896) | (i4111114 & 7168) | (i4111114 & 57344) | (i4111114 & 458752) | (i4111114 & 3670016) | (i4111114 & 29360128) | (i4111114 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var117;
                        z3 = z113;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i24 = i22 | 384;
                if ((i2 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i6 = 2048;
                    }
                    i24 |= i6;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i2 & 24576) == 0) {
                        i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4111115 = i20;
                            es41 es41VarC1116 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar1116 = cbx.a;
                                cvx cvxVar11111111 = cbx.b(b0kVar3).b;
                                cvx cvxVar11111112 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC1116;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4111115;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i4111116 = i20;
                            es41 es41VarC1117 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar1117 = cbx.a;
                                cvx cvxVar11111113 = cbx.b(b0kVar3).b;
                                cvx cvxVar11111114 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC1117;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i4111116;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z114 = z3;
                        vu30 vu30Var118 = vu30Var4;
                        b0kVar3.s();
                        int i4111117 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var118, vu30Var9, false, z114, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111117 & 112) | (i4111117 & 896) | (i4111117 & 7168) | (i4111117 & 57344) | (i4111117 & 458752) | (i4111117 & 3670016) | (i4111117 & 29360128) | (i4111117 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var118;
                        z3 = z114;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i28 = i26 | 24576;
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4111118 = i20;
                        es41 es41VarC1118 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar1118 = cbx.a;
                            cvx cvxVar11111115 = cbx.b(b0kVar3).b;
                            cvx cvxVar11111116 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC1118;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4111118;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4111119 = i20;
                        es41 es41VarC1119 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar1119 = cbx.a;
                            cvx cvxVar11111117 = cbx.b(b0kVar3).b;
                            cvx cvxVar11111118 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC1119;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4111119;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z115 = z3;
                    vu30 vu30Var119 = vu30Var4;
                    b0kVar3.s();
                    int i41111110 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var119, vu30Var9, false, z115, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111110 & 112) | (i41111110 & 896) | (i41111110 & 7168) | (i41111110 & 57344) | (i41111110 & 458752) | (i41111110 & 3670016) | (i41111110 & 29360128) | (i41111110 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var119;
                    z3 = z115;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i13 = i5 | 113246208;
            z3 = z;
            i17 = i4 & 512;
            i18 = 268435456;
            if (i17 != 0) {
                i13 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (b0kVar3.i(dk80Var)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i13 |= i19;
            }
            i20 = i13;
            if ((i2 & 6) == 0) {
                i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
            } else {
                i21 = i2;
            }
            if ((i2 & 48) != 0) {
                i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
            }
            i22 = i21;
            i23 = i4 & 4096;
            if (i23 != 0) {
                i24 = i22;
                if ((i2 & 384) == 0) {
                    if (b0kVar3.i(yta0Var)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i24 |= i25;
                }
                if ((i2 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i6 = 2048;
                    }
                    i24 |= i6;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i2 & 24576) == 0) {
                        i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i41111111 = i20;
                            es41 es41VarC11110 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar11110 = cbx.a;
                                cvx cvxVar11111119 = cbx.b(b0kVar3).b;
                                cvx cvxVar111111110 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC11110;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i41111111;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i41111112 = i20;
                            es41 es41VarC11111 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar11111 = cbx.a;
                                cvx cvxVar111111111 = cbx.b(b0kVar3).b;
                                cvx cvxVar111111112 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC11111;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i41111112;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z116 = z3;
                        vu30 vu30Var1110 = vu30Var4;
                        b0kVar3.s();
                        int i41111113 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1110, vu30Var9, false, z116, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111113 & 112) | (i41111113 & 896) | (i41111113 & 7168) | (i41111113 & 57344) | (i41111113 & 458752) | (i41111113 & 3670016) | (i41111113 & 29360128) | (i41111113 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var1110;
                        z3 = z116;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i28 = i26 | 24576;
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i41111114 = i20;
                        es41 es41VarC11112 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar11112 = cbx.a;
                            cvx cvxVar111111113 = cbx.b(b0kVar3).b;
                            cvx cvxVar111111114 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC11112;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i41111114;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i41111115 = i20;
                        es41 es41VarC11113 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar11113 = cbx.a;
                            cvx cvxVar111111115 = cbx.b(b0kVar3).b;
                            cvx cvxVar111111116 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC11113;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i41111115;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z117 = z3;
                    vu30 vu30Var1111 = vu30Var4;
                    b0kVar3.s();
                    int i41111116 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1111, vu30Var9, false, z117, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111116 & 112) | (i41111116 & 896) | (i41111116 & 7168) | (i41111116 & 57344) | (i41111116 & 458752) | (i41111116 & 3670016) | (i41111116 & 29360128) | (i41111116 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var1111;
                    z3 = z117;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i24 = i22 | 384;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i6 = 2048;
                }
                i24 |= i6;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i2 & 24576) == 0) {
                    i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                }
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i41111117 = i20;
                        es41 es41VarC11114 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar11114 = cbx.a;
                            cvx cvxVar111111117 = cbx.b(b0kVar3).b;
                            cvx cvxVar111111118 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC11114;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i41111117;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i41111118 = i20;
                        es41 es41VarC11115 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar11115 = cbx.a;
                            cvx cvxVar111111119 = cbx.b(b0kVar3).b;
                            cvx cvxVar1111111110 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC11115;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i41111118;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z118 = z3;
                    vu30 vu30Var1112 = vu30Var4;
                    b0kVar3.s();
                    int i41111119 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1112, vu30Var9, false, z118, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111119 & 112) | (i41111119 & 896) | (i41111119 & 7168) | (i41111119 & 57344) | (i41111119 & 458752) | (i41111119 & 3670016) | (i41111119 & 29360128) | (i41111119 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var1112;
                    z3 = z118;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i28 = i26 | 24576;
            if ((i2 & 196608) != 0) {
                i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
            }
            i29 = i4 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (b0kVar3.i(uwgVar)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i28 |= i30;
            }
            if ((i2 & 12582912) == 0) {
                i28 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i15 = 67108864;
                }
                i28 |= i15;
            }
            if ((i2 & 805306368) != 0) {
                if ((i4 & 524288) == 0) {
                    i18 = 536870912;
                }
                i28 |= i18;
            }
            i31 = i4 & 1048576;
            if (i31 != 0) {
                i32 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (b0kVar3.h(z2)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i32 = i3 | i33;
            } else {
                i32 = i3;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (b0kVar3.Y(i20 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i411111110 = i20;
                    es41 es41VarC11116 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar11116 = cbx.a;
                        cvx cvxVar1111111111 = cbx.b(b0kVar3).b;
                        cvx cvxVar1111111112 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC11116;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i411111110;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                } else {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i411111111 = i20;
                    es41 es41VarC11117 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar11117 = cbx.a;
                        cvx cvxVar1111111113 = cbx.b(b0kVar3).b;
                        cvx cvxVar1111111114 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC11117;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i411111111;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                }
                boolean z119 = z3;
                vu30 vu30Var1113 = vu30Var4;
                b0kVar3.s();
                int i411111112 = i20 >> 3;
                b0kVar2 = b0kVar3;
                b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1113, vu30Var9, false, z119, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i411111112 & 112) | (i411111112 & 896) | (i411111112 & 7168) | (i411111112 & 57344) | (i411111112 & 458752) | (i411111112 & 3670016) | (i411111112 & 29360128) | (i411111112 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var1113;
                z3 = z119;
                lee1Var2 = lee1Var4;
                kua0Var2 = kua0Var4;
                e6e1Var2 = e6e1Var4;
                uwgVar2 = uwgVar3;
                f2 = f3;
                qim0Var2 = qim0Var3;
                str3 = str2;
                vu30Var8 = vu30Var9;
                dk80Var2 = dk80Var4;
                yta0Var2 = yta0Var3;
                idn0Var2 = idn0VarY;
                vzq0Var2 = zzq0Var;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var2 = dk80Var;
                yta0Var2 = yta0Var;
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z5 = z2;
                str3 = str2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                maxVar3 = maxVar2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
            }
        }
        i5 |= 24576;
        str2 = str;
        i9 = i4 & 32;
        if (i9 != 0) {
            i5 |= 196608;
            vu30Var4 = vu30Var;
        } else {
            vu30Var4 = vu30Var;
            if ((i & 196608) == 0) {
                if (b0kVar3.i(vu30Var4)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
        }
        i11 = i4 & 64;
        if (i11 != 0) {
            i5 |= 1572864;
            vu30Var5 = vu30Var2;
        } else {
            vu30Var5 = vu30Var2;
            if ((i & 1572864) == 0) {
                if (b0kVar3.i(vu30Var5)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i5 |= i12;
            }
        }
        i13 = i5 | 12582912;
        i14 = i4 & 256;
        i15 = 33554432;
        if (i14 != 0) {
            if ((i & 100663296) == 0) {
                z3 = z;
                if (b0kVar3.h(z3)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i13 |= i16;
            }
            i17 = i4 & 512;
            i18 = 268435456;
            if (i17 != 0) {
                i13 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (b0kVar3.i(dk80Var)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i13 |= i19;
            }
            i20 = i13;
            if ((i2 & 6) == 0) {
                i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
            } else {
                i21 = i2;
            }
            if ((i2 & 48) != 0) {
                i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
            }
            i22 = i21;
            i23 = i4 & 4096;
            if (i23 != 0) {
                i24 = i22;
                if ((i2 & 384) == 0) {
                    if (b0kVar3.i(yta0Var)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i24 |= i25;
                }
                if ((i2 & 3072) != 0) {
                    if ((i4 & 8192) == 0) {
                        i6 = 2048;
                    }
                    i24 |= i6;
                }
                i26 = i24;
                i27 = i4 & 16384;
                if (i27 != 0) {
                    i28 = i26;
                    if ((i2 & 24576) == 0) {
                        i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                    }
                    i29 = i4 & 65536;
                    if (i29 != 0) {
                        i28 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (b0kVar3.i(uwgVar)) {
                            i30 = 1048576;
                        } else {
                            i30 = 524288;
                        }
                        i28 |= i30;
                    }
                    if ((i2 & 12582912) == 0) {
                        i28 |= 4194304;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 262144) == 0) {
                            i15 = 67108864;
                        }
                        i28 |= i15;
                    }
                    if ((i2 & 805306368) != 0) {
                        if ((i4 & 524288) == 0) {
                            i18 = 536870912;
                        }
                        i28 |= i18;
                    }
                    i31 = i4 & 1048576;
                    if (i31 != 0) {
                        i32 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        if (b0kVar3.h(z2)) {
                            i33 = 4;
                        } else {
                            i33 = 2;
                        }
                        i32 = i3 | i33;
                    } else {
                        i32 = i3;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (b0kVar3.Y(i20 & 1, z4)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0) {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i411111113 = i20;
                            es41 es41VarC11118 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar11118 = cbx.a;
                                cvx cvxVar1111111115 = cbx.b(b0kVar3).b;
                                cvx cvxVar1111111116 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC11118;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i411111113;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        } else {
                            if (i39 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            if ((i4 & 8) != 0) {
                                i20 &= -7169;
                                maxVar2 = jax.a;
                            }
                            if (i7 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                vu30Var4 = null;
                            }
                            if (i11 != 0) {
                                vu30Var5 = null;
                            }
                            if (i14 != 0) {
                                z3 = false;
                            }
                            if (i17 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i4 & 1024) != 0) {
                                lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                                i28 &= -15;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i4 & 2048) != 0) {
                                kua0Var3 = kua0.g;
                                i28 &= -113;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i34 = i28;
                            if (i23 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i4 & 8192) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i34 &= -7169;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i27 != 0) {
                                vu30Var6 = null;
                            } else {
                                vu30Var6 = vu30Var3;
                            }
                            if ((i4 & 32768) != 0) {
                                idn0VarY = zso1.Y(b0kVar3);
                                i34 &= -458753;
                            } else {
                                idn0VarY = idn0Var;
                            }
                            if (i29 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            int i411111114 = i20;
                            es41 es41VarC11119 = l6o1.C(0, 0, 1, b0kVar3);
                            i35 = i34 & (-29360129);
                            if ((i4 & 262144) != 0) {
                                uwr uwrVar11119 = cbx.a;
                                cvx cvxVar1111111117 = cbx.b(b0kVar3).b;
                                cvx cvxVar1111111118 = cbx.b(b0kVar3).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i35 = i34 & (-264241153);
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i4 & 524288) != 0) {
                                i36 = i35 & (-1879048193);
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                                i36 = i35;
                            }
                            if (i31 != 0) {
                                z5 = false;
                            } else {
                                z5 = z2;
                            }
                            es41Var2 = es41VarC11119;
                            i37 = i36;
                            e6e1Var4 = e6e1Var3;
                            qim0Var3 = qim0Var2;
                            i20 = i411111114;
                            kua0Var4 = kua0Var3;
                            lee1Var4 = lee1Var3;
                            dk80Var4 = dk80Var3;
                            vu30Var9 = vu30Var5;
                        }
                        boolean z1110 = z3;
                        vu30 vu30Var1114 = vu30Var4;
                        b0kVar3.s();
                        int i411111115 = i20 >> 3;
                        b0kVar2 = b0kVar3;
                        b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1114, vu30Var9, false, z1110, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i411111115 & 112) | (i411111115 & 896) | (i411111115 & 7168) | (i411111115 & 57344) | (i411111115 & 458752) | (i411111115 & 3670016) | (i411111115 & 29360128) | (i411111115 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var1114;
                        z3 = z1110;
                        lee1Var2 = lee1Var4;
                        kua0Var2 = kua0Var4;
                        e6e1Var2 = e6e1Var4;
                        uwgVar2 = uwgVar3;
                        f2 = f3;
                        qim0Var2 = qim0Var3;
                        str3 = str2;
                        vu30Var8 = vu30Var9;
                        dk80Var2 = dk80Var4;
                        yta0Var2 = yta0Var3;
                        idn0Var2 = idn0VarY;
                        vzq0Var2 = zzq0Var;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        dk80Var2 = dk80Var;
                        yta0Var2 = yta0Var;
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z5 = z2;
                        str3 = str2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        maxVar3 = maxVar2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                    }
                }
                i28 = i26 | 24576;
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411111116 = i20;
                        es41 es41VarC111110 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar111110 = cbx.a;
                            cvx cvxVar1111111119 = cbx.b(b0kVar3).b;
                            cvx cvxVar11111111110 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC111110;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411111116;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411111117 = i20;
                        es41 es41VarC111111 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar111111 = cbx.a;
                            cvx cvxVar11111111111 = cbx.b(b0kVar3).b;
                            cvx cvxVar11111111112 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC111111;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411111117;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z1111 = z3;
                    vu30 vu30Var1115 = vu30Var4;
                    b0kVar3.s();
                    int i411111118 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1115, vu30Var9, false, z1111, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i411111118 & 112) | (i411111118 & 896) | (i411111118 & 7168) | (i411111118 & 57344) | (i411111118 & 458752) | (i411111118 & 3670016) | (i411111118 & 29360128) | (i411111118 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var1115;
                    z3 = z1111;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i24 = i22 | 384;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i6 = 2048;
                }
                i24 |= i6;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i2 & 24576) == 0) {
                    i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                }
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i411111119 = i20;
                        es41 es41VarC111112 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar111112 = cbx.a;
                            cvx cvxVar11111111113 = cbx.b(b0kVar3).b;
                            cvx cvxVar11111111114 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC111112;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i411111119;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4111111110 = i20;
                        es41 es41VarC111113 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar111113 = cbx.a;
                            cvx cvxVar11111111115 = cbx.b(b0kVar3).b;
                            cvx cvxVar11111111116 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC111113;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4111111110;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z1112 = z3;
                    vu30 vu30Var1116 = vu30Var4;
                    b0kVar3.s();
                    int i4111111111 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1116, vu30Var9, false, z1112, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111111111 & 112) | (i4111111111 & 896) | (i4111111111 & 7168) | (i4111111111 & 57344) | (i4111111111 & 458752) | (i4111111111 & 3670016) | (i4111111111 & 29360128) | (i4111111111 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var1116;
                    z3 = z1112;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i28 = i26 | 24576;
            if ((i2 & 196608) != 0) {
                i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
            }
            i29 = i4 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (b0kVar3.i(uwgVar)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i28 |= i30;
            }
            if ((i2 & 12582912) == 0) {
                i28 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i15 = 67108864;
                }
                i28 |= i15;
            }
            if ((i2 & 805306368) != 0) {
                if ((i4 & 524288) == 0) {
                    i18 = 536870912;
                }
                i28 |= i18;
            }
            i31 = i4 & 1048576;
            if (i31 != 0) {
                i32 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (b0kVar3.h(z2)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i32 = i3 | i33;
            } else {
                i32 = i3;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (b0kVar3.Y(i20 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i4111111112 = i20;
                    es41 es41VarC111114 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar111114 = cbx.a;
                        cvx cvxVar11111111117 = cbx.b(b0kVar3).b;
                        cvx cvxVar11111111118 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC111114;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i4111111112;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                } else {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i4111111113 = i20;
                    es41 es41VarC111115 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar111115 = cbx.a;
                        cvx cvxVar11111111119 = cbx.b(b0kVar3).b;
                        cvx cvxVar111111111110 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC111115;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i4111111113;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                }
                boolean z1113 = z3;
                vu30 vu30Var1117 = vu30Var4;
                b0kVar3.s();
                int i4111111114 = i20 >> 3;
                b0kVar2 = b0kVar3;
                b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1117, vu30Var9, false, z1113, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111111114 & 112) | (i4111111114 & 896) | (i4111111114 & 7168) | (i4111111114 & 57344) | (i4111111114 & 458752) | (i4111111114 & 3670016) | (i4111111114 & 29360128) | (i4111111114 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var1117;
                z3 = z1113;
                lee1Var2 = lee1Var4;
                kua0Var2 = kua0Var4;
                e6e1Var2 = e6e1Var4;
                uwgVar2 = uwgVar3;
                f2 = f3;
                qim0Var2 = qim0Var3;
                str3 = str2;
                vu30Var8 = vu30Var9;
                dk80Var2 = dk80Var4;
                yta0Var2 = yta0Var3;
                idn0Var2 = idn0VarY;
                vzq0Var2 = zzq0Var;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var2 = dk80Var;
                yta0Var2 = yta0Var;
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z5 = z2;
                str3 = str2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                maxVar3 = maxVar2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
            }
        }
        i13 = i5 | 113246208;
        z3 = z;
        i17 = i4 & 512;
        i18 = 268435456;
        if (i17 != 0) {
            i13 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (b0kVar3.i(dk80Var)) {
                i19 = 536870912;
            } else {
                i19 = 268435456;
            }
            i13 |= i19;
        }
        i20 = i13;
        if ((i2 & 6) == 0) {
            i21 = i2 | (((i4 & 1024) == 0 || !b0kVar3.i(lee1Var)) ? 2 : 4);
        } else {
            i21 = i2;
        }
        if ((i2 & 48) != 0) {
            i21 |= ((i4 & 2048) == 0 || !b0kVar3.i(kua0Var)) ? 16 : 32;
        }
        i22 = i21;
        i23 = i4 & 4096;
        if (i23 != 0) {
            i24 = i22;
            if ((i2 & 384) == 0) {
                if (b0kVar3.i(yta0Var)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i24 |= i25;
            }
            if ((i2 & 3072) != 0) {
                if ((i4 & 8192) == 0) {
                    i6 = 2048;
                }
                i24 |= i6;
            }
            i26 = i24;
            i27 = i4 & 16384;
            if (i27 != 0) {
                i28 = i26;
                if ((i2 & 24576) == 0) {
                    i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
                }
                if ((i2 & 196608) != 0) {
                    i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
                }
                i29 = i4 & 65536;
                if (i29 != 0) {
                    i28 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (b0kVar3.i(uwgVar)) {
                        i30 = 1048576;
                    } else {
                        i30 = 524288;
                    }
                    i28 |= i30;
                }
                if ((i2 & 12582912) == 0) {
                    i28 |= 4194304;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i4 & 262144) == 0) {
                        i15 = 67108864;
                    }
                    i28 |= i15;
                }
                if ((i2 & 805306368) != 0) {
                    if ((i4 & 524288) == 0) {
                        i18 = 536870912;
                    }
                    i28 |= i18;
                }
                i31 = i4 & 1048576;
                if (i31 != 0) {
                    i32 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (b0kVar3.h(z2)) {
                        i33 = 4;
                    } else {
                        i33 = 2;
                    }
                    i32 = i3 | i33;
                } else {
                    i32 = i3;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (b0kVar3.Y(i20 & 1, z4)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4111111115 = i20;
                        es41 es41VarC111116 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar111116 = cbx.a;
                            cvx cvxVar111111111111 = cbx.b(b0kVar3).b;
                            cvx cvxVar111111111112 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC111116;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4111111115;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    } else {
                        if (i39 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if ((i4 & 8) != 0) {
                            i20 &= -7169;
                            maxVar2 = jax.a;
                        }
                        if (i7 != 0) {
                            str2 = null;
                        }
                        if (i9 != 0) {
                            vu30Var4 = null;
                        }
                        if (i11 != 0) {
                            vu30Var5 = null;
                        }
                        if (i14 != 0) {
                            z3 = false;
                        }
                        if (i17 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i4 & 1024) != 0) {
                            lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                            i28 &= -15;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i4 & 2048) != 0) {
                            kua0Var3 = kua0.g;
                            i28 &= -113;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i34 = i28;
                        if (i23 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i4 & 8192) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i34 &= -7169;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i27 != 0) {
                            vu30Var6 = null;
                        } else {
                            vu30Var6 = vu30Var3;
                        }
                        if ((i4 & 32768) != 0) {
                            idn0VarY = zso1.Y(b0kVar3);
                            i34 &= -458753;
                        } else {
                            idn0VarY = idn0Var;
                        }
                        if (i29 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        int i4111111116 = i20;
                        es41 es41VarC111117 = l6o1.C(0, 0, 1, b0kVar3);
                        i35 = i34 & (-29360129);
                        if ((i4 & 262144) != 0) {
                            uwr uwrVar111117 = cbx.a;
                            cvx cvxVar111111111113 = cbx.b(b0kVar3).b;
                            cvx cvxVar111111111114 = cbx.b(b0kVar3).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i35 = i34 & (-264241153);
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i4 & 524288) != 0) {
                            i36 = i35 & (-1879048193);
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                            i36 = i35;
                        }
                        if (i31 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        es41Var2 = es41VarC111117;
                        i37 = i36;
                        e6e1Var4 = e6e1Var3;
                        qim0Var3 = qim0Var2;
                        i20 = i4111111116;
                        kua0Var4 = kua0Var3;
                        lee1Var4 = lee1Var3;
                        dk80Var4 = dk80Var3;
                        vu30Var9 = vu30Var5;
                    }
                    boolean z1114 = z3;
                    vu30 vu30Var1118 = vu30Var4;
                    b0kVar3.s();
                    int i4111111117 = i20 >> 3;
                    b0kVar2 = b0kVar3;
                    b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1118, vu30Var9, false, z1114, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i4111111117 & 112) | (i4111111117 & 896) | (i4111111117 & 7168) | (i4111111117 & 57344) | (i4111111117 & 458752) | (i4111111117 & 3670016) | (i4111111117 & 29360128) | (i4111111117 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var1118;
                    z3 = z1114;
                    lee1Var2 = lee1Var4;
                    kua0Var2 = kua0Var4;
                    e6e1Var2 = e6e1Var4;
                    uwgVar2 = uwgVar3;
                    f2 = f3;
                    qim0Var2 = qim0Var3;
                    str3 = str2;
                    vu30Var8 = vu30Var9;
                    dk80Var2 = dk80Var4;
                    yta0Var2 = yta0Var3;
                    idn0Var2 = idn0VarY;
                    vzq0Var2 = zzq0Var;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    dk80Var2 = dk80Var;
                    yta0Var2 = yta0Var;
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z5 = z2;
                    str3 = str2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    maxVar3 = maxVar2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
                }
            }
            i28 = i26 | 24576;
            if ((i2 & 196608) != 0) {
                i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
            }
            i29 = i4 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (b0kVar3.i(uwgVar)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i28 |= i30;
            }
            if ((i2 & 12582912) == 0) {
                i28 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i15 = 67108864;
                }
                i28 |= i15;
            }
            if ((i2 & 805306368) != 0) {
                if ((i4 & 524288) == 0) {
                    i18 = 536870912;
                }
                i28 |= i18;
            }
            i31 = i4 & 1048576;
            if (i31 != 0) {
                i32 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (b0kVar3.h(z2)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i32 = i3 | i33;
            } else {
                i32 = i3;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (b0kVar3.Y(i20 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i4111111118 = i20;
                    es41 es41VarC111118 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar111118 = cbx.a;
                        cvx cvxVar111111111115 = cbx.b(b0kVar3).b;
                        cvx cvxVar111111111116 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC111118;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i4111111118;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                } else {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i4111111119 = i20;
                    es41 es41VarC111119 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar111119 = cbx.a;
                        cvx cvxVar111111111117 = cbx.b(b0kVar3).b;
                        cvx cvxVar111111111118 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC111119;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i4111111119;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                }
                boolean z1115 = z3;
                vu30 vu30Var1119 = vu30Var4;
                b0kVar3.s();
                int i41111111110 = i20 >> 3;
                b0kVar2 = b0kVar3;
                b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var1119, vu30Var9, false, z1115, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111111110 & 112) | (i41111111110 & 896) | (i41111111110 & 7168) | (i41111111110 & 57344) | (i41111111110 & 458752) | (i41111111110 & 3670016) | (i41111111110 & 29360128) | (i41111111110 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var1119;
                z3 = z1115;
                lee1Var2 = lee1Var4;
                kua0Var2 = kua0Var4;
                e6e1Var2 = e6e1Var4;
                uwgVar2 = uwgVar3;
                f2 = f3;
                qim0Var2 = qim0Var3;
                str3 = str2;
                vu30Var8 = vu30Var9;
                dk80Var2 = dk80Var4;
                yta0Var2 = yta0Var3;
                idn0Var2 = idn0VarY;
                vzq0Var2 = zzq0Var;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var2 = dk80Var;
                yta0Var2 = yta0Var;
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z5 = z2;
                str3 = str2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                maxVar3 = maxVar2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
            }
        }
        i24 = i22 | 384;
        if ((i2 & 3072) != 0) {
            if ((i4 & 8192) == 0) {
                i6 = 2048;
            }
            i24 |= i6;
        }
        i26 = i24;
        i27 = i4 & 16384;
        if (i27 != 0) {
            i28 = i26;
            if ((i2 & 24576) == 0) {
                i28 |= b0kVar3.i(vu30Var3) ? 16384 : 8192;
            }
            if ((i2 & 196608) != 0) {
                i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
            }
            i29 = i4 & 65536;
            if (i29 != 0) {
                i28 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (b0kVar3.i(uwgVar)) {
                    i30 = 1048576;
                } else {
                    i30 = 524288;
                }
                i28 |= i30;
            }
            if ((i2 & 12582912) == 0) {
                i28 |= 4194304;
            }
            if ((i2 & 100663296) != 0) {
                if ((i4 & 262144) == 0) {
                    i15 = 67108864;
                }
                i28 |= i15;
            }
            if ((i2 & 805306368) != 0) {
                if ((i4 & 524288) == 0) {
                    i18 = 536870912;
                }
                i28 |= i18;
            }
            i31 = i4 & 1048576;
            if (i31 != 0) {
                i32 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (b0kVar3.h(z2)) {
                    i33 = 4;
                } else {
                    i33 = 2;
                }
                i32 = i3 | i33;
            } else {
                i32 = i3;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (b0kVar3.Y(i20 & 1, z4)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i41111111111 = i20;
                    es41 es41VarC1111110 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar1111110 = cbx.a;
                        cvx cvxVar111111111119 = cbx.b(b0kVar3).b;
                        cvx cvxVar1111111111110 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC1111110;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i41111111111;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                } else {
                    if (i39 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i4 & 8) != 0) {
                        i20 &= -7169;
                        maxVar2 = jax.a;
                    }
                    if (i7 != 0) {
                        str2 = null;
                    }
                    if (i9 != 0) {
                        vu30Var4 = null;
                    }
                    if (i11 != 0) {
                        vu30Var5 = null;
                    }
                    if (i14 != 0) {
                        z3 = false;
                    }
                    if (i17 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i4 & 1024) != 0) {
                        lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                        i28 &= -15;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i4 & 2048) != 0) {
                        kua0Var3 = kua0.g;
                        i28 &= -113;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i34 = i28;
                    if (i23 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i4 & 8192) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i34 &= -7169;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i27 != 0) {
                        vu30Var6 = null;
                    } else {
                        vu30Var6 = vu30Var3;
                    }
                    if ((i4 & 32768) != 0) {
                        idn0VarY = zso1.Y(b0kVar3);
                        i34 &= -458753;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if (i29 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    int i41111111112 = i20;
                    es41 es41VarC1111111 = l6o1.C(0, 0, 1, b0kVar3);
                    i35 = i34 & (-29360129);
                    if ((i4 & 262144) != 0) {
                        uwr uwrVar1111111 = cbx.a;
                        cvx cvxVar1111111111111 = cbx.b(b0kVar3).b;
                        cvx cvxVar1111111111112 = cbx.b(b0kVar3).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i35 = i34 & (-264241153);
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i4 & 524288) != 0) {
                        i36 = i35 & (-1879048193);
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                        i36 = i35;
                    }
                    if (i31 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    es41Var2 = es41VarC1111111;
                    i37 = i36;
                    e6e1Var4 = e6e1Var3;
                    qim0Var3 = qim0Var2;
                    i20 = i41111111112;
                    kua0Var4 = kua0Var3;
                    lee1Var4 = lee1Var3;
                    dk80Var4 = dk80Var3;
                    vu30Var9 = vu30Var5;
                }
                boolean z1116 = z3;
                vu30 vu30Var11110 = vu30Var4;
                b0kVar3.s();
                int i41111111113 = i20 >> 3;
                b0kVar2 = b0kVar3;
                b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var11110, vu30Var9, false, z1116, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111111113 & 112) | (i41111111113 & 896) | (i41111111113 & 7168) | (i41111111113 & 57344) | (i41111111113 & 458752) | (i41111111113 & 3670016) | (i41111111113 & 29360128) | (i41111111113 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var11110;
                z3 = z1116;
                lee1Var2 = lee1Var4;
                kua0Var2 = kua0Var4;
                e6e1Var2 = e6e1Var4;
                uwgVar2 = uwgVar3;
                f2 = f3;
                qim0Var2 = qim0Var3;
                str3 = str2;
                vu30Var8 = vu30Var9;
                dk80Var2 = dk80Var4;
                yta0Var2 = yta0Var3;
                idn0Var2 = idn0VarY;
                vzq0Var2 = zzq0Var;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                dk80Var2 = dk80Var;
                yta0Var2 = yta0Var;
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z5 = z2;
                str3 = str2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                maxVar3 = maxVar2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
            }
        }
        i28 = i26 | 24576;
        if ((i2 & 196608) != 0) {
            i28 |= ((i4 & 32768) == 0 || !b0kVar3.i(idn0Var)) ? 65536 : 131072;
        }
        i29 = i4 & 65536;
        if (i29 != 0) {
            i28 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (b0kVar3.i(uwgVar)) {
                i30 = 1048576;
            } else {
                i30 = 524288;
            }
            i28 |= i30;
        }
        if ((i2 & 12582912) == 0) {
            i28 |= 4194304;
        }
        if ((i2 & 100663296) != 0) {
            if ((i4 & 262144) == 0) {
                i15 = 67108864;
            }
            i28 |= i15;
        }
        if ((i2 & 805306368) != 0) {
            if ((i4 & 524288) == 0) {
                i18 = 536870912;
            }
            i28 |= i18;
        }
        i31 = i4 & 1048576;
        if (i31 != 0) {
            i32 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (b0kVar3.h(z2)) {
                i33 = 4;
            } else {
                i33 = 2;
            }
            i32 = i3 | i33;
        } else {
            i32 = i3;
        }
        if ((i20 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (b0kVar3.Y(i20 & 1, z4)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i39 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i4 & 8) != 0) {
                    i20 &= -7169;
                    maxVar2 = jax.a;
                }
                if (i7 != 0) {
                    str2 = null;
                }
                if (i9 != 0) {
                    vu30Var4 = null;
                }
                if (i11 != 0) {
                    vu30Var5 = null;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                if (i17 != 0) {
                    dk80Var3 = null;
                } else {
                    dk80Var3 = dk80Var;
                }
                if ((i4 & 1024) != 0) {
                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                    i28 &= -15;
                } else {
                    lee1Var3 = lee1Var;
                }
                if ((i4 & 2048) != 0) {
                    kua0Var3 = kua0.g;
                    i28 &= -113;
                } else {
                    kua0Var3 = kua0Var;
                }
                i34 = i28;
                if (i23 != 0) {
                    yta0Var3 = null;
                } else {
                    yta0Var3 = yta0Var;
                }
                if ((i4 & 8192) != 0) {
                    e6e1.a.getClass();
                    e6e1Var3 = b6e1.b;
                    i34 &= -7169;
                } else {
                    e6e1Var3 = e6e1Var;
                }
                if (i27 != 0) {
                    vu30Var6 = null;
                } else {
                    vu30Var6 = vu30Var3;
                }
                if ((i4 & 32768) != 0) {
                    idn0VarY = zso1.Y(b0kVar3);
                    i34 &= -458753;
                } else {
                    idn0VarY = idn0Var;
                }
                if (i29 != 0) {
                    uwgVar3 = null;
                } else {
                    uwgVar3 = uwgVar;
                }
                int i41111111114 = i20;
                es41 es41VarC1111112 = l6o1.C(0, 0, 1, b0kVar3);
                i35 = i34 & (-29360129);
                if ((i4 & 262144) != 0) {
                    uwr uwrVar1111112 = cbx.a;
                    cvx cvxVar1111111111113 = cbx.b(b0kVar3).b;
                    cvx cvxVar1111111111114 = cbx.b(b0kVar3).b;
                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                    i35 = i34 & (-264241153);
                } else {
                    zzq0Var = vzq0Var;
                }
                if ((i4 & 524288) != 0) {
                    i36 = i35 & (-1879048193);
                    f3 = Float.NaN;
                } else {
                    f3 = f;
                    i36 = i35;
                }
                if (i31 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                es41Var2 = es41VarC1111112;
                i37 = i36;
                e6e1Var4 = e6e1Var3;
                qim0Var3 = qim0Var2;
                i20 = i41111111114;
                kua0Var4 = kua0Var3;
                lee1Var4 = lee1Var3;
                dk80Var4 = dk80Var3;
                vu30Var9 = vu30Var5;
            } else {
                if (i39 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i4 & 8) != 0) {
                    i20 &= -7169;
                    maxVar2 = jax.a;
                }
                if (i7 != 0) {
                    str2 = null;
                }
                if (i9 != 0) {
                    vu30Var4 = null;
                }
                if (i11 != 0) {
                    vu30Var5 = null;
                }
                if (i14 != 0) {
                    z3 = false;
                }
                if (i17 != 0) {
                    dk80Var3 = null;
                } else {
                    dk80Var3 = dk80Var;
                }
                if ((i4 & 1024) != 0) {
                    lee1Var3 = (lee1) b0kVar3.k(rgx.a);
                    i28 &= -15;
                } else {
                    lee1Var3 = lee1Var;
                }
                if ((i4 & 2048) != 0) {
                    kua0Var3 = kua0.g;
                    i28 &= -113;
                } else {
                    kua0Var3 = kua0Var;
                }
                i34 = i28;
                if (i23 != 0) {
                    yta0Var3 = null;
                } else {
                    yta0Var3 = yta0Var;
                }
                if ((i4 & 8192) != 0) {
                    e6e1.a.getClass();
                    e6e1Var3 = b6e1.b;
                    i34 &= -7169;
                } else {
                    e6e1Var3 = e6e1Var;
                }
                if (i27 != 0) {
                    vu30Var6 = null;
                } else {
                    vu30Var6 = vu30Var3;
                }
                if ((i4 & 32768) != 0) {
                    idn0VarY = zso1.Y(b0kVar3);
                    i34 &= -458753;
                } else {
                    idn0VarY = idn0Var;
                }
                if (i29 != 0) {
                    uwgVar3 = null;
                } else {
                    uwgVar3 = uwgVar;
                }
                int i41111111115 = i20;
                es41 es41VarC1111113 = l6o1.C(0, 0, 1, b0kVar3);
                i35 = i34 & (-29360129);
                if ((i4 & 262144) != 0) {
                    uwr uwrVar1111113 = cbx.a;
                    cvx cvxVar1111111111115 = cbx.b(b0kVar3).b;
                    cvx cvxVar1111111111116 = cbx.b(b0kVar3).b;
                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                    i35 = i34 & (-264241153);
                } else {
                    zzq0Var = vzq0Var;
                }
                if ((i4 & 524288) != 0) {
                    i36 = i35 & (-1879048193);
                    f3 = Float.NaN;
                } else {
                    f3 = f;
                    i36 = i35;
                }
                if (i31 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                es41Var2 = es41VarC1111113;
                i37 = i36;
                e6e1Var4 = e6e1Var3;
                qim0Var3 = qim0Var2;
                i20 = i41111111115;
                kua0Var4 = kua0Var3;
                lee1Var4 = lee1Var3;
                dk80Var4 = dk80Var3;
                vu30Var9 = vu30Var5;
            }
            boolean z1117 = z3;
            vu30 vu30Var11111 = vu30Var4;
            b0kVar3.s();
            int i41111111116 = i20 >> 3;
            b0kVar2 = b0kVar3;
            b(y7e1Var, qim0Var3, maxVar2, str2, vu30Var11111, vu30Var9, false, z1117, dk80Var4, lee1Var4, kua0Var4, yta0Var3, e6e1Var4, vu30Var6, idn0VarY, uwgVar3, es41Var2, zzq0Var, f3, z5, two1Var.t(b0kVar3), b0kVar2, (i20 & 14) | (i41111111116 & 112) | (i41111111116 & 896) | (i41111111116 & 7168) | (i41111111116 & 57344) | (i41111111116 & 458752) | (i41111111116 & 3670016) | (i41111111116 & 29360128) | (i41111111116 & 234881024) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 268435454) | ((i32 << 27) & 1879048192), 0);
            maxVar3 = maxVar2;
            vu30Var7 = vu30Var11111;
            z3 = z1117;
            lee1Var2 = lee1Var4;
            kua0Var2 = kua0Var4;
            e6e1Var2 = e6e1Var4;
            uwgVar2 = uwgVar3;
            f2 = f3;
            qim0Var2 = qim0Var3;
            str3 = str2;
            vu30Var8 = vu30Var9;
            dk80Var2 = dk80Var4;
            yta0Var2 = yta0Var3;
            idn0Var2 = idn0VarY;
            vzq0Var2 = zzq0Var;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            dk80Var2 = dk80Var;
            yta0Var2 = yta0Var;
            e6e1Var2 = e6e1Var;
            vu30Var6 = vu30Var3;
            uwgVar2 = uwgVar;
            es41Var2 = es41Var;
            vzq0Var2 = vzq0Var;
            f2 = f;
            z5 = z2;
            str3 = str2;
            vu30Var7 = vu30Var4;
            vu30Var8 = vu30Var5;
            maxVar3 = maxVar2;
            lee1Var2 = lee1Var;
            kua0Var2 = kua0Var;
            idn0Var2 = idn0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ayx(y7e1Var, two1Var, qim0Var2, maxVar3, str3, vu30Var7, vu30Var8, z3, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z5, i, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:120:0x0170  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0193  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01de  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:172:0x0204  */
    /* JADX WARN: Code duplicated, block: B:174:0x0209  */
    /* JADX WARN: Code duplicated, block: B:177:0x020f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0215  */
    /* JADX WARN: Code duplicated, block: B:183:0x0220  */
    /* JADX WARN: Code duplicated, block: B:186:0x0228  */
    /* JADX WARN: Code duplicated, block: B:188:0x022e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0239  */
    /* JADX WARN: Code duplicated, block: B:195:0x023f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0244  */
    /* JADX WARN: Code duplicated, block: B:198:0x024a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0250  */
    /* JADX WARN: Code duplicated, block: B:204:0x025a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0263  */
    /* JADX WARN: Code duplicated, block: B:210:0x0271  */
    /* JADX WARN: Code duplicated, block: B:216:0x027d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0286  */
    /* JADX WARN: Code duplicated, block: B:221:0x029e  */
    /* JADX WARN: Code duplicated, block: B:249:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:251:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:253:0x0302  */
    /* JADX WARN: Code duplicated, block: B:255:0x0305  */
    /* JADX WARN: Code duplicated, block: B:257:0x0308  */
    /* JADX WARN: Code duplicated, block: B:259:0x030b  */
    /* JADX WARN: Code duplicated, block: B:261:0x030e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0311  */
    /* JADX WARN: Code duplicated, block: B:264:0x0313  */
    /* JADX WARN: Code duplicated, block: B:267:0x0319  */
    /* JADX WARN: Code duplicated, block: B:268:0x0324  */
    /* JADX WARN: Code duplicated, block: B:271:0x032a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0331  */
    /* JADX WARN: Code duplicated, block: B:275:0x0336  */
    /* JADX WARN: Code duplicated, block: B:276:0x0339  */
    /* JADX WARN: Code duplicated, block: B:279:0x033f  */
    /* JADX WARN: Code duplicated, block: B:280:0x0349  */
    /* JADX WARN: Code duplicated, block: B:282:0x034d  */
    /* JADX WARN: Code duplicated, block: B:283:0x0350  */
    /* JADX WARN: Code duplicated, block: B:286:0x0358  */
    /* JADX WARN: Code duplicated, block: B:287:0x035f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0365  */
    /* JADX WARN: Code duplicated, block: B:290:0x0368  */
    /* JADX WARN: Code duplicated, block: B:293:0x0370  */
    /* JADX WARN: Code duplicated, block: B:294:0x0379  */
    /* JADX WARN: Code duplicated, block: B:297:0x037f  */
    /* JADX WARN: Code duplicated, block: B:298:0x039b  */
    /* JADX WARN: Code duplicated, block: B:301:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:302:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:304:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:305:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:308:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:309:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:312:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:313:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:315:0x0409  */
    /* JADX WARN: Code duplicated, block: B:316:0x040c  */
    /* JADX WARN: Code duplicated, block: B:319:0x0432  */
    /* JADX WARN: Code duplicated, block: B:320:0x0437  */
    /* JADX WARN: Code duplicated, block: B:323:0x0455  */
    /* JADX WARN: Code duplicated, block: B:324:0x045a  */
    /* JADX WARN: Code duplicated, block: B:326:0x0468  */
    /* JADX WARN: Code duplicated, block: B:327:0x046b  */
    /* JADX WARN: Code duplicated, block: B:330:0x0493  */
    /* JADX WARN: Code duplicated, block: B:331:0x049b  */
    /* JADX WARN: Code duplicated, block: B:334:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:335:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:338:0x04d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:340:0x04db  */
    /* JADX WARN: Code duplicated, block: B:343:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:346:0x0518  */
    /* JADX WARN: Code duplicated, block: B:349:0x0579  */
    /* JADX WARN: Code duplicated, block: B:350:0x057c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0586 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:354:0x0588  */
    /* JADX WARN: Code duplicated, block: B:356:0x0608  */
    /* JADX WARN: Code duplicated, block: B:359:0x0634  */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0121  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130 A[ADDED_TO_REGION] */
    public static final void b(y7e1 y7e1Var, qim0 qim0Var, max maxVar, String str, vu30 vu30Var, vu30 vu30Var2, boolean z, boolean z2, dk80 dk80Var, lee1 lee1Var, kua0 kua0Var, yta0 yta0Var, e6e1 e6e1Var, vu30 vu30Var3, idn0 idn0Var, uwg uwgVar, es41 es41Var, vzq0 vzq0Var, float f, boolean z3, zxx zxxVar, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        max maxVar2;
        String str2;
        int i5;
        int i6;
        vu30 vu30Var4;
        int i7;
        int i8;
        vu30 vu30Var5;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        boolean z5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        char c;
        boolean z6;
        e6e1 e6e1Var2;
        vu30 vu30Var6;
        uwg uwgVar2;
        es41 es41Var2;
        vzq0 vzq0Var2;
        float f2;
        boolean z7;
        zxx zxxVar2;
        x340 x340Var;
        String str3;
        max maxVar3;
        vu30 vu30Var7;
        vu30 vu30Var8;
        boolean z8;
        boolean z9;
        dk80 dk80Var2;
        lee1 lee1Var2;
        kua0 kua0Var2;
        yta0 yta0Var2;
        idn0 idn0Var2;
        h311 h311VarV;
        int i27;
        max maxVar4;
        dk80 dk80Var3;
        lee1 lee1Var3;
        kua0 kua0Var3;
        int i28;
        yta0 yta0Var3;
        e6e1 e6e1Var3;
        vu30 vu30Var9;
        int i29;
        int i30;
        idn0 idn0VarY;
        uwg uwgVar3;
        idn0 idn0Var3;
        es41 es41VarC;
        vzq0 zzq0Var;
        float f3;
        boolean z10;
        e6e1 e6e1Var4;
        boolean z11;
        dk80 dk80Var4;
        int i31;
        lee1 lee1Var4;
        int i32;
        idn0 idn0Var4;
        vzq0 vzq0Var3;
        float f4;
        vu30 vu30Var10;
        zxx zxxVarM;
        ven0 ven0VarG;
        x340 x340Var2;
        idn0 idn0Var5;
        long j;
        long j2;
        tob1 tob1VarA;
        tob1 tob1Var;
        long j3;
        x340 x340Var3;
        Object objT;
        m4c m4cVar;
        hdn0 hdn0Var;
        flb0 flb0Var;
        float f5;
        vzq0 vzq0Var4;
        vzq0 vzq0VarJ;
        boolean zC;
        boolean z12;
        boolean zI;
        Object objT2;
        boolean z13;
        boolean z14;
        Object objT3;
        int i33;
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.k0(-1278875185);
        if ((i & 6) == 0) {
            i4 = (x340Var4.i(y7e1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var4.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                maxVar2 = maxVar;
                int i34 = x340Var4.i(maxVar2) ? 256 : 128;
                i4 |= i34;
            } else {
                maxVar2 = maxVar;
            }
            i4 |= i34;
        } else {
            maxVar2 = maxVar;
        }
        int i35 = i3 & 8;
        if (i35 == 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                i4 |= x340Var4.g(str2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            i6 = 8192;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    vu30Var4 = vu30Var;
                    if (x340Var4.i(vu30Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                    vu30Var5 = vu30Var2;
                } else {
                    vu30Var5 = vu30Var2;
                    if ((i & 196608) == 0) {
                        if (x340Var4.i(vu30Var5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & 1572864) == 0) {
                        if (x340Var4.h(z4)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                i13 = 4194304;
                if (i12 != 0) {
                    i4 |= 12582912;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i & 12582912) == 0) {
                        if (x340Var4.h(z5)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i4 |= i14;
                    }
                }
                i15 = i3 & 256;
                i16 = 33554432;
                if (i15 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (x340Var4.i(dk80Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i4 |= i17;
                }
                if ((i & 805306368) != 0) {
                    i4 |= ((i3 & 512) == 0 || !x340Var4.i(lee1Var)) ? 268435456 : 536870912;
                }
                if ((i2 & 6) == 0) {
                    i18 = i2 | (((i3 & 1024) == 0 || !x340Var4.i(kua0Var)) ? 2 : 4);
                } else {
                    i18 = i2;
                }
                i19 = i3 & 2048;
                if (i19 != 0) {
                    if ((i2 & 48) == 0) {
                        if (x340Var4.i(yta0Var)) {
                            i20 = 32;
                        } else {
                            i20 = 16;
                        }
                        i18 |= i20;
                    }
                    if ((i2 & 384) != 0) {
                        i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
                    }
                    i21 = i18;
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                        i23 = i21 | 3072;
                    } else if ((i2 & 3072) == 0) {
                        i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
                    } else {
                        i23 = i21;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0 && x340Var4.i(idn0Var)) {
                            i6 = 16384;
                        }
                        i23 |= i6;
                    }
                    i24 = i3 & 32768;
                    if (i24 != 0) {
                        i23 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        if (x340Var4.i(uwgVar)) {
                            i25 = 131072;
                        } else {
                            i25 = 65536;
                        }
                        i23 |= i25;
                    }
                    if ((i2 & 1572864) != 0) {
                        if ((i3 & 65536) == 0 || !x340Var4.i(es41Var)) {
                            i33 = 524288;
                        } else {
                            i33 = 1048576;
                        }
                        i23 |= i33;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i3 & 131072) == 0 && x340Var4.i(vzq0Var)) {
                            i13 = 8388608;
                        }
                        i23 |= i13;
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i3 & 262144) == 0 && x340Var4.d(f)) {
                            i16 = 67108864;
                        }
                        i23 |= i16;
                    }
                    i26 = i3 & 524288;
                    if (i26 != 0) {
                        i23 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1048576) == 0 || !x340Var4.g(zxxVar)) {
                        c = 2;
                    } else {
                        c = 4;
                    }
                    if ((i4 & 306783379) != 306783378 && (i23 & 306783379) == 306783378 && (c & 3) == 2) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (x340Var4.Y(i4 & 1, z6)) {
                        x340Var4.d0();
                        i27 = i & 1;
                        maxVar4 = jax.a;
                        if (i27 != 0 || x340Var4.E()) {
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                maxVar2 = maxVar4;
                            }
                            if (i35 != 0) {
                                str2 = null;
                            }
                            if (i5 != 0) {
                                vu30Var4 = null;
                            }
                            if (i8 != 0) {
                                vu30Var5 = null;
                            }
                            if (i10 != 0) {
                                z4 = false;
                            }
                            if (i12 != 0) {
                                z5 = false;
                            }
                            if (i15 != 0) {
                                dk80Var3 = null;
                            } else {
                                dk80Var3 = dk80Var;
                            }
                            if ((i3 & 512) != 0) {
                                lee1Var3 = (lee1) x340Var4.k(rgx.a);
                                i4 &= -1879048193;
                            } else {
                                lee1Var3 = lee1Var;
                            }
                            if ((i3 & 1024) != 0) {
                                kua0Var3 = kua0.g;
                                i23 &= -15;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            i28 = i23;
                            if (i19 != 0) {
                                yta0Var3 = null;
                            } else {
                                yta0Var3 = yta0Var;
                            }
                            if ((i3 & 4096) != 0) {
                                e6e1.a.getClass();
                                e6e1Var3 = b6e1.b;
                                i28 &= -897;
                            } else {
                                e6e1Var3 = e6e1Var;
                            }
                            if (i22 != 0) {
                                vu30Var9 = null;
                            } else {
                                vu30Var9 = vu30Var3;
                            }
                            i29 = i28;
                            if ((i3 & 16384) != 0) {
                                idn0VarY = zso1.Y(x340Var4);
                                i30 = i29 & (-57345);
                            } else {
                                i30 = i29;
                                idn0VarY = idn0Var;
                            }
                            if (i24 != 0) {
                                uwgVar3 = null;
                            } else {
                                uwgVar3 = uwgVar;
                            }
                            idn0Var3 = idn0VarY;
                            if ((i3 & 65536) != 0) {
                                es41VarC = l6o1.C(0, 0, 1, x340Var4);
                                i30 &= -3670017;
                            } else {
                                es41VarC = es41Var;
                            }
                            if ((i3 & 131072) != 0) {
                                uwr uwrVar = cbx.a;
                                cvx cvxVar = cbx.b(x340Var4).b;
                                cvx cvxVar2 = cbx.b(x340Var4).b;
                                zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                                i30 &= -29360129;
                            } else {
                                zzq0Var = vzq0Var;
                            }
                            if ((i3 & 262144) != 0) {
                                i30 &= -234881025;
                                f3 = Float.NaN;
                            } else {
                                f3 = f;
                            }
                            if (i26 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i3 & 1048576) != 0) {
                                e6e1Var4 = e6e1Var3;
                                dk80Var4 = dk80Var3;
                                i31 = i4;
                                lee1Var4 = lee1Var3;
                                i32 = i30;
                                vzq0Var3 = zzq0Var;
                                f4 = f3;
                                zxxVarM = pwo1.m(x340Var4);
                                vu30Var10 = vu30Var9;
                                z11 = z10;
                                idn0Var4 = idn0Var3;
                            } else {
                                e6e1Var4 = e6e1Var3;
                                z11 = z10;
                                dk80Var4 = dk80Var3;
                                i31 = i4;
                                lee1Var4 = lee1Var3;
                                i32 = i30;
                                idn0Var4 = idn0Var3;
                                vzq0Var3 = zzq0Var;
                                f4 = f3;
                                vu30Var10 = vu30Var9;
                                zxxVarM = zxxVar;
                            }
                        } else {
                            x340Var4.b0();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i23 &= -15;
                            }
                            int i36 = i23;
                            if ((i3 & 4096) != 0) {
                                i36 &= -897;
                            }
                            if ((i3 & 16384) != 0) {
                                i36 &= -57345;
                            }
                            if ((i3 & 65536) != 0) {
                                i36 &= -3670017;
                            }
                            if ((i3 & 131072) != 0) {
                                i36 &= -29360129;
                            }
                            if ((i3 & 262144) != 0) {
                                i36 &= -234881025;
                            }
                            lee1Var4 = lee1Var;
                            kua0Var3 = kua0Var;
                            yta0Var3 = yta0Var;
                            vu30Var10 = vu30Var3;
                            idn0Var4 = idn0Var;
                            uwgVar3 = uwgVar;
                            es41VarC = es41Var;
                            f4 = f;
                            z11 = z3;
                            i32 = i36;
                            i31 = i4;
                            dk80Var4 = dk80Var;
                            vzq0Var3 = vzq0Var;
                            zxxVarM = zxxVar;
                            e6e1Var4 = e6e1Var;
                        }
                        x340Var4.s();
                        String str4 = str2;
                        int i37 = (i32 >> 12) & 14;
                        ven0VarG = e6p1.g(idn0Var4, x340Var4, i37);
                        if (z5) {
                            x340Var2 = x340Var4;
                            idn0Var5 = idn0Var4;
                            j = zxxVarM.d;
                        } else {
                            x340Var2 = x340Var4;
                            idn0Var5 = idn0Var4;
                            if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                                j = zxxVarM.a;
                            } else {
                                j = zxxVarM.b;
                            }
                        }
                        tob1 tob1VarA2 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j2 = zxxVarM.e;
                        } else {
                            j2 = zxxVarM.f;
                        }
                        tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                        if (z5) {
                            tob1Var = tob1VarA;
                            j3 = zxxVarM.j;
                        } else {
                            tob1Var = tob1VarA;
                            if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                                j3 = zxxVarM.h;
                            } else {
                                j3 = zxxVarM.i;
                            }
                        }
                        x340Var3 = x340Var2;
                        tob1 tob1VarA3 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                        zxx zxxVar3 = zxxVarM;
                        objT = x340Var3.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = bb00.h(0, x340Var3);
                        }
                        hdn0Var = (hdn0) objT;
                        flb0Var = (flb0) x340Var3.k(t4k.n);
                        f5 = Float.NaN;
                        if (p3v.c(f4, Float.NaN)) {
                            vzq0Var4 = vzq0Var3;
                            vzq0VarJ = vzq0Var4;
                        } else {
                            vzq0Var4 = vzq0Var3;
                            vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                            f5 = Float.NaN;
                        }
                        zC = p3v.c(f4, f5);
                        boolean z15 = !zC;
                        if (zC && z11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        float f6 = f4;
                        vu30 vu30Var11 = vu30Var4;
                        dyx dyxVar = new dyx(vzq0VarJ, z12, z15, tob1Var, tob1VarA3, lee1Var4, tob1VarA2, vu30Var11, vu30Var5, f6, hdn0Var, str4, y7e1Var, zxxVar3, e6e1Var4);
                        e6e1Var2 = e6e1Var4;
                        zI = x340Var3.i(maxVar2);
                        objT2 = x340Var3.T();
                        if (zI || objT2 == m4cVar) {
                            objT2 = new rxx(maxVar2, (byte) 1);
                            x340Var3.s0(objT2);
                        }
                        qim0 qim0VarH = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                        boolean zJ = u890.j(maxVar2, maxVar4);
                        lee1 lee1VarA = lee1.a(lee1Var4, ((u7h) tob1VarA2.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                        boolean zI2 = x340Var3.i(hdn0Var);
                        if ((i32 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zI2 | z13;
                        objT3 = x340Var3.T();
                        if (z14 || objT3 == m4cVar) {
                            objT3 = new d0e(vu30Var10, hdn0Var);
                            x340Var3.s0(objT3);
                        }
                        vu30 vu30Var12 = vu30Var10;
                        int i38 = i32 << 18;
                        dk80 dk80Var5 = dk80Var4;
                        xea.c(y7e1Var, qim0VarH, zJ, z4, dk80Var5, lee1VarA, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar3.g), uwgVar3, dyxVar, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i38) | (29360128 & i38) | (i38 & 234881024), i37 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                        maxVar3 = maxVar2;
                        z8 = z4;
                        z9 = z5;
                        yta0Var2 = yta0Var3;
                        uwgVar2 = uwgVar3;
                        z7 = z11;
                        vzq0Var2 = vzq0Var4;
                        f2 = f6;
                        es41Var2 = es41VarC;
                        idn0Var2 = idn0Var5;
                        vu30Var7 = vu30Var11;
                        lee1Var2 = lee1Var4;
                        x340Var = x340Var3;
                        zxxVar2 = zxxVar3;
                        dk80Var2 = dk80Var5;
                        vu30Var8 = vu30Var5;
                        kua0Var2 = kua0Var3;
                        vu30Var6 = vu30Var12;
                        str3 = str4;
                    } else {
                        x340Var4.b0();
                        e6e1Var2 = e6e1Var;
                        vu30Var6 = vu30Var3;
                        uwgVar2 = uwgVar;
                        es41Var2 = es41Var;
                        vzq0Var2 = vzq0Var;
                        f2 = f;
                        z7 = z3;
                        zxxVar2 = zxxVar;
                        x340Var = x340Var4;
                        str3 = str2;
                        maxVar3 = maxVar2;
                        vu30Var7 = vu30Var4;
                        vu30Var8 = vu30Var5;
                        z8 = z4;
                        z9 = z5;
                        dk80Var2 = dk80Var;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        yta0Var2 = yta0Var;
                        idn0Var2 = idn0Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
                    }
                }
                i18 |= 48;
                if ((i2 & 384) != 0) {
                    i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
                }
                i21 = i18;
                i22 = i3 & 8192;
                if (i22 != 0) {
                    i23 = i21 | 3072;
                } else if ((i2 & 3072) == 0) {
                    i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
                } else {
                    i23 = i21;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i6 = 16384;
                    }
                    i23 |= i6;
                }
                i24 = i3 & 32768;
                if (i24 != 0) {
                    i23 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (x340Var4.i(uwgVar)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i23 |= i25;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i23 |= i33;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 131072) == 0) {
                        i13 = 8388608;
                    }
                    i23 |= i13;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i3 & 262144) == 0) {
                        i16 = 67108864;
                    }
                    i23 |= i16;
                }
                i26 = i3 & 524288;
                if (i26 != 0) {
                    i23 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
                }
                if ((i3 & 1048576) == 0) {
                    c = 2;
                } else {
                    c = 2;
                }
                if ((i4 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (x340Var4.Y(i4 & 1, z6)) {
                    x340Var4.d0();
                    i27 = i & 1;
                    maxVar4 = jax.a;
                    if (i27 != 0) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar2 = maxVar4;
                        }
                        if (i35 != 0) {
                            str2 = null;
                        }
                        if (i5 != 0) {
                            vu30Var4 = null;
                        }
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i10 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z5 = false;
                        }
                        if (i15 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i3 & 512) != 0) {
                            lee1Var3 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -1879048193;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            kua0Var3 = kua0.g;
                            i23 &= -15;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i28 = i23;
                        if (i19 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i3 & 4096) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i28 &= -897;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i22 != 0) {
                            vu30Var9 = null;
                        } else {
                            vu30Var9 = vu30Var3;
                        }
                        i29 = i28;
                        if ((i3 & 16384) != 0) {
                            idn0VarY = zso1.Y(x340Var4);
                            i30 = i29 & (-57345);
                        } else {
                            i30 = i29;
                            idn0VarY = idn0Var;
                        }
                        if (i24 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        idn0Var3 = idn0VarY;
                        if ((i3 & 65536) != 0) {
                            es41VarC = l6o1.C(0, 0, 1, x340Var4);
                            i30 &= -3670017;
                        } else {
                            es41VarC = es41Var;
                        }
                        if ((i3 & 131072) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar3 = cbx.b(x340Var4).b;
                            cvx cvxVar4 = cbx.b(x340Var4).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i30 &= -29360129;
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i3 & 262144) != 0) {
                            i30 &= -234881025;
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                        }
                        if (i26 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i3 & 1048576) != 0) {
                            e6e1Var4 = e6e1Var3;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            zxxVarM = pwo1.m(x340Var4);
                            vu30Var10 = vu30Var9;
                            z11 = z10;
                            idn0Var4 = idn0Var3;
                        } else {
                            e6e1Var4 = e6e1Var3;
                            z11 = z10;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            idn0Var4 = idn0Var3;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            vu30Var10 = vu30Var9;
                            zxxVarM = zxxVar;
                        }
                    } else {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar2 = maxVar4;
                        }
                        if (i35 != 0) {
                            str2 = null;
                        }
                        if (i5 != 0) {
                            vu30Var4 = null;
                        }
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i10 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z5 = false;
                        }
                        if (i15 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i3 & 512) != 0) {
                            lee1Var3 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -1879048193;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            kua0Var3 = kua0.g;
                            i23 &= -15;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i28 = i23;
                        if (i19 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i3 & 4096) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i28 &= -897;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i22 != 0) {
                            vu30Var9 = null;
                        } else {
                            vu30Var9 = vu30Var3;
                        }
                        i29 = i28;
                        if ((i3 & 16384) != 0) {
                            idn0VarY = zso1.Y(x340Var4);
                            i30 = i29 & (-57345);
                        } else {
                            i30 = i29;
                            idn0VarY = idn0Var;
                        }
                        if (i24 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        idn0Var3 = idn0VarY;
                        if ((i3 & 65536) != 0) {
                            es41VarC = l6o1.C(0, 0, 1, x340Var4);
                            i30 &= -3670017;
                        } else {
                            es41VarC = es41Var;
                        }
                        if ((i3 & 131072) != 0) {
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar5 = cbx.b(x340Var4).b;
                            cvx cvxVar6 = cbx.b(x340Var4).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i30 &= -29360129;
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i3 & 262144) != 0) {
                            i30 &= -234881025;
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                        }
                        if (i26 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i3 & 1048576) != 0) {
                            e6e1Var4 = e6e1Var3;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            zxxVarM = pwo1.m(x340Var4);
                            vu30Var10 = vu30Var9;
                            z11 = z10;
                            idn0Var4 = idn0Var3;
                        } else {
                            e6e1Var4 = e6e1Var3;
                            z11 = z10;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            idn0Var4 = idn0Var3;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            vu30Var10 = vu30Var9;
                            zxxVarM = zxxVar;
                        }
                    }
                    x340Var4.s();
                    String str5 = str2;
                    int i39 = (i32 >> 12) & 14;
                    ven0VarG = e6p1.g(idn0Var4, x340Var4, i39);
                    if (z5) {
                        x340Var2 = x340Var4;
                        idn0Var5 = idn0Var4;
                        j = zxxVarM.d;
                    } else {
                        x340Var2 = x340Var4;
                        idn0Var5 = idn0Var4;
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j = zxxVarM.a;
                        } else {
                            j = zxxVarM.b;
                        }
                    }
                    tob1 tob1VarA4 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j2 = zxxVarM.e;
                    } else {
                        j2 = zxxVarM.f;
                    }
                    tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                    if (z5) {
                        tob1Var = tob1VarA;
                        j3 = zxxVarM.j;
                    } else {
                        tob1Var = tob1VarA;
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j3 = zxxVarM.h;
                        } else {
                            j3 = zxxVarM.i;
                        }
                    }
                    x340Var3 = x340Var2;
                    tob1 tob1VarA5 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                    zxx zxxVar4 = zxxVarM;
                    objT = x340Var3.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = bb00.h(0, x340Var3);
                    }
                    hdn0Var = (hdn0) objT;
                    flb0Var = (flb0) x340Var3.k(t4k.n);
                    f5 = Float.NaN;
                    if (p3v.c(f4, Float.NaN)) {
                        vzq0Var4 = vzq0Var3;
                        vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                        f5 = Float.NaN;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vzq0VarJ = vzq0Var4;
                    }
                    zC = p3v.c(f4, f5);
                    boolean z16 = !zC;
                    if (zC) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    float f7 = f4;
                    vu30 vu30Var13 = vu30Var4;
                    dyx dyxVar2 = new dyx(vzq0VarJ, z12, z16, tob1Var, tob1VarA5, lee1Var4, tob1VarA4, vu30Var13, vu30Var5, f7, hdn0Var, str5, y7e1Var, zxxVar4, e6e1Var4);
                    e6e1Var2 = e6e1Var4;
                    zI = x340Var3.i(maxVar2);
                    objT2 = x340Var3.T();
                    if (zI) {
                        objT2 = new rxx(maxVar2, (byte) 1);
                        x340Var3.s0(objT2);
                    } else {
                        objT2 = new rxx(maxVar2, (byte) 1);
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarH2 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                    boolean zJ2 = u890.j(maxVar2, maxVar4);
                    lee1 lee1VarA2 = lee1.a(lee1Var4, ((u7h) tob1VarA4.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                    boolean zI3 = x340Var3.i(hdn0Var);
                    if ((i32 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zI3 | z13;
                    objT3 = x340Var3.T();
                    if (z14) {
                        objT3 = new d0e(vu30Var10, hdn0Var);
                        x340Var3.s0(objT3);
                    } else {
                        objT3 = new d0e(vu30Var10, hdn0Var);
                        x340Var3.s0(objT3);
                    }
                    vu30 vu30Var14 = vu30Var10;
                    int i310 = i32 << 18;
                    dk80 dk80Var6 = dk80Var4;
                    xea.c(y7e1Var, qim0VarH2, zJ2, z4, dk80Var6, lee1VarA2, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar4.g), uwgVar3, dyxVar2, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i310) | (29360128 & i310) | (i310 & 234881024), i39 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                    maxVar3 = maxVar2;
                    z8 = z4;
                    z9 = z5;
                    yta0Var2 = yta0Var3;
                    uwgVar2 = uwgVar3;
                    z7 = z11;
                    vzq0Var2 = vzq0Var4;
                    f2 = f7;
                    es41Var2 = es41VarC;
                    idn0Var2 = idn0Var5;
                    vu30Var7 = vu30Var13;
                    lee1Var2 = lee1Var4;
                    x340Var = x340Var3;
                    zxxVar2 = zxxVar4;
                    dk80Var2 = dk80Var6;
                    vu30Var8 = vu30Var5;
                    kua0Var2 = kua0Var3;
                    vu30Var6 = vu30Var14;
                    str3 = str5;
                } else {
                    x340Var4.b0();
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z7 = z3;
                    zxxVar2 = zxxVar;
                    x340Var = x340Var4;
                    str3 = str2;
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    z8 = z4;
                    z9 = z5;
                    dk80Var2 = dk80Var;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    yta0Var2 = yta0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
                }
            }
            i4 |= 24576;
            vu30Var4 = vu30Var;
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                vu30Var5 = vu30Var2;
            } else {
                vu30Var5 = vu30Var2;
                if ((i & 196608) == 0) {
                    if (x340Var4.i(vu30Var5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 1572864) == 0) {
                    if (x340Var4.h(z4)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            i13 = 4194304;
            if (i12 != 0) {
                i4 |= 12582912;
                z5 = z2;
            } else {
                z5 = z2;
                if ((i & 12582912) == 0) {
                    if (x340Var4.h(z5)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & 256;
            i16 = 33554432;
            if (i15 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (x340Var4.i(dk80Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i4 |= i17;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !x340Var4.i(lee1Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i18 = i2 | (((i3 & 1024) == 0 || !x340Var4.i(kua0Var)) ? 2 : 4);
            } else {
                i18 = i2;
            }
            i19 = i3 & 2048;
            if (i19 != 0) {
                if ((i2 & 48) == 0) {
                    if (x340Var4.i(yta0Var)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i18 |= i20;
                }
                if ((i2 & 384) != 0) {
                    i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
                }
                i21 = i18;
                i22 = i3 & 8192;
                if (i22 != 0) {
                    i23 = i21 | 3072;
                } else if ((i2 & 3072) == 0) {
                    i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
                } else {
                    i23 = i21;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i6 = 16384;
                    }
                    i23 |= i6;
                }
                i24 = i3 & 32768;
                if (i24 != 0) {
                    i23 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (x340Var4.i(uwgVar)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i23 |= i25;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i23 |= i33;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 131072) == 0) {
                        i13 = 8388608;
                    }
                    i23 |= i13;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i3 & 262144) == 0) {
                        i16 = 67108864;
                    }
                    i23 |= i16;
                }
                i26 = i3 & 524288;
                if (i26 != 0) {
                    i23 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
                }
                if ((i3 & 1048576) == 0) {
                    c = 2;
                } else {
                    c = 2;
                }
                if ((i4 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (x340Var4.Y(i4 & 1, z6)) {
                    x340Var4.d0();
                    i27 = i & 1;
                    maxVar4 = jax.a;
                    if (i27 != 0) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar2 = maxVar4;
                        }
                        if (i35 != 0) {
                            str2 = null;
                        }
                        if (i5 != 0) {
                            vu30Var4 = null;
                        }
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i10 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z5 = false;
                        }
                        if (i15 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i3 & 512) != 0) {
                            lee1Var3 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -1879048193;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            kua0Var3 = kua0.g;
                            i23 &= -15;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i28 = i23;
                        if (i19 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i3 & 4096) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i28 &= -897;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i22 != 0) {
                            vu30Var9 = null;
                        } else {
                            vu30Var9 = vu30Var3;
                        }
                        i29 = i28;
                        if ((i3 & 16384) != 0) {
                            idn0VarY = zso1.Y(x340Var4);
                            i30 = i29 & (-57345);
                        } else {
                            i30 = i29;
                            idn0VarY = idn0Var;
                        }
                        if (i24 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        idn0Var3 = idn0VarY;
                        if ((i3 & 65536) != 0) {
                            es41VarC = l6o1.C(0, 0, 1, x340Var4);
                            i30 &= -3670017;
                        } else {
                            es41VarC = es41Var;
                        }
                        if ((i3 & 131072) != 0) {
                            uwr uwrVar4 = cbx.a;
                            cvx cvxVar7 = cbx.b(x340Var4).b;
                            cvx cvxVar8 = cbx.b(x340Var4).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i30 &= -29360129;
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i3 & 262144) != 0) {
                            i30 &= -234881025;
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                        }
                        if (i26 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i3 & 1048576) != 0) {
                            e6e1Var4 = e6e1Var3;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            zxxVarM = pwo1.m(x340Var4);
                            vu30Var10 = vu30Var9;
                            z11 = z10;
                            idn0Var4 = idn0Var3;
                        } else {
                            e6e1Var4 = e6e1Var3;
                            z11 = z10;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            idn0Var4 = idn0Var3;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            vu30Var10 = vu30Var9;
                            zxxVarM = zxxVar;
                        }
                    } else {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar2 = maxVar4;
                        }
                        if (i35 != 0) {
                            str2 = null;
                        }
                        if (i5 != 0) {
                            vu30Var4 = null;
                        }
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i10 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z5 = false;
                        }
                        if (i15 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i3 & 512) != 0) {
                            lee1Var3 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -1879048193;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            kua0Var3 = kua0.g;
                            i23 &= -15;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i28 = i23;
                        if (i19 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i3 & 4096) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i28 &= -897;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i22 != 0) {
                            vu30Var9 = null;
                        } else {
                            vu30Var9 = vu30Var3;
                        }
                        i29 = i28;
                        if ((i3 & 16384) != 0) {
                            idn0VarY = zso1.Y(x340Var4);
                            i30 = i29 & (-57345);
                        } else {
                            i30 = i29;
                            idn0VarY = idn0Var;
                        }
                        if (i24 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        idn0Var3 = idn0VarY;
                        if ((i3 & 65536) != 0) {
                            es41VarC = l6o1.C(0, 0, 1, x340Var4);
                            i30 &= -3670017;
                        } else {
                            es41VarC = es41Var;
                        }
                        if ((i3 & 131072) != 0) {
                            uwr uwrVar5 = cbx.a;
                            cvx cvxVar9 = cbx.b(x340Var4).b;
                            cvx cvxVar10 = cbx.b(x340Var4).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i30 &= -29360129;
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i3 & 262144) != 0) {
                            i30 &= -234881025;
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                        }
                        if (i26 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i3 & 1048576) != 0) {
                            e6e1Var4 = e6e1Var3;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            zxxVarM = pwo1.m(x340Var4);
                            vu30Var10 = vu30Var9;
                            z11 = z10;
                            idn0Var4 = idn0Var3;
                        } else {
                            e6e1Var4 = e6e1Var3;
                            z11 = z10;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            idn0Var4 = idn0Var3;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            vu30Var10 = vu30Var9;
                            zxxVarM = zxxVar;
                        }
                    }
                    x340Var4.s();
                    String str6 = str2;
                    int i311 = (i32 >> 12) & 14;
                    ven0VarG = e6p1.g(idn0Var4, x340Var4, i311);
                    if (z5) {
                        x340Var2 = x340Var4;
                        idn0Var5 = idn0Var4;
                        j = zxxVarM.d;
                    } else {
                        x340Var2 = x340Var4;
                        idn0Var5 = idn0Var4;
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j = zxxVarM.a;
                        } else {
                            j = zxxVarM.b;
                        }
                    }
                    tob1 tob1VarA6 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j2 = zxxVarM.e;
                    } else {
                        j2 = zxxVarM.f;
                    }
                    tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                    if (z5) {
                        tob1Var = tob1VarA;
                        j3 = zxxVarM.j;
                    } else {
                        tob1Var = tob1VarA;
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j3 = zxxVarM.h;
                        } else {
                            j3 = zxxVarM.i;
                        }
                    }
                    x340Var3 = x340Var2;
                    tob1 tob1VarA7 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                    zxx zxxVar5 = zxxVarM;
                    objT = x340Var3.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = bb00.h(0, x340Var3);
                    }
                    hdn0Var = (hdn0) objT;
                    flb0Var = (flb0) x340Var3.k(t4k.n);
                    f5 = Float.NaN;
                    if (p3v.c(f4, Float.NaN)) {
                        vzq0Var4 = vzq0Var3;
                        vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                        f5 = Float.NaN;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vzq0VarJ = vzq0Var4;
                    }
                    zC = p3v.c(f4, f5);
                    boolean z17 = !zC;
                    if (zC) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    float f8 = f4;
                    vu30 vu30Var15 = vu30Var4;
                    dyx dyxVar3 = new dyx(vzq0VarJ, z12, z17, tob1Var, tob1VarA7, lee1Var4, tob1VarA6, vu30Var15, vu30Var5, f8, hdn0Var, str6, y7e1Var, zxxVar5, e6e1Var4);
                    e6e1Var2 = e6e1Var4;
                    zI = x340Var3.i(maxVar2);
                    objT2 = x340Var3.T();
                    if (zI) {
                        objT2 = new rxx(maxVar2, (byte) 1);
                        x340Var3.s0(objT2);
                    } else {
                        objT2 = new rxx(maxVar2, (byte) 1);
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarH3 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                    boolean zJ3 = u890.j(maxVar2, maxVar4);
                    lee1 lee1VarA3 = lee1.a(lee1Var4, ((u7h) tob1VarA6.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                    boolean zI4 = x340Var3.i(hdn0Var);
                    if ((i32 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zI4 | z13;
                    objT3 = x340Var3.T();
                    if (z14) {
                        objT3 = new d0e(vu30Var10, hdn0Var);
                        x340Var3.s0(objT3);
                    } else {
                        objT3 = new d0e(vu30Var10, hdn0Var);
                        x340Var3.s0(objT3);
                    }
                    vu30 vu30Var16 = vu30Var10;
                    int i312 = i32 << 18;
                    dk80 dk80Var7 = dk80Var4;
                    xea.c(y7e1Var, qim0VarH3, zJ3, z4, dk80Var7, lee1VarA3, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar5.g), uwgVar3, dyxVar3, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i312) | (29360128 & i312) | (i312 & 234881024), i311 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                    maxVar3 = maxVar2;
                    z8 = z4;
                    z9 = z5;
                    yta0Var2 = yta0Var3;
                    uwgVar2 = uwgVar3;
                    z7 = z11;
                    vzq0Var2 = vzq0Var4;
                    f2 = f8;
                    es41Var2 = es41VarC;
                    idn0Var2 = idn0Var5;
                    vu30Var7 = vu30Var15;
                    lee1Var2 = lee1Var4;
                    x340Var = x340Var3;
                    zxxVar2 = zxxVar5;
                    dk80Var2 = dk80Var7;
                    vu30Var8 = vu30Var5;
                    kua0Var2 = kua0Var3;
                    vu30Var6 = vu30Var16;
                    str3 = str6;
                } else {
                    x340Var4.b0();
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z7 = z3;
                    zxxVar2 = zxxVar;
                    x340Var = x340Var4;
                    str3 = str2;
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    z8 = z4;
                    z9 = z5;
                    dk80Var2 = dk80Var;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    yta0Var2 = yta0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
                }
            }
            i18 |= 48;
            if ((i2 & 384) != 0) {
                i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
            }
            i21 = i18;
            i22 = i3 & 8192;
            if (i22 != 0) {
                i23 = i21 | 3072;
            } else if ((i2 & 3072) == 0) {
                i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
            } else {
                i23 = i21;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i6 = 16384;
                }
                i23 |= i6;
            }
            i24 = i3 & 32768;
            if (i24 != 0) {
                i23 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (x340Var4.i(uwgVar)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i23 |= i25;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i23 |= i33;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 131072) == 0) {
                    i13 = 8388608;
                }
                i23 |= i13;
            }
            if ((i2 & 100663296) != 0) {
                if ((i3 & 262144) == 0) {
                    i16 = 67108864;
                }
                i23 |= i16;
            }
            i26 = i3 & 524288;
            if (i26 != 0) {
                i23 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
            }
            if ((i3 & 1048576) == 0) {
                c = 2;
            } else {
                c = 2;
            }
            if ((i4 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (x340Var4.Y(i4 & 1, z6)) {
                x340Var4.d0();
                i27 = i & 1;
                maxVar4 = jax.a;
                if (i27 != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar2 = maxVar4;
                    }
                    if (i35 != 0) {
                        str2 = null;
                    }
                    if (i5 != 0) {
                        vu30Var4 = null;
                    }
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i10 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i3 & 512) != 0) {
                        lee1Var3 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -1879048193;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        kua0Var3 = kua0.g;
                        i23 &= -15;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i28 = i23;
                    if (i19 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i3 & 4096) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i28 &= -897;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i22 != 0) {
                        vu30Var9 = null;
                    } else {
                        vu30Var9 = vu30Var3;
                    }
                    i29 = i28;
                    if ((i3 & 16384) != 0) {
                        idn0VarY = zso1.Y(x340Var4);
                        i30 = i29 & (-57345);
                    } else {
                        i30 = i29;
                        idn0VarY = idn0Var;
                    }
                    if (i24 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    idn0Var3 = idn0VarY;
                    if ((i3 & 65536) != 0) {
                        es41VarC = l6o1.C(0, 0, 1, x340Var4);
                        i30 &= -3670017;
                    } else {
                        es41VarC = es41Var;
                    }
                    if ((i3 & 131072) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar11 = cbx.b(x340Var4).b;
                        cvx cvxVar12 = cbx.b(x340Var4).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i30 &= -29360129;
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i3 & 262144) != 0) {
                        i30 &= -234881025;
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                    }
                    if (i26 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i3 & 1048576) != 0) {
                        e6e1Var4 = e6e1Var3;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        zxxVarM = pwo1.m(x340Var4);
                        vu30Var10 = vu30Var9;
                        z11 = z10;
                        idn0Var4 = idn0Var3;
                    } else {
                        e6e1Var4 = e6e1Var3;
                        z11 = z10;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        idn0Var4 = idn0Var3;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        vu30Var10 = vu30Var9;
                        zxxVarM = zxxVar;
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar2 = maxVar4;
                    }
                    if (i35 != 0) {
                        str2 = null;
                    }
                    if (i5 != 0) {
                        vu30Var4 = null;
                    }
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i10 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i3 & 512) != 0) {
                        lee1Var3 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -1879048193;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        kua0Var3 = kua0.g;
                        i23 &= -15;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i28 = i23;
                    if (i19 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i3 & 4096) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i28 &= -897;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i22 != 0) {
                        vu30Var9 = null;
                    } else {
                        vu30Var9 = vu30Var3;
                    }
                    i29 = i28;
                    if ((i3 & 16384) != 0) {
                        idn0VarY = zso1.Y(x340Var4);
                        i30 = i29 & (-57345);
                    } else {
                        i30 = i29;
                        idn0VarY = idn0Var;
                    }
                    if (i24 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    idn0Var3 = idn0VarY;
                    if ((i3 & 65536) != 0) {
                        es41VarC = l6o1.C(0, 0, 1, x340Var4);
                        i30 &= -3670017;
                    } else {
                        es41VarC = es41Var;
                    }
                    if ((i3 & 131072) != 0) {
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar13 = cbx.b(x340Var4).b;
                        cvx cvxVar14 = cbx.b(x340Var4).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i30 &= -29360129;
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i3 & 262144) != 0) {
                        i30 &= -234881025;
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                    }
                    if (i26 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i3 & 1048576) != 0) {
                        e6e1Var4 = e6e1Var3;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        zxxVarM = pwo1.m(x340Var4);
                        vu30Var10 = vu30Var9;
                        z11 = z10;
                        idn0Var4 = idn0Var3;
                    } else {
                        e6e1Var4 = e6e1Var3;
                        z11 = z10;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        idn0Var4 = idn0Var3;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        vu30Var10 = vu30Var9;
                        zxxVarM = zxxVar;
                    }
                }
                x340Var4.s();
                String str7 = str2;
                int i313 = (i32 >> 12) & 14;
                ven0VarG = e6p1.g(idn0Var4, x340Var4, i313);
                if (z5) {
                    x340Var2 = x340Var4;
                    idn0Var5 = idn0Var4;
                    j = zxxVarM.d;
                } else {
                    x340Var2 = x340Var4;
                    idn0Var5 = idn0Var4;
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j = zxxVarM.a;
                    } else {
                        j = zxxVarM.b;
                    }
                }
                tob1 tob1VarA8 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    j2 = zxxVarM.e;
                } else {
                    j2 = zxxVarM.f;
                }
                tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                if (z5) {
                    tob1Var = tob1VarA;
                    j3 = zxxVarM.j;
                } else {
                    tob1Var = tob1VarA;
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j3 = zxxVarM.h;
                    } else {
                        j3 = zxxVarM.i;
                    }
                }
                x340Var3 = x340Var2;
                tob1 tob1VarA9 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                zxx zxxVar6 = zxxVarM;
                objT = x340Var3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = bb00.h(0, x340Var3);
                }
                hdn0Var = (hdn0) objT;
                flb0Var = (flb0) x340Var3.k(t4k.n);
                f5 = Float.NaN;
                if (p3v.c(f4, Float.NaN)) {
                    vzq0Var4 = vzq0Var3;
                    vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                    f5 = Float.NaN;
                } else {
                    vzq0Var4 = vzq0Var3;
                    vzq0VarJ = vzq0Var4;
                }
                zC = p3v.c(f4, f5);
                boolean z18 = !zC;
                if (zC) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                float f9 = f4;
                vu30 vu30Var17 = vu30Var4;
                dyx dyxVar4 = new dyx(vzq0VarJ, z12, z18, tob1Var, tob1VarA9, lee1Var4, tob1VarA8, vu30Var17, vu30Var5, f9, hdn0Var, str7, y7e1Var, zxxVar6, e6e1Var4);
                e6e1Var2 = e6e1Var4;
                zI = x340Var3.i(maxVar2);
                objT2 = x340Var3.T();
                if (zI) {
                    objT2 = new rxx(maxVar2, (byte) 1);
                    x340Var3.s0(objT2);
                } else {
                    objT2 = new rxx(maxVar2, (byte) 1);
                    x340Var3.s0(objT2);
                }
                qim0 qim0VarH4 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                boolean zJ4 = u890.j(maxVar2, maxVar4);
                lee1 lee1VarA4 = lee1.a(lee1Var4, ((u7h) tob1VarA8.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                boolean zI5 = x340Var3.i(hdn0Var);
                if ((i32 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zI5 | z13;
                objT3 = x340Var3.T();
                if (z14) {
                    objT3 = new d0e(vu30Var10, hdn0Var);
                    x340Var3.s0(objT3);
                } else {
                    objT3 = new d0e(vu30Var10, hdn0Var);
                    x340Var3.s0(objT3);
                }
                vu30 vu30Var18 = vu30Var10;
                int i314 = i32 << 18;
                dk80 dk80Var8 = dk80Var4;
                xea.c(y7e1Var, qim0VarH4, zJ4, z4, dk80Var8, lee1VarA4, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar6.g), uwgVar3, dyxVar4, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i314) | (29360128 & i314) | (i314 & 234881024), i313 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                maxVar3 = maxVar2;
                z8 = z4;
                z9 = z5;
                yta0Var2 = yta0Var3;
                uwgVar2 = uwgVar3;
                z7 = z11;
                vzq0Var2 = vzq0Var4;
                f2 = f9;
                es41Var2 = es41VarC;
                idn0Var2 = idn0Var5;
                vu30Var7 = vu30Var17;
                lee1Var2 = lee1Var4;
                x340Var = x340Var3;
                zxxVar2 = zxxVar6;
                dk80Var2 = dk80Var8;
                vu30Var8 = vu30Var5;
                kua0Var2 = kua0Var3;
                vu30Var6 = vu30Var18;
                str3 = str7;
            } else {
                x340Var4.b0();
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z7 = z3;
                zxxVar2 = zxxVar;
                x340Var = x340Var4;
                str3 = str2;
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                z8 = z4;
                z9 = z5;
                dk80Var2 = dk80Var;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                yta0Var2 = yta0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
            }
        }
        i4 |= 3072;
        str2 = str;
        i5 = i3 & 16;
        i6 = 8192;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                vu30Var4 = vu30Var;
                if (x340Var4.i(vu30Var4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                vu30Var5 = vu30Var2;
            } else {
                vu30Var5 = vu30Var2;
                if ((i & 196608) == 0) {
                    if (x340Var4.i(vu30Var5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 1572864) == 0) {
                    if (x340Var4.h(z4)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            i13 = 4194304;
            if (i12 != 0) {
                i4 |= 12582912;
                z5 = z2;
            } else {
                z5 = z2;
                if ((i & 12582912) == 0) {
                    if (x340Var4.h(z5)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i4 |= i14;
                }
            }
            i15 = i3 & 256;
            i16 = 33554432;
            if (i15 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (x340Var4.i(dk80Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i4 |= i17;
            }
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & 512) == 0 || !x340Var4.i(lee1Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i18 = i2 | (((i3 & 1024) == 0 || !x340Var4.i(kua0Var)) ? 2 : 4);
            } else {
                i18 = i2;
            }
            i19 = i3 & 2048;
            if (i19 != 0) {
                if ((i2 & 48) == 0) {
                    if (x340Var4.i(yta0Var)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i18 |= i20;
                }
                if ((i2 & 384) != 0) {
                    i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
                }
                i21 = i18;
                i22 = i3 & 8192;
                if (i22 != 0) {
                    i23 = i21 | 3072;
                } else if ((i2 & 3072) == 0) {
                    i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
                } else {
                    i23 = i21;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i6 = 16384;
                    }
                    i23 |= i6;
                }
                i24 = i3 & 32768;
                if (i24 != 0) {
                    i23 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (x340Var4.i(uwgVar)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i23 |= i25;
                }
                if ((i2 & 1572864) != 0) {
                    if ((i3 & 65536) == 0) {
                        i33 = 524288;
                    } else {
                        i33 = 524288;
                    }
                    i23 |= i33;
                }
                if ((i2 & 12582912) != 0) {
                    if ((i3 & 131072) == 0) {
                        i13 = 8388608;
                    }
                    i23 |= i13;
                }
                if ((i2 & 100663296) != 0) {
                    if ((i3 & 262144) == 0) {
                        i16 = 67108864;
                    }
                    i23 |= i16;
                }
                i26 = i3 & 524288;
                if (i26 != 0) {
                    i23 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
                }
                if ((i3 & 1048576) == 0) {
                    c = 2;
                } else {
                    c = 2;
                }
                if ((i4 & 306783379) != 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (x340Var4.Y(i4 & 1, z6)) {
                    x340Var4.d0();
                    i27 = i & 1;
                    maxVar4 = jax.a;
                    if (i27 != 0) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar2 = maxVar4;
                        }
                        if (i35 != 0) {
                            str2 = null;
                        }
                        if (i5 != 0) {
                            vu30Var4 = null;
                        }
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i10 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z5 = false;
                        }
                        if (i15 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i3 & 512) != 0) {
                            lee1Var3 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -1879048193;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            kua0Var3 = kua0.g;
                            i23 &= -15;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i28 = i23;
                        if (i19 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i3 & 4096) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i28 &= -897;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i22 != 0) {
                            vu30Var9 = null;
                        } else {
                            vu30Var9 = vu30Var3;
                        }
                        i29 = i28;
                        if ((i3 & 16384) != 0) {
                            idn0VarY = zso1.Y(x340Var4);
                            i30 = i29 & (-57345);
                        } else {
                            i30 = i29;
                            idn0VarY = idn0Var;
                        }
                        if (i24 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        idn0Var3 = idn0VarY;
                        if ((i3 & 65536) != 0) {
                            es41VarC = l6o1.C(0, 0, 1, x340Var4);
                            i30 &= -3670017;
                        } else {
                            es41VarC = es41Var;
                        }
                        if ((i3 & 131072) != 0) {
                            uwr uwrVar8 = cbx.a;
                            cvx cvxVar15 = cbx.b(x340Var4).b;
                            cvx cvxVar16 = cbx.b(x340Var4).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i30 &= -29360129;
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i3 & 262144) != 0) {
                            i30 &= -234881025;
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                        }
                        if (i26 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i3 & 1048576) != 0) {
                            e6e1Var4 = e6e1Var3;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            zxxVarM = pwo1.m(x340Var4);
                            vu30Var10 = vu30Var9;
                            z11 = z10;
                            idn0Var4 = idn0Var3;
                        } else {
                            e6e1Var4 = e6e1Var3;
                            z11 = z10;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            idn0Var4 = idn0Var3;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            vu30Var10 = vu30Var9;
                            zxxVarM = zxxVar;
                        }
                    } else {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar2 = maxVar4;
                        }
                        if (i35 != 0) {
                            str2 = null;
                        }
                        if (i5 != 0) {
                            vu30Var4 = null;
                        }
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i10 != 0) {
                            z4 = false;
                        }
                        if (i12 != 0) {
                            z5 = false;
                        }
                        if (i15 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        if ((i3 & 512) != 0) {
                            lee1Var3 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -1879048193;
                        } else {
                            lee1Var3 = lee1Var;
                        }
                        if ((i3 & 1024) != 0) {
                            kua0Var3 = kua0.g;
                            i23 &= -15;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        i28 = i23;
                        if (i19 != 0) {
                            yta0Var3 = null;
                        } else {
                            yta0Var3 = yta0Var;
                        }
                        if ((i3 & 4096) != 0) {
                            e6e1.a.getClass();
                            e6e1Var3 = b6e1.b;
                            i28 &= -897;
                        } else {
                            e6e1Var3 = e6e1Var;
                        }
                        if (i22 != 0) {
                            vu30Var9 = null;
                        } else {
                            vu30Var9 = vu30Var3;
                        }
                        i29 = i28;
                        if ((i3 & 16384) != 0) {
                            idn0VarY = zso1.Y(x340Var4);
                            i30 = i29 & (-57345);
                        } else {
                            i30 = i29;
                            idn0VarY = idn0Var;
                        }
                        if (i24 != 0) {
                            uwgVar3 = null;
                        } else {
                            uwgVar3 = uwgVar;
                        }
                        idn0Var3 = idn0VarY;
                        if ((i3 & 65536) != 0) {
                            es41VarC = l6o1.C(0, 0, 1, x340Var4);
                            i30 &= -3670017;
                        } else {
                            es41VarC = es41Var;
                        }
                        if ((i3 & 131072) != 0) {
                            uwr uwrVar9 = cbx.a;
                            cvx cvxVar17 = cbx.b(x340Var4).b;
                            cvx cvxVar18 = cbx.b(x340Var4).b;
                            zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                            i30 &= -29360129;
                        } else {
                            zzq0Var = vzq0Var;
                        }
                        if ((i3 & 262144) != 0) {
                            i30 &= -234881025;
                            f3 = Float.NaN;
                        } else {
                            f3 = f;
                        }
                        if (i26 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i3 & 1048576) != 0) {
                            e6e1Var4 = e6e1Var3;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            zxxVarM = pwo1.m(x340Var4);
                            vu30Var10 = vu30Var9;
                            z11 = z10;
                            idn0Var4 = idn0Var3;
                        } else {
                            e6e1Var4 = e6e1Var3;
                            z11 = z10;
                            dk80Var4 = dk80Var3;
                            i31 = i4;
                            lee1Var4 = lee1Var3;
                            i32 = i30;
                            idn0Var4 = idn0Var3;
                            vzq0Var3 = zzq0Var;
                            f4 = f3;
                            vu30Var10 = vu30Var9;
                            zxxVarM = zxxVar;
                        }
                    }
                    x340Var4.s();
                    String str8 = str2;
                    int i315 = (i32 >> 12) & 14;
                    ven0VarG = e6p1.g(idn0Var4, x340Var4, i315);
                    if (z5) {
                        x340Var2 = x340Var4;
                        idn0Var5 = idn0Var4;
                        j = zxxVarM.d;
                    } else {
                        x340Var2 = x340Var4;
                        idn0Var5 = idn0Var4;
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j = zxxVarM.a;
                        } else {
                            j = zxxVarM.b;
                        }
                    }
                    tob1 tob1VarA10 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j2 = zxxVarM.e;
                    } else {
                        j2 = zxxVarM.f;
                    }
                    tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                    if (z5) {
                        tob1Var = tob1VarA;
                        j3 = zxxVarM.j;
                    } else {
                        tob1Var = tob1VarA;
                        if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                            j3 = zxxVarM.h;
                        } else {
                            j3 = zxxVarM.i;
                        }
                    }
                    x340Var3 = x340Var2;
                    tob1 tob1VarA11 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                    zxx zxxVar7 = zxxVarM;
                    objT = x340Var3.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = bb00.h(0, x340Var3);
                    }
                    hdn0Var = (hdn0) objT;
                    flb0Var = (flb0) x340Var3.k(t4k.n);
                    f5 = Float.NaN;
                    if (p3v.c(f4, Float.NaN)) {
                        vzq0Var4 = vzq0Var3;
                        vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                        f5 = Float.NaN;
                    } else {
                        vzq0Var4 = vzq0Var3;
                        vzq0VarJ = vzq0Var4;
                    }
                    zC = p3v.c(f4, f5);
                    boolean z19 = !zC;
                    if (zC) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    float f10 = f4;
                    vu30 vu30Var19 = vu30Var4;
                    dyx dyxVar5 = new dyx(vzq0VarJ, z12, z19, tob1Var, tob1VarA11, lee1Var4, tob1VarA10, vu30Var19, vu30Var5, f10, hdn0Var, str8, y7e1Var, zxxVar7, e6e1Var4);
                    e6e1Var2 = e6e1Var4;
                    zI = x340Var3.i(maxVar2);
                    objT2 = x340Var3.T();
                    if (zI) {
                        objT2 = new rxx(maxVar2, (byte) 1);
                        x340Var3.s0(objT2);
                    } else {
                        objT2 = new rxx(maxVar2, (byte) 1);
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarH5 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                    boolean zJ5 = u890.j(maxVar2, maxVar4);
                    lee1 lee1VarA5 = lee1.a(lee1Var4, ((u7h) tob1VarA10.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                    boolean zI6 = x340Var3.i(hdn0Var);
                    if ((i32 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zI6 | z13;
                    objT3 = x340Var3.T();
                    if (z14) {
                        objT3 = new d0e(vu30Var10, hdn0Var);
                        x340Var3.s0(objT3);
                    } else {
                        objT3 = new d0e(vu30Var10, hdn0Var);
                        x340Var3.s0(objT3);
                    }
                    vu30 vu30Var110 = vu30Var10;
                    int i316 = i32 << 18;
                    dk80 dk80Var9 = dk80Var4;
                    xea.c(y7e1Var, qim0VarH5, zJ5, z4, dk80Var9, lee1VarA5, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar7.g), uwgVar3, dyxVar5, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i316) | (29360128 & i316) | (i316 & 234881024), i315 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                    maxVar3 = maxVar2;
                    z8 = z4;
                    z9 = z5;
                    yta0Var2 = yta0Var3;
                    uwgVar2 = uwgVar3;
                    z7 = z11;
                    vzq0Var2 = vzq0Var4;
                    f2 = f10;
                    es41Var2 = es41VarC;
                    idn0Var2 = idn0Var5;
                    vu30Var7 = vu30Var19;
                    lee1Var2 = lee1Var4;
                    x340Var = x340Var3;
                    zxxVar2 = zxxVar7;
                    dk80Var2 = dk80Var9;
                    vu30Var8 = vu30Var5;
                    kua0Var2 = kua0Var3;
                    vu30Var6 = vu30Var110;
                    str3 = str8;
                } else {
                    x340Var4.b0();
                    e6e1Var2 = e6e1Var;
                    vu30Var6 = vu30Var3;
                    uwgVar2 = uwgVar;
                    es41Var2 = es41Var;
                    vzq0Var2 = vzq0Var;
                    f2 = f;
                    z7 = z3;
                    zxxVar2 = zxxVar;
                    x340Var = x340Var4;
                    str3 = str2;
                    maxVar3 = maxVar2;
                    vu30Var7 = vu30Var4;
                    vu30Var8 = vu30Var5;
                    z8 = z4;
                    z9 = z5;
                    dk80Var2 = dk80Var;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    yta0Var2 = yta0Var;
                    idn0Var2 = idn0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
                }
            }
            i18 |= 48;
            if ((i2 & 384) != 0) {
                i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
            }
            i21 = i18;
            i22 = i3 & 8192;
            if (i22 != 0) {
                i23 = i21 | 3072;
            } else if ((i2 & 3072) == 0) {
                i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
            } else {
                i23 = i21;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i6 = 16384;
                }
                i23 |= i6;
            }
            i24 = i3 & 32768;
            if (i24 != 0) {
                i23 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (x340Var4.i(uwgVar)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i23 |= i25;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i23 |= i33;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 131072) == 0) {
                    i13 = 8388608;
                }
                i23 |= i13;
            }
            if ((i2 & 100663296) != 0) {
                if ((i3 & 262144) == 0) {
                    i16 = 67108864;
                }
                i23 |= i16;
            }
            i26 = i3 & 524288;
            if (i26 != 0) {
                i23 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
            }
            if ((i3 & 1048576) == 0) {
                c = 2;
            } else {
                c = 2;
            }
            if ((i4 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (x340Var4.Y(i4 & 1, z6)) {
                x340Var4.d0();
                i27 = i & 1;
                maxVar4 = jax.a;
                if (i27 != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar2 = maxVar4;
                    }
                    if (i35 != 0) {
                        str2 = null;
                    }
                    if (i5 != 0) {
                        vu30Var4 = null;
                    }
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i10 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i3 & 512) != 0) {
                        lee1Var3 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -1879048193;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        kua0Var3 = kua0.g;
                        i23 &= -15;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i28 = i23;
                    if (i19 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i3 & 4096) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i28 &= -897;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i22 != 0) {
                        vu30Var9 = null;
                    } else {
                        vu30Var9 = vu30Var3;
                    }
                    i29 = i28;
                    if ((i3 & 16384) != 0) {
                        idn0VarY = zso1.Y(x340Var4);
                        i30 = i29 & (-57345);
                    } else {
                        i30 = i29;
                        idn0VarY = idn0Var;
                    }
                    if (i24 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    idn0Var3 = idn0VarY;
                    if ((i3 & 65536) != 0) {
                        es41VarC = l6o1.C(0, 0, 1, x340Var4);
                        i30 &= -3670017;
                    } else {
                        es41VarC = es41Var;
                    }
                    if ((i3 & 131072) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cvx cvxVar19 = cbx.b(x340Var4).b;
                        cvx cvxVar110 = cbx.b(x340Var4).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i30 &= -29360129;
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i3 & 262144) != 0) {
                        i30 &= -234881025;
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                    }
                    if (i26 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i3 & 1048576) != 0) {
                        e6e1Var4 = e6e1Var3;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        zxxVarM = pwo1.m(x340Var4);
                        vu30Var10 = vu30Var9;
                        z11 = z10;
                        idn0Var4 = idn0Var3;
                    } else {
                        e6e1Var4 = e6e1Var3;
                        z11 = z10;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        idn0Var4 = idn0Var3;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        vu30Var10 = vu30Var9;
                        zxxVarM = zxxVar;
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar2 = maxVar4;
                    }
                    if (i35 != 0) {
                        str2 = null;
                    }
                    if (i5 != 0) {
                        vu30Var4 = null;
                    }
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i10 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i3 & 512) != 0) {
                        lee1Var3 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -1879048193;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        kua0Var3 = kua0.g;
                        i23 &= -15;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i28 = i23;
                    if (i19 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i3 & 4096) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i28 &= -897;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i22 != 0) {
                        vu30Var9 = null;
                    } else {
                        vu30Var9 = vu30Var3;
                    }
                    i29 = i28;
                    if ((i3 & 16384) != 0) {
                        idn0VarY = zso1.Y(x340Var4);
                        i30 = i29 & (-57345);
                    } else {
                        i30 = i29;
                        idn0VarY = idn0Var;
                    }
                    if (i24 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    idn0Var3 = idn0VarY;
                    if ((i3 & 65536) != 0) {
                        es41VarC = l6o1.C(0, 0, 1, x340Var4);
                        i30 &= -3670017;
                    } else {
                        es41VarC = es41Var;
                    }
                    if ((i3 & 131072) != 0) {
                        uwr uwrVar11 = cbx.a;
                        cvx cvxVar111 = cbx.b(x340Var4).b;
                        cvx cvxVar112 = cbx.b(x340Var4).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i30 &= -29360129;
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i3 & 262144) != 0) {
                        i30 &= -234881025;
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                    }
                    if (i26 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i3 & 1048576) != 0) {
                        e6e1Var4 = e6e1Var3;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        zxxVarM = pwo1.m(x340Var4);
                        vu30Var10 = vu30Var9;
                        z11 = z10;
                        idn0Var4 = idn0Var3;
                    } else {
                        e6e1Var4 = e6e1Var3;
                        z11 = z10;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        idn0Var4 = idn0Var3;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        vu30Var10 = vu30Var9;
                        zxxVarM = zxxVar;
                    }
                }
                x340Var4.s();
                String str9 = str2;
                int i317 = (i32 >> 12) & 14;
                ven0VarG = e6p1.g(idn0Var4, x340Var4, i317);
                if (z5) {
                    x340Var2 = x340Var4;
                    idn0Var5 = idn0Var4;
                    j = zxxVarM.d;
                } else {
                    x340Var2 = x340Var4;
                    idn0Var5 = idn0Var4;
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j = zxxVarM.a;
                    } else {
                        j = zxxVarM.b;
                    }
                }
                tob1 tob1VarA12 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    j2 = zxxVarM.e;
                } else {
                    j2 = zxxVarM.f;
                }
                tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                if (z5) {
                    tob1Var = tob1VarA;
                    j3 = zxxVarM.j;
                } else {
                    tob1Var = tob1VarA;
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j3 = zxxVarM.h;
                    } else {
                        j3 = zxxVarM.i;
                    }
                }
                x340Var3 = x340Var2;
                tob1 tob1VarA13 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                zxx zxxVar8 = zxxVarM;
                objT = x340Var3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = bb00.h(0, x340Var3);
                }
                hdn0Var = (hdn0) objT;
                flb0Var = (flb0) x340Var3.k(t4k.n);
                f5 = Float.NaN;
                if (p3v.c(f4, Float.NaN)) {
                    vzq0Var4 = vzq0Var3;
                    vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                    f5 = Float.NaN;
                } else {
                    vzq0Var4 = vzq0Var3;
                    vzq0VarJ = vzq0Var4;
                }
                zC = p3v.c(f4, f5);
                boolean z110 = !zC;
                if (zC) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                float f11 = f4;
                vu30 vu30Var111 = vu30Var4;
                dyx dyxVar6 = new dyx(vzq0VarJ, z12, z110, tob1Var, tob1VarA13, lee1Var4, tob1VarA12, vu30Var111, vu30Var5, f11, hdn0Var, str9, y7e1Var, zxxVar8, e6e1Var4);
                e6e1Var2 = e6e1Var4;
                zI = x340Var3.i(maxVar2);
                objT2 = x340Var3.T();
                if (zI) {
                    objT2 = new rxx(maxVar2, (byte) 1);
                    x340Var3.s0(objT2);
                } else {
                    objT2 = new rxx(maxVar2, (byte) 1);
                    x340Var3.s0(objT2);
                }
                qim0 qim0VarH6 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                boolean zJ6 = u890.j(maxVar2, maxVar4);
                lee1 lee1VarA6 = lee1.a(lee1Var4, ((u7h) tob1VarA12.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                boolean zI7 = x340Var3.i(hdn0Var);
                if ((i32 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zI7 | z13;
                objT3 = x340Var3.T();
                if (z14) {
                    objT3 = new d0e(vu30Var10, hdn0Var);
                    x340Var3.s0(objT3);
                } else {
                    objT3 = new d0e(vu30Var10, hdn0Var);
                    x340Var3.s0(objT3);
                }
                vu30 vu30Var112 = vu30Var10;
                int i318 = i32 << 18;
                dk80 dk80Var10 = dk80Var4;
                xea.c(y7e1Var, qim0VarH6, zJ6, z4, dk80Var10, lee1VarA6, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar8.g), uwgVar3, dyxVar6, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i318) | (29360128 & i318) | (i318 & 234881024), i317 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                maxVar3 = maxVar2;
                z8 = z4;
                z9 = z5;
                yta0Var2 = yta0Var3;
                uwgVar2 = uwgVar3;
                z7 = z11;
                vzq0Var2 = vzq0Var4;
                f2 = f11;
                es41Var2 = es41VarC;
                idn0Var2 = idn0Var5;
                vu30Var7 = vu30Var111;
                lee1Var2 = lee1Var4;
                x340Var = x340Var3;
                zxxVar2 = zxxVar8;
                dk80Var2 = dk80Var10;
                vu30Var8 = vu30Var5;
                kua0Var2 = kua0Var3;
                vu30Var6 = vu30Var112;
                str3 = str9;
            } else {
                x340Var4.b0();
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z7 = z3;
                zxxVar2 = zxxVar;
                x340Var = x340Var4;
                str3 = str2;
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                z8 = z4;
                z9 = z5;
                dk80Var2 = dk80Var;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                yta0Var2 = yta0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
            }
        }
        i4 |= 24576;
        vu30Var4 = vu30Var;
        i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
            vu30Var5 = vu30Var2;
        } else {
            vu30Var5 = vu30Var2;
            if ((i & 196608) == 0) {
                if (x340Var4.i(vu30Var5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
            z4 = z;
        } else {
            z4 = z;
            if ((i & 1572864) == 0) {
                if (x340Var4.h(z4)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
        }
        i12 = i3 & 128;
        i13 = 4194304;
        if (i12 != 0) {
            i4 |= 12582912;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i & 12582912) == 0) {
                if (x340Var4.h(z5)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i4 |= i14;
            }
        }
        i15 = i3 & 256;
        i16 = 33554432;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (x340Var4.i(dk80Var)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i4 |= i17;
        }
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & 512) == 0 || !x340Var4.i(lee1Var)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i18 = i2 | (((i3 & 1024) == 0 || !x340Var4.i(kua0Var)) ? 2 : 4);
        } else {
            i18 = i2;
        }
        i19 = i3 & 2048;
        if (i19 != 0) {
            if ((i2 & 48) == 0) {
                if (x340Var4.i(yta0Var)) {
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i18 |= i20;
            }
            if ((i2 & 384) != 0) {
                i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
            }
            i21 = i18;
            i22 = i3 & 8192;
            if (i22 != 0) {
                i23 = i21 | 3072;
            } else if ((i2 & 3072) == 0) {
                i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
            } else {
                i23 = i21;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i6 = 16384;
                }
                i23 |= i6;
            }
            i24 = i3 & 32768;
            if (i24 != 0) {
                i23 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (x340Var4.i(uwgVar)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i23 |= i25;
            }
            if ((i2 & 1572864) != 0) {
                if ((i3 & 65536) == 0) {
                    i33 = 524288;
                } else {
                    i33 = 524288;
                }
                i23 |= i33;
            }
            if ((i2 & 12582912) != 0) {
                if ((i3 & 131072) == 0) {
                    i13 = 8388608;
                }
                i23 |= i13;
            }
            if ((i2 & 100663296) != 0) {
                if ((i3 & 262144) == 0) {
                    i16 = 67108864;
                }
                i23 |= i16;
            }
            i26 = i3 & 524288;
            if (i26 != 0) {
                i23 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
            }
            if ((i3 & 1048576) == 0) {
                c = 2;
            } else {
                c = 2;
            }
            if ((i4 & 306783379) != 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (x340Var4.Y(i4 & 1, z6)) {
                x340Var4.d0();
                i27 = i & 1;
                maxVar4 = jax.a;
                if (i27 != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar2 = maxVar4;
                    }
                    if (i35 != 0) {
                        str2 = null;
                    }
                    if (i5 != 0) {
                        vu30Var4 = null;
                    }
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i10 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i3 & 512) != 0) {
                        lee1Var3 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -1879048193;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        kua0Var3 = kua0.g;
                        i23 &= -15;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i28 = i23;
                    if (i19 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i3 & 4096) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i28 &= -897;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i22 != 0) {
                        vu30Var9 = null;
                    } else {
                        vu30Var9 = vu30Var3;
                    }
                    i29 = i28;
                    if ((i3 & 16384) != 0) {
                        idn0VarY = zso1.Y(x340Var4);
                        i30 = i29 & (-57345);
                    } else {
                        i30 = i29;
                        idn0VarY = idn0Var;
                    }
                    if (i24 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    idn0Var3 = idn0VarY;
                    if ((i3 & 65536) != 0) {
                        es41VarC = l6o1.C(0, 0, 1, x340Var4);
                        i30 &= -3670017;
                    } else {
                        es41VarC = es41Var;
                    }
                    if ((i3 & 131072) != 0) {
                        uwr uwrVar12 = cbx.a;
                        cvx cvxVar113 = cbx.b(x340Var4).b;
                        cvx cvxVar114 = cbx.b(x340Var4).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i30 &= -29360129;
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i3 & 262144) != 0) {
                        i30 &= -234881025;
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                    }
                    if (i26 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i3 & 1048576) != 0) {
                        e6e1Var4 = e6e1Var3;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        zxxVarM = pwo1.m(x340Var4);
                        vu30Var10 = vu30Var9;
                        z11 = z10;
                        idn0Var4 = idn0Var3;
                    } else {
                        e6e1Var4 = e6e1Var3;
                        z11 = z10;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        idn0Var4 = idn0Var3;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        vu30Var10 = vu30Var9;
                        zxxVarM = zxxVar;
                    }
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar2 = maxVar4;
                    }
                    if (i35 != 0) {
                        str2 = null;
                    }
                    if (i5 != 0) {
                        vu30Var4 = null;
                    }
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i10 != 0) {
                        z4 = false;
                    }
                    if (i12 != 0) {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    if ((i3 & 512) != 0) {
                        lee1Var3 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -1879048193;
                    } else {
                        lee1Var3 = lee1Var;
                    }
                    if ((i3 & 1024) != 0) {
                        kua0Var3 = kua0.g;
                        i23 &= -15;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    i28 = i23;
                    if (i19 != 0) {
                        yta0Var3 = null;
                    } else {
                        yta0Var3 = yta0Var;
                    }
                    if ((i3 & 4096) != 0) {
                        e6e1.a.getClass();
                        e6e1Var3 = b6e1.b;
                        i28 &= -897;
                    } else {
                        e6e1Var3 = e6e1Var;
                    }
                    if (i22 != 0) {
                        vu30Var9 = null;
                    } else {
                        vu30Var9 = vu30Var3;
                    }
                    i29 = i28;
                    if ((i3 & 16384) != 0) {
                        idn0VarY = zso1.Y(x340Var4);
                        i30 = i29 & (-57345);
                    } else {
                        i30 = i29;
                        idn0VarY = idn0Var;
                    }
                    if (i24 != 0) {
                        uwgVar3 = null;
                    } else {
                        uwgVar3 = uwgVar;
                    }
                    idn0Var3 = idn0VarY;
                    if ((i3 & 65536) != 0) {
                        es41VarC = l6o1.C(0, 0, 1, x340Var4);
                        i30 &= -3670017;
                    } else {
                        es41VarC = es41Var;
                    }
                    if ((i3 & 131072) != 0) {
                        uwr uwrVar13 = cbx.a;
                        cvx cvxVar115 = cbx.b(x340Var4).b;
                        cvx cvxVar116 = cbx.b(x340Var4).b;
                        zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                        i30 &= -29360129;
                    } else {
                        zzq0Var = vzq0Var;
                    }
                    if ((i3 & 262144) != 0) {
                        i30 &= -234881025;
                        f3 = Float.NaN;
                    } else {
                        f3 = f;
                    }
                    if (i26 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i3 & 1048576) != 0) {
                        e6e1Var4 = e6e1Var3;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        zxxVarM = pwo1.m(x340Var4);
                        vu30Var10 = vu30Var9;
                        z11 = z10;
                        idn0Var4 = idn0Var3;
                    } else {
                        e6e1Var4 = e6e1Var3;
                        z11 = z10;
                        dk80Var4 = dk80Var3;
                        i31 = i4;
                        lee1Var4 = lee1Var3;
                        i32 = i30;
                        idn0Var4 = idn0Var3;
                        vzq0Var3 = zzq0Var;
                        f4 = f3;
                        vu30Var10 = vu30Var9;
                        zxxVarM = zxxVar;
                    }
                }
                x340Var4.s();
                String str10 = str2;
                int i319 = (i32 >> 12) & 14;
                ven0VarG = e6p1.g(idn0Var4, x340Var4, i319);
                if (z5) {
                    x340Var2 = x340Var4;
                    idn0Var5 = idn0Var4;
                    j = zxxVarM.d;
                } else {
                    x340Var2 = x340Var4;
                    idn0Var5 = idn0Var4;
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j = zxxVarM.a;
                    } else {
                        j = zxxVarM.b;
                    }
                }
                tob1 tob1VarA14 = w191.a(j, null, "textColor", x340Var2, 384, 10);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    j2 = zxxVarM.e;
                } else {
                    j2 = zxxVarM.f;
                }
                tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
                if (z5) {
                    tob1Var = tob1VarA;
                    j3 = zxxVarM.j;
                } else {
                    tob1Var = tob1VarA;
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        j3 = zxxVarM.h;
                    } else {
                        j3 = zxxVarM.i;
                    }
                }
                x340Var3 = x340Var2;
                tob1 tob1VarA15 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
                zxx zxxVar9 = zxxVarM;
                objT = x340Var3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = bb00.h(0, x340Var3);
                }
                hdn0Var = (hdn0) objT;
                flb0Var = (flb0) x340Var3.k(t4k.n);
                f5 = Float.NaN;
                if (p3v.c(f4, Float.NaN)) {
                    vzq0Var4 = vzq0Var3;
                    vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                    f5 = Float.NaN;
                } else {
                    vzq0Var4 = vzq0Var3;
                    vzq0VarJ = vzq0Var4;
                }
                zC = p3v.c(f4, f5);
                boolean z111 = !zC;
                if (zC) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                float f12 = f4;
                vu30 vu30Var113 = vu30Var4;
                dyx dyxVar7 = new dyx(vzq0VarJ, z12, z111, tob1Var, tob1VarA15, lee1Var4, tob1VarA14, vu30Var113, vu30Var5, f12, hdn0Var, str10, y7e1Var, zxxVar9, e6e1Var4);
                e6e1Var2 = e6e1Var4;
                zI = x340Var3.i(maxVar2);
                objT2 = x340Var3.T();
                if (zI) {
                    objT2 = new rxx(maxVar2, (byte) 1);
                    x340Var3.s0(objT2);
                } else {
                    objT2 = new rxx(maxVar2, (byte) 1);
                    x340Var3.s0(objT2);
                }
                qim0 qim0VarH7 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
                boolean zJ7 = u890.j(maxVar2, maxVar4);
                lee1 lee1VarA7 = lee1.a(lee1Var4, ((u7h) tob1VarA14.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                boolean zI8 = x340Var3.i(hdn0Var);
                if ((i32 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zI8 | z13;
                objT3 = x340Var3.T();
                if (z14) {
                    objT3 = new d0e(vu30Var10, hdn0Var);
                    x340Var3.s0(objT3);
                } else {
                    objT3 = new d0e(vu30Var10, hdn0Var);
                    x340Var3.s0(objT3);
                }
                vu30 vu30Var114 = vu30Var10;
                int i3110 = i32 << 18;
                dk80 dk80Var11 = dk80Var4;
                xea.c(y7e1Var, qim0VarH7, zJ7, z4, dk80Var11, lee1VarA7, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar9.g), uwgVar3, dyxVar7, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i3110) | (29360128 & i3110) | (i3110 & 234881024), i319 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
                maxVar3 = maxVar2;
                z8 = z4;
                z9 = z5;
                yta0Var2 = yta0Var3;
                uwgVar2 = uwgVar3;
                z7 = z11;
                vzq0Var2 = vzq0Var4;
                f2 = f12;
                es41Var2 = es41VarC;
                idn0Var2 = idn0Var5;
                vu30Var7 = vu30Var113;
                lee1Var2 = lee1Var4;
                x340Var = x340Var3;
                zxxVar2 = zxxVar9;
                dk80Var2 = dk80Var11;
                vu30Var8 = vu30Var5;
                kua0Var2 = kua0Var3;
                vu30Var6 = vu30Var114;
                str3 = str10;
            } else {
                x340Var4.b0();
                e6e1Var2 = e6e1Var;
                vu30Var6 = vu30Var3;
                uwgVar2 = uwgVar;
                es41Var2 = es41Var;
                vzq0Var2 = vzq0Var;
                f2 = f;
                z7 = z3;
                zxxVar2 = zxxVar;
                x340Var = x340Var4;
                str3 = str2;
                maxVar3 = maxVar2;
                vu30Var7 = vu30Var4;
                vu30Var8 = vu30Var5;
                z8 = z4;
                z9 = z5;
                dk80Var2 = dk80Var;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                yta0Var2 = yta0Var;
                idn0Var2 = idn0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
            }
        }
        i18 |= 48;
        if ((i2 & 384) != 0) {
            i18 |= ((i3 & 4096) == 0 || !x340Var4.i(e6e1Var)) ? 128 : 256;
        }
        i21 = i18;
        i22 = i3 & 8192;
        if (i22 != 0) {
            i23 = i21 | 3072;
        } else if ((i2 & 3072) == 0) {
            i23 = i21 | (x340Var4.i(vu30Var3) ? 2048 : 1024);
        } else {
            i23 = i21;
        }
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i6 = 16384;
            }
            i23 |= i6;
        }
        i24 = i3 & 32768;
        if (i24 != 0) {
            i23 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (x340Var4.i(uwgVar)) {
                i25 = 131072;
            } else {
                i25 = 65536;
            }
            i23 |= i25;
        }
        if ((i2 & 1572864) != 0) {
            if ((i3 & 65536) == 0) {
                i33 = 524288;
            } else {
                i33 = 524288;
            }
            i23 |= i33;
        }
        if ((i2 & 12582912) != 0) {
            if ((i3 & 131072) == 0) {
                i13 = 8388608;
            }
            i23 |= i13;
        }
        if ((i2 & 100663296) != 0) {
            if ((i3 & 262144) == 0) {
                i16 = 67108864;
            }
            i23 |= i16;
        }
        i26 = i3 & 524288;
        if (i26 != 0) {
            i23 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i23 |= x340Var4.h(z3) ? 536870912 : 268435456;
        }
        if ((i3 & 1048576) == 0) {
            c = 2;
        } else {
            c = 2;
        }
        if ((i4 & 306783379) != 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (x340Var4.Y(i4 & 1, z6)) {
            x340Var4.d0();
            i27 = i & 1;
            maxVar4 = jax.a;
            if (i27 != 0) {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    maxVar2 = maxVar4;
                }
                if (i35 != 0) {
                    str2 = null;
                }
                if (i5 != 0) {
                    vu30Var4 = null;
                }
                if (i8 != 0) {
                    vu30Var5 = null;
                }
                if (i10 != 0) {
                    z4 = false;
                }
                if (i12 != 0) {
                    z5 = false;
                }
                if (i15 != 0) {
                    dk80Var3 = null;
                } else {
                    dk80Var3 = dk80Var;
                }
                if ((i3 & 512) != 0) {
                    lee1Var3 = (lee1) x340Var4.k(rgx.a);
                    i4 &= -1879048193;
                } else {
                    lee1Var3 = lee1Var;
                }
                if ((i3 & 1024) != 0) {
                    kua0Var3 = kua0.g;
                    i23 &= -15;
                } else {
                    kua0Var3 = kua0Var;
                }
                i28 = i23;
                if (i19 != 0) {
                    yta0Var3 = null;
                } else {
                    yta0Var3 = yta0Var;
                }
                if ((i3 & 4096) != 0) {
                    e6e1.a.getClass();
                    e6e1Var3 = b6e1.b;
                    i28 &= -897;
                } else {
                    e6e1Var3 = e6e1Var;
                }
                if (i22 != 0) {
                    vu30Var9 = null;
                } else {
                    vu30Var9 = vu30Var3;
                }
                i29 = i28;
                if ((i3 & 16384) != 0) {
                    idn0VarY = zso1.Y(x340Var4);
                    i30 = i29 & (-57345);
                } else {
                    i30 = i29;
                    idn0VarY = idn0Var;
                }
                if (i24 != 0) {
                    uwgVar3 = null;
                } else {
                    uwgVar3 = uwgVar;
                }
                idn0Var3 = idn0VarY;
                if ((i3 & 65536) != 0) {
                    es41VarC = l6o1.C(0, 0, 1, x340Var4);
                    i30 &= -3670017;
                } else {
                    es41VarC = es41Var;
                }
                if ((i3 & 131072) != 0) {
                    uwr uwrVar14 = cbx.a;
                    cvx cvxVar117 = cbx.b(x340Var4).b;
                    cvx cvxVar118 = cbx.b(x340Var4).b;
                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                    i30 &= -29360129;
                } else {
                    zzq0Var = vzq0Var;
                }
                if ((i3 & 262144) != 0) {
                    i30 &= -234881025;
                    f3 = Float.NaN;
                } else {
                    f3 = f;
                }
                if (i26 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i3 & 1048576) != 0) {
                    e6e1Var4 = e6e1Var3;
                    dk80Var4 = dk80Var3;
                    i31 = i4;
                    lee1Var4 = lee1Var3;
                    i32 = i30;
                    vzq0Var3 = zzq0Var;
                    f4 = f3;
                    zxxVarM = pwo1.m(x340Var4);
                    vu30Var10 = vu30Var9;
                    z11 = z10;
                    idn0Var4 = idn0Var3;
                } else {
                    e6e1Var4 = e6e1Var3;
                    z11 = z10;
                    dk80Var4 = dk80Var3;
                    i31 = i4;
                    lee1Var4 = lee1Var3;
                    i32 = i30;
                    idn0Var4 = idn0Var3;
                    vzq0Var3 = zzq0Var;
                    f4 = f3;
                    vu30Var10 = vu30Var9;
                    zxxVarM = zxxVar;
                }
            } else {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    maxVar2 = maxVar4;
                }
                if (i35 != 0) {
                    str2 = null;
                }
                if (i5 != 0) {
                    vu30Var4 = null;
                }
                if (i8 != 0) {
                    vu30Var5 = null;
                }
                if (i10 != 0) {
                    z4 = false;
                }
                if (i12 != 0) {
                    z5 = false;
                }
                if (i15 != 0) {
                    dk80Var3 = null;
                } else {
                    dk80Var3 = dk80Var;
                }
                if ((i3 & 512) != 0) {
                    lee1Var3 = (lee1) x340Var4.k(rgx.a);
                    i4 &= -1879048193;
                } else {
                    lee1Var3 = lee1Var;
                }
                if ((i3 & 1024) != 0) {
                    kua0Var3 = kua0.g;
                    i23 &= -15;
                } else {
                    kua0Var3 = kua0Var;
                }
                i28 = i23;
                if (i19 != 0) {
                    yta0Var3 = null;
                } else {
                    yta0Var3 = yta0Var;
                }
                if ((i3 & 4096) != 0) {
                    e6e1.a.getClass();
                    e6e1Var3 = b6e1.b;
                    i28 &= -897;
                } else {
                    e6e1Var3 = e6e1Var;
                }
                if (i22 != 0) {
                    vu30Var9 = null;
                } else {
                    vu30Var9 = vu30Var3;
                }
                i29 = i28;
                if ((i3 & 16384) != 0) {
                    idn0VarY = zso1.Y(x340Var4);
                    i30 = i29 & (-57345);
                } else {
                    i30 = i29;
                    idn0VarY = idn0Var;
                }
                if (i24 != 0) {
                    uwgVar3 = null;
                } else {
                    uwgVar3 = uwgVar;
                }
                idn0Var3 = idn0VarY;
                if ((i3 & 65536) != 0) {
                    es41VarC = l6o1.C(0, 0, 1, x340Var4);
                    i30 &= -3670017;
                } else {
                    es41VarC = es41Var;
                }
                if ((i3 & 131072) != 0) {
                    uwr uwrVar15 = cbx.a;
                    cvx cvxVar119 = cbx.b(x340Var4).b;
                    cvx cvxVar1110 = cbx.b(x340Var4).b;
                    zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
                    i30 &= -29360129;
                } else {
                    zzq0Var = vzq0Var;
                }
                if ((i3 & 262144) != 0) {
                    i30 &= -234881025;
                    f3 = Float.NaN;
                } else {
                    f3 = f;
                }
                if (i26 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i3 & 1048576) != 0) {
                    e6e1Var4 = e6e1Var3;
                    dk80Var4 = dk80Var3;
                    i31 = i4;
                    lee1Var4 = lee1Var3;
                    i32 = i30;
                    vzq0Var3 = zzq0Var;
                    f4 = f3;
                    zxxVarM = pwo1.m(x340Var4);
                    vu30Var10 = vu30Var9;
                    z11 = z10;
                    idn0Var4 = idn0Var3;
                } else {
                    e6e1Var4 = e6e1Var3;
                    z11 = z10;
                    dk80Var4 = dk80Var3;
                    i31 = i4;
                    lee1Var4 = lee1Var3;
                    i32 = i30;
                    idn0Var4 = idn0Var3;
                    vzq0Var3 = zzq0Var;
                    f4 = f3;
                    vu30Var10 = vu30Var9;
                    zxxVarM = zxxVar;
                }
            }
            x340Var4.s();
            String str11 = str2;
            int i3111 = (i32 >> 12) & 14;
            ven0VarG = e6p1.g(idn0Var4, x340Var4, i3111);
            if (z5) {
                x340Var2 = x340Var4;
                idn0Var5 = idn0Var4;
                j = zxxVarM.d;
            } else {
                x340Var2 = x340Var4;
                idn0Var5 = idn0Var4;
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    j = zxxVarM.a;
                } else {
                    j = zxxVarM.b;
                }
            }
            tob1 tob1VarA16 = w191.a(j, null, "textColor", x340Var2, 384, 10);
            if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                j2 = zxxVarM.e;
            } else {
                j2 = zxxVarM.f;
            }
            tob1VarA = w191.a(j2, null, "backgroundColor", x340Var2, 384, 10);
            if (z5) {
                tob1Var = tob1VarA;
                j3 = zxxVarM.j;
            } else {
                tob1Var = tob1VarA;
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    j3 = zxxVarM.h;
                } else {
                    j3 = zxxVarM.i;
                }
            }
            x340Var3 = x340Var2;
            tob1 tob1VarA17 = w191.a(j3, null, "borderColor", x340Var3, 384, 10);
            zxx zxxVar10 = zxxVarM;
            objT = x340Var3.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var3);
            }
            hdn0Var = (hdn0) objT;
            flb0Var = (flb0) x340Var3.k(t4k.n);
            f5 = Float.NaN;
            if (p3v.c(f4, Float.NaN)) {
                vzq0Var4 = vzq0Var3;
                vzq0VarJ = uyn1.j(uyn1.n(vzq0Var3, flb0Var), 0.0f, uyn1.m(vzq0Var3, flb0Var), 0.0f, 10);
                f5 = Float.NaN;
            } else {
                vzq0Var4 = vzq0Var3;
                vzq0VarJ = vzq0Var4;
            }
            zC = p3v.c(f4, f5);
            boolean z112 = !zC;
            if (zC) {
                z12 = false;
            } else {
                z12 = false;
            }
            float f13 = f4;
            vu30 vu30Var115 = vu30Var4;
            dyx dyxVar8 = new dyx(vzq0VarJ, z12, z112, tob1Var, tob1VarA17, lee1Var4, tob1VarA16, vu30Var115, vu30Var5, f13, hdn0Var, str11, y7e1Var, zxxVar10, e6e1Var4);
            e6e1Var2 = e6e1Var4;
            zI = x340Var3.i(maxVar2);
            objT2 = x340Var3.T();
            if (zI) {
                objT2 = new rxx(maxVar2, (byte) 1);
                x340Var3.s0(objT2);
            } else {
                objT2 = new rxx(maxVar2, (byte) 1);
                x340Var3.s0(objT2);
            }
            qim0 qim0VarH8 = pqo.h(s161.b(qim0Var, false, (iu30) objT2), maxVar2 instanceof hax);
            boolean zJ8 = u890.j(maxVar2, maxVar4);
            lee1 lee1VarA8 = lee1.a(lee1Var4, ((u7h) tob1VarA16.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            boolean zI9 = x340Var3.i(hdn0Var);
            if ((i32 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zI9 | z13;
            objT3 = x340Var3.T();
            if (z14) {
                objT3 = new d0e(vu30Var10, hdn0Var);
                x340Var3.s0(objT3);
            } else {
                objT3 = new d0e(vu30Var10, hdn0Var);
                x340Var3.s0(objT3);
            }
            vu30 vu30Var116 = vu30Var10;
            int i3112 = i32 << 18;
            dk80 dk80Var12 = dk80Var4;
            xea.c(y7e1Var, qim0VarH8, zJ8, z4, dk80Var12, lee1VarA8, kua0Var3, yta0Var3, e6e1Var2, (vu30) objT3, idn0Var5, new n6a1(zxxVar10.g), uwgVar3, dyxVar8, es41VarC, x340Var3, (i31 & 14) | ((i31 >> 9) & 7168) | ((i31 >> 12) & 57344) | (3670016 & i3112) | (29360128 & i3112) | (i3112 & 234881024), i3111 | ((i32 >> 9) & 896) | ((i32 >> 6) & 57344), 0);
            maxVar3 = maxVar2;
            z8 = z4;
            z9 = z5;
            yta0Var2 = yta0Var3;
            uwgVar2 = uwgVar3;
            z7 = z11;
            vzq0Var2 = vzq0Var4;
            f2 = f13;
            es41Var2 = es41VarC;
            idn0Var2 = idn0Var5;
            vu30Var7 = vu30Var115;
            lee1Var2 = lee1Var4;
            x340Var = x340Var3;
            zxxVar2 = zxxVar10;
            dk80Var2 = dk80Var12;
            vu30Var8 = vu30Var5;
            kua0Var2 = kua0Var3;
            vu30Var6 = vu30Var116;
            str3 = str11;
        } else {
            x340Var4.b0();
            e6e1Var2 = e6e1Var;
            vu30Var6 = vu30Var3;
            uwgVar2 = uwgVar;
            es41Var2 = es41Var;
            vzq0Var2 = vzq0Var;
            f2 = f;
            z7 = z3;
            zxxVar2 = zxxVar;
            x340Var = x340Var4;
            str3 = str2;
            maxVar3 = maxVar2;
            vu30Var7 = vu30Var4;
            vu30Var8 = vu30Var5;
            z8 = z4;
            z9 = z5;
            dk80Var2 = dk80Var;
            lee1Var2 = lee1Var;
            kua0Var2 = kua0Var;
            yta0Var2 = yta0Var;
            idn0Var2 = idn0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new byx(y7e1Var, qim0Var, maxVar3, str3, vu30Var7, vu30Var8, z8, z9, dk80Var2, lee1Var2, kua0Var2, yta0Var2, e6e1Var2, vu30Var6, idn0Var2, uwgVar2, es41Var2, vzq0Var2, f2, z7, zxxVar2, i, i2, i3);
        }
    }

    public static final void c(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(372906474);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            t1c.a(dug.e(qim0Var, v9c.s(c380Var, 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new an9(c380Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void d(vzq0 vzq0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1898140173);
        int i2 = (x340Var.g(vzq0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(u291.f(qim0Var, 1.0f), een.h, apo.r(118638685, new cy00((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a), j2iVar, vzq0Var, false, (byte) 1), x340Var), x340Var, 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(vzq0Var, qim0Var, j2iVar, i, (byte) 4);
        }
    }

    public static final void e(int i, String str, boolean z, boolean z2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-87640877);
        int i3 = i2 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            if (z) {
                b0kVar3.i0(1676470399);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).b.c;
            } else {
                b0kVar3.i0(1676471738);
                j = ((u7h) b0kVar3.k(qgx.a)).a;
            }
            b0kVar3.r(false);
            long j2 = j;
            pm31 pm31Var = new pm31(3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = dgo1.q(qim0Var3, z, z2, pm31Var, function0, 8);
            era eraVar = een.Q0;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarQ);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            nl70.c(i3o1.n(i, b0kVar3, i3 & 14), (String) null, (qim0) null, j2, b0kVar3, 56, 4);
            uwo1.e(str, null, cbx.d(b0kVar3).j, j2, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i3 >> 3) & 14, 0, 2018);
            b0kVar2 = b0kVar3;
            yoi1.b(z, (Function0) null, (qim0) null, z2, (idn0) null, b0kVar2, ((i3 >> 6) & 14) | 48 | (i3 & 7168), 20);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h7c0(i, str, z, z2, function0, qim0Var2, i2, (byte) 1);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1116302219);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = uyn1.y(qim0VarF, cbx.b(b0kVar2).b.b, cbx.b(b0kVar2).b.c);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwo1.e(cwl1.o0(b0kVar2, 2131960556), null, cbx.d(b0kVar2).e, 0L, new a0e1(3), null, 0, false, new cjc0(2), 0, null, b0kVar2, 0, 0, 1770);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            uwo1.e(cwl1.n0(2131960555, new Object[]{str}, b0kVar2), null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, new cjc0(4), 0, null, b0kVar2, 0, 0, 1762);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            foo1.c(new gbx(z50.c, function0), new idx(4), null, null, yla.r(b0kVar2), null, null, null, null, null, p0j.a, b0kVar2, 0, 48, 2012);
            b0kVar2 = b0kVar2;
            x0d.s(nim0Var, cbx.b(b0kVar2).b.a, b0kVar2, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 20);
        }
    }

    public static final void g(a3t0 a3t0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1627597694);
        int i2 = i | (b0kVar3.e(a3t0Var.ordinal()) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                b0kVar3.i0(-753282378);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(-753280751);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131962118));
                b0kVar3.r(false);
            }
            jax jaxVar = haxVar;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).e.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(uyn1.y(qim0VarF, f, 16.0f), (tl3) null, (hw61) null, ogx.e, (vzq0) null, jaxVar, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-729224085, new n8k0(a3t0Var, z, iu30Var, (byte) 4), b0kVar3), b0kVar2, 0, 48, 2006);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) a3t0Var, z, (Object) iu30Var, i, (byte) 13);
        }
    }

    public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-907546017);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarI = zr7.i(anm1.N("ShareCardError", qim0Var), gce0.a1);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarI, cbx.a(x340Var).a.b.c(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = i2;
            wrx wrxVar = wrx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131951700));
            boolean z = false;
            long j = u7h.f;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            if ((i3 & 112) == 32) {
                z = true;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 1);
                x340Var.s0(objT);
            }
            w0h1.a(wrxVar, jslVar, bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15), j, 0L, false, x340Var, wrx.d | 3072, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(qim0Var, function0, i, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(g7d1 g7d1Var, e6d1 e6d1Var, f6d1 f6d1Var, int i, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        iu30 iu30Var2;
        qim0 qim0Var2;
        qim0 qim0VarF;
        boolean z;
        u7h u7hVar;
        qim0 qim0Var3;
        boolean z2;
        boolean z3;
        boolean z4;
        u7h u7hVar2;
        e6d1 e6d1Var2 = e6d1Var;
        List list = g7d1Var.b;
        int i4 = g7d1Var.e;
        iu30 iu30Var3 = e6d1Var2.N0;
        iu30 iu30Var4 = e6d1Var2.f;
        iu30 iu30Var5 = e6d1Var2.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1708762961);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(g7d1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(e6d1Var2.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(f6d1Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i5 & 1, (74899 & i5) != 74898)) {
            Integer num = f6d1Var.a;
            hwi0 hwi0Var = null;
            qim0 qim0Var4 = nim0.a;
            if (num == null) {
                x340Var.i0(-1804702748);
                x340Var.r(false);
                qim0VarF = null;
            } else {
                x340Var.i0(-1804702747);
                qim0VarF = dug.f(qim0Var4, f5p1.k(x340Var, num.intValue()), d4o1.a);
                x340Var.r(false);
            }
            if (qim0VarF == null) {
                qim0VarF = qim0Var4;
            }
            qim0 qim0VarThen = u291.d(qim0Var4, 1.0f).then(qim0VarF);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            t1c.a(dug.f(h2c.a.b(qim0Var4), f5p1.k(x340Var, e6d1Var2.b), er31.b(6.0f)), x340Var, 0);
            f7d1 f7d1Var = g7d1Var.c;
            if (u890.j(f7d1Var, c7d1.a)) {
                x340Var.i0(1410208185);
                cnx cnxVar = cnx.c;
                Integer num2 = e6d1Var2.Z;
                if (num2 == null) {
                    x340Var.i0(766918323);
                    z4 = false;
                    x340Var.r(false);
                    u7hVar2 = null;
                } else {
                    z4 = false;
                    x340Var.i0(766918324);
                    long jK = f5p1.k(x340Var, num2.intValue());
                    x340Var.r(false);
                    u7hVar2 = new u7h(jK);
                }
                long j = u7hVar2 != null ? u7hVar2.a : u7h.k;
                uwr uwrVar = cbx.a;
                long j2 = j;
                qim0Var3 = qim0Var4;
                z = true;
                yxo1.f(2131961429, cnxVar, j2, null, ((p3v) iu30Var5.invoke(cbx.b(x340Var))).a, ((p3v) iu30Var4.invoke(cbx.b(x340Var))).a, uyn1.x(u291.d(qim0Var4, 1.0f), cbx.b(x340Var).b.a), Integer.valueOf(i4), e6d1Var2.Y, ((p3v) iu30Var3.invoke(cbx.b(x340Var))).a, x340Var, (cnx.d << 3) | 3072, 0);
                x340Var = x340Var;
                x340Var.r(z4);
            } else {
                z = true;
                if (u890.j(f7d1Var, b7d1.a)) {
                    x340Var.i0(1410230803);
                    jlx jlxVar = jlx.c;
                    long j3 = u7h.k;
                    uwr uwrVar2 = cbx.a;
                    qim0Var3 = qim0Var4;
                    yxo1.f(2131961426, jlxVar, j3, null, ((p3v) iu30Var5.invoke(cbx.b(x340Var))).a, ((p3v) iu30Var4.invoke(cbx.b(x340Var))).a, u291.d(qim0Var4, 1.0f), Integer.valueOf(i4), false, ((p3v) iu30Var3.invoke(cbx.b(x340Var))).a, x340Var, (jlx.d << 3) | 3072, 256);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else if (u890.j(f7d1Var, d7d1.a)) {
                    x340Var.i0(768012128);
                    z6d1 z6d1Var = (z6d1) list.get(i);
                    if (i == list.size() - 1) {
                        z3 = true;
                        z2 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    int i6 = i5 << 9;
                    zho1.s(z6d1Var, i, z3, g7d1Var.i, e6d1Var2, f6d1Var, null, iu30Var, x340Var, ((i5 >> 6) & 112) | (57344 & i6) | (i6 & 458752) | (29360128 & (i5 << 6)));
                    e6d1Var2 = e6d1Var2;
                    iu30Var2 = iu30Var;
                    x340Var.r(false);
                    qim0Var3 = qim0Var4;
                    z = z2;
                } else {
                    iu30Var2 = iu30Var;
                    if (!u890.j(f7d1Var, e7d1.a)) {
                        throw p3d1.k(x340Var, 1410208282, false);
                    }
                    x340Var.i0(768419220);
                    int i7 = e6d1Var2.i;
                    hux huxVar = e6d1Var2.t;
                    Integer num3 = e6d1Var2.X;
                    if (num3 == null) {
                        x340Var.i0(768549171);
                        x340Var.r(false);
                        u7hVar = null;
                    } else {
                        x340Var.i0(768549172);
                        long jK2 = f5p1.k(x340Var, num3.intValue());
                        x340Var.r(false);
                        u7hVar = new u7h(jK2);
                    }
                    long j4 = u7hVar != null ? u7hVar.a : u7h.k;
                    if (e6d1Var2.O0) {
                        x340Var.i0(768674164);
                        boolean z5 = (i5 & 458752) == 131072;
                        Object objT = x340Var.T();
                        if (z5 || objT == fkj0.X) {
                            objT = new pwc1(iu30Var2, (byte) 2);
                            x340Var.s0(objT);
                        }
                        hwi0 hwi0Var2 = new hwi0((Function0) objT);
                        x340Var.r(false);
                        hwi0Var = hwi0Var2;
                    } else {
                        x340Var.i0(768981032);
                        x340Var.r(false);
                    }
                    uwr uwrVar3 = cbx.a;
                    qim0Var3 = qim0Var4;
                    yxo1.f(i7, huxVar, j4, hwi0Var, ((p3v) iu30Var5.invoke(cbx.b(x340Var))).a, ((p3v) iu30Var4.invoke(cbx.b(x340Var))).a, u291.d(qim0Var4, 1.0f), null, false, ((p3v) iu30Var3.invoke(cbx.b(x340Var))).a, x340Var, 64, 384);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(z);
                qim0Var2 = qim0Var3;
            }
            iu30Var2 = iu30Var;
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bxy(g7d1Var, e6d1Var2, f6d1Var, i, qim0Var2, iu30Var2, i2);
        }
    }

    public static final apd k(String str, nwc nwcVar, String str2, String str3, boolean z) {
        mwc lwcVar;
        String str4 = null;
        i80 i80Var = z ? new i80(str) : new j80((Long) null, str, (String) null);
        if (str3 != null) {
            String strM = l1d.m("• ", str2);
            if (str2 != null && str2.length() != 0) {
                str4 = strM;
            }
            lwcVar = new mwc(str4 != null ? str4 : "", Collections.singleton(new fn81(str3)));
        } else {
            lwcVar = new lwc(str2 != null ? str2 : "");
        }
        return new apd(nwcVar, lwcVar, new avc(z ? 2131231081 : 2131231084, (Integer) null, 240.0f, 240.0f, 0), i80Var, (y6x0) null, (Float) null, 224);
    }

    public static int m(long j, long j2) {
        if (j2 <= 0) {
            return 0;
        }
        int i = (int) ((((j * 8) * 1000.0d) / j2) - 128000.0d);
        if (i < 500000) {
            return 500000;
        }
        return i;
    }

    public static slc0 n() {
        return new slc0(UUID.randomUUID().toString());
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    public static final b3k o(List list, zax zaxVar, Map map, boolean z, boolean z2, Matrix matrix) {
        int i;
        boolean z3;
        float f;
        x5w0 x5w0Var;
        smc0 smc0VarN;
        char c;
        z6x z6xVarK;
        float f2;
        boolean z4;
        boolean z5;
        yoh0 yoh0VarR;
        soh0 soh0Var;
        List list2;
        Integer num = 2;
        int i2 = 1;
        Integer num2 = 1;
        List list3 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            x7g1 x7g1Var = (x7g1) next;
            if (!(x7g1Var instanceof x7g1)) {
                eg.o();
                return null;
            }
            String str = x7g1Var.a;
            n5f0 n5f0Var = x7g1Var.b;
            int i5 = i4;
            long j = n5f0Var.a;
            long j2 = n5f0Var.b;
            int i6 = (j == 0 && j2 == Long.MAX_VALUE) ? i2 : 0;
            int i7 = i2;
            Integer num3 = num2;
            long j3 = i6 == 0 ? j2 - j : 0L;
            Iterator it2 = it;
            w9a sg10Var = new sg10(new hu7());
            w9a xg10Var = new xg10(new iu7(j3));
            w9a[] w9aVarArr = new w9a[2];
            w9aVarArr[0] = sg10Var;
            w9aVarArr[i7] = xg10Var;
            List listM = p7h.M(w9aVarArr);
            List list4 = (List) map.get(Integer.valueOf(i3));
            smc0 smc0VarN2 = k4p1.n();
            Integer num4 = zaxVar.c;
            Integer num5 = zaxVar.d;
            int i8 = zaxVar.f;
            if (i8 == i7) {
                i = 0;
            } else if (i8 == 2) {
                i = 1;
            } else {
                if (i8 != 3) {
                    throw null;
                }
                i = 2;
            }
            int i9 = zaxVar.e;
            int i10 = zaxVar.b;
            if (i10 == 4 && num4 == null && num5 == null && i9 == 1) {
                z6xVarK = z6x.a;
                num = num;
                i5 = i5;
                c = 2;
            } else {
                short sD = xvj1.d(i10);
                if (sD > 720) {
                    x5w0Var = x5w0.f(xvj1.h(i10), sD, i);
                } else {
                    if (num4 != null && num5 != null) {
                        x5w0Var = x5w0.f(num4.intValue(), num5.intValue(), i);
                    } else if (num5 != null) {
                        z3 = false;
                        f = -1.0f;
                        x5w0Var = new x5w0(-1.0f, -1, num5.intValue(), 0);
                    } else {
                        z3 = false;
                        f = -1.0f;
                        x5w0Var = null;
                    }
                    smc0VarN = k4p1.n();
                    if (x5w0Var != null) {
                        smc0VarN.add(x5w0Var);
                    }
                    if (i9 != 1) {
                        switch (i9) {
                            case 1:
                                f2 = f;
                                break;
                            case 2:
                                f2 = 1.3333334f;
                                break;
                            case 3:
                                f2 = 1.7777778f;
                                break;
                            case 4:
                                f2 = 1.0f;
                                break;
                            case 5:
                                f2 = 2.3333333f;
                                break;
                            case 6:
                                f2 = 0.5625f;
                                break;
                            case 7:
                                f2 = 1.2f;
                                break;
                            default:
                                throw null;
                        }
                        if (f2 > 0.0f) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        dm5.o(z4, "aspect ratio %s must be positive", Float.valueOf(f2));
                        if (i != 0 || i == 1) {
                            c = 2;
                        } else {
                            c = 2;
                            if (i != 2) {
                                z5 = false;
                            }
                            dm5.l("invalid layout %s", i, z5);
                            smc0VarN.add(new x5w0(f2, -1, -1, i));
                        }
                        z5 = true;
                        dm5.l("invalid layout %s", i, z5);
                        smc0VarN.add(new x5w0(f2, -1, -1, i));
                    } else {
                        c = 2;
                    }
                    z6xVarK = k4p1.k(smc0VarN);
                }
                z3 = false;
                f = -1.0f;
                smc0VarN = k4p1.n();
                if (x5w0Var != null) {
                    smc0VarN.add(x5w0Var);
                }
                if (i9 != 1) {
                    switch (i9) {
                        case 1:
                            f2 = f;
                            break;
                        case 2:
                            f2 = 1.3333334f;
                            break;
                        case 3:
                            f2 = 1.7777778f;
                            break;
                        case 4:
                            f2 = 1.0f;
                            break;
                        case 5:
                            f2 = 2.3333333f;
                            break;
                        case 6:
                            f2 = 0.5625f;
                            break;
                        case 7:
                            f2 = 1.2f;
                            break;
                        default:
                            throw null;
                    }
                    if (f2 > 0.0f) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    dm5.o(z4, "aspect ratio %s must be positive", Float.valueOf(f2));
                    if (i != 0) {
                        c = 2;
                        z5 = true;
                    } else {
                        c = 2;
                        z5 = true;
                    }
                    dm5.l("invalid layout %s", i, z5);
                    smc0VarN.add(new x5w0(f2, -1, -1, i));
                } else {
                    c = 2;
                }
                z6xVarK = k4p1.k(smc0VarN);
            }
            smc0VarN2.addAll((Collection) z6xVarK);
            if (matrix != null) {
                smc0VarN2.add(new upi1(matrix));
            }
            if (list4 != null) {
                if (list4.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    list2 = list4;
                    smc0VarN2.add(new jvq0(b380.p(list2)));
                }
            }
            list2 = list4;
            smc0 smc0VarK = k4p1.k(smc0VarN2);
            if (i6 != 0) {
                loh0 loh0Var = new loh0();
                ooh0 ooh0Var = new ooh0();
                List list5 = Collections.EMPTY_LIST;
                w280 w280Var = b380.b;
                bg11 bg11Var = bg11.e;
                qoh0 qoh0Var = new qoh0();
                toh0 toh0Var = toh0.d;
                Uri uri = Uri.parse(str);
                dm5.y(((Uri) ooh0Var.e) == null || ((UUID) ooh0Var.d) != null);
                if (uri != null) {
                    soh0Var = new soh0(uri, (String) null, ((UUID) ooh0Var.d) != null ? new poh0(ooh0Var) : null, (joh0) null, list5, (String) null, bg11Var, -9223372036854775807L);
                } else {
                    soh0Var = null;
                }
                yoh0VarR = new yoh0("", new noh0(loh0Var), soh0Var, new roh0(qoh0Var), tqh0.M, toh0Var);
            } else {
                yoh0VarR = r(j, j2, str);
            }
            yoh0 yoh0Var = yoh0VarR;
            arrayList.add(new l3i0(p(yoh0Var, listM, smc0VarK, 40), p(yoh0Var, listM, smc0VarK, 24)));
            num = num;
            it = it2;
            num2 = num3;
            i3 = i5;
            i2 = 1;
        }
        Integer num6 = num;
        Integer num7 = num2;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((l3i0) it3.next()).a);
        }
        t380 t380Var = f4w.e;
        int i11 = t380.c;
        Integer num8 = num6;
        otu otuVar = new otu(new b291(num8));
        ((v280) otuVar.b).e(arrayList2);
        f4w f4wVar = new f4w(otuVar);
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((l3i0) it4.next()).b);
        }
        int i12 = t380.c;
        otu otuVar2 = new otu(new b291(num7));
        ((v280) otuVar2.b).e(arrayList3);
        b3k b3kVar = new b3k(f4wVar, new f4w[]{new f4w(otuVar2)});
        if (z2) {
            b3kVar.e = true;
        }
        if (z) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 33) {
                num8 = num7;
            } else if (i13 < 29) {
                num8 = null;
            }
            if (num8 != null) {
                b3kVar.g = num8.intValue();
            }
        }
        return b3kVar.a();
    }

    public static e4w p(yoh0 yoh0Var, List list, smc0 smc0Var, int i) {
        boolean z = (i & 16) == 0;
        boolean z2 = (i & 32) == 0;
        d4w d4wVar = new d4w(yoh0Var);
        d4wVar.d = 3000000L;
        d4wVar.e = 30;
        d4wVar.f = new cnw(list, smc0Var);
        d4wVar.b = z;
        d4wVar.c = z2;
        return new e4w(d4wVar);
    }

    public static final twr q(Context context, zax zaxVar, Integer num) {
        if (num == null) {
            int i = zaxVar.a;
            num = i != 6 ? Integer.valueOf(td6.b(i) * 1000) : null;
        }
        oi oiVar = new oi(context);
        oiVar.d = new pkj1(num != null ? num.intValue() : -1, -1, -1, 3.0f, -1, -1, -1);
        return new twr(oiVar);
    }

    public static final yoh0 r(long j, long j2, String str) {
        soh0 soh0Var;
        ooh0 ooh0Var = new ooh0();
        List list = Collections.EMPTY_LIST;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        qoh0 qoh0Var = new qoh0();
        toh0 toh0Var = toh0.d;
        Uri uri = Uri.parse(str);
        loh0 loh0Var = new loh0();
        loh0Var.b(zoi1.W(j));
        loh0Var.a(zoi1.W(j2));
        loh0 loh0VarA = new moh0(loh0Var).a();
        dm5.y(((Uri) ooh0Var.e) == null || ((UUID) ooh0Var.d) != null);
        poh0 poh0Var = null;
        if (uri != null) {
            if (((UUID) ooh0Var.d) != null) {
                poh0Var = new poh0(ooh0Var);
            }
            soh0Var = new soh0(uri, (String) null, poh0Var, (joh0) null, list, (String) null, bg11Var, -9223372036854775807L);
        } else {
            soh0Var = null;
        }
        return new yoh0("", new noh0(loh0VarA), soh0Var, new roh0(qoh0Var), tqh0.M, toh0Var);
    }

    public static final b3k s(yoh0 yoh0Var) {
        return new b3k(new f4w(new otu(new e4w[]{new e4w(new d4w(yoh0Var))})), new f4w[0]).a();
    }

    public static final ru1 t(vo1 vo1Var) {
        lio lioVar = vo1Var instanceof lio ? (lio) vo1Var : null;
        if (lioVar != null) {
            return lioVar.S0();
        }
        return null;
    }

    public static final tjj1 u(String str) throws IOException {
        String path;
        Integer numC0;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        tjj1 tjj1Var = null;
        try {
            try {
                Uri uri = Uri.parse(str);
                if (!u890.j(uri.getScheme(), "file")) {
                    uri = null;
                }
                if (uri == null || (path = uri.getPath()) == null) {
                    path = str;
                }
                mediaMetadataRetriever.setDataSource(path);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                Integer numC1 = strExtractMetadata != null ? nhc1.c0(strExtractMetadata) : null;
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                Integer numC2 = strExtractMetadata2 != null ? nhc1.c0(strExtractMetadata2) : null;
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                int iIntValue = (strExtractMetadata3 == null || (numC0 = nhc1.c0(strExtractMetadata3)) == null) ? 0 : numC0.intValue();
                if (numC1 != null && numC2 != null && numC1.intValue() > 0 && numC2.intValue() > 0) {
                    tjj1Var = (iIntValue == 90 || iIntValue == 270) ? new tjj1(numC2.intValue(), numC1.intValue()) : new tjj1(numC1.intValue(), numC2.intValue());
                }
                return tjj1Var;
            } catch (Exception e) {
                Logger.l(e, "Failed to extract video dimensions for path: ".concat(str), new Object[0]);
                return null;
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public static final boolean v(String str) {
        return URLUtil.isHttpsUrl(str) || URLUtil.isFileUrl(str) || URLUtil.isContentUrl(str);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    public static to01 w(RecentlyPlayedEntity recentlyPlayedEntity) {
        String collectionLink;
        int iOrdinal;
        String imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed;
        yo01 yo01Var = (yo01) qo01.a.get(recentlyPlayedEntity.getType$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed());
        if (yo01Var == null) {
            yo01Var = yo01.Y;
        }
        yo01 yo01Var2 = yo01Var;
        yo01 yo01Var3 = yo01.a;
        if (yo01Var2 == yo01Var3 && recentlyPlayedEntity.getInCollection()) {
            collectionLink = recentlyPlayedEntity.getCollectionLink();
        } else if (yo01Var2 == yo01Var3) {
            collectionLink = recentlyPlayedEntity.getLink();
        } else if (yo01Var2 == yo01.c) {
            collectionLink = nik1.s2.a;
        } else if (yo01Var2 == yo01.d) {
            collectionLink = nik1.t2.a;
        } else {
            collectionLink = recentlyPlayedEntity.getCollectionLink().length() > 0 ? recentlyPlayedEntity.getCollectionLink() : recentlyPlayedEntity.getLink();
        }
        String str = collectionLink;
        f281 f281Var = u890.j(recentlyPlayedEntity.getMediaType(), "video") ? f281.c : f281.b;
        xwp0 xwp0VarO = dm5.O(recentlyPlayedEntity.getSyncProgress$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed(), recentlyPlayedEntity.getOffline$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed());
        int i = 1;
        boolean zIsLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = true;
        if (!qo01.b.contains(yo01Var2) && !u890.j(recentlyPlayedEntity.isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed(), Boolean.TRUE)) {
            i = u890.j(recentlyPlayedEntity.isOnDemandInFree$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed(), Boolean.FALSE) ? 2 : 3;
        }
        b7x formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = recentlyPlayedEntity.getFormatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed();
        if (formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed == null) {
            formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = b7x.a;
        }
        String link = recentlyPlayedEntity.getLink();
        switch (yo01Var2.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                if (recentlyPlayedEntity.getName().length() != 0) {
                }
                iOrdinal = yo01Var2.ordinal();
                if (iOrdinal == 2) {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = "https://misc.scdn.co/liked-songs/liked-songs-300.png";
                } else if (iOrdinal != 3) {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = recentlyPlayedEntity.getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed();
                } else {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = "https://misc.scdn.co/your-episodes/SE-300.png";
                }
                return new to01(yo01Var2, f281Var, xwp0VarO, str, i, formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, link, str, zIsLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed);
            case 2:
            case 3:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                zIsLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = false;
                iOrdinal = yo01Var2.ordinal();
                if (iOrdinal == 2) {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = "https://misc.scdn.co/liked-songs/liked-songs-300.png";
                } else if (iOrdinal != 3) {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = recentlyPlayedEntity.getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed();
                } else {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = "https://misc.scdn.co/your-episodes/SE-300.png";
                }
                return new to01(yo01Var2, f281Var, xwp0VarO, str, i, formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, link, str, zIsLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed);
            case 6:
                zIsLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = recentlyPlayedEntity.isLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed();
                iOrdinal = yo01Var2.ordinal();
                if (iOrdinal == 2) {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = "https://misc.scdn.co/liked-songs/liked-songs-300.png";
                } else if (iOrdinal != 3) {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = recentlyPlayedEntity.getImageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed();
                } else {
                    imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed = "https://misc.scdn.co/your-episodes/SE-300.png";
                }
                return new to01(yo01Var2, f281Var, xwp0VarO, str, i, formatListAttributes$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, link, str, zIsLoading$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed, imageUri$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed);
            default:
                eg.o();
                return null;
        }
    }

    public static final xjz x(x7g1 x7g1Var) {
        String str = x7g1Var.a;
        if (str.length() == 0 || (!wqn1.y(str) && !hon1.x(str) && !nhc1.Y(str, "spotify:image:", false) && !v(str))) {
            return xjz.U0;
        }
        if (!(x7g1Var instanceof x7g1)) {
            return null;
        }
        n5f0 n5f0Var = x7g1Var.b;
        long j = n5f0Var.a;
        long j2 = n5f0Var.b;
        if (j < 0 || j2 < 0 || j >= j2) {
            return xjz.T0;
        }
        return null;
    }

    public abstract rwo1 j(String str, Serializable serializable);

    public abstract sc70 l();
}
