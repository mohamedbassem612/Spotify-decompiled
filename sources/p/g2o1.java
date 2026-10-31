package p;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g2o1 {
    public final long a;
    public final Context b;
    public File c;

    public g2o1(Context context) {
        this.b = context;
        this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void c(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        k220.i(f4i1.f("Failed to delete '", file.getAbsolutePath(), "'"));
    }

    public static File d(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        hhg1.n("split ID cannot be placed in target directory");
        return null;
    }

    public static void e(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            hhg1.n("File input must be directory when it exists.");
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            k220.i("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    public final HashSet a() throws IOException {
        File file = new File(g(), "verified-splits");
        e(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    String name = file2.getName();
                    hashSet.add(new lpn1(file2, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void b() throws IOException {
        File fileF = f();
        String[] list = fileF.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.a))) {
                    File file = new File(fileF, str);
                    file.toString();
                    c(file);
                }
            }
        }
    }

    public final File f() throws IOException {
        if (this.c == null) {
            Context context = this.b;
            if (context == null) {
                eg.m("context must be non-null to populate null filesDir");
                return null;
            }
            this.c = context.getFilesDir();
        }
        File file = new File(this.c, "splitcompat");
        e(file);
        return file;
    }

    public final File g() throws IOException {
        File file = new File(f(), Long.toString(this.a));
        e(file);
        return file;
    }
}
