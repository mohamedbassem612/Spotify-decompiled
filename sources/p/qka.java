package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class qka extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qka(PublishSubject publishSubject) {
        super(1, publishSubject, Subject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        this.a = (byte) 29;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x023e  */
    /* JADX WARN: Code duplicated, block: B:159:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x017d A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #1 {all -> 0x0175, blocks: (B:58:0x015e, B:59:0x0164, B:61:0x016a, B:67:0x0179, B:69:0x017d), top: B:161:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v19 java.lang.Object, still in use, count: 2, list:
          (r13v19 java.lang.Object) from 0x0227: PHI (r13 I:??) = (r13v14 java.lang.Object), (r13v19 java.lang.Object) binds: [B:110:0x0226, B:167:0x0227] A[DONT_GENERATE, DONT_INLINE]
          (r13v19 java.lang.Object) from 0x0220: CHECK_CAST (byte[]) (r13v19 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qka.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qka(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qka(d6c d6cVar) {
        super(1, d6cVar, d6c.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/models/BroadcastStatusUpdate;", 0);
        this.a = (byte) 10;
    }
}
