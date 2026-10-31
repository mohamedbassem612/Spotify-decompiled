package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f4k extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g4k b;
    public final /* synthetic */ StoryCard c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4k(g4k g4kVar, StoryCard storyCard, byte b) {
        super(0);
        this.a = b;
        this.b = g4kVar;
        this.c = storyCard;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 0;
        lnm lnmVar = null;
        StoryCard storyCard = this.c;
        g4k g4kVar = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                fn31.T(g4kVar.b, (o8n) null, 0, new e4k(g4kVar, storyCard, lnmVar, b3), 3);
                break;
            case 1:
                fn31.T(g4kVar.b, (o8n) null, 0, new e4k(g4kVar, storyCard, lnmVar, b2), 3);
                break;
            default:
                i3k i3kVar = (i3k) g4kVar.a(storyCard).c.getValue();
                if (i3kVar instanceof h3k) {
                    bpb1 bpb1Var = ((h3k) i3kVar).a.f;
                    bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
                }
                break;
        }
        return rih1Var;
    }
}
