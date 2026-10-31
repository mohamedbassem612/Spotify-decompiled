package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wxf implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ wxf(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = null;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return xxf.b;
            case 1:
                parcel.readInt();
                return yxf.b;
            case 2:
                return new dyf(parcel.readString());
            case 3:
                return new lyf(parcel.readParcelable(lyf.class.getClassLoader()), parcel.readParcelable(lyf.class.getClassLoader()), (Uri) parcel.readParcelable(lyf.class.getClassLoader()));
            case 4:
                return new gyf(parcel.readString());
            case 5:
                parcel.readInt();
                return hyf.a;
            case 6:
                parcel.readInt();
                return iyf.a;
            case 7:
                return new jyf(parcel.readString());
            case 8:
                return new gzf(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                zzy parcelable = parcel.readParcelable(v1g.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new v1g(string, string2, string3, parcelable, boolValueOf2, pe11.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new b2g(boolValueOf, string4, parcel.readParcelable(b2g.class.getClassLoader()));
            case 11:
                return new o2g(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 12:
                return new a4g(parcel.readString(), parcel.readString());
            case 13:
                return new m4g(parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new d5g(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? i5l1.CREATOR.createFromParcel(parcel) : null, parcel.readParcelable(d5g.class.getClassLoader()), lra.CREATOR.createFromParcel(parcel));
            case 15:
                return new v5g(parcel.readParcelable(v5g.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 16:
                return new t8g((s8g) parcel.readParcelable(t8g.class.getClassLoader()));
            case 17:
                return new t7g(parcel.readInt() != 0, parcel.readString());
            case 18:
                return new u7g(t7g.CREATOR.createFromParcel(parcel), h9g.CREATOR.createFromParcel(parcel));
            case 19:
                parcel.readInt();
                return v7g.a;
            case 20:
                return new x7g(t7g.CREATOR.createFromParcel(parcel), h9g.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.readInt();
                return y7g.a;
            case 22:
                parcel.readInt();
                return a8g.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new b8g(g9g.CREATOR.createFromParcel(parcel));
            case 24:
                parcel.readInt();
                return c8g.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new d8g(t7g.CREATOR.createFromParcel(parcel));
            case 26:
                t7g t7gVarCreateFromParcel = t7g.CREATOR.createFromParcel(parcel);
                h9g h9gVarCreateFromParcel = h9g.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    String string5 = parcel.readString();
                    if (string5 != null) {
                        if (!string5.equals("SPOTIFY")) {
                            if (string5.equals("SPOTIFY_NATIVE")) {
                                i = 2;
                            } else if (string5.equals("GPB")) {
                                i = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.gpb.choicescreenuc.domain.ChoiceScreenUcModel.State.Loaded.Choice.".concat(string5));
                            }
                        }
                        i2 = i;
                    } else {
                        bhn0.i("Name is null");
                    }
                    i = 0;
                    i2 = i;
                }
                return new e8g(t7gVarCreateFromParcel, h9gVarCreateFromParcel, i2);
            case 27:
                parcel.readInt();
                return f8g.a;
            case 28:
                return new g8g(t7g.CREATOR.createFromParcel(parcel));
            default:
                return new h8g(t7g.CREATOR.createFromParcel(parcel), f9g.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new xxf[i];
            case 1:
                return new yxf[i];
            case 2:
                return new dyf[i];
            case 3:
                return new lyf[i];
            case 4:
                return new gyf[i];
            case 5:
                return new hyf[i];
            case 6:
                return new iyf[i];
            case 7:
                return new jyf[i];
            case 8:
                return new gzf[i];
            case 9:
                return new v1g[i];
            case 10:
                return new b2g[i];
            case 11:
                return new o2g[i];
            case 12:
                return new a4g[i];
            case 13:
                return new m4g[i];
            case 14:
                return new d5g[i];
            case 15:
                return new v5g[i];
            case 16:
                return new t8g[i];
            case 17:
                return new t7g[i];
            case 18:
                return new u7g[i];
            case 19:
                return new v7g[i];
            case 20:
                return new x7g[i];
            case 21:
                return new y7g[i];
            case 22:
                return new a8g[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new b8g[i];
            case 24:
                return new c8g[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new d8g[i];
            case 26:
                return new e8g[i];
            case 27:
                return new f8g[i];
            case 28:
                return new g8g[i];
            default:
                return new h8g[i];
        }
    }
}
