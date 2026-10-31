package p;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jrn1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ jrn1(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        double dL = 0.0d;
        long jS = 0;
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
        boolean zI = false;
        int iQ11 = 0;
        int iQ12 = 0;
        int iQ13 = 0;
        int iQ14 = 0;
        ntn1 ntn1Var = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        byte[] bArrP = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        String strT9 = null;
        fx5 fx5Var = null;
        String strT10 = null;
        String strT11 = null;
        ArrayList arrayListX = null;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iX = i541.X(parcel);
                long jS2 = 0;
                String strT12 = null;
                String strT13 = null;
                Integer numR = null;
                String strT14 = null;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        strT13 = i541.t(i, parcel);
                    } else if (c == 3) {
                        jS2 = i541.S(i, parcel);
                    } else if (c == 4) {
                        numR = i541.R(i, parcel);
                    } else if (c == 5) {
                        strT14 = i541.t(i, parcel);
                    } else if (c != 6) {
                        i541.U(i, parcel);
                    } else {
                        strT12 = i541.t(i, parcel);
                    }
                }
                i541.A(iX, parcel);
                Pattern pattern = o4e.a;
                if (strT12 == null) {
                    jSONObject = null;
                } else {
                    try {
                        jSONObject = new JSONObject(strT12);
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                }
                return new MediaError(strT13, jS2, numR, strT14, jSONObject);
            case 1:
                int iX2 = i541.X(parcel);
                long jS3 = 0;
                long jS4 = 0;
                int iQ15 = 0;
                String strT15 = null;
                String strT16 = null;
                sqh0 sqh0Var = null;
                ArrayList arrayListX2 = null;
                see1 see1Var = null;
                String strT17 = null;
                ArrayList arrayListX3 = null;
                ArrayList arrayListX4 = null;
                String strT18 = null;
                jti1 jti1Var = null;
                String strT19 = null;
                String strT20 = null;
                String strT21 = null;
                String strT22 = null;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strT15 = i541.t(i2, parcel);
                            break;
                        case 3:
                            iQ15 = i541.Q(i2, parcel);
                            break;
                        case 4:
                            strT16 = i541.t(i2, parcel);
                            break;
                        case 5:
                            sqh0Var = (sqh0) i541.s(parcel, i2, sqh0.CREATOR);
                            break;
                        case 6:
                            jS3 = i541.S(i2, parcel);
                            break;
                        case 7:
                            arrayListX2 = i541.x(parcel, i2, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            see1Var = (see1) i541.s(parcel, i2, see1.CREATOR);
                            break;
                        case '\t':
                            strT17 = i541.t(i2, parcel);
                            break;
                        case '\n':
                            arrayListX3 = i541.x(parcel, i2, ni0.CREATOR);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            arrayListX4 = i541.x(parcel, i2, mi0.CREATOR);
                            break;
                        case grn1.d /* 12 */:
                            strT18 = i541.t(i2, parcel);
                            break;
                        case '\r':
                            jti1Var = (jti1) i541.s(parcel, i2, jti1.CREATOR);
                            break;
                        case 14:
                            jS4 = i541.S(i2, parcel);
                            break;
                        case 15:
                            strT19 = i541.t(i2, parcel);
                            break;
                        case 16:
                            strT20 = i541.t(i2, parcel);
                            break;
                        case 17:
                            strT21 = i541.t(i2, parcel);
                            break;
                        case 18:
                            strT22 = i541.t(i2, parcel);
                            break;
                        default:
                            i541.U(i2, parcel);
                            break;
                    }
                }
                i541.A(iX2, parcel);
                return new MediaInfo(strT15, iQ15, strT16, sqh0Var, jS3, arrayListX2, see1Var, strT17, arrayListX3, arrayListX4, strT18, jti1Var, jS4, strT19, strT20, strT21, strT22);
            case 2:
                int iX3 = i541.X(parcel);
                int iQ16 = 0;
                int iQ17 = 0;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        ntn1Var = (ntn1) i541.s(parcel, i3, ntn1.CREATOR);
                    } else if (c2 == 3) {
                        iQ = i541.Q(i3, parcel);
                    } else if (c2 == 4) {
                        iQ16 = i541.Q(i3, parcel);
                    } else if (c2 != 5) {
                        i541.U(i3, parcel);
                    } else {
                        iQ17 = i541.Q(i3, parcel);
                    }
                }
                i541.A(iX3, parcel);
                return new orn1(ntn1Var, iQ, iQ16, iQ17);
            case 3:
                int iX4 = i541.X(parcel);
                long jS5 = 0;
                long jS6 = 0;
                boolean zI2 = false;
                boolean zI3 = false;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        jS5 = i541.S(i4, parcel);
                    } else if (c3 == 3) {
                        jS6 = i541.S(i4, parcel);
                    } else if (c3 == 4) {
                        zI2 = i541.I(i4, parcel);
                    } else if (c3 != 5) {
                        i541.U(i4, parcel);
                    } else {
                        zI3 = i541.I(i4, parcel);
                    }
                }
                i541.A(iX4, parcel);
                return new pqh0(jS5, jS6, zI2, zI3);
            case 4:
                int iX5 = i541.X(parcel);
                Bundle bundleO = null;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        arrayListX = i541.x(parcel, i5, bil1.CREATOR);
                    } else if (c4 == 3) {
                        bundleO = i541.o(i5, parcel);
                    } else if (c4 != 4) {
                        i541.U(i5, parcel);
                    } else {
                        iQ14 = i541.Q(i5, parcel);
                    }
                }
                i541.A(iX5, parcel);
                return new sqh0(arrayListX, bundleO, iQ14);
            case 5:
                int iX6 = i541.X(parcel);
                ArrayList arrayListX5 = null;
                ArrayList arrayListX6 = null;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        iQ13 = i541.Q(i6, parcel);
                    } else if (c5 == 3) {
                        strT11 = i541.t(i6, parcel);
                    } else if (c5 == 4) {
                        arrayListX5 = i541.x(parcel, i6, sqh0.CREATOR);
                    } else if (c5 == 5) {
                        arrayListX6 = i541.x(parcel, i6, bil1.CREATOR);
                    } else if (c5 != 6) {
                        i541.U(i6, parcel);
                    } else {
                        dL = i541.L(i6, parcel);
                    }
                }
                i541.A(iX6, parcel);
                ouh0 ouh0Var = new ouh0();
                ouh0Var.a = iQ13;
                ouh0Var.b = strT11;
                ouh0Var.c = arrayListX5;
                ouh0Var.d = arrayListX6;
                ouh0Var.e = dL;
                return ouh0Var;
            case 6:
                int iX7 = i541.X(parcel);
                int iQ18 = 0;
                int iQ19 = 0;
                boolean zI4 = false;
                String strT23 = null;
                String strT24 = null;
                ouh0 ouh0Var2 = null;
                ArrayList arrayListX7 = null;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            strT10 = i541.t(i7, parcel);
                            break;
                        case 3:
                            strT23 = i541.t(i7, parcel);
                            break;
                        case 4:
                            iQ12 = i541.Q(i7, parcel);
                            break;
                        case 5:
                            strT24 = i541.t(i7, parcel);
                            break;
                        case 6:
                            ouh0Var2 = (ouh0) i541.s(parcel, i7, ouh0.CREATOR);
                            break;
                        case 7:
                            iQ18 = i541.Q(i7, parcel);
                            break;
                        case '\b':
                            arrayListX7 = i541.x(parcel, i7, quh0.CREATOR);
                            break;
                        case '\t':
                            iQ19 = i541.Q(i7, parcel);
                            break;
                        case '\n':
                            jS = i541.S(i7, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            zI4 = i541.I(i7, parcel);
                            break;
                        default:
                            i541.U(i7, parcel);
                            break;
                    }
                }
                i541.A(iX7, parcel);
                puh0 puh0Var = new puh0();
                puh0Var.a = strT10;
                puh0Var.b = strT23;
                puh0Var.c = iQ12;
                puh0Var.d = strT24;
                puh0Var.e = ouh0Var2;
                puh0Var.f = iQ18;
                puh0Var.g = arrayListX7;
                puh0Var.h = iQ19;
                puh0Var.i = jS;
                puh0Var.t = zI4;
                return puh0Var;
            case 7:
                int iX8 = i541.X(parcel);
                double dL2 = 0.0d;
                double dL3 = 0.0d;
                double dL4 = 0.0d;
                int iQ20 = 0;
                boolean zI5 = false;
                MediaInfo mediaInfo = null;
                long[] jArrR = null;
                String strT25 = null;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            mediaInfo = (MediaInfo) i541.s(parcel, i8, MediaInfo.CREATOR);
                            break;
                        case 3:
                            iQ20 = i541.Q(i8, parcel);
                            break;
                        case 4:
                            zI5 = i541.I(i8, parcel);
                            break;
                        case 5:
                            dL2 = i541.L(i8, parcel);
                            break;
                        case 6:
                            dL3 = i541.L(i8, parcel);
                            break;
                        case 7:
                            dL4 = i541.L(i8, parcel);
                            break;
                        case '\b':
                            jArrR = i541.r(i8, parcel);
                            break;
                        case '\t':
                            strT25 = i541.t(i8, parcel);
                            break;
                        default:
                            i541.U(i8, parcel);
                            break;
                    }
                }
                i541.A(iX8, parcel);
                return new quh0(mediaInfo, iQ20, zI5, dL2, dL3, dL4, jArrR, strT25);
            case 8:
                int iX9 = i541.X(parcel);
                double dL5 = 0.0d;
                double dL6 = 0.0d;
                long jS7 = 0;
                long jS8 = 0;
                long jS9 = 0;
                int iQ21 = 0;
                int iQ22 = 0;
                int iQ23 = 0;
                boolean zI6 = false;
                int iQ24 = 0;
                int iQ25 = 0;
                int iQ26 = 0;
                boolean zI7 = false;
                MediaInfo mediaInfo2 = null;
                long[] jArrR2 = null;
                String strT26 = null;
                ArrayList arrayListX8 = null;
                pi0 pi0Var = null;
                opj1 opj1Var = null;
                pqh0 pqh0Var = null;
                puh0 puh0Var2 = null;
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            mediaInfo2 = (MediaInfo) i541.s(parcel, i9, MediaInfo.CREATOR);
                            break;
                        case 3:
                            jS7 = i541.S(i9, parcel);
                            break;
                        case 4:
                            iQ21 = i541.Q(i9, parcel);
                            break;
                        case 5:
                            dL5 = i541.L(i9, parcel);
                            break;
                        case 6:
                            iQ22 = i541.Q(i9, parcel);
                            break;
                        case 7:
                            iQ23 = i541.Q(i9, parcel);
                            break;
                        case '\b':
                            jS8 = i541.S(i9, parcel);
                            break;
                        case '\t':
                            jS9 = i541.S(i9, parcel);
                            break;
                        case '\n':
                            dL6 = i541.L(i9, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            zI6 = i541.I(i9, parcel);
                            break;
                        case grn1.d /* 12 */:
                            jArrR2 = i541.r(i9, parcel);
                            break;
                        case '\r':
                            iQ24 = i541.Q(i9, parcel);
                            break;
                        case 14:
                            iQ25 = i541.Q(i9, parcel);
                            break;
                        case 15:
                            strT26 = i541.t(i9, parcel);
                            break;
                        case 16:
                            iQ26 = i541.Q(i9, parcel);
                            break;
                        case 17:
                            arrayListX8 = i541.x(parcel, i9, quh0.CREATOR);
                            break;
                        case 18:
                            zI7 = i541.I(i9, parcel);
                            break;
                        case 19:
                            pi0Var = (pi0) i541.s(parcel, i9, pi0.CREATOR);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                            opj1Var = (opj1) i541.s(parcel, i9, opj1.CREATOR);
                            break;
                        case 21:
                            pqh0Var = (pqh0) i541.s(parcel, i9, pqh0.CREATOR);
                            break;
                        case 22:
                            puh0Var2 = (puh0) i541.s(parcel, i9, puh0.CREATOR);
                            break;
                        default:
                            i541.U(i9, parcel);
                            break;
                    }
                }
                i541.A(iX9, parcel);
                return new j3i0(mediaInfo2, jS7, iQ21, dL5, iQ22, iQ23, jS8, jS9, dL6, zI6, jArrR2, iQ24, iQ25, strT26, iQ26, arrayListX8, zI7, pi0Var, opj1Var, pqh0Var, puh0Var2);
            case 9:
                int iX10 = i541.X(parcel);
                int iQ27 = 0;
                int iQ28 = 0;
                int iQ29 = 0;
                int iQ30 = 0;
                ex5 ex5Var = null;
                dx5 dx5Var = null;
                cx5 cx5Var = null;
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iQ11 = i541.Q(i10, parcel);
                            break;
                        case 2:
                            iQ27 = i541.Q(i10, parcel);
                            break;
                        case 3:
                            iQ28 = i541.Q(i10, parcel);
                            break;
                        case 4:
                            iQ29 = i541.Q(i10, parcel);
                            break;
                        case 5:
                            iQ30 = i541.Q(i10, parcel);
                            break;
                        case 6:
                            fx5Var = (fx5) i541.s(parcel, i10, fx5.CREATOR);
                            break;
                        case 7:
                            ex5Var = (ex5) i541.s(parcel, i10, ex5.CREATOR);
                            break;
                        case '\b':
                            dx5Var = (dx5) i541.s(parcel, i10, dx5.CREATOR);
                            break;
                        case '\t':
                            cx5Var = (cx5) i541.s(parcel, i10, cx5.CREATOR);
                            break;
                        default:
                            i541.U(i10, parcel);
                            break;
                    }
                }
                i541.A(iX10, parcel);
                AppTheme appTheme = new AppTheme();
                appTheme.f = new fx5();
                appTheme.g = new ex5();
                appTheme.h = new dx5();
                appTheme.i = new cx5();
                appTheme.a = iQ11;
                appTheme.b = iQ27;
                appTheme.c = iQ28;
                appTheme.d = iQ29;
                appTheme.e = iQ30;
                if (fx5Var == null) {
                    fx5Var = new fx5();
                }
                appTheme.f = fx5Var;
                if (ex5Var == null) {
                    ex5Var = new ex5();
                }
                appTheme.g = ex5Var;
                if (dx5Var == null) {
                    dx5Var = new dx5();
                }
                appTheme.h = dx5Var;
                if (cx5Var == null) {
                    cx5Var = new cx5();
                }
                appTheme.i = cx5Var;
                return appTheme;
            case 10:
                int iX11 = i541.X(parcel);
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strT9 = i541.t(i11, parcel);
                    } else if (c6 != 2) {
                        i541.U(i11, parcel);
                    } else {
                        zI = i541.I(i11, parcel);
                    }
                }
                i541.A(iX11, parcel);
                return new ipn1(strT9, zI);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int iX12 = i541.X(parcel);
                boolean zI8 = true;
                int iQ31 = 0;
                int iQ32 = 0;
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iQ10 = i541.Q(i12, parcel);
                    } else if (c7 == 2) {
                        iQ31 = i541.Q(i12, parcel);
                    } else if (c7 == 3) {
                        iQ32 = i541.Q(i12, parcel);
                    } else if (c7 != 4) {
                        i541.U(i12, parcel);
                    } else {
                        zI8 = i541.I(i12, parcel);
                    }
                }
                i541.A(iX12, parcel);
                return new zyh(iQ10, iQ31, iQ32, zI8);
            case grn1.d /* 12 */:
                int iX13 = i541.X(parcel);
                long jS10 = 0;
                int iQ33 = 0;
                int iQ34 = 0;
                String strT27 = null;
                String strT28 = null;
                String strT29 = null;
                String strT30 = null;
                String strT31 = null;
                ArrayList arrayListV = null;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            jS10 = i541.S(i13, parcel);
                            break;
                        case 3:
                            iQ33 = i541.Q(i13, parcel);
                            break;
                        case 4:
                            strT28 = i541.t(i13, parcel);
                            break;
                        case 5:
                            strT29 = i541.t(i13, parcel);
                            break;
                        case 6:
                            strT30 = i541.t(i13, parcel);
                            break;
                        case 7:
                            strT31 = i541.t(i13, parcel);
                            break;
                        case '\b':
                            iQ34 = i541.Q(i13, parcel);
                            break;
                        case '\t':
                            arrayListV = i541.v(i13, parcel);
                            break;
                        case '\n':
                            strT27 = i541.t(i13, parcel);
                            break;
                        default:
                            i541.U(i13, parcel);
                            break;
                    }
                }
                i541.A(iX13, parcel);
                Pattern pattern2 = o4e.a;
                if (strT27 == null) {
                    jSONObject2 = null;
                } else {
                    try {
                        jSONObject2 = new JSONObject(strT27);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                }
                return new MediaTrack(jS10, iQ33, strT28, strT29, strT30, strT31, iQ34, arrayListV, jSONObject2);
            case 13:
                int iX14 = i541.X(parcel);
                String strT32 = null;
                String strT33 = null;
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        strT8 = i541.t(i14, parcel);
                    } else if (c8 == 3) {
                        strT32 = i541.t(i14, parcel);
                    } else if (c8 != 4) {
                        i541.U(i14, parcel);
                    } else {
                        strT33 = i541.t(i14, parcel);
                    }
                }
                i541.A(iX14, parcel);
                return new ntn1(strT8, strT32, strT33);
            case 14:
                int iX15 = i541.X(parcel);
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        i541.U(i15, parcel);
                    } else {
                        iQ9 = i541.Q(i15, parcel);
                    }
                }
                i541.A(iX15, parcel);
                return new mun1(iQ9);
            case 15:
                int iX16 = i541.X(parcel);
                while (parcel.dataPosition() < iX16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 2) {
                        i541.U(i16, parcel);
                    } else {
                        iQ8 = i541.Q(i16, parcel);
                    }
                }
                i541.A(iX16, parcel);
                return new sun1(iQ8);
            case 16:
                int iX17 = i541.X(parcel);
                while (parcel.dataPosition() < iX17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        i541.U(i17, parcel);
                    } else {
                        iQ7 = i541.Q(i17, parcel);
                    }
                }
                i541.A(iX17, parcel);
                return new qvn1(iQ7);
            case 17:
                int iX18 = i541.X(parcel);
                while (parcel.dataPosition() < iX18) {
                    int i18 = parcel.readInt();
                    char c9 = (char) i18;
                    if (c9 == 1) {
                        iQ6 = i541.Q(i18, parcel);
                    } else if (c9 != 2) {
                        i541.U(i18, parcel);
                    } else {
                        strT7 = i541.t(i18, parcel);
                    }
                }
                i541.A(iX18, parcel);
                return new yvn1(iQ6, strT7);
            case 18:
                int iX19 = i541.X(parcel);
                int iQ35 = 0;
                boolean zI9 = false;
                boolean zI10 = false;
                boolean zI11 = false;
                boolean zI12 = false;
                ArrayList arrayListX9 = null;
                String strT34 = null;
                Long lValueOf = null;
                while (parcel.dataPosition() < iX19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iQ35 = i541.Q(i19, parcel);
                            break;
                        case 2:
                            zI9 = i541.I(i19, parcel);
                            break;
                        case 3:
                            zI10 = i541.I(i19, parcel);
                            break;
                        case 4:
                            zI11 = i541.I(i19, parcel);
                            break;
                        case 5:
                            zI12 = i541.I(i19, parcel);
                            break;
                        case 6:
                            arrayListX9 = i541.x(parcel, i19, ipn1.CREATOR);
                            break;
                        case 7:
                            strT34 = i541.t(i19, parcel);
                            break;
                        case '\b':
                            int iT = i541.T(i19, parcel);
                            if (iT != 0) {
                                i541.Z(parcel, iT, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        default:
                            i541.U(i19, parcel);
                            break;
                    }
                }
                i541.A(iX19, parcel);
                return new jwn1(iQ35, zI9, zI10, zI11, zI12, arrayListX9, strT34, lValueOf);
            case 19:
                int iX20 = i541.X(parcel);
                while (parcel.dataPosition() < iX20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        i541.U(i20, parcel);
                    } else {
                        strT6 = i541.t(i20, parcel);
                    }
                }
                i541.A(iX20, parcel);
                dm00 dm00Var = new dm00();
                dm00Var.a = strT6;
                return dm00Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iX21 = i541.X(parcel);
                String strT35 = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                Uri uri = null;
                while (parcel.dataPosition() < iX21) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 2) {
                        bArrP = i541.p(i21, parcel);
                    } else if (c10 == 3) {
                        strT35 = i541.t(i21, parcel);
                    } else if (c10 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) i541.s(parcel, i21, ParcelFileDescriptor.CREATOR);
                    } else if (c10 != 5) {
                        i541.U(i21, parcel);
                    } else {
                        uri = (Uri) i541.s(parcel, i21, Uri.CREATOR);
                    }
                }
                i541.A(iX21, parcel);
                return new Asset(bArrP, strT35, parcelFileDescriptor, uri);
            case 21:
                int iX22 = i541.X(parcel);
                while (parcel.dataPosition() < iX22) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        iQ5 = i541.Q(i22, parcel);
                    } else if (c11 != 2) {
                        i541.U(i22, parcel);
                    } else {
                        strT5 = i541.t(i22, parcel);
                    }
                }
                i541.A(iX22, parcel);
                return new Scope(iQ5, strT5);
            case 22:
                int iX23 = i541.X(parcel);
                int iQ36 = 0;
                String strT36 = null;
                String strT37 = null;
                ArrayList arrayListV2 = null;
                String strT38 = null;
                Uri uri2 = null;
                String strT39 = null;
                String strT40 = null;
                Boolean boolJ = null;
                Boolean boolJ2 = null;
                while (parcel.dataPosition() < iX23) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            strT36 = i541.t(i23, parcel);
                            break;
                        case 3:
                            strT37 = i541.t(i23, parcel);
                            break;
                        case 4:
                            i541.x(parcel, i23, bil1.CREATOR);
                            break;
                        case 5:
                            arrayListV2 = i541.v(i23, parcel);
                            break;
                        case 6:
                            strT38 = i541.t(i23, parcel);
                            break;
                        case 7:
                            uri2 = (Uri) i541.s(parcel, i23, Uri.CREATOR);
                            break;
                        case '\b':
                            strT39 = i541.t(i23, parcel);
                            break;
                        case '\t':
                            strT40 = i541.t(i23, parcel);
                            break;
                        case '\n':
                            boolJ = i541.J(i23, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            boolJ2 = i541.J(i23, parcel);
                            break;
                        case grn1.d /* 12 */:
                            iQ36 = i541.Q(i23, parcel);
                            break;
                        default:
                            i541.U(i23, parcel);
                            break;
                    }
                }
                i541.A(iX23, parcel);
                return new yz5(strT36, strT37, arrayListV2, strT38, uri2, strT39, strT40, boolJ, boolJ2, iQ36);
            case 23:
                int iX24 = i541.X(parcel);
                long jS11 = 0;
                long jS12 = 0;
                boolean zI13 = false;
                Bundle bundleO2 = null;
                String strT41 = null;
                while (parcel.dataPosition() < iX24) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 1) {
                        jS11 = i541.S(i24, parcel);
                    } else if (c12 == 2) {
                        jS12 = i541.S(i24, parcel);
                    } else if (c12 == 3) {
                        zI13 = i541.I(i24, parcel);
                    } else if (c12 == 7) {
                        bundleO2 = i541.o(i24, parcel);
                    } else if (c12 != '\b') {
                        i541.U(i24, parcel);
                    } else {
                        strT41 = i541.t(i24, parcel);
                    }
                }
                i541.A(iX24, parcel);
                return new eyn1(jS11, jS12, zI13, bundleO2, strT41);
            case 24:
                int iX25 = i541.X(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iX25) {
                    int i25 = parcel.readInt();
                    char c13 = (char) i25;
                    if (c13 == 1) {
                        iQ4 = i541.Q(i25, parcel);
                    } else if (c13 == 2) {
                        strT4 = i541.t(i25, parcel);
                    } else if (c13 != 3) {
                        i541.U(i25, parcel);
                    } else {
                        intent = (Intent) i541.s(parcel, i25, Intent.CREATOR);
                    }
                }
                i541.A(iX25, parcel);
                return new lyn1(iQ4, intent, strT4);
            case 25:
                int iX26 = i541.X(parcel);
                float fM = 0.0f;
                int iQ37 = 0;
                int iQ38 = 0;
                int iQ39 = 0;
                int iQ40 = 0;
                int iQ41 = 0;
                int iQ42 = 0;
                int iQ43 = 0;
                int iQ44 = 0;
                int iQ45 = 0;
                String strT42 = null;
                String strT43 = null;
                while (parcel.dataPosition() < iX26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            fM = i541.M(i26, parcel);
                            break;
                        case 3:
                            iQ37 = i541.Q(i26, parcel);
                            break;
                        case 4:
                            iQ38 = i541.Q(i26, parcel);
                            break;
                        case 5:
                            iQ39 = i541.Q(i26, parcel);
                            break;
                        case 6:
                            iQ40 = i541.Q(i26, parcel);
                            break;
                        case 7:
                            iQ41 = i541.Q(i26, parcel);
                            break;
                        case '\b':
                            iQ42 = i541.Q(i26, parcel);
                            break;
                        case '\t':
                            iQ43 = i541.Q(i26, parcel);
                            break;
                        case '\n':
                            strT42 = i541.t(i26, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            iQ44 = i541.Q(i26, parcel);
                            break;
                        case grn1.d /* 12 */:
                            iQ45 = i541.Q(i26, parcel);
                            break;
                        case '\r':
                            strT43 = i541.t(i26, parcel);
                            break;
                        default:
                            i541.U(i26, parcel);
                            break;
                    }
                }
                i541.A(iX26, parcel);
                return new see1(fM, iQ37, iQ38, iQ39, iQ40, iQ41, iQ42, iQ43, strT42, iQ44, iQ45, strT43);
            case 26:
                int iX27 = i541.X(parcel);
                String strT44 = null;
                while (parcel.dataPosition() < iX27) {
                    int i27 = parcel.readInt();
                    char c14 = (char) i27;
                    if (c14 == 2) {
                        strT3 = i541.t(i27, parcel);
                    } else if (c14 != 3) {
                        i541.U(i27, parcel);
                    } else {
                        strT44 = i541.t(i27, parcel);
                    }
                }
                i541.A(iX27, parcel);
                return new jti1(strT3, strT44);
            case 27:
                int iX28 = i541.X(parcel);
                int iQ46 = 0;
                int iQ47 = 0;
                while (parcel.dataPosition() < iX28) {
                    int i28 = parcel.readInt();
                    char c15 = (char) i28;
                    if (c15 == 2) {
                        iQ3 = i541.Q(i28, parcel);
                    } else if (c15 == 3) {
                        iQ46 = i541.Q(i28, parcel);
                    } else if (c15 != 4) {
                        i541.U(i28, parcel);
                    } else {
                        iQ47 = i541.Q(i28, parcel);
                    }
                }
                i541.A(iX28, parcel);
                return new opj1(iQ3, iQ46, iQ47);
            case 28:
                int iX29 = i541.X(parcel);
                String strT45 = null;
                while (parcel.dataPosition() < iX29) {
                    int i29 = parcel.readInt();
                    char c16 = (char) i29;
                    if (c16 == 2) {
                        strT2 = i541.t(i29, parcel);
                    } else if (c16 != 3) {
                        i541.U(i29, parcel);
                    } else {
                        strT45 = i541.t(i29, parcel);
                    }
                }
                i541.A(iX29, parcel);
                return new DataItemAssetParcelable(strT2, strT45);
            default:
                int iX30 = i541.X(parcel);
                PendingIntent pendingIntent = null;
                lal lalVar = null;
                while (parcel.dataPosition() < iX30) {
                    int i30 = parcel.readInt();
                    char c17 = (char) i30;
                    if (c17 == 1) {
                        iQ2 = i541.Q(i30, parcel);
                    } else if (c17 == 2) {
                        strT = i541.t(i30, parcel);
                    } else if (c17 == 3) {
                        pendingIntent = (PendingIntent) i541.s(parcel, i30, PendingIntent.CREATOR);
                    } else if (c17 != 4) {
                        i541.U(i30, parcel);
                    } else {
                        lalVar = (lal) i541.s(parcel, i30, lal.CREATOR);
                    }
                }
                i541.A(iX30, parcel);
                return new Status(iQ2, strT, pendingIntent, lalVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new MediaError[i];
            case 1:
                return new MediaInfo[i];
            case 2:
                return new orn1[i];
            case 3:
                return new pqh0[i];
            case 4:
                return new sqh0[i];
            case 5:
                return new ouh0[i];
            case 6:
                return new puh0[i];
            case 7:
                return new quh0[i];
            case 8:
                return new j3i0[i];
            case 9:
                return new AppTheme[i];
            case 10:
                return new ipn1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new zyh[i];
            case grn1.d /* 12 */:
                return new MediaTrack[i];
            case 13:
                return new ntn1[i];
            case 14:
                return new mun1[i];
            case 15:
                return new sun1[i];
            case 16:
                return new qvn1[i];
            case 17:
                return new yvn1[i];
            case 18:
                return new jwn1[i];
            case 19:
                return new dm00[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new Asset[i];
            case 21:
                return new Scope[i];
            case 22:
                return new yz5[i];
            case 23:
                return new eyn1[i];
            case 24:
                return new lyn1[i];
            case 25:
                return new see1[i];
            case 26:
                return new jti1[i];
            case 27:
                return new opj1[i];
            case 28:
                return new DataItemAssetParcelable[i];
            default:
                return new Status[i];
        }
    }
}
