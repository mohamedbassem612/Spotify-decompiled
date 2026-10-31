package com.google.android.play.agesignals;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p.hhg1;
import p.lal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class AgeSignalsException extends ApiException {
    public AgeSignalsException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i)), (PendingIntent) null, (lal) null));
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
