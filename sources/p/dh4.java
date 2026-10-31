package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dh4 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ eh4 c;

    public /* synthetic */ dh4(SingleEmitter singleEmitter, eh4 eh4Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = eh4Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        eh4 eh4Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_mft_plus_queue", false)));
                break;
            default:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:is_swipe_to_play_next_in_queue_enabled", false)));
                break;
        }
        return eh4Var;
    }
}
