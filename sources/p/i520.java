package p;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class i520 implements Closeable {
    public static final gka0 a;
    public static final s8s0 b;

    static {
        gka0 gka0Var;
        try {
            Class.forName("j$.nio.file.Files");
            gka0Var = new abo0();
        } catch (ClassNotFoundException unused) {
            gka0Var = new gka0();
        }
        a = gka0Var;
        String str = s8s0.b;
        b = gtv0.f(System.getProperty("java.io.tmpdir"));
        new xw21(xw21.class.getClassLoader());
    }

    public c291 a(s8s0 s8s0Var) {
        return si1.s(s8s0Var.toFile(), true);
    }

    public void c(s8s0 s8s0Var, s8s0 s8s0Var2) throws IOException {
        if (s8s0Var.toFile().renameTo(s8s0Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + s8s0Var + " to " + s8s0Var2);
    }

    public void d(s8s0 s8s0Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    public void e(s8s0 s8s0Var) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = s8s0Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        hhg1.l(s8s0Var, "failed to delete ");
    }

    public List f(s8s0 s8s0Var) {
        File file = s8s0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                hhg1.l(s8s0Var, "failed to list ");
                return null;
            }
            t8e1.p(s8s0Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(s8s0Var.e(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    public q420 g(s8s0 s8s0Var) {
        File file = s8s0Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new q420(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    public wia0 h(s8s0 s8s0Var) {
        return new wia0(new RandomAccessFile(s8s0Var.toFile(), "r"));
    }

    public c291 i(s8s0 s8s0Var, boolean z) throws IOException {
        if (!z || !ero1.j(this, s8s0Var)) {
            return si1.t(s8s0Var.toFile());
        }
        throw new IOException(s8s0Var + " already exists.");
    }

    public fka1 j(s8s0 s8s0Var) {
        return si1.u(s8s0Var.toFile());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
