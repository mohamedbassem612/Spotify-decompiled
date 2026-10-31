package p;

import com.spotify.campaigns.storytelling.container.StorytellingContainerFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s0q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final dl4 c;

    public /* synthetic */ s0q(daq daqVar, dl4 dl4Var, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = dl4Var;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        byte b2 = 4;
        em0 em0Var = this.c;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new d3p(daqVar, em0Var);
            case 1:
                return new b6p(daqVar, (tnm) em0Var, (byte) 28);
            case 2:
                return new wtp(daqVar, (dl4) em0Var, obj, (byte) 13);
            case 3:
                return new wj3(daqVar, (ks6) em0Var, (StorytellingContainerFragment) obj);
            case 4:
                return new wj3(daqVar, (e93) em0Var, (StorytellingContainerFragment) obj);
            case 5:
                return new f0a(daqVar, (i7d) em0Var, (StorytellingContainerFragment) obj);
            case 6:
                return new a1q(daqVar, (wj3) em0Var, (byte) 4);
            case 7:
                return new k2q(daqVar, (wj3) em0Var, b2);
            case 8:
                return new lbq((Object) daqVar, em0Var, (byte) 1);
            default:
                return new qqp(daqVar, em0Var);
        }
    }

    public /* synthetic */ s0q(daq daqVar, dl4 dl4Var, dl4 dl4Var2, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = dl4Var2;
    }
}
