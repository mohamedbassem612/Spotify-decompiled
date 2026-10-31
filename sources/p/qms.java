package p;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qms implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        s4b1 s4b1VarX = null;
        int i = 1;
        int iG = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new rms(parcel.readString(), ak3.valueOf(parcel.readString()));
            case 1:
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                int iG2 = 0;
                while (iG2 != i2) {
                    iG2 = k4s0.g(parcel, linkedHashSet, iG2, 1);
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int iG3 = 0;
                while (iG3 != i3) {
                    iG3 = k4s0.g(parcel, linkedHashSet2, iG3, 1);
                }
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i4);
                while (iG != i4) {
                    iG = k4s0.g(parcel, linkedHashSet3, iG, 1);
                }
                return new cns(linkedHashSet, linkedHashSet2, linkedHashSet3);
            case 2:
                return new v4t(parcel.readString());
            case 3:
                return new y6t(parcel.readParcelable(y6t.class.getClassLoader()));
            case 4:
                return new g8t(parcel.readString());
            case 5:
                return new i8t(parcel.readInt() != 0);
            case 6:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i5);
                while (iG != i5) {
                    iG = k4s0.g(parcel, linkedHashSet4, iG, 1);
                }
                return new r8t(linkedHashSet4, parcel.readParcelable(r8t.class.getClassLoader()));
            case 7:
                return new q9t((kjo0) kjo0.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
            case 8:
                return new nat(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.readInt();
                return new qit();
            case 10:
                return new yit(parcel.readParcelable(yit.class.getClassLoader()), bk8.valueOf(parcel.readString()), (n5o) (parcel.readInt() != 0 ? n5o.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new zit(parcel.readParcelable(zit.class.getClassLoader()));
            case grn1.d /* 12 */:
                return new ajt((hm) hm.CREATOR.createFromParcel(parcel), (n5o) (parcel.readInt() != 0 ? n5o.CREATOR.createFromParcel(parcel) : null));
            case 13:
                return new bjt(parcel.readString());
            case 14:
                return fjt.valueOf(parcel.readString());
            case 15:
                return njt.valueOf(parcel.readString());
            case 16:
                return pjt.valueOf(parcel.readString());
            case 17:
                return vjt.valueOf(parcel.readString());
            case 18:
                o571 parcelable = parcel.readParcelable(ukt.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                while (iG != i6) {
                    arrayList.add(yy61.valueOf(parcel.readString()));
                    iG++;
                }
                return new ukt(parcelable, mqo1.F(arrayList), parcel.readSerializable());
            case 19:
                o571 parcelable2 = parcel.readParcelable(vkt.class.getClassLoader());
                String string = parcel.readString();
                if (string != null) {
                    Set set = s4b1.f;
                    s4b1VarX = uic.x(string);
                }
                return new vkt(parcelable2, s4b1VarX, parcel.readSerializable(), parcel.readParcelable(vkt.class.getClassLoader()));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int iH = 0;
                while (iH != i7) {
                    iH = x0d.h(cmt.class, parcel, arrayList2, iH, 1);
                }
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (!string2.equals("PLATFORM")) {
                        if (string2.equals("KEEP")) {
                            i = 2;
                        } else if (string2.equals("SMART")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.share.models.DestinationListConfiguration.SortType.".concat(string2));
                        }
                    }
                    return new cmt(arrayList2, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new cmt(arrayList2, i);
            case 21:
                return new dmt(parcel.readInt() != 0, parcel.readInt() != 0);
            case 22:
                return new dnt(parcel.readParcelable(dnt.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return fnt.a;
            case 24:
                parcel.readInt();
                return gnt.a;
            case 25:
                parcel.readInt();
                return hnt.a;
            case 26:
                npt nptVar = new npt();
                nptVar.a = parcel.readString();
                nptVar.b = parcel.readString();
                nptVar.c = parcel.readString();
                nptVar.d = parcel.readLong();
                nptVar.e = parcel.readLong();
                return nptVar;
            case 27:
                return new qpt(parcel);
            case 28:
                kqt kqtVar = new kqt();
                kqtVar.a(parcel);
                return kqtVar;
            default:
                nqt nqtVar = new nqt();
                int iDataPosition = parcel.dataPosition();
                int i8 = parcel.readInt();
                try {
                    if (i8 < 4) {
                        throw new BadParcelableException("Parcelable too small");
                    }
                    if (parcel.dataPosition() - iDataPosition < i8) {
                        nqtVar.a = parcel.readString();
                        if (parcel.dataPosition() - iDataPosition < i8) {
                            nqtVar.b = parcel.readString();
                            if (parcel.dataPosition() - iDataPosition < i8) {
                                nqtVar.c = parcel.readLong();
                                if (iDataPosition > Integer.MAX_VALUE - i8) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                                parcel.setDataPosition(iDataPosition + i8);
                            } else {
                                if (iDataPosition > Integer.MAX_VALUE - i8) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                                parcel.setDataPosition(iDataPosition + i8);
                            }
                        } else {
                            if (iDataPosition > Integer.MAX_VALUE - i8) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                            parcel.setDataPosition(iDataPosition + i8);
                        }
                    } else {
                        if (iDataPosition > Integer.MAX_VALUE - i8) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel.setDataPosition(iDataPosition + i8);
                    }
                    return nqtVar;
                } catch (Throwable th) {
                    if (iDataPosition > Integer.MAX_VALUE - i8) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                    parcel.setDataPosition(iDataPosition + i8);
                    throw th;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new rms[i];
            case 1:
                return new cns[i];
            case 2:
                return new v4t[i];
            case 3:
                return new y6t[i];
            case 4:
                return new g8t[i];
            case 5:
                return new i8t[i];
            case 6:
                return new r8t[i];
            case 7:
                return new q9t[i];
            case 8:
                return new nat[i];
            case 9:
                return new qit[i];
            case 10:
                return new yit[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new zit[i];
            case grn1.d /* 12 */:
                return new ajt[i];
            case 13:
                return new bjt[i];
            case 14:
                return new fjt[i];
            case 15:
                return new njt[i];
            case 16:
                return new pjt[i];
            case 17:
                return new vjt[i];
            case 18:
                return new ukt[i];
            case 19:
                return new vkt[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new cmt[i];
            case 21:
                return new dmt[i];
            case 22:
                return new dnt[i];
            case 23:
                return new fnt[i];
            case 24:
                return new gnt[i];
            case 25:
                return new hnt[i];
            case 26:
                return new npt[i];
            case 27:
                return new qpt[i];
            case 28:
                return new kqt[i];
            default:
                return new nqt[i];
        }
    }
}
