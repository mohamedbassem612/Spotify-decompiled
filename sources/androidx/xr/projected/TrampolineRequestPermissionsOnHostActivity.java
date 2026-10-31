package androidx.xr.projected;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import p.rkx0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/xr/projected/TrampolineRequestPermissionsOnHostActivity;", "Landroid/app/Activity;", "<init>", "()V", "projected"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrampolineRequestPermissionsOnHostActivity extends Activity {
    public ResultReceiver a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("androidx.xr.projected.permissions.extra.RESULT_RECEIVER", ResultReceiver.class);
        if (resultReceiver == null) {
            finish();
            return;
        }
        String[] stringArrayExtra = getIntent().getStringArrayExtra("androidx.xr.projected.permissions.extra.PERMISSIONS");
        if (stringArrayExtra == null || stringArrayExtra.length == 0) {
            resultReceiver.send(0, Bundle.EMPTY);
            finish();
        } else {
            this.a = resultReceiver;
            requestPermissions(stringArrayExtra, 105, rkx0.a(this).getDeviceId());
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 105) {
            return;
        }
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver == null) {
            u890.C("resultReceiver");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArray("androidx.xr.projected.permissions.RESULT_DATA_PERMISSIONS", strArr);
        bundle.putIntArray("androidx.xr.projected.permissions.RESULT_DATA_GRANT_RESULTS", iArr);
        resultReceiver.send(-1, bundle);
        finish();
    }
}
