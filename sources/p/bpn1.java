package p;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.MotionEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bpn1 {
    public final long a;
    public final von1 b;
    public long c;

    public bpn1(Context context, int i, long j) {
        this.a = j;
        von1 von1Var = new von1(context, null, null, 1);
        this.b = von1Var;
        SQLiteDatabase writableDatabase = von1Var.getWritableDatabase();
        nln1 nln1Var = nln1.b;
        String strJ0 = dm5.j0(nln1Var);
        String strJ1 = dm5.j0(nln1Var);
        String strJ2 = dm5.j0(nln1Var);
        int i2 = (int) (i * 0.2f);
        int i3 = 1 < i2 ? i2 : 1;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 165 + strJ0.length() + 25 + strJ1.length() + 24 + strJ2.length() + 7 + String.valueOf(i3).length() + 31);
        sb.append("\n        CREATE TRIGGER tgr48932\n        AFTER INSERT ON tbl64158\n        WHEN (SELECT COUNT(*) FROM tbl64158) > ");
        sb.append(i);
        sb.append("\n        BEGIN\n          DELETE FROM tbl64158 WHERE ");
        sb.append(strJ0);
        bb00.j(sb, " IN (\n            SELECT ", strJ1, " FROM tbl64158 ORDER BY ", strJ2);
        sb.append(" LIMIT ");
        sb.append(i3);
        sb.append("\n          );\n        END;\n    ");
        String strJ = jhc1.J(sb.toString());
        writableDatabase.getClass();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("DROP TRIGGER IF EXISTS tgr48932");
            writableDatabase.execSQL(strJ);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void a(String str, MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (eventTime - this.c < this.a) {
            return;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(dm5.j0(nln1.c), str.getBytes(nne.a));
        contentValues.put(dm5.j0(nln1.f), Long.valueOf(motionEvent.getDownTime()));
        contentValues.put(dm5.j0(nln1.e), Long.valueOf(motionEvent.getEventTime()));
        contentValues.put(dm5.j0(nln1.d), Integer.valueOf(motionEvent.getAction()));
        contentValues.put(dm5.j0(nln1.g), Integer.valueOf(motionEvent.getPointerCount()));
        contentValues.put(dm5.j0(nln1.h), Integer.valueOf(motionEvent.getMetaState()));
        contentValues.put(dm5.j0(nln1.i), Integer.valueOf(motionEvent.getButtonState()));
        contentValues.put(dm5.j0(nln1.t), Float.valueOf(motionEvent.getRawX()));
        contentValues.put(dm5.j0(nln1.X), Float.valueOf(motionEvent.getRawY()));
        contentValues.put(dm5.j0(nln1.Y), Integer.valueOf(motionEvent.getDeviceId()));
        contentValues.put(dm5.j0(nln1.Z), Integer.valueOf(motionEvent.getToolType(motionEvent.getActionIndex())));
        contentValues.put(dm5.j0(nln1.N0), Integer.valueOf(motionEvent.getEdgeFlags()));
        contentValues.put(dm5.j0(nln1.O0), Integer.valueOf(motionEvent.getSource()));
        contentValues.put(dm5.j0(nln1.P0), Float.valueOf(motionEvent.getPressure()));
        contentValues.put(dm5.j0(nln1.Q0), Float.valueOf(motionEvent.getSize()));
        contentValues.put(dm5.j0(nln1.R0), Integer.valueOf(motionEvent.getFlags()));
        writableDatabase.insert("tbl64158", null, contentValues);
        this.c = eventTime;
    }
}
