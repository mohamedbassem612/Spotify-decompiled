package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wpu0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpu0(byte b, Object obj, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x08cd A[LOOP:8: B:100:0x08c7->B:102:0x08cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x08f6 A[LOOP:9: B:104:0x08f0->B:106:0x08f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x091f A[LOOP:10: B:108:0x0919->B:110:0x091f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0948 A[LOOP:11: B:112:0x0942->B:114:0x0948, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0971 A[LOOP:12: B:116:0x096b->B:118:0x0971, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x099a A[LOOP:13: B:120:0x0994->B:122:0x099a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x09c3 A[LOOP:14: B:124:0x09bd->B:126:0x09c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x09ec A[LOOP:15: B:128:0x09e6->B:130:0x09ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0a15 A[LOOP:16: B:132:0x0a0f->B:134:0x0a15, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:138:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0a5c A[LOOP:17: B:140:0x0a56->B:142:0x0a5c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0a85 A[LOOP:18: B:144:0x0a7f->B:146:0x0a85, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0aae A[LOOP:19: B:148:0x0aa8->B:150:0x0aae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:154:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:155:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x020a  */
    /* JADX WARN: Code duplicated, block: B:57:0x025b  */
    /* JADX WARN: Code duplicated, block: B:58:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x034e  */
    /* JADX WARN: Code duplicated, block: B:61:0x039f  */
    /* JADX WARN: Code duplicated, block: B:62:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0441  */
    /* JADX WARN: Code duplicated, block: B:64:0x0491  */
    /* JADX WARN: Code duplicated, block: B:67:0x078e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0799  */
    /* JADX WARN: Code duplicated, block: B:70:0x079c  */
    /* JADX WARN: Code duplicated, block: B:73:0x07b7 A[LOOP:2: B:71:0x07b1->B:73:0x07b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x07e0 A[LOOP:3: B:75:0x07da->B:77:0x07e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0809  */
    /* JADX WARN: Code duplicated, block: B:83:0x080c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0829 A[LOOP:4: B:84:0x0823->B:86:0x0829, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0852 A[LOOP:5: B:88:0x084c->B:90:0x0852, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x087b A[LOOP:6: B:92:0x0875->B:94:0x087b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x08a4 A[LOOP:7: B:96:0x089e->B:98:0x08a4, LOOP_END] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v52 p.i0v0, still in use, count: 2, list:
          (r2v52 p.i0v0) from 0x012b: IF  (r2v52 p.i0v0) == (null p.i0v0)  -> B:214:? A[HIDDEN] (LINE:300)
          (r2v52 p.i0v0) from 0x012f: PHI (r2 I:??) = (r2v18 p.i0v0), (r2v52 p.i0v0) binds: [B:49:0x012e, B:213:0x012f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 3328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wpu0.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpu0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
