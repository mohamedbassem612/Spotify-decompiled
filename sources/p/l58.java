package p;

import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class l58 implements e9d0, akl, a441, sv81 {
    public final /* synthetic */ long a;

    public void accept(Object obj) {
        ((ffu0) obj).f(this.a);
    }

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new xpe1(cursor.getLong(0), this.a);
    }

    @Override // p.sv81
    public long get() {
        return this.a;
    }

    public void invoke(Object obj) {
        z8c0 z8c0Var;
        ugr ugrVar = (ugr) obj;
        ygr ygrVar = ugrVar.a;
        if (ugrVar == ygrVar.k && (z8c0Var = ygrVar.o) != null) {
            zjh0 zjh0Var = (zjh0) z8c0Var.b;
            zjh0Var.t2 = true;
            em3 em3Var = zjh0Var.i2;
            Handler handler = (Handler) em3Var.b;
            if (handler != null) {
                handler.post(new p38(em3Var, this.a, (byte) 0));
            }
        }
    }
}
