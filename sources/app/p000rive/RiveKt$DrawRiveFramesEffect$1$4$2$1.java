package app.p000rive;

import kotlin.Metadata;
import p.a8d1;
import p.eg;
import p.hm5;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveKt$DrawRiveFramesEffect$1$4$2$1", f = "Rive.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$DrawRiveFramesEffect$1$4$2$1 extends a8d1 implements vu30 {
    /* synthetic */ boolean Z$0;
    int label;

    public RiveKt$DrawRiveFramesEffect$1$4$2$1(lnm<? super RiveKt$DrawRiveFramesEffect$1$4$2$1> lnmVar) {
        super(2, lnmVar);
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        RiveKt$DrawRiveFramesEffect$1$4$2$1 riveKt$DrawRiveFramesEffect$1$4$2$1 = new RiveKt$DrawRiveFramesEffect$1$4$2$1(lnmVar);
        riveKt$DrawRiveFramesEffect$1$4$2$1.Z$0 = ((Boolean) obj).booleanValue();
        return riveKt$DrawRiveFramesEffect$1$4$2$1;
    }

    public final Object invoke(boolean z, lnm<? super Boolean> lnmVar) {
        return create(Boolean.valueOf(z), lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            hm5.M(obj);
            return Boolean.valueOf(!this.Z$0);
        }
        eg.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (lnm<? super Boolean>) obj2);
    }
}
