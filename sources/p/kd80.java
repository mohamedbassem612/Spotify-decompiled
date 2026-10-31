package p;

import com.spotify.liveroom.livestreampagefragment.v1.proto.LiveStreamStateMessage;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class kd80 implements Update {
    /* JADX WARN: Code duplicated, block: B:100:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:103:0x020d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public final Next a(Object obj, Object obj2) {
        ArrayList arrayList;
        vkf vkfVar;
        int i;
        String strD;
        String strD2;
        d4f c4fVar;
        k3s0 i3s0Var;
        k3s0 h3s0Var;
        vkf vkfVar2;
        ugf ugfVar;
        vkf vkfVarA;
        pwd0 pwd0VarA;
        Long l;
        iud0 iud0VarN;
        xj61 xj61Var;
        long jO;
        Long lValueOf;
        rwd0 rwd0Var = (rwd0) obj;
        azd0 azd0Var = (azd0) obj2;
        List list = rwd0Var.b;
        zzd0 zzd0Var = rwd0Var.a;
        boolean z = zzd0Var.g;
        boolean z2 = zzd0Var.m;
        tle1 tle1Var = zzd0Var.k;
        wzd0 wzd0Var = zzd0Var.j;
        a0e0 a0e0Var = zzd0Var.i;
        pwd0 pwd0Var = zzd0Var.b;
        xzd0 xzd0Var = zzd0Var.a;
        if (azd0Var instanceof ryd0) {
            ryd0 ryd0Var = (ryd0) azd0Var;
            return Next.i(rwd0Var, Effects.a(new bxd0[]{new bxd0(ryd0Var.a, ryd0Var.b)}));
        }
        if (azd0Var instanceof wxd0) {
            return Next.h(rwd0Var);
        }
        if (azd0Var instanceof lyd0) {
            return Next.i(rwd0.a(rwd0Var, zzd0.a(zzd0Var, null, ((lyd0) azd0Var).a, null, false, 32639), null, 6), Effects.a(new hxd0[]{new hxd0(xzd0Var.c)}));
        }
        if (azd0Var instanceof byd0) {
            return Next.h(((byd0) azd0Var).a);
        }
        if (azd0Var.equals(ayd0.a)) {
            return Next.j();
        }
        if (azd0Var instanceof cyd0) {
            LiveStreamStateMessage liveStreamStateMessage = ((cyd0) azd0Var).a;
            iud0 iud0VarN2 = liveStreamStateMessage.n();
            iud0 iud0Var = iud0.LIVE;
            boolean z3 = iud0VarN2 == iud0Var;
            int iH = i3p1.H(liveStreamStateMessage.n());
            Long l2 = tle1Var.d;
            String str = xzd0Var.c;
            boolean z4 = liveStreamStateMessage.n() == iud0Var;
            boolean z5 = zzd0Var.h;
            boolean z6 = zzd0Var.l;
            int i2 = szd0.a[liveStreamStateMessage.n().ordinal()];
            if (i2 != 1) {
                c4fVar = (i2 == 2 && z5) ? new b4f(2) : null;
            } else if (z5) {
                c4fVar = new b4f(1);
            } else {
                c4fVar = new c4f(2, z6 ? 2 : 1);
            }
            int iH2 = i3p1.H(liveStreamStateMessage.n());
            ugf ugfVarR = iH2 != 0 ? x2p1.r(iH2) : null;
            k3s0 k3s0Var = pwd0Var.b;
            long jO2 = liveStreamStateMessage.o();
            boolean z7 = zzd0Var.e;
            if (!z4) {
                if (k3s0Var instanceof j3s0) {
                    j3s0 j3s0Var = (j3s0) k3s0Var;
                    h3s0Var = new h3s0(j3s0Var.a, j3s0Var.b, j3s0Var.d);
                } else if (k3s0Var instanceof i3s0) {
                    i3s0 i3s0Var2 = (i3s0) k3s0Var;
                    h3s0Var = new h3s0(i3s0Var2.a, i3s0Var2.b, i3s0Var2.e);
                } else {
                    if (!(k3s0Var instanceof h3s0)) {
                        eg.o();
                        return null;
                    }
                    i3s0Var = (h3s0) k3s0Var;
                }
                vkfVar2 = pwd0Var.d;
                if (c4fVar == null && vkfVar2 != null) {
                    if (ugfVarR == null) {
                        ugfVar = vkfVar2.b;
                    } else {
                        ugfVar = ugfVarR;
                    }
                    vkfVarA = vkf.a(vkfVar2, ugfVar, z5, c4fVar, 1);
                } else {
                    vkfVarA = null;
                }
                pwd0VarA = pwd0.a(pwd0Var, h3s0Var, vkfVarA, 5);
                boolean z8 = zzd0Var.f;
                if (ugfVarR == null) {
                    ugfVarR = ugf.b;
                }
                if (c4fVar != null && z8 && pwd0VarA.d == null) {
                    pwd0VarA = pwd0.a(pwd0VarA, null, new vkf(str, ugfVarR, z5, c4fVar), 7);
                }
                if (iH == 0) {
                    iH = tle1Var.a;
                }
                int i3 = iH;
                if (z3) {
                    jO = liveStreamStateMessage.o();
                    lValueOf = Long.valueOf(jO);
                    if (jO <= 0) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        l = l2;
                    } else {
                        l = lValueOf;
                    }
                } else {
                    l = l2;
                }
                zzd0 zzd0VarA = zzd0.a(zzd0Var, pwd0VarA, false, new tle1(i3, tle1Var.b, tle1Var.c, l, tle1Var.e, tle1Var.f), false, 31741);
                iud0VarN = liveStreamStateMessage.n();
                xj61Var = new xj61();
                xj61Var.add(new vwd0(str));
                if (iud0VarN == iud0.ENDED) {
                    xj61Var.add(wwd0.a);
                    if (rwd0Var.c && list == null && tle1Var.a != 3) {
                        xj61Var.add(xwd0.a);
                    }
                }
                return Next.i(rwd0.a(rwd0Var, zzd0VarA, null, 6), cwl1.j(xj61Var));
            }
            if (k3s0Var instanceof j3s0) {
                j3s0 j3s0Var2 = (j3s0) k3s0Var;
                i3s0Var = new i3s0(j3s0Var2.a, j3s0Var2.b, jO2, true, j3s0Var2.d, z7, z6);
            } else if (k3s0Var instanceof i3s0) {
                i3s0Var = i3s0.a((i3s0) k3s0Var, jO2, true, z7, z6, 19);
            } else {
                if (!(k3s0Var instanceof h3s0)) {
                    eg.o();
                    return null;
                }
                h3s0 h3s0Var2 = (h3s0) k3s0Var;
                i3s0Var = new i3s0(h3s0Var2.a, h3s0Var2.b, jO2, true, h3s0Var2.c, z7, z6);
            }
            h3s0Var = i3s0Var;
            vkfVar2 = pwd0Var.d;
            if (c4fVar == null) {
                vkfVarA = null;
            } else {
                if (ugfVarR == null) {
                    ugfVar = vkfVar2.b;
                } else {
                    ugfVar = ugfVarR;
                }
                vkfVarA = vkf.a(vkfVar2, ugfVar, z5, c4fVar, 1);
            }
            pwd0VarA = pwd0.a(pwd0Var, h3s0Var, vkfVarA, 5);
            boolean z9 = zzd0Var.f;
            if (ugfVarR == null) {
                ugfVarR = ugf.b;
            }
            if (c4fVar != null) {
                pwd0VarA = pwd0.a(pwd0VarA, null, new vkf(str, ugfVarR, z5, c4fVar), 7);
            }
            if (iH == 0) {
                iH = tle1Var.a;
            }
            int i4 = iH;
            if (z3) {
                jO = liveStreamStateMessage.o();
                lValueOf = Long.valueOf(jO);
                if (jO <= 0) {
                    lValueOf = null;
                }
                if (lValueOf == null) {
                    l = l2;
                } else {
                    l = lValueOf;
                }
            } else {
                l = l2;
            }
            zzd0 zzd0VarA2 = zzd0.a(zzd0Var, pwd0VarA, false, new tle1(i4, tle1Var.b, tle1Var.c, l, tle1Var.e, tle1Var.f), false, 31741);
            iud0VarN = liveStreamStateMessage.n();
            xj61Var = new xj61();
            xj61Var.add(new vwd0(str));
            if (iud0VarN == iud0.ENDED) {
                xj61Var.add(wwd0.a);
                if (rwd0Var.c) {
                    xj61Var.add(xwd0.a);
                }
            }
            return Next.i(rwd0.a(rwd0Var, zzd0VarA2, null, 6), cwl1.j(xj61Var));
        }
        if (azd0Var instanceof uyd0) {
            return Next.j();
        }
        if (azd0Var instanceof tyd0) {
            return Next.j();
        }
        if (azd0Var.equals(xxd0.a)) {
            return Next.j();
        }
        if (azd0Var.equals(hyd0.a)) {
            return Next.j();
        }
        if (azd0Var instanceof yxd0) {
            yxd0 yxd0Var = (yxd0) azd0Var;
            return Next.a(Collections.singleton(new axd0(yxd0Var.a, yxd0Var.b)));
        }
        if (azd0Var instanceof jyd0) {
            jyd0 jyd0Var = (jyd0) azd0Var;
            return Next.a(Collections.singleton(new axd0(jyd0Var.a, jyd0Var.b)));
        }
        if (azd0Var instanceof dyd0) {
            dyd0 dyd0Var = (dyd0) azd0Var;
            if (!dyd0Var.b) {
                return Next.a(Collections.singleton(new oxd0(a0e0Var, null, 1)));
            }
            tv80 tv80Var = dyd0Var.c;
            if (tv80Var != null) {
                return Next.a(Collections.singleton(new zwd0(tv80Var)));
            }
            eg.m("Required value was null.");
            return null;
        }
        if (azd0Var instanceof gyd0) {
            gyd0 gyd0Var = (gyd0) azd0Var;
            boolean z10 = gyd0Var.a;
            if (!z10 && z2) {
                return Next.a(Collections.singleton(cxd0.a));
            }
            if (!z10) {
                return Next.j();
            }
            if (!z) {
                return Next.j();
            }
            String str2 = gyd0Var.c;
            if (str2 != null) {
                return Next.a(Collections.singleton(zzd0Var.d ? new jxd0(ovd0.a) : new dxd0(gyd0Var.b, str2)));
            }
            return Next.j();
        }
        if (azd0Var instanceof iyd0) {
            iyd0 iyd0Var = (iyd0) azd0Var;
            k3s0 k3s0Var2 = pwd0Var.b;
            if (!z2 || !(k3s0Var2 instanceof i3s0)) {
                return Next.j();
            }
            i3s0 i3s0Var3 = (i3s0) k3s0Var2;
            boolean z11 = !((!iyd0Var.b || (strD = p1p1.D(iyd0Var.a)) == null || (strD2 = p1p1.D(i3s0Var3.b)) == null) ? false : strD.equals(strD2));
            return i3s0Var3.d == z11 ? Next.j() : Next.h(rwd0.a(rwd0Var, zzd0.a(zzd0Var, pwd0.a(pwd0Var, i3s0.a(i3s0Var3, 0L, z11, false, false, 119), null, 13), false, null, false, 32765), null, 6));
        }
        if (azd0Var.equals(vxd0.a)) {
            return Next.a(Collections.singleton(ywd0.a));
        }
        if (azd0Var.equals(nyd0.a)) {
            return Next.i(rwd0.a(rwd0Var, vhc.d(zzd0Var, 4, Boolean.FALSE), null, 6), Effects.a(new lxd0[]{new lxd0(xzd0Var.c, wzd0Var)}));
        }
        if (azd0Var.equals(myd0.a)) {
            return Next.i(rwd0.a(rwd0Var, vhc.d(zzd0Var, 0, Boolean.FALSE), null, 6), Effects.a(new jxd0[]{new jxd0(vvd0.a)}));
        }
        if (azd0Var instanceof syd0) {
            return Next.a(Collections.singleton(new ixd0(((syd0) azd0Var).a, 0)));
        }
        if (azd0Var instanceof qyd0) {
            return Next.j();
        }
        if (azd0Var instanceof fyd0) {
            fyd0 fyd0Var = (fyd0) azd0Var;
            boolean z12 = zzd0Var.l;
            boolean z13 = fyd0Var.a;
            if (z12 == z13) {
                return Next.j();
            }
            k3s0 k3s0VarA = pwd0Var.b;
            if (k3s0VarA instanceof i3s0) {
                k3s0VarA = i3s0.a((i3s0) k3s0VarA, 0L, false, false, z13, 63);
            } else if (!(k3s0VarA instanceof j3s0) && !(k3s0VarA instanceof h3s0)) {
                eg.o();
                return null;
            }
            vkf vkfVarA2 = pwd0Var.d;
            if (vkfVarA2 != null) {
                boolean z14 = fyd0Var.a;
                d4f d4fVar = vkfVarA2.d;
                if ((d4fVar instanceof c4f) && (i = ((c4f) d4fVar).a) == 2) {
                    arrayList = null;
                    vkfVarA2 = vkf.a(vkfVarA2, null, false, new c4f(i, z14 ? 2 : 1), 7);
                } else {
                    arrayList = null;
                }
                vkfVar = vkfVarA2;
            } else {
                arrayList = null;
                vkfVar = null;
            }
            return Next.h(rwd0.a(rwd0Var, zzd0.a(zzd0Var, pwd0.a(pwd0Var, k3s0VarA, vkfVar, 5), false, null, fyd0Var.a, 30717), arrayList, 6));
        }
        if (azd0Var instanceof zxd0) {
            return Next.a(Collections.singleton(new ixd0(((zxd0) azd0Var).a, 0)));
        }
        if (azd0Var instanceof eyd0) {
            eyd0 eyd0Var = (eyd0) azd0Var;
            boolean z15 = eyd0Var.a;
            tv80 tv80Var2 = eyd0Var.d;
            if (z15) {
                return Next.a(Collections.singleton(new oxd0(a0e0Var, tv80Var2, 2)));
            }
            boolean z16 = eyd0Var.c;
            String str3 = eyd0Var.b;
            return z16 ? Next.a(f46.S0(new rxd0[]{new fxd0(str3), new oxd0(a0e0Var, tv80Var2, 3)})) : Next.a(Collections.singleton(new fxd0(str3)));
        }
        if (azd0Var.equals(pyd0.a)) {
            k3s0 k3s0Var3 = pwd0Var.b;
            j3s0 j3s0Var3 = k3s0Var3 instanceof j3s0 ? (j3s0) k3s0Var3 : null;
            return Next.i(rwd0.a(rwd0Var, vhc.d(zzd0Var, 7, (Boolean) null), null, 6), (j3s0Var3 != null ? j3s0Var3.e : 0) == 8 ? w7x.a : Collections.singleton(new kxd0(xzd0Var.c, wzd0Var)));
        }
        if (azd0Var.equals(oyd0.a)) {
            return Next.a(Collections.singleton(new jxd0(pvd0.a)));
        }
        if (azd0Var instanceof uxd0) {
            return Next.a(Collections.singleton(new uwd0(xzd0Var.c, wzd0Var)));
        }
        if (azd0Var.equals(kyd0.a)) {
            return !z ? Next.j() : Next.i(rwd0.a(rwd0Var, zzd0.a(zzd0Var, null, false, null, false, 32703), null, 6), Effects.a(new vwd0[]{new vwd0(xzd0Var.c)}));
        }
        if (azd0Var instanceof vyd0) {
            ArrayList arrayList2 = ((vyd0) azd0Var).a;
            return arrayList2.isEmpty() ? Next.j() : Next.h(rwd0.a(rwd0Var, null, arrayList2, 5));
        }
        if (azd0Var instanceof wyd0) {
            wyd0 wyd0Var = (wyd0) azd0Var;
            return Next.a(Collections.singleton(new axd0(wyd0Var.a, wyd0Var.b)));
        }
        if (azd0Var instanceof xyd0) {
            xyd0 xyd0Var = (xyd0) azd0Var;
            return xyd0Var.b ? Next.a(Collections.singleton(new oxd0(a0e0Var, xyd0Var.c, 2))) : Next.a(Collections.singleton(new gxd0(xyd0Var.a)));
        }
        if (!(azd0Var instanceof zyd0)) {
            if (azd0Var instanceof yyd0) {
                return Next.a(Collections.singleton(new mxd0(xzd0Var.c)));
            }
            eg.o();
            return null;
        }
        zyd0 zyd0Var = (zyd0) azd0Var;
        if (list == null) {
            return Next.j();
        }
        List<zmh1> list2 = list;
        ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
        for (zmh1 zmh1Var : list2) {
            if (zmh1Var.a.equals(zyd0Var.a)) {
                zmh1Var = new zmh1(zmh1Var.a, zmh1Var.b, zmh1Var.c, zmh1Var.d, zmh1Var.e, true);
            }
            arrayList3.add(zmh1Var);
        }
        return Next.i(rwd0.a(rwd0Var, null, arrayList3, 5), Effects.a(new nxd0[]{nxd0.a}));
    }
}
