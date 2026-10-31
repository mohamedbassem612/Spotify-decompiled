package j$.sun.security.action;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class a implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("file.encoding");
        if (property == null) {
            return null;
        }
        return property;
    }
}
