package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vhh0 implements thh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vhh0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.thh0
    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                Logger.d("MBS: Failure setting callback for session %s", new Object[]{(vsr0) obj});
                break;
            default:
                ((SingleEmitter) this.b).onError(new IllegalArgumentException(l1d.m("Couldn't resolve callback handler for package name ", (String) obj)));
                break;
        }
    }

    @Override // p.thh0
    public final void b(vih0 vih0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((iu30) obj).invoke(vih0Var);
                break;
            default:
                ((SingleEmitter) obj).onSuccess(vih0Var);
                break;
        }
    }
}
