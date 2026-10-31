package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wjz0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjz0(aqb0 aqb0Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 29;
        j2i j2iVar = ujj.a;
        this.d = aqb0Var;
        this.b = qim0Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((yjz0) obj4).e((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                wmo1.g((fkz0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ((ngs0) obj4).g((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ioo1.s((duz0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                ((e601) obj4).a((v060) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                ((e601) obj4).b((qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).k;
                    if (((err0) ((jkr0) obj4).d.c).s() == i + 1) {
                        x340Var2.i0(-702746621);
                        j = cbx.a(x340Var2).b.a;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-702678080);
                        j = cbx.a(x340Var2).b.b;
                        x340Var2.r(false);
                    }
                    uwo1.e((String) obj3, uyn1.z(12.0f, 0.0f, 2, nim0.a), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 48, 0, 2016);
                }
                break;
            case 7:
                ((Number) obj2).intValue();
                lro1.a((g2c) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                zj01.b((Paragraph) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                ((a221) obj4).h((String) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                ((yla) obj4).d((qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                tx9.f((n531) obj4, (yjs) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                kbb.h((wzv0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                e9k.k((mhm0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                ((yj31) obj4).a((mmr0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                bmq0.d((va51) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                zho1.v((gx51) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ((j2i) obj4).invoke(new p3v(((tlc1) obj3).M0(i)), x340Var4, 0);
                }
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                ((et90) obj4).f((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                g3p1.j((dp71) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                o6p1.f((ArrayList) obj4, (xpw) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                j7p1.c((he81) obj4, (j2i) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                j7p1.l((he81) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 23:
                ((Number) obj2).intValue();
                ((dea0) obj4).e((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                ((dea0) obj4).f((ag81) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 25:
                ((Number) obj2).intValue();
                w8p1.k((otn0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 26:
                ((Number) obj2).intValue();
                gm50.i((i7a1) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 27:
                ((Number) obj2).intValue();
                hr80.i((List) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 28:
                ((Number) obj2).intValue();
                ((jd6) obj4).g((paa1) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar = ujj.a;
                yah0.l((aqb0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjz0(ArrayList arrayList, xpw xpwVar, int i) {
        super(2);
        this.a = (byte) 20;
        this.d = arrayList;
        this.b = xpwVar;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjz0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjz0(jkr0 jkr0Var, int i, String str) {
        super(2);
        this.a = (byte) 6;
        this.d = jkr0Var;
        this.c = i;
        this.b = str;
    }
}
