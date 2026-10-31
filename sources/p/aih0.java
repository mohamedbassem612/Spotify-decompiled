package p;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aih0 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public aih0(RecyclerView recyclerView, ufz0 ufz0Var, an anVar) {
        this.a = (byte) 14;
        this.b = ufz0Var;
        this.c = anVar;
    }

    private final void a() {
        try {
            ((Runnable) this.c).run();
            synchronized (((qj5) this.b).d) {
                ((qj5) this.b).a();
            }
        } catch (Throwable th) {
            synchronized (((qj5) this.b).d) {
                ((qj5) this.b).a();
                throw th;
            }
        }
    }

    private final void b() {
        vwl1 vwl1Var;
        lsw0 lsw0Var = ((udd1) this.c).a.f;
        String str = (String) this.b;
        synchronized (lsw0Var.k) {
            try {
                sxl1 sxl1VarC = lsw0Var.c(str);
                if (sxl1VarC != null) {
                    vwl1Var = sxl1VarC.a;
                } else {
                    vwl1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vwl1Var == null || u890.j(gjl.j, vwl1Var.j)) {
            return;
        }
        synchronized (((udd1) this.c).c) {
            ((udd1) this.c).f.put(yoi1.z(vwl1Var), vwl1Var);
            udd1 udd1Var = (udd1) this.c;
            cwh0 cwh0Var = udd1Var.h;
            q8n q8nVar = udd1Var.b.b;
            int i = mvl1.a;
            ((udd1) this.c).g.put(yoi1.z(vwl1Var), c921.y(smo1.e(q8nVar), (o8n) null, 0, new vxg1(cwh0Var, vwl1Var, udd1Var, (lnm) null, (byte) 28), 3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p.e661.f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            p.e661 r2 = (p.e661) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            p.e661 r0 = (p.e661) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L81
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            p.e661 r4 = (p.e661) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L20
            p.e661 r10 = (p.e661) r10     // Catch: java.lang.Throwable -> L20
            r10.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L83
        L5a:
            r0 = move-exception
            goto L7e
        L5c:
            r3 = move-exception
            p.bub0 r4 = p.e661.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7e:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L83:
            if (r1 == 0) goto L8c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aih0.c():void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aih0.run():void");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 22:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((e661) this.c).c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ aih0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ aih0(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public aih0(n590 n590Var, p590 p590Var, long j) {
        this.a = (byte) 11;
        this.b = n590Var;
        this.c = p590Var;
    }

    public aih0(e661 e661Var) {
        this.a = (byte) 22;
        this.c = e661Var;
    }
}
