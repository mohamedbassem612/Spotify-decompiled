package com.google.android.play.core.crossdeviceprompt;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
import p.hhg1;
import p.kpn1;
import p.lal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CrossDevicePromptException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    public CrossDevicePromptException(int i) {
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        String str = (String) kpn1.a.get(Integer.valueOf(i));
        super(new Status(i, String.format(locale, "CrossDevicePrompt Error(%d): %s", numValueOf, str == null ? "" : str), (PendingIntent) null, (lal) null));
        if (i != 0) {
            return;
        }
        hhg1.n("errorCode should not be 0.");
        throw null;
    }
}
