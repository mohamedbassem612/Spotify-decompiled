package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v2z implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public v2z(g610 g610Var, String str, String str2) {
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
    }

    public final Object apply(Object obj) {
        l1z l1zVar;
        byte b = this.a;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                tv00 tv00VarA = ((uv00) obj).a(l1z.class, str2);
                return (tv00VarA.c.a && (l1zVar = tv00VarA.b) != null && l1zVar.b) ? new hq21(str2) : new hq21(str);
            case 1:
                Object lj3Var = (nj3) obj;
                hj3 hj3Var = hj3.d;
                hj3 hj3Var2 = hj3.c;
                if (str2.length() <= 0) {
                    if (lj3Var instanceof kj3) {
                        lj3Var = new kj3(hj3Var2);
                    } else if (lj3Var instanceof lj3) {
                        lj3Var = new lj3(hj3Var);
                    }
                }
                boolean z = lj3Var instanceof kj3;
                tjv tjvVar = tjv.a;
                if (z) {
                    dsa0 dsa0Var = ((kj3) lj3Var).a;
                    if (dsa0Var instanceof ij3) {
                        return new qjv(((ij3) dsa0Var).c);
                    }
                    if (!u890.j(dsa0Var, hj3Var2)) {
                        n57.e("Unexpected Liked destination in constrained path.");
                        return tjvVar;
                    }
                    Set set = s4b1.f;
                    if (uic.x(str).c == blc0.ti) {
                        return new qjv("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
                    }
                    return (uic.x(str).c == blc0.Pg || uic.x(str).c == blc0.ed || uic.x(str).c == blc0.M3) ? new qjv("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") : pjv.a;
                }
                if (!(lj3Var instanceof lj3)) {
                    n57.e("Unexpected curation event type in constrained path.");
                    return tjvVar;
                }
                dsa0 dsa0Var2 = ((lj3) lj3Var).a;
                if (dsa0Var2 instanceof jj3) {
                    return new sjv(((jj3) dsa0Var2).c);
                }
                if (!u890.j(dsa0Var2, hj3Var)) {
                    n57.e("Unexpected RemovedLike destination in constrained path.");
                    return tjvVar;
                }
                Set set2 = s4b1.f;
                if (uic.x(str).c == blc0.ti) {
                    return new sjv("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
                }
                return (uic.x(str).c == blc0.Pg || uic.x(str).c == blc0.ed || uic.x(str).c == blc0.M3) ? new sjv("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") : rjv.a;
            default:
                return new uo91(str, (List) obj, str2);
        }
    }

    public /* synthetic */ v2z(String str, String str2, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
    }
}
