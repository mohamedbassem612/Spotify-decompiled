package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e211 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:117:0x029d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string;
        int iH = 0;
        switch (this.a) {
            case 0:
                return new f211(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                int i2 = 1;
                f211 f211VarCreateFromParcel = f211.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("Follow")) {
                        i = 1;
                    } else if (string2.equals("UnFollow")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.recommendedplaylist.RecommendedPlaylistElement.LibraryStatus.".concat(string2));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (!string.equals("PLAYING")) {
                            if (string.equals("PAUSED")) {
                                i2 = 2;
                            } else if (string.equals("NONE")) {
                                i2 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.recommendedplaylist.RecommendedPlaylistElement.PlayState.".concat(string));
                            }
                        }
                        return new g211(f211VarCreateFromParcel, i, i2);
                    }
                    bhn0.i("Name is null");
                    i2 = 0;
                    return new g211(f211VarCreateFromParcel, i, i2);
                }
                bhn0.i("Name is null");
                i = 0;
                string = parcel.readString();
                if (string != null) {
                    if (!string.equals("PLAYING")) {
                        if (string.equals("PAUSED")) {
                            i2 = 2;
                        } else if (string.equals("NONE")) {
                            i2 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.recommendedplaylist.RecommendedPlaylistElement.PlayState.".concat(string));
                        }
                    }
                    return new g211(f211VarCreateFromParcel, i, i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new g211(f211VarCreateFromParcel, i, i2);
            case 2:
                return new u211(parcel.readString(), parcel.readString());
            case 3:
                return new e311(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 4:
                return new o711((j65) (parcel.readInt() == 0 ? null : j65.CREATOR.createFromParcel(parcel)));
            case 5:
                return new rd11(parcel.readString(), parcel.readString());
            case 6:
                return new nh11(parcel.readString());
            case 7:
                return new ol11(parcel.readString(), parcel.readString());
            case 8:
                return new qm11(parcel.readString(), parcel.readString());
            case 9:
                cxn parcelable = parcel.readParcelable(zv11.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                while (iH != i3) {
                    linkedHashSet.add(m620.CREATOR.createFromParcel(parcel));
                    iH++;
                }
                return new zv11(parcelable, linkedHashSet);
            case 10:
                return new aw11(m620.CREATOR.createFromParcel(parcel));
            case 11:
                return new bw11(m620.CREATOR.createFromParcel(parcel));
            case 12:
                parcel.readInt();
                return cw11.a;
            case 13:
                return new dw11((sx11) parcel.readParcelable(dw11.class.getClassLoader()));
            case 14:
                return new ew11(m620.CREATOR.createFromParcel(parcel), parcel.readString());
            case 15:
                return new fw11(m620.CREATOR.createFromParcel(parcel), parcel.readString());
            case 16:
                cxn parcelable2 = parcel.readParcelable(yw11.class.getClassLoader());
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashSet2.add(m620.CREATOR.createFromParcel(parcel));
                }
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                while (iH != i6) {
                    iH = x0d.h(yw11.class, parcel, arrayList, iH, 1);
                }
                return new yw11(parcelable2, linkedHashSet2, arrayList);
            case 17:
                return new kx11(parcel.readString(), parcel.readParcelable(kx11.class.getClassLoader()), parcel.readString());
            case 18:
                return new px11(yw11.CREATOR.createFromParcel(parcel));
            case 19:
                return new qx11((Throwable) parcel.readSerializable());
            case 20:
                parcel.readInt();
                return rx11.a;
            case 21:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i7);
                while (iH != i7) {
                    iH = k4s0.g(parcel, linkedHashSet3, iH, 1);
                }
                return new tx11(string3, string4, linkedHashSet3);
            case 22:
                return new ux11(parcel.readString(), parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new vx11(parcel.readString());
            case 24:
                return new wx11(parcel.readString(), parcel.readString(), parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new d221(parcel.readParcelable(d221.class.getClassLoader()), parcel.readParcelable(d221.class.getClassLoader()));
            case 26:
                parcel.readInt();
                return e221.a;
            case 27:
                String string5 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                int iH2 = 0;
                while (iH2 != i8) {
                    iH2 = x0d.h(k221.class, parcel, arrayList2, iH2, 1);
                }
                return new k221(string5, z, mqo1.F(arrayList2), parcel.readInt(), parcel.readParcelable(k221.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(k221.class.getClassLoader()));
            case 28:
                return new o221(parcel.readString(), parcel.readString());
            default:
                return new t221(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f211[i];
            case 1:
                return new g211[i];
            case 2:
                return new u211[i];
            case 3:
                return new e311[i];
            case 4:
                return new o711[i];
            case 5:
                return new rd11[i];
            case 6:
                return new nh11[i];
            case 7:
                return new ol11[i];
            case 8:
                return new qm11[i];
            case 9:
                return new zv11[i];
            case 10:
                return new aw11[i];
            case 11:
                return new bw11[i];
            case 12:
                return new cw11[i];
            case 13:
                return new dw11[i];
            case 14:
                return new ew11[i];
            case 15:
                return new fw11[i];
            case 16:
                return new yw11[i];
            case 17:
                return new kx11[i];
            case 18:
                return new px11[i];
            case 19:
                return new qx11[i];
            case 20:
                return new rx11[i];
            case 21:
                return new tx11[i];
            case 22:
                return new ux11[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new vx11[i];
            case 24:
                return new wx11[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new d221[i];
            case 26:
                return new e221[i];
            case 27:
                return new k221[i];
            case 28:
                return new o221[i];
            default:
                return new t221[i];
        }
    }
}
