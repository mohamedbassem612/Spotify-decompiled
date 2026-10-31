package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f0n extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0n(String str, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                b261.p((e261) obj, Collections.singletonList(new epo(str, new ugj(function0, (byte) 29))));
                break;
            case 1:
                if (str.length() == 4) {
                    function0.invoke();
                }
                break;
            case 2:
                b261.p((e261) obj, Collections.singletonList(new epo(str, new aba0(function0, (byte) 21))));
                break;
            case 3:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.x(e261Var, 0);
                b261.g(e261Var, (String) null, new lpx0(function0, (byte) 16));
                break;
            default:
                e261 e261Var2 = (e261) obj;
                b261.i(e261Var2, str, new sah1(function0, (byte) 13));
                b261.p(e261Var2, Collections.singletonList(new epo(str, new sah1(function0, (byte) 14))));
                break;
        }
        return rih1Var;
    }
}
