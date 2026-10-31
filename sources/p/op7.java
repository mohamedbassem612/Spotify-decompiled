package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class op7 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yu3 b;

    public /* synthetic */ op7(yu3 yu3Var, byte b) {
        this.a = b;
        this.b = yu3Var;
    }

    public final void accept(Object obj) throws InterruptedException {
        byte b = this.a;
        yu3 yu3Var = this.b;
        switch (b) {
            case 0:
                ((LinkedBlockingDeque) yu3Var.b).putLast((ByteBuffer) obj);
                break;
            default:
                ((AtomicBoolean) yu3Var.c).set(false);
                break;
        }
    }
}
