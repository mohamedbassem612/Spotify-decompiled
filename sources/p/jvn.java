package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jvn implements Connectable {
    public final /* synthetic */ byte a = 1;
    public final String b;
    public final boolean c;

    public jvn(boolean z, String str) {
        this.c = z;
        this.b = str;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ivn(consumer, this.c, this.b);
            default:
                return new cn(consumer, this, (byte) 19);
        }
    }

    public jvn(String str, boolean z) {
        this.b = str;
        this.c = z;
    }
}
