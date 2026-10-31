package app.p000rive.core;

import kotlin.Metadata;
import p.iu30;
import p.lyc;
import p.rih1;
import p.tv30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CommandQueue$cppPointer$1 extends tv30 implements iu30 {
    public CommandQueue$cppPointer$1(Object obj) {
        super(1, obj, CommandQueue.class, "dispose", "dispose(J)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return rih1.a;
    }

    public final void invoke(long j) {
        ((CommandQueue) ((lyc) this).receiver).dispose(j);
    }
}
