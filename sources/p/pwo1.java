package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.adsinternal.v1.ClientPayload;
import com.spotify.adsinternal.v1.SelectedSurveyOption;
import com.spotify.adsinternal.v1.Survey;
import com.spotify.adsinternal.v1.SurveyQuestionAnswer;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pwo1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public static final void A(otf1 otf1Var, qy20 qy20Var, rdm1 rdm1Var) {
        boolean z;
        qdm1 qdm1Var = rdm1Var.j;
        String str = qdm1Var != null ? qdm1Var.c : null;
        boolean z2 = false;
        if (qy20Var.e) {
            if (r(qy20Var, qdm1Var != null ? qdm1Var.e.b : gem1.a, qy20Var.g)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        otf1Var.a(aof1.a, str, z);
        qdm1 qdm1Var2 = rdm1Var.k;
        String str2 = qdm1Var2 != null ? qdm1Var2.c : null;
        if (qy20Var.f) {
            if (r(qy20Var, qdm1Var2 != null ? qdm1Var2.e.b : gem1.b, qy20Var.h)) {
                z2 = true;
            }
        }
        otf1Var.a(aof1.b, str2, z2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:149:0x0206  */
    /* JADX WARN: Code duplicated, block: B:150:0x0208  */
    /* JADX WARN: Code duplicated, block: B:153:0x020e  */
    /* JADX WARN: Code duplicated, block: B:155:0x021b  */
    /* JADX WARN: Code duplicated, block: B:158:0x025b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0268  */
    /* JADX WARN: Code duplicated, block: B:162:0x0285  */
    /* JADX WARN: Code duplicated, block: B:164:0x028d  */
    /* JADX WARN: Code duplicated, block: B:167:0x029c  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:175:0x0335  */
    /* JADX WARN: Code duplicated, block: B:178:0x034b  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    public static final void a(y7e1 y7e1Var, qim0 qim0Var, max maxVar, String str, rwo1 rwo1Var, lee1 lee1Var, vu30 vu30Var, kua0 kua0Var, yta0 yta0Var, mqf mqfVar, e6e1 e6e1Var, vu30 vu30Var2, boolean z, dk80 dk80Var, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        max maxVar2;
        String str2;
        rwo1 rwo1Var2;
        lee1 lee1Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        x340 x340Var;
        vu30 vu30Var3;
        boolean z3;
        dk80 dk80Var2;
        lee1 lee1Var3;
        max maxVar3;
        mqf mqfVar2;
        rwo1 rwo1Var3;
        h311 h311VarV;
        vu30 vu30VarR;
        max maxVar4;
        x340 x340Var2;
        vu30 vu30Var4;
        boolean z4;
        max maxVar5;
        dk80 dk80Var3;
        int i15;
        mqf mqfVar3;
        lee1 lee1Var4;
        x340 x340Var3;
        zzq0 zzq0VarH;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.k0(-749461606);
        if ((i & 6) == 0) {
            i4 = (x340Var4.i(y7e1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i4 |= x340Var4.i(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                maxVar2 = maxVar;
                int i20 = x340Var4.i(maxVar2) ? 256 : 128;
                i4 |= i20;
            } else {
                maxVar2 = maxVar;
            }
            i4 |= i20;
        } else {
            maxVar2 = maxVar;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i4 |= x340Var4.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        int i21 = i3 & 16;
        if (i21 == 0) {
            if ((i & 24576) == 0) {
                rwo1Var2 = rwo1Var;
                i4 |= x340Var4.g(rwo1Var2) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                lee1Var2 = lee1Var;
                if ((i3 & 32) == 0 || !x340Var4.i(lee1Var2)) {
                    i19 = 65536;
                } else {
                    i19 = 131072;
                }
                i4 |= i19;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((i & 1572864) == 0) {
                if (x340Var4.i(vu30Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i4 |= i18;
            }
            if ((i & 12582912) == 0) {
                if (x340Var4.i(kua0Var)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i4 |= i17;
            }
            if ((i & 100663296) == 0) {
                if (x340Var4.i(yta0Var)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i4 |= i16;
            }
            if ((i & 805306368) == 0) {
                i4 |= 268435456;
            }
            if (x340Var4.i(e6e1Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i6 = i2 | i5;
            i7 = i3 & 2048;
            if (i7 != 0) {
                i9 = i6 | 48;
            } else {
                if (x340Var4.i(vu30Var2)) {
                    i8 = 32;
                } else {
                    i8 = 16;
                }
                i9 = i6 | i8;
            }
            i10 = i9;
            i11 = i3 & 4096;
            if (i11 != 0) {
                i13 = i10 | 384;
            } else {
                if (x340Var4.h(z)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i13 = i10 | i12;
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
                if ((i2 & 3072) == 0) {
                    i13 |= x340Var4.i(dk80Var) ? 2048 : 1024;
                }
                if ((i4 & 306783379) == 306783378 || (i13 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var4.Y(i4 & 1, z2)) {
                    x340Var4.d0();
                    vu30VarR = null;
                    if ((i & 1) != 0 || x340Var4.E()) {
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            maxVar4 = jax.a;
                        } else {
                            maxVar4 = maxVar2;
                        }
                        if (i21 != 0) {
                            rwo1Var2 = qqf.b;
                        }
                        if ((i3 & 32) != 0) {
                            c6e1 c6e1Var = nqf.a;
                            lee1Var2 = (lee1) x340Var4.k(rgx.a);
                            i4 &= -458753;
                        }
                        c6e1 c6e1Var2 = nqf.a;
                        uwr uwrVar = cbx.a;
                        x340Var2 = x340Var4;
                        max maxVar6 = maxVar4;
                        mqf mqfVar4 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                        int i22 = i4 & (-1879048193);
                        if (i7 != 0) {
                            vu30Var4 = null;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i11 != 0) {
                            z4 = false;
                        } else {
                            z4 = z;
                        }
                        maxVar5 = maxVar6;
                        if (i14 != 0) {
                            dk80Var3 = null;
                        } else {
                            dk80Var3 = dk80Var;
                        }
                        i15 = i22;
                        mqfVar3 = mqfVar4;
                        lee1Var4 = lee1Var2;
                    } else {
                        x340Var4.b0();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        vu30Var4 = vu30Var2;
                        z4 = z;
                        dk80Var3 = dk80Var;
                        i15 = i4 & (-1879048193);
                        x340Var2 = x340Var4;
                        lee1Var4 = lee1Var2;
                        maxVar5 = maxVar2;
                        mqfVar3 = mqfVar;
                    }
                    x340Var2.s();
                    long j = mqfVar3.b;
                    long j2 = mqfVar3.c;
                    int i23 = i13;
                    long j3 = mqfVar3.d;
                    uwr uwrVar2 = cbx.a;
                    int i24 = i15;
                    long j4 = cbx.a(x340Var2).b.d;
                    long j5 = u7h.j;
                    fyx fyxVar = new fyx(new zxx(j, j2, j3, j4, j5, j5, mqfVar3.a, 0L, 896));
                    if (vu30Var == null) {
                        x340Var3 = x340Var2;
                        x340Var3.i0(-1969274202);
                        x340Var3.r(false);
                    } else {
                        x340Var3 = x340Var2;
                        x340Var3.i0(-1969274201);
                        vu30VarR = apo.r(1665482922, new k7f((byte) 4, vu30Var, false), x340Var3);
                        x340Var3.r(false);
                    }
                    if (rwo1Var2 instanceof pqf) {
                        zzq0VarH = ((pqf) rwo1Var2).b;
                    } else {
                        zzq0VarH = uyn1.h(2, 0.0f, 0.0f);
                    }
                    zzq0 zzq0Var = zzq0VarH;
                    if (u890.j(rwo1Var2, rqf.b)) {
                        x340Var3.i0(1321966818);
                        cvx cvxVar = cbx.b(x340Var3).b;
                        x340Var3.r(false);
                        f = 8.0f;
                    } else if (u890.j(rwo1Var2, sqf.b)) {
                        x340Var3.i0(1321969442);
                        cvx cvxVar2 = cbx.b(x340Var3).b;
                        x340Var3.r(false);
                        f = 6.0f;
                    } else {
                        x340Var3.i0(1321970341);
                        x340Var3.r(false);
                        f = Float.NaN;
                    }
                    float f2 = f;
                    int i25 = i24 << 3;
                    int i26 = (i24 & 14) | (i25 & 896) | (i25 & 7168) | (i25 & 57344) | ((i23 << 18) & 1879048192);
                    int i27 = i24 >> 18;
                    int i28 = ((i24 >> 15) & 14) | (i27 & 112) | (i27 & 896);
                    int i29 = i23 << 9;
                    x340Var = x340Var3;
                    rwo1.a(y7e1Var, fyxVar, qim0Var2, maxVar5, str2, null, vu30VarR, false, dk80Var3, lee1Var4, kua0Var, yta0Var, e6e1Var, vu30Var4, null, null, null, zzq0Var, f2, z4, x340Var, i26, i28 | (i29 & 7168) | (i29 & 57344), (i23 >> 6) & 14, 229792);
                    mqfVar2 = mqfVar3;
                    maxVar3 = maxVar5;
                    dk80Var2 = dk80Var3;
                    lee1Var3 = lee1Var4;
                    vu30Var3 = vu30Var4;
                    z3 = z4;
                } else {
                    x340Var = x340Var4;
                    x340Var.b0();
                    vu30Var3 = vu30Var2;
                    z3 = z;
                    dk80Var2 = dk80Var;
                    lee1Var3 = lee1Var2;
                    maxVar3 = maxVar2;
                    mqfVar2 = mqfVar;
                }
                rwo1Var3 = rwo1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oqf(y7e1Var, qim0Var, maxVar3, str, rwo1Var3, lee1Var3, vu30Var, kua0Var, yta0Var, mqfVar2, e6e1Var, vu30Var3, z3, dk80Var2, i, i2, i3);
                }
            }
            i13 |= 3072;
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var4.Y(i4 & 1, z2)) {
                x340Var4.d0();
                vu30VarR = null;
                if ((i & 1) != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i21 != 0) {
                        rwo1Var2 = qqf.b;
                    }
                    if ((i3 & 32) != 0) {
                        c6e1 c6e1Var3 = nqf.a;
                        lee1Var2 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -458753;
                    }
                    c6e1 c6e1Var4 = nqf.a;
                    uwr uwrVar3 = cbx.a;
                    x340Var2 = x340Var4;
                    max maxVar7 = maxVar4;
                    mqf mqfVar5 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                    int i210 = i4 & (-1879048193);
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i11 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    maxVar5 = maxVar7;
                    if (i14 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    i15 = i210;
                    mqfVar3 = mqfVar5;
                    lee1Var4 = lee1Var2;
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i21 != 0) {
                        rwo1Var2 = qqf.b;
                    }
                    if ((i3 & 32) != 0) {
                        c6e1 c6e1Var5 = nqf.a;
                        lee1Var2 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -458753;
                    }
                    c6e1 c6e1Var6 = nqf.a;
                    uwr uwrVar4 = cbx.a;
                    x340Var2 = x340Var4;
                    max maxVar8 = maxVar4;
                    mqf mqfVar6 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                    int i211 = i4 & (-1879048193);
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i11 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    maxVar5 = maxVar8;
                    if (i14 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    i15 = i211;
                    mqfVar3 = mqfVar6;
                    lee1Var4 = lee1Var2;
                }
                x340Var2.s();
                long j6 = mqfVar3.b;
                long j7 = mqfVar3.c;
                int i212 = i13;
                long j8 = mqfVar3.d;
                uwr uwrVar5 = cbx.a;
                int i213 = i15;
                long j9 = cbx.a(x340Var2).b.d;
                long j10 = u7h.j;
                fyx fyxVar2 = new fyx(new zxx(j6, j7, j8, j9, j10, j10, mqfVar3.a, 0L, 896));
                if (vu30Var == null) {
                    x340Var3 = x340Var2;
                    x340Var3.i0(-1969274202);
                    x340Var3.r(false);
                } else {
                    x340Var3 = x340Var2;
                    x340Var3.i0(-1969274201);
                    vu30VarR = apo.r(1665482922, new k7f((byte) 4, vu30Var, false), x340Var3);
                    x340Var3.r(false);
                }
                if (rwo1Var2 instanceof pqf) {
                    zzq0VarH = ((pqf) rwo1Var2).b;
                } else {
                    zzq0VarH = uyn1.h(2, 0.0f, 0.0f);
                }
                zzq0 zzq0Var2 = zzq0VarH;
                if (u890.j(rwo1Var2, rqf.b)) {
                    x340Var3.i0(1321966818);
                    cvx cvxVar3 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f = 8.0f;
                } else if (u890.j(rwo1Var2, sqf.b)) {
                    x340Var3.i0(1321969442);
                    cvx cvxVar4 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f = 6.0f;
                } else {
                    x340Var3.i0(1321970341);
                    x340Var3.r(false);
                    f = Float.NaN;
                }
                float f3 = f;
                int i214 = i213 << 3;
                int i215 = (i213 & 14) | (i214 & 896) | (i214 & 7168) | (i214 & 57344) | ((i212 << 18) & 1879048192);
                int i216 = i213 >> 18;
                int i217 = ((i213 >> 15) & 14) | (i216 & 112) | (i216 & 896);
                int i218 = i212 << 9;
                x340Var = x340Var3;
                rwo1.a(y7e1Var, fyxVar2, qim0Var2, maxVar5, str2, null, vu30VarR, false, dk80Var3, lee1Var4, kua0Var, yta0Var, e6e1Var, vu30Var4, null, null, null, zzq0Var2, f3, z4, x340Var, i215, i217 | (i218 & 7168) | (i218 & 57344), (i212 >> 6) & 14, 229792);
                mqfVar2 = mqfVar3;
                maxVar3 = maxVar5;
                dk80Var2 = dk80Var3;
                lee1Var3 = lee1Var4;
                vu30Var3 = vu30Var4;
                z3 = z4;
            } else {
                x340Var = x340Var4;
                x340Var.b0();
                vu30Var3 = vu30Var2;
                z3 = z;
                dk80Var2 = dk80Var;
                lee1Var3 = lee1Var2;
                maxVar3 = maxVar2;
                mqfVar2 = mqfVar;
            }
            rwo1Var3 = rwo1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oqf(y7e1Var, qim0Var, maxVar3, str, rwo1Var3, lee1Var3, vu30Var, kua0Var, yta0Var, mqfVar2, e6e1Var, vu30Var3, z3, dk80Var2, i, i2, i3);
            }
        }
        i4 |= 24576;
        rwo1Var2 = rwo1Var;
        if ((i & 196608) == 0) {
            lee1Var2 = lee1Var;
            if ((i3 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i4 |= i19;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i & 1572864) == 0) {
            if (x340Var4.i(vu30Var)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i4 |= i18;
        }
        if ((i & 12582912) == 0) {
            if (x340Var4.i(kua0Var)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i4 |= i17;
        }
        if ((i & 100663296) == 0) {
            if (x340Var4.i(yta0Var)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i4 |= i16;
        }
        if ((i & 805306368) == 0) {
            i4 |= 268435456;
        }
        if (x340Var4.i(e6e1Var)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        i6 = i2 | i5;
        i7 = i3 & 2048;
        if (i7 != 0) {
            i9 = i6 | 48;
        } else {
            if (x340Var4.i(vu30Var2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i9 = i6 | i8;
        }
        i10 = i9;
        i11 = i3 & 4096;
        if (i11 != 0) {
            i13 = i10 | 384;
        } else {
            if (x340Var4.h(z)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i13 = i10 | i12;
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
            if ((i2 & 3072) == 0) {
                i13 |= x340Var4.i(dk80Var) ? 2048 : 1024;
            }
            if ((i4 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (x340Var4.Y(i4 & 1, z2)) {
                x340Var4.d0();
                vu30VarR = null;
                if ((i & 1) != 0) {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i21 != 0) {
                        rwo1Var2 = qqf.b;
                    }
                    if ((i3 & 32) != 0) {
                        c6e1 c6e1Var7 = nqf.a;
                        lee1Var2 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -458753;
                    }
                    c6e1 c6e1Var8 = nqf.a;
                    uwr uwrVar6 = cbx.a;
                    x340Var2 = x340Var4;
                    max maxVar9 = maxVar4;
                    mqf mqfVar7 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                    int i219 = i4 & (-1879048193);
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i11 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    maxVar5 = maxVar9;
                    if (i14 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    i15 = i219;
                    mqfVar3 = mqfVar7;
                    lee1Var4 = lee1Var2;
                } else {
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        maxVar4 = jax.a;
                    } else {
                        maxVar4 = maxVar2;
                    }
                    if (i21 != 0) {
                        rwo1Var2 = qqf.b;
                    }
                    if ((i3 & 32) != 0) {
                        c6e1 c6e1Var9 = nqf.a;
                        lee1Var2 = (lee1) x340Var4.k(rgx.a);
                        i4 &= -458753;
                    }
                    c6e1 c6e1Var10 = nqf.a;
                    uwr uwrVar7 = cbx.a;
                    x340Var2 = x340Var4;
                    max maxVar10 = maxVar4;
                    mqf mqfVar8 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                    int i2110 = i4 & (-1879048193);
                    if (i7 != 0) {
                        vu30Var4 = null;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i11 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    maxVar5 = maxVar10;
                    if (i14 != 0) {
                        dk80Var3 = null;
                    } else {
                        dk80Var3 = dk80Var;
                    }
                    i15 = i2110;
                    mqfVar3 = mqfVar8;
                    lee1Var4 = lee1Var2;
                }
                x340Var2.s();
                long j11 = mqfVar3.b;
                long j12 = mqfVar3.c;
                int i2111 = i13;
                long j13 = mqfVar3.d;
                uwr uwrVar8 = cbx.a;
                int i2112 = i15;
                long j14 = cbx.a(x340Var2).b.d;
                long j15 = u7h.j;
                fyx fyxVar3 = new fyx(new zxx(j11, j12, j13, j14, j15, j15, mqfVar3.a, 0L, 896));
                if (vu30Var == null) {
                    x340Var3 = x340Var2;
                    x340Var3.i0(-1969274202);
                    x340Var3.r(false);
                } else {
                    x340Var3 = x340Var2;
                    x340Var3.i0(-1969274201);
                    vu30VarR = apo.r(1665482922, new k7f((byte) 4, vu30Var, false), x340Var3);
                    x340Var3.r(false);
                }
                if (rwo1Var2 instanceof pqf) {
                    zzq0VarH = ((pqf) rwo1Var2).b;
                } else {
                    zzq0VarH = uyn1.h(2, 0.0f, 0.0f);
                }
                zzq0 zzq0Var3 = zzq0VarH;
                if (u890.j(rwo1Var2, rqf.b)) {
                    x340Var3.i0(1321966818);
                    cvx cvxVar5 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f = 8.0f;
                } else if (u890.j(rwo1Var2, sqf.b)) {
                    x340Var3.i0(1321969442);
                    cvx cvxVar6 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f = 6.0f;
                } else {
                    x340Var3.i0(1321970341);
                    x340Var3.r(false);
                    f = Float.NaN;
                }
                float f4 = f;
                int i2113 = i2112 << 3;
                int i2114 = (i2112 & 14) | (i2113 & 896) | (i2113 & 7168) | (i2113 & 57344) | ((i2111 << 18) & 1879048192);
                int i2115 = i2112 >> 18;
                int i2116 = ((i2112 >> 15) & 14) | (i2115 & 112) | (i2115 & 896);
                int i2117 = i2111 << 9;
                x340Var = x340Var3;
                rwo1.a(y7e1Var, fyxVar3, qim0Var2, maxVar5, str2, null, vu30VarR, false, dk80Var3, lee1Var4, kua0Var, yta0Var, e6e1Var, vu30Var4, null, null, null, zzq0Var3, f4, z4, x340Var, i2114, i2116 | (i2117 & 7168) | (i2117 & 57344), (i2111 >> 6) & 14, 229792);
                mqfVar2 = mqfVar3;
                maxVar3 = maxVar5;
                dk80Var2 = dk80Var3;
                lee1Var3 = lee1Var4;
                vu30Var3 = vu30Var4;
                z3 = z4;
            } else {
                x340Var = x340Var4;
                x340Var.b0();
                vu30Var3 = vu30Var2;
                z3 = z;
                dk80Var2 = dk80Var;
                lee1Var3 = lee1Var2;
                maxVar3 = maxVar2;
                mqfVar2 = mqfVar;
            }
            rwo1Var3 = rwo1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oqf(y7e1Var, qim0Var, maxVar3, str, rwo1Var3, lee1Var3, vu30Var, kua0Var, yta0Var, mqfVar2, e6e1Var, vu30Var3, z3, dk80Var2, i, i2, i3);
            }
        }
        i13 |= 3072;
        if ((i4 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (x340Var4.Y(i4 & 1, z2)) {
            x340Var4.d0();
            vu30VarR = null;
            if ((i & 1) != 0) {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i21 != 0) {
                    rwo1Var2 = qqf.b;
                }
                if ((i3 & 32) != 0) {
                    c6e1 c6e1Var11 = nqf.a;
                    lee1Var2 = (lee1) x340Var4.k(rgx.a);
                    i4 &= -458753;
                }
                c6e1 c6e1Var12 = nqf.a;
                uwr uwrVar9 = cbx.a;
                x340Var2 = x340Var4;
                max maxVar11 = maxVar4;
                mqf mqfVar9 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                int i2118 = i4 & (-1879048193);
                if (i7 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i11 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                maxVar5 = maxVar11;
                if (i14 != 0) {
                    dk80Var3 = null;
                } else {
                    dk80Var3 = dk80Var;
                }
                i15 = i2118;
                mqfVar3 = mqfVar9;
                lee1Var4 = lee1Var2;
            } else {
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    maxVar4 = jax.a;
                } else {
                    maxVar4 = maxVar2;
                }
                if (i21 != 0) {
                    rwo1Var2 = qqf.b;
                }
                if ((i3 & 32) != 0) {
                    c6e1 c6e1Var13 = nqf.a;
                    lee1Var2 = (lee1) x340Var4.k(rgx.a);
                    i4 &= -458753;
                }
                c6e1 c6e1Var14 = nqf.a;
                uwr uwrVar10 = cbx.a;
                x340Var2 = x340Var4;
                max maxVar12 = maxVar4;
                mqf mqfVar10 = new mqf(cbx.a(x340Var4).b.c, cbx.a(x340Var4).b.a, cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.b);
                int i2119 = i4 & (-1879048193);
                if (i7 != 0) {
                    vu30Var4 = null;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i11 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                maxVar5 = maxVar12;
                if (i14 != 0) {
                    dk80Var3 = null;
                } else {
                    dk80Var3 = dk80Var;
                }
                i15 = i2119;
                mqfVar3 = mqfVar10;
                lee1Var4 = lee1Var2;
            }
            x340Var2.s();
            long j16 = mqfVar3.b;
            long j17 = mqfVar3.c;
            int i21110 = i13;
            long j18 = mqfVar3.d;
            uwr uwrVar11 = cbx.a;
            int i21111 = i15;
            long j19 = cbx.a(x340Var2).b.d;
            long j110 = u7h.j;
            fyx fyxVar4 = new fyx(new zxx(j16, j17, j18, j19, j110, j110, mqfVar3.a, 0L, 896));
            if (vu30Var == null) {
                x340Var3 = x340Var2;
                x340Var3.i0(-1969274202);
                x340Var3.r(false);
            } else {
                x340Var3 = x340Var2;
                x340Var3.i0(-1969274201);
                vu30VarR = apo.r(1665482922, new k7f((byte) 4, vu30Var, false), x340Var3);
                x340Var3.r(false);
            }
            if (rwo1Var2 instanceof pqf) {
                zzq0VarH = ((pqf) rwo1Var2).b;
            } else {
                zzq0VarH = uyn1.h(2, 0.0f, 0.0f);
            }
            zzq0 zzq0Var4 = zzq0VarH;
            if (u890.j(rwo1Var2, rqf.b)) {
                x340Var3.i0(1321966818);
                cvx cvxVar7 = cbx.b(x340Var3).b;
                x340Var3.r(false);
                f = 8.0f;
            } else if (u890.j(rwo1Var2, sqf.b)) {
                x340Var3.i0(1321969442);
                cvx cvxVar8 = cbx.b(x340Var3).b;
                x340Var3.r(false);
                f = 6.0f;
            } else {
                x340Var3.i0(1321970341);
                x340Var3.r(false);
                f = Float.NaN;
            }
            float f5 = f;
            int i21112 = i21111 << 3;
            int i21113 = (i21111 & 14) | (i21112 & 896) | (i21112 & 7168) | (i21112 & 57344) | ((i21110 << 18) & 1879048192);
            int i21114 = i21111 >> 18;
            int i21115 = ((i21111 >> 15) & 14) | (i21114 & 112) | (i21114 & 896);
            int i21116 = i21110 << 9;
            x340Var = x340Var3;
            rwo1.a(y7e1Var, fyxVar4, qim0Var2, maxVar5, str2, null, vu30VarR, false, dk80Var3, lee1Var4, kua0Var, yta0Var, e6e1Var, vu30Var4, null, null, null, zzq0Var4, f5, z4, x340Var, i21113, i21115 | (i21116 & 7168) | (i21116 & 57344), (i21110 >> 6) & 14, 229792);
            mqfVar2 = mqfVar3;
            maxVar3 = maxVar5;
            dk80Var2 = dk80Var3;
            lee1Var3 = lee1Var4;
            vu30Var3 = vu30Var4;
            z3 = z4;
        } else {
            x340Var = x340Var4;
            x340Var.b0();
            vu30Var3 = vu30Var2;
            z3 = z;
            dk80Var2 = dk80Var;
            lee1Var3 = lee1Var2;
            maxVar3 = maxVar2;
            mqfVar2 = mqfVar;
        }
        rwo1Var3 = rwo1Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oqf(y7e1Var, qim0Var, maxVar3, str, rwo1Var3, lee1Var3, vu30Var, kua0Var, yta0Var, mqfVar2, e6e1Var, vu30Var3, z3, dk80Var2, i, i2, i3);
        }
    }

    public static final void b(osv0 osv0Var, b0k b0kVar, int i) {
        osv0 osv0Var2;
        Object next;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1863520796);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(osv0Var) ? 4 : 2);
        byte b = 0;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 200.0f);
            jma jmaVar = jfx.c;
            String str = osv0Var.g;
            if (str == null) {
                str = "Unknown";
            }
            jmaVar.getClass();
            t0z t0zVar = jfx.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : t0zVar) {
                if (((jfx) obj) != jfx.d) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((jfx) next).a.equals(str));
            jfx jfxVar = (jfx) next;
            qim0 qim0VarQ = i1p1.q(dug.f(qim0VarH, jfxVar != null ? jfxVar.b : jfx.d.b, er31.b(8.0f)), er31.b(8.0f));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarC = u291.c(u291.f(uyn1.y(nim0Var, 16.0f, 20.0f), 1.0f), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarC);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, nim0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            ypa ypaVar = lfx.c;
            String str2 = osv0Var.f;
            String str3 = str2 == null ? "Unknown" : str2;
            ypaVar.getClass();
            hux huxVarH = ypa.h(str3);
            qim0 qim0VarR = u291.r(nim0Var, 12.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar2).c.c;
            isl islVar = isl.a;
            w0h1.a(huxVarH, islVar, qim0VarR, j, 0L, false, b0kVar2, 56, 48);
            op71.g(b0kVar2, u291.v(nim0Var, 4.0f));
            qim0 qim0VarH2 = u291.h(nim0Var, 15.0f);
            String str4 = osv0Var.b;
            if (str4 == null) {
                str4 = "";
            }
            lee1 lee1Var = cbx.d(b0kVar2).n;
            long j2 = cbx.a(b0kVar2).c.c;
            b0kVar2 = b0kVar2;
            uwo1.e(str4, qim0VarH2, lee1Var, j2, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            b0kVar2.r(true);
            op71.g(b0kVar2, u291.h(nim0Var, 8.0f));
            String str5 = osv0Var.e;
            osv0Var2 = osv0Var;
            uwo1.e(str5 != null ? str5 : "", null, cbx.d(b0kVar2).j, ((vex) zex.a.e).m, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            b0kVar2.r(true);
            qim0 qim0VarA = h2c.a.a(uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 20.0f, 3), een.Y);
            b = 0;
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            w0h1.a(gux.c, islVar, u291.r(nim0Var, 32.0f), cbx.a(b0kVar2).b.a, 0L, true, b0kVar2, gux.d | 196656, 16);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            osv0Var2 = osv0Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new im10(osv0Var2, i, b);
        }
    }

    public static final void c(osv0 osv0Var, b0k b0kVar, int i) {
        byte b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(247866709);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(osv0Var) ? 4 : 2);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.h(u291.f(nim0Var, 1.0f), 200.0f), er31.b(8.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            pdp1.b(osv0Var.h, u291.d(nim0Var, 1.0f), mif1.S0, b0kVar2, 48, 1976);
            qim0 qim0VarF = u291.f(uyn1.y(h2c.a.a(nim0Var, een.t), 16.0f, 20.0f), 1.0f);
            fra fraVar = een.O0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            wnb0 wnb0VarQ = kk0.q(b0kVar2, qim0VarE2, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, wnb0VarQ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, b0kVar2, 0);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, nim0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            ypa ypaVar = lfx.c;
            String str = osv0Var.f;
            if (str == null) {
                str = "Unknown";
            }
            ypaVar.getClass();
            hux huxVarH = ypa.h(str);
            qim0 qim0VarR = u291.r(nim0Var, 12.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar2).c.c;
            isl islVar = isl.a;
            b0kVar2 = b0kVar2;
            w0h1.a(huxVarH, islVar, qim0VarR, j, 0L, false, b0kVar2, 56, 48);
            op71.g(b0kVar2, u291.v(nim0Var, 4.0f));
            qim0 qim0VarH = u291.h(nim0Var, 15.0f);
            String str2 = osv0Var.b;
            if (str2 == null) {
                str2 = "";
            }
            b = 1;
            uwo1.e(str2, qim0VarH, cbx.d(b0kVar2).n, cbx.a(b0kVar2).c.c, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            b0kVar2.r(true);
            op71.g(b0kVar2, u291.h(nim0Var, 4.0f));
            qim0 qim0VarH2 = u291.h(nim0Var, 22.0f);
            String str3 = osv0Var.c;
            uwo1.e(str3 != null ? str3 : "", qim0VarH2, cbx.d(b0kVar2).f, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            b0kVar2.r(true);
            w0h1.a(irx.c, islVar, u291.r(nim0Var, 32.0f), cbx.a(b0kVar2).b.a, 0L, true, b0kVar2, irx.d | 196656, 16);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b = 1;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new im10(osv0Var, i, b);
        }
    }

    public static final void d(boolean z, boolean z2, osv0 osv0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(873827581);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(osv0Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = uyn1.A(bin.x(qim0Var3, false, null, null, null, function0, 15), 16.0f, 8.0f, 16.0f, z2 ? 40.0f : 8.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = xc10.P0;
                x340Var.s0(objT);
            }
            hm5.a(boolValueOf, qim0VarA, (iu30) objT, (tl3) null, "FeatureCardFlip", (iu30) null, apo.r(-1121330982, new wx00(osv0Var, (byte) 5), x340Var), x340Var, (i2 & 14) | 1597824, 40);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(z, z2, osv0Var, function0, qim0Var2, i, (byte) 14);
        }
    }

    public static final void e(g2c g2cVar, qdm1 qdm1Var, long j, tob1 tob1Var, tob1 tob1Var2, float f, float f2, boolean z, boolean z2, boolean z3, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        tob1 tob1Var3;
        b0k b0kVar2;
        tob1 tob1Var4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(524098129);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qdm1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(tob1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            tob1Var3 = tob1Var2;
            i2 |= b0kVar3.g(tob1Var3) ? 16384 : 8192;
        } else {
            tob1Var3 = tob1Var2;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.d(f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.d(f2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.h(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.h(z3) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            tob1 tob1VarF = zod.F(Float.valueOf(z ? 1.0f : 0.0f), z2, z3 ? irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 0, gem1.d, 2) : irn1.j0(), b0kVar3, (i2 >> 21) & 112);
            kiv kivVar = t4k.h;
            float fX0 = ((wat) b0kVar3.k(kivVar)).X0(gem1.c);
            qim0 qim0VarU = lrn1.u(u291.x(0.0f, ((wat) b0kVar3.k(kivVar)).N0(f) - (w6t0.c * 2.0f), 1, g2cVar.a(nim0.a, dro.b)), iu30Var);
            boolean zG = b0kVar3.g(qdm1Var);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG2 = b0kVar3.g(ven0Var) | b0kVar3.i(qdm1Var);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new ibe(qdm1Var, ven0Var, (lnm) null, (byte) 1);
                b0kVar3.s0(objT2);
            }
            qxd0.t(qdm1Var, b0kVar3, (vu30) objT2);
            yj41 yj41Var = (yj41) ven0Var.getValue();
            mdm1 mdm1Var = qdm1Var.a;
            mdm1 mdm1Var2 = qdm1Var.b;
            boolean zD = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((i2 & 57344) == 16384) | b0kVar3.d(fX0) | b0kVar3.g(tob1VarF);
            Object objT3 = b0kVar3.T();
            if (zD || objT3 == m4cVar) {
                upw upwVar = new upw(j, tob1Var, f, f2, tob1Var3, fX0, tob1VarF);
                tob1Var4 = tob1VarF;
                b0kVar3.s0(upwVar);
                objT3 = upwVar;
            } else {
                tob1Var4 = tob1VarF;
            }
            b0kVar2 = b0kVar3;
            vxo1.e(yj41Var, mdm1Var, mdm1Var2, tob1Var4, i541.C(qim0VarU, (iu30) objT3), b0kVar2, 8);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l2t0(g2cVar, qdm1Var, j, tob1Var, tob1Var2, f, f2, z, z2, z3, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x0321  */
    /* JADX WARN: Code duplicated, block: B:169:0x0337  */
    /* JADX WARN: Code duplicated, block: B:171:0x034b  */
    /* JADX WARN: Code duplicated, block: B:172:0x034e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0355  */
    /* JADX WARN: Code duplicated, block: B:177:0x0388  */
    public static final void f(i2c i2cVar, rdm1 rdm1Var, tob1 tob1Var, tob1 tob1Var2, Set set, boolean z, boolean z2, idm1 idm1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        b0k b0kVar2;
        m4c m4cVar;
        b0k b0kVar3;
        tob1 tob1Var3;
        otf1 otf1Var;
        mnf1 mnf1Var;
        boolean z4;
        float fM0;
        m4c m4cVar2;
        float f;
        float f2;
        boolean z5;
        cdm1 cdm1Var;
        boolean z6;
        Object objT;
        cdm1 cdm1Var2;
        boolean z7;
        Object objT2;
        long j = i2cVar.b;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-569212395);
        if ((i & 6) == 0) {
            i2 = (b0kVar4.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar4.i(rdm1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar4.g(tob1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar4.g(tob1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar4.g(set) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z3 = z;
            i2 |= b0kVar4.h(z3) ? 131072 : 65536;
        } else {
            z3 = z;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar4.h(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar4.i(idm1Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar4.i(iu30Var) ? 67108864 : 33554432;
        }
        if (b0kVar4.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            qdm1 qdm1Var = rdm1Var.j;
            if (qdm1Var == null || !set.contains(qdm1Var.e.a)) {
                qdm1Var = null;
            }
            qdm1 qdm1Var2 = rdm1Var.k;
            if (qdm1Var2 == null || !set.contains(qdm1Var2.e.a)) {
                qdm1Var2 = null;
            }
            float fI = hjl.i(j);
            float fH = hjl.h(j);
            Object objT3 = b0kVar4.T();
            m4c m4cVar3 = fkj0.X;
            if (objT3 == m4cVar3) {
                objT3 = new mnf1();
                b0kVar4.s0(objT3);
            }
            mnf1 mnf1Var2 = (mnf1) objT3;
            ven0 ven0VarS = v8r.s(Float.valueOf(fI), b0kVar4);
            ven0 ven0VarS2 = v8r.s(Float.valueOf(fH), b0kVar4);
            ven0 ven0VarS3 = v8r.s(Boolean.valueOf(qdm1Var != null), b0kVar4);
            ven0 ven0VarS4 = v8r.s(Boolean.valueOf(qdm1Var2 != null), b0kVar4);
            Object objT4 = b0kVar4.T();
            qdm1 qdm1Var3 = qdm1Var2;
            if (objT4 == m4cVar3) {
                objT4 = p3d1.n(0L, b0kVar4);
            }
            tob1 tob1Var4 = (ven0) objT4;
            Object objT5 = b0kVar4.T();
            if (objT5 == m4cVar3) {
                objT5 = p3d1.n(0L, b0kVar4);
            }
            ven0 ven0Var = (ven0) objT5;
            xhm1 xhm1Var = (xhm1) b0kVar4.k(yhm1.a);
            boolean zG = b0kVar4.g(idm1Var) | b0kVar4.g(xhm1Var);
            Object objT6 = b0kVar4.T();
            if (zG || objT6 == m4cVar3) {
                objT6 = xhm1Var != null ? new otf1(idm1Var, xhm1Var) : null;
                b0kVar4.s0(objT6);
            }
            otf1 otf1Var2 = (otf1) objT6;
            boolean zI = b0kVar4.i(otf1Var2);
            Object objT7 = b0kVar4.T();
            if (zI || objT7 == m4cVar3) {
                objT7 = new fgs0(otf1Var2, (byte) 5);
                b0kVar4.s0(objT7);
            }
            qxd0.i(otf1Var2, (iu30) objT7, b0kVar4);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG2 = ((458752 & i2) == 131072) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | b0kVar4.g(ven0VarS) | b0kVar4.g(ven0VarS2) | b0kVar4.g(ven0VarS3) | b0kVar4.g(ven0VarS4) | b0kVar4.i(otf1Var2) | b0kVar4.i(rdm1Var) | b0kVar4.g(mnf1Var2);
            Object objT8 = b0kVar4.T();
            if (zG2 || objT8 == m4cVar3) {
                m4cVar = m4cVar3;
                b0kVar3 = b0kVar4;
                tob1Var3 = tob1Var4;
                otf1Var = otf1Var2;
                objT8 = new m2t0(z3, otf1Var, rdm1Var, tob1Var, tob1Var2, ven0VarS, ven0VarS2, ven0VarS3, ven0VarS4, tob1Var3, ven0Var, mnf1Var2, null);
                mnf1Var = mnf1Var2;
                b0kVar3.s0(objT8);
            } else {
                b0kVar3 = b0kVar4;
                otf1Var = otf1Var2;
                m4cVar = m4cVar3;
                tob1Var3 = tob1Var4;
                mnf1Var = mnf1Var2;
            }
            qxd0.s(boolValueOf, otf1Var, (vu30) objT8, b0kVar3);
            int iMax = Math.max(qdm1Var != 0 ? (int) (((yr80) tob1Var3.getValue()).a & 4294967295L) : 0, qdm1Var3 != null ? (int) (4294967295L & ((yr80) ven0Var.getValue()).a) : 0);
            if (iMax > 0) {
                b0kVar3.i0(-871968977);
                fM0 = ((wat) b0kVar3.k(t4k.h)).M0(iMax) + w6t0.d + w6t0.e;
                z4 = false;
                b0kVar3.r(false);
            } else {
                z4 = false;
                b0kVar3.i0(-871841381);
                b0kVar3.r(false);
                fM0 = 0.0f;
            }
            p3v p3vVar = new p3v(fM0);
            boolean zD = b0kVar3.d(fM0) | ((i2 & 234881024) == 67108864 ? true : z4);
            Object objT9 = b0kVar3.T();
            if (zD) {
                m4cVar2 = m4cVar;
            } else {
                m4cVar2 = m4cVar;
                if (objT9 == m4cVar2) {
                }
                qxd0.t(p3vVar, b0kVar3, (vu30) objT9);
                if (qdm1Var != 0) {
                    qdm1 qdm1Var4 = qdm1Var;
                    cdm1Var2 = qdm1Var4.e;
                    b0kVar3.i0(-871714250);
                    long j2 = cdm1Var2.b;
                    if (mnf1Var.a() == cdm1Var2.a) {
                        z7 = true;
                    } else {
                        z7 = z4;
                    }
                    objT2 = b0kVar3.T();
                    if (objT2 == m4cVar2) {
                        objT2 = new abh0(tob1Var3, (byte) 24);
                        b0kVar3.s0(objT2);
                    }
                    iu30 iu30Var2 = (iu30) objT2;
                    int i3 = i2 << 3;
                    int i4 = (i2 & 14) | (i3 & 7168) | (i3 & 57344);
                    int i5 = i2 << 9;
                    b0kVar2 = b0kVar3;
                    f = fI;
                    z5 = z4;
                    f2 = fH;
                    e(i2cVar, qdm1Var4, j2, tob1Var, tob1Var2, f, f2, z7, z, z2, iu30Var2, b0kVar2, i4 | (i5 & 234881024) | (i5 & 1879048192));
                    b0kVar2.r(z5);
                } else {
                    b0kVar2 = b0kVar3;
                    f = fI;
                    f2 = fH;
                    z5 = z4;
                    b0kVar2.i0(-871323123);
                    b0kVar2.r(z5);
                }
                if (qdm1Var3 != null) {
                    cdm1Var = qdm1Var3.e;
                    b0kVar2.i0(-871283598);
                    long j3 = cdm1Var.b;
                    if (mnf1Var.a() == cdm1Var.a) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    objT = b0kVar2.T();
                    if (objT == m4cVar2) {
                        objT = new abh0(ven0Var, (byte) 25);
                        b0kVar2.s0(objT);
                    }
                    iu30 iu30Var3 = (iu30) objT;
                    int i6 = i2 << 3;
                    int i7 = (i2 & 14) | (i6 & 7168) | (i6 & 57344);
                    int i8 = i2 << 9;
                    e(i2cVar, qdm1Var3, j3, tob1Var, tob1Var2, f, f2, z6, z, z2, iu30Var3, b0kVar2, i7 | (i8 & 234881024) | (i8 & 1879048192));
                    b0kVar2.r(z5);
                } else {
                    b0kVar2.i0(-870888627);
                    b0kVar2.r(z5);
                }
            }
            objT9 = new n2t0(iu30Var, fM0, (lnm) null);
            b0kVar3.s0(objT9);
            qxd0.t(p3vVar, b0kVar3, (vu30) objT9);
            if (qdm1Var != 0) {
                qdm1 qdm1Var5 = qdm1Var;
                cdm1Var2 = qdm1Var5.e;
                b0kVar3.i0(-871714250);
                long j4 = cdm1Var2.b;
                if (mnf1Var.a() == cdm1Var2.a) {
                    z7 = true;
                } else {
                    z7 = z4;
                }
                objT2 = b0kVar3.T();
                if (objT2 == m4cVar2) {
                    objT2 = new abh0(tob1Var3, (byte) 24);
                    b0kVar3.s0(objT2);
                }
                iu30 iu30Var4 = (iu30) objT2;
                int i9 = i2 << 3;
                int i10 = (i2 & 14) | (i9 & 7168) | (i9 & 57344);
                int i11 = i2 << 9;
                b0kVar2 = b0kVar3;
                f = fI;
                z5 = z4;
                f2 = fH;
                e(i2cVar, qdm1Var5, j4, tob1Var, tob1Var2, f, f2, z7, z, z2, iu30Var4, b0kVar2, i10 | (i11 & 234881024) | (i11 & 1879048192));
                b0kVar2.r(z5);
            } else {
                b0kVar2 = b0kVar3;
                f = fI;
                f2 = fH;
                z5 = z4;
                b0kVar2.i0(-871323123);
                b0kVar2.r(z5);
            }
            if (qdm1Var3 != null) {
                cdm1Var = qdm1Var3.e;
                b0kVar2.i0(-871283598);
                long j5 = cdm1Var.b;
                if (mnf1Var.a() == cdm1Var.a) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                objT = b0kVar2.T();
                if (objT == m4cVar2) {
                    objT = new abh0(ven0Var, (byte) 25);
                    b0kVar2.s0(objT);
                }
                iu30 iu30Var5 = (iu30) objT;
                int i12 = i2 << 3;
                int i13 = (i2 & 14) | (i12 & 7168) | (i12 & 57344);
                int i14 = i2 << 9;
                e(i2cVar, qdm1Var3, j5, tob1Var, tob1Var2, f, f2, z6, z, z2, iu30Var5, b0kVar2, i13 | (i14 & 234881024) | (i14 & 1879048192));
                b0kVar2.r(z5);
            } else {
                b0kVar2.i0(-870888627);
                b0kVar2.r(z5);
            }
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yo7((Object) i2cVar, (Object) rdm1Var, (Object) tob1Var, (Object) tob1Var2, (Object) set, z, z2, (Object) idm1Var, (Object) iu30Var, i, (byte) 3);
        }
    }

    public static final void g(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(746835070);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            long j = ((vex) zex.a.e).f;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF = dug.f(qim0Var, j, er31.b(8.0f));
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 12.0f, 4.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(str2, null, cbx.d(x340Var2).n, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, new cjc0(1), 0, null, x340Var2, (i2 >> 3) & 14, 0, 1762);
            uwo1.e(str, null, cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1762);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var, i, (byte) 0);
        }
    }

    public static final ClientPayload h(g7d1 g7d1Var) {
        r4d1 r4d1VarO = Survey.o();
        for (Map.Entry entry : n(g7d1Var).entrySet()) {
            Iterable<a7d1> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            for (a7d1 a7d1Var : iterable) {
                ew51 ew51VarN = SelectedSurveyOption.n();
                ew51VarN.q(a7d1Var.a);
                ew51VarN.n(a7d1Var.b);
                arrayList.add((SelectedSurveyOption) ew51VarN.build());
            }
            n7d1 n7d1VarO = SurveyQuestionAnswer.o();
            n7d1VarO.q((String) entry.getKey());
            n7d1VarO.n(arrayList);
            r4d1VarO.n((SurveyQuestionAnswer) n7d1VarO.build());
        }
        wkg wkgVarN = ClientPayload.n();
        wkgVarN.q((Survey) r4d1VarO.build());
        return (ClientPayload) wkgVarN.build();
    }

    public static final eyn i(zfx zfxVar, yqg yqgVar, di4 di4Var, hz5 hz5Var) {
        return new eyn(lnn1.g(new sl6(di4Var, (byte) 2), new vf3(yqgVar, (byte) 14), new j3y0(zfxVar, di4Var, (byte) 28)), new sl6(di4Var, (byte) 3), hz5Var);
    }

    public static final ArrayList j(ArrayList arrayList) {
        j98 j98Var;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k98 k98Var = (k98) it.next();
            String str = k98Var.b;
            if (str == null || ihc1.y0(str)) {
                j98Var = null;
            } else {
                j98Var = new j98(k98Var.c, k98Var.a, k98Var.b);
            }
            if (j98Var != null) {
                arrayList2.add(j98Var);
            }
        }
        return arrayList2;
    }

    public static final View k(View view, Class cls) {
        if (cls.isInstance(view)) {
            return (View) cls.cast(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (true) {
                if (i < viewGroup.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        View viewK = k(childAt, cls);
                        if (viewK != null) {
                            return viewK;
                        }
                        i = i2;
                    } else {
                        tw20.p();
                    }
                }
            }
        }
        return null;
    }

    public static weo l(String str) {
        Object next;
        d7 d7Var = new d7(weo.c, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (!nhc1.S(((weo) next).name(), str, true));
        weo weoVar = (weo) next;
        return weoVar == null ? weo.a : weoVar;
    }

    public static zxx m(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        return new zxx(cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.b, cbx.a(b0kVar).b.b, cbx.a(b0kVar).b.d, cbx.a(b0kVar).c.b, cbx.a(b0kVar).d.b, cbx.a(b0kVar).b.c, 0L, 896);
    }

    public static final LinkedHashMap n(g7d1 g7d1Var) {
        List<z6d1> list = g7d1Var.b;
        int iS = zno1.s(q7h.U(list, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (z6d1 z6d1Var : list) {
            smc0 smc0VarN = k4p1.n();
            int i = 0;
            for (Object obj : z6d1Var.e) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                y6d1 y6d1Var = (y6d1) obj;
                if (y6d1Var.d) {
                    smc0VarN.add(new a7d1(y6d1Var.a, i));
                }
                i = i2;
            }
            linkedHashMap.put(z6d1Var.c, k4p1.k(smc0VarN));
        }
        return linkedHashMap;
    }

    public static Throwable o(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static final g7d1 p(g7d1 g7d1Var, x6d1 x6d1Var) {
        b7d1 b7d1Var;
        String value;
        Format format;
        ji0 ji0Var = x6d1Var.a;
        if (!g7d1Var.b.isEmpty()) {
            String str = ji0Var != null ? ji0Var.a : null;
            if ((str == null ? false : str.equals(g7d1Var.a)) && !u890.j(g7d1Var.c, e7d1.a)) {
                return g7d1Var;
            }
        }
        String str2 = ji0Var != null ? ji0Var.a : "connected";
        List listL = ji0Var != null ? l2p1.l(ji0Var) : z6x.a;
        if (x6d1Var.c) {
            b7d1Var = b7d1.a;
        } else {
            b7d1Var = suo1.w(x6d1Var).equals(yri1.c) ? d7d1.a : c7d1.a;
        }
        b7d1 b7d1Var2 = b7d1Var;
        int i = x6d1Var.b;
        if (ji0Var == null || (format = ji0Var.Z) == null || (value = format.getValue()) == null) {
            value = "audio";
        }
        String str3 = value;
        String str4 = ji0Var != null ? ji0Var.h : null;
        String str5 = ji0Var != null ? ji0Var.t : null;
        String str6 = ji0Var != null ? ji0Var.W0 : null;
        if (str6 == null) {
            str6 = "";
        }
        return new g7d1(str2, listL, b7d1Var2, i, str3, str4, str5, str6, 2560);
    }

    public static final boolean q(Offset offset, float f, float f2, float f3, float f4) {
        if (offset != null) {
            long j = offset.a;
            if (f > 0.0f && f2 > 0.0f) {
                float f5 = f / 2.0f;
                float f6 = f2 / 2.0f;
                if (Float.intBitsToFloat((int) (j >> 32)) + f5 > 0.0f && Float.intBitsToFloat((int) (j >> 32)) - f5 < f3 && Float.intBitsToFloat((int) (j & 4294967295L)) + f6 > 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) - f6 < f4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean r(qy20 qy20Var, long j, long j2) {
        a2t0 a2t0VarS = s(qy20Var.a, qy20Var.c, qy20Var.d, qy20Var.b, j);
        return q(a2t0VarS != null ? new Offset(a2t0VarS.a) : null, (int) (j2 >> 32), (int) (j2 & 4294967295L), qy20Var.c, qy20Var.d);
    }

    public static final a2t0 s(float f, float f2, float f3, float f4, long j) {
        if (f2 <= 0.0f || f3 <= 0.0f) {
            return null;
        }
        float f5 = f2 / f3;
        yux yuxVar = pdm1.a;
        float fMin = Math.min(yuxVar.a, yuxVar.c / f5);
        float f6 = f5 * fMin;
        float fA = pdm1.a(f5);
        float fIntBitsToFloat = ((Float.intBitsToFloat((int) (j >> 32)) - 0.5f) * 1.5707964f) + yoi1.o(f, -fA, fA);
        if (Math.abs(fIntBitsToFloat) >= 1.5707964f) {
            return null;
        }
        float fIntBitsToFloat2 = (0.5f - Float.intBitsToFloat((int) (j & 4294967295L))) * 2.0f * 0.44178647f;
        float f7 = f2 * 0.5f;
        float f8 = f3 * 0.5f;
        double d = fIntBitsToFloat;
        float fTan = ((((float) Math.tan(d)) / f6) + 1.0f) * f7;
        float fCos = (1.0f - (fIntBitsToFloat2 / (((float) Math.cos(d)) * fMin))) * f8;
        float fE = l1d.e(fTan, f7, f4, f7);
        return new a2t0((((long) Float.floatToRawIntBits(l1d.e(fCos, f8, f4, f8))) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32), fIntBitsToFloat);
    }

    public static final void t(ViewPager2 viewPager2, int... iArr) {
        RecyclerView recyclerViewK;
        int[] iArr2;
        if (iArr.length == 0 || (recyclerViewK = k(viewPager2, RecyclerView.class)) == null) {
            return;
        }
        int i = iArr[0];
        s470 adapter = recyclerViewK.getAdapter();
        if (!(adapter instanceof s470)) {
            hhg1.n("RecyclerView not managed by Hubs!");
            return;
        }
        if (i < 0 || i >= adapter.e()) {
            hhg1.f(l1d.j(i, adapter.e(), "Index out of bounds: ", " (count: ", ")"));
            return;
        }
        w611 w611VarN = recyclerViewK.N(i);
        int length = iArr.length;
        if (length == 0) {
            hhg1.n("Invalid empty path");
            return;
        }
        if (length != 1) {
            int i2 = length - 1;
            iArr2 = new int[i2];
            System.arraycopy(iArr, 1, iArr2, 0, i2);
        } else {
            iArr2 = ha71.a;
        }
        if (w611VarN != null) {
            u(iArr2, w611VarN.a, recyclerViewK);
        } else {
            recyclerViewK.k(new p470(i, recyclerViewK, iArr2, (byte) 0));
        }
    }

    public static final void u(int[] iArr, View view, RecyclerView recyclerView) {
        s470.C(recyclerView.T(view)).f(Arrays.copyOf(iArr, iArr.length));
    }

    public static final boolean v(pe peVar, tjs0 tjs0Var) {
        if (tjs0Var.equals(tjs0.a) || tjs0Var.equals(tjs0.c) || tjs0Var.equals(tjs0.b)) {
            if (peVar.b(7) && !peVar.e()) {
                return true;
            }
        } else if (!tjs0Var.equals(tjs0.d)) {
            eg.o();
            return false;
        }
        return false;
    }

    public static final i8o0 w(ry21 ry21Var) {
        gbc gbcVarD1;
        int i = ry21Var.d;
        long j = ry21Var.Y;
        long j2 = ry21Var.Z;
        v360 v360Var = ry21Var.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d7 it = v360Var.iterator();
        while (true) {
            d7 d7Var = it;
            if (!d7Var.hasNext()) {
                break;
            }
            mmr0 mmr0Var = (mmr0) d7Var.next();
            String str = (String) mmr0Var.a;
            String str2 = (String) mmr0Var.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Object objH = linkedHashMap.get(lowerCase);
            if (objH == null) {
                objH = cfm0.h(lowerCase, linkedHashMap);
            }
            ((List) objH).add(str2);
        }
        w7o0 w7o0Var = new w7o0(sqg0.U(linkedHashMap));
        uz21 uz21Var = ry21Var.g;
        return new i8o0(i, j, j2, w7o0Var, (uz21Var == null || (gbcVarD1 = uz21Var.d1()) == null) ? null : new ola1(gbcVarD1), ry21Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[LOOP:1: B:24:0x0087->B:26:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final ln21 x(d8o0 d8o0Var, onm onmVar) {
        wpi1 wpi1Var;
        ne neVar;
        String str;
        ne neVar2;
        d8o0 d8o0Var2;
        ne neVar3;
        yq50 yq50Var;
        ArrayList arrayList;
        String str2;
        if (onmVar instanceof wpi1) {
            wpi1Var = (wpi1) onmVar;
            int i = wpi1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wpi1Var.b = i - Integer.MIN_VALUE;
            } else {
                wpi1Var = new wpi1(onmVar);
            }
        } else {
            wpi1Var = new wpi1(onmVar);
        }
        Object obj = wpi1Var.a;
        int i2 = wpi1Var.b;
        ne neVar4 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            rhc rhcVar = (rhc) obj;
            if (rhcVar != null) {
                yq50Var = new yq50(rhcVar, (byte) 1);
                neVar3 = null;
                d8o0Var2 = null;
                str = null;
            } else {
                d8o0Var = null;
                neVar = null;
                neVar2 = null;
                str = null;
            }
            neVar4.L(str, yq50Var);
            w7o0 w7o0Var = d8o0Var2.c;
            arrayList = new ArrayList(20);
            for (Map.Entry entry : w7o0Var.a.entrySet()) {
                str2 = (String) entry.getKey();
                for (String str3 : (List) entry.getValue()) {
                    m5n1.G(str2);
                    arrayList.add(str2);
                    arrayList.add(ihc1.e1(str3).toString());
                }
            }
            v360 v360Var = new v360((String[]) arrayList.toArray(new String[0]));
            neVar3.getClass();
            neVar3.c = m5n1.i(v360Var);
            return new ln21(neVar3);
        }
        hm5.M(obj);
        neVar = new ne((byte) 9);
        neVar.e0(d8o0Var.a);
        str = d8o0Var.b;
        neVar2 = neVar;
        ne neVar5 = neVar;
        d8o0Var2 = d8o0Var;
        neVar3 = neVar2;
        yq50Var = null;
        neVar4 = neVar5;
        neVar4.L(str, yq50Var);
        w7o0 w7o0Var2 = d8o0Var2.c;
        arrayList = new ArrayList(20);
        while (r6.hasNext()) {
            str2 = (String) entry.getKey();
            while (r1.hasNext()) {
                m5n1.G(str2);
                arrayList.add(str2);
                arrayList.add(ihc1.e1(str3).toString());
            }
        }
        v360 v360Var2 = new v360((String[]) arrayList.toArray(new String[0]));
        neVar3.getClass();
        neVar3.c = m5n1.i(v360Var2);
        return new ln21(neVar3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public static final knf1 y(aof1 aof1Var, boolean z, long j, float f, float f2, float f3, float f4) {
        boolean z2;
        a2t0 a2t0VarS = z ? s(f, f3, f4, f2, j) : null;
        Offset offset = a2t0VarS != null ? new Offset(a2t0VarS.a) : null;
        if (offset != null) {
            long j2 = offset.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            if (0.0f > fIntBitsToFloat || fIntBitsToFloat > f3) {
                z2 = false;
            } else {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                if (0.0f > fIntBitsToFloat2 || fIntBitsToFloat2 > f4) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        return new knf1(aof1Var, z, z2, offset != null ? Float.valueOf((Float.intBitsToFloat((int) (offset.a >> 32)) - (f3 / 2.0f)) / f3) : null, a2t0VarS != null ? Float.valueOf(Math.abs(a2t0VarS.b)) : null);
    }

    public static Object[] z(Object[] objArr) {
        if (objArr.length == 0) {
            eg.m("non-sensical empty or null argument array");
            return null;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }
}
