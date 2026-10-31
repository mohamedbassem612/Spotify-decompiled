package p;

import com.spotify.bluejay.upload.impl.worker.AttachmentUploadWorker;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fl7 extends onm {
    public String a;
    public File b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AttachmentUploadWorker d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl7(AttachmentUploadWorker attachmentUploadWorker, onm onmVar) {
        super(onmVar);
        this.d = attachmentUploadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.i(this);
    }
}
