package p;

import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z320 {
    public static final Object e = new Object();
    public static final LinkedHashSet f = new LinkedHashSet();
    public static final LinkedHashMap g = new LinkedHashMap();
    public final File a;
    public final nfa0 b;
    public final Function0 c;
    public final vu30 d;

    public z320(File file, nfa0 nfa0Var) {
        u320 u320Var = u320.a;
        v320 v320Var = v320.a;
        wo10 wo10Var = wo10.i;
        this.a = file;
        this.b = nfa0Var;
        this.c = u320Var;
        this.d = wo10Var;
    }

    public static void h(v0u v0uVar) {
        synchronized (e) {
            f.remove(v0uVar.a.getCanonicalPath());
        }
    }

    public static void i(File file) {
        try {
            try {
                if (file.exists() && !y520.E(file)) {
                    Logger.d("Failed to clean diagnostic report staging directory", new Object[0]);
                }
                synchronized (e) {
                    g.values().remove(file.getPath());
                }
            } catch (SecurityException unused) {
                Logger.d("Cannot access diagnostic report staging directory for cleanup", new Object[0]);
                synchronized (e) {
                    g.values().remove(file.getPath());
                }
            }
        } catch (Throwable th) {
            synchronized (e) {
                g.values().remove(file.getPath());
                throw th;
            }
        }
    }

    public final boolean a(v0u v0uVar) {
        synchronized (e) {
            boolean z = false;
            try {
                try {
                    File parentFile = v0uVar.a.getParentFile();
                    if (parentFile == null) {
                        return false;
                    }
                    File parentFile2 = parentFile.getParentFile();
                    if (u890.j(parentFile2 != null ? parentFile2.getCanonicalFile() : null, this.a.getCanonicalFile()) && u890.j(parentFile.getName(), v0uVar.b) && u890.j(v0uVar.a.getName(), "payload") && f.contains(v0uVar.a.getCanonicalPath())) {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(parentFile, "deferred"));
                        try {
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            z = true;
                            return z;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                u890.p(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (IOException | SecurityException unused) {
            }
        }
    }

    public final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                if (!j((v0u) it.next())) {
                    Logger.d("Failed to evict diagnostic report", new Object[0]);
                }
            } catch (IOException unused) {
                Logger.d("Failed to evict diagnostic report", new Object[0]);
            } catch (SecurityException unused2) {
                Logger.d("Cannot access diagnostic report for eviction", new Object[0]);
            }
        }
    }

    public final l1u c(File file, v0u v0uVar) {
        return u890.j(g(file), v0u.a(new File(file, "payload"), v0uVar)) ? l1u.a : l1u.f;
    }

    public final boolean d(long j) {
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (nhc1.Y(file.getName(), ".pending-", false)) {
                arrayList.add(file);
            }
        }
        Iterator it = arrayList.iterator();
        long length = 0;
        long length2 = 0;
        while (it.hasNext()) {
            length2 += new File((File) it.next(), "payload").length();
        }
        ArrayList arrayList2 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (!nhc1.Y(file2.getName(), ".pending-", false)) {
                arrayList2.add(file2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            length += new File((File) it2.next(), "payload").length();
        }
        return j <= 33554432 - length2 && j <= (67108864 - length) - length2;
    }

    public final ArrayList e(long j) {
        LinkedHashSet linkedHashSet;
        List<v0u> listK = k();
        List list = listK;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashSet = f;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (linkedHashSet.contains(((v0u) next).a.getCanonicalPath())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j2 = 0;
        long j3 = 0;
        while (it2.hasNext()) {
            j3 += ((v0u) it2.next()).f;
        }
        if (j > 33554432 - j3) {
            return null;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            j2 += ((v0u) it3.next()).f;
        }
        ArrayList arrayList2 = new ArrayList();
        for (v0u v0uVar : listK) {
            if (j2 + j <= 33554432) {
                break;
            }
            if (!linkedHashSet.contains(v0uVar.a.getCanonicalPath())) {
                arrayList2.add(v0uVar);
                j2 -= v0uVar.f;
            }
        }
        return arrayList2;
    }

    public final void f(long j) {
        synchronized (e) {
            try {
                File[] fileArrListFiles = this.a.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                for (File file : fileArrListFiles) {
                    file.getClass();
                    v0u v0uVarG = g(file);
                    if (v0uVarG != null) {
                        if (!f.contains(v0uVarG.a.getCanonicalPath()) && v0uVarG.e < j) {
                            j(v0uVarG);
                        }
                    } else if (nhc1.Y(file.getName(), ".pending-", false) && !g.values().contains(file.getCanonicalPath()) && file.lastModified() < ((Number) this.c.invoke()).longValue() - 600000) {
                        y520.E(file);
                    } else if (k1u.s(file.getName()) && file.lastModified() < j && !f.contains(new File(file, "payload").getCanonicalPath())) {
                        y520.E(file);
                    }
                }
                ArrayList arrayListE = e(0L);
                if (arrayListE != null) {
                    b(arrayListE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v0u g(File file) {
        try {
            if (k1u.s(file.getName()) && file.isDirectory()) {
                y320 y320Var = (y320) this.b.a(y520.H(new File(file, "report.json")), y320.Companion.serializer());
                File file2 = new File(file, "payload");
                int i = y320Var.a;
                v0u v0uVar = y320Var.b;
                if (i == 2 && u890.j(v0uVar.b, file.getName()) && file2.isFile() && file2.length() == v0uVar.f) {
                    return v0u.a(file2, v0uVar);
                }
                Logger.k("Ignoring diagnostic report with unsupported manifest or inconsistent payload", new Object[0]);
                return null;
            }
        } catch (IOException unused) {
            Logger.k("Cannot read diagnostic report manifest or payload", new Object[0]);
        } catch (IllegalArgumentException unused2) {
            Logger.k("Cannot decode diagnostic report manifest", new Object[0]);
        } catch (SecurityException unused3) {
            Logger.k("Access denied reading diagnostic report", new Object[0]);
        }
        return null;
    }

    public final boolean j(v0u v0uVar) {
        synchronized (e) {
            try {
                File parentFile = v0uVar.a.getParentFile();
                if (parentFile == null) {
                    return false;
                }
                File parentFile2 = parentFile.getParentFile();
                if (u890.j(parentFile2 != null ? parentFile2.getCanonicalFile() : null, this.a.getCanonicalFile()) && u890.j(parentFile.getName(), v0uVar.b) && u890.j(v0uVar.a.getName(), "payload")) {
                    return y520.E(parentFile);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List k() {
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            v0u v0uVarG = g(file);
            if (v0uVarG != null) {
                arrayList.add(v0uVarG);
            }
        }
        return o7h.a1(arrayList, pap1.s(new iu30[]{zs10.T0, zs10.U0}));
    }

    public final void l(File file, v0u v0uVar) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(this.b.b(y320.Companion.serializer(), new y320(v0uVar)).getBytes(nne.a));
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
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
