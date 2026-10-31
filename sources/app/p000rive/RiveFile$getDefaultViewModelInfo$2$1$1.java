package app.p000rive;

import app.p000rive.core.CommandQueue;
import app.p000rive.core.DefaultViewModelInfo;
import kotlin.Metadata;
import p.a8d1;
import p.d9n;
import p.eg;
import p.hm5;
import p.iu30;
import p.lnm;
import p.q8r;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveFile$getDefaultViewModelInfo$2$1$1", f = "RiveFile.kt", l = {332}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lapp/rive/core/DefaultViewModelInfo;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveFile$getDefaultViewModelInfo$2$1$1 extends a8d1 implements iu30 {
    final /* synthetic */ Artboard $artboard;
    int label;
    final /* synthetic */ RiveFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$getDefaultViewModelInfo$2$1$1(RiveFile riveFile, Artboard artboard, lnm<? super RiveFile$getDefaultViewModelInfo$2$1$1> lnmVar) {
        super(1, lnmVar);
        this.this$0 = riveFile;
        this.$artboard = artboard;
    }

    public final lnm<rih1> create(lnm<?> lnmVar) {
        return new RiveFile$getDefaultViewModelInfo$2$1$1(this.this$0, this.$artboard, lnmVar);
    }

    public final Object invoke(lnm<? super DefaultViewModelInfo> lnmVar) {
        return create(lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        CommandQueue riveWorker = this.this$0.getRiveWorker();
        long fileHandle = this.this$0.getFileHandle();
        long artboardHandle = this.$artboard.getArtboardHandle();
        this.label = 1;
        Object objM244getDefaultViewModelInfotl3utA8 = riveWorker.m244getDefaultViewModelInfotl3utA8(fileHandle, artboardHandle, this);
        d9n d9nVar = d9n.a;
        return objM244getDefaultViewModelInfotl3utA8 == d9nVar ? d9nVar : objM244getDefaultViewModelInfotl3utA8;
    }
}
