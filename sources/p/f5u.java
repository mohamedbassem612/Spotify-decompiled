package p;

import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f5u {
    public static g5u a(File file) {
        try {
            if (!file.isDirectory() && !file.mkdirs()) {
                return new g5u(false, "checkingDir");
            }
            try {
                File file2 = new File(file, UUID.randomUUID().toString());
                if (!file2.createNewFile()) {
                    return new g5u(false, "createFile");
                }
                if (file2.delete()) {
                    return file.list() == null ? new g5u(false, "opendir") : new g5u(true, "");
                }
                return new g5u(false, "delete");
            } catch (Exception e) {
                g5u g5uVar = new g5u(false, "file-".concat(e.getClass().getSimpleName()));
                e.getMessage();
                return g5uVar;
            }
        } catch (SecurityException e2) {
            return new g5u(false, "dir-".concat(e2.getClass().getSimpleName()));
        }
    }
}
