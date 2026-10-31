package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e4k extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g4k c;
    public final /* synthetic */ StoryCard d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4k(g4k g4kVar, StoryCard storyCard, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g4kVar;
        this.d = storyCard;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        StoryCard storyCard = this.d;
        g4k g4kVar = this.c;
        switch (b) {
            case 0:
                return new e4k(g4kVar, storyCard, lnmVar, (byte) 0);
            default:
                return new e4k(g4kVar, storyCard, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        g4k g4kVar = this.c;
        StoryCard storyCard = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    c4k c4kVarA = g4kVar.a(storyCard);
                    this.b = true;
                    return c4kVarA.a(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c4k c4kVarA2 = g4kVar.a(storyCard);
                i24 i24Var = new i24(g4kVar, storyCard, (lnm) null, (byte) 20);
                this.b = true;
                return c4kVarA2.b(i24Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
