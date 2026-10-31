package p;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x250 implements hac0 {
    public final u250 a;
    public final gp41 b;
    public final r5o c;
    public final kg0 d;
    public final ohv0 e;
    public final rku f = new rku();
    public final rku g = new rku();

    public x250(u250 u250Var, gp41 gp41Var, r5o r5oVar, kg0 kg0Var, ohv0 ohv0Var) {
        this.a = u250Var;
        this.b = gp41Var;
        this.c = r5oVar;
        this.d = kg0Var;
        this.e = ohv0Var;
    }

    public final void a(GoogleSignInAccount googleSignInAccount, String str) {
        String str2 = googleSignInAccount.f;
        if (str2 != null) {
            this.d.d(new yit(new b3f0(new n450(str2, ""), str, googleSignInAccount.d), bk8.e, (n5o) null, 12), true);
            return;
        }
        xvy xvyVar = new xvy(this, googleSignInAccount, str, (byte) 12);
        w250 w250Var = new w250(this, (byte) 3);
        w250 w250Var2 = new w250(this, (byte) 4);
        u250 u250Var = this.a;
        Context contextP0 = u250Var.P0();
        u250Var.j2.setValue(new j0f0(contextP0.getString(2131952662), contextP0.getString(2131952661), (hux) null, new h0f0(contextP0.getString(2131953887), xvyVar), (h0f0) null, (i3u) null, w250Var2, w250Var, 52));
    }

    public final void b() {
        this.f.a();
        this.g.a();
    }

    public final void c() {
        w250 w250Var = new w250(this, (byte) 0);
        w250 w250Var2 = new w250(this, (byte) 1);
        w250 w250Var3 = new w250(this, (byte) 2);
        u250 u250Var = this.a;
        Context contextP0 = u250Var.P0();
        u250Var.j2.setValue(new j0f0(contextP0.getString(2131956272), contextP0.getString(2131956267), (hux) null, new h0f0(contextP0.getString(2131956271), w250Var), (h0f0) null, (i3u) null, w250Var3, w250Var2, 52));
    }
}
