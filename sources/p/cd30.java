package p;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cd30 {
    public final Context a;

    public cd30(Context context) {
        this.a = context;
    }

    public Intent a(ld30 ld30Var) {
        Intent intent = new Intent(this.a.getApplicationContext(), (Class<?>) ForegroundKeeperService.class);
        intent.putExtra("notifier-action", (Parcelable) ld30Var);
        return intent;
    }
}
