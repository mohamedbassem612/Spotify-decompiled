package p;

import com.spotify.playlist.policy.proto.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class xsc0 {
    public static final trc0 a;
    public static final trc0 b;

    static {
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.r();
        UserDecorationPolicy userDecorationPolicyBuild = i8i1VarO.build();
        i8i1 i8i1VarO2 = UserDecorationPolicy.o();
        i8i1VarO2.r();
        i8i1VarO2.s();
        UserDecorationPolicy userDecorationPolicyBuild2 = i8i1VarO2.build();
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
        iou0VarV.D(true);
        iou0VarV.A();
        iou0VarV.r();
        iou0VarV.C();
        iou0VarV.B();
        iou0VarV.s(userDecorationPolicyBuild);
        iou0VarV.v();
        hru0VarS.v(iou0VarV);
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
        qrc0 qrc0Var = qrc0.a;
        a = new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, qrc0Var, (mqz0) null, (prc0) null, 0, (List) null, 494);
        hru0 hru0VarS2 = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        sku0VarP.N();
        sku0VarP.Z();
        sku0VarP.c0();
        sku0VarP.l0();
        sku0VarP.C();
        sku0VarP.W();
        sku0VarP.u();
        sku0VarP.H();
        sku0VarP.B();
        sku0VarP.t();
        sku0VarP.k0();
        sku0VarP.J();
        sku0VarP.z();
        sku0VarP.G();
        sku0VarP.e0();
        sku0VarP.g0();
        sku0VarP.U();
        sku0VarP.r();
        sku0VarP.X(userDecorationPolicyBuild2);
        sku0VarP.P(userDecorationPolicyBuild2);
        sku0VarP.S();
        sku0VarP.v();
        sku0VarP.i0();
        sku0VarP.L();
        sku0VarP.h0();
        oxg oxgVarP = CollaboratingUsersDecorationPolicy.p();
        oxgVarP.q();
        sku0VarP.w(oxgVarP.build());
        hru0VarS2.w(sku0VarP.build());
        b = new trc0(hru0VarS2.build(), (g3d0) null, (Set) null, false, qrc0Var, jqz0.a, (prc0) null, 0, (List) null, 462);
    }

    public static final trc0 a() {
        return a;
    }

    public static final trc0 b() {
        return b;
    }

    public static final qxc0 c(wsc0 wsc0Var) {
        kby kbyVar = wsc0Var.f;
        String str = kbyVar.b;
        ben benVar = kbyVar.d;
        boolean z = kbyVar.h;
        x4i1 x4i1Var = kbyVar.e;
        pxc0 pxc0Var = x4i1Var != null ? new pxc0(x4i1Var.a, x4i1Var.h) : null;
        boolean z2 = kbyVar.j;
        boolean z3 = kbyVar.D;
        wls0 wls0Var = kbyVar.v;
        String str2 = kbyVar.p;
        x4i1 x4i1Var2 = kbyVar.u;
        pxc0 pxc0Var2 = x4i1Var2 != null ? new pxc0(x4i1Var2.a, x4i1Var2.h) : null;
        List list = kbyVar.z;
        String str3 = kbyVar.c;
        if (str3 == null) {
            str3 = "";
        }
        x7i1 x7i1Var = kbyVar.w;
        boolean z4 = kbyVar.C;
        boolean z5 = kbyVar.o;
        boolean z6 = kbyVar.E;
        Map map = kbyVar.q;
        List list2 = kbyVar.r;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            gby gbyVar = (gby) it.next();
            Iterator it2 = it;
            boolean z7 = gbyVar.c;
            String str4 = gbyVar.a;
            String str5 = gbyVar.b;
            arrayList.add(z7 ? new z2d0(str4, str5, false) : new a3d0(str4, str5));
            it = it2;
            benVar = benVar;
            list = list;
        }
        List list3 = list;
        return new qxc0(str, benVar, pxc0Var, str3, str2, z, kbyVar.A, z2, wls0Var, x7i1Var, map, arrayList, kbyVar.F, list3, wsc0Var.j, kbyVar.t, z5, wsc0Var.k, wsc0Var.b, wsc0Var.c, kbyVar.n, pxc0Var2, wsc0Var.m, z3, z4, z6);
    }

    public static final ArrayList d(wsc0 wsc0Var) {
        List<zuc0> list = wsc0Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (zuc0 zuc0Var : list) {
            String str = zuc0Var.c;
            String str2 = zuc0Var.a;
            int i = zuc0Var.b;
            x4i1 x4i1Var = zuc0Var.d;
            arrayList.add(new pvc0(str2, i, str, x4i1Var != null ? x4i1Var.a : null, zuc0Var.f, zuc0Var.g, zuc0Var.h));
        }
        return arrayList;
    }
}
