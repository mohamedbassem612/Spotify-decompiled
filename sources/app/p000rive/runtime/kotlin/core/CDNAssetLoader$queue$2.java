package app.p000rive.runtime.kotlin.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.c8o;
import p.hab0;
import p.op21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/op21;", "invoke", "()Lp/op21;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CDNAssetLoader$queue$2 extends hab0 implements Function0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNAssetLoader$queue$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final op21 invoke() {
        return c8o.u(this.$context);
    }
}
