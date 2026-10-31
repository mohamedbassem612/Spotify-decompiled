package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ou9 implements Parcelable {
    public static final Parcelable.Creator<ou9> CREATOR = new so8((byte) 26);
    public final boolean N0;
    public final CharSequence X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int t;

    public ou9(nu9 nu9Var) {
        int size = nu9Var.c.size();
        this.a = new int[size * 6];
        if (!nu9Var.i) {
            eg.m("Not on back stack");
            throw null;
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            wi30 wi30Var = (wi30) nu9Var.c.get(i2);
            int i3 = i + 1;
            this.a[i] = wi30Var.a;
            ArrayList arrayList = this.b;
            zf30 zf30Var = wi30Var.b;
            arrayList.add(zf30Var != null ? zf30Var.e : null);
            int[] iArr = this.a;
            iArr[i3] = wi30Var.c ? 1 : 0;
            iArr[i + 2] = wi30Var.d;
            iArr[i + 3] = wi30Var.e;
            int i4 = i + 5;
            iArr[i + 4] = wi30Var.f;
            i += 6;
            iArr[i4] = wi30Var.g;
            this.c[i2] = wi30Var.h.ordinal();
            this.d[i2] = wi30Var.i.ordinal();
        }
        this.e = nu9Var.h;
        this.f = nu9Var.k;
        this.g = nu9Var.v;
        this.h = nu9Var.l;
        this.i = nu9Var.m;
        this.t = nu9Var.n;
        this.X = nu9Var.o;
        this.Y = nu9Var.p;
        this.Z = nu9Var.q;
        this.N0 = nu9Var.r;
    }

    public final void a(nu9 nu9Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                nu9Var.h = this.e;
                nu9Var.k = this.f;
                nu9Var.i = true;
                nu9Var.l = this.h;
                nu9Var.m = this.i;
                nu9Var.n = this.t;
                nu9Var.o = this.X;
                nu9Var.p = this.Y;
                nu9Var.q = this.Z;
                nu9Var.r = this.N0;
                return;
            }
            wi30 wi30Var = new wi30();
            int i3 = i + 1;
            wi30Var.a = iArr[i];
            if (th30.P(2)) {
                Objects.toString(nu9Var);
                int i4 = iArr[i3];
            }
            wi30Var.h = w8c0.values()[this.c[i2]];
            wi30Var.i = w8c0.values()[this.d[i2]];
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            wi30Var.c = z;
            int i6 = iArr[i5];
            wi30Var.d = i6;
            int i7 = iArr[i + 3];
            wi30Var.e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            wi30Var.f = i9;
            i += 6;
            int i10 = iArr[i8];
            wi30Var.g = i10;
            nu9Var.d = i6;
            nu9Var.e = i7;
            nu9Var.f = i9;
            nu9Var.g = i10;
            nu9Var.b(wi30Var);
            i2++;
        }
    }

    public final nu9 b(th30 th30Var) {
        nu9 nu9Var = new nu9(th30Var);
        a(nu9Var);
        nu9Var.v = this.g;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                nu9Var.d(1);
                return nu9Var;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((wi30) nu9Var.c.get(i)).b = th30Var.c.m(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.t);
        TextUtils.writeToParcel(this.X, parcel, 0);
        parcel.writeStringList(this.Y);
        parcel.writeStringList(this.Z);
        parcel.writeInt(this.N0 ? 1 : 0);
    }

    public ou9(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.t = parcel.readInt();
        this.X = (CharSequence) creator.createFromParcel(parcel);
        this.Y = parcel.createStringArrayList();
        this.Z = parcel.createStringArrayList();
        this.N0 = parcel.readInt() != 0;
    }
}
