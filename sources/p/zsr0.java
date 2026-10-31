package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zsr0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zsr0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        g4a g4aVar;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new atr0(parcel.readString(), parcel.readString());
            case 1:
                int iH2 = 0;
                boolean z2 = parcel.readInt() != 0;
                tpw0 tpw0Var = (tpw0) tpw0.CREATOR.createFromParcel(parcel);
                boolean z3 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iH2 != i) {
                    iH2 = x0d.h(gtr0.class, parcel, arrayList, iH2, 1);
                }
                return new gtr0(z2, tpw0Var, z3, arrayList);
            case 2:
                return new ytr0(parcel.readString(), parcel.readInt(), parcel.readSerializable(), parcel.readParcelable(ytr0.class.getClassLoader()));
            case 3:
                return new pur0(parcel.readString(), vur0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readSerializable(), parcel.readParcelable(pur0.class.getClassLoader()));
            case 4:
                return new sur0(parcel.readString());
            case 5:
                return new svr0(parcel.readString(), (qdh1) parcel.readParcelable(svr0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 6:
                return new ewr0(parcel.readInt() != 0);
            case 7:
                parcel.readInt();
                return lwr0.a;
            case 8:
                return new dxr0(parcel.readParcelable(dxr0.class.getClassLoader()), parcel.readParcelable(dxr0.class.getClassLoader()));
            case 9:
                String string = parcel.readString();
                boolean z4 = true;
                String string2 = parcel.readString();
                g4a g4aVarValueOf = g4a.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                if (parcel.readInt() != 0) {
                    g4aVar = g4aVarValueOf;
                    z = true;
                } else {
                    z = false;
                    g4aVar = g4aVarValueOf;
                }
                return new mxr0(string, string2, g4aVar, z4, z);
            case 10:
                return iyr0.valueOf(parcel.readString());
            case 11:
                return new bzr0(parcel.readString(), parcel.readString(), g4a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 12:
                return new a2s0(parcel.readInt() != 0, parcel.readParcelable(a2s0.class.getClassLoader()), parcel.readParcelable(a2s0.class.getClassLoader()));
            case 13:
                return new i2s0(parcel.readString());
            case 14:
                return new j2s0(parcel.readString());
            case 15:
                parcel.readInt();
                return k2s0.a;
            case 16:
                return new j4s0(parcel.readString(), parcel.readString());
            case 17:
                return new v6s0(parcel.readParcelable(v6s0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 18:
                return new k6s0(parcel.readString());
            case 19:
                parcel.readInt();
                return l6s0.b;
            case 20:
                return new m6s0(parcel.readString(), parcel.readString());
            case 21:
                return new n6s0(parcel.readString());
            case 22:
                return new o6s0(parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new p6s0(parcel.readString());
            case 24:
                return new q6s0(parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new r6s0(parcel.readString());
            case 26:
                return new s6s0(parcel.readString());
            case 27:
                return new t6s0(parcel.readString());
            case 28:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = dsl0.d(p2c0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new uas0(string3, string4, string5, string6, string7, arrayList2, (v7u) (parcel.readInt() != 0 ? v7u.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0, parcel.readString());
            default:
                Parcelable.Creator creator = zbs0.CREATOR;
                String str = ((zbs0) creator.createFromParcel(parcel)).a;
                zbs0 zbs0Var = (zbs0) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
                String str2 = zbs0Var != null ? zbs0Var.a : null;
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean z5 = parcel.readInt() != 0;
                c9 c9VarF = mqo1.F(parcel.createStringArrayList());
                ee30 ee30Var = (ee30) ee30.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iH != i3) {
                    iH = x0d.h(xbs0.class, parcel, arrayList3, iH, 1);
                }
                return new xbs0(str, str2, string8, string9, string10, z5, c9VarF, ee30Var, mqo1.F(arrayList3), (imr0) (parcel.readInt() != 0 ? imr0.CREATOR.createFromParcel(parcel) : null));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new atr0[i];
            case 1:
                return new gtr0[i];
            case 2:
                return new ytr0[i];
            case 3:
                return new pur0[i];
            case 4:
                return new sur0[i];
            case 5:
                return new svr0[i];
            case 6:
                return new ewr0[i];
            case 7:
                return new lwr0[i];
            case 8:
                return new dxr0[i];
            case 9:
                return new mxr0[i];
            case 10:
                return new iyr0[i];
            case 11:
                return new bzr0[i];
            case 12:
                return new a2s0[i];
            case 13:
                return new i2s0[i];
            case 14:
                return new j2s0[i];
            case 15:
                return new k2s0[i];
            case 16:
                return new j4s0[i];
            case 17:
                return new v6s0[i];
            case 18:
                return new k6s0[i];
            case 19:
                return new l6s0[i];
            case 20:
                return new m6s0[i];
            case 21:
                return new n6s0[i];
            case 22:
                return new o6s0[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new p6s0[i];
            case 24:
                return new q6s0[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new r6s0[i];
            case 26:
                return new s6s0[i];
            case 27:
                return new t6s0[i];
            case 28:
                return new uas0[i];
            default:
                return new xbs0[i];
        }
    }
}
