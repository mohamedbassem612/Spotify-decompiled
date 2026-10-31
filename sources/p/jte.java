package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jte extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jte(byte b) {
        super(2, (lnm) null);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                jte jteVar = new jte(2, lnmVar, (byte) 0);
                jteVar.b = obj;
                return jteVar;
            case 1:
                jte jteVar2 = new jte(2, lnmVar, (byte) 1);
                jteVar2.b = obj;
                return jteVar2;
            case 2:
                jte jteVar3 = new jte(2, lnmVar, (byte) 2);
                jteVar3.b = obj;
                return jteVar3;
            case 3:
                jte jteVar4 = new jte(2, lnmVar, (byte) 3);
                jteVar4.b = obj;
                return jteVar4;
            case 4:
                jte jteVar5 = new jte(2, lnmVar, (byte) 4);
                jteVar5.b = obj;
                return jteVar5;
            case 5:
                jte jteVar6 = new jte(2, lnmVar, (byte) 5);
                jteVar6.b = obj;
                return jteVar6;
            case 6:
                jte jteVar7 = new jte(2, lnmVar, (byte) 6);
                jteVar7.b = obj;
                return jteVar7;
            case 7:
                jte jteVar8 = new jte(2, lnmVar, (byte) 7);
                jteVar8.b = obj;
                return jteVar8;
            case 8:
                jte jteVar9 = new jte(2, lnmVar, (byte) 8);
                jteVar9.b = obj;
                return jteVar9;
            case 9:
                jte jteVar10 = new jte(2, lnmVar, (byte) 9);
                jteVar10.b = obj;
                return jteVar10;
            case 10:
                jte jteVar11 = new jte(2, lnmVar, (byte) 10);
                jteVar11.b = obj;
                return jteVar11;
            case 11:
                jte jteVar12 = new jte(2, lnmVar, (byte) 11);
                jteVar12.b = obj;
                return jteVar12;
            case 12:
                jte jteVar13 = new jte(2, lnmVar, (byte) 12);
                jteVar13.b = obj;
                return jteVar13;
            case 13:
                jte jteVar14 = new jte(2, lnmVar, (byte) 13);
                jteVar14.b = obj;
                return jteVar14;
            case 14:
                jte jteVar15 = new jte(2, lnmVar, (byte) 14);
                jteVar15.b = obj;
                return jteVar15;
            case 15:
                jte jteVar16 = new jte(2, lnmVar, (byte) 15);
                jteVar16.b = obj;
                return jteVar16;
            case 16:
                jte jteVar17 = new jte(2, lnmVar, (byte) 16);
                jteVar17.b = obj;
                return jteVar17;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                jte jteVar18 = new jte(2, lnmVar, (byte) 17);
                jteVar18.b = obj;
                return jteVar18;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                jte jteVar19 = new jte(2, lnmVar, (byte) 18);
                jteVar19.b = obj;
                return jteVar19;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                jte jteVar20 = new jte(2, lnmVar, (byte) 19);
                jteVar20.b = obj;
                return jteVar20;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                jte jteVar21 = new jte(2, lnmVar, (byte) 20);
                jteVar21.b = obj;
                return jteVar21;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                jte jteVar22 = new jte(2, lnmVar, (byte) 21);
                jteVar22.b = obj;
                return jteVar22;
            case 22:
                jte jteVar23 = new jte(2, lnmVar, (byte) 22);
                jteVar23.b = obj;
                return jteVar23;
            case 23:
                jte jteVar24 = new jte(2, lnmVar, (byte) 23);
                jteVar24.b = obj;
                return jteVar24;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                jte jteVar25 = new jte(2, lnmVar, (byte) 24);
                jteVar25.b = obj;
                return jteVar25;
            case 25:
                jte jteVar26 = new jte(2, lnmVar, (byte) 25);
                jteVar26.b = obj;
                return jteVar26;
            case 26:
                jte jteVar27 = new jte(2, lnmVar, (byte) 26);
                jteVar27.b = obj;
                return jteVar27;
            case 27:
                jte jteVar28 = new jte(2, lnmVar, (byte) 27);
                jteVar28.b = obj;
                return jteVar28;
            case 28:
                jte jteVar29 = new jte(2, lnmVar, (byte) 28);
                jteVar29.b = obj;
                return jteVar29;
            default:
                jte jteVar30 = new jte(2, lnmVar, (byte) 29);
                jteVar30.b = obj;
                return jteVar30;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((wtk) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((y1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vxs0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((l0l) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((r2t) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((r2t) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((r2t) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((aza) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((szt) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        vxs0 vxs0Var = vxs0.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.valueOf(!ihc1.y0((String) obj2));
            case 1:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 2:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 3:
                hm5.M(obj);
                return Boolean.valueOf(((wtk) obj2).b == xtk.e);
            case 4:
                hm5.M(obj);
                return Boolean.valueOf(((k1r) obj2) instanceof i1r);
            case 5:
                wv00 wv00Var = (uv00) obj2;
                hm5.M(obj);
                return Boolean.valueOf(wv00Var.c() || !wv00Var.f);
            case 6:
                hm5.M(obj);
                return Boolean.valueOf(((k1r) obj2) instanceof i1r);
            case 7:
                hm5.M(obj);
                return Boolean.valueOf(((k1r) obj2) instanceof i1r);
            case 8:
                k1r k1rVar = (k1r) obj2;
                hm5.M(obj);
                k1rVar.getClass();
                return Boolean.valueOf(!(k1rVar instanceof j1r));
            case 9:
                k1r k1rVar2 = (k1r) obj2;
                hm5.M(obj);
                return Boolean.valueOf((k1rVar2 instanceof i1r) || (k1rVar2 instanceof h1r));
            case 10:
                ly21 ly21Var = (py21) obj2;
                hm5.M(obj);
                ly21Var.getClass();
                if (!(ly21Var instanceof ly21)) {
                    if (ly21Var instanceof oy21) {
                        return (oqc0) ((oy21) ly21Var).a;
                    }
                    eg.o();
                    return null;
                }
                jy21 jy21Var = ly21Var.a;
                if ((jy21Var instanceof gy21) || (jy21Var instanceof cy21)) {
                    return new oqc0("", z6x.a, 0);
                }
                eg.m(jy21Var.b());
                return null;
            case 11:
                k1r k1rVar3 = (k1r) obj2;
                hm5.M(obj);
                k1rVar3.getClass();
                return Boolean.valueOf(!(k1rVar3 instanceof j1r));
            case 12:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 13:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 14:
                hm5.M(obj);
                return Boolean.valueOf(((y1r) obj2) instanceof x1r);
            case 15:
                vxs0 vxs0Var2 = (vxs0) obj2;
                hm5.M(obj);
                return Boolean.valueOf(vxs0Var2 == vxs0Var);
            case 16:
                mmr0 mmr0Var = (mmr0) obj2;
                hm5.M(obj);
                return Boolean.valueOf((((vxs0) mmr0Var.a) == vxs0Var && ((l0l) mmr0Var.b) == null) ? false : true);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                hm5.M(obj);
                Objects.toString((List) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                Objects.toString((l0l) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                return Boolean.valueOf(((th61) obj2).b);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                return Boolean.valueOf(((th61) obj2).b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 22:
                hm5.M(obj);
                return d5p1.g(((r2t) obj2).h().f);
            case 23:
                hm5.M(obj);
                ild0 ild0VarG = ((r2t) obj2).g();
                return ild0VarG.d ? d5p1.g(ild0VarG.c) : r6x.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                return new huz(((r2t) obj2).k(), (byte) 10);
            case 25:
                k1r k1rVar4 = (k1r) obj2;
                hm5.M(obj);
                k1rVar4.getClass();
                return Boolean.valueOf(!(k1rVar4 instanceof j1r));
            case 26:
                aza azaVar = (aza) obj2;
                hm5.M(obj);
                return Boolean.valueOf(azaVar != null);
            case 27:
                szt sztVar = (szt) obj2;
                hm5.M(obj);
                return Boolean.valueOf(sztVar != null);
            case 28:
                Boolean bool = (Boolean) obj2;
                hm5.M(obj);
                bool.getClass();
                return bool;
            default:
                k1r k1rVar5 = (k1r) obj2;
                hm5.M(obj);
                k1rVar5.getClass();
                return Boolean.valueOf(!(k1rVar5 instanceof j1r));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jte(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
