package p;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class t7s implements Function, plh0, e2i0, a441 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t7s(long j, s29 s29Var) {
        this.a = (byte) 4;
        this.b = j;
        this.c = s29Var;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                return ((v7s) obj2).b.c().j(j, (spq0) obj);
            case 1:
            default:
                s29 s29Var = (s29) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                String str = s29Var.a;
                xnw0 xnw0Var = s29Var.c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(aow0.a(xnw0Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(aow0.a(xnw0Var)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            case 2:
                return ((lxh0) obj).a(j, (String) obj2);
        }
    }

    public void f(kh70 kh70Var, int i) {
        rlh0 rlh0Var = (rlh0) this.c;
        kh70Var.V0(rlh0Var.c, i, this.b);
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        try {
            return fzh0Var.x(ixh0Var, b380.t(yoh0.b(ixh0Var.c, (Bundle) this.c)), 0, this.b);
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for MediaItem", e);
            return new c280(e);
        }
    }

    public /* synthetic */ t7s(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
