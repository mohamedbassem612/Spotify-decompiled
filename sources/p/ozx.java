package p;

import com.spotify.endless.sessionstarter.EndlessActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ozx extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EndlessActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozx(EndlessActivity endlessActivity, byte b) {
        super(0);
        this.a = b;
        this.b = endlessActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        t3b1 t3b1Var = this.b;
        switch (b) {
            case 0:
                ou80 serializableExtra = t3b1Var.getIntent().getSerializableExtra("com.spotify.endless.sessionstarter.KEY_INTERACTION_ID");
                if (serializableExtra instanceof ou80) {
                    return serializableExtra;
                }
                return null;
            default:
                t3b1Var.finish();
                return rih1.a;
        }
    }
}
