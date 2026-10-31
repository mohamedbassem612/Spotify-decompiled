package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;
import androidx.versionedparcelable.ParcelImpl;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class elr0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2 = 3;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new flr0(parcel.readInt(), parcel.readInt());
            case 1:
                return new mlr0(parcel.readInt() != 0, parcel.readString());
            case 2:
                parcel.readInt();
                return jlr0.a;
            case 3:
                return new klr0(parcel.readString(), parcel.readInt() != 0);
            case 4:
                return new imr0(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new cor0(parcel.readString(), parcel.readString());
            case 6:
                return new dor0(parcel.readString(), parcel.readString());
            case 7:
                return new lor0(parcel.readString());
            case 8:
                float f = parcel.readFloat();
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("PX")) {
                        i2 = 1;
                    } else if (string.equals("DP")) {
                        i2 = 2;
                    } else if (!string.equals("SP")) {
                        hhg1.n("No enum constant com.spotify.campaigns.paragraph.view.ParagraphView.Metric.".concat(string));
                    }
                    return new fpr0(f, i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new fpr0(f, i2);
            case 9:
                ipr0 ipr0VarCreateFromParcel = ipr0.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(ipr0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new gpr0(ipr0VarCreateFromParcel, arrayList);
            case 10:
                Integer numValueOf = null;
                String string2 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                fpr0 fpr0VarCreateFromParcel = parcel.readInt() == 0 ? null : fpr0.CREATOR.createFromParcel(parcel);
                fpr0 fpr0VarCreateFromParcel2 = parcel.readInt() == 0 ? null : fpr0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new ipr0(string2, i4, i5, i6, fpr0VarCreateFromParcel, fpr0VarCreateFromParcel2, numValueOf);
            case 11:
                return new ParcelImpl(parcel);
            case 12:
                return new nqr0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 13:
                h3f1 h3f1Var = (h3f1) h3f1.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                while (iD != i7) {
                    iD = x0d.h(oqr0.class, parcel, arrayList2, iD, 1);
                }
                return new oqr0(h3f1Var, string3, string4, arrayList2);
            case 14:
                return new pqr0(nmu0.valueOf(parcel.readString()));
            case 15:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                while (iD != i8) {
                    iD = dsl0.d(irr0.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new qqr0(string5, string6, arrayList3);
            case 16:
                Long lValueOf = null;
                String string7 = parcel.readString();
                jj40 parcelable = parcel.readParcelable(uqr0.class.getClassLoader());
                i5r i5rVar = (i5r) (parcel.readInt() == 0 ? null : i5r.CREATOR.createFromParcel(parcel));
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                while (iD != i9) {
                    iD = x0d.h(uqr0.class, parcel, arrayList4, iD, 1);
                }
                rod0 rod0Var = (rod0) (parcel.readInt() == 0 ? null : rod0.CREATOR.createFromParcel(parcel));
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new uqr0(string7, parcelable, i5rVar, arrayList4, rod0Var, lValueOf);
            case 17:
                return new vqr0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), cfm0.w(parcel.readString()), parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new wqr0(parcel.readInt() != 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new zqr0(parcel.readInt() != 0);
            case 20:
                return new arr0(ywx0.s(parcel.readString()), parcel.readString(), parcel.readString());
            case 21:
                return new brr0(parcel.readString());
            case 22:
                Integer numValueOf2 = null;
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                String string11 = parcel.readString();
                if (string11 != null) {
                    if (string11.equals("PLACEHOLDER")) {
                        i = 1;
                    } else if (string11.equals("SHOW")) {
                        i = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.bluejay.confirmgenerationpage.domain.ShowType.".concat(string11));
                    }
                    return new crr0(string8, string9, string10, arrayListCreateStringArrayList, numValueOf2, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new crr0(string8, string9, string10, arrayListCreateStringArrayList, numValueOf2, i);
            case 23:
                return new drr0(parcel.readFloat());
            case 24:
                return new frr0(parcel.readLong());
            case 25:
                return new irr0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 26:
                String string12 = parcel.readString();
                if (string12 != null) {
                    if (string12.equals("DAILY")) {
                        i2 = 1;
                    } else if (string12.equals("WEEKLY")) {
                        i2 = 2;
                    } else if (!string12.equals("NEVER")) {
                        if (string12.equals("MONTHLY")) {
                            i2 = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.promptedplaylists.schedule.config.Cadence.".concat(string12));
                        }
                    }
                    return new jrr0(i2, parcel.readInt(), (bm41) bm41.CREATOR.createFromParcel(parcel));
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new jrr0(i2, parcel.readInt(), (bm41) bm41.CREATOR.createFromParcel(parcel));
            case 27:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 28:
                return new wrr0(parcel.readString());
            default:
                parcel.readInt();
                return new ssr0();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new flr0[i];
            case 1:
                return new mlr0[i];
            case 2:
                return new jlr0[i];
            case 3:
                return new klr0[i];
            case 4:
                return new imr0[i];
            case 5:
                return new cor0[i];
            case 6:
                return new dor0[i];
            case 7:
                return new lor0[i];
            case 8:
                return new fpr0[i];
            case 9:
                return new gpr0[i];
            case 10:
                return new ipr0[i];
            case 11:
                return new ParcelImpl[i];
            case 12:
                return new nqr0[i];
            case 13:
                return new oqr0[i];
            case 14:
                return new pqr0[i];
            case 15:
                return new qqr0[i];
            case 16:
                return new uqr0[i];
            case 17:
                return new vqr0[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new wqr0[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new zqr0[i];
            case 20:
                return new arr0[i];
            case 21:
                return new brr0[i];
            case 22:
                return new crr0[i];
            case 23:
                return new drr0[i];
            case 24:
                return new frr0[i];
            case 25:
                return new irr0[i];
            case 26:
                return new jrr0[i];
            case 27:
                return new ParcelableVolumeInfo[i];
            case 28:
                return new wrr0[i];
            default:
                return new ssr0[i];
        }
    }
}
