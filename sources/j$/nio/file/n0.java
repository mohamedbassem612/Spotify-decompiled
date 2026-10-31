package j$.nio.file;

import java.nio.file.WatchKey;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final /* synthetic */ class n0 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ n0(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ n0 a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new n0(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof n0) {
            obj = ((n0) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
