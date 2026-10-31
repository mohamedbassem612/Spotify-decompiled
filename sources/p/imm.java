package p;

import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class imm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextualAudioFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imm(ContextualAudioFragment contextualAudioFragment, byte b) {
        super(0);
        this.a = b;
        this.b = contextualAudioFragment;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ContextualAudioFragment contextualAudioFragment = this.b;
        switch (b) {
            case 0:
                contextualAudioFragment.Z0().U();
                return rih1Var;
            case 1:
                contextualAudioFragment.Z0().T(contextualAudioFragment.Y0().q());
                return rih1Var;
            case 2:
                ptf1 ptf1VarY0 = contextualAudioFragment.Y0();
                i8h1 i8h1Var = (i8h1) ptf1VarY0.b;
                grk0 grk0Var = (grk0) ptf1VarY0.c;
                x6h1 x6h1VarC = grk0Var.a.c();
                x6h1VarC.i.add(new a7h1("contextual_audio_positive_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = grk0Var.b;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 3:
                ptf1 ptf1VarY1 = contextualAudioFragment.Y0();
                i8h1 i8h1Var2 = (i8h1) ptf1VarY1.b;
                grk0 grk0Var2 = (grk0) ptf1VarY1.c;
                x6h1 x6h1VarC2 = grk0Var2.a.c();
                x6h1VarC2.i.add(new a7h1("contextual_audio_negative_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = grk0Var2.b;
                i8h1Var2.f(k7h1Var2.a(), (Set) null);
                return rih1Var;
            default:
                smm smmVar = contextualAudioFragment.G1;
                if (smmVar != null) {
                    return smmVar;
                }
                u890.C("viewModelFactory");
                throw null;
        }
    }
}
