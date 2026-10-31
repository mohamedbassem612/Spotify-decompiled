package p;

import com.spotify.storage.localstorage.DiskAlmostFullActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mdu extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DiskAlmostFullActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mdu(DiskAlmostFullActivity diskAlmostFullActivity, byte b) {
        super(0);
        this.a = b;
        this.b = diskAlmostFullActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        t3b1 t3b1Var = this.b;
        switch (b) {
            case 0:
                t3b1Var.finish();
                break;
            default:
                t3b1Var.finish();
                break;
        }
        return rih1Var;
    }
}
