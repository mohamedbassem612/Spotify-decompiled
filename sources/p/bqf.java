package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bqf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqf(rwj rwjVar, byte b) {
        super(0);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rwj rwjVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new DispatcherWorker((q8n) rwjVar.f);
            default:
                return new DispatcherWorker((q8n) rwjVar.g);
        }
    }
}
