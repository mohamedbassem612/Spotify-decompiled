package p;

import android.animation.Animator;
import android.widget.ImageView;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eyy implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eyy(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((l811) this.d).a = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ParagraphView) obj2).setVisibility(8);
                ((ParagraphView) obj).setVisibility(8);
                ((ImageView) this.d).setVisibility(8);
                break;
            default:
                if (!((l811) obj2).a) {
                    esa1 esa1Var = (esa1) obj;
                    iu30 storyEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling = ((g4c1) esa1Var.b).getStoryEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling();
                    if (storyEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling != null) {
                        storyEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling.invoke(Integer.valueOf(((o7c1) esa1Var.c).a));
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }
}
