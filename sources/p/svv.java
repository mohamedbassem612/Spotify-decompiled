package p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class svv {
    public final ve01 a;

    public svv(q8n q8nVar, c9n c9nVar, vwm1 vwm1Var) {
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.q(true);
        hvm1VarQ.w();
        hvm1VarQ.C(Integer.MAX_VALUE);
        qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
        qsm1VarN.n(rsm1.c);
        hvm1VarQ.I(qsm1VarN.build());
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.X);
        jsm1VarR.q(ksm1.d);
        hvm1VarQ.u(jsm1VarR.build());
        gvm1VarO.n(hvm1VarQ);
        this.a = d5p1.r(o4p1.r(rqt0.u(new lt20(new e6s(vwm1Var.d(gvm1VarO.build()), (byte) 1), new re1(3, (lnm) null, (byte) 23), (byte) 0)), q8nVar), c9nVar, ey71.b, 1);
    }
}
