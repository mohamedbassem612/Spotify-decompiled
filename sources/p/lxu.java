package p;

import app.rive.ViewModelInstance;
import app.rive.core.CommandQueue;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxu extends a8d1 implements vu30 {
    public Object N0;
    public final /* synthetic */ Object O0;
    public Object P0;
    public final /* synthetic */ Object Q0;
    public final /* synthetic */ Object X;
    public Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public int b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxu(zj31 zj31Var, ViewModelInstance viewModelInstance, Map map, jj31 jj31Var, jj31 jj31Var2, CommandQueue commandQueue, Map map2, lnm lnmVar) {
        super(2, lnmVar);
        this.X = zj31Var;
        this.Y = viewModelInstance;
        this.Z = map;
        this.N0 = jj31Var;
        this.O0 = jj31Var2;
        this.P0 = commandQueue;
        this.Q0 = map2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Q0;
        Object obj3 = this.O0;
        Object obj4 = this.Z;
        Object obj5 = this.X;
        switch (b) {
            case 0:
                return new lxu((k261) this.e, (iyl1) this.g, (cyp0) this.i, (String) obj5, (rm5) obj4, (tz01) obj3, (xaz0) obj2, lnmVar);
            default:
                return new lxu((zj31) obj5, (ViewModelInstance) this.Y, (Map) obj4, (jj31) this.N0, (jj31) obj3, (CommandQueue) this.P0, (Map) obj2, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:25:0x00e9 A[Catch: Exception -> 0x0066, CancellationException -> 0x0199, TryCatch #6 {CancellationException -> 0x0199, Exception -> 0x0066, blocks: (B:10:0x0058, B:32:0x0138, B:36:0x0159, B:38:0x0161, B:16:0x008f, B:19:0x00be, B:23:0x00e3, B:25:0x00e9, B:29:0x0121, B:31:0x012f, B:22:0x00ce), top: B:86:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0116 -> B:28:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x018a -> B:32:0x0138). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lxu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxu(k261 k261Var, iyl1 iyl1Var, cyp0 cyp0Var, String str, rm5 rm5Var, tz01 tz01Var, xaz0 xaz0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = k261Var;
        this.g = iyl1Var;
        this.i = cyp0Var;
        this.X = str;
        this.Z = rm5Var;
        this.O0 = tz01Var;
        this.Q0 = xaz0Var;
    }
}
