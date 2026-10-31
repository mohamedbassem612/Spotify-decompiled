package p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class u520 {
    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    public static void a(l420 l420Var, File file) throws FileNotFoundException {
        if (file == null) {
            bhn0.i("Destination must not be null");
        } else {
            if (l420Var.exists()) {
                return;
            }
            throw new FileNotFoundException("Source '" + l420Var + "' does not exist");
        }
    }

    public static void b(l420 l420Var, l420 l420Var2) throws Throwable {
        ArrayList arrayList;
        l420[] l420VarArrB;
        a(l420Var, l420Var2);
        File file = l420Var2.b;
        File file2 = l420Var.b;
        if (!file2.isDirectory()) {
            n9v.n("Source '", l420Var, "' exists but is not a directory");
            return;
        }
        if (file2.getCanonicalPath().equals(file.getCanonicalPath())) {
            n9v.l(l420Var, l420Var2);
            return;
        }
        if (!file.getCanonicalPath().startsWith(file2.getCanonicalPath()) || (l420VarArrB = l420Var.b()) == null || l420VarArrB.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(l420VarArrB.length);
            for (l420 l420Var3 : l420VarArrB) {
                arrayList.add(new File((File) l420Var2, l420Var3.b.getName()).getCanonicalPath());
            }
        }
        d(l420Var, l420Var2, arrayList);
    }

    public static void c(l420 l420Var, l420 l420Var2) throws Throwable {
        a(l420Var, l420Var2);
        File file = l420Var2.b;
        File file2 = l420Var.b;
        if (file2.isDirectory()) {
            n9v.n("Source '", l420Var, "' exists but is a directory");
            return;
        }
        if (file2.getCanonicalPath().equals(file.getCanonicalPath())) {
            n9v.l(l420Var, l420Var2);
            return;
        }
        l420 l420VarA = l420Var2.a();
        if (l420VarA != null && !l420VarA.mkdirs() && !l420VarA.b.isDirectory()) {
            n9v.n("Destination '", l420VarA, "' directory cannot be created");
        } else if (!file.exists() || file.canWrite()) {
            e(l420Var, l420Var2);
        } else {
            n9v.n("Destination '", l420Var2, "' exists but is read-only");
        }
    }

    public static void d(File file, File file2, List list) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            hhg1.l(file, "Failed to list contents of ");
            return;
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                n9v.n("Destination '", file2, "' exists but is not a directory");
                return;
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            n9v.n("Destination '", file2, "' directory cannot be created");
            return;
        }
        if (!file2.canWrite()) {
            n9v.n("Destination '", file2, "' cannot be written to");
            return;
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    d(file3, file4, list);
                } else {
                    e(file3, file4);
                }
            }
        }
        file2.setLastModified(file.lastModified());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static void e(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        ?? channel;
        if (file2.exists() && file2.isDirectory()) {
            n9v.n("Destination '", file2, "' exists but is a directory");
            return;
        }
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    channel = fileInputStream.getChannel();
                    try {
                        ?? channel2 = fileOutputStream.getChannel();
                        try {
                            long size = channel.size();
                            long j = 0;
                            while (j < size) {
                                long j2 = size - j;
                                if (j2 > 31457280) {
                                    j2 = 31457280;
                                }
                                long jTransferFrom = channel2.transferFrom(channel, j, j2);
                                if (jTransferFrom == 0) {
                                    break;
                                } else {
                                    j += jTransferFrom;
                                }
                            }
                            uh70.b((Closeable[]) new Closeable[]{channel2, fileOutputStream, channel, fileInputStream});
                            long length = file.length();
                            long length2 = file2.length();
                            if (length == length2) {
                                file2.setLastModified(file.lastModified());
                                return;
                            }
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                        } catch (Throwable th) {
                            th = th;
                            r7 = channel2;
                            uh70.b((Closeable[]) new Closeable[]{r7, fileOutputStream, channel, fileInputStream});
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    channel = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                channel = fileOutputStream;
                uh70.b((Closeable[]) new Closeable[]{r7, fileOutputStream, channel, fileInputStream});
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            fileOutputStream = null;
        }
    }

    public static void f(File file) throws IOException {
        if (!file.isDirectory()) {
            boolean zExists = file.exists();
            if (file.delete()) {
                return;
            }
            if (zExists) {
                k220.h(file, "Unable to delete file: ");
                return;
            } else {
                t8e1.p(file, "File does not exist: ");
                return;
            }
        }
        if (file.exists()) {
            if (!g(file)) {
                if (!file.exists()) {
                    n9v.j(file, " does not exist");
                    return;
                }
                if (!file.isDirectory()) {
                    n9v.j(file, " is not a directory");
                    return;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    hhg1.l(file, "Failed to list contents of ");
                    return;
                }
                IOException e = null;
                for (File file2 : fileArrListFiles) {
                    try {
                        f(file2);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
            }
            if (file.delete()) {
                return;
            }
            n9v.m("Unable to delete directory ", file, ".");
        }
    }

    public static boolean g(File file) {
        File canonicalFile;
        File parentFile;
        File[] fileArrListFiles;
        if (j7a0.a) {
            try {
                return ((Boolean) j7a0.b.invoke(null, j7a0.c.invoke(file, null))).booleanValue();
            } catch (IllegalAccessException e) {
                eg.j(e);
                return false;
            } catch (InvocationTargetException e2) {
                eg.j(e2);
                return false;
            }
        }
        if (file == null) {
            bhn0.i("File must not be null");
            return false;
        }
        if (x520.a == '\\') {
            return false;
        }
        File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
        if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return (file.exists() || (parentFile = (canonicalFile = file.getCanonicalFile()).getParentFile()) == null || !parentFile.exists() || (fileArrListFiles = parentFile.listFiles(new t520(canonicalFile))) == null || fileArrListFiles.length <= 0) ? false : true;
        }
        return true;
    }

    public static long h(l420 l420Var) {
        File file = l420Var.b;
        if (!file.exists()) {
            k220.g(l420Var, " does not exist");
            return 0L;
        }
        if (file.isDirectory()) {
            return i(l420Var);
        }
        k220.g(l420Var, " is not a directory");
        return 0L;
    }

    public static long i(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jI = 0;
        for (File file2 : fileArrListFiles) {
            try {
                if (!g(file2)) {
                    jI += file2.isDirectory() ? i(file2) : file2.length();
                    if (jI < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return jI;
    }
}
