package p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iu8 {
    public final mwm1 a;
    public final YourLibraryRequest b;

    public iu8(mwm1 mwm1Var) {
        this.a = mwm1Var;
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.e);
        hvm1VarQ.t(jsm1VarR);
        hvm1VarQ.q(true);
        hvm1VarQ.L();
        hvm1VarQ.C(1);
        gvm1VarO.n(hvm1VarQ);
        this.b = gvm1VarO.build();
    }
}
