package p;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class uh70 {
    public static final /* synthetic */ int a = 0;

    static {
        char c = File.separatorChar;
        PrintWriter printWriter = new PrintWriter(new rgc1());
        printWriter.println();
        printWriter.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            a(closeable);
        }
    }
}
