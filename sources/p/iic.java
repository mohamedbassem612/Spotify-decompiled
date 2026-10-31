package p;

import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iic extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EncoreButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iic(EncoreButton encoreButton, byte b) {
        super(1);
        this.a = b;
        this.b = encoreButton;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        EncoreButton encoreButton = this.b;
        switch (b) {
            case 0:
                encoreButton.setAlpha(((Number) obj).floatValue());
                break;
            case 1:
                encoreButton.setAlpha(((Number) obj).floatValue());
                break;
            case 2:
                encoreButton.setAlpha(((Number) obj).floatValue());
                break;
            default:
                encoreButton.setAlpha(((Number) obj).floatValue());
                break;
        }
        return rih1Var;
    }
}
