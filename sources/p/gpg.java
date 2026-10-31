package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gpg extends onm {
    public kpg a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hpg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpg(hpg hpgVar, onm onmVar) {
        super(onmVar);
        this.d = hpgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
