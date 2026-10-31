package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mra implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x0176  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        switch (this.a) {
            case 0:
                return new nra(parcel.readString(), parcel.readInt() == 0 ? null : tco.CREATOR.createFromParcel(parcel));
            case 1:
                return new ora(parcel.readString(), parcel.readInt() != 0);
            case 2:
                return new ata(parcel.readString(), parcel.readString());
            case 3:
                return new qta(parcel.readString());
            case 4:
                return new rta(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 5:
                return new sta(parcel.readInt());
            case 6:
                return new hua(parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new zva(parcel.readString());
            case 8:
                return new jwa(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(jwa.class.getClassLoader()));
            case 9:
                return new a3b(parcel.readString(), parcel.readString());
            case 10:
                return new b3b(parcel.readString(), parcel.readString());
            case 11:
                return new c3b(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                int iD = 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(ekc1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new x6b(arrayList);
            case 13:
                return new q8b(parcel.createStringArrayList(), parcel.readInt() != 0);
            case 14:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("NOT_STARTED")) {
                        i = 1;
                    } else if (string3.equals("IN_PROGRESS")) {
                        i = 2;
                    } else if (string3.equals("FINISHED")) {
                        i = 3;
                    } else if (string3.equals("UNRECOGNIZED")) {
                        i = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo.State.".concat(string3));
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("OPEN")) {
                            i2 = 1;
                        } else if (string.equals("LOCKED")) {
                            i2 = 2;
                        } else if (string.equals("CAPPED")) {
                            i2 = 3;
                        } else if (string.equals("UNRECOGNIZED")) {
                            i2 = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo.Access.".concat(string));
                        }
                        return new tlb(i, i2, parcel.readInt(), parcel.readLong(), string2);
                    }
                    bhn0.i("Name is null");
                    i2 = 0;
                    return new tlb(i, i2, parcel.readInt(), parcel.readLong(), string2);
                }
                bhn0.i("Name is null");
                i = 0;
                string = parcel.readString();
                if (string != null) {
                    if (string.equals("OPEN")) {
                        i2 = 1;
                    } else if (string.equals("LOCKED")) {
                        i2 = 2;
                    } else if (string.equals("CAPPED")) {
                        i2 = 3;
                    } else if (string.equals("UNRECOGNIZED")) {
                        i2 = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo.Access.".concat(string));
                    }
                    return new tlb(i, i2, parcel.readInt(), parcel.readLong(), string2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new tlb(i, i2, parcel.readInt(), parcel.readLong(), string2);
            case 15:
                return jpb.valueOf(parcel.readString());
            case 16:
                return new lvb(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.readInt();
                return iwb.a;
            case 18:
                return new jwb((swb) swb.CREATOR.createFromParcel(parcel));
            case 19:
                return new kwb((swb) swb.CREATOR.createFromParcel(parcel));
            case 20:
                hux parcelable = parcel.readParcelable(swb.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z4 = false;
                String string9 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                String string10 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = z4;
                    z2 = z;
                }
                String string11 = parcel.readString();
                if (parcel.readInt() != 0) {
                    str = string11;
                    z3 = true;
                } else {
                    z3 = z;
                    str = string11;
                }
                return new swb(parcelable, string4, string5, string6, string7, string8, string9, z4, string10, z2, str, z3);
            case 21:
                return new axb(parcel.readParcelable(axb.class.getClassLoader()));
            case 22:
                return new pxb(parcel.readParcelable(pxb.class.getClassLoader()));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new ryb(i4, arrayList2);
            case 24:
                parcel.readInt();
                return syb.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                parcel.readInt();
                return tyb.a;
            case 26:
                parcel.readInt();
                return uyb.a;
            case 27:
                parcel.readInt();
                return vyb.a;
            case 28:
                parcel.readInt();
                return wyb.a;
            default:
                parcel.readInt();
                return xyb.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nra[i];
            case 1:
                return new ora[i];
            case 2:
                return new ata[i];
            case 3:
                return new qta[i];
            case 4:
                return new rta[i];
            case 5:
                return new sta[i];
            case 6:
                return new hua[i];
            case 7:
                return new zva[i];
            case 8:
                return new jwa[i];
            case 9:
                return new a3b[i];
            case 10:
                return new b3b[i];
            case 11:
                return new c3b[i];
            case 12:
                return new x6b[i];
            case 13:
                return new q8b[i];
            case 14:
                return new tlb[i];
            case 15:
                return new jpb[i];
            case 16:
                return new lvb[i];
            case 17:
                return new iwb[i];
            case 18:
                return new jwb[i];
            case 19:
                return new kwb[i];
            case 20:
                return new swb[i];
            case 21:
                return new axb[i];
            case 22:
                return new pxb[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new ryb[i];
            case 24:
                return new syb[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new tyb[i];
            case 26:
                return new uyb[i];
            case 27:
                return new vyb[i];
            case 28:
                return new wyb[i];
            default:
                return new xyb[i];
        }
    }
}
