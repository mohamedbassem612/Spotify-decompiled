package com.spotify.login.loginflowimpl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlin.Metadata;
import p.cfs;
import p.gj5;
import p.ila0;
import p.j1e1;
import p.qzs0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/login/loginflowimpl/DelegatingLoginActivity;", "Lp/gj5;", "<init>", "()V", "src_main_java_com_spotify_login_loginflowimpl-loginflowimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class DelegatingLoginActivity extends gj5 {
    public static final /* synthetic */ int f1 = 0;
    public Observable a1;
    public Scheduler b1;
    public Intent c1;
    public final CompositeDisposable d1 = new CompositeDisposable();
    public boolean e1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*p.dg30*/.onCreate(bundle);
        setContentView(2131623995);
        j1e1.q(this);
        if (bundle != null) {
            this.e1 = bundle.getBoolean("STATE_AUTH_SESSION_WAS_STARTED");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("STATE_AUTH_SESSION_WAS_STARTED", this.e1);
        super/*p.g0i*/.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        if (this.e1) {
            Observable observable = this.a1;
            if (observable == null) {
                u890.C("runtimeDependencies");
                throw null;
            }
            Observable observableSwitchMap = observable.switchMap(qzs0.Z0);
            Scheduler scheduler = this.b1;
            if (scheduler == null) {
                u890.C("ioScheduler");
                throw null;
            }
            this.d1.b(observableSwitchMap.subscribeOn(scheduler).subscribe(new cfs(this, (byte) 8)));
            return;
        }
        this.e1 = true;
        Intent intent = new Intent();
        intent.setClass(this, LoginActivity.class);
        intent.setFlags(268468224);
        intent.setData(getIntent().getData());
        Intent intent2 = this.c1;
        if (intent2 == null) {
            u890.C("homeIntent");
            throw null;
        }
        intent2.setData(getIntent().getData());
        intent.putExtra("intent", intent2);
        intent.putExtra("extra_finish_on_auth", true);
        Uri uri = (Uri) ila0.s(getIntent(), "android.intent.extra.REFERRER", Uri.class);
        if (uri != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri);
        }
        startActivity(intent);
    }

    public final void onStop() {
        super.onStop();
        this.d1.g();
    }
}
