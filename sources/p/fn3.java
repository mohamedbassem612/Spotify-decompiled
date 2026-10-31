package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fn3 implements Parcelable {
    public static final Parcelable.Creator<fn3> CREATOR = new i93((byte) 8);
    public static final fn3 e = new fn3(EntryPoint.DEFAULT, new wub1("", xz.a, vo41.a, (wub1) null, (wub1) null), z6x.a, null);
    public final EntryPoint a;
    public final wub1 b;
    public final List c;
    public final jm3 d;

    public fn3(EntryPoint entryPoint, wub1 wub1Var, List list, jm3 jm3Var) {
        this.a = entryPoint;
        this.b = wub1Var;
        this.c = list;
        this.d = jm3Var;
    }

    public static fn3 a(fn3 fn3Var, EntryPoint entryPoint, wub1 wub1Var, ArrayList arrayList, jm3 jm3Var, int i) {
        if ((i & 1) != 0) {
            entryPoint = fn3Var.a;
        }
        if ((i & 2) != 0) {
            wub1Var = fn3Var.b;
        }
        List list = arrayList;
        if ((i & 4) != 0) {
            list = fn3Var.c;
        }
        if ((i & 8) != 0) {
            jm3Var = fn3Var.d;
        }
        fn3Var.getClass();
        return new fn3(entryPoint, wub1Var, list, jm3Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn3)) {
            return false;
        }
        fn3 fn3Var = (fn3) obj;
        return this.a == fn3Var.a && u890.j(this.b, fn3Var.b) && u890.j(this.c, fn3Var.c) && u890.j(this.d, fn3Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        jm3 jm3Var = this.d;
        return iB + (jm3Var == null ? 0 : jm3Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.d, i);
    }
}
