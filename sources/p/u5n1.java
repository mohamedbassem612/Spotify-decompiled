package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u5n1 extends x5n1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ bsd1 d;
    public final /* synthetic */ y5n1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5n1(y5n1 y5n1Var, bsd1 bsd1Var, long j, bsd1 bsd1Var2) {
        super(y5n1Var, bsd1Var);
        this.c = j;
        this.d = bsd1Var2;
        this.e = y5n1Var;
    }

    @Override // p.v7n1
    public final void b() {
        bsd1 bsd1Var = this.d;
        long j = this.c;
        y5n1 y5n1Var = this.e;
        if (y5n1.d(y5n1Var)) {
            a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        if (y5n1.c(y5n1Var)) {
            a(new StandardIntegrityException(-14, (Throwable) null));
            return;
        }
        try {
            o7n1 o7n1Var = y5n1Var.e.n;
            Bundle bundleB = y5n1.b(y5n1Var, j);
            w5n1 w5n1Var = new w5n1(y5n1Var, bsd1Var, (byte) 1);
            k7n1 k7n1Var = (k7n1) o7n1Var;
            k7n1Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = f6n1.a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(w5n1Var);
            try {
                k7n1Var.a.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            y5n1Var.a.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            bsd1Var.c(new StandardIntegrityException(-100, e));
        }
    }
}
