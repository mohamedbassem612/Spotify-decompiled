package p;

import android.content.Context;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f1q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ f1q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final c4c1 a(tbc1 tbc1Var) {
        byte b = this.a;
        p2p p2pVar = this.b;
        switch (b) {
            case 0:
                ks6 ks6Var = (ks6) p2pVar.d;
                CulturalMomentsStoryActivity culturalMomentsStoryActivity = (CulturalMomentsStoryActivity) ks6Var.a;
                daq daqVar = (daq) ks6Var.b;
                return new c4c1(culturalMomentsStoryActivity, new ie90((Context) daqVar.x1.a, (pe) daqVar.p9.get()), tbc1Var);
            case 1:
                e93 e93Var = (e93) ((s2q) p2pVar).d;
                FandomCollectiblesStoryActivity fandomCollectiblesStoryActivity = (FandomCollectiblesStoryActivity) e93Var.b;
                daq daqVar2 = (daq) e93Var.c;
                return new c4c1(fandomCollectiblesStoryActivity, new ie90((Context) daqVar2.x1.a, (pe) daqVar2.p9.get()), tbc1Var);
            default:
                p2q p2qVar = (p2q) p2pVar;
                BlendStoryContainerActivity blendStoryContainerActivity = (BlendStoryContainerActivity) p2qVar.d.a;
                daq daqVar3 = (daq) ((f0a) p2qVar.e).c;
                return new c4c1(blendStoryContainerActivity, new ie90((Context) daqVar3.x1.a, (pe) daqVar3.p9.get()), tbc1Var);
        }
    }
}
