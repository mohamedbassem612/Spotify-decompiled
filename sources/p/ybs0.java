package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ybs0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ybs0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 1;
        switch (this.a) {
            case 0:
                return new zbs0(parcel.readString());
            case 1:
                return new acs0(parcel.readString());
            case 2:
                String str = ucs0.CREATOR.createFromParcel(parcel).a;
                String string = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iH = 0;
                while (iH != i2) {
                    iH = x0d.h(bcs0.class, parcel, arrayList, iH, 1);
                }
                c9 c9VarF = mqo1.F(arrayList);
                ei31 ei31Var = (ei31) parcel.readParcelable(bcs0.class.getClassLoader());
                return new bcs0(str, string, c9VarF, ei31Var != null ? ei31Var.a : null, parcel.readParcelable(bcs0.class.getClassLoader()), parcel.readString());
            case 3:
                tcs0 tcs0VarCreateFromParcel = tcs0.CREATOR.createFromParcel(parcel);
                zbs0 zbs0VarCreateFromParcel = parcel.readInt() == 0 ? null : zbs0.CREATOR.createFromParcel(parcel);
                String str2 = zbs0VarCreateFromParcel != null ? zbs0VarCreateFromParcel.a : null;
                ee30 ee30VarCreateFromParcel = parcel.readInt() == 0 ? null : ee30.CREATOR.createFromParcel(parcel);
                tqw0 tqw0Var = (tqw0) parcel.readParcelable(ccs0.class.getClassLoader());
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                i3g1 i3g1VarCreateFromParcel = i3g1.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iH2 = 0;
                while (iH2 != i3) {
                    iH2 = x0d.h(ccs0.class, parcel, arrayList2, iH2, 1);
                }
                c9 c9VarF2 = mqo1.F(arrayList2);
                v7u parcelable = parcel.readParcelable(ccs0.class.getClassLoader());
                ei31 ei31Var2 = (ei31) parcel.readParcelable(ccs0.class.getClassLoader());
                String str3 = ei31Var2 != null ? ei31Var2.a : null;
                t2c0 t2c0VarCreateFromParcel = t2c0.CREATOR.createFromParcel(parcel);
                v4t v4tVarCreateFromParcel = parcel.readInt() == 0 ? null : v4t.CREATOR.createFromParcel(parcel);
                String str4 = v4tVarCreateFromParcel != null ? v4tVarCreateFromParcel.a : null;
                bp21 bp21VarCreateFromParcel = parcel.readInt() == 0 ? null : bp21.CREATOR.createFromParcel(parcel);
                return new ccs0(tcs0VarCreateFromParcel, str2, ee30VarCreateFromParcel, tqw0Var, string2, numValueOf, z, z2, z3, z4, i3g1VarCreateFromParcel, c9VarF2, parcelable, str3, t2c0VarCreateFromParcel, str4, bp21VarCreateFromParcel != null ? bp21VarCreateFromParcel.a : null, parcel.readInt() == 0 ? null : hes0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : imr0.CREATOR.createFromParcel(parcel));
            case 4:
                int iH3 = 0;
                String str5 = ucs0.CREATOR.createFromParcel(parcel).a;
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iH3 != i4) {
                    iH3 = x0d.h(dcs0.class, parcel, arrayList3, iH3, 1);
                }
                c9 c9VarF3 = mqo1.F(arrayList3);
                ei31 ei31Var3 = (ei31) parcel.readParcelable(dcs0.class.getClassLoader());
                return new dcs0(str5, string3, c9VarF3, ei31Var3 != null ? ei31Var3.a : null, parcel.readParcelable(dcs0.class.getClassLoader()), parcel.readString());
            case 5:
                int iD = 0;
                String str6 = ucs0.CREATOR.createFromParcel(parcel).a;
                String string4 = parcel.readString();
                ycs0 ycs0VarCreateFromParcel = ycs0.CREATOR.createFromParcel(parcel);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(xbs0.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new tcs0(str6, string4, ycs0VarCreateFromParcel, string5, string6, mqo1.F(arrayList4));
            case 6:
                return new ucs0(parcel.readString());
            case 7:
                return new vcs0(parcel.readString());
            case 8:
                return new ycs0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                return new zcs0(parcel);
            case 10:
                return new sds0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new ges0(parcel.readString());
            case 12:
                kes0 kes0VarCreateFromParcel = parcel.readInt() == 0 ? null : kes0.CREATOR.createFromParcel(parcel);
                boolean z5 = parcel.readInt() != 0;
                jes0 jes0VarCreateFromParcel = parcel.readInt() == 0 ? null : jes0.CREATOR.createFromParcel(parcel);
                String str7 = jes0VarCreateFromParcel != null ? jes0VarCreateFromParcel.a : null;
                ges0 ges0VarCreateFromParcel = parcel.readInt() == 0 ? null : ges0.CREATOR.createFromParcel(parcel);
                return new hes0(kes0VarCreateFromParcel, z5, str7, ges0VarCreateFromParcel != null ? ges0VarCreateFromParcel.a : null);
            case 13:
                return new jes0(parcel.readString());
            case 14:
                return new kes0(parcel.readString(), parcel.readString());
            case 15:
                return new les0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new dfs0(parcel.readString(), parcel.readString(), parcel.readLong());
            case 17:
                return new efs0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 18:
                int iD2 = 0;
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iD2 != i6) {
                    iD2 = dsl0.d(dfs0.CREATOR, parcel, arrayList5, iD2, 1);
                }
                return new gfs0(arrayList5);
            case 19:
                int iD3 = 0;
                String string7 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                while (iD3 != i7) {
                    iD3 = dsl0.d(efs0.CREATOR, parcel, arrayList6, iD3, 1);
                }
                return new hfs0(string7, arrayList6);
            case 20:
                return new nfs0(parcel.readString(), parcel.readString());
            case 21:
                return new ofs0(parcel.readString());
            case 22:
                return new ehs0(parcel.readLong(), parcel.readString());
            case 23:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i8);
                int iD4 = 0;
                while (iD4 != i8) {
                    iD4 = dsl0.d(hhs0.CREATOR, parcel, arrayList7, iD4, 1);
                }
                return new ihs0(string8, string9, mqo1.F(arrayList7), parcel.readInt() == 0 ? null : ghs0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ehs0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : fhs0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            case 24:
                int iH4 = 0;
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i9);
                while (iH4 != i9) {
                    iH4 = x0d.h(fhs0.class, parcel, arrayList8, iH4, 1);
                }
                return new fhs0(string10, string11, mqo1.F(arrayList8), parcel.readString(), parcel.readString(), mqo1.F(parcel.createStringArrayList()));
            case 25:
                return new ghs0(parcel.readString(), parcel.readString());
            case 26:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (string14 != null) {
                    if (!string14.equals("CHECK_ALT")) {
                        if (string14.equals("UNDO")) {
                            i = 2;
                        } else if (string14.equals("EXTERNAL_LINK")) {
                            i = 3;
                        } else if (string14.equals("CAMERA")) {
                            i = 4;
                        } else if (string14.equals("MESSAGES")) {
                            i = 5;
                        } else {
                            hhg1.n("No enum constant com.spotify.payment.paymentimpl.data.ResponseAction.DisplayPending.EncoreIcon.".concat(string14));
                        }
                    }
                    return new hhs0(i, string12, string13);
                }
                bhn0.i("Name is null");
                i = 0;
                return new hhs0(i, string12, string13);
            case 27:
                return new qhs0(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            case 28:
                parcel.readInt();
                return ths0.a;
            default:
                return new ais0(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zbs0[i];
            case 1:
                return new acs0[i];
            case 2:
                return new bcs0[i];
            case 3:
                return new ccs0[i];
            case 4:
                return new dcs0[i];
            case 5:
                return new tcs0[i];
            case 6:
                return new ucs0[i];
            case 7:
                return new vcs0[i];
            case 8:
                return new ycs0[i];
            case 9:
                return new zcs0[i];
            case 10:
                return new sds0[i];
            case 11:
                return new ges0[i];
            case 12:
                return new hes0[i];
            case 13:
                return new jes0[i];
            case 14:
                return new kes0[i];
            case 15:
                return new les0[i];
            case 16:
                return new dfs0[i];
            case 17:
                return new efs0[i];
            case 18:
                return new gfs0[i];
            case 19:
                return new hfs0[i];
            case 20:
                return new nfs0[i];
            case 21:
                return new ofs0[i];
            case 22:
                return new ehs0[i];
            case 23:
                return new ihs0[i];
            case 24:
                return new fhs0[i];
            case 25:
                return new ghs0[i];
            case 26:
                return new hhs0[i];
            case 27:
                return new qhs0[i];
            case 28:
                return new ths0[i];
            default:
                return new ais0[i];
        }
    }
}
