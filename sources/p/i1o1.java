package p;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.watchfeed.component.model.v1.proto.HeaderOverrides;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i1o1 {
    public static b180 a;

    public static final void A(mjm mjmVar, String str, tv80 tv80Var, Long l) {
        mjmVar.a(str.concat(":dna"), tv80Var, l != null ? mno1.h(new mmr0[]{new mmr0("extra_background_color", Long.valueOf(l.longValue()))}) : null);
    }

    public static t380 B(fy8 fy8Var) {
        String str = (String) fy8Var.b.get("scopes");
        if (str != null) {
            tya1 tya1VarB = tya1.b(",");
            return t380.o(new rya1(new tya1(tya1VarB.c, true, tya1VarB.a, tya1VarB.d), str));
        }
        int i = t380.c;
        return kg11.t;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x0142 A[PHI: r0 r1 r3 r5
      0x0142: PHI (r0v6 p.ven0) = (r0v5 p.ven0), (r0v14 p.ven0) binds: [B:40:0x013f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:40:0x013f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r3v12 int) = (r3v11 int), (r3v14 int) binds: [B:40:0x013f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r5v13 p.xtb0) = (r5v12 p.xtb0), (r5v18 p.xtb0) binds: [B:40:0x013f, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0157, code lost:
    
        if (r5.k(r1, 0, r4) == r14) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(p.wat r16, p.xtb0 r17, p.ven0 r18, p.hdn0 r19, p.ven0 r20, p.ven0 r21, p.onm r22) throws kotlinx.coroutines.flow.internal.AbortFlowException {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i1o1.C(p.wat, p.xtb0, p.ven0, p.hdn0, p.ven0, p.ven0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[LOOP:1: B:32:0x00a4->B:34:0x00ab, LOOP_END] */
    public static final int D(xtb0 xtb0Var, hdn0 hdn0Var, int i) {
        ptb0 ptb0VarH;
        int i2;
        int i3;
        lr80 it;
        int iIntValue;
        int iS = ((err0) hdn0Var).s();
        if (iS > 0 && (i2 = (ptb0VarH = xtb0Var.h()).o) != 0) {
            int i4 = i2 - 1;
            List<qtb0> list = ptb0VarH.l;
            int iS2 = zno1.s(q7h.U(list, 10));
            if (iS2 < 16) {
                iS2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS2);
            for (qtb0 qtb0Var : list) {
                linkedHashMap.put(Integer.valueOf(qtb0Var.a), Integer.valueOf(qtb0Var.q));
            }
            if (iS > 0 && linkedHashMap.get(Integer.valueOf(i)) != null) {
                int iIntValue2 = ((Number) sqg0.G(Integer.valueOf(i), linkedHashMap)).intValue();
                Collection tr80Var = new tr80(i + 1, i4, 1);
                if ((tr80Var instanceof Collection) && tr80Var.isEmpty()) {
                    it = tr80Var.iterator();
                    iIntValue = 0;
                    while (((sr80) it).c) {
                        iIntValue += ((Number) sqg0.G(Integer.valueOf(it.nextInt()), linkedHashMap)).intValue();
                    }
                    i3 = iIntValue;
                } else {
                    lr80 it2 = tr80Var.iterator();
                    while (true) {
                        if (!((sr80) it2).c) {
                            it = tr80Var.iterator();
                            iIntValue = 0;
                            while (((sr80) it).c) {
                                iIntValue += ((Number) sqg0.G(Integer.valueOf(it.nextInt()), linkedHashMap)).intValue();
                            }
                            i3 = iIntValue;
                        } else if (!linkedHashMap.containsKey(Integer.valueOf(it2.nextInt()))) {
                            i3 = iS + 1;
                        }
                    }
                }
                int i5 = iS - (iIntValue2 + i3);
                if (i5 >= 0) {
                    return i5;
                }
            }
        }
        return 0;
    }

    public static qim0 E(qim0 qim0Var, xb51 xb51Var, iu30 iu30Var, iu30 iu30Var2) {
        return zr7.i(qim0Var, new kj21(xb51Var, iu30Var, oa41.Q0, iu30Var2, (byte) 5));
    }

    public static final aec F(bec becVar) {
        int iOrdinal = becVar.ordinal();
        return (iOrdinal == 0 || iOrdinal != 1) ? aec.a : aec.b;
    }

    public static final lfc G(mfc mfcVar) {
        int iOrdinal = mfcVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return lfc.b;
            }
            if (iOrdinal == 2) {
                return lfc.c;
            }
        }
        return lfc.a;
    }

    public static final r160 H(HeaderOverrides headerOverrides, l6l1 l6l1Var) {
        Integer numValueOf;
        z0i z0iVarB = l6l1Var.b(headerOverrides.n());
        try {
            numValueOf = Integer.valueOf(Color.parseColor(headerOverrides.q()));
        } catch (Exception unused) {
            numValueOf = null;
        }
        return new r160(z0iVarB, numValueOf, headerOverrides.p(), (ew50) null, false);
    }

    public static final String I(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static byte[] J(String str) {
        byte[] bArr = new byte[19];
        for (int i = 0; i < 19; i++) {
            int i2 = i + i;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                hhg1.n("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static final void a(xtb0 xtb0Var, int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(706329891);
        int i3 = (x340Var.i(xtb0Var) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = x340Var.i(ven0Var) | ((i3 & 112) == 32) | x340Var.i(xtb0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new utb0(i, xtb0Var, ven0Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(xtb0Var, i, i2, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(ksw kswVar, tl7 tl7Var, String str, Function0 function0, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function2;
        boolean z;
        Function0 function3;
        h311 h311VarV;
        Function0 function4;
        ven0 ven0VarS;
        ven0 ven0VarS2;
        boolean zG;
        Object obj;
        cqw cqwVar;
        boolean z2;
        boolean z3;
        Object objT;
        int i4;
        m4c m4cVar = fkj0.X;
        wsw wswVar = kswVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1240821584);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(tl7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function2 = function0;
                i3 |= x340Var.i(function2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(function1)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                ven0VarS = v8r.s(function4, x340Var);
                ven0VarS2 = v8r.s(function1, x340Var);
                zG = x340Var.g(tl7Var) | x340Var.g(wswVar);
                Object objT2 = x340Var.T();
                obj = objT2;
                if (zG || objT2 == m4cVar) {
                    cqw cqwVar2 = new cqw(tl7Var, wswVar, new iwr(ven0VarS, (byte) 13), new iwr(ven0VarS2, (byte) 14));
                    cqwVar2.b(str);
                    wswVar.a(rc11.a.b(tsw.class), cqwVar2);
                    x340Var.s0(cqwVar2);
                    obj = cqwVar2;
                }
                cqwVar = (cqw) obj;
                boolean zI = x340Var.i(cqwVar);
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zI | z2;
                objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new w3w(cqwVar, str, (byte) 1);
                    x340Var.s0(objT);
                }
                qxd0.h(cqwVar, str, (iu30) objT, x340Var);
                function3 = function4;
            } else {
                x340Var.b0();
                function3 = function2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(kswVar, tl7Var, str, function3, function1, i, i2, (byte) 3);
            }
        }
        i3 |= 3072;
        function2 = function0;
        if ((i & 24576) == 0) {
            if (x340Var.i(function1)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i5 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            ven0VarS = v8r.s(function4, x340Var);
            ven0VarS2 = v8r.s(function1, x340Var);
            zG = x340Var.g(tl7Var) | x340Var.g(wswVar);
            Object objT3 = x340Var.T();
            obj = objT3;
            if (zG) {
                cqw cqwVar3 = new cqw(tl7Var, wswVar, new iwr(ven0VarS, (byte) 13), new iwr(ven0VarS2, (byte) 14));
                cqwVar3.b(str);
                wswVar.a(rc11.a.b(tsw.class), cqwVar3);
                x340Var.s0(cqwVar3);
                obj = cqwVar3;
            } else {
                cqw cqwVar4 = new cqw(tl7Var, wswVar, new iwr(ven0VarS, (byte) 13), new iwr(ven0VarS2, (byte) 14));
                cqwVar4.b(str);
                wswVar.a(rc11.a.b(tsw.class), cqwVar4);
                x340Var.s0(cqwVar4);
                obj = cqwVar4;
            }
            cqwVar = (cqw) obj;
            boolean zI2 = x340Var.i(cqwVar);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zI2 | z2;
            objT = x340Var.T();
            if (z3) {
                objT = new w3w(cqwVar, str, (byte) 1);
                x340Var.s0(objT);
            } else {
                objT = new w3w(cqwVar, str, (byte) 1);
                x340Var.s0(objT);
            }
            qxd0.h(cqwVar, str, (iu30) objT, x340Var);
            function3 = function4;
        } else {
            x340Var.b0();
            function3 = function2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(kswVar, tl7Var, str, function3, function1, i, i2, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:75:0x0175  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0239  */
    /* JADX WARN: Code duplicated, block: B:84:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x025a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0264  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void c(vgo1 vgo1Var, cm10 cm10Var, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        fra fraVar;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z3;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        boolean z4;
        boolean z5;
        boolean z6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-486957615);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(vgo1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? x340Var.g(cm10Var) : x340Var.i(cm10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(function1) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                qim0Var4 = nim0.a;
                if (i4 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                qim0 qim0VarZ = uyn1.z(0.0f, 24.0f, 1, u291.f(qim0Var5, 1.0f));
                fraVar = een.N0;
                jw31VarA = ew31.a(h36.g, fraVar, x340Var, 54);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarZ);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z3 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z3) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                if (z) {
                    x340Var.i0(1357607682);
                    g(((i3 >> 12) & 14) | 384, function1, ori.a, x340Var, null);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    z4 = false;
                    x340Var.i0(1357902647);
                    op71.g(x340Var, u291.v(qim0Var4, 32.0f));
                    x340Var.r(false);
                }
                if (vgo1Var instanceof r260) {
                    x340Var.i0(1358006063);
                    String str = ((r260) vgo1Var).c;
                    uwr uwrVar = cbx.a;
                    boolean z7 = z4;
                    qim0Var3 = qim0Var5;
                    uwo1.e(str, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                    x340Var = x340Var;
                    x340Var.r(z7);
                    z6 = true;
                } else {
                    z5 = z4;
                    qim0Var3 = qim0Var5;
                    if (vgo1Var instanceof s260) {
                        x340Var.i0(1358224303);
                        jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var, 48);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0Var4);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(jw31VarA2, x340Var, lljVar);
                        nko1.H(xos0VarM2, x340Var, lljVar2);
                        x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar4);
                        hux huxVar = cm10Var.a;
                        qim0 qim0VarR = u291.r(qim0Var4, 16.0f);
                        uwr uwrVar2 = cbx.a;
                        z6 = true;
                        w0h1.a(huxVar, isl.a, qim0VarR, cbx.a(x340Var).b.a, 0L, false, x340Var, 440, 48);
                        cvx cvxVar = cbx.b(x340Var).b;
                        op71.g(x340Var, u291.v(qim0Var4, 4.0f));
                        uwo1.e(cm10Var.b, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                        x340Var = x340Var;
                        x340Var.i0(676108150);
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        op71.g(x340Var, u291.v(qim0Var4, 6.0f));
                        p9p1.b(null, 1, 2, x340Var, 432, 1);
                        us71.m(x340Var, z5, true, z5);
                    } else {
                        z6 = true;
                        x340Var.i0(1358960429);
                        x340Var.r(z5);
                    }
                }
                g(((i3 >> 9) & 14) | 384, function0, ori.b, x340Var, null);
                x340Var.r(z6);
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(vgo1Var, cm10Var, z, function0, function1, qim0Var3, i, i2);
            }
        }
        i3 |= 196608;
        qim0Var2 = qim0Var;
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            qim0 qim0VarZ2 = uyn1.z(0.0f, 24.0f, 1, u291.f(qim0Var5, 1.0f));
            fraVar = een.N0;
            jw31VarA = ew31.a(h36.g, fraVar, x340Var, 54);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarZ2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z3 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z) {
                x340Var.i0(1357607682);
                g(((i3 >> 12) & 14) | 384, function1, ori.a, x340Var, null);
                z4 = false;
                x340Var.r(false);
            } else {
                z4 = false;
                x340Var.i0(1357902647);
                op71.g(x340Var, u291.v(qim0Var4, 32.0f));
                x340Var.r(false);
            }
            if (vgo1Var instanceof r260) {
                x340Var.i0(1358006063);
                String str2 = ((r260) vgo1Var).c;
                uwr uwrVar3 = cbx.a;
                boolean z8 = z4;
                qim0Var3 = qim0Var5;
                uwo1.e(str2, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(z8);
                z6 = true;
            } else {
                z5 = z4;
                qim0Var3 = qim0Var5;
                if (vgo1Var instanceof s260) {
                    x340Var.i0(1358224303);
                    jw31 jw31VarA3 = ew31.a(h36.a, fraVar, x340Var, 48);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0Var4);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA3, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    hux huxVar2 = cm10Var.a;
                    qim0 qim0VarR2 = u291.r(qim0Var4, 16.0f);
                    uwr uwrVar4 = cbx.a;
                    z6 = true;
                    w0h1.a(huxVar2, isl.a, qim0VarR2, cbx.a(x340Var).b.a, 0L, false, x340Var, 440, 48);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(qim0Var4, 4.0f));
                    uwo1.e(cm10Var.b, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                    x340Var = x340Var;
                    x340Var.i0(676108150);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(qim0Var4, 6.0f));
                    p9p1.b(null, 1, 2, x340Var, 432, 1);
                    us71.m(x340Var, z5, true, z5);
                } else {
                    z6 = true;
                    x340Var.i0(1358960429);
                    x340Var.r(z5);
                }
            }
            g(((i3 >> 9) & 14) | 384, function0, ori.b, x340Var, null);
            x340Var.r(z6);
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(vgo1Var, cm10Var, z, function0, function1, qim0Var3, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0160  */
    /* JADX WARN: Code duplicated, block: B:111:0x017f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0183  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void d(maa maaVar, Object obj, d0r d0rVar, koa0 koa0Var, qim0 qim0Var, vu30 vu30Var, xu30 xu30Var, int i, xu30 xu30Var2, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        qim0 qim0Var2;
        int i5;
        vu30 vu30Var2;
        int i6;
        int i7;
        xu30 xu30Var3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        qim0 qim0Var3;
        vu30 vu30Var3;
        xu30 xu30Var4;
        int i13;
        xu30 xu30Var5;
        h311 h311VarV;
        qim0 qim0Var4;
        vu30 vu30Var4;
        xu30 xu30VarR;
        xu30 xu30Var6;
        ipb1 ipb1VarD;
        hoa0 hoa0Var;
        Object obj2;
        boolean zG;
        Object objT;
        boolean zG2;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(807721805);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(maaVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(d0rVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(koa0Var) ? 2048 : 1024;
        }
        int i14 = i3 & 8;
        if (i14 == 0) {
            if ((i2 & 24576) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 16384 : 8192;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var.i(vu30Var2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((1572864 & i2) == 0) {
                        xu30Var3 = xu30Var;
                        if (x340Var.i(xu30Var3)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    i9 = 12582912 | i4;
                    i10 = i4;
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (x340Var.i(xu30Var2)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i9 |= i12;
                        }
                        if ((i9 & 38347923) != 38347922) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i9 & 1, z)) {
                            if (i14 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                vu30Var4 = blj.c;
                            } else {
                                vu30Var4 = vu30Var2;
                            }
                            if (i7 != 0) {
                                xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                            } else {
                                xu30VarR = xu30Var3;
                            }
                            if (i11 != 0) {
                                xu30Var6 = blj.d;
                            } else {
                                xu30Var6 = xu30Var2;
                            }
                            ipb1VarD = null;
                            if (koa0Var instanceof goa0) {
                                x340Var.i0(-1860758970);
                                zG2 = x340Var.g(maaVar);
                                objT2 = x340Var.T();
                                if (zG2 || objT2 == m4cVar) {
                                    objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                    x340Var.s0(objT2);
                                }
                                ipb1VarD = (ipb1) objT2;
                                x340Var.r(false);
                            } else if (koa0Var instanceof hoa0) {
                                x340Var.i0(-1860670806);
                                hoa0Var = (hoa0) koa0Var;
                                obj2 = hoa0Var.b;
                                zG = x340Var.g(obj2);
                                objT = x340Var.T();
                                if (zG || objT == m4cVar) {
                                    objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                    x340Var.s0(objT);
                                }
                                ipb1VarD = (ipb1) objT;
                                x340Var.r(false);
                            } else if (koa0Var instanceof joa0) {
                                x340Var.i0(-1860424480);
                                int i15 = i9 << 3;
                                ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i15 & 896) | (i15 & 112) | (((i9 >> 3) & 8) << 6));
                                x340Var.r(false);
                            } else {
                                if (koa0Var instanceof ioa0) {
                                    throw p3d1.k(x340Var, -1168404271, false);
                                }
                                x340Var.i0(-1860184944);
                                x340Var.r(false);
                            }
                            int i16 = i9 >> 3;
                            int i17 = (i9 & 14) | ((i16 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i16 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                            vu30 vu30Var5 = vu30Var4;
                            e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var5, xu30VarR, 3, xu30Var6, x340Var, i17, 0);
                            xu30Var5 = xu30Var6;
                            i13 = 3;
                            xu30Var4 = xu30VarR;
                            vu30Var3 = vu30Var5;
                            qim0Var3 = qim0Var4;
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            vu30Var3 = vu30Var2;
                            xu30Var4 = xu30Var3;
                            i13 = i;
                            xu30Var5 = xu30Var2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                        }
                    }
                    i9 = i10 | 113246208;
                    if ((i9 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i9 & 1, z)) {
                        if (i14 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vu30Var4 = blj.c;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 != 0) {
                            xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                        } else {
                            xu30VarR = xu30Var3;
                        }
                        if (i11 != 0) {
                            xu30Var6 = blj.d;
                        } else {
                            xu30Var6 = xu30Var2;
                        }
                        ipb1VarD = null;
                        if (koa0Var instanceof goa0) {
                            x340Var.i0(-1860758970);
                            zG2 = x340Var.g(maaVar);
                            objT2 = x340Var.T();
                            if (zG2) {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            }
                            ipb1VarD = (ipb1) objT2;
                            x340Var.r(false);
                        } else if (koa0Var instanceof hoa0) {
                            x340Var.i0(-1860670806);
                            hoa0Var = (hoa0) koa0Var;
                            obj2 = hoa0Var.b;
                            zG = x340Var.g(obj2);
                            objT = x340Var.T();
                            if (zG) {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            } else {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            }
                            ipb1VarD = (ipb1) objT;
                            x340Var.r(false);
                        } else if (koa0Var instanceof joa0) {
                            x340Var.i0(-1860424480);
                            int i18 = i9 << 3;
                            ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i18 & 896) | (i18 & 112) | (((i9 >> 3) & 8) << 6));
                            x340Var.r(false);
                        } else {
                            if (koa0Var instanceof ioa0) {
                                throw p3d1.k(x340Var, -1168404271, false);
                            }
                            x340Var.i0(-1860184944);
                            x340Var.r(false);
                        }
                        int i19 = i9 >> 3;
                        int i110 = (i9 & 14) | ((i19 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i19 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                        vu30 vu30Var6 = vu30Var4;
                        e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var6, xu30VarR, 3, xu30Var6, x340Var, i110, 0);
                        xu30Var5 = xu30Var6;
                        i13 = 3;
                        xu30Var4 = xu30VarR;
                        vu30Var3 = vu30Var6;
                        qim0Var3 = qim0Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var3 = vu30Var2;
                        xu30Var4 = xu30Var3;
                        i13 = i;
                        xu30Var5 = xu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                    }
                }
                i4 |= 1572864;
                xu30Var3 = xu30Var;
                i9 = 12582912 | i4;
                i10 = i4;
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (x340Var.i(xu30Var2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i9 |= i12;
                    }
                    if ((i9 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i9 & 1, z)) {
                        if (i14 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vu30Var4 = blj.c;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 != 0) {
                            xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                        } else {
                            xu30VarR = xu30Var3;
                        }
                        if (i11 != 0) {
                            xu30Var6 = blj.d;
                        } else {
                            xu30Var6 = xu30Var2;
                        }
                        ipb1VarD = null;
                        if (koa0Var instanceof goa0) {
                            x340Var.i0(-1860758970);
                            zG2 = x340Var.g(maaVar);
                            objT2 = x340Var.T();
                            if (zG2) {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            }
                            ipb1VarD = (ipb1) objT2;
                            x340Var.r(false);
                        } else if (koa0Var instanceof hoa0) {
                            x340Var.i0(-1860670806);
                            hoa0Var = (hoa0) koa0Var;
                            obj2 = hoa0Var.b;
                            zG = x340Var.g(obj2);
                            objT = x340Var.T();
                            if (zG) {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            } else {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            }
                            ipb1VarD = (ipb1) objT;
                            x340Var.r(false);
                        } else if (koa0Var instanceof joa0) {
                            x340Var.i0(-1860424480);
                            int i111 = i9 << 3;
                            ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i111 & 896) | (i111 & 112) | (((i9 >> 3) & 8) << 6));
                            x340Var.r(false);
                        } else {
                            if (koa0Var instanceof ioa0) {
                                throw p3d1.k(x340Var, -1168404271, false);
                            }
                            x340Var.i0(-1860184944);
                            x340Var.r(false);
                        }
                        int i112 = i9 >> 3;
                        int i113 = (i9 & 14) | ((i112 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i112 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                        vu30 vu30Var7 = vu30Var4;
                        e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var7, xu30VarR, 3, xu30Var6, x340Var, i113, 0);
                        xu30Var5 = xu30Var6;
                        i13 = 3;
                        xu30Var4 = xu30VarR;
                        vu30Var3 = vu30Var7;
                        qim0Var3 = qim0Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var3 = vu30Var2;
                        xu30Var4 = xu30Var3;
                        i13 = i;
                        xu30Var5 = xu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                    }
                }
                i9 = i10 | 113246208;
                if ((i9 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    if (i14 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vu30Var4 = blj.c;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 != 0) {
                        xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                    } else {
                        xu30VarR = xu30Var3;
                    }
                    if (i11 != 0) {
                        xu30Var6 = blj.d;
                    } else {
                        xu30Var6 = xu30Var2;
                    }
                    ipb1VarD = null;
                    if (koa0Var instanceof goa0) {
                        x340Var.i0(-1860758970);
                        zG2 = x340Var.g(maaVar);
                        objT2 = x340Var.T();
                        if (zG2) {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        }
                        ipb1VarD = (ipb1) objT2;
                        x340Var.r(false);
                    } else if (koa0Var instanceof hoa0) {
                        x340Var.i0(-1860670806);
                        hoa0Var = (hoa0) koa0Var;
                        obj2 = hoa0Var.b;
                        zG = x340Var.g(obj2);
                        objT = x340Var.T();
                        if (zG) {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        } else {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        }
                        ipb1VarD = (ipb1) objT;
                        x340Var.r(false);
                    } else if (koa0Var instanceof joa0) {
                        x340Var.i0(-1860424480);
                        int i114 = i9 << 3;
                        ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i114 & 896) | (i114 & 112) | (((i9 >> 3) & 8) << 6));
                        x340Var.r(false);
                    } else {
                        if (koa0Var instanceof ioa0) {
                            throw p3d1.k(x340Var, -1168404271, false);
                        }
                        x340Var.i0(-1860184944);
                        x340Var.r(false);
                    }
                    int i115 = i9 >> 3;
                    int i116 = (i9 & 14) | ((i115 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i115 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                    vu30 vu30Var8 = vu30Var4;
                    e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var8, xu30VarR, 3, xu30Var6, x340Var, i116, 0);
                    xu30Var5 = xu30Var6;
                    i13 = 3;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var8;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var3 = vu30Var2;
                    xu30Var4 = xu30Var3;
                    i13 = i;
                    xu30Var5 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                }
            }
            i4 |= 196608;
            vu30Var2 = vu30Var;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    xu30Var3 = xu30Var;
                    if (x340Var.i(xu30Var3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = 12582912 | i4;
                i10 = i4;
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (x340Var.i(xu30Var2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i9 |= i12;
                    }
                    if ((i9 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i9 & 1, z)) {
                        if (i14 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vu30Var4 = blj.c;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 != 0) {
                            xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                        } else {
                            xu30VarR = xu30Var3;
                        }
                        if (i11 != 0) {
                            xu30Var6 = blj.d;
                        } else {
                            xu30Var6 = xu30Var2;
                        }
                        ipb1VarD = null;
                        if (koa0Var instanceof goa0) {
                            x340Var.i0(-1860758970);
                            zG2 = x340Var.g(maaVar);
                            objT2 = x340Var.T();
                            if (zG2) {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            }
                            ipb1VarD = (ipb1) objT2;
                            x340Var.r(false);
                        } else if (koa0Var instanceof hoa0) {
                            x340Var.i0(-1860670806);
                            hoa0Var = (hoa0) koa0Var;
                            obj2 = hoa0Var.b;
                            zG = x340Var.g(obj2);
                            objT = x340Var.T();
                            if (zG) {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            } else {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            }
                            ipb1VarD = (ipb1) objT;
                            x340Var.r(false);
                        } else if (koa0Var instanceof joa0) {
                            x340Var.i0(-1860424480);
                            int i117 = i9 << 3;
                            ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i117 & 896) | (i117 & 112) | (((i9 >> 3) & 8) << 6));
                            x340Var.r(false);
                        } else {
                            if (koa0Var instanceof ioa0) {
                                throw p3d1.k(x340Var, -1168404271, false);
                            }
                            x340Var.i0(-1860184944);
                            x340Var.r(false);
                        }
                        int i118 = i9 >> 3;
                        int i119 = (i9 & 14) | ((i118 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i118 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                        vu30 vu30Var9 = vu30Var4;
                        e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var9, xu30VarR, 3, xu30Var6, x340Var, i119, 0);
                        xu30Var5 = xu30Var6;
                        i13 = 3;
                        xu30Var4 = xu30VarR;
                        vu30Var3 = vu30Var9;
                        qim0Var3 = qim0Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var3 = vu30Var2;
                        xu30Var4 = xu30Var3;
                        i13 = i;
                        xu30Var5 = xu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                    }
                }
                i9 = i10 | 113246208;
                if ((i9 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    if (i14 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vu30Var4 = blj.c;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 != 0) {
                        xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                    } else {
                        xu30VarR = xu30Var3;
                    }
                    if (i11 != 0) {
                        xu30Var6 = blj.d;
                    } else {
                        xu30Var6 = xu30Var2;
                    }
                    ipb1VarD = null;
                    if (koa0Var instanceof goa0) {
                        x340Var.i0(-1860758970);
                        zG2 = x340Var.g(maaVar);
                        objT2 = x340Var.T();
                        if (zG2) {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        }
                        ipb1VarD = (ipb1) objT2;
                        x340Var.r(false);
                    } else if (koa0Var instanceof hoa0) {
                        x340Var.i0(-1860670806);
                        hoa0Var = (hoa0) koa0Var;
                        obj2 = hoa0Var.b;
                        zG = x340Var.g(obj2);
                        objT = x340Var.T();
                        if (zG) {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        } else {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        }
                        ipb1VarD = (ipb1) objT;
                        x340Var.r(false);
                    } else if (koa0Var instanceof joa0) {
                        x340Var.i0(-1860424480);
                        int i1110 = i9 << 3;
                        ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i1110 & 896) | (i1110 & 112) | (((i9 >> 3) & 8) << 6));
                        x340Var.r(false);
                    } else {
                        if (koa0Var instanceof ioa0) {
                            throw p3d1.k(x340Var, -1168404271, false);
                        }
                        x340Var.i0(-1860184944);
                        x340Var.r(false);
                    }
                    int i1111 = i9 >> 3;
                    int i1112 = (i9 & 14) | ((i1111 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i1111 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                    vu30 vu30Var10 = vu30Var4;
                    e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var10, xu30VarR, 3, xu30Var6, x340Var, i1112, 0);
                    xu30Var5 = xu30Var6;
                    i13 = 3;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var10;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var3 = vu30Var2;
                    xu30Var4 = xu30Var3;
                    i13 = i;
                    xu30Var5 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                }
            }
            i4 |= 1572864;
            xu30Var3 = xu30Var;
            i9 = 12582912 | i4;
            i10 = i4;
            i11 = i3 & 128;
            if (i11 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i9 |= i12;
                }
                if ((i9 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    if (i14 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vu30Var4 = blj.c;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 != 0) {
                        xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                    } else {
                        xu30VarR = xu30Var3;
                    }
                    if (i11 != 0) {
                        xu30Var6 = blj.d;
                    } else {
                        xu30Var6 = xu30Var2;
                    }
                    ipb1VarD = null;
                    if (koa0Var instanceof goa0) {
                        x340Var.i0(-1860758970);
                        zG2 = x340Var.g(maaVar);
                        objT2 = x340Var.T();
                        if (zG2) {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        }
                        ipb1VarD = (ipb1) objT2;
                        x340Var.r(false);
                    } else if (koa0Var instanceof hoa0) {
                        x340Var.i0(-1860670806);
                        hoa0Var = (hoa0) koa0Var;
                        obj2 = hoa0Var.b;
                        zG = x340Var.g(obj2);
                        objT = x340Var.T();
                        if (zG) {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        } else {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        }
                        ipb1VarD = (ipb1) objT;
                        x340Var.r(false);
                    } else if (koa0Var instanceof joa0) {
                        x340Var.i0(-1860424480);
                        int i1113 = i9 << 3;
                        ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i1113 & 896) | (i1113 & 112) | (((i9 >> 3) & 8) << 6));
                        x340Var.r(false);
                    } else {
                        if (koa0Var instanceof ioa0) {
                            throw p3d1.k(x340Var, -1168404271, false);
                        }
                        x340Var.i0(-1860184944);
                        x340Var.r(false);
                    }
                    int i1114 = i9 >> 3;
                    int i1115 = (i9 & 14) | ((i1114 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i1114 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                    vu30 vu30Var11 = vu30Var4;
                    e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var11, xu30VarR, 3, xu30Var6, x340Var, i1115, 0);
                    xu30Var5 = xu30Var6;
                    i13 = 3;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var11;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var3 = vu30Var2;
                    xu30Var4 = xu30Var3;
                    i13 = i;
                    xu30Var5 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                }
            }
            i9 = i10 | 113246208;
            if ((i9 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i9 & 1, z)) {
                if (i14 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    vu30Var4 = blj.c;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i7 != 0) {
                    xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                } else {
                    xu30VarR = xu30Var3;
                }
                if (i11 != 0) {
                    xu30Var6 = blj.d;
                } else {
                    xu30Var6 = xu30Var2;
                }
                ipb1VarD = null;
                if (koa0Var instanceof goa0) {
                    x340Var.i0(-1860758970);
                    zG2 = x340Var.g(maaVar);
                    objT2 = x340Var.T();
                    if (zG2) {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    }
                    ipb1VarD = (ipb1) objT2;
                    x340Var.r(false);
                } else if (koa0Var instanceof hoa0) {
                    x340Var.i0(-1860670806);
                    hoa0Var = (hoa0) koa0Var;
                    obj2 = hoa0Var.b;
                    zG = x340Var.g(obj2);
                    objT = x340Var.T();
                    if (zG) {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    } else {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    }
                    ipb1VarD = (ipb1) objT;
                    x340Var.r(false);
                } else if (koa0Var instanceof joa0) {
                    x340Var.i0(-1860424480);
                    int i1116 = i9 << 3;
                    ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i1116 & 896) | (i1116 & 112) | (((i9 >> 3) & 8) << 6));
                    x340Var.r(false);
                } else {
                    if (koa0Var instanceof ioa0) {
                        throw p3d1.k(x340Var, -1168404271, false);
                    }
                    x340Var.i0(-1860184944);
                    x340Var.r(false);
                }
                int i1117 = i9 >> 3;
                int i1118 = (i9 & 14) | ((i1117 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i1117 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                vu30 vu30Var12 = vu30Var4;
                e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var12, xu30VarR, 3, xu30Var6, x340Var, i1118, 0);
                xu30Var5 = xu30Var6;
                i13 = 3;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var12;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                vu30Var3 = vu30Var2;
                xu30Var4 = xu30Var3;
                i13 = i;
                xu30Var5 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
            }
        }
        i4 |= 24576;
        qim0Var2 = qim0Var;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                vu30Var2 = vu30Var;
                if (x340Var.i(vu30Var2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    xu30Var3 = xu30Var;
                    if (x340Var.i(xu30Var3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = 12582912 | i4;
                i10 = i4;
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (x340Var.i(xu30Var2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i9 |= i12;
                    }
                    if ((i9 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i9 & 1, z)) {
                        if (i14 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            vu30Var4 = blj.c;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        if (i7 != 0) {
                            xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                        } else {
                            xu30VarR = xu30Var3;
                        }
                        if (i11 != 0) {
                            xu30Var6 = blj.d;
                        } else {
                            xu30Var6 = xu30Var2;
                        }
                        ipb1VarD = null;
                        if (koa0Var instanceof goa0) {
                            x340Var.i0(-1860758970);
                            zG2 = x340Var.g(maaVar);
                            objT2 = x340Var.T();
                            if (zG2) {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                                x340Var.s0(objT2);
                            }
                            ipb1VarD = (ipb1) objT2;
                            x340Var.r(false);
                        } else if (koa0Var instanceof hoa0) {
                            x340Var.i0(-1860670806);
                            hoa0Var = (hoa0) koa0Var;
                            obj2 = hoa0Var.b;
                            zG = x340Var.g(obj2);
                            objT = x340Var.T();
                            if (zG) {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            } else {
                                objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                                x340Var.s0(objT);
                            }
                            ipb1VarD = (ipb1) objT;
                            x340Var.r(false);
                        } else if (koa0Var instanceof joa0) {
                            x340Var.i0(-1860424480);
                            int i1119 = i9 << 3;
                            ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i1119 & 896) | (i1119 & 112) | (((i9 >> 3) & 8) << 6));
                            x340Var.r(false);
                        } else {
                            if (koa0Var instanceof ioa0) {
                                throw p3d1.k(x340Var, -1168404271, false);
                            }
                            x340Var.i0(-1860184944);
                            x340Var.r(false);
                        }
                        int i11110 = i9 >> 3;
                        int i11111 = (i9 & 14) | ((i11110 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i11110 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                        vu30 vu30Var13 = vu30Var4;
                        e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var13, xu30VarR, 3, xu30Var6, x340Var, i11111, 0);
                        xu30Var5 = xu30Var6;
                        i13 = 3;
                        xu30Var4 = xu30VarR;
                        vu30Var3 = vu30Var13;
                        qim0Var3 = qim0Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        vu30Var3 = vu30Var2;
                        xu30Var4 = xu30Var3;
                        i13 = i;
                        xu30Var5 = xu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                    }
                }
                i9 = i10 | 113246208;
                if ((i9 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    if (i14 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vu30Var4 = blj.c;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 != 0) {
                        xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                    } else {
                        xu30VarR = xu30Var3;
                    }
                    if (i11 != 0) {
                        xu30Var6 = blj.d;
                    } else {
                        xu30Var6 = xu30Var2;
                    }
                    ipb1VarD = null;
                    if (koa0Var instanceof goa0) {
                        x340Var.i0(-1860758970);
                        zG2 = x340Var.g(maaVar);
                        objT2 = x340Var.T();
                        if (zG2) {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        }
                        ipb1VarD = (ipb1) objT2;
                        x340Var.r(false);
                    } else if (koa0Var instanceof hoa0) {
                        x340Var.i0(-1860670806);
                        hoa0Var = (hoa0) koa0Var;
                        obj2 = hoa0Var.b;
                        zG = x340Var.g(obj2);
                        objT = x340Var.T();
                        if (zG) {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        } else {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        }
                        ipb1VarD = (ipb1) objT;
                        x340Var.r(false);
                    } else if (koa0Var instanceof joa0) {
                        x340Var.i0(-1860424480);
                        int i11112 = i9 << 3;
                        ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i11112 & 896) | (i11112 & 112) | (((i9 >> 3) & 8) << 6));
                        x340Var.r(false);
                    } else {
                        if (koa0Var instanceof ioa0) {
                            throw p3d1.k(x340Var, -1168404271, false);
                        }
                        x340Var.i0(-1860184944);
                        x340Var.r(false);
                    }
                    int i11113 = i9 >> 3;
                    int i11114 = (i9 & 14) | ((i11113 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i11113 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                    vu30 vu30Var14 = vu30Var4;
                    e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var14, xu30VarR, 3, xu30Var6, x340Var, i11114, 0);
                    xu30Var5 = xu30Var6;
                    i13 = 3;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var14;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var3 = vu30Var2;
                    xu30Var4 = xu30Var3;
                    i13 = i;
                    xu30Var5 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                }
            }
            i4 |= 1572864;
            xu30Var3 = xu30Var;
            i9 = 12582912 | i4;
            i10 = i4;
            i11 = i3 & 128;
            if (i11 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i9 |= i12;
                }
                if ((i9 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    if (i14 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vu30Var4 = blj.c;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 != 0) {
                        xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                    } else {
                        xu30VarR = xu30Var3;
                    }
                    if (i11 != 0) {
                        xu30Var6 = blj.d;
                    } else {
                        xu30Var6 = xu30Var2;
                    }
                    ipb1VarD = null;
                    if (koa0Var instanceof goa0) {
                        x340Var.i0(-1860758970);
                        zG2 = x340Var.g(maaVar);
                        objT2 = x340Var.T();
                        if (zG2) {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        }
                        ipb1VarD = (ipb1) objT2;
                        x340Var.r(false);
                    } else if (koa0Var instanceof hoa0) {
                        x340Var.i0(-1860670806);
                        hoa0Var = (hoa0) koa0Var;
                        obj2 = hoa0Var.b;
                        zG = x340Var.g(obj2);
                        objT = x340Var.T();
                        if (zG) {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        } else {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        }
                        ipb1VarD = (ipb1) objT;
                        x340Var.r(false);
                    } else if (koa0Var instanceof joa0) {
                        x340Var.i0(-1860424480);
                        int i11115 = i9 << 3;
                        ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i11115 & 896) | (i11115 & 112) | (((i9 >> 3) & 8) << 6));
                        x340Var.r(false);
                    } else {
                        if (koa0Var instanceof ioa0) {
                            throw p3d1.k(x340Var, -1168404271, false);
                        }
                        x340Var.i0(-1860184944);
                        x340Var.r(false);
                    }
                    int i11116 = i9 >> 3;
                    int i11117 = (i9 & 14) | ((i11116 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i11116 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                    vu30 vu30Var15 = vu30Var4;
                    e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var15, xu30VarR, 3, xu30Var6, x340Var, i11117, 0);
                    xu30Var5 = xu30Var6;
                    i13 = 3;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var15;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var3 = vu30Var2;
                    xu30Var4 = xu30Var3;
                    i13 = i;
                    xu30Var5 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                }
            }
            i9 = i10 | 113246208;
            if ((i9 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i9 & 1, z)) {
                if (i14 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    vu30Var4 = blj.c;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i7 != 0) {
                    xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                } else {
                    xu30VarR = xu30Var3;
                }
                if (i11 != 0) {
                    xu30Var6 = blj.d;
                } else {
                    xu30Var6 = xu30Var2;
                }
                ipb1VarD = null;
                if (koa0Var instanceof goa0) {
                    x340Var.i0(-1860758970);
                    zG2 = x340Var.g(maaVar);
                    objT2 = x340Var.T();
                    if (zG2) {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    }
                    ipb1VarD = (ipb1) objT2;
                    x340Var.r(false);
                } else if (koa0Var instanceof hoa0) {
                    x340Var.i0(-1860670806);
                    hoa0Var = (hoa0) koa0Var;
                    obj2 = hoa0Var.b;
                    zG = x340Var.g(obj2);
                    objT = x340Var.T();
                    if (zG) {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    } else {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    }
                    ipb1VarD = (ipb1) objT;
                    x340Var.r(false);
                } else if (koa0Var instanceof joa0) {
                    x340Var.i0(-1860424480);
                    int i11118 = i9 << 3;
                    ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i11118 & 896) | (i11118 & 112) | (((i9 >> 3) & 8) << 6));
                    x340Var.r(false);
                } else {
                    if (koa0Var instanceof ioa0) {
                        throw p3d1.k(x340Var, -1168404271, false);
                    }
                    x340Var.i0(-1860184944);
                    x340Var.r(false);
                }
                int i11119 = i9 >> 3;
                int i111110 = (i9 & 14) | ((i11119 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i11119 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                vu30 vu30Var16 = vu30Var4;
                e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var16, xu30VarR, 3, xu30Var6, x340Var, i111110, 0);
                xu30Var5 = xu30Var6;
                i13 = 3;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var16;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                vu30Var3 = vu30Var2;
                xu30Var4 = xu30Var3;
                i13 = i;
                xu30Var5 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
            }
        }
        i4 |= 196608;
        vu30Var2 = vu30Var;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                xu30Var3 = xu30Var;
                if (x340Var.i(xu30Var3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = 12582912 | i4;
            i10 = i4;
            i11 = i3 & 128;
            if (i11 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i9 |= i12;
                }
                if ((i9 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i9 & 1, z)) {
                    if (i14 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        vu30Var4 = blj.c;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    if (i7 != 0) {
                        xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                    } else {
                        xu30VarR = xu30Var3;
                    }
                    if (i11 != 0) {
                        xu30Var6 = blj.d;
                    } else {
                        xu30Var6 = xu30Var2;
                    }
                    ipb1VarD = null;
                    if (koa0Var instanceof goa0) {
                        x340Var.i0(-1860758970);
                        zG2 = x340Var.g(maaVar);
                        objT2 = x340Var.T();
                        if (zG2) {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                            x340Var.s0(objT2);
                        }
                        ipb1VarD = (ipb1) objT2;
                        x340Var.r(false);
                    } else if (koa0Var instanceof hoa0) {
                        x340Var.i0(-1860670806);
                        hoa0Var = (hoa0) koa0Var;
                        obj2 = hoa0Var.b;
                        zG = x340Var.g(obj2);
                        objT = x340Var.T();
                        if (zG) {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        } else {
                            objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                            x340Var.s0(objT);
                        }
                        ipb1VarD = (ipb1) objT;
                        x340Var.r(false);
                    } else if (koa0Var instanceof joa0) {
                        x340Var.i0(-1860424480);
                        int i111111 = i9 << 3;
                        ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i111111 & 896) | (i111111 & 112) | (((i9 >> 3) & 8) << 6));
                        x340Var.r(false);
                    } else {
                        if (koa0Var instanceof ioa0) {
                            throw p3d1.k(x340Var, -1168404271, false);
                        }
                        x340Var.i0(-1860184944);
                        x340Var.r(false);
                    }
                    int i111112 = i9 >> 3;
                    int i111113 = (i9 & 14) | ((i111112 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i111112 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                    vu30 vu30Var17 = vu30Var4;
                    e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var17, xu30VarR, 3, xu30Var6, x340Var, i111113, 0);
                    xu30Var5 = xu30Var6;
                    i13 = 3;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var17;
                    qim0Var3 = qim0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    vu30Var3 = vu30Var2;
                    xu30Var4 = xu30Var3;
                    i13 = i;
                    xu30Var5 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
                }
            }
            i9 = i10 | 113246208;
            if ((i9 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i9 & 1, z)) {
                if (i14 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    vu30Var4 = blj.c;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i7 != 0) {
                    xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                } else {
                    xu30VarR = xu30Var3;
                }
                if (i11 != 0) {
                    xu30Var6 = blj.d;
                } else {
                    xu30Var6 = xu30Var2;
                }
                ipb1VarD = null;
                if (koa0Var instanceof goa0) {
                    x340Var.i0(-1860758970);
                    zG2 = x340Var.g(maaVar);
                    objT2 = x340Var.T();
                    if (zG2) {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    }
                    ipb1VarD = (ipb1) objT2;
                    x340Var.r(false);
                } else if (koa0Var instanceof hoa0) {
                    x340Var.i0(-1860670806);
                    hoa0Var = (hoa0) koa0Var;
                    obj2 = hoa0Var.b;
                    zG = x340Var.g(obj2);
                    objT = x340Var.T();
                    if (zG) {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    } else {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    }
                    ipb1VarD = (ipb1) objT;
                    x340Var.r(false);
                } else if (koa0Var instanceof joa0) {
                    x340Var.i0(-1860424480);
                    int i111114 = i9 << 3;
                    ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i111114 & 896) | (i111114 & 112) | (((i9 >> 3) & 8) << 6));
                    x340Var.r(false);
                } else {
                    if (koa0Var instanceof ioa0) {
                        throw p3d1.k(x340Var, -1168404271, false);
                    }
                    x340Var.i0(-1860184944);
                    x340Var.r(false);
                }
                int i111115 = i9 >> 3;
                int i111116 = (i9 & 14) | ((i111115 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i111115 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                vu30 vu30Var18 = vu30Var4;
                e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var18, xu30VarR, 3, xu30Var6, x340Var, i111116, 0);
                xu30Var5 = xu30Var6;
                i13 = 3;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var18;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                vu30Var3 = vu30Var2;
                xu30Var4 = xu30Var3;
                i13 = i;
                xu30Var5 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
            }
        }
        i4 |= 1572864;
        xu30Var3 = xu30Var;
        i9 = 12582912 | i4;
        i10 = i4;
        i11 = i3 & 128;
        if (i11 != 0) {
            if ((i2 & 100663296) == 0) {
                if (x340Var.i(xu30Var2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i9 |= i12;
            }
            if ((i9 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i9 & 1, z)) {
                if (i14 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    vu30Var4 = blj.c;
                } else {
                    vu30Var4 = vu30Var2;
                }
                if (i7 != 0) {
                    xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
                } else {
                    xu30VarR = xu30Var3;
                }
                if (i11 != 0) {
                    xu30Var6 = blj.d;
                } else {
                    xu30Var6 = xu30Var2;
                }
                ipb1VarD = null;
                if (koa0Var instanceof goa0) {
                    x340Var.i0(-1860758970);
                    zG2 = x340Var.g(maaVar);
                    objT2 = x340Var.T();
                    if (zG2) {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                        x340Var.s0(objT2);
                    }
                    ipb1VarD = (ipb1) objT2;
                    x340Var.r(false);
                } else if (koa0Var instanceof hoa0) {
                    x340Var.i0(-1860670806);
                    hoa0Var = (hoa0) koa0Var;
                    obj2 = hoa0Var.b;
                    zG = x340Var.g(obj2);
                    objT = x340Var.T();
                    if (zG) {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    } else {
                        objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                        x340Var.s0(objT);
                    }
                    ipb1VarD = (ipb1) objT;
                    x340Var.r(false);
                } else if (koa0Var instanceof joa0) {
                    x340Var.i0(-1860424480);
                    int i111117 = i9 << 3;
                    ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i111117 & 896) | (i111117 & 112) | (((i9 >> 3) & 8) << 6));
                    x340Var.r(false);
                } else {
                    if (koa0Var instanceof ioa0) {
                        throw p3d1.k(x340Var, -1168404271, false);
                    }
                    x340Var.i0(-1860184944);
                    x340Var.r(false);
                }
                int i111118 = i9 >> 3;
                int i111119 = (i9 & 14) | ((i111118 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i111118 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
                vu30 vu30Var19 = vu30Var4;
                e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var19, xu30VarR, 3, xu30Var6, x340Var, i111119, 0);
                xu30Var5 = xu30Var6;
                i13 = 3;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var19;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                vu30Var3 = vu30Var2;
                xu30Var4 = xu30Var3;
                i13 = i;
                xu30Var5 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
            }
        }
        i9 = i10 | 113246208;
        if ((i9 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i9 & 1, z)) {
            if (i14 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i5 != 0) {
                vu30Var4 = blj.c;
            } else {
                vu30Var4 = vu30Var2;
            }
            if (i7 != 0) {
                xu30VarR = apo.r(-272832361, new a2(vu30Var4, (byte) 15), x340Var);
            } else {
                xu30VarR = xu30Var3;
            }
            if (i11 != 0) {
                xu30Var6 = blj.d;
            } else {
                xu30Var6 = xu30Var2;
            }
            ipb1VarD = null;
            if (koa0Var instanceof goa0) {
                x340Var.i0(-1860758970);
                zG2 = x340Var.g(maaVar);
                objT2 = x340Var.T();
                if (zG2) {
                    objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                    x340Var.s0(objT2);
                } else {
                    objT2 = maaVar.getBehavior().b((Object) null, (dts) null, (String) null);
                    x340Var.s0(objT2);
                }
                ipb1VarD = (ipb1) objT2;
                x340Var.r(false);
            } else if (koa0Var instanceof hoa0) {
                x340Var.i0(-1860670806);
                hoa0Var = (hoa0) koa0Var;
                obj2 = hoa0Var.b;
                zG = x340Var.g(obj2);
                objT = x340Var.T();
                if (zG) {
                    objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                    x340Var.s0(objT);
                } else {
                    objT = dts.b(hoa0Var.a, obj2, maaVar.getBehavior().c(), new mtw(maaVar, (byte) 1));
                    x340Var.s0(objT);
                }
                ipb1VarD = (ipb1) objT;
                x340Var.r(false);
            } else if (koa0Var instanceof joa0) {
                x340Var.i0(-1860424480);
                int i1111110 = i9 << 3;
                ipb1VarD = wpb1.D(((joa0) koa0Var).a.toString(), maaVar, obj, x340Var, (i1111110 & 896) | (i1111110 & 112) | (((i9 >> 3) & 8) << 6));
                x340Var.r(false);
            } else {
                if (koa0Var instanceof ioa0) {
                    throw p3d1.k(x340Var, -1168404271, false);
                }
                x340Var.i0(-1860184944);
                x340Var.r(false);
            }
            int i1111111 = i9 >> 3;
            int i1111112 = (i9 & 14) | ((i1111111 & 8) << 3) | (i9 & 112) | (i9 & 896) | (i1111111 & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9);
            vu30 vu30Var110 = vu30Var4;
            e(maaVar, obj, d0rVar, qim0Var4, ipb1VarD, vu30Var110, xu30VarR, 3, xu30Var6, x340Var, i1111112, 0);
            xu30Var5 = xu30Var6;
            i13 = 3;
            xu30Var4 = xu30VarR;
            vu30Var3 = vu30Var110;
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            vu30Var3 = vu30Var2;
            xu30Var4 = xu30Var3;
            i13 = i;
            xu30Var5 = xu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cpb1(maaVar, obj, d0rVar, koa0Var, qim0Var3, vu30Var3, xu30Var4, i13, xu30Var5, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:113:0x013f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146  */
    /* JADX WARN: Code duplicated, block: B:119:0x014c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0150  */
    /* JADX WARN: Code duplicated, block: B:123:0x0156  */
    /* JADX WARN: Code duplicated, block: B:124:0x018d  */
    /* JADX WARN: Code duplicated, block: B:126:0x019f  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x022b  */
    /* JADX WARN: Code duplicated, block: B:150:0x025e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0263  */
    /* JADX WARN: Code duplicated, block: B:153:0x0271  */
    /* JADX WARN: Code duplicated, block: B:155:0x0275  */
    /* JADX WARN: Code duplicated, block: B:157:0x029a  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:169:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:178:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:182:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x030c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x0356  */
    /* JADX WARN: Code duplicated, block: B:192:0x036f  */
    /* JADX WARN: Code duplicated, block: B:193:0x037e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0382  */
    /* JADX WARN: Code duplicated, block: B:196:0x039c  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:203:0x03db  */
    /* JADX WARN: Code duplicated, block: B:205:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:208:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    public static final void e(maa maaVar, Object obj, d0r d0rVar, qim0 qim0Var, ipb1 ipb1Var, vu30 vu30Var, xu30 xu30Var, int i, xu30 xu30Var2, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        ipb1 ipb1Var2;
        int i6;
        int i7;
        vu30 vu30Var2;
        int i8;
        int i9;
        xu30 xu30VarR;
        int i10;
        int i11;
        int iC;
        int i12;
        int i13;
        int i14;
        boolean z;
        xu30 xu30Var3;
        xu30 xu30Var4;
        vu30 vu30Var3;
        int i15;
        ipb1 ipb1Var3;
        h311 h311VarV;
        int i16;
        wul1 wul1Var;
        int iC2;
        boolean z2;
        boolean zG;
        Object objT;
        dpb1 dpb1Var;
        wul1 wul1Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objT2;
        int i17;
        int i18;
        boolean zI;
        Object objT3;
        bm60 bm60Var;
        boolean z6;
        int i19;
        boolean z7;
        boolean z8;
        Object objT4;
        c0r c0rVar;
        boolean zI2;
        Object objT5;
        ven0 ven0VarG;
        k1r k1rVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1585552384);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(maaVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(d0rVar) ? 256 : 128;
        }
        int i20 = i3 & 4;
        if (i20 == 0) {
            if ((i2 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    ipb1Var2 = ipb1Var;
                    if (x340Var.i(ipb1Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        vu30Var2 = vu30Var;
                        if (x340Var.i(vu30Var2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        i4 |= 1572864;
                        xu30VarR = xu30Var;
                    } else {
                        xu30VarR = xu30Var;
                        if ((i2 & 1572864) == 0) {
                            if (x340Var.i(xu30VarR)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i4 |= i10;
                        }
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (i == 0) {
                            iC = -1;
                        } else {
                            iC = l1d.C(i);
                        }
                        if (x340Var.e(iC)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 128;
                    if (i13 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (x340Var.i(xu30Var2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    if ((i4 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i4 & 1, z)) {
                        if (i20 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i5 != 0) {
                            ipb1Var2 = null;
                        }
                        if (i7 != 0) {
                            vu30Var3 = blj.a;
                        } else {
                            vu30Var3 = vu30Var2;
                        }
                        if (i9 != 0) {
                            xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                        }
                        if (i11 != 0) {
                            i16 = 3;
                        } else {
                            i16 = i;
                        }
                        if (i13 != 0) {
                            xu30Var3 = blj.b;
                        } else {
                            xu30Var3 = xu30Var2;
                        }
                        if (maaVar instanceof wul1) {
                            wul1Var = (wul1) maaVar;
                        } else {
                            wul1Var = null;
                        }
                        if (wul1Var == null) {
                            x340Var.i0(-997531553);
                            f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                            x340Var.r(false);
                            i17 = i16;
                        } else {
                            x340Var.i0(-858514218);
                            iC2 = l1d.C(i16);
                            if (iC2 != 0) {
                                if (iC2 != 1) {
                                    z2 = true;
                                } else {
                                    if (iC2 == 2) {
                                        throw p3d1.k(x340Var, -997525332, false);
                                    }
                                    x340Var.i0(-858546303);
                                    boolean zG2 = x340Var.g(wul1Var);
                                    i19 = i4 & 112;
                                    if (i19 != 32 || ((i4 & 64) != 0 && x340Var.g(obj))) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    z8 = z7 | zG2;
                                    objT4 = x340Var.T();
                                    if (z8 || objT4 == m4cVar) {
                                        objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                        x340Var.s0(objT4);
                                    }
                                    c0rVar = (c0r) objT4;
                                    zI2 = x340Var.i(c0rVar);
                                    objT5 = x340Var.T();
                                    if (zI2 || objT5 == m4cVar) {
                                        objT5 = new exm(c0rVar, (byte) 1);
                                        x340Var.s0(objT5);
                                    }
                                    qxd0.i(c0rVar, (iu30) objT5, x340Var);
                                    ien0 ien0VarA = c0rVar.a();
                                    x340Var.f0(-874494126, ien0VarA);
                                    ven0VarG = rwq.g(ien0VarA.a(), ien0VarA.getValue(), null, x340Var, 0, 2);
                                    x340Var.r(false);
                                    k1rVar = (k1r) ven0VarG.getValue();
                                    if (k1rVar instanceof i1r) {
                                        x340Var.i0(-997512353);
                                        f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                        z6 = false;
                                        x340Var.r(false);
                                    } else {
                                        z6 = false;
                                        if (k1rVar instanceof j1r) {
                                            x340Var.i0(-997509143);
                                            us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                        } else {
                                            if (k1rVar instanceof h1r) {
                                                throw p3d1.k(x340Var, -997513822, false);
                                            }
                                            x340Var.i0(-997507603);
                                            xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                            z6 = false;
                                            x340Var.r(false);
                                        }
                                    }
                                    x340Var.r(z6);
                                    i17 = i16;
                                }
                                x340Var.r(z6);
                            } else {
                                z2 = true;
                            }
                            x340Var.i0(-857718758);
                            zG = x340Var.g(wul1Var);
                            objT = x340Var.T();
                            if (zG || objT == m4cVar) {
                                objT = new dpb1();
                                x340Var.s0(objT);
                            }
                            dpb1Var = (dpb1) objT;
                            boolean zI3 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                            wul1Var2 = wul1Var;
                            if ((i4 & 112) != 32 || ((i4 & 64) != 0 && x340Var.i(obj))) {
                                z3 = z2;
                            } else {
                                z3 = false;
                            }
                            boolean zI4 = zI3 | z3 | x340Var.i(dpb1Var);
                            if ((29360128 & i4) == 8388608) {
                                z4 = z2;
                            } else {
                                z4 = false;
                            }
                            z5 = zI4 | z4;
                            objT2 = x340Var.T();
                            if (!z5 || objT2 == m4cVar) {
                                int i21 = i16;
                                objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i21, (lnm) null);
                                i17 = i21;
                                x340Var.s0(objT2);
                            } else {
                                i17 = i16;
                            }
                            i18 = (i4 >> 3) & 8;
                            ven0 ven0VarO = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                            zI = x340Var.i(dpb1Var);
                            objT3 = x340Var.T();
                            if (zI || objT3 == m4cVar) {
                                objT3 = new l5b1(dpb1Var, (byte) 17);
                                x340Var.s0(objT3);
                            }
                            qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                            bm60Var = (em60) ven0VarO.getValue();
                            if (bm60Var instanceof cm60) {
                                x340Var.i0(-997418935);
                                z6 = false;
                                us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                            } else if (bm60Var instanceof bm60) {
                                x340Var.i0(-997417295);
                                xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                z6 = false;
                                x340Var.r(false);
                            } else {
                                if (bm60Var instanceof dm60) {
                                    throw p3d1.k(x340Var, -997421004, false);
                                }
                                x340Var.i0(-997414878);
                                f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                z6 = false;
                                x340Var.r(false);
                            }
                            x340Var.r(z6);
                            x340Var.r(z6);
                        }
                        xu30Var4 = xu30VarR;
                        i15 = i17;
                    } else {
                        x340Var.b0();
                        xu30Var3 = xu30Var2;
                        xu30Var4 = xu30VarR;
                        vu30Var3 = vu30Var2;
                        i15 = i;
                    }
                    ipb1Var3 = ipb1Var2;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                vu30Var2 = vu30Var;
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 1572864;
                    xu30VarR = xu30Var;
                } else {
                    xu30VarR = xu30Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var.i(xu30VarR)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (i == 0) {
                        iC = -1;
                    } else {
                        iC = l1d.C(i);
                    }
                    if (x340Var.e(iC)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 128;
                if (i13 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i4 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        ipb1Var2 = null;
                    }
                    if (i7 != 0) {
                        vu30Var3 = blj.a;
                    } else {
                        vu30Var3 = vu30Var2;
                    }
                    if (i9 != 0) {
                        xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                    }
                    if (i11 != 0) {
                        i16 = 3;
                    } else {
                        i16 = i;
                    }
                    if (i13 != 0) {
                        xu30Var3 = blj.b;
                    } else {
                        xu30Var3 = xu30Var2;
                    }
                    if (maaVar instanceof wul1) {
                        wul1Var = (wul1) maaVar;
                    } else {
                        wul1Var = null;
                    }
                    if (wul1Var == null) {
                        x340Var.i0(-997531553);
                        f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                        x340Var.r(false);
                        i17 = i16;
                    } else {
                        x340Var.i0(-858514218);
                        iC2 = l1d.C(i16);
                        if (iC2 != 0) {
                            if (iC2 != 1) {
                                z2 = true;
                            } else {
                                if (iC2 == 2) {
                                    throw p3d1.k(x340Var, -997525332, false);
                                }
                                x340Var.i0(-858546303);
                                boolean zG3 = x340Var.g(wul1Var);
                                i19 = i4 & 112;
                                if (i19 != 32) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                z8 = z7 | zG3;
                                objT4 = x340Var.T();
                                if (z8) {
                                    objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                    x340Var.s0(objT4);
                                } else {
                                    objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                    x340Var.s0(objT4);
                                }
                                c0rVar = (c0r) objT4;
                                zI2 = x340Var.i(c0rVar);
                                objT5 = x340Var.T();
                                if (zI2) {
                                    objT5 = new exm(c0rVar, (byte) 1);
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new exm(c0rVar, (byte) 1);
                                    x340Var.s0(objT5);
                                }
                                qxd0.i(c0rVar, (iu30) objT5, x340Var);
                                ien0 ien0VarA2 = c0rVar.a();
                                x340Var.f0(-874494126, ien0VarA2);
                                ven0VarG = rwq.g(ien0VarA2.a(), ien0VarA2.getValue(), null, x340Var, 0, 2);
                                x340Var.r(false);
                                k1rVar = (k1r) ven0VarG.getValue();
                                if (k1rVar instanceof i1r) {
                                    x340Var.i0(-997512353);
                                    f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                    z6 = false;
                                    x340Var.r(false);
                                } else {
                                    z6 = false;
                                    if (k1rVar instanceof j1r) {
                                        x340Var.i0(-997509143);
                                        us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                    } else {
                                        if (k1rVar instanceof h1r) {
                                            throw p3d1.k(x340Var, -997513822, false);
                                        }
                                        x340Var.i0(-997507603);
                                        xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                        z6 = false;
                                        x340Var.r(false);
                                    }
                                }
                                x340Var.r(z6);
                                i17 = i16;
                            }
                            x340Var.r(z6);
                        } else {
                            z2 = true;
                        }
                        x340Var.i0(-857718758);
                        zG = x340Var.g(wul1Var);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new dpb1();
                            x340Var.s0(objT);
                        } else {
                            objT = new dpb1();
                            x340Var.s0(objT);
                        }
                        dpb1Var = (dpb1) objT;
                        boolean zI5 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                        wul1Var2 = wul1Var;
                        if ((i4 & 112) != 32) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                        }
                        boolean zI6 = zI5 | z3 | x340Var.i(dpb1Var);
                        if ((29360128 & i4) == 8388608) {
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        z5 = zI6 | z4;
                        objT2 = x340Var.T();
                        if (z5) {
                            int i22 = i16;
                            objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i22, (lnm) null);
                            i17 = i22;
                            x340Var.s0(objT2);
                        } else {
                            int i23 = i16;
                            objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i23, (lnm) null);
                            i17 = i23;
                            x340Var.s0(objT2);
                        }
                        i18 = (i4 >> 3) & 8;
                        ven0 ven0VarO2 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                        zI = x340Var.i(dpb1Var);
                        objT3 = x340Var.T();
                        if (zI) {
                            objT3 = new l5b1(dpb1Var, (byte) 17);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new l5b1(dpb1Var, (byte) 17);
                            x340Var.s0(objT3);
                        }
                        qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                        bm60Var = (em60) ven0VarO2.getValue();
                        if (bm60Var instanceof cm60) {
                            x340Var.i0(-997418935);
                            z6 = false;
                            us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                        } else if (bm60Var instanceof bm60) {
                            x340Var.i0(-997417295);
                            xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                            z6 = false;
                            x340Var.r(false);
                        } else {
                            if (bm60Var instanceof dm60) {
                                throw p3d1.k(x340Var, -997421004, false);
                            }
                            x340Var.i0(-997414878);
                            f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                            z6 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z6);
                        x340Var.r(z6);
                    }
                    xu30Var4 = xu30VarR;
                    i15 = i17;
                } else {
                    x340Var.b0();
                    xu30Var3 = xu30Var2;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var2;
                    i15 = i;
                }
                ipb1Var3 = ipb1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
                }
            }
            i4 |= 24576;
            ipb1Var2 = ipb1Var;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var.i(vu30Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 1572864;
                    xu30VarR = xu30Var;
                } else {
                    xu30VarR = xu30Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var.i(xu30VarR)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (i == 0) {
                        iC = -1;
                    } else {
                        iC = l1d.C(i);
                    }
                    if (x340Var.e(iC)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 128;
                if (i13 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i4 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        ipb1Var2 = null;
                    }
                    if (i7 != 0) {
                        vu30Var3 = blj.a;
                    } else {
                        vu30Var3 = vu30Var2;
                    }
                    if (i9 != 0) {
                        xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                    }
                    if (i11 != 0) {
                        i16 = 3;
                    } else {
                        i16 = i;
                    }
                    if (i13 != 0) {
                        xu30Var3 = blj.b;
                    } else {
                        xu30Var3 = xu30Var2;
                    }
                    if (maaVar instanceof wul1) {
                        wul1Var = (wul1) maaVar;
                    } else {
                        wul1Var = null;
                    }
                    if (wul1Var == null) {
                        x340Var.i0(-997531553);
                        f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                        x340Var.r(false);
                        i17 = i16;
                    } else {
                        x340Var.i0(-858514218);
                        iC2 = l1d.C(i16);
                        if (iC2 != 0) {
                            if (iC2 != 1) {
                                z2 = true;
                            } else {
                                if (iC2 == 2) {
                                    throw p3d1.k(x340Var, -997525332, false);
                                }
                                x340Var.i0(-858546303);
                                boolean zG4 = x340Var.g(wul1Var);
                                i19 = i4 & 112;
                                if (i19 != 32) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                z8 = z7 | zG4;
                                objT4 = x340Var.T();
                                if (z8) {
                                    objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                    x340Var.s0(objT4);
                                } else {
                                    objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                    x340Var.s0(objT4);
                                }
                                c0rVar = (c0r) objT4;
                                zI2 = x340Var.i(c0rVar);
                                objT5 = x340Var.T();
                                if (zI2) {
                                    objT5 = new exm(c0rVar, (byte) 1);
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new exm(c0rVar, (byte) 1);
                                    x340Var.s0(objT5);
                                }
                                qxd0.i(c0rVar, (iu30) objT5, x340Var);
                                ien0 ien0VarA3 = c0rVar.a();
                                x340Var.f0(-874494126, ien0VarA3);
                                ven0VarG = rwq.g(ien0VarA3.a(), ien0VarA3.getValue(), null, x340Var, 0, 2);
                                x340Var.r(false);
                                k1rVar = (k1r) ven0VarG.getValue();
                                if (k1rVar instanceof i1r) {
                                    x340Var.i0(-997512353);
                                    f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                    z6 = false;
                                    x340Var.r(false);
                                } else {
                                    z6 = false;
                                    if (k1rVar instanceof j1r) {
                                        x340Var.i0(-997509143);
                                        us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                    } else {
                                        if (k1rVar instanceof h1r) {
                                            throw p3d1.k(x340Var, -997513822, false);
                                        }
                                        x340Var.i0(-997507603);
                                        xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                        z6 = false;
                                        x340Var.r(false);
                                    }
                                }
                                x340Var.r(z6);
                                i17 = i16;
                            }
                            x340Var.r(z6);
                        } else {
                            z2 = true;
                        }
                        x340Var.i0(-857718758);
                        zG = x340Var.g(wul1Var);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new dpb1();
                            x340Var.s0(objT);
                        } else {
                            objT = new dpb1();
                            x340Var.s0(objT);
                        }
                        dpb1Var = (dpb1) objT;
                        boolean zI7 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                        wul1Var2 = wul1Var;
                        if ((i4 & 112) != 32) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                        }
                        boolean zI8 = zI7 | z3 | x340Var.i(dpb1Var);
                        if ((29360128 & i4) == 8388608) {
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        z5 = zI8 | z4;
                        objT2 = x340Var.T();
                        if (z5) {
                            int i24 = i16;
                            objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i24, (lnm) null);
                            i17 = i24;
                            x340Var.s0(objT2);
                        } else {
                            int i25 = i16;
                            objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i25, (lnm) null);
                            i17 = i25;
                            x340Var.s0(objT2);
                        }
                        i18 = (i4 >> 3) & 8;
                        ven0 ven0VarO3 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                        zI = x340Var.i(dpb1Var);
                        objT3 = x340Var.T();
                        if (zI) {
                            objT3 = new l5b1(dpb1Var, (byte) 17);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new l5b1(dpb1Var, (byte) 17);
                            x340Var.s0(objT3);
                        }
                        qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                        bm60Var = (em60) ven0VarO3.getValue();
                        if (bm60Var instanceof cm60) {
                            x340Var.i0(-997418935);
                            z6 = false;
                            us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                        } else if (bm60Var instanceof bm60) {
                            x340Var.i0(-997417295);
                            xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                            z6 = false;
                            x340Var.r(false);
                        } else {
                            if (bm60Var instanceof dm60) {
                                throw p3d1.k(x340Var, -997421004, false);
                            }
                            x340Var.i0(-997414878);
                            f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                            z6 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z6);
                        x340Var.r(z6);
                    }
                    xu30Var4 = xu30VarR;
                    i15 = i17;
                } else {
                    x340Var.b0();
                    xu30Var3 = xu30Var2;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var2;
                    i15 = i;
                }
                ipb1Var3 = ipb1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            vu30Var2 = vu30Var;
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 1572864;
                xu30VarR = xu30Var;
            } else {
                xu30VarR = xu30Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var.i(xu30VarR)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var.e(iC)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i3 & 128;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var.i(xu30Var2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            if ((i4 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i20 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    ipb1Var2 = null;
                }
                if (i7 != 0) {
                    vu30Var3 = blj.a;
                } else {
                    vu30Var3 = vu30Var2;
                }
                if (i9 != 0) {
                    xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                }
                if (i11 != 0) {
                    i16 = 3;
                } else {
                    i16 = i;
                }
                if (i13 != 0) {
                    xu30Var3 = blj.b;
                } else {
                    xu30Var3 = xu30Var2;
                }
                if (maaVar instanceof wul1) {
                    wul1Var = (wul1) maaVar;
                } else {
                    wul1Var = null;
                }
                if (wul1Var == null) {
                    x340Var.i0(-997531553);
                    f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                    x340Var.r(false);
                    i17 = i16;
                } else {
                    x340Var.i0(-858514218);
                    iC2 = l1d.C(i16);
                    if (iC2 != 0) {
                        if (iC2 != 1) {
                            z2 = true;
                        } else {
                            if (iC2 == 2) {
                                throw p3d1.k(x340Var, -997525332, false);
                            }
                            x340Var.i0(-858546303);
                            boolean zG5 = x340Var.g(wul1Var);
                            i19 = i4 & 112;
                            if (i19 != 32) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            z8 = z7 | zG5;
                            objT4 = x340Var.T();
                            if (z8) {
                                objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                x340Var.s0(objT4);
                            } else {
                                objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                x340Var.s0(objT4);
                            }
                            c0rVar = (c0r) objT4;
                            zI2 = x340Var.i(c0rVar);
                            objT5 = x340Var.T();
                            if (zI2) {
                                objT5 = new exm(c0rVar, (byte) 1);
                                x340Var.s0(objT5);
                            } else {
                                objT5 = new exm(c0rVar, (byte) 1);
                                x340Var.s0(objT5);
                            }
                            qxd0.i(c0rVar, (iu30) objT5, x340Var);
                            ien0 ien0VarA4 = c0rVar.a();
                            x340Var.f0(-874494126, ien0VarA4);
                            ven0VarG = rwq.g(ien0VarA4.a(), ien0VarA4.getValue(), null, x340Var, 0, 2);
                            x340Var.r(false);
                            k1rVar = (k1r) ven0VarG.getValue();
                            if (k1rVar instanceof i1r) {
                                x340Var.i0(-997512353);
                                f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                z6 = false;
                                x340Var.r(false);
                            } else {
                                z6 = false;
                                if (k1rVar instanceof j1r) {
                                    x340Var.i0(-997509143);
                                    us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                } else {
                                    if (k1rVar instanceof h1r) {
                                        throw p3d1.k(x340Var, -997513822, false);
                                    }
                                    x340Var.i0(-997507603);
                                    xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                    z6 = false;
                                    x340Var.r(false);
                                }
                            }
                            x340Var.r(z6);
                            i17 = i16;
                        }
                        x340Var.r(z6);
                    } else {
                        z2 = true;
                    }
                    x340Var.i0(-857718758);
                    zG = x340Var.g(wul1Var);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new dpb1();
                        x340Var.s0(objT);
                    } else {
                        objT = new dpb1();
                        x340Var.s0(objT);
                    }
                    dpb1Var = (dpb1) objT;
                    boolean zI9 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                    wul1Var2 = wul1Var;
                    if ((i4 & 112) != 32) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    boolean zI10 = zI9 | z3 | x340Var.i(dpb1Var);
                    if ((29360128 & i4) == 8388608) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    z5 = zI10 | z4;
                    objT2 = x340Var.T();
                    if (z5) {
                        int i26 = i16;
                        objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i26, (lnm) null);
                        i17 = i26;
                        x340Var.s0(objT2);
                    } else {
                        int i27 = i16;
                        objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i27, (lnm) null);
                        i17 = i27;
                        x340Var.s0(objT2);
                    }
                    i18 = (i4 >> 3) & 8;
                    ven0 ven0VarO4 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                    zI = x340Var.i(dpb1Var);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new l5b1(dpb1Var, (byte) 17);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new l5b1(dpb1Var, (byte) 17);
                        x340Var.s0(objT3);
                    }
                    qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                    bm60Var = (em60) ven0VarO4.getValue();
                    if (bm60Var instanceof cm60) {
                        x340Var.i0(-997418935);
                        z6 = false;
                        us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                    } else if (bm60Var instanceof bm60) {
                        x340Var.i0(-997417295);
                        xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                        z6 = false;
                        x340Var.r(false);
                    } else {
                        if (bm60Var instanceof dm60) {
                            throw p3d1.k(x340Var, -997421004, false);
                        }
                        x340Var.i0(-997414878);
                        f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                        z6 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z6);
                    x340Var.r(z6);
                }
                xu30Var4 = xu30VarR;
                i15 = i17;
            } else {
                x340Var.b0();
                xu30Var3 = xu30Var2;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var2;
                i15 = i;
            }
            ipb1Var3 = ipb1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
            }
        }
        i4 |= 3072;
        qim0Var2 = qim0Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                ipb1Var2 = ipb1Var;
                if (x340Var.i(ipb1Var2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    vu30Var2 = vu30Var;
                    if (x340Var.i(vu30Var2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 1572864;
                    xu30VarR = xu30Var;
                } else {
                    xu30VarR = xu30Var;
                    if ((i2 & 1572864) == 0) {
                        if (x340Var.i(xu30VarR)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (i == 0) {
                        iC = -1;
                    } else {
                        iC = l1d.C(i);
                    }
                    if (x340Var.e(iC)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 128;
                if (i13 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (x340Var.i(xu30Var2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                if ((i4 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i20 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i5 != 0) {
                        ipb1Var2 = null;
                    }
                    if (i7 != 0) {
                        vu30Var3 = blj.a;
                    } else {
                        vu30Var3 = vu30Var2;
                    }
                    if (i9 != 0) {
                        xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                    }
                    if (i11 != 0) {
                        i16 = 3;
                    } else {
                        i16 = i;
                    }
                    if (i13 != 0) {
                        xu30Var3 = blj.b;
                    } else {
                        xu30Var3 = xu30Var2;
                    }
                    if (maaVar instanceof wul1) {
                        wul1Var = (wul1) maaVar;
                    } else {
                        wul1Var = null;
                    }
                    if (wul1Var == null) {
                        x340Var.i0(-997531553);
                        f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                        x340Var.r(false);
                        i17 = i16;
                    } else {
                        x340Var.i0(-858514218);
                        iC2 = l1d.C(i16);
                        if (iC2 != 0) {
                            if (iC2 != 1) {
                                z2 = true;
                            } else {
                                if (iC2 == 2) {
                                    throw p3d1.k(x340Var, -997525332, false);
                                }
                                x340Var.i0(-858546303);
                                boolean zG6 = x340Var.g(wul1Var);
                                i19 = i4 & 112;
                                if (i19 != 32) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                z8 = z7 | zG6;
                                objT4 = x340Var.T();
                                if (z8) {
                                    objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                    x340Var.s0(objT4);
                                } else {
                                    objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                    x340Var.s0(objT4);
                                }
                                c0rVar = (c0r) objT4;
                                zI2 = x340Var.i(c0rVar);
                                objT5 = x340Var.T();
                                if (zI2) {
                                    objT5 = new exm(c0rVar, (byte) 1);
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new exm(c0rVar, (byte) 1);
                                    x340Var.s0(objT5);
                                }
                                qxd0.i(c0rVar, (iu30) objT5, x340Var);
                                ien0 ien0VarA5 = c0rVar.a();
                                x340Var.f0(-874494126, ien0VarA5);
                                ven0VarG = rwq.g(ien0VarA5.a(), ien0VarA5.getValue(), null, x340Var, 0, 2);
                                x340Var.r(false);
                                k1rVar = (k1r) ven0VarG.getValue();
                                if (k1rVar instanceof i1r) {
                                    x340Var.i0(-997512353);
                                    f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                    z6 = false;
                                    x340Var.r(false);
                                } else {
                                    z6 = false;
                                    if (k1rVar instanceof j1r) {
                                        x340Var.i0(-997509143);
                                        us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                    } else {
                                        if (k1rVar instanceof h1r) {
                                            throw p3d1.k(x340Var, -997513822, false);
                                        }
                                        x340Var.i0(-997507603);
                                        xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                        z6 = false;
                                        x340Var.r(false);
                                    }
                                }
                                x340Var.r(z6);
                                i17 = i16;
                            }
                            x340Var.r(z6);
                        } else {
                            z2 = true;
                        }
                        x340Var.i0(-857718758);
                        zG = x340Var.g(wul1Var);
                        objT = x340Var.T();
                        if (zG) {
                            objT = new dpb1();
                            x340Var.s0(objT);
                        } else {
                            objT = new dpb1();
                            x340Var.s0(objT);
                        }
                        dpb1Var = (dpb1) objT;
                        boolean zI11 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                        wul1Var2 = wul1Var;
                        if ((i4 & 112) != 32) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                        }
                        boolean zI12 = zI11 | z3 | x340Var.i(dpb1Var);
                        if ((29360128 & i4) == 8388608) {
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        z5 = zI12 | z4;
                        objT2 = x340Var.T();
                        if (z5) {
                            int i28 = i16;
                            objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i28, (lnm) null);
                            i17 = i28;
                            x340Var.s0(objT2);
                        } else {
                            int i29 = i16;
                            objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i29, (lnm) null);
                            i17 = i29;
                            x340Var.s0(objT2);
                        }
                        i18 = (i4 >> 3) & 8;
                        ven0 ven0VarO5 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                        zI = x340Var.i(dpb1Var);
                        objT3 = x340Var.T();
                        if (zI) {
                            objT3 = new l5b1(dpb1Var, (byte) 17);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new l5b1(dpb1Var, (byte) 17);
                            x340Var.s0(objT3);
                        }
                        qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                        bm60Var = (em60) ven0VarO5.getValue();
                        if (bm60Var instanceof cm60) {
                            x340Var.i0(-997418935);
                            z6 = false;
                            us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                        } else if (bm60Var instanceof bm60) {
                            x340Var.i0(-997417295);
                            xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                            z6 = false;
                            x340Var.r(false);
                        } else {
                            if (bm60Var instanceof dm60) {
                                throw p3d1.k(x340Var, -997421004, false);
                            }
                            x340Var.i0(-997414878);
                            f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                            z6 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z6);
                        x340Var.r(z6);
                    }
                    xu30Var4 = xu30VarR;
                    i15 = i17;
                } else {
                    x340Var.b0();
                    xu30Var3 = xu30Var2;
                    xu30Var4 = xu30VarR;
                    vu30Var3 = vu30Var2;
                    i15 = i;
                }
                ipb1Var3 = ipb1Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
                }
            }
            i4 |= 196608;
            vu30Var2 = vu30Var;
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 1572864;
                xu30VarR = xu30Var;
            } else {
                xu30VarR = xu30Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var.i(xu30VarR)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var.e(iC)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i3 & 128;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var.i(xu30Var2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            if ((i4 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i20 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    ipb1Var2 = null;
                }
                if (i7 != 0) {
                    vu30Var3 = blj.a;
                } else {
                    vu30Var3 = vu30Var2;
                }
                if (i9 != 0) {
                    xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                }
                if (i11 != 0) {
                    i16 = 3;
                } else {
                    i16 = i;
                }
                if (i13 != 0) {
                    xu30Var3 = blj.b;
                } else {
                    xu30Var3 = xu30Var2;
                }
                if (maaVar instanceof wul1) {
                    wul1Var = (wul1) maaVar;
                } else {
                    wul1Var = null;
                }
                if (wul1Var == null) {
                    x340Var.i0(-997531553);
                    f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                    x340Var.r(false);
                    i17 = i16;
                } else {
                    x340Var.i0(-858514218);
                    iC2 = l1d.C(i16);
                    if (iC2 != 0) {
                        if (iC2 != 1) {
                            z2 = true;
                        } else {
                            if (iC2 == 2) {
                                throw p3d1.k(x340Var, -997525332, false);
                            }
                            x340Var.i0(-858546303);
                            boolean zG7 = x340Var.g(wul1Var);
                            i19 = i4 & 112;
                            if (i19 != 32) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            z8 = z7 | zG7;
                            objT4 = x340Var.T();
                            if (z8) {
                                objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                x340Var.s0(objT4);
                            } else {
                                objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                x340Var.s0(objT4);
                            }
                            c0rVar = (c0r) objT4;
                            zI2 = x340Var.i(c0rVar);
                            objT5 = x340Var.T();
                            if (zI2) {
                                objT5 = new exm(c0rVar, (byte) 1);
                                x340Var.s0(objT5);
                            } else {
                                objT5 = new exm(c0rVar, (byte) 1);
                                x340Var.s0(objT5);
                            }
                            qxd0.i(c0rVar, (iu30) objT5, x340Var);
                            ien0 ien0VarA6 = c0rVar.a();
                            x340Var.f0(-874494126, ien0VarA6);
                            ven0VarG = rwq.g(ien0VarA6.a(), ien0VarA6.getValue(), null, x340Var, 0, 2);
                            x340Var.r(false);
                            k1rVar = (k1r) ven0VarG.getValue();
                            if (k1rVar instanceof i1r) {
                                x340Var.i0(-997512353);
                                f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                z6 = false;
                                x340Var.r(false);
                            } else {
                                z6 = false;
                                if (k1rVar instanceof j1r) {
                                    x340Var.i0(-997509143);
                                    us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                } else {
                                    if (k1rVar instanceof h1r) {
                                        throw p3d1.k(x340Var, -997513822, false);
                                    }
                                    x340Var.i0(-997507603);
                                    xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                    z6 = false;
                                    x340Var.r(false);
                                }
                            }
                            x340Var.r(z6);
                            i17 = i16;
                        }
                        x340Var.r(z6);
                    } else {
                        z2 = true;
                    }
                    x340Var.i0(-857718758);
                    zG = x340Var.g(wul1Var);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new dpb1();
                        x340Var.s0(objT);
                    } else {
                        objT = new dpb1();
                        x340Var.s0(objT);
                    }
                    dpb1Var = (dpb1) objT;
                    boolean zI13 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                    wul1Var2 = wul1Var;
                    if ((i4 & 112) != 32) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    boolean zI14 = zI13 | z3 | x340Var.i(dpb1Var);
                    if ((29360128 & i4) == 8388608) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    z5 = zI14 | z4;
                    objT2 = x340Var.T();
                    if (z5) {
                        int i210 = i16;
                        objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i210, (lnm) null);
                        i17 = i210;
                        x340Var.s0(objT2);
                    } else {
                        int i211 = i16;
                        objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i211, (lnm) null);
                        i17 = i211;
                        x340Var.s0(objT2);
                    }
                    i18 = (i4 >> 3) & 8;
                    ven0 ven0VarO6 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                    zI = x340Var.i(dpb1Var);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new l5b1(dpb1Var, (byte) 17);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new l5b1(dpb1Var, (byte) 17);
                        x340Var.s0(objT3);
                    }
                    qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                    bm60Var = (em60) ven0VarO6.getValue();
                    if (bm60Var instanceof cm60) {
                        x340Var.i0(-997418935);
                        z6 = false;
                        us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                    } else if (bm60Var instanceof bm60) {
                        x340Var.i0(-997417295);
                        xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                        z6 = false;
                        x340Var.r(false);
                    } else {
                        if (bm60Var instanceof dm60) {
                            throw p3d1.k(x340Var, -997421004, false);
                        }
                        x340Var.i0(-997414878);
                        f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                        z6 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z6);
                    x340Var.r(z6);
                }
                xu30Var4 = xu30VarR;
                i15 = i17;
            } else {
                x340Var.b0();
                xu30Var3 = xu30Var2;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var2;
                i15 = i;
            }
            ipb1Var3 = ipb1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
            }
        }
        i4 |= 24576;
        ipb1Var2 = ipb1Var;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                vu30Var2 = vu30Var;
                if (x340Var.i(vu30Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                i4 |= 1572864;
                xu30VarR = xu30Var;
            } else {
                xu30VarR = xu30Var;
                if ((i2 & 1572864) == 0) {
                    if (x340Var.i(xu30VarR)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (i == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i);
                }
                if (x340Var.e(iC)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i3 & 128;
            if (i13 != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (x340Var.i(xu30Var2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            if ((i4 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i20 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i5 != 0) {
                    ipb1Var2 = null;
                }
                if (i7 != 0) {
                    vu30Var3 = blj.a;
                } else {
                    vu30Var3 = vu30Var2;
                }
                if (i9 != 0) {
                    xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
                }
                if (i11 != 0) {
                    i16 = 3;
                } else {
                    i16 = i;
                }
                if (i13 != 0) {
                    xu30Var3 = blj.b;
                } else {
                    xu30Var3 = xu30Var2;
                }
                if (maaVar instanceof wul1) {
                    wul1Var = (wul1) maaVar;
                } else {
                    wul1Var = null;
                }
                if (wul1Var == null) {
                    x340Var.i0(-997531553);
                    f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                    x340Var.r(false);
                    i17 = i16;
                } else {
                    x340Var.i0(-858514218);
                    iC2 = l1d.C(i16);
                    if (iC2 != 0) {
                        if (iC2 != 1) {
                            z2 = true;
                        } else {
                            if (iC2 == 2) {
                                throw p3d1.k(x340Var, -997525332, false);
                            }
                            x340Var.i0(-858546303);
                            boolean zG8 = x340Var.g(wul1Var);
                            i19 = i4 & 112;
                            if (i19 != 32) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            z8 = z7 | zG8;
                            objT4 = x340Var.T();
                            if (z8) {
                                objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                x340Var.s0(objT4);
                            } else {
                                objT4 = d0rVar.c(wul1Var.getData().a(obj));
                                x340Var.s0(objT4);
                            }
                            c0rVar = (c0r) objT4;
                            zI2 = x340Var.i(c0rVar);
                            objT5 = x340Var.T();
                            if (zI2) {
                                objT5 = new exm(c0rVar, (byte) 1);
                                x340Var.s0(objT5);
                            } else {
                                objT5 = new exm(c0rVar, (byte) 1);
                                x340Var.s0(objT5);
                            }
                            qxd0.i(c0rVar, (iu30) objT5, x340Var);
                            ien0 ien0VarA7 = c0rVar.a();
                            x340Var.f0(-874494126, ien0VarA7);
                            ven0VarG = rwq.g(ien0VarA7.a(), ien0VarA7.getValue(), null, x340Var, 0, 2);
                            x340Var.r(false);
                            k1rVar = (k1r) ven0VarG.getValue();
                            if (k1rVar instanceof i1r) {
                                x340Var.i0(-997512353);
                                f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                                z6 = false;
                                x340Var.r(false);
                            } else {
                                z6 = false;
                                if (k1rVar instanceof j1r) {
                                    x340Var.i0(-997509143);
                                    us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                                } else {
                                    if (k1rVar instanceof h1r) {
                                        throw p3d1.k(x340Var, -997513822, false);
                                    }
                                    x340Var.i0(-997507603);
                                    xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                    z6 = false;
                                    x340Var.r(false);
                                }
                            }
                            x340Var.r(z6);
                            i17 = i16;
                        }
                        x340Var.r(z6);
                    } else {
                        z2 = true;
                    }
                    x340Var.i0(-857718758);
                    zG = x340Var.g(wul1Var);
                    objT = x340Var.T();
                    if (zG) {
                        objT = new dpb1();
                        x340Var.s0(objT);
                    } else {
                        objT = new dpb1();
                        x340Var.s0(objT);
                    }
                    dpb1Var = (dpb1) objT;
                    boolean zI15 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                    wul1Var2 = wul1Var;
                    if ((i4 & 112) != 32) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    boolean zI16 = zI15 | z3 | x340Var.i(dpb1Var);
                    if ((29360128 & i4) == 8388608) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    z5 = zI16 | z4;
                    objT2 = x340Var.T();
                    if (z5) {
                        int i212 = i16;
                        objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i212, (lnm) null);
                        i17 = i212;
                        x340Var.s0(objT2);
                    } else {
                        int i213 = i16;
                        objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i213, (lnm) null);
                        i17 = i213;
                        x340Var.s0(objT2);
                    }
                    i18 = (i4 >> 3) & 8;
                    ven0 ven0VarO7 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                    zI = x340Var.i(dpb1Var);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new l5b1(dpb1Var, (byte) 17);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new l5b1(dpb1Var, (byte) 17);
                        x340Var.s0(objT3);
                    }
                    qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                    bm60Var = (em60) ven0VarO7.getValue();
                    if (bm60Var instanceof cm60) {
                        x340Var.i0(-997418935);
                        z6 = false;
                        us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                    } else if (bm60Var instanceof bm60) {
                        x340Var.i0(-997417295);
                        xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                        z6 = false;
                        x340Var.r(false);
                    } else {
                        if (bm60Var instanceof dm60) {
                            throw p3d1.k(x340Var, -997421004, false);
                        }
                        x340Var.i0(-997414878);
                        f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                        z6 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z6);
                    x340Var.r(z6);
                }
                xu30Var4 = xu30VarR;
                i15 = i17;
            } else {
                x340Var.b0();
                xu30Var3 = xu30Var2;
                xu30Var4 = xu30VarR;
                vu30Var3 = vu30Var2;
                i15 = i;
            }
            ipb1Var3 = ipb1Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
            }
        }
        i4 |= 196608;
        vu30Var2 = vu30Var;
        i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= 1572864;
            xu30VarR = xu30Var;
        } else {
            xu30VarR = xu30Var;
            if ((i2 & 1572864) == 0) {
                if (x340Var.i(xu30VarR)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (i == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i);
            }
            if (x340Var.e(iC)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        i13 = i3 & 128;
        if (i13 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (x340Var.i(xu30Var2)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i4 |= i14;
        }
        if ((i4 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i20 != 0) {
                qim0Var2 = nim0.a;
            }
            if (i5 != 0) {
                ipb1Var2 = null;
            }
            if (i7 != 0) {
                vu30Var3 = blj.a;
            } else {
                vu30Var3 = vu30Var2;
            }
            if (i9 != 0) {
                xu30VarR = apo.r(-1560814006, new a2(vu30Var3, (byte) 14), x340Var);
            }
            if (i11 != 0) {
                i16 = 3;
            } else {
                i16 = i;
            }
            if (i13 != 0) {
                xu30Var3 = blj.b;
            } else {
                xu30Var3 = xu30Var2;
            }
            if (maaVar instanceof wul1) {
                wul1Var = (wul1) maaVar;
            } else {
                wul1Var = null;
            }
            if (wul1Var == null) {
                x340Var.i0(-997531553);
                f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                x340Var.r(false);
                i17 = i16;
            } else {
                x340Var.i0(-858514218);
                iC2 = l1d.C(i16);
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        z2 = true;
                    } else {
                        if (iC2 == 2) {
                            throw p3d1.k(x340Var, -997525332, false);
                        }
                        x340Var.i0(-858546303);
                        boolean zG9 = x340Var.g(wul1Var);
                        i19 = i4 & 112;
                        if (i19 != 32) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        z8 = z7 | zG9;
                        objT4 = x340Var.T();
                        if (z8) {
                            objT4 = d0rVar.c(wul1Var.getData().a(obj));
                            x340Var.s0(objT4);
                        } else {
                            objT4 = d0rVar.c(wul1Var.getData().a(obj));
                            x340Var.s0(objT4);
                        }
                        c0rVar = (c0r) objT4;
                        zI2 = x340Var.i(c0rVar);
                        objT5 = x340Var.T();
                        if (zI2) {
                            objT5 = new exm(c0rVar, (byte) 1);
                            x340Var.s0(objT5);
                        } else {
                            objT5 = new exm(c0rVar, (byte) 1);
                            x340Var.s0(objT5);
                        }
                        qxd0.i(c0rVar, (iu30) objT5, x340Var);
                        ien0 ien0VarA8 = c0rVar.a();
                        x340Var.f0(-874494126, ien0VarA8);
                        ven0VarG = rwq.g(ien0VarA8.a(), ien0VarA8.getValue(), null, x340Var, 0, 2);
                        x340Var.r(false);
                        k1rVar = (k1r) ven0VarG.getValue();
                        if (k1rVar instanceof i1r) {
                            x340Var.i0(-997512353);
                            f(maaVar, obj, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i4 & 14) | (((i4 >> 3) & 8) << 3) | i19 | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                            z6 = false;
                            x340Var.r(false);
                        } else {
                            z6 = false;
                            if (k1rVar instanceof j1r) {
                                x340Var.i0(-997509143);
                                us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                            } else {
                                if (k1rVar instanceof h1r) {
                                    throw p3d1.k(x340Var, -997513822, false);
                                }
                                x340Var.i0(-997507603);
                                xu30VarR.invoke(((k1r) ven0VarG.getValue()).a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                                z6 = false;
                                x340Var.r(false);
                            }
                        }
                        x340Var.r(z6);
                        i17 = i16;
                    }
                    x340Var.r(z6);
                } else {
                    z2 = true;
                }
                x340Var.i0(-857718758);
                zG = x340Var.g(wul1Var);
                objT = x340Var.T();
                if (zG) {
                    objT = new dpb1();
                    x340Var.s0(objT);
                } else {
                    objT = new dpb1();
                    x340Var.s0(objT);
                }
                dpb1Var = (dpb1) objT;
                boolean zI17 = x340Var.i(d0rVar) | x340Var.i(wul1Var);
                wul1Var2 = wul1Var;
                if ((i4 & 112) != 32) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                boolean zI18 = zI17 | z3 | x340Var.i(dpb1Var);
                if ((29360128 & i4) == 8388608) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                z5 = zI18 | z4;
                objT2 = x340Var.T();
                if (z5) {
                    int i214 = i16;
                    objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i214, (lnm) null);
                    i17 = i214;
                    x340Var.s0(objT2);
                } else {
                    int i215 = i16;
                    objT2 = new chi0(d0rVar, wul1Var2, obj, dpb1Var, i215, (lnm) null);
                    i17 = i215;
                    x340Var.s0(objT2);
                }
                i18 = (i4 >> 3) & 8;
                ven0 ven0VarO8 = yto.o(cm60.a, wul1Var2, obj, (vu30) objT2, x340Var, (i18 << 6) | 6 | ((i4 << 3) & 896));
                zI = x340Var.i(dpb1Var);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new l5b1(dpb1Var, (byte) 17);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new l5b1(dpb1Var, (byte) 17);
                    x340Var.s0(objT3);
                }
                qxd0.i(wul1Var2, (iu30) objT3, x340Var);
                bm60Var = (em60) ven0VarO8.getValue();
                if (bm60Var instanceof cm60) {
                    x340Var.i0(-997418935);
                    z6 = false;
                    us71.j((i4 >> 15) & 14, vu30Var3, x340Var, false);
                } else if (bm60Var instanceof bm60) {
                    x340Var.i0(-997417295);
                    xu30VarR.invoke(bm60Var.a, x340Var, Integer.valueOf((i4 >> 15) & 112));
                    z6 = false;
                    x340Var.r(false);
                } else {
                    if (bm60Var instanceof dm60) {
                        throw p3d1.k(x340Var, -997421004, false);
                    }
                    x340Var.i0(-997414878);
                    f(maaVar, ((dm60) bm60Var).a, ipb1Var2, qim0Var2, xu30Var3, x340Var, (i18 << 3) | (i4 & 14) | ((i4 >> 6) & 896) | (i4 & 7168) | ((i4 >> 12) & 57344));
                    z6 = false;
                    x340Var.r(false);
                }
                x340Var.r(z6);
                x340Var.r(z6);
            }
            xu30Var4 = xu30VarR;
            i15 = i17;
        } else {
            x340Var.b0();
            xu30Var3 = xu30Var2;
            xu30Var4 = xu30VarR;
            vu30Var3 = vu30Var2;
            i15 = i;
        }
        ipb1Var3 = ipb1Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cpb1(maaVar, obj, d0rVar, qim0Var2, ipb1Var3, vu30Var3, xu30Var4, i15, xu30Var3, i2, i3);
        }
    }

    public static final void f(maa maaVar, Object obj, ipb1 ipb1Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(376500585);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(maaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ipb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2;
            xu30Var.invoke(apo.r(55622244, new nk31((byte) 23, i3, maaVar, obj, ipb1Var, qim0Var), x340Var), x340Var, Integer.valueOf(((i3 >> 9) & 112) | 6));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(maaVar, obj, ipb1Var, false, qim0Var, xu30Var, i, (byte) 6);
        }
    }

    public static final void g(int i, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1172312566);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gdx gdxVarS = yla.s(x340Var);
            gbx gbxVar = new gbx(z50.c, function0);
            long jE = z4p1.e(452984831);
            cr31 cr31Var = er31.a;
            qim0 qim0Var3 = nim0.a;
            wro1.l(gbxVar, u291.r(dug.f(qim0Var3, jE, cr31Var), 32.0f), null, gdxVarS, null, j2iVar, x340Var, (i3 << 9) & 458752, 20);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pv50(function0, qim0Var2, j2iVar, i, (byte) 0);
        }
    }

    public static final void h(xtb0 xtb0Var, q1d0 q1d0Var, String str, b0k b0kVar, int i) {
        xtb0 xtb0Var2;
        q1d0 q1d0Var2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(220249581);
        int i2 = (x340Var.i(xtb0Var) ? 4 : 2) | i | (x340Var.i(q1d0Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = ((i2 & 112) == 32 || x340Var.i(q1d0Var)) | ((i2 & 896) == 256) | x340Var.i(xtb0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                xtb0Var2 = xtb0Var;
                q1d0Var2 = q1d0Var;
                str2 = str;
                l4f0 l4f0Var = new l4f0(q1d0Var2, xtb0Var2, str2, (lnm) null, (byte) 5);
                x340Var.s0(l4f0Var);
                objT = l4f0Var;
            } else {
                xtb0Var2 = xtb0Var;
                q1d0Var2 = q1d0Var;
                str2 = str;
            }
            qxd0.t(str2, x340Var, (vu30) objT);
        } else {
            xtb0Var2 = xtb0Var;
            q1d0Var2 = q1d0Var;
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(xtb0Var2, q1d0Var2, str2, i, (byte) 2);
        }
    }

    public static final String i(String str) {
        char cCharAt;
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final rwm j(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1635047688:
                if (str.equals("MEMBER_OF_BAND")) {
                    return rwm.c;
                }
                return null;
            case 62365232:
                if (str.equals("ALIAS")) {
                    return rwm.d;
                }
                return null;
            case 254334982:
                if (str.equals("COLLABORATOR")) {
                    return rwm.a;
                }
                return null;
            case 1460340708:
                if (str.equals("BAND_MEMBER")) {
                    return rwm.b;
                }
                return null;
            default:
                return null;
        }
    }

    public static String k(String str, Charset charset) {
        try {
            str.getClass();
            String strName = charset.name();
            strName.getClass();
            return URLDecoder.decode(str, strName);
        } catch (UnsupportedEncodingException e) {
            eg.f(e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    public static final p6i1 l(List list) {
        int iNextIndex;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (((h8k1) listIterator.previous()).a instanceof x5h0) {
                iNextIndex = listIterator.nextIndex();
                if (iNextIndex < 0) {
                    return null;
                }
                return new p6i1(iNextIndex, ((h8k1) list.get(iNextIndex)).b);
            }
        }
        iNextIndex = -1;
        if (iNextIndex < 0) {
            return null;
        }
        return new p6i1(iNextIndex, ((h8k1) list.get(iNextIndex)).b);
    }

    public static final List m(bbr0 bbr0Var) {
        e5b0 e5b0VarA = bbr0Var.b0(e5b0.class).a();
        if (e5b0VarA != null) {
            return e5b0VarA.c;
        }
        return null;
    }

    public static final iu30 n(bbr0 bbr0Var) {
        bbr0Var.b0(e5b0.class).a();
        return null;
    }

    public static final mfh0 o(isb0 isb0Var, int i, long j, sjr0 sjr0Var, long j2, qqq0 qqq0Var, nl3 nl3Var, pl3 pl3Var, flb0 flb0Var, int i2, fdn0 fdn0Var) {
        List list;
        Object objD = sjr0Var.d(i);
        List list2 = (List) fdn0Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = isb0Var.a(i);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((afh0) listA.get(i3)).H(j));
            }
            fdn0Var.i(i, arrayList);
            list = arrayList;
        }
        return new mfh0(i, i2, list, j2, objD, qqq0Var, nl3Var, pl3Var, flb0Var);
    }

    public static final List p(bbr0 bbr0Var) {
        e5b0 e5b0VarA = bbr0Var.b0(e5b0.class).a();
        if (e5b0VarA != null) {
            return e5b0VarA.a;
        }
        return null;
    }

    public static p700 q(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        String upperCase = string2.toUpperCase(locale);
        if (upperCase == null) {
            bhn0.i("Name is null");
        } else if (!upperCase.equals("MANUAL") && !upperCase.equals("INFERENCE")) {
            hhg1.n("No enum constant com.facebook.appevents.codeless.internal.EventBinding.MappingMethod.".concat(upperCase));
        }
        String upperCase2 = jSONObject.getString("event_type").toUpperCase(locale);
        if (upperCase2 == null) {
            bhn0.i("Name is null");
        } else if (!upperCase2.equals("CLICK") && !upperCase2.equals("SELECTED") && !upperCase2.equals("TEXT_CHANGED")) {
            hhg1.n("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase2));
        }
        jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(new v8s0(jSONArray.getJSONObject(i)));
        }
        jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length2 = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add(new kpr0(jSONArrayOptJSONArray.getJSONObject(i2)));
            }
        }
        jSONObject.optString("component_id");
        return new p700(string, jSONObject.optString("activity_name"), arrayList, arrayList2);
    }

    public static final String r(bbr0 bbr0Var) {
        e5b0 e5b0VarA = bbr0Var.b0(e5b0.class).a();
        if (e5b0VarA != null) {
            return e5b0VarA.d;
        }
        return null;
    }

    public static View s(View view) {
        View viewZ;
        w5o0 w5o0Var = view instanceof w5o0 ? (w5o0) view : null;
        return (w5o0Var == null || (viewZ = w5o0.z(w5o0Var)) == null) ? view : viewZ;
    }

    public static final List t(bbr0 bbr0Var) {
        e5b0 e5b0VarA = bbr0Var.b0(e5b0.class).a();
        if (e5b0VarA != null) {
            return e5b0VarA.b;
        }
        return null;
    }

    public static final boolean u(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final xjr0 v(isb0 isb0Var, int i, sjr0 sjr0Var, int i2, int i3, int i4, int i5, int i6, int i7, long j, qqq0 qqq0Var, pl3 pl3Var, nl3 nl3Var, long j2, int i8, int i9, edn0 edn0Var, xu91 xu91Var, ven0 ven0Var, c9n c9nVar, wat watVar, mtb0 mtb0Var, fdn0 fdn0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        n36 n36Var;
        int i14;
        int i15;
        int i16;
        int i17;
        mfh0 mfh0Var;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i21;
        int i22;
        int i23;
        ArrayList arrayList3;
        int i24;
        int i25;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Object obj;
        int i26;
        int i27;
        xu91 xu91Var2;
        ArrayList arrayList7;
        int[] iArr;
        ArrayList arrayList8;
        ArrayList arrayList9;
        isb0 isb0Var2 = isb0Var;
        p890 p890Var = isb0Var2.b;
        if (i3 < 0) {
            tf80.a("negative beforeContentPadding");
        }
        if (i4 < 0) {
            tf80.a("negative afterContentPadding");
        }
        int i28 = i8 + i5;
        int i29 = 0;
        int i30 = i28 < 0 ? 0 : i28;
        int i31 = i9;
        if (i31 > i) {
            i31 = i;
        }
        qqq0 qqq0Var2 = qqq0.a;
        long jB = jjl.b(0, qqq0Var == qqq0Var2 ? hjl.i(j) : i8, 0, qqq0Var != qqq0Var2 ? hjl.h(j) : i8, 5);
        if (i <= 0) {
            return new xjr0(i8, i5, i4, qqq0Var, -i3, i2 + i4, i31, xu91Var, (hfh0) mtb0Var.invoke(Integer.valueOf(hjl.k(j)), Integer.valueOf(hjl.j(j)), new g6f0((byte) 17)), c9nVar, watVar, jB);
        }
        long j3 = jB;
        int i32 = i6;
        int i33 = i7;
        while (i32 > 0 && i33 > 0) {
            i32--;
            i33 -= i30;
        }
        int i34 = i33 * (-1);
        if (i32 >= i) {
            i32 = i - 1;
            i34 = 0;
        }
        n36 n36Var2 = new n36();
        int i35 = -i3;
        int i36 = i35 + (i5 < 0 ? i5 : 0);
        int i37 = i34 + i36;
        int iMax = 0;
        while (i37 < 0 && i32 > 0) {
            int i38 = i32 - 1;
            int i39 = i37;
            flb0 layoutDirection = p890Var.getLayoutDirection();
            p890 p890Var2 = p890Var;
            int i40 = i29;
            int i41 = i30;
            long j4 = j3;
            mfh0 mfh0VarO = o(isb0Var2, i38, j4, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, layoutDirection, i8, fdn0Var);
            n36Var2.add(i40, mfh0VarO);
            iMax = Math.max(iMax, mfh0VarO.i);
            i37 = i39 + i41;
            i30 = i41;
            i32 = i38;
            j3 = j4;
            i31 = i31;
            qqq0Var2 = qqq0Var2;
            isb0Var2 = isb0Var;
            p890Var = p890Var2;
            i29 = i40;
        }
        p890 p890Var3 = p890Var;
        int i42 = i29;
        int i43 = i31;
        int i44 = i30;
        qqq0 qqq0Var3 = qqq0Var2;
        long j5 = j3;
        if (i37 < i36) {
            i37 = i36;
        }
        int i45 = i37 - i36;
        int i46 = i2 + i4;
        int i47 = i46 < 0 ? i42 : i46;
        int i48 = -i45;
        int i49 = i42;
        int i50 = i49;
        int i51 = i32;
        while (i49 < n36Var2.c) {
            if (i48 >= i47) {
                n36Var2.c(i49);
                i50 = 1;
            } else {
                i51++;
                i48 += i44;
                i49++;
            }
        }
        int i52 = i;
        int i53 = i50;
        int i54 = i32;
        int i55 = i45;
        while (i51 < i52 && (i48 < i47 || i48 <= 0 || n36Var2.isEmpty())) {
            int i56 = i44;
            int i57 = i47;
            int i58 = i48;
            int i59 = i52;
            int i60 = i51;
            mfh0 mfh0VarO2 = o(isb0Var, i60, j5, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, p890Var3.getLayoutDirection(), i8, fdn0Var);
            int i61 = i59 - 1;
            int i62 = i58 + (i60 == i61 ? i8 : i56);
            if (i62 > i36 || i60 == i61) {
                iMax = Math.max(iMax, mfh0VarO2.i);
                n36Var2.addLast(mfh0VarO2);
            } else {
                i55 -= i56;
                i54 = i60 + 1;
                i53 = 1;
            }
            i51 = i60 + 1;
            i52 = i59;
            i48 = i62;
            i47 = i57;
            i44 = i56;
        }
        if (i48 < i2) {
            int i63 = i2 - i48;
            int i64 = i48 + i63;
            int i65 = i55 - i63;
            while (i65 < i3 && i54 > 0) {
                i54--;
                mfh0 mfh0VarO3 = o(isb0Var, i54, j5, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, p890Var3.getLayoutDirection(), i8, fdn0Var);
                n36Var2.add(0, mfh0VarO3);
                iMax = Math.max(iMax, mfh0VarO3.i);
                i65 += i44;
                i51 = i51;
            }
            i11 = i51;
            int i66 = i65;
            if (i66 < 0) {
                i10 = i64 + i66;
                i12 = 0;
            } else {
                i10 = i64;
                i12 = i66;
            }
        } else {
            i11 = i51;
            i12 = i55;
        }
        if (i12 < 0) {
            i10 = i48;
            tf80.a("invalid currentFirstPageScrollOffset");
        }
        i10 = i48;
        int i67 = -i12;
        mfh0 mfh0Var2 = (mfh0) n36Var2.first();
        if (i3 > 0 || i5 < 0) {
            int iB = n36Var2.b();
            mfh0 mfh0Var3 = mfh0Var2;
            int i68 = 0;
            while (true) {
                if (i68 >= iB || i12 == 0) {
                    i13 = i44;
                    break;
                }
                i13 = i44;
                if (i13 > i12 || i68 == p7h.L(n36Var2)) {
                    break;
                }
                i12 -= i13;
                i68++;
                mfh0Var3 = (mfh0) n36Var2.get(i68);
                i44 = i13;
            }
            mfh0Var2 = mfh0Var3;
        } else {
            i13 = i44;
        }
        int i69 = i12;
        int iMax2 = Math.max(0, i54 - i43);
        int i70 = 1;
        int i71 = i54 - 1;
        if (iMax2 <= i71) {
            ArrayList arrayList10 = null;
            while (true) {
                if (arrayList10 == null) {
                    arrayList10 = new ArrayList();
                }
                int i72 = i43;
                n36Var = n36Var2;
                i14 = i72;
                i15 = iMax;
                i16 = iMax2;
                i17 = i10;
                mfh0Var = mfh0Var2;
                int i73 = i71;
                i18 = i13;
                arrayList9 = arrayList10;
                i19 = i70;
                i20 = i67;
                arrayList9.add(o(isb0Var, i73, j5, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, p890Var3.getLayoutDirection(), i8, fdn0Var));
                if (i73 == i16) {
                    break;
                }
                i71 = i73 - 1;
                i43 = i14;
                n36Var2 = n36Var;
                arrayList10 = arrayList9;
                iMax2 = i16;
                i67 = i20;
                i10 = i17;
                i13 = i18;
                mfh0Var2 = mfh0Var;
                i70 = i19;
                iMax = i15;
            }
            arrayList = arrayList9;
        } else {
            n36Var = n36Var2;
            i14 = i43;
            i15 = iMax;
            i16 = iMax2;
            i17 = i10;
            mfh0Var = mfh0Var2;
            i18 = i13;
            i19 = 1;
            i20 = i67;
            arrayList = null;
        }
        int[] iArr2 = edn0Var.a;
        int i74 = edn0Var.b;
        int i75 = 0;
        while (i75 < i74) {
            int i76 = i74;
            int i77 = iArr2[i75];
            if (i77 < i16) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList11 = arrayList;
                arrayList11.add(o(isb0Var, i77, j5, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, p890Var3.getLayoutDirection(), i8, fdn0Var));
                arrayList = arrayList11;
            }
            i75++;
            iArr2 = iArr2;
            i74 = i76;
            i19 = i19;
        }
        int i78 = i19;
        ArrayList arrayList12 = z6x.a;
        ArrayList arrayList13 = arrayList == null ? arrayList12 : arrayList;
        ArrayList arrayList14 = arrayList13;
        int size = arrayList14.size();
        int iMax3 = i15;
        for (int i79 = 0; i79 < size; i79++) {
            iMax3 = Math.max(iMax3, ((mfh0) arrayList13.get(i79)).i);
        }
        int i80 = ((mfh0) n36Var.last()).a;
        int iMin = Math.min(i14, (i52 - i80) - 1) + i80;
        int i81 = i80 + 1;
        if (i81 <= iMin) {
            ArrayList arrayList15 = null;
            while (true) {
                if (arrayList15 == null) {
                    arrayList15 = new ArrayList();
                }
                arrayList2 = arrayList12;
                i21 = i14;
                i22 = iMax3;
                i23 = iMin;
                arrayList8 = arrayList15;
                int i82 = i81;
                arrayList8.add(o(isb0Var, i82, j5, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, p890Var3.getLayoutDirection(), i8, fdn0Var));
                if (i82 == i23) {
                    break;
                }
                i81 = i82 + 1;
                iMin = i23;
                arrayList15 = arrayList8;
                iMax3 = i22;
                i14 = i21;
                arrayList12 = arrayList2;
            }
            arrayList3 = arrayList8;
        } else {
            arrayList2 = arrayList12;
            i21 = i14;
            i22 = iMax3;
            i23 = iMin;
            arrayList3 = null;
        }
        int[] iArr3 = edn0Var.a;
        int i83 = 0;
        for (int i84 = edn0Var.b; i83 < i84; i84 = i84) {
            int i85 = iArr3[i83];
            if (i23 + 1 <= i85 && i85 < i52) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                ArrayList arrayList16 = arrayList3;
                arrayList16.add(o(isb0Var, i85, j5, sjr0Var, j2, qqq0Var, nl3Var, pl3Var, p890Var3.getLayoutDirection(), i8, fdn0Var));
                arrayList3 = arrayList16;
            }
            i23 = i23;
            j5 = j5;
            i83++;
            i69 = i69;
            i53 = i53;
        }
        int i86 = i69;
        boolean z = i53;
        long j6 = j5;
        if (arrayList3 == null) {
            arrayList3 = arrayList2;
        }
        ArrayList arrayList17 = arrayList3;
        int size2 = arrayList17.size();
        int iMax4 = i22;
        for (int i87 = 0; i87 < size2; i87++) {
            iMax4 = Math.max(iMax4, ((mfh0) arrayList3.get(i87)).i);
        }
        mfh0 mfh0Var4 = mfh0Var;
        int i88 = (u890.j(mfh0Var4, n36Var.first()) && arrayList13.isEmpty() && arrayList3.isEmpty()) ? i78 : 0;
        int iG = jjl.g(qqq0Var == qqq0Var3 ? iMax4 : i17, j);
        if (qqq0Var == qqq0Var3) {
            iMax4 = i17;
        }
        int iF = jjl.f(iMax4, j);
        int i89 = qqq0Var == qqq0Var3 ? iF : iG;
        int i90 = i17;
        int i91 = i90 < Math.min(i89, i2) ? i78 : 0;
        if (i91 == 0 || i20 == 0) {
            i24 = i20;
        } else {
            StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
            i24 = i20;
            sb.append(i24);
            tf80.c(sb.toString());
        }
        int i92 = i24;
        ArrayList arrayList18 = new ArrayList(arrayList3.size() + arrayList13.size() + n36Var.b());
        if (i91 != 0) {
            if (!arrayList13.isEmpty() || !arrayList3.isEmpty()) {
                tf80.a("No extra pages");
            }
            int iB2 = n36Var.b();
            int i93 = i89;
            int[] iArr4 = new int[iB2];
            for (int i94 = 0; i94 < iB2; i94++) {
                iArr4[i94] = i8;
            }
            int[] iArr5 = new int[iB2];
            float fM0 = p890Var3.M0(i5);
            i25 = i86;
            d36 d36Var = new d36(fM0, false, (e36) null);
            flb0 flb0Var = flb0.a;
            if (qqq0Var == qqq0Var3) {
                iArr = iArr5;
                d36Var.e(isb0Var, i93, iArr4, flb0Var, iArr);
            } else {
                iArr = iArr5;
                d36Var.e(isb0Var, i93, iArr4, flb0Var, iArr);
            }
            tr80 tr80VarL0 = f46.l0(iArr);
            int i95 = ((rr80) tr80VarL0).b;
            int i96 = ((rr80) tr80VarL0).c;
            if ((i96 > 0 && i95 >= 0) || (i96 < 0 && i95 <= 0)) {
                int i97 = 0;
                while (true) {
                    int i98 = iArr[i97];
                    mfh0 mfh0Var5 = (mfh0) n36Var.get(i97);
                    mfh0Var5.b(i98, iG, iF);
                    arrayList18.add(mfh0Var5);
                    if (i97 == i95) {
                        break;
                    }
                    i97 += i96;
                }
            }
        } else {
            i25 = i86;
            mfh0Var4 = mfh0Var4;
            i88 = i88;
            arrayList13 = arrayList13;
            n36Var = n36Var;
            i21 = i21;
            i2 = i2;
            i90 = i90;
            int size3 = arrayList14.size();
            int i99 = i92;
            for (int i100 = 0; i100 < size3; i100++) {
                mfh0 mfh0Var6 = (mfh0) arrayList13.get(i100);
                i99 -= i28;
                mfh0Var6.b(i99, iG, iF);
                arrayList18.add(mfh0Var6);
            }
            int iB3 = n36Var.b();
            int i101 = i92;
            for (int i102 = 0; i102 < iB3; i102++) {
                mfh0 mfh0Var7 = (mfh0) n36Var.get(i102);
                mfh0Var7.b(i101, iG, iF);
                arrayList18.add(mfh0Var7);
                i101 += i28;
            }
            int size4 = arrayList17.size();
            for (int i103 = 0; i103 < size4; i103++) {
                mfh0 mfh0Var8 = (mfh0) arrayList3.get(i103);
                mfh0Var8.b(i101, iG, iF);
                arrayList18.add(mfh0Var8);
                i101 += i28;
            }
        }
        if (i88 != 0) {
            arrayList4 = arrayList18;
        } else {
            arrayList4 = new ArrayList(arrayList18.size());
            int size5 = arrayList18.size();
            int i104 = 0;
            while (i104 < size5) {
                Object obj2 = arrayList18.get(i104);
                mfh0 mfh0Var9 = (mfh0) obj2;
                int i105 = size5;
                if (mfh0Var9.a >= ((mfh0) n36Var.first()).a && mfh0Var9.a <= ((mfh0) n36Var.last()).a) {
                    arrayList4.add(obj2);
                }
                i104++;
                size5 = i105;
            }
        }
        if (arrayList13.isEmpty()) {
            arrayList5 = arrayList2;
        } else {
            ArrayList arrayList19 = new ArrayList(arrayList18.size());
            int size6 = arrayList18.size();
            for (int i106 = 0; i106 < size6; i106++) {
                Object obj3 = arrayList18.get(i106);
                if (((mfh0) obj3).a < ((mfh0) n36Var.first()).a) {
                    arrayList19.add(obj3);
                }
            }
            arrayList5 = arrayList19;
        }
        if (arrayList3.isEmpty()) {
            arrayList6 = arrayList2;
        } else {
            ArrayList arrayList20 = new ArrayList(arrayList18.size());
            int size7 = arrayList18.size();
            for (int i107 = 0; i107 < size7; i107++) {
                Object obj4 = arrayList18.get(i107);
                if (((mfh0) obj4).a > ((mfh0) n36Var.last()).a) {
                    arrayList20.add(obj4);
                }
            }
            arrayList6 = arrayList20;
        }
        int i108 = i2 + i3 + i4;
        if (arrayList4.isEmpty()) {
            i26 = i3;
            arrayList7 = arrayList4;
            i27 = iG;
            obj = null;
            xu91Var2 = xu91Var;
        } else {
            obj = arrayList4.get(0);
            i26 = i3;
            i27 = iG;
            xu91Var2 = xu91Var;
            float f = -Math.abs(((mfh0) obj).k - xu91Var2.a(i108, i8, i26, i4));
            int iL = p7h.L(arrayList4);
            int i109 = i78;
            if (i109 <= iL) {
                while (true) {
                    Object obj5 = arrayList4.get(i109);
                    arrayList7 = arrayList4;
                    Object obj6 = obj;
                    float f2 = -Math.abs(((mfh0) obj5).k - xu91Var2.a(i108, i8, i26, i4));
                    if (Float.compare(f, f2) < 0) {
                        f = f2;
                        obj = obj5;
                    } else {
                        obj = obj6;
                    }
                    if (i109 == iL) {
                        break;
                    }
                    i109++;
                    arrayList4 = arrayList7;
                }
            } else {
                arrayList7 = arrayList4;
            }
        }
        mfh0 mfh0Var10 = (mfh0) obj;
        int i110 = i18;
        return new xjr0(arrayList7, i8, i5, i4, qqq0Var, i35, i46, i21, mfh0Var4, mfh0Var10, i110 == 0 ? 0.0f : yoi1.o((xu91Var2.a(i108, i8, i26, i4) - (mfh0Var10 != null ? mfh0Var10.k : 0)) / i110, -0.5f, 0.5f), i25, i11 < i52 || i90 > i2, xu91Var2, (hfh0) mtb0Var.invoke(Integer.valueOf(i27), Integer.valueOf(iF), new gub0(ven0Var, arrayList18, (byte) 11)), z, arrayList5, arrayList6, c9nVar, watVar, j6);
    }

    public static final void w(mjm mjmVar, String str, tv80 tv80Var, Long l) {
        mjmVar.a(str.concat(":dna"), tv80Var, l != null ? mno1.h(new mmr0[]{new mmr0("extra_background_color", Long.valueOf(l.longValue()))}) : null);
    }

    public static final void x(mjm mjmVar, String str, String str2, tv80 tv80Var, long j) {
        mjmVar.a(gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(str2, new String[]{":"}, 0, 6))), tv80Var, mno1.h(new mmr0[]{new mmr0("extra_background_color", Long.valueOf(j))}));
    }

    public static void y(mjm mjmVar, String str, tv80 tv80Var, String str2, rwm rwmVar, Integer num, String str3, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            rwmVar = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("extra_track_uri", str2);
        }
        if (rwmVar != null) {
            bundle.putString("extra_contributor_relationship", rwmVar.name());
        }
        if (num != null) {
            bundle.putInt("extra_contributor_songs_together", num.intValue());
        }
        if (str3 != null) {
            bundle.putString("extra_context_artist_uri", str3);
        }
        mjmVar.a(l1d.m("spotify:internal:dna:contributor:", (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6))), tv80Var, bundle.isEmpty() ? null : bundle);
    }

    public static final void z(mjm mjmVar, String str, tv80 tv80Var, Long l) {
        String strConcat = str.concat(":dna");
        w6b1 w6b1VarA = f7b1.a(blc0.Kh);
        w6b1VarA.getClass();
        mjmVar.a(w6b1VarA.c.get(0) + "?target=" + Uri.encode(strConcat), tv80Var, mno1.h(new mmr0[]{new mmr0("extra_background_color", l)}));
    }
}
