package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserListeningStatus;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pwd1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:100:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new qwd1(parcel.readInt(), (hct0) parcel.readParcelable(qwd1.class.getClassLoader()));
            case 1:
                parcel.readInt();
                return new syd1();
            case 2:
                parcel.readInt();
                return v2e1.a;
            case 3:
                return new w2e1(parcel.readString());
            case 4:
                parcel.readInt();
                return x2e1.a;
            case 5:
                return new a3e1(parcel.readParcelable(a3e1.class.getClassLoader()), lf51.r(parcel.readString()), parcel.readParcelable(a3e1.class.getClassLoader()), parcel.readString(), parcel.readParcelable(a3e1.class.getClassLoader()).a, parcel.readParcelable(a3e1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (Uri) parcel.readParcelable(a3e1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(a3e1.class.getClassLoader()), (wkt) null, parcel.readString());
            case 6:
                return new c3e1(parcel.readParcelable(c3e1.class.getClassLoader()).a, parcel.readParcelable(c3e1.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(c3e1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readParcelable(c3e1.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 7:
                return new cae1(parcel.readInt(), parcel.readInt());
            case 8:
                return new mbe1(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 9:
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(h960.CREATOR, parcel, arrayList, iD, 1);
                }
                return new oce1(j, j2, string, string2, arrayList);
            case 10:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                boolean z2 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("Word")) {
                        i = 1;
                    } else {
                        if (string5.equals("Sentenced")) {
                            i2 = 2;
                        } else if (string5.equals("Static")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.transcript.listimpl.element.textsentence.TextSentenceElement.SyncStatus.".concat(string5));
                        }
                        i = i2;
                    }
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new tde1(string3, string4, i4, z2, i, i5, i6, z, parcel.readInt());
                }
                bhn0.i("Name is null");
                i = 0;
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new tde1(string3, string4, i4, z2, i, i7, i8, z, parcel.readInt());
            case 11:
                int i9 = parcel.readInt();
                String string6 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                while (iD != i10) {
                    iD = dsl0.d(mbe1.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new yde1(string6, arrayList2, i9);
            case 12:
                return new dee1(parcel.readString());
            case 13:
                return new eee1(parcel.readParcelable(eee1.class.getClassLoader()));
            case 14:
                return new dle1(parcel.readString(), parcel.readString());
            case 15:
                return new ile1(parcel.readString(), parcel.readString());
            case 16:
                return new ole1(parcel.readString(), parcel.readInt() != 0);
            case 17:
                return new dme1(parcel.readInt() != 0, parcel.readString());
            case 18:
                return new rqe1(parcel.readInt(), (mqe1) parcel.readParcelable(rqe1.class.getClassLoader()), (srt0) parcel.readParcelable(rqe1.class.getClassLoader()), parcel.readParcelable(rqe1.class.getClassLoader()).a);
            case 19:
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                while (iD != i11) {
                    iD = dsl0.d(dme1.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new fqe1(arrayList3);
            case 20:
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                while (iD != i12) {
                    iD = dsl0.d(cte1.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new gqe1(arrayList4);
            case 21:
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                while (iD != i13) {
                    iD = dsl0.d(cte1.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new hqe1(arrayList5, (ure1) parcel.readParcelable(hqe1.class.getClassLoader()), parcel.readInt());
            case 22:
                parcel.readInt();
                return iqe1.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                while (iD != i14) {
                    iD = dsl0.d(cte1.CREATOR, parcel, arrayList6, iD, 1);
                }
                return new jqe1(parcel.readInt(), arrayList6);
            case 24:
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                while (iD != i15) {
                    iD = dsl0.d(cte1.CREATOR, parcel, arrayList7, iD, 1);
                }
                return new kqe1(arrayList7, parcel.readInt());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new lqe1(UserListeningStatus.q(parcel.createByteArray()));
            case 26:
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                while (iD != i16) {
                    iD = x0d.h(nqe1.class, parcel, arrayList8, iD, 1);
                }
                return new nqe1(arrayList8);
            case 27:
                parcel.readInt();
                return sre1.a;
            case 28:
                parcel.readInt();
                return tre1.a;
            default:
                return new kse1(parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qwd1[i];
            case 1:
                return new syd1[i];
            case 2:
                return new v2e1[i];
            case 3:
                return new w2e1[i];
            case 4:
                return new x2e1[i];
            case 5:
                return new a3e1[i];
            case 6:
                return new c3e1[i];
            case 7:
                return new cae1[i];
            case 8:
                return new mbe1[i];
            case 9:
                return new oce1[i];
            case 10:
                return new tde1[i];
            case 11:
                return new yde1[i];
            case 12:
                return new dee1[i];
            case 13:
                return new eee1[i];
            case 14:
                return new dle1[i];
            case 15:
                return new ile1[i];
            case 16:
                return new ole1[i];
            case 17:
                return new dme1[i];
            case 18:
                return new rqe1[i];
            case 19:
                return new fqe1[i];
            case 20:
                return new gqe1[i];
            case 21:
                return new hqe1[i];
            case 22:
                return new iqe1[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new jqe1[i];
            case 24:
                return new kqe1[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new lqe1[i];
            case 26:
                return new nqe1[i];
            case 27:
                return new sre1[i];
            case 28:
                return new tre1[i];
            default:
                return new kse1[i];
        }
    }
}
