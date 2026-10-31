package com.spotify.checkout.premiumcheckout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.b8k1;
import p.bck1;
import p.cj8;
import p.d6d1;
import p.eg;
import p.f0i;
import p.ffe1;
import p.g0i;
import p.hma1;
import p.idd1;
import p.ila0;
import p.iqv0;
import p.jik1;
import p.kqv0;
import p.kx40;
import p.lik1;
import p.lir0;
import p.lqv0;
import p.lrv0;
import p.mir0;
import p.mqv0;
import p.mzo;
import p.oe41;
import p.p6r0;
import p.pf61;
import p.pqv0;
import p.qdd1;
import p.qh0;
import p.qqv0;
import p.r7k1;
import p.rc11;
import p.rqv0;
import p.sqv0;
import p.u890;
import p.ud20;
import p.yfu;
import p.yhh1;
import p.yon1;
import p.zhh1;
import p.zlv;
import p.zxf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/spotify/checkout/premiumcheckout/PremiumCheckoutActivity;", "Lp/mzo;", "Lp/lir0;", "Lp/jik1;", "<init>", "()V", "p/iqv0", "p/jqv0", "src_main_java_com_spotify_checkout_premiumcheckout-premiumcheckout"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PremiumCheckoutActivity extends mzo implements lir0, jik1 {
    public static final iqv0 o1 = new iqv0();
    public lrv0 b1;
    public pf61 c1;
    public yfu d1;
    public ffe1 e1;
    public zhh1 f1;
    public qh0 l1;
    public final bck1 g1 = new bck1(rc11.a.b(MobiusLoopViewModel.class), new kqv0(this, (byte) 5), new kqv0(this, (byte) 7), new kqv0(this, (byte) 6));
    public final idd1 h1 = new idd1(new kqv0(this, (byte) 3));
    public final idd1 i1 = new idd1(new kqv0(this, (byte) 2));
    public final idd1 j1 = new idd1(new kqv0(this, (byte) 1));
    public final idd1 k1 = new idd1(new kqv0(this, (byte) 4));
    public final idd1 m1 = new idd1(new kqv0(this, (byte) 0));
    public final lik1 n1 = new lik1("spotify:checkout:choice-screen");

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("CHECKOUT_CHOICESCREEN", "checkout/choicescreen", 333, "checkout"), this.n1.a(), 4));
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getN1() {
        return this.n1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(sqv0 sqv0Var) {
        if (sqv0Var instanceof pqv0) {
            int i = ((pqv0) sqv0Var).a ? -1 : 0;
            Intent intent = new Intent();
            intent.putExtra("PremiumCheckoutActivity", true);
            setResult(i, intent);
            finish();
            return;
        }
        if (sqv0Var instanceof qqv0) {
            qh0 qh0Var = this.l1;
            if (qh0Var != null) {
                qh0Var.a(((qqv0) sqv0Var).a);
                return;
            } else {
                u890.C("launchChoiceScreen");
                throw null;
            }
        }
        if (!(sqv0Var instanceof rqv0)) {
            eg.o();
            return;
        }
        ffe1 ffe1Var = this.e1;
        if (ffe1Var == null) {
            u890.C("checkoutUrlLoader");
            throw null;
        }
        ffe1Var.i(((rqv0) sqv0Var).a);
        Intent intent2 = new Intent();
        intent2.putExtra("PremiumCheckoutActivity", true);
        setResult(0, intent2);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        super.onCreate(bundle);
        zhh1 zhh1Var = this.f1;
        if (zhh1Var == null) {
            u890.C("unifiedCheckoutLauncher");
            throw null;
        }
        this.l1 = a0(new cj8(this, (byte) 11), new yhh1(zhh1Var, (byte) 1));
        setContentView(2131624012);
        pf61 pf61Var = this.c1;
        if (pf61Var == null) {
            u890.C("sessionIdProvider");
            throw null;
        }
        String str = ((mqv0) this.m1.getValue()).b.a;
        pf61Var.b = str;
        hma1 hma1VarEdit = pf61Var.a.edit();
        hma1VarEdit.d(pf61.e, str);
        hma1VarEdit.g();
        pf61 pf61Var2 = this.c1;
        if (pf61Var2 == null) {
            u890.C("sessionIdProvider");
            throw null;
        }
        if (pf61Var2.d(((f0i) this).a, (oe41) ((g0i) this).d.c)) {
            yfu yfuVar = this.d1;
            if (yfuVar == null) {
                u890.C("gpbTracker");
                throw null;
            }
            yfuVar.d();
        }
        bck1 bck1Var = this.g1;
        ((MobiusLoopViewModel) bck1Var.getValue()).b.f(this, new lqv0(this, (byte) 0));
        ((MobiusLoopViewModel) bck1Var.getValue()).c.a(this, new lqv0(this, (byte) 1), new lqv0(this, (byte) 2));
        ConstraintLayout constraintLayout = (ConstraintLayout) this.k1.getValue();
        ud20 ud20Var = ud20.c1;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(constraintLayout, ud20Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        mqv0 mqv0Var = (mqv0) ila0.s(intent, "EXTRA_ARGS", mqv0.class);
        if (mqv0Var == null || mqv0Var.equals((mqv0) ila0.s(getIntent(), "EXTRA_ARGS", mqv0.class))) {
            Logger.d("Shouldn't be trying to launch this repeatedly.", new Object[0]);
            return;
        }
        zxf zxfVar = mqv0Var.b;
        String str = mqv0Var.a;
        Intent intent2 = new Intent((Context) this, (Class<?>) PremiumCheckoutActivity.class);
        intent2.putExtra("EXTRA_ARGS", new mqv0(str, zxfVar, false));
        startActivity(intent2);
        finish();
    }
}
