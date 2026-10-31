package p;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vk30 extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final il00 b;
    public final up20 c;
    public final boolean d;
    public boolean e;
    public final qrw0 f;
    public boolean g;

    public vk30(Context context, String str, il00 il00Var, up20 up20Var, boolean z) {
        super(context, str, null, up20Var.a, new tk30(up20Var, il00Var));
        this.a = context;
        this.b = il00Var;
        this.c = up20Var;
        this.d = z;
        this.f = new qrw0(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final sk30 a(boolean z) {
        qrw0 qrw0Var = this.f;
        try {
            qrw0Var.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseC = c(z);
            if (!this.e) {
                return xa4.u(this.b, sQLiteDatabaseC);
            }
            close();
            return a(z);
        } finally {
            qrw0Var.b();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final SQLiteDatabase c(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof uk30) {
                    uk30 uk30Var = (uk30) th;
                    int iC = l1d.C(uk30Var.a);
                    th = uk30Var.b;
                    if (iC == 0 || iC == 1 || iC == 2 || iC == 3) {
                        throw th;
                    }
                    if (iC != 4) {
                        eg.o();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (uk30 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        qrw0 qrw0Var = this.f;
        try {
            qrw0Var.a(qrw0Var.a);
            super.close();
            this.b.m();
            this.g = false;
        } finally {
            qrw0Var.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.e;
        up20 up20Var = this.c;
        if (!z && up20Var.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            xa4.u(this.b, sQLiteDatabase);
            up20Var.getClass();
        } catch (Throwable th) {
            throw new uk30(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ((vgr) this.c.b).z(new f1d1(xa4.u(this.b, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new uk30(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
        try {
            this.c.e(xa4.u(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new uk30(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.e) {
            try {
                up20 up20Var = this.c;
                sk30 sk30VarU = xa4.u(this.b, sQLiteDatabase);
                vgr vgrVar = (vgr) up20Var.b;
                vgrVar.B(new f1d1(sk30VarU));
                vgr.c(vgrVar, sk30VarU);
            } catch (Throwable th) {
                throw new uk30(5, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
        try {
            this.c.e(xa4.u(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new uk30(3, th);
        }
    }
}
