package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hbn1 implements Parcelable.Creator {
    public static final hbn1 b = new hbn1(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ hbn1(byte b2) {
        this.a = b2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    return npn1.a(parcel);
                }
                parcel.setDataPosition(iDataPosition - 4);
                return hi5.d;
            case 1:
                return new hm(parcel.readString(), x0d.d(parcel.readString()), parcel.readString(), (xl) xl.CREATOR.createFromParcel(parcel), parcel.readParcelable(hm.class.getClassLoader()));
            case 2:
                return new w01(parcel.readString(), parcel.readString(), bk8.valueOf(parcel.readString()));
            case 3:
                return new ee5(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            case 4:
                parcel.readInt();
                return il8.a;
            case 5:
                return new l0b(parcel.readString(), parcel.readString());
            case 6:
                int iF = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                o711 o711VarCreateFromParcel = parcel.readInt() == 0 ? null : o711.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    while (iF != i) {
                        iF = cfm0.f(parcel, linkedHashMap2, parcel.readString(), iF, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new vld(string, string2, string3, o711VarCreateFromParcel, linkedHashMap);
            case 7:
                return new l0e(parcel.readInt());
            case 8:
                return new che(parcel.readLong(), parcel.readString());
            case 9:
                return new p5k(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return m9m.valueOf(parcel.readString());
            case 11:
                return new ben(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new dqn(parcel.readInt() != 0, parcel.readParcelable(dqn.class.getClassLoader()));
            case 13:
                return new k5s(parcel.readInt());
            case 14:
                return new ept(parcel.readString(), bpt.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt());
            case 15:
                parcel.readInt();
                return iax.a;
            case 16:
                parcel.readInt();
                return smx.c;
            case 17:
                parcel.readInt();
                return fox.c;
            case 18:
                parcel.readInt();
                return hrx.c;
            case 19:
                parcel.readInt();
                return fux.c;
            case 20:
                return new vk00(parcel.readString(), parcel.readString());
            case 21:
                return new xg30(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(xg30.class.getClassLoader()), parcel.readParcelable(xg30.class.getClassLoader()));
            case 22:
                return new qi30(parcel);
            case 23:
                return new z740(parcel.readString(), c0p1.j(parcel), dv20.c(parcel.readString()), 0);
            case 24:
                return new t480((UUID) parcel.readSerializable());
            case 25:
                tic0 tic0Var = new tic0();
                tic0Var.a = parcel.readInt();
                tic0Var.b = parcel.readInt();
                tic0Var.c = parcel.readInt() == 1;
                return tic0Var;
            case 26:
                return new m2d0(parcel.readInt() != 0);
            case 27:
                parcel.readInt();
                return drd0.a;
            case 28:
                return new zti0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new ihm0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hi5[i];
            case 1:
                return new hm[i];
            case 2:
                return new w01[i];
            case 3:
                return new ee5[i];
            case 4:
                return new il8[i];
            case 5:
                return new l0b[i];
            case 6:
                return new vld[i];
            case 7:
                return new l0e[i];
            case 8:
                return new che[i];
            case 9:
                return new p5k[i];
            case 10:
                return new m9m[i];
            case 11:
                return new ben[i];
            case 12:
                return new dqn[i];
            case 13:
                return new k5s[i];
            case 14:
                return new ept[i];
            case 15:
                return new iax[i];
            case 16:
                return new smx[i];
            case 17:
                return new fox[i];
            case 18:
                return new hrx[i];
            case 19:
                return new fux[i];
            case 20:
                return new vk00[i];
            case 21:
                return new xg30[i];
            case 22:
                return new qi30[i];
            case 23:
                return new z740[i];
            case 24:
                return new t480[i];
            case 25:
                return new tic0[i];
            case 26:
                return new m2d0[i];
            case 27:
                return new drd0[i];
            case 28:
                return new zti0[i];
            default:
                return new ihm0[i];
        }
    }
}
