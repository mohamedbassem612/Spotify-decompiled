package p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o72 extends ContentObserver {
    public final mw7 a;
    public final ao0 b;
    public int c;
    public boolean d;
    public String e;

    public o72(Handler handler, mw7 mw7Var, ao0 ao0Var) {
        super(handler);
        this.a = mw7Var;
        this.b = ao0Var;
        int iD = ((uw7) mw7Var).d();
        this.c = iD;
        this.d = iD == 0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        String str = this.e;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            String str2 = str;
            if (str2 == null) {
                return;
            }
            int iD = ((uw7) this.a).d();
            if (iD != this.c) {
                ao0.c(this.b, co0.m1, str2, 0L, null, null, null, null, 96);
                this.c = iD;
            }
            boolean z2 = iD == 0;
            if (this.d != z2) {
                this.d = z2;
                ao0.c(this.b, z2 ? co0.R0 : co0.d1, str2, 0L, null, null, null, null, 96);
            }
        }
    }
}
