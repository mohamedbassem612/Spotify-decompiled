package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q690 implements g50 {
    public final /* synthetic */ byte a;
    public final dg30 b;
    public final ryf c;
    public final agj0 d;

    public /* synthetic */ q690(dg30 dg30Var, ryf ryfVar, agj0 agj0Var, byte b) {
        this.a = b;
        this.b = dg30Var;
        this.c = ryfVar;
        this.d = agj0Var;
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        byte b = this.a;
        lxf lxfVar = lxf.b;
        dg30 dg30Var = this.b;
        ryf ryfVar = this.c;
        agj0 agj0Var = this.d;
        f8h1 f8h1VarA = null;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                tv80 serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                tv80 tv80Var = serializable instanceof tv80 ? serializable : null;
                Uri uri = Uri.parse(str2);
                if (tv80Var != null) {
                    agj0Var.getClass();
                    f8h1VarA = agj0Var.a(uri, new bwn0(tv80Var));
                }
                jyf jyfVar = new jyf(dg30Var.getString(2131956640));
                if (f8h1VarA != null) {
                    uri = f8h1VarA.a;
                }
                ryfVar.b(dg30Var, new lyf(lxfVar, jyfVar, uri));
                if (f8h1VarA != null) {
                    f8h1VarA.a();
                }
                break;
            default:
                w1q0Var.invoke(Boolean.TRUE);
                Uri uri2 = Uri.parse("https://www.spotify.com/account/profile-mobile");
                tv80 serializable2 = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                tv80 tv80Var2 = serializable2 instanceof tv80 ? serializable2 : null;
                if (tv80Var2 != null) {
                    agj0Var.getClass();
                    f8h1VarA = agj0Var.a(uri2, new bwn0(tv80Var2));
                }
                jyf jyfVar2 = new jyf(dg30Var.getString(2131956640));
                if (f8h1VarA != null) {
                    uri2 = f8h1VarA.a;
                }
                ryfVar.b(dg30Var, new lyf(lxfVar, jyfVar2, uri2));
                if (f8h1VarA != null) {
                    f8h1VarA.a();
                }
                break;
        }
    }
}
