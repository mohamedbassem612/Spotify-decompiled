package p;

import android.net.Uri;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ezv implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ma41 b;

    public /* synthetic */ ezv(ma41 ma41Var, byte b) {
        this.a = b;
        this.b = ma41Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = null;
        vb41 vb41Var = this.b;
        switch (b) {
            case 0:
                vb41Var.g.onNext(db41.a);
                break;
            case 1:
                xyv xyvVar = (xyv) obj;
                String str2 = xyvVar.b;
                String str3 = xyvVar.c;
                if (str3 != null) {
                    String path = Uri.parse(str3).getPath();
                    str = path == null ? "" : path;
                }
                String str4 = xyvVar.f;
                String str5 = xyvVar.g;
                Boolean bool = xyvVar.h;
                Integer num = xyvVar.e;
                String str6 = xyvVar.d;
                vb41 vb41Var2 = vb41Var;
                vb41Var2.l = true;
                vb41Var2.a();
                vb41Var2.a.c(new tb41(vb41Var2, str2, str, str4, str5, bool, num, str6));
                break;
            default:
                cyw0 cyw0Var = (cyw0) obj;
                String str7 = cyw0Var.a;
                String str8 = cyw0Var.b;
                if (str8 != null) {
                    String path2 = Uri.parse(str8).getPath();
                    str = path2 == null ? "" : path2;
                }
                vb41 vb41Var3 = vb41Var;
                vb41Var3.l = true;
                vb41Var3.a();
                vb41Var3.a.c(new tb41(vb41Var3, str7, str, null, null, null, null, null));
                break;
        }
    }
}
