package p;

import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cuk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuk(zwz0 zwz0Var, iuk iukVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.d = zwz0Var;
        this.c = iukVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new cuk((iuk) this.c, (Function0) obj2, lnmVar, (byte) 0);
            case 1:
                return new cuk((zwz0) obj2, (iuk) this.c, lnmVar);
            case 2:
                return new cuk((p1l) this.c, (String) obj2, lnmVar, (byte) 2);
            case 3:
                return new cuk((c3l) this.c, (ConnectMessages.NotifyAudioRouteChangedRequest) obj2, lnmVar, (byte) 3);
            case 4:
                return new cuk((vu30) this.c, (jdv0) obj2, lnmVar, (byte) 4);
            case 5:
                return new cuk((vu30) this.c, (p811) obj2, lnmVar, (byte) 5);
            case 6:
                return new cuk((ttz) this.c, (gal) obj2, lnmVar, (byte) 6);
            case 7:
                return new cuk((ghl) this.c, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new cuk((p311) this.c, (h4k) obj2, lnmVar, (byte) 8);
            case 9:
                cuk cukVar = new cuk(obj2, lnmVar, (byte) 9);
                cukVar.c = obj;
                return cukVar;
            case 10:
                cuk cukVar2 = new cuk(obj2, lnmVar, (byte) 10);
                cukVar2.c = obj;
                return cukVar2;
            case 11:
                return new cuk((em0) this.c, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new cuk((fvb0) this.c, (iu30) obj2, lnmVar, (byte) 12);
            case 13:
                return new cuk((r091) this.c, (r1m) obj2, lnmVar, (byte) 13);
            case 14:
                return new cuk((y48) this.c, (v1k) obj2, lnmVar, (byte) 14);
            case 15:
                return new cuk((i5m) this.c, (ve01) obj2, lnmVar, (byte) 15);
            case 16:
                return new cuk((xhm) this.c, (pim) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                cuk cukVar3 = new cuk(obj2, lnmVar, (byte) 17);
                cukVar3.c = obj;
                return cukVar3;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                cuk cukVar4 = new cuk(obj2, lnmVar, (byte) 18);
                cukVar4.c = obj;
                return cukVar4;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new cuk((oql) this.c, (String) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                cuk cukVar5 = new cuk(obj2, lnmVar, (byte) 20);
                cukVar5.c = obj;
                return cukVar5;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new cuk((x6e1) this.c, (j5c) obj2, lnmVar, (byte) 21);
            case 22:
                return new cuk((nav0) this.c, (x6e1) obj2, lnmVar, (byte) 22);
            case 23:
                cuk cukVar6 = new cuk(obj2, lnmVar, (byte) 23);
                cukVar6.c = obj;
                return cukVar6;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                cuk cukVar7 = new cuk(obj2, lnmVar, (byte) 24);
                cukVar7.c = obj;
                return cukVar7;
            case 25:
                return new cuk((v1k) this.c, (String) obj2, lnmVar, (byte) 25);
            case 26:
                return new cuk((gal) this.c, (fvk) obj2, lnmVar, (byte) 26);
            case 27:
                cuk cukVar8 = new cuk(obj2, lnmVar, (byte) 27);
                cukVar8.c = obj;
                return cukVar8;
            case 28:
                return new cuk((umf0) this.c, (e9o) obj2, lnmVar, (byte) 28);
            default:
                return new cuk((cco) this.c, (kbo) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((owl) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((bom) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:410:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x018f -> B:87:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 2178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cuk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cuk(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cuk(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
