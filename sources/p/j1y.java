package p;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j1y implements rq21 {
    public final /* synthetic */ byte a = 1;

    public /* synthetic */ j1y() {
    }

    public final nq21 b(Intent intent) {
        byte b = this.a;
        nq21 kq21Var = mq21.a;
        switch (b) {
            case 0:
                Set set = s4b1.f;
                String strE = uic.x(intent.getDataString()).E();
                s4b1 s4b1VarX = uic.x(strE);
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f)) {
                    strE = uic.y(s4b1VarX.h()).z();
                }
                if (strE == null) {
                    strE = "<missing-uri>";
                }
                String strA = p5y.a(strE);
                i1y i1yVar = strA != null ? new i1y(uic.x(strA)) : qbo1.Y0;
                if (!(i1yVar instanceof i1y)) {
                    return kq21Var;
                }
                s4b1 s4b1Var = i1yVar.a;
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setComponent(intent.getComponent());
                String strD = s4b1Var.D();
                intent2.setData(strD != null ? Uri.parse(strD) : null);
                intent2.putExtras(intent);
                intent2.putExtra("is_internal_navigation", true);
                String strZ = s4b1Var.z();
                return new kq21(strZ != null ? strZ : "", new drn0(intent2));
            default:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    dataString = "";
                }
                jxu0 jxu0VarC = oxu0.a.c(dataString);
                jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
                if (u890.j(jxu0Var != null ? jxu0Var.a : null, "listening-party")) {
                    Set set2 = s4b1.f;
                    s4b1 s4b1VarX2 = uic.x("spotify:room:" + jxu0Var.b);
                    String strZ2 = s4b1VarX2.z();
                    kq21Var = new kq21(strZ2 != null ? strZ2 : "", new ern0(s4b1VarX2));
                }
                return kq21Var;
        }
    }

    public j1y(fza fzaVar) {
    }
}
