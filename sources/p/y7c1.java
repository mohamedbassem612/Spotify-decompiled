package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y7c1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ y7c1(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0275  */
    /* JADX WARN: Code duplicated, block: B:116:0x027d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0288  */
    /* JADX WARN: Code duplicated, block: B:122:0x0293  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int i;
        String string;
        int i2 = 2;
        int iF = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return z7c1.a;
            case 1:
                parcel.readInt();
                return a8c1.a;
            case 2:
                return new b9c1(parcel.readInt(), (b8c1) parcel.readParcelable(b9c1.class.getClassLoader()), parcel.readInt(), kas0.valueOf(parcel.readString()), u6c1.CREATOR.createFromParcel(parcel));
            case 3:
                boolean z3 = true;
                u4c1 u4c1Var = (u4c1) parcel.readParcelable(lbc1.class.getClassLoader());
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                kas0 kas0VarValueOf = kas0.valueOf(parcel.readString());
                jix0 jix0VarValueOf = jix0.valueOf(parcel.readString());
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                boolean z5 = parcel.readInt() != 0 ? true : z;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new lbc1(u4c1Var, i3, i4, kas0VarValueOf, jix0VarValueOf, z4, z2, z5, z, z3, eb71.valueOf(parcel.readString()));
            case 4:
                parcel.readInt();
                return acc1.a;
            case 5:
                return new pcc1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(pcc1.class.getClassLoader()));
            case 6:
                return new vdc1(parcel);
            case 7:
                return parcel.readString();
            case 8:
                return new fic1(parcel.readString(), parcel.createStringArrayList(), parcel.readInt());
            case 9:
                return new gic1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new hic1(parcel.readString(), parcel.readInt());
            case 11:
                return new iic1(parcel.readString(), parcel.readString(), (jic1) jic1.CREATOR.createFromParcel(parcel));
            case 12:
                return new jic1(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readSerializable());
            case 13:
                return new lic1(parcel.readString(), parcel.readString(), (jic1) jic1.CREATOR.createFromParcel(parcel));
            case 14:
                return new mic1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (jic1) jic1.CREATOR.createFromParcel(parcel));
            case 15:
                return new nic1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (jic1) jic1.CREATOR.createFromParcel(parcel));
            case 16:
                return new oic1(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 17:
                return new pic1(parcel.readString(), (jic1) jic1.CREATOR.createFromParcel(parcel));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("Loading")) {
                        i = 1;
                    } else if (string2.equals("Empty")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.songdna.elements.trackliststatuselement.TrackListStatusElement.Status.".concat(string2));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("Popular")) {
                            i2 = 1;
                        } else if (!string.equals("Collaboration")) {
                            hhg1.n("No enum constant com.spotify.songdna.elements.trackliststatuselement.TrackListStatusElement.TrackType.".concat(string));
                        }
                        return new qic1(i, i2, parcel.readInt());
                    }
                    bhn0.i("Name is null");
                    i2 = 0;
                    return new qic1(i, i2, parcel.readInt());
                }
                bhn0.i("Name is null");
                i = 0;
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("Popular")) {
                        i2 = 1;
                    } else if (!string.equals("Collaboration")) {
                        hhg1.n("No enum constant com.spotify.songdna.elements.trackliststatuselement.TrackListStatusElement.TrackType.".concat(string));
                    }
                    return new qic1(i, i2, parcel.readInt());
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new qic1(i, i2, parcel.readInt());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ric1(parcel.readInt(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (jic1) jic1.CREATOR.createFromParcel(parcel));
            case 20:
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("Loop")) {
                        i2 = 1;
                    } else if (!string3.equals("Spinback")) {
                        if (string3.equals("VinylStop")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.playlistmixing.model.StyleBlockType.".concat(string3));
                        }
                    }
                    return new ekc1(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new ekc1(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), i2);
            case 21:
                return fkc1.valueOf(parcel.readString());
            case 22:
                return new rmc1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(rmc1.class.getClassLoader()), parcel.readParcelable(rmc1.class.getClassLoader()), parcel.readString(), parcel.readParcelable(rmc1.class.getClassLoader()));
            case 23:
                return new qnc1(parcel.readString(), (gnp0) (parcel.readInt() == 0 ? null : gnp0.CREATOR.createFromParcel(parcel)), parcel.readInt() != 0 ? gtw0.CREATOR.createFromParcel(parcel) : null);
            case 24:
                lik1 parcelable = parcel.readParcelable(woc1.class.getClassLoader());
                String string4 = parcel.readString();
                n6r0 n6r0Var = (n6r0) parcel.readValue(woc1.class.getClassLoader());
                boolean z6 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                while (iF != i5) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new woc1(parcelable, string4, n6r0Var, z6, linkedHashMap);
            case 25:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z7 = parcel.readInt() != 0;
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (string7.equals("None")) {
                        i2 = 1;
                    } else if (!string7.equals("AutoGenerated")) {
                        hhg1.n("No enum constant com.spotify.betamax.subtitlesimpl.element.SubtitlesPageElement.LanguageSuffix.".concat(string7));
                    }
                    return new asc1(i2, string5, string6, z7);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new asc1(i2, string5, string6, z7);
            case 26:
                String string8 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                while (iF != i6) {
                    iF = dsl0.d(asc1.CREATOR, parcel, arrayList, iF, 1);
                }
                return new bsc1(string8, arrayList);
            case 27:
                return new ssc1(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new jxc1(v660.CREATOR.createFromParcel(parcel), (jq70) parcel.readParcelable(jxc1.class.getClassLoader()), parcel.readInt() == 0 ? null : zud.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : zud.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : zud.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? zud.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (jq70) parcel.readParcelable(jxc1.class.getClassLoader()));
            default:
                return new oxc1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z7c1[i];
            case 1:
                return new a8c1[i];
            case 2:
                return new b9c1[i];
            case 3:
                return new lbc1[i];
            case 4:
                return new acc1[i];
            case 5:
                return new pcc1[i];
            case 6:
                return new vdc1[i];
            case 7:
                return new String[i];
            case 8:
                return new fic1[i];
            case 9:
                return new gic1[i];
            case 10:
                return new hic1[i];
            case 11:
                return new iic1[i];
            case 12:
                return new jic1[i];
            case 13:
                return new lic1[i];
            case 14:
                return new mic1[i];
            case 15:
                return new nic1[i];
            case 16:
                return new oic1[i];
            case 17:
                return new pic1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new qic1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new ric1[i];
            case 20:
                return new ekc1[i];
            case 21:
                return new fkc1[i];
            case 22:
                return new rmc1[i];
            case 23:
                return new qnc1[i];
            case 24:
                return new woc1[i];
            case 25:
                return new asc1[i];
            case 26:
                return new bsc1[i];
            case 27:
                return new ssc1[i];
            case 28:
                return new jxc1[i];
            default:
                return new oxc1[i];
        }
    }
}
