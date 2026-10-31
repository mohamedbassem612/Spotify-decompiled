package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s9x implements g50 {
    public final /* synthetic */ byte a;
    public final dg30 b;
    public final qnv0 c;
    public final kt91 d;
    public final Scheduler e;
    public final vku f;

    public s9x(dg30 dg30Var, qnv0 qnv0Var, kt91 kt91Var, Scheduler scheduler, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = dg30Var;
                this.c = qnv0Var;
                this.d = kt91Var;
                this.e = scheduler;
                this.f = new vku();
                ((f0i) dg30Var).a.a(new i83(this, (byte) 24));
                break;
            default:
                this.b = dg30Var;
                this.c = qnv0Var;
                this.d = kt91Var;
                this.e = scheduler;
                this.f = new vku();
                ((f0i) dg30Var).a.a(new i83(this, (byte) 5));
                break;
        }
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        byte b = this.a;
        Scheduler scheduler = this.e;
        vku vkuVar = this.f;
        gfe gfeVar = gfe.a;
        gfe gfeVar2 = gfe.b;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (lowerCase.equals("push")) {
                    gfeVar = gfeVar2;
                } else if (!lowerCase.equals("email")) {
                    gfeVar = gfe.c;
                }
                String string = bundle.getString("PAGE_URI");
                vkuVar.a(this.c.a(gfeVar, 2, string != null ? string : "").n(scheduler).subscribe(new f72(this, (byte) 18), dxu.h));
                break;
            default:
                w1q0Var.invoke(Boolean.TRUE);
                List listQ0 = ihc1.Q0(str2, new String[]{":"}, 0, 6);
                if (listQ0.size() != 4) {
                    Logger.d("ToggleNotificationPreferenceActionHandler", new Object[]{f4i1.c(listQ0.size(), "Invalid URI format: expected 4 parameters (client:channel:category:enable), got ")});
                } else {
                    String str3 = (String) listQ0.get(1);
                    String str4 = (String) listQ0.get(2);
                    String str5 = (String) listQ0.get(3);
                    mmq0 mmq0VarJ = wm5.J(str4);
                    if (mmq0VarJ != null) {
                        boolean zS = nhc1.S(str5, "enable", true);
                        smq0[] smq0VarArr = (smq0[]) ((nhc1.S(str3, "ALL", true) || nhc1.S(str3, "BOTH", true)) ? p7h.M(new smq0[]{new smq0(gfeVar2, mmq0VarJ, zS), new smq0(gfeVar, mmq0VarJ, zS)}) : Collections.singletonList(new smq0(wm5.I(str3), mmq0VarJ, zS))).toArray(new smq0[0]);
                        smq0[] smq0VarArr2 = (smq0[]) Arrays.copyOf(smq0VarArr, smq0VarArr.length);
                        String string2 = bundle.getString("PAGE_URI");
                        vkuVar.a(this.c.d(smq0VarArr2, 2, string2 == null ? "" : string2, false, null).n(scheduler).subscribe(new ruz0(this, (byte) 20), iqa1.R0));
                    } else {
                        Logger.d("ToggleNotificationPreferenceActionHandler", new Object[]{gvg.h("Unknown category or channel: ", str4, ", ", str3)});
                    }
                }
                break;
        }
    }
}
