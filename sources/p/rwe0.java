package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rwe0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:100:0x0251  */
    /* JADX WARN: Code duplicated, block: B:102:0x0254  */
    /* JADX WARN: Code duplicated, block: B:148:0x031d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0323  */
    /* JADX WARN: Code duplicated, block: B:82:0x020d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0213  */
    /* JADX WARN: Code duplicated, block: B:85:0x0217  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0223  */
    /* JADX WARN: Code duplicated, block: B:90:0x022b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0230  */
    /* JADX WARN: Code duplicated, block: B:93:0x023d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0248  */
    /* JADX WARN: Code duplicated, block: B:97:0x024a  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 0:
                return new swe0(parcel.readString());
            case 1:
                parcel.readInt();
                return twe0.a;
            case 2:
                return new wwe0(parcel.readString(), parcel.readString());
            case 3:
                return new lye0(parcel.readString(), parcel.readString(), parcel.readParcelable(lye0.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readParcelable(lye0.class.getClassLoader()), parcel.readParcelable(lye0.class.getClassLoader()));
            case 4:
                int i3 = 2;
                String string2 = parcel.readString();
                zzy parcelable = parcel.readParcelable(pye0.class.getClassLoader());
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("NONE")) {
                        i3 = 1;
                    } else if (!string3.equals("QUICKSILVER")) {
                        hhg1.n("No enum constant com.spotify.genalpha.loginchoice.page.LoginChoiceEntrySource.".concat(string3));
                    }
                    return new pye0(string2, parcelable, i3, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
                }
                bhn0.i("Name is null");
                i3 = 0;
                if (parcel.readInt() != 0) {
                }
                return new pye0(string2, parcelable, i3, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
            case 5:
                tye0 tye0Var = new tye0();
                tye0Var.b = -1;
                Parcelable[] parcelableArray = parcel.readParcelableArray(t1f0.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable2 : parcelableArray) {
                    t1f0 t1f0Var = parcelable2 instanceof t1f0 ? (t1f0) parcelable2 : null;
                    if (t1f0Var != null) {
                        t1f0Var.b = tye0Var;
                    }
                    if (t1f0Var != null) {
                        arrayList.add(t1f0Var);
                    }
                }
                tye0Var.a = (t1f0[]) arrayList.toArray(new t1f0[0]);
                tye0Var.b = parcel.readInt();
                tye0Var.g = parcel.readParcelable(rye0.class.getClassLoader());
                HashMap mapG = fpi1.G(parcel);
                tye0Var.h = mapG != null ? new LinkedHashMap(mapG) : null;
                HashMap mapG2 = fpi1.G(parcel);
                tye0Var.i = mapG2 != null ? new LinkedHashMap(mapG2) : null;
                return tye0Var;
            case 6:
                return new rye0(parcel);
            case 7:
                return new sye0(parcel);
            case 8:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzy parcelable3 = parcel.readParcelable(qze0.class.getClassLoader());
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                Intent intent = (Intent) parcel.readParcelable(qze0.class.getClassLoader());
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (string6.equals("READY")) {
                        i = 1;
                    } else if (string6.equals("LOADING")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.genalpha.logincurrentdevice.page.mobius.LoginCurrentDeviceModel.Status.".concat(string6));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("NONE")) {
                            z = true;
                            i2 = 1;
                        } else if (string.equals("LOGIN_FAILED")) {
                            z = true;
                            i2 = 2;
                        } else if (string.equals("UPGRADE_REQUIRED")) {
                            z = true;
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.genalpha.logincurrentdevice.page.mobius.LoginCurrentDeviceModel.ErrorType.".concat(string));
                        }
                        if (parcel.readInt() != 0) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z3 = z;
                        } else {
                            z3 = false;
                        }
                        return new qze0(string4, string5, parcelable3, numValueOf, intent, i, i2, z2, z3);
                    }
                    bhn0.i("Name is null");
                    z = true;
                    i2 = 0;
                    if (parcel.readInt() != 0) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                    return new qze0(string4, string5, parcelable3, numValueOf, intent, i, i2, z2, z3);
                }
                bhn0.i("Name is null");
                i = 0;
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("NONE")) {
                        z = true;
                        i2 = 1;
                    } else if (string.equals("LOGIN_FAILED")) {
                        z = true;
                        i2 = 2;
                    } else if (string.equals("UPGRADE_REQUIRED")) {
                        z = true;
                        i2 = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.genalpha.logincurrentdevice.page.mobius.LoginCurrentDeviceModel.ErrorType.".concat(string));
                    }
                    if (parcel.readInt() != 0) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                    return new qze0(string4, string5, parcelable3, numValueOf, intent, i, i2, z2, z3);
                }
                bhn0.i("Name is null");
                z = true;
                i2 = 0;
                if (parcel.readInt() != 0) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                return new qze0(string4, string5, parcelable3, numValueOf, intent, i, i2, z2, z3);
            case 9:
                return new c0f0(parcel.readString(), parcel.readParcelable(c0f0.class.getClassLoader()));
            case 10:
                return new r0f0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(r0f0.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), pe11.valueOf(parcel.readString()));
            case 11:
                String string7 = parcel.readString();
                zzy parcelable4 = parcel.readParcelable(y0f0.class.getClassLoader());
                return new y0f0(parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), string7, parcelable4);
            case 12:
                return new n1f0((lb61) lb61.CREATOR.createFromParcel(parcel));
            case 13:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                return new u1f0(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, string8, string9, string10, parcel.readInt() != 0);
            case 14:
                return new v2f0(parcel.readString());
            case 15:
                return new w2f0(parcel.readString(), parcel.readString());
            case 16:
                return new x2f0(parcel.readString(), parcel.readString());
            case 17:
                parcel.readInt();
                return y2f0.a;
            case 18:
                return new z2f0(parcel.readString(), parcel.readString());
            case 19:
                return new a3f0(parcel.readString(), parcel.readString());
            case 20:
                return new b3f0(parcel.readParcelable(b3f0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 21:
                return new c3f0(parcel.readString());
            case 22:
                return new d3f0(parcel.readString());
            case 23:
                return new e3f0(parcel.readString(), parcel.readString());
            case 24:
                return new f3f0(parcel.readString(), parcel.readString());
            case 25:
                return new g3f0(parcel.readString(), parcel.readParcelable(g3f0.class.getClassLoader()));
            case 26:
                return new h3f0(j4s0.CREATOR.createFromParcel(parcel));
            case 27:
                return new i3f0(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new j3f0(parcel.readString(), parcel.readString());
            default:
                return new k3f0(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new swe0[i];
            case 1:
                return new twe0[i];
            case 2:
                return new wwe0[i];
            case 3:
                return new lye0[i];
            case 4:
                return new pye0[i];
            case 5:
                return new tye0[i];
            case 6:
                return new rye0[i];
            case 7:
                return new sye0[i];
            case 8:
                return new qze0[i];
            case 9:
                return new c0f0[i];
            case 10:
                return new r0f0[i];
            case 11:
                return new y0f0[i];
            case 12:
                return new n1f0[i];
            case 13:
                return new u1f0[i];
            case 14:
                return new v2f0[i];
            case 15:
                return new w2f0[i];
            case 16:
                return new x2f0[i];
            case 17:
                return new y2f0[i];
            case 18:
                return new z2f0[i];
            case 19:
                return new a3f0[i];
            case 20:
                return new b3f0[i];
            case 21:
                return new c3f0[i];
            case 22:
                return new d3f0[i];
            case 23:
                return new e3f0[i];
            case 24:
                return new f3f0[i];
            case 25:
                return new g3f0[i];
            case 26:
                return new h3f0[i];
            case 27:
                return new i3f0[i];
            case 28:
                return new j3f0[i];
            default:
                return new k3f0[i];
        }
    }
}
