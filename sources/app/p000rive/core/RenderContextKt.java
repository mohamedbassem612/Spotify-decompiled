package app.p000rive.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"supportsVulkanDebugNames", "", "hardware", "", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RenderContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean supportsVulkanDebugNames(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -938287055) {
            return !str.equals("ranchu");
        }
        if (iHashCode != -145892544) {
            return (iHashCode == 2036942520 && str.equals("goldfish")) ? false : true;
        }
        return !str.equals("gce_x86");
    }
}
