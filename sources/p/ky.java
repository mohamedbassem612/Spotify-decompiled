package p;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ky extends l570 {
    public final /* synthetic */ byte b;
    public final Object c;
    public final vx40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(qzh qzhVar, vx40 vx40Var, byte b) {
        super(qzhVar.getView());
        this.b = b;
        switch (b) {
            case 1:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 2:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 3:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 4:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 5:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 6:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 7:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 8:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 9:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 10:
                View view = qzhVar.getView();
                super(view);
                this.c = qzhVar;
                this.d = vx40Var;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    mf20 mf20Var = new mf20(z561.T(aht.g, new i46(viewGroup, (byte) 8)));
                    while (mf20Var.hasNext()) {
                        ((TextView) mf20Var.next()).setGravity(1);
                    }
                }
                break;
            case 11:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 12:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 13:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            case 14:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = vx40Var;
                break;
            default:
                this.c = qzhVar;
                this.d = vx40Var;
                break;
        }
    }

    public static void u(String str, l670 l670Var, y570 y570Var) {
        if (y570Var.j().containsKey(str)) {
            l670Var.c.d(new u570(str, y570Var, gg11.g));
        }
    }

    /* JADX WARN: Code duplicated, block: B:292:0x0598  */
    /* JADX WARN: Code duplicated, block: B:293:0x059b  */
    /* JADX WARN: Code duplicated, block: B:296:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:300:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:301:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:304:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:305:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:308:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:309:0x05e5  */
    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        String str;
        ArrayList arrayList;
        int i;
        String strB;
        String str2;
        String strB2;
        String str3;
        String strB3;
        String str4;
        String strB4;
        String str5;
        String strB5;
        String str6;
        byte b = this.b;
        vx40 vx40Var = this.d;
        Object obj = this.c;
        switch (b) {
            case 0:
                qzh qzhVar = (qzh) obj;
                String str7 = y570Var.n().a.a;
                String str8 = str7 == null ? "" : str7;
                String strB6 = y570Var.g().B("entityTitleColor");
                String str9 = strB6 == null ? "" : strB6;
                String str10 = y570Var.n().a.b;
                String str11 = str10 == null ? "" : str10;
                String strB7 = y570Var.g().B("collectibleTitleColor");
                String str12 = strB7 == null ? "" : strB7;
                String strB8 = y570Var.g().B("date");
                String str13 = strB8 == null ? "" : strB8;
                String strB9 = y570Var.g().B("detailsTitle");
                String str14 = strB9 == null ? "" : strB9;
                String strB10 = y570Var.g().B("premiumLabel");
                String str15 = strB10 == null ? "" : strB10;
                String strB11 = y570Var.g().B("contentBackgroundImageUrl");
                String str16 = strB11 == null ? "" : strB11;
                ld70 ld70Var = y570Var.k().a.c;
                String str17 = ld70Var != null ? ld70Var.a.c : null;
                String str18 = str17 == null ? "" : str17;
                ld70 ld70Var2 = y570Var.k().a.d;
                String str19 = ld70Var2 != null ? ld70Var2.a.c : null;
                String str20 = str19 == null ? "" : str19;
                String strB12 = y570Var.g().B("entityTitle");
                String str21 = strB12 == null ? "" : strB12;
                String strB13 = y570Var.g().B("collectibleTitle");
                qzhVar.f(new uzg(str8, str11, str9, str12, str13, str14, str18, str15, str21, strB13 == null ? "" : strB13, str20, str16));
                qzhVar.n(new jy(l670Var, y570Var, (byte) 0));
                vx40Var.v(y570Var);
                break;
            case 1:
                qzh qzhVar2 = (qzh) obj;
                String str22 = y570Var.n().a.a;
                if (str22 == null) {
                    str22 = "";
                }
                String strB14 = y570Var.g().B("ctaButtonText");
                if (strB14 == null) {
                    strB14 = "";
                }
                qzhVar2.f(new s6j0(str22, strB14));
                qzhVar2.n(new jy(l670Var, y570Var, (byte) 1));
                vx40Var.v(y570Var);
                break;
            case 2:
                qzh qzhVar3 = (qzh) obj;
                String str23 = y570Var.n().a.a;
                String str24 = str23 == null ? "" : str23;
                String str25 = y570Var.n().a.b;
                String str26 = str25 == null ? "" : str25;
                String strB15 = y570Var.g().B("ctaButtonText");
                String str27 = strB15 == null ? "" : strB15;
                ld70 ld70Var3 = y570Var.k().a.d;
                String str28 = ld70Var3 != null ? ld70Var3.a.c : null;
                String str29 = str28 == null ? "" : str28;
                ld70 ld70Var4 = y570Var.k().a.c;
                String str30 = ld70Var4 != null ? ld70Var4.a.c : null;
                qzhVar3.f(new gka(str24, str26, str27, str29, str30 == null ? "" : str30));
                qzhVar3.n(new jy(this, l670Var, y570Var, (byte) 3));
                vx40Var.v(y570Var);
                break;
            case 3:
                qzh qzhVar4 = (qzh) obj;
                ld70 ld70Var5 = y570Var.k().a.c;
                String str31 = ld70Var5 != null ? ld70Var5.a.c : null;
                if (str31 == null) {
                    str31 = "";
                }
                qzhVar4.f(new fpg(str31));
                qzhVar4.n(new jy(this, y570Var, l670Var, (byte) 5));
                vx40Var.v(y570Var);
                break;
            case 4:
                qzh qzhVar5 = (qzh) obj;
                ld70 ld70Var6 = y570Var.k().a.c;
                String str32 = ld70Var6 != null ? ld70Var6.a.c : null;
                String str33 = str32 == null ? "" : str32;
                String strB16 = y570Var.g().B("premiumOnlyText");
                String str34 = strB16 == null ? "" : strB16;
                String str35 = y570Var.n().a.a;
                String str36 = str35 == null ? "" : str35;
                String str37 = y570Var.n().a.b;
                String str38 = str37 == null ? "" : str37;
                String strB17 = y570Var.g().B("ctaButtonText");
                qzhVar5.f(new fs40(str33, str34, str36, str38, strB17 == null ? "" : strB17));
                qzhVar5.n(new jy(y570Var, l670Var));
                vx40Var.v(y570Var);
                break;
            case 5:
                qzh qzhVar6 = (qzh) obj;
                String str39 = y570Var.n().a.a;
                if (str39 == null) {
                    str39 = "";
                }
                String str40 = y570Var.n().a.b;
                if (str40 == null || ihc1.y0(str40)) {
                    str40 = null;
                }
                String str41 = y570Var.n().a.c;
                if (str41 == null || ihc1.y0(str41)) {
                    str41 = null;
                }
                qzhVar6.f(new sfo(str39, str40, str41));
                qzhVar6.n(new jy(this, y570Var, l670Var, (byte) 8));
                vx40Var.v(y570Var);
                break;
            case 6:
                ld70 ld70Var7 = y570Var.k().a.c;
                if (ld70Var7 == null || (str = ld70Var7.a.d) == null) {
                    str = "time";
                }
                int iC = c(2131101567, y570Var.g().B("foregroundColor"));
                int iC2 = c(2131101566, y570Var.g().B("backgroundColor"));
                HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = y570Var.g().h("textSegments");
                if (hubsImmutableComponentBundleArrH != null) {
                    arrayList = new ArrayList(hubsImmutableComponentBundleArrH.length);
                    for (HubsImmutableComponentBundle hubsImmutableComponentBundle : hubsImmutableComponentBundleArrH) {
                        int iC3 = c(2131101567, hubsImmutableComponentBundle.B("color"));
                        String strB18 = hubsImmutableComponentBundle.B("text");
                        if (strB18 == null) {
                            strB18 = "";
                        }
                        arrayList.add(new sb80(strB18, iC3));
                    }
                } else {
                    arrayList = z6x.a;
                }
                ((qzh) obj).f(new tb80(str, iC, iC2, arrayList));
                vx40Var.v(y570Var);
                break;
            case 7:
                qzh qzhVar7 = (qzh) obj;
                String str42 = y570Var.n().a.a;
                String str43 = str42 == null ? "" : str42;
                String str44 = y570Var.n().a.b;
                String str45 = str44 == null ? "" : str44;
                ld70 ld70Var8 = y570Var.k().a.c;
                String str46 = ld70Var8 != null ? ld70Var8.a.c : null;
                String str47 = str46 == null ? "" : str46;
                String strB19 = y570Var.g().B("artistName");
                String str48 = strB19 == null ? "" : strB19;
                String strB20 = y570Var.g().B("partyStatus");
                if (strB20 == null) {
                    strB20 = "";
                }
                int iHashCode = strB20.hashCode();
                if (iHashCode != -1669082995) {
                    if (iHashCode != 2337004) {
                        if (iHashCode == 66114202 && strB20.equals("ENDED")) {
                            i = 3;
                        }
                    } else if (strB20.equals("LIVE")) {
                        i = 2;
                    }
                    strB = y570Var.g().B("partyStatusText");
                    if (strB == null) {
                        str2 = "";
                    } else {
                        str2 = strB;
                    }
                    long jT = y570Var.g().t(0L, "startTime");
                    strB2 = y570Var.g().B("ctaTitle");
                    if (strB2 == null) {
                        str3 = "";
                    } else {
                        str3 = strB2;
                    }
                    strB3 = y570Var.g().B("ctaSubtitle");
                    if (strB3 == null) {
                        str4 = "";
                    } else {
                        str4 = strB3;
                    }
                    strB4 = y570Var.g().B("ctaButtonText");
                    if (strB4 == null) {
                        str5 = "";
                    } else {
                        str5 = strB4;
                    }
                    strB5 = y570Var.g().B("premiumOnlyText");
                    if (strB5 == null) {
                        str6 = "";
                    } else {
                        str6 = strB5;
                    }
                    qzhVar7.f(new ckd0(str48, y570Var.g().b("isLocked", false), str47, str43, str45, i, str2, jT, str3, str4, str5, str6, false));
                    qzhVar7.n(new jy(this, l670Var, y570Var, (byte) 9));
                    vx40Var.v(y570Var);
                } else {
                    strB20.equals("SCHEDULED");
                }
                i = 1;
                strB = y570Var.g().B("partyStatusText");
                if (strB == null) {
                    str2 = "";
                } else {
                    str2 = strB;
                }
                long jT2 = y570Var.g().t(0L, "startTime");
                strB2 = y570Var.g().B("ctaTitle");
                if (strB2 == null) {
                    str3 = "";
                } else {
                    str3 = strB2;
                }
                strB3 = y570Var.g().B("ctaSubtitle");
                if (strB3 == null) {
                    str4 = "";
                } else {
                    str4 = strB3;
                }
                strB4 = y570Var.g().B("ctaButtonText");
                if (strB4 == null) {
                    str5 = "";
                } else {
                    str5 = strB4;
                }
                strB5 = y570Var.g().B("premiumOnlyText");
                if (strB5 == null) {
                    str6 = "";
                } else {
                    str6 = strB5;
                }
                qzhVar7.f(new ckd0(str48, y570Var.g().b("isLocked", false), str47, str43, str45, i, str2, jT2, str3, str4, str5, str6, false));
                qzhVar7.n(new jy(this, l670Var, y570Var, (byte) 9));
                vx40Var.v(y570Var);
                break;
            case 8:
                qzh qzhVar8 = (qzh) obj;
                String str49 = y570Var.n().a.a;
                String str50 = str49 == null ? "" : str49;
                String str51 = y570Var.n().a.b;
                String str52 = str51 == null ? "" : str51;
                ld70 ld70Var9 = y570Var.k().a.c;
                String str53 = ld70Var9 != null ? ld70Var9.a.c : null;
                String str54 = str53 == null ? "" : str53;
                long jT3 = y570Var.g().t(0L, "startTime");
                String strB21 = y570Var.g().B("premiumOnlyText");
                String str55 = strB21 == null ? "" : strB21;
                String strB22 = y570Var.g().B("artistName");
                qzhVar8.f(new xld0(strB22 == null ? "" : strB22, str50, str52, jT3, str55, str54));
                qzhVar8.n(new jy(this, l670Var, y570Var, (byte) 10));
                vx40Var.v(y570Var);
                break;
            case 9:
                qzh qzhVar9 = (qzh) obj;
                String str56 = y570Var.n().a.a;
                if (str56 == null) {
                    str56 = "";
                }
                String str57 = y570Var.n().a.b;
                if (str57 == null) {
                    str57 = "";
                }
                ld70 ld70Var10 = y570Var.k().a.c;
                qzhVar9.f(new c2z(str56, str57, new g07(ld70Var10 != null ? ld70Var10.a.c : null)));
                qzhVar9.n(new jy(this, y570Var, l670Var, (byte) 11));
                vx40Var.v(y570Var);
                break;
            case 10:
                qzh qzhVar10 = (qzh) obj;
                String str58 = y570Var.n().a.a;
                String str59 = y570Var.n().a.b;
                ld70 ld70Var11 = y570Var.k().a.c;
                String str60 = ld70Var11 != null ? ld70Var11.a.c : null;
                if (str60 == null) {
                    str60 = "";
                }
                qzhVar10.f(new rgu0(str60, str58, str59, y570Var.n().a.d));
                qzhVar10.n(new jy(l670Var, y570Var, (byte) 12));
                vx40Var.v(y570Var);
                break;
            case 11:
                qzh qzhVar11 = (qzh) obj;
                ld70 ld70Var12 = y570Var.k().a.c;
                String str61 = ld70Var12 != null ? ld70Var12.a.c : null;
                if (str61 == null) {
                    str61 = "";
                }
                String str62 = y570Var.n().a.d;
                if (str62 == null) {
                    str62 = y570Var.n().a.a;
                }
                if (str62 == null) {
                    str62 = "";
                }
                qzhVar11.f(new ago(str61, str62));
                qzhVar11.n(new jy(this, y570Var, l670Var, (byte) 13));
                vx40Var.v(y570Var);
                break;
            case 12:
                qzh qzhVar12 = (qzh) obj;
                String strB23 = y570Var.g().B("stampBadgeImageUrl");
                String str63 = strB23 == null ? "" : strB23;
                String strB24 = y570Var.g().B("spotifyLogoColor");
                String str64 = strB24 == null ? "" : strB24;
                String strB25 = y570Var.g().B("collectibleName");
                String str65 = strB25 == null ? "" : strB25;
                String strB26 = y570Var.g().B("collectibleNameColor");
                String str66 = strB26 == null ? "" : strB26;
                String strB27 = y570Var.g().B("categoryTitle");
                String str67 = strB27 == null ? "" : strB27;
                String strB28 = y570Var.g().B("categoryTitleColor");
                String str68 = strB28 == null ? "" : strB28;
                String strB29 = y570Var.g().B("date");
                String str69 = strB29 == null ? "" : strB29;
                String strB30 = y570Var.g().B("dateColor");
                String str70 = strB30 == null ? "" : strB30;
                ld70 ld70Var13 = y570Var.k().a.c;
                String str71 = ld70Var13 != null ? ld70Var13.a.c : null;
                String str72 = str71 == null ? "" : str71;
                String strB31 = y570Var.g().B("entityRowTitle");
                String str73 = strB31 == null ? "" : strB31;
                String strB32 = y570Var.g().B("entityRowSubtitle");
                String str74 = strB32 == null ? "" : strB32;
                String strB33 = y570Var.g().B("entityRowTitleColor");
                String str75 = strB33 == null ? "" : strB33;
                String strB34 = y570Var.g().B("entityRowSubtitleColor");
                String str76 = strB34 == null ? "" : strB34;
                String strB35 = y570Var.g().B("contentBackgroundImageUrl");
                String str77 = strB35 == null ? "" : strB35;
                ld70 ld70Var14 = y570Var.k().a.d;
                String str78 = ld70Var14 != null ? ld70Var14.a.c : null;
                String str79 = str78 == null ? "" : str78;
                String strB36 = y570Var.g().B("entityTitle");
                String str80 = strB36 == null ? "" : strB36;
                String strB37 = y570Var.g().B("collectibleTitle");
                qzhVar12.f(new yzg(str63, str64, str65, str66, str67, str68, str69, str70, str72, str73, str74, str75, str76, str80, strB37 == null ? "" : strB37, str79, str77));
                qzhVar12.n(new jy(l670Var, y570Var, (byte) 14));
                vx40Var.v(y570Var);
                break;
            case 13:
                qzh qzhVar13 = (qzh) obj;
                String strB38 = y570Var.g().B("fanTypeTitle");
                String str81 = strB38 == null ? "" : strB38;
                String strB39 = y570Var.g().B("detailsTitle");
                String str82 = strB39 == null ? "" : strB39;
                ld70 ld70Var15 = y570Var.k().a.c;
                String str83 = ld70Var15 != null ? ld70Var15.a.c : null;
                String str84 = str83 == null ? "" : str83;
                String strB40 = y570Var.g().B("premiumLabel");
                String str85 = strB40 == null ? "" : strB40;
                ld70 ld70Var16 = y570Var.k().a.d;
                String str86 = ld70Var16 != null ? ld70Var16.a.c : null;
                String str87 = str86 == null ? "" : str86;
                String strB41 = y570Var.g().B("contentBackgroundImageUrl");
                String str88 = strB41 == null ? "" : strB41;
                String strB42 = y570Var.g().B("entityTitle");
                String str89 = strB42 == null ? "" : strB42;
                String strB43 = y570Var.g().B("collectibleTitle");
                String str90 = strB43 == null ? "" : strB43;
                String strB44 = y570Var.g().B("lockImageUrl");
                String str91 = strB44 == null ? "" : strB44;
                String strB45 = y570Var.g().B("defaultCardImageUrl");
                String str92 = strB45 == null ? "" : strB45;
                String strB46 = y570Var.g().B("blurColor");
                qzhVar13.f(new vzg(str81, str82, str91, str84, str92, strB46 == null ? "" : strB46, str85, str89, str90, str87, str88));
                qzhVar13.n(new jy(l670Var, y570Var, (byte) 15));
                vx40Var.v(y570Var);
                break;
            case 14:
                qzh qzhVar14 = (qzh) obj;
                ld70 ld70Var17 = y570Var.k().a.c;
                String str93 = ld70Var17 != null ? ld70Var17.a.c : null;
                String str94 = str93 == null ? "" : str93;
                String strB47 = y570Var.g().B("date");
                String str95 = strB47 == null ? "" : strB47;
                String str96 = y570Var.n().a.a;
                String str97 = str96 == null ? "" : str96;
                String str98 = y570Var.n().a.b;
                String str99 = str98 == null ? "" : str98;
                String strB48 = y570Var.g().B("entityTitleColor");
                String str100 = strB48 == null ? "" : strB48;
                String strB49 = y570Var.g().B("collectibleTitleColor");
                String str101 = strB49 == null ? "" : strB49;
                String strB50 = y570Var.g().B("vipImageUrl");
                String str102 = strB50 == null ? "" : strB50;
                ld70 ld70Var18 = y570Var.k().a.d;
                String str103 = ld70Var18 != null ? ld70Var18.a.c : null;
                String str104 = str103 == null ? "" : str103;
                String strB51 = y570Var.g().B("premiumLabel");
                String str105 = strB51 == null ? "" : strB51;
                String strB52 = y570Var.g().B("detailsTitle");
                String str106 = strB52 == null ? "" : strB52;
                String strB53 = y570Var.g().B("entityTitle");
                String str107 = strB53 == null ? "" : strB53;
                String strB54 = y570Var.g().B("detailsSubtitle");
                String str108 = strB54 == null ? "" : strB54;
                String strB55 = y570Var.g().B("collectibleTitle");
                qzhVar14.f(new zzg(str97, str99, str100, str101, str94, str102, str95, str106, str108, str105, str107, str94, strB55 == null ? "" : strB55, str104));
                qzhVar14.n(new jy(l670Var, y570Var, (byte) 16));
                vx40Var.v(y570Var);
                break;
            default:
                s470 s470Var = new s470(l670Var, (xb01) null);
                s470Var.B(y570Var.s());
                s470Var.h();
                kdy0 kdy0Var = (kdy0) obj;
                RecyclerView recyclerView = (RecyclerView) kdy0Var.e;
                recyclerView.setAdapter(s470Var);
                recyclerView.setNestedScrollingEnabled(false);
                ((TextView) kdy0Var.b).setText(y570Var.n().a.a);
                EncoreButton encoreButton = (EncoreButton) kdy0Var.d;
                encoreButton.setText(y570Var.g().B("ctaTitle"));
                encoreButton.setOnClickListener(new wa21(this, y570Var, l670Var));
                vx40Var.v(y570Var);
                break;
        }
    }

    public final void b(int... iArr) {
        byte b = this.b;
    }

    public int c(int i, String str) {
        return str != null ? Color.parseColor(str) : ((qzh) this.c).getView().getContext().getColor(i);
    }

    private final void d(int... iArr) {
    }

    private final void e(int... iArr) {
    }

    private final void f(int... iArr) {
    }

    private final void g(int... iArr) {
    }

    private final void h(int... iArr) {
    }

    private final void i(int... iArr) {
    }

    private final void j(int... iArr) {
    }

    private final void k(int... iArr) {
    }

    private final void l(int... iArr) {
    }

    private final void m(int... iArr) {
    }

    private final void n(int... iArr) {
    }

    private final void o(int... iArr) {
    }

    private final void p(int... iArr) {
    }

    private final void r(int... iArr) {
    }

    private final void s(int... iArr) {
    }

    private final void t(int... iArr) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(vx40 vx40Var, kdy0 kdy0Var) {
        super((LinearLayout) kdy0Var.c);
        this.b = (byte) 15;
        this.d = vx40Var;
        this.c = kdy0Var;
    }
}
