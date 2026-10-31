package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rbg extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbg b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbg(sbg sbgVar, Context context, byte b) {
        super(0);
        this.a = b;
        this.b = sbgVar;
        this.c = context;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        Context context = this.c;
        sbg sbgVar = this.b;
        switch (b) {
            case 0:
                a680 a680Var = sbgVar.d;
                x6h1 x6h1VarC = ((dsk0) a680Var.f).b.c();
                x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) ((z1p) a680Var.e).get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("close_app", 1, Collections.singletonMap("app", "music")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                boolean zA = ((rf4) ((dg8) a680Var.d).b).a();
                cce cceVar = (cce) a680Var.a;
                if (!zA) {
                    ((lzn0) cceVar.c).d(blc0.L3);
                } else {
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null) {
                        activity.finishAffinity();
                    }
                }
                break;
            default:
                a680 a680Var2 = sbgVar.d;
                x6h1 x6h1VarC2 = ((dsk0) a680Var2.f).b.c();
                x6h1VarC2.i.add(new a7h1("update_payment_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((i8h1) ((z1p) a680Var2.e).get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_update_payment&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                context.startActivity(swv0.b((swv0) ((cce) a680Var2.a).b, context, new rwv0(exf.b, "Update payment", Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_update_payment&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls"))));
                break;
        }
        return rih1Var;
    }
}
