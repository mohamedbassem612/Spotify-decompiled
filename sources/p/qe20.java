package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qe20 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 3;
        int iH = 0;
        switch (this.a) {
            case 0:
                xo20 xo20Var = (xo20) parcel.readParcelable(re20.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iH2 = 0;
                while (iH2 != i2) {
                    iH2 = x0d.h(re20.class, parcel, arrayList, iH2, 1);
                }
                return new re20(xo20Var, arrayList, parcel.readInt() != 0);
            case 1:
                parcel.readInt();
                return se20.a;
            case 2:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iH != i3) {
                    iH = x0d.h(te20.class, parcel, arrayList2, iH, 1);
                }
                return new te20(arrayList2, parcel.readString());
            case 3:
                return new gf20(parcel.readInt());
            case 4:
                return new hf20(parcel.readString());
            case 5:
                xf20 xf20VarCreateFromParcel = xf20.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iH != i4) {
                    iH = dsl0.d(wf20.CREATOR, parcel, arrayList3, iH, 1);
                }
                return new yf20(xf20VarCreateFromParcel, mqo1.F(arrayList3));
            case 6:
                return new wf20(parcel.readString(), parcel.readString());
            case 7:
                return new xf20(parcel.readString());
            case 8:
                return new jg20(parcel.readString());
            case 9:
                return new kg20(parcel.readInt() != 0);
            case 10:
                return new uh20(parcel.readString());
            case 11:
                return new il20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readParcelable(il20.class.getClassLoader()));
            case 12:
                return new xo20(parcel.readString(), (wo20) parcel.readParcelable(xo20.class.getClassLoader()));
            case 13:
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("VIDEOS")) {
                        i = 1;
                    } else if (string.equals("PODCAST_AND_EPISODES")) {
                        i = 2;
                    } else if (!string.equals("LIVE_EVENTS")) {
                        hhg1.n("No enum constant com.spotify.search.searchview.FlatFilter.Variant.ContentFilter.Type.".concat(string));
                    }
                    return new to20(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new to20(i);
            case 14:
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("ALBUM")) {
                        i = 1;
                    } else if (string2.equals("ARTIST")) {
                        i = 2;
                    } else if (!string2.equals("AUDIOBOOK")) {
                        if (string2.equals("GENRE")) {
                            i = 4;
                        } else if (string2.equals("PLAYLIST")) {
                            i = 5;
                        } else if (string2.equals("PROFILE")) {
                            i = 6;
                        } else if (string2.equals("TRACK")) {
                            i = 7;
                        } else {
                            hhg1.n("No enum constant com.spotify.search.searchview.FlatFilter.Variant.EntityFilter.Type.".concat(string2));
                        }
                    }
                    return new uo20(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new uo20(i);
            case 15:
                String string3 = parcel.readString();
                if (string3 == null) {
                    bhn0.i("Name is null");
                } else if (!string3.equals("MOST_RECENT")) {
                    hhg1.n("No enum constant com.spotify.search.searchview.FlatFilter.Variant.UploadDateFilter.Type.".concat(string3));
                }
                return new vo20(1);
            case 16:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                while (iH != i5) {
                    iH = dsl0.d(xo20.CREATOR, parcel, arrayList4, iH, 1);
                }
                return new yo20(arrayList4);
            case 17:
                return new np20(parcel.readInt(), (qp20) (parcel.readInt() != 0 ? qp20.CREATOR.createFromParcel(parcel) : null));
            case 18:
                return new pp20(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (qp20) (parcel.readInt() != 0 ? qp20.CREATOR.createFromParcel(parcel) : null));
            case 19:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iH != i6) {
                    iH = dsl0.d(s7t0.CREATOR, parcel, arrayList5, iH, 1);
                }
                return new qp20(string4, string5, string6, string7, string8, arrayList5, parcel.readString());
            case 20:
                xp20 xp20Var = new xp20(0, 0);
                xp20Var.a = 1;
                xp20Var.b = 0.0f;
                xp20Var.c = 1.0f;
                xp20Var.d = -1;
                xp20Var.e = -1.0f;
                xp20Var.f = -1;
                xp20Var.g = -1;
                xp20Var.h = 16777215;
                xp20Var.i = 16777215;
                xp20Var.a = parcel.readInt();
                xp20Var.b = parcel.readFloat();
                xp20Var.c = parcel.readFloat();
                xp20Var.d = parcel.readInt();
                xp20Var.e = parcel.readFloat();
                xp20Var.f = parcel.readInt();
                xp20Var.g = parcel.readInt();
                xp20Var.h = parcel.readInt();
                xp20Var.i = parcel.readInt();
                xp20Var.t = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) xp20Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) xp20Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) xp20Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) xp20Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) xp20Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) xp20Var).width = parcel.readInt();
                return xp20Var;
            case 21:
                zp20 zp20Var = new zp20(-2, -2);
                zp20Var.e = 0.0f;
                zp20Var.f = 1.0f;
                zp20Var.g = -1;
                zp20Var.h = -1.0f;
                zp20Var.X = 16777215;
                zp20Var.Y = 16777215;
                zp20Var.e = parcel.readFloat();
                zp20Var.f = parcel.readFloat();
                zp20Var.g = parcel.readInt();
                zp20Var.h = parcel.readFloat();
                zp20Var.i = parcel.readInt();
                zp20Var.t = parcel.readInt();
                zp20Var.X = parcel.readInt();
                zp20Var.Y = parcel.readInt();
                zp20Var.Z = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) zp20Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zp20Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zp20Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zp20Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zp20Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zp20Var).width = parcel.readInt();
                return zp20Var;
            case 22:
                bq20 bq20Var = new bq20();
                bq20Var.a = parcel.readInt();
                bq20Var.b = parcel.readInt();
                return bq20Var;
            case 23:
                return new ss20(parcel.readString());
            case 24:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap.put(parcel.readParcelable(fw20.class.getClassLoader()), parcel.readParcelable(fw20.class.getClassLoader()));
                }
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                while (iH != i9) {
                    iH = x0d.h(fw20.class, parcel, arrayList6, iH, 1);
                }
                return new fw20(linkedHashMap, arrayList6);
            case 25:
                return new dx20(parcel.readParcelable(dx20.class.getClassLoader()));
            case 26:
                parcel.readInt();
                return ex20.d;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                parcel.readInt();
                return fx20.d;
            case 28:
                parcel.readInt();
                return gx20.d;
            default:
                parcel.readInt();
                return hx20.d;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new re20[i];
            case 1:
                return new se20[i];
            case 2:
                return new te20[i];
            case 3:
                return new gf20[i];
            case 4:
                return new hf20[i];
            case 5:
                return new yf20[i];
            case 6:
                return new wf20[i];
            case 7:
                return new xf20[i];
            case 8:
                return new jg20[i];
            case 9:
                return new kg20[i];
            case 10:
                return new uh20[i];
            case 11:
                return new il20[i];
            case 12:
                return new xo20[i];
            case 13:
                return new to20[i];
            case 14:
                return new uo20[i];
            case 15:
                return new vo20[i];
            case 16:
                return new yo20[i];
            case 17:
                return new np20[i];
            case 18:
                return new pp20[i];
            case 19:
                return new qp20[i];
            case 20:
                return new xp20[i];
            case 21:
                return new zp20[i];
            case 22:
                return new bq20[i];
            case 23:
                return new ss20[i];
            case 24:
                return new fw20[i];
            case 25:
                return new dx20[i];
            case 26:
                return new ex20[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new fx20[i];
            case 28:
                return new gx20[i];
            default:
                return new hx20[i];
        }
    }
}
