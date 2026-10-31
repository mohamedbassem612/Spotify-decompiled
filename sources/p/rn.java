package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rn implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public rn(sn snVar, int i, n5 n5Var) {
        this.a = (byte) 0;
        this.c = snVar;
        this.b = i;
        this.d = n5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ycc1 ycc1Var = ((sn) obj2).V0;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                ((n5) obj).invoke(new kn(ycc1Var.h(new rt80(yon1.G1("LOGIN_WELCOME", "login/welcome", 965, "login").a, i))));
                return;
            case 1:
                String str2 = (String) obj2;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                tva tvaVar = (tva) obj;
                Context context = tvaVar.a;
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    Toast.makeText(context, 2131955680, 1).show();
                    return;
                }
                context.startActivity(intent);
                rm5 rm5Var = tvaVar.c;
                y6h1 y6h1Var = ((urk0) rm5Var.a).b;
                i8h1 i8h1Var = (i8h1) rm5Var.b;
                int iC = l1d.C(i);
                b7x b7xVar = b7x.a;
                if (iC == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("social_wikipedia_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                if (iC == 1) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("social_facebook_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var2, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                if (iC == 2) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("social_twitter_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var3, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                if (iC == 3) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("social_instagram_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var4, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                if (iC == 4) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("social_whatsapp_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    y6h1 y6h1VarA5 = x6h1VarC5.a();
                    z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var5, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA5, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                if (iC == 5) {
                    x6h1 x6h1VarC6 = y6h1Var.c();
                    x6h1VarC6.i.add(new a7h1("social_tiktok_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = true;
                    y6h1 y6h1VarA6 = x6h1VarC6.a();
                    z7h1 z7h1Var6 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    i8h1Var.m(new w7h1("", "", z7h1Var6, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA6, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                switch (i) {
                    case 1:
                        str = "WIKIPEDIA";
                        break;
                    case 2:
                        str = "FACEBOOK";
                        break;
                    case 3:
                        str = "TWITTER";
                        break;
                    case 4:
                        str = "INSTAGRAM";
                        break;
                    case 5:
                        str = "WHATSAPP";
                        break;
                    case 6:
                        str = "TIKTOK";
                        break;
                    default:
                        throw null;
                }
                Logger.k("No UBI interaction event defined for Click on social link of type: %s", new Object[]{str});
                return;
            case 2:
                ((g1b0) obj2).W0.invoke((q1b0) obj, Integer.valueOf(i));
                return;
            case 3:
                ((h1b0) obj2).V0.invoke((r1b0) obj, Integer.valueOf(i));
                return;
            case 4:
                ((vu30) ((q4e) obj2).f).invoke((String) obj, Integer.valueOf(i));
                return;
            default:
                wvx0 wvx0Var = (wvx0) obj;
                ((kvc1) obj2).e.invoke(wvx0Var.a, wvx0Var.b, Integer.valueOf(i));
                return;
        }
    }

    public /* synthetic */ rn(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
