package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class acm1 implements Parcelable {
    public static final Parcelable.Creator<acm1> CREATOR = new w8m1((byte) 24);
    public final StoryCard a;
    public final Map b;
    public final Map c;
    public final egm1 d;
    public final boolean e;

    public acm1(StoryCard storyCard, Map map, Map map2, egm1 egm1Var, boolean z) {
        this.a = storyCard;
        this.b = map;
        this.c = map2;
        this.d = egm1Var;
        this.e = z;
    }

    public static acm1 a(acm1 acm1Var, StoryCard storyCard, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, egm1 egm1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            storyCard = acm1Var.a;
        }
        StoryCard storyCard2 = storyCard;
        Map map = linkedHashMap;
        if ((i & 2) != 0) {
            map = acm1Var.b;
        }
        Map map2 = map;
        Map map3 = linkedHashMap2;
        if ((i & 4) != 0) {
            map3 = acm1Var.c;
        }
        Map map4 = map3;
        if ((i & 8) != 0) {
            egm1Var = acm1Var.d;
        }
        egm1 egm1Var2 = egm1Var;
        if ((i & 16) != 0) {
            z = acm1Var.e;
        }
        return new acm1(storyCard2, map2, map4, egm1Var2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acm1)) {
            return false;
        }
        acm1 acm1Var = (acm1) obj;
        return u890.j(this.a, acm1Var.a) && u890.j(this.b, acm1Var.b) && u890.j(this.c, acm1Var.c) && u890.j(this.d, acm1Var.d) && this.e == acm1Var.e;
    }

    public final int hashCode() {
        StoryCard storyCard = this.a;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cy30.e(cy30.e((storyCard == null ? 0 : storyCard.hashCode()) * 31, 31, this.b), 31, this.c)) * 31);
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
        Iterator itJ2 = xcg1.j(parcel, this.c);
        while (itJ2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itJ2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeInt(((Boolean) entry2.getValue()).booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
