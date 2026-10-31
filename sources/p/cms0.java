package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.xr.projected.permissions.GoToHostProjectedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cms0 extends ResultReceiver {
    public GoToHostProjectedActivity a;

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, androidx.xr.projected.permissions.GoToHostProjectedActivity] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        ?? r1 = this.a;
        if (r1 != 0) {
            r1.setResult(-1, new Intent().putExtra("androidx.xr.projected.permissions.extra.PERMISSION_RESULTS", bundle));
            r1.V0 = true;
            r1.finish();
        }
    }
}
