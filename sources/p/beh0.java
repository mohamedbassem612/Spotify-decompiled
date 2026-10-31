package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class beh0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s880 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ beh0(s880 s880Var, byte b) {
        super(0);
        this.a = b;
        this.b = s880Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s880 s880Var = this.b;
        switch (b) {
            case 0:
                return (abu0) s880Var.f;
            default:
                return (tl7) s880Var.g;
        }
    }
}
