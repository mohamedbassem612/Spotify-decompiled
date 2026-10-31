package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class abr {
    public static final uar Companion = new uar();
    public final yar a;
    public final war b;

    public /* synthetic */ abr(int i, yar yarVar, war warVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = yarVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = warVar;
        }
    }

    public abr(yar yarVar, war warVar) {
        this.a = yarVar;
        this.b = warVar;
    }
}
