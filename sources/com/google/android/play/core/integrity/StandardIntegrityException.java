package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p.hhg1;
import p.lal;
import p.p5n1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class StandardIntegrityException extends ApiException {
    public final Throwable a;

    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public StandardIntegrityException(int i, Throwable th) {
        String str;
        Locale locale = Locale.ROOT;
        HashMap map = p5n1.a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = p5n1.b;
            if (map2.containsKey(numValueOf)) {
                str = ((String) map.get(numValueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#" + ((String) map2.get(numValueOf)) + ")";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        super(new Status(i, "Standard Integrity API error (" + i + "): " + str + ".", (PendingIntent) null, (lal) null));
        if (i != 0) {
            this.a = th;
        } else {
            hhg1.n("ErrorCode should not be 0.");
            throw null;
        }
    }

    public final synchronized Throwable getCause() {
        return this.a;
    }

    public final int getErrorCode() {
        return super.getStatusCode();
    }
}
