package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pxc1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        Uri uri;
        int iH = 0;
        boolean z = false;
        switch (this.a) {
            case 0:
                return new qxc1(parcel.readParcelable(qxc1.class.getClassLoader()), parcel.readParcelable(qxc1.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : oxc1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 1:
                return new rxc1(qxc1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 2:
                return new zxc1(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 3:
                int iH2 = 0;
                o0d1 parcelable = parcel.readParcelable(n0d1.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iH2 != i2) {
                    iH2 = x0d.h(n0d1.class, parcel, arrayList, iH2, 1);
                }
                return new n0d1(parcelable, arrayList);
            case 4:
                return new o0d1(parcel.readString(), parcel.readString());
            case 5:
                boolean z2 = false;
                String string = parcel.readString();
                int i3 = parcel.readInt();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new t0d1(i3, string, string2, z2, parcel.readInt() != 0);
            case 6:
                parcel.readInt();
                return w1d1.a;
            case 7:
                parcel.readInt();
                return x1d1.a;
            case 8:
                parcel.readInt();
                return y1d1.a;
            case 9:
                parcel.readInt();
                return z1d1.a;
            case 10:
                parcel.readInt();
                return a2d1.a;
            case 11:
                parcel.readInt();
                return b2d1.a;
            case 12:
                parcel.readInt();
                return c2d1.a;
            case 13:
                parcel.readInt();
                return d2d1.a;
            case 14:
                parcel.readInt();
                return e2d1.a;
            case 15:
                parcel.readInt();
                return f2d1.a;
            case 16:
                return new q7d1(parcel.readString());
            case 17:
                String string3 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(new u7h(z4p1.e(parcel.readInt())));
                }
                return new o8d1(string3, string4, arrayList2, z3);
            case 18:
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                return new p8d1(arrayList3, parcel.readString());
            case 19:
                String string5 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (string7 == null) {
                    bhn0.i("Name is null");
                } else if (!string7.equals("COVER_CREATION")) {
                    hhg1.n("No enum constant com.spotify.share.models.Swatch.Themed.EncoreIcon.".concat(string7));
                }
                return new q8d1(1, string5, string6, z4);
            case 20:
                return new r8d1(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Uri) parcel.readParcelable(r8d1.class.getClassLoader()));
            case 21:
                return new s8d1((Uri) parcel.readParcelable(s8d1.class.getClassLoader()), parcel.readString());
            case 22:
                return new t8d1((Uri) parcel.readParcelable(t8d1.class.getClassLoader()), parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int i8 = 1;
                String string8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                String string9 = parcel.readString();
                Uri uri2 = (Uri) parcel.readParcelable(u8d1.class.getClassLoader());
                String string10 = parcel.readString();
                if (string10 != null) {
                    if (!string10.equals("PLAYING")) {
                        if (string10.equals("PAUSE")) {
                            i8 = 2;
                        } else if (string10.equals("STOPPED")) {
                            i8 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.share.uiusecases.swatch.Swatch.Video.State.".concat(string10));
                        }
                    }
                    uri = uri2;
                    i = i8;
                    return new u8d1(string8, z, string9, uri, i);
                }
                bhn0.i("Name is null");
                i = 0;
                uri = uri2;
                return new u8d1(string8, z, string9, uri, i);
            case 24:
                return new v8d1((Uri) parcel.readParcelable(v8d1.class.getClassLoader()), parcel.readString());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new a9d1(parcel.readInt(), parcel.readParcelable(a9d1.class.getClassLoader()));
            case 26:
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                while (iH != i9) {
                    iH = x0d.h(f9d1.class, parcel, arrayList4, iH, 1);
                }
                return new f9d1(arrayList4);
            case 27:
                return new fad1(parcel);
            case 28:
                return new uod1(parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            default:
                return new mwd1(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qxc1[i];
            case 1:
                return new rxc1[i];
            case 2:
                return new zxc1[i];
            case 3:
                return new n0d1[i];
            case 4:
                return new o0d1[i];
            case 5:
                return new t0d1[i];
            case 6:
                return new w1d1[i];
            case 7:
                return new x1d1[i];
            case 8:
                return new y1d1[i];
            case 9:
                return new z1d1[i];
            case 10:
                return new a2d1[i];
            case 11:
                return new b2d1[i];
            case 12:
                return new c2d1[i];
            case 13:
                return new d2d1[i];
            case 14:
                return new e2d1[i];
            case 15:
                return new f2d1[i];
            case 16:
                return new q7d1[i];
            case 17:
                return new o8d1[i];
            case 18:
                return new p8d1[i];
            case 19:
                return new q8d1[i];
            case 20:
                return new r8d1[i];
            case 21:
                return new s8d1[i];
            case 22:
                return new t8d1[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new u8d1[i];
            case 24:
                return new v8d1[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new a9d1[i];
            case 26:
                return new f9d1[i];
            case 27:
                return new fad1[i];
            case 28:
                return new uod1[i];
            default:
                return new mwd1[i];
        }
    }
}
