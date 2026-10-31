package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rtm implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ rtm(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new stm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new ytm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                parcel.readInt();
                return zvm.a;
            case 3:
                parcel.readInt();
                return awm.a;
            case 4:
                parcel.readInt();
                return cwm.a;
            case 5:
                parcel.readInt();
                return dwm.a;
            case 6:
                parcel.readInt();
                return ewm.a;
            case 7:
                parcel.readInt();
                return fwm.a;
            case 8:
                Parcelable.Creator creator = w4i1.CREATOR;
                return new jwm((w4i1) creator.createFromParcel(parcel), parcel.readParcelable(jwm.class.getClassLoader()), parcel.readParcelable(jwm.class.getClassLoader()), (w4i1) (parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null));
            case 9:
                return new lwm(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : rwm.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new e2n(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new d4n(parcel.readParcelable(d4n.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(d4n.class.getClassLoader()), (i4n) parcel.readParcelable(d4n.class.getClassLoader()));
            case 12:
                return new e4n(parcel.readParcelable(e4n.class.getClassLoader()), parcel.readParcelable(e4n.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return f4n.a;
            case 14:
                parcel.readInt();
                return g4n.a;
            case 15:
                parcel.readInt();
                return h4n.a;
            case 16:
                return new tan(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iD2 = 0;
                while (iD2 != i3) {
                    iD2 = dsl0.d(tan.CREATOR, parcel, arrayList, iD2, 1);
                }
                return new van(string, arrayList, string2, string3);
            case 18:
                van parcelable = parcel.readParcelable(ebn.class.getClassLoader());
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iD3 = 0;
                while (iD3 != i4) {
                    iD3 = dsl0.d(kbn.CREATOR, parcel, arrayList2, iD3, 1);
                }
                return new ebn(parcelable, string4, arrayList2);
            case 19:
                return new kbn(parcel.readParcelable(kbn.class.getClassLoader()), parcel.readInt() != 0);
            case 20:
                return new obn(parcel.readString());
            case 21:
                int iD4 = 0;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                yy30 yy30VarValueOf = yy30.valueOf(parcel.readString());
                mu91 mu91Var = (mu91) mu91.CREATOR.createFromParcel(parcel);
                zhd zhdVar = (zhd) (parcel.readInt() != 0 ? zhd.CREATOR.createFromParcel(parcel) : null);
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                while (iD4 != i10) {
                    iD4 = dsl0.d(plv.CREATOR, parcel, arrayList3, iD4, 1);
                    i10 = i10;
                }
                return new adn(string5, string6, (List) null, i5, yy30VarValueOf, mu91Var, zhdVar, i6, i7, i8, i9, string7, string8, arrayList3, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt(), 4);
            case 22:
                return new edn(parcel.readString(), parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                gtr0 gtr0VarCreateFromParcel = gtr0.CREATOR.createFromParcel(parcel);
                wh2 wh2VarCreateFromParcel = wh2.CREATOR.createFromParcel(parcel);
                dxr0 dxr0Var = (dxr0) dxr0.CREATOR.createFromParcel(parcel);
                yq00 yq00Var = (yq00) parcel.readParcelable(pjn.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    i2 = 0;
                } else {
                    String string9 = parcel.readString();
                    if (string9 != null) {
                        if (string9.equals("MaxChildrenReached")) {
                            i = 1;
                        } else if (string9.equals("ParentalAge")) {
                            i = 2;
                        } else if (string9.equals("NotAllowed")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.genalpha.entities.DenialReason.".concat(string9));
                        }
                        i2 = i;
                    } else {
                        bhn0.i("Name is null");
                    }
                    i = 0;
                    i2 = i;
                }
                return new pjn(gtr0VarCreateFromParcel, wh2VarCreateFromParcel, dxr0Var, yq00Var, i2, parcel.readInt() != 0);
            case 24:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                xk41 xk41Var = (xk41) (parcel.readInt() != 0 ? xk41.CREATOR.createFromParcel(parcel) : null);
                int i11 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i11);
                while (iD != i11) {
                    iD = dsl0.d(zub1.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new dkn(string10, string11, arrayListCreateStringArrayList, xk41Var, arrayList4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                String string12 = parcel.readString();
                jaw0 jaw0Var = (jaw0) jaw0.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i12);
                int iH = 0;
                while (iH != i12) {
                    iH = x0d.h(ekn.class, parcel, arrayList5, iH, 1);
                }
                zlk1 zlk1Var = (zlk1) zlk1.CREATOR.createFromParcel(parcel);
                xk41 xk41Var2 = (xk41) xk41.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i13);
                while (iD != i13) {
                    iD = dsl0.d(e311.CREATOR, parcel, arrayList6, iD, 1);
                }
                return new ekn(string12, jaw0Var, arrayList5, zlk1Var, xk41Var2, z, arrayList6, parcel.readString(), parcel.readInt() != 0 ? r591.valueOf(parcel.readString()) : null, parcel.readString());
            case 26:
                return new uln(parcel.readString(), parcel.readString(), (i971) i971.CREATOR.createFromParcel(parcel));
            case 27:
                return new mnn(parcel.readString());
            case 28:
                return new mpn(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            default:
                return new cqn(parcel.readString(), parcel.readString(), parcel.readParcelable(cqn.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new stm[i];
            case 1:
                return new ytm[i];
            case 2:
                return new zvm[i];
            case 3:
                return new awm[i];
            case 4:
                return new cwm[i];
            case 5:
                return new dwm[i];
            case 6:
                return new ewm[i];
            case 7:
                return new fwm[i];
            case 8:
                return new jwm[i];
            case 9:
                return new lwm[i];
            case 10:
                return new e2n[i];
            case 11:
                return new d4n[i];
            case 12:
                return new e4n[i];
            case 13:
                return new f4n[i];
            case 14:
                return new g4n[i];
            case 15:
                return new h4n[i];
            case 16:
                return new tan[i];
            case 17:
                return new van[i];
            case 18:
                return new ebn[i];
            case 19:
                return new kbn[i];
            case 20:
                return new obn[i];
            case 21:
                return new adn[i];
            case 22:
                return new edn[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new pjn[i];
            case 24:
                return new dkn[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ekn[i];
            case 26:
                return new uln[i];
            case 27:
                return new mnn[i];
            case 28:
                return new mpn[i];
            default:
                return new cqn[i];
        }
    }
}
