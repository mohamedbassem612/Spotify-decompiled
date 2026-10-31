package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p.hhg1;
import p.lal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class SplitInstallException extends ApiException {
    public SplitInstallException(int i) {
        super(new Status(i, String.format("Split Install Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.splitinstall.model.zza.zzb(i)), (PendingIntent) null, (lal) null));
        if (i != 0) {
            return;
        }
        hhg1.n("errorCode should not be 0.");
        throw null;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
