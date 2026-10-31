package p;

import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedRequest;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class xuz {
    public static final List a = p7h.M(new String[]{"mixed", "audio", "video"});
    public static final List b = p7h.M(new String[]{"no", "yes", "downloading", "waiting"});

    public static RecentlyPlayedEntity a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, boolean z2, int i) {
        return new RecentlyPlayedEntity(str, "", (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, "", (i & 1024) != 0 ? "" : str9, false, false, false, (i & 16384) != 0 ? false : z, false, false, 0, 0, 0, "", null, (4194304 & i) != 0 ? null : str10, null, null, (i & 33554432) != 0 ? false : z2);
    }

    public static final GetRecentlyPlayedRequest b(jp01 jp01Var) {
        jp40 jp40VarN = GetRecentlyPlayedRequest.n();
        jp40VarN.H();
        jp40VarN.C();
        jp40VarN.G(yuz.a);
        jp40VarN.n(yuz.b);
        jp40VarN.q(yuz.c);
        jp40VarN.F(yuz.d);
        jp40VarN.s(yuz.e);
        jp40VarN.E(yuz.f);
        jp40VarN.D(yuz.g);
        jp40VarN.r(yuz.h);
        Set set = jp01Var.a;
        jp40VarN.y(set.contains(hp01.b));
        jp40VarN.x(set.contains(hp01.c));
        jp40VarN.B(set.contains(hp01.d));
        jp40VarN.z(set.contains(hp01.e));
        jp40VarN.A(set.contains(hp01.f));
        Set set2 = jp01Var.b;
        jp40VarN.u(set2.contains(gp01.a));
        jp40VarN.t(set2.contains(gp01.b));
        jp40VarN.v(set2.contains(gp01.c));
        jp40VarN.w(set2.contains(gp01.d));
        return (GetRecentlyPlayedRequest) jp40VarN.build();
    }
}
