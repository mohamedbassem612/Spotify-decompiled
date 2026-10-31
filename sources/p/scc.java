package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class scc implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                Bundle bundle = parcel.readBundle(scc.class.getClassLoader());
                Objects.requireNonNull(bundle);
                return new tcc(bundle);
            case 1:
                return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createStringArrayList(), parcel.readLong());
            case 2:
                return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            case 3:
                return new f(parcel.readString(), parcel.readString());
            case 4:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iD = 0;
                while (iD != i) {
                    iD = dsl0.d(f.CREATOR, parcel, arrayList2, iD, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i2);
                    int iD2 = 0;
                    while (iD2 != i2) {
                        iD2 = dsl0.d(h.CREATOR, parcel, arrayList3, iD2, 1);
                    }
                    arrayList = arrayList3;
                }
                return new g(string, string2, string3, string4, z, z2, z3, z4, z5, arrayList2, arrayList, parcel.readInt() != 0);
            case 5:
                return new h(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new u2(parcel.readString(), parcel.readString());
            case 7:
                return new z3(parcel.readString());
            case 8:
                return new m4(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(m4.class.getClassLoader()));
            case 9:
                return new e5(parcel.readString(), parcel.createStringArrayList());
            case 10:
                return new f5(parcel.readString(), parcel.createStringArrayList());
            case 11:
                return new sb((qc) parcel.readValue(sb.class.getClassLoader()), (nc) parcel.readValue(sb.class.getClassLoader()), (hc) parcel.readValue(sb.class.getClassLoader()), (zc) parcel.readValue(sb.class.getClassLoader()), parcel.readInt() != 0);
            case 12:
                return new tb((ed) parcel.readValue(tb.class.getClassLoader()), (wc) parcel.readValue(tb.class.getClassLoader()), (zc) parcel.readValue(tb.class.getClassLoader()), (nc) parcel.readValue(tb.class.getClassLoader()), (hc) parcel.readValue(tb.class.getClassLoader()), parcel.readInt() != 0);
            case 13:
                return new ec(parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                parcel.readInt();
                return fc.a;
            case 15:
                return new gc(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 16:
                return new ic(parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                parcel.readInt();
                return jc.a;
            case 18:
                return new kc(parcel.readInt() != 0, parcel.readInt() != 0);
            case 19:
                return new lc(parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                return new mc(parcel.readInt() != 0, parcel.readInt() != 0);
            case 21:
                return new oc(parcel.readInt() != 0);
            case 22:
                parcel.readInt();
                return pc.a;
            case 23:
                return new rc(parcel.readInt() != 0);
            case 24:
                parcel.readInt();
                return sc.a;
            case 25:
                parcel.readInt();
                return tc.a;
            case 26:
                parcel.readInt();
                return uc.a;
            case 27:
                parcel.readInt();
                return vc.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                parcel.readInt();
                return xc.a;
            default:
                return new yc(parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tcc[i];
            case 1:
                return new d[i];
            case 2:
                return new e[i];
            case 3:
                return new f[i];
            case 4:
                return new g[i];
            case 5:
                return new h[i];
            case 6:
                return new u2[i];
            case 7:
                return new z3[i];
            case 8:
                return new m4[i];
            case 9:
                return new e5[i];
            case 10:
                return new f5[i];
            case 11:
                return new sb[i];
            case 12:
                return new tb[i];
            case 13:
                return new ec[i];
            case 14:
                return new fc[i];
            case 15:
                return new gc[i];
            case 16:
                return new ic[i];
            case 17:
                return new jc[i];
            case 18:
                return new kc[i];
            case 19:
                return new lc[i];
            case 20:
                return new mc[i];
            case 21:
                return new oc[i];
            case 22:
                return new pc[i];
            case 23:
                return new rc[i];
            case 24:
                return new sc[i];
            case 25:
                return new tc[i];
            case 26:
                return new uc[i];
            case 27:
                return new vc[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new xc[i];
            default:
                return new yc[i];
        }
    }
}
