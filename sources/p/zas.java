package p;

import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zas extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ vwm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zas(vwm1 vwm1Var, z72 z72Var) {
        super(1);
        this.b = vwm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x006b  */
    public final Object invoke(Object obj) {
        Long lValueOf;
        byte b = this.a;
        vwm1 vwm1Var = this.b;
        switch (b) {
            case 0:
                eom0 eom0Var = (eom0) obj;
                zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
                zsm1VarP.n(eom0Var.a);
                uji1 uji1VarE = vwm1Var.e((YourLibraryDecorateRequest) zsm1VarP.build());
                gvm1 gvm1VarO = YourLibraryRequest.o();
                gvm1VarO.t(500);
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                hvm1VarQ.C(200);
                jsm1 jsm1VarR = YourLibraryConfig$YourLibraryFilters.r();
                jsm1VarR.n(p7h.M(new ksm1[]{ksm1.PLAYLIST, ksm1.FOLDER}));
                hvm1VarQ.u((YourLibraryConfig$YourLibraryFilters) jsm1VarR.build());
                String str = eom0Var.b;
                if (str == null) {
                    lValueOf = null;
                } else {
                    Set set = s4b1.f;
                    String strF = uic.x(str).f();
                    if (strF == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(exd0.t(strF));
                    }
                }
                if (lValueOf != null) {
                    hvm1VarQ.v(lValueOf.longValue());
                }
                gvm1VarO.n(hvm1VarQ);
                return new x010(uji1VarE, vwm1Var.d((YourLibraryRequest) gvm1VarO.build()), new mnl(3, (lnm) null, (byte) 13), (byte) 1);
            default:
                zsm1 zsm1VarP2 = YourLibraryDecorateRequest.p();
                zsm1VarP2.q(((nc21) obj).a);
                return vwm1Var.e((YourLibraryDecorateRequest) zsm1VarP2.build());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zas(vwm1 vwm1Var) {
        super(1);
        this.b = vwm1Var;
    }
}
