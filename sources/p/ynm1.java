package p;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ynm1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ynm1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 4;
        ArrayList arrayListX = null;
        ArrayList arrayListX2 = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayListX3 = null;
        Bundle bundleO = null;
        boolean zI = false;
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        boolean zI2 = false;
        int iQ4 = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return znm1.a;
            case 1:
                return new asm1(parcel.readString());
            case 2:
                return new bsm1(parcel.createStringArrayList(), parcel.readString());
            case 3:
                return new csm1(parcel.readString());
            case 4:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(zha1.valueOf(parcel.readString()));
                }
                return new dsm1(arrayList, parcel.readInt() != 0 ? zha1.valueOf(parcel.readString()) : null);
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string3 = parcel.readString();
                aey aeyVarValueOf = aey.valueOf(parcel.readString());
                String string4 = parcel.readString();
                nb10 nb10Var = (nb10) parcel.readParcelable(ttm1.class.getClassLoader());
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("Empty")) {
                        i = 1;
                    } else if (string5.equals("Waiting")) {
                        i = 2;
                    } else {
                        if (!string5.equals("Downloading")) {
                            if (!string5.equals("Downloaded")) {
                                if (string5.equals("Error")) {
                                    i = 5;
                                } else {
                                    hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.DownloadState.".concat(string5));
                                }
                            }
                            return new ttm1(string, string2, z, string3, aeyVarValueOf, string4, nb10Var, i);
                        }
                        i = 3;
                    }
                    return new ttm1(string, string2, z, string3, aeyVarValueOf, string4, nb10Var, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new ttm1(string, string2, z, string3, aeyVarValueOf, string4, nb10Var, i);
            case 6:
                return new dum1((esm1) parcel.readParcelable(dum1.class.getClassLoader()));
            case 7:
                return new hum1((esm1) parcel.readParcelable(hum1.class.getClassLoader()));
            case 8:
                return new rvm1(parcel.readString(), blc0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 9:
                return new lwm1(parcel.readString(), parcel.readString());
            case 10:
                return new kxm1(parcel.readInt(), parcel.readInt() != 0);
            case 11:
                return new nxm1(parcel.readInt(), parcel.readInt() != 0);
            case 12:
                parcel.readInt();
                return pxm1.a;
            case 13:
                return new qxm1(parcel.readString(), parcel.readString());
            case 14:
                return new szm1(parcel.readString(), parcel.readInt() != 0);
            case 15:
                String string6 = parcel.readString();
                r2n1 r2n1Var = (r2n1) parcel.readValue(g2n1.class.getClassLoader());
                dce0 parcelable = parcel.readParcelable(g2n1.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iD = 0;
                while (iD != i4) {
                    iD = dsl0.d(wro0.CREATOR, parcel, arrayList2, iD, 1);
                }
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                int iD2 = 0;
                boolean z4 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iD2 != i5) {
                    iD2 = dsl0.d(q9t.CREATOR, parcel, arrayList3, iD2, 1);
                }
                return new g2n1(string6, r2n1Var, parcelable, arrayList2, z2, z3, z4, arrayList3);
            case 16:
                return new i2n1(parcel.readInt(), (kjo0) parcel.readParcelable(i2n1.class.getClassLoader()));
            case 17:
                parcel.readInt();
                return new r2n1();
            case 18:
                return new s2n1(parcel.readInt() != 0, parcel.readString());
            case 19:
                int iX = i541.X(parcel);
                int iQ5 = 0;
                while (parcel.dataPosition() < iX) {
                    int i6 = parcel.readInt();
                    char c = (char) i6;
                    if (c == 1) {
                        iQ4 = i541.Q(i6, parcel);
                    } else if (c == 2) {
                        iQ5 = i541.Q(i6, parcel);
                    } else if (c != 3) {
                        i541.U(i6, parcel);
                    } else {
                        bundleO = i541.o(i6, parcel);
                    }
                }
                i541.A(iX, parcel);
                return new r450(iQ4, iQ5, bundleO);
            case 20:
                int iX2 = i541.X(parcel);
                int iQ6 = 0;
                while (parcel.dataPosition() < iX2) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        zI2 = i541.I(i7, parcel);
                    } else if (c2 != 2) {
                        i541.U(i7, parcel);
                    } else {
                        iQ6 = i541.Q(i7, parcel);
                    }
                }
                i541.A(iX2, parcel);
                return new vim0(iQ6, zI2);
            case 21:
                int iX3 = i541.X(parcel);
                while (parcel.dataPosition() < iX3) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iQ3 = i541.Q(i8, parcel);
                    } else if (c3 != 2) {
                        i541.U(i8, parcel);
                    } else {
                        arrayListX3 = i541.x(parcel, i8, uoj0.CREATOR);
                    }
                }
                i541.A(iX3, parcel);
                return new dxd1(iQ3, arrayListX3);
            case 22:
                int iX4 = i541.X(parcel);
                while (parcel.dataPosition() < iX4) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        i541.U(i9, parcel);
                    } else {
                        pendingIntent = (PendingIntent) i541.s(parcel, i9, PendingIntent.CREATOR);
                    }
                }
                i541.A(iX4, parcel);
                return new bjm0(pendingIntent);
            case 23:
                int iX5 = i541.X(parcel);
                int iQ7 = 0;
                while (parcel.dataPosition() < iX5) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iQ2 = i541.Q(i10, parcel);
                    } else if (c4 == 2) {
                        iQ7 = i541.Q(i10, parcel);
                    } else if (c4 != 3) {
                        i541.U(i10, parcel);
                    } else {
                        intent = (Intent) i541.s(parcel, i10, Intent.CREATOR);
                    }
                }
                i541.A(iX5, parcel);
                return new b8n1(iQ2, iQ7, intent);
            case 24:
                int iX6 = i541.X(parcel);
                long jS = 0;
                String strT = null;
                String strT2 = null;
                String strT3 = null;
                String strT4 = null;
                Uri uri = null;
                String strT5 = null;
                String strT6 = null;
                ArrayList arrayListX4 = null;
                String strT7 = null;
                String strT8 = null;
                while (parcel.dataPosition() < iX6) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strT = i541.t(i11, parcel);
                            break;
                        case 3:
                            strT2 = i541.t(i11, parcel);
                            break;
                        case 4:
                            strT3 = i541.t(i11, parcel);
                            break;
                        case 5:
                            strT4 = i541.t(i11, parcel);
                            break;
                        case 6:
                            uri = (Uri) i541.s(parcel, i11, Uri.CREATOR);
                            break;
                        case 7:
                            strT5 = i541.t(i11, parcel);
                            break;
                        case '\b':
                            jS = i541.S(i11, parcel);
                            break;
                        case '\t':
                            strT6 = i541.t(i11, parcel);
                            break;
                        case '\n':
                            arrayListX4 = i541.x(parcel, i11, Scope.CREATOR);
                            break;
                        case 11:
                            strT7 = i541.t(i11, parcel);
                            break;
                        case '\f':
                            strT8 = i541.t(i11, parcel);
                            break;
                        default:
                            i541.U(i11, parcel);
                            break;
                    }
                }
                i541.A(iX6, parcel);
                return new GoogleSignInAccount(strT, strT2, strT3, strT4, uri, strT5, jS, strT6, arrayListX4, strT7, strT8);
            case 25:
                int iX7 = i541.X(parcel);
                long jS2 = 0;
                String strT9 = null;
                int iQ8 = 0;
                int iQ9 = 0;
                boolean zI3 = false;
                while (parcel.dataPosition() < iX7) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        iQ8 = i541.Q(i12, parcel);
                    } else if (c5 == 2) {
                        strT9 = i541.t(i12, parcel);
                    } else if (c5 == 3) {
                        jS2 = i541.S(i12, parcel);
                    } else if (c5 == 4) {
                        iQ9 = i541.Q(i12, parcel);
                    } else if (c5 != 5) {
                        i541.U(i12, parcel);
                    } else {
                        zI3 = i541.I(i12, parcel);
                    }
                }
                i541.A(iX7, parcel);
                return new e8n1(iQ8, strT9, jS2, iQ9, zI3);
            case 26:
                int iX8 = i541.X(parcel);
                boolean zI4 = false;
                while (parcel.dataPosition() < iX8) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        iQ = i541.Q(i13, parcel);
                    } else if (c6 != 2) {
                        i541.U(i13, parcel);
                    } else {
                        zI4 = i541.I(i13, parcel);
                    }
                }
                i541.A(iX8, parcel);
                return new cjm0(iQ, zI4);
            case 27:
                int iX9 = i541.X(parcel);
                String strT10 = null;
                String strT11 = null;
                while (parcel.dataPosition() < iX9) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        arrayListX2 = i541.x(parcel, i14, pl10.CREATOR);
                    } else if (c7 == 2) {
                        zI = i541.I(i14, parcel);
                    } else if (c7 == 3) {
                        strT10 = i541.t(i14, parcel);
                    } else if (c7 != 4) {
                        i541.U(i14, parcel);
                    } else {
                        strT11 = i541.t(i14, parcel);
                    }
                }
                i541.A(iX9, parcel);
                return new fi5(strT10, strT11, arrayListX2, zI);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                int iX10 = i541.X(parcel);
                String[] strArrU = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleO2 = null;
                int iQ10 = 0;
                int iQ11 = 0;
                while (parcel.dataPosition() < iX10) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        strArrU = i541.u(i15, parcel);
                    } else if (c8 == 2) {
                        cursorWindowArr = (CursorWindow[]) i541.w(parcel, i15, CursorWindow.CREATOR);
                    } else if (c8 == 3) {
                        iQ11 = i541.Q(i15, parcel);
                    } else if (c8 == 4) {
                        bundleO2 = i541.o(i15, parcel);
                    } else if (c8 != 1000) {
                        i541.U(i15, parcel);
                    } else {
                        iQ10 = i541.Q(i15, parcel);
                    }
                }
                i541.A(iX10, parcel);
                DataHolder dataHolder = new DataHolder(iQ10, strArrU, cursorWindowArr, iQ11, bundleO2);
                dataHolder.F();
                return dataHolder;
            default:
                int iX11 = i541.X(parcel);
                ArrayList arrayListX5 = null;
                Account account = null;
                String strT12 = null;
                String strT13 = null;
                String strT14 = null;
                int iQ12 = 0;
                boolean zI5 = false;
                boolean zI6 = false;
                boolean zI7 = false;
                while (parcel.dataPosition() < iX11) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iQ12 = i541.Q(i16, parcel);
                            break;
                        case 2:
                            arrayListX5 = i541.x(parcel, i16, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) i541.s(parcel, i16, Account.CREATOR);
                            break;
                        case 4:
                            zI5 = i541.I(i16, parcel);
                            break;
                        case 5:
                            zI6 = i541.I(i16, parcel);
                            break;
                        case 6:
                            zI7 = i541.I(i16, parcel);
                            break;
                        case 7:
                            strT12 = i541.t(i16, parcel);
                            break;
                        case '\b':
                            strT13 = i541.t(i16, parcel);
                            break;
                        case '\t':
                            arrayListX = i541.x(parcel, i16, r450.CREATOR);
                            break;
                        case '\n':
                            strT14 = i541.t(i16, parcel);
                            break;
                        default:
                            i541.U(i16, parcel);
                            break;
                    }
                }
                i541.A(iX11, parcel);
                return new GoogleSignInOptions(iQ12, arrayListX5, account, zI5, zI6, zI7, strT12, strT13, GoogleSignInOptions.F(arrayListX), strT14);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new znm1[i];
            case 1:
                return new asm1[i];
            case 2:
                return new bsm1[i];
            case 3:
                return new csm1[i];
            case 4:
                return new dsm1[i];
            case 5:
                return new ttm1[i];
            case 6:
                return new dum1[i];
            case 7:
                return new hum1[i];
            case 8:
                return new rvm1[i];
            case 9:
                return new lwm1[i];
            case 10:
                return new kxm1[i];
            case 11:
                return new nxm1[i];
            case 12:
                return new pxm1[i];
            case 13:
                return new qxm1[i];
            case 14:
                return new szm1[i];
            case 15:
                return new g2n1[i];
            case 16:
                return new i2n1[i];
            case 17:
                return new r2n1[i];
            case 18:
                return new s2n1[i];
            case 19:
                return new r450[i];
            case 20:
                return new vim0[i];
            case 21:
                return new dxd1[i];
            case 22:
                return new bjm0[i];
            case 23:
                return new b8n1[i];
            case 24:
                return new GoogleSignInAccount[i];
            case 25:
                return new e8n1[i];
            case 26:
                return new cjm0[i];
            case 27:
                return new fi5[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new DataHolder[i];
            default:
                return new GoogleSignInOptions[i];
        }
    }
}
