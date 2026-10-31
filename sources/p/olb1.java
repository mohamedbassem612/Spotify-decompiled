package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class olb1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        char c;
        ArrayList arrayList = null;
        int iH = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return plb1.a;
            case 1:
                parcel.readInt();
                return ulb1.a;
            case 2:
                return new vlb1(parcel.readString());
            case 3:
                parcel.readInt();
                return ylb1.a;
            case 4:
                boolean z = true;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new cmb1(string, z);
            case 5:
                parcel.readInt();
                return emb1.a;
            case 6:
                boolean z2 = true;
                String string2 = parcel.readString();
                piz pizVar = (piz) parcel.readParcelable(fmb1.class.getClassLoader());
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new fmb1(string2, pizVar, z3, z2);
            case 7:
                return new gmb1(parcel.readString(), (td90) parcel.readParcelable(gmb1.class.getClassLoader()));
            case 8:
                parcel.readInt();
                return smb1.a;
            case 9:
                parcel.readInt();
                return umb1.a;
            case 10:
                parcel.readInt();
                return vmb1.a;
            case 11:
                return new anb1(parcel.readString(), (zmb1) parcel.readParcelable(anb1.class.getClassLoader()));
            case 12:
                return new zmb1(parcel.readInt());
            case 13:
                return new bnb1(parcel.readString(), (wmp0) parcel.readParcelable(bnb1.class.getClassLoader()));
            case 14:
                return new cnb1(parcel.readInt());
            case 15:
                parcel.readInt();
                return dnb1.a;
            case 16:
                char c2 = 1;
                int i = parcel.readInt();
                char c3 = 0;
                int i2 = parcel.readInt();
                boolean z4 = parcel.readInt() != 0 ? 1 : c3;
                String string3 = parcel.readString();
                if (string3 == null) {
                    bhn0.i("Name is null");
                    c = c3;
                } else if (string3.equals("Http")) {
                    c = c2;
                } else if (string3.equals("Offline")) {
                    c2 = 2;
                    c = c2;
                } else {
                    hhg1.n("No enum constant com.spotify.highlightsstats.shareduiusecases.error.ErrorElement.ErrorType.".concat(string3));
                    c = c3;
                }
                return new wsb1(i, i2, z4, c, parcel.readParcelable(wsb1.class.getClassLoader()));
            case 17:
                parcel.readInt();
                return utb1.a;
            case 18:
                parcel.readInt();
                return vtb1.a;
            case 19:
                parcel.readInt();
                return wtb1.a;
            case 20:
                parcel.readInt();
                return xtb1.a;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return ytb1.a;
            case 22:
                parcel.readInt();
                return ztb1.a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return aub1.a;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return bub1.a;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return cub1.a;
            case 26:
                return new sub1(parcel.readString(), parcel.readInt());
            case 27:
                return new wub1(parcel.readString(), parcel.readParcelable(wub1.class.getClassLoader()), parcel.readParcelable(wub1.class.getClassLoader()), (wub1) (parcel.readInt() == 0 ? null : wub1.CREATOR.createFromParcel(parcel)), (wub1) (parcel.readInt() != 0 ? wub1.CREATOR.createFromParcel(parcel) : null));
            case 28:
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i3);
                    while (iH != i3) {
                        iH = x0d.h(tub1.class, parcel, arrayList2, iH, 1);
                    }
                    arrayList = arrayList2;
                }
                return new tub1(string4, arrayList);
            default:
                parcel.readInt();
                return uub1.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new plb1[i];
            case 1:
                return new ulb1[i];
            case 2:
                return new vlb1[i];
            case 3:
                return new ylb1[i];
            case 4:
                return new cmb1[i];
            case 5:
                return new emb1[i];
            case 6:
                return new fmb1[i];
            case 7:
                return new gmb1[i];
            case 8:
                return new smb1[i];
            case 9:
                return new umb1[i];
            case 10:
                return new vmb1[i];
            case 11:
                return new anb1[i];
            case 12:
                return new zmb1[i];
            case 13:
                return new bnb1[i];
            case 14:
                return new cnb1[i];
            case 15:
                return new dnb1[i];
            case 16:
                return new wsb1[i];
            case 17:
                return new utb1[i];
            case 18:
                return new vtb1[i];
            case 19:
                return new wtb1[i];
            case 20:
                return new xtb1[i];
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new ytb1[i];
            case 22:
                return new ztb1[i];
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new aub1[i];
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new bub1[i];
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new cub1[i];
            case 26:
                return new sub1[i];
            case 27:
                return new wub1[i];
            case 28:
                return new tub1[i];
            default:
                return new uub1[i];
        }
    }
}
