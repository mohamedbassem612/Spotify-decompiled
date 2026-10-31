package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.work.impl.WorkerStoppedException;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.widget.widgetpromo.PromoSuccessHandlerService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class t4n1 {
    public static b180 a;

    /* JADX WARN: Code duplicated, block: B:126:0x0215  */
    /* JADX WARN: Code duplicated, block: B:129:0x021d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0233  */
    /* JADX WARN: Code duplicated, block: B:133:0x0235  */
    /* JADX WARN: Code duplicated, block: B:135:0x0238  */
    /* JADX WARN: Code duplicated, block: B:136:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x023d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0242  */
    /* JADX WARN: Code duplicated, block: B:140:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    /* JADX WARN: Code duplicated, block: B:142:0x024c  */
    /* JADX WARN: Code duplicated, block: B:144:0x024f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0257  */
    /* JADX WARN: Code duplicated, block: B:148:0x0269  */
    /* JADX WARN: Code duplicated, block: B:149:0x026b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x035f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0363  */
    /* JADX WARN: Code duplicated, block: B:162:0x0378  */
    /* JADX WARN: Code duplicated, block: B:163:0x038e  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:171:0x03df  */
    /* JADX WARN: Code duplicated, block: B:174:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:176:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:179:0x040f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0411  */
    /* JADX WARN: Code duplicated, block: B:183:0x043b  */
    /* JADX WARN: Code duplicated, block: B:184:0x043e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0448  */
    /* JADX WARN: Code duplicated, block: B:188:0x044b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0460  */
    /* JADX WARN: Code duplicated, block: B:197:0x049e  */
    /* JADX WARN: Code duplicated, block: B:198:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:212:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:215:0x0514  */
    /* JADX WARN: Code duplicated, block: B:217:0x052f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0534  */
    /* JADX WARN: Code duplicated, block: B:220:0x054b  */
    /* JADX WARN: Code duplicated, block: B:222:0x055c  */
    public static final void a(vrc vrcVar, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, lz20 lz20Var, iu30 iu30Var3, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        vrc vrcVar2;
        x340 x340Var;
        d8e0 d8e0Var;
        String strS;
        boolean z;
        d8e0 d8e0Var2;
        gax gaxVar;
        gax gaxVar2;
        String strK;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        ven0 ven0Var;
        d8e0 d8e0Var3;
        boolean z5;
        float f;
        float fL;
        jsg jsgVar;
        boolean z6;
        int size;
        int i3;
        nim0 nim0Var;
        int i4;
        gax gaxVar3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        n4k n4kVar;
        int i5;
        d8e0 d8e0Var4;
        boolean z8;
        boolean zI;
        Object objT2;
        boolean zI2;
        Object objT3;
        boolean z9;
        String str3;
        boolean z10;
        List list;
        int i6;
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        Object frcVar;
        int i8;
        boolean z14;
        boolean z15;
        Object objT4;
        boolean z16;
        boolean z17;
        boolean zI3;
        Object objT5;
        d8e0 d8e0Var5;
        iu30 iu30Var4 = iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-978222011);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var2.g(vrcVar) : x340Var2.i(vrcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var4) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= x340Var2.i(function1) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        } else {
            function1 = function0;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var2.i(lz20Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var2.i(iu30Var3) ? 1048576 : 524288;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 599187) != 599186)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            lee1 lee1Var = cbx.d(x340Var2).k;
            az20 az20Var = (az20) x340Var2.k(t4k.i);
            boolean z18 = vrcVar instanceof trc;
            trc trcVar = z18 ? (trc) vrcVar : null;
            if (trcVar == null) {
                x340Var2.i0(-858357620);
                x340Var2.r(false);
                d8e0Var2 = null;
            } else {
                List list2 = trcVar.a;
                x340Var2.i0(526500373);
                x340Var2.i0(-1927580952);
                if (list2.isEmpty()) {
                    x340Var2.r(false);
                    z = false;
                    d8e0Var = null;
                } else {
                    int iQ = yoi1.q(trcVar.b, p7h.K(list2));
                    double dDoubleValue = ((Number) list2.get(iQ)).doubleValue();
                    boolean z19 = trcVar.c;
                    boolean z20 = trcVar.d;
                    if (z19) {
                        z = false;
                        strS = x0d.k(x340Var2, -850938678, 2131961760, x340Var2, false);
                    } else {
                        x340Var2.i0(-850853738);
                        strS = s(dDoubleValue, true, x340Var2);
                        z = false;
                        x340Var2.r(false);
                    }
                    d8e0Var = new d8e0(iQ, strS, list2, z19, z20);
                    x340Var2.r(z);
                }
                x340Var2.r(z);
                d8e0Var2 = d8e0Var;
            }
            if (u890.j(vrcVar, urc.a)) {
                gaxVar = new gax(2131961690, (String) null);
            } else {
                if (u890.j(vrcVar, src.a)) {
                    gaxVar2 = new gax(2131961689, (String) null);
                } else if (!z18) {
                    eg.o();
                    return;
                } else if (((trc) vrcVar).a.isEmpty()) {
                    gaxVar2 = new gax(2131961689, (String) null);
                } else {
                    gaxVar = iax.a;
                }
                gaxVar = gaxVar2;
            }
            boolean z21 = gaxVar instanceof iax;
            gax gaxVar4 = gaxVar instanceof gax ? gaxVar : null;
            Integer num = gaxVar4 != null ? gaxVar4.a : null;
            if (num == null) {
                x340Var2.i0(-857848414);
                x340Var2.r(false);
                strK = null;
            } else {
                strK = kk0.k(x340Var2, -857848413, num, x340Var2, false);
            }
            List list3 = d8e0Var2 != null ? d8e0Var2.a : null;
            if (list3 == null) {
                list3 = z6x.a;
            }
            int i9 = d8e0Var2 != null ? d8e0Var2.b : 0;
            boolean zE = x340Var2.e(i9);
            List list4 = list3;
            Object objT6 = x340Var2.T();
            if (zE || objT6 == m4cVar) {
                objT6 = bb00.h(i9, x340Var2);
            }
            hdn0 hdn0Var = (hdn0) objT6;
            if (d8e0Var2 != null) {
                str2 = strK;
                z2 = true;
                boolean z22 = d8e0Var2.c;
                z3 = z22;
                if (d8e0Var2 == null && d8e0Var2.d == z2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0Var = (ven0) objT;
                d8e0Var3 = d8e0Var2;
                if (list4.size() > 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (d8e0Var3 == null) {
                    f = 0.0f;
                } else if (z5) {
                    f = i9;
                } else {
                    f = 0.5f;
                }
                if (d8e0Var3 == null) {
                    fL = 1.0f;
                } else {
                    if (z5) {
                        d8e0Var5 = d8e0Var3;
                    } else {
                        d8e0Var5 = null;
                    }
                    if (d8e0Var5 != null) {
                        fL = p7h.L(d8e0Var5.a);
                    } else {
                        fL = 1.0f;
                    }
                }
                z6 = z5;
                jsgVar = new jsg(0.0f, fL);
                size = list4.size() - 2;
                if (size < 0) {
                    i3 = 0;
                } else {
                    i3 = size;
                }
                nim0Var = nim0.a;
                i4 = i3;
                qim0 qim0VarB = uyn1.B(m0p1.q(u291.f(nim0Var, 1.0f), gaxVar, iu30Var3), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                gaxVar3 = gaxVar4;
                mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z7 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z7) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                kiv kivVar = jw80.c;
                mta mtaVar = cbx.b(x340Var2).d;
                i5 = i9;
                d8e0Var4 = d8e0Var3;
                mod.b(kivVar.a(new p3v(32.0f)), apo.r(-1759948977, new erc(cvxVar, d8e0Var4, lee1Var, vrcVar, z3, z4, function1), x340Var2), x340Var2, 56);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                if (d8e0Var4 == null) {
                    x340Var2.i0(1030918617);
                    z8 = false;
                    i(40.0f, cbx.d(x340Var2).j, vrcVar instanceof urc, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    z8 = false;
                    x340Var2.i0(1031108647);
                    e(((Number) o7h.q0(list4)).doubleValue(), x340Var2, 0);
                    x340Var2.r(false);
                }
                qim0 qim0VarP = vby0.p(new wnb0(1.0f, true), lz20Var);
                zI = x340Var2.i(ven0Var);
                objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new cy7(ven0Var, (byte) 11);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarG = cev0.G(qim0VarP, (iu30) objT2);
                zI2 = x340Var2.i(az20Var);
                objT3 = x340Var2.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new wt3(az20Var, (byte) 2);
                    x340Var2.s0(objT3);
                }
                qim0 qim0VarT = y9g1.t(qim0VarG, (iu30) objT3);
                if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
                str3 = str2;
                boolean zI4 = z9 | x340Var2.i(gaxVar3) | x340Var2.g(str3);
                if ((i2 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = z8;
                }
                list = list4;
                boolean zG = zI4 | z10 | x340Var2.g(d8e0Var4) | x340Var2.i(ven0Var) | x340Var2.e(i5) | x340Var2.g(list) | x340Var2.e(i4);
                int i10 = i2;
                i6 = i10 & 896;
                if (i6 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z23 = zG | z11;
                i7 = i10 & 7168;
                if (i7 == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z23 | z12;
                Object objT7 = x340Var2.T();
                if (!z13 || objT7 == m4cVar) {
                    i8 = i4;
                    iu30Var4 = iu30Var2;
                    frcVar = new frc(str, gaxVar3, str3, d8e0Var4, i5, list, i8, iu30Var3, ven0Var, iu30Var, iu30Var4);
                    d8e0Var4 = d8e0Var4;
                    list = list;
                    x340Var2.s0(frcVar);
                } else {
                    frcVar = objT7;
                    i8 = i4;
                    iu30Var4 = iu30Var2;
                }
                qim0 qim0VarA = s161.a(qim0VarT, (iu30) frcVar);
                boolean zH = x340Var2.h(z21) | x340Var2.i(hdn0Var) | x340Var2.h(z6) | x340Var2.g(list);
                if (i6 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zH | z14;
                objT4 = x340Var2.T();
                if (!z15 || objT4 == m4cVar) {
                    objT4 = new ne3(z21, z6, list, iu30Var, hdn0Var);
                    z16 = z6;
                    x340Var2.s0(objT4);
                } else {
                    z16 = z6;
                }
                iu30 iu30Var5 = (iu30) objT4;
                boolean zH2 = x340Var2.h(z21);
                if (i7 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zI3 = zH2 | z17 | x340Var2.i(hdn0Var);
                objT5 = x340Var2.T();
                if (zI3 || objT5 == m4cVar) {
                    objT5 = new ea9(z21, iu30Var4, hdn0Var);
                    x340Var2.s0(objT5);
                }
                luo1.e(f, iu30Var5, qim0VarA, z21, jsgVar, i8, (Function0) objT5, 0L, 0L, (idn0) null, 0L, 0L, 0L, x340Var2, 0, 8064);
                x340Var = x340Var2;
                if (d8e0Var4 == null) {
                    x340Var.i0(1973007519);
                    vrcVar2 = vrcVar;
                    i(40.0f, cbx.d(x340Var).j, vrcVar2 instanceof urc, x340Var, 0);
                    x340Var.r(false);
                } else {
                    vrcVar2 = vrcVar;
                    if (z16) {
                        x340Var.i0(1973014056);
                        e(((Number) o7h.A0(list)).doubleValue(), x340Var, 0);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1033929399);
                        x340Var.r(false);
                    }
                }
                x340Var.r(true);
                x340Var.r(true);
            } else {
                str2 = strK;
                z2 = true;
            }
            z3 = z22;
            if (d8e0Var2 == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0Var = (ven0) objT;
            d8e0Var3 = d8e0Var2;
            if (list4.size() > 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (d8e0Var3 == null) {
                f = 0.0f;
            } else if (z5) {
                f = 0.5f;
            } else {
                f = i9;
            }
            if (d8e0Var3 == null) {
                fL = 1.0f;
            } else {
                if (z5) {
                    d8e0Var5 = d8e0Var3;
                } else {
                    d8e0Var5 = null;
                }
                if (d8e0Var5 != null) {
                    fL = p7h.L(d8e0Var5.a);
                } else {
                    fL = 1.0f;
                }
            }
            z6 = z5;
            jsgVar = new jsg(0.0f, fL);
            size = list4.size() - 2;
            if (size < 0) {
                i3 = 0;
            } else {
                i3 = size;
            }
            nim0Var = nim0.a;
            i4 = i3;
            qim0 qim0VarB2 = uyn1.B(m0p1.q(u291.f(nim0Var, 1.0f), gaxVar, iu30Var3), 16.0f, 0.0f, 16.0f, 16.0f, 2);
            gaxVar3 = gaxVar4;
            mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarB2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z7 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z7) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar7);
            nko1.F(x340Var2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar8);
            kiv kivVar2 = jw80.c;
            mta mtaVar2 = cbx.b(x340Var2).d;
            i5 = i9;
            d8e0Var4 = d8e0Var3;
            mod.b(kivVar2.a(new p3v(32.0f)), apo.r(-1759948977, new erc(cvxVar, d8e0Var4, lee1Var, vrcVar, z3, z4, function1), x340Var2), x340Var2, 56);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar5);
            nko1.H(xos0VarM3, x340Var2, lljVar6);
            x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar8);
            if (d8e0Var4 == null) {
                x340Var2.i0(1030918617);
                z8 = false;
                i(40.0f, cbx.d(x340Var2).j, vrcVar instanceof urc, x340Var2, 0);
                x340Var2.r(false);
            } else {
                z8 = false;
                x340Var2.i0(1031108647);
                e(((Number) o7h.q0(list4)).doubleValue(), x340Var2, 0);
                x340Var2.r(false);
            }
            qim0 qim0VarP2 = vby0.p(new wnb0(1.0f, true), lz20Var);
            zI = x340Var2.i(ven0Var);
            objT2 = x340Var2.T();
            if (zI) {
                objT2 = new cy7(ven0Var, (byte) 11);
                x340Var2.s0(objT2);
            } else {
                objT2 = new cy7(ven0Var, (byte) 11);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarG2 = cev0.G(qim0VarP2, (iu30) objT2);
            zI2 = x340Var2.i(az20Var);
            objT3 = x340Var2.T();
            if (zI2) {
                objT3 = new wt3(az20Var, (byte) 2);
                x340Var2.s0(objT3);
            } else {
                objT3 = new wt3(az20Var, (byte) 2);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarT2 = y9g1.t(qim0VarG2, (iu30) objT3);
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                z9 = true;
            } else {
                z9 = z8;
            }
            str3 = str2;
            boolean zI5 = z9 | x340Var2.i(gaxVar3) | x340Var2.g(str3);
            if ((i2 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = z8;
            }
            list = list4;
            boolean zG2 = zI5 | z10 | x340Var2.g(d8e0Var4) | x340Var2.i(ven0Var) | x340Var2.e(i5) | x340Var2.g(list) | x340Var2.e(i4);
            int i11 = i2;
            i6 = i11 & 896;
            if (i6 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z24 = zG2 | z11;
            i7 = i11 & 7168;
            if (i7 == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z24 | z12;
            Object objT8 = x340Var2.T();
            if (z13) {
                i8 = i4;
                iu30Var4 = iu30Var2;
                frcVar = new frc(str, gaxVar3, str3, d8e0Var4, i5, list, i8, iu30Var3, ven0Var, iu30Var, iu30Var4);
                d8e0Var4 = d8e0Var4;
                list = list;
                x340Var2.s0(frcVar);
            } else {
                i8 = i4;
                iu30Var4 = iu30Var2;
                frcVar = new frc(str, gaxVar3, str3, d8e0Var4, i5, list, i8, iu30Var3, ven0Var, iu30Var, iu30Var4);
                d8e0Var4 = d8e0Var4;
                list = list;
                x340Var2.s0(frcVar);
            }
            qim0 qim0VarA2 = s161.a(qim0VarT2, (iu30) frcVar);
            boolean zH3 = x340Var2.h(z21) | x340Var2.i(hdn0Var) | x340Var2.h(z6) | x340Var2.g(list);
            if (i6 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zH3 | z14;
            objT4 = x340Var2.T();
            if (z15) {
                objT4 = new ne3(z21, z6, list, iu30Var, hdn0Var);
                z16 = z6;
                x340Var2.s0(objT4);
            } else {
                objT4 = new ne3(z21, z6, list, iu30Var, hdn0Var);
                z16 = z6;
                x340Var2.s0(objT4);
            }
            iu30 iu30Var6 = (iu30) objT4;
            boolean zH4 = x340Var2.h(z21);
            if (i7 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            zI3 = zH4 | z17 | x340Var2.i(hdn0Var);
            objT5 = x340Var2.T();
            if (zI3) {
                objT5 = new ea9(z21, iu30Var4, hdn0Var);
                x340Var2.s0(objT5);
            } else {
                objT5 = new ea9(z21, iu30Var4, hdn0Var);
                x340Var2.s0(objT5);
            }
            luo1.e(f, iu30Var6, qim0VarA2, z21, jsgVar, i8, (Function0) objT5, 0L, 0L, (idn0) null, 0L, 0L, 0L, x340Var2, 0, 8064);
            x340Var = x340Var2;
            if (d8e0Var4 == null) {
                x340Var.i0(1973007519);
                vrcVar2 = vrcVar;
                i(40.0f, cbx.d(x340Var).j, vrcVar2 instanceof urc, x340Var, 0);
                x340Var.r(false);
            } else {
                vrcVar2 = vrcVar;
                if (z16) {
                    x340Var.i0(1973014056);
                    e(((Number) o7h.A0(list)).doubleValue(), x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1033929399);
                    x340Var.r(false);
                }
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            vrcVar2 = vrcVar;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(vrcVar2, str, iu30Var, iu30Var4, function0, lz20Var, iu30Var3, i, (byte) 4);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-885122593);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            scx scxVarM = pno1.m(x340Var);
            function1 = function0;
            ila0.c(scxVarM, kai.b, kai.c, apo.r(530884445, new cka(scxVarM, (byte) 16), x340Var), (vu30) null, function1, x340Var, ((i2 << 15) & 458752) | 3504, 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 1, i, function1, false);
        }
    }

    public static final void c(hux huxVar, String str, b0k b0kVar, int i) {
        String str2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2101551995);
        int i2 = i | ((i & 8) == 0 ? b0kVar2.g(huxVar) : b0kVar2.i(huxVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new w8c(str, (byte) 2);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarA);
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
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar2, 56 | (i2 & 14), 56);
            b0kVar2 = b0kVar2;
            str2 = str;
            uwo1.e(str2, new wnb0(1.0f, true), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i2 >> 3) & 14, 0, 2032);
            b0kVar2.r(true);
        } else {
            str2 = str;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar, str2, i, (byte) 0);
        }
    }

    public static final void d(String str, if5 if5Var, vrc vrcVar, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, boolean z, Function0 function1, Function0 function2, lz20 lz20Var, iu30 iu30Var3, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1290919480);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(if5Var) ? 32 : 16) | (x340Var.g(vrcVar) ? SemanticState.Hidden : SemanticState.Focused) | 3072 | (x340Var.i(iu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.i(iu30Var2) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.i(function1) ? 67108864 : 33554432) | (x340Var.i(function2) ? 536870912 : 268435456);
        int i3 = (x340Var.i(lz20Var) ? 4 : 2) | (x340Var.i(iu30Var3) ? 32 : 16);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            x340Var.d0();
            int i4 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || x340Var.E()) {
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            qim0 qim0Var5 = qim0Var3;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = jpc.i;
                x340Var.s0(objT);
            }
            jto1.b(s161.b(qim0VarF2, true, (iu30) objT), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, if5Var.b((qim0) null, (lee1) null, (u7h) null, x340Var, ((i2 << 6) & 7168) | SemanticState.Obscured, 7), (xu30) null, (xu30) null, (xu30) null, apo.r(265290942, new p3(str, (byte) 29), x340Var), x340Var, 0, 196608, 30718);
            cso1.s(new if5((Integer) null, (String) null, new lo9(apo.r(-920999671, new oa5(function1, (byte) 1), x340Var), (byte) 20), (hf5) null, 11), (qim0) null, (lax) null, (hux) null, x340Var, 8, 14);
            int i5 = i2 >> 6;
            int i6 = i3 << 15;
            a(vrcVar, str, iu30Var, iu30Var2, function0, lz20Var, iu30Var3, x340Var, (i5 & 57344) | (i5 & 14) | ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 7168) | (458752 & i6) | (i6 & 3670016));
            x340Var = x340Var;
            x340Var.r(true);
            if (z) {
                x340Var.i0(646475200);
                b(function2, x340Var, (i2 >> 27) & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(646546314);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hrc(str, if5Var, vrcVar, qim0Var2, iu30Var, iu30Var2, function0, z, function1, function2, lz20Var, iu30Var3, i);
        }
    }

    public static final void e(double d, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1748757815);
        int i2 = (x340Var.c(d) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strS = s(d, false, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = jpc.t;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
            uwr uwrVar = cbx.a;
            uwo1.e(strS, qim0VarA, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1776);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new irc(d, i);
        }
    }

    public static final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(998814305);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            if (z) {
                x340Var.i0(143646719);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).c.a;
                cvx cvxVar = cbx.b(x340Var).b;
                xto1.e(uyn1.B(qim0Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0, j, 0L, x340Var, 0, 10);
                x340Var.r(false);
            } else {
                x340Var.i0(143806369);
                x340Var.r(false);
            }
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:103:0x0256  */
    /* JADX WARN: Code duplicated, block: B:106:0x0262  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x0210  */
    public static final void g(String str, String str2, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z3, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        x340 x340Var;
        qim0 qim0Var2;
        h311 h311VarV;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        boolean z7;
        Object objT;
        hax haxVar;
        hax haxVar2;
        boolean z8;
        Object objT2;
        hax haxVar3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(776193818);
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.h(z) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.h(z2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.i(function0) ? 16384 : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.i(function1) ? 131072 : 65536;
        }
        int i5 = 1572864 | i3;
        int i6 = i2 & SemanticState.Focused;
        if (i6 == 0) {
            if ((12582912 & i) == 0) {
                z4 = z3;
                i5 |= x340Var2.h(z4) ? 8388608 : 4194304;
            }
            i4 = i5;
            if ((i4 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var2.Y(i4 & 1, z5)) {
                if (i6 != 0) {
                    z4 = true;
                }
                era eraVar = een.Q0;
                qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (x340Var2.a != null) {
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
                if (!z || z2) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if ((i4 & 57344) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objT = x340Var2.T();
                if (z7 || objT == m4cVar) {
                    objT = new zg20(function0, (byte) 23);
                    x340Var2.s0(objT);
                }
                z50 z50Var = z50.c;
                gbx gbxVar = new gbx(z50Var, (Function0) objT);
                idx idxVar = new idx(4);
                uwr uwrVar = cbx.a;
                qim0 qim0VarN = anm1.N("graduation_messaging_positive_button_test_tag", uyn1.B(qim0Var3, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13));
                haxVar = jax.a;
                if (z6) {
                    x340Var2.i0(-1119905560);
                    x340Var2.r(false);
                    haxVar2 = haxVar;
                } else {
                    x340Var2.i0(-1119854658);
                    haxVar2 = new hax(cwl1.o0(x340Var2, 2131956391));
                    x340Var2.r(false);
                }
                foo1.c(gbxVar, idxVar, qim0VarN, haxVar2, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2064584143, new i950(z4, z, str), x340Var2), x340Var2, 0, 48, 2024);
                if ((i4 & 458752) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objT2 = x340Var2.T();
                if (z8 || objT2 == m4cVar) {
                    objT2 = new zg20(function1, (byte) 24);
                    x340Var2.s0(objT2);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarN2 = anm1.N("graduation_messaging_negative_button_test_tag", uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                ldx ldxVar = ldx.c;
                if (z6) {
                    x340Var2.i0(-1118895704);
                    x340Var2.r(false);
                    haxVar3 = haxVar;
                } else {
                    x340Var2.i0(-1118844802);
                    hax haxVar4 = new hax(cwl1.o0(x340Var2, 2131956391));
                    x340Var2.r(false);
                    haxVar3 = haxVar4;
                }
                foo1.c(gbxVar2, ldxVar, qim0VarN2, haxVar3, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1543851834, new mv8(z2, str2, (byte) 1), x340Var2), x340Var2, 0, 48, 2024);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j950(str, str2, z, z2, function0, function1, qim0Var2, z4, i, i2);
            }
        }
        i5 = 14155776 | i3;
        z4 = z3;
        i4 = i5;
        if ((i4 & 4793491) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x340Var2.Y(i4 & 1, z5)) {
            if (i6 != 0) {
                z4 = true;
            }
            era eraVar2 = een.Q0;
            qim0Var3 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            mbhVarA = jbh.a(h36.c, eraVar2, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF2);
            hzj.A.getClass();
            if (x340Var2.a != null) {
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
            if (z) {
                z6 = false;
            } else {
                z6 = false;
            }
            if ((i4 & 57344) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            objT = x340Var2.T();
            if (z7) {
                objT = new zg20(function0, (byte) 23);
                x340Var2.s0(objT);
            } else {
                objT = new zg20(function0, (byte) 23);
                x340Var2.s0(objT);
            }
            z50 z50Var2 = z50.c;
            gbx gbxVar3 = new gbx(z50Var2, (Function0) objT);
            idx idxVar2 = new idx(4);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarN3 = anm1.N("graduation_messaging_positive_button_test_tag", uyn1.B(qim0Var3, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 0.0f, 13));
            haxVar = jax.a;
            if (z6) {
                x340Var2.i0(-1119905560);
                x340Var2.r(false);
                haxVar2 = haxVar;
            } else {
                x340Var2.i0(-1119854658);
                haxVar2 = new hax(cwl1.o0(x340Var2, 2131956391));
                x340Var2.r(false);
            }
            foo1.c(gbxVar3, idxVar2, qim0VarN3, haxVar2, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(2064584143, new i950(z4, z, str), x340Var2), x340Var2, 0, 48, 2024);
            if ((i4 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            objT2 = x340Var2.T();
            if (z8) {
                objT2 = new zg20(function1, (byte) 24);
                x340Var2.s0(objT2);
            } else {
                objT2 = new zg20(function1, (byte) 24);
                x340Var2.s0(objT2);
            }
            gbx gbxVar4 = new gbx(z50Var2, (Function0) objT2);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarN4 = anm1.N("graduation_messaging_negative_button_test_tag", uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            ldx ldxVar2 = ldx.c;
            if (z6) {
                x340Var2.i0(-1118895704);
                x340Var2.r(false);
                haxVar3 = haxVar;
            } else {
                x340Var2.i0(-1118844802);
                hax haxVar5 = new hax(cwl1.o0(x340Var2, 2131956391));
                x340Var2.r(false);
                haxVar3 = haxVar5;
            }
            foo1.c(gbxVar4, ldxVar2, qim0VarN4, haxVar3, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1543851834, new mv8(z2, str2, (byte) 1), x340Var2), x340Var2, 0, 48, 2024);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j950(str, str2, z, z2, function0, function1, qim0Var2, z4, i, i2);
        }
    }

    public static final void h(jyp0 jyp0Var, tl3 tl3Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(jyp0Var) : x340Var.i(jyp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(tl3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.g(jyp0Var))) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new vr50(tl3Var, jyp0Var);
                x340Var.s0(objT);
            }
            sy4.a((vr50) objT, null, new nfv0(1, false, false), j2iVar, x340Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05((Object) jyp0Var, (Object) tl3Var, (cv30) j2iVar, i, (byte) 0);
        }
    }

    public static final void i(float f, lee1 lee1Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(275380783);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.i(lee1Var) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            long jC = cbx.a(x340Var).a.b.c();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(2.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.v(nim0Var, f), jA, cr31VarB);
            if (z) {
                qim0VarF = qim0VarF.then(cwl1.l0(nim0Var, jC, cr31VarB, 12));
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = jpc.X;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            uwo1.e(" ", (qim0) null, lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, ((i2 << 3) & 896) | 6, 0, 1786);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jrc(f, lee1Var, z, i);
        }
    }

    public static final void j(zkn0 zkn0Var, iu30 iu30Var, qim0 qim0Var, int i, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        int iMax;
        qim0 qim0Var3;
        String str = zkn0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-340447077);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(zkn0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 = i3 | 1408;
        }
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                iMax = Math.max(1, str.length()) * 20;
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                iMax = i;
            }
            x340Var.s();
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
                objT2 = new vk1(ven0Var, (lnm) null, (byte) 20);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            nyx.a(2, (wux) null, apo.r(1391070376, new w0f0(qim0Var3, iu30Var, zkn0Var, z95.c(((Boolean) ven0Var.getValue()).booleanValue() ? str.length() : 0, irn1.o0(iMax, 0, mlv.d, 2), "typewriterCount", (iu30) null, x340Var, 384, 8)), x340Var), x340Var, 3078, 6);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
            i4 = iMax;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            i4 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(zkn0Var, iu30Var, qim0Var2, i4, i2, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    public static final void k(final jyp0 jyp0Var, final boolean z, final int i, final boolean z2, long j, final float f, final qim0 qim0Var, b0k b0kVar, final int i2, final int i3) {
        int i4;
        long j2;
        final boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-466280168);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(jyp0Var) : x340Var.i(jyp0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.e(l1d.C(i)) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.h(z2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            j2 = j;
            i4 |= ((i3 & 16) == 0 && x340Var.f(j2)) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        } else {
            j2 = j;
        }
        if ((1572864 & i2) == 0) {
            i4 |= x340Var.g(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i4 & 1, (533651 & i4) != 533650)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                j2 = 9205357640488583168L;
            }
            x340Var.s();
            if (z) {
                d261 d261Var = px51.a;
                if ((i != 1 || z2) && !(i == 2 && z2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                d261 d261Var2 = px51.a;
                if ((i != 1 || z2) && !(i == 2 && z2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            dra draVar = z3 ? dro.c : dro.b;
            int i5 = i4 & 14;
            boolean zH = (i5 == 4 || ((i4 & 8) != 0 && x340Var.i(jyp0Var))) | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | x340Var.h(z3);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = new iu30() { // from class: p.c15
                    public final Object invoke(Object obj) {
                        e261 e261Var = (e261) obj;
                        long jA = jyp0Var.a();
                        e261Var.b(px51.a, new ox51(z ? qr50.b : qr50.c, jA, z3 ? 1 : 3, (9223372034707292159L & jA) != 9205357640488583168L));
                        return rih1.a;
                    }
                };
                x340Var.s0(objT);
            }
            final qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            final e8k1 e8k1Var = (e8k1) x340Var.k(t4k.t);
            final boolean z4 = z3;
            final long j3 = j2;
            h(jyp0Var, draVar, apo.r(1365123137, new vu30() { // from class: p.d15
                public final Object invoke(Object obj, Object obj2) {
                    x340 x340Var2 = (b0k) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    x340 x340Var3 = x340Var2;
                    if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ely0 ely0VarA = t4k.t.a(e8k1Var);
                        final long j4 = j3;
                        final boolean z5 = z4;
                        final qim0 qim0Var2 = qim0VarB;
                        final jyp0 jyp0Var2 = jyp0Var;
                        mod.b(ely0VarA, apo.r(1260045569, new vu30() { // from class: p.w05
                            public final Object invoke(Object obj3, Object obj4) {
                                x340 x340Var4 = (b0k) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                m4c m4cVar = fkj0.X;
                                final byte b = 1;
                                final byte b2 = 0;
                                x340 x340Var5 = x340Var4;
                                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j5 = j4;
                                    boolean z6 = z5;
                                    qim0 qim0Var3 = qim0Var2;
                                    final jyp0 jyp0Var3 = jyp0Var2;
                                    if (j5 != 9205357640488583168L) {
                                        x340Var5.i0(3458246);
                                        rdx0 rdx0Var = z6 ? aq8.b : aq8.a;
                                        qim0 qim0VarO = u291.o(qim0Var3, s3v.b(j5), s3v.a(j5), 0.0f, 0.0f, 12);
                                        jw31 jw31VarA = ew31.a(rdx0Var, een.Z, x340Var5, 0);
                                        int iHashCode = Long.hashCode(x340Var5.T);
                                        xos0 xos0VarM = x340Var5.m();
                                        qim0 qim0VarE = zr7.E(x340Var5, qim0VarO);
                                        hzj.A.getClass();
                                        if (x340Var5.a == null) {
                                            tgp1.p();
                                            throw null;
                                        }
                                        x340Var5.m0();
                                        if (x340Var5.S) {
                                            x340Var5.l(hmb0.t1);
                                        } else {
                                            x340Var5.v0();
                                        }
                                        nko1.H(jw31VarA, x340Var5, y580.O0);
                                        nko1.H(xos0VarM, x340Var5, y580.N0);
                                        nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                                        nko1.F(x340Var5);
                                        nko1.H(qim0VarE, x340Var5, y580.Y);
                                        boolean zI = x340Var5.i(jyp0Var3);
                                        Object objT2 = x340Var5.T();
                                        if (zI || objT2 == m4cVar) {
                                            objT2 = new Function0() { // from class: p.x05
                                                public final Object invoke() {
                                                    byte b3 = b2;
                                                    jyp0 jyp0Var4 = jyp0Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & jyp0Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & jyp0Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            x340Var5.s0(objT2);
                                        }
                                        t4n1.l(6, (Function0) objT2, x340Var5, nim0.a, z6);
                                        x340Var5.r(true);
                                        x340Var5.r(false);
                                    } else {
                                        x340Var5.i0(4389176);
                                        boolean zI2 = x340Var5.i(jyp0Var3);
                                        Object objT3 = x340Var5.T();
                                        if (zI2 || objT3 == m4cVar) {
                                            objT3 = new Function0() { // from class: p.x05
                                                public final Object invoke() {
                                                    byte b3 = b;
                                                    jyp0 jyp0Var4 = jyp0Var3;
                                                    switch (b3) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & jyp0Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & jyp0Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            x340Var5.s0(objT3);
                                        }
                                        t4n1.l(0, (Function0) objT3, x340Var5, qim0Var3, z6);
                                        x340Var5.r(false);
                                    }
                                } else {
                                    x340Var5.b0();
                                }
                                return rih1.a;
                            }
                        }, x340Var3), x340Var3, 56);
                    } else {
                        x340Var3.b0();
                    }
                    return rih1.a;
                }
            }, x340Var), x340Var, i5 | 384);
            j2 = j3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            final long j4 = j2;
            h311VarV.d = new vu30() { // from class: p.v05
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t4n1.k(jyp0Var, z, i, z2, j4, f, qim0Var, (b0k) obj, czo1.p(i2 | 1), i3);
                    return rih1.a;
                }
            };
        }
    }

    public static final void l(final int i, final Function0 function0, b0k b0kVar, final qim0 qim0Var, final boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2111672474);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (x340Var.i(function0) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            d261 d261Var = px51.a;
            op71.g(x340Var, zr7.i(u291.s(qim0Var, 25.0f, 25.0f), new xu30() { // from class: p.z05
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    qim0 qim0Var2 = (qim0) obj;
                    ((Integer) obj3).getClass();
                    x340 x340Var2 = (b0k) obj2;
                    x340Var2.i0(-196777734);
                    final long j = ((rce1) x340Var2.k(sce1.a)).a;
                    boolean zF = x340Var2.f(j);
                    final Function0 function1 = function0;
                    boolean zG = zF | x340Var2.g(function1);
                    final boolean z2 = z;
                    boolean zH = zG | x340Var2.h(z2);
                    Object objT = x340Var2.T();
                    if (zH || objT == fkj0.X) {
                        objT = new iu30() { // from class: p.a15
                            public final Object invoke(Object obj4) {
                                eqc eqcVar = (eqc) obj4;
                                final yk4 yk4VarO = t4n1.o(eqcVar, Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f);
                                final f2b f2bVar = new f2b(j, 5);
                                final byte b = 0;
                                final Function0 function2 = function1;
                                final boolean z3 = z2;
                                return eqcVar.b(new iu30() { // from class: p.b15
                                    public final Object invoke(Object obj5) {
                                        byte b2 = b;
                                        rih1 rih1Var = rih1.a;
                                        Object obj6 = f2bVar;
                                        Object obj7 = yk4VarO;
                                        boolean z4 = z3;
                                        Object obj8 = function2;
                                        switch (b2) {
                                            case 0:
                                                yk4 yk4Var = (yk4) obj7;
                                                f2b f2bVar2 = (f2b) obj6;
                                                lsl lslVar = (lsl) obj5;
                                                lslVar.s1();
                                                if (((Boolean) ((Function0) obj8).invoke()).booleanValue()) {
                                                    if (z4) {
                                                        long jG1 = lslVar.g1();
                                                        cab cabVarA1 = lslVar.a1();
                                                        long jU = cabVarA1.u();
                                                        cabVarA1.p().q();
                                                        try {
                                                            ((dg8) cabVarA1.b).t(-1.0f, 1.0f, jG1);
                                                            DrawScope.m(lslVar, yk4Var, 0L, 0.0f, f2bVar2, 0, 46);
                                                        } finally {
                                                            i3a.n(cabVarA1, jU);
                                                        }
                                                    } else {
                                                        DrawScope.m(lslVar, yk4Var, 0L, 0.0f, f2bVar2, 0, 46);
                                                    }
                                                }
                                                return rih1Var;
                                            default:
                                                z8d0 z8d0Var = (z8d0) obj8;
                                                String str = (String) obj7;
                                                sxl1 sxl1Var = (sxl1) obj6;
                                                WorkerStoppedException workerStoppedException = (Throwable) obj5;
                                                if (workerStoppedException instanceof WorkerStoppedException) {
                                                    z8d0Var.e(workerStoppedException.a);
                                                }
                                                if (z4 && str != null) {
                                                    mif1.e(str, sxl1Var.a.hashCode());
                                                }
                                                return rih1Var;
                                        }
                                    }
                                });
                            }
                        };
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarR = exd0.r(qim0Var2, (iu30) objT);
                    x340Var2.r(false);
                    return qim0VarR;
                }
            }));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.y05
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t4n1.l(czo1.p(i | 1), function0, (b0k) obj, qim0Var, z);
                    return rih1.a;
                }
            };
        }
    }

    public static final void m(String str, String str2, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1172185100);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function2 = function0;
            i2 |= x340Var.i(function2) ? SemanticState.Hidden : SemanticState.Focused;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = (skg1) function2.invoke();
                x340Var.s0(objT);
            }
            skg1 skg1Var = (skg1) objT;
            i1o1.e(skg1Var, new nkg1(str, str2, function1), skg1Var.a, (qim0) null, (ipb1) null, znj.a, (xu30) null, 0, (xu30) null, x340Var, 196608, 236);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new irj0(str, str2, function2, function1, i, (byte) 1);
        }
    }

    public static final long n(long j) {
        if (z4p1.B(j) < 0.179129f) {
            int i = u7h.l;
            return u7h.f;
        }
        int i2 = u7h.l;
        return u7h.b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final yk4 o(eqc eqcVar, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        yk4 yk4VarB = rzn1.c;
        fid fidVarA = rzn1.d;
        vid vidVar = rzn1.e;
        if (yk4VarB == null || fidVarA == null) {
            yk4VarB = h1p1.b(iCeil, iCeil, 1);
            rzn1.c = yk4VarB;
            fidVarA = v84.a(yk4VarB);
            rzn1.d = fidVarA;
        } else {
            Bitmap bitmap = yk4VarB.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                yk4VarB = h1p1.b(iCeil, iCeil, 1);
                rzn1.c = yk4VarB;
                fidVarA = v84.a(yk4VarB);
                rzn1.d = fidVarA;
            }
        }
        yk4 yk4Var = yk4VarB;
        fid fidVar = fidVarA;
        if (vidVar == null) {
            vidVar = new vid();
            rzn1.e = vidVar;
        }
        vid vidVar2 = vidVar;
        uid uidVar = vidVar2.a;
        flb0 layoutDirection = eqcVar.a.getLayoutDirection();
        Bitmap bitmap2 = yk4Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        wat watVar = uidVar.a;
        flb0 flb0Var = uidVar.b;
        fid fidVar2 = uidVar.c;
        long j = uidVar.d;
        uidVar.a = eqcVar;
        uidVar.b = layoutDirection;
        uidVar.c = fidVar;
        uidVar.d = jFloatToRawIntBits;
        fidVar.q();
        DrawScope.d0(vidVar2, u7h.b, 0L, vidVar2.j(), 0.0f, (phc1) null, (ColorFilter) null, 58);
        DrawScope.d0(vidVar2, z4p1.g(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
        DrawScope.b0(vidVar2, z4p1.g(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, (DrawStyle) null, 120);
        fidVar.i();
        uidVar.a = watVar;
        uidVar.b = flb0Var;
        uidVar.c = fidVar2;
        uidVar.d = j;
        return yk4Var;
    }

    public static PendingIntent p(Context context, nmx0 nmx0Var) {
        String str = nmx0Var.a;
        Intent intent = new Intent(context, (Class<?>) PromoSuccessHandlerService.class);
        intent.putExtra("com.spotify.widget.widgetpromo.EXTRA_SOURCE", str);
        return PendingIntent.getService(context, 0, intent, 67108864);
    }

    public static final long q(x4t x4tVar) {
        o811 o811Var = new o811();
        o811Var.a = u7h.f;
        don1.E(x4tVar, "androidx.xr.glimmer.ContentColor", new j6(o811Var, (byte) 16));
        return o811Var.a;
    }

    public static final u310 r(u310 u310Var) {
        y310 y310Var = u310Var.w;
        p710 p710Var = y310Var != null ? (p710) o7h.q0(y310Var.a) : null;
        if (p710Var == null) {
            return u310Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u310Var.A);
        String str = p710Var.b;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("com.spotify.music.extra.SECTION_ID", str);
        String str2 = p710Var.c;
        linkedHashMap.put("com.spotify.music.extra.SECTION_URI", str2 != null ? str2 : "");
        return u310.b(u310Var, (String) null, (String) null, (Uri) null, 0, (Double) null, (String) null, 0, (y310) null, (String) null, linkedHashMap, (Uri) null, (q510) null, -1073741825, 15);
    }

    public static final String s(double d, boolean z, b0k b0kVar) {
        String strN0;
        int i;
        boolean z2 = d < 1.0d;
        if (z2) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-379300609);
            List list = krc.a;
            strN0 = cwl1.n0(2131961765, new Object[]{Long.valueOf(jch0.a0(d * 1.0E9d) / 1000000)}, x340Var);
            x340Var.r(false);
        } else if (d % 1.0d == 0.0d) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-379294787);
            strN0 = cwl1.n0(2131961765, new Object[]{Long.valueOf((long) d)}, x340Var2);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-379291751);
            strN0 = cwl1.n0(2131961750, new Object[]{Double.valueOf(d)}, x340Var3);
            x340Var3.r(false);
        }
        if (z && z2) {
            i = 2131961764;
        } else if (z) {
            i = 2131961763;
        } else {
            i = z2 ? 2131961755 : 2131961751;
        }
        return cwl1.n0(i, new Object[]{strN0}, b0kVar);
    }

    public static ohv t(String str) {
        for (ohv ohvVar : ohv.values()) {
            if (ohvVar.a.equals(str)) {
                return ohvVar;
            }
        }
        return null;
    }

    public static final qim0 u(qim0 qim0Var, bsb0 bsb0Var) {
        return qim0Var.then(new hku(bsb0Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(t45 t45Var, String str, iu30 iu30Var, lnm lnmVar) throws Throwable {
        h7m1 h7m1Var;
        String strReplaceAll;
        if (lnmVar instanceof h7m1) {
            h7m1Var = (h7m1) lnmVar;
            int i = h7m1Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                h7m1Var.d = i - os00.INVALID_ID;
            } else {
                h7m1Var = new h7m1(lnmVar);
            }
        } else {
            h7m1Var = new h7m1(lnmVar);
        }
        Object objInvoke = h7m1Var.c;
        int i2 = h7m1Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = h7m1Var.b;
            t45 t45Var2 = h7m1Var.a;
            try {
                hm5.M(objInvoke);
                strReplaceAll = str2;
                t45Var = t45Var2;
                t45Var.g(strReplaceAll);
                return objInvoke;
            } catch (Throwable th) {
                th = th;
                strReplaceAll = str2;
                t45Var = t45Var2;
                t45Var.g(strReplaceAll);
                throw th;
            }
        }
        hm5.M(objInvoke);
        strReplaceAll = Pattern.compile("[^a-zA-Z0-9_.-]").matcher(str).replaceAll("_");
        try {
            t45.m(t45Var, strReplaceAll, 2);
            h7m1Var.a = t45Var;
            h7m1Var.b = strReplaceAll;
            h7m1Var.d = 1;
            objInvoke = iu30Var.invoke(h7m1Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
            t45Var.g(strReplaceAll);
            return objInvoke;
        } catch (Throwable th2) {
            th = th2;
            t45Var.g(strReplaceAll);
            throw th;
        }
    }

    public static final MissingFieldException w(MissingFieldException missingFieldException, String str) {
        return new MissingFieldException(str, missingFieldException, missingFieldException.a, missingFieldException.b);
    }

    public static final kya1 x(iac0 iac0Var) {
        x8c0 lifecycle = iac0Var.getLifecycle();
        nxq0 nxq0Var = new nxq0();
        nxq0 nxq0Var2 = new nxq0();
        nxq0Var.a.i(lifecycle.b());
        nxq0Var2.a.i(lifecycle.b());
        p811 p811Var = new p811();
        p811Var.a = lifecycle.b();
        p811 p811Var2 = new p811();
        lya1 lya1Var = new lya1(lifecycle, p811Var, nxq0Var, nxq0Var2, p811Var2);
        p811Var2.a = lya1Var;
        lifecycle.a(lya1Var);
        return new kya1(nxq0Var, nxq0Var2);
    }

    public static final p751 y(gzy gzyVar) {
        switch (gzyVar.ordinal()) {
            case 0:
                return p751.ENTITY_TYPE_PODCAST;
            case 1:
                return p751.ENTITY_TYPE_TRACK;
            case 2:
                return p751.ENTITY_TYPE_ALBUM;
            case 3:
                return p751.ENTITY_TYPE_ARTIST;
            case 4:
                return p751.ENTITY_TYPE_EPISODE;
            case 5:
                return p751.ENTITY_TYPE_AUDIOBOOK;
            case 6:
                return p751.ENTITY_TYPE_PLAYLIST;
            default:
                eg.o();
                return null;
        }
    }

    public static final jj41 z(oen0 oen0Var) {
        return new jj41(oen0Var);
    }
}
