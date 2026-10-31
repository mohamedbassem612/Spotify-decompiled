package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class irf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ irf(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                e261 e261Var = (e261) obj;
                b261.a(e261Var);
                b261.A(e261Var, str);
                return rih1Var;
            case 4:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 5:
                ((qv00) obj).a(str, ddz.class, false);
                return rih1Var;
            case 6:
                ((qv00) obj).a(str, be60.class, false);
                return rih1Var;
            case 7:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 8:
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("make_playlist_non_collaborative", 1, Collections.singletonMap("playlist_to_be_made_non_collaborative", str)), ((y2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 9:
                e261 e261Var2 = (e261) obj;
                b261.c(e261Var2);
                b261.A(e261Var2, str);
                return rih1Var;
            case 10:
                b261.n((e261) obj, str);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.B(e261Var3, "replies_remaining_button");
                return rih1Var;
            case grn1.d /* 12 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                b261.n((e261) obj, str);
                return rih1Var;
            case 14:
                ((qv00) obj).a(str, s78.class, false);
                return rih1Var;
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case 18:
                b261.n((e261) obj, str);
                return rih1Var;
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 21:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                b261.n((e261) obj, str);
                return rih1Var;
            case 24:
                e261 e261Var4 = (e261) obj;
                b261.A(e261Var4, str);
                b261.x(e261Var4, 2);
                return rih1Var;
            case 25:
                b261.A((e261) obj, str);
                return rih1Var;
            case 26:
                b261.n((e261) obj, str);
                return rih1Var;
            case 27:
                e261 e261Var5 = (e261) obj;
                b261.n(e261Var5, str);
                b261.y(e261Var5, true);
                return rih1Var;
            case 28:
                e261 e261Var6 = (e261) obj;
                b261.n(e261Var6, str);
                b261.B(e261Var6, "reply_preview_row_button");
                return rih1Var;
            default:
                return ((o2l0) obj).e(str);
        }
    }
}
