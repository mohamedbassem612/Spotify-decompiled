package p;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
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
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.Next;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vbe {
    public static final pi7 b = new pi7();
    public static b180 c;
    public static b180 d;
    public final /* synthetic */ byte a;

    public static Next A(kak0 kak0Var, j2k0 j2k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(lhg1Var.a, (buk1) null, (hez) null, (fa20) null, (px30) null, new taa0(j2k0Var.a), (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 65503), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 3);
    }

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1035833798);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0Var, 16.0f, 6.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarY, er31.b(8.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarF, 12.0f, 8.0f);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new v1(str, (byte) 21);
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarY2, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:115:0x0225  */
    /* JADX WARN: Code duplicated, block: B:119:0x024c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0258  */
    /* JADX WARN: Code duplicated, block: B:122:0x025b  */
    /* JADX WARN: Code duplicated, block: B:124:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0262  */
    /* JADX WARN: Code duplicated, block: B:132:0x028a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0292  */
    /* JADX WARN: Code duplicated, block: B:135:0x029a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0246 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0194  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(x0j0 x0j0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        Object obj;
        Object next;
        int iMax;
        Object sq2Var;
        String quantityString;
        ArrayList arrayList;
        Iterator it;
        String quantityString2;
        dr2 dr2Var;
        cr2 cr2Var;
        jx2 jx2Var;
        jzr0 jzr0Var;
        fr2 fr2Var;
        jzr0 jzr0Var2;
        Object obj2;
        cr2 cr2Var2;
        String string;
        Date date;
        String str;
        String string2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-792541888);
        int i2 = 2;
        int i3 = (x340Var.g(x0j0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            i92 i92Var = wq2.a;
            List list = x0j0Var.b;
            Iterator it2 = list.iterator();
            do {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((jzr0) next).a != fr2.d);
            jzr0 jzr0Var3 = (jzr0) next;
            if (jzr0Var3 != null) {
                zq2 zq2Var = jzr0Var3.b;
                if (zq2Var instanceof zq2) {
                    yv2 yv2Var = zq2Var.a;
                    String str2 = jzr0Var3.c;
                    TimeZone timeZone = TimeZone.getDefault();
                    String strReplace = yv2Var.c.replace('-', ' ').replace('_', ' ');
                    if (strReplace.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char cCharAt = strReplace.charAt(0);
                        String strValueOf = String.valueOf(cCharAt);
                        Locale locale = Locale.ROOT;
                        String upperCase = strValueOf.toUpperCase(locale);
                        if (upperCase.length() <= 1) {
                            upperCase = String.valueOf(Character.toTitleCase(cCharAt));
                        } else if (cCharAt != 329) {
                            upperCase = upperCase.charAt(0) + upperCase.substring(1).toLowerCase(locale);
                        }
                        sb.append((Object) upperCase);
                        sb.append(strReplace.substring(1));
                        strReplace = sb.toString();
                    }
                    int i4 = yv2Var.d;
                    Integer num = yv2Var.a;
                    if (num == null || num.intValue() != 2) {
                        i4 = 0;
                    }
                    int i5 = i4 == 0 ? -1 : vq2.a[l1d.C(i4)];
                    if (i5 == -1) {
                        i2 = 1;
                    } else if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3 && i5 != 4) {
                                eg.o();
                                return;
                            }
                            i2 = 1;
                        } else {
                            i2 = 3;
                        }
                    }
                    String strL = b0o1.l(str2);
                    if (i2 != 1 && (str = yv2Var.j) != null && (string2 = ihc1.e1(str).toString()) != null) {
                        if (string2.length() <= 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            strL = string2;
                        }
                    }
                    String str3 = yv2Var.g;
                    if (!ihc1.y0(str3)) {
                        Object obj3 = wq2.a.get();
                        if (obj3 == null) {
                            eg.m("Required value was null.");
                            return;
                        }
                        Iterator it3 = ((Iterable) obj3).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                date = null;
                                break;
                            }
                            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) it3.next();
                            ParsePosition parsePosition = new ParsePosition(0);
                            date = simpleDateFormat.parse(str3, parsePosition);
                            if (date != null && parsePosition.getIndex() == str3.length()) {
                                break;
                            }
                        }
                        if (date != null) {
                            Object obj4 = wq2.b.get();
                            if (obj4 == null) {
                                eg.m("Required value was null.");
                                return;
                            } else {
                                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) obj4;
                                simpleDateFormat2.setTimeZone(timeZone);
                                obj = simpleDateFormat2.format(date);
                            }
                        }
                    }
                    sq2Var = new tq2(strReplace, obj, i2, strL);
                } else if (x0j0Var.c) {
                    iMax = Math.max(1, (list.size() * 3) / 2);
                    se11 se11Var = xe70.a;
                    if (iMax >= 60) {
                        int i6 = iMax / 60;
                        int i7 = iMax % 60;
                        quantityString = context.getString(2131953287, context.getResources().getQuantityString(2131820591, i6, Integer.valueOf(i6)), context.getResources().getQuantityString(2131820592, i7, Integer.valueOf(i7)));
                        quantityString.getClass();
                    } else {
                        quantityString = context.getResources().getQuantityString(2131820592, iMax, Integer.valueOf(iMax));
                        quantityString.getClass();
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        dr2Var = ((jzr0) it.next()).b;
                        if (dr2Var instanceof cr2) {
                            cr2Var = (cr2) dr2Var;
                        } else {
                            cr2Var = null;
                        }
                        if (cr2Var != null) {
                            jx2Var = cr2Var.a;
                        } else {
                            jx2Var = null;
                        }
                        if (jx2Var == null && linkedHashSet.add(jx2Var.a)) {
                            arrayList.add(xe70.b(context, jx2Var.b, jx2Var.c, jx2Var.d, jx2Var.e, jx2Var.f).b);
                        }
                    }
                    if (arrayList.size() <= 1) {
                        quantityString2 = (String) o7h.s0(arrayList);
                        if (quantityString2 == null) {
                            quantityString2 = context.getString(2131953289);
                        }
                    } else {
                        quantityString2 = context.getResources().getQuantityString(2131820593, arrayList.size(), Integer.valueOf(arrayList.size()));
                        quantityString2.getClass();
                    }
                    sq2Var = new sq2(context.getString(2131953288, quantityString2, quantityString));
                } else {
                    jzr0Var = (jzr0) o7h.C0(list);
                    if (jzr0Var != null) {
                        fr2Var = jzr0Var.a;
                    } else {
                        fr2Var = null;
                    }
                    if (fr2Var == fr2.b) {
                        se11 se11Var2 = xe70.a;
                        jzr0Var2 = (jzr0) o7h.C0(list);
                        if (jzr0Var2 != null) {
                            obj2 = jzr0Var2.b;
                        } else {
                            obj2 = null;
                        }
                        cr2Var2 = obj2 instanceof cr2 ? (cr2) obj2 : null;
                        if (cr2Var2 != 0) {
                            jx2 jx2Var2 = cr2Var2.a;
                            string = xe70.b(context, jx2Var2.b, jx2Var2.c, jx2Var2.d, jx2Var2.e, jx2Var2.f).a;
                        } else {
                            string = context.getString(2131953284);
                        }
                        sq2Var = new uq2(string);
                    } else {
                        iMax = Math.max(1, (list.size() * 3) / 2);
                        se11 se11Var3 = xe70.a;
                        if (iMax >= 60) {
                            int i8 = iMax / 60;
                            int i9 = iMax % 60;
                            quantityString = context.getString(2131953287, context.getResources().getQuantityString(2131820591, i8, Integer.valueOf(i8)), context.getResources().getQuantityString(2131820592, i9, Integer.valueOf(i9)));
                            quantityString.getClass();
                        } else {
                            quantityString = context.getResources().getQuantityString(2131820592, iMax, Integer.valueOf(iMax));
                            quantityString.getClass();
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        arrayList = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            dr2Var = ((jzr0) it.next()).b;
                            if (dr2Var instanceof cr2) {
                                cr2Var = (cr2) dr2Var;
                            } else {
                                cr2Var = null;
                            }
                            if (cr2Var != null) {
                                jx2Var = cr2Var.a;
                            } else {
                                jx2Var = null;
                            }
                            if (jx2Var == null) {
                            }
                        }
                        if (arrayList.size() <= 1) {
                            quantityString2 = (String) o7h.s0(arrayList);
                            if (quantityString2 == null) {
                                quantityString2 = context.getString(2131953289);
                            }
                        } else {
                            quantityString2 = context.getResources().getQuantityString(2131820593, arrayList.size(), Integer.valueOf(arrayList.size()));
                            quantityString2.getClass();
                        }
                        sq2Var = new sq2(context.getString(2131953288, quantityString2, quantityString));
                    }
                }
            } else if (x0j0Var.c) {
                iMax = Math.max(1, (list.size() * 3) / 2);
                se11 se11Var4 = xe70.a;
                if (iMax >= 60) {
                    int i10 = iMax / 60;
                    int i11 = iMax % 60;
                    quantityString = context.getString(2131953287, context.getResources().getQuantityString(2131820591, i10, Integer.valueOf(i10)), context.getResources().getQuantityString(2131820592, i11, Integer.valueOf(i11)));
                    quantityString.getClass();
                } else {
                    quantityString = context.getResources().getQuantityString(2131820592, iMax, Integer.valueOf(iMax));
                    quantityString.getClass();
                }
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    dr2Var = ((jzr0) it.next()).b;
                    if (dr2Var instanceof cr2) {
                        cr2Var = (cr2) dr2Var;
                    } else {
                        cr2Var = null;
                    }
                    if (cr2Var != null) {
                        jx2Var = cr2Var.a;
                    } else {
                        jx2Var = null;
                    }
                    if (jx2Var == null) {
                    }
                }
                if (arrayList.size() <= 1) {
                    quantityString2 = (String) o7h.s0(arrayList);
                    if (quantityString2 == null) {
                        quantityString2 = context.getString(2131953289);
                    }
                } else {
                    quantityString2 = context.getResources().getQuantityString(2131820593, arrayList.size(), Integer.valueOf(arrayList.size()));
                    quantityString2.getClass();
                }
                sq2Var = new sq2(context.getString(2131953288, quantityString2, quantityString));
            } else {
                jzr0Var = (jzr0) o7h.C0(list);
                if (jzr0Var != null) {
                    fr2Var = jzr0Var.a;
                } else {
                    fr2Var = null;
                }
                if (fr2Var == fr2.b) {
                    se11 se11Var5 = xe70.a;
                    jzr0Var2 = (jzr0) o7h.C0(list);
                    if (jzr0Var2 != null) {
                        obj2 = jzr0Var2.b;
                    } else {
                        obj2 = null;
                    }
                    cr2Var2 = obj2 instanceof cr2 ? (cr2) obj2 : null;
                    if (cr2Var2 != 0) {
                        jx2 jx2Var3 = cr2Var2.a;
                        string = xe70.b(context, jx2Var3.b, jx2Var3.c, jx2Var3.d, jx2Var3.e, jx2Var3.f).a;
                    } else {
                        string = context.getString(2131953284);
                    }
                    sq2Var = new uq2(string);
                } else {
                    iMax = Math.max(1, (list.size() * 3) / 2);
                    se11 se11Var6 = xe70.a;
                    if (iMax >= 60) {
                        int i12 = iMax / 60;
                        int i13 = iMax % 60;
                        quantityString = context.getString(2131953287, context.getResources().getQuantityString(2131820591, i12, Integer.valueOf(i12)), context.getResources().getQuantityString(2131820592, i13, Integer.valueOf(i13)));
                        quantityString.getClass();
                    } else {
                        quantityString = context.getResources().getQuantityString(2131820592, iMax, Integer.valueOf(iMax));
                        quantityString.getClass();
                    }
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        dr2Var = ((jzr0) it.next()).b;
                        if (dr2Var instanceof cr2) {
                            cr2Var = (cr2) dr2Var;
                        } else {
                            cr2Var = null;
                        }
                        if (cr2Var != null) {
                            jx2Var = cr2Var.a;
                        } else {
                            jx2Var = null;
                        }
                        if (jx2Var == null) {
                        }
                    }
                    if (arrayList.size() <= 1) {
                        quantityString2 = (String) o7h.s0(arrayList);
                        if (quantityString2 == null) {
                            quantityString2 = context.getString(2131953289);
                        }
                    } else {
                        quantityString2 = context.getResources().getQuantityString(2131820593, arrayList.size(), Integer.valueOf(arrayList.size()));
                        quantityString2.getClass();
                    }
                    sq2Var = new sq2(context.getString(2131953288, quantityString2, quantityString));
                }
            }
            boolean z = sq2Var instanceof uq2;
            qim0Var2 = nim0.a;
            if (z) {
                x340Var.i0(-1423536282);
                d(48, ((uq2) sq2Var).a, x340Var, qim0Var2);
                x340Var.r(false);
            } else if (sq2Var instanceof sq2) {
                x340Var.i0(-1423533654);
                a(48, ((sq2) sq2Var).a, x340Var, qim0Var2);
                x340Var.r(false);
            } else {
                if (!(sq2Var instanceof tq2)) {
                    throw p3d1.k(x340Var, -1423537794, false);
                }
                x340Var.i0(-1423530544);
                tq2 tq2Var = (tq2) sq2Var;
                c(tq2Var.d, 24576, tq2Var.a, tq2Var.b, tq2Var.c, x340Var, qim0Var2);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(x0j0Var, qim0Var2, i, (byte) 22);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(int i, int i2, String str, String str2, String str3, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i3;
        long j;
        boolean z;
        long j2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1535869409);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str3) ? 256 : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String strF = (str2 == null || str2.length() == 0) ? str : f4i1.f(str, " · ", str2);
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(1498264742);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(1498259015);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.d;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1498256254, false);
                }
                x340Var.i0(1498261894);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.e;
                x340Var.r(false);
            }
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0Var, 16.0f, 6.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            long j3 = j;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarY, er31.b(12.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarF, 16.0f, 12.0f);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                z = true;
                objT = new os(str, str3, (byte) 1);
                x340Var.s0(objT);
            } else {
                z = true;
            }
            qim0 qim0VarB = s161.b(qim0VarY2, false, (iu30) objT);
            cvx cvxVar6 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(6.0f, z, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            fra fraVar = een.N0;
            cvx cvxVar7 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), fraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            int iC2 = l1d.C(i);
            if (iC2 != 0) {
                isl islVar = isl.a;
                z2 = true;
                if (iC2 == 1) {
                    j2 = j3;
                    x340Var.i0(1603978584);
                    cnx cnxVar = cnx.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(cnxVar, islVar, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var, cnx.d | 48, 48);
                    x340Var.r(false);
                } else {
                    if (iC2 != 2) {
                        throw p3d1.k(x340Var, 1603976277, false);
                    }
                    x340Var.i0(1603988044);
                    spx spxVar = spx.c;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    j2 = j3;
                    w0h1.a(spxVar, islVar, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var, spx.d | 48, 48);
                    x340Var.r(false);
                }
            } else {
                j2 = j3;
                z2 = true;
                x340Var.i0(1603996605);
                x340Var.r(false);
            }
            uwo1.e(strF, (qim0) null, cbx.d(x340Var).j, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(z2);
            uwo1.e(str3, (qim0) null, cbx.d(x340Var).g, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i3 >> 6) & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new er2(str, str2, str3, i, qim0Var, i2);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1788030970);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0Var, 16.0f, 6.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarY, er31.b(8.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = uyn1.y(qim0VarF, 12.0f, 8.0f);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new v1(str, (byte) 22);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarY2, false, (iu30) objT);
            fra fraVar = een.N0;
            cvx cvxVar6 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e((qim0) null, 2, 0L, 0L, x340Var, 48, 13);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, i3, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 3);
        }
    }

    public static final void e(geb gebVar, iu30 iu30Var, int i, c380 c380Var, String str, iu30 iu30Var2, qim0 qim0Var, boolean z, boolean z2, Function0 function0, Function0 function1, at80 at80Var, eus0 eus0Var, boolean z3, iu30 iu30Var3, iu30 iu30Var4, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object hl0Var;
        int i3;
        Function0 function2;
        boolean z4;
        y7e1 y7e1Var;
        iu30 iu30Var5;
        boolean z5;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-967956234);
        int i4 = i2 | (b0kVar3.g(gebVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.e(i) ? SemanticState.Hidden : SemanticState.Focused);
        boolean zG = b0kVar3.g(c380Var);
        int i5 = SemanticState.ReadOnly;
        int i6 = i4 | (zG ? 2048 : 1024);
        boolean zG2 = b0kVar3.g(str);
        int i7 = SemanticState.Multiline;
        int i8 = i6 | (zG2 ? 16384 : 8192) | 1572864 | (b0kVar3.h(z) ? 8388608 : 4194304) | (b0kVar3.h(z2) ? 67108864 : 33554432) | (b0kVar3.i(function0) ? 536870912 : 268435456);
        int i9 = (b0kVar3.i(function1) ? 4 : 2) | (b0kVar3.e(at80Var == null ? -1 : at80Var.ordinal()) ? 32 : 16) | (b0kVar3.i(eus0Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.h(z3)) {
            i5 = 2048;
        }
        int i10 = i9 | i5;
        if (b0kVar3.i(iu30Var3)) {
            i7 = 16384;
        }
        int i11 = i10 | i7 | (b0kVar3.i(iu30Var4) ? 131072 : 65536);
        if (b0kVar3.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (74899 & i11) == 74898) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            y7e1 y7e1VarD = c4p1.D(0, 2, str == null ? "" : str, b0kVar3);
            y7e1 y7e1VarD2 = c4p1.D(0, 3, (String) null, b0kVar3);
            boolean z6 = gebVar.a == fjt.b || at80Var == at80.a || at80Var == at80.b;
            boolean zI = b0kVar3.i(y7e1VarD) | b0kVar3.h(z6);
            int i12 = i8 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z7 = (i12 == 32) | zI;
            Object objT = b0kVar3.T();
            if (z7 || objT == m4cVar) {
                i3 = i11;
                function2 = null;
                z4 = false;
                hl0Var = new hl0(y7e1VarD, z6, iu30Var, (lnm) null, (byte) 5);
                boolean z8 = z6;
                y7e1Var = y7e1VarD;
                iu30Var5 = iu30Var;
                z5 = z8;
                b0kVar3.s0(hl0Var);
            } else {
                i3 = i11;
                hl0Var = objT;
                z5 = z6;
                y7e1Var = y7e1VarD;
                function2 = null;
                z4 = false;
                iu30Var5 = iu30Var;
            }
            qxd0.t(y7e1Var, b0kVar3, (vu30) hl0Var);
            boolean zI2 = b0kVar3.i(y7e1Var) | (i12 == 32 ? true : z4);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new qy5(y7e1Var, iu30Var5, function2, (byte) 1);
                b0kVar3.s0(objT2);
            }
            qxd0.t(y7e1Var, b0kVar3, (vu30) objT2);
            boolean zI3 = b0kVar3.i(y7e1VarD2) | (i12 == 32 ? true : z4);
            Object objT3 = b0kVar3.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new qy5(y7e1VarD2, iu30Var5, function2, (byte) 2);
                b0kVar3.s0(objT3);
            }
            qxd0.t(y7e1VarD2, b0kVar3, (vu30) objT3);
            if (z5) {
                function2 = function1;
            }
            int i13 = i3;
            int i14 = i13 & 8176;
            int i15 = i13 << 3;
            b0kVar2 = b0kVar3;
            qim0 qim0Var4 = qim0Var3;
            f(gebVar, iu30Var5, i, c380Var, iu30Var2, y7e1Var, qim0Var4, z, z2, function0, function2, at80Var, eus0Var, z3, y7e1VarD2, iu30Var3, iu30Var4, b0kVar2, (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0221: INVOKE 
                  (r26v0 'gebVar' p.geb)
                  (r2v21 'iu30Var5' p.iu30)
                  (r28v0 'i' int)
                  (r29v0 'c380Var' p.c380)
                  (r31v0 'iu30Var2' p.iu30)
                  (r3v11 'y7e1Var' p.y7e1)
                  (r6v16 'qim0Var4' p.qim0)
                  (r33v0 'z' boolean)
                  (r34v0 'z2' boolean)
                  (r35v0 'function0' kotlin.jvm.functions.Function0)
                  (r5v10 'function2' kotlin.jvm.functions.Function0)
                  (r37v0 'at80Var' p.at80)
                  (r38v0 'eus0Var' p.eus0)
                  (r39v0 'z3' boolean)
                  (r14v2 'y7e1VarD2' p.y7e1)
                  (r40v0 'iu30Var3' p.iu30)
                  (r41v0 'iu30Var4' p.iu30)
                  (r17v6 'b0kVar2' p.b0k)
                  (wrap int:0x01f5: ARITH (wrap int:0x01f1: ARITH (wrap int:0x01ed: ARITH (wrap int:0x01e9: ARITH (wrap int:0x01e4: ARITH (r18v2 int) & (8190 int) A[WRAPPED]) | (1597440 int) A[DONT_WRAP, WRAPPED]) | (wrap int:0x01ec: ARITH (29360128 int) & (r18v2 int) A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap int:0x01f0: ARITH (234881024 int) & (r18v2 int) A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap int:0x01f4: ARITH (1879048192 int) & (r2v12 'i8' int) A[WRAPPED]) A[WRAPPED])
                  (wrap int:0x0203: ARITH (wrap int:0x01ff: ARITH (r4v18 'i14' int) | (wrap int:0x01fe: ARITH (458752 int) & (r1v28 'i15' int) A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap int:0x0202: ARITH (r1v28 'i15' int) & (3670016 int) A[WRAPPED]) A[WRAPPED])
                 STATIC call: p.vbe.f(p.geb, p.iu30, int, p.c380, p.iu30, p.y7e1, p.qim0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.at80, p.eus0, boolean, p.y7e1, p.iu30, p.iu30, p.b0k, int, int):void A[MD:(p.geb, p.iu30, int, p.c380, p.iu30, p.y7e1, p.qim0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.at80, p.eus0, boolean, p.y7e1, p.iu30, p.iu30, p.b0k, int, int):void (m)] (LINE:29) in method: p.vbe.e(p.geb, p.iu30, int, p.c380, java.lang.String, p.iu30, p.qim0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.at80, p.eus0, boolean, p.iu30, p.iu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v2 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 608
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.vbe.e(p.geb, p.iu30, int, p.c380, java.lang.String, p.iu30, p.qim0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.at80, p.eus0, boolean, p.iu30, p.iu30, p.b0k, int):void");
        }

        /* JADX WARN: Failed to calculate best type for var: r20v10 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v10 ??, new type: p.w7x
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r20v7 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v7 ??, new type: p.w7x
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r20v9 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v9 ??, new type: p.w7x
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r9v42 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v42 ??, new type: java.util.Set
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /* JADX WARN: Failed to calculate best type for var: r9v43 ??
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v43 ??, new type: java.util.Set
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 7 more
         */
        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v6 ??, new type: java.lang.Object
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
            	... 5 more
            */
        public static final void f(p.geb r59, p.iu30 r60, int r61, p.c380 r62, p.iu30 r63, p.y7e1 r64, p.qim0 r65, boolean r66, boolean r67, kotlin.jvm.functions.Function0 r68, kotlin.jvm.functions.Function0 r69, p.at80 r70, p.eus0 r71, boolean r72, p.y7e1 r73, p.iu30 r74, p.iu30 r75, p.b0k r76, int r77, int r78) {
            /*
                Method dump skipped, instruction units count: 2394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.vbe.f(p.geb, p.iu30, int, p.c380, p.iu30, p.y7e1, p.qim0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.at80, p.eus0, boolean, p.y7e1, p.iu30, p.iu30, p.b0k, int, int):void");
        }

        public static final void g(p5k p5kVar, int i, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
            int i3;
            b0k b0kVar2;
            qim0 qim0Var2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-808796079);
            if ((i2 & 6) == 0) {
                i3 = (b0kVar3.i(p5kVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= b0kVar3.e(i) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= b0kVar3.i(iu30Var) ? 256 : SemanticState.Focused;
            }
            int i4 = i3 | 3072;
            if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
                boolean zI = ((i4 & 896) == 256) | b0kVar3.i(p5kVar) | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                Object objT = b0kVar3.T();
                if (zI || objT == fkj0.X) {
                    objT = new wv1(iu30Var, p5kVar, i, (byte) 7);
                    b0kVar3.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                j2i j2iVarR = apo.r(1811110711, new v5k(p5kVar, (byte) 0), b0kVar3);
                int i5 = ((i4 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | 12582912;
                qim0 qim0Var3 = nim0.a;
                b0kVar2 = b0kVar3;
                dem1.d(function0, qim0Var3, (String) null, 0, 0, 0L, 0.0f, false, false, 0, (vu30) null, (vu30) null, (idn0) null, j2iVarR, b0kVar2, i5, 3072, 8060);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nk0(p5kVar, i, iu30Var, qim0Var2, i2, (byte) 4);
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0062  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:31:0x006d  */
        /* JADX WARN: Code duplicated, block: B:41:0x0093 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x0095  */
        /* JADX WARN: Code duplicated, block: B:45:0x009a  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:53:0x0101  */
        /* JADX WARN: Code duplicated, block: B:55:0x0108  */
        /* JADX WARN: Code duplicated, block: B:56:0x010e  */
        /* JADX WARN: Code duplicated, block: B:60:0x0141  */
        /* JADX WARN: Code duplicated, block: B:62:0x0149 A[LOOP:0: B:58:0x013b->B:62:0x0149, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:66:0x0166  */
        /* JADX WARN: Code duplicated, block: B:68:0x016a  */
        /* JADX WARN: Code duplicated, block: B:71:0x0177  */
        /* JADX WARN: Code duplicated, block: B:74:0x0157 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
        public static final void h(u5k u5kVar, iu30 iu30Var, qim0 qim0Var, p3v p3vVar, float f, b0k b0kVar, int i, int i2) {
            p3v p3vVar2;
            int i3;
            float f2;
            int i4;
            int i5;
            boolean z;
            boolean z2;
            qim0 qim0Var2;
            p3v p3vVar3;
            float f3;
            h311 h311VarV;
            int i6;
            p3v p3vVar4;
            qim0 qim0Var3;
            int i7;
            float f4;
            float fE;
            jw31 jw31VarA;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            int i8;
            int i9;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1262900902);
            iu30 iu30Var2 = iu30Var;
            int i10 = i | (x340Var.i(u5kVar) ? 4 : 2) | (x340Var.i(iu30Var2) ? 32 : 16);
            int i11 = i10 | 384;
            int i12 = i2 & 8;
            if (i12 != 0) {
                i3 = i10 | 3456;
                p3vVar2 = p3vVar;
            } else {
                p3vVar2 = p3vVar;
                i3 = i11 | (x340Var.g(p3vVar2) ? SemanticState.Modal : SemanticState.ReadOnly);
            }
            if ((i2 & 16) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i4 = TlsSocketProvider.READ_BUFFER_SIZE;
                }
                i5 = i3 | i4 | 65536;
                z = false;
                if ((74899 & i5) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i5 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i12 != 0) {
                            p3vVar2 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                            f2 = 8.0f;
                        }
                        i6 = i5 & (-458753);
                        p3vVar4 = p3vVar2;
                        qim0Var3 = nim0.a;
                    } else {
                        x340Var.b0();
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        i6 = i5 & (-458753);
                        p3vVar4 = p3vVar2;
                        qim0Var3 = qim0Var;
                    }
                    i7 = i6;
                    f4 = f2;
                    x340Var.s();
                    es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
                    if (p3vVar4 == null) {
                        fE = z5c.e(x340Var, -1827967805, 2131166128, x340Var, false);
                    } else {
                        x340Var.i0(-1827968456);
                        x340Var.r(false);
                        fE = p3vVar4.a;
                    }
                    qim0 qim0VarB = uyn1.B(uyn1.z(fE, 0.0f, 2, l6o1.t(qim0Var3, es41VarC, 14)), 0.0f, f4, 0.0f, 0.0f, 5);
                    jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), een.Z, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    x340Var.i0(1615153909);
                    i8 = 0;
                    for (Object obj : u5kVar.a) {
                        i9 = i8 + 1;
                        if (i8 >= 0) {
                            p7h.T();
                            throw null;
                        }
                        g((p5k) obj, i8, iu30Var2, null, x340Var, (i7 << 3) & 896);
                        iu30Var2 = iu30Var;
                        i8 = i9;
                    }
                    x340Var.r(false);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                    p3vVar3 = p3vVar4;
                    f3 = f4;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    p3vVar3 = p3vVar2;
                    f3 = f2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new w5k(u5kVar, iu30Var, qim0Var2, p3vVar3, f3, i, i2);
                }
            }
            f2 = f;
            i4 = SemanticState.Multiline;
            i5 = i3 | i4 | 65536;
            z = false;
            if ((74899 & i5) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i5 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        p3vVar2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        f2 = 8.0f;
                    }
                    i6 = i5 & (-458753);
                    p3vVar4 = p3vVar2;
                    qim0Var3 = nim0.a;
                } else {
                    if (i12 != 0) {
                        p3vVar2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        f2 = 8.0f;
                    }
                    i6 = i5 & (-458753);
                    p3vVar4 = p3vVar2;
                    qim0Var3 = nim0.a;
                }
                i7 = i6;
                f4 = f2;
                x340Var.s();
                es41 es41VarC2 = l6o1.C(0, 0, 1, x340Var);
                if (p3vVar4 == null) {
                    fE = z5c.e(x340Var, -1827967805, 2131166128, x340Var, false);
                } else {
                    x340Var.i0(-1827968456);
                    x340Var.r(false);
                    fE = p3vVar4.a;
                }
                qim0 qim0VarB2 = uyn1.B(uyn1.z(fE, 0.0f, 2, l6o1.t(qim0Var3, es41VarC2, 14)), 0.0f, f4, 0.0f, 0.0f, 5);
                jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var.i0(1615153909);
                i8 = 0;
                while (r9.hasNext()) {
                    i9 = i8 + 1;
                    if (i8 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    g((p5k) obj, i8, iu30Var2, null, x340Var, (i7 << 3) & 896);
                    iu30Var2 = iu30Var;
                    i8 = i9;
                }
                x340Var.r(false);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
                p3vVar3 = p3vVar4;
                f3 = f4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                p3vVar3 = p3vVar2;
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new w5k(u5kVar, iu30Var, qim0Var2, p3vVar3, f3, i, i2);
            }
        }

        public static final void i(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
            qim0 qim0Var2;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(331081126);
            int i3 = i2 | (b0kVar2.e(i) ? 4 : 2) | (b0kVar2.h(z) ? 32 : 16) | (b0kVar2.i(function0) ? SemanticState.Hidden : SemanticState.Focused) | 3072;
            if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar2).b.a;
                long j2 = cbx.a(b0kVar2).a.c;
                qlx qlxVar = z ? qlx.c : mlx.c;
                String strU = cwl1.U(2131820545, i, new Object[]{Integer.valueOf(i)}, b0kVar2);
                String strO0 = cwl1.o0(b0kVar2, z ? 2131951716 : 2131951715);
                String strO1 = cwl1.o0(b0kVar2, z ? 2131951696 : 2131951697);
                fra fraVar = een.N0;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarN = anm1.N("group-toggle", qim0Var3);
                cua cuaVar = cbx.b(b0kVar2).f;
                qlx qlxVar2 = qlxVar;
                qim0 qim0VarB = s161.b(bin.x(dug.f(i1p1.q(qim0VarN, er31.b(16.0f)), j, d4o1.a), false, strO1, new pm31(0), (idn0) null, function0, 9), false, new os(strU, strO0, (byte) 12));
                cvx cvxVar = cbx.b(b0kVar2).b;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qim0 qim0VarY = uyn1.y(qim0VarB, 8.0f, 4.0f);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 48);
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
                nko1.H(jw31VarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                imx imxVar = imx.c;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                qim0 qim0VarR = u291.r(qim0Var3, 16.0f);
                int i4 = imx.d | 48;
                isl islVar = isl.a;
                w0h1.a(imxVar, islVar, qim0VarR, j2, 0L, false, b0kVar2, i4, 48);
                String strValueOf = String.valueOf(i);
                lee1 lee1Var = cbx.d(b0kVar2).k;
                cjc0 cjc0Var = new cjc0(1);
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                qim0 qim0VarB2 = uyn1.B(qim0Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                Object objT = b0kVar2.T();
                if (objT == fkj0.X) {
                    objT = zlt.Q0;
                    b0kVar2.s0(objT);
                }
                uwo1.e(strValueOf, s161.b(qim0VarB2, false, (iu30) objT), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, b0kVar2, 0, 0, 1776);
                b0kVar2 = b0kVar2;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                qim0 qim0VarR2 = u291.r(qim0Var3, 12.0f);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                w0h1.a(qlxVar2, islVar, uyn1.B(qim0VarR2, 4.0f, 0.0f, 0.0f, 0.0f, 14), j2, 0L, false, b0kVar2, 56, 48);
                b0kVar2.r(true);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new oj8(i, z, function0, qim0Var2, i2);
            }
        }

        public static final void j(Function0 function0, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1344628355);
            int i2 = (x340Var.i(function0) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                String strO0 = cwl1.o0(x340Var, 2131955437);
                String strO1 = cwl1.o0(x340Var, 2131955445);
                ye5 ye5VarO = kk0.o(597316033, x340Var);
                uwr uwrVar = cbx.a;
                int iO = ye5VarO.o(new zma1(cbx.a(x340Var).b.d, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5VarO.g(strO0);
                    ye5VarO.k(iO);
                    ye5VarO.g(" ");
                    ye5VarO.m("SIGN_UP", "sign_up");
                    int iO2 = ye5VarO.o(new zma1(cbx.a(x340Var).b.d, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438));
                    try {
                        ye5VarO.g(strO1);
                        ye5VarO.k(iO2);
                        ye5VarO.j();
                        af5 af5VarP = ye5VarO.p();
                        x340Var.r(false);
                        lee1 lee1Var = cbx.d(x340Var).j;
                        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                        boolean zI = x340Var.i(af5VarP) | ((i2 & 14) == 4);
                        Object objT = x340Var.T();
                        if (zI || objT == fkj0.X) {
                            objT = new qeb(af5VarP, function0, (byte) 0);
                            x340Var.s0(objT);
                        }
                        l0p1.a(af5VarP, qim0VarF, lee1Var, false, 0, 0, (iu30) null, (iu30) objT, x340Var, 0, 120);
                    } catch (Throwable th) {
                        ye5VarO.k(iO2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ye5VarO.k(iO);
                    throw th2;
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wm(function0, i, (byte) 13);
            }
        }

        public static final void k(int i, int i2, boolean z, Function0 function0, b0k b0kVar, int i3) {
            Function0 function1;
            boolean z2 = z;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1055496266);
            int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.h(z2) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(function0) ? SemanticState.Modal : SemanticState.ReadOnly);
            if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = x340Var.i(ven0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new hj6(ven0Var, (lnm) null, (byte) 7);
                    x340Var.s0(objT2);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                long j = cbx.a(x340Var).b.a;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                gra graVar = een.e;
                h2c h2cVar = h2c.a;
                qim0 qim0VarB = uyn1.B(h2cVar.a(nim0Var, graVar), 0.0f, cvxVar.e, 0.0f, 0.0f, 13);
                bby bbyVarE = xay.e(2, irn1.o0(500, 0, (dlv) null, 6));
                pxg1 pxg1VarO0 = irn1.o0(500, 0, (dlv) null, 6);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = gq30.a1;
                    x340Var.s0(objT3);
                }
                fq7.g(zBooleanValue, qim0VarB, bbyVarE.a(xay.o(pxg1VarO0, (iu30) objT3)), (ln00) null, (String) null, apo.r(708496920, new wy30(cvxVar, i2, j, i), x340Var), x340Var, 196608, 24);
                boolean zBooleanValue2 = ((Boolean) ven0Var.getValue()).booleanValue();
                qim0 qim0VarA = h2cVar.a(nim0Var, een.h);
                bby bbyVarE2 = xay.e(2, irn1.o0(500, 0, (dlv) null, 6));
                pxg1 pxg1VarO1 = irn1.o0(500, 0, (dlv) null, 6);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = gq30.b1;
                    x340Var.s0(objT4);
                }
                bby bbyVarA = bbyVarE2.a(xay.o(pxg1VarO1, (iu30) objT4));
                z2 = z;
                function1 = function0;
                fq7.g(zBooleanValue2, qim0VarA, bbyVarA, (ln00) null, (String) null, apo.r(-594319935, new xy30(z2, function1, (byte) 0), x340Var), x340Var, 196608, 24);
                x340Var.r(true);
            } else {
                function1 = function0;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new snv(i, i2, z2, function1, i3, (byte) 2);
            }
        }

        public static final void l(w6e0 w6e0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(981116290);
            int i2 = i | (x340Var.g(w6e0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : SemanticState.Focused);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new iyb0(w6e0Var, (lnm) null, (byte) 9);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT);
                String strO0 = cwl1.o0(x340Var, 2131957683);
                String strO1 = cwl1.o0(x340Var, 2131957680);
                i3u i3uVar = new i3u(5, false, false, false);
                String strO2 = cwl1.o0(x340Var, 2131957681);
                boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new tze0(function0, (byte) 0);
                    x340Var.s0(objT2);
                }
                z50 z50Var = z50.c;
                zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT2));
                String strO3 = cwl1.o0(x340Var, 2131957682);
                int i3 = i2 & 896;
                boolean z3 = i3 == 256;
                Object objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new tze0(function1, (byte) 1);
                    x340Var.s0(objT3);
                }
                zgx zgxVar2 = new zgx(strO3, new gbx(z50Var, (Function0) objT3));
                boolean z4 = i3 == 256;
                Object objT4 = x340Var.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new tze0(function1, (byte) 2);
                    x340Var.s0(objT4);
                }
                mqo1.d((Function0) objT4, i3uVar, (hux) null, strO0, strO1, zgxVar, zgxVar2, x340Var, 2359296, 4);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qae0(w6e0Var, function0, function1, i, (byte) 9);
            }
        }

        public static final void m(qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1611618526);
            int i2 = i | 6;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                String strO0 = cwl1.o0(x340Var, 2131957684);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).d;
                long j = cbx.a(x340Var).b.a;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = gje0.a1;
                    x340Var.s0(objT);
                }
                qim0 qim0Var3 = nim0.a;
                uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new one0(qim0Var2, i, (byte) 1);
            }
        }

        public static final void n(int i, b0k b0kVar, jqp jqpVar, iu30 iu30Var, w6e0 w6e0Var, qze0 qze0Var, qim0 qim0Var) {
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(804198283);
            int i2 = (x340Var.i(jqpVar) ? 4 : 2) | i | (x340Var.i(qze0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.g(w6e0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                String str = qze0Var.b;
                String str2 = qze0Var.a;
                String strN0 = cwl1.n0(2131957679, new Object[]{str}, x340Var);
                String str3 = qze0Var.b;
                String strN1 = cwl1.n0(2131957678, new Object[]{str3, str3}, x340Var);
                boolean zG = x340Var.g(strN1);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = mqo1.s(new y980[]{new y980("", strN1)});
                    x340Var.s0(objT);
                }
                c9 c9Var = (c9) objT;
                boolean zE = x340Var.e(l1d.C(qze0Var.f)) | x340Var.g(str2) | x340Var.g(strN0) | x340Var.g(c9Var);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = jqpVar.a(new xnb1(str2, "", c9Var, new uzg1(strN0, new vze0(qze0Var, w6e0Var, iu30Var))));
                    x340Var.s0(objT2);
                }
                y1f0 y1f0Var = (y1f0) objT2;
                rih1 rih1Var = rih1.a;
                qim0 qim0Var2 = nim0.a;
                otw.c(y1f0Var, rih1Var, qim0Var2, (ipb1) null, x340Var, 440, 8);
                qim0Var = qim0Var2;
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uze0(jqpVar, qze0Var, iu30Var, w6e0Var, qim0Var, i);
            }
        }

        public static final void o(es41 es41Var, vzq0 vzq0Var, qze0 qze0Var, iu30 iu30Var, jqp jqpVar, w6e0 w6e0Var, b0k b0kVar, int i) {
            int i2;
            vzq0 vzq0Var2;
            jqp jqpVar2;
            b0k b0kVar2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-796733845);
            if ((i & 6) == 0) {
                i2 = (b0kVar3.i(es41Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                vzq0Var2 = vzq0Var;
                i2 |= b0kVar3.i(vzq0Var2) ? 32 : 16;
            } else {
                vzq0Var2 = vzq0Var;
            }
            if ((i & 384) == 0) {
                i2 |= b0kVar3.i(qze0Var) ? SemanticState.Hidden : SemanticState.Focused;
            }
            if ((i & 3072) == 0) {
                i2 |= b0kVar3.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly;
            }
            if ((i & 24576) == 0) {
                jqpVar2 = jqpVar;
                i2 |= b0kVar3.i(jqpVar2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
            } else {
                jqpVar2 = jqpVar;
            }
            if ((196608 & i) == 0) {
                i2 |= (262144 & i) == 0 ? b0kVar3.g(w6e0Var) : b0kVar3.i(w6e0Var) ? 131072 : 65536;
            }
            int i3 = i2;
            if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
                b0kVar2 = b0kVar3;
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var2.d(), 0.0f, 0.0f, 13), es41Var, apo.r(470758304, new uk20(vzq0Var2, jqpVar2, qze0Var, iu30Var, w6e0Var, (byte) 24), b0kVar3), b0kVar2, ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 384, 0);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wc0(es41Var, vzq0Var, qze0Var, iu30Var, jqpVar, w6e0Var, i, (byte) 27);
            }
        }

        public static final void p(int i, b0k b0kVar, jqp jqpVar, iu30 iu30Var, w6e0 w6e0Var, qze0 qze0Var, qim0 qim0Var) {
            b0k b0kVar2;
            qim0 qim0Var2;
            long jX;
            Integer num = qze0Var.d;
            zzy zzyVar = qze0Var.c;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1047731935);
            int i2 = i | (b0kVar3.i(qze0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(jqpVar) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.g(w6e0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
            if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
                if (!(zzyVar instanceof xzy) || num == null) {
                    b0kVar3.i0(1455202353);
                    jX = j1e1.x(zzyVar);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1455136230);
                    b0kVar3.r(false);
                    jX = z4p1.e(num.intValue() | (-16777216));
                }
                long j = jX;
                j2i j2iVarR = apo.r(-530906420, new wze0(iu30Var, es41VarC, w6e0Var, j), b0kVar3);
                j2i j2iVarR2 = apo.r(921826630, new jna(j, es41VarC, qze0Var, iu30Var, jqpVar, w6e0Var, (byte) 1), b0kVar3);
                b0kVar2 = b0kVar3;
                qim0 qim0Var3 = nim0.a;
                irn1.u(qim0Var3, j2iVarR, (vu30) null, (erl1) null, j2iVarR2, b0kVar2, 24630, 12);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new uze0(qze0Var, iu30Var, jqpVar, w6e0Var, qim0Var2, i);
            }
        }

        public static final void q(iu30 iu30Var, es41 es41Var, w6e0 w6e0Var, long j, b0k b0kVar, int i) {
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1056308382);
            int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(es41Var) ? 32 : 16) | (x340Var.g(w6e0Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.f(j) ? 2048 : SemanticState.ReadOnly);
            if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                boolean z = (i2 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new qgr0(j);
                    x340Var.s0(objT);
                }
                qgr0 qgr0Var = (qgr0) objT;
                String strO0 = cwl1.o0(x340Var, 2131953950);
                boolean zG = x340Var.g(strO0);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new jsl(strO0);
                    x340Var.s0(objT2);
                }
                jsl jslVar = (jsl) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = new gbx(z50.c, new xze0(w6e0Var, iu30Var, (byte) 1));
                    x340Var.s0(objT3);
                }
                gbx gbxVar = (gbx) objT3;
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = new tr80(0, 1, 1);
                    x340Var.s0(objT4);
                }
                bzn1.e((qim0) null, (vu30) null, false, apo.r(1141059904, new zze0(gbxVar, jslVar, (byte) 0), x340Var), qgr0Var, (ngr0) null, ezn1.n(es41Var, (tr80) objT4, x340Var, ((i2 >> 3) & 14) | 24576), (Function0) null, x340Var, 2100224, 167);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wze0(iu30Var, es41Var, w6e0Var, j, i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:124:0x0339  */
        public static final void r(eus0 eus0Var, boolean z, y7e1 y7e1Var, boolean z2, lz20 lz20Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, xu30 xu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var;
            boolean z3;
            boolean z4;
            m0d m0dVar;
            boolean z5;
            long j;
            x340 x340Var2;
            Object obj;
            boolean z6;
            qim0 qim0Var2;
            float f;
            jax haxVar;
            boolean zI;
            Object objT;
            eus0 eus0Var2 = eus0Var;
            Object obj2 = fkj0.X;
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.k0(439864436);
            int i2 = i | (x340Var3.i(eus0Var2) ? 4 : 2) | (x340Var3.h(z) ? 32 : 16) | (x340Var3.i(y7e1Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var3.h(z2) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var3.i(lz20Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var3.i(iu30Var) ? 131072 : 65536) | (x340Var3.i(function0) ? 1048576 : 524288) | (x340Var3.i(function1) ? 8388608 : 4194304) | (x340Var3.i(function2) ? 67108864 : 33554432) | (x340Var3.i(xu30Var) ? 536870912 : 268435456);
            if (x340Var3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((x340Var3.i(qim0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
                Object[] objArr = new Object[0];
                Object objT2 = x340Var3.T();
                if (objT2 == obj2) {
                    objT2 = cu9.P0;
                    x340Var3.s0(objT2);
                }
                char c2 = '0';
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var3, 48);
                m0d m0dVar2 = eus0Var2.b;
                String string = y7e1Var.d().d.toString();
                if (!eus0Var2.c && m0dVar2 != null && string.length() > 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= string.length()) {
                            z3 = true;
                            break;
                        }
                        char cCharAt = string.charAt(i3);
                        if (c2 > cCharAt || cCharAt >= ':') {
                            z3 = false;
                            break;
                        } else {
                            i3++;
                            c2 = '0';
                        }
                    }
                } else {
                    z3 = false;
                    break;
                }
                boolean zH = ((i2 & 1879048192) == 536870912) | x340Var3.h(z3) | x340Var3.i(m0dVar2) | x340Var3.g(string);
                Object objT3 = x340Var3.T();
                if (zH || objT3 == obj2) {
                    boolean z7 = z3;
                    objT3 = new gh1(z7, xu30Var, m0dVar2, string, (byte) 4);
                    z4 = z7;
                    m0dVar = m0dVar2;
                    x340Var3.s0(objT3);
                } else {
                    m0dVar = m0dVar2;
                    z4 = z3;
                }
                iu30 iu30Var2 = (iu30) objT3;
                String strO0 = cwl1.o0(x340Var3, 2131959724);
                String strO1 = cwl1.o0(x340Var3, 2131955015);
                String strO2 = cwl1.o0(x340Var3, 2131956573);
                boolean zG = x340Var3.g(m0dVar != null ? m0dVar.b : null);
                Object objT4 = x340Var3.T();
                if (zG || objT4 == obj2) {
                    objT4 = new g820(vy5.e, new ek80(new cka(m0dVar, (byte) 8)));
                    x340Var3.s0(objT4);
                }
                dk80 dk80Var = (dk80) objT4;
                if (z2) {
                    x340Var3.i0(1802983740);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var3).b.d;
                    z5 = false;
                } else {
                    z5 = false;
                    x340Var3.i0(1802985019);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var3).c.b;
                }
                x340Var3.r(z5);
                long j2 = j;
                long j3 = cbx.a(x340Var3).b.a;
                long j4 = cbx.a(x340Var3).b.a;
                m0d m0dVar3 = m0dVar;
                long j5 = cbx.a(x340Var3).b.b;
                long j6 = cbx.a(x340Var3).b.a;
                long j7 = u7h.j;
                fyx fyxVar = new fyx(new zxx(j3, j4, j5, j6, j7, j7, cbx.a(x340Var3).b.c, 0L, 896));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var3, qim0Var3);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                uwo1.e(strO2, u291.f(qim0Var3, 1.0f), cbx.d(x340Var3).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2040);
                op71.g(x340Var3, u291.h(qim0Var3, 12.0f));
                mod.b(t4k.n.a(flb0.a), apo.r(-450165122, new reb(j2, z, m0dVar3, iu30Var2, lz20Var, function2, strO2, y7e1Var, fyxVar, z2, dk80Var, strO0, function0, ven0Var, strO1), x340Var3), x340Var3, 56);
                if (!((Boolean) ven0Var.getValue()).booleanValue() || m0dVar3 == null) {
                    eus0Var2 = eus0Var;
                    x340Var2 = x340Var3;
                    obj = obj2;
                    z6 = false;
                    x340Var2.i0(-10734812);
                    x340Var2.r(false);
                } else {
                    x340Var3.i0(-11087499);
                    eus0Var2 = eus0Var;
                    List list = eus0Var2.a;
                    boolean zI2 = ((i2 & 458752) == 131072) | ((i2 & 29360128) == 8388608) | x340Var3.i(ven0Var);
                    Object objT5 = x340Var3.T();
                    if (zI2) {
                        obj = obj2;
                    } else {
                        obj = obj2;
                        if (objT5 == obj) {
                        }
                        iu30 iu30Var3 = (iu30) objT5;
                        zI = x340Var3.i(ven0Var);
                        objT = x340Var3.T();
                        if (zI || objT == obj) {
                            objT = new bp9(ven0Var, (byte) 2);
                            x340Var3.s0(objT);
                        }
                        zpn1.a(list, m0dVar3, iu30Var3, (Function0) objT, x340Var3, 0);
                        x340Var2 = x340Var3;
                        z6 = false;
                        x340Var2.r(false);
                    }
                    objT5 = new oo6(function1, iu30Var, ven0Var);
                    x340Var3.s0(objT5);
                    iu30 iu30Var4 = (iu30) objT5;
                    zI = x340Var3.i(ven0Var);
                    objT = x340Var3.T();
                    if (zI) {
                        objT = new bp9(ven0Var, (byte) 2);
                        x340Var3.s0(objT);
                    } else {
                        objT = new bp9(ven0Var, (byte) 2);
                        x340Var3.s0(objT);
                    }
                    zpn1.a(list, m0dVar3, iu30Var4, (Function0) objT, x340Var3, 0);
                    x340Var2 = x340Var3;
                    z6 = false;
                    x340Var2.r(false);
                }
                if (z2) {
                    v8i0.i(4.0f, -10702603, x340Var2, x340Var2, qim0Var3);
                    f = 1.0f;
                    x340 x340Var4 = x340Var2;
                    qim0Var2 = qim0Var3;
                    uwo1.e(cwl1.o0(x340Var2, 2131955702), u291.f(qim0Var3, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                    x340Var2 = x340Var4;
                    x340Var2.r(z6);
                } else {
                    qim0Var2 = qim0Var3;
                    f = 1.0f;
                    x340Var2.i0(-10349916);
                    x340Var2.r(z6);
                }
                op71.g(x340Var2, u291.h(qim0Var2, 16.0f));
                boolean zG2 = x340Var2.g(iu30Var2);
                Object objT6 = x340Var2.T();
                if (zG2 || objT6 == obj) {
                    objT6 = new nc8(iu30Var2, (byte) 27);
                    x340Var2.s0(objT6);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT6);
                idx idxVar = new idx(4);
                if (z4) {
                    x340Var2.i0(-10042086);
                    x340Var2.r(z6);
                    haxVar = jax.a;
                } else {
                    x340Var2.i0(-9988735);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131956531));
                    x340Var2.r(z6);
                }
                qim0 qim0VarN = anm1.N("continue_button", u291.f(qim0Var, f));
                Object objT7 = x340Var2.T();
                if (objT7 == obj) {
                    objT7 = c7b.i;
                    x340Var2.s0(objT7);
                }
                x340 x340Var5 = x340Var2;
                foo1.c(gbxVar, idxVar, s161.b(qim0VarN, z6, (iu30) objT7), haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, k9i.i, x340Var5, 0, 48, 2024);
                uwo1.e(ydh.g(16.0f, 2131959726, x340Var5, x340Var5, qim0Var2), u291.f(qim0Var2, f), cbx.d(x340Var5).m, cbx.a(x340Var5).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2016);
                x340Var = x340Var5;
                x340Var.r(true);
            } else {
                x340Var = x340Var3;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new seb(eus0Var2, z, y7e1Var, z2, lz20Var, iu30Var, function0, function1, function2, xu30Var, qim0Var, i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x012c  */
        /* JADX WARN: Code duplicated, block: B:104:0x0159  */
        /* JADX WARN: Code duplicated, block: B:106:0x0160  */
        /* JADX WARN: Code duplicated, block: B:107:0x0166  */
        /* JADX WARN: Code duplicated, block: B:110:0x0186  */
        /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:113:0x021f  */
        /* JADX WARN: Code duplicated, block: B:115:0x0224  */
        /* JADX WARN: Code duplicated, block: B:118:0x0232  */
        /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:23:0x003f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0043  */
        /* JADX WARN: Code duplicated, block: B:27:0x004b  */
        /* JADX WARN: Code duplicated, block: B:28:0x004e  */
        /* JADX WARN: Code duplicated, block: B:31:0x0054  */
        /* JADX WARN: Code duplicated, block: B:34:0x005a  */
        /* JADX WARN: Code duplicated, block: B:36:0x005e  */
        /* JADX WARN: Code duplicated, block: B:38:0x0066  */
        /* JADX WARN: Code duplicated, block: B:39:0x0069  */
        /* JADX WARN: Code duplicated, block: B:42:0x006f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0075  */
        /* JADX WARN: Code duplicated, block: B:47:0x0079  */
        /* JADX WARN: Code duplicated, block: B:49:0x0081  */
        /* JADX WARN: Code duplicated, block: B:50:0x0084  */
        /* JADX WARN: Code duplicated, block: B:53:0x008a  */
        /* JADX WARN: Code duplicated, block: B:56:0x0092  */
        /* JADX WARN: Code duplicated, block: B:58:0x0096  */
        /* JADX WARN: Code duplicated, block: B:60:0x0099  */
        /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:85:0x00e4 A[PHI: r2 r4 r5 r7 r10
          0x00e4: PHI (r2v29 int) = (r2v13 int), (r2v32 int), (r2v33 int) binds: [B:97:0x011b, B:83:0x00e0, B:84:0x00e2] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r4v6 p.qim0) = (r4v3 p.qim0), (r4v2 p.qim0), (r4v2 p.qim0) binds: [B:97:0x011b, B:83:0x00e0, B:84:0x00e2] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r5v13 long) = (r5v9 long), (r5v6 long), (r5v6 long) binds: [B:97:0x011b, B:83:0x00e0, B:84:0x00e2] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r7v12 long) = (r7v5 long), (r7v2 long), (r7v2 long) binds: [B:97:0x011b, B:83:0x00e0, B:84:0x00e2] A[DONT_GENERATE, DONT_INLINE]
          0x00e4: PHI (r10v14 p.lee1) = (r10v4 p.lee1), (r10v2 p.lee1), (r10v2 p.lee1) binds: [B:97:0x011b, B:83:0x00e0, B:84:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:86:0x00e9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:93:0x0100  */
        /* JADX WARN: Code duplicated, block: B:96:0x0110  */
        /* JADX WARN: Code duplicated, block: B:98:0x011d  */
        public static final void s(String str, qim0 qim0Var, long j, long j2, lee1 lee1Var, boolean z, b0k b0kVar, int i, int i2) {
            int i3;
            qim0 qim0Var2;
            long j3;
            long j4;
            lee1 lee1Var2;
            int i4;
            boolean z2;
            int i5;
            boolean z3;
            qim0 qim0Var3;
            long j5;
            long j6;
            lee1 lee1Var3;
            boolean z4;
            h311 h311VarV;
            int i6;
            qim0 qim0Var4;
            int i7;
            lee1 lee1Var4;
            boolean z5;
            Object objT;
            jw31 jw31VarA;
            lee1 lee1Var5;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            long j7;
            int i8;
            boolean z6;
            b0k b0kVar2;
            qim0 qim0Var5;
            int i9;
            int i10;
            int i11;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(1111036423);
            if ((i & 6) == 0) {
                i3 = (b0kVar3.g(str) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i12 = i2 & 2;
            if (i12 == 0) {
                if ((i & 48) == 0) {
                    qim0Var2 = qim0Var;
                    i3 |= b0kVar3.i(qim0Var2) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    if ((i2 & 4) == 0) {
                        j3 = j;
                        if (b0kVar3.f(j3)) {
                            i11 = SemanticState.Hidden;
                        }
                        i3 |= i11;
                    } else {
                        j3 = j;
                    }
                    i11 = SemanticState.Focused;
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j4 = j2;
                        if (b0kVar3.f(j4)) {
                            i10 = SemanticState.Modal;
                        }
                        i3 |= i10;
                    } else {
                        j4 = j2;
                    }
                    i10 = SemanticState.ReadOnly;
                    i3 |= i10;
                } else {
                    j4 = j2;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        lee1Var2 = lee1Var;
                        if (b0kVar3.i(lee1Var2)) {
                            i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                        }
                        i3 |= i9;
                    } else {
                        lee1Var2 = lee1Var;
                    }
                    i9 = SemanticState.Multiline;
                    i3 |= i9;
                } else {
                    lee1Var2 = lee1Var;
                }
                i4 = i2 & 32;
                if (i4 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (b0kVar3.h(z2)) {
                            i5 = 131072;
                        } else {
                            i5 = 65536;
                        }
                        i3 |= i5;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z3)) {
                        b0kVar3.d0();
                        i6 = i & 1;
                        qim0Var4 = nim0.a;
                        if (i6 != 0 || b0kVar3.E()) {
                            if (i12 != 0) {
                                qim0Var2 = qim0Var4;
                            }
                            if ((i2 & 4) != 0) {
                                uwr uwrVar = cbx.a;
                                j3 = cbx.a(b0kVar3).b.a;
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                uwr uwrVar2 = cbx.a;
                                j4 = cbx.a(b0kVar3).b.a;
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                uwr uwrVar3 = cbx.a;
                                i3 &= -57345;
                                lee1Var2 = cbx.d(b0kVar3).n;
                            }
                            if (i4 != 0) {
                                lee1 lee1Var6 = lee1Var2;
                                i7 = i3;
                                lee1Var4 = lee1Var6;
                                z5 = true;
                            }
                            b0kVar3.s();
                            objT = b0kVar3.T();
                            if (objT == fkj0.X) {
                                objT = xuv0.O0;
                                b0kVar3.s0(objT);
                            }
                            qim0 qim0VarB = s161.b(qim0Var2, true, (iu30) objT);
                            jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                            lee1Var5 = lee1Var4;
                            iHashCode = Long.hashCode(((x340) b0kVar3).T);
                            xos0VarM = b0kVar3.m();
                            qim0VarE = zr7.E(b0kVar3, qim0VarB);
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
                            nko1.H(jw31VarA, b0kVar3, y580.O0);
                            nko1.H(xos0VarM, b0kVar3, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                            nko1.F(b0kVar3);
                            nko1.H(qim0VarE, b0kVar3, y580.Y);
                            if (z5) {
                                b0kVar3.i0(1588204380);
                                uwr uwrVar4 = cbx.a;
                                zov0 zov0Var = cbx.b(b0kVar3).g;
                                i8 = i7;
                                qim0Var5 = qim0Var4;
                                long j8 = j4;
                                z6 = true;
                                w0h1.a(wsx.c, isl.a, anm1.N("Icon", u291.r(qim0Var4, 16.0f)), j8, 0L, false, b0kVar3, wsx.d | 48 | (i7 & 7168), 48);
                                j7 = j8;
                                b0kVar2 = b0kVar3;
                                cvx cvxVar = cbx.b(b0kVar2).b;
                                ab80.p(qim0Var5, 4.0f, b0kVar2, false);
                            } else {
                                j7 = j4;
                                i8 = i7;
                                z6 = true;
                                b0kVar2 = b0kVar3;
                                qim0Var5 = qim0Var4;
                                b0kVar2.i0(1588576287);
                                b0kVar2.r(false);
                            }
                            long j9 = j3;
                            b0k b0kVar4 = b0kVar2;
                            uwo1.e(str, anm1.N("Text", qim0Var5), lee1Var5, j9, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, (i8 & 14) | ((i8 >> 6) & 896) | ((i8 << 3) & 7168), 0, 2032);
                            b0kVar3 = b0kVar4;
                            b0kVar3.r(z6);
                            z4 = z5;
                            qim0Var3 = qim0Var2;
                            lee1Var3 = lee1Var5;
                            j5 = j9;
                            j6 = j7;
                        } else {
                            b0kVar3.b0();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        lee1 lee1Var7 = lee1Var2;
                        i7 = i3;
                        lee1Var4 = lee1Var7;
                        z5 = z2;
                        b0kVar3.s();
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = xuv0.O0;
                            b0kVar3.s0(objT);
                        }
                        qim0 qim0VarB2 = s161.b(qim0Var2, true, (iu30) objT);
                        jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                        lee1Var5 = lee1Var4;
                        iHashCode = Long.hashCode(((x340) b0kVar3).T);
                        xos0VarM = b0kVar3.m();
                        qim0VarE = zr7.E(b0kVar3, qim0VarB2);
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
                        nko1.H(jw31VarA, b0kVar3, y580.O0);
                        nko1.H(xos0VarM, b0kVar3, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                        nko1.F(b0kVar3);
                        nko1.H(qim0VarE, b0kVar3, y580.Y);
                        if (z5) {
                            b0kVar3.i0(1588204380);
                            uwr uwrVar5 = cbx.a;
                            zov0 zov0Var2 = cbx.b(b0kVar3).g;
                            i8 = i7;
                            qim0Var5 = qim0Var4;
                            long j10 = j4;
                            z6 = true;
                            w0h1.a(wsx.c, isl.a, anm1.N("Icon", u291.r(qim0Var4, 16.0f)), j10, 0L, false, b0kVar3, wsx.d | 48 | (i7 & 7168), 48);
                            j7 = j10;
                            b0kVar2 = b0kVar3;
                            cvx cvxVar2 = cbx.b(b0kVar2).b;
                            ab80.p(qim0Var5, 4.0f, b0kVar2, false);
                        } else {
                            j7 = j4;
                            i8 = i7;
                            z6 = true;
                            b0kVar2 = b0kVar3;
                            qim0Var5 = qim0Var4;
                            b0kVar2.i0(1588576287);
                            b0kVar2.r(false);
                        }
                        long j11 = j3;
                        b0k b0kVar5 = b0kVar2;
                        uwo1.e(str, anm1.N("Text", qim0Var5), lee1Var5, j11, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, (i8 & 14) | ((i8 >> 6) & 896) | ((i8 << 3) & 7168), 0, 2032);
                        b0kVar3 = b0kVar5;
                        b0kVar3.r(z6);
                        z4 = z5;
                        qim0Var3 = qim0Var2;
                        lee1Var3 = lee1Var5;
                        j5 = j11;
                        j6 = j7;
                    } else {
                        b0kVar3.b0();
                        qim0Var3 = qim0Var2;
                        j5 = j3;
                        j6 = j4;
                        lee1Var3 = lee1Var2;
                        z4 = z2;
                    }
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jjx(str, qim0Var3, j5, j6, lee1Var3, z4, i, i2);
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i3 & 1, z3)) {
                    b0kVar3.d0();
                    i6 = i & 1;
                    qim0Var4 = nim0.a;
                    if (i6 != 0) {
                        if (i12 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if ((i2 & 4) != 0) {
                            uwr uwrVar6 = cbx.a;
                            j3 = cbx.a(b0kVar3).b.a;
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar7 = cbx.a;
                            j4 = cbx.a(b0kVar3).b.a;
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            uwr uwrVar8 = cbx.a;
                            i3 &= -57345;
                            lee1Var2 = cbx.d(b0kVar3).n;
                        }
                        if (i4 != 0) {
                            lee1 lee1Var8 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var8;
                            z5 = true;
                        } else {
                            lee1 lee1Var9 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var9;
                            z5 = z2;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if ((i2 & 4) != 0) {
                            uwr uwrVar9 = cbx.a;
                            j3 = cbx.a(b0kVar3).b.a;
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar10 = cbx.a;
                            j4 = cbx.a(b0kVar3).b.a;
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            uwr uwrVar11 = cbx.a;
                            i3 &= -57345;
                            lee1Var2 = cbx.d(b0kVar3).n;
                        }
                        if (i4 != 0) {
                            lee1 lee1Var10 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var10;
                            z5 = true;
                        } else {
                            lee1 lee1Var11 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var11;
                            z5 = z2;
                        }
                    }
                    b0kVar3.s();
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = xuv0.O0;
                        b0kVar3.s0(objT);
                    }
                    qim0 qim0VarB3 = s161.b(qim0Var2, true, (iu30) objT);
                    jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                    lee1Var5 = lee1Var4;
                    iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0VarM = b0kVar3.m();
                    qim0VarE = zr7.E(b0kVar3, qim0VarB3);
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
                    nko1.H(jw31VarA, b0kVar3, y580.O0);
                    nko1.H(xos0VarM, b0kVar3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                    nko1.F(b0kVar3);
                    nko1.H(qim0VarE, b0kVar3, y580.Y);
                    if (z5) {
                        b0kVar3.i0(1588204380);
                        uwr uwrVar12 = cbx.a;
                        zov0 zov0Var3 = cbx.b(b0kVar3).g;
                        i8 = i7;
                        qim0Var5 = qim0Var4;
                        long j12 = j4;
                        z6 = true;
                        w0h1.a(wsx.c, isl.a, anm1.N("Icon", u291.r(qim0Var4, 16.0f)), j12, 0L, false, b0kVar3, wsx.d | 48 | (i7 & 7168), 48);
                        j7 = j12;
                        b0kVar2 = b0kVar3;
                        cvx cvxVar3 = cbx.b(b0kVar2).b;
                        ab80.p(qim0Var5, 4.0f, b0kVar2, false);
                    } else {
                        j7 = j4;
                        i8 = i7;
                        z6 = true;
                        b0kVar2 = b0kVar3;
                        qim0Var5 = qim0Var4;
                        b0kVar2.i0(1588576287);
                        b0kVar2.r(false);
                    }
                    long j13 = j3;
                    b0k b0kVar6 = b0kVar2;
                    uwo1.e(str, anm1.N("Text", qim0Var5), lee1Var5, j13, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar6, (i8 & 14) | ((i8 >> 6) & 896) | ((i8 << 3) & 7168), 0, 2032);
                    b0kVar3 = b0kVar6;
                    b0kVar3.r(z6);
                    z4 = z5;
                    qim0Var3 = qim0Var2;
                    lee1Var3 = lee1Var5;
                    j5 = j13;
                    j6 = j7;
                } else {
                    b0kVar3.b0();
                    qim0Var3 = qim0Var2;
                    j5 = j3;
                    j6 = j4;
                    lee1Var3 = lee1Var2;
                    z4 = z2;
                }
                h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new jjx(str, qim0Var3, j5, j6, lee1Var3, z4, i, i2);
                }
            }
            i3 |= 48;
            qim0Var2 = qim0Var;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (b0kVar3.f(j3)) {
                        i11 = SemanticState.Hidden;
                    }
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                i11 = SemanticState.Focused;
                i3 |= i11;
            } else {
                j3 = j;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (b0kVar3.f(j4)) {
                        i10 = SemanticState.Modal;
                    }
                    i3 |= i10;
                } else {
                    j4 = j2;
                }
                i10 = SemanticState.ReadOnly;
                i3 |= i10;
            } else {
                j4 = j2;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    lee1Var2 = lee1Var;
                    if (b0kVar3.i(lee1Var2)) {
                        i9 = TlsSocketProvider.READ_BUFFER_SIZE;
                    }
                    i3 |= i9;
                } else {
                    lee1Var2 = lee1Var;
                }
                i9 = SemanticState.Multiline;
                i3 |= i9;
            } else {
                lee1Var2 = lee1Var;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (b0kVar3.h(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i3 & 1, z3)) {
                    b0kVar3.d0();
                    i6 = i & 1;
                    qim0Var4 = nim0.a;
                    if (i6 != 0) {
                        if (i12 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if ((i2 & 4) != 0) {
                            uwr uwrVar13 = cbx.a;
                            j3 = cbx.a(b0kVar3).b.a;
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar14 = cbx.a;
                            j4 = cbx.a(b0kVar3).b.a;
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            uwr uwrVar15 = cbx.a;
                            i3 &= -57345;
                            lee1Var2 = cbx.d(b0kVar3).n;
                        }
                        if (i4 != 0) {
                            lee1 lee1Var12 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var12;
                            z5 = true;
                        } else {
                            lee1 lee1Var13 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var13;
                            z5 = z2;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if ((i2 & 4) != 0) {
                            uwr uwrVar16 = cbx.a;
                            j3 = cbx.a(b0kVar3).b.a;
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar17 = cbx.a;
                            j4 = cbx.a(b0kVar3).b.a;
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            uwr uwrVar18 = cbx.a;
                            i3 &= -57345;
                            lee1Var2 = cbx.d(b0kVar3).n;
                        }
                        if (i4 != 0) {
                            lee1 lee1Var14 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var14;
                            z5 = true;
                        } else {
                            lee1 lee1Var15 = lee1Var2;
                            i7 = i3;
                            lee1Var4 = lee1Var15;
                            z5 = z2;
                        }
                    }
                    b0kVar3.s();
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = xuv0.O0;
                        b0kVar3.s0(objT);
                    }
                    qim0 qim0VarB4 = s161.b(qim0Var2, true, (iu30) objT);
                    jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                    lee1Var5 = lee1Var4;
                    iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0VarM = b0kVar3.m();
                    qim0VarE = zr7.E(b0kVar3, qim0VarB4);
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
                    nko1.H(jw31VarA, b0kVar3, y580.O0);
                    nko1.H(xos0VarM, b0kVar3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                    nko1.F(b0kVar3);
                    nko1.H(qim0VarE, b0kVar3, y580.Y);
                    if (z5) {
                        b0kVar3.i0(1588204380);
                        uwr uwrVar19 = cbx.a;
                        zov0 zov0Var4 = cbx.b(b0kVar3).g;
                        i8 = i7;
                        qim0Var5 = qim0Var4;
                        long j14 = j4;
                        z6 = true;
                        w0h1.a(wsx.c, isl.a, anm1.N("Icon", u291.r(qim0Var4, 16.0f)), j14, 0L, false, b0kVar3, wsx.d | 48 | (i7 & 7168), 48);
                        j7 = j14;
                        b0kVar2 = b0kVar3;
                        cvx cvxVar4 = cbx.b(b0kVar2).b;
                        ab80.p(qim0Var5, 4.0f, b0kVar2, false);
                    } else {
                        j7 = j4;
                        i8 = i7;
                        z6 = true;
                        b0kVar2 = b0kVar3;
                        qim0Var5 = qim0Var4;
                        b0kVar2.i0(1588576287);
                        b0kVar2.r(false);
                    }
                    long j15 = j3;
                    b0k b0kVar7 = b0kVar2;
                    uwo1.e(str, anm1.N("Text", qim0Var5), lee1Var5, j15, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar7, (i8 & 14) | ((i8 >> 6) & 896) | ((i8 << 3) & 7168), 0, 2032);
                    b0kVar3 = b0kVar7;
                    b0kVar3.r(z6);
                    z4 = z5;
                    qim0Var3 = qim0Var2;
                    lee1Var3 = lee1Var5;
                    j5 = j15;
                    j6 = j7;
                } else {
                    b0kVar3.b0();
                    qim0Var3 = qim0Var2;
                    j5 = j3;
                    j6 = j4;
                    lee1Var3 = lee1Var2;
                    z4 = z2;
                }
                h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new jjx(str, qim0Var3, j5, j6, lee1Var3, z4, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                b0kVar3.d0();
                i6 = i & 1;
                qim0Var4 = nim0.a;
                if (i6 != 0) {
                    if (i12 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 4) != 0) {
                        uwr uwrVar110 = cbx.a;
                        j3 = cbx.a(b0kVar3).b.a;
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar111 = cbx.a;
                        j4 = cbx.a(b0kVar3).b.a;
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar112 = cbx.a;
                        i3 &= -57345;
                        lee1Var2 = cbx.d(b0kVar3).n;
                    }
                    if (i4 != 0) {
                        lee1 lee1Var16 = lee1Var2;
                        i7 = i3;
                        lee1Var4 = lee1Var16;
                        z5 = true;
                    } else {
                        lee1 lee1Var17 = lee1Var2;
                        i7 = i3;
                        lee1Var4 = lee1Var17;
                        z5 = z2;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 4) != 0) {
                        uwr uwrVar113 = cbx.a;
                        j3 = cbx.a(b0kVar3).b.a;
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar114 = cbx.a;
                        j4 = cbx.a(b0kVar3).b.a;
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar115 = cbx.a;
                        i3 &= -57345;
                        lee1Var2 = cbx.d(b0kVar3).n;
                    }
                    if (i4 != 0) {
                        lee1 lee1Var18 = lee1Var2;
                        i7 = i3;
                        lee1Var4 = lee1Var18;
                        z5 = true;
                    } else {
                        lee1 lee1Var19 = lee1Var2;
                        i7 = i3;
                        lee1Var4 = lee1Var19;
                        z5 = z2;
                    }
                }
                b0kVar3.s();
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = xuv0.O0;
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB5 = s161.b(qim0Var2, true, (iu30) objT);
                jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                lee1Var5 = lee1Var4;
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarB5);
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
                nko1.H(jw31VarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                if (z5) {
                    b0kVar3.i0(1588204380);
                    uwr uwrVar116 = cbx.a;
                    zov0 zov0Var5 = cbx.b(b0kVar3).g;
                    i8 = i7;
                    qim0Var5 = qim0Var4;
                    long j16 = j4;
                    z6 = true;
                    w0h1.a(wsx.c, isl.a, anm1.N("Icon", u291.r(qim0Var4, 16.0f)), j16, 0L, false, b0kVar3, wsx.d | 48 | (i7 & 7168), 48);
                    j7 = j16;
                    b0kVar2 = b0kVar3;
                    cvx cvxVar5 = cbx.b(b0kVar2).b;
                    ab80.p(qim0Var5, 4.0f, b0kVar2, false);
                } else {
                    j7 = j4;
                    i8 = i7;
                    z6 = true;
                    b0kVar2 = b0kVar3;
                    qim0Var5 = qim0Var4;
                    b0kVar2.i0(1588576287);
                    b0kVar2.r(false);
                }
                long j17 = j3;
                b0k b0kVar8 = b0kVar2;
                uwo1.e(str, anm1.N("Text", qim0Var5), lee1Var5, j17, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar8, (i8 & 14) | ((i8 >> 6) & 896) | ((i8 << 3) & 7168), 0, 2032);
                b0kVar3 = b0kVar8;
                b0kVar3.r(z6);
                z4 = z5;
                qim0Var3 = qim0Var2;
                lee1Var3 = lee1Var5;
                j5 = j17;
                j6 = j7;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var2;
                j5 = j3;
                j6 = j4;
                lee1Var3 = lee1Var2;
                z4 = z2;
            }
            h311VarV = b0kVar3.v();
            if (h311VarV != null) {
                h311VarV.d = new jjx(str, qim0Var3, j5, j6, lee1Var3, z4, i, i2);
            }
        }

        public static final void t(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(480920368);
            int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                nyx.a(2, (wux) null, apo.r(-1773279421, new s721(str, function0), x340Var), x340Var, 3078, 6);
                qim0Var = nim0.a;
            } else {
                x340Var.b0();
            }
            qim0 qim0Var2 = qim0Var;
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 25);
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:107:0x0202  */
        /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:65:0x00bf A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:73:0x010b  */
        /* JADX WARN: Code duplicated, block: B:75:0x0118  */
        /* JADX WARN: Code duplicated, block: B:76:0x0126  */
        /* JADX WARN: Code duplicated, block: B:78:0x0131  */
        /* JADX WARN: Code duplicated, block: B:79:0x0141  */
        /* JADX WARN: Code duplicated, block: B:81:0x014f  */
        /* JADX WARN: Code duplicated, block: B:82:0x015d  */
        /* JADX WARN: Code duplicated, block: B:84:0x0168  */
        /* JADX WARN: Code duplicated, block: B:85:0x0178  */
        /* JADX WARN: Code duplicated, block: B:87:0x017f  */
        /* JADX WARN: Code duplicated, block: B:88:0x0181  */
        /* JADX WARN: Code duplicated, block: B:91:0x0186  */
        /* JADX WARN: Code duplicated, block: B:92:0x0188  */
        /* JADX WARN: Code duplicated, block: B:97:0x0194  */
        public static final void u(lfc lfcVar, aec aecVar, String str, String str2, hux huxVar, gbx gbxVar, qim0 qim0Var, yf yfVar, b0k b0kVar, int i, int i2) {
            int i3;
            yf yfVar2;
            boolean z;
            b0k b0kVar2;
            qim0 qim0Var2;
            yf yfVar3;
            h311 h311VarV;
            u5l1 u5l1Var;
            u5l1 u5l1Var2;
            mmr0 mmr0Var;
            lfc lfcVar2;
            aec aecVar2;
            aec aecVar3;
            lfc lfcVar3;
            lfc lfcVar4;
            yf idxVar;
            yf yfVar4;
            boolean z2;
            Object objT;
            vu30 vu30Var;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1283370394);
            if ((i & 6) == 0) {
                i3 = (b0kVar3.e(lfcVar.ordinal()) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= b0kVar3.e(aecVar.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= b0kVar3.g(str) ? SemanticState.Hidden : SemanticState.Focused;
            }
            if ((i & 3072) == 0) {
                i3 |= b0kVar3.g(str2) ? 2048 : SemanticState.ReadOnly;
            }
            if ((i & 24576) == 0) {
                i3 |= (32768 & i) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
            }
            if ((196608 & i) == 0) {
                i3 |= b0kVar3.g(gbxVar) ? 131072 : 65536;
            }
            int i4 = 1572864 | i3;
            int i5 = i2 & SemanticState.Focused;
            if (i5 == 0) {
                if ((12582912 & i) == 0) {
                    yfVar2 = yfVar;
                    i4 |= b0kVar3.g(yfVar2) ? 8388608 : 4194304;
                }
                if ((4793491 & i4) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i4 & 1, z)) {
                    if (i5 != 0) {
                        yfVar2 = null;
                    }
                    u5l1Var = u5l1.e;
                    u5l1Var2 = u5l1.d;
                    mmr0Var = new mmr0(lfcVar, aecVar);
                    lfcVar2 = lfc.a;
                    aecVar2 = aec.b;
                    if (mmr0Var.equals(new mmr0(lfcVar2, aecVar2))) {
                        idxVar = new hdx(6, u5l1Var, u5l1Var2, (vu30) null, (hw61) null, 24);
                    } else {
                        aecVar3 = aec.a;
                        if (mmr0Var.equals(new mmr0(lfcVar2, aecVar3))) {
                            idxVar = new hdx(1, u5l1Var, u5l1Var2, (vu30) null, (hw61) null, 24);
                        } else {
                            lfcVar3 = lfc.b;
                            if (mmr0Var.equals(new mmr0(lfcVar3, aecVar2))) {
                                idxVar = new hdx(1, u5l1Var, (vu30) null, u5l1Var, (hw61) null, 20);
                            } else if (mmr0Var.equals(new mmr0(lfcVar3, aecVar3))) {
                                idxVar = new hdx(6, u5l1Var, (vu30) null, u5l1Var, (hw61) null, 20);
                            } else {
                                lfcVar4 = lfc.c;
                                if (mmr0Var.equals(new mmr0(lfcVar4, aecVar2))) {
                                    idxVar = new hdx(1, u5l1Var, (vu30) null, (vu30) null, (hw61) null, 28);
                                } else if (mmr0Var.equals(new mmr0(lfcVar4, aecVar3))) {
                                    idxVar = new hdx(6, u5l1Var, (vu30) null, (vu30) null, (hw61) null, 28);
                                } else {
                                    idxVar = new idx();
                                }
                            }
                        }
                    }
                    if (yfVar2 == null) {
                        yfVar4 = idxVar;
                    } else {
                        yfVar4 = yfVar2;
                    }
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = b0kVar3.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new bek1(str2, (byte) 5);
                        b0kVar3.s0(objT);
                    }
                    qim0Var2 = nim0.a;
                    qim0 qim0VarB = s161.b(qim0Var2, true, (iu30) objT);
                    if (huxVar == null) {
                        b0kVar3.i0(912031553);
                        b0kVar3.r(false);
                        vu30Var = null;
                    } else {
                        b0kVar3.i0(912031554);
                        vu30 vu30VarR = apo.r(-967584174, new f90(huxVar, (byte) 18), b0kVar3);
                        b0kVar3.r(false);
                        vu30Var = vu30VarR;
                    }
                    b0kVar2 = b0kVar3;
                    foo1.c(gbxVar, yfVar4, qim0VarB, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, vu30Var, (vu30) null, apo.r(-1471536057, new avk1(str, (byte) 5), b0kVar3), b0kVar2, (i4 >> 15) & 14, 48, 1528);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var2 = qim0Var;
                }
                yfVar3 = yfVar2;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new s2l(lfcVar, aecVar, str, str2, huxVar, gbxVar, qim0Var2, yfVar3, i, i2);
                }
            }
            i4 = 14155776 | i3;
            yfVar2 = yfVar;
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    yfVar2 = null;
                }
                u5l1Var = u5l1.e;
                u5l1Var2 = u5l1.d;
                mmr0Var = new mmr0(lfcVar, aecVar);
                lfcVar2 = lfc.a;
                aecVar2 = aec.b;
                if (mmr0Var.equals(new mmr0(lfcVar2, aecVar2))) {
                    idxVar = new hdx(6, u5l1Var, u5l1Var2, (vu30) null, (hw61) null, 24);
                } else {
                    aecVar3 = aec.a;
                    if (mmr0Var.equals(new mmr0(lfcVar2, aecVar3))) {
                        idxVar = new hdx(1, u5l1Var, u5l1Var2, (vu30) null, (hw61) null, 24);
                    } else {
                        lfcVar3 = lfc.b;
                        if (mmr0Var.equals(new mmr0(lfcVar3, aecVar2))) {
                            idxVar = new hdx(1, u5l1Var, (vu30) null, u5l1Var, (hw61) null, 20);
                        } else if (mmr0Var.equals(new mmr0(lfcVar3, aecVar3))) {
                            idxVar = new hdx(6, u5l1Var, (vu30) null, u5l1Var, (hw61) null, 20);
                        } else {
                            lfcVar4 = lfc.c;
                            if (mmr0Var.equals(new mmr0(lfcVar4, aecVar2))) {
                                idxVar = new hdx(1, u5l1Var, (vu30) null, (vu30) null, (hw61) null, 28);
                            } else if (mmr0Var.equals(new mmr0(lfcVar4, aecVar3))) {
                                idxVar = new hdx(6, u5l1Var, (vu30) null, (vu30) null, (hw61) null, 28);
                            } else {
                                idxVar = new idx();
                            }
                        }
                    }
                }
                if (yfVar2 == null) {
                    yfVar4 = idxVar;
                } else {
                    yfVar4 = yfVar2;
                }
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new bek1(str2, (byte) 5);
                    b0kVar3.s0(objT);
                } else {
                    objT = new bek1(str2, (byte) 5);
                    b0kVar3.s0(objT);
                }
                qim0Var2 = nim0.a;
                qim0 qim0VarB2 = s161.b(qim0Var2, true, (iu30) objT);
                if (huxVar == null) {
                    b0kVar3.i0(912031553);
                    b0kVar3.r(false);
                    vu30Var = null;
                } else {
                    b0kVar3.i0(912031554);
                    vu30 vu30VarR2 = apo.r(-967584174, new f90(huxVar, (byte) 18), b0kVar3);
                    b0kVar3.r(false);
                    vu30Var = vu30VarR2;
                }
                b0kVar2 = b0kVar3;
                foo1.c(gbxVar, yfVar4, qim0VarB2, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, vu30Var, (vu30) null, apo.r(-1471536057, new avk1(str, (byte) 5), b0kVar3), b0kVar2, (i4 >> 15) & 14, 48, 1528);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            yfVar3 = yfVar2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new s2l(lfcVar, aecVar, str, str2, huxVar, gbxVar, qim0Var2, yfVar3, i, i2);
            }
        }

        public static final d9o v(mi7 mi7Var, mi7 mi7Var2, j6m j6mVar) {
            tsc1 tsc1Var;
            if (!(mi7Var2 instanceof li7)) {
                if (mi7Var2 instanceof ji7) {
                    tsc1Var = ((ji7) mi7Var2).b;
                }
                return null;
            }
            tsc1Var = ((li7) mi7Var2).b;
            if (((ahg1) kto1.u(tsc1Var.getRequest(), dz70.a)).a(b, tsc1Var) instanceof fao) {
                jmr0 jmr0VarA = mi7Var instanceof ki7 ? mi7Var.a() : null;
                jmr0 jmr0VarA2 = mi7Var2.a();
                ytw0 ytw0Var = jfv.b;
                return new d9o(jmr0VarA, jmr0VarA2, j6mVar, fdg1.k0(AdvertisementType.OTHER, ngv.d), ((tsc1Var instanceof tsc1) && tsc1Var.g) ? false : true);
            }
            return null;
        }

        public static final kl91 w(Next next) {
            return (kl91) next.g();
        }

        public static ksk0 x(String str, String str2) {
            return new ksk0(str, str2, (byte) 23);
        }

        public static final Next y(kl91 kl91Var, Set set) {
            return Next.i(kl91Var, set);
        }

        public static Next z(kl91 kl91Var) {
            return Next.i(kl91Var, w7x.a);
        }

        public String toString() {
            switch (this.a) {
                case 9:
                    return getClass().getSimpleName();
                default:
                    return super.toString();
            }
        }
    }
