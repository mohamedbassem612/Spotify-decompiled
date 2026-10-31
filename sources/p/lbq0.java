package p;

import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lbq0 extends onm {
    public YourLibraryDecoratedEntityOuterClass.YourLibraryEntityInfo a;
    public ezy b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mbq0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbq0(mbq0 mbq0Var, onm onmVar) {
        super(onmVar);
        this.d = mbq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.m(null, this);
    }
}
