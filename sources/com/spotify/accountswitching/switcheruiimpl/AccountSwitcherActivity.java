package com.spotify.accountswitching.switcheruiimpl;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.android.MobiusLoopViewModel;
import kotlin.Metadata;
import p.av;
import p.bck1;
import p.bhn0;
import p.br;
import p.bv;
import p.cr;
import p.cv;
import p.eg;
import p.i2i1;
import p.ila0;
import p.jv;
import p.kv;
import p.lq;
import p.lv;
import p.mq;
import p.pbk1;
import p.rc11;
import p.t3b1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/accountswitching/switcheruiimpl/AccountSwitcherActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_accountswitching_switcheruiimpl-switcheruiimpl"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AccountSwitcherActivity extends t3b1 {
    public static final /* synthetic */ int i1 = 0;
    public jv f1;
    public pbk1 g1;
    public final bck1 h1 = new bck1(rc11.a.b(lv.class), new mq(this, (byte) 0), new mq(this, (byte) 2), new mq(this, (byte) 1));

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(kv kvVar) {
        if (kvVar != kv.a) {
            eg.o();
            return;
        }
        pbk1 pbk1Var = this.g1;
        if (pbk1Var == null) {
            u890.C("viewIntentBuilder");
            throw null;
        }
        i2i1 i2i1VarA = pbk1Var.a(this, "spotify:home");
        i2i1VarA.c();
        Intent intent = (Intent) i2i1VarA.b;
        intent.addFlags(268435456);
        intent.toString();
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayoutInflate = getLayoutInflater().inflate(2131623969, (ViewGroup) null, false);
        if (constraintLayoutInflate == null) {
            bhn0.i("rootView");
            return;
        }
        setContentView(constraintLayoutInflate);
        cv cvVar = (cv) ila0.s(getIntent(), "account_switch_action", cv.class);
        boolean z = cvVar instanceof av;
        bck1 bck1Var = this.h1;
        if (z) {
            ((MobiusLoopViewModel) ((lv) bck1Var.getValue())).c.c(this, new lq(this, (byte) 0));
            av avVar = (av) cvVar;
            ((lv) bck1Var.getValue()).U(new br(avVar.a, avVar.c, true));
        } else if (cvVar instanceof bv) {
            ((MobiusLoopViewModel) ((lv) bck1Var.getValue())).c.c(this, new lq(this, (byte) 1));
            ((lv) bck1Var.getValue()).U(new cr(((bv) cvVar).a));
        } else if (cvVar != null) {
            eg.o();
        } else {
            setResult(0);
            finish();
        }
    }
}
