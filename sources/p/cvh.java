package p;

import com.spotify.widgets.widgetstate.CurrentTrackMetadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cvh extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CurrentTrackMetadata b;
    public final /* synthetic */ whb1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvh(CurrentTrackMetadata currentTrackMetadata, whb1 whb1Var, byte b) {
        super(3);
        this.a = b;
        this.b = currentTrackMetadata;
        this.c = whb1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        CurrentTrackMetadata currentTrackMetadata = this.b;
        et40 et40Var = et40.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                gt40 gt40VarA = ow31.a(et40Var);
                f5p1.h(currentTrackMetadata.getTitle(), currentTrackMetadata.getSubtitle(), this.c, gt40VarA, nee1.i, nee1.j, (String) null, (String) null, 0, b0kVar, 0, 448);
                cxm.g((gt40) null, 48.0f, 8.0f, 3, b0kVar, 3504, 1);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                gt40 gt40VarA2 = ow31.a(dm5.J(et40Var));
                f5p1.h(currentTrackMetadata.getTitle(), currentTrackMetadata.getSubtitle(), this.c, gt40VarA2, nee1.a, nee1.b, (String) null, (String) null, 0, b0kVar2, 0, 448);
                cxm.g((gt40) null, 0.0f, 0.0f, 0, b0kVar2, 0, 15);
                break;
        }
        return rih1Var;
    }
}
