package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class s030 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q2u b;

    public /* synthetic */ s030(q2u q2uVar, byte b) {
        this.a = b;
        this.b = q2uVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
