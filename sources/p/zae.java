package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zae implements Connectable {
    public final /* synthetic */ byte a;
    public final String b;

    public /* synthetic */ zae(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new cn(consumer, this, (byte) 7);
            default:
                return new cn(consumer, this);
        }
    }
}
