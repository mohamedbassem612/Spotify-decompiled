package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.your_library.esperanto.proto.PinRequest;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zxm1 {
    public final mwm1 a;
    public final idd1 b = new idd1(wam1.W0);
    public final YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs c;

    public zxm1(z0t z0tVar, mwm1 mwm1Var, xna0 xna0Var) {
        this.a = mwm1Var;
        msm1 msm1VarO = YourLibraryConfig.YourLibraryLabelAndImage.o();
        msm1VarO.r("_");
        msm1VarO.n("_");
        YourLibraryConfig.YourLibraryLabelAndImage yourLibraryLabelAndImageBuild = msm1VarO.build();
        nsm1 nsm1VarO = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        fvm1 fvm1Var = z0tVar.a;
        boolean zA = fvm1Var.a();
        osm1 osm1Var = osm1.d;
        osm1 osm1Var2 = osm1.c;
        nsm1VarO.q(zA ? osm1Var : osm1Var2);
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfigBuild = nsm1VarO.build();
        nsm1 nsm1VarO2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        nsm1VarO2.q(fvm1Var.a() ? osm1Var : osm1Var2);
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfigBuild2 = nsm1VarO2.build();
        nsm1 nsm1VarO3 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        nsm1VarO3.q(osm1Var2);
        YourLibraryConfig.YourLibraryPredefinedPlaylistConfig yourLibraryPredefinedPlaylistConfigBuild3 = nsm1VarO3.build();
        nsm1 nsm1VarO4 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        nsm1VarO4.q(osm1Var2);
        nsm1VarO4.build();
        psm1 psm1VarP = YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.p();
        psm1VarP.q(yourLibraryPredefinedPlaylistConfigBuild2);
        psm1VarP.y(yourLibraryLabelAndImageBuild);
        psm1VarP.v(yourLibraryPredefinedPlaylistConfigBuild);
        psm1VarP.A(yourLibraryPredefinedPlaylistConfigBuild2);
        psm1VarP.s(yourLibraryPredefinedPlaylistConfigBuild3);
        this.c = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) psm1VarP.build();
    }

    public final Observable a(String str) {
        zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
        zsm1VarP.q(str);
        zsm1VarP.r(this.c);
        return this.a.c(zsm1VarP.build()).map(new yxm1(this)).onErrorReturnItem(uum1.a);
    }

    public final Observable b(String str, lik1 lik1Var) {
        return (lik1Var.equals(nik1.p2) || lik1Var.equals(nik1.A2) || lik1Var.equals((lik1) this.b.getValue())) ? a(str) : Observable.just(uum1.a);
    }

    public final Single c(String str) {
        c2t0 c2t0VarN = PinRequest.n();
        c2t0VarN.n(str);
        return this.a.callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "UnPin", c2t0VarN.build()).map(wbx0.Z0).map(jcx0.Z0);
    }
}
