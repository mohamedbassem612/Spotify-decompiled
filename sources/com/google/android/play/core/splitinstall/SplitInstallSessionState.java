package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class SplitInstallSessionState {
    public static SplitInstallSessionState create(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2) {
        if (i2 != 8) {
            return new zza(i, i2, i3, j, j2, list, list2, null, null);
        }
        hhg1.n("REQUIRES_USER_CONFIRMATION state not supported.");
        return null;
    }

    public static SplitInstallSessionState zzd(Bundle bundle) {
        return new zza(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int iStatus = status();
        return iStatus == 0 || iStatus == 5 || iStatus == 6 || iStatus == 7;
    }

    public List<String> languages() {
        return zza() != null ? new ArrayList(zza()) : new ArrayList();
    }

    public List<String> moduleNames() {
        return zzb() != null ? new ArrayList(zzb()) : new ArrayList();
    }

    @Deprecated
    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract List zza();

    public abstract List zzb();

    public abstract List zzc();
}
