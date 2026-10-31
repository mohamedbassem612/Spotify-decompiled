package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rco implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ rco(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = 0;
        switch (this.a) {
            case 0:
                int i = 1;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    String string3 = parcel.readString();
                    if (string3 == null) {
                        bhn0.i("Name is null");
                    } else if (!string3.equals("EXTERNAL_URL")) {
                        if (string3.equals("SPOTIFY_URI")) {
                            i = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.libraryimport.matchresult.api.CtaTargetType.".concat(string3));
                        }
                    }
                    i = 0;
                } else {
                    i = 0;
                }
                return new sco(i, string, string2);
            case 1:
                return new tco(parcel.readString(), parcel.readString());
            case 2:
                int iF = 0;
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                while (iF != i2) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new wfo(string4, string5, linkedHashMap);
            case 3:
                return new dgo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(dgo.class.getClassLoader()), lf51.r(parcel.readString()), parcel.readParcelable(dgo.class.getClassLoader()), parcel.readParcelable(dgo.class.getClassLoader()));
            case 4:
                return new jgo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(jgo.class.getClassLoader()), parcel.readParcelable(jgo.class.getClassLoader()));
            case 5:
                int iD = 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(ttm1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new xgo(arrayList);
            case 6:
                parcel.readInt();
                return ygo.a;
            case 7:
                parcel.readInt();
                return aho.a;
            case 8:
                return new nmo((Uri) parcel.readParcelable(nmo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                boolean z = false;
                String string13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new CurrentTrackMetadata(string6, string7, string8, string9, string10, string11, string12, string13, z);
            case 10:
                return new kqo(parcel.readParcelable(kqo.class.getClassLoader()));
            case 11:
                return new nqo(parcel.readString(), parcel.readParcelable(nqo.class.getClassLoader()));
            case 12:
                return new oqo(parcel.readString(), parcel.readString());
            case 13:
                return new aro(parcel);
            case 14:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iH != i4) {
                    iH = x0d.h(dso.class, parcel, arrayList2, iH, 1);
                }
                return new dso(arrayList2);
            case 15:
                String string14 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(eso.class, parcel, arrayList3, iH, 1);
                }
                return new eso(string14, arrayList3, parcel.readParcelable(eso.class.getClassLoader()));
            case 16:
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
                while (iH != i6) {
                    linkedHashMap2.put(parcel.readParcelable(gso.class.getClassLoader()), parcel.readParcelable(gso.class.getClassLoader()));
                    iH++;
                }
                return new gso(linkedHashMap2);
            case 17:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i7);
                while (iH != i7) {
                    linkedHashMap3.put(parcel.readParcelable(hso.class.getClassLoader()), parcel.readParcelable(hso.class.getClassLoader()));
                    iH++;
                }
                return new hso(linkedHashMap3, parcel.readParcelable(hso.class.getClassLoader()));
            case 18:
                return new hvo(parcel.readString(), parcel.readString(), parcel.readBundle(hvo.class.getClassLoader()));
            case 19:
                parcel.readInt();
                return pvo.a;
            case 20:
                return new iwq(parcel.readString(), parcel.readString());
            case 21:
                return new i5r(parcel.readSerializable(), parcel.readSerializable());
            case 22:
                return new e6r(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 23:
                return new m6r(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
            case 24:
                return new f7r(parcel.readLong());
            case 25:
                return new j7r(parcel.readString(), parcel.readInt());
            case 26:
                return new hbr(parcel.readString());
            case 27:
                parcel.readInt();
                return jbr.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new u6s(parcel.readInt() != 0);
            default:
                parcel.readInt();
                return vks.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sco[i];
            case 1:
                return new tco[i];
            case 2:
                return new wfo[i];
            case 3:
                return new dgo[i];
            case 4:
                return new jgo[i];
            case 5:
                return new xgo[i];
            case 6:
                return new ygo[i];
            case 7:
                return new aho[i];
            case 8:
                return new nmo[i];
            case 9:
                return new CurrentTrackMetadata[i];
            case 10:
                return new kqo[i];
            case 11:
                return new nqo[i];
            case 12:
                return new oqo[i];
            case 13:
                return new aro[i];
            case 14:
                return new dso[i];
            case 15:
                return new eso[i];
            case 16:
                return new gso[i];
            case 17:
                return new hso[i];
            case 18:
                return new hvo[i];
            case 19:
                return new pvo[i];
            case 20:
                return new iwq[i];
            case 21:
                return new i5r[i];
            case 22:
                return new e6r[i];
            case 23:
                return new m6r[i];
            case 24:
                return new f7r[i];
            case 25:
                return new j7r[i];
            case 26:
                return new hbr[i];
            case 27:
                return new jbr[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new u6s[i];
            default:
                return new vks[i];
        }
    }
}
