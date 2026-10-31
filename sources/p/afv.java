package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class afv extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afv(byte b) {
        super(2, (lnm) null);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                afv afvVar = new afv(2, lnmVar, (byte) 0);
                afvVar.b = obj;
                return afvVar;
            case 1:
                afv afvVar2 = new afv(2, lnmVar, (byte) 1);
                afvVar2.b = obj;
                return afvVar2;
            case 2:
                afv afvVar3 = new afv(2, lnmVar, (byte) 2);
                afvVar3.b = obj;
                return afvVar3;
            case 3:
                afv afvVar4 = new afv(2, lnmVar, (byte) 3);
                afvVar4.b = obj;
                return afvVar4;
            case 4:
                afv afvVar5 = new afv(2, lnmVar, (byte) 4);
                afvVar5.b = obj;
                return afvVar5;
            case 5:
                afv afvVar6 = new afv(2, lnmVar, (byte) 5);
                afvVar6.b = obj;
                return afvVar6;
            case 6:
                afv afvVar7 = new afv(2, lnmVar, (byte) 6);
                afvVar7.b = obj;
                return afvVar7;
            case 7:
                afv afvVar8 = new afv(2, lnmVar, (byte) 7);
                afvVar8.b = obj;
                return afvVar8;
            case 8:
                afv afvVar9 = new afv(2, lnmVar, (byte) 8);
                afvVar9.b = obj;
                return afvVar9;
            case 9:
                afv afvVar10 = new afv(2, lnmVar, (byte) 9);
                afvVar10.b = obj;
                return afvVar10;
            case 10:
                afv afvVar11 = new afv(2, lnmVar, (byte) 10);
                afvVar11.b = obj;
                return afvVar11;
            case 11:
                afv afvVar12 = new afv(2, lnmVar, (byte) 11);
                afvVar12.b = obj;
                return afvVar12;
            case 12:
                afv afvVar13 = new afv(2, lnmVar, (byte) 12);
                afvVar13.b = obj;
                return afvVar13;
            case 13:
                afv afvVar14 = new afv(2, lnmVar, (byte) 13);
                afvVar14.b = obj;
                return afvVar14;
            case 14:
                afv afvVar15 = new afv(2, lnmVar, (byte) 14);
                afvVar15.b = obj;
                return afvVar15;
            case 15:
                afv afvVar16 = new afv(2, lnmVar, (byte) 15);
                afvVar16.b = obj;
                return afvVar16;
            case 16:
                afv afvVar17 = new afv(2, lnmVar, (byte) 16);
                afvVar17.b = obj;
                return afvVar17;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                afv afvVar18 = new afv(2, lnmVar, (byte) 17);
                afvVar18.b = obj;
                return afvVar18;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                afv afvVar19 = new afv(2, lnmVar, (byte) 18);
                afvVar19.b = obj;
                return afvVar19;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                afv afvVar20 = new afv(2, lnmVar, (byte) 19);
                afvVar20.b = obj;
                return afvVar20;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                afv afvVar21 = new afv(2, lnmVar, (byte) 20);
                afvVar21.b = obj;
                return afvVar21;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                afv afvVar22 = new afv(2, lnmVar, (byte) 21);
                afvVar22.b = obj;
                return afvVar22;
            case 22:
                afv afvVar23 = new afv(2, lnmVar, (byte) 22);
                afvVar23.b = obj;
                return afvVar23;
            case 23:
                afv afvVar24 = new afv(2, lnmVar, (byte) 23);
                afvVar24.b = obj;
                return afvVar24;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                afv afvVar25 = new afv(2, lnmVar, (byte) 24);
                afvVar25.b = obj;
                return afvVar25;
            case 25:
                afv afvVar26 = new afv(2, lnmVar, (byte) 25);
                afvVar26.b = obj;
                return afvVar26;
            case 26:
                afv afvVar27 = new afv(2, lnmVar, (byte) 26);
                afvVar27.b = obj;
                return afvVar27;
            case 27:
                afv afvVar28 = new afv(2, lnmVar, (byte) 27);
                afvVar28.b = obj;
                return afvVar28;
            case 28:
                afv afvVar29 = new afv(2, lnmVar, (byte) 28);
                afvVar29.b = obj;
                return afvVar29;
            default:
                afv afvVar30 = new afv(2, lnmVar, (byte) 29);
                afvVar30.b = obj;
                return afvVar30;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((a480) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((azm0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((bf90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((i091) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((MessagePresentationStatus) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((r560) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((zu81) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((i480) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((e090) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((e090) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((th61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((pp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01f8  */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k1r k1rVar = (k1r) obj2;
                hm5.M(obj);
                k1rVar.getClass();
                return Boolean.valueOf(!(k1rVar instanceof j1r));
            case 1:
                cen0 cen0Var = (cen0) obj2;
                hm5.M(obj);
                mnv0 mnv0Var = jiv.e;
                if (cen0Var.b.get()) {
                    eg.m("Do mutate preferences once returned to DataStore.");
                    return null;
                }
                cen0Var.a.remove(mnv0Var);
                return rih1Var;
            case 2:
                k1r k1rVar2 = (k1r) obj2;
                hm5.M(obj);
                k1rVar2.getClass();
                return Boolean.valueOf(!(k1rVar2 instanceof j1r));
            case 3:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 4:
                wv00 wv00Var = (uv00) obj2;
                hm5.M(obj);
                return Boolean.valueOf(wv00Var.c() || !wv00Var.f);
            case 5:
                i1r i1rVar = (k1r) obj2;
                hm5.M(obj);
                if (i1rVar instanceof h1r) {
                    z = true;
                } else if (i1rVar instanceof i1r) {
                    avy avyVar = (avy) i1rVar.a;
                    if (!(avyVar.a instanceof v4m) && !(avyVar.b instanceof p840)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 7:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 8:
                a480 a480Var = (a480) obj2;
                hm5.M(obj);
                return Boolean.valueOf(!a480Var.a || a480Var.b);
            case 9:
                azm0 azm0Var = (azm0) obj2;
                hm5.M(obj);
                return Boolean.valueOf(azm0Var == azm0.b);
            case 10:
                hm5.M(obj);
                return Boolean.valueOf(!((bf90) obj2).a);
            case 11:
                wv00 wv00Var2 = (uv00) obj2;
                hm5.M(obj);
                return Boolean.valueOf(wv00Var2.c() || !wv00Var2.f);
            case 12:
                hm5.M(obj);
                return Boolean.valueOf(!((uv00) obj2).f);
            case 13:
                th61 th61Var = (th61) obj2;
                hm5.M(obj);
                if (!th61Var.c && !th61Var.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                hm5.M(obj);
                return Boolean.valueOf(((th61) obj2).b);
            case 15:
                hm5.M(obj);
                return Boolean.valueOf(!(((k1r) obj2) instanceof j1r));
            case 16:
                hm5.M(obj);
                return Boolean.valueOf(((i091) obj2).h instanceof n091);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj2;
                hm5.M(obj);
                return Boolean.valueOf((messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) || (messagePresentationStatus instanceof MessagePresentationStatus.Discarded));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                return Boolean.valueOf(((th61) obj2).b);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                return Boolean.valueOf(((th61) obj2).b);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                Objects.toString((r560) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                zu81 zu81Var = (zu81) obj2;
                hm5.M(obj);
                return Boolean.valueOf((zu81Var instanceof xu81) || (zu81Var instanceof vu81));
            case 22:
                i480 i480Var = (i480) obj2;
                hm5.M(obj);
                return Boolean.valueOf((i480Var instanceof g480) || (i480Var instanceof f480) || (i480Var instanceof e480));
            case 23:
                oy21 oy21Var = (py21) obj2;
                hm5.M(obj);
                if (oy21Var instanceof oy21) {
                    if (!((Collection) oy21Var.a).isEmpty()) {
                    }
                    return Boolean.valueOf(z);
                }
                if (!(oy21Var instanceof ly21)) {
                    eg.o();
                    return null;
                }
                z = true;
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                return Boolean.valueOf(!(((e090) obj2) instanceof c090));
            case 25:
                hm5.M(obj);
                return Boolean.valueOf(!(((e090) obj2) instanceof zz80));
            case 26:
                oy21 oy21Var2 = (py21) obj2;
                hm5.M(obj);
                if (oy21Var2 instanceof ly21) {
                    z = true;
                } else if (oy21Var2 instanceof oy21) {
                    List list = ((zuc0) oy21Var2.a).f;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (u890.j(((ll81) it.next()).a, "set-item-speed")) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                hm5.M(obj);
                return Boolean.valueOf(((th61) obj2).b);
            case 28:
                pp90 pp90Var = (pp90) obj2;
                hm5.M(obj);
                if (pp90Var != null) {
                    ArrayList arrayList = pp90Var.c;
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((hp90) it2.next()).f) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                Boolean bool = (Boolean) obj2;
                hm5.M(obj);
                bool.getClass();
                return bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afv(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
