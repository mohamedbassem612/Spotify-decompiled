package p;

import android.os.IBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class z6o1 implements IBinder.DeathRecipient {
    public final /* synthetic */ rzo1 a;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        rzo1.b(this.a);
    }
}
