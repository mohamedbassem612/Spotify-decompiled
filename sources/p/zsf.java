package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zsf implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return atf.a;
            case 1:
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iD = 0;
                while (iD != i) {
                    iD = dsl0.d(oe90.CREATOR, parcel, arrayList, iD, 1);
                }
                return new btf(string, arrayList);
            case 2:
                return new vtf(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new wvf(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 4:
                return new xvf(parcel.readString());
            case 5:
                return new yvf(parcel.readString());
            case 6:
                return new zvf(parcel.readString());
            case 7:
                parcel.readInt();
                return pwf.a;
            case 8:
                parcel.readInt();
                return qwf.a;
            case 9:
                parcel.readInt();
                return rwf.a;
            case 10:
                parcel.readInt();
                return cxf.b;
            case 11:
                parcel.readInt();
                return dxf.b;
            case 12:
                parcel.readInt();
                return exf.b;
            case 13:
                parcel.readInt();
                return fxf.b;
            case 14:
                parcel.readInt();
                return gxf.b;
            case 15:
                parcel.readInt();
                return hxf.b;
            case 16:
                return new ixf(parcel.readString());
            case 17:
                parcel.readInt();
                return jxf.b;
            case 18:
                parcel.readInt();
                return kxf.b;
            case 19:
                parcel.readInt();
                return lxf.b;
            case 20:
                parcel.readInt();
                return mxf.b;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return nxf.b;
            case 22:
                parcel.readInt();
                return oxf.b;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                parcel.readInt();
                return pxf.b;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return qxf.b;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return rxf.b;
            case 26:
                parcel.readInt();
                return sxf.b;
            case 27:
                parcel.readInt();
                return txf.b;
            case 28:
                parcel.readInt();
                return uxf.b;
            default:
                parcel.readInt();
                return vxf.b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new atf[i];
            case 1:
                return new btf[i];
            case 2:
                return new vtf[i];
            case 3:
                return new wvf[i];
            case 4:
                return new xvf[i];
            case 5:
                return new yvf[i];
            case 6:
                return new zvf[i];
            case 7:
                return new pwf[i];
            case 8:
                return new qwf[i];
            case 9:
                return new rwf[i];
            case 10:
                return new cxf[i];
            case 11:
                return new dxf[i];
            case 12:
                return new exf[i];
            case 13:
                return new fxf[i];
            case 14:
                return new gxf[i];
            case 15:
                return new hxf[i];
            case 16:
                return new ixf[i];
            case 17:
                return new jxf[i];
            case 18:
                return new kxf[i];
            case 19:
                return new lxf[i];
            case 20:
                return new mxf[i];
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new nxf[i];
            case 22:
                return new oxf[i];
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new pxf[i];
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new qxf[i];
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new rxf[i];
            case 26:
                return new sxf[i];
            case 27:
                return new txf[i];
            case 28:
                return new uxf[i];
            default:
                return new vxf[i];
        }
    }
}
