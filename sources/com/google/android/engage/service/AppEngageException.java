package com.google.android.engage.service;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AppEngageException extends ApiException {
    public AppEngageException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "App Engage Service Error: %d", Integer.valueOf(i)), null, null));
        if (i != 0) {
            return;
        }
        hhg1.n("errorCode should not be 0.");
        throw null;
    }

    public final int getErrorCode() {
        return super.getStatusCode();
    }
}
