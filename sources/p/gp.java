package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gp implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:101:0x0225 A[LOOP:3: B:100:0x0223->B:101:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x023a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0242  */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:109:0x024d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0250  */
    /* JADX WARN: Code duplicated, block: B:112:0x025c  */
    /* JADX WARN: Code duplicated, block: B:114:0x026d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0271  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af A[LOOP:1: B:78:0x01ad->B:79:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x0205 A[LOOP:2: B:97:0x0203->B:98:0x0205, LOOP_END] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap;
        fgh0 fgh0Var;
        String string;
        String string2;
        String string3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        LinkedHashMap linkedHashMap2;
        int i7;
        String string4;
        int i8;
        switch (this.a) {
            case 0:
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                int iH = 0;
                while (iH != i9) {
                    iH = x0d.h(hp.class, parcel, arrayList2, iH, 1);
                }
                return new hp(arrayList2, (Intent) parcel.readParcelable(hp.class.getClassLoader()), parcel.readParcelable(hp.class.getClassLoader()), parcel.readParcelable(hp.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 1:
                return new us(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int iH2 = 0;
                while (iH2 != i10) {
                    iH2 = x0d.h(vs.class, parcel, arrayList3, iH2, 1);
                }
                return new vs(mqo1.F(arrayList3), parcel.readInt() != 0, parcel.readParcelable(vs.class.getClassLoader()), parcel.readInt() != 0);
            case 3:
                return new ws(parcel.readInt() != 0);
            case 4:
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("NOT_STARTED")) {
                        i = 1;
                    } else if (string5.equals("IN_PROGRESS")) {
                        i = 2;
                    } else if (string5.equals("CANCELLED")) {
                        i = 3;
                    } else if (string5.equals("FAILED")) {
                        i = 4;
                    } else if (string5.equals(SearchEndpointResponseKt.RESULT_SUCCESS)) {
                        i = 5;
                    } else {
                        hhg1.n("No enum constant com.spotify.accountswitching.switcheruiimpl.mobius.models.AccountSwitchStatus.".concat(string5));
                    }
                    return new zu(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new zu(i);
            case 5:
                return new av(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new bv(parcel.readString());
            case 7:
                return new ev(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 8:
                return new ax(parcel.readString());
            case 9:
                return new bx(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(bx.class.getClassLoader()));
            case 10:
                return new cx(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 11:
                parcel.readInt();
                return dz.a;
            case 12:
                parcel.readInt();
                return ez.a;
            case 13:
                parcel.readInt();
                return xz.a;
            case 14:
                return new r00(parcel.readString());
            case 15:
                return new y00(parcel.readString());
            case 16:
                return new u10(parcel.readInt() != 0);
            case 17:
                return new v10(parcel.readParcelable(v10.class.getClassLoader()));
            case 18:
                return new m20(parcel.readString());
            case 19:
                return new jf0(hcx.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 20:
                parcel.readInt();
                return kf0.a;
            case 21:
                return new ah0(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 22:
                int iF = 0;
                String string6 = parcel.readString();
                if (string6 == null) {
                    hhg1.n("AdIdentifier value cannot be null in parcel");
                    return null;
                }
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (string11 != null) {
                    if (string11.equals("NORMAL")) {
                        i2 = 1;
                    } else if (string11.equals("REMINDER_AD")) {
                        i2 = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.adsinternal.adscore.model.Ad.AdType.".concat(string11));
                    }
                    i3 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i3);
                    while (iF != i3) {
                        iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                    }
                    fgh0Var = (fgh0) fgh0.CREATOR.createFromParcel(parcel);
                    string = parcel.readString();
                    if (string != null) {
                        hhg1.n("LineItemIdentifier value cannot be null in parcel");
                        return 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0279: RETURN (r14v0 ?? I:??[OBJECT, ARRAY]) A[SYNTHETIC] (LINE:634) in method: p.gp.createFromParcel(android.os.Parcel):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes12.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1352
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.gp.createFromParcel(android.os.Parcel):java.lang.Object");
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        switch (this.a) {
                            case 0:
                                return new hp[i];
                            case 1:
                                return new us[i];
                            case 2:
                                return new vs[i];
                            case 3:
                                return new ws[i];
                            case 4:
                                return new zu[i];
                            case 5:
                                return new av[i];
                            case 6:
                                return new bv[i];
                            case 7:
                                return new ev[i];
                            case 8:
                                return new ax[i];
                            case 9:
                                return new bx[i];
                            case 10:
                                return new cx[i];
                            case 11:
                                return new dz[i];
                            case 12:
                                return new ez[i];
                            case 13:
                                return new xz[i];
                            case 14:
                                return new r00[i];
                            case 15:
                                return new y00[i];
                            case 16:
                                return new u10[i];
                            case 17:
                                return new v10[i];
                            case 18:
                                return new m20[i];
                            case 19:
                                return new jf0[i];
                            case 20:
                                return new kf0[i];
                            case 21:
                                return new ah0[i];
                            case 22:
                                return new ji0[i];
                            case 23:
                                return new zp0[i];
                            case 24:
                                return new gw0[i];
                            case 25:
                                return new a11[i];
                            case 26:
                                return new p21[i];
                            case 27:
                                return new q21[i];
                            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                                return new r21[i];
                            default:
                                return new q41[i];
                        }
                    }
                }
