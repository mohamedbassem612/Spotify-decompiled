package p;

import io.reactivex.rxjava3.core.Observable;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class koy0 {
    public static final YourLibraryRequest b;
    public final vwm1 a;

    static {
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.q(true);
        hvm1VarQ.w();
        hvm1VarQ.C(Integer.MAX_VALUE);
        jsm1 jsm1VarR = YourLibraryConfig$YourLibraryFilters.r();
        jsm1VarR.q(ksm1.PLAYLIST);
        jsm1VarR.q(ksm1.PUBLISHED);
        hvm1VarQ.u((YourLibraryConfig$YourLibraryFilters) jsm1VarR.build());
        gvm1VarO.n(hvm1VarQ);
        b = (YourLibraryRequest) gvm1VarO.build();
    }

    public koy0(vwm1 vwm1Var) {
        this.a = vwm1Var;
    }

    public final Observable a() {
        return yoi1.i(new ir9(z4p1.v(rqt0.u(new e6s(this.a.d(b), (byte) 8)), 1), (byte) 7), o6x.a);
    }
}
