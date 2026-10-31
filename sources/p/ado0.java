package p;

import java.util.ArrayList;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ado0 implements iu30 {
    public static final ado0 b = new ado0(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ ado0(byte b2) {
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("When NoOp is injected is because decoration is not supported in the page, so dev error");
            default:
                YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) obj;
                tr80 tr80VarQ = yourLibraryDecorateResponse.a() == 0 ? tr80.d : yoi1.Q(0, yourLibraryDecorateResponse.a());
                ArrayList arrayListF = u1p1.F(yourLibraryDecorateResponse.o());
                int iA = yourLibraryDecorateResponse.a();
                boolean zO = yourLibraryDecorateResponse.p().o();
                z6x z6xVar = z6x.a;
                return new svc0(12, new i8e0(iA, tr80VarQ, arrayListF, z6xVar, z6xVar, zO, 0));
        }
    }
}
