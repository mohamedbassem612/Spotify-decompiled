package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nyd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyd1(Context context, iu30 iu30Var) {
        super(1);
        this.b = context;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                iu30Var.invoke(new kyd1(str));
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                break;
            default:
                String str2 = (String) obj;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                }
                iu30Var.invoke(str2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyd1(iu30 iu30Var, Context context) {
        super(1);
        this.c = iu30Var;
        this.b = context;
    }
}
