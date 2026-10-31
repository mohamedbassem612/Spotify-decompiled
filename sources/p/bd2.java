package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bd2 implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disposable b;

    public /* synthetic */ bd2(Disposable disposable, byte b) {
        this.a = b;
        this.b = disposable;
    }

    public final synchronized void accept(Object obj) {
        byte b = this.a;
        synchronized (this) {
            switch (b) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                default:
                    break;
            }
        }
    }

    public final synchronized void dispose() {
        byte b = this.a;
        synchronized (this) {
            switch (b) {
                case 0:
                    this.b.dispose();
                    return;
                case 1:
                    this.b.dispose();
                    return;
                case 2:
                    this.b.dispose();
                    return;
                case 3:
                    this.b.dispose();
                    return;
                case 4:
                    this.b.dispose();
                    return;
                case 5:
                    this.b.dispose();
                    return;
                case 6:
                    this.b.dispose();
                    return;
                case 7:
                    this.b.dispose();
                    return;
                case 8:
                    this.b.dispose();
                    return;
                case 9:
                    this.b.dispose();
                    return;
                case 10:
                    this.b.dispose();
                    return;
                case 11:
                    this.b.dispose();
                    return;
                case 12:
                    this.b.dispose();
                    return;
                case 13:
                    this.b.dispose();
                    return;
                case 14:
                    this.b.dispose();
                    return;
                case 15:
                    this.b.dispose();
                    return;
                case 16:
                    this.b.dispose();
                    return;
                case 17:
                    this.b.dispose();
                    return;
                case 18:
                    this.b.dispose();
                    return;
                default:
                    this.b.dispose();
                    return;
            }
        }
    }
}
