package app.p000rive;

import app.p000rive.core.CommandQueue;
import app.p000rive.runtime.kotlin.core.ViewModel;
import java.util.List;
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
@q8r(c = "app.rive.RiveFile$getViewModelProperties$2$1$1", f = "RiveFile.kt", l = {280}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "Lapp/rive/runtime/kotlin/core/ViewModel$Property;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveFile$getViewModelProperties$2$1$1 extends a8d1 implements iu30 {
    final /* synthetic */ String $viewModel;
    int label;
    final /* synthetic */ RiveFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$getViewModelProperties$2$1$1(RiveFile riveFile, String str, lnm<? super RiveFile$getViewModelProperties$2$1$1> lnmVar) {
        super(1, lnmVar);
        this.this$0 = riveFile;
        this.$viewModel = str;
    }

    public final lnm<rih1> create(lnm<?> lnmVar) {
        return new RiveFile$getViewModelProperties$2$1$1(this.this$0, this.$viewModel, lnmVar);
    }

    public final Object invoke(lnm<? super List<ViewModel.Property>> lnmVar) {
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
        String str = this.$viewModel;
        this.label = 1;
        Object objM256getViewModelPropertiesmgMojzc = riveWorker.m256getViewModelPropertiesmgMojzc(fileHandle, str, this);
        d9n d9nVar = d9n.a;
        return objM256getViewModelPropertiesmgMojzc == d9nVar ? d9nVar : objM256getViewModelPropertiesmgMojzc;
    }
}
