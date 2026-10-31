package p;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.Window;
import androidx.car.app.model.Action;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabContents;
import androidx.car.app.model.TabStyle;
import androidx.car.app.model.TabTemplate;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ryo1 {
    public static b180 a;
    public static b180 b;

    public static final String A(b8e0 b8e0Var) {
        return rc11.a.b(b8e0Var.getClass()).r() + "(count=" + b8e0Var.getCount() + ", range=" + b8e0Var.a() + ", items=" + b8e0Var.getItems().size() + ", filters=" + b8e0Var.getFilters() + ", isLoading=" + b8e0Var.b() + ", maxPinnedItems=" + b8e0Var.h() + ")";
    }

    public static final TabTemplate B(boolean z, String str, SectionedItemTemplate sectionedItemTemplate, ArrayList arrayList, TabStyle tabStyle, iu30 iu30Var) {
        String str2;
        vjd1 vjd1Var = new vjd1(new ahs(iu30Var, (byte) 7));
        vjd1Var.b = z;
        if (!z) {
            Action action = Action.APP_ICON;
            v90 v90Var = v90.p;
            Objects.requireNonNull(action);
            v90Var.a(Collections.singletonList(action));
            vjd1Var.c = action;
            sectionedItemTemplate.getClass();
            jfd1 jfd1Var = new jfd1();
            if (!lfd1.b.a.contains(SectionedItemTemplate.class)) {
                hhg1.n("Type is not allowed in tabs: SectionedItemTemplate");
                return null;
            }
            jfd1Var.a = sectionedItemTemplate;
            vjd1Var.f = new TabContents(jfd1Var);
            if (tabStyle != null) {
                vjd1Var.h = tabStyle;
            }
            if (str != null) {
                if (str.isEmpty()) {
                    hhg1.n("The content ID cannot be null or empty");
                    return null;
                }
                vjd1Var.g = str;
            }
        }
        ArrayList<Tab> arrayList2 = vjd1Var.d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Tab tab = (Tab) it.next();
                Objects.requireNonNull(tab);
                arrayList2.add(tab);
            }
        }
        boolean z2 = false;
        boolean z3 = (vjd1Var.f == null || arrayList2.isEmpty()) ? false : true;
        boolean z4 = vjd1Var.b;
        if (z4 && z3) {
            eg.m("Template is in a loading state but tabs are added");
            return null;
        }
        if (!z4 && !z3) {
            eg.m("Template is not in a loading state but does not contain tabs or tab contents");
            return null;
        }
        if (z3 && vjd1Var.g == null) {
            eg.m("Template requires setting content ID for the active tab when not in Loading state");
            return null;
        }
        if (z3 && (str2 = vjd1Var.g) != null) {
            zmd1 zmd1Var = zmd1.c;
            int i = zmd1Var.a;
            int size = arrayList2.size();
            byte b2 = zmd1Var.b;
            if (size < b2) {
                StringBuilder sbR = cy30.r(b2, "There must be at least ", " tab(s) added, but only found ");
                sbR.append(arrayList2.size());
                throw new IllegalArgumentException(sbR.toString());
            }
            if (arrayList2.size() > i) {
                StringBuilder sbR2 = cy30.r(i, "There cannot be more than ", " tabs added, found ");
                sbR2.append(arrayList2.size());
                throw new IllegalArgumentException(sbR2.toString());
            }
            HashSet hashSet = new HashSet();
            for (Tab tab2 : arrayList2) {
                if (str2.equals(tab2.getContentId())) {
                    z2 = true;
                }
                if (!hashSet.add(tab2.getContentId())) {
                    mna0.e("Found duplicate tab ID: ", tab2.getContentId(), ". Each tab must have a unique ID.");
                    return null;
                }
            }
            if (!z2) {
                hhg1.n("There is no tab with content ID matching the active tab content ID set on the template");
                return null;
            }
        }
        if (vjd1Var.b || vjd1Var.c != null) {
            return new TabTemplate(vjd1Var);
        }
        hhg1.n("Template requires a Header Action of TYPE_APP_ICON when not in Loading state");
        return null;
    }

    public static final Spanned C(List list, boolean z) {
        String str = z ? "• " : "";
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(Html.fromHtml(str + ((String) obj) + (i < list.size() + (-1) ? "<br>" : ""), 0));
            i = i2;
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                hhg1.h("Empty collection can't be reduced.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = new SpannableStringBuilder((Spanned) next).append((CharSequence) it.next());
            }
            Spanned spanned = (Spanned) next;
            if (spanned != null) {
                return spanned;
            }
        }
        return new SpannableStringBuilder("");
    }

    public static final SpannableString D(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 17);
        return spannableString;
    }

    public static void E(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            F(parcel, (Parcelable) list.get(i));
        }
    }

    public static void F(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2127223269);
        byte b2 = 4;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jdx jdxVar = jdx.c;
            gbx gbxVar = new gbx(z50.c, function0);
            gdx gdxVarS = yla.s(x340Var);
            j2i j2iVarR = apo.r(-1467522564, new nl(str, b2), x340Var);
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, jdxVar, qim0Var3, null, gdxVarS, null, null, null, null, null, j2iVarR, x340Var, 432, 48, 2008);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 1);
        }
    }

    public static final void b(String str, ng20 ng20Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ng20 ng20Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1572581455);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ng20Var2 = ng20Var;
            i2 |= x340Var.i(ng20Var2) ? 32 : 16;
        } else {
            ng20Var2 = ng20Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("venue_header_action_row", qim0Var);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            otw.c(ng20Var2, new o330(str), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
            qim0 qim0VarN2 = anm1.N("venue_header_action_row_share_button", nim0.a);
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            String strO0 = cwl1.o0(x340Var, 2131963704);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new are(iu30Var, str, (byte) 16);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), ldx.c, qim0VarN2, null, yla.s(x340Var), zzq0Var, null, null, null, null, xpj.a, x340Var, 0, 48, 1944);
                x340Var = x340Var;
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, str, ng20Var, iu30Var, qim0Var, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(qn8 qn8Var, iu30 iu30Var, qim0 qim0Var, yqg yqgVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1856377982);
        int i2 = i | (b0kVar3.g(qn8Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.g(yqgVar) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 3, zzq0Var, (zzq0) null, tvx.a(tvxVarB, 2.0f, 6), (hw61) null, 1, (p3v) null, 339);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new sn8(iu30Var, yqgVar, (byte) 0);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0("TODO")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50("TODO"), function0);
            j2i j2iVarR2 = apo.r(-177798855, new tn8(qn8Var, (byte) 0), b0kVar3);
            j2i j2iVarR3 = apo.r(267571898, new tn8(qn8Var, (byte) 1), b0kVar3);
            if (qn8Var.e) {
                b0kVar3.i0(-1356063551);
                j2iVarR = apo.r(-1363533248, new ef8(qn8Var, iu30Var, (byte) 1), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1355777979);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            j2i j2iVar = j2iVarR;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, null, false, null, null, gbxVar, null, null, j2iVarR2, null, j2iVarR3, j2iVar, null, null, apo.r(251573950, new tn8(qn8Var, (byte) 2), b0kVar3), b0kVar2, 805306432, 196656, 26044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6((Object) qn8Var, iu30Var, (Object) qim0Var2, (Object) yqgVar, i, (byte) 17);
        }
    }

    public static final void d(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1122972231);
        int i2 = (x340Var.h(true) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x8c0 lifecycle = ((iac0) x340Var.k(jfe0.a)).getLifecycle();
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Boolean bool = Boolean.TRUE;
            boolean zG = ((i2 & 14) == 4) | x340Var.g(ven0VarS) | x340Var.i(lifecycle);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new he3(lifecycle, ven0VarS, (byte) 2);
                x340Var.s0(objT);
            }
            qxd0.h(bool, lifecycle, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iuy0(iu30Var, i, (byte) 13);
        }
    }

    public static final void e(String str, String str2, int i, lee1 lee1Var, lee1 lee1Var2, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        lee1 lee1Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1209254392);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.g(lee1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            lee1Var3 = lee1Var2;
            i3 |= x340Var.g(lee1Var3) ? 16384 : 8192;
        } else {
            lee1Var3 = lee1Var2;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.g(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                lxl lxlVar = new lxl(i, str, lee1Var, str2, lee1Var3);
                x340Var.s0(lxlVar);
                objT = lxlVar;
            }
            ejo1.l((i3 >> 15) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(str, str2, i, lee1Var, lee1Var2, qim0Var, i2);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1824828234);
        int i2 = (x340Var.h(true) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objK = x340Var.k(AndroidCompositionLocals_androidKt.b);
            Activity activity = objK instanceof Activity ? (Activity) objK : null;
            Window window = activity != null ? activity.getWindow() : null;
            Boolean bool = Boolean.TRUE;
            boolean zI = x340Var.i(window) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ql9(window, (byte) 1);
                x340Var.s0(objT);
            }
            qxd0.h(bool, window, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 19);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0168  */
    /* JADX WARN: Code duplicated, block: B:77:0x0187  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0211  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:90:0x0220  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void g(int i, int i2, int i3, int i4, String str, String str2, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        int i5;
        qim0 qim0Var2;
        int i6;
        int iC;
        int i7;
        boolean z;
        qim0 qim0Var3;
        int i8;
        h311 h311VarV;
        qim0 qim0Var4;
        int i9;
        int iC2;
        lee1 lee1VarA;
        int iC3;
        lee1 lee1VarA2;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-104538870);
        if ((i3 & 6) == 0) {
            i5 = (x340Var.g(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var.e(l1d.C(i)) ? 256 : 128;
        }
        int i10 = i4 & 8;
        if (i10 == 0) {
            if ((i3 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var.g(qim0Var2) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                if (i2 == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i2);
                }
                if (x340Var.e(iC)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i10 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i6 != 0) {
                    i9 = 1;
                } else {
                    i9 = i2;
                }
                iC2 = l1d.C(i9);
                if (iC2 != 0) {
                    x340Var.i0(-1677597897);
                    uwr uwrVar = cbx.a;
                    lee1VarA = cbx.d(x340Var).k;
                    x340Var.r(false);
                } else {
                    if (iC2 == 1) {
                        throw p3d1.k(x340Var, -1677600038, false);
                    }
                    x340Var.i0(-1677595456);
                    uwr uwrVar2 = cbx.a;
                    lee1VarA = lee1.a(cbx.d(x340Var).n, 0L, fc11.G(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                    x340Var.r(false);
                }
                iC3 = l1d.C(i9);
                if (iC3 != 0) {
                    x340Var.i0(-1677591405);
                    lee1VarA2 = cbx.d(x340Var).j;
                    x340Var.r(false);
                } else {
                    if (iC3 == 1) {
                        throw p3d1.k(x340Var, -1677593550, false);
                    }
                    x340Var.i0(-1677589216);
                    lee1VarA2 = lee1.a(cbx.d(x340Var).m, 0L, fc11.G(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                    x340Var.r(false);
                }
                if (str2.length() > 0) {
                    x340Var.i0(-465593724);
                    e(str, str2, v8i0.b(i), lee1VarA, lee1VarA2, qim0Var2, x340Var, (i5 & 126) | ((i5 << 6) & 458752));
                    x340Var.r(false);
                    i2 = i9;
                } else {
                    x340Var.i0(-465375267);
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var2);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    i2 = i9;
                    uwo1.e(str, anm1.N("share.card.title", qim0Var4), lee1VarA, 0L, null, null, 2, false, new cjc0(v8i0.b(i)), 0, null, x340Var, (i5 & 14) | 1572912, 0, 1720);
                    x340Var = x340Var;
                    x340Var.r(true);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            i8 = i2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qkj0(i, i8, i3, i4, str, str2, qim0Var3);
            }
        }
        i5 |= 3072;
        qim0Var2 = qim0Var;
        i6 = i4 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (i2 == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i2);
            }
            if (x340Var.e(iC)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i5 |= i7;
        }
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i10 != 0) {
                qim0Var2 = qim0Var4;
            }
            if (i6 != 0) {
                i9 = 1;
            } else {
                i9 = i2;
            }
            iC2 = l1d.C(i9);
            if (iC2 != 0) {
                x340Var.i0(-1677597897);
                uwr uwrVar3 = cbx.a;
                lee1VarA = cbx.d(x340Var).k;
                x340Var.r(false);
            } else {
                if (iC2 == 1) {
                    throw p3d1.k(x340Var, -1677600038, false);
                }
                x340Var.i0(-1677595456);
                uwr uwrVar4 = cbx.a;
                lee1VarA = lee1.a(cbx.d(x340Var).n, 0L, fc11.G(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                x340Var.r(false);
            }
            iC3 = l1d.C(i9);
            if (iC3 != 0) {
                x340Var.i0(-1677591405);
                lee1VarA2 = cbx.d(x340Var).j;
                x340Var.r(false);
            } else {
                if (iC3 == 1) {
                    throw p3d1.k(x340Var, -1677593550, false);
                }
                x340Var.i0(-1677589216);
                lee1VarA2 = lee1.a(cbx.d(x340Var).m, 0L, fc11.G(11), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                x340Var.r(false);
            }
            if (str2.length() > 0) {
                x340Var.i0(-465593724);
                e(str, str2, v8i0.b(i), lee1VarA, lee1VarA2, qim0Var2, x340Var, (i5 & 126) | ((i5 << 6) & 458752));
                x340Var.r(false);
                i2 = i9;
            } else {
                x340Var.i0(-465375267);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var2);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                i2 = i9;
                uwo1.e(str, anm1.N("share.card.title", qim0Var4), lee1VarA, 0L, null, null, 2, false, new cjc0(v8i0.b(i)), 0, null, x340Var, (i5 & 14) | 1572912, 0, 1720);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        qim0Var3 = qim0Var2;
        i8 = i2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qkj0(i, i8, i3, i4, str, str2, qim0Var3);
        }
    }

    public static final void h(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(790527681);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                hrr0 hrr0Var = new hrr0((Object) null, f331.X0);
                x340Var.s0(hrr0Var);
                objT = hrr0Var;
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new e45(ven0Var, (byte) 10);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            nfv0 nfv0Var = fus.a;
            gea geaVarG = w6p1.g(6, v8r.b, x340Var);
            j2iVar2 = j2iVar;
            qim0Var2 = qim0Var;
            mod.c(new ely0[]{p3e1.b.a(hon1.y(function0, x340Var, 2)), p3e1.a.a(geaVarG)}, apo.r(1070596993, new uxb(qim0Var2, ven0Var, j2iVar2, geaVarG, function0), x340Var), x340Var, 56);
        } else {
            j2iVar2 = j2iVar;
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f45((byte) 4, i, j2iVar2, qim0Var2);
        }
    }

    public static final void i(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(155925518);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = x340Var.k(p3e1.a) != null;
            boolean z2 = x340Var.k(p3e1.b) != null;
            if (z && z2) {
                x340Var.i0(-1977187922);
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
                k4s0.i((i2 >> 3) & 14, j2iVar, x340Var, true, false);
            } else if (z) {
                x340Var.i0(-1976997706);
                hon1.f(i2 & 126, j2iVar, x340Var, qim0Var);
                x340Var.r(false);
            } else if (z2) {
                x340Var.i0(-1976846922);
                fus.d(i2 & 126, j2iVar, x340Var, qim0Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1976716505);
                h(i2 & 126, j2iVar, x340Var, qim0Var);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f45((byte) 3, i, j2iVar, qim0Var);
        }
    }

    public static final void j(u011 u011Var, float f, q10 q10Var, syo1 syo1Var, gt40 gt40Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1399113616);
        int i2 = i | (x340Var.i(u011Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(q10Var) ? 256 : 128) | (x340Var.g(syo1Var) ? 2048 : 1024) | (x340Var.i(gt40Var) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zx01.W0;
                x340Var.s0(objT);
            }
            eqr0.a(iko1.x(gt40Var, (iu30) objT), 0, 1, apo.r(-1455893158, new uw50(u011Var, f, z, q10Var, syo1Var), x340Var), x340Var, 3072, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o08(u011Var, f, q10Var, syo1Var, gt40Var, z, i);
        }
    }

    public static final void k(i671 i671Var, iu30 iu30Var, b0k b0kVar, int i) {
        vu30 vu30Var;
        vu30 vu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(142682785);
        int i2 = (x340Var.g(i671Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            f(x340Var, 0);
            int i3 = i2 & 112;
            d(iu30Var, x340Var, i3);
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new m861(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            i3u i3uVar = new i3u(4, true, false, false);
            j2i j2iVarR = apo.r(1310966945, new c671(i671Var, (byte) 0), x340Var);
            if (i671Var.b == null && i671Var.c.equals(g671.a)) {
                x340Var.i0(-1354119701);
                x340Var.r(false);
                vu30Var = null;
            } else {
                x340Var.i0(-1354055748);
                vu30 vu30VarR = apo.r(-952080548, new c671(i671Var, (byte) 1), x340Var);
                x340Var.r(false);
                vu30Var = vu30VarR;
            }
            x340Var.i0(-1352852918);
            x340Var.r(false);
            if (i671Var.d == null && i671Var.e == null) {
                x340Var.i0(-1352396597);
                x340Var.r(false);
                vu30Var2 = null;
            } else {
                x340Var.i0(-1352337511);
                vu30 vu30VarR2 = apo.r(-534191846, new d671(i671Var, iu30Var), x340Var);
                x340Var.r(false);
                vu30Var2 = vu30VarR2;
            }
            mqo1.e(function0, i3uVar, null, j2iVarR, vu30Var, null, vu30Var2, x340Var, 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d671(i671Var, iu30Var, i);
        }
    }

    public static final void l(uxi1 uxi1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1778391915);
        int i2 = (x340Var.i(uxi1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = uxi1Var.d;
            String str2 = uxi1Var.i;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            nim0 nim0Var = nim0.a;
            uwo1.e(str, anm1.N("venue_city_location_info", nim0Var), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            if (str2 == null || str2.length() == 0) {
                x340Var.i0(-947121235);
                x340Var.r(false);
            } else {
                x340Var.i0(-947381852);
                uwo1.e(cwl1.n0(2131963703, new Object[]{str2}, x340Var), anm1.N("venue_follower_count_info", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vxi1(uxi1Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void m(zob1 zob1Var, zob1 zob1Var2, ng20 ng20Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        tob1 tob1Var;
        float f;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1777596447);
        int i2 = i | (x340Var.i(zob1Var) ? 4 : 2) | (x340Var.i(zob1Var2) ? 32 : 16) | (x340Var.i(ng20Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarH = rwq.h(zob1Var, x340Var, i2 & 14);
            int i3 = i2 >> 3;
            tob1 tob1VarH = rwq.h(zob1Var2, x340Var, i3 & 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
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
            op71.g(x340Var, uyn1.B(qim0Var4, 0.0f, 0.0f, 0.0f, 16.0f, 7));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, uyn1.B(qim0Var4, 0.0f, 0.0f, 0.0f, 16.0f, 7));
            uxi1 uxi1Var = (uxi1) ven0VarH.getValue();
            cvx cvxVar2 = cbx.b(x340Var).b;
            n(uxi1Var, uyn1.z(16.0f, 0.0f, 2, qim0Var4), x340Var, 0);
            txi1 txi1Var = ((uxi1) ven0VarH.getValue()).k;
            if (txi1Var == null) {
                x340Var.i0(-1973283173);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(-1973283172);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, uyn1.B(qim0Var4, 0.0f, 0.0f, 0.0f, 4.0f, 7));
                String str = txi1Var.b;
                String str2 = txi1Var.c;
                boolean zI = x340Var.i(tob1VarH) | x340Var.g(txi1Var);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new mah1(txi1Var, tob1VarH, (byte) 12);
                    x340Var.s0(objT);
                }
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                hyo1.h(0, str, str2, (Function0) objT, x340Var, uyn1.z(16.0f, 0.0f, 2, qim0Var4));
                x340Var.r(false);
            }
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0Var5 = qim0Var3;
            op71.g(x340Var, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7));
            uxi1 uxi1Var2 = (uxi1) ven0VarH.getValue();
            cvx cvxVar6 = cbx.b(x340Var).b;
            l(uxi1Var2, uyn1.z(16.0f, r6, 2, qim0Var5), x340Var, 0);
            if (((uxi1) ven0VarH.getValue()).j.isEmpty()) {
                tob1Var = tob1VarH;
                f = 16.0f;
                x340Var.i0(-1972341175);
                cvx cvxVar7 = cbx.b(x340Var).b;
                op71.g(x340Var, uyn1.B(qim0Var5, 0.0f, 0.0f, 0.0f, 16.0f, 7));
                x340Var.r(false);
            } else {
                x340Var.i0(-1972699411);
                u5k u5kVar = new u5k(((uxi1) ven0VarH.getValue()).j);
                boolean zI2 = x340Var.i(tob1VarH);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new eyg1(tob1VarH, (byte) 7);
                    x340Var.s0(objT2);
                }
                tob1Var = tob1VarH;
                f = 16.0f;
                vbe.h(u5kVar, (iu30) objT2, (qim0) null, (p3v) null, 0.0f, x340Var, 8, 60);
                x340Var = x340Var;
                x340Var.r(false);
            }
            String str3 = ((uxi1) ven0VarH.getValue()).b;
            iu30 iu30Var = (iu30) tob1Var.getValue();
            cvx cvxVar8 = cbx.b(x340Var).b;
            b(str3, ng20Var, iu30Var, uyn1.z(f, 0.0f, 2, qim0Var5), x340Var, i3 & 112);
            ((uxi1) ven0VarH.getValue()).getClass();
            x340Var.i0(-1971909159);
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, zob1Var, zob1Var2, ng20Var, qim0Var2, (byte) 24);
        }
    }

    public static final void n(uxi1 uxi1Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1499095732);
        int i2 = (x340Var.i(uxi1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("venue-top-name", u291.f(qim0Var, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwo1.e(uxi1Var.a, null, cbx.d(x340Var).c, 0L, null, null, 0, true, new cjc0(2), 0, null, x340Var, 12582912, 0, 1658);
            String str = uxi1Var.c;
            if (str == null || str.length() == 0) {
                x340Var.i0(1204652204);
                x340Var.r(false);
            } else {
                x340Var.i0(1204568597);
                uwo1.e(uxi1Var.c, null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                x340Var.r(false);
            }
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vxi1(uxi1Var, qim0Var, i, b2);
        }
    }

    public static final bqq0 p(bqq0 bqq0Var, fqq0 fqq0Var) {
        List list;
        fab0 fab0Var = fqq0Var.f;
        if (fab0Var == null) {
            fab0Var = bqq0Var.a;
        }
        fab0 fab0Var2 = fab0Var;
        as3 as3Var = fqq0Var.a;
        if (as3Var == null) {
            as3Var = bqq0Var.b;
        }
        as3 as3Var2 = as3Var;
        mml mmlVar = fqq0Var.d;
        if (mmlVar == null) {
            mmlVar = bqq0Var.e;
        }
        mml mmlVar2 = mmlVar;
        dia1 dia1Var = fqq0Var.b;
        if (dia1Var == null) {
            dia1Var = bqq0Var.c;
        }
        dia1 dia1Var2 = dia1Var;
        jf20 jf20Var = fqq0Var.c;
        if (jf20Var == null || (list = jf20Var.a) == null) {
            list = bqq0Var.d;
        }
        List list2 = list;
        Boolean bool = fqq0Var.e;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : bqq0Var.f;
        a3t0 a3t0Var = fqq0Var.g;
        if (a3t0Var == null) {
            a3t0Var = bqq0Var.g;
        }
        a3t0 a3t0Var2 = a3t0Var;
        Boolean bool2 = fqq0Var.h;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : bqq0Var.h;
        Boolean bool3 = fqq0Var.i;
        return new bqq0(fab0Var2, as3Var2, dia1Var2, list2, mmlVar2, zBooleanValue, a3t0Var2, zBooleanValue2, bool3 != null ? bool3.booleanValue() : bqq0Var.i);
    }

    public static final int r(un90 un90Var) {
        if (un90Var instanceof b8e0) {
            return ((b8e0) un90Var).getCount();
        }
        if (un90Var instanceof qn90) {
            return r(((qn90) un90Var).a);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(xrc0 xrc0Var, String str, trc0 trc0Var, xpv0 xpv0Var, onm onmVar) {
        i120 i120Var;
        wsc0 wsc0Var;
        kby kbyVar;
        if (onmVar instanceof i120) {
            i120Var = (i120) onmVar;
            int i = i120Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i120Var.c = i - Integer.MIN_VALUE;
            } else {
                i120Var = new i120(onmVar);
            }
        } else {
            i120Var = new i120(onmVar);
        }
        Object objF = i120Var.b;
        int i2 = i120Var.c;
        smc0 smc0VarH = null;
        if (i2 == 0) {
            hm5.M(objF);
            i120Var.a = xpv0Var;
            i120Var.c = 1;
            objF = ((rsc0) xrc0Var).f(str, trc0Var, i120Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xpv0Var = i120Var.a;
            hm5.M(objF);
        }
        oy21 oy21Var = (py21) objF;
        oy21 oy21Var2 = oy21Var instanceof oy21 ? oy21Var : null;
        if (oy21Var2 == null || (wsc0Var = (wsc0) oy21Var2.a) == null || (kbyVar = wsc0Var.f) == null) {
            return null;
        }
        Map map = kbyVar.q;
        String str2 = (String) map.get("prompt_with_markup");
        if (str2 == null) {
            str2 = (String) map.get("prompt");
        }
        if (str2 != null) {
            xpv0Var.getClass();
            smc0VarH = xpv0.h(str2);
        }
        if (smc0VarH == null) {
            smc0VarH = z6x.a;
        }
        return new h120(kbyVar, str2, smc0VarH);
    }

    public static final List t(un90 un90Var) {
        if (un90Var instanceof b8e0) {
            return ((b8e0) un90Var).getFilters();
        }
        if (un90Var instanceof qn90) {
            return t(((qn90) un90Var).a);
        }
        return un90Var instanceof on90 ? ((on90) un90Var).b : z6x.a;
    }

    public static final int u(un90 un90Var) {
        if (un90Var instanceof c9e0) {
            return ((c9e0) un90Var).getId();
        }
        if (un90Var instanceof on90) {
            return ((on90) un90Var).a;
        }
        return -1;
    }

    public static final voc0 v(sxc0 sxc0Var, List list) {
        z6x z6xVar;
        oqz0 oqz0Var = sxc0Var.b;
        int i = oqz0Var.c;
        tr80 tr80Var = oqz0Var.b;
        bqq0 bqq0Var = sxc0Var.a;
        fab0 fab0Var = bqq0Var.a;
        mml mmlVar = bqq0Var.e;
        dia1 dia1Var = bqq0Var.c;
        List list2 = bqq0Var.d;
        if (list == null) {
            list = t(sxc0Var.c);
        }
        List list3 = list;
        boolean z = bqq0Var.f;
        boolean z2 = bqq0Var.h;
        boolean z3 = bqq0Var.i;
        ln01 ln01Var = sxc0Var.f;
        if (ln01Var instanceof ln01) {
            z6xVar = ln01Var.a;
            if (z6xVar == null) {
                z6xVar = z6x.a;
            }
        } else {
            z6xVar = null;
        }
        return new voc0(i, fab0Var, tr80Var, mmlVar, dia1Var, z6xVar, list2, z, list3, z2, z3);
    }

    public static final boolean w(bqq0 bqq0Var, fqq0 fqq0Var) {
        as3 as3Var = fqq0Var.a;
        if (as3Var != null && as3Var != bqq0Var.b) {
            return false;
        }
        dia1 dia1Var = fqq0Var.b;
        if (dia1Var != null && dia1Var != bqq0Var.c) {
            return false;
        }
        jf20 jf20Var = fqq0Var.c;
        if (jf20Var != null && !u890.j(jf20Var.a, bqq0Var.d)) {
            return false;
        }
        mml mmlVar = fqq0Var.d;
        if (mmlVar != null && !mmlVar.equals(bqq0Var.e)) {
            return false;
        }
        Boolean bool = fqq0Var.e;
        if (bool != null && !bool.equals(Boolean.valueOf(bqq0Var.f))) {
            return false;
        }
        fab0 fab0Var = fqq0Var.f;
        if (fab0Var != null && !fab0Var.equals(bqq0Var.a)) {
            return false;
        }
        a3t0 a3t0Var = fqq0Var.g;
        if (a3t0Var != null && a3t0Var != bqq0Var.g) {
            return false;
        }
        Boolean bool2 = fqq0Var.h;
        if (bool2 != null && !bool2.equals(Boolean.valueOf(bqq0Var.h))) {
            return false;
        }
        Boolean bool3 = fqq0Var.i;
        return bool3 == null || bool3.equals(Boolean.valueOf(bqq0Var.i));
    }

    public static final tr80 x(un90 un90Var) {
        if (un90Var instanceof b8e0) {
            return ((b8e0) un90Var).a();
        }
        return un90Var instanceof qn90 ? x(((qn90) un90Var).a) : tr80.d;
    }

    public static Object y(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public abstract boolean q(Object obj);

    public Object z() {
        return rih1.a;
    }

    public void o(Object obj) {
    }
}
