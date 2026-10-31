package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z9b0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9b0(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).j(str);
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                b261.n(e261Var, str);
                return rih1Var;
            case 5:
                ((qv00) obj).a(str, va81.class, false);
                return rih1Var;
            case 6:
                b261.n((e261) obj, str);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                ((qv00) obj).a(str, ddz.class, false);
                return rih1Var;
            case 10:
                return dm61.x0(str, (Set) obj);
            case 11:
                return dm61.u0(str, (Set) obj);
            case 12:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                b261.n((e261) obj, str);
                return rih1Var;
            case 14:
                d441 d441VarG1 = ((y341) obj).g1("SELECT EXISTS(SELECT 1 FROM lyrics_entities WHERE track_id = ?)");
                try {
                    d441VarG1.K(1, str);
                    Boolean boolValueOf = null;
                    if (d441VarG1.f1()) {
                        Integer numValueOf = d441VarG1.isNull(0) ? null : Integer.valueOf((int) d441VarG1.getLong(0));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        break;
                    }
                    return boolValueOf;
                } finally {
                    d441VarG1.close();
                }
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case 17:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.t(e261Var2, 0);
                return rih1Var;
            case 18:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.c(e261Var3);
                return rih1Var;
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case 20:
                e261 e261Var4 = (e261) obj;
                b261.n(e261Var4, str);
                b261.t(e261Var4, 0);
                return rih1Var;
            case 21:
                return ((Context) obj).getString(2131958439, str);
            case 22:
                ((qv00) obj).a(str, z1g1.class, false);
                return rih1Var;
            case 23:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 24:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                b261.n((e261) obj, str);
                return rih1Var;
            case 27:
                return ((w2l0) obj).e(str);
            case 28:
                return ((w2l0) obj).h(str);
            default:
                b261.n((e261) obj, str);
                return rih1Var;
        }
    }
}
