package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f2o1 extends b2o1 {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ bsd1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2o1(hzo1 hzo1Var, bsd1 bsd1Var, bsd1 bsd1Var2, f2o1 f2o1Var) {
        super(bsd1Var);
        this.c = bsd1Var2;
        this.d = f2o1Var;
        Objects.requireNonNull(hzo1Var);
        this.e = hzo1Var;
    }

    @Override // p.b2o1
    public void a(Exception exc) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!(exc instanceof zzp)) {
                    super.a(exc);
                } else {
                    super.a(new AgeSignalsException(-5));
                }
                break;
            default:
                super.a(exc);
                break;
        }
    }

    @Override // p.b2o1
    public final void b() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                bsd1 bsd1Var = this.c;
                try {
                    mbo1 mbo1Var = (mbo1) this.e;
                    cg70 cg70Var = mbo1Var.b.m;
                    String packageName = mbo1Var.a.getPackageName();
                    Bundle bundle = new Bundle();
                    bundle.putInt("playcore.version.code", 3);
                    mh70 d7o1Var = new d7o1(mbo1Var, bsd1Var);
                    ag70 ag70Var = (ag70) cg70Var;
                    ag70Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.agesignals.protocol.IAgeSignalsService");
                    parcelObtain.writeString(packageName);
                    int i = xsn1.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(d7o1Var);
                    try {
                        ag70Var.a.transact(1, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException unused) {
                    w1x0 w1x0Var = (w1x0) this.d;
                    hdn1 hdn1Var = mbo1.c;
                    Object[] objArr = {w1x0Var};
                    hdn1Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        hdn1.i(hdn1Var.b, "checkAgeSignals(%s)", objArr);
                    }
                    bsd1Var.c(new AgeSignalsException(-100));
                    return;
                }
            default:
                hzo1 hzo1Var = (hzo1) this.e;
                synchronized (hzo1Var.f) {
                    try {
                        bsd1 bsd1Var2 = this.c;
                        hzo1Var.e.add(bsd1Var2);
                        bsd1Var2.a.b(new bym1(hzo1Var, bsd1Var2, (byte) 10));
                        if (hzo1Var.k.getAndIncrement() > 0) {
                            hzo1Var.b.g("Already connected to the service.", new Object[0]);
                        }
                        hzo1.b(hzo1Var, (f2o1) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2o1(mbo1 mbo1Var, bsd1 bsd1Var, bsd1 bsd1Var2, w1x0 w1x0Var) {
        super(bsd1Var);
        this.c = bsd1Var2;
        this.d = w1x0Var;
        this.e = mbo1Var;
    }
}
