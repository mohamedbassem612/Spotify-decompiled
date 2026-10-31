package j$.nio.file;

import java.security.PrivilegedAction;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class i implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        j$.nio.file.spi.c cVar = j$.adapter.b.a;
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    cVar = (j$.nio.file.spi.c) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.c.class).newInstance(cVar);
                    if (!cVar.l().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return cVar;
    }
}
