package p;

import j$.io.DesugarFile;
import j$.io.FileRetargetInterface;
import j$.nio.file.Path;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l420 extends File implements FileRetargetInterface {
    public final f420 a;
    public final File b;
    public final hfb c;
    public final boolean d;
    public final v520 e;
    public static final k420 f = new k420(2, 1, "Failed to rename file at:");
    public static final k420 g = new k420(2, 1, "Failed to make dir at:");
    public static final k420 h = new k420(2, 1, "Failed to make dirs at:");
    public static final k420 i = new k420(1, 2, "Failed to list files at:");
    public static final k420 t = new k420(3, 3, "Failed to delete file at:");
    public static final k420 X = new k420(3, 3, "Failed to delete file on exit at:");
    public static final k420 Y = new k420(2, 1, "Failed to create file at:");
    public static final k420 Z = new k420(1, 2, "Failed to read at:");

    public l420(f420 f420Var, File file, hfb hfbVar, boolean z, v520 v520Var) {
        super(file.getAbsolutePath());
        this.a = f420Var;
        this.b = file;
        this.c = hfbVar;
        this.d = z;
        this.e = v520Var;
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l420 getParentFile() {
        File parentFile = this.b.getParentFile();
        if (parentFile == null) {
            return null;
        }
        return new l420(this.a, parentFile, this.c, this.d, this.e);
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l420[] listFiles() {
        Object obj = ((yrg0) this.e).b;
        File[] fileArr = (File[]) new ipi1(System.currentTimeMillis() - System.currentTimeMillis(), this.b.listFiles()).a();
        d(i, fileArr != null);
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            file.getClass();
            arrayList.add(new l420(this.a, file, this.c, this.d, this.e));
        }
        return (l420[]) arrayList.toArray(new l420[0]);
    }

    @Override // java.io.File
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l420[] listFiles(FilenameFilter filenameFilter) {
        Object obj = ((yrg0) this.e).b;
        File[] fileArr = (File[]) new ipi1(System.currentTimeMillis() - System.currentTimeMillis(), this.b.listFiles(filenameFilter)).a();
        d(i, fileArr != null);
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            file.getClass();
            arrayList.add(new l420(this.a, file, this.c, this.d, this.e));
        }
        return (l420[]) arrayList.toArray(new l420[0]);
    }

    @Override // java.io.File
    public final boolean canRead() {
        return this.b.canRead();
    }

    @Override // java.io.File
    public final boolean canWrite() {
        return this.b.canWrite();
    }

    @Override // java.io.File
    public final boolean createNewFile() throws Exception {
        boolean zBooleanValue;
        Object obj = ((yrg0) this.e).b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = null;
        try {
            e = null;
            boolValueOf = Boolean.valueOf(this.b.createNewFile());
        } catch (Exception e) {
            e = e;
        }
        jpi1 jpi1Var = new jpi1(boolValueOf, System.currentTimeMillis() - jCurrentTimeMillis, e);
        Boolean bool = (Boolean) jpi1Var.a();
        Exception excB = jpi1Var.b();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = excB == null;
        }
        d(Y, zBooleanValue);
        if (excB != null) {
            throw excB;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        eg.m("File.createNewFile() result cannot be null");
        return false;
    }

    public final void d(k420 k420Var, boolean z) {
        if (this.d) {
            v520 v520Var = this.e;
            File file = this.b;
            v520Var.r(file.getAbsolutePath());
            Date date = new Date();
            if (!z) {
                file.getAbsolutePath();
            }
            date.getTime();
            this.c.getClass();
        }
    }

    @Override // java.io.File
    public final boolean delete() {
        File file = this.b;
        file.length();
        Object obj = ((yrg0) this.e).b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) new ipi1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(file.delete())).a()).booleanValue();
        d(t, zBooleanValue);
        return zBooleanValue;
    }

    @Override // java.io.File
    public final void deleteOnExit() {
        File file = this.b;
        file.length();
        Object obj = ((yrg0) this.e).b;
        System.currentTimeMillis();
        file.deleteOnExit();
        System.currentTimeMillis();
        d(X, true);
    }

    @Override // java.io.File
    public final boolean exists() {
        return this.b.exists();
    }

    @Override // java.io.File
    public final File getAbsoluteFile() {
        return new l420(this.a, this.b.getAbsoluteFile(), this.c, this.d, this.e);
    }

    @Override // java.io.File
    public final String getAbsolutePath() {
        return this.b.getAbsolutePath();
    }

    @Override // java.io.File
    public final String getCanonicalPath() {
        return this.b.getCanonicalPath();
    }

    @Override // java.io.File
    public final String getName() {
        return this.b.getName();
    }

    @Override // java.io.File
    public final String getPath() {
        return this.b.getPath();
    }

    @Override // java.io.File
    public final boolean isDirectory() {
        return this.b.isDirectory();
    }

    @Override // java.io.File
    public final boolean isFile() {
        return this.b.isFile();
    }

    @Override // java.io.File
    public final boolean isHidden() {
        return this.b.isHidden();
    }

    @Override // java.io.File
    public final long lastModified() {
        return this.b.lastModified();
    }

    @Override // java.io.File
    public final long length() {
        return this.b.length();
    }

    @Override // java.io.File
    public final String[] list() {
        Object obj = ((yrg0) this.e).b;
        String[] strArr = (String[]) new ipi1(System.currentTimeMillis() - System.currentTimeMillis(), this.b.list()).a();
        d(i, strArr != null);
        return strArr;
    }

    @Override // java.io.File
    public final File[] listFiles(FileFilter fileFilter) {
        Object obj = ((yrg0) this.e).b;
        File[] fileArr = (File[]) new ipi1(System.currentTimeMillis() - System.currentTimeMillis(), this.b.listFiles(fileFilter)).a();
        d(i, fileArr != null);
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArr.length);
        for (File file : fileArr) {
            file.getClass();
            arrayList.add(new l420(this.a, file, this.c, this.d, this.e));
        }
        return (l420[]) arrayList.toArray(new l420[0]);
    }

    @Override // java.io.File
    public final boolean mkdir() {
        Object obj = ((yrg0) this.e).b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) new ipi1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(this.b.mkdir())).a()).booleanValue();
        d(g, zBooleanValue);
        return zBooleanValue;
    }

    @Override // java.io.File
    public final boolean mkdirs() {
        Object obj = ((yrg0) this.e).b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) new ipi1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(this.b.mkdirs())).a()).booleanValue();
        d(h, zBooleanValue);
        return zBooleanValue;
    }

    @Override // java.io.File
    public final boolean renameTo(File file) {
        Object obj = ((yrg0) this.e).b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) new ipi1(System.currentTimeMillis() - jCurrentTimeMillis, Boolean.valueOf(this.b.renameTo(file))).a()).booleanValue();
        d(f, zBooleanValue);
        return zBooleanValue;
    }

    @Override // java.io.File
    public final boolean setLastModified(long j) {
        return this.b.setLastModified(j);
    }

    @Override // java.io.File
    public /* synthetic */ Path toPath() {
        return DesugarFile.toPath(this);
    }

    @Override // java.io.File
    public final URI toURI() {
        return this.b.toURI();
    }
}
