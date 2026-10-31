package p;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ha5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public int c;
    public Object d;
    public /* synthetic */ Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha5(int i, lz20 lz20Var, k6a1 k6a1Var, j5c j5cVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.c = i;
        this.d = lz20Var;
        this.e = k6a1Var;
        this.f = j5cVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ha5((es41) this.e, (wat) this.f, lnmVar);
            case 1:
                ha5 ha5Var = new ha5(this.e, lnmVar, (o0f) this.f);
                ha5Var.d = obj;
                return ha5Var;
            case 2:
                ha5 ha5Var2 = new ha5(this.e, lnmVar);
                ha5Var2.d = obj;
                return ha5Var2;
            case 3:
                return new ha5(this.e, this.f, this.c, lnmVar, (byte) 3);
            case 4:
                return new ha5(this.c, (lz20) this.d, (k6a1) this.e, (j5c) this.f, lnmVar);
            case 5:
                return new ha5(this.e, this.f, this.c, lnmVar, (byte) 5);
            case 6:
                ha5 ha5Var3 = new ha5((jn7) this.f, lnmVar);
                ha5Var3.e = obj;
                return ha5Var3;
            default:
                return new ha5((u6y0) this.d, (String) this.e, (UUID) this.f, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((Set) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lhg1 */
    /* JADX WARN: Code duplicated, block: B:346:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0408 -> B:162:0x040c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:24:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:297:0x0701 -> B:287:0x0698). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:281:0x0670
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ha5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha5(Object obj, Object obj2, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha5(Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha5(Object obj, lnm lnmVar, o0f o0fVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.e = obj;
        this.f = o0fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha5(jn7 jn7Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.f = jn7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha5(u6y0 u6y0Var, String str, UUID uuid, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.d = u6y0Var;
        this.e = str;
        this.f = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha5(es41 es41Var, wat watVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.e = es41Var;
        this.f = watVar;
    }
}
