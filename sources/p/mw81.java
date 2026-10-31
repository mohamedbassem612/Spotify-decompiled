package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mw81 extends Thread {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw81(nw81 nw81Var) {
        super("ExoPlayer:SimpleDecoder");
        this.b = nw81Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        bhn0.p(e);
                        return;
                    }
                    break;
                } while (((nw81) obj).j());
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }

    public mw81(Function0 function0) {
        this.b = function0;
    }
}
