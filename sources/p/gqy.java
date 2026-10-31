package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gqy extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ sqy b;
    public final /* synthetic */ d0r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqy(d0r d0rVar, sqy sqyVar) {
        super(1);
        this.c = d0rVar;
        this.b = sqyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        sqy sqyVar = this.b;
        switch (b) {
            case 0:
                ((ji50) obj).b.put(y2.class, new r3r(new wzq(new v3(this.c, sqyVar.h, sqyVar.i, sqyVar.g, sqyVar.q), yoy.Y0), lgx.V0, (vu30) null));
                return rih1.a;
            default:
                return fdg1.m0(new xzq(sqyVar.b.a(this.c), yoy.e1), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqy(sqy sqyVar, d0r d0rVar) {
        super(1);
        this.b = sqyVar;
        this.c = d0rVar;
    }
}
