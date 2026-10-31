package p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mz10 {
    public static final YourLibraryRequest b;
    public final vwm1 a;

    static {
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.C(50);
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.d);
        hvm1VarQ.u(jsm1VarR.build());
        qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
        qsm1VarN.n(rsm1.g);
        hvm1VarQ.I(qsm1VarN.build());
        gvm1VarO.n(hvm1VarQ);
        b = gvm1VarO.build();
    }

    public mz10(vwm1 vwm1Var) {
        this.a = vwm1Var;
    }
}
