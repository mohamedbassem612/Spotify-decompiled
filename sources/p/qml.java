package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qml extends onm {
    public xml a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rml c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qml(rml rmlVar, onm onmVar) {
        super(onmVar);
        this.c = rmlVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
