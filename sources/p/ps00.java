package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.home.explicitfeedback.proto.Feedback;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ps00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps00(String str, int i) {
        super(2);
        this.a = (byte) 11;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(this.b, nim0.a, (lee1) null, 0L, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1708);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 3, false, new cjc0(2), 0, new px8(fc11.G(8), fc11.G(14), 0L, (mx8) null, 12), x340Var4, 0, 8, 702);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    uwo1.e(this.b, (qim0) null, lee1.a(cbx.d(x340Var6).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2026);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Uri uri = Uri.parse(str);
                    ltx ltxVar = ltx.c;
                    nux nuxVar = new nux(ltxVar, ltxVar);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var8).f;
                    eso1.e(uri, isl.a, i1p1.q(qim0VarD, er31.b(4.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var8, 1073741872, 0, 3576);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                return Boolean.valueOf(u890.j(((Feedback) obj).getUri(), str));
            case 5:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var10, (qim0) null);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    eqr0.b(0, 2, str, x340Var12, (qim0) null);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var14).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2042);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(this.b, u291.f(nim0Var, 1.0f), cbx.d(x340Var16).j, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var16, 0, 0, 1720);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    eso1.e(Uri.parse(str), isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var18, 48, 0, 4092);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zic0 zic0Var = new zic0(1);
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var20).j, 0L, (a0e1) null, (iu30) null, 0, false, zic0Var, 0, (qx8) null, x340Var20, 0, 0, 1786);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                b2p1.c(str, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var22).k, cbx.a(x340Var22).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2034);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2046);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2046);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var28, 0, 0, 2046);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var30, 0, 0, 2046);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(this.b, u291.f(nim0Var, 1.0f), cbx.d(x340Var32).h, 0L, new a0e1(3), (iu30) null, 0, true, new cjc0(2), 0, (qx8) null, x340Var32, 12582912, 0, 1640);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var34, 0, 0, 2046);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var36, 0, 0, 2046);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var38, 0, 0, 2046);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(this.b, (qim0) null, (lee1) null, cbx.a(x340Var40).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var40, 0, 0, 2038);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var42, 0, 0, 2046);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var44).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var44, 0, 0, 2042);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var46, 0, 0, 2046);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var48, 0, 0, 2046);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var49 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (x340Var50.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var50, 0, 0, 2046);
                } else {
                    x340Var50.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var51 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (x340Var52.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var52, 0, 0, 2046);
                } else {
                    x340Var52.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var53 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var54, 0, 0, 2046);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
            default:
                x340 x340Var55 = (b0k) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                x340 x340Var56 = x340Var55;
                if (x340Var56.Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var56, 0, 0, 2046);
                } else {
                    x340Var56.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps00(String str, byte b) {
        super(2);
        this.a = b;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps00(String str) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
    }
}
