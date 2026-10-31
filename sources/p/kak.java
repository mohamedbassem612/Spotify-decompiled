package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kak extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kak(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, jo70.class, false);
                qv00Var.a(str, xkk1.class, false);
                qv00Var.a(str, m6k.class, false);
                qv00Var.a(str, ydk.class, false);
                qv00Var.a(str, eek.class, false);
                qv00Var.a(str, jek.class, false);
                return rih1Var;
            case 1:
                return ((o2l0) obj).e(str);
            case 2:
                return ((o2l0) obj).e(str);
            case 3:
                return ((o2l0) obj).e(str);
            case 4:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, jek.class, false);
                qv00Var2.a(str, eek.class, false);
                return rih1Var;
            case 5:
                return str;
            case 6:
                return str;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.A(e261Var, str);
                return rih1Var;
            case 9:
                qv00 qv00Var3 = (qv00) obj;
                qv00Var3.a(str, hzy.class, false);
                qv00Var3.a(str, jo70.class, false);
                qv00Var3.a(str, xkk1.class, false);
                return rih1Var;
            case 10:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 11:
                qv00 qv00Var4 = (qv00) obj;
                qv00Var4.a(str, iam.class, false);
                qv00Var4.a(str, jo70.class, false);
                qv00Var4.a(str, xkk1.class, false);
                qv00Var4.a(str, hll.class, false);
                qv00Var4.a(str, w281.class, false);
                qv00Var4.a(str, va81.class, false);
                qv00Var4.a(str, cd8.class, false);
                qv00Var4.a(str, c98.class, false);
                qv00Var4.a(str, zoy0.class, false);
                return rih1Var;
            case 12:
                ((qv00) obj).a(str, mtl.class, false);
                return rih1Var;
            case 13:
                ((qv00) obj).a(str, mdz.class, false);
                return rih1Var;
            case 14:
                return gg.R((Bundle) obj, str);
            case 15:
                e261 e261Var2 = (e261) obj;
                b261.t(e261Var2, 0);
                if (str != null) {
                    b261.A(e261Var2, str);
                }
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                b261.A((e261) obj, str);
                return rih1Var;
            case 20:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((qzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 21:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((rzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                e261 e261Var3 = (e261) obj;
                b261.c(e261Var3);
                b261.n(e261Var3, str);
                return rih1Var;
            case 24:
                return str;
            case 25:
                return ((o3m0) obj).n(str);
            case 26:
                return ((o3m0) obj).h(str);
            case 27:
                return ((o3m0) obj).a(str);
            case 28:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                return ((o3m0) obj).h(str);
        }
    }
}
