package p;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hep1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ hep1(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        String strT = null;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iX = i541.X(parcel);
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        strT = i541.t(i, parcel);
                    } else if (c != 2) {
                        i541.U(i, parcel);
                    } else {
                        arrayListX = i541.x(parcel, i, rdp1.CREATOR);
                    }
                }
                i541.A(iX, parcel);
                return new gep1(strT, arrayListX);
            case 1:
                int iX2 = i541.X(parcel);
                int iQ = 0;
                boolean zI = false;
                boolean zI2 = false;
                String strT2 = null;
                String strT3 = null;
                String strT4 = null;
                String strT5 = null;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            strT2 = i541.t(i2, parcel);
                            break;
                        case 2:
                            strT3 = i541.t(i2, parcel);
                            break;
                        case 3:
                            strT4 = i541.t(i2, parcel);
                            break;
                        case 4:
                            zI = i541.I(i2, parcel);
                            break;
                        case 5:
                            iQ = i541.Q(i2, parcel);
                            break;
                        case 6:
                            strT5 = i541.t(i2, parcel);
                            break;
                        case 7:
                            zI2 = i541.I(i2, parcel);
                            break;
                        default:
                            i541.U(i2, parcel);
                            break;
                    }
                }
                i541.A(iX2, parcel);
                return new kep1(iQ, strT2, strT3, strT4, strT5, zI, zI2);
            default:
                int iX3 = i541.X(parcel);
                String strT6 = null;
                Rect rect = null;
                ArrayList arrayListX2 = null;
                float fM = 0.0f;
                float fM2 = 0.0f;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        strT6 = i541.t(i3, parcel);
                    } else if (c2 == 2) {
                        rect = (Rect) i541.s(parcel, i3, Rect.CREATOR);
                    } else if (c2 == 3) {
                        arrayListX2 = i541.x(parcel, i3, Point.CREATOR);
                    } else if (c2 == 4) {
                        fM = i541.M(i3, parcel);
                    } else if (c2 != 5) {
                        i541.U(i3, parcel);
                    } else {
                        fM2 = i541.M(i3, parcel);
                    }
                }
                i541.A(iX3, parcel);
                return new mep1(strT6, rect, arrayListX2, fM, fM2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new gep1[i];
            case 1:
                return new kep1[i];
            default:
                return new mep1[i];
        }
    }
}
