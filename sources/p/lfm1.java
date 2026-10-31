package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lfm1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ lfm1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int iD = 0;
        switch (this.a) {
            case 0:
                int iF = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (iF != i) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new mfm1(string, string2, linkedHashMap);
            case 1:
                return new nfm1(parcel.readString(), mfm1.CREATOR.createFromParcel(parcel), parcel.readString(), jfm1.CREATOR.createFromParcel(parcel), (ifm1) parcel.readParcelable(nfm1.class.getClassLoader()));
            case 2:
                return new ufm1(parcel.readInt(), parcel.readParcelable(ufm1.class.getClassLoader()), parcel.readParcelable(ufm1.class.getClassLoader()), nfm1.CREATOR.createFromParcel(parcel));
            case 3:
                parcel.readInt();
                return dgm1.a;
            case 4:
                boolean z3 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
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
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new egm1(numValueOf, z3, z2, z, z, z);
            case 5:
                parcel.readInt();
                return fgm1.a;
            case 6:
                parcel.readInt();
                return ggm1.a;
            case 7:
                parcel.readInt();
                return hgm1.a;
            case 8:
                parcel.readInt();
                return igm1.a;
            case 9:
                return new jgm1(parcel.readString());
            case 10:
                parcel.readInt();
                return kgm1.a;
            case 11:
                return new lgm1(parcel.readString(), parcel.readParcelable(lgm1.class.getClassLoader()), parcel.readParcelable(lgm1.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return mgm1.a;
            case 13:
                parcel.readInt();
                return ngm1.a;
            case 14:
                return new ogm1((z0c1) parcel.readParcelable(ogm1.class.getClassLoader()));
            case 15:
                return new pgm1((z0c1) parcel.readParcelable(pgm1.class.getClassLoader()), parcel.readString());
            case 16:
                return new qgm1(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
            case 17:
                parcel.readInt();
                return rgm1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return sgm1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new tgm1((StoryCard) q6c1.c.d(parcel));
            case 20:
                return new ugm1((StoryCard) q6c1.c.d(parcel), parcel.readInt() != 0);
            case 21:
                StoryCard storyCard = (StoryCard) q6c1.c.d(parcel);
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readParcelable(wgm1.class.getClassLoader()));
                }
                return new wgm1(storyCard, linkedHashMap2, egm1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 22:
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(qhm1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new phm1(parcel.readInt(), string3, arrayList);
            case 23:
                return new qhm1(parcel.readString(), parcel.readString(), ln71.c.d(parcel), parcel.readString());
            case 24:
                return new rnm1(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 25:
                return new snm1(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 26:
                return new tnm1(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 27:
                return new unm1(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 28:
                return new vnm1(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            default:
                parcel.readInt();
                return xnm1.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mfm1[i];
            case 1:
                return new nfm1[i];
            case 2:
                return new ufm1[i];
            case 3:
                return new dgm1[i];
            case 4:
                return new egm1[i];
            case 5:
                return new fgm1[i];
            case 6:
                return new ggm1[i];
            case 7:
                return new hgm1[i];
            case 8:
                return new igm1[i];
            case 9:
                return new jgm1[i];
            case 10:
                return new kgm1[i];
            case 11:
                return new lgm1[i];
            case 12:
                return new mgm1[i];
            case 13:
                return new ngm1[i];
            case 14:
                return new ogm1[i];
            case 15:
                return new pgm1[i];
            case 16:
                return new qgm1[i];
            case 17:
                return new rgm1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new sgm1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new tgm1[i];
            case 20:
                return new ugm1[i];
            case 21:
                return new wgm1[i];
            case 22:
                return new phm1[i];
            case 23:
                return new qhm1[i];
            case 24:
                return new rnm1[i];
            case 25:
                return new snm1[i];
            case 26:
                return new tnm1[i];
            case 27:
                return new unm1[i];
            case 28:
                return new vnm1[i];
            default:
                return new xnm1[i];
        }
    }
}
