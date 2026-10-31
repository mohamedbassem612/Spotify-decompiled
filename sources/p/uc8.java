package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uc8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wc8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc8(wc8 wc8Var, byte b) {
        super(1);
        this.a = b;
        this.b = wc8Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                wc8 wc8Var = this.b;
                d0r d0rVar = wc8Var.a;
                o3r o3rVar = wc8Var.f;
                String str = wc8Var.b.a;
                return new ve1(new x010(d3p1.H(d0rVar, o3rVar, "spotify:list:available-release-groups:author_".concat(ihc1.V0(str, ':', str))), wc8Var.e.a, new xq0(3, wc8Var, wc8.class, "buildItems", "buildItems(Ljava/util/List;Z)Ljava/util/List;", 4, (byte) 2), (byte) 1), (byte) 2);
            default:
                return new s460(2, 1006, this.b.c.getString(2131952664), (String) null, (String) null, (String) null, false);
        }
    }
}
