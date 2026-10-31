package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jhy implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ jhy(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashSet linkedHashSet;
        int i;
        Class cls;
        boolean z;
        switch (this.a) {
            case 0:
                return new khy(parcel.readString());
            case 1:
                return new lhy(dia1.valueOf(parcel.readString()), as3.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                return new rhy((yny) parcel.readParcelable(rhy.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                parcel.readInt();
                return vny.a;
            case 4:
                parcel.readInt();
                return wny.a;
            case 5:
                parcel.readInt();
                return xny.a;
            case 6:
                return new fpy(parcel.readString(), kw91.CREATOR.createFromParcel(parcel), (epy) parcel.readParcelable(fpy.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return epy.a;
            case 8:
                int i2 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                rpy rpyVarCreateFromParcel = rpy.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iD = 0;
                while (iD != i3) {
                    iD = dsl0.d(cq70.CREATOR, parcel, arrayList, iD, 1);
                }
                return new spy(i2, string, string2, string3, rpyVarCreateFromParcel, arrayList, parcel.readString(), parcel.readString());
            case 9:
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iD2 = 0;
                while (iD2 != i4) {
                    iD2 = dsl0.d(arn0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new rpy(string4, arrayList2);
            case 10:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                g3d0 parcelable = parcel.readParcelable(vqy.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i5 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashSet.add(parcel.readParcelable(vqy.class.getClassLoader()));
                    }
                }
                return new vqy(string5, string6, string7, parcelable, linkedHashSet);
            case 11:
                return new ruy(parcel.readString());
            case 12:
                return new twy((ela1) parcel.readParcelable(twy.class.getClassLoader()), parcel.readParcelable(twy.class.getClassLoader()), lf51.r(parcel.readString()));
            case 13:
                return new uwy((ela1) parcel.readParcelable(uwy.class.getClassLoader()), parcel.readParcelable(uwy.class.getClassLoader()), lf51.r(parcel.readString()), null, parcel.readString(), (Throwable) parcel.readSerializable());
            case 14:
                u771 parcelable2 = parcel.readParcelable(wwy.class.getClassLoader());
                int iR = lf51.r(parcel.readString());
                ela1 ela1Var = (ela1) parcel.readParcelable(wwy.class.getClassLoader());
                cuu0 cuu0Var = (cuu0) parcel.readParcelable(wwy.class.getClassLoader());
                llw0 llw0Var = (llw0) parcel.readParcelable(wwy.class.getClassLoader());
                vwy vwyVarValueOf = vwy.valueOf(parcel.readString());
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap.put(vwy.valueOf(parcel.readString()), parcel.readParcelable(wwy.class.getClassLoader()));
                }
                bwe1 parcelable3 = parcel.readParcelable(wwy.class.getClassLoader());
                rhy parcelable4 = parcel.readParcelable(wwy.class.getClassLoader());
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int iH = 0;
                while (iH != i10) {
                    iH = x0d.h(wwy.class, parcel, arrayList3, iH, 1);
                }
                return new wwy(parcelable2, iR, ela1Var, null, cuu0Var, llw0Var, vwyVarValueOf, linkedHashMap, parcelable3, parcelable4, i9, arrayList3);
            case 15:
                return new xwy((ela1) parcel.readParcelable(xwy.class.getClassLoader()), parcel.readParcelable(xwy.class.getClassLoader()), lf51.r(parcel.readString()), (wkt) null);
            case 16:
                String string8 = parcel.readString();
                o1f1 o1f1Var = (o1f1) parcel.readParcelable(exy.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    String string9 = parcel.readString();
                    if (string9 == null) {
                        bhn0.i("Name is null");
                    } else if (string9.equals("PLAYLIST_WITH_TRACKS")) {
                        i = 1;
                    } else if (string9.equals("AI_PLAYLIST_DEFAULT_STICKER")) {
                        i = 2;
                    } else if (string9.equals("AI_PLAYLIST_FUN_COLLECTIBLE")) {
                        i = 3;
                    } else if (string9.equals("AI_PLAYLIST_BETTER_SCREENSHOT")) {
                        i = 4;
                    } else if (string9.equals("MUSIC_VIDEO_PRERELEASE")) {
                        i = 5;
                    } else {
                        hhg1.n("No enum constant com.spotify.share.formats.entity.StickerType.".concat(string9));
                    }
                    i = 0;
                } else {
                    i = 0;
                }
                if (parcel.readInt() != 0) {
                    z = true;
                    cls = exy.class;
                } else {
                    cls = exy.class;
                    z = false;
                }
                return new exy(string8, o1f1Var, i, z, (rhy) (parcel.readInt() != 0 ? rhy.CREATOR.createFromParcel(parcel) : null), parcel.readParcelable(cls.getClassLoader()), (cuu0) parcel.readParcelable(cls.getClassLoader()));
            case 17:
                return gzy.valueOf(parcel.readString());
            case 18:
                rzy rzyVar = new rzy();
                rzyVar.a = 0.0f;
                rzyVar.b = null;
                rzyVar.c = 0.0f;
                rzyVar.c = parcel.readFloat();
                rzyVar.a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    rzyVar.b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return rzyVar;
            case 19:
                parcel.readInt();
                return uzy.b;
            case 20:
                parcel.readInt();
                return vzy.b;
            case 21:
                parcel.readInt();
                return xzy.b;
            case 22:
                parcel.readInt();
                return yzy.b;
            case 23:
                return new j1z(parcel.readString(), parcel.readString(), (jlw0) parcel.readParcelable(j1z.class.getClassLoader()), (Uri) parcel.readParcelable(j1z.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), parcel.readString());
            case 24:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                k4m k4mVarValueOf = k4m.valueOf(parcel.readString());
                boolean z2 = parcel.readInt() != 0;
                String string16 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i11);
                int iD3 = 0;
                while (iD3 != i11) {
                    iD3 = dsl0.d(gp51.CREATOR, parcel, arrayList4, iD3, 1);
                }
                return new t2z(string10, string11, string12, string13, string14, string15, k4mVarValueOf, z2, string16, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 25:
                return new o5z(parcel.readString());
            case 26:
                return new g7z(parcel.readString(), parcel.readBundle(g7z.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                k4m k4mVarValueOf2 = k4m.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                String string21 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int iS = fd21.s(parcel.readString());
                int i12 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i12);
                int iD4 = 0;
                while (iD4 != i12) {
                    iD4 = dsl0.d(gp51.CREATOR, parcel, arrayList5, iD4, 1);
                }
                return new fbz(string17, string18, string19, string20, k4mVarValueOf2, z3, string21, z4, z5, iS, arrayList5, parcel.readInt() != 0, parcel.readString());
            case 28:
                return new ybz((h281) (parcel.readInt() != 0 ? h281.CREATOR.createFromParcel(parcel) : null), j1z.CREATOR.createFromParcel(parcel), (dhe) parcel.readParcelable(ybz.class.getClassLoader()), (llg) parcel.readParcelable(ybz.class.getClassLoader()), (jlw0) parcel.readParcelable(ybz.class.getClassLoader()), so71.CREATOR.createFromParcel(parcel), parcel.readString());
            default:
                parcel.readInt();
                return cez.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new khy[i];
            case 1:
                return new lhy[i];
            case 2:
                return new rhy[i];
            case 3:
                return new vny[i];
            case 4:
                return new wny[i];
            case 5:
                return new xny[i];
            case 6:
                return new fpy[i];
            case 7:
                return new epy[i];
            case 8:
                return new spy[i];
            case 9:
                return new rpy[i];
            case 10:
                return new vqy[i];
            case 11:
                return new ruy[i];
            case 12:
                return new twy[i];
            case 13:
                return new uwy[i];
            case 14:
                return new wwy[i];
            case 15:
                return new xwy[i];
            case 16:
                return new exy[i];
            case 17:
                return new gzy[i];
            case 18:
                return new rzy[i];
            case 19:
                return new uzy[i];
            case 20:
                return new vzy[i];
            case 21:
                return new xzy[i];
            case 22:
                return new yzy[i];
            case 23:
                return new j1z[i];
            case 24:
                return new t2z[i];
            case 25:
                return new o5z[i];
            case 26:
                return new g7z[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new fbz[i];
            case 28:
                return new ybz[i];
            default:
                return new cez[i];
        }
    }
}
