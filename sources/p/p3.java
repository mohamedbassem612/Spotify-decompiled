package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(String str, byte b) {
        super(3);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        String str = this.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                Uri uri = (Uri) objT;
                uri.getClass();
                mrx mrxVar = mrx.c;
                nux nuxVar = new nux(mrxVar, mrxVar);
                cbx.a.getClass();
                eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073744944, 0, 3540);
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar).h, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                return rih1Var;
            case 2:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uwo1.e(this.b, anm1.N("account-details-action-row-description", nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 48, 0, 2044);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uwo1.e(this.b, anm1.N("account-details-action-row-title", nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 48, 0, 2044);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 4:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                return rih1Var;
            case 5:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                return rih1Var;
            case 6:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2034);
                return rih1Var;
            case 7:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar5 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar5).g, cbx.a(b0kVar5).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, 0, 0, 2034);
                return rih1Var;
            case 8:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var7).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2042);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    uwr uwrVar7 = cbx.a;
                    uwo1.e(this.b, (qim0) null, cbx.d(x340Var9).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var9, 0, 0, 2042);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                String str2 = this.b;
                x340 x340Var10 = (b0k) obj2;
                if (str2 == null) {
                    x340Var10.i0(-1036950154);
                } else {
                    x340Var10.i0(-1036950153);
                    uwo1.e(str2, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2046);
                }
                x340Var10.r(false);
                return rih1Var;
            case 11:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    g9p1.k(0, 2, str, x340Var12, false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.g, false);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(hmb0.t1);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    suo1.f(this.b, 2, anm1.N("ai_badge", nim0Var), 2, x340Var14, 24624, 8);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar8 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar6).j, cbx.a(b0kVar6).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar6, 0, 0, 1714);
                return rih1Var;
            case 16:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar9 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar7).b, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar7, 0, 0, 2042);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj3).intValue();
                Uri uri2 = Uri.parse(str);
                nkx nkxVar = nkx.c;
                eso1.e(uri2, isl.a, i1p1.q(nim0Var, er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, (b0k) obj2, 1073766448, 0, 3560);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar10 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar8).j, cbx.a(b0kVar8).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar8, 0, 0, 2034);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("artist-view-header-subtitle", nim0Var);
                uwr uwrVar11 = cbx.a;
                uwo1.e(this.b, qim0VarN, cbx.d(b0kVar9).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar9, 0, 0, 2040);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                uwo1.e(this.b, anm1.N("audience-user-row-subtitle-test-tag", nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2044);
                return rih1Var;
            case 23:
                ((Number) obj3).intValue();
                uwo1.e(this.b, anm1.N("audience-user-row-title-test-tag", nim0Var), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2044);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 25:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar12 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar10).j, cbx.a(b0kVar10).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar10, 0, 0, 2034);
                return rih1Var;
            case 26:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar13 = cbx.a;
                uwo1.e(this.b, (qim0) null, cbx.d(b0kVar11).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar11, 0, 0, 2042);
                return rih1Var;
            case 27:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 28:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                uwo1.e(this.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
        }
    }
}
