package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v871 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:122:0x033c  */
    /* JADX WARN: Code duplicated, block: B:123:0x033f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0347  */
    /* JADX WARN: Code duplicated, block: B:127:0x034a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        xb71 xb71VarCreateFromParcel;
        ib71 ib71VarValueOf;
        s4b1 s4b1VarX = null;
        switch (this.a) {
            case 0:
                return new w871(parcel.readString());
            case 1:
                return new c971(parcel.readString(), parcel.readString());
            case 2:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iH = 0;
                while (iH != i3) {
                    iH = x0d.h(i971.class, parcel, arrayList, iH, 1);
                }
                return new i971(arrayList, parcel.readInt() != 0, parcel.readInt(), parcel.readParcelable(i971.class.getClassLoader()));
            case 3:
                return new la71(z4p1.e(parcel.readInt()), z4p1.e(parcel.readInt()), parcel.readString());
            case 4:
                return new ma71((Uri) parcel.readParcelable(ma71.class.getClassLoader()), parcel.readString());
            case 5:
                int i4 = 2;
                Uri uri = (Uri) parcel.readParcelable(na71.class.getClassLoader());
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                s4b1 s4b1VarValueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("PLAYING")) {
                        i = 1;
                    } else {
                        if (!string.equals("PAUSED")) {
                            if (string.equals("STOPPED")) {
                                i4 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.share.mediaelement.api.ShareMediaElementUiModel.Video.State.".concat(string));
                            }
                        }
                        i = i4;
                    }
                    b3k1 b3k1VarValueOf = b3k1.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new na71(uri, j, j2, s4b1VarValueOf, i, b3k1VarValueOf, z, z2, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                b3k1 b3k1VarValueOf2 = b3k1.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new na71(uri, j, j2, s4b1VarValueOf, i, b3k1VarValueOf2, z, z2, parcel.readString());
            case 6:
                return new ta71((Uri) parcel.readParcelable(ta71.class.getClassLoader()), parcel.readString(), (h3i0) h3i0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readLong(), parcel.readParcelable(ta71.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                return new ua71(parcel.readString(), parcel.readString(), parcel.readParcelable(ua71.class.getClassLoader()).a, parcel.readParcelable(ua71.class.getClassLoader()));
            case 8:
                return new va71((cmt) cmt.CREATOR.createFromParcel(parcel));
            case 9:
                String string2 = parcel.readString();
                int iF = 0;
                String string3 = parcel.readString();
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                while (iF != i5) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new wa71(string2, string3, mqo1.G(linkedHashMap), parcel.readParcelable(wa71.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readBundle(wa71.class.getClassLoader()));
            case 10:
                return new bb71((u771) u771.CREATOR.createFromParcel(parcel), parcel.readInt(), lf51.r(parcel.readString()));
            case 11:
                parcel.readInt();
                return jb71.a;
            case 12:
                parcel.readInt();
                return kb71.a;
            case 13:
                parcel.readInt();
                return lb71.a;
            case 14:
                return new rb71(parcel.readFloat(), (qb71) parcel.readParcelable(rb71.class.getClassLoader()));
            case 15:
                return new mb71(parcel.readString(), parcel.readString());
            case 16:
                return new nb71(parcel.readString());
            case 17:
                return new ob71(parcel.readString());
            case 18:
                return new pb71(parcel.readString());
            case 19:
                return new sb71(parcel.readParcelable(sb71.class.getClassLoader()), (zb71) parcel.readParcelable(sb71.class.getClassLoader()));
            case 20:
                return new tb71(parcel.readString());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new ub71(parcel.readString());
            case 22:
                ib71 ib71VarValueOf2 = null;
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                rb71 rb71VarCreateFromParcel = rb71.CREATOR.createFromParcel(parcel);
                String string6 = parcel.readString();
                yb71 yb71VarCreateFromParcel = parcel.readInt() == 0 ? null : yb71.CREATOR.createFromParcel(parcel);
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    ib71VarValueOf2 = ib71.valueOf(parcel.readString());
                }
                return new wb71(string4, string5, rb71VarCreateFromParcel, string6, yb71VarCreateFromParcel, string7, ib71VarValueOf2, parcel.readParcelable(wb71.class.getClassLoader()));
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                rb71 rb71VarCreateFromParcel2 = rb71.CREATOR.createFromParcel(parcel);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (string11 != null) {
                    if (string11.equals("Square")) {
                        i2 = 1;
                    } else if (string11.equals("Round")) {
                        i2 = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.campfire.models.ShareMetadata.Loaded.Preview.DefaultPreview.ImageShape.".concat(string11));
                    }
                    if (parcel.readInt() == 0) {
                        xb71VarCreateFromParcel = null;
                    } else {
                        xb71VarCreateFromParcel = xb71.CREATOR.createFromParcel(parcel);
                    }
                    xb71 xb71Var = xb71VarCreateFromParcel;
                    if (parcel.readInt() == 0) {
                        ib71VarValueOf = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e9: MOVE (r10v9 'ib71VarValueOf' p.ib71) = (r8v7 p.ib71) (LINE:234) in method: p.v871.createFromParcel(android.os.Parcel):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v7 p.ib71
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1034
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.v871.createFromParcel(android.os.Parcel):java.lang.Object");
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        switch (this.a) {
                            case 0:
                                return new w871[i];
                            case 1:
                                return new c971[i];
                            case 2:
                                return new i971[i];
                            case 3:
                                return new la71[i];
                            case 4:
                                return new ma71[i];
                            case 5:
                                return new na71[i];
                            case 6:
                                return new ta71[i];
                            case 7:
                                return new ua71[i];
                            case 8:
                                return new va71[i];
                            case 9:
                                return new wa71[i];
                            case 10:
                                return new bb71[i];
                            case 11:
                                return new jb71[i];
                            case 12:
                                return new kb71[i];
                            case 13:
                                return new lb71[i];
                            case 14:
                                return new rb71[i];
                            case 15:
                                return new mb71[i];
                            case 16:
                                return new nb71[i];
                            case 17:
                                return new ob71[i];
                            case 18:
                                return new pb71[i];
                            case 19:
                                return new sb71[i];
                            case 20:
                                return new tb71[i];
                            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                                return new ub71[i];
                            case 22:
                                return new wb71[i];
                            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                                return new yb71[i];
                            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                                return new xb71[i];
                            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                                return new ne71[i];
                            case 26:
                                return new oe71[i];
                            case 27:
                                return new qe71[i];
                            case 28:
                                return new re71[i];
                            default:
                                return new se71[i];
                        }
                    }
                }
