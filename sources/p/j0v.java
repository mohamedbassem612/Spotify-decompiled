package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j0v implements Parcelable {
    public static final Parcelable.Creator<j0v> CREATOR = new zrt((byte) 25);
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;
    public final g0v h;
    public final h0v i;

    public j0v(Parcel parcel) {
        String string = parcel.readString();
        String str = zoi1.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(parcel.readParcelable(vdc1.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
        this.h = (g0v) parcel.readParcelable(g0v.class.getClassLoader());
        this.i = (h0v) parcel.readParcelable(h0v.class.getClassLoader());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public final j0v a(j0v j0vVar) {
        ?? arrayList;
        String str = j0vVar.a;
        List list = j0vVar.d;
        dm5.m(this.a.equals(str));
        List list2 = this.d;
        if (list2.isEmpty() || list.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(list2);
            for (int i = 0; i < list.size(); i++) {
                vdc1 vdc1Var = (vdc1) list.get(i);
                if (!arrayList.contains(vdc1Var)) {
                    arrayList.add(vdc1Var);
                }
            }
        }
        ?? r7 = arrayList;
        return new j0v(this.a, j0vVar.b, j0vVar.c, r7, j0vVar.e, j0vVar.f, j0vVar.g, j0vVar.h, j0vVar.i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0v)) {
            return false;
        }
        j0v j0vVar = (j0v) obj;
        return this.a.equals(j0vVar.a) && this.b.equals(j0vVar.b) && Objects.equals(this.c, j0vVar.c) && this.d.equals(j0vVar.d) && Arrays.equals(this.e, j0vVar.e) && Objects.equals(this.f, j0vVar.f) && Arrays.equals(this.g, j0vVar.g) && Objects.equals(this.h, j0vVar.h) && Objects.equals(this.i, j0vVar.i);
    }

    public final int hashCode() {
        int iH = hrt.h(this.b, this.a.hashCode() * 961, 31);
        String str = this.c;
        int iF = ktd.f((this.d.hashCode() + ((iH + (str != null ? str.hashCode() : 0)) * 31)) * 31, this.e, 31);
        String str2 = this.f;
        int iF2 = ktd.f((iF + (str2 != null ? str2.hashCode() : 0)) * 31, this.g, 31);
        g0v g0vVar = this.h;
        int iHashCode = (iF2 + (g0vVar != null ? g0vVar.hashCode() : 0)) * 31;
        h0v h0vVar = this.i;
        return iHashCode + (h0vVar != null ? h0vVar.hashCode() : 0);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
    }

    public j0v(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, g0v g0vVar, h0v h0vVar) {
        int iN = zoi1.N(uri, str2);
        if (iN != 0 && iN != 2 && iN != 1) {
            this.h = g0vVar;
            this.i = null;
        } else {
            dm5.l("customCacheKey must be null for type: %s", iN, str3 == null);
            this.h = null;
            this.i = h0vVar;
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f = str3;
        this.g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : zoi1.b;
    }
}
