package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eso implements fso {
    public static final Parcelable.Creator<eso> CREATOR = new rco((byte) 15);
    public final String a;
    public final List b;
    public final dkn c;

    public eso(String str, List list, dkn dknVar) {
        this.a = str;
        this.b = list;
        this.c = dknVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eso)) {
            return false;
        }
        eso esoVar = (eso) obj;
        return u890.j(this.a, esoVar.a) && this.b.equals(esoVar.b) && u890.j(this.c, esoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // p.fso
    public final List w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.c, i);
    }
}
