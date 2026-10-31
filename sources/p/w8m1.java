package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w8m1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ w8m1(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c9  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        char c;
        CardShareConfiguration cardShareConfigurationD;
        boolean z;
        CardShareConfiguration cardShareConfiguration;
        sj31 sj31Var;
        pj31 pj31Var;
        qj31 qj31Var;
        Object rj31Var;
        ArrayList arrayList = null;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new x8m1(parcel.readString(), parcel.readParcelable(x8m1.class.getClassLoader()), parcel.readParcelable(x8m1.class.getClassLoader()));
            case 1:
                parcel.readInt();
                return y8m1.a;
            case 2:
                parcel.readInt();
                return z8m1.a;
            case 3:
                return new a9m1((z0c1) parcel.readParcelable(a9m1.class.getClassLoader()));
            case 4:
                return new b9m1((z0c1) parcel.readParcelable(b9m1.class.getClassLoader()), parcel.readString());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("SCREENSHOT")) {
                        c = 1;
                    } else if (string2.equals("BUTTON")) {
                        c = 2;
                    } else {
                        hhg1.n("No enum constant com.spotify.campaigns.wrapped.share.content.WrappedContentShare.Source.".concat(string2));
                    }
                    cardShareConfigurationD = i371.c.d(parcel);
                    Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    if (parcel.readInt() != 0) {
                        cardShareConfiguration = cardShareConfigurationD;
                        z = true;
                    } else {
                        z = false;
                        cardShareConfiguration = cardShareConfigurationD;
                    }
                    return new c9m1(string, c, cardShareConfiguration, numValueOf, z);
                }
                bhn0.i("Name is null");
                c = 0;
                cardShareConfigurationD = i371.c.d(parcel);
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                    cardShareConfiguration = cardShareConfigurationD;
                    z = true;
                } else {
                    z = false;
                    cardShareConfiguration = cardShareConfigurationD;
                }
                return new c9m1(string, c, cardShareConfiguration, numValueOf, z);
            case 6:
                parcel.readInt();
                return u9m1.a;
            case 7:
                return new v9m1(parcel.readString(), (x1c1) parcel.readParcelable(v9m1.class.getClassLoader()));
            case 8:
                parcel.readInt();
                return x9m1.a;
            case 9:
                parcel.readInt();
                return y9m1.a;
            case 10:
                parcel.readInt();
                return z9m1.a;
            case 11:
                return new aam1(parcel.readString());
            case 12:
                parcel.readInt();
                return bam1.a;
            case 13:
                return new cam1(parcel.readString(), parcel.readParcelable(cam1.class.getClassLoader()), parcel.readParcelable(cam1.class.getClassLoader()));
            case 14:
                parcel.readInt();
                return dam1.a;
            case 15:
                parcel.readInt();
                return eam1.a;
            case 16:
                return new gam1((z0c1) parcel.readParcelable(gam1.class.getClassLoader()));
            case 17:
                return new ham1((z0c1) parcel.readParcelable(ham1.class.getClassLoader()), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return iam1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new jam1(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
            case 20:
                parcel.readInt();
                return kam1.a;
            case 21:
                parcel.readInt();
                return lam1.a;
            case 22:
                return new mam1((StoryCard) q6c1.c.d(parcel));
            case 23:
                return new nam1((StoryCard) q6c1.c.d(parcel), parcel.readInt() != 0);
            case 24:
                StoryCard storyCard = (StoryCard) q6c1.c.d(parcel);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(acm1.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new acm1(storyCard, linkedHashMap, linkedHashMap2, (egm1) parcel.readParcelable(acm1.class.getClassLoader()), parcel.readInt() != 0);
            case 25:
                parcel.readInt();
                return dcm1.a;
            case 26:
                return new ffm1(parcel.readParcelable(ffm1.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readInt() != 0);
            case 27:
                return new gfm1(parcel.readString());
            case 28:
                String string3 = parcel.readString();
                tr80 tr80VarQ = yoi1.Q(0, parcel.readInt());
                ArrayList arrayList2 = new ArrayList();
                lr80 it = tr80VarQ.iterator();
                while (((sr80) it).c) {
                    it.nextInt();
                    int i5 = parcel.readInt();
                    String string4 = parcel.readString();
                    if (string4 == null) {
                        eg.m("path is null in parcel");
                        return null;
                    }
                    switch (i5) {
                        case 0:
                            rj31Var = new rj31(string4, parcel.readFloat());
                            break;
                        case 1:
                            rj31Var = new nj31(string4, parcel.readInt() != 0);
                            break;
                        case 2:
                            String string5 = parcel.readString();
                            if (string5 == null) {
                                eg.m("string value is null in parcel");
                                return null;
                            }
                            sj31Var = new sj31(string4, string5);
                            break;
                            break;
                        case 3:
                            rj31Var = new oj31(string4, parcel.readInt());
                            break;
                        case 4:
                            String string6 = parcel.readString();
                            if (string6 == null) {
                                eg.m("enum value is null in parcel");
                                return null;
                            }
                            pj31Var = new pj31(string4, string6);
                            break;
                            break;
                        case 5:
                            rj31Var = new tj31(string4);
                            break;
                        case 6:
                            String string7 = parcel.readString();
                            if (string7 == null) {
                                eg.m("image file path is null in parcel");
                                return null;
                            }
                            qj31Var = new qj31(string4, y520.G(new File(string7)));
                            break;
                            break;
                        default:
                            rj31Var = null;
                            break;
                    }
                    if (rj31Var != null) {
                        rj31Var = sj31Var;
                        rj31Var = pj31Var;
                        rj31Var = qj31Var;
                        arrayList2.add(rj31Var);
                    } else {
                        rj31Var = sj31Var;
                        rj31Var = pj31Var;
                        rj31Var = qj31Var;
                    }
                }
                return new hfm1(string3, parcel.createStringArrayList(), arrayList2);
            default:
                String string8 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    int i6 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i6);
                    while (iD != i6) {
                        iD = dsl0.d(ffm1.CREATOR, parcel, arrayList3, iD, 1);
                    }
                    arrayList = arrayList3;
                }
                return new jfm1(string8, arrayList, z2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x8m1[i];
            case 1:
                return new y8m1[i];
            case 2:
                return new z8m1[i];
            case 3:
                return new a9m1[i];
            case 4:
                return new b9m1[i];
            case 5:
                return new c9m1[i];
            case 6:
                return new u9m1[i];
            case 7:
                return new v9m1[i];
            case 8:
                return new x9m1[i];
            case 9:
                return new y9m1[i];
            case 10:
                return new z9m1[i];
            case 11:
                return new aam1[i];
            case 12:
                return new bam1[i];
            case 13:
                return new cam1[i];
            case 14:
                return new dam1[i];
            case 15:
                return new eam1[i];
            case 16:
                return new gam1[i];
            case 17:
                return new ham1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new iam1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new jam1[i];
            case 20:
                return new kam1[i];
            case 21:
                return new lam1[i];
            case 22:
                return new mam1[i];
            case 23:
                return new nam1[i];
            case 24:
                return new acm1[i];
            case 25:
                return new dcm1[i];
            case 26:
                return new ffm1[i];
            case 27:
                return new gfm1[i];
            case 28:
                return new hfm1[i];
            default:
                return new jfm1[i];
        }
    }
}
