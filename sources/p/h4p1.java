package p;

import android.content.Context;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Next;
import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h4p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:72:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x0350  */
    /* JADX WARN: Code duplicated, block: B:92:0x0386  */
    /* JADX WARN: Code duplicated, block: B:94:0x038e  */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final void a(v720 v720Var, iu30 iu30Var, qim0 qim0Var, Clock clock, b0k b0kVar, int i) {
        iu30 iu30Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object ur1Var;
        qim0 qim0Var4;
        m4c m4cVar;
        boolean z;
        m4c m4cVar2;
        Object objT;
        boolean z2;
        boolean zI;
        Object objT2;
        ?? r8;
        boolean zI2;
        Object objT3;
        m4c m4cVar3 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1808780694);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.i(v720Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072 | (b0kVar3.i(clock) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar3.d0();
            int i3 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i3 == 0 || b0kVar3.E()) {
                qim0Var3 = qim0Var5;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            Object[] objArr = new Object[0];
            boolean zI3 = b0kVar3.i(v720Var);
            Object objT4 = b0kVar3.T();
            if (zI3 || objT4 == m4cVar3) {
                objT4 = new l5r(v720Var, (byte) 1);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT4, b0kVar3, 0);
            Object[] objArr2 = new Object[0];
            boolean zI4 = b0kVar3.i(v720Var);
            Object objT5 = b0kVar3.T();
            if (zI4 || objT5 == m4cVar3) {
                objT5 = new l5r(v720Var, (byte) 0);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT5, b0kVar3, 0);
            Object[] objArr3 = new Object[0];
            boolean zI5 = b0kVar3.i(v720Var) | b0kVar3.i(clock);
            Object objT6 = b0kVar3.T();
            if (zI5 || objT6 == m4cVar3) {
                objT6 = new sqm(v720Var, clock, (byte) 18);
                b0kVar3.s0(objT6);
            }
            ven0 ven0Var3 = (ven0) k5p1.s(objArr3, (Function0) objT6, b0kVar3, 0);
            Boolean bool = Boolean.TRUE;
            boolean zI6 = b0kVar3.i(ven0Var) | b0kVar3.i(v720Var) | b0kVar3.i(ven0Var2) | b0kVar3.i(ven0Var3) | b0kVar3.i(clock);
            Object objT7 = b0kVar3.T();
            if (zI6 || objT7 == m4cVar3) {
                qim0Var4 = qim0Var3;
                ur1Var = new ur1((byte) 13, v720Var, clock, ven0Var, ven0Var2, ven0Var3, (lnm) null);
                b0kVar3.s0(ur1Var);
            } else {
                qim0Var4 = qim0Var3;
                ur1Var = objT7;
            }
            qxd0.t(bool, b0kVar3, (vu30) ur1Var);
            LocalDate localDateNow = LocalDate.now(clock);
            qim0 qim0VarH = l6o1.H(qim0Var4, l6o1.C(0, 0, 1, b0kVar3), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarH);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            qim0 qim0Var6 = qim0Var4;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarF);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            int i4 = i2 & 896;
            boolean zI7 = (i4 == 256) | b0kVar3.i(ven0Var) | b0kVar3.i(ven0Var2);
            Object objT8 = b0kVar3.T();
            if (zI7) {
                m4cVar = m4cVar3;
            } else {
                m4cVar = m4cVar3;
                if (objT8 != m4cVar) {
                    iu30Var2 = iu30Var;
                }
                Function0 function0 = (Function0) objT8;
                if (((LocalDate) ven0Var.getValue()) == null || ((LocalDate) ven0Var2.getValue()) != null) {
                    z = false;
                } else {
                    z = true;
                }
                String strO0 = cwl1.o0(b0kVar3, 2131953904);
                m4cVar2 = m4cVar;
                g0p1.c(6, strO0, function0, b0kVar3, null, z);
                qim0 qim0VarA = h2c.a.a(qim0Var5, een.h);
                objT = b0kVar3.T();
                if (objT == m4cVar2) {
                    objT = d4r.e1;
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarA, false, (iu30) objT);
                String strO1 = cwl1.o0(b0kVar3, 2131954843);
                uwr uwrVar = cbx.a;
                uwo1.e(strO1, qim0VarB, cbx.d(b0kVar3).h, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2040);
                op71.g(b0kVar3, u291.v(qim0Var5, 1.0f));
                b0kVar3.r(true);
                b0kVar2 = b0kVar3;
                hr80.d((qim0) null, 0.5f, u7h.b(cbx.a(b0kVar3).a.b.c(), 0.1f, 0.0f, 0.0f, 0.0f, 14), b0kVar2, 0, 1);
                LocalDate localDate = (LocalDate) ven0Var.getValue();
                LocalDate localDate2 = (LocalDate) ven0Var2.getValue();
                if (i4 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = z2 | b0kVar2.i(ven0Var) | b0kVar2.i(ven0Var2);
                objT2 = b0kVar2.T();
                if (!zI || objT2 == m4cVar2) {
                    r8 = 0;
                    objT2 = new j5r(iu30Var2, ven0Var, ven0Var2, (byte) 0);
                    b0kVar2.s0(objT2);
                } else {
                    r8 = 0;
                }
                c(localDate, localDate2, clock, (zu30) objT2, b0kVar2, (i2 >> 6) & 896);
                x6r x6rVar = new x6r(new s6r((LocalDate) ven0Var.getValue(), (LocalDate) ven0Var2.getValue()), new s6r(localDateNow, localDateNow.plusYears(1L).minusDays(1L)), (YearMonth) ven0Var3.getValue());
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, u291.f(qim0Var5, 1.0f));
                zI2 = b0kVar2.i(ven0Var2) | b0kVar2.i(ven0Var) | b0kVar2.i(ven0Var3);
                objT3 = b0kVar2.T();
                if (zI2 || objT3 == m4cVar2) {
                    objT3 = new k5r(ven0Var2, ven0Var, ven0Var3, (byte) r8);
                    b0kVar2.s0(objT3);
                }
                u4p1.d(x6rVar, (iu30) objT3, qim0VarZ, clock, b0kVar2, (i2 >> 3) & 7168, 0);
                qim0 qim0VarF2 = u291.f(qim0Var5, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, (boolean) r8);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarF2);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, lljVar4);
                gfx.g(4, apo.r(1096869322, new won(iu30Var2, ven0Var, ven0Var2), b0kVar2), b0kVar2, 54);
                b0kVar2.r(true);
                b0kVar2.r(true);
                qim0Var2 = qim0Var6;
            }
            iu30Var2 = iu30Var;
            objT8 = new fff(iu30Var2, ven0Var, ven0Var2, (byte) 2);
            b0kVar3.s0(objT8);
            Function0 function1 = (Function0) objT8;
            if (((LocalDate) ven0Var.getValue()) == null) {
                z = false;
            } else {
                z = false;
            }
            String strO2 = cwl1.o0(b0kVar3, 2131953904);
            m4cVar2 = m4cVar;
            g0p1.c(6, strO2, function1, b0kVar3, null, z);
            qim0 qim0VarA2 = h2c.a.a(qim0Var5, een.h);
            objT = b0kVar3.T();
            if (objT == m4cVar2) {
                objT = d4r.e1;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarA2, false, (iu30) objT);
            String strO3 = cwl1.o0(b0kVar3, 2131954843);
            uwr uwrVar2 = cbx.a;
            uwo1.e(strO3, qim0VarB2, cbx.d(b0kVar3).h, 0L, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2040);
            op71.g(b0kVar3, u291.v(qim0Var5, 1.0f));
            b0kVar3.r(true);
            b0kVar2 = b0kVar3;
            hr80.d((qim0) null, 0.5f, u7h.b(cbx.a(b0kVar3).a.b.c(), 0.1f, 0.0f, 0.0f, 0.0f, 14), b0kVar2, 0, 1);
            LocalDate localDate3 = (LocalDate) ven0Var.getValue();
            LocalDate localDate4 = (LocalDate) ven0Var2.getValue();
            if (i4 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zI = z2 | b0kVar2.i(ven0Var) | b0kVar2.i(ven0Var2);
            objT2 = b0kVar2.T();
            if (zI) {
                r8 = 0;
                objT2 = new j5r(iu30Var2, ven0Var, ven0Var2, (byte) 0);
                b0kVar2.s0(objT2);
            } else {
                r8 = 0;
                objT2 = new j5r(iu30Var2, ven0Var, ven0Var2, (byte) 0);
                b0kVar2.s0(objT2);
            }
            c(localDate3, localDate4, clock, (zu30) objT2, b0kVar2, (i2 >> 6) & 896);
            x6r x6rVar2 = new x6r(new s6r((LocalDate) ven0Var.getValue(), (LocalDate) ven0Var2.getValue()), new s6r(localDateNow, localDateNow.plusYears(1L).minusDays(1L)), (YearMonth) ven0Var3.getValue());
            qim0 qim0VarZ2 = uyn1.z(8.0f, 0.0f, 2, u291.f(qim0Var5, 1.0f));
            zI2 = b0kVar2.i(ven0Var2) | b0kVar2.i(ven0Var) | b0kVar2.i(ven0Var3);
            objT3 = b0kVar2.T();
            if (zI2) {
                objT3 = new k5r(ven0Var2, ven0Var, ven0Var3, (byte) r8);
                b0kVar2.s0(objT3);
            } else {
                objT3 = new k5r(ven0Var2, ven0Var, ven0Var3, (byte) r8);
                b0kVar2.s0(objT3);
            }
            u4p1.d(x6rVar2, (iu30) objT3, qim0VarZ2, clock, b0kVar2, (i2 >> 3) & 7168, 0);
            qim0 qim0VarF3 = u291.f(qim0Var5, 1.0f);
            gfh0 gfh0VarC3 = t1c.c(graVar, (boolean) r8);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarF3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC3, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            gfx.g(4, apo.r(1096869322, new won(iu30Var2, ven0Var, ven0Var2), b0kVar2), b0kVar2, 54);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var6;
        } else {
            iu30Var2 = iu30Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(v720Var, iu30Var2, qim0Var2, clock, i, (byte) 12);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1769391212);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            j2iVar2 = j2iVar;
            nyx.a(2, (wux) null, j2iVar2, x340Var, 3078, 6);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar2, i, (byte) 7);
        }
    }

    public static final void c(LocalDate localDate, LocalDate localDate2, Clock clock, zu30 zu30Var, b0k b0kVar, int i) {
        int i2;
        LocalDate localDate3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1274599857);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            localDate3 = localDate2;
            i2 |= x340Var.i(localDate3) ? 32 : 16;
        } else {
            localDate3 = localDate2;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(clock) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(zu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            LocalDate localDateNow = LocalDate.now(clock);
            LocalDate localDatePlusDays = localDateNow.plusDays(7 - localDateNow.getDayOfWeek().getValue());
            LocalDate localDateMinusDays = (localDateNow.equals(localDatePlusDays) || localDateNow.equals(localDatePlusDays.minusDays(1L))) ? localDateNow : localDatePlusDays.minusDays(2L);
            h5r h5rVar = new h5r(ldl0.e, cwl1.o0(x340Var, 2131963292), localDateNow, localDateNow);
            String strO0 = cwl1.o0(x340Var, 2131963168);
            localDatePlusDays.getClass();
            h5r h5rVar2 = new h5r(ldl0.c, strO0, localDateNow, localDatePlusDays);
            String strO1 = cwl1.o0(x340Var, 2131963169);
            localDateMinusDays.getClass();
            k5p1.d(uyn1.y(u291.f(nim0.a, 1.0f), 16.0f, 16.0f), new d36(8.0f, true, new um5(false)), new d36(16.0f, true, new um5(false)), null, 0, 0, apo.r(494984598, new k8((Object) p7h.M(new h5r[]{h5rVar, h5rVar2, new h5r(ldl0.d, strO1, localDateMinusDays, localDatePlusDays), new h5r(ldl0.b, cwl1.o0(x340Var, 2131963167), localDateNow, YearMonth.from(localDateNow).atEndOfMonth())}), (Object) localDate, (Object) localDate3, (Object) zu30Var, (byte) 21), x340Var), x340Var, 1572864, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, localDate, localDate2, clock, zu30Var, (byte) 0);
        }
    }

    public static final void d(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final huz e(n5 n5Var) {
        return new huz(n5Var, (byte) 7);
    }

    public static final ezc f(vu30 vu30Var) {
        return new ezc(vu30Var, o6x.a, -2, 1);
    }

    public static final bge g(vu30 vu30Var) {
        return new bge(vu30Var, o6x.a, -2, 1);
    }

    public static final List h(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return z6x.a;
        }
        if (size == 1) {
            return Collections.singletonList(o7h.q0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final i6a i(bu11 bu11Var) {
        return new i6a(bu11Var, (byte) 5);
    }

    public static String j(phc phcVar) {
        StringBuilder sb = new StringBuilder(phcVar.size());
        for (int i = 0; i < phcVar.size(); i++) {
            byte bC = phcVar.c(i);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case grn1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                        } else {
                            sb.append((char) bC);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String k(String str) {
        return j(phc.i(str));
    }

    public static final m441 l(vu30 vu30Var) {
        return new m441(vu30Var);
    }

    public static final huz m(Object obj) {
        return new huz(obj, (byte) 10);
    }

    public static final g001 n(bu11 bu11Var) {
        return new g001(bu11Var, (byte) 25);
    }

    public static final boolean o(tr3 tr3Var, aey aeyVar) {
        boolean z;
        List list = tr3Var.b.a.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    d6c0 d6c0Var = (d6c0) it.next();
                    if ((d6c0Var instanceof q5c0) || (d6c0Var instanceof b5c0)) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        }
        return z & (aeyVar != aey.a);
    }

    public static final boolean p(List list, tka0 tka0Var) {
        Object next;
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!rc11.a.b(((d6c0) next).getClass()).equals(tka0Var));
        if (((d6c0) next) != null) {
            return true;
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (p(((d6c0) it2.next()).a(), tka0Var)) {
                return true;
            }
        }
        return false;
    }

    public static final HashMap q(int i) {
        return new HashMap(i >= 3 ? (i / 3) + i + 1 : 3);
    }

    public static final HashSet r(int i) {
        return new HashSet(i >= 3 ? (i / 3) + i + 1 : 3);
    }

    public static boolean s(boolean z, tg4 tg4Var) {
        return z && tg4Var.b();
    }

    public static boolean t(boolean z, tg4 tg4Var) {
        return z && tg4Var.d();
    }

    public static boolean u(boolean z, tg4 tg4Var) {
        return z && tg4Var.c();
    }

    public static boolean v(Context context) {
        return context.getResources().getBoolean(2131034139);
    }

    public static final Set w(List list) {
        if (list.isEmpty()) {
            return w7x.a;
        }
        xj61 xj61Var = new xj61();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d6c0 d6c0Var = (d6c0) it.next();
            d6c0Var.getClass();
            xj61Var.add(ero1.g(d6c0Var));
            xj61Var.addAll(w(d6c0Var.a()));
        }
        return cwl1.j(xj61Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if ((((p.h1r) r1).a instanceof p.vyq) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p.hok0 x(p.k1r r1) {
        /*
            boolean r0 = r1 instanceof p.j1r
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r0 = r1 instanceof p.h1r
            if (r0 == 0) goto L14
            p.h1r r1 = (p.h1r) r1
            p.yyq r1 = r1.a
            boolean r1 = r1 instanceof p.vyq
            if (r1 == 0) goto L30
        L11:
            p.eok0 r1 = p.eok0.a
            return r1
        L14:
            boolean r0 = r1 instanceof p.i1r
            if (r0 == 0) goto L33
            p.i1r r1 = (p.i1r) r1
            java.lang.Object r1 = r1.a
            p.zge1 r1 = (p.zge1) r1
            int r0 = r1.b
            if (r0 <= 0) goto L30
            java.util.ArrayList r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            p.fok0 r0 = new p.fok0
            r0.<init>(r1)
            return r0
        L30:
            p.gok0 r1 = p.gok0.a
            return r1
        L33:
            p.eg.o()
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h4p1.x(p.k1r):p.hok0");
    }

    public static final Next y(ydu0 ydu0Var, xdu0 xdu0Var) {
        String str = ydu0Var.a;
        String str2 = xdu0Var.a;
        iko ikoVar = xdu0Var.h;
        if (str.equals(str2) && ydu0Var.b == xdu0Var.b && ydu0Var.c == xdu0Var.c && ydu0Var.g == xdu0Var.g && ydu0Var.e == xdu0Var.e && ydu0Var.f == xdu0Var.f && ydu0Var.h == ikoVar) {
            return Next.j();
        }
        boolean z = xdu0Var.b;
        boolean z2 = xdu0Var.c;
        boolean z3 = xdu0Var.g;
        boolean z4 = xdu0Var.f;
        return Next.i(new ydu0(str2, z, z2, ydu0Var.d, xdu0Var.e, z4, z3, ikoVar), Collections.singleton(wdu0.b));
    }
}
