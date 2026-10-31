package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.storytelling.controls.stories.StoriesProgressBar;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g4c1 extends ConstraintLayout {
    public final ie90 T0;
    public final StoriesProgressBar U0;
    public final View V0;
    public final View W0;
    public final View X0;
    public final View Y0;
    public final View Z0;
    public final View a1;
    public final View b1;
    public final View c1;
    public final View d1;
    public final View e1;
    public final View f1;
    public iu30 g1;
    public Function0 h1;
    public iu30 i1;
    public iu30 j1;
    public Function0 k1;
    public Function0 l1;
    public Function0 m1;
    public final vhd n1;
    public Disposable o1;

    /* JADX WARN: Multi-variable type inference failed */
    public g4c1(Context context, ie90 ie90Var) {
        View viewFindViewById;
        super(context, (AttributeSet) null, 0);
        this.T0 = ie90Var;
        this.n1 = new vhd((byte) 8);
        LayoutInflater.from(context).inflate(2131626201, (ViewGroup) this, true);
        this.U0 = b8k1.n(this, 2131431097);
        View viewN = b8k1.n(this, 2131430302);
        viewN.setOnClickListener(new f4c1(this, (byte) 0));
        this.V0 = viewN;
        View viewN2 = b8k1.n(this, 2131430399);
        viewN2.setOnClickListener(new f4c1(this, (byte) 1));
        this.W0 = viewN2;
        View viewN3 = b8k1.n(this, 2131430095);
        viewN3.setOnClickListener(new f4c1(this, (byte) 2));
        this.X0 = viewN3;
        View viewN4 = b8k1.n(this, 2131431545);
        viewN4.setOnClickListener(new f4c1(this, (byte) 3));
        this.Y0 = viewN4;
        View viewN5 = b8k1.n(this, 2131431101);
        viewN5.setOnClickListener(new f4c1(this, (byte) 4));
        this.Z0 = viewN5;
        this.d1 = b8k1.n(this, 2131430937);
        int[] iArr = {2131431103, 2131431104};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewFindViewById = null;
                break;
            }
            int i2 = i + 1;
            try {
                viewFindViewById = findViewById(iArr[i]);
                if (viewFindViewById != null) {
                    break;
                } else {
                    i = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                bhn0.t(e.getMessage());
                throw null;
            }
        }
        if (viewFindViewById == null) {
            bhn0.t("No element of the collection was transformed to a non-null value.");
            throw null;
        }
        viewFindViewById.setOnClickListener(new f4c1(this, (byte) 5));
        this.a1 = viewFindViewById;
        this.e1 = b8k1.n(this, 2131431044);
        this.f1 = b8k1.n(this, 2131431420);
        View viewN6 = b8k1.n(this, 2131427412);
        ImageButton imageButton = (ImageButton) viewN6;
        imageButton.getClass();
        ie90 ie90Var2 = this.T0;
        imageButton.setVisibility((ie90Var2 == null || !ie90Var2.c) ? 8 : 0);
        imageButton.setOnClickListener(new f4c1(this, (byte) 6));
        this.c1 = viewN6;
        View viewN7 = b8k1.n(this, 2131427411);
        ImageButton imageButton2 = (ImageButton) viewN7;
        imageButton2.getClass();
        ie90 ie90Var3 = this.T0;
        imageButton2.setVisibility((ie90Var3 == null || !ie90Var3.c) ? 8 : 0);
        imageButton2.setOnClickListener(new f4c1(this, (byte) 7));
        this.b1 = viewN7;
    }

    public final Function0 getCloseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.h1;
    }

    public final iu30 getMuteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.i1;
    }

    public final Function0 getNextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.l1;
    }

    public final iu30 getPauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.j1;
    }

    public final Function0 getPreviousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.m1;
    }

    public final Function0 getShareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.k1;
    }

    public final iu30 getStoryEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling() {
        return this.g1;
    }

    public final void setCloseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(Function0 function0) {
        this.h1 = function0;
    }

    public final void setMuteListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(iu30 iu30Var) {
        this.i1 = iu30Var;
    }

    public final void setNextListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(Function0 function0) {
        this.l1 = function0;
    }

    public final void setPauseListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(iu30 iu30Var) {
        this.j1 = iu30Var;
    }

    public final void setPreviousListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(Function0 function0) {
        this.m1 = function0;
    }

    public final void setShareListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(Function0 function0) {
        this.k1 = function0;
    }

    public final void setStoryEndListener$src_main_java_com_spotify_campaigns_storytelling_storytelling(iu30 iu30Var) {
        this.g1 = iu30Var;
    }
}
