package p;

import android.app.PendingIntent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wearable.Term;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sao1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ sao1(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
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
        boolean zI = false;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ArrayList arrayListV = null;
                int iX = i541.X(parcel);
                ArrayList arrayListV2 = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iQ = i541.Q(i, parcel);
                    } else if (c == 2) {
                        arrayListV2 = i541.v(i, parcel);
                    } else if (c != 3) {
                        i541.U(i, parcel);
                    } else {
                        arrayListV = i541.v(i, parcel);
                    }
                }
                i541.A(iX, parcel);
                return new nao1(arrayListV2, arrayListV, iQ);
            case 1:
                int iX2 = i541.X(parcel);
                boolean zI2 = false;
                int iQ16 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        zI = i541.I(i2, parcel);
                    } else if (c2 == 3) {
                        zI2 = i541.I(i2, parcel);
                    } else if (c2 != 4) {
                        i541.U(i2, parcel);
                    } else {
                        iQ16 = i541.Q(i2, parcel);
                    }
                }
                i541.A(iX2, parcel);
                return new tao1(zI, zI2, iQ16);
            case 2:
                int iX3 = i541.X(parcel);
                zio1 zio1Var = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        iQ15 = i541.Q(i3, parcel);
                    } else if (c3 != 3) {
                        i541.U(i3, parcel);
                    } else {
                        zio1Var = (zio1) i541.s(parcel, i3, zio1.CREATOR);
                    }
                }
                i541.A(iX3, parcel);
                return new wao1(iQ15, zio1Var);
            case 3:
                int iX4 = i541.X(parcel);
                float fM = 0.0f;
                int iQ17 = 0;
                int iQ18 = 0;
                int iQ19 = 0;
                int iQ20 = 0;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 2) {
                        iQ17 = i541.Q(i4, parcel);
                    } else if (c4 == 3) {
                        iQ18 = i541.Q(i4, parcel);
                    } else if (c4 == 4) {
                        iQ19 = i541.Q(i4, parcel);
                    } else if (c4 == 5) {
                        iQ20 = i541.Q(i4, parcel);
                    } else if (c4 != 6) {
                        i541.U(i4, parcel);
                    } else {
                        fM = i541.M(i4, parcel);
                    }
                }
                i541.A(iX4, parcel);
                return new a7o1(iQ17, iQ18, iQ19, iQ20, fM);
            case 4:
                int iX5 = i541.X(parcel);
                double dL = 0.0d;
                double dL2 = 0.0d;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 2) {
                        dL = i541.L(i5, parcel);
                    } else if (c5 != 3) {
                        i541.U(i5, parcel);
                    } else {
                        dL2 = i541.L(i5, parcel);
                    }
                }
                i541.A(iX5, parcel);
                return new LatLng(dL, dL2);
            case 5:
                int iX6 = i541.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    i541.U(parcel.readInt(), parcel);
                }
                i541.A(iX6, parcel);
                return new mc80();
            case 6:
                IntentFilter[] intentFilterArr = null;
                int iX7 = i541.X(parcel);
                String strT = null;
                String strT2 = null;
                IBinder iBinderP = null;
                while (parcel.dataPosition() < iX7) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 2) {
                        iBinderP = i541.P(i6, parcel);
                    } else if (c6 == 3) {
                        intentFilterArr = (IntentFilter[]) i541.w(parcel, i6, IntentFilter.CREATOR);
                    } else if (c6 == 4) {
                        strT = i541.t(i6, parcel);
                    } else if (c6 != 5) {
                        i541.U(i6, parcel);
                    } else {
                        strT2 = i541.t(i6, parcel);
                    }
                }
                i541.A(iX7, parcel);
                return new c7o1(iBinderP, intentFilterArr, strT, strT2);
            case 7:
                int iX8 = i541.X(parcel);
                String strT3 = null;
                while (parcel.dataPosition() < iX8) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 2) {
                        iQ14 = i541.Q(i7, parcel);
                    } else if (c7 != 3) {
                        i541.U(i7, parcel);
                    } else {
                        strT3 = i541.t(i7, parcel);
                    }
                }
                i541.A(iX8, parcel);
                return new fbo1(iQ14, strT3);
            case 8:
                int iX9 = i541.X(parcel);
                byte[] bArrP = null;
                int iQ21 = 0;
                while (parcel.dataPosition() < iX9) {
                    int i8 = parcel.readInt();
                    char c8 = (char) i8;
                    if (c8 == 1) {
                        iQ13 = i541.Q(i8, parcel);
                    } else if (c8 == 2) {
                        iQ21 = i541.Q(i8, parcel);
                    } else if (c8 != 3) {
                        i541.U(i8, parcel);
                    } else {
                        bArrP = i541.p(i8, parcel);
                    }
                }
                i541.A(iX9, parcel);
                return new aco1(iQ13, bArrP, iQ21);
            case 9:
                int iX10 = i541.X(parcel);
                ArrayList arrayListV3 = null;
                String strT4 = null;
                int iQ22 = 0;
                boolean zI3 = false;
                int iQ23 = 0;
                boolean zI4 = false;
                while (parcel.dataPosition() < iX10) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            iQ22 = i541.Q(i9, parcel);
                            break;
                        case 3:
                            zI3 = i541.I(i9, parcel);
                            break;
                        case 4:
                            arrayListV3 = i541.v(i9, parcel);
                            break;
                        case 5:
                            iQ23 = i541.Q(i9, parcel);
                            break;
                        case 6:
                            strT4 = i541.t(i9, parcel);
                            break;
                        case 7:
                            zI4 = i541.I(i9, parcel);
                            break;
                        default:
                            i541.U(i9, parcel);
                            break;
                    }
                }
                i541.A(iX10, parcel);
                return new fco1(iQ22, zI3, arrayListV3, iQ23, strT4, zI4);
            case 10:
                int iX11 = i541.X(parcel);
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iX11) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iQ12 = i541.Q(i10, parcel);
                    } else if (c9 != 2) {
                        i541.U(i10, parcel);
                    } else {
                        arrayListX = i541.x(parcel, i10, Term.CREATOR);
                    }
                }
                i541.A(iX11, parcel);
                return new pco1(iQ12, arrayListX);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int iX12 = i541.X(parcel);
                String strT5 = null;
                int iQ24 = 0;
                while (parcel.dataPosition() < iX12) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strT5 = i541.t(i11, parcel);
                    } else if (c10 == 2) {
                        iQ11 = i541.Q(i11, parcel);
                    } else if (c10 != 3) {
                        i541.U(i11, parcel);
                    } else {
                        iQ24 = i541.Q(i11, parcel);
                    }
                }
                i541.A(iX12, parcel);
                return new nro1(strT5, iQ11, iQ24);
            case grn1.d /* 12 */:
                int iX13 = i541.X(parcel);
                ArrayList arrayListX2 = null;
                while (parcel.dataPosition() < iX13) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        i541.U(i12, parcel);
                    } else {
                        arrayListX2 = i541.x(parcel, i12, hpo1.CREATOR);
                    }
                }
                i541.A(iX13, parcel);
                return new lbo1(arrayListX2);
            case 13:
                int iX14 = i541.X(parcel);
                int iQ25 = 0;
                int iQ26 = 0;
                while (parcel.dataPosition() < iX14) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        iQ10 = i541.Q(i13, parcel);
                    } else if (c11 == 3) {
                        iQ25 = i541.Q(i13, parcel);
                    } else if (c11 != 4) {
                        i541.U(i13, parcel);
                    } else {
                        iQ26 = i541.Q(i13, parcel);
                    }
                }
                i541.A(iX14, parcel);
                return new pt70(iQ10, iQ25, iQ26);
            case 14:
                return new yan1((PendingIntent) parcel.readParcelable(r8o.class.getClassLoader()), parcel.readInt() != 0);
            case 15:
                return new BinderWrapper(parcel);
            case 16:
                byte[] bArrP2 = null;
                int iX15 = i541.X(parcel);
                String strT6 = null;
                String strT7 = null;
                while (parcel.dataPosition() < iX15) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        iQ9 = i541.Q(i14, parcel);
                    } else if (c12 == 3) {
                        strT7 = i541.t(i14, parcel);
                    } else if (c12 == 4) {
                        bArrP2 = i541.p(i14, parcel);
                    } else if (c12 != 5) {
                        i541.U(i14, parcel);
                    } else {
                        strT6 = i541.t(i14, parcel);
                    }
                }
                i541.A(iX15, parcel);
                return new pgo1(iQ9, strT7, strT6, bArrP2);
            case 17:
                DataHolder dataHolder = null;
                int iX16 = i541.X(parcel);
                String strT8 = null;
                while (parcel.dataPosition() < iX16) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        strT8 = i541.t(i15, parcel);
                    } else if (c13 != 2) {
                        i541.U(i15, parcel);
                    } else {
                        dataHolder = (DataHolder) i541.s(parcel, i15, DataHolder.CREATOR);
                    }
                }
                i541.A(iX16, parcel);
                return new uio1(strT8, dataHolder);
            case 18:
                int iX17 = i541.X(parcel);
                float fM2 = 0.5f;
                float fM3 = 1.0f;
                boolean zI5 = false;
                boolean zI6 = false;
                boolean zI7 = false;
                LatLng latLng = null;
                String strT9 = null;
                String strT10 = null;
                IBinder iBinderP2 = null;
                float fM4 = 0.0f;
                float fM5 = 0.0f;
                float fM6 = 0.0f;
                float fM7 = 0.0f;
                float fM8 = 0.0f;
                while (parcel.dataPosition() < iX17) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            latLng = (LatLng) i541.s(parcel, i16, LatLng.CREATOR);
                            break;
                        case 3:
                            strT9 = i541.t(i16, parcel);
                            break;
                        case 4:
                            strT10 = i541.t(i16, parcel);
                            break;
                        case 5:
                            iBinderP2 = i541.P(i16, parcel);
                            break;
                        case 6:
                            fM4 = i541.M(i16, parcel);
                            break;
                        case 7:
                            fM5 = i541.M(i16, parcel);
                            break;
                        case '\b':
                            zI5 = i541.I(i16, parcel);
                            break;
                        case '\t':
                            zI6 = i541.I(i16, parcel);
                            break;
                        case '\n':
                            zI7 = i541.I(i16, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            fM6 = i541.M(i16, parcel);
                            break;
                        case grn1.d /* 12 */:
                            fM2 = i541.M(i16, parcel);
                            break;
                        case '\r':
                            fM7 = i541.M(i16, parcel);
                            break;
                        case 14:
                            fM3 = i541.M(i16, parcel);
                            break;
                        case 15:
                            fM8 = i541.M(i16, parcel);
                            break;
                        default:
                            i541.U(i16, parcel);
                            break;
                    }
                }
                i541.A(iX17, parcel);
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
                qtg0Var.b = strT9;
                qtg0Var.c = strT10;
                if (iBinderP2 == null) {
                    qtg0Var.d = null;
                } else {
                    qtg0Var.d = new zwa(qfp0.b1(iBinderP2));
                }
                qtg0Var.e = fM4;
                qtg0Var.f = fM5;
                qtg0Var.g = zI5;
                qtg0Var.h = zI6;
                qtg0Var.i = zI7;
                qtg0Var.t = fM6;
                qtg0Var.X = fM2;
                qtg0Var.Y = fM7;
                qtg0Var.Z = fM3;
                qtg0Var.N0 = fM8;
                return qtg0Var;
            case 19:
                int iX18 = i541.X(parcel);
                while (parcel.dataPosition() < iX18) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        i541.U(i17, parcel);
                    } else {
                        iQ8 = i541.Q(i17, parcel);
                    }
                }
                i541.A(iX18, parcel);
                return new bfo1(iQ8);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iX19 = i541.X(parcel);
                boolean zI8 = false;
                String strT11 = null;
                String strT12 = null;
                while (parcel.dataPosition() < iX19) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 2) {
                        strT12 = i541.t(i18, parcel);
                    } else if (c14 == 3) {
                        strT11 = i541.t(i18, parcel);
                    } else if (c14 == 4) {
                        iQ7 = i541.Q(i18, parcel);
                    } else if (c14 != 5) {
                        i541.U(i18, parcel);
                    } else {
                        zI8 = i541.I(i18, parcel);
                    }
                }
                i541.A(iX19, parcel);
                return new zio1(iQ7, strT12, strT11, zI8);
            case 21:
                int iX20 = i541.X(parcel);
                ntn1 ntn1Var = null;
                while (parcel.dataPosition() < iX20) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 2) {
                        iQ6 = i541.Q(i19, parcel);
                    } else if (c15 != 3) {
                        i541.U(i19, parcel);
                    } else {
                        ntn1Var = (ntn1) i541.s(parcel, i19, ntn1.CREATOR);
                    }
                }
                i541.A(iX20, parcel);
                return new gjo1(iQ6, ntn1Var);
            case 22:
                int iX21 = i541.X(parcel);
                long jS = 0;
                String strT13 = null;
                String strT14 = null;
                while (parcel.dataPosition() < iX21) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 2) {
                        strT14 = i541.t(i20, parcel);
                    } else if (c16 == 3) {
                        strT13 = i541.t(i20, parcel);
                    } else if (c16 != 4) {
                        i541.U(i20, parcel);
                    } else {
                        jS = i541.S(i20, parcel);
                    }
                }
                i541.A(iX21, parcel);
                return new ojo1(strT14, strT13, jS);
            case 23:
                int iX22 = i541.X(parcel);
                byte[] bArrP3 = null;
                while (parcel.dataPosition() < iX22) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        i541.U(i21, parcel);
                    } else {
                        bArrP3 = i541.p(i21, parcel);
                    }
                }
                i541.A(iX22, parcel);
                return new wjo1(bArrP3);
            case 24:
                int iX23 = i541.X(parcel);
                String strT15 = null;
                while (parcel.dataPosition() < iX23) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 2) {
                        iQ5 = i541.Q(i22, parcel);
                    } else if (c17 != 3) {
                        i541.U(i22, parcel);
                    } else {
                        strT15 = i541.t(i22, parcel);
                    }
                }
                i541.A(iX23, parcel);
                return new cko1(iQ5, strT15);
            case 25:
                int iX24 = i541.X(parcel);
                IBinder iBinderP3 = null;
                while (parcel.dataPosition() < iX24) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        iQ4 = i541.Q(i23, parcel);
                    } else if (c18 != 2) {
                        i541.U(i23, parcel);
                    } else {
                        iBinderP3 = i541.P(i23, parcel);
                    }
                }
                i541.A(iX24, parcel);
                return new qko1(iQ4, iBinderP3);
            case 26:
                int iX25 = i541.X(parcel);
                while (parcel.dataPosition() < iX25) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 2) {
                        i541.U(i24, parcel);
                    } else {
                        iQ3 = i541.Q(i24, parcel);
                    }
                }
                i541.A(iX25, parcel);
                return new tko1(iQ3);
            case 27:
                int iX26 = i541.X(parcel);
                String strT16 = null;
                while (parcel.dataPosition() < iX26) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        i541.U(i25, parcel);
                    } else {
                        strT16 = i541.t(i25, parcel);
                    }
                }
                i541.A(iX26, parcel);
                return new yko1(strT16);
            case 28:
                int iX27 = i541.X(parcel);
                int iQ27 = 0;
                while (parcel.dataPosition() < iX27) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 2) {
                        iQ2 = i541.Q(i26, parcel);
                    } else if (c19 != 3) {
                        i541.U(i26, parcel);
                    } else {
                        iQ27 = i541.Q(i26, parcel);
                    }
                }
                i541.A(iX27, parcel);
                return new klo1(iQ2, iQ27);
            default:
                int iX28 = i541.X(parcel);
                ArrayList arrayListV4 = null;
                ArrayList arrayListV5 = null;
                ArrayList arrayListX3 = null;
                while (parcel.dataPosition() < iX28) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 1) {
                        arrayListX3 = i541.x(parcel, i27, hpo1.CREATOR);
                    } else if (c20 == 2) {
                        arrayListV4 = i541.v(i27, parcel);
                    } else if (c20 != 3) {
                        i541.U(i27, parcel);
                    } else {
                        arrayListV5 = i541.v(i27, parcel);
                    }
                }
                i541.A(iX28, parcel);
                return new kio1(arrayListX3, arrayListV4, arrayListV5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new nao1[i];
            case 1:
                return new tao1[i];
            case 2:
                return new wao1[i];
            case 3:
                return new a7o1[i];
            case 4:
                return new LatLng[i];
            case 5:
                return new mc80[i];
            case 6:
                return new c7o1[i];
            case 7:
                return new fbo1[i];
            case 8:
                return new aco1[i];
            case 9:
                return new fco1[i];
            case 10:
                return new pco1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new nro1[i];
            case grn1.d /* 12 */:
                return new lbo1[i];
            case 13:
                return new pt70[i];
            case 14:
                return new r8o[i];
            case 15:
                return new BinderWrapper[i];
            case 16:
                return new pgo1[i];
            case 17:
                return new uio1[i];
            case 18:
                return new qtg0[i];
            case 19:
                return new bfo1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new zio1[i];
            case 21:
                return new gjo1[i];
            case 22:
                return new ojo1[i];
            case 23:
                return new wjo1[i];
            case 24:
                return new cko1[i];
            case 25:
                return new qko1[i];
            case 26:
                return new tko1[i];
            case 27:
                return new yko1[i];
            case 28:
                return new klo1[i];
            default:
                return new kio1[i];
        }
    }
}
