package p;

import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.mobius.Next;
import com.spotify.performancesdk.observationplatform.proto.ObservationPlatformProto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mod {
    public static final int[] a = {-16842910};
    public static final int[] b = new int[0];
    public static b180 c;
    public static b180 d;

    public static final void a(jy2 jy2Var, ycc1 ycc1Var, yok0 yok0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(348147368);
        int i3 = i | (x340Var.g(jy2Var) ? 4 : 2) | (x340Var.i(ycc1Var) ? 32 : 16) | (x340Var.i(yok0Var) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(function0) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            String str = jy2Var.a;
            if (str == null) {
                x340Var.i0(436976577);
                x340Var.r(false);
                i2 = i3;
                z = false;
            } else {
                x340Var.i0(436976578);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).e;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarN = anm1.N("AgentsBottomSheetTitle", nim0Var);
                cvx cvxVar = cbx.b(x340Var).b;
                i2 = i3;
                uwo1.e(str, uyn1.x(qim0VarN, 16.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1720);
                x340Var = x340Var;
                qim0 qim0VarF = dug.f(u291.f(u291.h(anm1.N("AgentsBottomSheetDivider", nim0Var), 1.0f), 1.0f), cbx.a(x340Var).a.b.c(), d4o1.a);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, uyn1.z(0.0f, 4.0f, 1, qim0VarF));
                z = false;
                x340Var.r(false);
            }
            boolean zI = x340Var.i(yok0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new jm1(yok0Var, (byte) 15);
                x340Var.s0(objT);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT);
            boolean z2 = (i2 & 14) != 4 ? z : true;
            if ((i2 & 57344) == 16384) {
                z = true;
            }
            boolean zI2 = z | z2 | x340Var.i(ycc1Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new t6(jy2Var, function0, ycc1Var, (byte) 8);
                x340Var.s0(objT2);
            }
            s3o1.d((qim0) null, (xtb0) null, (vzq0) null, (g36) null, (nl3) null, (iq20) null, false, h3h1Var, (iu30) objT2, x340Var, 0, 255);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m(jy2Var, ycc1Var, yok0Var, qim0Var, function0, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void b(ely0 ely0Var, vu30 vu30Var, b0k b0kVar, int i) {
        boolean z;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-149765515);
        up20 up20Var = x340Var.x;
        xos0 xos0VarM = x340Var.m();
        x340Var.e0(201, g0k.b);
        Object objT = x340Var.T();
        osi1 osi1Var = u890.j(objT, fkj0.X) ? null : (osi1) objT;
        xky0 xky0Var = ely0Var.a;
        osi1 osi1VarD = xky0Var.d(ely0Var, osi1Var);
        boolean zEquals = osi1VarD.equals(osi1Var);
        if (!zEquals) {
            x340Var.s0(osi1VarD);
        }
        if (!x340Var.S) {
            ye91 ye91Var = x340Var.G;
            xos0 xos0Var = (xos0) ye91Var.b(ye91Var.g, ye91Var.b);
            if (!(x340Var.H() && zEquals) && (ely0Var.g || !xos0VarM.containsKey(xky0Var))) {
                xos0VarM = xos0VarM.h(xky0Var, osi1VarD);
            } else if ((zEquals && !x340Var.w) || !x340Var.w) {
                xos0VarM = xos0Var;
            }
            if (x340Var.y || xos0Var != xos0VarM) {
                z = true;
            }
            if (z && !x340Var.S) {
                x340Var.R(xos0VarM);
            }
            up20Var.h(x340Var.w ? 1 : 0);
            x340Var.w = z;
            x340Var.K = xos0VarM;
            x340Var.c0(g0k.c, 202, 0, xos0VarM);
            us71.k((i >> 3) & 14, vu30Var, x340Var, false, false);
            x340Var.w = up20Var.g() != 0;
            x340Var.K = null;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cf5(ely0Var, vu30Var, i, (byte) 3);
            }
        }
        if (ely0Var.g || !xos0VarM.containsKey(xky0Var)) {
            xos0VarM = xos0VarM.h(xky0Var, osi1VarD);
        }
        x340Var.J = true;
        z = false;
        if (z) {
            x340Var.R(xos0VarM);
        }
        up20Var.h(x340Var.w ? 1 : 0);
        x340Var.w = z;
        x340Var.K = xos0VarM;
        x340Var.c0(g0k.c, 202, 0, xos0VarM);
        us71.k((i >> 3) & 14, vu30Var, x340Var, false, false);
        x340Var.w = up20Var.g() != 0;
        x340Var.K = null;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(ely0Var, vu30Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static final void c(ely0[] ely0VarArr, vu30 vu30Var, b0k b0kVar, int i) {
        xos0 xos0VarH;
        boolean z;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(415205898);
        up20 up20Var = x340Var.x;
        xos0 xos0VarM = x340Var.m();
        x340Var.e0(201, g0k.b);
        boolean z2 = x340Var.S;
        fjq0 fjq0Var = g0k.d;
        if (z2) {
            xos0 xos0VarC = d7e.C(ely0VarArr, xos0VarM, xos0.e);
            xos0VarM.getClass();
            wos0 wos0Var = new wos0(xos0VarM);
            wos0Var.g = xos0VarM;
            wos0Var.putAll(xos0VarC);
            xos0VarH = wos0Var.h();
            x340Var.e0(204, fjq0Var);
            x340Var.L();
            x340Var.t0(xos0VarH);
            x340Var.L();
            x340Var.t0(xos0VarC);
            x340Var.r(false);
            x340Var.J = true;
        } else {
            ye91 ye91Var = x340Var.G;
            xos0 xos0Var = (xos0) ye91Var.h(ye91Var.g, 0);
            ye91 ye91Var2 = x340Var.G;
            xos0 xos0Var2 = (xos0) ye91Var2.h(ye91Var2.g, 1);
            xos0 xos0VarC2 = d7e.C(ely0VarArr, xos0VarM, xos0Var2);
            if (!x340Var.H() || x340Var.y || !xos0Var2.equals(xos0VarC2)) {
                xos0VarM.getClass();
                wos0 wos0Var2 = new wos0(xos0VarM);
                wos0Var2.g = xos0VarM;
                wos0Var2.putAll(xos0VarC2);
                xos0VarH = wos0Var2.h();
                x340Var.e0(204, fjq0Var);
                x340Var.L();
                x340Var.t0(xos0VarH);
                x340Var.L();
                x340Var.t0(xos0VarC2);
                x340Var.r(false);
                if (x340Var.y || !u890.j(xos0VarH, xos0Var)) {
                    z = true;
                }
                if (z && !x340Var.S) {
                    x340Var.R(xos0VarH);
                }
                up20Var.h(x340Var.w ? 1 : 0);
                x340Var.w = z;
                x340Var.K = xos0VarH;
                x340Var.c0(g0k.c, 202, 0, xos0VarH);
                us71.k((i >> 3) & 14, vu30Var, x340Var, false, false);
                x340Var.w = up20Var.g() != 0;
                x340Var.K = null;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cf5(ely0VarArr, vu30Var, i, (byte) 4);
                }
            }
            x340Var.l = x340Var.G.s() + x340Var.l;
            xos0VarH = xos0Var;
        }
        z = false;
        if (z) {
            x340Var.R(xos0VarH);
        }
        up20Var.h(x340Var.w ? 1 : 0);
        x340Var.w = z;
        x340Var.K = xos0VarH;
        x340Var.c0(g0k.c, 202, 0, xos0VarH);
        us71.k((i >> 3) & 14, vu30Var, x340Var, false, false);
        x340Var.w = up20Var.g() != 0;
        x340Var.K = null;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cf5(ely0VarArr, vu30Var, i, (byte) 4);
        }
    }

    public static final void d(l1f1 l1f1Var, qim0 qim0Var, float f, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        l1f1 l1f1Var2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1953835583);
        int i2 = i | 48 | (x340Var2.d(f) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var2.i(function0) ? SemanticState.Modal : SemanticState.ReadOnly);
        boolean z = false;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float f2 = 56.0f * f;
            qim0Var2 = nim0.a;
            qim0 qim0VarA = u291.a(qim0Var2, f2, f2);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = bin.x(dug.f(qim0VarA, u7h.b(cbx.a(x340Var2).a.c, 0.54f, 0.0f, 0.0f, 0.0f, 14), er31.b(12.0f)), false, (String) null, (pm31) null, (idn0) null, function0, 15);
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 8.0f * f, 12.0f * f);
            era eraVar = een.Q0;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(4.0f * f, true, new um5(z)), eraVar, x340Var2, 0);
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
            j2iVar.invoke(x340Var2, 6);
            l1f1Var2 = l1f1Var;
            uwo1.e(cwl1.o0(x340Var2, l1f1Var2.a), (qim0) null, cbx.d(x340Var2).m, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            l1f1Var2 = l1f1Var;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e0a(l1f1Var2, qim0Var2, f, function0, j2iVar, i);
        }
    }

    public static final void e(cce cceVar, dbp dbpVar, vy71 vy71Var, boolean z, z0i z0iVar, z0i z0iVar2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(827627243);
        int i2 = i | (b0kVar3.i(cceVar) ? 4 : 2) | (b0kVar3.g(dbpVar) ? 32 : 16) | (b0kVar3.i(vy71Var) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.h(z) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar3.i(z0iVar) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (b0kVar3.i(z0iVar2) ? 131072 : 65536) | (b0kVar3.i(function0) ? 1048576 : 524288) | 12582912;
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zI = vy71Var.i();
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            dem0.a(function0, qim0Var3, vy71Var, 0.0f, false, er31.d(12.0f, 12.0f, 0.0f, 0.0f, 12), jA, 0L, 0.0f, 0L, apo.r(-199174250, new ov51((byte) 8, z), b0kVar3), (vu30) null, (eem0) null, apo.r(1330565321, new hh1(z0iVar2, cceVar, dbpVar, z0iVar, zI, (byte) 18), b0kVar3), b0kVar2, ((i2 >> 18) & 126) | (i2 & 896), 3078, 7064);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(cceVar, dbpVar, vy71Var, z, z0iVar, z0iVar2, function0, qim0Var2, i);
        }
    }

    public static final List f(tka0 tka0Var) {
        return z561.k0(z561.Y(ye3.Z, z561.c0(ye3.Y, tka0Var)));
    }

    public static final kiv g(n4k n4kVar) {
        return new kiv(n4kVar, (byte) 0);
    }

    public static kiv h(Function0 function0) {
        return new kiv(function0, (byte) 0);
    }

    public static final k5k i(iu30 iu30Var) {
        return new k5k(iu30Var);
    }

    public static ouz j(String str, String str2) {
        return new ouz(new rm5(str, str2), (byte) 17);
    }

    public static final y48 k(Transport transport) {
        return new y48(transport);
    }

    public static final phc l(List list) {
        zhp0 zhp0VarO = ObservationPlatformProto.TimeSeries.o();
        List<jpj0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (jpj0 jpj0Var : list2) {
            whp0 whp0VarN = ObservationPlatformProto.Point.n();
            jpj0Var.getClass();
            whp0VarN.r(0.0d);
            whp0VarN.q(0L);
            arrayList.add(whp0VarN.build());
        }
        zhp0VarO.n(arrayList);
        return zhp0VarO.build().toByteString();
    }

    public static String m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            wf10 wf10Var = wf10.a;
        }
        return jSONObject.toString();
    }

    public static int n() {
        return wbx0.h();
    }

    public static void o() {
        synchronized (rm5.j()) {
            dhn.a.contains(rm5.class);
        }
    }

    public static l6s p(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            if (strOptString2.length() != 0 && !strOptString2.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(strOptString2);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(strOptString2);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        l6s l6sVar = new l6s();
        l6sVar.a = arrayList;
        l6sVar.b = arrayList2;
        l6sVar.c = arrayList3;
        return l6sVar;
    }

    public static qoz0 q(long j, float f, float f2, mmr0[] mmr0VarArr) {
        ArrayList arrayList = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var : mmr0VarArr) {
            arrayList.add(new mmr0(Float.valueOf(((Number) mmr0Var.a).floatValue()), new u7h(u7h.b(j, ((Number) mmr0Var.b).floatValue(), 0.0f, 0.0f, 0.0f, 14))));
        }
        mmr0[] mmr0VarArr2 = (mmr0[]) arrayList.toArray(new mmr0[0]);
        return v9c.p((mmr0[]) Arrays.copyOf(mmr0VarArr2, mmr0VarArr2.length), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (float) Math.hypot(Math.max(f, 1.0f - f), Math.max(f2, 1.0f - f2)), 8);
    }

    public static brl0 r() {
        return new brl0((byte) 12);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:5:0x0010, B:7:0x0018, B:10:0x001f, B:11:0x0027, B:13:0x002d, B:18:0x004f, B:25:0x0064, B:28:0x006a, B:29:0x006d, B:31:0x0085, B:34:0x008f, B:36:0x00a0, B:41:0x00da, B:44:0x00e8, B:47:0x00f8, B:49:0x0100, B:56:0x0127, B:50:0x0104, B:52:0x0108, B:54:0x0114, B:55:0x011f, B:37:0x00a9, B:38:0x00b1, B:40:0x00ca, B:43:0x00e6, B:57:0x0130, B:58:0x0135, B:64:0x0151, B:61:0x0142), top: B:70:0x0010, inners: #0 }] */
    public static void s(HashMap map) {
        String[] strArr;
        List listX;
        ConcurrentHashMap concurrentHashMap = h8i1.e;
        h8i1 h8i1Var = h8i1.a;
        if (dhn.a.contains(h8i1.class)) {
            return;
        }
        try {
            if (!h8i1.c.get()) {
                h8i1Var.b();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = u890.q(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String strQ = fpi1.Q(h8i1Var.c(str, str2.subSequence(i, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 != null) {
                        Pattern patternCompile = Pattern.compile(",");
                        ihc1.N0(0);
                        Matcher matcher = patternCompile.matcher(str3);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList.add(str3.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList.add(str3.subSequence(iEnd, str3.length()).toString());
                            listX = arrayList;
                        } else {
                            listX = k4p1.x(str3.toString());
                        }
                        strArr = (String[]) listX.toArray(new String[0]);
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                    } else {
                        strArr = new String[0];
                    }
                    Set setW0 = dm61.w0(Arrays.copyOf(strArr, strArr.length));
                    if (setW0.contains(strQ)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strQ);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(",");
                        sb.append(strQ);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(strArr[i2]);
                            sb.append(",");
                        }
                        sb.append(strQ);
                        setW0.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, strQ);
                }
            }
            String strC = fpi1.C(concurrentHashMap);
            if (dhn.a.contains(h8i1Var)) {
                return;
            }
            try {
                wf10.c().execute(new vwg(strC, (byte) 2));
            } catch (Throwable th) {
                dhn.a(h8i1Var, th);
            }
        } catch (Throwable th2) {
            dhn.a(h8i1.class, th2);
        }
    }

    public static final kiv t(Function0 function0) {
        return new kiv(function0, (byte) 1);
    }

    public static final sxk u(xk41 xk41Var) {
        int i;
        int iC = l1d.C(xk41Var.a);
        int i2 = 4;
        if (iC == 0) {
            i = 1;
        } else if (iC == 1) {
            i = 2;
        } else if (iC == 2) {
            i = 3;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            i = 4;
        }
        n7r n7rVar = xk41Var.b;
        if (n7rVar != null) {
            switch (n7rVar.ordinal()) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                default:
                    eg.o();
                    return null;
            }
        } else {
            i2 = 0;
        }
        return new sxk(i, i2);
    }

    public static Next v(kak0 kak0Var, h2k0 h2k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(lhg1Var.a, (buk1) null, (hez) null, new fa20(h2k0Var.a), (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) null, (ox30) null, (x6b) null, 59383), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -8650753, 1048575)), kak0Var))), 3);
    }
}
