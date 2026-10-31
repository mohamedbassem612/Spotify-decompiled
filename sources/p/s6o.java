package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s6o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6o(int i, byte b) {
        super(1);
        this.a = b;
        this.b = i;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return new k3h1(i);
            case 1:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM history WHERE uri NOT IN (SELECT uri FROM history ORDER BY timeStamp DESC LIMIT (30 - ?))");
                try {
                    d441VarG1.r(1, i);
                    d441VarG1.f1();
                    return rih1.a;
                } finally {
                    d441VarG1.close();
                }
            default:
                return wm5.x((r6h1) obj).c(i).j();
        }
    }
}
