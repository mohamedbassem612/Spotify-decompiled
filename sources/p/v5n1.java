package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v5n1 extends x5n1 {
    public final /* synthetic */ l7n1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ bsd1 f;
    public final /* synthetic */ y5n1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5n1(y5n1 y5n1Var, bsd1 bsd1Var, l7n1 l7n1Var, long j, long j2, bsd1 bsd1Var2) {
        super(y5n1Var, bsd1Var);
        this.c = l7n1Var;
        this.d = j;
        this.e = j2;
        this.f = bsd1Var2;
        this.g = y5n1Var;
    }

    @Override // p.v7n1
    public final void b() {
        l7n1 l7n1Var = this.c;
        bsd1 bsd1Var = this.f;
        y5n1 y5n1Var = this.g;
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
            Bundle bundleA = y5n1.a(y5n1Var, l7n1Var, this.d, this.e);
            w5n1 w5n1Var = new w5n1(y5n1Var, bsd1Var, (byte) 0);
            k7n1 k7n1Var = (k7n1) o7n1Var;
            k7n1Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = f6n1.a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(w5n1Var);
            try {
                k7n1Var.a.transact(3, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            y5n1Var.a.a(e, "requestExpressIntegrityToken(%s, %s, %s)", l7n1Var.a, l7n1Var.b, Long.valueOf(this.d));
            bsd1Var.c(new StandardIntegrityException(-100, e));
        }
    }
}
