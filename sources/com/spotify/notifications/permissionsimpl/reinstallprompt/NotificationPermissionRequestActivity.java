package com.spotify.notifications.permissionsimpl.reinstallprompt;

import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.dg30;
import p.lmw;
import p.m1o0;
import p.nu9;
import p.sso0;
import p.t3b1;
import p.tg30;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/spotify/notifications/permissionsimpl/reinstallprompt/NotificationPermissionRequestActivity;", "Lp/t3b1;", "", "<init>", "()V", "p/flo1", "src_main_java_com_spotify_notifications_permissionsimpl-permissionsimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class NotificationPermissionRequestActivity extends t3b1 {
    public static final /* synthetic */ int h1 = 0;
    public m1o0 f1;
    public boolean g1;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1o0 m1o0Var = this.f1;
        if (m1o0Var == null) {
            u890.C("bluetoothGate");
            throw null;
        }
        this.g1 = m1o0Var.a;
        if (m1o0Var == null) {
            u890.C("bluetoothGate");
            throw null;
        }
        m1o0Var.a = true;
        setContentView(2131624006);
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.G("notification-permission-request-fragment") != null) {
            return;
        }
        nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
        nu9Var.k(2131428959, new sso0(), "notification-permission-request-fragment", 1);
        nu9Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super/*p.dg30*/.onRequestPermissionsResult(i, strArr, iArr);
        m1o0 m1o0Var = this.f1;
        if (m1o0Var == null) {
            u890.C("bluetoothGate");
            throw null;
        }
        m1o0Var.a = this.g1;
        finish();
    }
}
