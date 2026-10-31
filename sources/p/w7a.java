package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w7a extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7a(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new w7a((z7a) this.c, (f7a) obj2, lnmVar, (byte) 0);
            case 1:
                return new w7a((z7a) this.c, (e7a) obj2, lnmVar, (byte) 1);
            case 2:
                return new w7a((z7a) this.c, (iu30) obj2, lnmVar, (byte) 2);
            case 3:
                w7a w7aVar = new w7a((eaa) obj2, lnmVar, (byte) 3);
                w7aVar.c = obj;
                return w7aVar;
            case 4:
                return new w7a((wz20) this.c, (w5f1) obj2, lnmVar, (byte) 4);
            case 5:
                return new w7a((ic9) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new w7a((ps7) this.c, (ova) obj2, lnmVar, (byte) 6);
            case 7:
                return new w7a((ps7) this.c, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new w7a((zsc) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                return new w7a((e0b) this.c, (String) obj2, lnmVar, (byte) 9);
            case 10:
                return new w7a((g0b) this.c, (List) obj2, lnmVar, (byte) 10);
            case 11:
                return new w7a((r0b) this.c, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new w7a((m911) this.c, (String) obj2, lnmVar, (byte) 12);
            case 13:
                return new w7a((String[]) this.c, (hdn0) obj2, lnmVar, (byte) 13);
            case 14:
                return new w7a((t3b) this.c, (String) obj2, lnmVar, (byte) 14);
            case 15:
                return new w7a((dab) this.c, (String) obj2, lnmVar, (byte) 15);
            case 16:
                return new w7a((cgb) this.c, (String) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                w7a w7aVar2 = new w7a((gkb) obj2, lnmVar, (byte) 17);
                w7aVar2.c = obj;
                return w7aVar2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                w7a w7aVar3 = new w7a((pmb) obj2, lnmVar, (byte) 18);
                w7aVar3.c = obj;
                return w7aVar3;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new w7a((rob) this.c, (dwn0) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new w7a((fqb) this.c, (j120) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new w7a((fqb) this.c, (ResolveRequest) obj2, lnmVar, (byte) 21);
            case 22:
                return new w7a((d5c) this.c, (List) obj2, lnmVar, (byte) 22);
            case 23:
                return new w7a((g5c) this.c, (n511) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new w7a((m5c) this.c, (uc9) obj2, lnmVar, (byte) 24);
            case 25:
                return new w7a((mr20) this.c, (h7c) obj2, lnmVar, (byte) 25);
            case 26:
                w7a w7aVar4 = new w7a((h7c) obj2, lnmVar, (byte) 26);
                w7aVar4.c = obj;
                return w7aVar4;
            case 27:
                return new w7a((xtb0) this.c, (hdn0) obj2, lnmVar, (byte) 27);
            case 28:
                return new w7a((wen0) this.c, (tob1) obj2, lnmVar, (byte) 28);
            default:
                w7a w7aVar5 = new w7a((pmc) obj2, lnmVar, (byte) 29);
                w7aVar5.c = obj;
                return w7aVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:209:0x03ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x03cc -> B:211:0x03d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:209:0x03ce
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w7a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7a(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
