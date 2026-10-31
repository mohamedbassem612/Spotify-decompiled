package p;

import com.google.protobuf.h;
import com.spotify.messages.AccountSwitchingAccountSwitched;
import com.spotify.messages.AccountSwitchingAddAccount;
import com.spotify.messages.AccountSwitchingRemoveAccountNonAuth;
import io.reactivex.rxjava3.functions.Action;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class uv implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ qtt c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uv(vv vvVar, Object obj, qtt qttVar, byte b) {
        this.a = b;
        this.b = vvVar;
        this.d = obj;
        this.c = qttVar;
    }

    public final void run() {
        byte b = this.a;
        qtt qttVar = this.c;
        Object obj = this.d;
        vv vvVar = this.b;
        switch (b) {
            case 0:
                t2j0 t2j0Var = vvVar.a;
                nv nvVarN = AccountSwitchingAddAccount.n();
                o71 o71Var = (o71) obj;
                nvVarN.q(x0d.e(o71Var.a));
                String str = o71Var.b;
                if (str != null) {
                    nvVarN.t(str);
                }
                nvVarN.r(qttVar.a);
                nvVarN.s(qv.a(qttVar.b));
                nvVarN.n(o71Var.d);
                Integer num = o71Var.c;
                if (num != null) {
                    nvVarN.u(num.intValue());
                }
                h hVarBuild = nvVarN.build();
                Objects.toString((AccountSwitchingAddAccount) hVarBuild);
                t2j0Var.a(hVarBuild);
                break;
            case 1:
                t2j0 t2j0Var2 = vvVar.a;
                xv xvVarN = AccountSwitchingRemoveAccountNonAuth.n();
                t521 t521Var = (t521) obj;
                xvVarN.r(x0d.e(t521Var.a));
                xvVarN.n(qttVar.a);
                xvVarN.q(qv.a(qttVar.b));
                xvVarN.s(t521Var.b.intValue());
                h hVarBuild2 = xvVarN.build();
                Objects.toString((AccountSwitchingRemoveAccountNonAuth) hVarBuild2);
                t2j0Var2.a(hVarBuild2);
                break;
            default:
                t2j0 t2j0Var3 = vvVar.a;
                mv mvVarN = AccountSwitchingAccountSwitched.n();
                rad1 rad1Var = (rad1) obj;
                mvVarN.t(x0d.e(rad1Var.a));
                mvVarN.n(x0d.e(rad1Var.b));
                mvVarN.s(rad1Var.c);
                mvVarN.q(qttVar.a);
                mvVarN.r(qv.a(qttVar.b));
                h hVarBuild3 = mvVarN.build();
                Objects.toString((AccountSwitchingAccountSwitched) hVarBuild3);
                t2j0Var3.a(hVarBuild3);
                break;
        }
    }
}
