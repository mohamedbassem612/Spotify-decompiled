package p;

import android.os.Bundle;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qfs {
    public final rps a;
    public final mps b;
    public final String c;
    public final List d;
    public final BehaviorSubject e;
    public final List f;
    public final BehaviorSubject g;
    public final BehaviorSubject h;

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    public qfs(rps rpsVar, mps mpsVar, boolean z, String str, vf20 vf20Var) {
        Bundle bundle = vf20Var.a;
        this.a = rpsVar;
        this.b = mpsVar;
        this.c = str;
        h620 j620Var = h620.b;
        h620 h620Var = h620.c;
        h620 h620Var2 = h620.a;
        h620 h620Var3 = z ? h620Var2 : null;
        h620 h620Var4 = h620.d;
        this.d = f46.i0(new p620[]{j620Var, h620Var, h620Var3, h620Var4});
        String string = bundle.getString("episodeUri");
        if (string == null || string.length() == 0 || bundle.getBoolean("filters_override_reset", false)) {
            if (bundle.getBoolean("enable_downloads_filter", false) && !bundle.getBoolean("filters_override_reset", false) && z) {
                j620Var = h620Var2;
            } else {
                ywb0 ywb0VarU = mpsVar.a.u();
                lps lpsVar = (lps) (ywb0VarU != null ? ywb0VarU.get(str) : null);
                if (lpsVar != null && !(lpsVar instanceof bps)) {
                    if (lpsVar instanceof wos) {
                        j620Var = h620Var2;
                    } else if (lpsVar instanceof hps) {
                        j620Var = h620Var;
                    } else if (lpsVar instanceof kps) {
                        j620Var = h620Var4;
                    } else {
                        if (!(lpsVar instanceof eps)) {
                            eg.o();
                            throw null;
                        }
                        j620Var = new j620(((eps) lpsVar).a);
                    }
                }
            }
        }
        this.e = BehaviorSubject.g(j620Var);
        this.f = p7h.M(new xfa1[]{xfa1.b, xfa1.c, xfa1.a});
        this.g = BehaviorSubject.g(d7p1.i(rpsVar, str));
        this.h = BehaviorSubject.g(d281.a);
    }
}
