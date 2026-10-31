package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qf41 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ byte b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qf41(int i, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, efn0 efn0Var, vu30 vu30Var3, j2i j2iVar2, bg41 bg41Var) {
        this.b = i;
        this.c = vu30Var;
        this.f = j2iVar;
        this.d = vu30Var2;
        this.g = efn0Var;
        this.e = vu30Var3;
        this.h = j2iVar2;
        this.i = bg41Var;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x025e  */
    public final Object invoke(Object obj, Object obj2) {
        int iI0;
        int iI1;
        int i;
        f3a f3aVar;
        final Integer numValueOf;
        int i2;
        int iIntValue;
        int iI2;
        int iD;
        Object obj3;
        final ArrayList arrayList;
        Object obj4;
        f3a f3aVar2;
        Object obj5;
        Integer numValueOf2;
        int iIntValue2;
        Object obj6;
        Object obj7;
        int i3;
        int iI3;
        int iI4;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        flb0 flb0Var = flb0.a;
        vu30 vu30Var = this.e;
        byte b2 = this.b;
        vu30 vu30Var2 = this.d;
        vu30 vu30Var3 = this.c;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.f;
        Object obj11 = this.g;
        switch (b) {
            case 0:
                final erl1 erl1Var = (erl1) obj10;
                vu30 vu30Var4 = (vu30) obj11;
                wf41 wf41Var = (wf41) obj8;
                vu30 vu30Var5 = (vu30) obj9;
                final tlc1 tlc1Var = (tlc1) obj;
                hjl hjlVar = (hjl) obj2;
                final int i4 = hjl.i(hjlVar.a);
                final int iH = hjl.h(hjlVar.a);
                long jB = hjl.b(hjlVar.a, 0, 0, 0, 0, 10);
                int iB = erl1Var.b(tlc1Var, tlc1Var.getLayoutDirection());
                int iA = erl1Var.a(tlc1Var, tlc1Var.getLayoutDirection());
                int iD2 = erl1Var.d(tlc1Var);
                final q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(zf41.a, vu30Var3))).H(jB);
                int i5 = (-iB) - iA;
                int i6 = -iD2;
                final q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P(zf41.c, vu30Var2))).H(jjl.i(i5, jB, i6));
                final q5t0 q5t0VarH3 = ((afh0) o7h.q0(tlc1Var.P(zf41.d, vu30Var))).H(jjl.i(i5, jB, i6));
                int i7 = q5t0VarH3.a;
                if (i7 == 0 && q5t0VarH3.b == 0) {
                    f3aVar = null;
                } else {
                    int i8 = q5t0VarH3.b;
                    if (b2 == 0) {
                        if (tlc1Var.getLayoutDirection() == flb0Var) {
                            iI0 = tlc1Var.i0(16.0f);
                            i = iI0 + iB;
                        } else {
                            iI1 = tlc1Var.i0(16.0f);
                            i = ((i4 - iI1) - i7) - iA;
                        }
                    } else if (b2 != 2 && b2 != 3) {
                        i = (((i4 - i7) + iB) - iA) / 2;
                    } else if (tlc1Var.getLayoutDirection() == flb0Var) {
                        iI1 = tlc1Var.i0(16.0f);
                        i = ((i4 - iI1) - i7) - iA;
                    } else {
                        iI0 = tlc1Var.i0(16.0f);
                        i = iI0 + iB;
                    }
                    f3aVar = new f3a(i, i8);
                }
                final q5t0 q5t0VarH4 = ((afh0) o7h.q0(tlc1Var.P(zf41.e, vu30Var4))).H(jB);
                boolean z = q5t0VarH4.a == 0 && q5t0VarH4.b == 0;
                if (f3aVar != null) {
                    int i9 = f3aVar.b;
                    if (z || b2 == 3) {
                        iI2 = tlc1Var.i0(16.0f) + i9;
                        iD = erl1Var.d(tlc1Var);
                    } else {
                        iI2 = q5t0VarH4.b + i9;
                        iD = tlc1Var.i0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iD + iI2);
                } else {
                    numValueOf = null;
                }
                int i10 = q5t0VarH2.b;
                if (i10 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf3 = !z ? Integer.valueOf(q5t0VarH4.b) : null;
                        iIntValue = numValueOf3 != null ? numValueOf3.intValue() : erl1Var.d(tlc1Var);
                    }
                    i2 = i10 + iIntValue;
                } else {
                    i2 = 0;
                }
                vk80 vk80Var = new vk80(erl1Var, tlc1Var);
                wf41Var.b.setValue(new zzq0(uyn1.n(vk80Var, tlc1Var.getLayoutDirection()), (q5t0VarH.a == 0 && q5t0VarH.b == 0) ? vk80Var.d() : tlc1Var.M0(q5t0VarH.b), uyn1.m(vk80Var, tlc1Var.getLayoutDirection()), z ? vk80Var.a() : tlc1Var.M0(q5t0VarH4.b)));
                final q5t0 q5t0VarH5 = ((afh0) o7h.q0(tlc1Var.P(zf41.b, vu30Var5))).H(jB);
                final f3a f3aVar3 = f3aVar;
                final int i11 = i2;
                return tlc1Var.S(i4, iH, b7xVar, new iu30() { // from class: p.uf41
                    public final Object invoke(Object obj12) {
                        p5t0 p5t0Var = (p5t0) obj12;
                        p5t0.g(0, 0, p5t0Var, q5t0VarH5);
                        p5t0Var.f(q5t0VarH, 0, 0, 0.0f);
                        q5t0 q5t0Var = q5t0VarH2;
                        int i12 = i4 - q5t0Var.a;
                        tlc1 tlc1Var2 = tlc1Var;
                        flb0 layoutDirection = tlc1Var2.getLayoutDirection();
                        erl1 erl1Var2 = erl1Var;
                        int iB2 = ((erl1Var2.b(tlc1Var2, layoutDirection) + i12) - erl1Var2.a(tlc1Var2, tlc1Var2.getLayoutDirection())) / 2;
                        int i13 = iH;
                        p5t0Var.f(q5t0Var, iB2, i13 - i11, 0.0f);
                        q5t0 q5t0Var2 = q5t0VarH4;
                        p5t0Var.f(q5t0Var2, 0, i13 - q5t0Var2.b, 0.0f);
                        f3a f3aVar4 = f3aVar3;
                        if (f3aVar4 != null) {
                            int i14 = f3aVar4.a;
                            Integer num = numValueOf;
                            num.getClass();
                            p5t0Var.f(q5t0VarH3, i14, i13 - num.intValue(), 0.0f);
                        }
                        return rih1.a;
                    }
                });
            case 1:
                j2i j2iVar = (j2i) obj10;
                efn0 efn0Var = (efn0) obj11;
                j2i j2iVar2 = (j2i) obj9;
                bg41 bg41Var = (bg41) obj8;
                x340 x340Var = (b0k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    yf41.c(this.b, this.c, j2iVar, apo.r(545329543, new f14(j2iVar2, bg41Var, (byte) 26), x340Var2), this.d, efn0Var, this.e, x340Var2, 24576);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            default:
                j2i j2iVar3 = (j2i) obj11;
                erl1 erl1Var2 = (erl1) obj10;
                xf41 xf41Var = (xf41) obj9;
                j2i j2iVar4 = (j2i) obj8;
                tlc1 tlc1Var2 = (tlc1) obj;
                hjl hjlVar2 = (hjl) obj2;
                float f = yf41.b;
                int i12 = hjl.i(hjlVar2.a);
                final int iH2 = hjl.h(hjlVar2.a);
                long jB2 = hjl.b(hjlVar2.a, 0, 0, 0, 0, 10);
                List listP = tlc1Var2.P(ag41.a, vu30Var3);
                ArrayList arrayList2 = new ArrayList(listP.size());
                int size = listP.size();
                int i13 = 0;
                while (i13 < size) {
                    arrayList2.add(((afh0) listP.get(i13)).H(jB2));
                    i13++;
                    listP = listP;
                }
                if (arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i14 = ((q5t0) obj3).b;
                    int iL = p7h.L(arrayList2);
                    if (1 <= iL) {
                        Object obj12 = obj3;
                        int i15 = i14;
                        int i16 = 1;
                        while (true) {
                            Object obj13 = arrayList2.get(i16);
                            arrayList = arrayList2;
                            int i17 = ((q5t0) obj13).b;
                            if (i15 < i17) {
                                i15 = i17;
                            } else {
                                obj13 = obj12;
                            }
                            if (i16 != iL) {
                                i16++;
                                obj12 = obj13;
                                arrayList2 = arrayList;
                            } else {
                                obj3 = obj13;
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                }
                q5t0 q5t0Var = (q5t0) obj3;
                final int i18 = q5t0Var != null ? q5t0Var.b : 0;
                List listP2 = tlc1Var2.P(ag41.c, j2iVar3);
                final ArrayList arrayList3 = new ArrayList(listP2.size());
                int size2 = listP2.size();
                int i19 = 0;
                while (i19 < size2) {
                    arrayList3.add(((afh0) listP2.get(i19)).H(jjl.i((-erl1Var2.b(tlc1Var2, tlc1Var2.getLayoutDirection())) - erl1Var2.a(tlc1Var2, tlc1Var2.getLayoutDirection()), jB2, -erl1Var2.d(tlc1Var2))));
                    i19++;
                    listP2 = listP2;
                    size2 = size2;
                    b7xVar = b7xVar;
                }
                b7x b7xVar2 = b7xVar;
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int i20 = ((q5t0) obj4).b;
                    int iL2 = p7h.L(arrayList3);
                    if (1 <= iL2) {
                        int i21 = 1;
                        while (true) {
                            Object obj14 = arrayList3.get(i21);
                            Object obj15 = obj4;
                            int i22 = ((q5t0) obj14).b;
                            if (i20 < i22) {
                                i20 = i22;
                                obj4 = obj14;
                            } else {
                                obj4 = obj15;
                            }
                            if (i21 != iL2) {
                                i21++;
                            }
                        }
                    }
                }
                q5t0 q5t0Var2 = (q5t0) obj4;
                int i23 = q5t0Var2 != null ? q5t0Var2.b : 0;
                List listP3 = tlc1Var2.P(ag41.d, vu30Var2);
                final ArrayList arrayList4 = new ArrayList(listP3.size());
                int size3 = listP3.size();
                int i24 = 0;
                while (i24 < size3) {
                    arrayList4.add(((afh0) listP3.get(i24)).H(jjl.i((-erl1Var2.b(tlc1Var2, tlc1Var2.getLayoutDirection())) - erl1Var2.a(tlc1Var2, tlc1Var2.getLayoutDirection()), jB2, -erl1Var2.d(tlc1Var2))));
                    i24++;
                    i23 = i23;
                    listP3 = listP3;
                }
                int i25 = i23;
                if (arrayList4.isEmpty()) {
                    f3aVar2 = null;
                } else {
                    if (arrayList4.isEmpty()) {
                        obj6 = null;
                    } else {
                        obj6 = arrayList4.get(0);
                        int i26 = ((q5t0) obj6).a;
                        int iL3 = p7h.L(arrayList4);
                        if (1 <= iL3) {
                            int i27 = 1;
                            while (true) {
                                Object obj16 = arrayList4.get(i27);
                                Object obj17 = obj6;
                                int i28 = ((q5t0) obj16).a;
                                if (i26 < i28) {
                                    i26 = i28;
                                    obj6 = obj16;
                                } else {
                                    obj6 = obj17;
                                }
                                if (i27 != iL3) {
                                    i27++;
                                }
                            }
                        }
                    }
                    q5t0 q5t0Var3 = (q5t0) obj6;
                    int i29 = q5t0Var3 != null ? q5t0Var3.a : 0;
                    if (arrayList4.isEmpty()) {
                        i3 = i29;
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i30 = ((q5t0) obj7).b;
                        int iL4 = p7h.L(arrayList4);
                        if (1 <= iL4) {
                            int i31 = 1;
                            while (true) {
                                Object obj18 = arrayList4.get(i31);
                                i3 = i29;
                                int i32 = ((q5t0) obj18).b;
                                if (i30 < i32) {
                                    i30 = i32;
                                    obj7 = obj18;
                                }
                                if (i31 != iL4) {
                                    i31++;
                                    i29 = i3;
                                }
                            }
                        } else {
                            i3 = i29;
                        }
                    }
                    q5t0 q5t0Var4 = (q5t0) obj7;
                    int i33 = q5t0Var4 != null ? q5t0Var4.b : 0;
                    if (i3 == 0 || i33 == 0) {
                        f3aVar2 = null;
                    } else {
                        if (b2 == 0) {
                            if (tlc1Var2.getLayoutDirection() == flb0Var) {
                                iI3 = tlc1Var2.i0(f);
                            } else {
                                iI4 = tlc1Var2.i0(f);
                                iI3 = (i12 - iI4) - i3;
                            }
                        } else if (b2 != 2) {
                            iI3 = (i12 - i3) / 2;
                        } else if (tlc1Var2.getLayoutDirection() == flb0Var) {
                            iI4 = tlc1Var2.i0(f);
                            iI3 = (i12 - iI4) - i3;
                        } else {
                            iI3 = tlc1Var2.i0(f);
                        }
                        f3aVar2 = new f3a(iI3, i33);
                    }
                }
                List listP4 = tlc1Var2.P(ag41.e, new j2i(-502652347, new f14(f3aVar2, vu30Var, (byte) 27), true));
                final ArrayList arrayList5 = new ArrayList(listP4.size());
                int size4 = listP4.size();
                for (int i34 = 0; i34 < size4; i34++) {
                    arrayList5.add(((afh0) listP4.get(i34)).H(jB2));
                }
                if (arrayList5.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList5.get(0);
                    int i35 = ((q5t0) obj5).b;
                    int iL5 = p7h.L(arrayList5);
                    if (1 <= iL5) {
                        int i36 = 1;
                        while (true) {
                            Object obj19 = arrayList5.get(i36);
                            int i37 = ((q5t0) obj19).b;
                            if (i35 < i37) {
                                i35 = i37;
                                obj5 = obj19;
                            }
                            if (i36 != iL5) {
                                i36++;
                            }
                        }
                    }
                }
                q5t0 q5t0Var5 = (q5t0) obj5;
                Integer numValueOf4 = q5t0Var5 != null ? Integer.valueOf(q5t0Var5.b) : null;
                if (f3aVar2 != null) {
                    int i38 = f3aVar2.b;
                    numValueOf2 = Integer.valueOf(numValueOf4 == null ? erl1Var2.d(tlc1Var2) + tlc1Var2.i0(f) + i38 : tlc1Var2.i0(f) + numValueOf4.intValue() + i38);
                } else {
                    numValueOf2 = null;
                }
                if (i25 != 0) {
                    iIntValue2 = i25 + (numValueOf2 != null ? numValueOf2.intValue() : numValueOf4 != null ? numValueOf4.intValue() : erl1Var2.d(tlc1Var2));
                } else {
                    iIntValue2 = 0;
                }
                vk80 vk80Var2 = new vk80(erl1Var2, tlc1Var2);
                xf41Var.b.setValue(new zzq0(uyn1.n(vk80Var2, tlc1Var2.getLayoutDirection()), arrayList.isEmpty() ? vk80Var2.d() : 0.0f, uyn1.m(vk80Var2, tlc1Var2.getLayoutDirection()), (arrayList5.isEmpty() || numValueOf4 == null) ? vk80Var2.a() : tlc1Var2.M0(numValueOf4.intValue())));
                int i39 = iH2 - i18;
                List listP5 = tlc1Var2.P(ag41.b, new j2i(-574531306, new f14(j2iVar4, xf41Var, (byte) 25), true));
                final ArrayList arrayList6 = new ArrayList(listP5.size());
                int size5 = listP5.size();
                int i40 = 0;
                while (i40 < size5) {
                    long j = jB2;
                    arrayList6.add(((afh0) listP5.get(i40)).H(hjl.b(j, 0, 0, 0, i39, 7)));
                    i40++;
                    jB2 = j;
                }
                final Integer num = numValueOf4;
                final Integer num2 = numValueOf2;
                final f3a f3aVar4 = f3aVar2;
                final int i41 = iIntValue2;
                return tlc1Var2.S(i12, iH2, b7xVar2, new iu30() { // from class: p.nf41
                    public final Object invoke(Object obj20) {
                        int i42;
                        p5t0 p5t0Var = (p5t0) obj20;
                        ArrayList arrayList7 = arrayList6;
                        int size6 = arrayList7.size();
                        for (int i43 = 0; i43 < size6; i43++) {
                            p5t0.g(0, i18, p5t0Var, (q5t0) arrayList7.get(i43));
                        }
                        ArrayList arrayList8 = arrayList;
                        int size7 = arrayList8.size();
                        for (int i44 = 0; i44 < size7; i44++) {
                            p5t0.g(0, 0, p5t0Var, (q5t0) arrayList8.get(i44));
                        }
                        ArrayList arrayList9 = arrayList3;
                        int size8 = arrayList9.size();
                        int i45 = 0;
                        while (true) {
                            i42 = iH2;
                            if (i45 >= size8) {
                                break;
                            }
                            p5t0.g(0, i42 - i41, p5t0Var, (q5t0) arrayList9.get(i45));
                            i45++;
                        }
                        ArrayList arrayList10 = arrayList5;
                        int size9 = arrayList10.size();
                        for (int i46 = 0; i46 < size9; i46++) {
                            q5t0 q5t0Var6 = (q5t0) arrayList10.get(i46);
                            Integer num3 = num;
                            p5t0.g(0, i42 - (num3 != null ? num3.intValue() : 0), p5t0Var, q5t0Var6);
                        }
                        ArrayList arrayList11 = arrayList4;
                        int size10 = arrayList11.size();
                        for (int i47 = 0; i47 < size10; i47++) {
                            q5t0 q5t0Var7 = (q5t0) arrayList11.get(i47);
                            f3a f3aVar5 = f3aVar4;
                            int i48 = f3aVar5 != null ? f3aVar5.a : 0;
                            Integer num4 = num2;
                            p5t0.g(i48, i42 - (num4 != null ? num4.intValue() : 0), p5t0Var, q5t0Var7);
                        }
                        return rih1.a;
                    }
                });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qf41(vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, int i, erl1 erl1Var, xf41 xf41Var, vu30 vu30Var3, j2i j2iVar2) {
        this.c = vu30Var;
        this.g = j2iVar;
        this.d = vu30Var2;
        this.b = i;
        this.f = erl1Var;
        this.h = xf41Var;
        this.e = vu30Var3;
        this.i = j2iVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qf41(erl1 erl1Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, int i, vu30 vu30Var4, wf41 wf41Var, vu30 vu30Var5) {
        this.f = erl1Var;
        this.c = vu30Var;
        this.d = vu30Var2;
        this.e = vu30Var3;
        this.b = i;
        this.g = vu30Var4;
        this.i = wf41Var;
        this.h = vu30Var5;
    }
}
