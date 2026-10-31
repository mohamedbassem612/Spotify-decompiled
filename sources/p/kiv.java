package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kiv extends xky0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kiv(Function0 function0, byte b) {
        super(function0);
        this.b = b;
    }

    @Override // p.xky0
    public final ely0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new ely0(this, obj, obj == null, kcx0.R0, null, true);
            default:
                return new ely0(this, obj, obj == null, null, null, false);
        }
    }
}
