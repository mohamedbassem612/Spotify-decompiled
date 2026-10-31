package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wgm1 implements Parcelable {
    public static final Parcelable.Creator<wgm1> CREATOR = new lfm1((byte) 21);
    public final StoryCard a;
    public final Map b;
    public final egm1 c;
    public final boolean d;

    public wgm1(StoryCard storyCard, Map map, egm1 egm1Var, boolean z) {
        this.a = storyCard;
        this.b = map;
        this.c = egm1Var;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgm1)) {
            return false;
        }
        wgm1 wgm1Var = (wgm1) obj;
        return u890.j(this.a, wgm1Var.a) && u890.j(this.b, wgm1Var.b) && u890.j(this.c, wgm1Var.c) && this.d == wgm1Var.d;
    }

    public final int hashCode() {
        StoryCard storyCard = this.a;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.e((storyCard == null ? 0 : storyCard.hashCode()) * 31, 31, this.b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q6c1.c.u(this.a, parcel);
        Iterator itJ = xcg1.j(parcel, this.b);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
