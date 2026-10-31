package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j8l1 implements s7c {
    public final String a;
    public final String b;
    public final hvl1 c;
    public final jal1 d;

    public j8l1(String str, String str2, hvl1 hvl1Var, jal1 jal1Var) {
        this.a = str;
        this.b = str2;
        this.c = hvl1Var;
        this.d = jal1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 p.s7l1, still in use, count: 2, list:
          (r9v1 p.s7l1) from 0x00ff: MOVE (r28v5 p.s7l1) = (r9v1 p.s7l1) (LINE:256)
          (r9v1 p.s7l1) from 0x012f: PHI (r28v3 p.s7l1) = (r9v1 p.s7l1), (r28v5 p.s7l1) binds: [B:42:0x0118, B:40:0x00ff] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p.s7c
    public final java.util.List d(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j8l1.d(int, int):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8l1)) {
            return false;
        }
        j8l1 j8l1Var = (j8l1) obj;
        return this.a.equals(j8l1Var.a) && this.b.equals(j8l1Var.b) && this.c.equals(j8l1Var.c) && this.d.equals(j8l1Var.d);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
