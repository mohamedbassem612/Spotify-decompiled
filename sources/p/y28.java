package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y28 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y28(byte b, int i, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (this.b) {
                    i = (((this.c * 50) + 999) / StoryCard.CLASSIC_CONTENT_FIELD_NUMBER) * 2;
                } else {
                    i = 1024;
                    if (iIntValue >= 1024) {
                        i = iIntValue;
                    }
                }
                return new x28(iIntValue, i);
            default:
                return new os51(this.b, this.c == 2);
        }
    }
}
