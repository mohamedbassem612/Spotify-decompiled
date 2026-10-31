package com.spotify.allboarding.allboardingimpl.presentation.error;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import p.en3;
import p.j3h1;
import p.to41;
import p.tw40;
import p.u890;
import p.xw40;
import p.ydb;
import p.yg30;
import p.zf30;
import p.zfs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/presentation/error/ErrorFragment;", "Lp/zf30;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ErrorFragment extends zf30 {
    public final yg30 F1;
    public tw40 G1;
    public j3h1 H1;
    public en3 I1;
    public to41 J1;

    public ErrorFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
    }

    public final void F0(Bundle bundle) {
        to41 to41Var = this.J1;
        if (to41Var != null) {
            bundle.putParcelable("SCREEN", to41Var);
        } else {
            u890.C("screen");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        if (this.G1 != null) {
            Y0().b.setText(2131952273);
            Y0().c.setText(2131952272);
            Y0().d.setText(2131952271);
            Y0().d.setOnClickListener(new zfs(this, (byte) 9));
        }
    }

    public final tw40 Y0() {
        tw40 tw40Var = this.G1;
        if (tw40Var != null) {
            return tw40Var;
        }
        u890.C("emptyState");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        to41 to41Var;
        this.G1 = xw40.a(N0(), viewGroup);
        if (bundle == null) {
            en3 en3Var = this.I1;
            if (en3Var == null) {
                u890.C("screenProvider");
                throw null;
            }
            to41Var = (to41) en3Var.a;
        } else {
            Parcelable parcelable = bundle.getParcelable("SCREEN");
            parcelable.getClass();
            to41Var = (to41) parcelable;
        }
        this.J1 = to41Var;
        N0().J().a(n0(), new ydb(this, (byte) 8));
        return Y0().a;
    }
}
