package p;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wd6 extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Serializable i;
    public Serializable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd6(f5k f5kVar, guq0 guq0Var, twr twrVar, z57 z57Var, i580 i580Var, boolean z, boolean z2, String str, String str2, ayh ayhVar, Map map, lnm lnmVar) {
        super(2, lnmVar);
        this.d = f5kVar;
        this.e = guq0Var;
        this.f = twrVar;
        this.g = z57Var;
        this.h = i580Var;
        this.b = z;
        this.c = z2;
        this.i = str;
        this.t = str2;
        this.X = ayhVar;
        this.Y = map;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        switch (b) {
            case 0:
                return new wd6(this.c, (xd6) obj3, (wq50) obj2, lnmVar);
            default:
                return new wd6((f5k) this.d, (guq0) this.e, (twr) this.f, (z57) this.g, (i580) this.h, this.b, this.c, (String) this.i, (String) this.t, (ayh) obj3, (Map) obj2, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:49:0x01e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01e5 -> B:41:0x0156). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:49:0x01e7
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wd6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd6(boolean z, xd6 xd6Var, wq50 wq50Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.X = xd6Var;
        this.Y = wq50Var;
    }
}
