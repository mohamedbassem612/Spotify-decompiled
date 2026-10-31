package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pmw0 {
    public static final PlaylistRequestDecorationPolicy d;
    public static final PlaylistRequestDecorationPolicy e;
    public final xrc0 a;
    public final vtc0 b;
    public final b7n c;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.A();
        iou0VarV.D(true);
        hru0VarS.v(iou0VarV);
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true));
        hru0VarS.z(vwu0VarR);
        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
        llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true));
        hru0VarS.t(llu0VarR);
        d = hru0VarS.build();
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV2 = PlaylistItemDecorationPolicy.v();
        iou0VarV2.v();
        hru0VarS2.v(iou0VarV2);
        e = hru0VarS2.build();
    }

    public pmw0(xrc0 xrc0Var, vtc0 vtc0Var, z6k0 z6k0Var, b7n b7nVar) {
        this.a = xrc0Var;
        this.b = vtc0Var;
        this.c = b7nVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140 A[LOOP:0: B:42:0x012b->B:47:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:60:0x017f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0144 A[EDGE_INSN: B:72:0x0144->B:49:0x0144 BREAK  A[LOOP:0: B:42:0x012b->B:47:0x0140], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, String str2, String str3, onm onmVar) {
        omw0 omw0Var;
        String str4;
        String str5;
        String str6;
        Set xj61Var;
        boolean z;
        Set set;
        Set set2;
        String str7;
        String str8;
        wsc0 wsc0Var;
        List list;
        Iterator it;
        int i;
        zuc0 zuc0Var;
        Object objH;
        zuc0 zuc0Var2;
        py21 py21Var;
        zuc0 zuc0Var3;
        Map map;
        String str9;
        if (onmVar instanceof omw0) {
            omw0Var = (omw0) onmVar;
            int i2 = omw0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                omw0Var.t = i2 - Integer.MIN_VALUE;
            } else {
                omw0Var = new omw0(this, onmVar);
            }
        } else {
            omw0Var = new omw0(this, onmVar);
        }
        Object objI = omw0Var.h;
        int i3 = omw0Var.t;
        rsc0 rsc0Var = this.a;
        Float fB0 = null;
        Serializable serializable = d9n.a;
        if (i3 == 0) {
            hm5.M(objI);
            mr20 mr20VarA = this.c.a(s6n.a);
            omw0Var.a = str;
            str4 = str2;
            omw0Var.b = str4;
            omw0Var.c = str3;
            omw0Var.t = 1;
            objI = b5p1.i(mr20VarA, omw0Var);
            if (objI != serializable) {
                str5 = str;
                str6 = str3;
            }
            return serializable;
        }
        if (i3 == 1) {
            str6 = omw0Var.c;
            str4 = omw0Var.b;
            str5 = omw0Var.a;
            hm5.M(objI);
        } else {
            if (i3 == 2) {
                z = omw0Var.g;
                set = (Set) omw0Var.f;
                set2 = omw0Var.e;
                Set set3 = omw0Var.d;
                String str10 = omw0Var.b;
                String str11 = omw0Var.a;
                hm5.M(objI);
                xj61Var = set3;
                str4 = str10;
                str5 = str11;
                set.addAll((Collection) objI);
                if (!z) {
                    set2.add(yqc0.a);
                }
                trc0 trc0Var = new trc0(d, (g3d0) null, cwl1.j(xj61Var), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474);
                omw0Var.a = str5;
                omw0Var.b = str4;
                omw0Var.c = null;
                omw0Var.d = null;
                omw0Var.e = null;
                omw0Var.f = null;
                omw0Var.g = z;
                omw0Var.t = 3;
                objI = rsc0Var.f(str5, trc0Var, omw0Var);
                if (objI != serializable) {
                    str7 = str4;
                    str8 = str5;
                    wsc0Var = (wsc0) ((py21) objI).c();
                    if (wsc0Var != null) {
                        list = wsc0Var.e;
                        if (z6k0.b(wsc0Var.f.q)) {
                            it = list.iterator();
                            i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (u890.j(((zuc0) it.next()).a, str7)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (i > 0) {
                                zuc0Var = (zuc0) list.get(i - 1);
                                if (nhc1.Y(zuc0Var.c, "spotify:track:", false)) {
                                    String str12 = zuc0Var.a;
                                    omw0Var.a = null;
                                    omw0Var.b = null;
                                    omw0Var.c = null;
                                    omw0Var.d = null;
                                    omw0Var.e = null;
                                    omw0Var.f = zuc0Var;
                                    omw0Var.g = z;
                                    omw0Var.t = 4;
                                    objH = rsc0Var.h(str8, str12, e, omw0Var);
                                    if (objH != serializable) {
                                        objI = objH;
                                        zuc0Var2 = zuc0Var;
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                return serializable;
            }
            if (i3 == 3) {
                z = omw0Var.g;
                str7 = omw0Var.b;
                str8 = omw0Var.a;
                hm5.M(objI);
                wsc0Var = (wsc0) ((py21) objI).c();
                if (wsc0Var != null) {
                    list = wsc0Var.e;
                    if (z6k0.b(wsc0Var.f.q)) {
                        it = list.iterator();
                        i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (u890.j(((zuc0) it.next()).a, str7)) {
                                break;
                            }
                            i++;
                        }
                        if (i > 0) {
                            zuc0Var = (zuc0) list.get(i - 1);
                            if (nhc1.Y(zuc0Var.c, "spotify:track:", false)) {
                                String str13 = zuc0Var.a;
                                omw0Var.a = null;
                                omw0Var.b = null;
                                omw0Var.c = null;
                                omw0Var.d = null;
                                omw0Var.e = null;
                                omw0Var.f = zuc0Var;
                                omw0Var.g = z;
                                omw0Var.t = 4;
                                objH = rsc0Var.h(str8, str13, e, omw0Var);
                                if (objH != serializable) {
                                    objI = objH;
                                    zuc0Var2 = zuc0Var;
                                }
                                return serializable;
                            }
                        }
                    }
                }
                return null;
            }
            if (i3 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zuc0Var2 = (zuc0) omw0Var.f;
            wsc0 wsc0Var2 = omw0Var.e;
            hm5.M(objI);
        }
        py21Var = (py21) objI;
        if (py21Var != null) {
            zuc0Var3 = (zuc0) py21Var.c();
        } else {
            zuc0Var3 = null;
        }
        String str14 = zuc0Var2.a;
        String str15 = zuc0Var2.c;
        if (zuc0Var3 != null && (map = zuc0Var3.g) != null && (str9 = (String) map.get("item.speed")) != null) {
            fB0 = nhc1.b0(str9);
        }
        return new qmw0(str14, str15, fB0);
        boolean zBooleanValue = ((Boolean) objI).booleanValue();
        xj61Var = new xj61();
        haa0 haa0VarA = this.b.a.a(str6);
        omw0Var.a = str5;
        omw0Var.b = str4;
        omw0Var.c = null;
        omw0Var.d = xj61Var;
        omw0Var.e = xj61Var;
        omw0Var.f = xj61Var;
        omw0Var.g = zBooleanValue;
        omw0Var.t = 2;
        Serializable serializableF = haa0VarA.f(str5, omw0Var);
        if (serializableF != serializable) {
            objI = serializableF;
            z = zBooleanValue;
            set = xj61Var;
            set2 = set;
            set.addAll((Collection) objI);
            if (!z) {
                set2.add(yqc0.a);
            }
            trc0 trc0Var2 = new trc0(d, (g3d0) null, cwl1.j(xj61Var), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474);
            omw0Var.a = str5;
            omw0Var.b = str4;
            omw0Var.c = null;
            omw0Var.d = null;
            omw0Var.e = null;
            omw0Var.f = null;
            omw0Var.g = z;
            omw0Var.t = 3;
            objI = rsc0Var.f(str5, trc0Var2, omw0Var);
            if (objI != serializable) {
                str7 = str4;
                str8 = str5;
                wsc0Var = (wsc0) ((py21) objI).c();
                if (wsc0Var != null) {
                    list = wsc0Var.e;
                    if (z6k0.b(wsc0Var.f.q)) {
                        it = list.iterator();
                        i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (u890.j(((zuc0) it.next()).a, str7)) {
                                break;
                                break;
                            }
                            i++;
                        }
                        if (i > 0) {
                            zuc0Var = (zuc0) list.get(i - 1);
                            if (nhc1.Y(zuc0Var.c, "spotify:track:", false)) {
                                String str16 = zuc0Var.a;
                                omw0Var.a = null;
                                omw0Var.b = null;
                                omw0Var.c = null;
                                omw0Var.d = null;
                                omw0Var.e = null;
                                omw0Var.f = zuc0Var;
                                omw0Var.g = z;
                                omw0Var.t = 4;
                                objH = rsc0Var.h(str8, str16, e, omw0Var);
                                if (objH != serializable) {
                                    objI = objH;
                                    zuc0Var2 = zuc0Var;
                                    py21Var = (py21) objI;
                                    if (py21Var != null) {
                                        zuc0Var3 = (zuc0) py21Var.c();
                                    } else {
                                        zuc0Var3 = null;
                                    }
                                    String str17 = zuc0Var2.a;
                                    String str18 = zuc0Var2.c;
                                    if (zuc0Var3 != null) {
                                        fB0 = nhc1.b0(str9);
                                    }
                                    return new qmw0(str17, str18, fB0);
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }
        return serializable;
    }
}
