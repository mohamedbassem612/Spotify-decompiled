package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h3h extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i3h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3h(i3h i3hVar, byte b) {
        super(0);
        this.a = b;
        this.b = i3hVar;
    }

    public final Object invoke() {
        byte b = this.a;
        i3h i3hVar = this.b;
        switch (b) {
            case 0:
                ltm1 ltm1Var = i3hVar.b;
                Context context = i3hVar.a;
                ltm1Var.getClass();
                return ltm1.b(context);
            case 1:
                ltm1 ltm1Var2 = i3hVar.b;
                Context context2 = i3hVar.a;
                ltm1Var2.getClass();
                return ltm1.d(context2);
            default:
                ltm1 ltm1Var3 = i3hVar.b;
                Context context3 = i3hVar.a;
                ltm1Var3.getClass();
                return ltm1.e(context3);
        }
    }
}
