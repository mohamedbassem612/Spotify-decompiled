package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class agm0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ agm0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        s2o1 s2o1Var = null;
        byte[] bArrP = null;
        int iH = 0;
        switch (this.a) {
            case 0:
                hwn0 hwn0VarX = ltn1.x(parcel);
                kyn0 kyn0VarCreateFromParcel = parcel.readInt() == 0 ? null : kyn0.CREATOR.createFromParcel(parcel);
                int iR = c13.r(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new lhm0(hwn0VarX, kyn0VarCreateFromParcel, iR, arrayList, parcel.readString(), d7p1.e(parcel));
            case 1:
                return new yjn0(parcel.readInt(), parcel.readInt(), parcel.readString(), (yxa0) parcel.readParcelable(yjn0.class.getClassLoader()));
            case 2:
                return new kjo0(parcel.readString(), parcel.readParcelable(kjo0.class.getClassLoader()), parcel.readString(), (pjo0) pjo0.CREATOR.createFromParcel(parcel), parcel.readParcelable(kjo0.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (bdj0) bdj0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 3:
                parcel.readInt();
                return aqr0.a;
            case 4:
                return new err0(parcel.readInt());
            case 5:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iH != i3) {
                    iH = x0d.h(btr0.class, parcel, arrayList2, iH, 1);
                }
                return new btr0(arrayList2, (yq01) parcel.readParcelable(btr0.class.getClassLoader()));
            case 6:
                return new sbs0(parcel.readString(), parcel.readDouble());
            case 7:
                return new z1t0(parcel.readInt(), parcel.readInt(), parcel.readString(), (yxa0) parcel.readParcelable(z1t0.class.getClassLoader()));
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                int iB = g5d0.b(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iH2 = 0;
                while (iH2 != i4) {
                    iH2 = x0d.h(j8x0.class, parcel, arrayList3, iH2, 1);
                }
                return new j8x0(iB, arrayList3, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), jup0.d(parcel.readString()));
            case 10:
                return new tcx0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new jj01(parcel.readString(), parcel.readString());
            case 12:
                return new rw21(parcel.readInt(), fd21.b(parcel.readString()));
            case 13:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int iD = 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                while (iD != i6) {
                    iD = dsl0.d(k1z0.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new vp31(string, string2, string3, string4, arrayListCreateStringArrayList, i5, arrayList4, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 14:
                return new bt31(parcel.readString(), parcel.readString(), parcel.readDouble());
            case 15:
                return new eo81(parcel.readParcelable(eo81.class.getClassLoader()), bk8.valueOf(parcel.readString()));
            case 16:
                return new vod1(parcel.readInt(), parcel.readString(), parcel.readString());
            case 17:
                return new lik1(parcel.readString());
            case 18:
                int iX = i541.X(parcel);
                long jS = 0;
                long jS2 = 0;
                String strT = null;
                String strT2 = null;
                String strT3 = null;
                String strT4 = null;
                String strT5 = null;
                String strT6 = null;
                String strT7 = null;
                String strT8 = null;
                String strT9 = null;
                jti1 jti1Var = null;
                while (parcel.dataPosition() < iX) {
                    int iO = i541.O(parcel);
                    switch (i541.B(iO)) {
                        case 2:
                            strT = i541.t(iO, parcel);
                            break;
                        case 3:
                            strT2 = i541.t(iO, parcel);
                            break;
                        case 4:
                            jS = i541.S(iO, parcel);
                            break;
                        case 5:
                            strT3 = i541.t(iO, parcel);
                            break;
                        case 6:
                            strT4 = i541.t(iO, parcel);
                            break;
                        case 7:
                            strT5 = i541.t(iO, parcel);
                            break;
                        case 8:
                            strT6 = i541.t(iO, parcel);
                            break;
                        case 9:
                            strT7 = i541.t(iO, parcel);
                            break;
                        case 10:
                            strT8 = i541.t(iO, parcel);
                            break;
                        case 11:
                            jS2 = i541.S(iO, parcel);
                            break;
                        case 12:
                            strT9 = i541.t(iO, parcel);
                            break;
                        case 13:
                            jti1Var = (jti1) i541.s(parcel, iO, jti1.CREATOR);
                            break;
                        default:
                            i541.U(iO, parcel);
                            break;
                    }
                }
                i541.A(iX, parcel);
                return new mi0(strT, strT2, jS, strT3, strT4, strT5, strT6, strT7, strT8, jS2, strT9, jti1Var);
            case 19:
                int iX2 = i541.X(parcel);
                byte bK = -1;
                byte bK2 = -1;
                byte bK3 = -1;
                byte bK4 = -1;
                byte bK5 = -1;
                byte bK6 = -1;
                byte bK7 = -1;
                byte bK8 = -1;
                byte bK9 = -1;
                byte bK10 = -1;
                byte bK11 = -1;
                byte bK12 = -1;
                CameraPosition cameraPosition = null;
                Float fN = null;
                Float fN2 = null;
                LatLngBounds latLngBounds = null;
                Integer numR = null;
                String strT10 = null;
                int iQ = 0;
                while (parcel.dataPosition() < iX2) {
                    int iO2 = i541.O(parcel);
                    switch (i541.B(iO2)) {
                        case 2:
                            bK = i541.K(iO2, parcel);
                            break;
                        case 3:
                            bK2 = i541.K(iO2, parcel);
                            break;
                        case 4:
                            iQ = i541.Q(iO2, parcel);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) i541.s(parcel, iO2, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bK3 = i541.K(iO2, parcel);
                            break;
                        case 7:
                            bK4 = i541.K(iO2, parcel);
                            break;
                        case 8:
                            bK5 = i541.K(iO2, parcel);
                            break;
                        case 9:
                            bK6 = i541.K(iO2, parcel);
                            break;
                        case 10:
                            bK7 = i541.K(iO2, parcel);
                            break;
                        case 11:
                            bK8 = i541.K(iO2, parcel);
                            break;
                        case 12:
                            bK9 = i541.K(iO2, parcel);
                            break;
                        case 13:
                        default:
                            i541.U(iO2, parcel);
                            break;
                        case 14:
                            bK10 = i541.K(iO2, parcel);
                            break;
                        case 15:
                            bK11 = i541.K(iO2, parcel);
                            break;
                        case 16:
                            fN = i541.N(iO2, parcel);
                            break;
                        case 17:
                            fN2 = i541.N(iO2, parcel);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) i541.s(parcel, iO2, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            bK12 = i541.K(iO2, parcel);
                            break;
                        case 20:
                            numR = i541.R(iO2, parcel);
                            break;
                        case 21:
                            strT10 = i541.t(iO2, parcel);
                            break;
                    }
                }
                i541.A(iX2, parcel);
                return new GoogleMapOptions(bK, bK2, iQ, cameraPosition, bK3, bK4, bK5, bK6, bK7, bK8, bK9, bK10, bK11, fN, fN2, latLngBounds, bK12, numR, strT10);
            case 20:
                int iX3 = i541.X(parcel);
                long jS3 = 0;
                long jS4 = 0;
                long jS5 = 0;
                String strT11 = null;
                String strT12 = null;
                while (parcel.dataPosition() < iX3) {
                    int iO3 = i541.O(parcel);
                    int iB2 = i541.B(iO3);
                    if (iB2 == 2) {
                        jS3 = i541.S(iO3, parcel);
                    } else if (iB2 == 3) {
                        jS4 = i541.S(iO3, parcel);
                    } else if (iB2 == 4) {
                        strT11 = i541.t(iO3, parcel);
                    } else if (iB2 == 5) {
                        strT12 = i541.t(iO3, parcel);
                    } else if (iB2 != 6) {
                        i541.U(iO3, parcel);
                    } else {
                        jS5 = i541.S(iO3, parcel);
                    }
                }
                i541.A(iX3, parcel);
                return new pi0(jS3, jS4, jS5, strT11, strT12);
            case 21:
                int iX4 = i541.X(parcel);
                int iQ2 = 0;
                int iQ3 = 0;
                while (parcel.dataPosition() < iX4) {
                    int iO4 = i541.O(parcel);
                    int iB3 = i541.B(iO4);
                    if (iB3 == 1) {
                        iH = i541.Q(iO4, parcel);
                    } else if (iB3 == 2) {
                        iQ2 = i541.Q(iO4, parcel);
                    } else if (iB3 != 3) {
                        i541.U(iO4, parcel);
                    } else {
                        iQ3 = i541.Q(iO4, parcel);
                    }
                }
                i541.A(iX4, parcel);
                return new cx5(iH, iQ2, iQ3);
            case 22:
                int iX5 = i541.X(parcel);
                boolean zI = false;
                while (parcel.dataPosition() < iX5) {
                    int iO5 = i541.O(parcel);
                    int iB4 = i541.B(iO5);
                    if (iB4 == 1) {
                        iH = i541.Q(iO5, parcel);
                    } else if (iB4 != 2) {
                        i541.U(iO5, parcel);
                    } else {
                        zI = i541.I(iO5, parcel);
                    }
                }
                i541.A(iX5, parcel);
                return new jco1(iH, zI);
            case 23:
                int iX6 = i541.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    int iO6 = i541.O(parcel);
                    int iB5 = i541.B(iO6);
                    if (iB5 == 2) {
                        iH = i541.Q(iO6, parcel);
                    } else if (iB5 != 3) {
                        i541.U(iO6, parcel);
                    } else {
                        s2o1Var = (s2o1) i541.s(parcel, iO6, s2o1.CREATOR);
                    }
                }
                i541.A(iX6, parcel);
                return new kko1(iH, s2o1Var);
            case 24:
                int iX7 = i541.X(parcel);
                int iQ4 = 0;
                while (parcel.dataPosition() < iX7) {
                    int iO7 = i541.O(parcel);
                    int iB6 = i541.B(iO7);
                    if (iB6 == 1) {
                        iH = i541.Q(iO7, parcel);
                    } else if (iB6 == 2) {
                        iQ4 = i541.Q(iO7, parcel);
                    } else if (iB6 != 3) {
                        i541.U(iO7, parcel);
                    } else {
                        bArrP = i541.p(iO7, parcel);
                    }
                }
                i541.A(iX7, parcel);
                return new dlo1(iH, bArrP, iQ4);
            default:
                int iX8 = i541.X(parcel);
                long jS6 = 0;
                Uri uri = null;
                Bundle bundleO = null;
                byte[] bArrP2 = null;
                while (parcel.dataPosition() < iX8) {
                    int iO8 = i541.O(parcel);
                    int iB7 = i541.B(iO8);
                    if (iB7 == 2) {
                        uri = (Uri) i541.s(parcel, iO8, Uri.CREATOR);
                    } else if (iB7 == 4) {
                        bundleO = i541.o(iO8, parcel);
                    } else if (iB7 == 5) {
                        bArrP2 = i541.p(iO8, parcel);
                    } else if (iB7 != 6) {
                        i541.U(iO8, parcel);
                    } else {
                        jS6 = i541.S(iO8, parcel);
                    }
                }
                i541.A(iX8, parcel);
                return new iyy0(uri, bundleO, bArrP2, jS6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lhm0[i];
            case 1:
                return new yjn0[i];
            case 2:
                return new kjo0[i];
            case 3:
                return new aqr0[i];
            case 4:
                return new err0[i];
            case 5:
                return new btr0[i];
            case 6:
                return new sbs0[i];
            case 7:
                return new z1t0[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new j8x0[i];
            case 10:
                return new tcx0[i];
            case 11:
                return new jj01[i];
            case 12:
                return new rw21[i];
            case 13:
                return new vp31[i];
            case 14:
                return new bt31[i];
            case 15:
                return new eo81[i];
            case 16:
                return new vod1[i];
            case 17:
                return new lik1[i];
            case 18:
                return new mi0[i];
            case 19:
                return new GoogleMapOptions[i];
            case 20:
                return new pi0[i];
            case 21:
                return new cx5[i];
            case 22:
                return new jco1[i];
            case 23:
                return new kko1[i];
            case 24:
                return new dlo1[i];
            default:
                return new iyy0[i];
        }
    }
}
