package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class erz0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:20:0x0075->B:21:0x0077, LOOP_END] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        c380 c380VarA = null;
        int iH = 0;
        switch (this.a) {
            case 0:
                int iH2 = 0;
                String string = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iH2 != i4) {
                    iH2 = x0d.h(frz0.class, parcel, arrayList2, iH2, 1);
                }
                return new frz0(string, arrayList2, parcel.readString(), parcel.readParcelable(frz0.class.getClassLoader()));
            case 1:
                return new grz0(frz0.CREATOR.createFromParcel(parcel));
            case 2:
                return new hrz0(parcel.readParcelable(hrz0.class.getClassLoader()));
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new osz0(parcel.readString(), parcel.readInt());
            case 5:
                return new muz0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 6:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iH != i5) {
                    iH = x0d.h(cwz0.class, parcel, arrayList3, iH, 1);
                }
                return new cwz0(parcel.readString(), arrayList3, parcel.readInt() != 0);
            case 7:
                return new dwz0(parcel.readString(), parcel.readString(), g4a.valueOf(parcel.readString()));
            case 8:
                return new ewz0(parcel.readString(), parcel.readString(), g4a.valueOf(parcel.readString()), (dwz0) (parcel.readInt() != 0 ? dwz0.CREATOR.createFromParcel(parcel) : null));
            case 9:
                return new fxz0(parcel.readInt(), parcel.readParcelable(fxz0.class.getClassLoader()));
            case 10:
                return new gxz0(parcel.readString(), parcel.readString(), (w4i1) w4i1.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            case 11:
                return new pxz0(parcel.readString(), parcel.readInt());
            case 12:
                int i6 = parcel.readInt();
                if (i6 > 0) {
                    tr80 tr80VarQ = yoi1.Q(0, i6);
                    ArrayList arrayList4 = new ArrayList();
                    lr80 it = tr80VarQ.iterator();
                    while (((sr80) it).hasNext()) {
                        it.nextInt();
                        String string2 = parcel.readString();
                        pxz0 pxz0Var = string2 == null ? null : new pxz0(string2, parcel.readInt());
                        if (pxz0Var != null) {
                            arrayList4.add(pxz0Var);
                        }
                    }
                    c380VarA = mqo1.A(arrayList4);
                }
                return new rxz0(c380VarA);
            case 13:
                return new o001(parcel.readString(), parcel.readString());
            case 14:
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                while (iH != i7) {
                    iH = dsl0.d(fxz0.CREATOR, parcel, arrayList5, iH, 1);
                }
                return new q001(parcel.readInt(), parcel.readString(), parcel.readString(), arrayList5);
            case 15:
                return new w001(parcel.readString(), parcel.readString());
            case 16:
                return new l201(parcel.readParcelable(l201.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
            case 17:
                return new c401((b401) b401.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 18:
                return new b401(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 19:
                String string3 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                while (iH != i8) {
                    iH = x0d.h(d401.class, parcel, arrayList6, iH, 1);
                }
                return new d401(string3, arrayList6);
            case 20:
                return new o501(parcel.readInt() != 0, parcel.readString(), parcel.readParcelable(o501.class.getClassLoader()), parcel.readInt());
            case 21:
                String string4 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                while (iH != i9) {
                    iH = x0d.h(s501.class, parcel, arrayList7, iH, 1);
                }
                return new s501(string4, arrayList7);
            case 22:
                return new t501(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 23:
                return new p901(parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new xd01(parcel.readString());
            case 25:
                parcel.readInt();
                return kj01.a;
            case 26:
                long j = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readParcelable(lj01.class.getClassLoader()), Long.valueOf(parcel.readLong()));
                }
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readParcelable(lj01.class.getClassLoader()));
                }
                return new lj01(j, z, linkedHashMap, linkedHashSet, parcel.readInt() != 0);
            case 27:
                return new pj01(parcel.readString(), sl01.valueOf(parcel.readString()), (w4i1) w4i1.CREATOR.createFromParcel(parcel));
            case 28:
                return new qj01(parcel.readInt(), parcel.readString(), parcel.readString());
            default:
                String string5 = parcel.readString();
                yor0 yor0Var = yor0.c;
                Paragraph paragraphD = yor0Var.d(parcel);
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (string7.equals("SQUARE")) {
                        i = 1;
                    } else {
                        if (string7.equals("CIRCLE")) {
                            i3 = 2;
                        } else if (string7.equals("ROUNDED")) {
                            i3 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.campaigns.wrapped.receipt.mobius.ImageShape.".concat(string7));
                        }
                        i = i3;
                    }
                    Paragraph paragraphD2 = yor0Var.d(parcel);
                    Paragraph paragraphD3 = yor0Var.d(parcel);
                    Paragraph paragraphD4 = yor0Var.d(parcel);
                    String string8 = parcel.readString();
                    i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    while (iH != i2) {
                        iH = dsl0.d(s8a.CREATOR, parcel, arrayList, iH, 1);
                    }
                    return new rj01(string5, paragraphD, string6, i, paragraphD2, paragraphD3, paragraphD4, string8, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                Paragraph paragraphD5 = yor0Var.d(parcel);
                Paragraph paragraphD6 = yor0Var.d(parcel);
                Paragraph paragraphD7 = yor0Var.d(parcel);
                String string9 = parcel.readString();
                i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iH != i2) {
                    iH = dsl0.d(s8a.CREATOR, parcel, arrayList, iH, 1);
                }
                return new rj01(string5, paragraphD, string6, i, paragraphD5, paragraphD6, paragraphD7, string9, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new frz0[i];
            case 1:
                return new grz0[i];
            case 2:
                return new hrz0[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new osz0[i];
            case 5:
                return new muz0[i];
            case 6:
                return new cwz0[i];
            case 7:
                return new dwz0[i];
            case 8:
                return new ewz0[i];
            case 9:
                return new fxz0[i];
            case 10:
                return new gxz0[i];
            case 11:
                return new pxz0[i];
            case 12:
                return new rxz0[i];
            case 13:
                return new o001[i];
            case 14:
                return new q001[i];
            case 15:
                return new w001[i];
            case 16:
                return new l201[i];
            case 17:
                return new c401[i];
            case 18:
                return new b401[i];
            case 19:
                return new d401[i];
            case 20:
                return new o501[i];
            case 21:
                return new s501[i];
            case 22:
                return new t501[i];
            case 23:
                return new p901[i];
            case 24:
                return new xd01[i];
            case 25:
                return new kj01[i];
            case 26:
                return new lj01[i];
            case 27:
                return new pj01[i];
            case 28:
                return new qj01[i];
            default:
                return new rj01[i];
        }
    }
}
