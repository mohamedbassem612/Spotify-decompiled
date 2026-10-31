package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.podcastinteractivity.commentssheetimpl.page.CommentsSheetPageParameters;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v6h implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:152:0x0282  */
    /* JADX WARN: Code duplicated, block: B:153:0x0284  */
    /* JADX WARN: Code duplicated, block: B:156:0x0292  */
    /* JADX WARN: Code duplicated, block: B:157:0x0294  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Long lValueOf;
        Long lValueOf2;
        int i;
        int i2;
        String string;
        int i3 = 7;
        int i4 = 0;
        boolean z = false;
        int iD = 0;
        switch (this.a) {
            case 0:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet.add(a7h.valueOf(parcel.readString()));
                }
                return new w6h(linkedHashSet);
            case 1:
                return new a9h((fef0) fef0.CREATOR.createFromParcel(parcel), (bff0) bff0.CREATOR.createFromParcel(parcel));
            case 2:
                return new d9h(z4p1.e(parcel.readInt()), z4p1.e(parcel.readInt()), z4p1.e(parcel.readInt()), z4p1.e(parcel.readInt()), z4p1.e(parcel.readInt()));
            case 3:
                return new j9h(parcel.readInt(), parcel.readInt());
            case 4:
                return new k9h(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 5:
                return new hmh(parcel.readString(), parcel.readString());
            case 6:
                return new CommentsSheetPageParameters(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(CommentsSheetPageParameters.class.getClassLoader()));
            case 7:
                return new txh(parcel.readInt());
            case 8:
                parcel.readInt();
                return uxh.a;
            case 9:
                parcel.readInt();
                return vxh.a;
            case 10:
                return new wxh(parcel.readInt());
            case 11:
                return new l0k(parcel.readString(), parcel.readString());
            case 12:
                return new r2k(parcel.readString(), parcel.readString(), parcel.readString(), (Parcelable) parcel.readTypedObject(fvt0.CREATOR));
            case 13:
                String string2 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(p5k.CREATOR, parcel, arrayList, iD, 1);
                }
                return new x5k(string2, arrayList);
            case 14:
                return new i6k(parcel.readString(), j7r.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 15:
                return new l6k(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (iek) parcel.readParcelable(l6k.class.getClassLoader()));
            case 16:
                return new i9k(parcel.readParcelable(i9k.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                return new nak(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ccr.valueOf(parcel.readString()));
            case 18:
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("UNSPECIFIED")) {
                        i3 = 1;
                    } else if (string3.equals("RESERVED")) {
                        i3 = 2;
                    } else if (string3.equals("FCFS")) {
                        i3 = 3;
                    } else if (string3.equals("WAITLISTED")) {
                        i3 = 4;
                    } else if (string3.equals("PURCHASED")) {
                        i3 = 5;
                    } else if (string3.equals("INELIGIBLE")) {
                        i3 = 6;
                    } else if (!string3.equals("SOLD_OUT")) {
                        if (string3.equals("CANCELLED")) {
                            i3 = 8;
                        } else if (string3.equals("SALE_ENDED")) {
                            i3 = 9;
                        } else {
                            hhg1.n("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.ConcertCampaignStatus.".concat(string3));
                        }
                    }
                    if (parcel.readInt() == 0) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(parcel.readLong());
                    }
                    if (parcel.readInt() == 0) {
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(parcel.readLong());
                    }
                    return new bbk(i3, lValueOf, lValueOf2);
                }
                bhn0.i("Name is null");
                i3 = 0;
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() == 0) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(parcel.readLong());
                }
                return new bbk(i3, lValueOf, lValueOf2);
            case 19:
                parcel.readInt();
                return fek.a;
            case 20:
                return new gek(parcel.readString());
            case 21:
                parcel.readInt();
                return hek.a;
            case 22:
                return new njk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 23:
                return new pok(parcel.readString());
            case 24:
                return new npk(parcel.readString(), parcel.readString());
            case 25:
                return new ksk(parcel.readString(), parcel.readInt() != 0, le30.valueOf(parcel.readString()));
            case 26:
                String string4 = parcel.readString();
                qxk qxkVar = (qxk) qxk.CREATOR.createFromParcel(parcel);
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                int iD2 = 0;
                while (iD2 != i8) {
                    iD2 = dsl0.d(uxk.CREATOR, parcel, arrayList2, iD2, 1);
                }
                yxk yxkVar = (yxk) yxk.CREATOR.createFromParcel(parcel);
                sxk sxkVar = (sxk) sxk.CREATOR.createFromParcel(parcel);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                int i9 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i9);
                int iD3 = i6;
                while (iD3 != i9) {
                    iD3 = dsl0.d(rxk.CREATOR, parcel, arrayList3, iD3, 1);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string7 = parcel.readString();
                r591 r591VarValueOf = parcel.readInt() == 0 ? null : r591.valueOf(parcel.readString());
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                if (string9 != null) {
                    if (string9.equals("BACK_ARROW")) {
                        i = 1;
                    } else if (string9.equals("BACK")) {
                        i = 2;
                    } else if (string9.equals("CANCEL")) {
                        i = 3;
                    } else {
                        hhg1.n("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.NavigationButton.".concat(string9));
                    }
                    return new pxk(string4, qxkVar, arrayList2, yxkVar, sxkVar, string5, string6, z, arrayList3, arrayListCreateStringArrayList, string7, r591VarValueOf, string8, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new pxk(string4, qxkVar, arrayList2, yxkVar, sxkVar, string5, string6, z, arrayList3, arrayListCreateStringArrayList, string7, r591VarValueOf, string8, i);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new qxk(parcel.readString(), parcel.readString());
            case 28:
                return new rxk(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            default:
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (string10.equals("NEVER")) {
                        i2 = 1;
                    } else if (string10.equals("DAILY")) {
                        i2 = 2;
                    } else if (string10.equals("WEEKLY")) {
                        i2 = 3;
                    } else if (string10.equals("MONTHLY")) {
                        i2 = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.ScheduleType.".concat(string10));
                    }
                    if (parcel.readInt() != 0) {
                        string = parcel.readString();
                        if (string != null) {
                            if (string.equals("SUNDAY")) {
                                i3 = 1;
                            } else if (string.equals("MONDAY")) {
                                i3 = 2;
                            } else if (string.equals("TUESDAY")) {
                                i3 = 3;
                            } else if (string.equals("WEDNESDAY")) {
                                i3 = 4;
                            } else if (string.equals("THURSDAY")) {
                                i3 = 5;
                            } else if (string.equals("FRIDAY")) {
                                i3 = 6;
                            } else if (!string.equals("SATURDAY")) {
                                hhg1.n("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.DayOfWeek.".concat(string));
                            }
                            i4 = i3;
                        } else {
                            bhn0.i("Name is null");
                        }
                        i3 = 0;
                        i4 = i3;
                    }
                    return new sxk(i2, i4);
                }
                bhn0.i("Name is null");
                i2 = 0;
                if (parcel.readInt() != 0) {
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("SUNDAY")) {
                            i3 = 1;
                        } else if (string.equals("MONDAY")) {
                            i3 = 2;
                        } else if (string.equals("TUESDAY")) {
                            i3 = 3;
                        } else if (string.equals("WEDNESDAY")) {
                            i3 = 4;
                        } else if (string.equals("THURSDAY")) {
                            i3 = 5;
                        } else if (string.equals("FRIDAY")) {
                            i3 = 6;
                        } else if (!string.equals("SATURDAY")) {
                            hhg1.n("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.DayOfWeek.".concat(string));
                        }
                        i4 = i3;
                    } else {
                        bhn0.i("Name is null");
                    }
                    i3 = 0;
                    i4 = i3;
                }
                return new sxk(i2, i4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w6h[i];
            case 1:
                return new a9h[i];
            case 2:
                return new d9h[i];
            case 3:
                return new j9h[i];
            case 4:
                return new k9h[i];
            case 5:
                return new hmh[i];
            case 6:
                return new CommentsSheetPageParameters[i];
            case 7:
                return new txh[i];
            case 8:
                return new uxh[i];
            case 9:
                return new vxh[i];
            case 10:
                return new wxh[i];
            case 11:
                return new l0k[i];
            case 12:
                return new r2k[i];
            case 13:
                return new x5k[i];
            case 14:
                return new i6k[i];
            case 15:
                return new l6k[i];
            case 16:
                return new i9k[i];
            case 17:
                return new nak[i];
            case 18:
                return new bbk[i];
            case 19:
                return new fek[i];
            case 20:
                return new gek[i];
            case 21:
                return new hek[i];
            case 22:
                return new njk[i];
            case 23:
                return new pok[i];
            case 24:
                return new npk[i];
            case 25:
                return new ksk[i];
            case 26:
                return new pxk[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new qxk[i];
            case 28:
                return new rxk[i];
            default:
                return new sxk[i];
        }
    }
}
