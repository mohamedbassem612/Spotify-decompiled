package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dez implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = 0;
        switch (this.a) {
            case 0:
                return new eez(jez.valueOf(parcel.readString()));
            case 1:
                return new gez((s69) (parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel)), (s69) (parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel)), (s69) (parcel.readInt() != 0 ? s69.CREATOR.createFromParcel(parcel) : null));
            case 2:
                return new hez(jez.valueOf(parcel.readString()));
            case 3:
                hez hezVar = (hez) hez.CREATOR.createFromParcel(parcel);
                Parcelable.Creator creator = s69.CREATOR;
                return new iez(hezVar, (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel));
            case 4:
                return new xez(parcel.readString());
            case 5:
                return new qfz(parcel.readString(), parcel.readInt() != 0);
            case 6:
                parcel.readInt();
                return wgz.a;
            case 7:
                parcel.readInt();
                return xgz.a;
            case 8:
                return new xhz(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 9:
                return new eiz(parcel.readString(), parcel.readString(), zjy.t(parcel.readString()), parcel.readString(), parcel.readParcelable(eiz.class.getClassLoader()), parcel.readInt() != 0);
            case 10:
                parcel.readInt();
                return giz.a;
            case 11:
                parcel.readInt();
                return hiz.a;
            case 12:
                parcel.readInt();
                return iiz.a;
            case 13:
                parcel.readInt();
                return jiz.a;
            case 14:
                parcel.readInt();
                return kiz.a;
            case 15:
                return new liz(parcel.readInt());
            case 16:
                parcel.readInt();
                return miz.a;
            case 17:
                parcel.readInt();
                return niz.a;
            case 18:
                return new wvz(ltn1.x(parcel));
            case 19:
                return new xvz(ltn1.x(parcel));
            case 20:
                return new cwz(parcel.readString());
            case 21:
                return new nzz(parcel.readSerializable());
            case 22:
                return new zzz(qqn1.g(parcel));
            case 23:
                hwn0 hwn0VarX = ltn1.x(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(prn1.m(parcel));
                }
                return new f000(hwn0VarX, arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 24:
                return new g000(qqn1.g(parcel));
            case 25:
                return new q700(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 26:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iH != i3) {
                    iH = x0d.h(p800.class, parcel, arrayList2, iH, 1);
                }
                return new p800(arrayList2, parcel.readString());
            case 27:
                return new ha00(parcel.readLong(), parcel.readString(), parcel.readString());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                String string = parcel.readString();
                String string2 = parcel.readString();
                jj40 parcelable = parcel.readParcelable(wh00.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iH != i4) {
                    iH = x0d.h(wh00.class, parcel, arrayList3, iH, 1);
                }
                return new wh00(string, string2, parcelable, arrayList3);
            default:
                parcel.readInt();
                return pn00.b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new eez[i];
            case 1:
                return new gez[i];
            case 2:
                return new hez[i];
            case 3:
                return new iez[i];
            case 4:
                return new xez[i];
            case 5:
                return new qfz[i];
            case 6:
                return new wgz[i];
            case 7:
                return new xgz[i];
            case 8:
                return new xhz[i];
            case 9:
                return new eiz[i];
            case 10:
                return new giz[i];
            case 11:
                return new hiz[i];
            case 12:
                return new iiz[i];
            case 13:
                return new jiz[i];
            case 14:
                return new kiz[i];
            case 15:
                return new liz[i];
            case 16:
                return new miz[i];
            case 17:
                return new niz[i];
            case 18:
                return new wvz[i];
            case 19:
                return new xvz[i];
            case 20:
                return new cwz[i];
            case 21:
                return new nzz[i];
            case 22:
                return new zzz[i];
            case 23:
                return new f000[i];
            case 24:
                return new g000[i];
            case 25:
                return new q700[i];
            case 26:
                return new p800[i];
            case 27:
                return new ha00[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new wh00[i];
            default:
                return new pn00[i];
        }
    }
}
