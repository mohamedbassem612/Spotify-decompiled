package app.p000rive;

import androidx.car.app.hardware.common.CarZone;
import kotlin.Metadata;
import p.lnm;
import p.onm;
import p.os00;
import p.q8r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.Artboard$Companion", f = "Artboard.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER, 97}, m = "create")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class Artboard$Companion$create$1 extends onm {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Artboard.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard$Companion$create$1(Artboard.Companion companion, lnm<? super Artboard$Companion$create$1> lnmVar) {
        super(lnmVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= os00.INVALID_ID;
        return this.this$0.create(null, null, this);
    }
}
