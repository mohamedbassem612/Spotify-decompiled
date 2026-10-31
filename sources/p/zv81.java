package p;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zv81 {
    public static final HashSet k = new HashSet();
    public final File a;
    public final jqc b;
    public final toj0 c;
    public final rm5 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public boolean i;
    public Cache$CacheException j;

    public zv81(File file, jqc jqcVar, yab1 yab1Var, boolean z) {
        boolean zAdd;
        toj0 toj0Var = new toj0(yab1Var, file, z);
        rm5 rm5Var = (yab1Var == null || z) ? null : new rm5(yab1Var);
        synchronized (zv81.class) {
            zAdd = k.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            bhn0.A(file, "Another SimpleCache instance uses the folder: ");
            throw null;
        }
        this.a = file;
        this.b = jqcVar;
        this.c = toj0Var;
        this.d = rm5Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = jqcVar.d();
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new yv81(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void d(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        oon1.v(str);
        throw new Cache$CacheException(str);
    }

    public static synchronized void p(File file) {
        k.remove(file.getAbsoluteFile());
    }

    public final void a(aw81 aw81Var) {
        String str = aw81Var.a;
        this.c.q(str).a(aw81Var);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((jqc) arrayList.get(size)).a(this, aw81Var);
            }
        }
        this.b.a(this, aw81Var);
    }

    public final synchronized void b(String str, oql oqlVar) {
        dm5.y(!this.i);
        c();
        this.c.d(str, oqlVar);
        try {
            this.c.C();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void c() {
        Cache$CacheException cache$CacheException = this.j;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long e(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        j3 = 0;
        while (j < j5) {
            long jF = f(j, j5 - j, str);
            if (jF > 0) {
                j3 += jF;
            } else {
                jF = -jF;
            }
            j += jF;
        }
        return j3;
    }

    public final synchronized long f(long j, long j2, String str) {
        ysc yscVarM;
        dm5.y(!this.i);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        yscVarM = this.c.m(str);
        return yscVarM != null ? yscVarM.b(j, j2) : -j2;
    }

    public final synchronized ypr g(String str) {
        dm5.y(!this.i);
        return this.c.p(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void h() throws DatabaseIOException {
        long jAbs;
        toj0 toj0Var = this.c;
        File file = this.a;
        if (!file.exists()) {
            try {
                d(file);
            } catch (Cache$CacheException e) {
                this.j = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            oon1.v(str);
            this.j = new Cache$CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jAbs = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    jAbs = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    oon1.v("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        this.h = jAbs;
        if (jAbs == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file3 = new File(file, f4i1.e(Long.toString(jAbs, 16), ".uid"));
                if (!file3.createNewFile()) {
                    hhg1.l(file3, "Failed to create UID file: ");
                    jAbs = 0;
                }
                this.h = jAbs;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                oon1.w(str2, e2);
                this.j = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            toj0Var.s(jAbs);
            rm5 rm5Var = this.d;
            if (rm5Var != null) {
                rm5Var.u(this.h);
                HashMap mapR = rm5Var.r();
                i(file, true, fileArrListFiles, mapR);
                rm5Var.J(mapR.keySet());
            } else {
                i(file, true, fileArrListFiles, null);
            }
            toj0Var.B();
            try {
                toj0Var.C();
            } catch (IOException e3) {
                oon1.w("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            oon1.w(str3, e4);
            this.j = new Cache$CacheException(str3, e4);
        }
    }

    public final void i(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z || (!toj0.t(name) && !name.endsWith(".uid"))) {
                nqc nqcVar = map != null ? (nqc) map.remove(name) : null;
                if (nqcVar != null) {
                    j = nqcVar.a;
                    j2 = nqcVar.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                aw81 aw81VarB = aw81.b(file2, j, j2, this.c);
                if (aw81VarB != null) {
                    a(aw81VarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(aw81 aw81Var) {
        dm5.y(!this.i);
        ysc yscVarM = this.c.m(aw81Var.a);
        yscVarM.getClass();
        yscVarM.k(aw81Var.b);
        this.c.v(yscVarM.b);
        notifyAll();
    }

    public final synchronized void k(String str) {
        ysc yscVarM;
        dm5.y(!this.i);
        synchronized (this) {
            try {
                dm5.y(!this.i);
                yscVarM = this.c.m(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((yscVarM == null || yscVarM.f()) ? new TreeSet() : new TreeSet((Collection) yscVarM.e())).iterator();
        while (it.hasNext()) {
            l((aw81) it.next());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void l(aw81 aw81Var) throws DatabaseIOException {
        String str = aw81Var.a;
        toj0 toj0Var = this.c;
        ysc yscVarM = toj0Var.m(str);
        if (yscVarM == null || !yscVarM.i(aw81Var)) {
            return;
        }
        rm5 rm5Var = this.d;
        if (rm5Var != null) {
            File file = aw81Var.e;
            file.getClass();
            String name = file.getName();
            try {
                ((String) rm5Var.a).getClass();
                try {
                    ((yab1) rm5Var.b).getWritableDatabase().delete((String) rm5Var.a, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                ktd.r("Failed to remove file index entry for: ", name);
            }
        }
        toj0Var.v(yscVarM.b);
        ArrayList arrayList = (ArrayList) this.e.get(aw81Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((jqc) arrayList.get(size)).b(aw81Var);
            }
        }
        this.b.b(aw81Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final void m() throws DatabaseIOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.o().iterator();
        while (it.hasNext()) {
            for (aw81 aw81Var : ((ysc) it.next()).e()) {
                File file = aw81Var.e;
                file.getClass();
                if (file.length() != aw81Var.c) {
                    arrayList.add(aw81Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            l((aw81) arrayList.get(i));
        }
    }

    public final synchronized aw81 n(long j, long j2, String str) {
        aw81 aw81VarD;
        aw81 aw81VarD2;
        dm5.y(!this.i);
        c();
        ysc yscVarM = this.c.m(str);
        if (yscVarM == null) {
            aw81VarD2 = aw81.d(j, j2, str);
        } else {
            while (true) {
                aw81VarD = yscVarM.d(j, j2);
                if (!aw81VarD.d) {
                    break;
                }
                File file = aw81VarD.e;
                file.getClass();
                if (file.length() == aw81VarD.c) {
                    break;
                }
                m();
            }
            aw81VarD2 = aw81VarD;
        }
        if (aw81VarD2.d) {
            return o(str, aw81VarD2);
        }
        if (this.c.q(str).h(j, aw81VarD2.c)) {
            return aw81VarD2;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.database.DatabaseIOException */
    public final aw81 o(String str, aw81 aw81Var) throws DatabaseIOException {
        boolean z;
        if (!this.g) {
            return aw81Var;
        }
        File file = aw81Var.e;
        file.getClass();
        String name = file.getName();
        long j = aw81Var.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        rm5 rm5Var = this.d;
        if (rm5Var != null) {
            try {
                rm5Var.K(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                oon1.H("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        ysc yscVarM = this.c.m(str);
        yscVarM.getClass();
        aw81 aw81VarJ = yscVarM.j(aw81Var, jCurrentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.e.get(aw81Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((jqc) arrayList.get(size)).c(this, aw81Var, aw81VarJ);
            }
        }
        this.b.c(this, aw81Var, aw81VarJ);
        return aw81VarJ;
    }
}
