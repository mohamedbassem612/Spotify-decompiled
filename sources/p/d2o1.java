package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d2o1 extends y9n1 {
    public d2o1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator", (byte) 3);
    }

    public final hpn1 g1() {
        hpn1 hpn1Var;
        Parcel parcelY0 = Y0(4, a1());
        IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            hpn1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            hpn1Var = iInterfaceQueryLocalInterface instanceof hpn1 ? (hpn1) iInterfaceQueryLocalInterface : new hpn1(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", (byte) 3);
        }
        parcelY0.recycle();
        return hpn1Var;
    }

    public final qso1 h1(qfp0 qfp0Var, GoogleMapOptions googleMapOptions) {
        qso1 qso1Var;
        Parcel parcelA1 = a1();
        tsn1.b(parcelA1, qfp0Var);
        tsn1.a(parcelA1, googleMapOptions);
        Parcel parcelY0 = Y0(3, parcelA1);
        IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            qso1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            qso1Var = iInterfaceQueryLocalInterface instanceof qso1 ? (qso1) iInterfaceQueryLocalInterface : new qso1(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", (byte) 3);
        }
        parcelY0.recycle();
        return qso1Var;
    }

    public final oio1 i1() {
        oio1 ibo1Var;
        Parcel parcelY0 = Y0(5, a1());
        IBinder strongBinder = parcelY0.readStrongBinder();
        int i = hfo1.l;
        if (strongBinder == null) {
            ibo1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            ibo1Var = iInterfaceQueryLocalInterface instanceof oio1 ? (oio1) iInterfaceQueryLocalInterface : new ibo1(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", (byte) 3);
        }
        parcelY0.recycle();
        return ibo1Var;
    }

    public final void j1(qfp0 qfp0Var) {
        Parcel parcelA1 = a1();
        tsn1.b(parcelA1, qfp0Var);
        parcelA1.writeInt(12451000);
        c1(6, parcelA1);
    }
}
