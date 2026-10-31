package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nlf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ bmf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlf0(bmf0 bmf0Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 0;
        this.c = bmf0Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bmf0 bmf0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                kae1 kae1Var = (kae1) obj;
                d261 d261Var = wlf0.a;
                Object an21Var = null;
                if (bmf0Var.b.length() != 0) {
                    if (!bmf0Var.n) {
                        Map map = kae1Var.a;
                        if (map.isEmpty()) {
                            map = null;
                        }
                        if (map != null) {
                            ArrayList arrayList = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                arrayList.add(new mmr0(new vhc0(((uhc0) entry.getKey()).a), new fic0(((eic0) entry.getValue()).a)));
                            }
                            an21Var = new bn21(sqg0.T(arrayList));
                        }
                    } else if (kae1Var.b) {
                        an21Var = new an21(bmf0Var.m);
                    }
                }
                if (an21Var != null) {
                    iu30Var.invoke(an21Var);
                }
                break;
            case 1:
                iu30Var.invoke(new ltf0(Collections.singletonMap(new jae(bmf0Var.a), (cn21) obj)));
                break;
            default:
                iu30Var.invoke(new ltf0(Collections.singletonMap(new jae(bmf0Var.a), (cn21) obj)));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nlf0(iu30 iu30Var, bmf0 bmf0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = bmf0Var;
    }
}
