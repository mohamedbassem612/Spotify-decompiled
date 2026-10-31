package p;

import com.spotify.intentrouter.core.MatcherCollisionException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jeh {
    public final tmc0 a;
    public final zdh b;
    public ieh c;

    public jeh(tmc0 tmc0Var, zdh zdhVar) {
        this.a = tmc0Var;
        this.b = zdhVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.intentrouter.core.MatcherCollisionException */
    public final boolean a(qs31 qs31Var) throws MatcherCollisionException {
        List listC = this.a.c(qs31Var);
        if (listC.size() == 0) {
            ieh iehVar = this.c;
            if (iehVar != null) {
                iehVar.a(qs31Var);
            }
            return false;
        }
        if (listC.size() > 1) {
            ieh iehVar2 = this.c;
            if (iehVar2 != null) {
                iehVar2.c(qs31Var, listC);
            }
            throw MatcherCollisionException.a(qs31Var, listC);
        }
        qy8 qy8Var = (qy8) listC.get(0);
        ieh iehVar3 = this.c;
        if (iehVar3 != null) {
            iehVar3.b(qs31Var, qy8Var);
        }
        this.b.c(qy8Var.b.g(qs31Var));
        return true;
    }
}
