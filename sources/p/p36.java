package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p36 extends rvc0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p36(h661 h661Var, byte b) {
        super(h661Var);
        this.b = b;
    }

    public final String h() {
        switch (this.b) {
            case 0:
                return "kotlin.collections.ArrayList";
            case 1:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
