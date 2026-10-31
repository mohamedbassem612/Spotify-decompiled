package p;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.idj.v1.BodySection;
import com.spotify.idj.v1.Description;
import com.spotify.idj.v1.MicPermissionPageResponse;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class m0p1 {
    public static b180 a;
    public static b180 b;

    public static final String A(jo70 jo70Var) {
        List list = jo70Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ho70) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
    }

    public static final void a(String str, String str2, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1477950962);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function1) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            idx idxVar = new idx(13);
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), idxVar, null, null, null, null, null, null, null, null, apo.r(-976487687, new tej0(str, (byte) 3), x340Var2), x340Var2, 0, 48, 2044);
            cvx cvxVar = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(nim0Var, 16.0f));
            ldx ldxVar = ldx.c;
            if (ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(str2), function1), ldxVar, null, null, null, null, null, null, null, null, apo.r(1000106466, new tej0(str2, (byte) 4), x340Var2), x340Var2, 0, 48, 2044);
                x340Var = x340Var2;
                x340Var.r(true);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new irj0(str, str2, function0, function1, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0192  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:93:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f  */
    public static final void b(c380 c380Var, qim0 qim0Var, l90 l90Var, xtb0 xtb0Var, vzq0 vzq0Var, int i, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        xtb0 xtb0VarA;
        int i4;
        int i5;
        vzq0 vzq0VarH;
        int i6;
        int i7;
        int i8;
        int i9;
        byte b2;
        boolean z;
        c380 c380Var2;
        l90 l90Var2;
        int i10;
        xtb0 xtb0Var2;
        vzq0 vzq0Var2;
        h311 h311VarV;
        d90 d90Var;
        l90 l90Var3;
        xtb0 xtb0Var3;
        int i11;
        l90 l90Var4;
        vzq0 vzq0Var3;
        l90 l90Var5;
        int i12;
        l90 l90Var6;
        int iT;
        ceo ceoVar;
        boolean z2;
        boolean zE;
        Object objT;
        Object objT2;
        xtb0 xtb0Var4;
        vzq0 vzq0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1854686530);
        int i13 = (x340Var.g(c380Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            qim0Var2 = qim0Var;
            i13 |= x340Var.g(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i2 & 384) == 0) {
            i13 |= x340Var.e(l90Var == null ? -1 : l90Var.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) == 0) {
            xtb0VarA = xtb0Var;
            int i15 = x340Var.g(xtb0VarA) ? 2048 : 1024;
            i4 = i13 | i15;
            i5 = i3 & 16;
            if (i5 != 0) {
                i7 = i4 | 24576;
                vzq0VarH = vzq0Var;
            } else {
                vzq0VarH = vzq0Var;
                if (x340Var.g(vzq0VarH)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i7 = i4 | i6;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i7 |= 196608;
            } else if ((196608 & i2) == 0) {
                if (x340Var.e(i != 0 ? l1d.C(i) : -1)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i7 |= i9;
            }
            b2 = 1;
            if ((74899 & i7) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i7 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i14 != 0) {
                        l90Var3 = l90.a;
                    } else {
                        l90Var3 = l90Var;
                    }
                    if ((i3 & 8) != 0) {
                        i7 &= -7169;
                        xtb0VarA = aub0.a(0, x340Var, 3);
                    }
                    if (i5 != 0) {
                        vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                    }
                    if (i8 != 0) {
                        xtb0Var3 = xtb0VarA;
                        i11 = 4;
                    } else {
                        xtb0Var3 = xtb0VarA;
                        i11 = i;
                    }
                    l90Var4 = l90Var3;
                } else {
                    x340Var.b0();
                    if ((i3 & 8) != 0) {
                        i7 &= -7169;
                    }
                    xtb0 xtb0Var5 = xtb0VarA;
                    i7 = i7;
                    xtb0Var3 = xtb0Var5;
                    l90Var4 = l90Var;
                    i11 = i;
                }
                vzq0Var3 = vzq0VarH;
                x340Var.s();
                if (c380Var.isEmpty()) {
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        d90Var = new d90(c380Var, qim0Var2, l90Var4, xtb0Var3, vzq0Var3, i11, i2, i3, (byte) 0);
                    }
                } else {
                    l90Var5 = l90Var4;
                    i12 = i11;
                    if (i12 == 1) {
                        x340Var.i0(1788235932);
                        int i16 = i7 >> 3;
                        d(c380Var, l90Var5, xtb0Var3, vzq0Var3, qim0Var, x340Var, (i7 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | ((i7 << 9) & 57344), 0);
                        c380Var2 = c380Var;
                        l90Var6 = l90Var5;
                        x340Var.r(false);
                        xtb0Var4 = xtb0Var3;
                        vzq0Var4 = vzq0Var3;
                    } else {
                        c380Var2 = c380Var;
                        l90Var6 = l90Var5;
                        xtb0 xtb0Var6 = xtb0Var3;
                        x340Var.i0(1788338604);
                        uwr uwrVar = cbx.a;
                        iT = jfv.t(cbx.c(x340Var).b.a, ngv.d);
                        ceoVar = ((jhx) cbx.c(x340Var).a.d).b;
                        mmr0 mmr0Var = new mmr0(c380Var2, l90Var6);
                        if ((458752 & i7) == 131072) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE = z2 | x340Var.e(iT) | x340Var.g(ceoVar);
                        objT = x340Var.T();
                        if (zE || objT == m4cVar) {
                            objT = new e90(i12, iT, ceoVar);
                            x340Var.s0(objT);
                        }
                        iu30 iu30Var = (iu30) objT;
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = ft.Y;
                            x340Var.s0(objT2);
                        }
                        xtb0Var4 = xtb0Var6;
                        vzq0Var4 = vzq0Var3;
                        hm5.a(mmr0Var, qim0Var, iu30Var, (tl3) null, "ActionsBarTransition", (iu30) objT2, apo.r(859637232, new wh(xtb0Var6, vzq0Var3, b2), x340Var), x340Var, (i7 & 112) | 1794048, 8);
                        x340Var.r(false);
                    }
                    vzq0Var2 = vzq0Var4;
                    i10 = i12;
                    xtb0Var2 = xtb0Var4;
                    l90Var2 = l90Var6;
                }
                h311VarV.d = d90Var;
            }
            c380Var2 = c380Var;
            x340Var.b0();
            l90Var2 = l90Var;
            i10 = i;
            xtb0Var2 = xtb0VarA;
            vzq0Var2 = vzq0VarH;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                d90Var = new d90(c380Var2, qim0Var, l90Var2, xtb0Var2, vzq0Var2, i10, i2, i3, (byte) 1);
                h311VarV.d = d90Var;
            }
        }
        xtb0VarA = xtb0Var;
        i4 = i13 | i15;
        i5 = i3 & 16;
        if (i5 != 0) {
            i7 = i4 | 24576;
            vzq0VarH = vzq0Var;
        } else {
            vzq0VarH = vzq0Var;
            if (x340Var.g(vzq0VarH)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i7 = i4 | i6;
        }
        i8 = i3 & 32;
        if (i8 != 0) {
            i7 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (x340Var.e(i != 0 ? l1d.C(i) : -1)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i7 |= i9;
        }
        b2 = 1;
        if ((74899 & i7) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i7 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    l90Var3 = l90.a;
                } else {
                    l90Var3 = l90Var;
                }
                if ((i3 & 8) != 0) {
                    i7 &= -7169;
                    xtb0VarA = aub0.a(0, x340Var, 3);
                }
                if (i5 != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                }
                if (i8 != 0) {
                    xtb0Var3 = xtb0VarA;
                    i11 = 4;
                } else {
                    xtb0Var3 = xtb0VarA;
                    i11 = i;
                }
                l90Var4 = l90Var3;
            } else {
                if (i14 != 0) {
                    l90Var3 = l90.a;
                } else {
                    l90Var3 = l90Var;
                }
                if ((i3 & 8) != 0) {
                    i7 &= -7169;
                    xtb0VarA = aub0.a(0, x340Var, 3);
                }
                if (i5 != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                }
                if (i8 != 0) {
                    xtb0Var3 = xtb0VarA;
                    i11 = 4;
                } else {
                    xtb0Var3 = xtb0VarA;
                    i11 = i;
                }
                l90Var4 = l90Var3;
            }
            vzq0Var3 = vzq0VarH;
            x340Var.s();
            if (c380Var.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    return;
                } else {
                    d90Var = new d90(c380Var, qim0Var2, l90Var4, xtb0Var3, vzq0Var3, i11, i2, i3, (byte) 0);
                }
            } else {
                l90Var5 = l90Var4;
                i12 = i11;
                if (i12 == 1) {
                    x340Var.i0(1788235932);
                    int i17 = i7 >> 3;
                    d(c380Var, l90Var5, xtb0Var3, vzq0Var3, qim0Var, x340Var, (i7 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | ((i7 << 9) & 57344), 0);
                    c380Var2 = c380Var;
                    l90Var6 = l90Var5;
                    x340Var.r(false);
                    xtb0Var4 = xtb0Var3;
                    vzq0Var4 = vzq0Var3;
                } else {
                    c380Var2 = c380Var;
                    l90Var6 = l90Var5;
                    xtb0 xtb0Var7 = xtb0Var3;
                    x340Var.i0(1788338604);
                    uwr uwrVar2 = cbx.a;
                    iT = jfv.t(cbx.c(x340Var).b.a, ngv.d);
                    ceoVar = ((jhx) cbx.c(x340Var).a.d).b;
                    mmr0 mmr0Var2 = new mmr0(c380Var2, l90Var6);
                    if ((458752 & i7) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE = z2 | x340Var.e(iT) | x340Var.g(ceoVar);
                    objT = x340Var.T();
                    if (zE) {
                        objT = new e90(i12, iT, ceoVar);
                        x340Var.s0(objT);
                    } else {
                        objT = new e90(i12, iT, ceoVar);
                        x340Var.s0(objT);
                    }
                    iu30 iu30Var2 = (iu30) objT;
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = ft.Y;
                        x340Var.s0(objT2);
                    }
                    xtb0Var4 = xtb0Var7;
                    vzq0Var4 = vzq0Var3;
                    hm5.a(mmr0Var2, qim0Var, iu30Var2, (tl3) null, "ActionsBarTransition", (iu30) objT2, apo.r(859637232, new wh(xtb0Var7, vzq0Var3, b2), x340Var), x340Var, (i7 & 112) | 1794048, 8);
                    x340Var.r(false);
                }
                vzq0Var2 = vzq0Var4;
                i10 = i12;
                xtb0Var2 = xtb0Var4;
                l90Var2 = l90Var6;
            }
            h311VarV.d = d90Var;
        }
        c380Var2 = c380Var;
        x340Var.b0();
        l90Var2 = l90Var;
        i10 = i;
        xtb0Var2 = xtb0VarA;
        vzq0Var2 = vzq0VarH;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            d90Var = new d90(c380Var2, qim0Var, l90Var2, xtb0Var2, vzq0Var2, i10, i2, i3, (byte) 1);
            h311VarV.d = d90Var;
        }
    }

    public static final void c(a90 a90Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        j2i j2iVarR;
        vu30 vu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(665028498);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(a90Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new g3(a90Var, (byte) 10);
                x340Var.s0(objT);
            }
            int i3 = i2;
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(x340Var);
            max maxVar = a90Var.e;
            jsl jslVar = a90Var.f;
            jsl jslVar2 = jslVar instanceof jsl ? jslVar : null;
            String str = jslVar2 != null ? jslVar2.a : null;
            hux huxVar = a90Var.d;
            if (huxVar == null) {
                x340Var.i0(-819717909);
                x340Var.r(false);
                j2iVarR = null;
            } else {
                x340Var.i0(-819717908);
                j2iVarR = apo.r(1404331850, new f90(huxVar, (byte) 0), x340Var);
                x340Var.r(false);
            }
            x340Var.i0(-819573077);
            x340Var.r(false);
            String str2 = a90Var.b;
            byte b2 = 6;
            if (str2 == null) {
                x340Var.i0(-819448271);
                x340Var.r(false);
                vu30Var = null;
            } else {
                x340Var.i0(-819448270);
                vu30 vu30VarR = apo.r(1579116672, new nl(str2, b2), x340Var);
                x340Var.r(false);
                vu30Var = vu30VarR;
            }
            poo1.e(gbxVar, pexVar, lexVarZ, qim0Var, 0, str, maxVar, j2iVarR, null, null, null, false, null, vu30Var, x340Var, (i3 << 6) & 7168, 0, 7696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(a90Var, qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void d(c380 c380Var, l90 l90Var, xtb0 xtb0Var, vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1605677005);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.e(l90Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(xtb0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(vzq0Var) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                boolean zD = x340Var.d(8.0f);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z2 | zD;
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z6 | z3;
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z7 | z4 | ((i3 & 896) == 256);
                objT = x340Var.T();
                if (z5 || objT == fkj0.X) {
                    x2 x2Var = new x2((Object) c380Var, (Object) vzq0Var, (Object) l90Var, (Object) xtb0Var, (byte) 5);
                    x340Var.s0(x2Var);
                    objT = x2Var;
                }
                ejo1.l((i3 >> 12) & 14, 0, x340Var, (vu30) objT, qim0Var4);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(c380Var, l90Var, xtb0Var, vzq0Var, qim0Var3, i, i2, (byte) 0);
            }
        }
        i3 |= 24576;
        qim0Var2 = qim0Var;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            boolean zD2 = x340Var.d(8.0f);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = z2 | zD2;
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z8 | z3;
            if ((i3 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z9 | z4 | ((i3 & 896) == 256);
            objT = x340Var.T();
            if (z5) {
                x2 x2Var2 = new x2((Object) c380Var, (Object) vzq0Var, (Object) l90Var, (Object) xtb0Var, (byte) 5);
                x340Var.s0(x2Var2);
                objT = x2Var2;
            } else {
                x2 x2Var3 = new x2((Object) c380Var, (Object) vzq0Var, (Object) l90Var, (Object) xtb0Var, (byte) 5);
                x340Var.s0(x2Var3);
                objT = x2Var3;
            }
            ejo1.l((i3 >> 12) & 14, 0, x340Var, (vu30) objT, qim0Var4);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(c380Var, l90Var, xtb0Var, vzq0Var, qim0Var3, i, i2, (byte) 0);
        }
    }

    public static final void e(c380 c380Var, xtb0 xtb0Var, vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        vzq0 vzq0Var2;
        xtb0 xtb0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1710861698);
        byte b2 = 4;
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.g(xtb0Var) ? 32 : 16) | (x340Var.g(vzq0Var) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new d4(c380Var, qim0Var, b2);
                x340Var.s0(objT);
            }
            vzq0Var2 = vzq0Var;
            too1.b(null, xtb0Var, vzq0Var2, (iu30) objT, x340Var, i2 & 1008, 1);
            xtb0Var2 = xtb0Var;
        } else {
            vzq0Var2 = vzq0Var;
            xtb0Var2 = xtb0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h90(c380Var, xtb0Var2, vzq0Var2, qim0Var, i);
        }
    }

    public static final void f(c90 c90Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2103948436);
        int i4 = (x340Var.g(c90Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            if (c90Var instanceof a90) {
                x340Var.i0(1035153712);
                c((a90) c90Var, qim0Var, x340Var, i3 & 126);
                x340Var.r(false);
            } else {
                if (!(c90Var instanceof b90)) {
                    throw p3d1.k(x340Var, 1035152306, false);
                }
                x340Var.i0(1035158316);
                gfh0 gfh0VarC = t1c.c(een.d, true);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
                k4s0.i(0, ((b90) c90Var).b, x340Var, true, false);
            }
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(c90Var, qim0Var2, i, i2, (byte) 2);
        }
    }

    public static final void g(c380 c380Var, Function0 function0, b0k b0kVar, int i) {
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2140770171);
        int i2 = (i & 6) == 0 ? (x340Var.g(c380Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 0;
            for (Object obj : c380Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                nim0 nim0Var = nim0.a;
                j((BodySection) obj, function0, u291.f(nim0Var, 1.0f), x340Var, i2 & 112);
                if (i3 < c380Var.size() - 1) {
                    x340Var.i0(-438554867);
                    if (z(x340Var)) {
                        x340Var.i0(262949839);
                        uwr uwrVar = cbx.a;
                        f = cbx.b(x340Var).b.a;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(262951089);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        x340Var.r(false);
                        f = 8.0f;
                    }
                    x0d.s(nim0Var, f, x340Var, false);
                } else {
                    x340Var.i0(-438389575);
                    x340Var.r(false);
                }
                i3 = i4;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(c380Var, function0, i, (byte) 10);
        }
    }

    public static final void h(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, LocalDate localDate, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        b0k b0kVar2;
        ydx ydxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(461353398);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.g(str4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= b0kVar3.h(z) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar3.h(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar3.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar3.h(z4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar3.i(localDate) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar3.i(iu30Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            if (z2) {
                b0kVar3.i0(978997602);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                ydx ydxVar2 = new ydx((23 & 1) != 0 ? 4.0f : 0.0f, (23 & 2) != 0 ? 12.0f : 0.0f, (23 & 4) != 0 ? 8.0f : 0.0f, (23 & 8) != 0 ? new zzq0(12.0f, 12.0f, 12.0f, 12.0f) : new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (23 & 16) != 0 ? vdx.a : wdx.a);
                b0kVar3.r(false);
                ydxVar = ydxVar2;
            } else {
                b0kVar3.i0(978999932);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar5 = cbx.b(b0kVar3).b;
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                cvx cvxVar7 = cbx.b(b0kVar3).b;
                cvx cvxVar8 = cbx.b(b0kVar3).b;
                ydxVar = new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
                b0kVar3.r(false);
            }
            boolean z5 = (i5 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z5 || objT == fkj0.X) {
                objT = new ijd0(iu30Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(bin.x(qim0Var, false, null, null, null, (Function0) objT, 15), null, ydx.a(ydxVar, 0.0f, 0.0f, (zzq0) null, 11), null, null, null, null, null, null, apo.r(-1193557221, new ok7(i, str, localDate, z3), b0kVar3), null, null, null, null, null, null, apo.r(-1999624543, new jjd0(i, str2, str3, str4, z4, z, iu30Var), b0kVar3), b0kVar2, 805306880, 1572864, 65018);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kjd0(i, str, str2, str3, str4, z, z2, z3, z4, localDate, iu30Var, qim0Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void i(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        boolean z5;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-442590062);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= b0kVar3.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= b0kVar3.h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= b0kVar3.g(str3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= b0kVar3.i(iu30Var) ? 67108864 : 33554432;
        }
        int i5 = i3 & 512;
        if (i5 == 0) {
            if ((805306368 & i2) == 0) {
                qim0Var2 = qim0Var;
                i4 |= b0kVar3.i(qim0Var2) ? 536870912 : 268435456;
            }
            if ((306783379 & i4) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (b0kVar3.Y(i4 & 1, z5)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                ZonedDateTime zonedDateTimeAtZone = Instant.parse(str3).atZone(ZoneId.systemDefault());
                int i6 = i4 << 6;
                b0kVar2 = b0kVar3;
                h(i, str, str2, zonedDateTimeAtZone.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), zonedDateTimeAtZone.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), z, z2, z3, z4, zonedDateTimeAtZone.toLocalDate(), iu30Var, qim0Var4, b0kVar2, (i4 & 1022) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), (i4 >> 24) & 126);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new hjd0(i, str, str2, z, z2, z3, z4, str3, iu30Var, qim0Var3, i2, i3);
            }
        }
        i4 |= 805306368;
        qim0Var2 = qim0Var;
        if ((306783379 & i4) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (b0kVar3.Y(i4 & 1, z5)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            ZonedDateTime zonedDateTimeAtZone2 = Instant.parse(str3).atZone(ZoneId.systemDefault());
            int i7 = i4 << 6;
            b0kVar2 = b0kVar3;
            h(i, str, str2, zonedDateTimeAtZone2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), zonedDateTimeAtZone2.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), z, z2, z3, z4, zonedDateTimeAtZone2.toLocalDate(), iu30Var, qim0Var4, b0kVar2, (i4 & 1022) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024), (i4 >> 24) & 126);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hjd0(i, str, str2, z, z2, z3, z4, str3, iu30Var, qim0Var3, i2, i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x0378 A[PHI: r7
      0x0378: PHI (r7v50 kotlin.jvm.functions.Function0) = (r7v48 kotlin.jvm.functions.Function0), (r7v51 kotlin.jvm.functions.Function0) binds: [B:127:0x0376, B:123:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0385  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    public static final void j(BodySection bodySection, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        boolean zX;
        boolean z;
        zzq0 zzq0VarH;
        boolean zX2;
        boolean z2;
        qim0 qim0VarZ;
        apx apxVar;
        apx apxVar2;
        int i2;
        ?? r0;
        ?? r1;
        af5 af5Var;
        Function0 function1;
        ?? r11;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(150424250);
        j06 j06Var = x340Var.a;
        int i3 = (i & 6) == 0 ? (x340Var.g(bodySection) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.i0(-1471178950);
            if (z(x340Var)) {
                x340Var.i0(-1471178361);
                zX = x(x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1638112302);
                x340Var.r(false);
                zX = false;
            }
            if (zX) {
                x340Var.i0(-1471177767);
                x340Var.r(false);
                zzq0VarH = uyn1.h(2, 300.0f, 0.0f);
            } else {
                if (z(x340Var)) {
                    x340Var.i0(-1471175130);
                    z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 1;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1638212463);
                    x340Var.r(false);
                    z = false;
                }
                if (z) {
                    x340Var.i0(-1471174568);
                    x340Var.r(false);
                    zzq0VarH = uyn1.h(2, 200.0f, 0.0f);
                } else {
                    x340Var.i0(-1471172105);
                    uwr uwrVar = cbx.a;
                    zzq0VarH = uyn1.h(2, cbx.b(x340Var).b.a, 0.0f);
                    x340Var.r(false);
                }
            }
            x340Var.r(false);
            x340Var.i0(-1471168908);
            if (z(x340Var)) {
                x340Var.i0(-1471168345);
                zX2 = x(x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1638422798);
                x340Var.r(false);
                zX2 = false;
            }
            nim0 nim0Var = nim0.a;
            if (zX2) {
                x340Var.i0(-1471167213);
                x340Var.r(false);
                qim0VarZ = uyn1.z(300.0f, 0.0f, 2, nim0Var);
            } else {
                if (z(x340Var)) {
                    x340Var.i0(-1471164762);
                    z2 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 1;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1638533871);
                    x340Var.r(false);
                    z2 = false;
                }
                if (z2) {
                    x340Var.i0(-1471163662);
                    x340Var.r(false);
                    qim0VarZ = uyn1.z(200.0f, 0.0f, 2, nim0Var);
                } else {
                    x340Var.i0(-1471161102);
                    uwr uwrVar2 = cbx.a;
                    qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, nim0Var);
                    x340Var.r(false);
                }
            }
            qim0 qim0Var2 = qim0VarZ;
            x340Var.r(false);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarW = uyn1.w(nim0Var, zzq0VarH);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarW);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            switch (bodySection.o().o()) {
                case "Search":
                    apxVar2 = esx.c;
                    apxVar = apxVar2;
                    break;
                case "Mic":
                    apxVar2 = wox.c;
                    apxVar = apxVar2;
                    break;
                case "Plus":
                    apxVar2 = hrx.c;
                    apxVar = apxVar2;
                    break;
                case "Star":
                    apxVar2 = xsx.c;
                    apxVar = apxVar2;
                    break;
                case "Gears":
                    apxVar2 = knx.c;
                    apxVar = apxVar2;
                    break;
                case "Heart":
                    apxVar2 = xnx.c;
                    apxVar = apxVar2;
                    break;
                case "Minus":
                    apxVar2 = apx.c;
                    apxVar = apxVar2;
                    break;
                default:
                    apxVar = null;
                    break;
            }
            if (apxVar != null) {
                x340Var.i0(1418104512);
                cvx cvxVar2 = cbx.b(x340Var).b;
                i2 = i3;
                r0 = 0;
                r1 = 1;
                w0h1.a(apxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, 56, 56);
                x340Var.r(false);
            } else {
                i2 = i3;
                r0 = 0;
                r1 = 1;
                x340Var.i0(1418290946);
                x340Var.r(false);
            }
            uwo1.e(bodySection.o().p(), null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r((boolean) r1);
            Description descriptionN = bodySection.n();
            if (ihc1.h0(descriptionN.o(), "{LINK}", (boolean) r0)) {
                x340Var.i0(-1485708271);
                String strO = descriptionN.o();
                String strP = descriptionN.p();
                int i4 = i2 << 3;
                x340Var.i0(1505940105);
                StringBuilder sb = new StringBuilder(16);
                ?? M = xvj1.m();
                new ArrayList();
                String strW = nhc1.W(strO, "{LINK}", strP);
                int iW0 = ihc1.w0(strW, strP, (int) r0, (boolean) r0, 6);
                if (strP.length() == 0 || iW0 == -1) {
                    sb.append(strW);
                } else {
                    int length = strP.length() + iW0;
                    sb.append(strW);
                    pae1 pae1Var = new pae1(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438), (zma1) null, 14);
                    if (((i4 & 896) ^ 384) > 256) {
                        function1 = function0;
                        if (x340Var.g(function1)) {
                            r11 = r1;
                        }
                        objT = x340Var.T();
                        if (r11 == 0 || objT == fkj0.X) {
                            objT = new nbg(function1, (byte) 3);
                            x340Var.s0(objT);
                        }
                        M.add(new xe5(iW0, length, 8, new kjc0(strP, pae1Var, (rjc0) objT), (String) null));
                    } else {
                        function1 = function0;
                    }
                    if ((i4 & 384) == 256) {
                        r11 = r1;
                    } else {
                        r11 = r0;
                    }
                    objT = x340Var.T();
                    if (r11 == 0) {
                        objT = new nbg(function1, (byte) 3);
                        x340Var.s0(objT);
                    } else {
                        objT = new nbg(function1, (byte) 3);
                        x340Var.s0(objT);
                    }
                    M.add(new xe5(iW0, length, 8, new kjc0(strP, pae1Var, (rjc0) objT), (String) null));
                }
                String string = sb.toString();
                ArrayList arrayList = new ArrayList(M.size());
                for (?? G = r0; G < M.size(); G = c13.g(sb, (xe5) M.get(G), arrayList, G, r1)) {
                }
                af5Var = new af5(string, arrayList);
                x340Var.r((boolean) r0);
                x340Var.r((boolean) r0);
            } else {
                x340Var.i0(-1485503113);
                x340Var.r((boolean) r0);
                af5Var = new af5(descriptionN.o());
            }
            af5 af5Var2 = af5Var;
            uwr uwrVar4 = cbx.a;
            uwo1.d(af5Var2, cbx.a(x340Var).b.b, qim0Var2, cbx.d(x340Var).g, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
            x340Var = x340Var;
            x340Var.r((boolean) r1);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) bodySection, (Object) function0, (Object) qim0Var, i, (byte) 24);
        }
    }

    public static final void k(MicPermissionPageResponse micPermissionPageResponse, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(253499450);
        int i2 = i | (x340Var.g(micPermissionPageResponse) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(1294671865);
            if (micPermissionPageResponse.r().length() > 0) {
                x340Var.i0(-449235485);
                m(micPermissionPageResponse.r(), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-449198006);
                x340Var.r(false);
            }
            boolean zX = x(x340Var);
            pbh pbhVar = pbh.a;
            if (zX) {
                x340Var.i0(-449169486);
                op71.g(x340Var, pbhVar.a(1.0f, nim0Var, true));
                x340Var.r(false);
            } else {
                x340Var.i0(-449115670);
                x340Var.r(false);
            }
            l(micPermissionPageResponse.q(), x340Var, 0);
            g(mqo1.A(micPermissionPageResponse.n()), function2, x340Var, (i2 >> 6) & 112);
            a(micPermissionPageResponse.p(), micPermissionPageResponse.o(), function0, function1, x340Var, (i2 << 3) & 8064);
            if (x(x340Var)) {
                x340Var.i0(-448716483);
                op71.g(x340Var, uyn1.B(pbhVar.a(1.0f, nim0Var, true), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.b, 7));
                x340Var.r(false);
            } else {
                x340Var.i0(-448611734);
                x340Var.r(false);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, micPermissionPageResponse, function0, function1, function2, (byte) 19);
        }
    }

    public static final void l(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1385466408);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, cbx.b(x340Var).b.a, 5), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tej0(str, i, (byte) 5);
        }
    }

    public static final void m(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1486140254);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ecx ecxVar = x(x340Var) ? new ecx(31.0f, 9.0f) : new ecx(390.0f, 354.0f);
            eso1.e(Uri.parse(str), isl.a, u291.f(nim0.a, 1.0f), (p3v) null, (zvx) null, ecxVar, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 3992);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tej0(str, i, (byte) 6);
        }
    }

    public static final int n(float[] fArr) {
        if (fArr.length < 16) {
            return 0;
        }
        return ((fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0) & (fArr[15] == 1.0f ? 1 : 0)) | ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1);
    }

    public static final boolean o(long j) {
        return !qr80.b(j, 9223372034707292159L);
    }

    public static final aii0 p(el9 el9Var) {
        return new aii0(el9Var, (byte) 1);
    }

    public static final qim0 q(qim0 qim0Var, lax laxVar, iu30 iu30Var) {
        if (laxVar instanceof iax) {
            return qim0Var;
        }
        if (laxVar instanceof gax) {
            return f8d1.b(qim0Var, laxVar, new nrf(iu30Var, laxVar, (byte) 2));
        }
        eg.o();
        return null;
    }

    public static wgp r(qk00 qk00Var, vk00 vk00Var, q7r0 q7r0Var, rih1 rih1Var) {
        qk00Var.getClass();
        rih1Var.getClass();
        return new wgp(qk00Var, vk00Var, q7r0Var);
    }

    public static final hav0 s(bav0 bav0Var, hav0 hav0Var) {
        Object obj;
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            obj = list.get(i);
            if (w8p1.n(((hav0) obj).a, hav0Var.a)) {
                return (hav0) obj;
            }
        }
        obj = null;
        return (hav0) obj;
    }

    public static ByteBuffer t(xjp0 xjp0Var) {
        ByteBuffer byteBuffer = xjp0Var.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        byteBufferAllocate.put((byte) ((xjp0Var.a << 3) | 2));
        int iRemaining = byteBuffer.remaining();
        dm5.m(iRemaining > 0);
        int i = iRemaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        dm5.y(i2 < 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (byte) (iRemaining & 127);
            iRemaining >>= 7;
            if (iRemaining != 0) {
                i4 |= 128;
            }
            byteBufferAllocate2.put((byte) i4);
        }
        byteBufferAllocate2.flip();
        byteBufferAllocate.put(byteBufferAllocate2);
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static String u(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static int v() {
        return Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? ApiVersion.getApiLevel() : ApiVersion.getMaximumAvailableApiLevel();
    }

    public static final go80 w(klm klmVar, wbp0 wbp0Var, obp0 obp0Var, wbp0 wbp0Var2, xbp0 xbp0Var) {
        return klmVar.a("NewEpisodePushRemovalDaemon", new k7h0(wbp0Var, obp0Var, wbp0Var2, xbp0Var, (byte) 19));
    }

    public static final boolean x(b0k b0kVar) {
        return ((Configuration) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
    }

    public static final boolean y(bc71 bc71Var) {
        String strB;
        if (bc71Var instanceof wb71) {
            strB = ((wb71) bc71Var).f;
        } else {
            if (!(bc71Var instanceof sb71)) {
                return false;
            }
            strB = ((sb71) bc71Var).a.a.b();
        }
        return u890.j(strB, tyo1.p(blc0.sg, new String[0]).b());
    }

    public static final boolean z(b0k b0kVar) {
        return ((Configuration) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 600;
    }
}
