package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ro71 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ro71(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        int iG = 0;
        switch (this.a) {
            case 0:
                return new so71(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 1:
                boolean z4 = false;
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new gy71(string, z4);
            case 2:
                parcel.readInt();
                return r181.a;
            case 3:
                return new h281(parcel.readString(), parcel.readString(), parcel.readParcelable(h281.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 4:
                return new j381(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 5:
                return new y481(parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt());
            case 6:
                return new x681(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 7:
                return new y681(parcel.readString());
            case 8:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iD = 0;
                while (iD != i) {
                    iD = dsl0.d(gp51.CREATOR, parcel, arrayList, iD, 1);
                }
                return new fa81(string2, string3, arrayList, string4, string5, parcel.readInt() != 0);
            case 9:
                parcel.readInt();
                return yf81.a;
            case 10:
                parcel.readInt();
                return zf81.a;
            case 11:
                String string6 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iH = 0;
                while (iH != i2) {
                    iH = x0d.h(ag81.class, parcel, arrayList2, iH, 1);
                }
                return new ag81(string6, arrayList2, parcel.readInt() != 0);
            case 12:
                parcel.readInt();
                return bg81.a;
            case 13:
                int i3 = 1;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (!string8.equals("Ready")) {
                        if (string8.equals("Pending")) {
                            i3 = 2;
                        } else if (string8.equals("Unknown")) {
                            i3 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.listplatform.models.Signal.State.".concat(string8));
                        }
                    }
                    return new ll81(i3, string7, parcel.createByteArray());
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new ll81(i3, string7, parcel.createByteArray());
            case 14:
                parcel.readInt();
                return un81.a;
            case 15:
                return new vn81(parcel.readString(), parcel.readString());
            case 16:
                return new wn81(parcel.readString());
            case 17:
                return new co81(parcel.readString(), (bo81) parcel.readParcelable(co81.class.getClassLoader()));
            case 18:
                return new xn81(parcel.readString(), parcel.readString());
            case 19:
                return new yn81(parcel.readString(), parcel.readString());
            case 20:
                parcel.readInt();
                return zn81.a;
            case 21:
                return new ao81(parcel.readString());
            case 22:
                boolean z5 = true;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new fo81(z6, z7, z8, z9, z10, z11, z12, z5, parcel.readInt(), parcel.readInt() != 0, TermsConditionAcceptance.valueOf(parcel.readString()), PrivacyPolicyAcceptance.valueOf(parcel.readString()), MarketingMessagesOption.valueOf(parcel.readString()), parcel.readInt() != 0 ? z5 : false, parcel.readInt() != 0 ? z5 : false, parcel.readString());
            case 23:
                pq81 pq81Var = (pq81) parcel.readParcelable(qq81.class.getClassLoader());
                nxw nxwVarCreateFromParcel = nxw.CREATOR.createFromParcel(parcel);
                v6s0 v6s0VarCreateFromParcel = v6s0.CREATOR.createFromParcel(parcel);
                th2 th2VarCreateFromParcel = th2.CREATOR.createFromParcel(parcel);
                id40 id40VarCreateFromParcel = id40.CREATOR.createFromParcel(parcel);
                wjn0 wjn0VarCreateFromParcel = wjn0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = true;
                    z2 = false;
                    z3 = true;
                } else {
                    z = true;
                    z2 = false;
                    z3 = false;
                }
                String string9 = parcel.readString();
                bk8 bk8VarValueOf = bk8.valueOf(parcel.readString());
                boolean z13 = z2;
                int i4 = parcel.readInt();
                epv0 parcelable = parcel.readParcelable(qq81.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z13 = z;
                }
                return new qq81(pq81Var, nxwVarCreateFromParcel, v6s0VarCreateFromParcel, th2VarCreateFromParcel, id40VarCreateFromParcel, wjn0VarCreateFromParcel, z3, string9, bk8VarValueOf, i4, parcelable, z13, parcel.readString(), parcel.readString());
            case 24:
                return new nq81((fo81) parcel.readParcelable(nq81.class.getClassLoader()));
            case 25:
                return new oq81((fo81) parcel.readParcelable(oq81.class.getClassLoader()));
            case 26:
                el51 el51Var = (el51) el51.CREATOR.createFromParcel(parcel);
                ivd ivdVar = (ivd) ivd.CREATOR.createFromParcel(parcel);
                long j = parcel.readLong();
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                while (iG != i5) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new hv81(el51Var, ivdVar, j, linkedHashSet);
            case 27:
                return new iw81(parcel.readString(), (Intent) parcel.readParcelable(iw81.class.getClassLoader()));
            case 28:
                parcel.readInt();
                return vx81.a;
            default:
                parcel.readInt();
                return wx81.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new so71[i];
            case 1:
                return new gy71[i];
            case 2:
                return new r181[i];
            case 3:
                return new h281[i];
            case 4:
                return new j381[i];
            case 5:
                return new y481[i];
            case 6:
                return new x681[i];
            case 7:
                return new y681[i];
            case 8:
                return new fa81[i];
            case 9:
                return new yf81[i];
            case 10:
                return new zf81[i];
            case 11:
                return new ag81[i];
            case 12:
                return new bg81[i];
            case 13:
                return new ll81[i];
            case 14:
                return new un81[i];
            case 15:
                return new vn81[i];
            case 16:
                return new wn81[i];
            case 17:
                return new co81[i];
            case 18:
                return new xn81[i];
            case 19:
                return new yn81[i];
            case 20:
                return new zn81[i];
            case 21:
                return new ao81[i];
            case 22:
                return new fo81[i];
            case 23:
                return new qq81[i];
            case 24:
                return new nq81[i];
            case 25:
                return new oq81[i];
            case 26:
                return new hv81[i];
            case 27:
                return new iw81[i];
            case 28:
                return new vx81[i];
            default:
                return new wx81[i];
        }
    }
}
