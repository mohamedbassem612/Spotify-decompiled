package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class adr implements dyf0 {
    public final k9r a;
    public final byp b;
    public final xap c;
    public final poj0 d;
    public final x2g1 e;
    public final h0y f;
    public final uz71 g;

    public adr(k9r k9rVar, byp bypVar, xap xapVar, poj0 poj0Var, x2g1 x2g1Var, h0y h0yVar, uz71 uz71Var, zbo0 zbo0Var) {
        this.a = k9rVar;
        this.b = bypVar;
        this.c = xapVar;
        this.d = poj0Var;
        this.e = x2g1Var;
        this.f = h0yVar;
        this.g = uz71Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    public final void a(Intent intent) {
        String str;
        String stringExtra;
        Bundle extras;
        String strY0;
        Intent intent2 = (Intent) ila0.s(intent, "deeplink.original.intent", Intent.class);
        if (intent2 == null) {
            intent2 = intent;
        }
        boolean z = poj0.w(intent2) || (intent2 != intent && poj0.w(intent));
        if (intent2.getBooleanExtra("intent_logged", false)) {
            return;
        }
        poj0 poj0Var = this.d;
        if (!poj0Var.x(intent2) || poj0.z(intent2) || poj0.y(intent2) || z) {
            String dataString = intent2.getDataString();
            String strB = "";
            String str2 = dataString == null ? "" : dataString;
            xap xapVar = this.c;
            String strE = xapVar.e(intent2);
            String str3 = strE == null ? "" : strE;
            if (this.g.f(str2) || !poj0Var.v(str3, intent2)) {
                return;
            }
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str2);
            if (!this.f.c(intent2)) {
                String strZ = s4b1VarX.z();
                if (strZ != null) {
                    str = strZ;
                }
                String stringExtra2 = intent2.getStringExtra("short_link");
                String stringExtra3 = intent2.getStringExtra("shortlink_source");
                String strB2 = this.e.a.b();
                stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("extra_deeplink_navigation_reference");
                }
                this.a.r(new xcr(str2, str, stringExtra2, stringExtra3, str3, strB2, stringExtra));
                intent2.putExtra("intent_logged", true);
                String action = intent2.getAction();
                String str4 = intent2.getPackage();
                String strC = xapVar.c();
                String dataString2 = intent2.getDataString();
                extras = intent2.getExtras();
                if (extras != null) {
                    strY0 = o7h.y0(extras.keySet(), "\n         ", (String) null, (String) null, new zcr(extras, (byte) 0), 30);
                } else {
                    strY0 = "—";
                }
                StringBuilder sbN = gvg.n("\n      =============================================================\n      action: ", action, " package: ", str4, "\n      authority: ");
                bb00.j(sbN, strC, "\n      link: ", dataString2, "\n      Extras:\n         ");
                sbN.append(strY0);
                sbN.append("\n    ");
                jhc1.J(sbN.toString());
                this.b.y();
            }
            strB = h0y.b(intent2);
            str = strB;
            String stringExtra4 = intent2.getStringExtra("short_link");
            String stringExtra5 = intent2.getStringExtra("shortlink_source");
            String strB3 = this.e.a.b();
            stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("extra_deeplink_navigation_reference");
            }
            this.a.r(new xcr(str2, str, stringExtra4, stringExtra5, str3, strB3, stringExtra));
            intent2.putExtra("intent_logged", true);
            String action2 = intent2.getAction();
            String str5 = intent2.getPackage();
            String strC2 = xapVar.c();
            String dataString3 = intent2.getDataString();
            extras = intent2.getExtras();
            if (extras != null) {
                strY0 = o7h.y0(extras.keySet(), "\n         ", (String) null, (String) null, new zcr(extras, (byte) 0), 30);
            } else {
                strY0 = "—";
            }
            StringBuilder sbN2 = gvg.n("\n      =============================================================\n      action: ", action2, " package: ", str5, "\n      authority: ");
            bb00.j(sbN2, strC2, "\n      link: ", dataString3, "\n      Extras:\n         ");
            sbN2.append(strY0);
            sbN2.append("\n    ");
            jhc1.J(sbN2.toString());
            this.b.y();
        }
    }
}
