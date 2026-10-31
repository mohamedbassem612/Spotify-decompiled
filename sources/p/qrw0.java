package p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qrw0 {
    public static final HashMap e;
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    static {
        new xgc((byte) 20);
        e = new HashMap();
    }

    public qrw0(String str, File file, boolean z) {
        this.a = z;
        this.b = file != null ? new File(file, str.concat(".lck")) : null;
        this.c = xgc.k(str);
    }

    public final void a(boolean z) {
        this.c.lock();
        if (z) {
            File file = this.b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException unused) {
                this.d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
