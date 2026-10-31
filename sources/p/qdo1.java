package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qdo1 extends mh70 implements udo1 {
    public qdo1() {
        super("com.google.android.gms.wearable.internal.IWearableListener", (byte) 10);
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        cdo1 cdo1Var = null;
        edo1 edo1Var = null;
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) zsn1.a(parcel, DataHolder.CREATOR);
                zsn1.d(parcel);
                T(dataHolder);
                return true;
            case 2:
                pgo1 pgo1Var = (pgo1) zsn1.a(parcel, pgo1.CREATOR);
                zsn1.d(parcel);
                V(pgo1Var);
                return true;
            case 3:
                zio1 zio1Var = (zio1) zsn1.a(parcel, zio1.CREATOR);
                zsn1.d(parcel);
                Z(zio1Var);
                return true;
            case 4:
                zio1 zio1Var2 = (zio1) zsn1.a(parcel, zio1.CREATOR);
                zsn1.d(parcel);
                S(zio1Var2);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zio1.CREATOR);
                zsn1.d(parcel);
                I0(arrayListCreateTypedArrayList);
                return true;
            case 6:
                rso1 rso1Var = (rso1) zsn1.a(parcel, rso1.CREATOR);
                zsn1.d(parcel);
                N0(rso1Var);
                return true;
            case 7:
                orn1 orn1Var = (orn1) zsn1.a(parcel, orn1.CREATOR);
                zsn1.d(parcel);
                x(orn1Var);
                return true;
            case 8:
                okn1 okn1Var = (okn1) zsn1.a(parcel, okn1.CREATOR);
                zsn1.d(parcel);
                R(okn1Var);
                return true;
            case 9:
                ylo1 ylo1Var = (ylo1) zsn1.a(parcel, ylo1.CREATOR);
                zsn1.d(parcel);
                z0(ylo1Var);
                return true;
            case 10:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
            default:
                return false;
            case 13:
                pgo1 pgo1Var2 = (pgo1) zsn1.a(parcel, pgo1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    cdo1Var = iInterfaceQueryLocalInterface instanceof cdo1 ? (cdo1) iInterfaceQueryLocalInterface : new cdo1(strongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", (byte) 5);
                }
                zsn1.d(parcel);
                H(pgo1Var2, cdo1Var);
                return true;
            case 14:
                zsn1.d(parcel);
                return true;
            case 15:
                zsn1.a(parcel, yvn1.CREATOR);
                zsn1.d(parcel);
                return true;
            case 16:
                uio1 uio1Var = (uio1) zsn1.a(parcel, uio1.CREATOR);
                zsn1.d(parcel);
                O0(uio1Var);
                return true;
            case 17:
                zsn1.d(parcel);
                return true;
            case 18:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.wearable.internal.IServiceResponseCallback");
                    edo1Var = iInterfaceQueryLocalInterface2 instanceof edo1 ? (edo1) iInterfaceQueryLocalInterface2 : new edo1(strongBinder2, "com.google.android.gms.wearable.internal.IServiceResponseCallback", (byte) 5);
                }
                zsn1.d(parcel);
                boolean zA = A(edo1Var);
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
        }
    }
}
