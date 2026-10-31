package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i4e0 extends a8d1 implements vu30 {
    public final /* synthetic */ j4e0 X;
    public final /* synthetic */ rzg0 Y;
    public Object a;
    public String b;
    public j4e0 c;
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public int h;
    public byte i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4e0(j4e0 j4e0Var, rzg0 rzg0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = j4e0Var;
        this.Y = rzg0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        i4e0 i4e0Var = new i4e0(this.X, this.Y, lnmVar);
        i4e0Var.t = obj;
        return i4e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x014d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x014d -> B:58:0x0151). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0159 -> B:60:0x015e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i4e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
