package p;

import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r7b {
    public final xrc0 a;
    public final iyc0 b;

    public r7b(xrc0 xrc0Var, iyc0 iyc0Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
    }

    public static ItemExtensionPolicy a(clc0 clc0Var, hz00 hz00Var) {
        fj90 fj90VarN = ItemExtensionPolicy.n();
        fj90VarN.r(clc0Var);
        fj90VarN.n(hz00Var);
        return fj90VarN.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, onm onmVar) {
        q7b q7bVar;
        r7b r7bVar;
        a8b z7bVar;
        List list;
        List list2;
        mq70 mq70Var;
        up70 up70VarA;
        Integer numC0;
        Integer numC1;
        if (onmVar instanceof q7b) {
            q7bVar = (q7b) onmVar;
            int i = q7bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7bVar.c = i - Integer.MIN_VALUE;
                r7bVar = this;
            } else {
                r7bVar = this;
                q7bVar = new q7b(r7bVar, onmVar);
            }
        } else {
            r7bVar = this;
            q7bVar = new q7b(r7bVar, onmVar);
        }
        Object objM = q7bVar.a;
        int i2 = q7bVar.c;
        if (i2 == 0) {
            hm5.M(objM);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            sku0 builder = PlaylistDecorationPolicy.o().toBuilder();
            builder.j0();
            builder.G();
            hru0VarS.w(builder.build());
            iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
            iou0VarV.D(true);
            hru0VarS.u(iou0VarV.build());
            vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
            vwu0VarR.v(true);
            vwu0VarR.n();
            vwu0VarR.A();
            vwu0VarR.D(TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setPlayable(true).setIsExplicit(true).build());
            dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
            dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setName(true).setCovers(true));
            vwu0VarR.r(dgu0VarP.build());
            vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
            hru0VarS.y(vwu0VarR.build());
            iou0 iou0VarV2 = PlaylistItemDecorationPolicy.v();
            iou0VarV2.D(true);
            hz00 hz00Var = hz00.W3;
            clc0 clc0Var = clc0.e;
            ItemExtensionPolicy itemExtensionPolicyA = a(clc0Var, hz00Var);
            hz00 hz00Var2 = hz00.X3;
            ItemExtensionPolicy itemExtensionPolicyA2 = a(clc0Var, hz00Var2);
            ItemExtensionPolicy itemExtensionPolicyA3 = a(clc0Var, hz00.a4);
            clc0 clc0Var2 = clc0.c;
            iou0VarV2.n(t380.n(5, new Object[]{itemExtensionPolicyA, itemExtensionPolicyA2, itemExtensionPolicyA3, a(clc0Var2, hz00Var), a(clc0Var2, hz00Var2)}));
            hru0VarS.u(iou0VarV2.build());
            vs0 vs0Var = new vs0(r7bVar, l1d.m("spotify:list:managed-account-bans:", str), new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462), (lnm) null, (byte) 12);
            q7bVar.c = 1;
            objM = rc2.M(15000L, vs0Var, q7bVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        py21 py21Var = (py21) objM;
        Map map = ((wsc0) py21Var.d()).f.q;
        boolean zJ = u890.j(map.get("is_explicit_allowed"), "true");
        String str2 = (String) map.get("track_count");
        int iIntValue = (str2 == null || (numC1 = nhc1.c0(str2)) == null) ? 0 : numC1.intValue();
        String str3 = (String) map.get("artist_count");
        int iIntValue2 = (str3 == null || (numC0 = nhc1.c0(str3)) == null) ? 0 : numC0.intValue();
        List<zuc0> list3 = ((wsc0) py21Var.d()).e;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        for (zuc0 zuc0Var : list3) {
            tu00 tu00Var = zuc0Var.q;
            String str4 = zuc0Var.c;
            jo70 jo70VarA = tu00Var.a(jo70.class);
            tu00 tu00Var2 = zuc0Var.q;
            xkk1 xkk1VarA = tu00Var2.a(xkk1.class);
            String str5 = (xkk1VarA == null || (mq70Var = xkk1VarA.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null) ? null : up70VarA.a.a;
            boolean zJ2 = u890.j(zuc0Var.g.get("is_artist_banned"), "true");
            if (jo70VarA == null) {
                hhg1.f(l1d.m("IdentityTrait is required, but was not found for item: ", str4));
                return null;
            }
            List list4 = jo70VarA.d;
            Set set = s4b1.f;
            if (uic.x(str4).c == blc0.ti) {
                hll hllVarA = tu00Var2.a(hll.class);
                boolean zContains = (hllVarA == null || (list2 = hllVarA.b) == null) ? false : list2.contains(ell.b);
                boolean zContains2 = (hllVarA == null || (list = hllVarA.d) == null) ? false : list.contains(fll.c);
                String str6 = zuc0Var.c;
                String str7 = jo70VarA.a;
                String strY0 = o7h.y0(list4, ", ", (String) null, (String) null, c7b.c, 30);
                ho70 ho70Var = (ho70) o7h.s0(list4);
                z7bVar = new a8b(str6, str7, str5, ho70Var != null ? ho70Var.b : null, strY0, zContains, zContains2, zJ2);
            } else {
                z7bVar = new z7b(str4, jo70VarA.a, str5);
            }
            arrayList.add(z7bVar);
        }
        return new b8b(iIntValue, iIntValue2, arrayList, zJ);
    }
}
