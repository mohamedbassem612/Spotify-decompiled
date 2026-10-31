package p;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xen1 extends mh70 {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xen1(qlr qlrVar) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", (byte) 6);
        this.m = qlrVar;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        kbo1 kbo1Var;
        byte b = this.l;
        Object obj = this.m;
        LatLng msn1Var = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (i != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    kbo1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    kbo1Var = iInterfaceQueryLocalInterface instanceof kbo1 ? (kbo1) iInterfaceQueryLocalInterface : new kbo1(strongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 3);
                }
                int i2 = tsn1.a;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(f4i1.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                iyi1 iyi1Var = (iyi1) obj;
                new HashMap();
                zod.s(kbo1Var);
                dyi1 dyi1Var = iyi1Var.a;
                LatLng latLng = dyi1Var.d;
                iu30 iu30Var = iyi1Var.b;
                ven0 ven0Var = iyi1Var.c;
                qtg0 qtg0Var = new qtg0();
                qtg0Var.e = 0.5f;
                qtg0Var.f = 1.0f;
                qtg0Var.h = true;
                qtg0Var.i = false;
                qtg0Var.t = 0.0f;
                qtg0Var.X = 0.5f;
                qtg0Var.Y = 0.0f;
                qtg0Var.Z = 1.0f;
                qtg0Var.a = latLng;
                qtg0Var.b = dyi1Var.a;
                try {
                    Parcel parcelA1 = kbo1Var.a1();
                    tsn1.a(parcelA1, qtg0Var);
                    Parcel parcelY0 = kbo1Var.Y0(11, parcelA1);
                    IBinder strongBinder2 = parcelY0.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (iInterfaceQueryLocalInterface2 instanceof obn1) {
                        }
                    }
                    parcelY0.recycle();
                    try {
                        hpn1 hpn1Var = ern1.a;
                        zod.t(hpn1Var, "CameraUpdateFactory is not initialized");
                        Parcel parcelA2 = hpn1Var.a1();
                        tsn1.a(parcelA2, latLng);
                        parcelA2.writeFloat(15.0f);
                        Parcel parcelY1 = hpn1Var.Y0(9, parcelA2);
                        vh70 vh70VarB1 = qfp0.b1(parcelY1.readStrongBinder());
                        parcelY1.recycle();
                        zod.s(vh70VarB1);
                        try {
                            Parcel parcelA3 = kbo1Var.a1();
                            tsn1.b(parcelA3, vh70VarB1);
                            kbo1Var.c1(4, parcelA3);
                            try {
                                Parcel parcelY2 = kbo1Var.Y0(25, kbo1Var.a1());
                                IBinder strongBinder3 = parcelY2.readStrongBinder();
                                if (strongBinder3 != null) {
                                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                                    msn1Var = iInterfaceQueryLocalInterface3 instanceof msn1 ? (msn1) iInterfaceQueryLocalInterface3 : new msn1(strongBinder3, "com.google.android.gms.maps.internal.IUiSettingsDelegate", (byte) 3);
                                }
                                parcelY2.recycle();
                                try {
                                    msn1 msn1Var2 = (msn1) new xq81(msn1Var, (byte) 23).b;
                                    Parcel parcelA4 = msn1Var2.a1();
                                    parcelA4.writeInt(0);
                                    msn1Var2.c1(18, parcelA4);
                                    try {
                                        mh70 xen1Var = new xen1(new qlr(iu30Var, (byte) 4));
                                        Parcel parcelA5 = kbo1Var.a1();
                                        tsn1.b(parcelA5, xen1Var);
                                        kbo1Var.c1(28, parcelA5);
                                        ven0Var.setValue(Boolean.TRUE);
                                        parcel2.writeNoException();
                                        return true;
                                    } catch (RemoteException e) {
                                        throw new RuntimeRemoteException((Throwable) e);
                                    }
                                } catch (RemoteException e2) {
                                    throw new RuntimeRemoteException((Throwable) e2);
                                }
                            } catch (RemoteException e3) {
                                throw new RuntimeRemoteException((Throwable) e3);
                            }
                        } catch (RemoteException e4) {
                            throw new RuntimeRemoteException((Throwable) e4);
                        }
                    } catch (RemoteException e5) {
                        throw new RuntimeRemoteException((Throwable) e5);
                    }
                } catch (RemoteException e6) {
                    throw new RuntimeRemoteException((Throwable) e6);
                }
            default:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
                int i3 = tsn1.a;
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(f4i1.c(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                ((qlr) obj).b.invoke(cyi1.a);
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xen1(iyi1 iyi1Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 6);
        this.m = iyi1Var;
    }
}
