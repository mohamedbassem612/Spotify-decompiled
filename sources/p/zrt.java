package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zrt implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zrt(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        rw21 rw21Var;
        boolean z3;
        Boolean boolValueOf;
        boolean z4 = true;
        int i = 1;
        switch (this.a) {
            case 0:
                return new ast(bst.valueOf(parcel.readString()), (n27) (parcel.readInt() == 0 ? null : n27.CREATOR.createFromParcel(parcel)), parcel.readString(), parcel.readString());
            case 1:
                return new cst(est.valueOf(parcel.readString()));
            case 2:
                return new dst(bst.valueOf(parcel.readString()), parcel.readParcelable(dst.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 3:
                return new ytt(parcel.readString(), parcel.readInt() != 0);
            case 4:
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                ept eptVar = (ept) ept.CREATOR.createFromParcel(parcel);
                rw21 rw21Var2 = (rw21) rw21.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = z4;
                    rw21Var = rw21Var2;
                } else {
                    rw21Var = rw21Var2;
                    z3 = z;
                }
                return new m0u(z5, z4, eptVar, rw21Var, z2, z3, parcel.readLong());
            case 5:
                parcel.readInt();
                return o3u.a;
            case 6:
                return new q3u(parcel.readString());
            case 7:
                return new t3u(parcel.readString());
            case 8:
                return new v7u(parcel.readString());
            case 9:
                return new i9u(parcel.readString());
            case 10:
                return new j9u(parcel.readString());
            case 11:
                return new pau(parcel.readInt(), parcel.readParcelable(pau.class.getClassLoader()));
            case 12:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int iF = 0;
                while (iF != i2) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new uau(string, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 13:
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                int iF2 = 0;
                while (iF2 != i3) {
                    iF2 = cfm0.f(parcel, linkedHashMap2, parcel.readString(), iF2, 1);
                }
                return new vau(string2, linkedHashMap2, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 14:
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i4);
                int iF3 = 0;
                while (iF3 != i4) {
                    iF3 = cfm0.f(parcel, linkedHashMap3, parcel.readString(), iF3, 1);
                }
                return new wau(linkedHashMap3, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 15:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i5);
                int iF4 = 0;
                while (iF4 != i5) {
                    iF4 = cfm0.f(parcel, linkedHashMap4, parcel.readString(), iF4, 1);
                }
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new xau(string3, string4, linkedHashMap4, z6, boolValueOf, parcel.readString(), parcel.readString(), bbu.a, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 16:
                String string5 = parcel.readString();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(i6);
                int iF5 = 0;
                while (iF5 != i6) {
                    iF5 = cfm0.f(parcel, linkedHashMap5, parcel.readString(), iF5, 1);
                }
                return new yau(string5, linkedHashMap5, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 17:
                String string6 = parcel.readString();
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i7);
                int iF6 = 0;
                while (iF6 != i7) {
                    iF6 = cfm0.f(parcel, linkedHashMap6, parcel.readString(), iF6, 1);
                }
                return new zau(string6, linkedHashMap6, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 18:
                return new keu(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 19:
                return new sju(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (dg) (parcel.readInt() == 0 ? null : dg.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? null : xz7.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : g08.CREATOR.createFromParcel(parcel));
            case 20:
                parcel.readInt();
                return emu.a;
            case 21:
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (!string7.equals("VOICE")) {
                        if (string7.equals("TEXT")) {
                            i = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.endless.sillywalk.interactivitynavigator.InteractivityContainerNavigator.InputMode.".concat(string7));
                        }
                    }
                    return new mnu(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new mnu(i);
            case 22:
                parcel.readInt();
                return ktu.a;
            case 23:
                return new yvu(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                return new czu(parcel.readString(), parcel.readString());
            case 25:
                return new j0v(parcel);
            case 26:
                return new g0v(parcel);
            case 27:
                return new h0v(parcel);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new q2v(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new r5v((uvg1) uvg1.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ast[i];
            case 1:
                return new cst[i];
            case 2:
                return new dst[i];
            case 3:
                return new ytt[i];
            case 4:
                return new m0u[i];
            case 5:
                return new o3u[i];
            case 6:
                return new q3u[i];
            case 7:
                return new t3u[i];
            case 8:
                return new v7u[i];
            case 9:
                return new i9u[i];
            case 10:
                return new j9u[i];
            case 11:
                return new pau[i];
            case 12:
                return new uau[i];
            case 13:
                return new vau[i];
            case 14:
                return new wau[i];
            case 15:
                return new xau[i];
            case 16:
                return new yau[i];
            case 17:
                return new zau[i];
            case 18:
                return new keu[i];
            case 19:
                return new sju[i];
            case 20:
                return new emu[i];
            case 21:
                return new mnu[i];
            case 22:
                return new ktu[i];
            case 23:
                return new yvu[i];
            case 24:
                return new czu[i];
            case 25:
                return new j0v[i];
            case 26:
                return new g0v[i];
            case 27:
                return new h0v[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new q2v[i];
            default:
                return new r5v[i];
        }
    }
}
