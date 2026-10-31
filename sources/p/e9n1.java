package p;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.engage.service.ClusterMetadata;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e9n1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ e9n1(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        float fM = 0.0f;
        int iQ = 0;
        boolean zI = false;
        boolean zI2 = false;
        int iQ2 = 0;
        int iQ3 = 0;
        int iQ4 = 0;
        int iQ5 = 0;
        lal lalVarV = null;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iX = i541.X(parcel);
                int iQ6 = 0;
                int iQ7 = 0;
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iQ = i541.Q(i, parcel);
                    } else if (c == 2) {
                        lalVarV = (Uri) i541.s(parcel, i, Uri.CREATOR);
                    } else if (c == 3) {
                        iQ6 = i541.Q(i, parcel);
                    } else if (c != 4) {
                        i541.U(i, parcel);
                    } else {
                        iQ7 = i541.Q(i, parcel);
                    }
                }
                i541.A(iX, parcel);
                return new bil1(iQ, lalVarV, iQ6, iQ7);
            case 1:
                int iX2 = i541.X(parcel);
                String strT = null;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        lalVarV = i541.v(i2, parcel);
                    } else if (c2 != 2) {
                        i541.U(i2, parcel);
                    } else {
                        strT = i541.t(i2, parcel);
                    }
                }
                i541.A(iX2, parcel);
                return new c9n1(lalVarV, strT);
            case 2:
                int iX3 = i541.X(parcel);
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iQ5 = i541.Q(i3, parcel);
                    } else if (c3 != 2) {
                        i541.U(i3, parcel);
                    } else {
                        lalVarV = (u9n1) i541.s(parcel, i3, u9n1.CREATOR);
                    }
                }
                i541.A(iX3, parcel);
                return new f9n1(iQ5, lalVarV);
            case 3:
                int iX4 = i541.X(parcel);
                v9n1 v9n1Var = null;
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        iQ4 = i541.Q(i4, parcel);
                    } else if (c4 == 2) {
                        lalVarV = (lal) i541.s(parcel, i4, lal.CREATOR);
                    } else if (c4 != 3) {
                        i541.U(i4, parcel);
                    } else {
                        v9n1Var = (v9n1) i541.s(parcel, i4, v9n1.CREATOR);
                    }
                }
                i541.A(iX4, parcel);
                return new k9n1(iQ4, lalVarV, v9n1Var);
            case 4:
                int iX5 = i541.X(parcel);
                int iQ8 = -1;
                long jS = 0;
                long jS2 = 0;
                int iQ9 = 0;
                int iQ10 = 0;
                int iQ11 = 0;
                int iQ12 = 0;
                String strT2 = null;
                String strT3 = null;
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iQ9 = i541.Q(i5, parcel);
                            break;
                        case 2:
                            iQ10 = i541.Q(i5, parcel);
                            break;
                        case 3:
                            iQ11 = i541.Q(i5, parcel);
                            break;
                        case 4:
                            jS = i541.S(i5, parcel);
                            break;
                        case 5:
                            jS2 = i541.S(i5, parcel);
                            break;
                        case 6:
                            strT2 = i541.t(i5, parcel);
                            break;
                        case 7:
                            strT3 = i541.t(i5, parcel);
                            break;
                        case '\b':
                            iQ12 = i541.Q(i5, parcel);
                            break;
                        case '\t':
                            iQ8 = i541.Q(i5, parcel);
                            break;
                        default:
                            i541.U(i5, parcel);
                            break;
                    }
                }
                i541.A(iX5, parcel);
                return new uoj0(iQ9, iQ10, iQ11, jS, jS2, strT2, strT3, iQ12, iQ8);
            case 5:
                int iX6 = i541.X(parcel);
                int iQ13 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iQ3 = i541.Q(i6, parcel);
                    } else if (c5 == 2) {
                        lalVarV = (Account) i541.s(parcel, i6, Account.CREATOR);
                    } else if (c5 == 3) {
                        iQ13 = i541.Q(i6, parcel);
                    } else if (c5 != 4) {
                        i541.U(i6, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) i541.s(parcel, i6, GoogleSignInAccount.CREATOR);
                    }
                }
                i541.A(iX6, parcel);
                return new u9n1(iQ3, lalVarV, iQ13, googleSignInAccount);
            case 6:
                int iX7 = i541.X(parcel);
                int iQ14 = 0;
                boolean zI3 = false;
                boolean zI4 = false;
                IBinder iBinderP = null;
                lal lalVar = null;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iQ14 = i541.Q(i7, parcel);
                    } else if (c6 == 2) {
                        iBinderP = i541.P(i7, parcel);
                    } else if (c6 == 3) {
                        lalVar = (lal) i541.s(parcel, i7, lal.CREATOR);
                    } else if (c6 == 4) {
                        zI3 = i541.I(i7, parcel);
                    } else if (c6 != 5) {
                        i541.U(i7, parcel);
                    } else {
                        zI4 = i541.I(i7, parcel);
                    }
                }
                i541.A(iX7, parcel);
                return new v9n1(iQ14, iBinderP, lalVar, zI3, zI4);
            case 7:
                int iX8 = i541.X(parcel);
                String strT4 = "";
                String strT5 = "";
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 4) {
                        strT4 = i541.t(i8, parcel);
                    } else if (c7 == 7) {
                        lalVarV = (GoogleSignInAccount) i541.s(parcel, i8, GoogleSignInAccount.CREATOR);
                    } else if (c7 != '\b') {
                        i541.U(i8, parcel);
                    } else {
                        strT5 = i541.t(i8, parcel);
                    }
                }
                i541.A(iX8, parcel);
                SignInAccount signInAccount = new SignInAccount();
                signInAccount.b = lalVarV;
                zod.p(strT4, "8.3 and 8.4 SDKs require non-null email");
                signInAccount.a = strT4;
                zod.p(strT5, "8.3 and 8.4 SDKs require non-null userId");
                signInAccount.c = strT5;
                return signInAccount;
            case 8:
                int iX9 = i541.X(parcel);
                PendingIntent pendingIntent = null;
                String strT6 = null;
                String strT7 = null;
                ArrayList arrayListV = null;
                String strT8 = null;
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 1) {
                        pendingIntent = (PendingIntent) i541.s(parcel, i9, PendingIntent.CREATOR);
                    } else if (c8 == 2) {
                        strT6 = i541.t(i9, parcel);
                    } else if (c8 == 3) {
                        strT7 = i541.t(i9, parcel);
                    } else if (c8 == 4) {
                        arrayListV = i541.v(i9, parcel);
                    } else if (c8 != 5) {
                        i541.U(i9, parcel);
                    } else {
                        strT8 = i541.t(i9, parcel);
                    }
                }
                i541.A(iX9, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent, strT6, strT7, arrayListV, strT8);
            case 9:
                int iX10 = i541.X(parcel);
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        i541.U(i10, parcel);
                    } else {
                        lalVarV = (PendingIntent) i541.s(parcel, i10, PendingIntent.CREATOR);
                    }
                }
                i541.A(iX10, parcel);
                return new n841(lalVarV);
            case 10:
                int iX11 = i541.X(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        lalVarV = i541.t(i11, parcel);
                    } else if (c9 != 5) {
                        i541.U(i11, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) i541.s(parcel, i11, GoogleSignInOptions.CREATOR);
                    }
                }
                i541.A(iX11, parcel);
                return new SignInConfiguration(lalVarV, googleSignInOptions);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int iX12 = i541.X(parcel);
                float fM2 = 0.0f;
                float fM3 = 0.0f;
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        lalVarV = (LatLng) i541.s(parcel, i12, LatLng.CREATOR);
                    } else if (c10 == 3) {
                        fM = i541.M(i12, parcel);
                    } else if (c10 == 4) {
                        fM2 = i541.M(i12, parcel);
                    } else if (c10 != 5) {
                        i541.U(i12, parcel);
                    } else {
                        fM3 = i541.M(i12, parcel);
                    }
                }
                i541.A(iX12, parcel);
                return new CameraPosition(lalVarV, fM, fM2, fM3);
            case grn1.d /* 12 */:
                int iX13 = i541.X(parcel);
                String strT9 = null;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        lalVarV = i541.t(i13, parcel);
                    } else if (c11 == 2) {
                        strT9 = i541.t(i13, parcel);
                    } else if (c11 != 3) {
                        i541.U(i13, parcel);
                    } else {
                        iQ2 = i541.Q(i13, parcel);
                    }
                }
                i541.A(iX13, parcel);
                return new b0u(iQ2, lalVarV, strT9);
            case 13:
                int iX14 = i541.X(parcel);
                boolean zI5 = false;
                boolean zI6 = false;
                String strT10 = null;
                String strT11 = null;
                IBinder iBinderP2 = null;
                vro0 vro0Var = null;
                while (parcel.dataPosition() < iX14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strT10 = i541.t(i14, parcel);
                            break;
                        case 3:
                            strT11 = i541.t(i14, parcel);
                            break;
                        case 4:
                            iBinderP2 = i541.P(i14, parcel);
                            break;
                        case 5:
                            vro0Var = (vro0) i541.s(parcel, i14, vro0.CREATOR);
                            break;
                        case 6:
                            zI5 = i541.I(i14, parcel);
                            break;
                        case 7:
                            zI6 = i541.I(i14, parcel);
                            break;
                        default:
                            i541.U(i14, parcel);
                            break;
                    }
                }
                i541.A(iX14, parcel);
                return new h3e(strT10, strT11, iBinderP2, vro0Var, zI5, zI6);
            case 14:
                int iX15 = i541.X(parcel);
                int iQ15 = 0;
                int iQ16 = 0;
                PendingIntent pendingIntent2 = null;
                String strT12 = null;
                Integer numR = null;
                while (parcel.dataPosition() < iX15) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        iQ15 = i541.Q(i15, parcel);
                    } else if (c12 == 2) {
                        iQ16 = i541.Q(i15, parcel);
                    } else if (c12 == 3) {
                        pendingIntent2 = (PendingIntent) i541.s(parcel, i15, PendingIntent.CREATOR);
                    } else if (c12 == 4) {
                        strT12 = i541.t(i15, parcel);
                    } else if (c12 != 5) {
                        i541.U(i15, parcel);
                    } else {
                        numR = i541.R(i15, parcel);
                    }
                }
                i541.A(iX15, parcel);
                return new lal(iQ15, iQ16, pendingIntent2, strT12, numR);
            case 15:
                int iX16 = i541.X(parcel);
                long jS3 = Long.MAX_VALUE;
                int iQ17 = 0;
                boolean zI7 = false;
                x1o1 x1o1Var = null;
                while (parcel.dataPosition() < iX16) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        jS3 = i541.S(i16, parcel);
                    } else if (c13 == 2) {
                        iQ17 = i541.Q(i16, parcel);
                    } else if (c13 == 3) {
                        zI7 = i541.I(i16, parcel);
                    } else if (c13 != 5) {
                        i541.U(i16, parcel);
                    } else {
                        x1o1Var = (x1o1) i541.s(parcel, i16, x1o1.CREATOR);
                    }
                }
                i541.A(iX16, parcel);
                return new ofb0(jS3, iQ17, zI7, x1o1Var);
            case 16:
                int iX17 = i541.X(parcel);
                int iQ18 = 0;
                boolean zI8 = false;
                boolean zI9 = false;
                boolean zI10 = false;
                boolean zI11 = false;
                String strT13 = null;
                String strT14 = null;
                String strT15 = null;
                String strT16 = null;
                String strT17 = null;
                while (parcel.dataPosition() < iX17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            iQ18 = i541.Q(i17, parcel);
                            break;
                        case 3:
                            zI8 = i541.I(i17, parcel);
                            break;
                        case 4:
                            zI9 = i541.I(i17, parcel);
                            break;
                        case 5:
                            strT13 = i541.t(i17, parcel);
                            break;
                        case 6:
                            strT14 = i541.t(i17, parcel);
                            break;
                        case 7:
                            strT15 = i541.t(i17, parcel);
                            break;
                        case '\b':
                            strT16 = i541.t(i17, parcel);
                            break;
                        case '\t':
                            strT17 = i541.t(i17, parcel);
                            break;
                        case '\n':
                            zI10 = i541.I(i17, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            zI11 = i541.I(i17, parcel);
                            break;
                        default:
                            i541.U(i17, parcel);
                            break;
                    }
                }
                i541.A(iX17, parcel);
                return new kbn1(iQ18, strT13, strT14, strT15, strT16, strT17, zI8, zI9, zI10, zI11);
            case 17:
                int iX18 = i541.X(parcel);
                double dL = 0.0d;
                double dL2 = 0.0d;
                int iQ19 = 0;
                int iQ20 = 0;
                kkn1 kkn1Var = null;
                while (parcel.dataPosition() < iX18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            dL = i541.L(i18, parcel);
                            break;
                        case 3:
                            zI2 = i541.I(i18, parcel);
                            break;
                        case 4:
                            iQ19 = i541.Q(i18, parcel);
                            break;
                        case 5:
                            lalVarV = (yz5) i541.s(parcel, i18, yz5.CREATOR);
                            break;
                        case 6:
                            iQ20 = i541.Q(i18, parcel);
                            break;
                        case 7:
                            kkn1Var = (kkn1) i541.s(parcel, i18, kkn1.CREATOR);
                            break;
                        case '\b':
                            dL2 = i541.L(i18, parcel);
                            break;
                        default:
                            i541.U(i18, parcel);
                            break;
                    }
                }
                i541.A(iX18, parcel);
                jdn1 jdn1Var = new jdn1();
                jdn1Var.a = dL;
                jdn1Var.b = zI2;
                jdn1Var.c = iQ19;
                jdn1Var.d = lalVarV;
                jdn1Var.e = iQ20;
                jdn1Var.f = kkn1Var;
                jdn1Var.g = dL2;
                return jdn1Var;
            case 18:
                hql1 hql1Var = new hql1((byte) 3);
                int i19 = parcel.readInt();
                if (i19 > 0) {
                    for (int i20 = 0; i20 < i19; i20++) {
                        ((v280) hql1Var.a).c(Integer.valueOf(parcel.readInt()));
                    }
                }
                return new ClusterMetadata(hql1Var);
            case 19:
                int iX19 = i541.X(parcel);
                int iQ21 = 0;
                int iQ22 = 0;
                int iQ23 = 0;
                boolean zI12 = false;
                boolean zI13 = false;
                while (parcel.dataPosition() < iX19) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        iQ21 = i541.Q(i21, parcel);
                    } else if (c14 == 2) {
                        zI12 = i541.I(i21, parcel);
                    } else if (c14 == 3) {
                        zI13 = i541.I(i21, parcel);
                    } else if (c14 == 4) {
                        iQ22 = i541.Q(i21, parcel);
                    } else if (c14 != 5) {
                        i541.U(i21, parcel);
                    } else {
                        iQ23 = i541.Q(i21, parcel);
                    }
                }
                i541.A(iX19, parcel);
                return new zo31(iQ21, iQ22, iQ23, zI12, zI13);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iX20 = i541.X(parcel);
                String strT18 = null;
                while (parcel.dataPosition() < iX20) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 1) {
                        lalVarV = i541.t(i22, parcel);
                    } else if (c15 != 2) {
                        i541.U(i22, parcel);
                    } else {
                        strT18 = i541.t(i22, parcel);
                    }
                }
                i541.A(iX20, parcel);
                return new d6o(lalVarV, strT18);
            case 21:
                int iX21 = i541.X(parcel);
                float fM4 = 0.0f;
                float fM5 = 0.0f;
                while (parcel.dataPosition() < iX21) {
                    int i23 = parcel.readInt();
                    char c16 = (char) i23;
                    if (c16 == 2) {
                        fM = i541.M(i23, parcel);
                    } else if (c16 == 3) {
                        fM4 = i541.M(i23, parcel);
                    } else if (c16 != 4) {
                        i541.U(i23, parcel);
                    } else {
                        fM5 = i541.M(i23, parcel);
                    }
                }
                i541.A(iX21, parcel);
                return new fjn1(fM, fM4, fM5);
            case 22:
                int iX22 = i541.X(parcel);
                fjn1 fjn1Var = null;
                while (parcel.dataPosition() < iX22) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 2) {
                        lalVarV = (fjn1) i541.s(parcel, i24, fjn1.CREATOR);
                    } else if (c17 != 3) {
                        i541.U(i24, parcel);
                    } else {
                        fjn1Var = (fjn1) i541.s(parcel, i24, fjn1.CREATOR);
                    }
                }
                i541.A(iX22, parcel);
                return new kkn1(lalVarV, fjn1Var);
            case 23:
                int iX23 = i541.X(parcel);
                ArrayList arrayListX = null;
                while (parcel.dataPosition() < iX23) {
                    int i25 = parcel.readInt();
                    char c18 = (char) i25;
                    if (c18 == 2) {
                        lalVarV = i541.t(i25, parcel);
                    } else if (c18 != 3) {
                        i541.U(i25, parcel);
                    } else {
                        arrayListX = i541.x(parcel, i25, zio1.CREATOR);
                    }
                }
                i541.A(iX23, parcel);
                return new okn1(lalVarV, arrayListX);
            case 24:
                int iX24 = i541.X(parcel);
                long jS4 = 0;
                long jS5 = 0;
                boolean zI14 = false;
                boolean zI15 = false;
                boolean zI16 = false;
                String strT19 = null;
                String[] strArrU = null;
                while (parcel.dataPosition() < iX24) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            jS4 = i541.S(i26, parcel);
                            break;
                        case 3:
                            strT19 = i541.t(i26, parcel);
                            break;
                        case 4:
                            jS5 = i541.S(i26, parcel);
                            break;
                        case 5:
                            zI14 = i541.I(i26, parcel);
                            break;
                        case 6:
                            strArrU = i541.u(i26, parcel);
                            break;
                        case 7:
                            zI15 = i541.I(i26, parcel);
                            break;
                        case '\b':
                            zI16 = i541.I(i26, parcel);
                            break;
                        default:
                            i541.U(i26, parcel);
                            break;
                    }
                }
                i541.A(iX24, parcel);
                return new ni0(jS4, strT19, jS5, zI14, strArrU, zI15, zI16);
            case 25:
                int iX25 = i541.X(parcel);
                String strT20 = null;
                while (parcel.dataPosition() < iX25) {
                    int i27 = parcel.readInt();
                    char c19 = (char) i27;
                    if (c19 == 1) {
                        lalVarV = i541.t(i27, parcel);
                    } else if (c19 != 2) {
                        i541.U(i27, parcel);
                    } else {
                        strT20 = i541.t(i27, parcel);
                    }
                }
                i541.A(iX25, parcel);
                cm00 cm00Var = new cm00();
                cm00Var.a = lalVarV;
                cm00Var.b = strT20;
                return cm00Var;
            case 26:
                int iX26 = i541.X(parcel);
                while (parcel.dataPosition() < iX26) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        i541.U(i28, parcel);
                    } else {
                        lalVarV = i541.t(i28, parcel);
                    }
                }
                i541.A(iX26, parcel);
                return new fbn1(lalVarV);
            case 27:
                return new uxn1(parcel.readStrongBinder());
            case 28:
                int iX27 = i541.X(parcel);
                long jS6 = -1;
                int iQ24 = 0;
                boolean zI17 = false;
                String strT21 = null;
                while (parcel.dataPosition() < iX27) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 1) {
                        strT21 = i541.t(i29, parcel);
                    } else if (c20 == 2) {
                        iQ24 = i541.Q(i29, parcel);
                    } else if (c20 == 3) {
                        jS6 = i541.S(i29, parcel);
                    } else if (c20 != 4) {
                        i541.U(i29, parcel);
                    } else {
                        zI17 = i541.I(i29, parcel);
                    }
                }
                i541.A(iX27, parcel);
                return new pl10(iQ24, jS6, strT21, zI17);
            default:
                int iX28 = i541.X(parcel);
                boolean zI18 = false;
                d6o d6oVar = null;
                while (parcel.dataPosition() < iX28) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 2) {
                        zI = i541.I(i30, parcel);
                    } else if (c21 == 3) {
                        lalVarV = i541.t(i30, parcel);
                    } else if (c21 == 4) {
                        zI18 = i541.I(i30, parcel);
                    } else if (c21 != 5) {
                        i541.U(i30, parcel);
                    } else {
                        d6oVar = (d6o) i541.s(parcel, i30, d6o.CREATOR);
                    }
                }
                i541.A(iX28, parcel);
                return new ckb0(zI, lalVarV, zI18, d6oVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new bil1[i];
            case 1:
                return new c9n1[i];
            case 2:
                return new f9n1[i];
            case 3:
                return new k9n1[i];
            case 4:
                return new uoj0[i];
            case 5:
                return new u9n1[i];
            case 6:
                return new v9n1[i];
            case 7:
                return new SignInAccount[i];
            case 8:
                return new SaveAccountLinkingTokenRequest[i];
            case 9:
                return new n841[i];
            case 10:
                return new SignInConfiguration[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new CameraPosition[i];
            case grn1.d /* 12 */:
                return new b0u[i];
            case 13:
                return new h3e[i];
            case 14:
                return new lal[i];
            case 15:
                return new ofb0[i];
            case 16:
                return new kbn1[i];
            case 17:
                return new jdn1[i];
            case 18:
                return new ClusterMetadata[i];
            case 19:
                return new zo31[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new d6o[i];
            case 21:
                return new fjn1[i];
            case 22:
                return new kkn1[i];
            case 23:
                return new okn1[i];
            case 24:
                return new ni0[i];
            case 25:
                return new cm00[i];
            case 26:
                return new fbn1[i];
            case 27:
                return new uxn1[i];
            case 28:
                return new pl10[i];
            default:
                return new ckb0[i];
        }
    }
}
