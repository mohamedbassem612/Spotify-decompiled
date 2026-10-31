package p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hro extends Binder implements ng70 {
    public final Handler a;
    public final /* synthetic */ hwb l;

    public hro(hwb hwbVar) {
        this.l = hwbVar;
        attachInterface(this, ng70.b);
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = ng70.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.a;
        hwb hwbVar = this.l;
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, i3, bundle));
                    return true;
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, string, bundle2, (byte) 2));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, bundle3, (byte) 3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, string2, bundle4, (byte) 4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i4 = parcel.readInt();
                Uri uri = (Uri) nyo1.l(parcel, Uri.CREATOR);
                boolean z = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, i4, uri, z, bundle5));
                    return true;
                }
                return true;
            case 7:
                String string3 = parcel.readString();
                Bundle bundle6 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                Bundle bundle7 = null;
                if (hwbVar != null) {
                    String string4 = bundle6 != null ? bundle6.getString("crash_reason") : null;
                    if (string4 == null) {
                        bundle7 = Bundle.EMPTY;
                    } else {
                        Bundle bundle8 = new Bundle();
                        if (string3.equals("quality_enforcement.crash")) {
                            bundle8.putBoolean("success", true);
                            new Handler(Looper.getMainLooper()).post(new vwg(string4, (byte) 1));
                        }
                        bundle7 = bundle8;
                    }
                }
                parcel2.writeNoException();
                if (bundle7 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle7.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Bundle bundle9 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, i5, i6, bundle9));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle10 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, bundle10, (byte) 7));
                    return true;
                }
                return true;
            case 10:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                Bundle bundle11 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, i7, i8, i9, i10, i11, bundle11));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle12 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, bundle12, (byte) 9));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle13 = (Bundle) nyo1.l(parcel, Bundle.CREATOR);
                if (hwbVar != null) {
                    handler.post(new gro(this, bundle13, (byte) 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
