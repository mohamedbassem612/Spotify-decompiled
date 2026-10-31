package p;

import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest;
import com.spotify.serviceapi.android.quasarworker.QuasarWorker;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pew0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pew0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                pew0 pew0Var = new pew0((gfw0) obj2, lnmVar, (byte) 0);
                pew0Var.d = obj;
                return pew0Var;
            case 1:
                return new pew0((gfw0) obj2, (iac0) this.d, lnmVar, (byte) 1);
            case 2:
                return new pew0((ofw0) this.d, (sbw0) obj2, false, lnmVar, (byte) 2);
            case 3:
                return new pew0((zau0) this.d, (ofw0) obj2, false, lnmVar, (byte) 3);
            case 4:
                return new pew0((yqu0) this.d, (String) obj2, false, lnmVar, (byte) 4);
            case 5:
                pew0 pew0Var2 = new pew0((nqw0) obj2, lnmVar, (byte) 5);
                pew0Var2.d = obj;
                return pew0Var2;
            case 6:
                return new pew0((p1f0) this.d, (iew) obj2, false, lnmVar, (byte) 6);
            case 7:
                pew0 pew0Var3 = new pew0((n0x0) obj2, lnmVar, (byte) 7);
                pew0Var3.d = obj;
                return pew0Var3;
            case 8:
                return new pew0((j0a1) this.d, (h4x0) obj2, false, lnmVar, (byte) 8);
            case 9:
                return new pew0((bfd) this.d, (i4x0) obj2, false, lnmVar, (byte) 9);
            case 10:
                return new pew0((l4x0) this.d, (j0a1) obj2, false, lnmVar, (byte) 10);
            case 11:
                return new pew0((j0a1) this.d, (u4x0) obj2, false, lnmVar, (byte) 11);
            case 12:
                return new pew0((j0a1) this.d, (m8x0) obj2, false, lnmVar, (byte) 12);
            case 13:
                return new pew0((j0a1) this.d, (n8x0) obj2, false, lnmVar, (byte) 13);
            case 14:
                return new pew0((j0a1) this.d, (x8x0) obj2, false, lnmVar, (byte) 14);
            case 15:
                return new pew0((zob1) this.d, (hkx0) obj2, false, lnmVar, (byte) 15);
            case 16:
                return new pew0((hkx0) this.d, (y2r0) obj2, false, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new pew0((c0r) this.d, (hkx0) obj2, false, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new pew0((mzr0) this.d, (String) obj2, false, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new pew0((qyx0) this.d, (PromptSuggestionsProvider) obj2, false, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new pew0((List) this.d, (ven0) obj2, false, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new pew0((l811) this.d, (QuasarWorker) obj2, false, lnmVar, (byte) 21);
            case 22:
                return new pew0((QuasarWorker) this.d, (s2t) obj2, false, lnmVar, (byte) 22);
            case 23:
                return new pew0((QuasarWorker) obj2, this.d, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new pew0((t6z0) this.d, (u4z0) obj2, false, lnmVar, (byte) 24);
            case 25:
                return new pew0((ydz0) this.d, (wdz0) obj2, false, lnmVar, (byte) 25);
            case 26:
                pew0 pew0Var4 = new pew0((dez0) obj2, lnmVar, (byte) 26);
                pew0Var4.d = obj;
                return pew0Var4;
            case 27:
                return new pew0((yuz0) this.d, (QueryRuntimeConsumptionRequest) obj2, false, lnmVar, (byte) 27);
            case 28:
                return new pew0((zwz0) this.d, (kdy0) obj2, false, lnmVar, (byte) 28);
            default:
                pew0 pew0Var5 = new pew0((fjk0) obj2, lnmVar, (byte) 29);
                pew0Var5.d = obj;
                return pew0Var5;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
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
                return create((qo90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vww0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
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
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01e5 -> B:118:0x01e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:109:0x01cb
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 1598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pew0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pew0(Object obj, Object obj2, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pew0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
