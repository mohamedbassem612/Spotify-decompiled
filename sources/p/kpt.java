package p;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import io.branch.referral.validators.IntegrationValidatorDialogRowItem;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class kpt implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kpt(IntegrationValidatorDialogRowItem integrationValidatorDialogRowItem, Context context) {
        this.a = (byte) 3;
        this.b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ppt) obj).k1();
                return;
            case 1:
                o5x o5xVar = (o5x) obj;
                view.sendAccessibilityEvent(TlsSocketProvider.READ_BUFFER_SIZE);
                k4x k4xVar = o5xVar.V0;
                p5x p5xVar = o5xVar.Z0;
                if (p5xVar != null) {
                    k4xVar.invoke(o5xVar, p5xVar);
                    return;
                } else {
                    u890.C("emojiViewItem");
                    throw null;
                }
            case 2:
                GlueToolbarLayout.a((GlueToolbarLayout) obj, view);
                return;
            case 3:
                Context context = (Context) obj;
                int i = IntegrationValidatorDialogRowItem.a;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("null\n");
                TextView textView = new TextView(context);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setGravity(1);
                textView.setText(Html.fromHtml("<a href=null</a>"));
                builder.setView(textView);
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new js80());
                builder.create().show();
                return;
            case 4:
                ((gxp0) obj).N0().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(nik1.b2.a)));
                return;
            case 5:
                esa1 esa1Var = (esa1) obj;
                v9h1 v9h1Var = (v9h1) esa1Var.c;
                i8h1 i8h1Var = v9h1Var.b;
                String str = v9h1Var.a.a;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-podcast-empty";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("browse_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str2 = v9h1.c;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str2 == null) {
                    str2 = "";
                }
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                ((gnd1) esa1Var.b).a.f(new dwn0(gnd1.b, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return;
            case 6:
                ((uk4) obj).v(view);
                return;
            default:
                ((ail1) obj).cancel();
                return;
        }
    }

    public /* synthetic */ kpt(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
