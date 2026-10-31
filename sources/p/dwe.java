package p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dwe extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ewe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwe(ewe eweVar, byte b) {
        super(1);
        this.a = b;
        this.b = eweVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        ewe eweVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                i8h1 i8h1Var = (i8h1) ((ynb0) eweVar.e).get();
                x6h1 x6h1VarC = ((dsk0) eweVar.h).b.c();
                x6h1VarC.i.add(new a7h1("terms_of_use_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                try {
                    ((gj5) eweVar.c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (ActivityNotFoundException unused) {
                }
                break;
            default:
                String str2 = (String) obj;
                i8h1 i8h1Var2 = (i8h1) ((ynb0) eweVar.e).get();
                x6h1 x6h1VarC2 = ((dsk0) eweVar.h).b.c();
                x6h1VarC2.i.add(new a7h1("platform_rules_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                try {
                    ((gj5) eweVar.c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                } catch (ActivityNotFoundException unused2) {
                }
                break;
        }
        return rih1Var;
        return rih1Var;
    }
}
