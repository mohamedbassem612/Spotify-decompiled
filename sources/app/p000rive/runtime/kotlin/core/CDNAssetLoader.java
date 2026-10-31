package app.p000rive.runtime.kotlin.core;

import android.content.Context;
import app.p000rive.RiveLog;
import com.android.volley.VolleyError;
import kotlin.Metadata;
import p.idd1;
import p.op21;
import p.vq6;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lapp/rive/runtime/kotlin/core/CDNAssetLoader;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lapp/rive/runtime/kotlin/core/FileAsset;", "asset", "", "inBandBytes", "", "loadContents", "(Lapp/rive/runtime/kotlin/core/FileAsset;[B)Z", "", "TAG", "Ljava/lang/String;", "Lp/op21;", "queue$delegate", "Lp/znb0;", "getQueue", "()Lp/op21;", "queue", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CDNAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final String TAG = "RiveL/CDNAssetLoader";

    /* JADX INFO: renamed from: queue$delegate, reason: from kotlin metadata */
    private final znb0 queue;

    public CDNAssetLoader(Context context) {
        this.queue = new idd1(new CDNAssetLoader$queue$2(context));
    }

    private final op21 getQueue() {
        return (op21) this.queue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadContents$lambda$0(CDNAssetLoader cDNAssetLoader, VolleyError volleyError) {
        RiveLog.INSTANCE.getLogger().e(cDNAssetLoader.TAG, null, CDNAssetLoader$loadContents$request$2$1.INSTANCE);
        volleyError.printStackTrace();
    }

    @Override // app.p000rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(FileAsset asset, byte[] inBandBytes) {
        String cdnUrl = asset.getCdnUrl();
        if (cdnUrl.length() == 0) {
            return false;
        }
        getQueue().a(new BytesRequest(cdnUrl, new CDNAssetLoader$loadContents$request$1(asset), new vq6(this, (byte) 28)));
        return true;
    }
}
