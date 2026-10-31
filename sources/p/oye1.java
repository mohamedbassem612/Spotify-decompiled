package p;

import androidx.constraintlayout.widget.Guideline;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oye1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ParagraphView b;
    public final /* synthetic */ Guideline c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oye1(qye1 qye1Var, ParagraphView paragraphView, Guideline guideline, byte b) {
        super(0);
        this.a = b;
        this.b = paragraphView;
        this.c = guideline;
    }

    public final Object invoke() {
        byte b = this.a;
        Guideline guideline = this.c;
        ParagraphView paragraphView = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(qye1.i(paragraphView, guideline));
            case 1:
                return Float.valueOf(hon1.m(30, paragraphView) + qye1.i(paragraphView, guideline));
            default:
                return Float.valueOf(qye1.i(paragraphView, guideline));
        }
    }
}
