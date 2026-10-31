package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class npn1 implements Parcelable.Creator {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static final hi5 a(Parcel parcel) throws SafeParcelReader.ParseException {
        int iX = i541.X(parcel);
        boolean zI = false;
        zyh zyhVar = null;
        while (parcel.dataPosition() < iX) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zyhVar = (zyh) i541.s(parcel, i, zyh.CREATOR);
            } else if (c != 2) {
                i541.U(i, parcel);
            } else {
                zI = i541.I(i, parcel);
            }
        }
        i541.A(iX, parcel);
        return new hi5(zyhVar, zI);
    }
}
