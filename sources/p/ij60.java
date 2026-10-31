package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ij60 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:144:0x037f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0384  */
    /* JADX WARN: Code duplicated, block: B:148:0x038e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0393  */
    /* JADX WARN: Code duplicated, block: B:152:0x039d  */
    /* JADX WARN: Code duplicated, block: B:153:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:156:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03db  */
    /* JADX WARN: Code duplicated, block: B:169:0x03de  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:174:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:175:0x03fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r22v3, types: [int] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [int] */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r22;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String string;
        Object objCreateFromParcel;
        b380 b380VarP;
        int i = 3;
        ?? r4 = 2;
        switch (this.a) {
            case 0:
                return new jj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                return new kj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                return new lj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new mj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new nj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new oj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 6:
                return new pj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
            case 7:
                return new qj60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new yj60(parcel.readString(), parcel.readString());
            case 9:
                String string2 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                ck60 ck60VarValueOf = ck60.valueOf(parcel.readString());
                boolean z9 = parcel.readInt() != 0;
                int iS = fd21.s(parcel.readString());
                k4m k4mVarValueOf = k4m.valueOf(parcel.readString());
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                    z2 = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = false;
                    z4 = z ? 1 : 0;
                } else {
                    z3 = false;
                    z4 = false;
                }
                boolean z12 = parcel.readInt() != 0 ? z ? 1 : 0 : z3 ? 1 : 0;
                boolean z13 = parcel.readInt() != 0 ? z ? 1 : 0 : z3 ? 1 : 0;
                if (parcel.readInt() == 0) {
                    z = z3 ? 1 : 0;
                }
                boolean z14 = parcel.readInt() != 0 ? z : z3;
                boolean z15 = parcel.readInt() != 0 ? z : z3;
                boolean z16 = parcel.readInt() != 0 ? z : z3;
                boolean z17 = parcel.readInt() != 0 ? z : z3;
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("WIDE")) {
                        r22 = z;
                    } else if (string5.equals("NONE")) {
                        r22 = r4;
                    } else {
                        hhg1.n("No enum constant com.spotify.search.uiusecases.historyrow.HistoryRowSearch.VideoMetadataType.".concat(string5));
                    }
                    if (parcel.readInt() != 0) {
                        z5 = z;
                    } else {
                        z5 = z3;
                    }
                    if (parcel.readInt() != 0) {
                        z6 = z;
                    } else {
                        z6 = z3;
                    }
                    if (parcel.readInt() != 0) {
                        z7 = z;
                    } else {
                        z7 = z3;
                    }
                    if (parcel.readInt() != 0) {
                        z8 = z ? 1 : 0;
                    } else {
                        z8 = z3 ? 1 : 0;
                    }
                    string = parcel.readString();
                    if (string != null) {
                        if (string.equals("Original")) {
                            r4 = z;
                        } else if (!string.equals("RestrictedWithTrackCover")) {
                            if (string.equals("RestrictedWithPlaceholder")) {
                                r4 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.search.uiusecases.historyrow.HistoryRowSearch.VideoArtworkStyle.".concat(string));
                            }
                        }
                        String string6 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            objCreateFromParcel = null;
                        } else {
                            objCreateFromParcel = yj60.CREATOR.createFromParcel(parcel);
                        }
                        return new bk60(string2, charSequence, string3, string4, ck60VarValueOf, z9, iS, k4mVarValueOf, z10, z11, z2, z4, z12, z13, z, z14, z15, z16, z17, (int) r22, z5, z6, z7, z8, (int) r4, string6, (yj60) objCreateFromParcel);
                    }
                    bhn0.i("Name is null");
                    r4 = 0;
                    String string7 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        objCreateFromParcel = null;
                    } else {
                        objCreateFromParcel = yj60.CREATOR.createFromParcel(parcel);
                    }
                    return new bk60(string2, charSequence, string3, string4, ck60VarValueOf, z9, iS, k4mVarValueOf, z10, z11, z2, z4, z12, z13, z, z14, z15, z16, z17, (int) r22, z5, z6, z7, z8, (int) r4, string7, (yj60) objCreateFromParcel);
                }
                bhn0.i((String) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0375: INVOKE (wrap java.lang.String:?: CAST (java.lang.String) (r7v3 ?? I:??[OBJECT, ARRAY])) STATIC call: p.bhn0.i(java.lang.String):void (LINE:886) in method: p.ij60.createFromParcel(android.os.Parcel):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v3 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1366
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.ij60.createFromParcel(android.os.Parcel):java.lang.Object");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.a) {
                    case 0:
                        return new jj60[i];
                    case 1:
                        return new kj60[i];
                    case 2:
                        return new lj60[i];
                    case 3:
                        return new mj60[i];
                    case 4:
                        return new nj60[i];
                    case 5:
                        return new oj60[i];
                    case 6:
                        return new pj60[i];
                    case 7:
                        return new qj60[i];
                    case 8:
                        return new yj60[i];
                    case 9:
                        return new bk60[i];
                    case 10:
                        return new nw60[i];
                    case 11:
                        return new zy60[i];
                    case 12:
                        return new f470[i];
                    case 13:
                        return new m470[i];
                    case 14:
                        return new v870[i];
                    case 15:
                        return new ia70[i];
                    case 16:
                        return new sc70[i];
                    case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                        return new HubsImmutableComponentBundle[i];
                    case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                        return new ad70[i];
                    case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                        return new dd70[i];
                    case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                        return new gd70[i];
                    case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                        return new id70[i];
                    case 22:
                        return new ld70[i];
                    case 23:
                        return new od70[i];
                    case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                        return new rd70[i];
                    case 25:
                        return new ud70[i];
                    case 26:
                        return new he70[i];
                    case 27:
                        return new ne70[i];
                    case 28:
                        return new yh70[i];
                    default:
                        return new zh70[i];
                }
            }
        }
