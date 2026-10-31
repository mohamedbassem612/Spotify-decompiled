package app.p000rive.core;

import kotlin.Metadata;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lapp/rive/core/RefCounted;", "", "", "source", "Lp/rih1;", "acquire", "(Ljava/lang/String;)V", "reason", "release", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getRefCount", "()I", "refCount", "", "isDisposed", "()Z", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RefCounted {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void release$default(RefCounted refCounted, String str, String str2, int i, Object obj) {
            if (obj != null) {
                hhg1.h("Super calls with default arguments not supported in this target, function: release");
                return;
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            refCounted.release(str, str2);
        }
    }

    void acquire(String source);

    int getRefCount();

    boolean isDisposed();

    void release(String source, String reason);
}
