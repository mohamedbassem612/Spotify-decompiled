package app.p000rive;

import java.io.InputStream;
import kotlin.Metadata;
import p.a8d1;
import p.c9n;
import p.eg;
import p.hm5;
import p.lnm;
import p.o0c;
import p.q8r;
import p.rih1;
import p.u890;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveFile$Companion$load$file$fileBytes$1", f = "RiveFile.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "", "<anonymous>", "(Lp/c9n;)[B"}, k = 3, mv = {1, 9, 0})
public final class RiveFile$Companion$load$file$fileBytes$1 extends a8d1 implements vu30 {
    final /* synthetic */ RiveFileSource $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$Companion$load$file$fileBytes$1(RiveFileSource riveFileSource, lnm<? super RiveFile$Companion$load$file$fileBytes$1> lnmVar) {
        super(2, lnmVar);
        this.$source = riveFileSource;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        return new RiveFile$Companion$load$file$fileBytes$1(this.$source, lnmVar);
    }

    public final Object invoke(c9n c9nVar, lnm<? super byte[]> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        InputStream inputStreamOpenRawResource = ((RiveFileSource.RawRes) this.$source).getResources().openRawResource(((RiveFileSource.RawRes) this.$source).getResId());
        try {
            inputStreamOpenRawResource.getClass();
            byte[] bArrK = o0c.K(inputStreamOpenRawResource);
            u890.p(inputStreamOpenRawResource, (Throwable) null);
            return bArrK;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(inputStreamOpenRawResource, th);
                throw th2;
            }
        }
    }
}
