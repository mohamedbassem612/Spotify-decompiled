package p;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tk30 implements DatabaseErrorHandler {
    public final /* synthetic */ up20 a;
    public final /* synthetic */ il00 b;

    public /* synthetic */ tk30(up20 up20Var, il00 il00Var) {
        this.a = up20Var;
        this.b = il00Var;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        int i = vk30.h;
        sQLiteDatabase.getClass();
        sk30 sk30VarU = xa4.u(this.b, sQLiteDatabase);
        this.a.getClass();
        SQLiteDatabase sQLiteDatabase2 = sk30VarU.a;
        if (!sQLiteDatabase2.isOpen()) {
            String path = sQLiteDatabase2.getPath();
            if (path != null) {
                up20.c(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                sk30VarU.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    up20.c((String) ((Pair) it.next()).second);
                }
            } else {
                String path2 = sQLiteDatabase2.getPath();
                if (path2 != null) {
                    up20.c(path2);
                }
            }
        }
    }
}
