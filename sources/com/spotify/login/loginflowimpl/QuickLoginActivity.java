package com.spotify.login.loginflowimpl;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import p.a2k;
import p.ai30;
import p.bk8;
import p.dg30;
import p.dp21;
import p.efz0;
import p.gj5;
import p.ifl1;
import p.j1e1;
import p.jgu;
import p.k3f0;
import p.kg0;
import p.lmw;
import p.lt50;
import p.n5o;
import p.nne;
import p.rc11;
import p.sks0;
import p.th30;
import p.u890;
import p.yit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/login/loginflowimpl/QuickLoginActivity;", "Lp/gj5;", "Lp/lt50;", "<init>", "()V", "src_main_java_com_spotify_login_loginflowimpl-loginflowimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class QuickLoginActivity extends gj5 implements lt50 {
    public static final String f1;
    public a2k a1;
    public jgu b1;
    public dp21 c1;
    public kg0 d1;
    public boolean e1;

    static {
        String strO = rc11.a.b(yit.class).o();
        strO.getClass();
        f1 = strO;
    }

    @Override // p.lt50
    public final jgu f() {
        jgu jguVar = this.b1;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        dp21 dp21Var = this.c1;
        if (dp21Var == null) {
            u890.C("requestIdProvider");
            throw null;
        }
        dp21Var.a("");
        super/*android.app.Activity*/.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        setTheme(2132018158);
        j1e1.q(this);
        lmw lmwVar = ((dg30) this).U0;
        ai30 ai30VarT = lmwVar.t();
        a2k a2kVar = this.a1;
        if (a2kVar == null) {
            u890.C("compositeFragmentFactory");
            throw null;
        }
        ((th30) ai30VarT).B = a2kVar;
        super/*p.dg30*/.onCreate(bundle);
        getIntent().putExtra("intent", new Intent());
        setContentView(2131624003);
        lmwVar.t().j0(f1, this, new sks0(this, (byte) 28));
        ai30 ai30VarT2 = lmwVar.t();
        ((th30) ai30VarT2).o.add(new efz0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*p.dg30*/.onResume();
        String stringExtra = getIntent().getStringExtra("username");
        String stringExtra2 = getIntent().getStringExtra("password_b64");
        String str = stringExtra2 != null ? new String(Base64.decode(stringExtra2, 0), nne.a) : getIntent().getStringExtra("password");
        if (stringExtra == null || str == null) {
            Logger.d("Missing \"username\" and/or password extra(s)", new Object[0]);
            setResult(0, new Intent().putExtra("loginFailureReason", "missing_credentials"));
            finish();
            return;
        }
        dp21 dp21Var = this.c1;
        n5o n5oVar = null;
        if (dp21Var == null) {
            u890.C("requestIdProvider");
            throw null;
        }
        dp21Var.a("-1");
        this.e1 = true;
        kg0 kg0Var = this.d1;
        if (kg0Var != null) {
            kg0Var.c(new yit(new k3f0(stringExtra, str), bk8.a, n5oVar, 12), new ifl1((Object) null, (byte) 25), false);
        } else {
            u890.C("navigator");
            throw null;
        }
    }
}
