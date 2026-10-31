package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n0a0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0a0(String str, List list, rsc0 rsc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 9;
        this.d = str;
        this.c = list;
        this.e = rsc0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 0);
            case 1:
                n0a0 n0a0Var = new n0a0((m5b0) obj2, lnmVar);
                n0a0Var.d = obj;
                return n0a0Var;
            case 2:
                n0a0 n0a0Var2 = new n0a0(this.d, obj2, lnmVar, (byte) 2);
                n0a0Var2.c = obj;
                return n0a0Var2;
            case 3:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 3);
            case 4:
                return new n0a0(this.c, obj2, (String) this.d, lnmVar, (byte) 4);
            case 5:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 5);
            case 6:
                return new n0a0(this.c, obj2, (String) this.d, lnmVar, (byte) 6);
            case 7:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 7);
            case 8:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 8);
            case 9:
                return new n0a0((String) this.d, (List) this.c, (rsc0) obj2, lnmVar);
            case 10:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 10);
            case 11:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 11);
            case 12:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 12);
            case 13:
                return new n0a0(this.c, obj2, (String) this.d, lnmVar, (byte) 13);
            case 14:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 14);
            case 15:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 15);
            case 16:
                return new n0a0(this.c, obj2, (String) this.d, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                n0a0 n0a0Var3 = new n0a0(this.d, obj2, lnmVar, (byte) 19);
                n0a0Var3.c = obj;
                return n0a0Var3;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                n0a0 n0a0Var4 = new n0a0(this.d, obj2, lnmVar, (byte) 20);
                n0a0Var4.c = obj;
                return n0a0Var4;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 21);
            case 22:
                n0a0 n0a0Var5 = new n0a0(this.d, obj2, lnmVar, (byte) 22);
                n0a0Var5.c = obj;
                return n0a0Var5;
            case 23:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                n0a0 n0a0Var6 = new n0a0((vld0) obj2, (String) this.d, lnmVar);
                n0a0Var6.c = obj;
                return n0a0Var6;
            case 25:
                n0a0 n0a0Var7 = new n0a0(this.d, obj2, lnmVar, (byte) 25);
                n0a0Var7.c = obj;
                return n0a0Var7;
            case 26:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 26);
            case 27:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 27);
            case 28:
                n0a0 n0a0Var8 = new n0a0(this.d, obj2, lnmVar, (byte) 28);
                n0a0Var8.c = obj;
                return n0a0Var8;
            default:
                return new n0a0(this.c, this.d, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((jl71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x015f -> B:57:0x0163). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 2452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n0a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0a0(Object obj, Object obj2, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0a0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0a0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0a0(m5b0 m5b0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = m5b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0a0(vld0 vld0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.e = vld0Var;
        this.d = str;
    }
}
