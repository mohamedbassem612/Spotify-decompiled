package p;

import android.content.Context;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t4r0 implements yfr0 {
    public final /* synthetic */ zl5 a;

    public t4r0(zl5 zl5Var) {
        this.a = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        ArrayList arrayList;
        boolean z;
        gfr0 ffr0Var;
        goj0 goj0VarA;
        kbf1 kbf1Var;
        String str2 = str;
        zl5 zl5Var = this.a;
        u9c0 u9c0Var = (u9c0) zl5Var.o;
        Integer numValueOf = Integer.valueOf(i);
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-top-playable-items-section";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        y6h1 y6h1VarA = x6h1VarI.a();
        hoj0 hoj0VarC = ((ioj0) zob1Var.getValue()).c(kbf1.class, str2);
        ArrayList arrayList2 = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (kbf1Var = (kbf1) goj0VarA.a) == null) ? null : kbf1Var.a.a;
        if (arrayList2 != null) {
            arrayList = new ArrayList(q7h.U(arrayList2, 10));
            int i2 = 0;
            for (Object obj : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                arrayList.add(new mfr0(((zh51) obj).a, str2, i3, null, new tfr0(Integer.valueOf(i2), y6h1VarA)));
                str2 = str;
                i2 = i3;
            }
        } else {
            arrayList = z6x.a;
        }
        rsc0 rsc0Var = (xrc0) zl5Var.c;
        String str3 = (String) zl5Var.l;
        iqz0 iqz0Var = new iqz0(0, 10);
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        vwu0VarR.D(TrackDecorationPolicy.newBuilder().setLink(true).build());
        hru0VarS.z(vwu0VarR);
        xe01 xe01VarT = d5p1.t(o4p1.r(new sr0(rsc0Var.k(str3, new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 478)), zl5Var, str, y6h1VarA, (byte) 16), b3s.c), u9c0Var, new alb1(0L, Long.MAX_VALUE), arrayList);
        cgf1 cgf1Var = (cgf1) zl5Var.d;
        String string = ((Context) zl5Var.b).getString(2131960257);
        if (((f54) zl5Var.j).c()) {
            z = false;
            ffr0Var = new gfr0(string, str.concat(":songs"), new tfr0(0, y6h1VarA));
        } else {
            z = false;
            ffr0Var = new ffr0(string);
        }
        return new rfr0(d5p1.t(new x010(cgf1Var.a, xe01VarT, new c6e0(ffr0Var, y6h1VarA, str, (lnm) null), (byte) 1), u9c0Var, new alb1(0L, Long.MAX_VALUE), zl5.e(ffr0Var, y6h1VarA, str, ((Boolean) cgf1Var.a.getValue()).booleanValue(), (List) xe01VarT.a.getValue())), z);
    }
}
