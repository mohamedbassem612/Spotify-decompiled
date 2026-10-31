package p;

import com.spotify.messages.AdUnlockedOnDemand;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s52 implements rqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s52(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                yq80 yq80Var = (yq80) obj;
                pje1 pje1VarA = yq80Var.a();
                if (pje1VarA == null) {
                    return null;
                }
                return (w7h1) ((xu30) this.b).invoke(hap1.k(pje1VarA, op80Var), yq80Var, obj3);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((yq80) obj).a() != null;
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        int i;
        switch (this.a) {
            case 0:
                res resVar = (res) this.b;
                ce31 ce31Var = (ce31) resVar.h;
                x52 x52Var = (x52) resVar.g;
                String str = x52Var.b;
                if (str.length() == 0) {
                    i = 6;
                } else {
                    i = (ihc1.h0(str, "spotify:search", false) || u890.j(x52Var.a, str)) ? 2 : 1;
                }
                ce31Var.b = UUID.randomUUID().toString();
                ce31Var.c = i;
                c01 c01VarN = AdUnlockedOnDemand.n();
                c01VarN.n(b01.b);
                c01VarN.s(ce31Var.b);
                ce31Var.b(c01VarN);
                ce31Var.a.a(c01VarN.build());
                return null;
            default:
                pje1 pje1VarA = ((yq80) obj).a();
                if (pje1VarA != null) {
                    return hap1.k(pje1VarA, op80Var).e();
                }
                return null;
        }
    }
}
