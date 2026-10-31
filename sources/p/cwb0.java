package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cwb0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                return new dwb0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(dwb0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), us71.s(parcel.readString()));
            case 1:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(dwb0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ewb0(arrayList, (dwb0) (parcel.readInt() == 0 ? null : dwb0.CREATOR.createFromParcel(parcel)), parcel.readString());
            case 2:
                return new n2c0(parcel.readInt(), parcel.readInt(), parcel.readParcelable(n2c0.class.getClassLoader()), parcel.readParcelable(n2c0.class.getClassLoader()), parcel.readParcelable(n2c0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 3:
                return new o2c0(parcel.readParcelable(o2c0.class.getClassLoader()), parcel.readParcelable(o2c0.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readParcelable(o2c0.class.getClassLoader()));
            case 4:
                return new p2c0(q2c0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 5:
                return q2c0.valueOf(parcel.readString());
            case 6:
                boolean z = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readParcelable(t2c0.class.getClassLoader()), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new t2c0(z, mqo1.G(linkedHashMap));
            case 7:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iD != i4) {
                    iD = x0d.h(y4c0.class, parcel, arrayList2, iD, 1);
                }
                return new y4c0(arrayList2);
            case 8:
                parcel.readInt();
                return z4c0.b;
            case 9:
                parcel.readInt();
                return a5c0.b;
            case 10:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iH = 0;
                while (iH != i5) {
                    iH = x0d.h(b5c0.class, parcel, arrayList3, iH, 1);
                }
                return new b5c0(arrayList3, parcel.readInt() != 0);
            case 11:
                parcel.readInt();
                return c5c0.b;
            case 12:
                parcel.readInt();
                return d5c0.b;
            case 13:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                while (iD != i6) {
                    iD = x0d.h(e5c0.class, parcel, arrayList4, iD, 1);
                }
                return new e5c0(arrayList4);
            case 14:
                parcel.readInt();
                return f5c0.b;
            case 15:
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                while (iD != i7) {
                    iD = x0d.h(g5c0.class, parcel, arrayList5, iD, 1);
                }
                return new g5c0(arrayList5);
            case 16:
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                while (iD != i8) {
                    iD = x0d.h(h5c0.class, parcel, arrayList6, iD, 1);
                }
                return new h5c0(arrayList6);
            case 17:
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                while (iD != i9) {
                    iD = x0d.h(i5c0.class, parcel, arrayList7, iD, 1);
                }
                return new i5c0(arrayList7);
            case 18:
                int i10 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i10);
                while (iD != i10) {
                    iD = x0d.h(j5c0.class, parcel, arrayList8, iD, 1);
                }
                return new j5c0(arrayList8);
            case 19:
                parcel.readInt();
                return k5c0.b;
            case 20:
                parcel.readInt();
                return l5c0.b;
            case 21:
                parcel.readInt();
                return m5c0.b;
            case 22:
                parcel.readInt();
                return n5c0.b;
            case 23:
                parcel.readInt();
                return o5c0.b;
            case 24:
                parcel.readInt();
                return p5c0.b;
            case 25:
                int i11 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i11);
                while (iD != i11) {
                    iD = x0d.h(q5c0.class, parcel, arrayList9, iD, 1);
                }
                return new q5c0(arrayList9);
            case 26:
                int i12 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i12);
                while (iD != i12) {
                    iD = x0d.h(r5c0.class, parcel, arrayList10, iD, 1);
                }
                return new r5c0(arrayList10);
            case 27:
                parcel.readInt();
                return s5c0.b;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                int i13 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i13);
                while (iD != i13) {
                    iD = x0d.h(t5c0.class, parcel, arrayList11, iD, 1);
                }
                return new t5c0(arrayList11);
            default:
                parcel.readInt();
                return u5c0.b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dwb0[i];
            case 1:
                return new ewb0[i];
            case 2:
                return new n2c0[i];
            case 3:
                return new o2c0[i];
            case 4:
                return new p2c0[i];
            case 5:
                return new q2c0[i];
            case 6:
                return new t2c0[i];
            case 7:
                return new y4c0[i];
            case 8:
                return new z4c0[i];
            case 9:
                return new a5c0[i];
            case 10:
                return new b5c0[i];
            case 11:
                return new c5c0[i];
            case 12:
                return new d5c0[i];
            case 13:
                return new e5c0[i];
            case 14:
                return new f5c0[i];
            case 15:
                return new g5c0[i];
            case 16:
                return new h5c0[i];
            case 17:
                return new i5c0[i];
            case 18:
                return new j5c0[i];
            case 19:
                return new k5c0[i];
            case 20:
                return new l5c0[i];
            case 21:
                return new m5c0[i];
            case 22:
                return new n5c0[i];
            case 23:
                return new o5c0[i];
            case 24:
                return new p5c0[i];
            case 25:
                return new q5c0[i];
            case 26:
                return new r5c0[i];
            case 27:
                return new s5c0[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new t5c0[i];
            default:
                return new u5c0[i];
        }
    }
}
