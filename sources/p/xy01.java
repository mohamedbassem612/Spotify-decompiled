package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xy01 implements Parcelable {
    public static final Parcelable.Creator<xy01> CREATOR = new sj01((byte) 26);
    public final int a;
    public final ArrayList b;

    public xy01(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy01)) {
            return false;
        }
        xy01 xy01Var = (xy01) obj;
        return this.a == xy01Var.a && this.b.equals(xy01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.a) {
            case 1:
                str = "RECOMMENDATIONS_TYPE_UNKNOWN";
                break;
            case 2:
                str = "RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST";
                break;
            case 3:
                str = "RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE";
                break;
            case 4:
                str = "RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY";
                break;
            case 5:
                str = "RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK";
                break;
            case 6:
                str = "RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE";
                break;
            case 7:
                str = "RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY";
                break;
            case 8:
                str = "UNRECOGNIZED";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((lby) itO.next()).writeToParcel(parcel, i);
        }
    }
}
