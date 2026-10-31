package p;

import android.accounts.Account;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.Term;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hmo1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ hmo1(byte b) {
        this.a = b;
    }

    public static void a(vp40 vp40Var, Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        int i2 = vp40Var.a;
        j541.K(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = vp40Var.b;
        j541.K(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = vp40Var.c;
        j541.K(parcel, 3, 4);
        parcel.writeInt(i4);
        j541.F(parcel, 4, vp40Var.d);
        j541.y(parcel, 5, vp40Var.e);
        j541.I(parcel, 6, vp40Var.f, i);
        j541.u(parcel, 7, vp40Var.g);
        j541.E(parcel, 8, vp40Var.h, i);
        j541.I(parcel, 10, vp40Var.i, i);
        j541.I(parcel, 11, vp40Var.t, i);
        boolean z = vp40Var.X;
        j541.K(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = vp40Var.Y;
        j541.K(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = vp40Var.Z;
        j541.K(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        j541.F(parcel, 15, vp40Var.N0);
        j541.M(iL, parcel);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        long jS = 0;
        ArrayList arrayListX = null;
        ArrayList arrayListV = null;
        String strT = null;
        String strT2 = null;
        ArrayList arrayListX2 = null;
        Uri uri = null;
        String strT3 = null;
        Bundle bundleO = null;
        String strT4 = null;
        int iQ = 0;
        int iQ2 = 0;
        boolean zI = false;
        int iQ3 = 0;
        int iQ4 = 0;
        int iQ5 = 0;
        int iQ6 = 0;
        int iQ7 = 0;
        int iQ8 = 0;
        int iQ9 = 0;
        boolean zI2 = false;
        int iQ10 = 0;
        byte bK = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iX = i541.X(parcel);
                while (parcel.dataPosition() < iX) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        iQ = i541.Q(i, parcel);
                    } else if (c == 3) {
                        jS = i541.S(i, parcel);
                    } else if (c != 4) {
                        i541.U(i, parcel);
                    } else {
                        arrayListX = i541.x(parcel, i, ojo1.CREATOR);
                    }
                }
                i541.A(iX, parcel);
                return new tlo1(iQ, jS, arrayListX);
            case 1:
                int iX2 = i541.X(parcel);
                byte bK2 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        bK = i541.K(i2, parcel);
                    } else if (c2 == 3) {
                        bK2 = i541.K(i2, parcel);
                    } else if (c2 != 4) {
                        i541.U(i2, parcel);
                    } else {
                        strT4 = i541.t(i2, parcel);
                    }
                }
                i541.A(iX2, parcel);
                return new ylo1(bK, bK2, strT4);
            case 2:
                int iX3 = i541.X(parcel);
                pl10[] pl10VarArr = null;
                cbl cblVar = null;
                while (parcel.dataPosition() < iX3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        bundleO = i541.o(i3, parcel);
                    } else if (c3 == 2) {
                        pl10VarArr = (pl10[]) i541.w(parcel, i3, pl10.CREATOR);
                    } else if (c3 == 3) {
                        iQ10 = i541.Q(i3, parcel);
                    } else if (c3 != 4) {
                        i541.U(i3, parcel);
                    } else {
                        cblVar = (cbl) i541.s(parcel, i3, cbl.CREATOR);
                    }
                }
                i541.A(iX3, parcel);
                dmo1 dmo1Var = new dmo1();
                dmo1Var.a = bundleO;
                dmo1Var.b = pl10VarArr;
                dmo1Var.c = iQ10;
                dmo1Var.d = cblVar;
                return dmo1Var;
            case 3:
                int iX4 = i541.X(parcel);
                while (parcel.dataPosition() < iX4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        i541.U(i4, parcel);
                    } else {
                        zI2 = i541.I(i4, parcel);
                    }
                }
                i541.A(iX4, parcel);
                return new bmo1(zI2);
            case 4:
                int iX5 = i541.X(parcel);
                while (parcel.dataPosition() < iX5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        i541.U(i5, parcel);
                    } else {
                        strT3 = i541.t(i5, parcel);
                    }
                }
                i541.A(iX5, parcel);
                return new hqo1(strT3);
            case 5:
                int iX6 = i541.X(parcel);
                while (parcel.dataPosition() < iX6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        uri = (Uri) i541.s(parcel, i6, Uri.CREATOR);
                    } else if (c4 != 2) {
                        i541.U(i6, parcel);
                    } else {
                        iQ9 = i541.Q(i6, parcel);
                    }
                }
                i541.A(iX6, parcel);
                return new hpo1(iQ9, uri);
            case 6:
                int iX7 = i541.X(parcel);
                zo31 zo31Var = null;
                int[] iArrQ = null;
                int[] iArrQ2 = null;
                boolean zI3 = false;
                boolean zI4 = false;
                int iQ11 = 0;
                while (parcel.dataPosition() < iX7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            zo31Var = (zo31) i541.s(parcel, i7, zo31.CREATOR);
                            break;
                        case 2:
                            zI3 = i541.I(i7, parcel);
                            break;
                        case 3:
                            zI4 = i541.I(i7, parcel);
                            break;
                        case 4:
                            iArrQ = i541.q(i7, parcel);
                            break;
                        case 5:
                            iQ11 = i541.Q(i7, parcel);
                            break;
                        case 6:
                            iArrQ2 = i541.q(i7, parcel);
                            break;
                        default:
                            i541.U(i7, parcel);
                            break;
                    }
                }
                i541.A(iX7, parcel);
                return new cbl(zo31Var, zI3, zI4, iArrQ, iQ11, iArrQ2);
            case 7:
                int iX8 = i541.X(parcel);
                int iQ12 = 0;
                while (parcel.dataPosition() < iX8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iQ8 = i541.Q(i8, parcel);
                    } else if (c5 != 2) {
                        i541.U(i8, parcel);
                    } else {
                        iQ12 = i541.Q(i8, parcel);
                    }
                }
                i541.A(iX8, parcel);
                return new dx5(iQ8, iQ12);
            case 8:
                int iX9 = i541.X(parcel);
                String strT5 = null;
                String strT6 = null;
                String strT7 = null;
                String strT8 = null;
                String strT9 = null;
                String strT10 = null;
                String strT11 = null;
                int iQ13 = 0;
                byte bK3 = 0;
                byte bK4 = 0;
                byte bK5 = 0;
                byte bK6 = 0;
                while (parcel.dataPosition() < iX9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            iQ13 = i541.Q(i9, parcel);
                            break;
                        case 3:
                            strT5 = i541.t(i9, parcel);
                            break;
                        case 4:
                            strT6 = i541.t(i9, parcel);
                            break;
                        case 5:
                            strT7 = i541.t(i9, parcel);
                            break;
                        case 6:
                            strT8 = i541.t(i9, parcel);
                            break;
                        case 7:
                            strT9 = i541.t(i9, parcel);
                            break;
                        case '\b':
                            strT10 = i541.t(i9, parcel);
                            break;
                        case '\t':
                            bK3 = i541.K(i9, parcel);
                            break;
                        case '\n':
                            bK4 = i541.K(i9, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            bK5 = i541.K(i9, parcel);
                            break;
                        case grn1.d /* 12 */:
                            bK6 = i541.K(i9, parcel);
                            break;
                        case '\r':
                            strT11 = i541.t(i9, parcel);
                            break;
                        default:
                            i541.U(i9, parcel);
                            break;
                    }
                }
                i541.A(iX9, parcel);
                return new rso1(iQ13, strT5, strT6, strT7, strT8, strT9, strT10, bK3, bK4, bK5, bK6, strT11);
            case 9:
                int iX10 = i541.X(parcel);
                while (parcel.dataPosition() < iX10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        i541.U(i10, parcel);
                    } else {
                        iQ7 = i541.Q(i10, parcel);
                    }
                }
                i541.A(iX10, parcel);
                return new uso1(iQ7);
            case 10:
                int iX11 = i541.X(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = vp40.O0;
                pl10[] pl10VarArr2 = vp40.P0;
                pl10[] pl10VarArr3 = pl10VarArr2;
                String strT12 = null;
                IBinder iBinderP = null;
                Account account = null;
                String strT13 = null;
                int iQ14 = 0;
                int iQ15 = 0;
                int iQ16 = 0;
                boolean zI5 = false;
                int iQ17 = 0;
                boolean zI6 = false;
                while (parcel.dataPosition() < iX11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iQ14 = i541.Q(i11, parcel);
                            break;
                        case 2:
                            iQ15 = i541.Q(i11, parcel);
                            break;
                        case 3:
                            iQ16 = i541.Q(i11, parcel);
                            break;
                        case 4:
                            strT12 = i541.t(i11, parcel);
                            break;
                        case 5:
                            iBinderP = i541.P(i11, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) i541.w(parcel, i11, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = i541.o(i11, parcel);
                            break;
                        case '\b':
                            account = (Account) i541.s(parcel, i11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            i541.U(i11, parcel);
                            break;
                        case '\n':
                            pl10VarArr2 = (pl10[]) i541.w(parcel, i11, pl10.CREATOR);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            pl10VarArr3 = (pl10[]) i541.w(parcel, i11, pl10.CREATOR);
                            break;
                        case grn1.d /* 12 */:
                            zI5 = i541.I(i11, parcel);
                            break;
                        case '\r':
                            iQ17 = i541.Q(i11, parcel);
                            break;
                        case 14:
                            zI6 = i541.I(i11, parcel);
                            break;
                        case 15:
                            strT13 = i541.t(i11, parcel);
                            break;
                    }
                }
                i541.A(iX11, parcel);
                return new vp40(iQ14, iQ15, iQ16, strT12, iBinderP, scopeArr, bundle, account, pl10VarArr2, pl10VarArr3, zI5, iQ17, zI6, strT13);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int iX12 = i541.X(parcel);
                float fM = 0.0f;
                r5p1[] r5p1VarArr = null;
                a7o1 a7o1Var = null;
                a7o1 a7o1Var2 = null;
                a7o1 a7o1Var3 = null;
                String strT14 = null;
                String strT15 = null;
                int iQ18 = 0;
                boolean zI7 = false;
                int iQ19 = 0;
                int iQ20 = 0;
                while (parcel.dataPosition() < iX12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            r5p1VarArr = (r5p1[]) i541.w(parcel, i12, r5p1.CREATOR);
                            break;
                        case 3:
                            a7o1Var = (a7o1) i541.s(parcel, i12, a7o1.CREATOR);
                            break;
                        case 4:
                            a7o1Var2 = (a7o1) i541.s(parcel, i12, a7o1.CREATOR);
                            break;
                        case 5:
                            a7o1Var3 = (a7o1) i541.s(parcel, i12, a7o1.CREATOR);
                            break;
                        case 6:
                            strT14 = i541.t(i12, parcel);
                            break;
                        case 7:
                            fM = i541.M(i12, parcel);
                            break;
                        case '\b':
                            strT15 = i541.t(i12, parcel);
                            break;
                        case '\t':
                            iQ18 = i541.Q(i12, parcel);
                            break;
                        case '\n':
                            zI7 = i541.I(i12, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            iQ19 = i541.Q(i12, parcel);
                            break;
                        case grn1.d /* 12 */:
                            iQ20 = i541.Q(i12, parcel);
                            break;
                        default:
                            i541.U(i12, parcel);
                            break;
                    }
                }
                i541.A(iX12, parcel);
                return new nso1(r5p1VarArr, a7o1Var, a7o1Var2, a7o1Var3, strT14, fM, strT15, iQ18, zI7, iQ19, iQ20);
            case grn1.d /* 12 */:
                int iX13 = i541.X(parcel);
                double dL = 0.0d;
                String strT16 = null;
                ArrayList arrayListV2 = null;
                ckb0 ckb0Var = null;
                h3e h3eVar = null;
                ArrayList arrayListV3 = null;
                bmo1 bmo1Var = null;
                uso1 uso1Var = null;
                boolean zI8 = false;
                boolean zI9 = false;
                boolean zI10 = false;
                boolean zI11 = false;
                boolean zI12 = false;
                boolean zI13 = false;
                boolean zI14 = false;
                boolean zI15 = false;
                boolean zI16 = false;
                boolean zI17 = false;
                while (parcel.dataPosition() < iX13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strT16 = i541.t(i13, parcel);
                            break;
                        case 3:
                            arrayListV2 = i541.v(i13, parcel);
                            break;
                        case 4:
                            zI8 = i541.I(i13, parcel);
                            break;
                        case 5:
                            ckb0Var = (ckb0) i541.s(parcel, i13, ckb0.CREATOR);
                            break;
                        case 6:
                            zI9 = i541.I(i13, parcel);
                            break;
                        case 7:
                            h3eVar = (h3e) i541.s(parcel, i13, h3e.CREATOR);
                            break;
                        case '\b':
                            zI10 = i541.I(i13, parcel);
                            break;
                        case '\t':
                            dL = i541.L(i13, parcel);
                            break;
                        case '\n':
                            zI11 = i541.I(i13, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            zI12 = i541.I(i13, parcel);
                            break;
                        case grn1.d /* 12 */:
                            zI13 = i541.I(i13, parcel);
                            break;
                        case '\r':
                            arrayListV3 = i541.v(i13, parcel);
                            break;
                        case 14:
                            zI14 = i541.I(i13, parcel);
                            break;
                        case 15:
                            i541.Q(i13, parcel);
                            break;
                        case 16:
                            zI15 = i541.I(i13, parcel);
                            break;
                        case 17:
                            bmo1Var = (bmo1) i541.s(parcel, i13, bmo1.CREATOR);
                            break;
                        case 18:
                            uso1Var = (uso1) i541.s(parcel, i13, uso1.CREATOR);
                            break;
                        case 19:
                            zI16 = i541.I(i13, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                            zI17 = i541.I(i13, parcel);
                            break;
                        default:
                            i541.U(i13, parcel);
                            break;
                    }
                }
                i541.A(iX13, parcel);
                return new p3e(strT16, arrayListV2, zI8, ckb0Var, zI9, h3eVar, zI10, dL, zI11, zI12, zI13, arrayListV3, zI14, zI15, bmo1Var, uso1Var, zI16, zI17);
            case 13:
                int iX14 = i541.X(parcel);
                while (parcel.dataPosition() < iX14) {
                    i541.U(parcel.readInt(), parcel);
                }
                i541.A(iX14, parcel);
                return new jxo1();
            case 14:
                int iX15 = i541.X(parcel);
                int iQ21 = 0;
                int iQ22 = 0;
                while (parcel.dataPosition() < iX15) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        iQ6 = i541.Q(i14, parcel);
                    } else if (c6 == 2) {
                        iQ21 = i541.Q(i14, parcel);
                    } else if (c6 != 3) {
                        i541.U(i14, parcel);
                    } else {
                        iQ22 = i541.Q(i14, parcel);
                    }
                }
                i541.A(iX15, parcel);
                return new ex5(iQ6, iQ21, iQ22);
            case 15:
                int iX16 = i541.X(parcel);
                String strT17 = null;
                String strT18 = null;
                nro1 nro1Var = null;
                String strT19 = null;
                String strT20 = null;
                Float fN = null;
                n5p1 n5p1Var = null;
                while (parcel.dataPosition() < iX16) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strT17 = i541.t(i15, parcel);
                            break;
                        case 2:
                            strT18 = i541.t(i15, parcel);
                            break;
                        case 3:
                            nro1Var = (nro1) i541.s(parcel, i15, nro1.CREATOR);
                            break;
                        case 4:
                            strT19 = i541.t(i15, parcel);
                            break;
                        case 5:
                            strT20 = i541.t(i15, parcel);
                            break;
                        case 6:
                            fN = i541.N(i15, parcel);
                            break;
                        case 7:
                            n5p1Var = (n5p1) i541.s(parcel, i15, n5p1.CREATOR);
                            break;
                        default:
                            i541.U(i15, parcel);
                            break;
                    }
                }
                i541.A(iX16, parcel);
                return new kxo1(strT17, strT18, nro1Var, strT19, strT20, fN, n5p1Var);
            case 16:
                int iX17 = i541.X(parcel);
                while (parcel.dataPosition() < iX17) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        i541.U(i16, parcel);
                    } else {
                        iQ5 = i541.Q(i16, parcel);
                    }
                }
                i541.A(iX17, parcel);
                return new fx5(iQ5);
            case 17:
                int iX18 = i541.X(parcel);
                nro1 nro1Var2 = null;
                while (parcel.dataPosition() < iX18) {
                    int i17 = parcel.readInt();
                    char c7 = (char) i17;
                    if (c7 == 1) {
                        iQ4 = i541.Q(i17, parcel);
                    } else if (c7 == 2) {
                        arrayListX2 = i541.x(parcel, i17, kxo1.CREATOR);
                    } else if (c7 != 3) {
                        i541.U(i17, parcel);
                    } else {
                        nro1Var2 = (nro1) i541.s(parcel, i17, nro1.CREATOR);
                    }
                }
                i541.A(iX18, parcel);
                return new v0p1(iQ4, arrayListX2, nro1Var2);
            case 18:
                int iX19 = i541.X(parcel);
                String strT21 = null;
                while (parcel.dataPosition() < iX19) {
                    int i18 = parcel.readInt();
                    char c8 = (char) i18;
                    if (c8 == 2) {
                        strT2 = i541.t(i18, parcel);
                    } else if (c8 == 3) {
                        iQ3 = i541.Q(i18, parcel);
                    } else if (c8 != 4) {
                        i541.U(i18, parcel);
                    } else {
                        strT21 = i541.t(i18, parcel);
                    }
                }
                i541.A(iX19, parcel);
                return new qjo0(strT2, iQ3, strT21);
            case 19:
                int iX20 = i541.X(parcel);
                while (parcel.dataPosition() < iX20) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        i541.U(i19, parcel);
                    } else {
                        strT = i541.t(i19, parcel);
                    }
                }
                i541.A(iX20, parcel);
                return new e1p1(strT);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int iX21 = i541.X(parcel);
                String strT22 = null;
                String strT23 = null;
                String strT24 = null;
                int iQ23 = 0;
                int iQ24 = 0;
                boolean zI18 = false;
                while (parcel.dataPosition() < iX21) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iQ23 = i541.Q(i20, parcel);
                            break;
                        case 2:
                            strT22 = i541.t(i20, parcel);
                            break;
                        case 3:
                            zI18 = i541.I(i20, parcel);
                            break;
                        case 4:
                            strT23 = i541.t(i20, parcel);
                            break;
                        case 5:
                            strT24 = i541.t(i20, parcel);
                            break;
                        case 6:
                            iQ24 = i541.Q(i20, parcel);
                            break;
                        default:
                            i541.U(i20, parcel);
                            break;
                    }
                }
                i541.A(iX21, parcel);
                return new Term(iQ23, iQ24, strT22, strT23, strT24, zI18);
            case 21:
                int iX22 = i541.X(parcel);
                int iQ25 = -1;
                String strT25 = null;
                String strT26 = null;
                String strT27 = null;
                String strT28 = null;
                String strT29 = null;
                ArrayList arrayListX3 = null;
                String strT30 = null;
                String strT31 = null;
                String strT32 = null;
                byte[] bArrP = null;
                String strT33 = null;
                kbn1 kbn1Var = null;
                Integer numR = null;
                Boolean boolJ = null;
                Network network = null;
                int iQ26 = 0;
                int iQ27 = 0;
                int iQ28 = 0;
                boolean zI19 = false;
                while (parcel.dataPosition() < iX22) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            strT25 = i541.t(i21, parcel);
                            break;
                        case 3:
                            strT26 = i541.t(i21, parcel);
                            break;
                        case 4:
                            strT27 = i541.t(i21, parcel);
                            break;
                        case 5:
                            strT28 = i541.t(i21, parcel);
                            break;
                        case 6:
                            strT29 = i541.t(i21, parcel);
                            break;
                        case 7:
                            iQ26 = i541.Q(i21, parcel);
                            break;
                        case '\b':
                            arrayListX3 = i541.x(parcel, i21, bil1.CREATOR);
                            break;
                        case '\t':
                            iQ27 = i541.Q(i21, parcel);
                            break;
                        case '\n':
                            iQ25 = i541.Q(i21, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            strT30 = i541.t(i21, parcel);
                            break;
                        case grn1.d /* 12 */:
                            strT31 = i541.t(i21, parcel);
                            break;
                        case '\r':
                            iQ28 = i541.Q(i21, parcel);
                            break;
                        case 14:
                            strT32 = i541.t(i21, parcel);
                            break;
                        case 15:
                            bArrP = i541.p(i21, parcel);
                            break;
                        case 16:
                            strT33 = i541.t(i21, parcel);
                            break;
                        case 17:
                            zI19 = i541.I(i21, parcel);
                            break;
                        case 18:
                            kbn1Var = (kbn1) i541.s(parcel, i21, kbn1.CREATOR);
                            break;
                        case 19:
                            numR = i541.R(i21, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                            boolJ = i541.J(i21, parcel);
                            break;
                        case 21:
                            network = (Network) i541.s(parcel, i21, Network.CREATOR);
                            break;
                        default:
                            i541.U(i21, parcel);
                            break;
                    }
                }
                i541.A(iX22, parcel);
                return new CastDevice(strT25, strT26, strT27, strT28, strT29, iQ26, arrayListX3, iQ27, iQ25, strT30, strT31, iQ28, strT32, bArrP, strT33, zI19, kbn1Var, numR, boolJ, network);
            case 22:
                int iX23 = i541.X(parcel);
                float fM2 = 0.0f;
                jxo1[] jxo1VarArr = null;
                a7o1 a7o1Var4 = null;
                a7o1 a7o1Var5 = null;
                String strT34 = null;
                String strT35 = null;
                boolean zI20 = false;
                while (parcel.dataPosition() < iX23) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            jxo1VarArr = (jxo1[]) i541.w(parcel, i22, jxo1.CREATOR);
                            break;
                        case 3:
                            a7o1Var4 = (a7o1) i541.s(parcel, i22, a7o1.CREATOR);
                            break;
                        case 4:
                            a7o1Var5 = (a7o1) i541.s(parcel, i22, a7o1.CREATOR);
                            break;
                        case 5:
                            strT34 = i541.t(i22, parcel);
                            break;
                        case 6:
                            fM2 = i541.M(i22, parcel);
                            break;
                        case 7:
                            strT35 = i541.t(i22, parcel);
                            break;
                        case '\b':
                            zI20 = i541.I(i22, parcel);
                            break;
                        default:
                            i541.U(i22, parcel);
                            break;
                    }
                }
                i541.A(iX23, parcel);
                return new r5p1(jxo1VarArr, a7o1Var4, a7o1Var5, strT34, fM2, strT35, zI20);
            case 23:
                int iX24 = i541.X(parcel);
                while (parcel.dataPosition() < iX24) {
                    int i23 = parcel.readInt();
                    char c9 = (char) i23;
                    if (c9 == 1) {
                        zI = i541.I(i23, parcel);
                    } else if (c9 != 2) {
                        i541.U(i23, parcel);
                    } else {
                        arrayListV = i541.v(i23, parcel);
                    }
                }
                i541.A(iX24, parcel);
                return new n5p1(arrayListV, zI);
            case 24:
                int iX25 = i541.X(parcel);
                long jS2 = 0;
                ArrayList arrayListV4 = null;
                int[] iArrQ3 = null;
                String strT36 = null;
                IBinder iBinderP2 = null;
                int iQ29 = 0;
                int iQ30 = 0;
                int iQ31 = 0;
                int iQ32 = 0;
                int iQ33 = 0;
                int iQ34 = 0;
                int iQ35 = 0;
                int iQ36 = 0;
                int iQ37 = 0;
                int iQ38 = 0;
                int iQ39 = 0;
                int iQ40 = 0;
                int iQ41 = 0;
                int iQ42 = 0;
                int iQ43 = 0;
                int iQ44 = 0;
                int iQ45 = 0;
                int iQ46 = 0;
                int iQ47 = 0;
                int iQ48 = 0;
                int iQ49 = 0;
                int iQ50 = 0;
                int iQ51 = 0;
                int iQ52 = 0;
                int iQ53 = 0;
                int iQ54 = 0;
                int iQ55 = 0;
                boolean zI21 = false;
                boolean zI22 = false;
                while (parcel.dataPosition() < iX25) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            arrayListV4 = i541.v(i24, parcel);
                            break;
                        case 3:
                            iArrQ3 = i541.q(i24, parcel);
                            break;
                        case 4:
                            jS2 = i541.S(i24, parcel);
                            break;
                        case 5:
                            strT36 = i541.t(i24, parcel);
                            break;
                        case 6:
                            iQ29 = i541.Q(i24, parcel);
                            break;
                        case 7:
                            iQ30 = i541.Q(i24, parcel);
                            break;
                        case '\b':
                            iQ31 = i541.Q(i24, parcel);
                            break;
                        case '\t':
                            iQ32 = i541.Q(i24, parcel);
                            break;
                        case '\n':
                            iQ33 = i541.Q(i24, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                            iQ34 = i541.Q(i24, parcel);
                            break;
                        case grn1.d /* 12 */:
                            iQ35 = i541.Q(i24, parcel);
                            break;
                        case '\r':
                            iQ36 = i541.Q(i24, parcel);
                            break;
                        case 14:
                            iQ37 = i541.Q(i24, parcel);
                            break;
                        case 15:
                            iQ38 = i541.Q(i24, parcel);
                            break;
                        case 16:
                            iQ39 = i541.Q(i24, parcel);
                            break;
                        case 17:
                            iQ40 = i541.Q(i24, parcel);
                            break;
                        case 18:
                            iQ41 = i541.Q(i24, parcel);
                            break;
                        case 19:
                            iQ42 = i541.Q(i24, parcel);
                            break;
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                            iQ43 = i541.Q(i24, parcel);
                            break;
                        case 21:
                            iQ44 = i541.Q(i24, parcel);
                            break;
                        case 22:
                            iQ45 = i541.Q(i24, parcel);
                            break;
                        case 23:
                            iQ46 = i541.Q(i24, parcel);
                            break;
                        case 24:
                            iQ47 = i541.Q(i24, parcel);
                            break;
                        case 25:
                            iQ48 = i541.Q(i24, parcel);
                            break;
                        case 26:
                            iQ49 = i541.Q(i24, parcel);
                            break;
                        case 27:
                            iQ50 = i541.Q(i24, parcel);
                            break;
                        case 28:
                            iQ51 = i541.Q(i24, parcel);
                            break;
                        case 29:
                            iQ52 = i541.Q(i24, parcel);
                            break;
                        case 30:
                            iQ53 = i541.Q(i24, parcel);
                            break;
                        case 31:
                            iQ54 = i541.Q(i24, parcel);
                            break;
                        case ' ':
                            iQ55 = i541.Q(i24, parcel);
                            break;
                        case '!':
                            iBinderP2 = i541.P(i24, parcel);
                            break;
                        case '\"':
                            zI21 = i541.I(i24, parcel);
                            break;
                        case '#':
                            zI22 = i541.I(i24, parcel);
                            break;
                        default:
                            i541.U(i24, parcel);
                            break;
                    }
                }
                i541.A(iX25, parcel);
                return new vro0(arrayListV4, iArrQ3, jS2, strT36, iQ29, iQ30, iQ31, iQ32, iQ33, iQ34, iQ35, iQ36, iQ37, iQ38, iQ39, iQ40, iQ41, iQ42, iQ43, iQ44, iQ45, iQ46, iQ47, iQ48, iQ49, iQ50, iQ51, iQ52, iQ53, iQ54, iQ55, iBinderP2, zI21, zI22);
            case 25:
                int iX26 = i541.X(parcel);
                long jS3 = 0;
                int iQ56 = 0;
                int iQ57 = 0;
                int iQ58 = 0;
                int iQ59 = 0;
                while (parcel.dataPosition() < iX26) {
                    int i25 = parcel.readInt();
                    char c10 = (char) i25;
                    if (c10 == 1) {
                        iQ56 = i541.Q(i25, parcel);
                    } else if (c10 == 2) {
                        iQ57 = i541.Q(i25, parcel);
                    } else if (c10 == 3) {
                        iQ58 = i541.Q(i25, parcel);
                    } else if (c10 == 4) {
                        iQ59 = i541.Q(i25, parcel);
                    } else if (c10 != 5) {
                        i541.U(i25, parcel);
                    } else {
                        jS3 = i541.S(i25, parcel);
                    }
                }
                i541.A(iX26, parcel);
                return new zcp1(iQ56, iQ57, iQ58, iQ59, jS3);
            case 26:
                int iX27 = i541.X(parcel);
                boolean zI23 = false;
                while (parcel.dataPosition() < iX27) {
                    int i26 = parcel.readInt();
                    char c11 = (char) i26;
                    if (c11 == 1) {
                        iQ2 = i541.Q(i26, parcel);
                    } else if (c11 != 2) {
                        i541.U(i26, parcel);
                    } else {
                        zI23 = i541.I(i26, parcel);
                    }
                }
                i541.A(iX27, parcel);
                return new ubp1(iQ2, zI23);
            case 27:
                int iX28 = i541.X(parcel);
                String strT37 = null;
                Rect rect = null;
                ArrayList arrayListX4 = null;
                String strT38 = null;
                ArrayList arrayListX5 = null;
                while (parcel.dataPosition() < iX28) {
                    int i27 = parcel.readInt();
                    char c12 = (char) i27;
                    if (c12 == 1) {
                        strT37 = i541.t(i27, parcel);
                    } else if (c12 == 2) {
                        rect = (Rect) i541.s(parcel, i27, Rect.CREATOR);
                    } else if (c12 == 3) {
                        arrayListX4 = i541.x(parcel, i27, Point.CREATOR);
                    } else if (c12 == 4) {
                        strT38 = i541.t(i27, parcel);
                    } else if (c12 != 5) {
                        i541.U(i27, parcel);
                    } else {
                        arrayListX5 = i541.x(parcel, i27, dep1.CREATOR);
                    }
                }
                i541.A(iX28, parcel);
                return new rdp1(strT37, rect, arrayListX4, strT38, arrayListX5);
            case 28:
                int iX29 = i541.X(parcel);
                float fM3 = 0.0f;
                float fM4 = 0.0f;
                Rect rect2 = null;
                String strT39 = null;
                String strT40 = null;
                ArrayList arrayListX6 = null;
                ArrayList arrayListX7 = null;
                while (parcel.dataPosition() < iX29) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            strT39 = i541.t(i28, parcel);
                            break;
                        case 2:
                            rect2 = (Rect) i541.s(parcel, i28, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListX6 = i541.x(parcel, i28, Point.CREATOR);
                            break;
                        case 4:
                            strT40 = i541.t(i28, parcel);
                            break;
                        case 5:
                            fM3 = i541.M(i28, parcel);
                            break;
                        case 6:
                            fM4 = i541.M(i28, parcel);
                            break;
                        case 7:
                            arrayListX7 = i541.x(parcel, i28, mep1.CREATOR);
                            break;
                        default:
                            i541.U(i28, parcel);
                            break;
                    }
                }
                i541.A(iX29, parcel);
                return new bep1(fM3, fM4, rect2, strT39, strT40, arrayListX6, arrayListX7);
            default:
                int iX30 = i541.X(parcel);
                float fM5 = 0.0f;
                float fM6 = 0.0f;
                Rect rect3 = null;
                String strT41 = null;
                String strT42 = null;
                ArrayList arrayListX8 = null;
                ArrayList arrayListX9 = null;
                while (parcel.dataPosition() < iX30) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            strT41 = i541.t(i29, parcel);
                            break;
                        case 2:
                            rect3 = (Rect) i541.s(parcel, i29, Rect.CREATOR);
                            break;
                        case 3:
                            arrayListX8 = i541.x(parcel, i29, Point.CREATOR);
                            break;
                        case 4:
                            strT42 = i541.t(i29, parcel);
                            break;
                        case 5:
                            arrayListX9 = i541.x(parcel, i29, bep1.CREATOR);
                            break;
                        case 6:
                            fM5 = i541.M(i29, parcel);
                            break;
                        case 7:
                            fM6 = i541.M(i29, parcel);
                            break;
                        default:
                            i541.U(i29, parcel);
                            break;
                    }
                }
                i541.A(iX30, parcel);
                return new dep1(fM5, fM6, rect3, strT41, strT42, arrayListX8, arrayListX9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new tlo1[i];
            case 1:
                return new ylo1[i];
            case 2:
                return new dmo1[i];
            case 3:
                return new bmo1[i];
            case 4:
                return new hqo1[i];
            case 5:
                return new hpo1[i];
            case 6:
                return new cbl[i];
            case 7:
                return new dx5[i];
            case 8:
                return new rso1[i];
            case 9:
                return new uso1[i];
            case 10:
                return new vp40[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new nso1[i];
            case grn1.d /* 12 */:
                return new p3e[i];
            case 13:
                return new jxo1[i];
            case 14:
                return new ex5[i];
            case 15:
                return new kxo1[i];
            case 16:
                return new fx5[i];
            case 17:
                return new v0p1[i];
            case 18:
                return new qjo0[i];
            case 19:
                return new e1p1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new Term[i];
            case 21:
                return new CastDevice[i];
            case 22:
                return new r5p1[i];
            case 23:
                return new n5p1[i];
            case 24:
                return new vro0[i];
            case 25:
                return new zcp1[i];
            case 26:
                return new ubp1[i];
            case 27:
                return new rdp1[i];
            case 28:
                return new bep1[i];
            default:
                return new dep1[i];
        }
    }
}
