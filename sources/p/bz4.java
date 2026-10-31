package p;

import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bz4 {
    public static final Object h = new Object();
    public final File a;
    public final File b;
    public final nfa0 c;
    public final v3v0 d;
    public final nit e;
    public final Function0 f;
    public final ro30 g;

    public bz4(File file, File file2, nfa0 nfa0Var, v3v0 v3v0Var, nit nitVar, ro30 ro30Var) {
        az4 az4Var = az4.a;
        this.a = file;
        this.b = file2;
        this.c = nfa0Var;
        this.d = v3v0Var;
        this.e = nitVar;
        this.f = az4Var;
        this.g = ro30Var;
    }

    public final void a(File file) {
        v0u v0uVarA;
        synchronized (h) {
            try {
                try {
                    if (u890.j(file.getCanonicalFile().getParentFile(), this.a.getCanonicalFile()) && file.isFile()) {
                        File file2 = new File(this.b, file.getName() + ".json");
                        long length = file.length();
                        if (1 > length || length > 33554432 || file.lastModified() < ((Number) this.f.invoke()).longValue() - 86400000) {
                            this.g.t("Accepting Android profile " + file.getName() + " failed: empty, too large, or too old");
                            if (file.delete()) {
                                file2.delete();
                            }
                        } else {
                            if (file2.exists()) {
                                v0uVarA = v0u.a(file, (v0u) this.c.a(y520.H(file2), v0u.Companion.serializer()));
                            } else {
                                v0uVarA = (v0u) this.d.invoke(file);
                                b(file2, v0uVarA);
                            }
                            this.g.t("Prepared Android profile " + file.getName() + " for intake");
                            this.e.invoke(v0uVarA);
                            if (!file.exists()) {
                                file2.delete();
                            }
                        }
                    } else {
                        this.g.t("Accepting Android profile " + file.getName() + " failed: invalid path or not a regular file");
                    }
                } catch (Exception e) {
                    this.g.t("Accepting Android profile " + file.getName() + " failed due to " + e.getClass().getSimpleName());
                    Logger.d("Failed to accept Android profile (%s)", new Object[]{e.getClass().getSimpleName()});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(File file, v0u v0uVar) throws IOException {
        File file2 = this.b;
        if (!file2.isDirectory() && !file2.mkdirs()) {
            k220.i("Cannot create profile metadata directory");
            return;
        }
        File file3 = new File(file2, f4i1.e(file.getName(), ".tmp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        try {
            fileOutputStream.write(this.c.b(v0u.Companion.serializer(), v0uVar).getBytes(nne.a));
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            if (file3.renameTo(file)) {
                return;
            }
            k220.i("Cannot publish profile metadata");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
