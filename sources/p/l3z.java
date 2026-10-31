package p;

import android.content.Context;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l3z extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wyr b;
    public final /* synthetic */ gw70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3z(wyr wyrVar, gw70 gw70Var, byte b) {
        super(0);
        this.a = b;
        this.b = wyrVar;
        this.c = gw70Var;
    }

    public final Object invoke() {
        byte b = this.a;
        wyr wyrVar = this.b;
        switch (b) {
            case 0:
                return new lly((Context) wyrVar.b, this.c, 4, false, false, false, 48);
            default:
                return new QuickActionView(new zez0((Context) wyrVar.b, this.c));
        }
    }
}
