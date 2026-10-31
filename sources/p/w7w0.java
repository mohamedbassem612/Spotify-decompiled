package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w7w0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string;
        int i2 = 1;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new x7w0(parcel.readString());
            case 1:
                parcel.readInt();
                return i8w0.a;
            case 2:
                parcel.readInt();
                return j8w0.a;
            case 3:
                parcel.readInt();
                return k8w0.a;
            case 4:
                return new l8w0(b8w0.valueOf(parcel.readString()));
            case 5:
                return new y9w0(parcel.readLong(), (w4i1) parcel.readParcelable(y9w0.class.getClassLoader()), parcel.readParcelable(y9w0.class.getClassLoader()));
            case 6:
                return new jaw0(parcel.readString(), parcel.readString());
            case 7:
                return new aaw0(parcel.readLong(), (w4i1) parcel.readParcelable(aaw0.class.getClassLoader()));
            case 8:
                return new baw0(parcel.readLong(), (w4i1) parcel.readParcelable(baw0.class.getClassLoader()), parcel.readString());
            case 9:
                int i3 = 0;
                long j = parcel.readLong();
                w4i1 w4i1Var = (w4i1) parcel.readParcelable(caw0.class.getClassLoader());
                String string2 = parcel.readString();
                if (string2 == null) {
                    bhn0.i("Name is null");
                } else if (string2.equals("Reported")) {
                    i3 = 1;
                } else if (string2.equals("Removed")) {
                    i3 = 2;
                } else {
                    hhg1.n("No enum constant com.spotify.campfire.utils.formatters.preview.Preview.Moderated.Type.".concat(string2));
                }
                return new caw0(j, w4i1Var, i3);
            case 10:
                return new daw0(parcel.readLong(), (w4i1) parcel.readParcelable(daw0.class.getClassLoader()));
            case 11:
                return new eaw0(parcel.readLong(), (w4i1) parcel.readParcelable(eaw0.class.getClassLoader()), parcel.readString());
            case 12:
                return new faw0(parcel.readLong(), (w4i1) parcel.readParcelable(faw0.class.getClassLoader()), parcel.readParcelable(faw0.class.getClassLoader()));
            case 13:
                return new gaw0(parcel.readLong(), (w4i1) parcel.readParcelable(gaw0.class.getClassLoader()), parcel.readString(), parcel.readParcelable(gaw0.class.getClassLoader()), parcel.readParcelable(gaw0.class.getClassLoader()));
            case 14:
                return new iaw0(parcel.readLong(), (w4i1) parcel.readParcelable(iaw0.class.getClassLoader()));
            case 15:
                int iG = 0;
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
                while (iG != i4) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new djw0(string3, parcel.readString(), parcel.readString(), parcel.readString(), linkedHashSet);
            case 16:
                return new ilw0(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 17:
                return new jlw0(parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                String string4 = parcel.readString();
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("LANDSCAPE")) {
                        i = 1;
                    } else if (string5.equals("PORTRAIT")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.share.models.PreviewShareMedia.Video.VideoOrientation.".concat(string5));
                    }
                    return new klw0(string4, j2, j3, z, z2, i, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                return new klw0(string4, j2, j3, z, z2, i, parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new opw0(parcel.readInt() != 0);
            case 20:
                return tpw0.valueOf(parcel.readString());
            case 21:
                parcel.readInt();
                return oqw0.a;
            case 22:
                return new pqw0(parcel.readString());
            case 23:
                parcel.readInt();
                return qqw0.a;
            case 24:
                parcel.readInt();
                return rqw0.a;
            case 25:
                return new tsw0(parcel.createStringArrayList());
            case 26:
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(qnc1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new usw0(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : nf21.valueOf(parcel.readString()));
            case 27:
                parcel.readInt();
                return ysw0.a;
            case 28:
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (!string6.equals("GROUP_TOP")) {
                        if (string6.equals("GROUP_MIDDLE")) {
                            i2 = 2;
                        } else if (string6.equals("GROUP_BOTTOM")) {
                            i2 = 3;
                        } else if (string6.equals("GROUP_SINGLE_ITEM")) {
                            i2 = 4;
                        } else if (string6.equals("UNGROUPED")) {
                            i2 = 5;
                        } else {
                            hhg1.n("No enum constant com.spotify.checkout.elements.model.ProductBreakdownRowType.".concat(string6));
                        }
                    }
                    string = parcel.readString();
                    if (string != null) {
                        bhn0.i("Name is null");
                    } else if (string.equals("DEFAULT")) {
                        iD = 1;
                    } else if (string.equals("ADDED")) {
                        iD = 2;
                    } else if (string.equals("REMOVED")) {
                        iD = 3;
                    } else if (string.equals("STRIKETHROUGH")) {
                        iD = 4;
                    } else if (string.equals("BOLD")) {
                        iD = 5;
                    } else {
                        hhg1.n("No enum constant com.spotify.checkout.elements.model.ProductBreakdownRowStyle.".concat(string));
                    }
                    return new zsw0(i2, iD, parcel.readString(), parcel.readString(), parcel.readString());
                }
                bhn0.i("Name is null");
                i2 = 0;
                string = parcel.readString();
                if (string != null) {
                    bhn0.i("Name is null");
                } else if (string.equals("DEFAULT")) {
                    iD = 1;
                } else if (string.equals("ADDED")) {
                    iD = 2;
                } else if (string.equals("REMOVED")) {
                    iD = 3;
                } else if (string.equals("STRIKETHROUGH")) {
                    iD = 4;
                } else if (string.equals("BOLD")) {
                    iD = 5;
                } else {
                    hhg1.n("No enum constant com.spotify.checkout.elements.model.ProductBreakdownRowStyle.".concat(string));
                }
                return new zsw0(i2, iD, parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new gtw0(parcel.readString(), ioc1.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x7w0[i];
            case 1:
                return new i8w0[i];
            case 2:
                return new j8w0[i];
            case 3:
                return new k8w0[i];
            case 4:
                return new l8w0[i];
            case 5:
                return new y9w0[i];
            case 6:
                return new jaw0[i];
            case 7:
                return new aaw0[i];
            case 8:
                return new baw0[i];
            case 9:
                return new caw0[i];
            case 10:
                return new daw0[i];
            case 11:
                return new eaw0[i];
            case 12:
                return new faw0[i];
            case 13:
                return new gaw0[i];
            case 14:
                return new iaw0[i];
            case 15:
                return new djw0[i];
            case 16:
                return new ilw0[i];
            case 17:
                return new jlw0[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new klw0[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new opw0[i];
            case 20:
                return new tpw0[i];
            case 21:
                return new oqw0[i];
            case 22:
                return new pqw0[i];
            case 23:
                return new qqw0[i];
            case 24:
                return new rqw0[i];
            case 25:
                return new tsw0[i];
            case 26:
                return new usw0[i];
            case 27:
                return new ysw0[i];
            case 28:
                return new zsw0[i];
            default:
                return new gtw0[i];
        }
    }
}
