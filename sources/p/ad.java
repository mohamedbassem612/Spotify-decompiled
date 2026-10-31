package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ad implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ad(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4 = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                boolean z2 = true;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new bd(z2);
            case 1:
                parcel.readInt();
                return cd.a;
            case 2:
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new dd(z3);
            case 3:
                return new xd(parcel);
            case 4:
                return new wd(parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
            case 5:
                return new ff(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                int iF = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (iF != i) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new dg(string, string2, linkedHashMap);
            case 7:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                dxr0 parcelable = parcel.readParcelable(yk.class.getClassLoader());
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                tpw0 parcelable2 = parcel.readParcelable(yk.class.getClassLoader());
                xxa0 xxa0Var = (xxa0) parcel.readParcelable(yk.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iH = 0;
                while (iH != i2) {
                    iH = x0d.h(yk.class, parcel, arrayList, iH, 1);
                }
                return new yk(string3, string4, string5, parcelable, string6, string7, parcelable2, xxa0Var, arrayList, (yq00) parcel.readParcelable(yk.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), vur0.valueOf(parcel.readString()));
            case 8:
                parcel.readInt();
                return zk.b;
            case 9:
                parcel.readInt();
                return al.b;
            case 10:
                parcel.readInt();
                return bl.b;
            case 11:
                parcel.readInt();
                return cl.b;
            case 12:
                parcel.readInt();
                return dl.b;
            case 13:
                parcel.readInt();
                return el.b;
            case 14:
                parcel.readInt();
                return fl.b;
            case 15:
                return new gl((yig1) parcel.readParcelable(gl.class.getClassLoader()));
            case 16:
                parcel.readInt();
                return hl.b;
            case 17:
                parcel.readInt();
                return il.b;
            case 18:
                parcel.readInt();
                return jl.b;
            case 19:
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z4 = false;
                    }
                    boolValueOf4 = Boolean.valueOf(z4);
                }
                return new xl(z, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4);
            case 20:
                return new yl(parcel.readString(), parcel.readString());
            case 21:
                return new zl(parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                return new fm(parcel.readString(), parcel.readParcelable(fm.class.getClassLoader()));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new am(parcel.readString());
            case 24:
                return new bm(parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new cm(parcel.readString());
            case 26:
                return new dm(parcel.readString());
            case 27:
                return new km(parcel.readString(), parcel.readString());
            case 28:
                return new fo(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            default:
                return new go(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bd[i];
            case 1:
                return new cd[i];
            case 2:
                return new dd[i];
            case 3:
                return new xd[i];
            case 4:
                return new wd[i];
            case 5:
                return new ff[i];
            case 6:
                return new dg[i];
            case 7:
                return new yk[i];
            case 8:
                return new zk[i];
            case 9:
                return new al[i];
            case 10:
                return new bl[i];
            case 11:
                return new cl[i];
            case 12:
                return new dl[i];
            case 13:
                return new el[i];
            case 14:
                return new fl[i];
            case 15:
                return new gl[i];
            case 16:
                return new hl[i];
            case 17:
                return new il[i];
            case 18:
                return new jl[i];
            case 19:
                return new xl[i];
            case 20:
                return new yl[i];
            case 21:
                return new zl[i];
            case 22:
                return new fm[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new am[i];
            case 24:
                return new bm[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new cm[i];
            case 26:
                return new dm[i];
            case 27:
                return new km[i];
            case 28:
                return new fo[i];
            default:
                return new go[i];
        }
    }
}
