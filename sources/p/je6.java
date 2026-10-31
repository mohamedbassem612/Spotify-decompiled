package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class je6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g7m1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je6(g7m1 g7m1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g7m1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        g7m1 g7m1Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                je6 je6Var = new je6(g7m1Var, lnmVar, (byte) 0);
                je6Var.b = obj;
                return je6Var;
            case 1:
                je6 je6Var2 = new je6(g7m1Var, lnmVar, (byte) 1);
                je6Var2.b = obj;
                return je6Var2;
            case 2:
                je6 je6Var3 = new je6(g7m1Var, lnmVar, (byte) 2);
                je6Var3.b = obj;
                return je6Var3;
            case 3:
                je6 je6Var4 = new je6(g7m1Var, lnmVar, (byte) 3);
                je6Var4.b = obj;
                return je6Var4;
            default:
                je6 je6Var5 = new je6(g7m1Var, lnmVar, (byte) 4);
                je6Var5.b = obj;
                return je6Var5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wgm1 wgm1Var = (wgm1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(wgm1Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = false;
        g7m1 g7m1Var = this.c;
        wgm1 wgm1Var = (wgm1) this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                StoryCard storyCard = wgm1Var.a;
                if (u890.j(storyCard != null ? storyCard.getId() : null, g7m1Var.a.getId()) && wgm1Var.c.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                hm5.M(obj);
                StoryCard storyCard2 = wgm1Var.a;
                if (u890.j(storyCard2 != null ? storyCard2.getId() : null, g7m1Var.a.getId()) && wgm1Var.c.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                hm5.M(obj);
                StoryCard storyCard3 = wgm1Var.a;
                if (u890.j(storyCard3 != null ? storyCard3.getId() : null, g7m1Var.a.getId()) && wgm1Var.c.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                hm5.M(obj);
                StoryCard storyCard4 = wgm1Var.a;
                if (u890.j(storyCard4 != null ? storyCard4.getId() : null, g7m1Var.a.getId()) && wgm1Var.c.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                hm5.M(obj);
                StoryCard storyCard5 = wgm1Var.a;
                if (u890.j(storyCard5 != null ? storyCard5.getId() : null, g7m1Var.a.getId()) && wgm1Var.c.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
