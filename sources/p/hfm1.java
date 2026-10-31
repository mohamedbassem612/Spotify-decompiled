package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hfm1 implements ifm1 {
    public static final Parcelable.Creator<hfm1> CREATOR = new w8m1((byte) 28);
    public final String a;
    public final List b;
    public final List c;

    public hfm1(String str, ArrayList arrayList, List list) {
        this.a = str;
        this.b = list;
        this.c = arrayList;
    }

    public final List a() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfm1)) {
            return false;
        }
        hfm1 hfm1Var = (hfm1) obj;
        return u890.j(this.a, hfm1Var.a) && u890.j(this.b, hfm1Var.b) && this.c.equals(hfm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        parcel.writeString(this.a);
        List<qj31> list = this.b;
        parcel.writeInt(list.size());
        for (qj31 qj31Var : list) {
            if (qj31Var instanceof rj31) {
                parcel.writeInt(0);
                rj31 rj31Var = (rj31) qj31Var;
                parcel.writeString(rj31Var.a);
                parcel.writeFloat(rj31Var.b);
            } else if (qj31Var instanceof nj31) {
                parcel.writeInt(1);
                nj31 nj31Var = (nj31) qj31Var;
                parcel.writeString(nj31Var.a);
                parcel.writeInt(nj31Var.b ? 1 : 0);
            } else if (qj31Var instanceof sj31) {
                parcel.writeInt(2);
                sj31 sj31Var = (sj31) qj31Var;
                parcel.writeString(sj31Var.a);
                parcel.writeString(sj31Var.b);
            } else if (qj31Var instanceof oj31) {
                parcel.writeInt(3);
                oj31 oj31Var = (oj31) qj31Var;
                parcel.writeString(oj31Var.a);
                parcel.writeInt(oj31Var.b);
            } else if (qj31Var instanceof pj31) {
                parcel.writeInt(4);
                pj31 pj31Var = (pj31) qj31Var;
                parcel.writeString(pj31Var.a);
                parcel.writeString(pj31Var.b);
            } else if (qj31Var instanceof tj31) {
                parcel.writeInt(5);
                parcel.writeString(((tj31) qj31Var).a);
            } else {
                if (!(qj31Var instanceof qj31)) {
                    eg.o();
                    return;
                }
                parcel.writeInt(6);
                qj31 qj31Var2 = qj31Var;
                parcel.writeString(qj31Var2.a);
                File fileCreateTempFile = File.createTempFile("rive_img_" + UUID.randomUUID(), ".bin");
                fileCreateTempFile.deleteOnExit();
                y520.J(fileCreateTempFile, qj31Var2.b);
                parcel.writeString(fileCreateTempFile.getAbsolutePath());
            }
        }
        parcel.writeStringList(this.c);
    }
}
