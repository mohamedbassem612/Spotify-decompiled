package p;

import android.content.Context;
import android.graphics.Path;
import android.media.ImageReader;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.android.id.IdHelperAndroid;
import com.facebook.FacebookException;
import com.google.common.base.VerifyException;
import io.reactivex.rxjava3.core.Observable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class anm1 {
    public static volatile Integer a;
    public static final int[] b = {-2130970302, -2130970308};
    public static final int[] c = {2130970302};

    public static boolean A(String str) {
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(str).d;
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            return true;
        }
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f);
    }

    public static final ArrayList B(List list, List list2, float f) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(new u7h(z4p1.A(f, ((u7h) list.get(Math.min(i, list.size() - 1))).a, ((u7h) list2.get(Math.min(i, list2.size() - 1))).a)));
        }
        return arrayList;
    }

    public static final bw61 C(bw61 bw61Var, bw61 bw61Var2, float f) {
        float fT = dm5.T(bw61Var.f(), bw61Var2.f(), f);
        float fT2 = dm5.T(bw61Var.g(), bw61Var2.g(), f);
        long jE = bw61Var.e();
        long jE2 = bw61Var2.e();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(dm5.T(r3v.a(jE), r3v.a(jE2), f))) << 32) | (((long) Float.floatToRawIntBits(dm5.T(r3v.b(jE), r3v.b(jE2), f))) & 4294967295L);
        long jA = z4p1.A(f, bw61Var.d(), bw61Var2.d());
        Object objC = ok10.c(bw61Var.c(), bw61Var2.c(), f);
        return new bw61(fT, fT2, jFloatToRawIntBits, jA, objC instanceof Brush ? (Brush) objC : null, dm5.T(bw61Var.a(), bw61Var2.a(), f), f < 0.5f ? bw61Var.b() : bw61Var2.b(), 0);
    }

    public static final ArrayList D(List list, List list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(Float.valueOf(dm5.T(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f)));
        }
        return arrayList;
    }

    public static final long E(float f, long j, long j2) {
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            return hm5.A(f, j, j2);
        }
        return f < 0.5f ? j : j2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    public static void F(int i, ynb1 ynb1Var, ril rilVar, yhc yhcVar) {
        String strD;
        wq60 wq60VarG = i == 0 ? ynb1Var.g() : ynb1Var.j();
        yhc yhcVarR = yhcVar.r(1);
        if (yhcVarR instanceof yhc) {
            yhc yhcVar2 = yhcVarR;
            if (yhcVar2.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < yhcVar2.size(); i2++) {
                wq60VarG.X(new Object[]{yhcVar2.B(i2)});
            }
            if (yhcVar.size() > 2) {
                eic eicVarR = yhcVar.r(2);
                if (eicVarR instanceof eic) {
                    eic eicVar = eicVarR;
                    for (String str : eicVar.H()) {
                        str.getClass();
                        if (str.equals("style")) {
                            yhc yhcVarS = eicVar.s(str);
                            if (yhcVarS instanceof yhc) {
                                yhc yhcVar3 = yhcVarS;
                                if (yhcVar3.size() > 1) {
                                    strD = yhcVar3.B(0);
                                    wq60VarG.a0(yhcVar3.u(1));
                                } else {
                                    strD = yhcVarS.d();
                                }
                            } else {
                                strD = yhcVarS.d();
                            }
                            if (strD.equals("packed")) {
                                wq60VarG.f0(qlb1.c);
                            } else if (strD.equals("spread_inside")) {
                                wq60VarG.f0(qlb1.b);
                            } else {
                                wq60VarG.f0(qlb1.a);
                            }
                        } else {
                            G(str, eicVar, wq60VarG, rilVar, ynb1Var);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:129:0x0212  */
    /* JADX WARN: Code duplicated, block: B:164:0x0284  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00e8. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    public static void G(String str, eic eicVar, dil dilVar, ril rilVar, ynb1 ynb1Var) {
        boolean z;
        char c2;
        boolean z2;
        boolean z3;
        ?? r16;
        boolean zI = ynb1Var.i();
        yhc yhcVarT = eicVar.t(str);
        if (yhcVarT == null || yhcVarT.size() <= 1) {
            String strE = eicVar.E(str);
            if (strE != null) {
                dil dilVarB = strE.equals("parent") ? ynb1Var.b(0) : ynb1Var.b(strE);
                str.getClass();
                switch (str) {
                    case "baseline":
                        ynb1Var.a(dilVar.getKey());
                        ynb1Var.a(dilVarB.getKey());
                        dilVar.h(dilVarB);
                        break;
                    case "bottom":
                        dilVar.l(dilVarB);
                        break;
                    case "end":
                        if (zI) {
                            dilVar.E(dilVarB);
                            break;
                        } else {
                            dilVar.v(dilVarB);
                            break;
                        }
                        break;
                    case "top":
                        dilVar.R(dilVarB);
                        break;
                    case "start":
                        if (zI) {
                            dilVar.v(dilVarB);
                            break;
                        } else {
                            dilVar.E(dilVarB);
                            break;
                        }
                        break;
                }
            }
            return;
        }
        String strB = yhcVarT.B(0);
        String strD = yhcVarT.D();
        float fC = yhcVarT.size() > 2 ? ynb1Var.c(Float.valueOf(ynb1Var.d().b(rilVar.a(yhcVarT.z(2))))) : 0.0f;
        float fC2 = yhcVarT.size() > 3 ? ynb1Var.c(Float.valueOf(ynb1Var.d().b(rilVar.a(yhcVarT.z(3))))) : 0.0f;
        dil dilVarB2 = strB.equals("parent") ? ynb1Var.b(0) : ynb1Var.b(strB);
        str.getClass();
        switch (str) {
            case "baseline":
                z = true;
                c2 = 2;
                strD.getClass();
                switch (strD) {
                    case "baseline":
                        ynb1Var.a(dilVar.getKey());
                        ynb1Var.a(dilVarB2.getKey());
                        dilVar.h(dilVarB2);
                        break;
                    case "bottom":
                        ynb1Var.a(dilVar.getKey());
                        dilVar.i(dilVarB2);
                        break;
                    case "top":
                        ynb1Var.a(dilVar.getKey());
                        dilVar.j(dilVarB2);
                        break;
                }
                z2 = z;
                z3 = false;
                break;
            case "circular":
                z = true;
                dilVar.n(dilVarB2, rilVar.a(yhcVarT.r(1)), yhcVarT.size() > 2 ? ynb1Var.c(Float.valueOf(ynb1Var.d().b(rilVar.a(yhcVarT.z(2))))) : 0.0f);
                c2 = 2;
                z2 = z;
                z3 = false;
                break;
            case "bottom":
                strD.getClass();
                switch (strD) {
                    case "baseline":
                        ynb1Var.a(dilVarB2.getKey());
                        dilVar.k(dilVarB2);
                        break;
                    case "bottom":
                        dilVar.l(dilVarB2);
                        break;
                    case "top":
                        dilVar.m(dilVarB2);
                        break;
                }
                z = true;
                c2 = 2;
                z2 = z;
                z3 = false;
                break;
            case "end":
                z2 = !zI;
                z = true;
                c2 = 2;
                z3 = true;
                break;
            case "top":
                strD.getClass();
                switch (strD) {
                    case "baseline":
                        ynb1Var.a(dilVarB2.getKey());
                        dilVar.P(dilVarB2);
                        break;
                    case "bottom":
                        dilVar.Q(dilVarB2);
                        break;
                    case "top":
                        dilVar.R(dilVarB2);
                        break;
                }
                z = true;
                c2 = 2;
                z2 = z;
                z3 = false;
                break;
            case "left":
                z2 = true;
                z = true;
                c2 = 2;
                z3 = true;
                break;
            case "right":
                z2 = false;
                z = true;
                c2 = 2;
                z3 = true;
                break;
            case "start":
                z2 = zI;
                z = true;
                c2 = 2;
                z3 = true;
                break;
            default:
                z = true;
                c2 = 2;
                z2 = z;
                z3 = false;
                break;
        }
        if (z3) {
            strD.getClass();
            switch (strD.hashCode()) {
                case 100571:
                    if (!strD.equals("end")) {
                        r16 = -1;
                    } else {
                        r16 = 0;
                    }
                    break;
                case 108511772:
                    if (!strD.equals("right")) {
                        r16 = -1;
                    } else {
                        r16 = z;
                    }
                    break;
                case 109757538:
                    if (!strD.equals("start")) {
                        r16 = -1;
                    } else {
                        r16 = c2;
                    }
                    break;
                default:
                    r16 = -1;
                    break;
            }
            switch (r16) {
                case 0:
                    z = !zI;
                    break;
                case 1:
                    z = false;
                    break;
                case 2:
                    z = zI;
                    break;
            }
            if (z2) {
                if (z) {
                    dilVar.v(dilVarB2);
                } else {
                    dilVar.w(dilVarB2);
                }
            } else if (z) {
                dilVar.D(dilVarB2);
            } else {
                dilVar.E(dilVarB2);
            }
        }
        dilVar.y(Float.valueOf(fC)).A(Float.valueOf(fC2));
    }

    public static a5u H(eic eicVar, String str, ynb1 ynb1Var, ifb1 ifb1Var) {
        eic eicVarS = eicVar.s(str);
        a5u a5uVarE = a5u.e(0);
        if (eicVarS instanceof gic) {
            return I(eicVarS.d());
        }
        if (eicVarS instanceof cic) {
            return a5u.e(ynb1Var.c(Float.valueOf(ifb1Var.b(eicVar.v(str)))));
        }
        if (eicVarS instanceof eic) {
            eic eicVar2 = eicVarS;
            String strE = eicVar2.E("value");
            if (strE != null) {
                a5uVarE = I(strE);
            }
            cic cicVarA = eicVar2.A("min");
            if (cicVarA != null) {
                if (cicVarA instanceof cic) {
                    a5uVarE.p(ynb1Var.c(Float.valueOf(ifb1Var.b(cicVarA.e()))));
                } else if (cicVarA instanceof gic) {
                    a5uVarE.o();
                }
            }
            cic cicVarA2 = eicVar2.A("max");
            if (cicVarA2 != null) {
                if (cicVarA2 instanceof cic) {
                    a5uVarE.n(ynb1Var.c(Float.valueOf(ifb1Var.b(cicVarA2.e()))));
                    return a5uVarE;
                }
                if (cicVarA2 instanceof gic) {
                    a5uVarE.m();
                }
            }
        }
        return a5uVarE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static a5u I(String str) {
        a5u a5uVarE = a5u.e(0);
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    b2 = 0;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    b2 = 1;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    b2 = 2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    b2 = 3;
                }
                break;
        }
        String str2 = a5u.t;
        switch (b2) {
            case 0:
                return a5u.k(a5u.i);
            case 1:
                return a5u.f();
            case 2:
                return a5u.k(str2);
            case 3:
                return a5u.l();
            default:
                if (str.endsWith("%")) {
                    a5u a5uVarH = a5u.h(Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f);
                    a5uVarH.q();
                    return a5uVarH;
                }
                if (!str.contains(":")) {
                    return a5uVarE;
                }
                a5u a5uVarJ = a5u.j(str);
                a5uVarJ.r(str2);
                return a5uVarJ;
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[left]] */
    public static void J(int i, ynb1 ynb1Var, String str, eic eicVar) {
        String str2;
        ArrayList arrayListH = eicVar.H();
        dil dilVarB = ynb1Var.b(str);
        if (i == 0) {
            ynb1Var.h(str);
        } else {
            ynb1Var.k(str);
        }
        boolean z = ynb1Var.i() || i == 0;
        vq50 vq50VarC = dilVarB.c();
        Iterator it = arrayListH.iterator();
        float fV = 0.0f;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            while (true) {
                if (!it.hasNext()) {
                    if (z2) {
                        if (z3) {
                            vq50VarC.e(fV);
                            return;
                        } else {
                            vq50VarC.e(1.0f - fV);
                            return;
                        }
                    }
                    if (z3) {
                        vq50VarC.f(Float.valueOf(fV));
                        return;
                    } else {
                        vq50VarC.d(Float.valueOf(fV));
                        return;
                    }
                }
                str2 = (String) it.next();
                str2.getClass();
                switch (str2) {
                    case "percent":
                        yhc yhcVarT = eicVar.t(str2);
                        if (yhcVarT != null) {
                            if (yhcVarT.size() > 1) {
                                String strB = yhcVarT.B(0);
                                float fU = yhcVarT.u(1);
                                switch (strB) {
                                    case "end":
                                        z3 = !z;
                                        fV = fU;
                                        break;
                                    case "left":
                                        z3 = true;
                                        fV = fU;
                                        z2 = true;
                                        break;
                                    case "right":
                                        z3 = false;
                                        fV = fU;
                                        break;
                                    case "start":
                                        z3 = z;
                                        fV = fU;
                                        break;
                                    default:
                                        fV = fU;
                                        break;
                                }
                            }
                            z2 = true;
                            break;
                        } else {
                            fV = eicVar.v(str2);
                            z2 = true;
                            z3 = true;
                            break;
                        }
                        break;
                    case "end":
                        fV = ynb1Var.d().b(eicVar.v(str2));
                        z3 = !z;
                        break;
                    case "right":
                        fV = ynb1Var.d().b(eicVar.v(str2));
                        z3 = false;
                        break;
                    case "start":
                        fV = ynb1Var.d().b(eicVar.v(str2));
                        z3 = z;
                        break;
                }
            }
            fV = ynb1Var.d().b(eicVar.v(str2));
        }
    }

    public static void K(ynb1 ynb1Var, ril rilVar, String str, eic eicVar) {
        dil dilVarB = ynb1Var.b(str);
        dilVarB.getClass();
        Iterator it = eicVar.H().iterator();
        while (it.hasNext()) {
            i((String) it.next(), eicVar, dilVarB, rilVar, ynb1Var);
        }
    }

    public static final Observable L(o8n o8nVar, vu30 vu30Var) {
        if (o8nVar.A(fkj0.W0) == null) {
            return Observable.create(new x141(o8nVar, vu30Var));
        }
        bhn0.s(o8nVar, "Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.json.JsonEncodingException */
    public static final rjm1 M(nfa0 nfa0Var, h661 h661Var) throws JsonEncodingException {
        yoi1 kind = h661Var.getKind();
        if (kind instanceof scv0) {
            return rjm1.f;
        }
        if (!u890.j(kind, uic1.i)) {
            if (!u890.j(kind, vic1.h)) {
                return rjm1.c;
            }
            h661 h661VarL = l(nfa0Var.b, h661Var.g(0));
            yoi1 kind2 = h661VarL.getKind();
            if ((kind2 instanceof mnw0) || u890.j(kind2, l661.h)) {
                return rjm1.e;
            }
            if (!nfa0Var.a.d) {
                throw vvm1.h(h661VarL);
            }
        }
        return rjm1.d;
    }

    public static final qim0 N(String str, qim0 qim0Var) {
        return qim0Var.then(new dzd1(str));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void O(List list, u8s0 u8s0Var) throws NoWhenBranchMatchedException {
        Path path;
        Path path2;
        t9s0 t9s0Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        tw4 tw4Var = (tw4) u8s0Var;
        Path path3 = tw4Var.a;
        int i = path3.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        tw4Var.o();
        tw4Var.p(i);
        t9s0 t9s0Var2 = list2.isEmpty() ? b9s0.c : (t9s0) list2.get(0);
        int size = list2.size();
        float f12 = 0.0f;
        int i2 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i2 < size) {
            t9s0 t9s0Var3 = (t9s0) list2.get(i2);
            if (t9s0Var3 instanceof b9s0) {
                tw4Var.g();
                path2 = path3;
                size = size;
                f12 = f12;
                i2 = i2;
                t9s0Var = t9s0Var3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (t9s0Var3 instanceof n9s0) {
                    n9s0 n9s0Var = (n9s0) t9s0Var3;
                    float f19 = n9s0Var.c;
                    f15 += f19;
                    float f20 = n9s0Var.d;
                    f16 += f20;
                    path3.rMoveTo(f19, f20);
                    path2 = path3;
                    f17 = f15;
                    f18 = f16;
                } else if (t9s0Var3 instanceof f9s0) {
                    f9s0 f9s0Var = (f9s0) t9s0Var3;
                    float f21 = f9s0Var.c;
                    float f22 = f9s0Var.d;
                    tw4Var.k(f21, f22);
                    path2 = path3;
                    f16 = f22;
                    f18 = f16;
                    f15 = f21;
                    f17 = f15;
                } else {
                    if (t9s0Var3 instanceof m9s0) {
                        m9s0 m9s0Var = (m9s0) t9s0Var3;
                        float f23 = m9s0Var.d;
                        float f24 = m9s0Var.c;
                        path3.rLineTo(f24, f23);
                        f15 += f24;
                        f16 += f23;
                    } else if (t9s0Var3 instanceof e9s0) {
                        e9s0 e9s0Var = (e9s0) t9s0Var3;
                        float f25 = e9s0Var.d;
                        float f26 = e9s0Var.c;
                        tw4Var.j(f26, f25);
                        path2 = path3;
                        f15 = f26;
                        f16 = f25;
                    } else if (t9s0Var3 instanceof l9s0) {
                        float f27 = ((l9s0) t9s0Var3).c;
                        path3.rLineTo(f27, f12);
                        f15 += f27;
                    } else if (t9s0Var3 instanceof d9s0) {
                        float f28 = ((d9s0) t9s0Var3).c;
                        tw4Var.j(f28, f16);
                        path2 = path3;
                        f15 = f28;
                    } else if (t9s0Var3 instanceof r9s0) {
                        float f29 = ((r9s0) t9s0Var3).c;
                        path3.rLineTo(f12, f29);
                        f16 += f29;
                    } else if (t9s0Var3 instanceof s9s0) {
                        float f30 = ((s9s0) t9s0Var3).c;
                        tw4Var.j(f15, f30);
                        path2 = path3;
                        f16 = f30;
                    } else {
                        if (t9s0Var3 instanceof k9s0) {
                            k9s0 k9s0Var = (k9s0) t9s0Var3;
                            path3.rCubicTo(k9s0Var.c, k9s0Var.d, k9s0Var.e, k9s0Var.f, k9s0Var.g, k9s0Var.h);
                            path = path3;
                            f3 = k9s0Var.e + f15;
                            f4 = k9s0Var.f + f16;
                            f15 += k9s0Var.g;
                            f11 = k9s0Var.h;
                        } else {
                            path = path3;
                            if (t9s0Var3 instanceof c9s0) {
                                c9s0 c9s0Var = (c9s0) t9s0Var3;
                                tw4Var.h(c9s0Var.c, c9s0Var.d, c9s0Var.e, c9s0Var.f, c9s0Var.g, c9s0Var.h);
                                f5 = c9s0Var.e;
                                f6 = c9s0Var.f;
                                f7 = c9s0Var.g;
                                f8 = c9s0Var.h;
                            } else if (t9s0Var3 instanceof p9s0) {
                                if (t9s0Var2.a) {
                                    float f31 = f15 - f13;
                                    f10 = f16 - f14;
                                    f9 = f31;
                                } else {
                                    f9 = f12;
                                    f10 = f9;
                                }
                                p9s0 p9s0Var = (p9s0) t9s0Var3;
                                path.rCubicTo(f9, f10, p9s0Var.c, p9s0Var.d, p9s0Var.e, p9s0Var.f);
                                path = path;
                                f3 = p9s0Var.c + f15;
                                f4 = p9s0Var.d + f16;
                                f15 += p9s0Var.e;
                                f11 = p9s0Var.f;
                            } else if (t9s0Var3 instanceof h9s0) {
                                if (t9s0Var2.a) {
                                    f15 = (f15 * 2.0f) - f13;
                                    f16 = (2.0f * f16) - f14;
                                }
                                h9s0 h9s0Var = (h9s0) t9s0Var3;
                                tw4Var.h(f15, f16, h9s0Var.c, h9s0Var.d, h9s0Var.e, h9s0Var.f);
                                f5 = h9s0Var.c;
                                f6 = h9s0Var.d;
                                f7 = h9s0Var.e;
                                f8 = h9s0Var.f;
                            } else if (t9s0Var3 instanceof o9s0) {
                                o9s0 o9s0Var = (o9s0) t9s0Var3;
                                float f32 = o9s0Var.f;
                                float f33 = o9s0Var.e;
                                float f34 = o9s0Var.d;
                                float f35 = o9s0Var.c;
                                path.rQuadTo(f35, f34, f33, f32);
                                float f36 = f35 + f15;
                                f14 = f34 + f16;
                                f15 += f33;
                                f16 += f32;
                                f13 = f36;
                                path2 = path;
                            } else if (t9s0Var3 instanceof g9s0) {
                                g9s0 g9s0Var = (g9s0) t9s0Var3;
                                float f37 = g9s0Var.f;
                                float f38 = g9s0Var.e;
                                f14 = g9s0Var.d;
                                float f39 = g9s0Var.c;
                                path.quadTo(f39, f14, f38, f37);
                                f16 = f37;
                                f15 = f38;
                                path2 = path;
                                size = size;
                                f12 = f12;
                                i2 = i2;
                                t9s0Var = t9s0Var3;
                                f13 = f39;
                            } else if (t9s0Var3 instanceof q9s0) {
                                if (t9s0Var2.b) {
                                    f = f15 - f13;
                                    f2 = f16 - f14;
                                } else {
                                    f = f12;
                                    f2 = f;
                                }
                                q9s0 q9s0Var = (q9s0) t9s0Var3;
                                float f40 = q9s0Var.d;
                                float f41 = q9s0Var.c;
                                path.rQuadTo(f, f2, f41, f40);
                                f3 = f + f15;
                                f4 = f2 + f16;
                                f15 += f41;
                                f16 += f40;
                                f13 = f3;
                                f14 = f4;
                                path2 = path;
                            } else if (t9s0Var3 instanceof i9s0) {
                                if (t9s0Var2.b) {
                                    f15 = (f15 * 2.0f) - f13;
                                    f16 = (2.0f * f16) - f14;
                                }
                                i9s0 i9s0Var = (i9s0) t9s0Var3;
                                float f42 = i9s0Var.d;
                                float f43 = i9s0Var.c;
                                path.quadTo(f15, f16, f43, f42);
                                path2 = path;
                                size = size;
                                f12 = f12;
                                i2 = i2;
                                f13 = f15;
                                f14 = f16;
                                t9s0Var = t9s0Var3;
                                f15 = f43;
                                f16 = f42;
                            } else if (t9s0Var3 instanceof j9s0) {
                                j9s0 j9s0Var = (j9s0) t9s0Var3;
                                float f44 = j9s0Var.h + f15;
                                float f45 = j9s0Var.i + f16;
                                path2 = path;
                                i2 = i2;
                                f12 = 0.0f;
                                tw4Var = tw4Var;
                                size = size;
                                w(tw4Var, f15, f16, f44, f45, j9s0Var.c, j9s0Var.d, j9s0Var.e, j9s0Var.f, j9s0Var.g);
                                f13 = f44;
                                f15 = f13;
                                f14 = f45;
                                f16 = f14;
                                t9s0Var = t9s0Var3;
                            } else {
                                path2 = path;
                                size = size;
                                f12 = f12;
                                i2 = i2;
                                if (!(t9s0Var3 instanceof a9s0)) {
                                    eg.o();
                                    return;
                                }
                                a9s0 a9s0Var = (a9s0) t9s0Var3;
                                float f46 = a9s0Var.i;
                                float f47 = a9s0Var.h;
                                t9s0Var = t9s0Var3;
                                tw4Var = tw4Var;
                                w(tw4Var, f15, f16, f47, f46, a9s0Var.c, a9s0Var.d, a9s0Var.e, a9s0Var.f, a9s0Var.g);
                                f14 = f46;
                                f16 = f14;
                                f13 = f47;
                                f15 = f13;
                            }
                            f15 = f7;
                            f16 = f8;
                            path2 = path;
                            size = size;
                            f12 = f12;
                            i2 = i2;
                            t9s0Var = t9s0Var3;
                            f13 = f5;
                            f14 = f6;
                        }
                        f16 += f11;
                        f13 = f3;
                        f14 = f4;
                        path2 = path;
                    }
                    path2 = path3;
                }
                t9s0Var = t9s0Var3;
            }
            i2++;
            list2 = list;
            path3 = path2;
            size = size;
            t9s0Var2 = t9s0Var;
            f12 = f12;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final zv61 P(Brush brush) throws NoWhenBranchMatchedException {
        if (brush instanceof zv61) {
            return (zv61) brush;
        }
        if (brush instanceof n6a1) {
            long j = ((n6a1) brush).a;
            return v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(j)}), 0.0f, 0.0f, 14);
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.common.base.VerifyException */
    public static void Q(boolean z, String str, Object obj) throws VerifyException {
        if (!z) {
            throw new VerifyException(m5n1.L(str, obj));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.common.base.VerifyException */
    public static void R(Object obj) throws VerifyException {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new VerifyException(m5n1.L("expected a non-null reference", objArr));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void a(Function0 function0, i3u i3uVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        Function0 function1;
        int i3;
        i3u i3uVar2;
        int i4;
        boolean z;
        i3u i3uVar3;
        h311 h311VarV;
        View view;
        wat watVar;
        flb0 flb0Var;
        v340 v340VarU;
        ven0 ven0VarV;
        Object objT;
        m4c m4cVar;
        UUID uuid;
        boolean zE;
        Object objT2;
        boolean z2;
        c4u c4uVar;
        boolean zI;
        Object objT3;
        boolean z3;
        boolean z4;
        boolean zE2;
        Object objT4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(826668973);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (x340Var.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                i3uVar2 = i3uVar;
                i3 |= x340Var.g(i3uVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.i(j2iVar)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i6 != 0) {
                    i3uVar2 = new i3u(7, false, false, false);
                }
                view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                watVar = (wat) x340Var.k(t4k.h);
                flb0Var = (flb0) x340Var.k(t4k.n);
                v340VarU = tgp1.u(x340Var);
                ven0VarV = xto.v(j2iVar, x340Var);
                Object[] objArr = new Object[0];
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new xh3((byte) 1);
                    x340Var.s0(objT);
                }
                uuid = (UUID) k5p1.s(objArr, (Function0) objT, x340Var, 48);
                zE = x340Var.e(i3uVar2.a()) | x340Var.g(view) | x340Var.g(watVar) | x340Var.g(null);
                objT2 = x340Var.T();
                if (!zE || objT2 == m4cVar) {
                    c4u c4uVar2 = new c4u(function1, i3uVar2, view, flb0Var, watVar, uuid);
                    z2 = true;
                    c4uVar2.e(v340VarU, apo.j(-1338939603, new od4(ven0VarV, (byte) 0), true));
                    x340Var.s0(c4uVar2);
                    objT2 = c4uVar2;
                } else {
                    z2 = true;
                }
                c4uVar = (c4u) objT2;
                zI = x340Var.i(c4uVar);
                objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new pd4(c4uVar, (byte) 0);
                    x340Var.s0(objT3);
                }
                qxd0.i(c4uVar, (iu30) objT3, x340Var);
                boolean zI2 = x340Var.i(c4uVar);
                if ((i4 & 14) == 4) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z5 = zI2 | z3;
                if ((i4 & 112) == 32) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zE2 = z5 | z4 | x340Var.e(flb0Var.ordinal());
                objT4 = x340Var.T();
                if (zE2 || objT4 == m4cVar) {
                    i3u i3uVar4 = i3uVar2;
                    objT4 = new qd4(c4uVar, function0, i3uVar4, flb0Var, (byte) 0);
                    i3uVar2 = i3uVar4;
                    x340Var.s0(objT4);
                }
                qxd0.D((Function0) objT4, x340Var);
            } else {
                x340Var.b0();
            }
            i3uVar3 = i3uVar2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rd4(function0, i3uVar3, j2iVar, i, i2, (byte) 0);
            }
        }
        i3 |= 48;
        i3uVar2 = i3uVar;
        if ((i & 384) == 0) {
            if (x340Var.i(j2iVar)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i6 != 0) {
                i3uVar2 = new i3u(7, false, false, false);
            }
            view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            watVar = (wat) x340Var.k(t4k.h);
            flb0Var = (flb0) x340Var.k(t4k.n);
            v340VarU = tgp1.u(x340Var);
            ven0VarV = xto.v(j2iVar, x340Var);
            Object[] objArr2 = new Object[0];
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new xh3((byte) 1);
                x340Var.s0(objT);
            }
            uuid = (UUID) k5p1.s(objArr2, (Function0) objT, x340Var, 48);
            zE = x340Var.e(i3uVar2.a()) | x340Var.g(view) | x340Var.g(watVar) | x340Var.g(null);
            objT2 = x340Var.T();
            if (zE) {
                c4u c4uVar3 = new c4u(function1, i3uVar2, view, flb0Var, watVar, uuid);
                z2 = true;
                c4uVar3.e(v340VarU, apo.j(-1338939603, new od4(ven0VarV, (byte) 0), true));
                x340Var.s0(c4uVar3);
                objT2 = c4uVar3;
            } else {
                c4u c4uVar4 = new c4u(function1, i3uVar2, view, flb0Var, watVar, uuid);
                z2 = true;
                c4uVar4.e(v340VarU, apo.j(-1338939603, new od4(ven0VarV, (byte) 0), true));
                x340Var.s0(c4uVar4);
                objT2 = c4uVar4;
            }
            c4uVar = (c4u) objT2;
            zI = x340Var.i(c4uVar);
            objT3 = x340Var.T();
            if (zI) {
                objT3 = new pd4(c4uVar, (byte) 0);
                x340Var.s0(objT3);
            } else {
                objT3 = new pd4(c4uVar, (byte) 0);
                x340Var.s0(objT3);
            }
            qxd0.i(c4uVar, (iu30) objT3, x340Var);
            boolean zI3 = x340Var.i(c4uVar);
            if ((i4 & 14) == 4) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z6 = zI3 | z3;
            if ((i4 & 112) == 32) {
                z4 = z2;
            } else {
                z4 = false;
            }
            zE2 = z6 | z4 | x340Var.e(flb0Var.ordinal());
            objT4 = x340Var.T();
            if (zE2) {
                i3u i3uVar5 = i3uVar2;
                objT4 = new qd4(c4uVar, function0, i3uVar5, flb0Var, (byte) 0);
                i3uVar2 = i3uVar5;
                x340Var.s0(objT4);
            } else {
                i3u i3uVar6 = i3uVar2;
                objT4 = new qd4(c4uVar, function0, i3uVar6, flb0Var, (byte) 0);
                i3uVar2 = i3uVar6;
                x340Var.s0(objT4);
            }
            qxd0.D((Function0) objT4, x340Var);
        } else {
            x340Var.b0();
        }
        i3uVar3 = i3uVar2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rd4(function0, i3uVar3, j2iVar, i, i2, (byte) 0);
        }
    }

    public static final void b(int i, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1090521195);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = td4.b;
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            us71.j((i3 >> 6) & 14, vu30Var, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(qim0Var, vu30Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void c(boolean z, iu30 iu30Var, qim0 qim0Var, max maxVar, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        max maxVar2;
        boolean z2;
        qim0 qim0Var3;
        max maxVar3;
        idn0 idn0Var2;
        h311 h311VarV;
        int i4;
        jax jaxVar;
        qim0 qim0Var4;
        idn0 idn0VarY;
        int i5;
        max maxVar4;
        afx afxVarA;
        boolean zG;
        Object objT;
        tad1 tad1Var;
        long jB;
        boolean zI;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1649866362);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    maxVar2 = maxVar;
                    int i7 = x340Var.i(maxVar2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    maxVar2 = maxVar;
                }
                i3 |= i7;
            } else {
                maxVar2 = maxVar;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                i4 = i & 1;
                jaxVar = jax.a;
                if (i4 != 0 || x340Var.E()) {
                    if (i6 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        maxVar2 = jaxVar;
                    }
                    idn0VarY = zso1.Y(x340Var);
                    max maxVar5 = maxVar2;
                    i5 = i3 & (-57345);
                    maxVar4 = maxVar5;
                } else {
                    x340Var.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    max maxVar6 = maxVar2;
                    i5 = i3 & (-57345);
                    maxVar4 = maxVar6;
                    qim0Var4 = qim0Var2;
                    idn0VarY = idn0Var;
                }
                x340Var.s();
                uwr uwrVar = cbx.a;
                afxVarA = cbx.a(x340Var);
                zG = x340Var.g(afxVarA);
                objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    icx icxVar = afxVarA.a;
                    yxx yxxVar = afxVarA.b;
                    long j = icxVar.c;
                    long j2 = yxxVar.f;
                    long j3 = yxxVar.a;
                    long j4 = yxxVar.b;
                    long jA = icxVar.b.a();
                    long j5 = yxxVar.b;
                    long j6 = icxVar.c;
                    long jB2 = u7h.b(yxxVar.f, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                    int i8 = u7h.l;
                    tad1 tad1Var2 = new tad1(j, j2, j2, j3, j4, jA, j5, j5, j6, jB2, nfb.o(), u7h.b(yxxVar.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(yxxVar.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), icxVar.b.a(), u7h.b(yxxVar.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(yxxVar.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
                    x340Var.s0(tad1Var2);
                    objT = tad1Var2;
                }
                tad1Var = (tad1) objT;
                if (z) {
                    jB = tad1Var.a();
                } else {
                    jB = tad1Var.b();
                }
                long j7 = jB;
                idn0 idn0Var3 = idn0VarY;
                qim0 qim0Var5 = qim0Var4;
                qim0 qim0VarB = py20.b(qim0Var5, idn0Var3, j7, er31.a, null, x340Var, 0, 24);
                zI = x340Var.i(maxVar4);
                objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new rxx(maxVar4, (byte) 0);
                    x340Var.s0(objT2);
                }
                idn0Var2 = idn0Var3;
                ljo1.j(z, iu30Var, s161.b(qim0VarB, false, (iu30) objT2), u890.j(maxVar4, jaxVar), tad1Var, idn0Var2, x340Var, i5 & 126, 8);
                qim0Var3 = qim0Var5;
                maxVar3 = maxVar4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                maxVar3 = maxVar2;
                idn0Var2 = idn0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(z, iu30Var, qim0Var3, maxVar3, idn0Var2, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                maxVar2 = maxVar;
                if (x340Var.i(maxVar2)) {
                }
                i3 |= i7;
            } else {
                maxVar2 = maxVar;
            }
            i3 |= i7;
        } else {
            maxVar2 = maxVar;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            i4 = i & 1;
            jaxVar = jax.a;
            if (i4 != 0) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    maxVar2 = jaxVar;
                }
                idn0VarY = zso1.Y(x340Var);
                max maxVar7 = maxVar2;
                i5 = i3 & (-57345);
                maxVar4 = maxVar7;
            } else {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    maxVar2 = jaxVar;
                }
                idn0VarY = zso1.Y(x340Var);
                max maxVar8 = maxVar2;
                i5 = i3 & (-57345);
                maxVar4 = maxVar8;
            }
            x340Var.s();
            uwr uwrVar2 = cbx.a;
            afxVarA = cbx.a(x340Var);
            zG = x340Var.g(afxVarA);
            objT = x340Var.T();
            if (zG) {
                icx icxVar2 = afxVarA.a;
                yxx yxxVar2 = afxVarA.b;
                long j8 = icxVar2.c;
                long j9 = yxxVar2.f;
                long j10 = yxxVar2.a;
                long j11 = yxxVar2.b;
                long jA2 = icxVar2.b.a();
                long j12 = yxxVar2.b;
                long j13 = icxVar2.c;
                long jB3 = u7h.b(yxxVar2.f, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                int i9 = u7h.l;
                tad1 tad1Var3 = new tad1(j8, j9, j9, j10, j11, jA2, j12, j12, j13, jB3, nfb.o(), u7h.b(yxxVar2.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(yxxVar2.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), icxVar2.b.a(), u7h.b(yxxVar2.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(yxxVar2.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
                x340Var.s0(tad1Var3);
                objT = tad1Var3;
            } else {
                icx icxVar3 = afxVarA.a;
                yxx yxxVar3 = afxVarA.b;
                long j14 = icxVar3.c;
                long j15 = yxxVar3.f;
                long j16 = yxxVar3.a;
                long j17 = yxxVar3.b;
                long jA3 = icxVar3.b.a();
                long j18 = yxxVar3.b;
                long j19 = icxVar3.c;
                long jB4 = u7h.b(yxxVar3.f, 0.3f, 0.0f, 0.0f, 0.0f, 14);
                int i10 = u7h.l;
                tad1 tad1Var4 = new tad1(j14, j15, j15, j16, j17, jA3, j18, j18, j19, jB4, nfb.o(), u7h.b(yxxVar3.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(yxxVar3.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), icxVar3.b.a(), u7h.b(yxxVar3.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(yxxVar3.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0);
                x340Var.s0(tad1Var4);
                objT = tad1Var4;
            }
            tad1Var = (tad1) objT;
            if (z) {
                jB = tad1Var.a();
            } else {
                jB = tad1Var.b();
            }
            long j20 = jB;
            idn0 idn0Var4 = idn0VarY;
            qim0 qim0Var6 = qim0Var4;
            qim0 qim0VarB2 = py20.b(qim0Var6, idn0Var4, j20, er31.a, null, x340Var, 0, 24);
            zI = x340Var.i(maxVar4);
            objT2 = x340Var.T();
            if (zI) {
                objT2 = new rxx(maxVar4, (byte) 0);
                x340Var.s0(objT2);
            } else {
                objT2 = new rxx(maxVar4, (byte) 0);
                x340Var.s0(objT2);
            }
            idn0Var2 = idn0Var4;
            ljo1.j(z, iu30Var, s161.b(qim0VarB2, false, (iu30) objT2), u890.j(maxVar4, jaxVar), tad1Var, idn0Var2, x340Var, i5 & 126, 8);
            qim0Var3 = qim0Var6;
            maxVar3 = maxVar4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            maxVar3 = maxVar2;
            idn0Var2 = idn0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(z, iu30Var, qim0Var3, maxVar3, idn0Var2, i, i2);
        }
    }

    public static final void d(dt71 dt71Var, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
        qim0 qim0Var2;
        Object wkk0Var;
        Throwable th;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1180146346);
        int i2 = (x340Var.i(dt71Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = xto.t(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zI = x340Var.i(dt71Var) | x340Var.i(ven0Var2) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                th = null;
                wkk0Var = new wkk0(dt71Var, ven0Var2, ven0Var, (lnm) null, (byte) 16);
                x340Var.s0(wkk0Var);
            } else {
                wkk0Var = objT3;
                th = null;
            }
            qxd0.t(dt71Var, x340Var, (vu30) wkk0Var);
            boolean zH = x340Var.h(((Boolean) ven0Var.getValue()).booleanValue()) | x340Var.h(((Boolean) ven0Var2.getValue()).booleanValue());
            Object objT4 = x340Var.T();
            if (zH || objT4 == m4cVar) {
                objT4 = xto.t(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) objT4;
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) ven0Var2.getValue();
            bool2.getClass();
            boolean zI2 = x340Var.i(ven0Var) | x340Var.i(ven0Var3);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new pg6(ven0Var, ven0Var3, th, (byte) 5);
                x340Var.s0(objT5);
            }
            qxd0.s(bool, bool2, (vu30) objT5, x340Var);
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
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
            x340Var = x340Var;
            fq7.g(((Boolean) ven0Var3.getValue()).booleanValue(), (qim0) null, xay.e(2, irn1.l0(0.0f, 10000.0f, th, 5)).a(xay.g(0.5f, 4, 0L, irn1.l0(0.0f, 1500.0f, th, 5))), xay.f(2, irn1.l0(0.0f, 10000.0f, th, 5)).a(xay.h(irn1.l0(0.0f, 1500.0f, th, 5), 0L, 4)), (String) null, apo.r(-1998422776, new nf0(ven0Var2, (byte) 6), x340Var), x340Var, 196608, 18);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(dt71Var, qim0Var2, i, (byte) 21);
        }
    }

    public static final n511 e(long j, long j2) {
        return new n511(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final n511 f(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new n511(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final n511 g(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new n511(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void h(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static void i(String str, eic eicVar, dil dilVar, ril rilVar, ynb1 ynb1Var) {
        long j;
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strC = eicVar.C(str);
                dil dilVarB = strC.equals("parent") ? ynb1Var.b(0) : ynb1Var.b(strC);
                dilVar.R(dilVarB);
                dilVar.l(dilVarB);
                break;
            case "center":
                String strC2 = eicVar.C(str);
                dil dilVarB2 = strC2.equals("parent") ? ynb1Var.b(0) : ynb1Var.b(strC2);
                dilVar.O(dilVarB2);
                dilVar.r(dilVarB2);
                dilVar.R(dilVarB2);
                dilVar.l(dilVarB2);
                break;
            case "custom":
                eic eicVarY = eicVar.y(str);
                if (eicVarY != null) {
                    for (String str2 : eicVarY.H()) {
                        aic aicVarS = eicVarY.s(str2);
                        if (aicVarS instanceof cic) {
                            dilVar.e(str2, aicVarS.e());
                        } else if (aicVarS instanceof gic) {
                            String strD = aicVarS.d();
                            if (strD.startsWith("#")) {
                                String strSubstring = strD.substring(1);
                                if (strSubstring.length() == 6) {
                                    strSubstring = "FF".concat(strSubstring);
                                }
                                j = Long.parseLong(strSubstring, 16);
                            } else {
                                j = -1;
                            }
                            if (j != -1) {
                                dilVar.d((int) j, str2);
                            }
                        }
                    }
                    break;
                }
                break;
            case "rotationX":
                dilVar.F(rilVar.a(eicVar.s(str)));
                break;
            case "rotationY":
                dilVar.G(rilVar.a(eicVar.s(str)));
                break;
            case "rotationZ":
                dilVar.H(rilVar.a(eicVar.s(str)));
                break;
            case "translationX":
                dilVar.S(rilVar.a(eicVar.s(str)));
                break;
            case "translationY":
                dilVar.T(rilVar.a(eicVar.s(str)));
                break;
            case "translationZ":
                dilVar.U(rilVar.a(eicVar.s(str)));
                break;
            case "height":
                dilVar.K(H(eicVar, str, ynb1Var, ynb1Var.d()));
                break;
            case "motion":
                eic eicVarS = eicVar.s(str);
                if (eicVarS instanceof eic) {
                    eic eicVar2 = eicVarS;
                    r1h1 r1h1Var = new r1h1();
                    for (String str3 : eicVar2.H()) {
                        str3.getClass();
                        switch (str3) {
                            case "stagger":
                                r1h1Var.a(eicVar2.v(str3), 600);
                                break;
                            case "easing":
                                r1h1Var.c(603, eicVar2.C(str3));
                                break;
                            case "quantize":
                                yhc yhcVarS = eicVar2.s(str3);
                                if (!(yhcVarS instanceof yhc)) {
                                    r1h1Var.b(610, eicVar2.x(str3));
                                    break;
                                } else {
                                    yhc yhcVar = yhcVarS;
                                    int size = yhcVar.size();
                                    if (size > 0) {
                                        r1h1Var.b(610, yhcVar.w(0));
                                        if (size > 1) {
                                            r1h1Var.c(611, yhcVar.B(1));
                                            if (size > 2) {
                                                r1h1Var.a(yhcVar.u(2), 602);
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            case "pathArc":
                                String strC3 = eicVar2.C(str3);
                                String[] strArr = {IdHelperAndroid.NO_ID_AVAILABLE, "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i = 0;
                                while (true) {
                                    if (i >= 6) {
                                        i = -1;
                                    } else if (!strArr[i].equals(strC3)) {
                                        i++;
                                    }
                                }
                                if (i != -1) {
                                    r1h1Var.b(607, i);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + strC3 + "'");
                                    break;
                                }
                                break;
                            case "relativeTo":
                                r1h1Var.c(605, eicVar2.C(str3));
                                break;
                        }
                    }
                    dilVar.getClass();
                    break;
                }
                break;
            case "pivotX":
                dilVar.B(rilVar.a(eicVar.s(str)));
                break;
            case "pivotY":
                dilVar.C(rilVar.a(eicVar.s(str)));
                break;
            case "scaleX":
                dilVar.I(rilVar.a(eicVar.s(str)));
                break;
            case "scaleY":
                dilVar.J(rilVar.a(eicVar.s(str)));
                break;
            case "hRtlBias":
                float fA = rilVar.a(eicVar.s(str));
                if (!ynb1Var.i()) {
                    fA = 1.0f - fA;
                }
                dilVar.u(fA);
                break;
            case "vWeight":
                dilVar.M(rilVar.a(eicVar.s(str)));
                break;
            case "alpha":
                dilVar.f(rilVar.a(eicVar.s(str)));
                break;
            case "hBias":
                dilVar.u(rilVar.a(eicVar.s(str)));
                break;
            case "vBias":
                dilVar.V(rilVar.a(eicVar.s(str)));
                break;
            case "width":
                dilVar.N(H(eicVar, str, ynb1Var, ynb1Var.d()));
                break;
            case "hWeight":
                dilVar.L(rilVar.a(eicVar.s(str)));
                break;
            case "centerHorizontally":
                String strC4 = eicVar.C(str);
                dil dilVarB3 = strC4.equals("parent") ? ynb1Var.b(0) : ynb1Var.b(strC4);
                dilVar.O(dilVarB3);
                dilVar.r(dilVarB3);
                break;
            case "visibility":
                switch (eicVar.C(str)) {
                    case "invisible":
                        dilVar.W(4);
                        break;
                    case "gone":
                        dilVar.W(8);
                        break;
                    case "visible":
                        dilVar.W(0);
                        break;
                }
                break;
            default:
                G(str, eicVar, dilVar, rilVar, ynb1Var);
                break;
        }
    }

    public static final h661 l(kl1 kl1Var, h661 h661Var) {
        h661 h661VarL;
        if (u890.j(h661Var.getKind(), k661.h)) {
            h661 h661VarB = ltn1.B(kl1Var, h661Var);
            if (h661VarB != null && (h661VarL = l(kl1Var, h661VarB)) != null) {
                return h661VarL;
            }
        } else if (h661Var.isInline()) {
            return l(kl1Var, h661Var.g(0));
        }
        return h661Var;
    }

    public static int m(Context context) {
        long j;
        int i;
        int i2;
        long jC = tm80.C(context);
        int i3 = 2011;
        if (jC != -1) {
            if (jC <= 805306368) {
                return tm80.B() <= 1 ? 2009 : 2010;
            }
            if (jC > 1073741824) {
                if (jC <= 1610612736) {
                    if (tm80.z() < 1800000) {
                    }
                } else if (jC > 2147483648L) {
                    if (jC <= 3221225472L) {
                        return 2014;
                    }
                    return jC <= 5368709120L ? 2015 : 2016;
                }
                return 2013;
            }
            if (tm80.z() < 1300000) {
                return 2011;
            }
            return 2012;
        }
        ArrayList arrayList = new ArrayList();
        int iB = tm80.B();
        if (iB < 1) {
            j = -1;
            i = -1;
        } else if (iB == 1) {
            j = -1;
            i = 2008;
        } else {
            j = -1;
            i = iB <= 3 ? 2011 : 2012;
        }
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
        long jZ = tm80.z();
        if (jZ == j) {
            i2 = -1;
        } else if (jZ <= 528000) {
            i2 = 2008;
        } else if (jZ <= 620000) {
            i2 = 2009;
        } else if (jZ <= 1020000) {
            i2 = 2010;
        } else if (jZ <= 1220000) {
            i2 = 2011;
        } else if (jZ <= 1520000) {
            i2 = 2012;
        } else {
            i2 = jZ <= 2020000 ? 2013 : 2014;
        }
        if (i2 != -1) {
            arrayList.add(Integer.valueOf(i2));
        }
        long jC2 = tm80.C(context);
        if (jC2 <= 0) {
            i3 = -1;
        } else if (jC2 <= 201326592) {
            i3 = 2008;
        } else if (jC2 <= 304087040) {
            i3 = 2009;
        } else if (jC2 <= 536870912) {
            i3 = 2010;
        } else if (jC2 > 1073741824) {
            if (jC2 <= 1610612736) {
                i3 = 2012;
            } else {
                i3 = jC2 <= 2147483648L ? 2013 : 2014;
            }
        }
        if (i3 != -1) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i4 = size - 1;
        return ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i4)).intValue()) / 2) + ((Integer) arrayList.get(i4)).intValue();
    }

    public static final void n(int i, int i2) {
        if (i == i2) {
            return;
        }
        hhg1.n(l1d.j(i, i2, "Class declares ", " type parameters, but ", " were provided."));
    }

    public static long[] p(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        dm5.j(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static ArrayList q(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        List<md50> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (md50 md50Var : list2) {
            arrayList.add(new pd50(httpURLConnection, null, null, new lf10(facebookException)));
        }
        return arrayList;
    }

    public static oi r(int i, int i2, int i3, int i4) {
        return new oi(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static pd50 s(md50 md50Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        xd xdVar;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            lf10 lf10VarX = q3c.x(jSONObject, obj2);
            if (lf10VarX != null) {
                lf10VarX.toString();
                if (lf10VarX.b == 190 && (xdVar = md50Var.a) != null) {
                    Date date = xd.Y;
                    if (xdVar.equals(fuo1.s())) {
                        if (lf10VarX.c != 493) {
                            fuo1.y((xd) null);
                        } else {
                            xd xdVarS = fuo1.s();
                            if (xdVarS != null && !new Date().after(xdVarS.a)) {
                                fuo1.r();
                            }
                        }
                    }
                }
                return new pd50(httpURLConnection, null, null, lf10VarX);
            }
            Object objR = fpi1.r("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
            if (objR instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) objR;
                jSONObject2.toString();
                return new pd50(httpURLConnection, jSONObject2, null, null);
            }
            if (objR instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objR;
                jSONArray.toString();
                return new pd50(httpURLConnection, null, jSONArray, null);
            }
            obj = JSONObject.NULL;
        }
        if (obj != JSONObject.NULL) {
            throw new FacebookException("Got unexpected object type in response, class: ".concat(obj.getClass().getSimpleName()));
        }
        obj.toString();
        return new pd50(httpURLConnection, null, null, null);
    }

    public static ArrayList t(InputStream inputStream, HttpURLConnection httpURLConnection, od50 od50Var) throws JSONException {
        Object obj;
        String strH = fpi1.H(inputStream);
        fza fzaVar = oue0.a;
        fza.f(zue0.b);
        Object objNextValue = new JSONTokener(strH).nextValue();
        int size = od50Var.b.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            od50Var.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", objNextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e) {
                arrayList.add(new pd50(httpURLConnection, null, null, new lf10(e)));
                obj = objNextValue;
            } catch (JSONException e2) {
                arrayList.add(new pd50(httpURLConnection, null, null, new lf10(e2)));
                obj = objNextValue;
            }
        } else {
            obj = objNextValue;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.add(s((md50) od50Var.get(i), httpURLConnection, ((JSONArray) obj).get(i), objNextValue));
                    } catch (FacebookException e3) {
                        arrayList.add(new pd50(httpURLConnection, null, null, new lf10(e3)));
                    } catch (JSONException e4) {
                        arrayList.add(new pd50(httpURLConnection, null, null, new lf10(e4)));
                    }
                }
                fza fzaVar2 = oue0.a;
                fza.f(zue0.a);
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    public static b7 u(jla0 jla0Var, ArrayList arrayList, int i) {
        int i2 = i & 1;
        ArrayList arrayList2 = z6x.a;
        if (i2 != 0) {
            arrayList = arrayList2;
        }
        return v(jla0Var, arrayList, false, arrayList2, null);
    }

    public static final b7 v(jla0 jla0Var, List list, boolean z, List list2, tka0 tka0Var) {
        if (oed1.c()) {
            return cpn1.o(jla0Var, list, z);
        }
        tka0 tka0Var2 = jla0Var instanceof tka0 ? (tka0) jla0Var : null;
        List listF = tka0Var2 != null ? mod.f(tka0Var2) : null;
        if (listF == null) {
            listF = z6x.a;
        }
        n(listF.size(), list.size());
        return new ax81(jla0Var, list, z, list2, (oma0) null, false, false, false, tka0Var);
    }

    public static final void w(tw4 tw4Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            w(tw4Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            tw4Var.h((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            dSin2 = dSin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final Object x(bdv0 bdv0Var, String str, onm onmVar) {
        Object objC = bdv0Var.c(str, new p5e1((byte) 16), onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }

    public static int z(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public boolean j(Object obj, Object obj2) {
        uqw uqwVar = (uqw) obj;
        uqw uqwVar2 = (uqw) obj2;
        return (uqwVar instanceof uqw) && (uqwVar2 instanceof uqw) && uqwVar.b == uqwVar2.b && u890.j(uqwVar.c, uqwVar2.c);
    }

    public boolean k(Object obj, Object obj2) {
        uqw uqwVar = (uqw) obj;
        uqw uqwVar2 = (uqw) obj2;
        return (uqwVar instanceof uqw) && (uqwVar2 instanceof uqw) && uqwVar.b == uqwVar2.b && u890.j(uqwVar.d, uqwVar2.d);
    }

    public abstract List o(String str, List list);

    public Object y(Object obj, Object obj2) {
        return null;
    }
}
