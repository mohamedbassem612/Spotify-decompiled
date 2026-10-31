package p;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zs9 extends ContentObserver {
    public final Context a;
    public final kor b;
    public final AudioManager c;
    public xab1 d;
    public int e;
    public q01 f;

    public zs9(Context context, kor korVar) {
        super(new Handler(Looper.getMainLooper()));
        this.a = context;
        this.b = korVar;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = -1;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        int streamVolume = this.c.getStreamVolume(3);
        if (streamVolume != this.e) {
            this.e = streamVolume;
            q01 q01Var = this.f;
            if (q01Var != null) {
                q01Var.invoke();
            }
        }
    }
}
