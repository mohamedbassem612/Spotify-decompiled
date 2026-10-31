package p;

import android.app.Application;
import j$.net.URLEncoder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u implements jly0 {
    public final /* synthetic */ byte a;
    public final jly0 b;
    public final jo80 c;

    public /* synthetic */ u(Object obj, jly0 jly0Var, jo80 jo80Var, byte b) {
        this.a = b;
        this.b = jly0Var;
        this.c = jo80Var;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        String strF = "https://live.ravelin.click/v2/";
        jly0 jly0Var = this.b;
        jo80 jo80Var = this.c;
        switch (b) {
            case 0:
                return new t6n1((Application) jo80Var.a, (sug) jly0Var.get());
            case 1:
                azp0 azp0Var = (azp0) jly0Var.get();
                String str = (String) jo80Var.a;
                se11 se11Var = r8i0.e;
                r8i0 r8i0VarW = bmq0.w("application/json");
                ne neVar = new ne((byte) 10);
                if (nhc1.Y(str, "publishable_key_", false)) {
                    List listQ0 = ihc1.Q0(str.substring(16), new String[]{"_"}, 0, 6);
                    String str2 = (String) o7h.t0(listQ0.size() - 2, listQ0);
                    if (listQ0.size() >= 2 && !u890.j(str2, "test") && !u890.j(str2, "live") && str2 != null) {
                        strF = f4i1.f("https://", URLEncoder.encode(str2, "UTF-8"), ".ravelin.click/v2/");
                    }
                }
                neVar.g(strF);
                neVar.c(s3o1.n(r5n1.a, r8i0VarW));
                neVar.a = azp0Var;
                return new t7n1(neVar.j());
            case 2:
                azp0 azp0Var2 = (azp0) jly0Var.get();
                String str3 = (String) jo80Var.a;
                se11 se11Var2 = r8i0.e;
                r8i0 r8i0VarW2 = bmq0.w("application/json");
                ne neVar2 = new ne((byte) 10);
                if (nhc1.Y(str3, "publishable_key_", false)) {
                    List listQ1 = ihc1.Q0(str3.substring(16), new String[]{"_"}, 0, 6);
                    String str4 = (String) o7h.t0(listQ1.size() - 2, listQ1);
                    if (listQ1.size() >= 2 && !u890.j(str4, "test") && !u890.j(str4, "live") && str4 != null) {
                        strF = f4i1.f("https://", URLEncoder.encode(str4, "UTF-8"), ".ravelin.click/v2/");
                    }
                }
                neVar2.g(strF);
                neVar2.c(s3o1.n(n7n1.a, r8i0VarW2));
                neVar2.a = azp0Var2;
                return new t7n1(neVar2.j());
            default:
                return new r6n1((Application) jo80Var.a, xqu.a(jly0Var));
        }
    }

    public /* synthetic */ u(ytw0 ytw0Var, jo80 jo80Var, jly0 jly0Var, byte b) {
        this.a = b;
        this.c = jo80Var;
        this.b = jly0Var;
    }
}
