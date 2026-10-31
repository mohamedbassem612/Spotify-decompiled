package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.Metadata;
import p.blo1;
import p.igu;
import p.lnm;
import p.q4;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "p/tyo1", "glance-appwidget_release"}, k = 1, mv = {1, 8, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        blo1.r(this, igu.a, new q4(intent, context, (lnm) null, (byte) 6));
    }
}
