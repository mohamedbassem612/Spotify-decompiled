package p;

import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a150 implements Disposable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a150(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iac0) ((c0c) obj2).b).getLifecycle().d((rjd) obj);
                break;
            default:
                ((fai0) ((ug3) obj2).b).k((jun) obj);
                break;
        }
    }
}
