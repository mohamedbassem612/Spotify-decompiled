package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h9m extends a8d1 implements vu30 {
    public final /* synthetic */ iu30 N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ hdn0 P0;
    public final /* synthetic */ tr80 X;
    public final /* synthetic */ byte Y;
    public final /* synthetic */ n5f0 Z;
    public List a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public byte i;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public h9m(List list, tr80 tr80Var, long j, n5f0 n5f0Var, iu30 iu30Var, ven0 ven0Var, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = list;
        this.X = tr80Var;
        this.Y = (int) j;
        this.Z = n5f0Var;
        this.N0 = iu30Var;
        this.O0 = ven0Var;
        this.P0 = hdn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new h9m(this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x0113 A[LOOP:0: B:24:0x00e3->B:29:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0128  */
    /* JADX WARN: Code duplicated, block: B:35:0x014a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0153 A[EDGE_INSN: B:38:0x0153->B:37:0x0150 BREAK  A[LOOP:0: B:24:0x00e3->B:29:0x0113]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x014a -> B:36:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0153 -> B:37:0x0150). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:43:0x0119
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h9m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
