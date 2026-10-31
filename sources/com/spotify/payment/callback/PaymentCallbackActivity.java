package com.spotify.payment.callback;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.bck1;
import p.bma1;
import p.eg;
import p.ehw;
import p.eiw;
import p.fcs0;
import p.h0i;
import p.j1e1;
import p.kx40;
import p.kzz;
import p.lik1;
import p.lir0;
import p.lzn0;
import p.mhw;
import p.mir0;
import p.mzo;
import p.p3i1;
import p.p6r0;
import p.phw;
import p.q6j;
import p.qhw;
import p.rc11;
import p.rlk1;
import p.rz21;
import p.s4b1;
import p.u890;
import p.uic;
import p.vas0;
import p.was0;
import p.xcs0;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/payment/callback/PaymentCallbackActivity;", "Lp/mzo;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_payment_callback-callback"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class PaymentCallbackActivity extends mzo implements lir0 {
    public static final /* synthetic */ int g1 = 0;
    public fcs0 b1;
    public rlk1 c1;
    public xcs0 d1;
    public lzn0 e1;
    public final bck1 f1 = new bck1(rc11.a.b(MobiusLoopViewModel.class), new was0(this, (byte) 0), new was0(this, (byte) 2), new was0(this, (byte) 1));

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("PAYMENT_CALLBACK", "payment/callback", 1425, "payment"), new lik1("spotify:payment:callback").a(), 4));
    }

    public final void l0(String str) {
        xcs0 xcs0Var = this.d1;
        if (xcs0Var == null) {
            u890.C("paymentSessionStorage");
            throw null;
        }
        p3i1 p3i1Var = (p3i1) xcs0Var.a(xcs0.g).get(str);
        String str2 = p3i1Var != null ? p3i1Var.b : null;
        if (str2 == null) {
            Logger.d("No cancel URL found for session: %s", new Object[]{str});
        } else {
            m0(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(String str) {
        Set set = s4b1.f;
        if (uic.u(str)) {
            lzn0 lzn0Var = this.e1;
            if (lzn0Var != null) {
                lzn0Var.h(str);
                return;
            } else {
                u890.C("navigator");
                throw null;
            }
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            startActivity(intent);
        } catch (Exception unused) {
            Logger.k("Failed to launch URL as intent: ".concat(str), new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(eiw eiwVar) {
        if (eiwVar instanceof qhw) {
            m0(((qhw) eiwVar).a);
            finish();
            return;
        }
        if (eiwVar instanceof phw) {
            xcs0 xcs0Var = this.d1;
            if (xcs0Var == null) {
                u890.C("paymentSessionStorage");
                throw null;
            }
            phw phwVar = (phw) eiwVar;
            p3i1 p3i1Var = (p3i1) xcs0Var.a(xcs0.f).get(phwVar.a);
            String str = p3i1Var != null ? p3i1Var.b : null;
            if (str == null) {
                str = phwVar.b;
            }
            m0(str);
            finish();
            return;
        }
        if (eiwVar instanceof mhw) {
            l0(((mhw) eiwVar).a);
            finish();
            return;
        }
        if (!(eiwVar instanceof ehw)) {
            eg.o();
            return;
        }
        xcs0 xcs0Var2 = this.d1;
        if (xcs0Var2 == null) {
            u890.C("paymentSessionStorage");
            throw null;
        }
        ehw ehwVar = (ehw) eiwVar;
        String str2 = ehwVar.b;
        xcs0Var2.d(str2 != null ? str2 : null, ehwVar.a);
        if (str2 != null) {
            l0(str2);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        String string;
        Uri data;
        j1e1.q(this);
        super.onCreate(bundle);
        h0i.a(this, q6j.b);
        bck1 bck1Var = this.f1;
        ((MobiusLoopViewModel) bck1Var.getValue()).c.a(this, new vas0(this, (byte) 0), new vas0(this, (byte) 1));
        Intent intent = getIntent();
        if (intent == null || (data = intent.getData()) == null || (string = data.toString()) == null) {
            string = null;
        }
        if (string != null) {
            ((MobiusLoopViewModel) bck1Var.getValue()).U(new kzz(string));
            return;
        }
        Logger.d("No return URL provided in the intent data", new Object[0]);
        xcs0 xcs0Var = this.d1;
        if (xcs0Var == null) {
            u890.C("paymentSessionStorage");
            throw null;
        }
        bma1 bma1Var = xcs0.f;
        xcs0Var.d((String) null, (rz21) null);
        finish();
    }
}
