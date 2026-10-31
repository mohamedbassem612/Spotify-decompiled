package com.spotify.messaging.messagingplatformimpl.slate;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.cardview.widget.CardView;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.subjects.SingleSubject;
import kotlin.Metadata;
import p.dr41;
import p.ezi0;
import p.fe81;
import p.fzi0;
import p.gjo0;
import p.hcx0;
import p.idd1;
import p.ihc1;
import p.mzo;
import p.r981;
import p.rku;
import p.t891;
import p.ttd;
import p.u891;
import p.wnw0;
import p.ynb0;
import p.z0u0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/spotify/messaging/messagingplatformimpl/slate/SlateMessageHostActivity;", "Lp/mzo;", "<init>", "()V", "p/u891", "p/rc2", "src_main_java_com_spotify_messaging_messagingplatformimpl-messagingplatformimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class SlateMessageHostActivity extends mzo {
    public static final /* synthetic */ int f1 = 0;
    public ynb0 b1;
    public String d1;
    public final idd1 c1 = new idd1(new fe81(this, (byte) 13));
    public final rku e1 = new rku();

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(2130772006, 2130772009);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(2130772006, 2130772009);
        String stringExtra = getIntent().getStringExtra("notification_id");
        this.d1 = stringExtra;
        if (stringExtra == null || ihc1.y0(stringExtra)) {
            finish();
            return;
        }
        String str = this.d1;
        if (str != null) {
            idd1 idd1Var = this.c1;
            gjo0 gjo0Var = (gjo0) ((u891) idd1Var.getValue()).c.b.get(str);
            if (gjo0Var == null) {
                finish();
                return;
            }
            setContentView(2131626167);
            SlateView slateView = (SlateView) findViewById(2131431006);
            CardView cardView = slateView.b;
            cardView.removeAllViews();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(slateView.getContext());
            layoutInflaterFrom.getClass();
            cardView.addView(gjo0Var.c.f(layoutInflaterFrom, cardView));
            ttd ttdVar = new ttd(slateView.e, slateView);
            slateView.h = ttdVar;
            cardView.setOnTouchListener(ttdVar);
            slateView.setDismissalPolicy(hcx0.N0);
            this.e1.b(((u891) idd1Var.getValue()).a.d.subscribe(new z0u0((byte) 15, this, str)));
            t891 t891Var = ((u891) idd1Var.getValue()).b;
            SingleSubject singleSubject = (SingleSubject) t891Var.c.remove(str);
            if (singleSubject != null) {
                singleSubject.onSuccess(new r981(str));
            }
            if (((gjo0) t891Var.b.get(str)) != null) {
                t891Var.e.onNext(new fzi0("SLATE_HANDLER_ID", str, wnw0.c));
            }
            slateView.setInteractionListener(new dr41(this, (byte) 15));
        }
    }

    public final void onDestroy() {
        super/*p.gj5*/.onDestroy();
        this.e1.a();
        String str = this.d1;
        if (str != null) {
            t891 t891Var = ((u891) this.c1.getValue()).b;
            gjo0 gjo0Var = (gjo0) t891Var.b.remove(str);
            if (gjo0Var != null) {
                gjo0Var.d.b();
                t891Var.e.onNext(new ezi0("SLATE_HANDLER_ID"));
            }
        }
    }
}
