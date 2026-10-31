package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l5b1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5b1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:186:0x0415 A[Catch: all -> 0x0418, TryCatch #0 {all -> 0x0418, blocks: (B:184:0x0409, B:186:0x0415, B:192:0x041e, B:193:0x0429, B:195:0x042f, B:197:0x0439, B:200:0x043f, B:205:0x0449, B:208:0x0451), top: B:300:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x041a  */
    /* JADX WARN: Code duplicated, block: B:191:0x041d  */
    /* JADX WARN: Code duplicated, block: B:192:0x041e A[Catch: all -> 0x0418, TryCatch #0 {all -> 0x0418, blocks: (B:184:0x0409, B:186:0x0415, B:192:0x041e, B:193:0x0429, B:195:0x042f, B:197:0x0439, B:200:0x043f, B:205:0x0449, B:208:0x0451), top: B:300:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x042f A[Catch: all -> 0x0418, TryCatch #0 {all -> 0x0418, blocks: (B:184:0x0409, B:186:0x0415, B:192:0x041e, B:193:0x0429, B:195:0x042f, B:197:0x0439, B:200:0x043f, B:205:0x0449, B:208:0x0451), top: B:300:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0439 A[Catch: all -> 0x0418, TryCatch #0 {all -> 0x0418, blocks: (B:184:0x0409, B:186:0x0415, B:192:0x041e, B:193:0x0429, B:195:0x042f, B:197:0x0439, B:200:0x043f, B:205:0x0449, B:208:0x0451), top: B:300:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x043c  */
    /* JADX WARN: Code duplicated, block: B:200:0x043f A[Catch: all -> 0x0418, TryCatch #0 {all -> 0x0418, blocks: (B:184:0x0409, B:186:0x0415, B:192:0x041e, B:193:0x0429, B:195:0x042f, B:197:0x0439, B:200:0x043f, B:205:0x0449, B:208:0x0451), top: B:300:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0445  */
    /* JADX WARN: Code duplicated, block: B:203:0x0446  */
    /* JADX WARN: Code duplicated, block: B:205:0x0449 A[Catch: all -> 0x0418, TryCatch #0 {all -> 0x0418, blocks: (B:184:0x0409, B:186:0x0415, B:192:0x041e, B:193:0x0429, B:195:0x042f, B:197:0x0439, B:200:0x043f, B:205:0x0449, B:208:0x0451), top: B:300:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x044e  */
    /* JADX WARN: Code duplicated, block: B:214:0x045f  */
    /* JADX WARN: Code duplicated, block: B:218:0x04af  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:225:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:230:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:300:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0429 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v7 java.lang.Object, still in use, count: 2, list:
          (r9v7 java.lang.Object) from 0x03bc: PHI (r9 I:??) = (r9v2 java.lang.Object), (r9v7 java.lang.Object) binds: [B:174:0x03bb, B:313:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          (r9v7 java.lang.Object) from 0x03b0: CHECK_CAST (p.ibh1) (r9v7 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l5b1.invoke(java.lang.Object):java.lang.Object");
    }
}
