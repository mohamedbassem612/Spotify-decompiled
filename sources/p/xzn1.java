package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xzn1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;

    public static final boolean A(y9e1 y9e1Var, int i) {
        zrm0 zrm0Var = y9e1Var.b;
        int iD = zrm0Var.d(i);
        return i == y9e1Var.i(iD) || i == zrm0Var.c(iD, false) ? y9e1Var.j(i) != y9e1Var.a(i) : y9e1Var.a(i) != y9e1Var.a(i - 1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    public static boolean B(String str) {
        boolean z;
        if (!((!nik1.l.a(str) && !u890.j(nik1.z1.a, str)) || nik1.m.a(str) || u890.j(nik1.z1.a, str)) || nik1.k.a(str)) {
            z = true;
        } else {
            kik1 kik1Var = nik1.o;
            if (kik1Var.a(str) || (kik1Var.a(str) && !nik1.n.a(str))) {
                z = true;
            } else {
                z = false;
            }
        }
        return !z;
    }

    public static final boolean C(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean D(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean E(int i) {
        int type;
        return (!D(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static TypedArray F(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void G(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final Object H(Map map, String str, iu30 iu30Var) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            bArrDecode.getClass();
            return iu30Var.invoke(bArrDecode);
        } catch (IllegalArgumentException e) {
            n57.t("PromptedWorldSectionDataSource: Error parsing proto field for key '" + str + "'", e);
            return null;
        } catch (InvalidProtocolBufferException e2) {
            n57.t("PromptedWorldSectionDataSource: Error parsing proto field for key '" + str + "'", e2);
            return null;
        }
    }

    public static final Next I(k0o0 k0o0Var) {
        boolean z = k0o0Var.a && !k0o0Var.e && u890.j(k0o0Var.f, ruf.a);
        List list = k0o0Var.d;
        if (!z) {
            return Next.h(k0o0Var);
        }
        cv21 cv21Var = (cv21) o7h.s0(list);
        if (cv21Var == null) {
            return Next.h(k0o0Var);
        }
        return Next.i(k0o0.a(k0o0Var, false, (Set) null, (LinkedHashSet) null, o7h.k0(list, 1), false, new suf(cv21Var.a), 23), Collections.singleton(new vzn0(cv21Var)));
    }

    public static final long J(int i, CharSequence charSequence) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!D(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (!D(iCodePointAt)) {
                break;
            }
            i += Character.charCount(iCodePointAt);
        }
        return e6p1.e(iCharCount, i);
    }

    public static final long K(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final p6r0 L(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_PARENTAL_CONTROL", "kid-account-creation/parental-control", 881, "kid-account-creation");
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_PARENTAL_CONTROL", "kid-account-transition/parental-control", 895, "kid-account-transition");
        }
        eg.o();
        return null;
    }

    public static final lik1 M(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.z3;
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            return nik1.M3;
        }
        eg.o();
        return null;
    }

    public static final void a(oid oidVar, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1097478408);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(oidVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
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
            Uri uri = Uri.parse(oidVar.d.a);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            as80 as80Var = mif1.P0;
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarD2, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 1772976, 0, 3472);
            x340Var = x340Var;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new rid(z, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, u291.d(nim0Var, 1.0f), (iu30) null, x340Var, 48, 4);
            eso1.g(cyo1.x(x340Var, 2131234003), islVar, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.V0, (tl3) null, (ColorFilter) null, x340Var, 1797552, 384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(oidVar, iu30Var, qim0Var, z, i);
        }
    }

    public static final void b(rib1 rib1Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1298352080);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rib1Var) : x340Var.i(rib1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            c380 c380VarA = mqo1.A(o7h.O0(rib1Var.a, rib1Var.b));
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1268519101);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                shx.a(c380VarA, anm1.N("faceStack", uyn1.x(nim0Var, 16.0f)), hcx.e, null, x340Var, 392, 56);
                x340Var.r(false);
            } else {
                x340Var.i0(-1268333721);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                fc11.a(c380VarA, anm1.N("facePile", uyn1.x(nim0Var, 16.0f)), hcx.d, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 504);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nib1(rib1Var, z, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(rib1 rib1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1651434246);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rib1Var) : x340Var.i(rib1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = rib1Var.b.size() > 1;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = (i2 & 14) | 8;
            b(rib1Var, z, x340Var, i3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            h(rib1Var, z, x340Var, i3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            g(rib1Var, z, x340Var, i3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(rib1Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    public static final void d(c380 c380Var, b851 b851Var, iu30 iu30Var, cnc0 cnc0Var, int i, boolean z, y751 y751Var, qim0 qim0Var, xb51 xb51Var, boolean z2, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        x340 x340Var;
        ?? r12;
        ven0 ven0VarH;
        ven0 ven0VarH2;
        Object obj;
        x340 x340Var2;
        xtb0 xtb0Var;
        boolean z3;
        qim0 qim0VarE;
        ven0 ven0Var;
        Object vvu0Var;
        int i6;
        boolean z4;
        Object obj2 = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(692088081);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var3.g(c380Var) : x340Var3.i(c380Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var3.g(b851Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var3.i(iu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var3.i(cnc0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var3.i((Object) null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var3.g((Object) null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= x340Var3.i((Object) null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= x340Var3.e(l1d.C(i)) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= x340Var3.h(z) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= x340Var3.i(y751Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (x340Var3.i(qim0Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var3.g(xb51Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var3.h(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var3.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= x340Var3.i(iu30Var3) ? 16384 : 8192;
        }
        int i7 = i4;
        if (x340Var3.Y(i7 & 1, ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var3);
            Object objT = x340Var3.T();
            if (objT == obj2) {
                objT = new r9y0(ven0VarS, (byte) 14);
                x340Var3.s0(objT);
            }
            iu30 iu30Var4 = (iu30) objT;
            xe01 xe01Var = y751Var != null ? y751Var.b : null;
            if (xe01Var == null) {
                x340Var3.i0(-2140922944);
                r12 = 0;
                x340Var3.r(false);
                ven0VarH = null;
            } else {
                r12 = 0;
                x340Var3.i0(-623251359);
                ven0VarH = rwq.h(xe01Var, x340Var3, 0);
                x340Var3.r(false);
            }
            xe01 xe01Var2 = y751Var != null ? y751Var.d : null;
            if (xe01Var2 == null) {
                x340Var3.i0(-2140839616);
                x340Var3.r((boolean) r12);
                ven0VarH2 = null;
            } else {
                x340Var3.i0(-623248671);
                ven0VarH2 = rwq.h(xe01Var2, x340Var3, r12);
                x340Var3.r((boolean) r12);
            }
            xtb0 xtb0VarA = aub0.a((int) r12, x340Var3, 3);
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, cnc0Var, null, x340Var3, 4);
            ven0 ven0VarH3 = rwq.h(q1d0VarN.b, x340Var3, 0);
            int i8 = i7 & 14;
            boolean z5 = ((i5 & 112) == 32) | (i8 == 4 || ((i7 & 8) != 0 && x340Var3.g(c380Var)));
            Object objT2 = x340Var3.T();
            if (z5 || objT2 == obj2) {
                objT2 = Integer.valueOf(((rnc0) ven0VarH3.getValue()).a);
                x340Var3.s0(objT2);
            }
            int iIntValue = ((Number) objT2).intValue();
            boolean z6 = i8 == 4 || ((i7 & 8) != 0 && x340Var3.g(c380Var));
            Object objT3 = x340Var3.T();
            if (z6 || objT3 == obj2) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pd51) it.next()).getId());
                }
                x340Var3.s0(arrayList);
                obj = arrayList;
            } else {
                obj = objT3;
            }
            List list = (List) obj;
            boolean zG = x340Var3.g(((rnc0) ven0VarH3.getValue()).b);
            Object objT4 = x340Var3.T();
            Object obj3 = objT4;
            if (zG || objT4 == obj2) {
                List list2 = ((rnc0) ven0VarH3.getValue()).b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h8k1) it2.next()).b.toString());
                }
                x340Var3.s0(arrayList2);
                obj3 = arrayList2;
            }
            List list3 = (List) obj3;
            x340Var3.i0(-2139893743);
            x340Var3.r(false);
            Object objT5 = x340Var3.T();
            if (objT5 == obj2) {
                objT5 = new wg31(iu30Var4, (byte) 15);
                x340Var3.s0(objT5);
            }
            w0o1.f(xtb0VarA, b851Var, (Function0) objT5, x340Var3, (i7 & 112) | 384);
            hqn1.i(xtb0VarA, iu30Var4, x340Var3, 48);
            if (z) {
                x340Var3.i0(-2139617874);
                vgo1.f((tl7) x340Var3.k(rce0.a), xtb0VarA, false, x340Var3, 0, 4);
                xtb0Var = xtb0VarA;
                x340Var2 = x340Var3;
                z3 = false;
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                xtb0Var = xtb0VarA;
                z3 = false;
                x340Var2.i0(-2139522735);
                x340Var2.r(false);
            }
            qim0 qim0VarN = anm1.N("search_results_list", qim0Var);
            qim0 qim0Var2 = nim0.a;
            if (z) {
                x340Var2.i0(-623200569);
                qim0VarE = x2g0.E(x340Var2, qim0Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-623199687);
                x340Var2.r(z3);
                qim0VarE = qim0Var2;
            }
            qim0 qim0VarL = bmq0.L(qim0VarN.then(qim0VarE), k1o1.q(x340Var2), (g6o0) null);
            x340Var2.i0(-2138840177);
            x340Var2.r(false);
            qim0 qim0VarThen = qim0VarL.then(qim0Var2);
            boolean zI = x340Var2.i(xtb0Var) | x340Var2.i(ven0VarH) | x340Var2.i(ven0VarH2) | ((i5 & 896) == 256) | x340Var2.i(ven0VarH3) | x340Var2.e(iIntValue) | ((i7 & 29360128) == 8388608) | x340Var2.g(list) | x340Var2.g(list3);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == obj2) {
                objT6 = new e551(xtb0Var, ven0VarH, ven0VarH2, z2, iIntValue, i, list, list3, ven0VarH3);
                ven0Var = ven0VarH3;
                x340Var2.s0(objT6);
            } else {
                ven0Var = ven0VarH3;
            }
            Function0 function0 = (Function0) objT6;
            boolean zI2 = x340Var2.i(xtb0Var) | x340Var2.i(ven0Var) | x340Var2.i(y751Var) | ((57344 & i5) == 16384);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == obj2) {
                i6 = 32;
                z4 = false;
                vvu0Var = new vvu0(xtb0Var, y751Var, iu30Var3, ven0Var, (byte) 28);
                x340Var2.s0(vvu0Var);
            } else {
                vvu0Var = objT7;
                i6 = 32;
                z4 = false;
            }
            qim0 qim0VarI = zr7.i(qim0VarThen, new kj21(xb51Var, iu30Var2, function0, (iu30) vvu0Var, (byte) 5));
            u85 u85Var = (erl1) x340Var2.k(szf0.b);
            if (u85Var == null) {
                x340Var2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var2).g;
            } else {
                x340Var2.i0(-241885792);
            }
            x340Var2.r(z4);
            vk80 vk80VarX = poo1.x(new bgc0(u85Var, i6), x340Var2);
            boolean zI3 = x340Var2.i(q1d0VarN);
            Object objT8 = x340Var2.T();
            if (zI3 || objT8 == obj2) {
                objT8 = new xo8(q1d0VarN, (byte) 7);
                x340Var2.s0(objT8);
            }
            x340 x340Var4 = x340Var2;
            s3o1.d(qim0VarI, xtb0Var, vk80VarX, null, null, null, false, null, (iu30) objT8, x340Var4, 0, 504);
            x340Var = x340Var4;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f551(c380Var, b851Var, iu30Var, cnc0Var, i, z, y751Var, qim0Var, xb51Var, z2, iu30Var2, iu30Var3, i2, i3);
        }
    }

    public static final void e(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(398397588);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            gfx.b(13, apo.r(-972582391, new qgd(cwl1.o0(x340Var, 2131956805), iu30Var, (byte) 13), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var, i, (byte) 12);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(rib1 rib1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1709387067);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(rib1Var) : x340Var.i(rib1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            c(rib1Var, x340Var, (i3 & 14) | 8);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            e((i3 >> 3) & 14, x340Var, iu30Var, null);
            x0d.s(qim0Var3, cbx.b(x340Var).b.c, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(rib1Var, iu30Var, qim0Var2, i, (byte) 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(rib1 rib1Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strK;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(253791737);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rib1Var) : x340Var.i(rib1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = rib1Var.c;
            if (z2) {
                x340Var.i0(1567318211);
                phx phxVar = (phx) o7h.s0(rib1Var.b);
                if (phxVar == null || (str = phxVar.c) == null) {
                    str = "";
                }
                if (z) {
                    strK = x0d.k(x340Var, 1567413784, 2131956790, x340Var, false);
                } else {
                    x340Var.i0(1567500553);
                    strK = cwl1.n0(2131956806, new Object[]{str}, x340Var);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                if (z2) {
                    throw p3d1.k(x340Var, -919273933, false);
                }
                strK = x0d.k(x340Var, 1567619159, 2131962915, x340Var, false);
            }
            qim0 qim0VarN = anm1.N("subtitle", nim0.a);
            uwr uwrVar = cbx.a;
            uwo1.e(strK, qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nib1(rib1Var, z, i, (byte) 1);
        }
    }

    public static final void h(rib1 rib1Var, boolean z, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        byte b2;
        String str;
        int i3;
        String strN0;
        int i4;
        boolean z2 = rib1Var.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1573926531);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(rib1Var) : b0kVar3.i(rib1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                b0kVar3.i0(687400244);
                if (z2) {
                    i4 = 2131956791;
                } else {
                    if (z2) {
                        eg.o();
                        return;
                    }
                    i4 = 2131962914;
                }
                strN0 = cwl1.o0(b0kVar3, i4);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(687641982);
                phx phxVar = (phx) o7h.s0(rib1Var.b);
                if (phxVar == null || (str = phxVar.c) == null) {
                    str = "";
                }
                if (z2) {
                    i3 = 2131956807;
                } else {
                    if (z2) {
                        eg.o();
                        return;
                    }
                    i3 = 2131962916;
                }
                strN0 = cwl1.n0(i3, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            String str2 = strN0;
            b2 = 2;
            b0kVar2 = b0kVar3;
            uwo1.e(str2, anm1.N("title", uyn1.z(16.0f, 0.0f, 2, qim0VarF)), cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
        } else {
            b0kVar2 = b0kVar3;
            b2 = 2;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nib1(rib1Var, z, i, b2);
        }
    }

    public static final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i7n1 i7n1Var = (i7n1) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", i7n1Var.a);
            bundle.putLong("event_timestamp", i7n1Var.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final long j(long j, CharSequence charSequence) {
        int i = nbe1.c;
        int iCharCount = (int) (j >> 32);
        int iCharCount2 = (int) (4294967295L & j);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (E(iCodePointBefore) && (D(iCodePointAt) || C(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (E(iCodePointBefore));
            return e6p1.e(iCharCount, iCharCount2);
        }
        if (!E(iCodePointAt)) {
            return j;
        }
        if (!D(iCodePointBefore) && !C(iCodePointBefore)) {
            return j;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (E(iCodePointAt));
        return e6p1.e(iCharCount, iCharCount2);
    }

    public static final void k(int i, ArrayList arrayList) {
        arrayList.add(new i7n1(i, System.currentTimeMillis()));
    }

    public static final boolean l(String str) {
        return !nhc1.Y(str, "spotify:watch-feed:", false) || str.equals("spotify:watch-feed:the-drop-weekly") || str.equals("spotify:watch-feed:new-music-friday");
    }

    public static final ujm m(CosmosTransport cosmosTransport) {
        return new ujm(cosmosTransport);
    }

    public static final int n(zrm0 zrm0Var, long j, e8k1 e8k1Var) {
        float fH = e8k1Var != null ? e8k1Var.h() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = zrm0Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < zrm0Var.f(iE) - fH || Float.intBitsToFloat(i) > zrm0Var.b(iE) + fH) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fH) || Float.intBitsToFloat(i2) > zrm0Var.d + fH) {
            return -1;
        }
        return iE;
    }

    public static boolean o(TypedArray typedArray, XmlPullParser xmlPullParser, boolean z) {
        return !z(xmlPullParser, "autoMirrored") ? z : typedArray.getBoolean(5, z);
    }

    public static ColorStateList p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (z(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i == 2) {
                t8e1.o(typedValue, "Failed to resolve attribute at index 1: ");
            } else {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = lah.a;
                try {
                    return lah.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static mgc q(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        mgc mgcVarI;
        if (z(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new mgc((Object) null, (Object) null, typedValue.data, (byte) 12);
            }
            try {
                mgcVarI = mgc.i(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                mgcVarI = null;
            }
            if (mgcVarI != null) {
                return mgcVarI;
            }
        }
        return new mgc((Object) null, (Object) null, 0, (byte) 12);
    }

    public static float r(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !z(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int s(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !z(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static final int t(zrm0 zrm0Var, long j, elb0 elb0Var, e8k1 e8k1Var) {
        long jL;
        int iN;
        if (elb0Var == null || (iN = n(zrm0Var, (jL = elb0Var.l(j)), e8k1Var)) == -1) {
            return -1;
        }
        return zrm0Var.g(Offset.a(jL, 1, 0.0f, (zrm0Var.b(iN) + zrm0Var.f(iN)) / 2.0f));
    }

    public static final long u(y9e1 y9e1Var, long j, long j2, elb0 elb0Var, e8k1 e8k1Var) {
        if (y9e1Var != null) {
            zrm0 zrm0Var = y9e1Var.b;
            if (elb0Var != null) {
                long jL = elb0Var.l(j);
                long jL2 = elb0Var.l(j2);
                int iN = n(zrm0Var, jL, e8k1Var);
                int iN2 = n(zrm0Var, jL2, e8k1Var);
                if (iN != -1) {
                    if (iN2 != -1) {
                        iN = Math.min(iN, iN2);
                    }
                    iN2 = iN;
                } else if (iN2 == -1) {
                    return nbe1.b;
                }
                float fB = (zrm0Var.b(iN2) + zrm0Var.f(iN2)) / 2.0f;
                int i = (int) (jL >> 32);
                int i2 = (int) (jL2 >> 32);
                return zrm0Var.h(new n511(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fB - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fB + 0.1f), 0, r5x0.S0);
            }
        }
        return nbe1.b;
    }

    public static final long v(r1c0 r1c0Var, n511 n511Var, int i) {
        z9e1 z9e1VarD = r1c0Var.d();
        zrm0 zrm0Var = z9e1VarD != null ? z9e1VarD.a.b : null;
        elb0 elb0VarC = r1c0Var.c();
        return (zrm0Var == null || elb0VarC == null) ? nbe1.b : zrm0Var.h(n511Var.n(elb0VarC.l(0L)), i, r5x0.T0);
    }

    public static final long w(aae1 aae1Var, n511 n511Var, int i) {
        y9e1 y9e1VarC = aae1Var.c();
        zrm0 zrm0Var = y9e1VarC != null ? y9e1VarC.b : null;
        elb0 elb0VarE = aae1Var.e();
        return (zrm0Var == null || elb0VarE == null) ? nbe1.b : zrm0Var.h(n511Var.n(elb0VarE.l(0L)), i, r5x0.T0);
    }

    public static final long x(r1c0 r1c0Var, n511 n511Var, n511 n511Var2, int i) {
        long jV = v(r1c0Var, n511Var, i);
        if (nbe1.d(jV)) {
            return nbe1.b;
        }
        long jV2 = v(r1c0Var, n511Var2, i);
        if (nbe1.d(jV2)) {
            return nbe1.b;
        }
        int i2 = (int) (jV >> 32);
        int i3 = (int) (jV2 & 4294967295L);
        return e6p1.e(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long y(aae1 aae1Var, n511 n511Var, n511 n511Var2, int i) {
        long jW = w(aae1Var, n511Var, i);
        if (nbe1.d(jW)) {
            return nbe1.b;
        }
        long jW2 = w(aae1Var, n511Var2, i);
        if (nbe1.d(jW2)) {
            return nbe1.b;
        }
        int i2 = (int) (jW >> 32);
        int i3 = (int) (jW2 & 4294967295L);
        return e6p1.e(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
