package p;

import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uvy {
    public final xrc0 a;
    public final idd1 b = new idd1(new d4e(this, (byte) 28));
    public final idd1 c = new idd1(new pdy(this, (byte) 6));
    public final PlaylistRequestDecorationPolicy d;
    public final PlaylistRequestDecorationPolicy e;
    public final PlaylistRequestDecorationPolicy f;
    public final PlaylistRequestDecorationPolicy g;

    public uvy(xrc0 xrc0Var) {
        this.a = xrc0Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.v(true);
        hru0VarS.y(vwu0VarR.build());
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        fj90 fj90VarN = ItemExtensionPolicy.n();
        fj90VarN.r(clc0.t);
        iou0VarV.n(Collections.singleton(fj90VarN.build()));
        hru0VarS.u(iou0VarV.build());
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
        this.d = playlistRequestDecorationPolicyBuild;
        hru0 builder = playlistRequestDecorationPolicyBuild.toBuilder();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        builder.w(sku0VarP.build());
        this.e = builder.build();
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP2 = PlaylistDecorationPolicy.p();
        sku0VarP2.R();
        hru0VarS2.w(sku0VarP2.build());
        iou0 iou0VarV2 = PlaylistItemDecorationPolicy.v();
        iou0VarV2.D(true);
        hru0VarS2.u(iou0VarV2.build());
        this.f = hru0VarS2.build();
        hru0 hru0VarS3 = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP3 = PlaylistDecorationPolicy.p();
        sku0VarP3.G();
        hru0VarS3.w(sku0VarP3.build());
        this.g = hru0VarS3.build();
    }

    public static nvy g(py21 py21Var) {
        String str;
        Long lD0;
        Long lD1;
        if (!(py21Var instanceof oy21)) {
            return new nvy();
        }
        wsc0 wsc0Var = (wsc0) ((oy21) py21Var).a;
        List<zuc0> list = wsc0Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (zuc0 zuc0Var : list) {
            Map map = zuc0Var.g;
            String str2 = (String) map.get("has_creator_timestamps");
            boolean z = (str2 != null && Boolean.parseBoolean(str2)) || ((str = (String) map.get("needs_remapping")) != null && Boolean.parseBoolean(str));
            String str3 = (String) map.get("chapter.start_position_in_milliseconds");
            long jLongValue = 0;
            long jLongValue2 = (str3 == null || (lD1 = nhc1.d0(10, str3)) == null) ? 0L : lD1.longValue();
            String str4 = (String) map.get("chapter.end_position_in_milliseconds");
            if (str4 != null && (lD0 = nhc1.d0(10, str4)) != null) {
                jLongValue = lD0.longValue();
            }
            boolean z2 = !z;
            arrayList.add(new lvy(zuc0Var.c, new sq51(jLongValue2, z2), new sq51(jLongValue, z2)));
        }
        String str5 = wsc0Var.f.b;
        if (str5.length() <= 0) {
            str5 = null;
        }
        return new nvy(arrayList, str5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        ovy ovyVar;
        Object next;
        if (onmVar instanceof ovy) {
            ovyVar = (ovy) onmVar;
            int i = ovyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovyVar.e = i - Integer.MIN_VALUE;
            } else {
                ovyVar = new ovy(this, onmVar);
            }
        } else {
            ovyVar = new ovy(this, onmVar);
        }
        Object objF = ovyVar.c;
        int i2 = ovyVar.e;
        if (i2 == 0) {
            hm5.M(objF);
            Set set = s4b1.f;
            String strZ = uic.v("podcast-chapters", str).z();
            if (strZ == null) {
                k220.f("Invalid entity URI: ".concat(str));
                return null;
            }
            trc0 trc0Var = (trc0) this.b.getValue();
            ovyVar.a = str;
            ovyVar.b = str2;
            ovyVar.e = 1;
            objF = this.a.f(strZ, trc0Var, ovyVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = ovyVar.b;
            str = ovyVar.a;
            hm5.M(objF);
        }
        py21 py21Var = (py21) objF;
        if (!(py21Var instanceof oy21)) {
            nkx0.p("Failed to retrieve segments for entity ", str, ": ", py21Var);
            return null;
        }
        Iterator it = g(py21Var).a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((lvy) next).a(), str2));
        lvy lvyVar = (lvy) next;
        if (lvyVar != null) {
            return lvyVar;
        }
        nkx0.p("Segment ", str2, " not found for entity ", str);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, onm onmVar) {
        pvy pvyVar;
        String str2;
        if (onmVar instanceof pvy) {
            pvyVar = (pvy) onmVar;
            int i = pvyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pvyVar.c = i - Integer.MIN_VALUE;
            } else {
                pvyVar = new pvy(this, onmVar);
            }
        } else {
            pvyVar = new pvy(this, onmVar);
        }
        Object objF = pvyVar.a;
        int i2 = pvyVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            Set set = s4b1.f;
            String strZ = uic.v("entity-segment-context", str).z();
            if (strZ != null) {
                trc0 trc0Var = new trc0(this.f, (g3d0) null, w7x.a, false, new rrc0(dm61.z0(new dlc0[]{dlc0.t, dlc0.b})), new iqz0(0, 1), (prc0) null, 0, (List) null, 458);
                pvyVar.c = 1;
                objF = this.a.f(strZ, trc0Var, pvyVar);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objF);
        oy21 oy21Var = (py21) objF;
        if (oy21Var instanceof oy21) {
            wsc0 wsc0Var = (wsc0) oy21Var.a;
            zuc0 zuc0Var = (zuc0) o7h.s0(wsc0Var.e);
            if (zuc0Var == null || (str2 = zuc0Var.c) == null || str2.length() == 0) {
                str2 = null;
            }
            String str3 = wsc0Var.f.b;
            return new mvy(str2, str3.length() != 0 ? str3 : null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        qvy qvyVar;
        if (onmVar instanceof qvy) {
            qvyVar = (qvy) onmVar;
            int i = qvyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qvyVar.c = i - Integer.MIN_VALUE;
            } else {
                qvyVar = new qvy(this, onmVar);
            }
        } else {
            qvyVar = new qvy(this, onmVar);
        }
        Object objE = qvyVar.a;
        int i2 = qvyVar.c;
        if (i2 == 0) {
            hm5.M(objE);
            qvyVar.c = 1;
            objE = e(str, qvyVar, false);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        return ((nvy) objE).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(String str, onm onmVar) {
        rvy rvyVar;
        if (onmVar instanceof rvy) {
            rvyVar = (rvy) onmVar;
            int i = rvyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rvyVar.c = i - Integer.MIN_VALUE;
            } else {
                rvyVar = new rvy(this, onmVar);
            }
        } else {
            rvyVar = new rvy(this, onmVar);
        }
        Object objF = rvyVar.a;
        int i2 = rvyVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            Set set = s4b1.f;
            String strZ = uic.v("podcast-chapters", str).z();
            if (strZ == null) {
                return yah0.m(false);
            }
            trc0 trc0Var = new trc0(this.g, (g3d0) null, w7x.a, false, new rrc0(Collections.singleton(dlc0.t)), jqz0.a, (prc0) null, 0, (List) null, 458);
            rvyVar.c = 1;
            objF = this.a.f(strZ, trc0Var, rvyVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        oy21 oy21Var = (py21) objF;
        return yah0.m(oy21Var instanceof oy21 ? u890.j(((wsc0) oy21Var.a).f.q.get("ml_generated"), "true") : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar, boolean z) {
        svy svyVar;
        if (onmVar instanceof svy) {
            svyVar = (svy) onmVar;
            int i = svyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                svyVar.d = i - Integer.MIN_VALUE;
            } else {
                svyVar = new svy(this, onmVar);
            }
        } else {
            svyVar = new svy(this, onmVar);
        }
        Object objF = svyVar.b;
        int i2 = svyVar.d;
        if (i2 == 0) {
            hm5.M(objF);
            Set set = s4b1.f;
            String strZ = uic.v("podcast-chapters", str).z();
            if (strZ == null) {
                return new nvy();
            }
            trc0 trc0Var = z ? (trc0) this.c.getValue() : (trc0) this.b.getValue();
            svyVar.a = this;
            svyVar.d = 1;
            objF = this.a.f(strZ, trc0Var, svyVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = svyVar.a;
            hm5.M(objF);
        }
        this.getClass();
        return g((py21) objF);
    }

    public final mr20 f(String str) {
        Set set = s4b1.f;
        String strZ = uic.v("podcast-chapters", str).z();
        if (strZ == null) {
            return h4p1.m(z6x.a);
        }
        return new pzs(this.a.k(strZ, (trc0) this.b.getValue()), this, (byte) 23);
    }
}
