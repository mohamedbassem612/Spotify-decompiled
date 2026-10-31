package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dan0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ dan0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        s4b1 s4b1VarX = null;
        switch (this.a) {
            case 0:
                return new ean0(parcel.readString());
            case 1:
                parcel.readInt();
                return gan0.a;
            case 2:
                return new dgn0(parcel.readString(), parcel.readString());
            case 3:
                return new fgn0(parcel.readString());
            case 4:
                return new ggn0(parcel.readInt() != 0);
            case 5:
                int iG = 0;
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iH = 0;
                while (iH != i2) {
                    iH = x0d.h(bin0.class, parcel, arrayList, iH, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iH2 = 0;
                while (iH2 != i3) {
                    iH2 = x0d.h(bin0.class, parcel, arrayList2, iH2, 1);
                }
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
                while (iG != i4) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new bin0(arrayList, arrayList2, linkedHashSet, parcel.readInt() != 0 ? shn0.valueOf(parcel.readString()) : null);
            case 6:
                return new gin0(parcel.readString(), parcel.readString());
            case 7:
                return new wjn0((vjn0) parcel.readParcelable(wjn0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (ub) parcel.readParcelable(wjn0.class.getClassLoader()));
            case 8:
                parcel.readInt();
                return tjn0.b;
            case 9:
                return new ujn0(parcel.readString());
            case 10:
                return new jnn0(parcel);
            case 11:
                return new arn0(parcel.readString(), parcel.readString());
            case 12:
                boolean z = false;
                hux parcelable = parcel.readParcelable(ctn0.class.getClassLoader());
                int i5 = parcel.readInt();
                lik1 parcelable2 = parcel.readParcelable(ctn0.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new ctn0(parcelable, i5, parcelable2, z, parcel.readInt() != 0);
            case 13:
                parcel.readInt();
                return nun0.a;
            case 14:
                parcel.readInt();
                return oun0.a;
            case 15:
                return new pun0((Intent) parcel.readParcelable(pun0.class.getClassLoader()));
            case 16:
                return new hyn0(parcel.readString(), parcel.readBundle(hyn0.class.getClassLoader()));
            case 17:
                nsn0 nsn0VarG = qqn1.g(parcel);
                int iV = cfm0.v(parcel.readString());
                boolean z2 = parcel.readInt() != 0;
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(prn1.m(parcel));
                }
                return new kyn0(nsn0VarG, iV, z2, arrayList3);
            case 18:
                String string = parcel.readString();
                if (string != null) {
                    Set set = s4b1.f;
                    s4b1VarX = uic.x(string);
                }
                return new izn0(s4b1VarX);
            case 19:
                parcel.readInt();
                return s0o0.a;
            case 20:
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("CAST")) {
                        i = 1;
                    } else if (string2.equals("SPEAKER")) {
                        i = 2;
                    } else if (string2.equals("GAME_CONSOLE")) {
                        i = 3;
                    } else if (string2.equals("TV")) {
                        i = 4;
                    } else if (string2.equals("AVR")) {
                        i = 5;
                    } else if (string2.equals("HOME_THING")) {
                        i = 6;
                    } else if (string2.equals("AUTOMOBILE")) {
                        i = 7;
                    } else if (string2.equals("HEADPHONES")) {
                        i = 8;
                    } else {
                        hhg1.n("No enum constant com.spotify.nearbydevicespermissions.usecase.api.NearbyDevicesPermissionAction.Trigger.DeviceConnected.Type.".concat(string2));
                    }
                    return new t0o0(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new t0o0(i);
            case 21:
                parcel.readInt();
                return u0o0.a;
            case 22:
                parcel.readInt();
                return v0o0.a;
            case 23:
                parcel.readInt();
                return w0o0.a;
            case 24:
                parcel.readInt();
                return x0o0.a;
            case 25:
                return new h2o0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 26:
                return new j2o0(h2o0.CREATOR.createFromParcel(parcel));
            case 27:
                return new q3o0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (y0o0) parcel.readParcelable(q3o0.class.getClassLoader()));
            case 28:
                return new s3o0(q3o0.CREATOR.createFromParcel(parcel));
            default:
                int i8 = parcel.readInt();
                String string3 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                int iD = 0;
                while (iD != i9) {
                    iD = dsl0.d(c4o0.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new d4o0(i8, string3, arrayList4, parcel.readInt() != 0, (y0o0) parcel.readParcelable(d4o0.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ean0[i];
            case 1:
                return new gan0[i];
            case 2:
                return new dgn0[i];
            case 3:
                return new fgn0[i];
            case 4:
                return new ggn0[i];
            case 5:
                return new bin0[i];
            case 6:
                return new gin0[i];
            case 7:
                return new wjn0[i];
            case 8:
                return new tjn0[i];
            case 9:
                return new ujn0[i];
            case 10:
                return new jnn0[i];
            case 11:
                return new arn0[i];
            case 12:
                return new ctn0[i];
            case 13:
                return new nun0[i];
            case 14:
                return new oun0[i];
            case 15:
                return new pun0[i];
            case 16:
                return new hyn0[i];
            case 17:
                return new kyn0[i];
            case 18:
                return new izn0[i];
            case 19:
                return new s0o0[i];
            case 20:
                return new t0o0[i];
            case 21:
                return new u0o0[i];
            case 22:
                return new v0o0[i];
            case 23:
                return new w0o0[i];
            case 24:
                return new x0o0[i];
            case 25:
                return new h2o0[i];
            case 26:
                return new j2o0[i];
            case 27:
                return new q3o0[i];
            case 28:
                return new s3o0[i];
            default:
                return new d4o0[i];
        }
    }
}
