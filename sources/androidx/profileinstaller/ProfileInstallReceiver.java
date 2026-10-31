package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import p.l5o;
import p.mlw0;
import p.t8p1;
import p.u2o1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            u2o1.v(context, new l5o(), new mlw0(this, (byte) 2), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    u2o1.w(context, new l5o(), new mlw0(this, (byte) 2));
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        u2o1.l(context, new l5o(), new mlw0(this, (byte) 2));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            setResultCode(12);
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        mlw0 mlw0Var = new mlw0(this, (byte) 2);
        if ("DROP_SHADER_CACHE".equals(string2)) {
            t8p1.n(context, mlw0Var);
        } else if (!"SAVE_PROFILE".equals(string2)) {
            mlw0Var.d(16, (Object) null);
        } else {
            Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
            mlw0Var.d(12, (Object) null);
        }
    }
}
