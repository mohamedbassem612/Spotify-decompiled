package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vw51 {
    public static final PlaylistRequestDecorationPolicy g;
    public static final PlaylistRequestDecorationPolicy h;
    public static final PlaylistRequestDecorationPolicy i;
    public final xrc0 a;
    public final z6k0 b;
    public final kkg1 c;
    public final rxj0 d;
    public final mnk0 e;
    public final hp91 f;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        g = hru0VarS.build();
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP2 = PlaylistDecorationPolicy.p();
        sku0VarP2.G();
        hru0VarS2.x(sku0VarP2);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.A();
        iou0VarV.D(true);
        hru0VarS2.v(iou0VarV);
        h = hru0VarS2.build();
        hru0 hru0VarS3 = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV2 = PlaylistItemDecorationPolicy.v();
        iou0VarV2.A();
        iou0VarV2.D(true);
        iou0VarV2.v();
        hru0VarS3.v(iou0VarV2);
        i = hru0VarS3.build();
    }

    public vw51(xrc0 xrc0Var, z6k0 z6k0Var, kkg1 kkg1Var, rxj0 rxj0Var, mnk0 mnk0Var, hp91 hp91Var) {
        this.a = xrc0Var;
        this.b = z6k0Var;
        this.c = kkg1Var;
        this.d = rxj0Var;
        this.e = mnk0Var;
        this.f = hp91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, List list, onm onmVar) {
        nw51 nw51Var;
        if (onmVar instanceof nw51) {
            nw51Var = (nw51) onmVar;
            int i2 = nw51Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nw51Var.d = i2 - Integer.MIN_VALUE;
            } else {
                nw51Var = new nw51(this, onmVar);
            }
        } else {
            nw51Var = new nw51(this, onmVar);
        }
        Object obj = nw51Var.b;
        int i3 = nw51Var.d;
        if (i3 != 0) {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LinkedHashMap linkedHashMap = nw51Var.a;
            hm5.M(obj);
            return linkedHashMap;
        }
        hm5.M(obj);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        mr20 mr20VarB = hu20.b(8, new huz(list, (byte) 8), new i3y0(this, str, (lnm) null, (byte) 21));
        ytw0 ytw0Var = jfv.b;
        lt20 lt20Var = new lt20(r4p1.w(mr20VarB, fdg1.l0(5000L, ngv.d)), new dwf0(this, str, (lnm) null, (byte) 20), (byte) 0);
        j0z0 j0z0Var = new j0z0(linkedHashMap2, (byte) 18);
        nw51Var.a = linkedHashMap2;
        nw51Var.d = 1;
        Object objCollect = lt20Var.collect(j0z0Var, nw51Var);
        d9n d9nVar = d9n.a;
        return objCollect == d9nVar ? d9nVar : linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[Catch: all -> 0x004a, CancellationException -> 0x015e, TryCatch #2 {CancellationException -> 0x015e, all -> 0x004a, blocks: (B:14:0x003f, B:53:0x0127, B:55:0x012b, B:57:0x0133, B:60:0x0143, B:22:0x0061, B:47:0x00f6, B:49:0x00fa, B:25:0x0076, B:38:0x00c2, B:40:0x00c6, B:43:0x00cf, B:34:0x009a), top: B:71:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(String str, List list, List list2, onm onmVar) {
        ow51 ow51Var;
        mw51 m231Var;
        Throwable thA;
        List list3;
        List list4;
        String str2;
        int i2;
        boolean zBooleanValue;
        vw51 vw51Var;
        int i3;
        Boolean bool;
        boolean zBooleanValue2;
        Object objC;
        boolean z;
        List list5;
        String str3;
        py21 py21Var;
        wsc0 wsc0Var;
        vw51 vw51Var2 = this;
        if (onmVar instanceof ow51) {
            ow51Var = (ow51) onmVar;
            int i4 = ow51Var.i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ow51Var.i = i4 - Integer.MIN_VALUE;
            } else {
                ow51Var = new ow51(vw51Var2, onmVar);
            }
        } else {
            ow51Var = new ow51(vw51Var2, onmVar);
        }
        Object objC2 = ow51Var.g;
        int i5 = ow51Var.i;
        d9n d9nVar = d9n.a;
        try {
            if (i5 == 0) {
                hm5.M(objC2);
                if (!vw51Var2.d.F || list.isEmpty() || list2.size() != list.size()) {
                    return null;
                }
                pw51 pw51Var = new pw51(vw51Var2, null, (byte) 0);
                ow51Var.a = str;
                ow51Var.b = list;
                ow51Var.c = list2;
                ow51Var.d = vw51Var2;
                ow51Var.e = 0;
                ow51Var.i = 1;
                objC2 = vw51Var2.c(str, "mixing permission", ow51Var, pw51Var);
                if (objC2 != d9nVar) {
                    list3 = list;
                    list4 = list2;
                    str2 = str;
                    i2 = 0;
                }
                return d9nVar;
            }
            if (i5 == 1) {
                int i6 = ow51Var.e;
                vw51 vw51Var3 = ow51Var.d;
                list4 = ow51Var.c;
                list3 = ow51Var.b;
                str2 = ow51Var.a;
                hm5.M(objC2);
                i2 = i6;
                vw51Var2 = vw51Var3;
            } else {
                if (i5 == 2) {
                    i3 = ow51Var.e;
                    vw51Var = ow51Var.d;
                    list4 = ow51Var.c;
                    List list6 = ow51Var.b;
                    String str4 = ow51Var.a;
                    hm5.M(objC2);
                    list3 = list6;
                    str2 = str4;
                    bool = (Boolean) objC2;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        qw51 qw51Var = new qw51(vw51Var, str2, null, (byte) 0);
                        ow51Var.a = str2;
                        ow51Var.b = list3;
                        ow51Var.c = list4;
                        ow51Var.d = vw51Var;
                        ow51Var.e = i3;
                        ow51Var.f = zBooleanValue2;
                        ow51Var.i = 3;
                        objC = vw51Var.c(str2, "metadata", ow51Var, qw51Var);
                        if (objC != d9nVar) {
                            z = zBooleanValue2;
                            list5 = list3;
                            str3 = str2;
                            objC2 = objC;
                        }
                        return d9nVar;
                    }
                    m231Var = null;
                    thA = e331.a(m231Var);
                    if (thA == null) {
                        return m231Var;
                    }
                    Logger.e(thA, "Failed to resolve selected speeds and transitions", new Object[0]);
                    return null;
                }
                if (i5 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z2 = ow51Var.f;
                vw51Var = ow51Var.d;
                list4 = ow51Var.c;
                List list7 = ow51Var.b;
                String str5 = ow51Var.a;
                hm5.M(objC2);
                z = z2;
                str3 = str5;
                list5 = list7;
            }
            List list8 = list4;
            py21Var = (py21) objC2;
            if (py21Var != null || (wsc0Var = (wsc0) py21Var.c()) == null) {
                m231Var = null;
            } else {
                z6k0 z6k0Var = vw51Var.b;
                Map map = wsc0Var.f.q;
                z6k0Var.getClass();
                boolean zB = z6k0.b(map);
                if (zB) {
                    m231Var = new mw51(str3, list5, list8, z, zB);
                } else {
                    m231Var = null;
                }
            }
            thA = e331.a(m231Var);
            if (thA == null) {
                return m231Var;
            }
            Logger.e(thA, "Failed to resolve selected speeds and transitions", new Object[0]);
            return null;
            Boolean bool2 = (Boolean) objC2;
            if (bool2 != null && (zBooleanValue = bool2.booleanValue())) {
                pw51 pw51Var2 = new pw51(vw51Var2, null, (byte) 1);
                ow51Var.a = str2;
                ow51Var.b = list3;
                ow51Var.c = list4;
                ow51Var.d = vw51Var2;
                ow51Var.e = i2;
                ow51Var.f = zBooleanValue;
                ow51Var.i = 2;
                objC2 = vw51Var2.c(str2, "speed permission", ow51Var, pw51Var2);
                if (objC2 != d9nVar) {
                    int i7 = i2;
                    vw51Var = vw51Var2;
                    i3 = i7;
                    bool = (Boolean) objC2;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        qw51 qw51Var2 = new qw51(vw51Var, str2, null, (byte) 0);
                        ow51Var.a = str2;
                        ow51Var.b = list3;
                        ow51Var.c = list4;
                        ow51Var.d = vw51Var;
                        ow51Var.e = i3;
                        ow51Var.f = zBooleanValue2;
                        ow51Var.i = 3;
                        objC = vw51Var.c(str2, "metadata", ow51Var, qw51Var2);
                        if (objC != d9nVar) {
                            z = zBooleanValue2;
                            list5 = list3;
                            str3 = str2;
                            objC2 = objC;
                            List list9 = list4;
                            py21Var = (py21) objC2;
                            if (py21Var != null) {
                                m231Var = null;
                            } else {
                                m231Var = null;
                            }
                        }
                    } else {
                        m231Var = null;
                    }
                }
                return d9nVar;
            }
            m231Var = null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        Logger.e(thA, "Failed to resolve selected speeds and transitions", new Object[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, onm onmVar, iu30 iu30Var) {
        rw51 rw51Var;
        if (onmVar instanceof rw51) {
            rw51Var = (rw51) onmVar;
            int i2 = rw51Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rw51Var.c = i2 - Integer.MIN_VALUE;
            } else {
                rw51Var = new rw51(this, onmVar);
            }
        } else {
            rw51Var = new rw51(this, onmVar);
        }
        Object obj = rw51Var.a;
        int i3 = rw51Var.c;
        if (i3 != 0) {
            if (i3 == 1) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        w73 w73Var = new w73(iu30Var, (lnm) null, (byte) 16);
        rw51Var.c = 1;
        Object objO = rc2.O(5000L, w73Var, rw51Var);
        d9n d9nVar = d9n.a;
        return objO == d9nVar ? d9nVar : objO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, List list, List list2, onm onmVar) {
        sw51 sw51Var;
        if (onmVar instanceof sw51) {
            sw51Var = (sw51) onmVar;
            int i2 = sw51Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sw51Var.c = i2 - Integer.MIN_VALUE;
            } else {
                sw51Var = new sw51(this, onmVar);
            }
        } else {
            sw51Var = new sw51(this, onmVar);
        }
        Object objB = sw51Var.a;
        int i3 = sw51Var.c;
        Object obj = d9n.a;
        if (i3 == 0) {
            hm5.M(objB);
            sw51Var.c = 1;
            objB = b(str, list, list2, sw51Var);
            if (objB != obj) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        mw51 mw51Var = (mw51) objB;
        if (mw51Var == null) {
            return z6x.a;
        }
        sw51Var.c = 2;
        Object objE = e(mw51Var, sw51Var);
        return objE == obj ? obj : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(mw51 mw51Var, onm onmVar) {
        tw51 tw51Var;
        List m231Var;
        if (onmVar instanceof tw51) {
            tw51Var = (tw51) onmVar;
            int i2 = tw51Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tw51Var.c = i2 - Integer.MIN_VALUE;
            } else {
                tw51Var = new tw51(this, onmVar);
            }
        } else {
            tw51Var = new tw51(this, onmVar);
        }
        Object objF = tw51Var.a;
        int i3 = tw51Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objF);
                tw51Var.c = 1;
                objF = f(mw51Var, tw51Var);
                Object obj = d9n.a;
                if (objF == obj) {
                    return obj;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            m231Var = (List) objF;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        Logger.e(thA, "Failed to resolve selected speeds and transitions", new Object[0]);
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x030f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0362  */
    /* JADX WARN: Code duplicated, block: B:131:0x0373  */
    /* JADX WARN: Code duplicated, block: B:134:0x0382  */
    /* JADX WARN: Code duplicated, block: B:136:0x0398  */
    /* JADX WARN: Code duplicated, block: B:157:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x0294  */
    /* JADX WARN: Code duplicated, block: B:89:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r29v0, types: [p.vw51] */
    public final Serializable f(mw51 mw51Var, onm onmVar) {
        uw51 uw51Var;
        String str;
        List list;
        boolean z;
        List list2;
        wsc0 wsc0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list3;
        ArrayList arrayList3;
        List list4;
        Iterator it;
        Map map;
        ArrayList arrayList4;
        Iterator it2;
        Iterator it3;
        zuc0 zuc0Var;
        double dI;
        gw51 gw51Var;
        int iIntValue;
        zuc0 zuc0Var2;
        Map map2;
        zuc0 zuc0Var3;
        String str2;
        lhg1 lhg1VarA;
        hw51 hw51Var;
        if (onmVar instanceof uw51) {
            uw51Var = (uw51) onmVar;
            int i2 = uw51Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uw51Var.i = i2 - Integer.MIN_VALUE;
            } else {
                uw51Var = new uw51(this, onmVar);
            }
        } else {
            uw51Var = new uw51(this, onmVar);
        }
        Object objA = uw51Var.g;
        int i3 = uw51Var.i;
        ArrayList arrayList5 = z6x.a;
        String str3 = null;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objA);
            str = mw51Var.a;
            List list5 = mw51Var.b;
            list = mw51Var.c;
            z = mw51Var.d;
            qw51 qw51Var = new qw51(this, str, null, (byte) 1);
            uw51Var.a = str;
            uw51Var.b = list5;
            uw51Var.c = list;
            uw51Var.f = z;
            uw51Var.i = 1;
            Object objC = c(str, "source ordering", uw51Var, qw51Var);
            if (objC != d9nVar) {
                list2 = list5;
                objA = objC;
            }
            return d9nVar;
        }
        if (i3 == 1) {
            z = uw51Var.f;
            list = uw51Var.c;
            list2 = uw51Var.b;
            str = uw51Var.a;
            hm5.M(objA);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = uw51Var.f;
            arrayList3 = uw51Var.e;
            ArrayList arrayList6 = uw51Var.d;
            List list6 = uw51Var.c;
            list4 = uw51Var.b;
            hm5.M(objA);
            arrayList = arrayList6;
            list3 = list6;
        }
        map = (Map) objA;
        arrayList4 = new ArrayList();
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iIntValue = ((Number) it2.next()).intValue();
            zuc0Var2 = (zuc0) map.get(list3.get(iIntValue));
            if (zuc0Var2 == null) {
                hw51Var = null;
            } else {
                map2 = zuc0Var2.g;
                int i4 = iIntValue + 1;
                zuc0Var3 = (zuc0) map.get(list3.get(i4));
                if (zuc0Var3 == null && u890.j(zuc0Var2.a, list3.get(iIntValue)) && u890.j(zuc0Var3.a, list3.get(i4)) && u890.j(zuc0Var2.c, list4.get(iIntValue)) && u890.j(zuc0Var3.c, list4.get(i4)) && (str2 = (String) map2.get("automix.auto_transition_recipe")) != null) {
                    this.c.getClass();
                    lhg1VarA = kkg1.a(str2);
                    if (lhg1VarA == null) {
                        hw51Var = null;
                    } else {
                        double dI2 = jch0.I(map2);
                        double dI3 = jch0.I(zuc0Var3.g);
                        if (men1.x(lhg1VarA) || Math.abs(dI2) > Double.MAX_VALUE || dI2 <= 0.0d || Math.abs(dI3) > Double.MAX_VALUE || dI3 <= 0.0d || !(z || (dI2 == 1.0d && dI3 == 1.0d))) {
                            hw51Var = null;
                        } else if (lnn1.m(lhg1VarA, this.c, zuc0Var2.c, zuc0Var3.c, zuc0Var2.g, zuc0Var3.g)) {
                            hw51Var = new hw51(iIntValue, str2);
                        } else {
                            hw51Var = null;
                        }
                    }
                } else {
                    hw51Var = null;
                }
            }
            if (hw51Var != null) {
                arrayList4.add(hw51Var);
            }
        }
        if (z) {
            arrayList5 = new ArrayList();
            it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                zuc0Var = (zuc0) map.get(list3.get(iIntValue2));
                if (zuc0Var == null && u890.j(zuc0Var.a, list3.get(iIntValue2)) && u890.j(zuc0Var.c, list4.get(iIntValue2))) {
                    dI = jch0.I(zuc0Var.g);
                    if (Math.abs(dI) <= Double.MAX_VALUE || dI <= 0.0d || dI == 1.0d) {
                        gw51Var = null;
                    } else {
                        gw51Var = new gw51(dI, iIntValue2);
                    }
                } else {
                    gw51Var = null;
                }
                if (gw51Var != null) {
                    arrayList5.add(gw51Var);
                }
            }
        }
        return o7h.N0(arrayList5, arrayList4);
        py21 py21Var = (py21) objA;
        if (py21Var != null && (wsc0Var = (wsc0) py21Var.c()) != null) {
            List list7 = wsc0Var.e;
            Map map3 = wsc0Var.f.q;
            this.b.getClass();
            if (z6k0.b(map3)) {
                List list8 = list7;
                ArrayList arrayList7 = new ArrayList(q7h.U(list8, 10));
                int i5 = 0;
                for (Object obj : list8) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        ?? r16 = str3;
                        p7h.T();
                        throw r16;
                    }
                    arrayList7.add(new mmr0(((zuc0) obj).a, new Integer(i5)));
                    str3 = str3;
                    i5 = i6;
                }
                String str4 = str3;
                Map mapT = sqg0.T(arrayList7);
                tr80 tr80VarQ = yoi1.Q(0, p7h.L(list2));
                arrayList = new ArrayList();
                Iterator it4 = tr80VarQ.iterator();
                while (((sr80) it4).c) {
                    Object next = ((lr80) it4).next();
                    int iIntValue3 = ((Number) next).intValue();
                    Integer num = (Integer) mapT.get(list.get(iIntValue3));
                    if (num != null) {
                        int iIntValue4 = num.intValue();
                        zuc0 zuc0Var4 = (zuc0) list7.get(iIntValue4);
                        zuc0 zuc0Var5 = (zuc0) o7h.t0(iIntValue4 + 1, list7);
                        it = it4;
                        if (u890.j(zuc0Var4.c, list2.get(iIntValue3))) {
                            int i7 = iIntValue3 + 1;
                            if (u890.j(zuc0Var5 != null ? zuc0Var5.a : str4, list.get(i7)) && u890.j(zuc0Var5.c, list2.get(i7))) {
                                arrayList.add(next);
                            }
                        }
                    } else {
                        it = it4;
                    }
                    it4 = it;
                }
                tr80 tr80VarK = p7h.K(list2);
                ArrayList arrayList8 = new ArrayList();
                lr80 it5 = tr80VarK.iterator();
                while (((sr80) it5).c) {
                    Object next2 = it5.next();
                    int iIntValue5 = ((Number) next2).intValue();
                    String str5 = (String) list.get(iIntValue5);
                    Integer num2 = (Integer) mapT.get(str5);
                    if (!ihc1.y0(str5) && num2 != null && u890.j(((zuc0) list7.get(num2.intValue())).c, list2.get(iIntValue5))) {
                        arrayList8.add(next2);
                    }
                }
                if (z) {
                    arrayList2 = arrayList8;
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        int iIntValue6 = ((Number) it6.next()).intValue();
                        r7h.W(p7h.M(new Integer[]{new Integer(iIntValue6), new Integer(iIntValue6 + 1)}), arrayList9);
                    }
                    Set setP1 = o7h.p1(arrayList9);
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList8) {
                        if (setP1.contains(new Integer(((Number) obj2).intValue()))) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList10 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        arrayList10.add((String) list.get(((Number) it7.next()).intValue()));
                    }
                    List listJ0 = o7h.j0(arrayList10);
                    uw51Var.a = str4;
                    uw51Var.b = list2;
                    uw51Var.c = list;
                    uw51Var.d = arrayList;
                    uw51Var.e = arrayList8;
                    uw51Var.f = z;
                    uw51Var.i = 2;
                    objA = a(str, listJ0, uw51Var);
                    if (objA != d9nVar) {
                        list3 = list;
                        arrayList3 = arrayList8;
                        list4 = list2;
                        map = (Map) objA;
                        arrayList4 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            iIntValue = ((Number) it2.next()).intValue();
                            zuc0Var2 = (zuc0) map.get(list3.get(iIntValue));
                            if (zuc0Var2 == null) {
                                hw51Var = null;
                            } else {
                                map2 = zuc0Var2.g;
                                int i8 = iIntValue + 1;
                                zuc0Var3 = (zuc0) map.get(list3.get(i8));
                                if (zuc0Var3 == null) {
                                    hw51Var = null;
                                } else {
                                    this.c.getClass();
                                    lhg1VarA = kkg1.a(str2);
                                    if (lhg1VarA == null) {
                                        hw51Var = null;
                                    } else {
                                        double dI4 = jch0.I(map2);
                                        double dI5 = jch0.I(zuc0Var3.g);
                                        if (men1.x(lhg1VarA)) {
                                            hw51Var = null;
                                        } else {
                                            hw51Var = null;
                                        }
                                    }
                                }
                            }
                            if (hw51Var != null) {
                                arrayList4.add(hw51Var);
                            }
                        }
                        if (z) {
                            arrayList5 = new ArrayList();
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                int iIntValue7 = ((Number) it3.next()).intValue();
                                zuc0Var = (zuc0) map.get(list3.get(iIntValue7));
                                if (zuc0Var == null) {
                                    gw51Var = null;
                                } else {
                                    dI = jch0.I(zuc0Var.g);
                                    if (Math.abs(dI) <= Double.MAX_VALUE) {
                                        gw51Var = null;
                                    } else {
                                        gw51Var = null;
                                    }
                                }
                                if (gw51Var != null) {
                                    arrayList5.add(gw51Var);
                                }
                            }
                        }
                        return o7h.N0(arrayList5, arrayList4);
                    }
                    return d9nVar;
                }
            }
        }
        return arrayList5;
    }
}
