package p;

import android.content.ComponentName;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cro extends jro {
    public static asn b;
    public static wzn c;
    public static final ReentrantLock d = new ReentrantLock();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
