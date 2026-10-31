package p;

import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class del implements Disposable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kos b;

    public /* synthetic */ del(kos kosVar, byte b) {
        this.a = b;
        this.b = kosVar;
    }

    public final void dispose() {
        byte b = this.a;
        kos kosVar = this.b;
        switch (b) {
            case 0:
                kosVar.invoke();
                break;
            default:
                kosVar.invoke();
                break;
        }
    }
}
