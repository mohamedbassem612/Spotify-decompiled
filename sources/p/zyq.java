package p;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zyq extends mdy implements p331 {
    public final Status d;

    public zyq(DataHolder dataHolder) {
        super(dataHolder);
        this.d = new Status(dataHolder.e, (String) null, (PendingIntent) null, (lal) null);
    }

    public final Status getStatus() {
        return this.d;
    }
}
