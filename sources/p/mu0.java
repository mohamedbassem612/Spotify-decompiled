package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mu0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public boolean d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(String str, int i, int i2, ju0 ju0Var, List list, String str2, String str3, nu0 nu0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = str;
        this.b = i;
        this.c = i2;
        this.h = ju0Var;
        this.i = list;
        this.f = str2;
        this.g = str3;
        this.t = nu0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                return new mu0((String) this.e, this.b, this.c, (ju0) obj4, (List) obj3, (String) this.f, (String) this.g, (nu0) obj2, lnmVar);
            default:
                mu0 mu0Var = new mu0((kaa) obj4, (Context) obj3, (int[]) obj2, lnmVar);
                mu0Var.g = obj;
                return mu0Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0062 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mu0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(kaa kaaVar, Context context, int[] iArr, lnm lnmVar) {
        super(2, lnmVar);
        this.h = kaaVar;
        this.i = context;
        this.t = iArr;
    }
}
