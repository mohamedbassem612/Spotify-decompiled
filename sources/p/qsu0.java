package p;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import com.spotify.martini.martinidata.model.Mode;
import j$.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qsu0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsu0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        z3y0 z3y0Var = (z3y0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        rwj rwjVar = (rwj) this.b;
        boolean z = ((m980) rwjVar.g).b;
        qsx qsxVar = qsx.c;
        String strO0 = cwl1.o0(x340Var, z ? 2131960640 : 2131954729);
        String strO1 = cwl1.o0(x340Var, z ? 2131960639 : 2131954728);
        int i = (iIntValue & 896) ^ 384;
        boolean z2 = true;
        boolean z3 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z3 || objT == m4cVar) {
            objT = new h7w0(iu30Var, (byte) 25);
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, qsxVar, (Function0) objT, (qim0) null, false, strO1, (v2g) null, (vu30) null, x340Var2, qsx.d << 3, 216);
        cio cioVar = z3y0Var.d;
        if (!z3y0Var.a || cioVar == null) {
            x340Var2.i0(191973239);
            x340Var2.r(false);
        } else {
            x340Var2.i0(191504271);
            asn asnVar = (asn) rwjVar.f;
            String str = (String) rwjVar.d;
            boolean z4 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new ppv0(iu30Var, (byte) 16);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean z5 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT3 = x340Var2.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new ppv0(iu30Var, (byte) 17);
                x340Var2.s0(objT3);
            }
            iu30 iu30Var3 = (iu30) objT3;
            if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z2 = false;
            }
            Object objT4 = x340Var2.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new h7w0(iu30Var, (byte) 26);
                x340Var2.s0(objT4);
            }
            asnVar.c(str, cioVar, iu30Var2, iu30Var3, (Function0) objT4, x340Var2, 0);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q4y0 q4y0Var = (q4y0) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a);
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        qim0 qim0VarN = anm1.N("prompted_playlist_feedback_section", uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 8.0f, 5));
        ngs0 ngs0Var = (ngs0) this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String strO0 = cwl1.o0(x340Var, 2131960631);
        lee1 lee1Var = cbx.d(x340Var).h;
        long j = cbx.a(x340Var).b.a;
        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
        cvx cvxVar3 = cbx.b(x340Var).b;
        uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, qim0VarF3), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        cvx cvxVar4 = cbx.b(x340Var).b;
        op71.g(x340Var, u291.h(nim0Var, 4.0f));
        mr10 mr10Var = (mr10) ngs0Var.d;
        fr10 fr10Var = new fr10(q4y0Var.a, (String) null, false, Mode.PROMPT_PLAYLIST, (String) null, false, 110);
        cvx cvxVar5 = cbx.b(x340Var).b;
        otw.c(mr10Var, fr10Var, uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), (ipb1) null, x340Var, 0, 8);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:105:0x034d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0362  */
    /* JADX WARN: Code duplicated, block: B:110:0x036b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0370  */
    /* JADX WARN: Code duplicated, block: B:118:0x037f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0388  */
    /* JADX WARN: Code duplicated, block: B:122:0x0394  */
    /* JADX WARN: Code duplicated, block: B:124:0x039c  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:134:0x0408  */
    /* JADX WARN: Code duplicated, block: B:136:0x0414  */
    /* JADX WARN: Code duplicated, block: B:137:0x041a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x041c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0434  */
    /* JADX WARN: Code duplicated, block: B:142:0x0461  */
    /* JADX WARN: Code duplicated, block: B:145:0x0471  */
    /* JADX WARN: Code duplicated, block: B:146:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:148:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:150:0x0502  */
    /* JADX WARN: Code duplicated, block: B:152:0x0553  */
    /* JADX WARN: Code duplicated, block: B:155:0x0564  */
    /* JADX WARN: Code duplicated, block: B:158:0x0570  */
    /* JADX WARN: Code duplicated, block: B:161:0x057d  */
    /* JADX WARN: Code duplicated, block: B:164:0x059f  */
    /* JADX WARN: Code duplicated, block: B:167:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:4:0x0033  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x03d6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String string;
        String string2;
        boolean z;
        Boolean boolD1;
        boolean z2;
        vhx0 vhx0Var;
        vhx0 vhx0Var2;
        qim0 qim0Var;
        x340 x340Var;
        b0k b0kVar;
        boolean z3;
        String strN0;
        boolean z4;
        Instant instant;
        ?? r5;
        c7y0 c7y0Var;
        String str;
        String strN1;
        Locale localeB;
        int iHashCode;
        String str2;
        Locale locale;
        ?? lowerCase;
        ?? r6;
        x340 x340Var2;
        Map map;
        c7y0 c7y0Var2;
        ?? r1;
        ?? r2;
        x340 x340Var3;
        ?? r3;
        ?? r4;
        c7y0 c7y0Var3;
        Map map2;
        boolean z5;
        String str3;
        boolean zBooleanValue;
        Boolean boolD2;
        boolean z6;
        Calendar calendarD;
        Calendar calendarD2;
        String string3;
        y6y0 y6y0Var = (y6y0) obj2;
        b0k b0kVar2 = (b0k) obj4;
        ((Number) obj5).intValue();
        cxc0 cxc0Var = y6y0Var.a;
        kby kbyVar = cxc0Var.f;
        c7y0 c7y0Var4 = (c7y0) this.b;
        String str4 = c7y0Var4.a;
        boolean zA = cxc0Var.a();
        Map map3 = kbyVar.q;
        String str5 = "";
        String strN2 = null;
        if (zA) {
            z = false;
        } else {
            String str6 = (String) map3.get("is_personalized_playlist");
            boolean zBooleanValue2 = (str6 == null || (boolD1 = ihc1.d1(str6)) == null) ? false : boolD1.booleanValue();
            Set set = h4d0.a;
            String str7 = (String) map3.get("generation_status");
            if (str7 == null || (string = ihc1.e1(str7).toString()) == null) {
                string = "";
            }
            boolean zB = qyo1.u(string).b();
            String str8 = (String) map3.get("generation_status");
            if (str8 == null || (string2 = ihc1.e1(str8).toString()) == null) {
                string2 = "";
            }
            h4d0 h4d0VarU = qyo1.u(string2);
            h4d0VarU.getClass();
            boolean zContains = h4d0.a.contains(h4d0VarU);
            Set set2 = s4b1.f;
            x4i1 x4i1Var = kbyVar.e;
            String strS = uic.x(x4i1Var != null ? x4i1Var.a : null).s();
            if (strS == null) {
                strS = "";
            }
            boolean zEquals = strS.equals(str4);
            if (!zBooleanValue2 || zB || zEquals || zContains) {
                z = true;
            } else {
                z = false;
            }
        }
        if (cxc0Var.a()) {
            z2 = false;
        } else {
            Map map4 = kbyVar.q;
            Set set3 = h4d0.a;
            String str9 = (String) map4.get("generation_status");
            if (str9 != null && (string3 = ihc1.e1(str9).toString()) != null) {
                str5 = string3;
            }
            h4d0 h4d0VarU2 = qyo1.u(str5);
            h4d0VarU2.getClass();
            if (h4d0.a.contains(h4d0VarU2) || y6y0Var.b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        Map map5 = kbyVar.q;
        String str10 = (String) map5.get("progress_details");
        if (str10 != null) {
            try {
                vhx0Var = (vhx0) nfa0.d.a(str10, vhx0.Companion.serializer());
            } catch (Exception unused) {
                vhx0Var = null;
            }
            vhx0Var2 = vhx0Var;
        } else {
            vhx0Var2 = null;
        }
        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
        x340 x340Var4 = (x340) b0kVar2;
        int iHashCode2 = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarE = zr7.E(b0kVar2, qim0Var2);
        hzj.A.getClass();
        x340 x340Var5 = (x340) b0kVar2;
        if (x340Var5.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var5.m0();
        boolean z7 = x340Var5.S;
        n4k n4kVar = hmb0.t1;
        if (z7) {
            x340Var5.l(n4kVar);
        } else {
            x340Var5.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, b0kVar2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, b0kVar2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode2);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, b0kVar2, lljVar3);
        nko1.F(b0kVar2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, b0kVar2, lljVar4);
        fra fraVar = een.N0;
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar2).b;
        vhx0 vhx0Var3 = vhx0Var2;
        jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, b0kVar2, 0);
        int iHashCode3 = Long.hashCode(x340Var5.T);
        xos0 xos0VarM2 = x340Var5.m();
        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0Var2);
        x340Var5.m0();
        if (x340Var5.S) {
            x340Var5.l(n4kVar);
        } else {
            x340Var5.v0();
        }
        nko1.H(jw31VarA, b0kVar2, lljVar);
        nko1.H(xos0VarM2, b0kVar2, lljVar2);
        i3a.l(iHashCode3, b0kVar2, lljVar3, b0kVar2);
        nko1.H(qim0VarE2, b0kVar2, lljVar4);
        int iOrdinal = kbyVar.v.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            qim0Var = qim0Var2;
            x340Var = x340Var5;
            b0kVar = b0kVar2;
            z3 = false;
            x340Var.i0(1845950786);
            x340Var.r(false);
        } else {
            isl islVar = isl.a;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        qim0Var = qim0Var2;
                        x340Var = x340Var5;
                        b0kVar = b0kVar2;
                        z3 = false;
                        x340Var.i0(1845950786);
                        x340Var.r(false);
                    } else if (iOrdinal != 5) {
                        throw p3d1.k(x340Var5, 613708459, false);
                    }
                }
                x340Var5.i0(1845572989);
                orx orxVar = orx.c;
                long j = cbx.a(b0kVar2).b.b;
                x340Var = x340Var5;
                b0kVar = b0kVar2;
                z3 = false;
                qim0Var = qim0Var2;
                w0h1.a(orxVar, islVar, u291.r(qim0Var2, 14.0f), j, 0L, false, b0kVar, orx.d | 48, 48);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                x340Var = x340Var5;
                b0kVar = b0kVar2;
                z3 = false;
                x340Var.i0(1845173306);
                w0h1.a(pox.c, islVar, u291.r(qim0Var, 14.0f), cbx.a(b0kVar).b.b, 0L, true, b0kVar, pox.d | 196656, 16);
                x340Var.r(false);
            }
        }
        long j2 = cxc0Var.a / 60;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        if (j3 > 0) {
            x340Var.i0(1846190478);
            strN0 = cwl1.n0(2131958037, new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, b0kVar);
            x340Var.r(z3);
        } else {
            x340Var.i0(1846301768);
            strN0 = cwl1.n0(2131958038, new Object[]{Long.valueOf(j4)}, b0kVar);
            x340Var.r(z3);
        }
        b0k b0kVar3 = b0kVar;
        x340 x340Var6 = x340Var;
        uwo1.e(strN0, anm1.N("magpie_metadata_text", qim0Var), cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2032);
        x340Var6.i0(-739127266);
        Context context = (Context) x340Var6.k(AndroidCompositionLocals_androidKt.b);
        String str11 = (String) map5.get("refreshed_at");
        if (str11 != null) {
            try {
                instant = Instant.parse(str11);
                r5 = 0;
            } catch (Exception e) {
                z4 = false;
                Logger.e(e, "PromptedPlaylistHeaderMetadata: failed to parse refreshed_at value: ".concat(str11), new Object[0]);
                instant = null;
                r5 = z4;
            }
            if (instant != null) {
                x340Var6.i0(957235875);
                long epochMilli = instant.toEpochMilli();
                c7y0Var = c7y0Var4;
                yqg yqgVar = c7y0Var.e;
                calendarD = yqgVar.d();
                calendarD2 = yqgVar.d();
                calendarD2.setTimeInMillis(epochMilli);
                if (calendarD.get(1) == calendarD2.get(1) || calendarD.get(6) != calendarD2.get(6)) {
                    x340Var6.i0(957476900);
                    x340Var6.r((boolean) r5);
                    x340Var6.r((boolean) r5);
                } else {
                    x340Var6.i0(957317374);
                    String str12 = DateFormat.getTimeFormat(context).format(new Date(epochMilli));
                    str12.getClass();
                    strN2 = cwl1.n0(2131958042, new Object[]{str12}, x340Var6);
                    x340Var6.r((boolean) r5);
                    x340Var6.r((boolean) r5);
                }
                x340Var6.r((boolean) r5);
                if (strN2 != null) {
                    x340Var6.i0(1846848980);
                    String strO0 = cwl1.o0(b0kVar3, 2131958039);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(b0kVar3).j;
                    long j5 = cbx.a(b0kVar3).b.b;
                    z6 = r5 == true ? 1 : 0;
                    c7y0Var2 = c7y0Var;
                    map = map5;
                    uwo1.e(strO0, (qim0) null, lee1Var, j5, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                    uwo1.e(strN2, anm1.N("magpie_update_cadence_text", new wnb0(1.0f, z6)), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1712);
                    x340Var2 = x340Var6;
                    x340Var2.r(z6);
                } else {
                    x340Var2 = x340Var6;
                    map = map5;
                    c7y0Var2 = c7y0Var;
                    r1 = r5;
                    x340Var2.i0(1847437112);
                    x340Var2.r((boolean) r1);
                }
                if (z) {
                    r2 = r1;
                    c7y0Var3 = c7y0Var2;
                    if (c7y0Var3.b.e()) {
                        x340Var2.i0(1847543690);
                        String strO1 = cwl1.o0(b0kVar3, 2131958039);
                        uwr uwrVar3 = cbx.a;
                        x340 x340Var7 = x340Var2;
                        uwo1.e(strO1, (qim0) null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                        map2 = map;
                        boolean zJ = u890.j(map2.get("user_tracklist_changes_applied"), "true");
                        if (Boolean.parseBoolean((String) map2.get("mix")) || !Boolean.parseBoolean((String) map2.get("has-custom-transitions"))) {
                            r2 = z6;
                            r2 = z6;
                            z5 = false;
                        } else {
                            r2 = z6;
                            z5 = true;
                        }
                        str3 = (String) map2.get("location_sensitive");
                        if (str3 != null || (boolD2 = ihc1.d1(str3)) == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolD2.booleanValue();
                        }
                        otw.c(c7y0Var3.d, new kuh1(c7y0Var3.c, zJ, z5, z2, zBooleanValue, map2), (qim0) null, (ipb1) null, b0kVar3, 0, 12);
                        x340Var3 = x340Var7;
                        r3 = 0;
                        x340Var3.r(false);
                    } else {
                        r2 = r1;
                        r2 = z6;
                        r2 = z6;
                        x340Var3 = x340Var2;
                        x340Var3.i0(1848879480);
                        x340Var3.r((boolean) r2);
                        r3 = r2;
                    }
                } else {
                    r2 = r1;
                    r2 = z6;
                    r2 = z6;
                    x340Var3 = x340Var2;
                    x340Var3.i0(1848879480);
                    x340Var3.r((boolean) r2);
                    r3 = r2;
                }
                x340Var3.r(true);
                if (z2 || vhx0Var3 == null) {
                    r4 = r3;
                } else {
                    r4 = 1;
                }
                fq7.b(pbh.a, (boolean) r4, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(511483390, new dvt0(vhx0Var3, (byte) 28), b0kVar3), b0kVar3, 1572870, 30);
                x340Var3.r(true);
                return rih1.a;
            }
            c7y0Var = c7y0Var4;
            x340Var6.i0(957482852);
            x340Var6.r((boolean) r5);
            str = (String) map5.get("refresh_cadence");
            if (str == null) {
                x340Var6.i0(958017663);
                x340Var6.r((boolean) r5);
                strN1 = null;
            } else {
                iHashCode = str.hashCode();
                if (iHashCode != -1738378111) {
                    if (iHashCode != 64808441) {
                        if (iHashCode == 74175084 && str.equals("NEVER")) {
                            x340Var6.i0(958017663);
                            x340Var6.r((boolean) r5);
                        }
                        strN1 = null;
                    } else if (!str.equals("DAILY")) {
                        strN1 = x0d.k(x340Var6, -1631676300, 2131958044, x340Var6, (boolean) r5);
                    }
                    x340Var6.i0(958038495);
                    x340Var6.r((boolean) r5);
                    strN1 = null;
                } else if (str.equals("WEEKLY")) {
                    x340Var6.i0(957723381);
                    str2 = (String) map5.get("weekly_refresh_day");
                    if (str2 == null) {
                        x340Var6.i0(957799950);
                        x340Var6.r((boolean) r5);
                        strN1 = null;
                    } else {
                        x340Var6.i0(957799951);
                        locale = Locale.ROOT;
                        lowerCase = str2.toLowerCase(locale);
                        if (lowerCase.length() > 0) {
                            r6 = lowerCase;
                            r6 = ((Object) String.valueOf(lowerCase.charAt(r5)).toUpperCase(locale)) + lowerCase.substring(1);
                        }
                        r6 = lowerCase;
                        strN1 = cwl1.n0(2131958045, new Object[]{r6}, x340Var6);
                        x340Var6.r((boolean) r5);
                    }
                    x340Var6.r((boolean) r5);
                } else {
                    x340Var6.i0(958038495);
                    x340Var6.r((boolean) r5);
                    strN1 = null;
                }
            }
            if (strN1 != null) {
                x340Var6.r((boolean) r5);
                strN2 = strN1;
            } else {
                if (instant != null) {
                    x340Var6.i0(958198828);
                    localeB = yoi1.A(context.getResources().getConfiguration()).b((int) r5);
                    if (localeB == null) {
                        localeB = Locale.US;
                    }
                    String str13 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeB, "MMMd"), localeB).format(new Date(instant.toEpochMilli()));
                    str13.getClass();
                    strN2 = cwl1.n0(2131958043, new Object[]{str13}, x340Var6);
                    x340Var6.r((boolean) r5);
                } else {
                    x340Var6.i0(958529412);
                    x340Var6.r((boolean) r5);
                }
                x340Var6.r((boolean) r5);
            }
            if (strN2 != null) {
                x340Var6.i0(1846848980);
                String strO2 = cwl1.o0(b0kVar3, 2131958039);
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var2 = cbx.d(b0kVar3).j;
                long j6 = cbx.a(b0kVar3).b.b;
                z6 = r5 == true ? 1 : 0;
                c7y0Var2 = c7y0Var;
                map = map5;
                uwo1.e(strO2, (qim0) null, lee1Var2, j6, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                uwo1.e(strN2, anm1.N("magpie_update_cadence_text", new wnb0(1.0f, z6)), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1712);
                x340Var2 = x340Var6;
                x340Var2.r(z6);
            } else {
                x340Var2 = x340Var6;
                map = map5;
                c7y0Var2 = c7y0Var;
                r1 = r5;
                x340Var2.i0(1847437112);
                x340Var2.r((boolean) r1);
            }
            if (z) {
                r2 = r1;
                c7y0Var3 = c7y0Var2;
                if (c7y0Var3.b.e()) {
                    x340Var2.i0(1847543690);
                    String strO3 = cwl1.o0(b0kVar3, 2131958039);
                    uwr uwrVar5 = cbx.a;
                    x340 x340Var8 = x340Var2;
                    uwo1.e(strO3, (qim0) null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                    map2 = map;
                    boolean zJ2 = u890.j(map2.get("user_tracklist_changes_applied"), "true");
                    if (Boolean.parseBoolean((String) map2.get("mix"))) {
                        r2 = z6;
                        r2 = z6;
                        z5 = false;
                    } else {
                        r2 = z6;
                        r2 = z6;
                        z5 = false;
                    }
                    str3 = (String) map2.get("location_sensitive");
                    if (str3 != null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = false;
                    }
                    otw.c(c7y0Var3.d, new kuh1(c7y0Var3.c, zJ2, z5, z2, zBooleanValue, map2), (qim0) null, (ipb1) null, b0kVar3, 0, 12);
                    x340Var3 = x340Var8;
                    r3 = 0;
                    x340Var3.r(false);
                } else {
                    r2 = r1;
                    r2 = z6;
                    r2 = z6;
                    x340Var3 = x340Var2;
                    x340Var3.i0(1848879480);
                    x340Var3.r((boolean) r2);
                    r3 = r2;
                }
            } else {
                r2 = r1;
                r2 = z6;
                r2 = z6;
                x340Var3 = x340Var2;
                x340Var3.i0(1848879480);
                x340Var3.r((boolean) r2);
                r3 = r2;
            }
            x340Var3.r(true);
            if (z2) {
                r4 = r3;
            } else {
                r4 = r3;
            }
            fq7.b(pbh.a, (boolean) r4, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(511483390, new dvt0(vhx0Var3, (byte) 28), b0kVar3), b0kVar3, 1572870, 30);
            x340Var3.r(true);
            return rih1.a;
        }
        z4 = false;
        instant = null;
        r5 = z4;
        if (instant != null) {
            x340Var6.i0(957235875);
            long epochMilli2 = instant.toEpochMilli();
            c7y0Var = c7y0Var4;
            yqg yqgVar2 = c7y0Var.e;
            calendarD = yqgVar2.d();
            calendarD2 = yqgVar2.d();
            calendarD2.setTimeInMillis(epochMilli2);
            if (calendarD.get(1) == calendarD2.get(1)) {
            }
            x340Var6.i0(957476900);
            x340Var6.r((boolean) r5);
            x340Var6.r((boolean) r5);
        } else {
            c7y0Var = c7y0Var4;
            x340Var6.i0(957482852);
            x340Var6.r((boolean) r5);
        }
        str = (String) map5.get("refresh_cadence");
        if (str == null) {
            x340Var6.i0(958017663);
            x340Var6.r((boolean) r5);
            strN1 = null;
        } else {
            iHashCode = str.hashCode();
            if (iHashCode != -1738378111) {
                if (iHashCode != 64808441) {
                    if (iHashCode == 74175084) {
                        x340Var6.i0(958017663);
                        x340Var6.r((boolean) r5);
                        strN1 = null;
                    }
                } else if (!str.equals("DAILY")) {
                    strN1 = x0d.k(x340Var6, -1631676300, 2131958044, x340Var6, (boolean) r5);
                }
                x340Var6.i0(958038495);
                x340Var6.r((boolean) r5);
                strN1 = null;
            } else if (str.equals("WEEKLY")) {
                x340Var6.i0(958038495);
                x340Var6.r((boolean) r5);
                strN1 = null;
            } else {
                x340Var6.i0(957723381);
                str2 = (String) map5.get("weekly_refresh_day");
                if (str2 == null) {
                    x340Var6.i0(957799950);
                    x340Var6.r((boolean) r5);
                    strN1 = null;
                } else {
                    x340Var6.i0(957799951);
                    locale = Locale.ROOT;
                    lowerCase = str2.toLowerCase(locale);
                    if (lowerCase.length() > 0) {
                        r6 = lowerCase;
                        r6 = ((Object) String.valueOf(lowerCase.charAt(r5)).toUpperCase(locale)) + lowerCase.substring(1);
                    }
                    r6 = lowerCase;
                    strN1 = cwl1.n0(2131958045, new Object[]{r6}, x340Var6);
                    x340Var6.r((boolean) r5);
                }
                x340Var6.r((boolean) r5);
            }
        }
        if (strN1 != null) {
            x340Var6.r((boolean) r5);
            strN2 = strN1;
        } else {
            if (instant != null) {
                x340Var6.i0(958198828);
                localeB = yoi1.A(context.getResources().getConfiguration()).b((int) r5);
                if (localeB == null) {
                    localeB = Locale.US;
                }
                String str14 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeB, "MMMd"), localeB).format(new Date(instant.toEpochMilli()));
                str14.getClass();
                strN2 = cwl1.n0(2131958043, new Object[]{str14}, x340Var6);
                x340Var6.r((boolean) r5);
            } else {
                x340Var6.i0(958529412);
                x340Var6.r((boolean) r5);
            }
            x340Var6.r((boolean) r5);
        }
        if (strN2 != null) {
            x340Var6.i0(1846848980);
            String strO4 = cwl1.o0(b0kVar3, 2131958039);
            uwr uwrVar6 = cbx.a;
            lee1 lee1Var3 = cbx.d(b0kVar3).j;
            long j7 = cbx.a(b0kVar3).b.b;
            z6 = r5 == true ? 1 : 0;
            c7y0Var2 = c7y0Var;
            map = map5;
            uwo1.e(strO4, (qim0) null, lee1Var3, j7, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
            uwo1.e(strN2, anm1.N("magpie_update_cadence_text", new wnb0(1.0f, z6)), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar3, 0, 0, 1712);
            x340Var2 = x340Var6;
            x340Var2.r(z6);
        } else {
            x340Var2 = x340Var6;
            map = map5;
            c7y0Var2 = c7y0Var;
            r1 = r5;
            x340Var2.i0(1847437112);
            x340Var2.r((boolean) r1);
        }
        if (z) {
            r2 = r1;
            c7y0Var3 = c7y0Var2;
            if (c7y0Var3.b.e()) {
                x340Var2.i0(1847543690);
                String strO5 = cwl1.o0(b0kVar3, 2131958039);
                uwr uwrVar7 = cbx.a;
                x340 x340Var9 = x340Var2;
                uwo1.e(strO5, (qim0) null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                map2 = map;
                boolean zJ3 = u890.j(map2.get("user_tracklist_changes_applied"), "true");
                if (Boolean.parseBoolean((String) map2.get("mix"))) {
                    r2 = z6;
                    r2 = z6;
                    z5 = false;
                } else {
                    r2 = z6;
                    r2 = z6;
                    z5 = false;
                }
                str3 = (String) map2.get("location_sensitive");
                if (str3 != null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = false;
                }
                otw.c(c7y0Var3.d, new kuh1(c7y0Var3.c, zJ3, z5, z2, zBooleanValue, map2), (qim0) null, (ipb1) null, b0kVar3, 0, 12);
                x340Var3 = x340Var9;
                r3 = 0;
                x340Var3.r(false);
            } else {
                r2 = r1;
                r2 = z6;
                r2 = z6;
                x340Var3 = x340Var2;
                x340Var3.i0(1848879480);
                x340Var3.r((boolean) r2);
                r3 = r2;
            }
        } else {
            r2 = r1;
            r2 = z6;
            r2 = z6;
            x340Var3 = x340Var2;
            x340Var3.i0(1848879480);
            x340Var3.r((boolean) r2);
            r3 = r2;
        }
        x340Var3.r(true);
        if (z2) {
            r4 = r3;
        } else {
            r4 = r3;
        }
        fq7.b(pbh.a, (boolean) r4, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(511483390, new dvt0(vhx0Var3, (byte) 28), b0kVar3), b0kVar3, 1572870, 30);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        ((z72) this.b).e((e8y0) obj2, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Number) obj5).intValue();
        l7e0 l7e0Var = ((hwq) obj2).g;
        j7e0 j7e0Var = (j7e0) l7e0Var;
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(l7e0Var.a());
        bvm bvmVar = (bvm) this.b;
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = (d511) ((uyp) bvmVar.d).get();
            x340Var.s0(objT);
        }
        d511 d511Var = (d511) objT;
        d511Var.getClass();
        otw.c(d511Var, new a511(j7e0Var.b, bvmVar.b, j7e0Var.a.g), (qim0) null, (ipb1) null, x340Var, 0, 12);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t8y0 t8y0Var = (t8y0) obj2;
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        hwq hwqVar = t8y0Var.a;
        l7e0 l7e0Var = hwqVar.g;
        v8y0 v8y0Var = (v8y0) this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar, 0);
        x340 x340Var = (x340) b0kVar;
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(b0kVar, nim0.a);
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar;
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
        nko1.H(mbhVarA, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(l7e0Var.getUri()).c;
        if (blc0Var == blc0.Pg) {
            x340Var2.i0(-183928189);
            bqn1.c(hwqVar, t8y0Var.b, (qim0) null, false, v8y0Var.c, b0kVar, 3072);
            b0kVar = b0kVar;
            x340Var2.r(false);
        } else if (blc0Var == blc0.fh) {
            x340Var2.i0(-183718381);
            gxo1.b(hwqVar, (qim0) null, false, v8y0Var.d, b0kVar, 384);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-183629969);
            x340Var2.r(false);
        }
        j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
        if (j7e0Var != null) {
            x340Var2.i0(-183521066);
            otw.c(v8y0Var.e, new a511(j7e0Var.b, v8y0Var.b, j7e0Var.a.g), (qim0) null, (ipb1) null, b0kVar, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-183220273);
            x340Var2.r(false);
        }
        x340Var2.r(true);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0225  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        yby0 yby0Var;
        ?? r2;
        x340 x340Var;
        String strG;
        boolean z;
        wby0 wby0Var = (wby0) obj2;
        x340 x340Var2 = (b0k) obj4;
        ((Number) obj5).intValue();
        List list = wby0Var.b;
        String str2 = wby0Var.d;
        fra fraVar = een.N0;
        yby0 yby0Var2 = (yby0) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(jw31VarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        if (wby0Var.f) {
            x340Var4.i0(1986218147);
            uwr uwrVar = cbx.a;
            str = str2;
            x340Var = x340Var4;
            yby0Var = yby0Var2;
            uwo1.e(" • ", (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 6, 0, 2034);
            r2 = 0;
            x340Var.r(false);
        } else {
            str = str2;
            yby0Var = yby0Var2;
            r2 = 0;
            x340Var = x340Var4;
            x340Var.i0(1986369985);
            x340Var.r(false);
        }
        if (!wby0Var.a || list.isEmpty()) {
            yby0 yby0Var3 = yby0Var;
            x340Var.i0(1986632183);
            yqg yqgVar = yby0Var3.a;
            m4c m4cVar = fkj0.X;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            String str3 = wby0Var.e;
            String str4 = str;
            boolean zG = x340Var.g(str4);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                if (str4 != null) {
                    try {
                        objT = Instant.parse(str4);
                    } catch (Exception e) {
                        Logger.e(e, "PromptedStatusElement: failed to parse timestamp value: %s", new Object[]{str4});
                        objT = null;
                    }
                } else {
                    objT = null;
                }
                x340Var.s0(objT);
            }
            Instant instant = (Instant) objT;
            boolean zG2 = x340Var.g(str3);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                if (str3 != null) {
                    try {
                        objT2 = Instant.parse(str3);
                    } catch (Exception e2) {
                        Logger.e(e2, "PromptedStatusElement: failed to parse timestamp value: %s", new Object[]{str3});
                        objT2 = null;
                    }
                } else {
                    objT2 = null;
                }
                x340Var.s0(objT2);
            }
            Instant instant2 = (Instant) objT2;
            if (instant2 == null || instant2.toEpochMilli() <= yqgVar.b()) {
                instant2 = null;
            }
            ven0 ven0VarH = rwq.h(yby0Var3.b, x340Var, (int) r2);
            if (wby0Var.c) {
                strG = context.getString(2131956539);
            } else if (instant != null) {
                umw0 umw0Var = (umw0) ven0VarH.getValue();
                if (!(umw0Var instanceof tmw0)) {
                    rmw0 rmw0Var = umw0Var instanceof rmw0 ? (rmw0) umw0Var : null;
                    if ((rmw0Var != null ? rmw0Var.a : Long.MIN_VALUE) < instant.toEpochMilli() && yqgVar.b() - instant.toEpochMilli() < 604800000) {
                        strG = yby0Var3.g(context, instant);
                    } else if (instant2 != null) {
                        if (yby0Var3.f(instant2.toEpochMilli())) {
                            strG = context.getString(2131956534, DateFormat.getTimeFormat(context).format(new Date(instant2.toEpochMilli())));
                        } else {
                            strG = context.getString(2131956535, yby0.h(context, instant2));
                        }
                        strG.getClass();
                    } else if (instant == null) {
                        strG = context.getString(2131956536);
                    } else {
                        strG = yby0Var3.g(context, instant);
                    }
                } else if (instant2 != null) {
                    if (yby0Var3.f(instant2.toEpochMilli())) {
                        strG = context.getString(2131956534, DateFormat.getTimeFormat(context).format(new Date(instant2.toEpochMilli())));
                    } else {
                        strG = context.getString(2131956535, yby0.h(context, instant2));
                    }
                    strG.getClass();
                } else if (instant == null) {
                    strG = context.getString(2131956536);
                } else {
                    strG = yby0Var3.g(context, instant);
                }
            } else if (instant2 != null) {
                if (yby0Var3.f(instant2.toEpochMilli())) {
                    strG = context.getString(2131956534, DateFormat.getTimeFormat(context).format(new Date(instant2.toEpochMilli())));
                } else {
                    strG = context.getString(2131956535, yby0.h(context, instant2));
                }
                strG.getClass();
            } else if (instant == null) {
                strG = context.getString(2131956536);
            } else {
                strG = yby0Var3.g(context, instant);
            }
            String str5 = strG;
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.a;
            cjc0 cjc0Var = new cjc0(1);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            uwo1.e(str5, anm1.N("standard_header_prompted_status_text", new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1712);
            x340Var.r(false);
            z = true;
        } else {
            x340Var.i0(1986446555);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            yby0Var.e(list, anm1.N("standard_header_prompted_status_text", new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, (boolean) r2)), x340Var2, r2);
            x340Var.r((boolean) r2);
            z = true;
        }
        x340Var.r(z);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        cm0 cm0Var = (cm0) this.b;
        mod.b(kivVar.a((gw70) cm0Var.h), apo.r(-290130794, new mcy0(cm0Var, (tcy0) obj2, (iu30) obj3), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:336:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:340:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:344:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:348:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:360:0x0c74  */
    /* JADX WARN: Code duplicated, block: B:372:0x0c9d  */
    /* JADX WARN: Code duplicated, block: B:376:0x0cb6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v8 java.lang.Object, still in use, count: 2, list:
          (r14v8 java.lang.Object) from 0x0bc4: PHI (r14 I:??) = (r14v2 java.lang.Object), (r14v8 java.lang.Object) binds: [B:332:0x0bc3, B:392:0x0bc4] A[DONT_GENERATE, DONT_INLINE]
          (r14v8 java.lang.Object) from 0x0bb6: CHECK_CAST (p.gxz0) (r14v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object c1(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 3470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qsu0.c1(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
