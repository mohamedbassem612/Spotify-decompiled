package p;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ok extends mh70 implements zf70 {
    public static zf70 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof zf70 ? (zf70) iInterfaceQueryLocalInterface : new eap1(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
    }

    public static Account c1(zf70 zf70Var) {
        if (zf70Var != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                eap1 eap1Var = (eap1) zf70Var;
                Parcel parcelX0 = eap1Var.X0(2, eap1Var.a1());
                Account account = (Account) psn1.a(parcelX0, Account.CREATOR);
                parcelX0.recycle();
                return account;
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }
}
