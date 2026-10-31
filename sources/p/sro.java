package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sro {
    public static final PlaylistRequestDecorationPolicy e;
    public static final PlaylistRequestDecorationPolicy f;
    public final xrc0 a;
    public final vtc0 b;
    public final z6k0 c;
    public final kkg1 d;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.A();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        e = hru0VarS.build();
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV2 = PlaylistItemDecorationPolicy.v();
        iou0VarV2.v();
        hru0VarS2.v(iou0VarV2);
        f = hru0VarS2.build();
    }

    public sro(xrc0 xrc0Var, vtc0 vtc0Var, z6k0 z6k0Var, kkg1 kkg1Var) {
        this.a = xrc0Var;
        this.b = vtc0Var;
        this.c = z6k0Var;
        this.d = kkg1Var;
    }

    public final tro a(String str, String str2, String str3, Map map) {
        String str4 = (String) map.get("automix.auto_transition_recipe");
        if (str4 == null) {
            return null;
        }
        this.d.getClass();
        lhg1 lhg1VarA = kkg1.a(str4);
        if (lhg1VarA == null) {
            return null;
        }
        ruq0 ruq0Var = lhg1VarA.b;
        boolean zJ = u890.j(ruq0Var.b, str3);
        if (men1.x(lhg1VarA) && zJ) {
            return new tro(str2, str, str3, str4, ruq0Var.O0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, String str2, String str3, onm onmVar) {
        pro proVar;
        if (onmVar instanceof pro) {
            proVar = (pro) onmVar;
            int i = proVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                proVar.c = i - Integer.MIN_VALUE;
            } else {
                proVar = new pro(this, onmVar);
            }
        } else {
            proVar = new pro(this, onmVar);
        }
        pro proVar2 = proVar;
        Object objD = proVar2.a;
        int i2 = proVar2.c;
        if (i2 == 0) {
            hm5.M(objD);
            proVar2.c = 1;
            objD = d(str, str2, str3, null, proVar2);
            Object obj = d9n.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        wro wroVar = (wro) objD;
        if (wroVar instanceof uro) {
            return ((uro) wroVar).a;
        }
        if (u890.j(wroVar, vro.a)) {
            return xro.c;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(xrc0 xrc0Var, String str, String str2, onm onmVar) {
        qro qroVar;
        if (onmVar instanceof qro) {
            qroVar = (qro) onmVar;
            int i = qroVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qroVar.c = i - Integer.MIN_VALUE;
            } else {
                qroVar = new qro(this, onmVar);
            }
        } else {
            qroVar = new qro(this, onmVar);
        }
        Object objH = qroVar.a;
        int i2 = qroVar.c;
        if (i2 == 0) {
            hm5.M(objH);
            qroVar.c = 1;
            objH = ((rsc0) xrc0Var).h(str, str2, f, qroVar);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objH);
        }
        py21 py21Var = (py21) objH;
        if (py21Var != null) {
            return py21Var.a(eno.t);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x011b A[EDGE_INSN: B:112:0x011b->B:48:0x011b BREAK  A[LOOP:0: B:41:0x00fe->B:46:0x0115], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115 A[LOOP:0: B:41:0x00fe->B:46:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc  */
    public final Object d(String str, String str2, String str3, String str4, onm onmVar) {
        rro rroVar;
        String str5;
        String str6;
        String str7;
        String str8;
        wsc0 wsc0Var;
        List list;
        Map map;
        boolean zB;
        xro xroVar;
        Iterator it;
        int i;
        zuc0 zuc0Var;
        zuc0 zuc0Var2;
        zuc0 zuc0Var3;
        zuc0 zuc0Var4;
        Map map2;
        zuc0 zuc0Var5;
        zuc0 zuc0Var6;
        int i2;
        zuc0 zuc0Var7;
        Iterator it2;
        Object next;
        zuc0 zuc0Var8;
        Map map3;
        zuc0 zuc0Var9;
        zuc0 zuc0Var10;
        py21 py21Var;
        Map map4;
        tro troVarA;
        py21 py21Var2;
        String str9 = str;
        if (onmVar instanceof rro) {
            rroVar = (rro) onmVar;
            int i3 = rroVar.X;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rroVar.X = i3 - Integer.MIN_VALUE;
            } else {
                rroVar = new rro(this, onmVar);
            }
        } else {
            rroVar = new rro(this, onmVar);
        }
        Object objF = rroVar.i;
        int i4 = rroVar.X;
        xrc0 xrc0Var = this.a;
        tro troVarA2 = null;
        Object obj = d9n.a;
        if (i4 == 0) {
            hm5.M(objF);
            haa0 haa0VarA = this.b.a.a(str3);
            rroVar.a = str9;
            str5 = str2;
            rroVar.b = str5;
            str6 = str4;
            rroVar.c = str6;
            rroVar.X = 1;
            objF = haa0VarA.f(str9, rroVar);
            if (objF != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            String str10 = rroVar.c;
            str5 = rroVar.b;
            String str11 = rroVar.a;
            hm5.M(objF);
            str6 = str10;
            str9 = str11;
        } else {
            if (i4 == 2) {
                str8 = rroVar.c;
                str5 = rroVar.b;
                String str12 = rroVar.a;
                hm5.M(objF);
                str7 = str12;
                wsc0Var = (wsc0) ((py21) objF).c();
                if (wsc0Var != null) {
                    list = wsc0Var.e;
                    map = wsc0Var.f.q;
                    this.c.getClass();
                    zB = z6k0.b(map);
                    xroVar = xro.c;
                    if (!zB) {
                        return new uro(xroVar);
                    }
                    if (str8 != null && !Boolean.parseBoolean((String) map.get("has-custom-transitions"))) {
                        return new uro(xroVar);
                    }
                    it = list.iterator();
                    i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (u890.j(((zuc0) it.next()).a, str5)) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        zuc0Var = (zuc0) list.get(i);
                        zuc0Var2 = (zuc0) o7h.t0(i - 1, list);
                        zuc0Var3 = (zuc0) o7h.t0(i + 1, list);
                        if (str8 != null) {
                            it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!u890.j(((zuc0) next).a, str8));
                            zuc0Var8 = (zuc0) next;
                            if (zuc0Var8 != null) {
                                zuc0Var4 = zuc0Var8;
                            }
                        } else {
                            zuc0Var4 = zuc0Var3;
                        }
                        if (str8 != null || zuc0Var3 != null) {
                            if (!Boolean.parseBoolean((String) map.get("has-custom-transitions"))) {
                                return new uro(xroVar);
                            }
                            if (zuc0Var2 != null && zuc0Var4 == null) {
                                return new uro(xroVar);
                            }
                            if (zuc0Var4 != null) {
                                map2 = null;
                                if (zuc0Var2 != null) {
                                    String str13 = zuc0Var2.a;
                                    rroVar.a = null;
                                    rroVar.b = null;
                                    rroVar.c = null;
                                    rroVar.d = zuc0Var;
                                    rroVar.e = zuc0Var2;
                                    rroVar.f = zuc0Var4;
                                    rroVar.g = map2;
                                    rroVar.h = i;
                                    rroVar.X = 4;
                                    objF = c(xrc0Var, str7, str13, rroVar);
                                    if (objF != obj) {
                                        zuc0Var9 = zuc0Var;
                                        zuc0Var10 = zuc0Var4;
                                    }
                                } else {
                                    map3 = null;
                                }
                                if (zuc0Var4 != null) {
                                    troVarA = null;
                                } else {
                                    troVarA = null;
                                }
                                if (zuc0Var2 != null) {
                                    troVarA2 = a(zuc0Var2.a, zuc0Var2.c, zuc0Var.c, map3);
                                }
                                return new uro(new xro(troVarA2, troVarA));
                            }
                            String str14 = zuc0Var.a;
                            rroVar.a = str7;
                            rroVar.b = null;
                            rroVar.c = null;
                            rroVar.d = zuc0Var;
                            rroVar.e = zuc0Var2;
                            rroVar.f = zuc0Var4;
                            rroVar.h = i;
                            rroVar.X = 3;
                            objF = c(xrc0Var, str7, str14, rroVar);
                            if (objF != obj) {
                                zuc0Var5 = zuc0Var;
                                zuc0Var6 = zuc0Var4;
                                i2 = i;
                                zuc0Var7 = zuc0Var2;
                                py21Var = (py21) objF;
                                if (py21Var != null) {
                                    i = i2;
                                    map2 = map4;
                                    zuc0Var2 = zuc0Var7;
                                    zuc0Var4 = zuc0Var6;
                                    zuc0Var = zuc0Var5;
                                    if (zuc0Var2 != null) {
                                        String str15 = zuc0Var2.a;
                                        rroVar.a = null;
                                        rroVar.b = null;
                                        rroVar.c = null;
                                        rroVar.d = zuc0Var;
                                        rroVar.e = zuc0Var2;
                                        rroVar.f = zuc0Var4;
                                        rroVar.g = map2;
                                        rroVar.h = i;
                                        rroVar.X = 4;
                                        objF = c(xrc0Var, str7, str15, rroVar);
                                        if (objF != obj) {
                                            zuc0Var9 = zuc0Var;
                                            zuc0Var10 = zuc0Var4;
                                        }
                                    } else {
                                        map3 = null;
                                    }
                                    if (zuc0Var4 != null) {
                                        troVarA = null;
                                    } else {
                                        troVarA = null;
                                    }
                                    if (zuc0Var2 != null) {
                                        troVarA2 = a(zuc0Var2.a, zuc0Var2.c, zuc0Var.c, map3);
                                    }
                                    return new uro(new xro(troVarA2, troVarA));
                                }
                            }
                            return obj;
                        }
                    }
                }
                return vro.a;
            }
            if (i4 == 3) {
                i2 = rroVar.h;
                zuc0Var6 = rroVar.f;
                zuc0Var7 = rroVar.e;
                zuc0Var5 = rroVar.d;
                str7 = rroVar.a;
                hm5.M(objF);
                py21Var = (py21) objF;
                if (py21Var != null && (map4 = (Map) py21Var.c()) != null) {
                    i = i2;
                    map2 = map4;
                    zuc0Var2 = zuc0Var7;
                    zuc0Var4 = zuc0Var6;
                    zuc0Var = zuc0Var5;
                    if (zuc0Var2 != null) {
                        String str16 = zuc0Var2.a;
                        rroVar.a = null;
                        rroVar.b = null;
                        rroVar.c = null;
                        rroVar.d = zuc0Var;
                        rroVar.e = zuc0Var2;
                        rroVar.f = zuc0Var4;
                        rroVar.g = map2;
                        rroVar.h = i;
                        rroVar.X = 4;
                        objF = c(xrc0Var, str7, str16, rroVar);
                        if (objF != obj) {
                            zuc0Var9 = zuc0Var;
                            zuc0Var10 = zuc0Var4;
                        }
                        return obj;
                    }
                    map3 = null;
                    if (zuc0Var4 != null || map2 == null) {
                        troVarA = null;
                    } else {
                        troVarA = a(zuc0Var.a, zuc0Var.c, zuc0Var4.c, map2);
                    }
                    if (zuc0Var2 != null && map3 != null) {
                        troVarA2 = a(zuc0Var2.a, zuc0Var2.c, zuc0Var.c, map3);
                    }
                    return new uro(new xro(troVarA2, troVarA));
                }
                return vro.a;
            }
            if (i4 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map2 = rroVar.g;
            zuc0Var10 = rroVar.f;
            zuc0Var2 = rroVar.e;
            zuc0Var9 = rroVar.d;
            hm5.M(objF);
        }
        py21Var2 = (py21) objF;
        if (py21Var2 != null && (map3 = (Map) py21Var2.c()) != null) {
            zuc0Var4 = zuc0Var10;
            zuc0Var = zuc0Var9;
            if (zuc0Var4 != null) {
                troVarA = null;
            } else {
                troVarA = null;
            }
            if (zuc0Var2 != null) {
                troVarA2 = a(zuc0Var2.a, zuc0Var2.c, zuc0Var.c, map3);
            }
            return new uro(new xro(troVarA2, troVarA));
        }
        return vro.a;
        rroVar.a = str9;
        rroVar.b = str5;
        rroVar.c = str6;
        rroVar.X = 2;
        objF = ((rsc0) xrc0Var).f(str9, new trc0(e, (g3d0) null, (Set) objF, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474), rroVar);
        if (objF != obj) {
            str7 = str9;
            str8 = str6;
            wsc0Var = (wsc0) ((py21) objF).c();
            if (wsc0Var != null) {
                list = wsc0Var.e;
                map = wsc0Var.f.q;
                this.c.getClass();
                zB = z6k0.b(map);
                xroVar = xro.c;
                if (!zB) {
                    return new uro(xroVar);
                }
                if (str8 != null) {
                }
                it = list.iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (u890.j(((zuc0) it.next()).a, str5)) {
                        break;
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    zuc0Var = (zuc0) list.get(i);
                    zuc0Var2 = (zuc0) o7h.t0(i - 1, list);
                    zuc0Var3 = (zuc0) o7h.t0(i + 1, list);
                    if (str8 != null) {
                        it2 = list.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!u890.j(((zuc0) next).a, str8));
                        zuc0Var8 = (zuc0) next;
                        if (zuc0Var8 != null) {
                            zuc0Var4 = zuc0Var8;
                        }
                    } else {
                        zuc0Var4 = zuc0Var3;
                    }
                    if (str8 != null) {
                    }
                    if (!Boolean.parseBoolean((String) map.get("has-custom-transitions"))) {
                        return new uro(xroVar);
                    }
                    if (zuc0Var2 != null) {
                    }
                    if (zuc0Var4 != null) {
                        map2 = null;
                        if (zuc0Var2 != null) {
                            String str17 = zuc0Var2.a;
                            rroVar.a = null;
                            rroVar.b = null;
                            rroVar.c = null;
                            rroVar.d = zuc0Var;
                            rroVar.e = zuc0Var2;
                            rroVar.f = zuc0Var4;
                            rroVar.g = map2;
                            rroVar.h = i;
                            rroVar.X = 4;
                            objF = c(xrc0Var, str7, str17, rroVar);
                            if (objF != obj) {
                                zuc0Var9 = zuc0Var;
                                zuc0Var10 = zuc0Var4;
                                py21Var2 = (py21) objF;
                                if (py21Var2 != null) {
                                    zuc0Var4 = zuc0Var10;
                                    zuc0Var = zuc0Var9;
                                }
                            }
                        } else {
                            map3 = null;
                        }
                        if (zuc0Var4 != null) {
                            troVarA = null;
                        } else {
                            troVarA = null;
                        }
                        if (zuc0Var2 != null) {
                            troVarA2 = a(zuc0Var2.a, zuc0Var2.c, zuc0Var.c, map3);
                        }
                        return new uro(new xro(troVarA2, troVarA));
                    }
                    String str18 = zuc0Var.a;
                    rroVar.a = str7;
                    rroVar.b = null;
                    rroVar.c = null;
                    rroVar.d = zuc0Var;
                    rroVar.e = zuc0Var2;
                    rroVar.f = zuc0Var4;
                    rroVar.h = i;
                    rroVar.X = 3;
                    objF = c(xrc0Var, str7, str18, rroVar);
                    if (objF != obj) {
                        zuc0Var5 = zuc0Var;
                        zuc0Var6 = zuc0Var4;
                        i2 = i;
                        zuc0Var7 = zuc0Var2;
                        py21Var = (py21) objF;
                        if (py21Var != null) {
                            i = i2;
                            map2 = map4;
                            zuc0Var2 = zuc0Var7;
                            zuc0Var4 = zuc0Var6;
                            zuc0Var = zuc0Var5;
                            if (zuc0Var2 != null) {
                                String str19 = zuc0Var2.a;
                                rroVar.a = null;
                                rroVar.b = null;
                                rroVar.c = null;
                                rroVar.d = zuc0Var;
                                rroVar.e = zuc0Var2;
                                rroVar.f = zuc0Var4;
                                rroVar.g = map2;
                                rroVar.h = i;
                                rroVar.X = 4;
                                objF = c(xrc0Var, str7, str19, rroVar);
                                if (objF != obj) {
                                    zuc0Var9 = zuc0Var;
                                    zuc0Var10 = zuc0Var4;
                                    py21Var2 = (py21) objF;
                                    if (py21Var2 != null) {
                                        zuc0Var4 = zuc0Var10;
                                        zuc0Var = zuc0Var9;
                                    }
                                }
                            } else {
                                map3 = null;
                            }
                            if (zuc0Var4 != null) {
                                troVarA = null;
                            } else {
                                troVarA = null;
                            }
                            if (zuc0Var2 != null) {
                                troVarA2 = a(zuc0Var2.a, zuc0Var2.c, zuc0Var.c, map3);
                            }
                            return new uro(new xro(troVarA2, troVarA));
                        }
                    }
                }
            }
            return vro.a;
        }
        return obj;
    }
}
