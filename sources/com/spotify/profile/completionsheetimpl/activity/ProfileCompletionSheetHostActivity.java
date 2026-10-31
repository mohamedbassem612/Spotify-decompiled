package com.spotify.profile.completionsheetimpl.activity;

import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.a2k;
import p.b0x0;
import p.dg30;
import p.gg11;
import p.ila0;
import p.mmr0;
import p.mno1;
import p.mwv0;
import p.ni30;
import p.rg30;
import p.rww0;
import p.t3b1;
import p.tg30;
import p.tzw0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/profile/completionsheetimpl/activity/ProfileCompletionSheetHostActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_profile_completionsheetimpl-completionsheetimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ProfileCompletionSheetHostActivity extends t3b1 {
    public static final /* synthetic */ int k1 = 0;
    public a2k f1;
    public gg11 g1;
    public b0x0 h1;
    public boolean i1;
    public String j1;

    public final rg30 l0() {
        a2k a2kVar = this.f1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("fragmentFactory");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("feature_identifier_extra");
        tzw0 tzw0Var = (tzw0) ila0.s(getIntent(), "profile_extra", tzw0.class);
        this.j1 = getIntent().getStringExtra("session_id_extra");
        if (stringExtra == null || tzw0Var == null) {
            finish();
            return;
        }
        if (this.i1) {
            return;
        }
        mwv0 mwv0Var = new mwv0(this, (byte) 15);
        gg11 gg11Var = this.g1;
        if (gg11Var == null) {
            u890.C("fragmentProviders");
            throw null;
        }
        ni30 ni30Var = (ni30) gg11Var.get(rww0.class);
        if (ni30Var == null) {
            return;
        }
        rww0 rww0VarA = ni30Var.a();
        rww0 rww0Var = rww0VarA instanceof rww0 ? rww0VarA : null;
        if (rww0Var == null) {
            return;
        }
        int i = rww0.n2;
        rww0Var.T0(mno1.h(new mmr0[]{new mmr0("extra_profile", tzw0Var), new mmr0("extra_feature_identifier", stringExtra)}));
        rww0Var.m2 = new mwv0(mwv0Var, (byte) 16);
        rww0Var.g1(((tg30) ((dg30) this).U0.b).g, "ProfileCompletionBottomSheetFragment");
        this.i1 = true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super/*p.dac0*/.onRestoreInstanceState(bundle);
        this.i1 = bundle.getBoolean("already_shown", false);
        this.j1 = bundle.getString("session_id_extra");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.dac0*/.onSaveInstanceState(bundle);
        bundle.putBoolean("already_shown", this.i1);
        bundle.putString("session_id_extra", this.j1);
    }
}
