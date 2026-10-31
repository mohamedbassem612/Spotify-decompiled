package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class twn implements l4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ twn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 p.my50, still in use, count: 4, list:
          (r11v0 p.my50) from 0x00fd: MOVE (r19v0 p.my50) = (r11v0 p.my50) (LINE:254)
          (r11v0 p.my50) from 0x00f6: MOVE (r19v2 p.my50) = (r11v0 p.my50) (LINE:247)
          (r11v0 p.my50) from 0x00e5: MOVE (r19v3 p.my50) = (r11v0 p.my50) (LINE:230)
          (r11v0 p.my50) from 0x00cb: MOVE (r19v9 p.my50) = (r11v0 p.my50) (LINE:204)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final p.f4h1 a(android.content.Context r48, android.view.LayoutInflater r49, android.view.ViewGroup r50, android.os.Bundle r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.twn.a(android.content.Context, android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle, java.lang.Object):p.f4h1");
    }
}
