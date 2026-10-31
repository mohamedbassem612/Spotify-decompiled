package com.spotify.livesharing.controllerimpl.dialogs;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import p.ah61;
import p.ai30;
import p.d350;
import p.dg30;
import p.eg;
import p.lmw;
import p.n57;
import p.sp00;
import p.t3b1;
import p.tg30;
import p.th30;
import p.tqd0;
import p.trd0;
import p.u890;
import p.urd0;
import p.vrd0;
import p.wrd0;
import p.xrd0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/livesharing/controllerimpl/dialogs/LiveSharingRecordingDialogsHostActivity;", "Lp/t3b1;", "<init>", "()V", "p/vrd0", "src_main_java_com_spotify_livesharing_controllerimpl-controllerimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveSharingRecordingDialogsHostActivity extends t3b1 {
    public static final /* synthetic */ int h1 = 0;
    public d350 f1;
    public final wrd0 g1 = new wrd0(this);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((th30) ((tg30) ((dg30) this).U0.b).g).p.K(this.g1, false);
    }

    public final void onDestroy() {
        super/*p.dac0*/.onDestroy();
        ai30 ai30Var = ((tg30) ((dg30) this).U0.b).g;
        ((th30) ai30Var).p.M(this.g1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        Parcelable parcelable;
        super/*p.dac0*/.onStart();
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("recording_session_dialog_type", vrd0.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("recording_session_dialog_type");
            if (!(parcelableExtra instanceof vrd0)) {
                parcelableExtra = null;
            }
            parcelable = (vrd0) parcelableExtra;
        }
        vrd0 vrd0Var = (vrd0) parcelable;
        boolean zJ = u890.j(vrd0Var, trd0.a);
        lmw lmwVar = ((dg30) this).U0;
        if (zJ) {
            d350 d350Var = this.f1;
            if (d350Var == null) {
                u890.C("liveSessionDialogsFactory");
                throw null;
            }
            xrd0 xrd0Var = new xrd0(this, (byte) 0);
            sp00 sp00Var = d350Var.e;
            Context context = d350Var.a;
            sp00Var.b = context.getString(2131956311);
            sp00Var.c = context.getString(2131956309);
            sp00Var.d = context.getString(2131956310);
            sp00Var.e = xrd0Var;
            tqd0 tqd0VarA = sp00Var.a();
            tqd0VarA.X(new ah61(d350Var.g));
            tqd0VarA.m(((tg30) lmwVar.b).g);
            return;
        }
        if (!u890.j(vrd0Var, urd0.a)) {
            if (vrd0Var == null) {
                n57.s("The recording dialog type provided through the Intent extra was null.");
                return;
            } else {
                eg.o();
                return;
            }
        }
        d350 d350Var2 = this.f1;
        if (d350Var2 == null) {
            u890.C("liveSessionDialogsFactory");
            throw null;
        }
        xrd0 xrd0Var2 = new xrd0(this, (byte) 1);
        sp00 sp00Var2 = d350Var2.e;
        Context context2 = d350Var2.a;
        sp00Var2.b = context2.getString(2131956311);
        sp00Var2.c = context2.getString(2131956312);
        sp00Var2.d = context2.getString(2131956310);
        sp00Var2.e = xrd0Var2;
        tqd0 tqd0VarA2 = sp00Var2.a();
        tqd0VarA2.X(new ah61(d350Var2.g));
        tqd0VarA2.m(((tg30) lmwVar.b).g);
    }
}
