package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s8a implements Parcelable {
    public static final Parcelable.Creator<s8a> CREATOR = new ux9((byte) 22);
    public final float a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final Paragraph f;
    public final Paragraph g;

    public s8a(float f, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Paragraph paragraph, Paragraph paragraph2) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = paragraph;
        this.g = paragraph2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8a)) {
            return false;
        }
        s8a s8aVar = (s8a) obj;
        return Float.compare(this.a, s8aVar.a) == 0 && u890.j(this.b, s8aVar.b) && u890.j(this.c, s8aVar.c) && u890.j(this.d, s8aVar.d) && u890.j(this.e, s8aVar.e) && u890.j(this.f, s8aVar.f) && u890.j(this.g, s8aVar.g);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Paragraph paragraph = this.f;
        int iHashCode6 = (iHashCode5 + (paragraph == null ? 0 : paragraph.hashCode())) * 31;
        Paragraph paragraph2 = this.g;
        return iHashCode6 + (paragraph2 != null ? paragraph2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        List list = this.e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeFloat(((Number) it.next()).floatValue());
            }
        }
        yor0 yor0Var = yor0.c;
        yor0Var.u(this.f, parcel);
        yor0Var.u(this.g, parcel);
    }
}
