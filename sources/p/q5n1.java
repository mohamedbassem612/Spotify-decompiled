package p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class q5n1 extends Binder implements IInterface {
    public final /* synthetic */ byte a = 0;

    public q5n1(String str) {
        attachInterface(this, str);
    }

    public boolean X0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                p8n1.a(parcel, b8n1.CREATOR);
                p8n1.c(parcel);
                break;
            case 4:
                p8n1.c(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                p8n1.c(parcel);
                break;
            case 7:
                p8n1.a(parcel, GoogleSignInAccount.CREATOR);
                p8n1.c(parcel);
                break;
            case 8:
                k9n1 k9n1VarA = p8n1.a(parcel, k9n1.CREATOR);
                p8n1.c(parcel);
                s8n1 s8n1Var = (s8n1) this;
                s8n1Var.m.post(new mqh1(s8n1Var, k9n1VarA, false, (byte) 9));
                break;
            case 9:
                p8n1.a(parcel, c9n1.CREATOR);
                p8n1.c(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Exception standardIntegrityException;
        switch (this.a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                w5n1 w5n1Var = (w5n1) this;
                y5n1 y5n1Var = w5n1Var.f130p;
                u7n1 u7n1Var = w5n1Var.o;
                byte b = w5n1Var.n;
                bsd1 bsd1Var = w5n1Var.l;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) f6n1.a(parcel);
                    f6n1.b(parcel);
                    switch (b) {
                        case 1:
                            w5n1Var.Z0(bundle);
                            u7n1Var.b("onWarmUpExpressIntegrityToken", new Object[0]);
                            y5n1Var.d.getClass();
                            int i3 = bundle.getInt("error");
                            standardIntegrityException = i3 != 0 ? new StandardIntegrityException(i3, (Throwable) null) : null;
                            if (standardIntegrityException != null) {
                                bsd1Var.c(standardIntegrityException);
                                return true;
                            }
                            bsd1Var.d(Long.valueOf(bundle.getLong("warm.up.sid")));
                            return true;
                        default:
                            w5n1Var.Z0(bundle);
                            return true;
                    }
                }
                if (i != 3) {
                    y5n1 y5n1Var2 = w5n1Var.m;
                    if (i == 4) {
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        f6n1.b(parcel);
                        y5n1Var2.e.c(bsd1Var);
                        return true;
                    }
                    if (i != 5) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    f6n1.b(parcel);
                    y5n1Var2.e.c(bsd1Var);
                    return true;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) f6n1.a(parcel);
                f6n1.b(parcel);
                switch (b) {
                    case 0:
                        w5n1Var.Y0(bundle2);
                        u7n1Var.b("onRequestExpressIntegrityToken", new Object[0]);
                        y5n1Var.d.getClass();
                        int i4 = bundle2.getInt("error");
                        standardIntegrityException = i4 != 0 ? new StandardIntegrityException(i4, (Throwable) null) : null;
                        if (standardIntegrityException != null) {
                            bsd1Var.c(standardIntegrityException);
                            return true;
                        }
                        bundle2.getLong("request.token.sid");
                        l1d.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                        String string = bundle2.getString("token");
                        if (string != null) {
                            bsd1Var.d(new b6n1(string));
                            return true;
                        }
                        bhn0.i("Null token");
                        return true;
                    default:
                        w5n1Var.Y0(bundle2);
                        return true;
                }
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return X0(i, parcel, parcel2);
        }
    }

    public /* synthetic */ q5n1() {
    }
}
