package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kg30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mg30 b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg30(mg30 mg30Var, Intent intent, byte b) {
        super(1);
        this.a = b;
        this.b = mg30Var;
        this.c = intent;
    }

    public final Object invoke(Object obj) {
        String string;
        byte b = this.a;
        deh dehVar = deh.a;
        e6w0 e6w0Var = a6w0.a;
        Intent intent = this.c;
        mg30 mg30Var = this.b;
        switch (b) {
            case 0:
                mg30Var.b.a(((grn0) obj).a, intent, e6w0Var);
                return dehVar;
            case 1:
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setComponent(intent.getComponent());
                String strD = ((ern0) obj).a.D();
                intent2.setData(strD != null ? Uri.parse(strD) : null);
                intent2.putExtra("is_internal_navigation", true);
                String stringExtra = intent.getStringExtra("navigation_transaction_id");
                if (stringExtra != null) {
                    intent2.putExtra("navigation_transaction_id", stringExtra);
                }
                mg30Var.c.accept(intent2);
                return dehVar;
            case 2:
                return mg30Var.a((frn0) obj, intent, e6w0Var);
            default:
                hrn0 hrn0Var = (hrn0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("page_key", hrn0Var.a.getName());
                bundle.putParcelable("parameters", hrn0Var.b);
                Bundle extras = intent.getExtras();
                if (extras != null && (string = extras.getString("result-receiver-id")) != null) {
                    bundle.putString("result-receiver-id", string);
                }
                return mg30Var.a(new frn0(bundle, m6r0.class), intent, hrn0Var.c);
        }
    }
}
