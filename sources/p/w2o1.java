package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w2o1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ w2o1(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListX = null;
        ArrayList arrayListX2 = null;
        k3o1 k3o1Var = null;
        String strT = null;
        s2o1 s2o1Var = null;
        ArrayList arrayListX3 = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String strT2 = null;
        LatLng latLng = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        ParcelFileDescriptor parcelFileDescriptor3 = null;
        okn1 okn1Var = null;
        wjo1[] wjo1VarArr = null;
        AppTheme appTheme = null;
        ArrayList arrayListX4 = null;
        byte[] bArrP = null;
        int iQ = 0;
        int iQ2 = 0;
        boolean zI = false;
        int iQ3 = 0;
        boolean zI2 = false;
        int iQ4 = 0;
        int iQ5 = 0;
        int iQ6 = 0;
        int iQ7 = 0;
        int iQ8 = 0;
        int iQ9 = 0;
        int iQ10 = 0;
        int iQ11 = 0;
        int iQ12 = 0;
        int iQ13 = 0;
        int iQ14 = 0;
        int iQ15 = 0;
        int iQ16 = 0;
        int iQ17 = 0;
        int iQ18 = 0;
        int iQ19 = 0;
        int iQ20 = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iX = i541.X(parcel);
                Bundle bundleO = null;
                byte[] bArrP2 = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        uri = (Uri) i541.s(parcel, i, Uri.CREATOR);
                    } else if (c == 4) {
                        bundleO = i541.o(i, parcel);
                    } else if (c != 5) {
                        i541.U(i, parcel);
                    } else {
                        bArrP2 = i541.p(i, parcel);
                    }
                }
                i541.A(iX, parcel);
                return new s2o1(uri, bundleO, bArrP2);
            case 1:
                int iX2 = i541.X(parcel);
                int iQ21 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        iQ = i541.Q(i2, parcel);
                    } else if (c2 != 3) {
                        i541.U(i2, parcel);
                    } else {
                        iQ21 = i541.Q(i2, parcel);
                    }
                }
                i541.A(iX2, parcel);
                return new d3o1(iQ, iQ21);
            case 2:
                int iX3 = i541.X(parcel);
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        i541.U(i3, parcel);
                    } else {
                        bArrP = i541.p(i3, parcel);
                    }
                }
                i541.A(iX3, parcel);
                return new k3o1(bArrP);
            case 3:
                int iX4 = i541.X(parcel);
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        iQ20 = i541.Q(i4, parcel);
                    } else if (c3 != 3) {
                        i541.U(i4, parcel);
                    } else {
                        arrayListX4 = i541.x(parcel, i4, okn1.CREATOR);
                    }
                }
                i541.A(iX4, parcel);
                return new v3o1(iQ20, arrayListX4);
            case 4:
                int iX5 = i541.X(parcel);
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        iQ19 = i541.Q(i5, parcel);
                    } else if (c4 != 3) {
                        i541.U(i5, parcel);
                    } else {
                        appTheme = (AppTheme) i541.s(parcel, i5, AppTheme.CREATOR);
                    }
                }
                i541.A(iX5, parcel);
                return new f4o1(iQ19, appTheme);
            case 5:
                int iX6 = i541.X(parcel);
                boolean zI3 = false;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iQ18 = i541.Q(i6, parcel);
                    } else if (c5 != 2) {
                        i541.U(i6, parcel);
                    } else {
                        zI3 = i541.I(i6, parcel);
                    }
                }
                i541.A(iX6, parcel);
                return new n4o1(iQ18, zI3);
            case 6:
                int iX7 = i541.X(parcel);
                boolean zI4 = false;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 2) {
                        iQ17 = i541.Q(i7, parcel);
                    } else if (c6 == 3) {
                        zI4 = i541.I(i7, parcel);
                    } else if (c6 != 4) {
                        i541.U(i7, parcel);
                    } else {
                        wjo1VarArr = (wjo1[]) i541.w(parcel, i7, wjo1.CREATOR);
                    }
                }
                i541.A(iX7, parcel);
                return new t4o1(iQ17, zI4, wjo1VarArr);
            case 7:
                int iX8 = i541.X(parcel);
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        iQ16 = i541.Q(i8, parcel);
                    } else if (c7 != 3) {
                        i541.U(i8, parcel);
                    } else {
                        okn1Var = (okn1) i541.s(parcel, i8, okn1.CREATOR);
                    }
                }
                i541.A(iX8, parcel);
                return new d5o1(iQ16, okn1Var);
            case 8:
                int iX9 = i541.X(parcel);
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 2) {
                        iQ15 = i541.Q(i9, parcel);
                    } else if (c8 != 3) {
                        i541.U(i9, parcel);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) i541.s(parcel, i9, ParcelFileDescriptor.CREATOR);
                    }
                }
                i541.A(iX9, parcel);
                return new k5o1(iQ15, parcelFileDescriptor3);
            case 9:
                int iX10 = i541.X(parcel);
                boolean zI5 = false;
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        iQ14 = i541.Q(i10, parcel);
                    } else if (c9 == 3) {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) i541.s(parcel, i10, ParcelFileDescriptor.CREATOR);
                    } else if (c9 != 4) {
                        i541.U(i10, parcel);
                    } else {
                        zI5 = i541.I(i10, parcel);
                    }
                }
                i541.A(iX10, parcel);
                return new t5o1(iQ14, parcelFileDescriptor2, zI5);
            case 10:
                int iX11 = i541.X(parcel);
                boolean zI6 = false;
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        iQ13 = i541.Q(i11, parcel);
                    } else if (c10 != 3) {
                        i541.U(i11, parcel);
                    } else {
                        zI6 = i541.I(i11, parcel);
                    }
                }
                i541.A(iX11, parcel);
                return new h6o1(iQ13, zI6);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int iX12 = i541.X(parcel);
                boolean zI7 = false;
                boolean zI8 = false;
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        iQ12 = i541.Q(i12, parcel);
                    } else if (c11 == 3) {
                        zI7 = i541.I(i12, parcel);
                    } else if (c11 != 4) {
                        i541.U(i12, parcel);
                    } else {
                        zI8 = i541.I(i12, parcel);
                    }
                }
                i541.A(iX12, parcel);
                return new s6o1(iQ12, zI7, zI8);
            case grn1.d /* 12 */:
                int iX13 = i541.X(parcel);
                boolean zI9 = false;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 2) {
                        iQ11 = i541.Q(i13, parcel);
                    } else if (c12 != 3) {
                        i541.U(i13, parcel);
                    } else {
                        zI9 = i541.I(i13, parcel);
                    }
                }
                i541.A(iX13, parcel);
                return new m7o1(iQ11, zI9);
            case 13:
                int iX14 = i541.X(parcel);
                String strT3 = null;
                String strT4 = null;
                String strT5 = null;
                ArrayList arrayListX5 = null;
                x1o1 x1o1Var = null;
                int iQ22 = 0;
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    char c13 = (char) i14;
                    if (c13 == 1) {
                        iQ22 = i541.Q(i14, parcel);
                    } else if (c13 == 3) {
                        strT3 = i541.t(i14, parcel);
                    } else if (c13 == 4) {
                        strT4 = i541.t(i14, parcel);
                    } else if (c13 == 6) {
                        strT5 = i541.t(i14, parcel);
                    } else if (c13 == 7) {
                        x1o1Var = (x1o1) i541.s(parcel, i14, x1o1.CREATOR);
                    } else if (c13 != '\b') {
                        i541.U(i14, parcel);
                    } else {
                        arrayListX5 = i541.x(parcel, i14, pl10.CREATOR);
                    }
                }
                i541.A(iX14, parcel);
                return new x1o1(iQ22, strT3, strT4, strT5, arrayListX5, x1o1Var);
            case 14:
                int iX15 = i541.X(parcel);
                LatLng latLng2 = null;
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 2) {
                        latLng = (LatLng) i541.s(parcel, i15, LatLng.CREATOR);
                    } else if (c14 != 3) {
                        i541.U(i15, parcel);
                    } else {
                        latLng2 = (LatLng) i541.s(parcel, i15, LatLng.CREATOR);
                    }
                }
                i541.A(iX15, parcel);
                return new LatLngBounds(latLng, latLng2);
            case 15:
                int iX16 = i541.X(parcel);
                while (parcel.dataPosition() < iX16) {
                    i541.U(parcel.readInt(), parcel);
                }
                i541.A(iX16, parcel);
                return new lc80();
            case 16:
                int iX17 = i541.X(parcel);
                boolean zI10 = true;
                boolean zI11 = true;
                String strT6 = null;
                String strT7 = null;
                String strT8 = null;
                String strT9 = null;
                String strT10 = null;
                ArrayList arrayListV = null;
                kio1 kio1Var = null;
                lbo1 lbo1Var = null;
                int iQ23 = 0;
                int iQ24 = 0;
                boolean zI12 = false;
                boolean zI13 = false;
                boolean zI14 = false;
                int iQ25 = 0;
                boolean zI15 = false;
                int iQ26 = 0;
                int iQ27 = 0;
                boolean zI16 = false;
                while (parcel.dataPosition() < iX17) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strT6 = i541.t(i16, parcel);
                            break;
                        case 3:
                            strT7 = i541.t(i16, parcel);
                            break;
                        case 4:
                            iQ23 = i541.Q(i16, parcel);
                            break;
                        case 5:
                            iQ24 = i541.Q(i16, parcel);
                            break;
                        case 6:
                            zI12 = i541.I(i16, parcel);
                            break;
                        case 7:
                            zI13 = i541.I(i16, parcel);
                            break;
                        case '\b':
                            strT8 = i541.t(i16, parcel);
                            break;
                        case '\t':
                            zI14 = i541.I(i16, parcel);
                            break;
                        case '\n':
                            strT9 = i541.t(i16, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            strT10 = i541.t(i16, parcel);
                            break;
                        case grn1.d /* 12 */:
                            iQ25 = i541.Q(i16, parcel);
                            break;
                        case '\r':
                            arrayListV = i541.v(i16, parcel);
                            break;
                        case 14:
                            zI15 = i541.I(i16, parcel);
                            break;
                        case 15:
                            zI10 = i541.I(i16, parcel);
                            break;
                        case 16:
                            kio1Var = (kio1) i541.s(parcel, i16, kio1.CREATOR);
                            break;
                        case 17:
                            zI11 = i541.I(i16, parcel);
                            break;
                        case 18:
                            lbo1Var = (lbo1) i541.s(parcel, i16, lbo1.CREATOR);
                            break;
                        case 19:
                            iQ26 = i541.Q(i16, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                            iQ27 = i541.Q(i16, parcel);
                            break;
                        case 21:
                            zI16 = i541.I(i16, parcel);
                            break;
                        default:
                            i541.U(i16, parcel);
                            break;
                    }
                }
                i541.A(iX17, parcel);
                return new ConnectionConfiguration(strT6, strT7, iQ23, iQ24, zI12, zI13, strT8, zI14, strT9, strT10, iQ25, arrayListV, zI15, zI10, kio1Var, zI11, lbo1Var, iQ26, iQ27, zI16);
            case 17:
                int iX18 = i541.X(parcel);
                while (parcel.dataPosition() < iX18) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 2) {
                        iQ10 = i541.Q(i17, parcel);
                    } else if (c15 != 3) {
                        i541.U(i17, parcel);
                    } else {
                        strT2 = i541.t(i17, parcel);
                    }
                }
                i541.A(iX18, parcel);
                return new p7o1(iQ10, strT2);
            case 18:
                int iX19 = i541.X(parcel);
                while (parcel.dataPosition() < iX19) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 2) {
                        iQ9 = i541.Q(i18, parcel);
                    } else if (c16 != 3) {
                        i541.U(i18, parcel);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) i541.s(parcel, i18, ConnectionConfiguration.CREATOR);
                    }
                }
                i541.A(iX19, parcel);
                return new v7o1(iQ9, connectionConfiguration);
            case 19:
                int iX20 = i541.X(parcel);
                while (parcel.dataPosition() < iX20) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 2) {
                        iQ8 = i541.Q(i19, parcel);
                    } else if (c17 != 3) {
                        i541.U(i19, parcel);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) i541.w(parcel, i19, ConnectionConfiguration.CREATOR);
                    }
                }
                i541.A(iX20, parcel);
                return new d8o1(iQ8, connectionConfigurationArr);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iX21 = i541.X(parcel);
                while (parcel.dataPosition() < iX21) {
                    int i20 = parcel.readInt();
                    char c18 = (char) i20;
                    if (c18 == 2) {
                        iQ7 = i541.Q(i20, parcel);
                    } else if (c18 != 3) {
                        i541.U(i20, parcel);
                    } else {
                        arrayListX3 = i541.x(parcel, i20, zio1.CREATOR);
                    }
                }
                i541.A(iX21, parcel);
                return new i8o1(iQ7, arrayListX3);
            case 21:
                int iX22 = i541.X(parcel);
                while (parcel.dataPosition() < iX22) {
                    int i21 = parcel.readInt();
                    char c19 = (char) i21;
                    if (c19 == 2) {
                        iQ6 = i541.Q(i21, parcel);
                    } else if (c19 != 3) {
                        i541.U(i21, parcel);
                    } else {
                        s2o1Var = (s2o1) i541.s(parcel, i21, s2o1.CREATOR);
                    }
                }
                i541.A(iX22, parcel);
                return new o8o1(iQ6, s2o1Var);
            case 22:
                int iX23 = i541.X(parcel);
                String strT11 = null;
                byte[] bArrP3 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < iX23) {
                    int i22 = parcel.readInt();
                    char c20 = (char) i22;
                    if (c20 == 1) {
                        strT11 = i541.t(i22, parcel);
                    } else if (c20 == 2) {
                        bArrP3 = i541.p(i22, parcel);
                    } else if (c20 != 3) {
                        i541.U(i22, parcel);
                    } else {
                        int iT = i541.T(i22, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iT == 0) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i23 = parcel.readInt();
                            for (int i24 = 0; i24 < i23; i24++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iT);
                            arrayList = arrayList2;
                        }
                    }
                }
                i541.A(iX23, parcel);
                return new c9o1(strT11, arrayList, bArrP3);
            case 23:
                int iX24 = i541.X(parcel);
                while (parcel.dataPosition() < iX24) {
                    int i25 = parcel.readInt();
                    char c21 = (char) i25;
                    if (c21 == 2) {
                        iQ5 = i541.Q(i25, parcel);
                    } else if (c21 != 3) {
                        i541.U(i25, parcel);
                    } else {
                        strT = i541.t(i25, parcel);
                    }
                }
                i541.A(iX24, parcel);
                return new w8o1(iQ5, strT);
            case 24:
                int iX25 = i541.X(parcel);
                while (parcel.dataPosition() < iX25) {
                    int i26 = parcel.readInt();
                    char c22 = (char) i26;
                    if (c22 == 1) {
                        iQ4 = i541.Q(i26, parcel);
                    } else if (c22 != 2) {
                        i541.U(i26, parcel);
                    } else {
                        k3o1Var = (k3o1) i541.s(parcel, i26, k3o1.CREATOR);
                    }
                }
                i541.A(iX25, parcel);
                return new g9o1(iQ4, k3o1Var);
            case 25:
                int iX26 = i541.X(parcel);
                boolean zI17 = false;
                while (parcel.dataPosition() < iX26) {
                    int i27 = parcel.readInt();
                    char c23 = (char) i27;
                    if (c23 == 1) {
                        arrayListX2 = i541.x(parcel, i27, c9o1.CREATOR);
                    } else if (c23 == 2) {
                        zI2 = i541.I(i27, parcel);
                    } else if (c23 != 3) {
                        i541.U(i27, parcel);
                    } else {
                        zI17 = i541.I(i27, parcel);
                    }
                }
                i541.A(iX26, parcel);
                return new h9o1(arrayListX2, zI2, zI17);
            case 26:
                int iX27 = i541.X(parcel);
                while (parcel.dataPosition() < iX27) {
                    int i28 = parcel.readInt();
                    char c24 = (char) i28;
                    if (c24 == 1) {
                        iQ3 = i541.Q(i28, parcel);
                    } else if (c24 != 2) {
                        i541.U(i28, parcel);
                    } else {
                        arrayListX = i541.x(parcel, i28, k3o1.CREATOR);
                    }
                }
                i541.A(iX27, parcel);
                return new o9o1(iQ3, arrayListX);
            case 27:
                int iX28 = i541.X(parcel);
                int iQ28 = 0;
                while (parcel.dataPosition() < iX28) {
                    int i29 = parcel.readInt();
                    char c25 = (char) i29;
                    if (c25 == 2) {
                        zI = i541.I(i29, parcel);
                    } else if (c25 != 3) {
                        i541.U(i29, parcel);
                    } else {
                        iQ28 = i541.Q(i29, parcel);
                    }
                }
                i541.A(iX28, parcel);
                return new q9o1(iQ28, zI);
            case 28:
                int iX29 = i541.X(parcel);
                while (parcel.dataPosition() < iX29) {
                    int i30 = parcel.readInt();
                    char c26 = (char) i30;
                    if (c26 == 2) {
                        iQ2 = i541.Q(i30, parcel);
                    } else if (c26 != 3) {
                        i541.U(i30, parcel);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) i541.s(parcel, i30, ParcelFileDescriptor.CREATOR);
                    }
                }
                i541.A(iX29, parcel);
                return new x9o1(iQ2, parcelFileDescriptor);
            default:
                int iX30 = i541.X(parcel);
                while (parcel.dataPosition() < iX30) {
                    i541.U(parcel.readInt(), parcel);
                }
                i541.A(iX30, parcel);
                return new fao1();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new s2o1[i];
            case 1:
                return new d3o1[i];
            case 2:
                return new k3o1[i];
            case 3:
                return new v3o1[i];
            case 4:
                return new f4o1[i];
            case 5:
                return new n4o1[i];
            case 6:
                return new t4o1[i];
            case 7:
                return new d5o1[i];
            case 8:
                return new k5o1[i];
            case 9:
                return new t5o1[i];
            case 10:
                return new h6o1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new s6o1[i];
            case grn1.d /* 12 */:
                return new m7o1[i];
            case 13:
                return new x1o1[i];
            case 14:
                return new LatLngBounds[i];
            case 15:
                return new lc80[i];
            case 16:
                return new ConnectionConfiguration[i];
            case 17:
                return new p7o1[i];
            case 18:
                return new v7o1[i];
            case 19:
                return new d8o1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new i8o1[i];
            case 21:
                return new o8o1[i];
            case 22:
                return new c9o1[i];
            case 23:
                return new w8o1[i];
            case 24:
                return new g9o1[i];
            case 25:
                return new h9o1[i];
            case 26:
                return new o9o1[i];
            case 27:
                return new q9o1[i];
            case 28:
                return new x9o1[i];
            default:
                return new fao1[i];
        }
    }
}
