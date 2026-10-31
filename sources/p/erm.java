package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class erm extends z031 implements vu30 {
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ Function0 Z;
    public float b;
    public long c;
    public int d;
    public int e;
    public int f;
    public byte g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erm(Function0 function0, float f, vu30 vu30Var, iu30 iu30Var, Function0 function1, lnm lnmVar) {
        super(2, lnmVar);
        this.i = function0;
        this.t = f;
        this.X = vu30Var;
        this.Y = iu30Var;
        this.Z = function1;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        erm ermVar = new erm(this.i, this.t, this.X, this.Y, this.Z, lnmVar);
        ermVar.h = obj;
        return ermVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:2: B:38:0x00c2->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006c -> B:17:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.erm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
