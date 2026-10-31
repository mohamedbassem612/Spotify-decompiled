package p;

import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vpc {
    public final zv81 a;
    public final long b;
    public n3r c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public hd31 i;

    public vpc(zv81 zv81Var) {
        zv81Var.getClass();
        this.a = zv81Var;
        this.b = 5242880L;
    }

    public final void a() {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            zoi1.h(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            zv81 zv81Var = this.a;
            long j = this.g;
            synchronized (zv81Var) {
                boolean z = true;
                dm5.y(!zv81Var.i);
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    aw81 aw81VarC = aw81.c(file, j, zv81Var.c);
                    aw81VarC.getClass();
                    ysc yscVarM = zv81Var.c.m(aw81VarC.a);
                    yscVarM.getClass();
                    dm5.y(yscVarM.g(aw81VarC.b, aw81VarC.c));
                    long jA = hyl.a(yscVarM.c());
                    if (jA != -1) {
                        if (aw81VarC.b + aw81VarC.c > jA) {
                            z = false;
                        }
                        dm5.y(z);
                    }
                    if (zv81Var.d == null) {
                        zv81Var.a(aw81VarC);
                        zv81Var.c.C();
                        zv81Var.notifyAll();
                        return;
                    }
                    try {
                        zv81Var.d.K(aw81VarC.c, aw81VarC.f, file.getName());
                        zv81Var.a(aw81VarC);
                        try {
                            zv81Var.c.C();
                            zv81Var.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new Cache.CacheException(e);
                        }
                    } catch (IOException e2) {
                        throw new Cache.CacheException(e2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th) {
            zoi1.h(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(n3r n3rVar) {
        File fileE;
        long j = n3rVar.g;
        long jMin = j != -1 ? Math.min(j - this.h, this.d) : -1L;
        zv81 zv81Var = this.a;
        String str = n3rVar.h;
        String str2 = zoi1.a;
        long j2 = n3rVar.f + this.h;
        synchronized (zv81Var) {
            try {
                dm5.y(!zv81Var.i);
                zv81Var.c();
                ysc yscVarM = zv81Var.c.m(str);
                yscVarM.getClass();
                dm5.y(yscVarM.g(j2, jMin));
                if (!zv81Var.a.exists()) {
                    zv81.d(zv81Var.a);
                    zv81Var.m();
                }
                zv81Var.b.e(zv81Var, jMin);
                File file = new File(zv81Var.a, Integer.toString(zv81Var.f.nextInt(10)));
                if (!file.exists()) {
                    zv81.d(file);
                }
                fileE = aw81.e(file, yscVarM.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = fileE;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        hd31 hd31Var = this.i;
        if (hd31Var == null) {
            this.i = new hd31(fileOutputStream, 20480);
        } else {
            hd31Var.a(fileOutputStream);
        }
        this.f = this.i;
        this.g = 0L;
    }
}
