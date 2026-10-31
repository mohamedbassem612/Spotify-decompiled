package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qxp0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ qxp0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new sxp0(parcel.readString(), parcel.readString());
            case 1:
                return new txp0(parcel.readString());
            case 2:
                return new uxp0(parcel.readString());
            case 3:
                int iD = 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(oxp0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new yxp0(arrayList);
            case 4:
                int iD2 = 0;
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iD2 != i2) {
                    iD2 = dsl0.d(pxp0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new zxp0(arrayList2);
            case 5:
                return new p2q0(parcel.readString(), parcel.readString());
            case 6:
                parcel.readInt();
                return q2q0.a;
            case 7:
                return new v5q0(parcel.readInt(), parcel.readInt(), (jnt) parcel.readParcelable(v5q0.class.getClassLoader()), izn0.CREATOR.createFromParcel(parcel));
            case 8:
                int iD3 = 0;
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iD3 != i3) {
                    iD3 = dsl0.d(u7q0.CREATOR, parcel, arrayList3, iD3, 1);
                }
                return new w5q0(mqo1.F(arrayList3), parcel.readString(), (jnt) parcel.readParcelable(w5q0.class.getClassLoader()), izn0.CREATOR.createFromParcel(parcel));
            case 9:
                return new x5q0(parcel.readInt(), parcel.readInt(), (jnt) parcel.readParcelable(x5q0.class.getClassLoader()), izn0.CREATOR.createFromParcel(parcel));
            case 10:
                int i4 = 0;
                u7q0 u7q0Var = (u7q0) u7q0.CREATOR.createFromParcel(parcel);
                jnt jntVar = (jnt) parcel.readParcelable(y5q0.class.getClassLoader());
                izn0 izn0VarCreateFromParcel = izn0.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                if (string == null) {
                    bhn0.i("Name is null");
                } else if (string.equals("USER_STATUS_ACTIVE")) {
                    i4 = 1;
                } else if (string.equals("USER_STATUS_DISABLED")) {
                    i4 = 2;
                } else if (string.equals("USER_STATUS_NOT_ACCEPTED")) {
                    i4 = 3;
                } else {
                    hhg1.n("No enum constant com.spotify.campfire.share.impl.data.OnPlatformAppDestination.Single.Status.".concat(string));
                }
                return new y5q0(u7q0Var, jntVar, izn0VarCreateFromParcel, i4);
            case 11:
                return new z5q0(parcel.readInt(), parcel.readInt(), (jnt) parcel.readParcelable(z5q0.class.getClassLoader()), izn0.CREATOR.createFromParcel(parcel));
            case 12:
                return new c6q0(parcel.readInt(), parcel.readInt(), fd21.t(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 13:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iH = 0;
                while (iH != i5) {
                    iH = x0d.h(d6q0.class, parcel, arrayList4, iH, 1);
                }
                return new d6q0(arrayList4, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, h4b1.p(parcel.readString()), ywx0.t(parcel.readString()), fd21.t(parcel.readString()));
            case 14:
                return new e6q0(parcel.readInt(), parcel.readInt(), fd21.t(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 15:
                return new g6q0(parcel.readInt(), parcel.readInt(), fd21.t(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 16:
                return new h6q0(parcel.readParcelable(h6q0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, h4b1.p(parcel.readString()), ywx0.t(parcel.readString()), fd21.t(parcel.readString()));
            case 17:
                return new i6q0(parcel.readInt(), parcel.readInt(), fd21.t(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new s6q0(parcel.createStringArrayList());
            case 19:
                return new t6q0(parcel.readString(), parcel.readString());
            case 20:
                return new e7q0(parcel.readString());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new f7q0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (s7q0) parcel.readParcelable(f7q0.class.getClassLoader()), (sge0) (parcel.readInt() == 0 ? null : sge0.CREATOR.createFromParcel(parcel)), parcel.readParcelable(f7q0.class.getClassLoader()));
            case 22:
                return new g7q0(parcel.readString());
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new h7q0((apl) parcel.readParcelable(h7q0.class.getClassLoader()));
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new i7q0(parcel.readString(), parcel.readString());
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new j7q0(parcel.readString());
            case 26:
                return new k7q0(parcel.readString());
            case 27:
                return new m7q0(parcel.readString(), parcel.readLong(), parcel.readLong(), (l7q0) parcel.readParcelable(m7q0.class.getClassLoader()));
            case 28:
                return new n7q0(parcel.readString());
            default:
                return new o7q0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sxp0[i];
            case 1:
                return new txp0[i];
            case 2:
                return new uxp0[i];
            case 3:
                return new yxp0[i];
            case 4:
                return new zxp0[i];
            case 5:
                return new p2q0[i];
            case 6:
                return new q2q0[i];
            case 7:
                return new v5q0[i];
            case 8:
                return new w5q0[i];
            case 9:
                return new x5q0[i];
            case 10:
                return new y5q0[i];
            case 11:
                return new z5q0[i];
            case 12:
                return new c6q0[i];
            case 13:
                return new d6q0[i];
            case 14:
                return new e6q0[i];
            case 15:
                return new g6q0[i];
            case 16:
                return new h6q0[i];
            case 17:
                return new i6q0[i];
            case 18:
                return new s6q0[i];
            case 19:
                return new t6q0[i];
            case 20:
                return new e7q0[i];
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new f7q0[i];
            case 22:
                return new g7q0[i];
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new h7q0[i];
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new i7q0[i];
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new j7q0[i];
            case 26:
                return new k7q0[i];
            case 27:
                return new m7q0[i];
            case 28:
                return new n7q0[i];
            default:
                return new o7q0[i];
        }
    }
}
