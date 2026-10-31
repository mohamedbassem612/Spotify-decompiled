package p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n3v {
    public final mwm1 a;
    public final YourLibraryRequest b;

    public n3v(mwm1 mwm1Var) {
        this.a = mwm1Var;
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.i);
        hvm1VarQ.t(jsm1VarR);
        hvm1VarQ.q(true);
        hvm1VarQ.L();
        hvm1VarQ.C(1);
        gvm1VarO.n(hvm1VarQ);
        psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
        nsm1 nsm1VarO = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        osm1 osm1Var = osm1.c;
        nsm1VarO.q(osm1Var);
        psm1VarP.u(nsm1VarO);
        msm1 msm1VarO = YourLibraryConfig.YourLibraryLabelAndImage.o();
        msm1VarO.r("label");
        psm1VarP.y(msm1VarO.build());
        nsm1 nsm1VarO2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
        nsm1VarO2.q(osm1Var);
        psm1VarP.z(nsm1VarO2);
        gvm1VarO.s(psm1VarP.build());
        this.b = gvm1VarO.build();
    }

    public final mr20 a() {
        return rqt0.u(new lt20(new p3t(yoi1.g(this.a.b(this.b)), (byte) 10), new re1(3, (lnm) null, (byte) 21), (byte) 0));
    }
}
