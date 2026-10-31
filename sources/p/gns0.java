package p;

import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto$CanPlayContentRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gns0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jn7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gns0(jn7 jn7Var, onm onmVar) {
        super(onmVar);
        this.b = jn7Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d((PermissionsEsperanto$CanPlayContentRequest) null, this);
    }
}
