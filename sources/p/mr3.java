package p;

import androidx.compose.ui.geometry.Offset;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mr3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr3(String str, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                b261.p((e261) obj, Collections.singletonList(new epo(str, new ge3(iu30Var, (byte) 4))));
                break;
            case 1:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                if (str != null) {
                    b261.p(e261Var, Collections.singletonList(new epo(str, new lck(iu30Var, (byte) 12))));
                }
                break;
            case 2:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                if (str != null) {
                    b261.p(e261Var2, Collections.singletonList(new epo(str, new lck(iu30Var, (byte) 15))));
                }
                break;
            case 3:
                ((Boolean) obj).getClass();
                iu30Var.invoke(new y820(str));
                break;
            case 4:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 0);
                if (str != null) {
                    b261.n(e261Var3, str);
                }
                b261.g(e261Var3, (String) null, new ebg0(iu30Var, (byte) 27));
                break;
            case 5:
                b261.p((e261) obj, Collections.singletonList(new epo(str, new g0s0(iu30Var, (byte) 16))));
                break;
            case 6:
                long j = ((Offset) obj).a;
                iu30Var.invoke(new bnu0(str));
                break;
            default:
                e261 e261Var4 = (e261) obj;
                b261.n(e261Var4, str);
                iu30Var.invoke(e261Var4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr3(iu30 iu30Var, String str, byte b) {
        super(1);
        this.a = b;
        this.c = iu30Var;
        this.b = str;
    }
}
