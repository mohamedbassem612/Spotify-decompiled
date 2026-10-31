package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Any;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tfk1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        byte[] bArrCreateByteArray;
        Any anyS;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new ufk1(parcel.readString(), (hn90) parcel.readParcelable(ufk1.class.getClassLoader()));
            case 1:
                return new vfk1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                Any any = null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readByte() != 0 && (bArrCreateByteArray = parcel.createByteArray()) != null) {
                    try {
                        anyS = Any.s(bArrCreateByteArray);
                    } catch (Exception unused) {
                        anyS = null;
                    }
                    any = anyS;
                    break;
                }
                return new wfk1(string, string2, any);
            case 3:
                return new xfk1(parcel.readString(), parcel.readString());
            case 4:
                return new kgk1(parcel.readString(), (xhc0) parcel.readParcelable(kgk1.class.getClassLoader()), parcel.readInt() == 0 ? null : xfk1.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : wfk1.CREATOR.createFromParcel(parcel), (fgk1) parcel.readParcelable(kgk1.class.getClassLoader()), (jgk1) parcel.readParcelable(kgk1.class.getClassLoader()), (sce) parcel.readParcelable(kgk1.class.getClassLoader()), parcel.readInt() != 0 ? rgk1.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
            case 5:
                return new yfk1(parcel.readString(), (kq70) parcel.readParcelable(yfk1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new zfk1(parcel.readString(), (uas0) parcel.readParcelable(zfk1.class.getClassLoader()));
            case 7:
                return new agk1(parcel.readString(), parcel.readString());
            case 8:
                return new bgk1(parcel.readString());
            case 9:
                int iH = 0;
                String string3 = parcel.readString();
                kq70 kq70Var = (kq70) parcel.readParcelable(dgk1.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                cgk1 cgk1Var = (cgk1) parcel.readParcelable(dgk1.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iH != i) {
                    iH = x0d.h(dgk1.class, parcel, arrayList, iH, 1);
                }
                return new dgk1(string3, kq70Var, string4, string5, cgk1Var, arrayList, igm0.CREATOR.createFromParcel(parcel));
            case 10:
                return new egk1(parcel.readString());
            case 11:
                return new ggk1(parcel.readString());
            case 12:
                return new hgk1(parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                return new igk1(parcel.readString(), yfk1.CREATOR.createFromParcel(parcel), (pqe1) parcel.readParcelable(igk1.class.getClassLoader()), (vfk1) (parcel.readInt() != 0 ? vfk1.CREATOR.createFromParcel(parcel) : null), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                parcel.readInt();
                return lgk1.a;
            case 15:
                parcel.readInt();
                return mgk1.a;
            case 16:
                parcel.readInt();
                return ngk1.a;
            case 17:
                parcel.readInt();
                return ogk1.a;
            case 18:
                parcel.readInt();
                return pgk1.a;
            case 19:
                parcel.readInt();
                return qgk1.a;
            case 20:
                return new rgk1(parcel.readString(), parcel.readString());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return sgk1.a;
            case 22:
                parcel.readInt();
                return tgk1.a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return ugk1.a;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new vgk1(parcel.createStringArrayList(), parcel.readString(), (rfk1) (parcel.readInt() != 0 ? rfk1.CREATOR.createFromParcel(parcel) : null));
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new ajk1(parcel.readString(), parcel.readString());
            case 26:
                return new rkk1(cae1.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 27:
                return new skk1(parcel.readParcelable(skk1.class.getClassLoader()), parcel.readString());
            case 28:
                return new tkk1(parcel.readString());
            default:
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(skk1.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new ukk1(arrayList2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ufk1[i];
            case 1:
                return new vfk1[i];
            case 2:
                return new wfk1[i];
            case 3:
                return new xfk1[i];
            case 4:
                return new kgk1[i];
            case 5:
                return new yfk1[i];
            case 6:
                return new zfk1[i];
            case 7:
                return new agk1[i];
            case 8:
                return new bgk1[i];
            case 9:
                return new dgk1[i];
            case 10:
                return new egk1[i];
            case 11:
                return new ggk1[i];
            case 12:
                return new hgk1[i];
            case 13:
                return new igk1[i];
            case 14:
                return new lgk1[i];
            case 15:
                return new mgk1[i];
            case 16:
                return new ngk1[i];
            case 17:
                return new ogk1[i];
            case 18:
                return new pgk1[i];
            case 19:
                return new qgk1[i];
            case 20:
                return new rgk1[i];
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new sgk1[i];
            case 22:
                return new tgk1[i];
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new ugk1[i];
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new vgk1[i];
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new ajk1[i];
            case 26:
                return new rkk1[i];
            case 27:
                return new skk1[i];
            case 28:
                return new tkk1[i];
            default:
                return new ukk1[i];
        }
    }
}
