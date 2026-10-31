package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n750 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                return new o750(parcel.readSerializable(), parcel.readParcelable(o750.class.getClassLoader()), v850.valueOf(parcel.readString()), parcel.readParcelable(o750.class.getClassLoader()));
            case 1:
                return new p750(v850.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                return new a850(v850.valueOf(parcel.readString()));
            case 3:
                parcel.readInt();
                return b850.a;
            case 4:
                return new c850(parcel.readInt());
            case 5:
                boolean z = true;
                v850 v850VarValueOf = v850.valueOf(parcel.readString());
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new p850(v850VarValueOf, numValueOf, z, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? z : false, (b8w) parcel.readParcelable(p850.class.getClassLoader()));
            case 6:
                return new u850(parcel.readInt() != 0, v850.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 7:
                parcel.readInt();
                return l950.a;
            case 8:
                parcel.readInt();
                return m950.a;
            case 9:
                parcel.readInt();
                return n950.a;
            case 10:
                parcel.readInt();
                return o950.a;
            case 11:
                return new s950(v850.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 12:
                return new w950(v850.valueOf(parcel.readString()));
            case 13:
                parcel.readInt();
                return new eb50();
            case 14:
                boolean z2 = true;
                p950 p950Var = (p950) parcel.readParcelable(qb50.class.getClassLoader());
                String string = parcel.readString();
                v850 v850VarValueOf2 = v850.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new qb50(p950Var, string, v850VarValueOf2, z3, z2, parcel.readInt() != 0);
            case 15:
                return new ub50(v850.valueOf(parcel.readString()));
            case 16:
                return new jc50(parcel.readString(), parcel.readString(), parcel.readString(), (hct0) parcel.readParcelable(jc50.class.getClassLoader()), parcel.readInt(), parcel.readInt(), v850.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 17:
                return new nc50(parcel.readString(), v850.valueOf(parcel.readString()));
            case 18:
                return new oc50(parcel.readInt() != 0);
            case 19:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(wls0.valueOf(parcel.readString()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(wls0.valueOf(parcel.readString()));
                }
                return new rc50(arrayList, arrayList2);
            case 20:
                return new kd50(parcel);
            case 21:
                return new hg50(parcel.readInt(), parcel.readInt());
            case 22:
                return new dh50(parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new nh50(parcel.readString());
            case 24:
                return new qi50(parcel.readParcelable(qi50.class.getClassLoader()), parcel.readString(), parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new sj50(parcel.readString(), parcel.readString(), parcel.readParcelable(sj50.class.getClassLoader()), parcel.readString());
            case 26:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                return new xj50(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, string2, string3, string4, parcel.readString(), z4);
            case 27:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(xj50.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new yj50(mqo1.F(arrayList3));
            case 28:
                parcel.readInt();
                return zj50.a;
            default:
                return new fk50(parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new o750[i];
            case 1:
                return new p750[i];
            case 2:
                return new a850[i];
            case 3:
                return new b850[i];
            case 4:
                return new c850[i];
            case 5:
                return new p850[i];
            case 6:
                return new u850[i];
            case 7:
                return new l950[i];
            case 8:
                return new m950[i];
            case 9:
                return new n950[i];
            case 10:
                return new o950[i];
            case 11:
                return new s950[i];
            case 12:
                return new w950[i];
            case 13:
                return new eb50[i];
            case 14:
                return new qb50[i];
            case 15:
                return new ub50[i];
            case 16:
                return new jc50[i];
            case 17:
                return new nc50[i];
            case 18:
                return new oc50[i];
            case 19:
                return new rc50[i];
            case 20:
                return new kd50[i];
            case 21:
                return new hg50[i];
            case 22:
                return new dh50[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new nh50[i];
            case 24:
                return new qi50[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new sj50[i];
            case 26:
                return new xj50[i];
            case 27:
                return new yj50[i];
            case 28:
                return new zj50[i];
            default:
                return new fk50[i];
        }
    }
}
