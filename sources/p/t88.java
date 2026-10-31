package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t88 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h290 b;

    public /* synthetic */ t88(h290 h290Var, byte b) {
        this.a = b;
        this.b = h290Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h290 h290Var = this.b;
        switch (b) {
            case 0:
                h290Var.get(((Number) obj).intValue());
                return null;
            case 1:
                return Integer.valueOf(((SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(((Number) obj).intValue())).getYear());
            default:
                h290Var.get(((Number) obj).intValue());
                return null;
        }
    }
}
