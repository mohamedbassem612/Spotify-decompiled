package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q4z0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4z0(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        mrz0 mrz0Var = null;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.t(e261Var, 0);
                return rih1Var;
            case 1:
                return ((uyk0) obj).e(str);
            case 2:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.c(e261Var2);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                ((qv00) obj).a(str, hll.class, false);
                return rih1Var;
            case 5:
                d441 d441VarG1 = ((y341) obj).g1("\n            SELECT *\n            FROM RateLimitedEvents\n            WHERE eventName = ?\n        ");
                try {
                    d441VarG1.K(1, str);
                    int iW = y7y0.w(d441VarG1, "eventName");
                    int iW2 = y7y0.w(d441VarG1, "count");
                    int iW3 = y7y0.w(d441VarG1, "timestamp");
                    if (d441VarG1.f1()) {
                        String strP0 = d441VarG1.P0(iW);
                        mrz0Var = new mrz0(d441VarG1.getLong(iW3), (int) d441VarG1.getLong(iW2), strP0);
                        break;
                    }
                    return mrz0Var;
                } finally {
                    d441VarG1.close();
                }
            case 6:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, xkk1.class, false);
                qv00Var.a(str, v6v0.class, false);
                return rih1Var;
            case 7:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, mdz.class, false);
                qv00Var2.a(str, jo70.class, false);
                return rih1Var;
            case 8:
                b261.B((e261) obj, str);
                return rih1Var;
            case 9:
                ((qv00) obj).a(str, w281.class, false);
                return rih1Var;
            case 10:
                e261 e261Var3 = (e261) obj;
                if (str != null) {
                    b261.n(e261Var3, str);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                e261 e261Var4 = (e261) obj;
                if (str.length() > 0) {
                    b261.n(e261Var4, str);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                ((qv00) obj).a(str, m1b1.class, false);
                return rih1Var;
            case 14:
                ((qv00) obj).a(str, zei1.class, false);
                return rih1Var;
            case 15:
                e261 e261Var5 = (e261) obj;
                b261.F(e261Var5, true);
                b261.n(e261Var5, o7h.y0(f46.i0(new String[]{str, null}), ", ", (String) null, (String) null, (iu30) null, 62));
                return rih1Var;
            case 16:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((s1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case 18:
                b261.n((e261) obj, str);
                return rih1Var;
            case 19:
                gd2 gd2Var = (id2) ((ad2) obj).a.get(str);
                if (gd2Var == null || (gd2Var instanceof fd2)) {
                    return he2.a;
                }
                if (gd2Var instanceof gd2) {
                    gd2 gd2Var2 = gd2Var;
                    return new ke2(gd2Var2.b, gd2Var2.a);
                }
                if (gd2Var instanceof hd2) {
                    return le2.a;
                }
                eg.o();
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 21:
                e261 e261Var6 = (e261) obj;
                if (str != null) {
                    b261.n(e261Var6, str);
                }
                return rih1Var;
            case 22:
                e261 e261Var7 = (e261) obj;
                b261.c(e261Var7);
                b261.n(e261Var7, str);
                return rih1Var;
            case 23:
                return xcg1.i(((ezv0) obj).d, "_", str);
            case 24:
                z1l0 z1l0Var = (z1l0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("remove_follower", 1, Collections.singletonMap("user_to_be_removed", str)), z1l0Var.a, r6h1.c, System.currentTimeMillis());
            case 25:
                return ((v1l0) obj).e(str, (String) null);
            case 26:
                return new c1l0((i3l0) obj, str);
            case 27:
                return ((v2l0) obj).e(str);
            case 28:
                return ((v1l0) obj).e(str, (String) null);
            default:
                return ((j0l0) obj).a(str);
        }
    }
}
