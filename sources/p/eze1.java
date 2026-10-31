package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eze1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ eze1(byte b, Object obj, String str, boolean z) {
        this.a = b;
        this.b = str;
        this.c = z;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                Logger.e((Throwable) obj, z ? f4i1.f("Failed to save ", str, " to library") : f4i1.f("Failed to remove ", str, " from library"), new Object[0]);
                break;
            default:
                Logger.e((Throwable) obj, z ? "Failed to presave ".concat(str) : "Failed to remove presave for ".concat(str), new Object[0]);
                break;
        }
    }
}
