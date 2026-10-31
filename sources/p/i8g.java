package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i8g implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ i8g(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new j8g(parcel.readString());
            case 1:
                parcel.readInt();
                return k8g.a;
            case 2:
                parcel.readInt();
                return l8g.a;
            case 3:
                return new m8g(t7g.CREATOR.createFromParcel(parcel), h9g.CREATOR.createFromParcel(parcel), (i050) parcel.readParcelable(m8g.class.getClassLoader()));
            case 4:
                return new n8g((i050) parcel.readParcelable(n8g.class.getClassLoader()));
            case 5:
                return new p8g(parcel.readInt() != 0, t7g.CREATOR.createFromParcel(parcel), h9g.CREATOR.createFromParcel(parcel), (i050) parcel.readParcelable(p8g.class.getClassLoader()));
            case 6:
                return new q8g(parcel.readInt() != 0, (i050) parcel.readParcelable(q8g.class.getClassLoader()));
            case 7:
                return new y8g(parcel.readString(), parcel.readString());
            case 8:
                parcel.readInt();
                return z8g.a;
            case 9:
                parcel.readInt();
                return a9g.a;
            case 10:
                return new b9g(parcel.readString());
            case 11:
                parcel.readInt();
                return c9g.a;
            case 12:
                return new e9g(parcel.readString(), (d9g) parcel.readParcelable(e9g.class.getClassLoader()));
            case 13:
                return new f9g(parcel.readString(), parcel.readString(), (d9g) parcel.readParcelable(f9g.class.getClassLoader()), parcel.readInt() == 0 ? null : e9g.CREATOR.createFromParcel(parcel), (e9g) (parcel.readInt() != 0 ? e9g.CREATOR.createFromParcel(parcel) : null));
            case 14:
                return new g9g(parcel.readString(), parcel.readParcelable(g9g.class.getClassLoader()));
            case 15:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Parcelable.Creator<d5g> creator = d5g.CREATOR;
                return new h9g(string, string2, string3, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readParcelable(h9g.class.getClassLoader()), (y8g) (parcel.readInt() != 0 ? y8g.CREATOR.createFromParcel(parcel) : null));
            case 16:
                return new xcg(parcel.readString(), parcel.readInt() != 0);
            case 17:
                return new mdg(parcel.readString(), parcel.readString());
            case 18:
                return new xig(parcel);
            case 19:
                return new llg(parcel.readParcelable(llg.class.getClassLoader()).a, parcel.readParcelable(llg.class.getClassLoader()).a, parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new dmg(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 21:
                return new hmg(parcel.readString(), parcel.createStringArrayList());
            case 22:
                return new dng(parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new kpg(parcel.readParcelable(kpg.class.getClassLoader()));
            case 24:
                return new pqg(parcel.readString(), parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new syg(parcel.readInt() != 0);
            case 26:
                return new l2h(parcel.readString());
            case 27:
                int iR = lf51.r(parcel.readString());
                z771 parcelable = parcel.readParcelable(p6h.class.getClassLoader());
                ez61 parcelable2 = parcel.readParcelable(p6h.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a7h.valueOf(parcel.readString()));
                }
                return new p6h(iR, parcelable, parcelable2, linkedHashSet, parcel.readParcelable(p6h.class.getClassLoader()), (wkt) null);
            case 28:
                int iR2 = lf51.r(parcel.readString());
                z771 parcelable3 = parcel.readParcelable(q6h.class.getClassLoader());
                ez61 parcelable4 = parcel.readParcelable(q6h.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet2.add(a7h.valueOf(parcel.readString()));
                }
                wa71 parcelable5 = parcel.readParcelable(q6h.class.getClassLoader());
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                llw0 parcelable6 = parcel.readParcelable(q6h.class.getClassLoader());
                llw0 parcelable7 = parcel.readParcelable(q6h.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                int iH = 0;
                while (iH != i6) {
                    iH = x0d.h(q6h.class, parcel, arrayList, iH, 1);
                }
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                int iH2 = 0;
                while (iH2 != i8) {
                    iH2 = x0d.h(q6h.class, parcel, arrayList2, iH2, 1);
                }
                return new q6h(iR2, parcelable3, parcelable4, linkedHashSet2, parcelable5, string4, string5, string6, i5, parcelable6, parcelable7, arrayList, i7, arrayList2, parcel.readParcelable(q6h.class.getClassLoader()), parcel.readParcelable(q6h.class.getClassLoader()), 32);
            default:
                int iR3 = lf51.r(parcel.readString());
                z771 parcelable8 = parcel.readParcelable(r6h.class.getClassLoader());
                ez61 parcelable9 = parcel.readParcelable(r6h.class.getClassLoader());
                int i9 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashSet3.add(a7h.valueOf(parcel.readString()));
                }
                return new r6h(iR3, parcelable8, parcelable9, linkedHashSet3, parcel.readParcelable(r6h.class.getClassLoader()), (wkt) null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j8g[i];
            case 1:
                return new k8g[i];
            case 2:
                return new l8g[i];
            case 3:
                return new m8g[i];
            case 4:
                return new n8g[i];
            case 5:
                return new p8g[i];
            case 6:
                return new q8g[i];
            case 7:
                return new y8g[i];
            case 8:
                return new z8g[i];
            case 9:
                return new a9g[i];
            case 10:
                return new b9g[i];
            case 11:
                return new c9g[i];
            case 12:
                return new e9g[i];
            case 13:
                return new f9g[i];
            case 14:
                return new g9g[i];
            case 15:
                return new h9g[i];
            case 16:
                return new xcg[i];
            case 17:
                return new mdg[i];
            case 18:
                return new xig[i];
            case 19:
                return new llg[i];
            case 20:
                return new dmg[i];
            case 21:
                return new hmg[i];
            case 22:
                return new dng[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new kpg[i];
            case 24:
                return new pqg[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new syg[i];
            case 26:
                return new l2h[i];
            case 27:
                return new p6h[i];
            case 28:
                return new q6h[i];
            default:
                return new r6h[i];
        }
    }
}
