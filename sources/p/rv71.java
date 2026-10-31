package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rv71 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv71(j2i j2iVar) {
        super(3);
        this.a = (byte) 13;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        f36 f36Var = h36.c;
        qti1 qti1Var = voo1.g;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                d6f0 d6f0Var = (d6f0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new pv71(d6f0Var, c9nVar);
                    x340Var.s0(objT2);
                }
                pv71 pv71Var = (pv71) objT2;
                j2iVar.J(pv71Var, new tv71(pv71Var), x340Var, 6);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 2:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var3, 0);
                    int iHashCode = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, nim0Var);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(mbhVarA, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    dv20.l(0, j2iVar, x340Var3, true);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 6:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarW = uyn1.w(nim0Var, (vzq0) obj);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarW);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                j2iVar.invoke(x340Var4, 0);
                x340Var6.r(true);
                return rih1Var;
            case 7:
                i2c i2cVar = (i2c) obj;
                j2iVar.J(i2cVar, Boolean.valueOf(p3v.b(i2cVar.c(), 600.0f) < 0), (b0k) obj2, Integer.valueOf(((Number) obj3).intValue() & 14));
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 9:
                g2c g2cVar = (g2c) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var7.g(g2cVar) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    j2iVar.invoke(g2cVar, x340Var8, Integer.valueOf(iIntValue2 & 14));
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                g2c g2cVar2 = (g2c) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var9.g(g2cVar2) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    j2iVar.invoke(g2cVar2, x340Var10, Integer.valueOf(iIntValue3 & 14));
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 11:
                g2c g2cVar3 = (g2c) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var11.g(g2cVar3) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    j2iVar.invoke(g2cVar3, x340Var12, Integer.valueOf(iIntValue4 & 14));
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 13:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), qti1Var);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var13).b;
                cvx cvxVar2 = cbx.b(x340Var13).b;
                qim0 qim0VarB = uyn1.B(qim0VarY, 0.0f, 8.0f, 0.0f, 12.0f, 5);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var14 = x340Var13;
                int iHashCode3 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM3 = x340Var14.m();
                qim0 qim0VarE3 = zr7.E(x340Var13, qim0VarB);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(gfh0VarC2, x340Var13, y580.O0);
                nko1.H(xos0VarM3, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE3, x340Var13, y580.Y);
                j2iVar.invoke(x340Var13, 0);
                x340Var15.r(true);
                return rih1Var;
            case 14:
                rcx rcxVar = (rcx) obj;
                x340 x340Var16 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var16.g(rcxVar) ? 4 : 2;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    j2iVar.invoke(rcxVar, x340Var17, Integer.valueOf(iIntValue5 & 14));
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 15:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                mod.b(ede0.a.a(new a0r0((vzq0) obj)), apo.r(260991797, new ak10(j2iVar, (byte) 6), b0kVar), b0kVar, 56);
                return rih1Var;
            case 16:
                gpb0 gpb0Var = (gpb0) obj;
                x340 x340Var18 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var18.g(gpb0Var) ? 4 : 2;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    j2iVar.invoke(gpb0Var, x340Var19, Integer.valueOf(iIntValue6 & 14));
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var20).a.b.a(), er31.a);
                gfh0 gfh0VarC3 = t1c.c(een.h, false);
                x340 x340Var21 = x340Var20;
                int iHashCode4 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM4 = x340Var21.m();
                qim0 qim0VarE4 = zr7.E(x340Var20, qim0VarF);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(gfh0VarC3, x340Var20, y580.O0);
                nko1.H(xos0VarM4, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE4, x340Var20, y580.Y);
                j2iVar.invoke(x340Var20, 0);
                x340Var22.r(true);
                return rih1Var;
            case 18:
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                gfh0 gfh0VarC4 = t1c.c(een.d, false);
                x340 x340Var24 = x340Var23;
                int iHashCode5 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM5 = x340Var24.m();
                qim0 qim0VarE5 = zr7.E(x340Var23, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var25 = x340Var23;
                if (x340Var25.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC4, x340Var23, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM5, x340Var23, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode5);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var23, lljVar3);
                nko1.F(x340Var23);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE5, x340Var23, lljVar4);
                qim0 qim0VarY2 = voo1.y(u291.f(nim0Var, 1.0f), qti1Var);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var23, 0);
                int iHashCode6 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM6 = x340Var25.m();
                qim0 qim0VarE6 = zr7.E(x340Var23, qim0VarY2);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(mbhVarA2, x340Var23, lljVar);
                nko1.H(xos0VarM6, x340Var23, lljVar2);
                i3a.l(iHashCode6, x340Var23, lljVar3, x340Var23);
                nko1.H(qim0VarE6, x340Var23, lljVar4);
                j2iVar.invoke(x340Var23, 0);
                x340Var25.r(true);
                x340Var25.r(true);
                return rih1Var;
            case 19:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    j2iVar.invoke(x340Var27, 0);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 20:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                w2g0.c(null, null, apo.r(-852817843, new ukm0(j2iVar, (vzq0) obj, (byte) 16), b0kVar2), b0kVar2, 3072, 7);
                return rih1Var;
            case 21:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 24:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 26:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ore0.a(0, j2iVar, x340Var29);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
            case 28:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var30 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= x340Var30.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    j2iVar.invoke(vzq0Var, x340Var31, Integer.valueOf(iIntValue9 & 14));
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                j2iVar.invoke((b0k) obj2, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv71(j2i j2iVar, byte b) {
        super(3);
        this.a = b;
        this.b = j2iVar;
    }
}
