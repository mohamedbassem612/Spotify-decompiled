package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xuj0 extends z031 implements vu30 {
    public List b;
    public yuj0 c;
    public Iterator d;
    public int e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yuj0 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuj0(yuj0 yuj0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.h = yuj0Var;
        this.i = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xuj0 xuj0Var = new xuj0(this.h, this.i, lnmVar);
        xuj0Var.g = obj;
        return xuj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092 A[LOOP:0: B:20:0x008c->B:22:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:12:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xuj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
