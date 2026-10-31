package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sps extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tps b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sps(tps tpsVar, byte b) {
        super(0);
        this.a = b;
        this.b = tpsVar;
    }

    public final Object invoke() {
        byte b = this.a;
        tps tpsVar = this.b;
        switch (b) {
            case 0:
                return tpsVar.a(j4b1.a6, 2131101354);
            case 1:
                return z4p1.u(tpsVar.b, tpsVar.a(j4b1.a6, 2131101340));
            default:
                Context context = tpsVar.b;
                g4b1 drawable = context.getDrawable(2131233929);
                if (drawable != null) {
                    drawable.setTintList(x74.E(context, 2131101340));
                } else {
                    drawable = null;
                }
                if (drawable == null) {
                    drawable = tpsVar.a(j4b1.b6, 2131101340);
                }
                return z4p1.u(context, drawable);
        }
    }
}
