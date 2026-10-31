package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bis0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList<String> arrayList;
        switch (this.a) {
            case 0:
                return new cis0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new kis0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 2:
                int iD = 0;
                dis0 dis0Var = (dis0) parcel.readParcelable(lis0.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(kis0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new lis0(dis0Var, arrayList2, parcel.readString());
            case 3:
                return new nks0(parcel.readInt());
            case 4:
                return new oks0(parcel.readLong());
            case 5:
                int i2 = 1;
                String string = parcel.readString();
                if (string != null) {
                    if (!string.equals("Unspecified")) {
                        if (string.equals("OnPlatform")) {
                            i2 = 2;
                        } else if (string.equals("OffPlatform")) {
                            i2 = 3;
                        } else if (string.equals("InviteLink")) {
                            i2 = 4;
                        } else if (string.equals("FriendRequest")) {
                            i2 = 5;
                        } else {
                            hhg1.n("No enum constant com.spotify.campfire.models.Permission.Source.".concat(string));
                        }
                    }
                    return new zks0(i2, xks0.valueOf(parcel.readString()), parcel.readString(), yks0.valueOf(parcel.readString()));
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new zks0(i2, xks0.valueOf(parcel.readString()), parcel.readString(), yks0.valueOf(parcel.readString()));
            case 6:
                return new fls0(parcel.readString());
            case 7:
                boolean z4 = true;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new gls0(z5, z4, fls0.CREATOR.createFromParcel(parcel));
            case 8:
                return new zms0(parcel.readString(), cns0.valueOf(parcel.readString()));
            case 9:
                return new bns0(zms0.CREATOR.createFromParcel(parcel));
            case 10:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                dns0 dns0Var = new dns0();
                dns0Var.a = string2;
                dns0Var.b = string3;
                dns0Var.c = string4;
                return dns0Var;
            case 11:
                String string5 = parcel.readString();
                int i3 = parcel.readInt();
                xl81 parcelable = parcel.readParcelable(gxs0.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    arrayList = arrayListCreateStringArrayList;
                    z3 = true;
                } else {
                    z3 = z;
                    arrayList = arrayListCreateStringArrayList;
                }
                return new gxs0(string5, i3, parcelable, z2, z, arrayList, z3);
            case 12:
                return new hxs0(parcel.readString());
            case 13:
                parcel.readInt();
                return ixs0.a;
            case 14:
                return new pxs0(parcel.readString());
            case 15:
                return new qxs0(parcel.readParcelable(qxs0.class.getClassLoader()));
            case 16:
                return new rxs0(parcel.readString(), parcel.readLong());
            case 17:
                return new txs0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new b1t0((n1t0) parcel.readParcelable(b1t0.class.getClassLoader()));
            case 19:
                return new f1t0(parcel.readString(), parcel.readString());
            case 20:
                parcel.readInt();
                return g1t0.a;
            case 21:
                parcel.readInt();
                return h1t0.a;
            case 22:
                return new i1t0(parcel.readInt());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return j1t0.a;
            case 24:
                parcel.readInt();
                return l1t0.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return m1t0.a;
            case 26:
                return new q3t0(parcel.readString(), parcel.readString(), parcel.readLong());
            case 27:
                return new a5t0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                return new t5t0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            default:
                return new v5t0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cis0[i];
            case 1:
                return new kis0[i];
            case 2:
                return new lis0[i];
            case 3:
                return new nks0[i];
            case 4:
                return new oks0[i];
            case 5:
                return new zks0[i];
            case 6:
                return new fls0[i];
            case 7:
                return new gls0[i];
            case 8:
                return new zms0[i];
            case 9:
                return new bns0[i];
            case 10:
                return new dns0[i];
            case 11:
                return new gxs0[i];
            case 12:
                return new hxs0[i];
            case 13:
                return new ixs0[i];
            case 14:
                return new pxs0[i];
            case 15:
                return new qxs0[i];
            case 16:
                return new rxs0[i];
            case 17:
                return new txs0[i];
            case 18:
                return new b1t0[i];
            case 19:
                return new f1t0[i];
            case 20:
                return new g1t0[i];
            case 21:
                return new h1t0[i];
            case 22:
                return new i1t0[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new j1t0[i];
            case 24:
                return new l1t0[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new m1t0[i];
            case 26:
                return new q3t0[i];
            case 27:
                return new a5t0[i];
            case 28:
                return new t5t0[i];
            default:
                return new v5t0[i];
        }
    }
}
