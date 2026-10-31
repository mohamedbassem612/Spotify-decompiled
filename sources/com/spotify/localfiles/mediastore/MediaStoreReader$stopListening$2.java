package com.spotify.localfiles.mediastore;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "handle", "Lp/rih1;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class MediaStoreReader$stopListening$2 extends hab0 implements iu30 {
    final /* synthetic */ MediaStoreReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreReader$stopListening$2(MediaStoreReader mediaStoreReader) {
        super(1);
        this.this$0 = mediaStoreReader;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return rih1.a;
    }

    public final void invoke(long j) {
        MediaStoreReader.access$freeHandle(this.this$0, j);
    }
}
