package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wi3 extends onm {
    public slc0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aj3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi3(aj3 aj3Var, onm onmVar) {
        super(onmVar);
        this.c = aj3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Button) null, (slc0) null, this);
    }
}
