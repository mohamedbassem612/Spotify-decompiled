package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xrm0 extends Binder implements ph70 {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public xrm0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, ph70.g);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        yrm0 yrm0Var;
        String str = ph70.g;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        oh70 oh70Var = null;
        oh70 oh70Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(oh70.f);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof oh70)) {
                    nh70 nh70Var = new nh70();
                    nh70Var.a = strongBinder;
                    oh70Var = nh70Var;
                } else {
                    oh70Var = (oh70) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                synchronized (multiInstanceInvalidationService.c) {
                    try {
                        int i4 = multiInstanceInvalidationService.a + 1;
                        multiInstanceInvalidationService.a = i4;
                        if (multiInstanceInvalidationService.c.register(oh70Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(oh70.f);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof oh70)) {
                    nh70 nh70Var2 = new nh70();
                    nh70Var2.a = strongBinder2;
                    oh70Var2 = nh70Var2;
                } else {
                    oh70Var2 = (oh70) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.c) {
                multiInstanceInvalidationService2.c.unregister(oh70Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
        synchronized (multiInstanceInvalidationService3.c) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.b.get(Integer.valueOf(i6));
                if (str2 != null) {
                    int iBeginBroadcast = multiInstanceInvalidationService3.c.beginBroadcast();
                    while (true) {
                        yrm0Var = multiInstanceInvalidationService3.c;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Integer num = (Integer) yrm0Var.getBroadcastCookie(i3);
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.b.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((oh70) multiInstanceInvalidationService3.c.getBroadcastItem(i3)).o(strArrCreateStringArray);
                                } catch (RemoteException unused) {
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.c.finishBroadcast();
                            throw th2;
                        }
                    }
                    yrm0Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
