package app.p000rive.semantics;

import kotlin.Metadata;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lapp/rive/semantics/AndroidVirtualNodeIdAllocator;", "", "()V", "nextVirtualId", "", "allocate", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidVirtualNodeIdAllocator {
    public static final int $stable = 8;
    private long nextVirtualId;

    public final int allocate() {
        long j = this.nextVirtualId;
        if (j <= 2147483647L) {
            this.nextVirtualId = 1 + j;
            return (int) j;
        }
        eg.m("Android virtual accessibility node ID space exhausted");
        return 0;
    }
}
