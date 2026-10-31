package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class akb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ akb0(byte b, Context context, ven0 ven0Var) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = context;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Context context = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent);
                break;
            case 1:
                ven0Var.setValue(Boolean.FALSE);
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent2);
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent3.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent3);
                break;
        }
        return rih1Var;
    }
}
