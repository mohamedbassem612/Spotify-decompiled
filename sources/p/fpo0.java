package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fpo0 extends v4n {
    public static final /* synthetic */ int k2 = 0;
    public final m6k0 b2;
    public ck20 c2;
    public rok0 d2;
    public lcs e2;
    public qnv0 f2;
    public bnj0 g2;
    public boolean h2;
    public String i2 = "";
    public boolean j2;

    public fpo0(m6k0 m6k0Var) {
        this.b2 = m6k0Var;
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        bnj0 bnj0VarL = bnj0.l(layoutInflater, viewGroup);
        this.g2 = bnj0VarL;
        rwq0.s(bnj0VarL.k(), mgn0.e);
        bnj0 bnj0Var = this.g2;
        if (bnj0Var == null) {
            u890.C("binding");
            throw null;
        }
        EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) bnj0Var.c;
        encoreProgressIndicatorButton.setOnClickListener(new t230(this, encoreProgressIndicatorButton, (byte) 21));
        bnj0 bnj0Var2 = this.g2;
        if (bnj0Var2 != null) {
            return bnj0Var2.k();
        }
        u890.C("binding");
        throw null;
    }

    public final Completable p1(String str) {
        qnv0 qnv0Var = this.f2;
        if (qnv0Var == null) {
            u890.C("preferencesOptInApi");
            throw null;
        }
        gfe gfeVar = gfe.b;
        mmq0 mmq0Var = mmq0.d;
        smq0 smq0Var = new smq0(gfeVar, mmq0Var, true);
        gfe gfeVar2 = gfe.a;
        smq0 smq0Var2 = new smq0(gfeVar2, mmq0Var, true);
        mmq0 mmq0Var2 = mmq0.c;
        return qnv0.e(qnv0Var, new smq0[]{smq0Var, smq0Var2, new smq0(gfeVar, mmq0Var2, true), new smq0(gfeVar2, mmq0Var2, true)}, 4, str);
    }

    public final void v0(Context context) {
        this.b2.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        if (bundle != null) {
            Y0();
        }
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        boolean z = this.j2;
        rok0 rok0Var = this.d2;
        if (z) {
            if (rok0Var == null) {
                u890.C("notificationOptInFlowLogger");
                throw null;
            }
            rok0Var.m();
        } else {
            if (rok0Var == null) {
                u890.C("notificationOptInFlowLogger");
                throw null;
            }
            rok0Var.n();
        }
        ck20 ck20Var = this.c2;
        if (ck20Var != null) {
            ck20Var.a().subscribe();
        } else {
            u890.C("firstCommentFlowRepository");
            throw null;
        }
    }
}
