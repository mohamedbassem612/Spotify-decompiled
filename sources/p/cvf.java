package p;

import android.content.Intent;
import android.os.AsyncTask;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cvf extends AsyncTask {
    public final s6b1 a;
    public final zce0 b;

    public cvf(zce0 zce0Var, s6b1 s6b1Var) {
        this.b = zce0Var;
        this.a = s6b1Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        t6b1 t6b1Var = this.a;
        Long[] lArr = new Long[2];
        try {
            String strE = t6b1Var.l.e(t6b1.v, (String) null);
            if (strE != null) {
                lArr[0] = Long.valueOf(new utw0(strE).t());
            } else {
                lArr[0] = Long.MAX_VALUE;
            }
        } catch (IOException unused) {
            lArr[0] = Long.MAX_VALUE;
        }
        try {
            String strE2 = t6b1Var.l.e(t6b1.t, (String) null);
            if (strE2 != null) {
                lArr[1] = Long.valueOf(new utw0(strE2).t());
            } else {
                lArr[1] = Long.MAX_VALUE;
            }
        } catch (IOException unused2) {
            lArr[1] = Long.MAX_VALUE;
        }
        return lArr;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Long[] lArr = (Long[]) obj;
        long jLongValue = lArr[0].longValue();
        zce0 zce0Var = this.b;
        if (jLongValue < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            zce0Var.c(new Intent("check_storage.settings_low.error"));
        } else if (lArr[1].longValue() < 52428800) {
            zce0Var.c(new Intent("check_storage.cache_low.error"));
        } else {
            zce0Var.c(new Intent("check_storage.diskspace.ok"));
        }
    }
}
