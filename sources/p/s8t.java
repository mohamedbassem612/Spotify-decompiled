package p;

import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.b;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s8t implements tlq0 {
    public final /* synthetic */ byte a;
    public final String b;
    public final iyc0 c;

    public /* synthetic */ s8t(String str, iyc0 iyc0Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = iyc0Var;
    }

    public final boolean a(ilq0 ilq0Var) {
        switch (this.a) {
            case 0:
                return ilq0Var instanceof r8t;
            default:
                return ilq0Var instanceof aom0;
        }
    }

    public final Object b(ilq0 ilq0Var, a941 a941Var) {
        byte b = this.a;
        xyc0 xyc0Var = this.c;
        String str = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                r8t r8tVar = (r8t) ilq0Var;
                Object objM = xyc0Var.m(str, o7h.l1(r8tVar.a), a941Var, r8tVar.b);
                return objM == d9nVar ? objM : (py21) objM;
            default:
                aom0 aom0Var = (aom0) ilq0Var;
                Set set = aom0Var.a;
                String str2 = aom0Var.b;
                if (str2 == null || str2.length() == 0) {
                    Object objI = xyc0Var.i(str, (String) null, o7h.l1(set), a941Var);
                    return objI == d9nVar ? objI : (py21) objI;
                }
                List listL1 = o7h.l1(set);
                b bVarR = ModificationRequest.r();
                bVarR.B("move");
                bVarR.n(listL1);
                bVarR.w(str2);
                ModificationRequest modificationRequest = (ModificationRequest) bVarR.build();
                modificationRequest.getClass();
                Object objJ = xyc0Var.j(str, modificationRequest, a941Var);
                if (objJ != d9nVar) {
                    objJ = (py21) objJ;
                }
                return objJ == d9nVar ? objJ : (py21) objJ;
        }
    }
}
