package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zcg1 extends tv30 implements iu30 {
    public static final zcg1 a = new zcg1(1, fdg1.class, "rowStartMs", "rowStartMs(Lcom/spotify/transcript/list/data/RowState;)I", 1);

    public final Object invoke(Object obj) {
        int i;
        jx31 jx31Var = (jx31) obj;
        if (jx31Var instanceof hx31) {
            i = ((hx31) jx31Var).b;
        } else if (jx31Var instanceof ix31) {
            i = ((ix31) jx31Var).a;
        } else if (jx31Var instanceof ex31) {
            i = ((ex31) jx31Var).b;
        } else {
            i = jx31Var instanceof ww31 ? ((ww31) jx31Var).b : 0;
        }
        return Integer.valueOf(i);
    }
}
